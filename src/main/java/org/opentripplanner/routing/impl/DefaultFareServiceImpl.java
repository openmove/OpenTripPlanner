package org.opentripplanner.routing.impl;

import java.io.Serializable;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Currency;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.opentripplanner.api.model.Leg;
import org.opentripplanner.model.*;
import org.opentripplanner.routing.core.Fare;
import org.opentripplanner.routing.core.Fare.FareType;
import org.opentripplanner.routing.core.FareComponent;
import org.opentripplanner.routing.core.FareRuleSet;
import org.opentripplanner.routing.core.Money;
import org.opentripplanner.routing.core.State;
import org.opentripplanner.routing.core.WrappedCurrency;
import org.opentripplanner.routing.edgetype.HopEdge;
import org.opentripplanner.routing.graph.Edge;
import org.opentripplanner.routing.services.FareService;
import org.opentripplanner.routing.spt.GraphPath;
import org.opentripplanner.routing.vertextype.PatternDepartVertex;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Holds information for doing the graph search on fares */
class FareSearch {
    // Cell [i,j] holds the best (lowest) cost for a trip from rides[i] to rides[j]
    float[][] resultTable;

    // Cell [i,j] holds the index of the ride to pass through for the best cost
    // This is used for reconstructing which rides are grouped together
    int[][] next;

    // Cell [i,j] holds the id of the fare that corresponds to the relevant cost
    // we can't just use FareAndId for resultTable because you need to sum them
    FeedScopedId[][] fareIds;
    FareRule[][] fareRules;

    // Cell [i] holds the index of the last ride that ride[i] has a fare to
    // If it's -1, the ride does not have fares to anywhere
    int[] endOfComponent;

    FareSearch(int size) {
        resultTable = new float[size][size];
        next = new int[size][size];
        fareIds = new FeedScopedId[size][size];
        fareRules = new FareRule[size][size];
        endOfComponent = new int[size];
        Arrays.fill(endOfComponent, -1);
    }
}

/** Holds fare and corresponding fareId */
class FareAndId {
    float fare;
    FeedScopedId fareId;
    FareRule fareRule;

    FareAndId(float fare, FeedScopedId fareId) {
        this.fare = fare;
        this.fareId = fareId;
    }

    FareAndId(float fare, FeedScopedId fareId, FareRule fareRule) {
        this.fare = fare;
        this.fareId = fareId;
        this.fareRule = fareRule;
    }
}

/**
 * This fare service module handles the cases that GTFS handles within a single feed.
 * It cannot necessarily handle multi-feed graphs, because a rule-less fare attribute
 * might be applied to rides on routes in another feed, for example.
 * For more interesting fare structures like New York's MTA, or cities with multiple
 * feeds and inter-feed transfer rules, you get to implement your own FareService. 
 * See this thread on gtfs-changes explaining the proper interpretation of fares.txt:
 * http://groups.google.com/group/gtfs-changes/browse_thread/thread/8a4a48ae1e742517/4f81b826cb732f3b
 */
public class DefaultFareServiceImpl implements FareService, Serializable {

    private static final long serialVersionUID = 20120229L;

    private static final Logger LOG = LoggerFactory.getLogger(DefaultFareServiceImpl.class);

    /** For each fare type (regular, student, etc...) the collection of rules that apply. */
    protected Map<FareType, Collection<FareRuleSet>> fareRulesPerType;

    public DefaultFareServiceImpl() {
        fareRulesPerType = new HashMap<>();
    }

    public void addFareRules(FareType fareType, Collection<FareRuleSet> fareRules) {
        fareRulesPerType.put(fareType, new ArrayList<>(fareRules));
    }

    protected List<Ride> createRides(GraphPath path) {
        List<Ride> rides = new LinkedList<Ride>();
        Ride ride = null;
        for (State state : path.states) {
            Edge edge = state.getBackEdge();
            if ( ! (edge instanceof HopEdge))
                continue;
            HopEdge hEdge = (HopEdge) edge;
            // Determine if a new ride should be created from this HopEdge. Only do so if a Ride hasn't been created,
            // or if the route has changed or if configured to do so for interlined transfers.
            if (ride == null || ! state.getRoute().equals(ride.route) || createRideDueToInterlining(state, ride)) {
                ride = new Ride();
                rides.add(ride);
                ride.startZone = hEdge.getBeginStop().getZoneId();
                ride.zones.add(ride.startZone);
                Route route = ((PatternDepartVertex)edge.getFromVertex()).getTripPattern().route;
                ride.agency = route.getAgency().getId();
                ride.routeData = route;
                ride.route = route.getId();
                ride.startTime = state.getBackState().getTimeSeconds();
                ride.firstStop = hEdge.getBeginStop();
                ride.trip = state.getTripId();
                ride.feedId = hEdge.getFeedId();
            }
            ride.lastStop = hEdge.getEndStop();
            ride.endZone  = ride.lastStop.getZoneId();
            ride.zones.add(ride.endZone);
            ride.endTime  = state.getTimeSeconds();
            // in default fare service, classify rides by mode 
            ride.classifier = state.getBackMode();
        }
        return rides;
    }

    /**
     * Returns true if a new ride should be created due to interlining. This is expected to be overridden in applicable
     * extending classes.
     */
    protected boolean createRideDueToInterlining(State state, Ride ride) {
        return false;
    }

    @Override
    public Fare getCost(GraphPath graph) {
        return getCost(graph, null);
    }

    @Override
    public Fare getCost(GraphPath path, List<Leg> legs) {
        List<Ride> rides = createRides(path);
        // If there are no rides, there's no fare.
        if (rides.size() == 0) {
            return null;
        }

        Fare fare = new Fare();
        boolean hasFare = false;
        for (Map.Entry<FareType, Collection<FareRuleSet>> kv : fareRulesPerType.entrySet()) {
            FareType fareType = kv.getKey();
            Collection<FareRuleSet> fareRules = kv.getValue();
            // Get the currency from the first fareAttribute, assuming that all tickets use the same currency.
            Currency currency = null;
            if (fareRules.size() > 0) {
                currency = Currency.getInstance(fareRules.iterator().next().getFareAttribute().getCurrencyType());
            }
            hasFare = populateFare(fare, currency, fareType, rides, fareRules);

            if (hasFare && legs != null) {
                populateFareDetails(fare, legs, rides, fareType);
            }
        }
        return hasFare ? fare : null;
    }

    /**
     * Add fare components from each Ride to the Fare object for a given fare type.
     * This approach is temporary and will be improved in OTP2.
     * @param fare Fare object receiving components
     * @param legs Legs of trip
     * @param rides Rides of trip (with fare components)
     * @param fareType Fare type to process
     */
    private void populateFareDetails(Fare fare, List<Leg> legs, List<Ride> rides, FareType fareType) {
        int rideIndex = 0;
        int legIndex = 0;
        // List of components for this fareType.
        List<FareComponent> fareComponents = new ArrayList<>();
        if (legs != null) {
            for (Leg leg : legs) {
                // Match transit legs to the rides this way. Is there a better way?
                if (leg.isTransitLeg()) {
                    Ride ride = rides.get(rideIndex);
                    if (ride.fareComponents.containsKey(fareType)) {
                        FareComponent fareComponent = ride.fareComponents.get(fareType);
                        fareComponent.legIndex = legIndex;
                        fareComponents.add(fareComponent);
                    }
                    // Sometimes rides are split into multiple legs, so ensure the end times match.
                    if (leg.endTime.getTimeInMillis() / 1000 == ride.endTime) rideIndex++;
                }
                legIndex++;
            }
            fare.addFareDetails(fareType, fareComponents);
        }
    }

    protected static Money getMoney(Currency currency, float cost) {
        int fractionDigits = 2;
        if (currency != null)
            fractionDigits = currency.getDefaultFractionDigits();
        int cents = (int) Math.round(cost * Math.pow(10, fractionDigits));
        return new Money(new WrappedCurrency(currency), cents);
    }

    private FareSearch performSearch(FareType fareType, List<Ride> rides,
            Collection<FareRuleSet> fareRules) {
        FareSearch r = new FareSearch(rides.size());

        // Dynamic algorithm to calculate fare cost.
        // This is a modified Floyd-Warshall algorithm, a key thing to remember is that
        // rides are already edges, so when comparing "via" routes, i -> k is connected
        // to k+1 -> j.
        for (int i = 0; i < rides.size(); i++) {
            // each diagonal
            for (int j = 0; j < rides.size() - i; j++) {
                FareAndId best = getBestFareAndId(fareType, rides.subList(j, j + i + 1), fareRules);
                float cost = best.fare;
                if (cost < 0) {
                    LOG.error("negative cost for a ride sequence");
                    cost = Float.POSITIVE_INFINITY;
                }
                if (cost < Float.POSITIVE_INFINITY) {
                    r.endOfComponent[j] = j + i;
                    r.next[j][j + i] = j + i;
                }
                r.resultTable[j][j + i] = cost;
                r.fareIds[j][j + i] = best.fareId;
                r.fareRules[j][j + i] = best.fareRule;
                for (int k = 0; k < i; k++) {
                    float via = addFares(rides.subList(j, j + k + 1), rides.subList(j + k + 1, j + i + 1),
                            r.resultTable[j][j + k], r.resultTable[j + k + 1][j + i]);
                    if (r.resultTable[j][j + i] > via) {
                        r.resultTable[j][j + i] = via;
                        r.endOfComponent[j] = j + i;
                        r.next[j][j + i] = r.next[j][j + k];
                    }
                }
            }
        }
        return r;
    }

    protected float addFares(List<Ride> ride0, List<Ride> ride1, float cost0, float cost1) {
        return cost0 + cost1;
    }

    protected float getLowestCost(FareType fareType, List<Ride> rides,
            Collection<FareRuleSet> fareRules) {
        FareSearch r = performSearch(fareType, rides, fareRules);
        return r.resultTable[0][rides.size()-1];
    }

    /**
     * Builds the Fare object for the given currency, fareType and fareRules.
     * <p>
     * Besides calculating the lowest fare, we also break down the fare and which routes
     * correspond to which components. Note that even if we cannot get a lowest fare
     * (if some rides don't have fare rules), there will still be a breakdown for those
     * parts which have fares.
     * <p>
     * As an example, given the rides A-B and B-C. Where A-B and B-C have fares of 10
     * each, 2 fare detail objects are added, one with fare 10 for A-B and one with fare 10
     * for B-C.
     * <p>
     * If we add the rule for A-C with a fare of 15, we will get 1 fare detail object
     * with fare 15, which lists both A-B and B-C as routes involved.
     * <p>
     * If our only rule were A-B with a fare of 10, we would have no lowest fare, but
     * we will still have one fare detail with fare 10 for the route A-B. B-C will not
     * just not be listed at all.
     */
    protected boolean populateFare(Fare fare, Currency currency, FareType fareType, List<Ride> rides,
            Collection<FareRuleSet> fareRules) {
        FareSearch r = performSearch(fareType, rides, fareRules);

        List<FareComponent> details = new ArrayList<FareComponent>();
        int count = 0;
        int start = 0;
        int end = rides.size() - 1;
        while(start <= end) {
            // skip parts where no fare is present, we want to return something
            // even if not all legs have fares
            while(start <= end && r.endOfComponent[start] < 0) {
                ++start;
            }
            if(start > end) {
                break;
            }

            int via = r.next[start][r.endOfComponent[start]];
            float cost = r.resultTable[start][via];
            FeedScopedId fareId = r.fareIds[start][via];
            FareRule fareRule = r.fareRules[start][via];
            FareComponent detail = new FareComponent(fareId, getMoney(currency, cost));
            for(int i = start; i <= via; ++i) {
                detail.addRoute(rides.get(i).route);
                detail.addTypes(rides.get(i).routeData.getType());
                detail.setAgencyId(rides.get(i).routeData.getAgency().getId());
            }

            detail.fareRule = fareRule;
            details.add(detail);

            ++count;
            start = via + 1;
        }

        fare.addFare(fareType, getMoney(currency, r.resultTable[0][rides.size()-1]));
        fare.addFareDetails(fareType, details);
        return count > 0;
    }

    protected float calculateCost(FareType fareType, List<Ride> rides,
            Collection<FareRuleSet> fareRules) {
        return getBestFareAndId(fareType, rides, fareRules).fare;
    }

    private FareAndId getBestFareAndId(FareType fareType, List<Ride> rides,
            Collection<FareRuleSet> fareRules) {
        Set<String> zones = new HashSet<String>();
        Set<FeedScopedId> routes = new HashSet<FeedScopedId>();
        Set<String> agencies = new HashSet<String>();
        Set<FeedScopedId> trips = new HashSet<FeedScopedId>();
        int transfersUsed = -1;
        
        Ride firstRide = rides.get(0);
        long   startTime = firstRide.startTime;
        String startZone = firstRide.startZone;
        String endZone = firstRide.endZone;
        String feedId = firstRide.feedId;
        long lastRideStartTime = firstRide.startTime;
        long lastRideEndTime = firstRide.endTime;
        for (Ride ride : rides) {
            if ( ! ride.feedId.equals(feedId)) {
                LOG.debug("skipped multi-feed ride sequence {}", rides);
                return new FareAndId(Float.POSITIVE_INFINITY, null);
            }
            lastRideStartTime = ride.startTime;
            lastRideEndTime = ride.endTime;
            endZone = ride.endZone;
            agencies.add(ride.agency);
            routes.add(ride.route);
            zones.addAll(ride.zones);
            trips.add(ride.trip);
            transfersUsed += 1;
        }
        
        FareAttribute bestAttribute = null;
        float bestFare = Float.POSITIVE_INFINITY;
        FareRule fareRule = null;
        long tripTime = lastRideStartTime - startTime;
        long journeyTime = lastRideEndTime - startTime;
        	
        // find the best fare that matches this set of rides
        for (FareRuleSet ruleSet : fareRules) {
            FareAttribute attribute = ruleSet.getFareAttribute();
            // fares also don't really have an agency id, they will have the per-feed default id
            // check only if the fare is not mapped to an agency
            if (!ruleSet.hasAgencyDefined() && !attribute.getId().getAgencyId().equals(feedId))
                continue;
            
            if (ruleSet.matches(agencies, startZone, endZone, zones, routes, trips)) {
                // TODO Maybe move the code below in FareRuleSet::matches() ?
                if (attribute.isTransfersSet() && attribute.getTransfers() < transfersUsed) {
                    continue;
                }
                // assume transfers are evaluated at boarding time,
                // as trimet does
                if (attribute.isTransferDurationSet() && 
                    tripTime > attribute.getTransferDuration()) {
                    continue;
                }
                if (attribute.isJourneyDurationSet() && 
                    journeyTime > attribute.getJourneyDuration()) {
                    continue;
                }
                float newFare = getFarePrice(attribute, fareType);
                String routingId = null;
                String identifier = ruleSet.getIdentifier(startZone, endZone, zones, routes, routingId);
                if (newFare < bestFare) {
                    bestAttribute = attribute;
                    bestFare = newFare;
                    fareRule = new FareRule();
                    fareRule.setDestinationId(endZone);
                    fareRule.setOriginId(startZone);
                    fareRule.setFare(attribute);
                    fareRule.setIdentifier(identifier);
                }
            }
        }
        LOG.debug("{} best for {}", bestAttribute, rides);
        if (bestFare == Float.POSITIVE_INFINITY) {
            LOG.debug("No fare for a ride sequence: {}", rides);
        }
        return new FareAndId(bestFare, bestAttribute == null ? null : bestAttribute.getId(), fareRule);
    }
    
    private float getFarePrice(FareAttribute fare, FareType type) {
    	switch(type) {
		case senior:
			if (fare.getSeniorPrice() >= 0) {
				return fare.getSeniorPrice();
			}
			break;
		case youth:
			if (fare.getYouthPrice() >= 0) {
				return fare.getYouthPrice();
			}
			break;
		case regular:
		default:
			break;
    	}
    	return fare.getPrice();
    }

}
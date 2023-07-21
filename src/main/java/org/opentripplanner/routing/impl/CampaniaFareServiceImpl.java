package org.opentripplanner.routing.impl;

import org.opentripplanner.common.model.P2;
import org.opentripplanner.model.FareAttribute;
import org.opentripplanner.model.FareRule;
import org.opentripplanner.model.FeedScopedId;
import org.opentripplanner.routing.core.Fare;
import org.opentripplanner.routing.core.Fare.FareType;
import org.opentripplanner.routing.core.FareComponent;
import org.opentripplanner.routing.core.FareRuleSet;
import org.opentripplanner.routing.core.TraverseMode;
import org.opentripplanner.routing.spt.GraphPath;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

public class CampaniaFareServiceImpl extends DefaultFareServiceImpl {

    private static final Logger LOG = LoggerFactory.getLogger(CampaniaFareServiceImpl.class);


    public CampaniaFareServiceImpl(Collection<FareRuleSet> regularFareRules) {

        List<FareRuleSet> myFareRules = new ArrayList<>();
        for(FareRuleSet frs : regularFareRules){
//            if(!frs.getFareAttribute().getId().getId().equals("832")){
//                
//            }
        	myFareRules.add(frs);
        }
        addFareRules(FareType.regular, myFareRules);
    }


    @Override
    public Fare getCost(GraphPath path) {

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
        }
        
        
        return hasFare ? fare : null;
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

            if (ruleSet.matchesTT(agencies, startZone, endZone, zones, routes, trips)) {
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

                Set<String> routingIds = ruleSet.getRoutingIds(new P2<>(startZone,endZone));
                String routingId = null;
               
                boolean found = true;
                if(routingIds != null){
                    found = false;
                    for(String s : routingIds){
                        if(s != null){
                        	
                        	if(s.equals("NAPOLI")) {
                        		if(zones.contains("63049")) {
                        			routingId = s;
                                    found = true;
                                    break;
                        		}
                        	}
                        }
                    }
                }
                if(found){
                	String identifier = ruleSet.getIdentifier(startZone, endZone, zones, routes, routingId);
                	
                    float newFare = getFarePrice(attribute, fareType);
                    if (newFare < bestFare) {
                        bestAttribute = attribute;
                        bestFare = newFare;
                        fareRule = new FareRule();
                        fareRule.setDestinationId(endZone);
                        fareRule.setOriginId(startZone);
                        fareRule.setFare(attribute);
                        fareRule.setRoutingId(routingId);
                        fareRule.setIdentifier(identifier);
                    }
                }
            }
        }
        LOG.info("{} best for {}", bestAttribute, rides);
        if (bestFare == Float.POSITIVE_INFINITY) {
            LOG.info("No fare for a ride sequence: {}", rides);
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
    
}

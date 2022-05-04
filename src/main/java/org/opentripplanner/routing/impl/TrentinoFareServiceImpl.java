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

public class TrentinoFareServiceImpl extends DefaultFareServiceImpl {

    private static final Logger LOG = LoggerFactory.getLogger(TrentinoFareServiceImpl.class);

    private static Set<String> mainNodes = new HashSet<String>() {{
        add("0001");
        add("1010");
        add("0946");
        add("6110");
        add("1030");
        add("1167");
        add("1169");
        add("6113");
        add("0957");
        add("0958");
        add("1100");
        add("4100");
        add("1060");
        add("1070");
        add("1190");
        add("1220");
        add("1250");
        add("1360");
        add("1362");
        add("1370");
        add("1410");
        add("1072");
        add("1075");
        add("1078");
        add("1079");
        add("1088");
        add("1001");
        add("1106");
        add("1115");
        add("1137");
        add("1122");
        add("1127");
        add("1121");
        add("1141");
        add("1135");
        add("1182");
        add("1165");
        add("1160");
        add("1192");
        add("1223");
        add("0961");
        add("1255");
        add("1226");
        add("4200");
        add("4260");
        add("4270");
        add("4300");
        add("4370");
        add("4380");
        add("4400");
        add("4449");
        add("4490");
        add("4493");
        add("0947");
        add("6120");
        add("6123");
        add("6127");
        add("6137");
        add("0956");
        add("6096");
        add("6150");
        add("6151");
        add("6152");
        add("6155");
        add("6220");
        add("6157");
        add("6162");
        add("6210");
        add("6215");
        add("6190");
        add("6191");
        add("6170");
        add("6216");
        add("6200");
        add("6500");
        add("6503");
        add("6510");
        add("6655");
        add("6570");
        add("6580");
        add("6581");
        add("6630");
        add("6640");
        add("6579");
        add("5140");
        add("5110");
        add("5111");
        add("5030");
        add("5015");
        add("5112");
        add("5117");
        add("5121");
        add("5120");
        add("5143");
        add("5144");
        add("5145");
        add("5266");
        add("3040");
        add("3105");
        add("3010");
        add("3640");
        add("3695");
        add("3101");
        add("3100");
        add("3162");
        add("3240");
        add("3166");
        add("3172");
        add("3155");
        add("3164");
        add("3209");
        add("3253");
        add("3381");
        add("3389");
        add("3310");
        add("3460");
        add("3362");
        add("3346");
        add("3405");
        add("3342");
        add("3770");
        add("3790");
        add("3047");
        add("3045");
        add("3210");
        add("3740");
        add("3820");
        add("3870");
        add("3890");
        add("3895");
        add("3042");
        add("3401");
        add("3407");
        add("3412");
        add("3409");
        add("3051");
        add("3337");
        add("3542");
        add("3347");
        add("3312");
        add("3470");
        add("0960");
        add("3264");
        add("3111");
        add("6230");
        add("6270");
        add("6300");
        add("6340");
        add("6380");
        add("6386");
        add("6401");
        add("6328");
        add("6302");
        add("6715");
        add("6720");
        add("6730");
        add("6755");
        add("6700");
        add("6382");
        add("6391");
        add("6410");
        add("6407");
        add("6418");
        add("2630");
        add("2010");
        add("2030");
        add("2040");
        add("2090");
        add("2120");
        add("2180");
        add("2240");
        add("2290");
        add("2280");
        add("2021");
        add("2045");
        add("2049");
        add("2127");
        add("2670");
        add("2174");
        add("2185");
        add("2208");
        add("2136");
        add("2189");
        add("2314");
        add("3520");
        add("2305");
        add("2310");
        add("2311");
        add("2324");
        add("2300");
        add("2308");
        add("2312");
        add("2323");
        add("2327");
        add("2330");
        add("0980");
        add("4127");
        add("4520");
        add("4530");
        add("4570");
        add("4497");
        add("4022");
        add("4023");
        add("4024");
        add("4025");
        add("4046");
        add("4050");
        add("4060");
        add("4070");
        add("4061");
        add("4048");
        add("4030");
        add("4042");
        add("4134");
        add("4041");
        add("4137");
        add("4136");
        add("4112");
        add("4126");
        add("4113");
        add("4116");
        add("4335");
        add("4322");
        add("4440");
        add("4410");
        add("4442");
    }};



    public TrentinoFareServiceImpl(Collection<FareRuleSet> regularFareRules) {

        List<FareRuleSet> myFareRules = new ArrayList<>();
        for(FareRuleSet frs : regularFareRules){
            if(!frs.getFareAttribute().getId().getId().equals("UNITN-LIBERA-CIRCOLAZIONE")){
                myFareRules.add(frs);
            }
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
                        System.out.println(s);
                        if(s != null){
                            Set<String> traversedNodes = ruleSet.getTraversedNodes(startZone, endZone, s);
                            if(traversedNodes.isEmpty()){
                                traversedNodes = ruleSet.getTraversedNodes(endZone, startZone, s);
                            }

                            if(!traversedNodes.contains(startZone)){
                                traversedNodes.add(startZone);
                            }

                            if(!traversedNodes.contains(endZone)){
                                traversedNodes.add(endZone);
                            }
                            Set<String> filteredZones = new HashSet<>();
                            for(String z : zones){
                                if(mainNodes.contains(z)){
                                    filteredZones.add(z);
                                }
                            }

                            if(traversedNodes.containsAll(filteredZones)){
                                routingId = s;
                                found = true;
                                break;
                            }
                        }
                    }
                }
                if(found){
                    float newFare = getFarePrice(attribute, fareType);
                    if (newFare < bestFare) {
                        bestAttribute = attribute;
                        bestFare = newFare;
                        fareRule = new FareRule();
                        fareRule.setDestinationId(endZone);
                        fareRule.setOriginId(startZone);
                        fareRule.setFare(attribute);
                        fareRule.setRoutingId(routingId);
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

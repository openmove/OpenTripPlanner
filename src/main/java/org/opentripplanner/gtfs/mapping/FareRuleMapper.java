package org.opentripplanner.gtfs.mapping;

import org.opentripplanner.model.FareRule;
import org.onebusaway.gtfs.model.Node;
import org.opentripplanner.model.NodeRules;
import org.opentripplanner.util.MapUtils;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/** Responsible for mapping GTFS FareRule into the OTP model. */
class FareRuleMapper {

    private final RouteMapper routeMapper;

    private final FareAttributeMapper fareAttributeMapper;
    private Map<String,NodeRules> allNodes = null;

    private Map<org.onebusaway.gtfs.model.FareRule, FareRule> mappedFareRules = new HashMap<>();

    FareRuleMapper(RouteMapper routeMapper, FareAttributeMapper fareAttributeMapper) {
        this.routeMapper = routeMapper;
        this.fareAttributeMapper = fareAttributeMapper;
    }

    Collection<FareRule> map(Collection<org.onebusaway.gtfs.model.FareRule> allFareRules, Map<String,NodeRules> allNodes) {
        this.allNodes = allNodes;
        return MapUtils.mapToList(allFareRules, this::map);
    }

    /** Map from GTFS to OTP model, {@code null} safe.  */
    FareRule map(org.onebusaway.gtfs.model.FareRule orginal) {
        return orginal == null ? null : mappedFareRules.computeIfAbsent(orginal, this::doMap);
    }

    private FareRule doMap(org.onebusaway.gtfs.model.FareRule rhs) {
        FareRule lhs = new FareRule();

        lhs.setFare(fareAttributeMapper.map(rhs.getFare()));
        lhs.setRoute(routeMapper.map(rhs.getRoute()));
        lhs.setOriginId(rhs.getOriginId());
        lhs.setDestinationId(rhs.getDestinationId());
        lhs.setContainsId(rhs.getContainsId());
        lhs.setRoutingId(rhs.getRoutingId());

        if(lhs.getOriginId() != null && lhs.getDestinationId() != null
                && lhs.getRoutingId() != null
                && allNodes != null){
            String key = lhs.getOriginId()+"$"+lhs.getDestinationId()+"$"+lhs.getRoutingId();
            if(allNodes.get(key) != null) {
                for (String traverseNode : allNodes.get(key).getTraversedNodes()) {
                    lhs.addTraversedNode(traverseNode);
                }
            }

        }


        return lhs;
    }
}

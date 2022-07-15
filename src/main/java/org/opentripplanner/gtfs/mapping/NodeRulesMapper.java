package org.opentripplanner.gtfs.mapping;

import org.onebusaway.gtfs.model.Node;
import org.opentripplanner.model.NodeRules;
import org.opentripplanner.model.Stop;
import org.opentripplanner.model.Zone;
import org.opentripplanner.util.MapUtils;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


class NodeRulesMapper {

    private final Map<String, NodeRules> mappedNodes = new HashMap<>();

    Map<String, NodeRules> map(Collection<org.onebusaway.gtfs.model.Node> nodes) {
        for(Node original : nodes){
            if(original == null){
                return mappedNodes;
            }
            String id = createKey(original);
            if(mappedNodes.containsKey(id)){
                mappedNodes.get(id).addTraversedNode(original.getTransitId());
            }else{
                mappedNodes.put(id, doMap(original));
            }
        }
        return mappedNodes;

    }

    String createKey(Node node){
        return node.getOriginId()+"ᚫ"+node.getDestinationId()+"ᚫ"+node.getRoutingId();
    }

    private NodeRules doMap(org.onebusaway.gtfs.model.Node rhs) {

        NodeRules lhs = new NodeRules();

        lhs.setId(rhs.getId());
        lhs.setOriginId(rhs.getOriginId());
        lhs.setDestinationId(rhs.getDestinationId());
        lhs.setRoutingId(rhs.getRoutingId());
        lhs.addTraversedNode(rhs.getTransitId());
        return lhs;
    }
}

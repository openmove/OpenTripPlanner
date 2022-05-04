/* This file is based on code copied from project OneBusAway, see the LICENSE file for further information. */
package org.opentripplanner.model;

import java.util.ArrayList;
import java.util.List;

public final class NodeRules {

    private static final long serialVersionUID = 1L;

    private static final int MISSING_VALUE = -999;

    private Integer id;

    private String originId;
    private String destinationId;
    private String routingId;

    private List<String> traversedNodes = new ArrayList<>();

    public NodeRules() {

    }

    public NodeRules(NodeRules obj) {
        this.id = obj.id;
        this.originId = obj.originId;
        this.destinationId = obj.destinationId;
        this.routingId = obj.routingId;
        this.traversedNodes = obj.traversedNodes;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOriginId() {
        return originId;
    }

    public void setOriginId(String originId) {
        this.originId = originId;
    }

    public String getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(String destinationId) {
        this.destinationId = destinationId;
    }
    public String getRoutingId() {
        return routingId;
    }

    public void setRoutingId(String routingId) {
        this.routingId = routingId;
    }

    public void addTraversedNode(String traversedNode) {
        this.traversedNodes.add(traversedNode);
    }

    public List<String> getTraversedNodes() {
        return this.traversedNodes;
    }

    @Override
    public String toString() {
        return "<NodeRule " + this.id + ">";
    }

}

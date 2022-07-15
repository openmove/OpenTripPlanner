/* This file is based on code copied from project OneBusAway, see the LICENSE file for further information. */
package org.opentripplanner.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public final class FareRule implements Serializable {

    private static final long serialVersionUID = 1L;

    private FareAttribute fare;

    private Route route;

    private String originId;

    private String destinationId;

    private String containsId;

    private String routingId;
    
    private String identifier;

    private List<String> traversedNodes = new ArrayList<String>();

    public FareAttribute getFare() {
        return fare;
    }

    public void setFare(FareAttribute fare) {
        this.fare = fare;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
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

    public String getContainsId() {
        return containsId;
    }

    public void setContainsId(String containsId) {
        this.containsId = containsId;
    }

    public String getRoutingId() {
        return routingId;
    }

    public void setRoutingId(String routingId) {
        this.routingId = routingId;
    }
    
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String id) {
        this.identifier = id;
    }

    public List<String> getTraversedNodes() {
        return traversedNodes;
    }

    public void addTraversedNode(String node) {
        this.traversedNodes.add(node);
    }

    public String toString() {
        return "<FareRule "
                + toStrOpt(" route=", route)
                + toStrOpt(" origin=", originId)
                + toStrOpt(" contains=", containsId)
                + toStrOpt(" destination=", destinationId)
                + toStrOpt(" instr=", routingId)
                + toStrOpt(" traversedNode[0]=", traversedNodes.get(0))
                + ">";
    }


    private static String toStrOpt(String lbl, IdentityBean arg) {
        return (arg == null ? "" : lbl + arg.getId());
    }

    private static String toStrOpt(String lbl, String arg) {
        return (arg == null ? "" : lbl + '\'' + arg + '\'');
    }
}

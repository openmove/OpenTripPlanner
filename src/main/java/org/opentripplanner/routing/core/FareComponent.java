package org.opentripplanner.routing.core;

import org.opentripplanner.model.FareRule;
import org.opentripplanner.model.FeedScopedId;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * <p>
 * FareComponent is a sequence of routes for a particular fare.
 * </p>
 */
public class FareComponent {

    public FeedScopedId fareId;
    public Money price;
    public List<FeedScopedId> routes;
    public String agencyId;
    public Set<Integer> routeTypes = new LinkedHashSet<>();
    public FareRule fareRule;


    public FareComponent(FeedScopedId fareId, Money amount) {
        this.fareId = fareId;
        price = amount;
        routes = new ArrayList<FeedScopedId>();
    }

    public void addRoute(FeedScopedId routeId) {
        routes.add(routeId);
    }
    public void addTypes(int type){
        routeTypes.add(type);
    }

    public void setAgencyId(String agencyId){
        this.agencyId = agencyId;
    }

    public String toString() {
        StringBuffer buffer = new StringBuffer("FareComponent(");
        buffer.append(fareId.toString());
        buffer.append(", ");
        buffer.append(price.toString());
        buffer.append(", ");
        for (FeedScopedId routeId : routes) {
            buffer.append(routeId.toString());
            buffer.append(", ");
        }
        buffer.append(")");
        return buffer.toString();
    }
}


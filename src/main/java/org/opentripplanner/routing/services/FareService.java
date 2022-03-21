package org.opentripplanner.routing.services;

import org.opentripplanner.api.model.Leg;
import org.opentripplanner.routing.core.Fare;
import org.opentripplanner.routing.spt.GraphPath;

import java.util.List;

/**
 * Computes a fare for a given GraphPath.
 * @author novalis
 *
 */
public interface FareService {
	public Fare getCost(GraphPath path);
    public default Fare getCost(GraphPath path, List<Leg> legs) {
        return getCost(path);
    };
}

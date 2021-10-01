package org.opentripplanner.routing.impl;

import org.opentripplanner.model.FeedScopedId;
import org.opentripplanner.model.Route;
import org.opentripplanner.model.Stop;

import java.util.HashSet;
import java.util.Set;

/** A set of edges on a single route, with associated information for calculating fares */
public class Ride {

    String feedId;

    String agency; // route agency

    FeedScopedId route;

    public Route routeData;

    public FeedScopedId trip;

    Set<String> zones;

    String startZone;

    String endZone;

    public long startTime;

    long endTime;

    // in DefaultFareServiceImpl classifier is just the TraverseMode
    // it can be used differently in custom fare services
    Object classifier;

    Stop firstStop;

    Stop lastStop;

    public Ride() {
        zones = new HashSet<>();
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Ride");
        if (startZone != null) {
            builder.append(" from zone ");
            builder.append(startZone);
        }
        if (endZone != null) {
            builder.append(" to zone ");
            builder.append(endZone);
        }
        builder.append(" on route ");
        builder.append(route);
        if (zones.size() > 0) {
            builder.append(" through zones ");
            builder.append(String.join(",", zones));
        }
        builder.append(" at ");
        builder.append(startTime);
        if (classifier != null) {
            builder.append(", classified by ");
            builder.append(classifier);
        }
        return builder.toString();
    }
}

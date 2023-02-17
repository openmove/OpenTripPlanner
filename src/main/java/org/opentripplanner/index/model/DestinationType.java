package org.opentripplanner.index.model;


import java.util.List;

import org.opentripplanner.model.Stop;
import org.opentripplanner.model.Trip;

public class DestinationType {

    public Trip trip;
    public Stop stop;

    public DestinationType(Trip trip, Stop stop) {
        this.trip = trip;
        this.stop = stop;
    }

}

package org.opentripplanner.updater.trip_capacity;

import java.util.List;

import com.google.transit.realtime.GtfsRealtime.TripUpdate;

public interface TripCapacityUpdateSource {
    public List<TripCapacityUpdate> getUpdates();   
    public String getFeedId();
}

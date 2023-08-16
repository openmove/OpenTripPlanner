package org.opentripplanner.updater.trip_capacity;

import java.util.List;

import org.opentripplanner.model.FeedScopedId;
import org.opentripplanner.model.Trip;
import org.opentripplanner.routing.edgetype.TripPattern;
import org.opentripplanner.routing.graph.Graph;
import org.opentripplanner.routing.graph.GraphIndex;
import org.opentripplanner.routing.trippattern.TripTimes;
import org.opentripplanner.updater.GraphWriterRunnable;
import org.opentripplanner.updater.stoptime.TimetableSnapshotSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Preconditions;
import com.google.transit.realtime.GtfsRealtime.TripUpdate;

public class TripCapacityUpdateGraphWriterRunnable implements GraphWriterRunnable {
    private static Logger LOG = LoggerFactory.getLogger(TripCapacityUpdateGraphWriterRunnable.class);

   
    /**
     * The list with updates to apply to the graph
     */
    private final List<TripCapacityUpdate> updates;

    private final String feedId;

    public TripCapacityUpdateGraphWriterRunnable(final List<TripCapacityUpdate> updates, final String feedId) {
        // Preconditions
        Preconditions.checkNotNull(updates);
        Preconditions.checkNotNull(feedId);
        
        // Set fields
        this.updates = updates;
        this.feedId = feedId;
    }

    @Override
    public void run(Graph graph) {
        // Apply updates to graph using realtime snapshot source
    	TimetableCapacitySnapshotSource snapshotSource = (TimetableCapacitySnapshotSource)graph.timetableSnapshotSource;
        if (snapshotSource != null) {
            snapshotSource.applyTripCapacityUpdates(graph, true, updates, feedId);
        } else {
            LOG.error("Could not find realtime data snapshot source in graph."
                    + " The following updates are not applied: {}", updates);
        }

    	
    }
}

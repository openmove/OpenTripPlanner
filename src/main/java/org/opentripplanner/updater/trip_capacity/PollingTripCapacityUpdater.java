package org.opentripplanner.updater.trip_capacity;

import java.util.List;
import com.fasterxml.jackson.databind.JsonNode;
import org.opentripplanner.updater.*;
import org.opentripplanner.routing.graph.Graph;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.transit.realtime.GtfsRealtime.TripUpdate;

/**
 * Update OTP stop time tables from some (realtime) source
 *
 * Usage example ('rt' name is an example) in file 'Graph.properties':
 *
 * <pre>
 * rt.type = trip-capacity-updater
 * rt.frequencySec = 60
 * rt.url = http://host.tld/path
 * rt.feedId = TA
 * </pre>
 *
 */
public class PollingTripCapacityUpdater extends PollingGraphUpdater {
    private static final Logger LOG = LoggerFactory.getLogger(PollingTripCapacityUpdater.class);

    /**
     * Parent update manager. Is used to execute graph writer runnables.
     */
    private GraphUpdaterManager updaterManager;

    /**
     * Update streamer
     */
    private TripCapacityUpdateSource updateSource;

    /**
     * Feed id that is used for the trip ids in the TripUpdates
     */
    private String feedId;

    @Override
    public void setGraphUpdaterManager(GraphUpdaterManager updaterManager) {
        this.updaterManager = updaterManager;
    }

    @Override
    public void configurePolling(Graph graph, JsonNode config) throws Exception {
        // Create update streamer from preferences
        feedId = config.path("feedId").asText("");
        updateSource = new HttpTripCapacityUpdateSource();

        // Configure update source
        if (updateSource instanceof JsonConfigurable) {
            ((JsonConfigurable) updateSource).configure(graph, config);
        }

        
        LOG.info("Creating capacity trip updater running every {} seconds : {}", pollingPeriodSeconds, updateSource);
    }

    @Override
    public void setup(Graph graph) {
        
    }

    /**
     * Repeatedly makes blocking calls to an UpdateStreamer to retrieve new stop time updates, and
     * applies those updates to the graph.
     */
    @Override
    public void runPolling() {
        // Get update lists from update source
        List<TripCapacityUpdate> updates = updateSource.getUpdates();
        

        if (updates != null) {
            // Handle trip updates via graph writer runnable
            TripCapacityUpdateGraphWriterRunnable runnable =
                    new TripCapacityUpdateGraphWriterRunnable(updates, feedId);
            updaterManager.execute(runnable);
        }
    }

    @Override
    public void teardown() {
    }

    public String toString() {
        String s = (updateSource == null) ? "NONE" : updateSource.toString();
        return "Streaming stoptime updater with update source = " + s;
    }
}

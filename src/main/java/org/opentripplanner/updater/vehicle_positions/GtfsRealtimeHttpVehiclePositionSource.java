package org.opentripplanner.updater.vehicle_positions;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.transit.realtime.GtfsRealtime.FeedEntity;
import com.google.transit.realtime.GtfsRealtime.FeedMessage;
import com.google.transit.realtime.GtfsRealtime.VehiclePosition;
import org.opentripplanner.routing.graph.Graph;
import org.opentripplanner.updater.JsonConfigurable;
import org.opentripplanner.util.HttpUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Responsible for downloading GTFS-rt vehicle positions from a URL and loading into memory.
 */
public class GtfsRealtimeHttpVehiclePositionSource implements VehiclePositionSource, JsonConfigurable {
    private static final Logger LOG =
            LoggerFactory.getLogger(GtfsRealtimeHttpVehiclePositionSource.class);

    /**
     * FeedId the GTFS-RT feed is associated with
     */
    private String feedId;

    /**
     * URL to grab GTFS-RT feed from
     */
    private String url;

    @Override
    public void configure(Graph graph, JsonNode config) throws Exception {
        this.feedId = config.path("feedId").asText();
        String url = config.path("url").asText();
        if (url == null) {
            throw new IllegalArgumentException("Missing mandatory 'url' parameter");
        }
        this.url = url;
    }

    /**
     * Parses raw GTFS-RT data into vehicle positions
     */
    public List<VehiclePosition> getPositions() {
        try(InputStream is = HttpUtils.getData(
                url,
                "Accept",
                "application/x-google-protobuf, application/x-protobuf, application/protobuf, application/octet-stream, */*")) {

            return this.getPositions(is);
        } catch (Exception e) {
            LOG.warn("Failed to parse gtfs-rt feed from {}:", url, e);
        }
        return Collections.emptyList();
    }

    @Override
    public String getFeedId() {
        return this.feedId;
    }
}

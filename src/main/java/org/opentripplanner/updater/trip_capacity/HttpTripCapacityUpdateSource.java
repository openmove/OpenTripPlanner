package org.opentripplanner.updater.trip_capacity;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.opentripplanner.updater.JsonConfigurable;
import org.opentripplanner.routing.car_park.CarPark;
import org.opentripplanner.routing.graph.Graph;
import org.opentripplanner.util.HttpUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.transit.realtime.GtfsRealtime;
import com.google.transit.realtime.GtfsRealtime.FeedEntity;
import com.google.transit.realtime.GtfsRealtime.FeedMessage;
import com.google.transit.realtime.GtfsRealtime.TripUpdate;

public class HttpTripCapacityUpdateSource implements TripCapacityUpdateSource, JsonConfigurable {
    private static final Logger LOG =
            LoggerFactory.getLogger(HttpTripCapacityUpdateSource.class);

    /**
     * Feed id that is used to match trip ids in the TripUpdates
     */
    private String feedId;

    private String url;

    @Override
    public void configure(Graph graph, JsonNode config) throws Exception {
        String url = config.path("url").asText();
        if (url == null) {
            throw new IllegalArgumentException("Missing mandatory 'url' parameter");
        }
        this.url = url;
        this.feedId = config.path("feedId").asText();
    }

    @Override
    public List<TripCapacityUpdate> getUpdates() {
        FeedMessage feedMessage = null;
        List<FeedEntity> feedEntityList = null;
        List<TripCapacityUpdate> updates = null;
        try {
            InputStream is = HttpUtils.getData(
                    url,
                    "Accept",
                    "application/json, */*");
            
            
            java.util.Scanner scanner = null;
            String result="";
            
            
            if (is != null) {
            	try {

                    scanner = new java.util.Scanner(is).useDelimiter("\\A");
                    result = scanner.hasNext() ? scanner.next() : "";
                    scanner.close();
                    
                    ObjectMapper mapper = new ObjectMapper();
                    JsonNode rootNode = mapper.readTree(result);

                    for (int i = 0; i < rootNode.size(); i++) {
                        JsonNode node = rootNode.get(i);
                        if (node == null) {
                            continue;
                        }
                        TripCapacityUpdate tripCapacityUpdate = new TripCapacityUpdate(node);
                        if (tripCapacityUpdate != null)
                        	updates.add(tripCapacityUpdate);
                    }
                    
                }
                finally
                {
                    if(scanner!=null)
                        scanner.close();
                }
            }
        } catch (Exception e) {
            LOG.warn("Failed to parse gtfs-rt feed from " + url + ":", e);
        }
        return updates;
    }

    
    public String toString() {
        return "HttpTripCapacityUpdateStreamer(" + url + ")";
    }

    @Override
    public String getFeedId() {
        return this.feedId;
    }
}

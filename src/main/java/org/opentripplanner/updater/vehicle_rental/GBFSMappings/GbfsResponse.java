package org.opentripplanner.updater.vehicle_rental.GBFSMappings;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * Response class for the gbfs.json file.
 * See https://github.com/NABSA/gbfs/blob/master/gbfs.md#gbfsjson
 */
public class GbfsResponse extends BaseGbfsResponse {

    //public Optional<String> version;
    public Map<String, GbfsFeeds> data;

    public static class GbfsFeeds {
        public List<GbfsFeed> feeds;
    }

    public static class GbfsFeed {
        public String name;
        public String url;
    }
}

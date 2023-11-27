package org.opentripplanner.updater.vehicle_rental.GBFSMappings;

import java.util.List;

/**
 * Response class for the free_bike_status.json file.
 * See https://github.com/NABSA/gbfs/blob/v1.0/gbfs.md#free_bike_statusjson
 */
public class FreeBikeStatus extends BaseGbfsResponse {
    public FreeBikeStatusData data;

    public static class FreeBikeStatusData {
        public List<FreeBike> bikes;
    }

    public static class FreeBike {
        public String bike_id;
        public Double lat;
        public Double lon;
        public Boolean is_reserved;
        public Boolean is_disabled;
        /** This fields are available starting in GBFS 2.1+ */
        public Long last_reported;
        public String station_id;
        /** This fields are available starting in GBFS 2.2+ */
        public String vehicle_type;
        public String vehicle_type_id;
        /** This fields are available starting in GBFS 2.3+ */
        public Float current_fuel_percent; 
        
    }
}

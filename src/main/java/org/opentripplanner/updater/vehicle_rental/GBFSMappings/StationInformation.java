package org.opentripplanner.updater.vehicle_rental.GBFSMappings;

import java.util.List;
import java.util.Set;

/**
 * Response class for the station_information.json file.
 * See https://github.com/NABSA/gbfs/blob/v1.0/gbfs.md#station_informationjson
 */
public class StationInformation extends BaseGbfsResponse {
    public StationInformationData data;

    public static class StationInformationData {
        public List<DockingStationInformation> stations;
    }

    public static class DockingStationInformation {
        public String station_id;
        public String name;
        public String short_name;
        public Double lat;
        public Double lon;
        public String address;
        public String cross_street;
        public String region_id;
        public String post_code;
        public Set<RentalMethod> rental_methods;
        public Integer capacity;
        public Boolean is_virtual_station;
    }


    public enum RentalMethod {
    	key,
    	creditcard,
    	paypass,
    	applepay,
    	androidpay,
    	transitcard,
    	accountnumber,
    	phone
    }
}

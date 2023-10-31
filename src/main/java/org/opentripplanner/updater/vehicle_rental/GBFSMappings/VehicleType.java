package org.opentripplanner.updater.vehicle_rental.GBFSMappings;

import java.util.List;


/**
 * Response class for the system_information.json file.
 * See https://github.com/NABSA/gbfs/blob/v1.0/gbfs.md#system_informationjson
 */
public class VehicleType extends BaseGbfsResponse {
    public VehicleTypeData data;

    public static class VehicleTypeData {
        public List<VehicleData> vehicle_types;
    }
    
    public static class VehicleData {
        public String vehicle_type_id;
        public FormFactor form_factor;
        public PropulsionType propulsion_type;
        public Float max_range_meters;
        public String name;
    }
    
    public enum FormFactor {
        bicycle,
        scooter,
        cargo_bicycle,
        moped,
        scooter_standing,
        scooted_seated,
        car,
        other
    }
    
    public enum PropulsionType {
    	human,
    	electric_assist,
    	electric,
    	combustion,
    	combustion_diesel,
    	hybrid,
    	plug_in_hybrid,
    	hydrogen_fuel_cell
    }
    
    
}

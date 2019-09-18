package org.opentripplanner.index.model;

import java.util.Collection;
import java.util.List;

import com.google.common.collect.Lists;
import org.onebusaway.gtfs.model.AgencyAndId;
import org.onebusaway.gtfs.model.Stop;

public class StopShort {

    /** GTFS ID of the stop */
    public AgencyAndId id;

    /** stop_code from GTFS */
    public String code;

    /** Name of the stop */
    public String name;

    /** Latitude of the stop */
    public double lat;

    /** Longitude of the stop */
    public double lon;

    /** URL of the stop, if given in the data */
    public String url;

    /** Corresponding cluster id of the stop. Depending on stop cluster mode
     *  this will be either Parent station of the stop, or the id of the cluster if proximity. */
    public String cluster;

    public StopShort (Stop stop) {
        this(stop, stop.getParentStation());
    }
    public StopShort (Stop stop, String cluster) {
        id = new AgencyAndId(stop.getId().getAgencyId(), stop.getId().getId()); // copy
        code = stop.getCode();
        name = stop.getName();
        lat = stop.getLat();
        lon = stop.getLon();
        url = stop.getUrl();
        this.cluster = cluster;
    }

    public static List<StopShort> list (Collection<Stop> in) {
        List<StopShort> out = Lists.newArrayList();
        for (Stop stop : in) out.add(new StopShort(stop));
        return out;
    }    

}

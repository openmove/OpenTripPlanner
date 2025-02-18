package org.opentripplanner.index.model;

import java.util.Collection;
import java.util.List;

import org.opentripplanner.model.Agency;
import org.opentripplanner.model.FeedScopedId;
import org.opentripplanner.model.Route;
import org.opentripplanner.gtfs.GtfsLibrary;

import com.beust.jcommander.internal.Lists;

public class RouteShort {

    public FeedScopedId id;
    public String shortName;
    public String longName;
    public String mode;
    public String color;
    public String agencyId;
    public String agencyName;
    public Integer sortOrder;

    public RouteShort (Route route) {
        id = route.getId();
        shortName = route.getShortName();
        longName = route.getLongName();
        mode = GtfsLibrary.getTraverseMode(route).toString();
        color = route.getColor();
        Agency agency = route.getAgency();
        agencyId = agency.getId();
        agencyName = agency.getName();
        sortOrder = route.getSortOrder();
    }

    public static List<RouteShort> list (Collection<Route> in) {
        List<RouteShort> out = Lists.newArrayList();
        for (Route route : in) out.add(new RouteShort(route));
        return out;
    }

}

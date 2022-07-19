/* This file is based on code copied from project OneBusAway, see the LICENSE file for further information. */
package org.opentripplanner.model;

import java.util.ArrayList;
import java.util.List;

public final class Zone extends IdentityBean<FeedScopedId> {

    private static final long serialVersionUID = 1L;

    private static final int MISSING_VALUE = -999;

    private FeedScopedId id;

    private String name;

    private double lat;

    private double lon;

    private String zoneId;

    private List<Stop> stops = new ArrayList<>();
    
    private List<String> fareIdentifiers = new ArrayList<>();

    public Zone() {

    }

    public Zone(Zone obj) {
        this.id = obj.id;
        this.name = obj.name;
        this.lat = obj.lat;
        this.lon = obj.lon;
        this.zoneId = obj.zoneId;
        this.stops = obj.stops;
    }

    public FeedScopedId getId() {
        return id;
    }

    public void setId(FeedScopedId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public String getZoneId() {
        return zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public List<Stop> getStops() {
        return this.stops;
    }

    @Override
    public String toString() {
        return "<Zone " + this.id + ">";
    }

	public List<String> getFareIdentifiers() {
		return fareIdentifiers;
	}

	public void setFareIdentifiers(List<String> fareIdentifiers) {
		this.fareIdentifiers = fareIdentifiers;
	}

}

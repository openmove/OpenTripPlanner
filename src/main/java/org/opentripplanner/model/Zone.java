/* This file is based on code copied from project OneBusAway, see the LICENSE file for further information. */
package org.opentripplanner.model;

import java.util.ArrayList;
import java.util.List;

import com.google.common.collect.Lists;

public final class Zone extends IdentityBean<FeedScopedId> {

	private static final long serialVersionUID = 1L;

	private static final int MISSING_VALUE = -999;

	private FeedScopedId id;

	private String name;

	private double lat;

	private double lon;

	private String zoneId;

	private int isContainsZone = 1;

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
		this.isContainsZone = obj.isContainsZone;
		this.stops = Lists.newArrayList(obj.stops.toArray(new Stop[obj.stops.size()]));
		this.fareIdentifiers = Lists.newArrayList(obj.fareIdentifiers.toArray(new String[obj.fareIdentifiers.size()]));
	}

	@Override
	public FeedScopedId getId() {
		return this.id;
	}

	@Override
	public void setId(FeedScopedId id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getLat() {
		return this.lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLon() {
		return this.lon;
	}

	public void setLon(double lon) {
		this.lon = lon;
	}

	public String getZoneId() {
		return this.zoneId;
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
		return this.fareIdentifiers;
	}

	public void setFareIdentifiers(List<String> fareIdentifiers) {
		this.fareIdentifiers = fareIdentifiers;
	}

	public void setIsContainsZone(int b) {
		this.isContainsZone = b;

	}

	public int getIsContainsZone() {
		return this.isContainsZone;
	}

}

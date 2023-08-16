package org.opentripplanner.updater.trip_capacity;

import com.fasterxml.jackson.databind.JsonNode;

public class TripCapacityUpdate {
	public String tripId;
	public int travelersCapacity;
	public int bikesCapacity;
	public String date;
	
	public TripCapacityUpdate(JsonNode node) {
		this.tripId = node.path("tripId").asText();
		this.travelersCapacity = node.path("travelersCapacity").asInt();
		this.bikesCapacity = node.path("bikesCapacity").asInt();
		this.date = node.path("date").asText();
	}
}

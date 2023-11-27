package org.opentripplanner.routing.vehicle_rental;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.xml.bind.annotation.XmlAttribute;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class VehicleParentRentalStation extends VehicleRentalStation{

	private static final long serialVersionUID = 1L;

	
	public List<VehicleRentalStation> vehicles = new ArrayList<>();

	public VehicleParentRentalStation(VehicleRentalStation v) {
		this.name = v.name;
		this.allowDropoff = v.allowDropoff;
		this.allowPickup = v.allowPickup;
		this.isVirtual = v.isVirtual;
		this.networks = v.networks;
		this.spacesAvailable = v.spacesAvailable;
		this.vehiclesAvailable = v.vehiclesAvailable;
		this.vehicleType = v.vehicleType;
		this.x = v.x;
		this.y = v.y;
		this.locale = v.locale;
	}
	
}

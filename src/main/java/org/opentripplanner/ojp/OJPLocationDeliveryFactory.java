package org.opentripplanner.ojp;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.Envelope;
import org.opentripplanner.model.FeedScopedId;
import org.opentripplanner.model.Route;
import org.opentripplanner.model.Stop;
import org.opentripplanner.routing.graph.GraphIndex;
import org.opentripplanner.routing.graph.GraphIndex.StopAndDistance;

import com.bliksemlabs.ojp.model.BusSubmodesOfTransportEnumeration;
import com.bliksemlabs.ojp.model.ErrorDescriptionStructure;
import com.bliksemlabs.ojp.model.FunicularSubmodesOfTransportEnumeration;
import com.bliksemlabs.ojp.model.LocationStructure;
import com.bliksemlabs.ojp.model.MetroSubmodesOfTransportEnumeration;
import com.bliksemlabs.ojp.model.NaturalLanguageStringStructure;
import com.bliksemlabs.ojp.model.RailSubmodesOfTransportEnumeration;
import com.bliksemlabs.ojp.model.ServiceDeliveryErrorConditionStructure;
import com.bliksemlabs.ojp.model.StopPointRefStructure;
import com.bliksemlabs.ojp.model.TelecabinSubmodesOfTransportEnumeration;
import com.bliksemlabs.ojp.model.TramSubmodesOfTransportEnumeration;
import com.bliksemlabs.ojp.model.VehicleModesOfTransportEnumeration;
import com.bliksemlabs.ojp.model.WaterSubmodesOfTransportEnumeration;

import de.vdv.ojp.InternationalTextStructure;
import de.vdv.ojp.ModeStructure;
import de.vdv.ojp.OJPLocationInformationDeliveryStructure;
import de.vdv.ojp.OJPLocationInformationRequestStructure;
import de.vdv.ojp.ObjectFactory;
import de.vdv.ojp.PlaceResultStructure;
import de.vdv.ojp.PlaceStructure;
import de.vdv.ojp.PlaceTypeEnumeration;
import de.vdv.ojp.StopPointStructure;

public class OJPLocationDeliveryFactory {
	
	private final OJPLocationInformationRequestStructure informationRequest;
	private final GraphIndex graphIndex;
	private List<VehicleModesOfTransportEnumeration> restrictionModes;
	private String searchByName;
	private ObjectFactory factory;
	
	public OJPLocationDeliveryFactory(GraphIndex graphIndex, OJPLocationInformationRequestStructure informationRequest, ObjectFactory factory) {
		this.graphIndex = graphIndex;
		this.informationRequest = informationRequest;
		this.factory = factory;
	}
	
    private static VehicleModesOfTransportEnumeration getTraverseMode(Route route) {
        int routeType = route.getType();
        if (routeType >= 100 && routeType < 200) { // Railway Service
            return VehicleModesOfTransportEnumeration.RAIL;
        } else if (routeType >= 200 && routeType < 300) { //Coach Service
            return VehicleModesOfTransportEnumeration.BUS;
        } else if (routeType >= 300
                && routeType < 500) { //Suburban Railway Service and Urban Railway service
            if (routeType >= 401 && routeType <= 402) {
                return VehicleModesOfTransportEnumeration.METRO;
            }
            return VehicleModesOfTransportEnumeration.RAIL;
        } else if (routeType >= 500 && routeType < 700) { //Metro Service and Underground Service
            return VehicleModesOfTransportEnumeration.METRO;
        } else if (routeType >= 700 && routeType < 900) { //Bus Service and Trolleybus service
            return VehicleModesOfTransportEnumeration.BUS;
        } else if (routeType >= 900 && routeType < 1000) { //Tram service
            return VehicleModesOfTransportEnumeration.TRAM;
        } else if (routeType >= 1000 && routeType < 1100) { //Water Transport Service
            return VehicleModesOfTransportEnumeration.WATER_TRANSPORT;
        } else if (routeType >= 1100 && routeType < 1200) { //Air Service
            return VehicleModesOfTransportEnumeration.AIR;
        } else if (routeType >= 1200 && routeType < 1300) { //Ferry Service
            return VehicleModesOfTransportEnumeration.FERRY_SERVICE;
        } else if (routeType >= 1300 && routeType < 1400) { //Telecabin Service
            return VehicleModesOfTransportEnumeration.TELECABIN;
        } else if (routeType >= 1400 && routeType < 1500) { //Funicalar Service
            return VehicleModesOfTransportEnumeration.FUNICULAR;
        } 
        /* Original GTFS route types. Should these be checked before TPEG types? */
        switch (routeType) {
        case 0:
            return VehicleModesOfTransportEnumeration.TRAM;
        case 1:
            return VehicleModesOfTransportEnumeration.METRO;
        case 2:
            return VehicleModesOfTransportEnumeration.RAIL;
        case 3:
            return VehicleModesOfTransportEnumeration.BUS;
        case 4:
            return VehicleModesOfTransportEnumeration.FERRY_SERVICE;
        case 5:
            return VehicleModesOfTransportEnumeration.TRAM;
        case 6:
            return VehicleModesOfTransportEnumeration.TELECABIN;
        case 7:
            return VehicleModesOfTransportEnumeration.FUNICULAR;
        default:
        	return VehicleModesOfTransportEnumeration.UNKNOWN;
        }
    }
    
    private static List<VehicleModesOfTransportEnumeration> getTraverseModes(Set<Route> routes) {
    	return routes.stream().map(r -> getTraverseMode(r)).distinct().collect(Collectors.toList());
    }
    
    
	
	public OJPLocationInformationDeliveryStructure create() {
		OJPLocationInformationDeliveryStructure location = new OJPLocationInformationDeliveryStructure();
		
		long timeStart = System.currentTimeMillis();
		
		String stopCode = null;
		restrictionModes = new ArrayList<>();
		List<PlaceTypeEnumeration> restrictionTypes = new ArrayList<>();
		int continueAt = 0;
		boolean includePtModes = false;
		long maxResults = Integer.MAX_VALUE;
		
		if(informationRequest.getPlaceRef() != null) {
			if(informationRequest.getPlaceRef().getStopPointRef() != null) {
				stopCode = informationRequest.getPlaceRef().getStopPointRef().getValue();
			} else if(informationRequest.getPlaceRef().getStopPlaceRef() != null) {
				stopCode = informationRequest.getPlaceRef().getStopPlaceRef().getValue();
			}	
		}
		

		if(informationRequest.getRestrictions() != null) {
			
			restrictionTypes = informationRequest.getRestrictions().getType();
			
			if(informationRequest.getRestrictions().getPtModes() != null) {
				restrictionModes = informationRequest.getRestrictions().getPtModes().getPtMode();
			}
			
			if(informationRequest.getRestrictions().isIncludePtModes() != null) {
				includePtModes = informationRequest.getRestrictions().isIncludePtModes();
			}
			
			
			if(informationRequest.getRestrictions().getContinueAt()!=null) {
				continueAt = informationRequest.getRestrictions().getContinueAt().intValue();
			}
			
			if(informationRequest.getRestrictions().getNumberOfResults() != null) {
				maxResults = informationRequest.getRestrictions().getNumberOfResults().longValue();
			}
			
		}
		
		if(!restrictionTypes.contains(PlaceTypeEnumeration.STOP)) {
			//return error
			location.setStatus(false);
			ServiceDeliveryErrorConditionStructure error = new ServiceDeliveryErrorConditionStructure();
			ErrorDescriptionStructure descr = new ErrorDescriptionStructure();
			descr.setValue("Illegal Type");
			long timeEnd = System.currentTimeMillis();
			location.setCalcTime(BigInteger.valueOf(timeEnd - timeStart));
			location.setErrorCondition(error.withDescription(descr ));
			return location;
		}
		
		List<StopAndDistance> tmpStops = new ArrayList<>();
		
		if(stopCode != null) {
			//search by id
			Stop stop = graphIndex.stopForId.get(FeedScopedId.convertFromString(stopCode));
			if(stop != null) {
				StopAndDistance stopAndDistance = new StopAndDistance(stop,1);
				tmpStops.add(stopAndDistance);
			}
			
		}else if(informationRequest.getInitialInput() != null){
			searchByName = informationRequest.getInitialInput().getLocationName();
			
			if(informationRequest.getInitialInput().getGeoRestriction() != null) {
				//search by georestriction
				if(informationRequest.getInitialInput().getGeoRestriction().getCircle() != null) {
					//search by georestriction circle
					double latitude = informationRequest.getInitialInput().getGeoRestriction().getCircle().getCenter().getLatitude().doubleValue();
					double longitude = informationRequest.getInitialInput().getGeoRestriction().getCircle().getCenter().getLongitude().doubleValue();
					int radius = informationRequest.getInitialInput().getGeoRestriction().getCircle().getRadius().intValue();
					
					tmpStops = graphIndex.findClosestStopsFlyCrow(latitude,longitude, radius).stream().sorted(Comparator.comparing(s -> (float) s.distance)).collect(Collectors.toList());
				}else if(informationRequest.getInitialInput().getGeoRestriction().getRectangle() != null) {
					//search by georestriction rectangle
					tmpStops = graphIndex.graph.streetIndex
                    .getTransitStopForEnvelope(new Envelope(
                        new Coordinate(informationRequest.getInitialInput().getGeoRestriction().getRectangle().getLowerRight().getLongitude().doubleValue(), 
                        		informationRequest.getInitialInput().getGeoRestriction().getRectangle().getLowerRight().getLatitude().doubleValue()),
                        new Coordinate(informationRequest.getInitialInput().getGeoRestriction().getRectangle().getUpperLeft().getLongitude().doubleValue(), 
                        		informationRequest.getInitialInput().getGeoRestriction().getRectangle().getUpperLeft().getLatitude().doubleValue())))
                    .stream()
                    .map(t -> new StopAndDistance(t.getStop(),1))
                    .collect(Collectors.toList());
				}
			}else {
				//return all
				tmpStops = graphIndex.stopForId.values().stream().map(s -> new StopAndDistance(s,1)).collect(Collectors.toList());
			}
		}else {
			tmpStops = graphIndex.stopForId.values().stream().map(s -> new StopAndDistance(s,1)).collect(Collectors.toList());
		}
		
		
		    			
		float sumDistances = 0;
		
		List<StopAndDistance> stops = tmpStops.stream().filter(mStop -> {
			//filter by modes
			if(!restrictionModes.isEmpty()) {
				Set<Route> routes = graphIndex.routesForStop(mStop.stop);

				List<VehicleModesOfTransportEnumeration> types = getTraverseModes(routes);
						
				if(Collections.disjoint(restrictionModes, types)) { //at list one mode must be in common
					return false;
				}
			}
			//filter by name
			
			if(searchByName != null) {
				Pattern p = Pattern.compile(searchByName);
				return p.matcher(mStop.stop.getName()).matches();
			}
			
			return true;
		}).skip(continueAt).limit(maxResults).collect(Collectors.toList());
		
		BigInteger mContinueAt = BigInteger.valueOf(continueAt + stops.size());
		
		if(stops.isEmpty()) {
			location.setStatus(false);
			ServiceDeliveryErrorConditionStructure error = new ServiceDeliveryErrorConditionStructure();
			ErrorDescriptionStructure descr = new ErrorDescriptionStructure();
			descr.setValue("No Locations");
			location.setErrorCondition(error.withDescription(descr ));
			long timeEnd = System.currentTimeMillis();
			location.setCalcTime(BigInteger.valueOf(timeEnd - timeStart));
			return location;			
		}else {
			location.setStatus(true);
			if(stops.size() == maxResults) {
				location.setContinueAt(mContinueAt);
			}
		}
		
		for(StopAndDistance stop : stops) {
			float mDistance = stop.distance;
				 if(mDistance == 0) {
					 mDistance = (float) 0.01;
				 }
				 sumDistances += (float) (1 / mDistance);
		}
		
		
		for(StopAndDistance stop : stops) {
			PlaceResultStructure place = new PlaceResultStructure();
			PlaceStructure p = new PlaceStructure();
			StopPointStructure sp = new StopPointStructure();
			InternationalTextStructure it = new InternationalTextStructure();
			NaturalLanguageStringStructure nL = new NaturalLanguageStringStructure();
			String lang = graphIndex.agenciesForFeedId.get(stop.stop.getId().getAgencyId()).values().iterator().next().getLang();
			nL.setLang(lang);
			nL.setValue(stop.stop.getName());
			it.setText(nL);
			sp.setStopPointName(it);
			sp.setWheelchairAccessible(stop.stop.getWheelchairBoarding() == 1);
			LocationStructure geo = new LocationStructure();
			geo.setLatitude(BigDecimal.valueOf(stop.stop.getLat()));
			geo.setLongitude(BigDecimal.valueOf(stop.stop.getLon()));
			p.setGeoPosition(geo);
			StopPointRefStructure sRef = new StopPointRefStructure();
			sRef.setValue(stop.stop.getId().toString());
			sp.setStopPointRef(sRef );
			p.setStopPoint(sp);
			p.setLocationName(it);
			
			place.setLocation(p);
			
			if(includePtModes) {
				Set<Route> routes = graphIndex.routesForStop(stop.stop);
				
				routes.stream().map(r -> r.getType()).distinct().forEach(type -> {
					ModeStructure m = new ModeStructure();
					switch(type) {
						case 0: m.setPtMode(VehicleModesOfTransportEnumeration.TRAM); m.setTramSubmode(TramSubmodesOfTransportEnumeration.ALL_TRAM_SERVICES); break;
			            case 1: m.setPtMode(VehicleModesOfTransportEnumeration.METRO); m.setMetroSubmode(MetroSubmodesOfTransportEnumeration.ALL_RAIL_SERVICES); break;
			            case 2: m.setPtMode(VehicleModesOfTransportEnumeration.RAIL); m.setRailSubmode(RailSubmodesOfTransportEnumeration.ALL_RAIL_SERVICES); break;
			            case 3: m.setPtMode(VehicleModesOfTransportEnumeration.BUS); m.setBusSubmode(BusSubmodesOfTransportEnumeration.ALL_BUS_SERVICES); break;
			            case 4: m.setPtMode(VehicleModesOfTransportEnumeration.FERRY_SERVICE); m.setWaterSubmode(WaterSubmodesOfTransportEnumeration.ALL_WATER_TRANSPORT_SERVICES); break;
			            case 5: m.setPtMode(VehicleModesOfTransportEnumeration.TRAM); m.setTramSubmode(TramSubmodesOfTransportEnumeration.CITY_TRAM); break;
			            case 6: m.setPtMode(VehicleModesOfTransportEnumeration.TELECABIN); m.setTelecabinSubmode(TelecabinSubmodesOfTransportEnumeration.ALL_TELECABIN_SERVICES); break;
			            case 7: m.setPtMode(VehicleModesOfTransportEnumeration.FUNICULAR); m.setFunicularSubmode(FunicularSubmodesOfTransportEnumeration.ALL_FUNICULAR_SERVICES); break;
			            default: m.setPtMode(VehicleModesOfTransportEnumeration.UNKNOWN); break;
					}
					place.getMode().add(m);
				});
			}
			
			place.setComplete(true);
			//   1/distance / sum(1/distance)
			
			float mDistance = stop.distance;
			 if(mDistance == 0) { // cannot be 0
				 mDistance = (float) 0.01;
			 }
			
			BigDecimal bd = new BigDecimal(Float.toString((float)((double)((float) ((1/mDistance) / sumDistances)))));
			bd = bd.setScale(4,  RoundingMode.HALF_UP);
			 
			place.setProbability(bd.floatValue());
			location.getLocation().add(place);
		}
		long timeEnd = System.currentTimeMillis();
		location.setCalcTime(BigInteger.valueOf(timeEnd - timeStart));
		return location;
	}
	
}

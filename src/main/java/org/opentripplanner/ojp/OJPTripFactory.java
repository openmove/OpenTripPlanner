package org.opentripplanner.ojp;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import org.opentripplanner.index.model.StopTimesInPattern;
import org.opentripplanner.index.model.TripTimeShort;
import org.opentripplanner.model.Agency;
import org.opentripplanner.model.FeedScopedId;
import org.opentripplanner.model.Route;
import org.opentripplanner.model.Stop;
import org.opentripplanner.model.Trip;
import org.opentripplanner.model.calendar.ServiceDate;
import org.opentripplanner.routing.graph.GraphIndex;

import com.bliksemlabs.ojp.model.ErrorDescriptionStructure;
import com.bliksemlabs.ojp.model.LineRefStructure;
import com.bliksemlabs.ojp.model.LocationStructure;
import com.bliksemlabs.ojp.model.NaturalLanguageStringStructure;
import com.bliksemlabs.ojp.model.OperatorRefStructure;
import com.bliksemlabs.ojp.model.ServiceDeliveryErrorConditionStructure;
import com.bliksemlabs.ojp.model.StopPointRefStructure;
import com.bliksemlabs.ojp.model.VehicleModesOfTransportEnumeration;

import de.vdv.ojp.AbstractResponseContextStructure.Places;
import de.vdv.ojp.CallAtNearStopStructure;
import de.vdv.ojp.CallAtStopStructure;
import de.vdv.ojp.CallAtStopStructure.ServiceArrival;
import de.vdv.ojp.CallAtStopStructure.ServiceDeparture;
import de.vdv.ojp.DatedJourneyStructure;
import de.vdv.ojp.InternationalTextStructure;
import de.vdv.ojp.JourneyRefStructure;
import de.vdv.ojp.ModeStructure;
import de.vdv.ojp.OJPStopEventDeliveryStructure;
import de.vdv.ojp.OJPStopEventRequestStructure;
import de.vdv.ojp.OJPTripDeliveryStructure;
import de.vdv.ojp.OJPTripInfoDeliveryStructure;
import de.vdv.ojp.OJPTripInfoRequestStructure;
import de.vdv.ojp.OJPTripRequestStructure;
import de.vdv.ojp.OperatingDayRefStructure;
import de.vdv.ojp.PlaceContextStructure;
import de.vdv.ojp.PlaceStructure;
import de.vdv.ojp.StopEventResponseContextStructure;
import de.vdv.ojp.StopEventResultStructure;
import de.vdv.ojp.StopEventStructure;
import de.vdv.ojp.StopEventTypeEnumeration;
import de.vdv.ojp.StopPointStructure;
import de.vdv.ojp.TripInfoResponseContextStructure;
import de.vdv.ojp.TripInfoResultStructure;

public class OJPTripFactory {
	
	private final OJPTripRequestStructure request;
	private final GraphIndex graphIndex;
	private List<VehicleModesOfTransportEnumeration> modeList = new ArrayList<>();
	private boolean excludeModes = false;
	private List<String> filteredLines = new ArrayList<>();
	
	private List<String> requestModes = new ArrayList<>();
	
	private List<String> filteredOperators = new ArrayList<>();
	
	private boolean includeAccessibility = false;
	private boolean includeIntermediateStops = false;		
//	private boolean includeTrack = false;
//	private boolean includeProjection = false;
	
	long transferLimit = Integer.MAX_VALUE;
	long maxResults = Integer.MAX_VALUE;
	
	List<String> allOTPModes = Arrays.asList("TRAM","SUBWAY","RAIL","BUS","FERRY","GONDOLA","FUNICULAR");
	
	public OJPTripFactory(GraphIndex graphIndex, OJPTripRequestStructure request) {
		this.graphIndex = graphIndex;
		this.request = request;
	}
	
	private static String convertOTPModes(VehicleModesOfTransportEnumeration ojpMode) {
		switch(ojpMode) {
		case RAIL: return "RAIL";
		case BUS: return "BUS";
		case METRO: return "SUBWAY";
		case TRAM: return "TRAM";
		case WATER_TRANSPORT: 
		case FERRY_SERVICE: 
			return "FERRY";
		case TELECABIN: return "GONDOLA";
		case FUNICULAR: return "FUNICULAR";
		default: return null;
		}
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

	public OJPTripDeliveryStructure create() {
		OJPTripDeliveryStructure trip = new OJPTripDeliveryStructure();
		
		long timeStart = System.currentTimeMillis();
		
		String tripId = null;
		
		
		Duration duration = Duration.ofHours(24);
		Date dateTmp = new Date();
		LocalDateTime date = null;
			
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		
		PlaceContextStructure origin = null;
		String originStop = null;
		String originName = null;
		BigDecimal originLat = null;
		BigDecimal originLng = null;
		
		PlaceContextStructure destination = null;
		String destinationStop = null;
		String destinationName = null;
		BigDecimal destinationLat = null;
		BigDecimal destinationLng = null;
		
		
		LocalDateTime departureTime;
		LocalDateTime arrivalTime;
		
		requestModes.add("WALK");
		
		if(request.getParams() != null) {
			if(request.getParams().getPtModeFilter() != null) {
				modeList = request.getParams().getPtModeFilter().getPtMode();
				excludeModes = request.getParams().getPtModeFilter().isExclude();
				for(VehicleModesOfTransportEnumeration mode : modeList) {
					String otpMode = convertOTPModes(mode);
					if(otpMode != null) {
						if(excludeModes == false) {
							requestModes.add(otpMode);
						}else {
							allOTPModes.remove(otpMode);
						}
					}
					
				}
				if(excludeModes == true) {
					requestModes.addAll(allOTPModes);
				}
			}else {
				requestModes.addAll(allOTPModes);
			}
			
			maxResults = request.getParams().getNumberOfResults().longValue();
			includeAccessibility = request.getParams().isIncludeAccessibility();
			includeIntermediateStops = request.getParams().isIncludeIntermediateStops();
			
		}
		
		
		
		if(request.getOrigin() != null && !request.getOrigin().isEmpty()) {
			origin = request.getOrigin().get(0);
			if(origin.getPlaceRef().getStopPlaceRef() != null) {
				originStop = origin.getPlaceRef().getStopPlaceRef().getValue();
			}else if(origin.getPlaceRef().getStopPointRef() != null) {
				originStop = origin.getPlaceRef().getStopPointRef().getValue();
			}
			
			
			
			if(origin.getPlaceRef().getLocationName() != null) {
				originName = origin.getPlaceRef().getLocationName().getText().getValue();
			}
			
			if(origin.getPlaceRef().getGeoPosition() != null) {
				
				if(origin.getPlaceRef().getGeoPosition().getCoordinates() != null) {
					originLat = BigDecimal.valueOf(Long.valueOf(origin.getPlaceRef().getGeoPosition().getCoordinates().getValue().get(1)));
					originLng = BigDecimal.valueOf(Long.valueOf(origin.getPlaceRef().getGeoPosition().getCoordinates().getValue().get(0)));
				}else {
					originLat = origin.getPlaceRef().getGeoPosition().getLatitude();
					originLng = origin.getPlaceRef().getGeoPosition().getLongitude();
				}
				
				
			}
			
			departureTime = origin.getDepArrTime();
			
		}
		
		if(request.getDestination() != null && !request.getDestination().isEmpty()) {
			destination = request.getDestination().get(0);
			if(destination.getPlaceRef().getStopPlaceRef() != null) {
				destinationStop = destination.getPlaceRef().getStopPlaceRef().getValue();
			}else if(origin.getPlaceRef().getStopPointRef() != null) {
				destinationStop = destination.getPlaceRef().getStopPointRef().getValue();
			}
			
			if(destination.getPlaceRef().getLocationName() != null) {
				destinationName = destination.getPlaceRef().getLocationName().getText().getValue();
			}
			if(destination.getPlaceRef().getGeoPosition() != null) {
				
				if(destination.getPlaceRef().getGeoPosition().getCoordinates() != null) {
					destinationLat = BigDecimal.valueOf(Long.valueOf(destination.getPlaceRef().getGeoPosition().getCoordinates().getValue().get(1)));
					destinationLng = BigDecimal.valueOf(Long.valueOf(destination.getPlaceRef().getGeoPosition().getCoordinates().getValue().get(0)));
				}else {
					destinationLat = destination.getPlaceRef().getGeoPosition().getLatitude();
					destinationLng = destination.getPlaceRef().getGeoPosition().getLongitude();
				}
			}		
			
			arrivalTime = destination.getDepArrTime();
			
			
		}
		
		if(originStop == null || (originLat == null || originLng == null)) {
			trip.setStatus(false);
			ServiceDeliveryErrorConditionStructure error = new ServiceDeliveryErrorConditionStructure();
			ErrorDescriptionStructure descr = new ErrorDescriptionStructure();
			descr.setValue("No Origin Defined");
			trip.setErrorCondition(error.withDescription(descr ));
			long timeEnd = System.currentTimeMillis();
			trip.setCalcTime(BigInteger.valueOf(timeEnd - timeStart));
			return trip;
		}
		
		if(destinationStop == null || (destinationLat == null || destinationLng == null)) {
			trip.setStatus(false);
			ServiceDeliveryErrorConditionStructure error = new ServiceDeliveryErrorConditionStructure();
			ErrorDescriptionStructure descr = new ErrorDescriptionStructure();
			descr.setValue("No Destination Defined");
			trip.setErrorCondition(error.withDescription(descr ));
			long timeEnd = System.currentTimeMillis();
			trip.setCalcTime(BigInteger.valueOf(timeEnd - timeStart));
			return trip;
		}
		
		
		
		long timeEnd = System.currentTimeMillis();
		trip.setCalcTime(BigInteger.valueOf(timeEnd - timeStart));
		return trip;
	}
	
}

package org.opentripplanner.ojp;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.temporal.TemporalUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

import org.locationtech.jts.geom.Coordinate;
import org.opentripplanner.api.common.Message;
import org.opentripplanner.api.common.ParameterException;
import org.opentripplanner.api.model.Itinerary;
import org.opentripplanner.api.model.Leg;
import org.opentripplanner.api.model.Place;
import org.opentripplanner.api.model.TripPlan;
import org.opentripplanner.api.model.error.PlannerError;
import org.opentripplanner.api.parameter.QualifiedModeSet;
import org.opentripplanner.api.resource.DebugOutput;
import org.opentripplanner.api.resource.GraphPathToTripPlanConverter;
import org.opentripplanner.common.model.GenericLocation;
import org.opentripplanner.gtfs.GtfsLibrary;
import org.opentripplanner.index.model.StopTimesInPattern;
import org.opentripplanner.index.model.TripTimeShort;
import org.opentripplanner.model.Agency;
import org.opentripplanner.model.FeedScopedId;
import org.opentripplanner.model.Route;
import org.opentripplanner.model.Stop;
import org.opentripplanner.model.Trip;
import org.opentripplanner.model.calendar.ServiceDate;
import org.opentripplanner.routing.core.OptimizeType;
import org.opentripplanner.routing.core.RouteMatcher;
import org.opentripplanner.routing.core.RoutingRequest;
import org.opentripplanner.routing.core.StopMatcher;
import org.opentripplanner.routing.core.TraverseModeSet;
import org.opentripplanner.routing.graph.GraphIndex;
import org.opentripplanner.routing.impl.GraphPathFinder;
import org.opentripplanner.routing.spt.GraphPath;
import org.opentripplanner.standalone.Router;
import org.opentripplanner.util.PolylineEncoder;
import org.opentripplanner.util.ResourceBundleSingleton;
import org.opentripplanner.util.model.EncodedPolylineBean;

import com.bliksemlabs.ojp.model.ErrorDescriptionStructure;
import com.bliksemlabs.ojp.model.LineDirectionStructure;
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
import de.vdv.ojp.DatedJourneyStructure;
import de.vdv.ojp.InternationalTextStructure;
import de.vdv.ojp.JourneyRefStructure;
import de.vdv.ojp.LegAlightStructure;
import de.vdv.ojp.LegBoardStructure;
import de.vdv.ojp.LegIntermediateStructure;
import de.vdv.ojp.LegTrackStructure;
import de.vdv.ojp.ModeStructure;
import de.vdv.ojp.MultiPointTripResultStructure;
import de.vdv.ojp.NotViaStructure;
import de.vdv.ojp.OJPMultiPointTripDeliveryStructure;
import de.vdv.ojp.OJPMultiPointTripRequestStructure;
import de.vdv.ojp.OJPStopEventDeliveryStructure;
import de.vdv.ojp.OJPStopEventRequestStructure;
import de.vdv.ojp.OJPTripDeliveryStructure;
import de.vdv.ojp.OJPTripInfoDeliveryStructure;
import de.vdv.ojp.OJPTripInfoRequestStructure;
import de.vdv.ojp.OJPTripRequestStructure;
import de.vdv.ojp.ObjectFactory;
import de.vdv.ojp.OperatingDayRefStructure;
import de.vdv.ojp.PlaceContextStructure;
import de.vdv.ojp.PlaceRefStructure;
import de.vdv.ojp.PlaceStructure;
import de.vdv.ojp.StopEventResponseContextStructure;
import de.vdv.ojp.StopEventResultStructure;
import de.vdv.ojp.StopEventStructure;
import de.vdv.ojp.StopEventTypeEnumeration;
import de.vdv.ojp.StopPointStructure;
import de.vdv.ojp.TimedLegStructure;
import de.vdv.ojp.TrackSectionStructure;
import de.vdv.ojp.TrackSectionStructure.LinkProjection;
import de.vdv.ojp.TransferLegStructure;
import de.vdv.ojp.TransferModesEnumeration;
import de.vdv.ojp.TripInfoResponseContextStructure;
import de.vdv.ojp.TripInfoResultStructure;
import de.vdv.ojp.TripLegStructure;
import de.vdv.ojp.TripResultStructure;
import de.vdv.ojp.TripStructure;
import de.vdv.ojp.TripViaStructure;

public class OJPMultiPointTripFactory {
	
	private final OJPMultiPointTripRequestStructure request;
	private final GraphIndex graphIndex;
	private List<VehicleModesOfTransportEnumeration> modeList = new ArrayList<>();
	private List<LineDirectionStructure> filteredLines = new ArrayList<>();
	private List<OperatorRefStructure> filteredOperators = new ArrayList<>();
	private boolean excludeModes = false;
	
	
	private List<String> requestModes = new ArrayList<>();
	private List<String> requestBannedLines = new ArrayList<>();
	private List<String> requestWhitelistLines = new ArrayList<>();
	private HashSet<String> requestBannedOperators = new HashSet<String>();
	private HashSet<String> requestWhitelistOperators = new HashSet<String>();
	
	private List<String> requestBannedStops = new ArrayList<>();
	private List<GenericLocation> viaStops = new ArrayList<>();
	
	private boolean includeAccessibility = false;
	private boolean includeIntermediateStops = false;		
	private boolean includeTrack = false;
//	private boolean includeProjection = false;
	
	long transferLimit = Integer.MAX_VALUE;
	long maxResults = Integer.MAX_VALUE;
	
	private ObjectFactory factory;
	
	List<String> allOTPModes = Arrays.asList("TRAM","SUBWAY","RAIL","BUS","FERRY","GONDOLA","FUNICULAR");
	
	
	public OJPMultiPointTripFactory(GraphIndex graphIndex, OJPMultiPointTripRequestStructure request, ObjectFactory factory) {
		this.graphIndex = graphIndex;
		this.request = request;
		this.factory = factory;
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
	private static VehicleModesOfTransportEnumeration convertOJPModes(int routeType) {
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
	
	
    private static VehicleModesOfTransportEnumeration getTraverseMode(Route route) {
        int routeType = route.getType();
        return convertOJPModes(routeType);
    }
    
    private static List<VehicleModesOfTransportEnumeration> getTraverseModes(Set<Route> routes) {
    	return routes.stream().map(r -> getTraverseMode(r)).distinct().collect(Collectors.toList());
    }

	public OJPMultiPointTripDeliveryStructure create() {
		OJPMultiPointTripDeliveryStructure trip = new OJPMultiPointTripDeliveryStructure();
		
		long timeStart = System.currentTimeMillis();
		
		String tripId = null;
		
		
		Duration duration = Duration.ofHours(24);
		Date dateTmp = new Date();
		LocalDateTime date = null;
			
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		
		List<PlaceContextStructure> origins = new ArrayList<>();
		
		
		List<PlaceContextStructure> destinations = new ArrayList<>();
		
		
		
		
		LocalDateTime departureTime = LocalDateTime.now();
		LocalDateTime arrivalTime = LocalDateTime.now();
		
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
			
			if(request.getParams().getLineFilter() != null) {
				filteredLines = request.getParams().getLineFilter().getLine();
				boolean excludeLines = request.getParams().getLineFilter().isExclude();
				for(LineDirectionStructure l : filteredLines) {
					if(excludeLines) {
						requestBannedLines.add(l.getLineRef().getValue());
					}else {
						requestWhitelistLines.add(l.getLineRef().getValue());
					}
					
				}
			}
			
			if(request.getParams().getOperatorFilter() != null) {
				filteredOperators = request.getParams().getOperatorFilter().getOperatorRef();
				boolean excludeOperators = request.getParams().getOperatorFilter().isExclude();
				for(OperatorRefStructure o : filteredOperators) {
					if(excludeOperators) {
						requestBannedOperators.add(o.getValue());
					}else {
						requestWhitelistOperators.add(o.getValue());
					}
				}
			}
			
			maxResults = request.getParams().getNumberOfResults().longValue();
			includeTrack = request.getParams().isIncludeTrackSections();
			includeAccessibility = request.getParams().isIncludeAccessibility();
			includeIntermediateStops = request.getParams().isIncludeIntermediateStops();
			
			
		}
		
		
		
		if(request.getOrigin() != null && !request.getOrigin().isEmpty()) {
			origins = request.getOrigin();
			
			
		}else {
			trip.setStatus(false);
			ServiceDeliveryErrorConditionStructure error = new ServiceDeliveryErrorConditionStructure();
			ErrorDescriptionStructure descr = new ErrorDescriptionStructure();
			descr.setValue("No Origin Defined");
			trip.setErrorCondition(error.withDescription(descr ));
			long timeEnd = System.currentTimeMillis();
			trip.setCalcTime(BigInteger.valueOf(timeEnd - timeStart));
			return trip;
		}
		
		if(request.getDestination() != null && !request.getDestination().isEmpty()) {
			destinations = request.getDestination();
			
			
			
		}else {
			trip.setStatus(false);
			ServiceDeliveryErrorConditionStructure error = new ServiceDeliveryErrorConditionStructure();
			ErrorDescriptionStructure descr = new ErrorDescriptionStructure();
			descr.setValue("No Destination Defined");
			trip.setErrorCondition(error.withDescription(descr ));
			long timeEnd = System.currentTimeMillis();
			trip.setCalcTime(BigInteger.valueOf(timeEnd - timeStart));
			return trip;
		}
		
		if(request.getVia() != null) {
			for(TripViaStructure viapoint : request.getVia()) {
				String viapointStop = null;
				String viapointStopName = "";
				BigDecimal viapointStopLat = null;
				BigDecimal viapointStopLng = null;
				
				if(viapoint.getViaPoint().getStopPlaceRef() != null) {
					viapointStop = viapoint.getViaPoint().getStopPlaceRef().getValue();
				}else if(viapoint.getViaPoint().getStopPointRef() != null) {
					viapointStop = viapoint.getViaPoint().getStopPointRef().getValue();
				}
				
				if(viapoint.getViaPoint().getLocationName() != null) {
					viapointStopName = viapoint.getViaPoint().getLocationName().getText().getValue();
				}
				if(viapoint.getViaPoint().getGeoPosition() != null) {
					
					if(viapoint.getViaPoint().getGeoPosition().getCoordinates() != null) {
						viapointStopLat = BigDecimal.valueOf(Long.valueOf(viapoint.getViaPoint().getGeoPosition().getCoordinates().getValue().get(1)));
						viapointStopLng = BigDecimal.valueOf(Long.valueOf(viapoint.getViaPoint().getGeoPosition().getCoordinates().getValue().get(0)));
					}else {
						viapointStopLat = viapoint.getViaPoint().getGeoPosition().getLatitude();
						viapointStopLng = viapoint.getViaPoint().getGeoPosition().getLongitude();
					}
				}	
				
				if(viapointStop != null) {
					viaStops.add(new GenericLocation(viapointStopName,viapointStop));
				}else if(viapointStopLat != null && viapointStopLng != null){
					viaStops.add(toGenericLocation(viapointStopLng.doubleValue(), viapointStopLat.doubleValue(), viapointStopName));
				}
			}
			
		}
		
		if(request.getNotVia() != null) {
			for(NotViaStructure notviapoint : request.getNotVia()) {
				if(notviapoint.getStopPlaceRef()!=null) {
					requestBannedStops.add(notviapoint.getStopPlaceRef().getValue());
				}else if(notviapoint.getStopPointRef()!= null) {
					requestBannedStops.add(notviapoint.getStopPointRef().getValue());
				}
				
			}
			
		}
		
		
		for(PlaceContextStructure origin : origins) {
			String originStop = null;
			String originName = null;
			BigDecimal originLat = null;
			BigDecimal originLng = null;
			
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
			
			for(PlaceContextStructure destination : destinations) {
				
				String destinationStop = null;
				String destinationName = null;
				BigDecimal destinationLat = null;
				BigDecimal destinationLng = null;
				
				if(destination.getPlaceRef().getStopPlaceRef() != null) {
					destinationStop = destination.getPlaceRef().getStopPlaceRef().getValue();
				}else if(destination.getPlaceRef().getStopPointRef() != null) {
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
				
				Map<String,Object> requestMap = new HashMap<String,Object>();
				
				
				
				if(originStop != null) {
					requestMap.put("originPlace",new GenericLocation("",originStop));		
				}
				else {
					requestMap.put("originPlace", toGenericLocation(originLng.doubleValue(), originLat.doubleValue(), originName));
				}
				if(destinationStop != null) {
					requestMap.put("destinatioPlace", new GenericLocation("",destinationStop));
				}else {
					requestMap.put("destinatioPlace", toGenericLocation(destinationLng.doubleValue(), destinationLat.doubleValue(), destinationName));
				}
				
				
				requestMap.put("departureTime", departureTime);
				requestMap.put("arrivalTime", arrivalTime);
				requestMap.put("maxResults", maxResults);
				requestMap.put("maxTransfers", transferLimit);
				requestMap.put("includeAccessibility", includeAccessibility);
				requestMap.put("includeIntermediateStops", includeIntermediateStops);
				requestMap.put("modes", requestModes);
				
				if(!requestBannedStops.isEmpty()) {
					requestMap.put("bannedStops", requestBannedStops);
				}
				
				
				if(!viaStops.isEmpty()) {
					requestMap.put("intemediatePlaces", viaStops);
				}
				
				
				
				if(!requestBannedLines.isEmpty()) {
					requestMap.put("bannedRoutes", requestBannedLines);
				}
				
				if(!requestWhitelistLines.isEmpty()) {
					requestMap.put("whitelistRoutes", requestWhitelistLines);
				}
				
				if(!requestBannedOperators.isEmpty()) {
					requestMap.put("bannedAgencies", requestBannedOperators);
				}
				
				if(!requestWhitelistOperators.isEmpty()) {
					requestMap.put("whitelistAgencies", requestWhitelistOperators);
				}
				
				
				
				Router router = new Router(graphIndex.graph.routerId, graphIndex.graph);
		        RoutingRequest request = createRequest(requestMap);

		        GraphPathFinder gpFinder = new GraphPathFinder(router);

		        TripPlan plan = new TripPlan(
		                new Place(request.from.lng, request.from.lat, request.getFromPlace().name),
		                new Place(request.to.lng, request.to.lat, request.getToPlace().name),
		                request.getDateTime());
		        List<Message> messages = new ArrayList<>();
		        DebugOutput debugOutput = new DebugOutput();

		        try {
		            List<GraphPath> paths = gpFinder.graphPathFinderEntryPoint(request);
		            plan = GraphPathToTripPlanConverter.generatePlan(paths, request);
		            // Add timeout message even if paths are found and no exception thrown
		            if (request.rctx.debugOutput.timedOut) {
		                messages.add(Message.REQUEST_TIMEOUT);
		            }
		            trip.setStatus(true);
		            Places allPlaces = new Places();
		            HashSet<PlaceStructure> allMyPlaces = new HashSet<PlaceStructure>();
		           //TODO: create XML of plan object.
		            for(Itinerary itinerary : plan.itinerary) {
		            	MultiPointTripResultStructure tripResult = new MultiPointTripResultStructure();
		            	long tripDistance = 0;
		            	tripResult.setResultId(randomUUID());
		            	TripStructure tripStructure = new TripStructure();
		            	tripStructure.setTripId(randomUUID());
						tripStructure.setDuration(Duration.ofSeconds(itinerary.duration));
		            	tripStructure.setStartTime(toLocalDateTime(itinerary.startTime));
		            	tripStructure.setEndTime(toLocalDateTime(itinerary.endTime));
		            	tripStructure.setTransfers(BigInteger.valueOf(itinerary.transfers));
		            	for(Leg leg : itinerary.legs) {
		            		String lang = graphIndex.agenciesForFeedId.get(leg.agencyId).values().iterator().next().getLang();
		            		TripLegStructure legStructure = new TripLegStructure();
		                	tripDistance += leg.distance;
		                	if(!leg.isTransitLeg()) {
		                		TransferLegStructure transferLeg = new TransferLegStructure();
		                		if(leg.mode.equals("WALK")) {
		                			transferLeg.setTransferMode(TransferModesEnumeration.WALK);
		                		} //TODO: fix this if when BICYCLES/MICROMOBILITIES will be allowed in the request

		                		PlaceRefStructure start = new PlaceRefStructure();
		                		PlaceRefStructure end = new PlaceRefStructure();
		                		
		                		Place from = leg.from;
		                		Place to = leg.to;
		                		
		                		if(from.stopId != null) {
		                			start.setStopPointRef(new StopPointRefStructure().withValue(from.stopId.toString()));
		                			allMyPlaces.add(
		                					new PlaceStructure()
		                					.withLocationName(getInternationName(from.name,lang))
		                					.withStopPoint(new StopPointStructure()
		                							.withStopPointRef(
		                									new StopPointRefStructure().withValue(from.stopId.toString())
		                									)
		                							.withStopPointName(getInternationName(from.name,lang))
		                							)
		                					.withGeoPosition(
		                							new LocationStructure()
		                							.withLatitude(BigDecimal.valueOf(from.lat))
		                							.withLongitude(BigDecimal.valueOf(from.lon))));
		                		}else {
		                			start.setGeoPosition(new LocationStructure().withLatitude(BigDecimal.valueOf(from.lat)).withLongitude(BigDecimal.valueOf(from.lon)));
		                		}
		                		
								start.setLocationName(getInternationName(from.name,lang) );
		                		
		                		if(to.stopId != null) {
		                			end.setStopPointRef(new StopPointRefStructure().withValue(to.stopId.toString()));
		                			allMyPlaces.add(
		                					new PlaceStructure()
		                					.withLocationName(getInternationName(to.name,lang))
		                					.withStopPoint(new StopPointStructure()
		                							.withStopPointRef(
		                									new StopPointRefStructure().withValue(to.stopId.toString())
		                									)
		                							.withStopPointName(getInternationName(to.name,lang))
		                							)
		                					.withGeoPosition(
		                							new LocationStructure()
		                							.withLatitude(BigDecimal.valueOf(to.lat))
		                							.withLongitude(BigDecimal.valueOf(to.lon))));
		                		} else {
		                			end.setGeoPosition(new LocationStructure().withLatitude(BigDecimal.valueOf(to.lat)).withLongitude(BigDecimal.valueOf(to.lon)));
		                		}
		                		
								end.setLocationName(getInternationName(to.name,lang) );
		                		
								transferLeg.setLegStart(start);
								transferLeg.setLegEnd(end );
								
								
								transferLeg.setDuration(Duration.ofSeconds((long) leg.getDuration()));
								transferLeg.setWalkDuration(Duration.ofSeconds((long) leg.getDuration()));
								
								transferLeg.setTimeWindowStart(toLocalDateTime(leg.startTime));
								transferLeg.setTimeWindowEnd(toLocalDateTime(leg.endTime));
								
		                		legStructure.setTransferLeg(transferLeg);
		                	}else {
		                		TimedLegStructure timedLeg = new TimedLegStructure();
		                		LegBoardStructure board = new LegBoardStructure();
		                		LegAlightStructure alight = new LegAlightStructure();
		                		
		                		Place from = leg.from;
		                		Place to = leg.to;
		                		
		                		int sequence = 1;
		                		
		                		board.setStopPointRef(new StopPointRefStructure().withValue(from.stopId.toString()));
		                		
								board.setStopPointName(getInternationName(from.name,lang) );
								board.setOrder(BigInteger.valueOf(sequence));
								
								
								board.setServiceArrival(
										new LegBoardStructure.ServiceArrival()
											.withTimetabledTime(toLocalDateTime(from.arrival))
											.withEstimatedTime(toLocalDateTime(from.arrival).plusSeconds(leg.arrivalDelay))
										);
								board.setServiceDeparture(
										new LegBoardStructure.ServiceDeparture()
											.withTimetabledTime(toLocalDateTime(from.departure))
											.withEstimatedTime(toLocalDateTime(from.departure).plusSeconds(leg.departureDelay))
										);
								
								allMyPlaces.add(
		            					new PlaceStructure()
		            					.withLocationName(getInternationName(from.name,lang))
		            					.withStopPoint(new StopPointStructure()
		            							.withStopPointRef(
		            									new StopPointRefStructure().withValue(from.stopId.toString())
		            									)
		            							.withStopPointName(getInternationName(from.name,lang))
		            							)
		            					.withGeoPosition(
		            							new LocationStructure()
		            							.withLatitude(BigDecimal.valueOf(from.lat))
		            							.withLongitude(BigDecimal.valueOf(from.lon))));
								
														
								for(Place stop: leg.stop) {
									sequence += 1;
									if(includeIntermediateStops) {
										LegIntermediateStructure intermediateStop = new LegIntermediateStructure();
										intermediateStop.setOrder(BigInteger.valueOf(sequence));
										intermediateStop.setStopPointRef(new StopPointRefStructure().withValue(stop.stopId.toString()));
										
										
				                		intermediateStop.setStopPointName(getInternationName(stop.name,lang));
				                		
				                		intermediateStop.setServiceArrival(
				                				new LegIntermediateStructure.ServiceArrival()
				                				.withTimetabledTime(toLocalDateTime(stop.arrival))
				                				.withEstimatedTime(toLocalDateTime(stop.arrival).plusSeconds(leg.arrivalDelay))
				                				);
				                		intermediateStop.setServiceDeparture(
				                				new LegIntermediateStructure.ServiceDeparture()
				                				.withTimetabledTime(toLocalDateTime(stop.departure))
				                				.withEstimatedTime(toLocalDateTime(stop.departure).plusSeconds(leg.departureDelay))
				                				);
										
										timedLeg.getLegIntermediates().add(intermediateStop );
										allMyPlaces.add(
			                					new PlaceStructure()
			                					.withLocationName(getInternationName(stop.name,lang))
			                					.withStopPoint(new StopPointStructure()
			                							.withStopPointRef(
			                									new StopPointRefStructure().withValue(stop.stopId.toString())
			                									)
			                							.withStopPointName(getInternationName(stop.name,lang))
			                							)
			                					.withGeoPosition(
			                							new LocationStructure()
			                							.withLatitude(BigDecimal.valueOf(stop.lat))
			                							.withLongitude(BigDecimal.valueOf(stop.lon))));
									}
								}
		                		
								alight.setStopPointRef(new StopPointRefStructure().withValue(to.stopId.toString()));
								
		                		alight.setStopPointName(getInternationName(to.name,lang) );
		                		alight.setOrder(BigInteger.valueOf(sequence+1));
		                		
		                		alight.setServiceArrival(new LegAlightStructure.ServiceArrival()
		                				.withTimetabledTime(toLocalDateTime(to.arrival))
		                				.withEstimatedTime(toLocalDateTime(to.arrival).plusSeconds(leg.arrivalDelay))
		                				);
		                		alight.setServiceDeparture(new LegAlightStructure.ServiceDeparture()
		                				.withTimetabledTime(toLocalDateTime(to.departure))
		                				.withEstimatedTime(toLocalDateTime(to.departure).plusSeconds(leg.departureDelay))
		                				);
		                		
		                		allMyPlaces.add(
		            					new PlaceStructure()
		            					.withLocationName(getInternationName(to.name,lang))
		            					.withStopPoint(new StopPointStructure()
		            							.withStopPointRef(
		            									new StopPointRefStructure().withValue(to.stopId.toString())
		            									)
		            							.withStopPointName(getInternationName(to.name,lang))
		            							)
		            					
		            					.withGeoPosition(
		            							new LocationStructure()
		            							.withLatitude(BigDecimal.valueOf(to.lat))
		            							.withLongitude(BigDecimal.valueOf(to.lon))));
		                		
								timedLeg.setLegBoard(board);
								timedLeg.setLegAlight(alight );
		                		
								DatedJourneyStructure dj = factory.createDatedJourneyStructure();
																			
								dj.getContent().add(factory.createOperatorRef(new OperatorRefStructure().withValue(leg.agencyId)));
								dj.getContent().add(factory.createDatedJourneyStructureLineRef(new LineRefStructure().withValue(leg.routeId.toString())));
								
								List<Stop> allStops = graphIndex.patternForTrip.get(graphIndex.tripForId.get(leg.tripId)).getStops();
								
								Stop originTripStop = allStops.get(0);
								Stop destinationTripStop = allStops.get(allStops.size()-1);
								
								
								dj.getContent().add(factory.createDatedJourneyStructureOriginStopPointRef(
										new StopPointRefStructure()
											.withValue(
													originTripStop.getId().toString()
													)
											)
										);
								
								allMyPlaces.add(
		            					new PlaceStructure()
		            					.withLocationName(getInternationName(originTripStop.getName(),lang))
		            					.withStopPoint(new StopPointStructure()
		            							.withStopPointRef(
		            									new StopPointRefStructure().withValue(originTripStop.getId().toString())
		            									)
		            							.withStopPointName(getInternationName(originTripStop.getName(),lang))
		            							)
		            					.withGeoPosition(
		            							new LocationStructure()
		            							.withLatitude(BigDecimal.valueOf(originTripStop.getLat()))
		            							.withLongitude(BigDecimal.valueOf(originTripStop.getLon()))));
								
								dj.getContent().add(factory.createDatedJourneyStructureDestinationStopPointRef(
										new StopPointRefStructure()
											.withValue(
													destinationTripStop.getId().toString()
													)
											)
										);
								
								allMyPlaces.add(
		            					new PlaceStructure()
		            					.withLocationName(getInternationName(destinationTripStop.getName(),lang))
		            					.withStopPoint(new StopPointStructure()
		            							.withStopPointRef(
		            									new StopPointRefStructure().withValue(destinationTripStop.getId().toString())
		            									)
		            							.withStopPointName(getInternationName(destinationTripStop.getName(),lang))
		            							)
		            					.withGeoPosition(
		            							new LocationStructure()
		            							.withLatitude(BigDecimal.valueOf(destinationTripStop.getLat()))
		            							.withLongitude(BigDecimal.valueOf(destinationTripStop.getLon()))));
								
								dj.getContent().add(factory.createDatedJourneyStructureOriginText(getInternationName(allStops.get(0).getName(),lang)));
								dj.getContent().add(factory.createDatedJourneyStructureDestinationText(getInternationName(allStops.get(allStops.size()-1).getName(),lang)));
								
								dj.getContent().add(factory.createJourneyRef(new JourneyRefStructure().withValue(leg.tripId.toString())));
								dj.getContent().add(factory.createDatedJourneyStructurePublishedLineName(getInternationName(leg.route,lang)));
								dj.getContent().add(factory.createOperatingDayRef(new OperatingDayRefStructure().withValue(leg.serviceDate)));
								
								dj.getContent().add(factory.createDatedJourneyStructureMode(new ModeStructure().withPtMode(convertOJPModes(leg.routeType))));
								
								
								timedLeg.setService(dj );
								
								if(includeTrack) {
									LegTrackStructure track = new LegTrackStructure();
									
									TrackSectionStructure tss = new TrackSectionStructure();
									LinkProjection projection = new LinkProjection();
									
									EncodedPolylineBean polyline = leg.legGeometry;
									List<Coordinate> coordinates = PolylineEncoder.decode(polyline);
											
									for(Coordinate coor : coordinates) {
										LocationStructure point = new LocationStructure();
										point.setLatitude(BigDecimal.valueOf(coor.y));
										point.setLongitude(BigDecimal.valueOf(coor.x));
										projection.getPosition().add(point);
									}				
								
									PlaceRefStructure pointStart = new PlaceRefStructure();
									PlaceRefStructure pointEnd = new PlaceRefStructure();
									
									pointStart.setLocationName(getInternationName(leg.from.name,lang));
									pointEnd.setLocationName(getInternationName(leg.to.name,lang));
									
									if(leg.from.stopId != null) {
										pointStart.setStopPointRef(new StopPointRefStructure().withValue(leg.from.stopId.toString()));
									}else {
										pointStart.setGeoPosition(new LocationStructure().withLatitude(BigDecimal.valueOf(leg.from.lat)).withLongitude(BigDecimal.valueOf(leg.from.lon)));
			                		}
									
									if(leg.to.stopId != null) {
										pointEnd.setStopPointRef(new StopPointRefStructure().withValue(leg.to.stopId.toString()));
									}else {
										pointEnd.setGeoPosition(new LocationStructure().withLatitude(BigDecimal.valueOf(leg.to.lat)).withLongitude(BigDecimal.valueOf(leg.to.lon)));
			                		}
									
									tss.setTrackStart(pointStart);
									tss.setTrackEnd(pointEnd);
									
									
									tss.setLinkProjection(projection );
									track.getTrackSection().add(tss );
									timedLeg.setLegTrack(track );
									
								}
		                		
		                		legStructure.setTimedLeg(timedLeg);
		                	}
		                	legStructure.setLegId(randomUUID());
		                	
		    				tripStructure.getTripLeg().add(legStructure);
		            	}
		            	
		            	tripStructure.setDistance(BigInteger.valueOf(tripDistance));
						tripResult.setTrip(tripStructure);
						trip.getMultiPointTripResult().add(tripResult);
						
		            }
		            
		            allPlaces.getLocation().addAll(new ArrayList<PlaceStructure>(allMyPlaces));
					trip.getTripResponseContext().setPlaces(allPlaces );
		           
		        } catch (Exception e) {
		            PlannerError error = new PlannerError(request, e);
		            if (!PlannerError.isPlanningError(e.getClass())) {
		                messages.add(error.message);
		                
		            }
		            ServiceDeliveryErrorConditionStructure errorS = new ServiceDeliveryErrorConditionStructure();
					ErrorDescriptionStructure descr = new ErrorDescriptionStructure();
					descr.setValue(error.message.get());
					trip.setErrorCondition(errorS.withDescription(descr ));
					break;
		        } catch (Throwable t) {
		            System.out.printf("Unchecked error while planning path: ", t);
		            trip.setStatus(false);
					ServiceDeliveryErrorConditionStructure error = new ServiceDeliveryErrorConditionStructure();
					ErrorDescriptionStructure descr = new ErrorDescriptionStructure();
					descr.setValue("Unchecked error while planning path.");
					trip.setErrorCondition(error.withDescription(descr ));
					break;
		        } finally {
		            if (request != null) {
		                if (request.rctx != null) {
		                    debugOutput = request.rctx.debugOutput;

		                }
		                request.cleanup();
		            }
		        }
			}
		}
		
		
		long timeEnd = System.currentTimeMillis();
		trip.setCalcTime(BigInteger.valueOf(timeEnd - timeStart));
		return trip;
	}
	
	private InternationalTextStructure getInternationName(String text, String lang) {
		InternationalTextStructure name = new InternationalTextStructure();
		NaturalLanguageStringStructure tmpName = new NaturalLanguageStringStructure();
		tmpName.setValue(text);
		tmpName.setLang(lang);
		name.setText(tmpName );		
		return name;
	}
	
	private String randomUUID() {
		UUID uuid = UUID.randomUUID();
        String uuidAsString = uuid.toString();
        return uuidAsString;
	}
	
	private static LocalDateTime toLocalDateTime(Calendar calendar) {
        return LocalDateTime.ofInstant(calendar.toInstant(), ZoneId.systemDefault());
    }
	
	private GenericLocation toGenericLocation(double lng, double lat, String address) {

        if (address != null) {
            return new GenericLocation(address, Double.toString(lat) + "," + Double.toString(lng));
        }

        return new GenericLocation(lat, lng);
    }

	private RoutingRequest createRequest(Map<String, Object> requestMap) {
		Router router = new Router(graphIndex.graph.routerId, graphIndex.graph);
		RoutingRequest request = new RoutingRequest();
        request.routerId =  router.id;
                
        
        request.from = (GenericLocation) requestMap.get("originPlace");
        request.to = (GenericLocation) requestMap.get("destinationPlace");
        
        Date date = Date.from(
        		(LocalDateTime.now())
        	      .atZone(router.graph.getTimeZone().toZoneId())
        	      .toInstant());
        
        if(requestMap.get("departureTime") != null) {
        	date = Date.from(
            		((LocalDateTime)requestMap.get("departureTime"))
            	      .atZone(router.graph.getTimeZone().toZoneId())
            	      .toInstant());
        } else if (requestMap.get("arrivalTime") != null) {
        	request.arriveBy=true;
        	date = Date.from(
            		((LocalDateTime)requestMap.get("arrivalTime"))
            	      .atZone(router.graph.getTimeZone().toZoneId())
            	      .toInstant());
        }
        
        request.setDateTime(date);
        request.numItineraries = (int) requestMap.get("maxResults");
        request.maxTransfers = (int) requestMap.get("maxTransfers");
        
        request.showIntermediateStops = true;//(boolean) requestMap.get("includeIntermediateStops");
        @SuppressWarnings("unchecked")
		List<String> modes = (List<String>) requestMap.get("modes");
        request.modes = new TraverseModeSet(String.join(",", modes));
        
        if(requestMap.containsKey("bannedRoutes")) {
        	@SuppressWarnings("unchecked")
			List<String> routes = (List<String>) requestMap.get("bannedRoutes");
        	request.bannedRoutes = RouteMatcher.parse(String.join(",",routes));
        }
        
        if(requestMap.containsKey("whitelistRoutes")) {
        	@SuppressWarnings("unchecked")
			List<String> routes = (List<String>) requestMap.get("whitelistRoutes");
        	request.whiteListedRoutes  = RouteMatcher.parse(String.join(",",routes));
        }
        
        if(requestMap.containsKey("bannedAgencies")) {
        	@SuppressWarnings("unchecked")
        	HashSet<String> agencies = (HashSet<String>) requestMap.get("bannedAgencies");
        	request.bannedAgencies = agencies;
        }
        
        if(requestMap.containsKey("whitelistAgencies")) {
        	@SuppressWarnings("unchecked")
        	HashSet<String> agencies = (HashSet<String>) requestMap.get("whitelistAgencies");
        	request.whiteListedAgencies  = agencies;
        }
        
        if(requestMap.containsKey("bannedStops")) {
        	@SuppressWarnings("unchecked")
        	List<String> stops = (List<String>) requestMap.get("bannedStops");
        	request.bannedStopsHard = StopMatcher.parse(String.join(",", stops));
        }
        
        if(requestMap.containsKey("intermediatePlaces")) {
        	@SuppressWarnings("unchecked")
        	List<GenericLocation> stops = (List<GenericLocation>) requestMap.get("intermediatePlaces");
        	request.intermediatePlaces = stops;
        }
        
        return request;
	}
	
}

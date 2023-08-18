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
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

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
import de.vdv.ojp.OJPTripInfoDeliveryStructure;
import de.vdv.ojp.OJPTripInfoRequestStructure;
import de.vdv.ojp.ObjectFactory;
import de.vdv.ojp.OperatingDayRefStructure;
import de.vdv.ojp.PlaceStructure;
import de.vdv.ojp.StopEventResponseContextStructure;
import de.vdv.ojp.StopEventResultStructure;
import de.vdv.ojp.StopEventStructure;
import de.vdv.ojp.StopEventTypeEnumeration;
import de.vdv.ojp.StopPointStructure;
import de.vdv.ojp.TripInfoResponseContextStructure;
import de.vdv.ojp.TripInfoResultStructure;

public class OJPTripInfoFactory {
	
	private final OJPTripInfoRequestStructure request;
	private final GraphIndex graphIndex;
	private List<VehicleModesOfTransportEnumeration> filteredMode = new ArrayList<>();
	private List<String> filteredLines = new ArrayList<>();
	private List<String> filteredOperators = new ArrayList<>();
	
	private boolean includeCalls = false;
	private boolean includeService = false;		
	private boolean includeDays = false;
	private boolean excludeModeType = false;
	private boolean excludeLines = false;
	private boolean excludeOperators = false;
	long maxResults = Integer.MAX_VALUE;
	StopEventTypeEnumeration stopEventType = StopEventTypeEnumeration.BOTH;
	private ObjectFactory factory;
	
	public OJPTripInfoFactory(GraphIndex graphIndex, OJPTripInfoRequestStructure request, ObjectFactory factory) {
		this.graphIndex = graphIndex;
		this.request = request;
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

	public OJPTripInfoDeliveryStructure create() {
		OJPTripInfoDeliveryStructure event = new OJPTripInfoDeliveryStructure();
		
		long timeStart = System.currentTimeMillis();
		
		String tripId = null;
		filteredMode = new ArrayList<>();
		
		
		Duration duration = Duration.ofHours(24);
		Date dateTmp = new Date();
		LocalDateTime date = null;
		
		if(request.getJourneyRef() != null) {
			tripId = request.getJourneyRef().getValue();
		}
		
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		
		if(request.getOperatingDayRef() != null) {
			String dateString = request.getOperatingDayRef().getValue();
			try {
				dateTmp = simpleDateFormat.parse(dateString);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			date = dateTmp.toInstant()
				      .atZone(ZoneId.systemDefault())
				      .toLocalDateTime();
		}
		
		if(request.getParams() != null) {
									
			if(request.getParams().isIncludeCalls() != null ) {
				includeCalls = request.getParams().isIncludeCalls().booleanValue();
			}
			
			if(request.getParams().isIncludeService() != null) {
				includeService = request.getParams().isIncludeService().booleanValue();
			}
			
		}
		

		
		if(tripId == null) {
			event.setStatus(false);
			ServiceDeliveryErrorConditionStructure error = new ServiceDeliveryErrorConditionStructure();
			ErrorDescriptionStructure descr = new ErrorDescriptionStructure();
			descr.setValue("No Trip defined");
			event.setErrorCondition(error.withDescription(descr ));
			long timeEnd = System.currentTimeMillis();
			event.setCalcTime(BigInteger.valueOf(timeEnd - timeStart));
			return event;		
		}
			//search by id
		Trip trip = graphIndex.tripForId.get(FeedScopedId.convertFromString(tripId));
				
		if(trip == null) {
			event.setStatus(false);
			ServiceDeliveryErrorConditionStructure error = new ServiceDeliveryErrorConditionStructure();
			ErrorDescriptionStructure descr = new ErrorDescriptionStructure();
			descr.setValue("No Trip");
			event.setErrorCondition(error.withDescription(descr ));
			long timeEnd = System.currentTimeMillis();
			event.setCalcTime(BigInteger.valueOf(timeEnd - timeStart));
			return event;		
		}
	
		Agency agency = (Agency) graphIndex.agenciesForFeedId.get(trip.getId().getAgencyId()).values().toArray()[0]; //in the same feed the timezone must be the same for each agency.
		ZoneId zone = ZoneId.of(agency.getTimezone());
		ZoneOffset zoneOffSet = zone.getRules().getOffset(date);
		
		ServiceDate dateService = new ServiceDate(dateTmp);
		List<TripTimeShort> stoptimes = new ArrayList<>();
		stoptimes = graphIndex.getStopTimesForTrip(trip, dateService);
		TripInfoResponseContextStructure context = new TripInfoResponseContextStructure();
		Places places = new Places();
		TripInfoResultStructure result = new TripInfoResultStructure();
		
		LocalDateTime now = LocalDateTime.now();
		
		stoptimes.stream()
	        .sorted(Comparator.comparing(st -> st.stopIndex))
	        .forEach(st -> {
	        		
	        	
	        	Stop stop = graphIndex.stopForId.get(st.stopId);
	    		
	    		PlaceStructure p = new PlaceStructure();
	    		StopPointStructure sp = new StopPointStructure();
	    		InternationalTextStructure it = new InternationalTextStructure();
	    		NaturalLanguageStringStructure nL = new NaturalLanguageStringStructure();
	    		String lang = graphIndex.agenciesForFeedId.get(stop.getId().getAgencyId()).values().iterator().next().getLang();
	    		nL.setLang(lang);
	    		nL.setValue(stop.getName());
	    		it.setText(nL);
	    		sp.setStopPointName(it);
	    		sp.setWheelchairAccessible(stop.getWheelchairBoarding() == 1);
	    		LocationStructure geo = new LocationStructure();
	    		geo.setLatitude(BigDecimal.valueOf(stop.getLat()));
	    		geo.setLongitude(BigDecimal.valueOf(stop.getLon()));
	    		p.setGeoPosition(geo);
	    		StopPointRefStructure sRef = new StopPointRefStructure();
	    		sRef.setValue(stop.getId().toString());
	    		sp.setStopPointRef(sRef );
	    		p.setStopPoint(sp);
	    		p.setLocationName(it);
	    		
	    		boolean found = false;
	    		for(PlaceStructure place : places.getLocation()) {
	    			if(place.getStopPoint().getStopPointRef().equals(sRef)) {
	    				found = true;
	    				break;
	    			}
	    		}
	    		
	    		if(!found) {
	    			places.getLocation().add(p);
	    		}
	    		
	    		if(includeCalls) {
					CallAtStopStructure mCallAtStop = new CallAtStopStructure();
	    			
					mCallAtStop.setOrder(BigInteger.valueOf(st.stopSequence));
					mCallAtStop.setStopPointRef(new StopPointRefStructure().withValue(stop.getId().toString()));
					
											
					mCallAtStop.setStopPointName(it);
					
					ServiceArrival arrival = new ServiceArrival();
					
					arrival.setTimetabledTime(LocalDateTime.ofEpochSecond(st.serviceDay + st.realtimeArrival, 0, zoneOffSet));
					arrival.setTimetabledTime(LocalDateTime.ofEpochSecond(st.serviceDay + st.scheduledArrival, 0, zoneOffSet));
					
					
					mCallAtStop.setServiceArrival(arrival);
					
					
					ServiceDeparture departure = new ServiceDeparture();
					departure.setEstimatedTime(LocalDateTime.ofEpochSecond(st.serviceDay + st.realtimeDeparture, 0, zoneOffSet));
				
				
					departure.setTimetabledTime(LocalDateTime.ofEpochSecond(st.serviceDay + st.scheduledDeparture, 0, zoneOffSet));
								
				
					mCallAtStop.setServiceDeparture(departure);
												
					if(now.isBefore(LocalDateTime.ofEpochSecond(st.serviceDay + st.realtimeArrival, 0, zoneOffSet))) {
						result.getOnwardCall().add(mCallAtStop );
					}else {
						result.getPreviousCall().add(mCallAtStop );
					}
					
	    		}
	    		
	    		
	        });
		
			context.setPlaces(places );
			event.setTripInfoResponseContext(context );	
			event.setTripInfoResult(result);
		
			if(includeService) {
				DatedJourneyStructure js = new DatedJourneyStructure();
				
				OperatingDayRefStructure op = new OperatingDayRefStructure();
		
				op.setValue(simpleDateFormat.format(dateTmp));
				//op.setValue(graphIndex.tripForId.get(tts.tripId).getServiceId().toString());
				
				js.getContent().add(factory.createOperatingDayRef(op));
				
				JourneyRefStructure jr = new JourneyRefStructure();
				jr.setValue(tripId);
				
				js.getContent().add(factory.createJourneyRef(jr));
				
				LineRefStructure line = new LineRefStructure();
				Route route = trip.getRoute();
				line.setValue(
						route.getId().toString());
				
				js.getContent().add(factory.createDatedJourneyStructureLineRef(line));
				
				ModeStructure mode = new ModeStructure();
				mode.setPtMode(getTraverseMode(route));
				
				js.getContent().add(factory.createDatedJourneyStructureMode(mode));
				
				OperatorRefStructure operator = new OperatorRefStructure();
				
				operator.setValue(route.getAgency().getId().toString());
				
				js.getContent().add(factory.createOperatorRef(operator));
				
				StopPointRefStructure origin = new StopPointRefStructure();
				StopPointRefStructure destination = new StopPointRefStructure();
				origin.setValue(stoptimes.get(0).stopId.toString());
				destination.setValue(stoptimes.get(stoptimes.size()-1).stopId.toString());
				

				js.getContent().add(factory.createDatedJourneyStructureOriginStopPointRef(origin));
				js.getContent().add(factory.createDatedJourneyStructureDestinationStopPointRef(destination));
				
				String langDefault = graphIndex.agenciesForFeedId.get(route.getId().getAgencyId()).values().iterator().next().getLang();
				
				InternationalTextStructure lineName = new InternationalTextStructure();
				NaturalLanguageStringStructure valueLineLang = new NaturalLanguageStringStructure();
				
				valueLineLang.setLang(langDefault);
				valueLineLang.setValue(route.getLongName() != null ? route.getLongName() : route.getShortName());
				lineName.setText(valueLineLang);
				
				js.getContent().add(factory.createDatedJourneyStructurePublishedLineName(lineName));
				
				InternationalTextStructure originName = new InternationalTextStructure();
				NaturalLanguageStringStructure valueOriginLang = new NaturalLanguageStringStructure();
				
				valueOriginLang.setLang(langDefault);
				valueOriginLang.setValue(graphIndex.stopForId.get(stoptimes.get(0).stopId).getName());
				originName.setText(valueOriginLang);
				
				
				js.getContent().add(factory.createDatedJourneyStructureOriginText(originName));
				
				InternationalTextStructure destinationName = new InternationalTextStructure();
				NaturalLanguageStringStructure valueDestinationLang = new NaturalLanguageStringStructure();
				
				valueDestinationLang.setLang(langDefault);
				valueDestinationLang.setValue(graphIndex.stopForId.get(stoptimes.get(stoptimes.size()-1).stopId).getName());
				destinationName.setText(valueDestinationLang);
				
				js.getContent().add(factory.createDatedJourneyStructureDestinationText(destinationName));	
				
				
				result.setService(js);
			}
		
				
		
		long timeEnd = System.currentTimeMillis();
		event.setCalcTime(BigInteger.valueOf(timeEnd - timeStart));
		return event;
	}
	
}

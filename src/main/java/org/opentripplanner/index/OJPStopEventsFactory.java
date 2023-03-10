package org.opentripplanner.index;

import java.math.BigDecimal;
import java.math.BigInteger;
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

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import org.opentripplanner.index.model.StopTimesInPattern;
import org.opentripplanner.index.model.TripTimeShort;
import org.opentripplanner.model.Agency;
import org.opentripplanner.model.FeedScopedId;
import org.opentripplanner.model.Route;
import org.opentripplanner.model.Stop;
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
import de.vdv.ojp.OperatingDayRefStructure;
import de.vdv.ojp.PlaceStructure;
import de.vdv.ojp.StopEventResponseContextStructure;
import de.vdv.ojp.StopEventResultStructure;
import de.vdv.ojp.StopEventStructure;
import de.vdv.ojp.StopEventTypeEnumeration;
import de.vdv.ojp.StopPointStructure;

public class OJPStopEventsFactory {
	
	private final OJPStopEventRequestStructure request;
	private final GraphIndex graphIndex;
	private List<VehicleModesOfTransportEnumeration> filteredMode = new ArrayList<>();
	private List<String> filteredLines = new ArrayList<>();
	private List<String> filteredOperators = new ArrayList<>();
	
	private boolean includePreviousCalls = false;
	private boolean includeOnwardCalls = false;
	private boolean includeRealtime = false;		
	private boolean includeDays = false;
	private boolean excludeModeType = false;
	private boolean excludeLines = false;
	private boolean excludeOperators = false;
	long maxResults = Integer.MAX_VALUE;
	StopEventTypeEnumeration stopEventType = StopEventTypeEnumeration.BOTH;
	
	public OJPStopEventsFactory(GraphIndex graphIndex, OJPStopEventRequestStructure request) {
		this.graphIndex = graphIndex;
		this.request = request;
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

	public OJPStopEventDeliveryStructure create() {
		OJPStopEventDeliveryStructure event = new OJPStopEventDeliveryStructure();
		
		long timeStart = System.currentTimeMillis();
		
		String stopCode = null;
		filteredMode = new ArrayList<>();
		
		
		Duration duration = Duration.ofHours(24);
		LocalDateTime date = LocalDateTime.now();
		
		if(request.getLocation() != null && request.getLocation().getPlaceRef() != null) {
			if(request.getLocation().getPlaceRef().getStopPointRef() != null) {
				stopCode = request.getLocation().getPlaceRef().getStopPointRef().getValue();
			} else if(request.getLocation().getPlaceRef().getStopPlaceRef() != null) {
				stopCode = request.getLocation().getPlaceRef().getStopPlaceRef().getValue();
			}	
		}
		
		if(request.getLocation().getDepArrTime() != null) {
			date = request.getLocation().getDepArrTime();
		}
		
		if(request.getParams() != null) {
									
			if(request.getParams().getPtModeFilter() != null) {
				filteredMode = request.getParams().getPtModeFilter().getPtMode();
				excludeModeType = request.getParams().getPtModeFilter().isExclude() != null ? request.getParams().getPtModeFilter().isExclude() : false; 
			}
			
			if(request.getParams().getLineFilter() != null) {
				filteredLines = request.getParams().getLineFilter().getLine().stream().map(l -> l.getLineRef().getValue()).collect(Collectors.toList());
				excludeLines = request.getParams().getLineFilter().isExclude() != null ? request.getParams().getLineFilter().isExclude() : false;
			}
			
			if(request.getParams().getOperatorFilter() != null) {
				filteredOperators = request.getParams().getOperatorFilter().getOperatorRef().stream().map(o -> o.getValue()).collect(Collectors.toList());
				excludeOperators = request.getParams().getOperatorFilter().isExclude() != null ? request.getParams().getLineFilter().isExclude() : false;
			}
			
			
			if(request.getParams().isIncludePreviousCalls() != null) {
				includePreviousCalls = request.getParams().isIncludePreviousCalls();
			}
			
			if(request.getParams().isIncludeOnwardCalls() != null) {
				includeOnwardCalls = request.getParams().isIncludeOnwardCalls();
			}
			
			if(request.getParams().isIncludeRealtimeData() != null) {
				includeRealtime = request.getParams().isIncludeRealtimeData();
			}
			
			if(request.getParams().isIncludeOperatingDays() != null) {
				includeDays = request.getParams().isIncludeOperatingDays();
			}
			
			if(request.getParams().getStopEventType() != null) {
				stopEventType = request.getParams().getStopEventType();
			}
						
			if(request.getParams().getNumberOfResults() != null) {
				maxResults = request.getParams().getNumberOfResults().longValue();
			}
			
			if(request.getParams().getTimeWindow() != null) {
				duration = request.getParams().getTimeWindow();
			}
			
		}
		

		
		if(stopCode == null) {
			event.setStatus(false);
			ServiceDeliveryErrorConditionStructure error = new ServiceDeliveryErrorConditionStructure();
			ErrorDescriptionStructure descr = new ErrorDescriptionStructure();
			descr.setValue("No Location defined");
			event.setErrorCondition(error.withDescription(descr ));
			long timeEnd = System.currentTimeMillis();
			event.setCalcTime(BigInteger.valueOf(timeEnd - timeStart));
			return event;		
		}
			//search by id
		Stop stop = graphIndex.stopForId.get(FeedScopedId.convertFromString(stopCode));
		
		
		if(stop == null) {
			event.setStatus(false);
			ServiceDeliveryErrorConditionStructure error = new ServiceDeliveryErrorConditionStructure();
			ErrorDescriptionStructure descr = new ErrorDescriptionStructure();
			descr.setValue("No Location");
			event.setErrorCondition(error.withDescription(descr ));
			long timeEnd = System.currentTimeMillis();
			event.setCalcTime(BigInteger.valueOf(timeEnd - timeStart));
			return event;		
		}
	
		Agency agency = (Agency) graphIndex.agenciesForFeedId.get(stop.getId().getAgencyId()).values().toArray()[0]; //in the same feed the timezone must be the same for each agency.
		ZoneId zone = ZoneId.of(agency.getTimezone());
		ZoneOffset zoneOffSet = zone.getRules().getOffset(date);
		
		List<StopTimesInPattern> stoptimes = graphIndex.stopTimesForStop(stop, date.toEpochSecond(zoneOffSet), (int)duration.getSeconds(), (int)200000, false);
		
		stoptimes.stream()
	        .flatMap(stoptimesWithPattern -> stoptimesWithPattern.times.stream())
	        .filter(st -> {
	        	Route route = graphIndex.tripForId.get(st.tripId).getRoute();
	        	if(!filteredLines.isEmpty()) {
	        		if(excludeLines) {
	        			if(filteredLines.contains(route.getId().toString())) {
	        				return false;
	        			}
	        		}else {
	        			if(!filteredLines.contains(route.getId().toString())) {
	        				return false;
	        			}
	        				
	        		}
	        	}
	        	
	        	if(!filteredMode.isEmpty()) {
	        		if(excludeModeType) {
	        			if(filteredMode.contains(getTraverseMode(route))) {
	        				return false;
	        			}
	        		}else {
	        			if(!filteredMode.contains(getTraverseMode(route))) {
	        				return false;
	        			}
	        		}
	        	}
	        	
	        	if(!filteredOperators.isEmpty()) {
	        		if(excludeOperators) {
	        			if(filteredOperators.contains(route.getAgency().getId())) {
	        				return false;
	        			}
	        		}else {
	        			if(!filteredOperators.contains(route.getAgency().getId())) {
	        				return false;
	        			}
	        		}
	        	}
	        	
	        	return true;
	        })
	        .sorted(Comparator.comparing(t -> t.serviceDay + t.realtimeDeparture))
	        .limit(maxResults)
	        .collect(Collectors.toList());
		StopEventResponseContextStructure context = new StopEventResponseContextStructure();
		
		Places places = new Places();
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
		
		
		places.getLocation().add(p);
		context.setPlaces(places );
		for(StopTimesInPattern stoptime: stoptimes) {
			for(TripTimeShort tts : stoptime.times) {
				StopEventResultStructure stopEvent = new StopEventResultStructure();
				

				Date dateVal = new Date(tts.serviceDay * 1000);
				ServiceDate dateService = new ServiceDate(dateVal);
				List<TripTimeShort> allTripstopTimes = new ArrayList<>();
				allTripstopTimes = graphIndex.getStopTimesForTrip(graphIndex.tripForId.get(tts.tripId), dateService);
				stopEvent.setResultId(tts.tripId.toString() + ":" + stop.getId().toString());
				StopEventStructure s = new StopEventStructure();
				CallAtNearStopStructure c = new CallAtNearStopStructure();
				
				CallAtStopStructure callAtStop = new CallAtStopStructure();
				callAtStop.setOrder(BigInteger.valueOf(tts.stopSequence));
				callAtStop.setStopPointRef(new StopPointRefStructure().withValue(stop.getId().toString()));
				
				DatedJourneyStructure js = new DatedJourneyStructure();
				
				OperatingDayRefStructure op = new OperatingDayRefStructure();
				String pattern = "yyyy-MM-dd";
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

				op.setValue(simpleDateFormat.format(dateVal));
				//op.setValue(graphIndex.tripForId.get(tts.tripId).getServiceId().toString());
				
				JAXBElement<OperatingDayRefStructure> opElem = 
    					new JAXBElement<OperatingDayRefStructure>(
    							new QName("http://www.vdv.de/ojp","OperatingDayRef"), 
    							OperatingDayRefStructure.class, 
    							op
    							);
				js.getContent().add(opElem);
				
				JourneyRefStructure jr = new JourneyRefStructure();
				jr.setValue(tts.tripId.toString());
				
				JAXBElement<JourneyRefStructure> jrElem = 
    					new JAXBElement<JourneyRefStructure>(
    							new QName("http://www.vdv.de/ojp","JourneyRef"), 
    							JourneyRefStructure.class, 
    							jr
    							);
				js.getContent().add(jrElem);
				
				LineRefStructure line = new LineRefStructure();
				Route route = (graphIndex.tripForId.get(tts.tripId)).getRoute();
				line.setValue(
						route.getId().toString());
				
				JAXBElement<LineRefStructure> lineElem = 
    					new JAXBElement<LineRefStructure>(
    							new QName("http://www.vdv.de/ojp","LineRef"), 
    							LineRefStructure.class, 
    							line
    							);
				js.getContent().add(lineElem);
				
				ModeStructure mode = new ModeStructure();
				mode.setPtMode(getTraverseMode(route));
				
				JAXBElement<ModeStructure> modeElem = 
    					new JAXBElement<ModeStructure>(
    							new QName("http://www.vdv.de/ojp","Mode"), 
    							ModeStructure.class, 
    							mode
    							);
				js.getContent().add(modeElem);
				
				OperatorRefStructure operator = new OperatorRefStructure();
				
				operator.setValue(route.getAgency().getId().toString());
				
				JAXBElement<OperatorRefStructure> operatorElem = 
    					new JAXBElement<OperatorRefStructure>(
    							new QName("http://www.vdv.de/ojp","OperatorRef"), 
    							OperatorRefStructure.class, 
    							operator
    							);
				js.getContent().add(operatorElem);
				
				StopPointRefStructure origin = new StopPointRefStructure();
				StopPointRefStructure destination = new StopPointRefStructure();
				origin.setValue(allTripstopTimes.get(0).stopId.toString());
				destination.setValue(allTripstopTimes.get(allTripstopTimes.size()-1).stopId.toString());
				
				JAXBElement<StopPointRefStructure> originElem = 
    					new JAXBElement<StopPointRefStructure>(
    							new QName("http://www.vdv.de/ojp","OriginStopPointRef"), 
    							StopPointRefStructure.class, 
    							origin
    							);
				
				JAXBElement<StopPointRefStructure> destinationElem = 
    					new JAXBElement<StopPointRefStructure>(
    							new QName("http://www.vdv.de/ojp","DestinationStopPointRef"), 
    							StopPointRefStructure.class, 
    							destination
    							);
				js.getContent().add(originElem);
				js.getContent().add(destinationElem);
				
				String langDefault = graphIndex.agenciesForFeedId.get(route.getId().getAgencyId()).values().iterator().next().getLang();
				
				InternationalTextStructure lineName = new InternationalTextStructure();
				NaturalLanguageStringStructure valueLineLang = new NaturalLanguageStringStructure();
				
				valueLineLang.setLang(langDefault);
				valueLineLang.setValue(route.getLongName() != null ? route.getLongName() : route.getShortName());
				lineName.setText(valueLineLang);
				
				JAXBElement<InternationalTextStructure> lineNameElem = 
    					new JAXBElement<InternationalTextStructure>(
    							new QName("http://www.vdv.de/ojp","PublishedLineName"), 
    							InternationalTextStructure.class, 
    							lineName
    							);
				js.getContent().add(lineNameElem);
				
				InternationalTextStructure originName = new InternationalTextStructure();
				NaturalLanguageStringStructure valueOriginLang = new NaturalLanguageStringStructure();
				
				valueOriginLang.setLang(langDefault);
				valueOriginLang.setValue(graphIndex.stopForId.get(allTripstopTimes.get(0).stopId).getName());
				originName.setText(valueOriginLang);
				
				JAXBElement<InternationalTextStructure> originNameElem = 
    					new JAXBElement<InternationalTextStructure>(
    							new QName("http://www.vdv.de/ojp","OriginText"), 
    							InternationalTextStructure.class, 
    							originName
    							);
				js.getContent().add(originNameElem);
				
				InternationalTextStructure destinationName = new InternationalTextStructure();
				NaturalLanguageStringStructure valueDestinationLang = new NaturalLanguageStringStructure();
				
				valueDestinationLang.setLang(langDefault);
				valueDestinationLang.setValue(graphIndex.stopForId.get(allTripstopTimes.get(allTripstopTimes.size()-1).stopId).getName());
				destinationName.setText(valueDestinationLang);
				
				JAXBElement<InternationalTextStructure> destinationNameElem = 
    					new JAXBElement<InternationalTextStructure>(
    							new QName("http://www.vdv.de/ojp","DestinationText"), 
    							InternationalTextStructure.class, 
    							destinationName
    							);
				js.getContent().add(destinationNameElem);	
				
				
				s.setService(js);
				
				InternationalTextStructure itS = new InternationalTextStructure();
				NaturalLanguageStringStructure nLS = new NaturalLanguageStringStructure();
				String langS = graphIndex.agenciesForFeedId.get(stop.getId().getAgencyId()).values().iterator().next().getLang();
				nLS.setLang(langS);
				nLS.setValue(stop.getName());
				itS.setText(nLS);
				
				callAtStop.setStopPointName(it);
				
				if(stopEventType.equals(StopEventTypeEnumeration.BOTH) || stopEventType.equals(StopEventTypeEnumeration.ARRIVAL)) {
					ServiceArrival arrival = new ServiceArrival();
					if(includeRealtime) {
						arrival.setTimetabledTime(LocalDateTime.ofEpochSecond(tts.serviceDay + tts.realtimeArrival, 0, zoneOffSet));
					}
					
					arrival.setTimetabledTime(LocalDateTime.ofEpochSecond(tts.serviceDay + tts.scheduledArrival, 0, zoneOffSet));
					
					
					callAtStop.setServiceArrival(arrival);
				}
				
				if(stopEventType.equals(StopEventTypeEnumeration.BOTH) || stopEventType.equals(StopEventTypeEnumeration.DEPARTURE)) {
					ServiceDeparture departure = new ServiceDeparture();
					if(includeRealtime) {
						departure.setEstimatedTime(LocalDateTime.ofEpochSecond(tts.serviceDay + tts.realtimeDeparture, 0, zoneOffSet));
					}
					
					departure.setTimetabledTime(LocalDateTime.ofEpochSecond(tts.serviceDay + tts.scheduledDeparture, 0, zoneOffSet));
									
					
					callAtStop.setServiceDeparture(departure);
					
				}
				
				
				
				
				c.setCallAtStop(callAtStop);
				s.setThisCall(c);
				
				if(includeOnwardCalls) {
					
					allTripstopTimes.stream().filter(st -> st.stopSequence > tts.stopSequence).forEach(st -> {
						CallAtNearStopStructure mCall = new CallAtNearStopStructure();
						CallAtStopStructure mCallAtStop = new CallAtStopStructure();
						
						Stop stopTmp = graphIndex.stopForId.get(st.stopId);
						
						PlaceStructure pTmp = new PlaceStructure();
						StopPointStructure spTmp = new StopPointStructure();
						
						InternationalTextStructure itTmp = new InternationalTextStructure();
						NaturalLanguageStringStructure nLTmp = new NaturalLanguageStringStructure();
						String langTmp = graphIndex.agenciesForFeedId.get(stopTmp.getId().getAgencyId()).values().iterator().next().getLang();
						nLTmp.setLang(langTmp);
						nLTmp.setValue(stopTmp.getName());
						itTmp.setText(nLTmp);
						
						
						spTmp.setStopPointName(itTmp);
						spTmp.setWheelchairAccessible(stopTmp.getWheelchairBoarding() == 1);
						LocationStructure geoTmp = new LocationStructure();
						geoTmp.setLatitude(BigDecimal.valueOf(stopTmp.getLat()));
						geoTmp.setLongitude(BigDecimal.valueOf(stopTmp.getLon()));
						pTmp.setGeoPosition(geoTmp);
						StopPointRefStructure sRefTmp = new StopPointRefStructure();
						sRefTmp.setValue(stopTmp.getId().toString());
						spTmp.setStopPointRef(sRefTmp );
						pTmp.setStopPoint(spTmp);
						pTmp.setLocationName(itTmp);
						
						boolean found = false;
						for(PlaceStructure singlePlace : places.getLocation()) {
							if(singlePlace.getStopPoint().getStopPointRef().getValue().equals(pTmp.getStopPoint().getStopPointRef().getValue())) {
								found = true;
								break;
							}
						}
						if(!found)
							places.getLocation().add(pTmp);
						
						
						mCallAtStop.setOrder(BigInteger.valueOf(st.stopSequence));
						mCallAtStop.setStopPointRef(new StopPointRefStructure().withValue(stopTmp.getId().toString()));
						
												
						mCallAtStop.setStopPointName(itTmp);
						
						if(stopEventType.equals(StopEventTypeEnumeration.BOTH) || stopEventType.equals(StopEventTypeEnumeration.ARRIVAL)) {
							ServiceArrival arrival = new ServiceArrival();
							if(includeRealtime) {
								arrival.setTimetabledTime(LocalDateTime.ofEpochSecond(st.serviceDay + st.realtimeArrival, 0, zoneOffSet));
							}
							
							arrival.setTimetabledTime(LocalDateTime.ofEpochSecond(st.serviceDay + st.scheduledArrival, 0, zoneOffSet));
							
							
							mCallAtStop.setServiceArrival(arrival);
						}
						
						if(stopEventType.equals(StopEventTypeEnumeration.BOTH) || stopEventType.equals(StopEventTypeEnumeration.DEPARTURE)) {
							ServiceDeparture departure = new ServiceDeparture();
							if(includeRealtime) {
								departure.setEstimatedTime(LocalDateTime.ofEpochSecond(st.serviceDay + st.realtimeDeparture, 0, zoneOffSet));
							}
							
							departure.setTimetabledTime(LocalDateTime.ofEpochSecond(st.serviceDay + st.scheduledDeparture, 0, zoneOffSet));
											
							
							mCallAtStop.setServiceDeparture(departure);
							
						}
																		
						mCall.setCallAtStop(mCallAtStop );
						s.getOnwardCall().add(mCall );
					});
				}
				
				if(includePreviousCalls) {
					allTripstopTimes.stream().filter(st -> st.stopSequence < tts.stopSequence).forEach(st -> {
						CallAtNearStopStructure mCall = new CallAtNearStopStructure();
						CallAtStopStructure mCallAtStop = new CallAtStopStructure();
						
						Stop stopTmp = graphIndex.stopForId.get(st.stopId);
						
						PlaceStructure pTmp = new PlaceStructure();
						StopPointStructure spTmp = new StopPointStructure();
						
						InternationalTextStructure itTmp = new InternationalTextStructure();
						NaturalLanguageStringStructure nLTmp = new NaturalLanguageStringStructure();
						String langTmp = graphIndex.agenciesForFeedId.get(stopTmp.getId().getAgencyId()).values().iterator().next().getLang();
						nLTmp.setLang(langTmp);
						nLTmp.setValue(stopTmp.getName());
						itTmp.setText(nLTmp);
						
						
						spTmp.setStopPointName(itTmp);
						spTmp.setWheelchairAccessible(stopTmp.getWheelchairBoarding() == 1);
						LocationStructure geoTmp = new LocationStructure();
						geoTmp.setLatitude(BigDecimal.valueOf(stopTmp.getLat()));
						geoTmp.setLongitude(BigDecimal.valueOf(stopTmp.getLon()));
						pTmp.setGeoPosition(geoTmp);
						StopPointRefStructure sRefTmp = new StopPointRefStructure();
						sRefTmp.setValue(stopTmp.getId().toString());
						spTmp.setStopPointRef(sRefTmp );
						pTmp.setStopPoint(spTmp);
						pTmp.setLocationName(itTmp);
						
						boolean found = false;
						for(PlaceStructure singlePlace : places.getLocation()) {
							if(singlePlace.getStopPoint().getStopPointRef().getValue().equals(pTmp.getStopPoint().getStopPointRef().getValue())) {
								found = true;
								break;
							}
						}
						if(!found)
							places.getLocation().add(pTmp);
						
						
						mCallAtStop.setOrder(BigInteger.valueOf(st.stopSequence));
						mCallAtStop.setStopPointRef(new StopPointRefStructure().withValue(stopTmp.getId().toString()));
						
												
						mCallAtStop.setStopPointName(itTmp);
						
						if(stopEventType.equals(StopEventTypeEnumeration.BOTH) || stopEventType.equals(StopEventTypeEnumeration.ARRIVAL)) {
							ServiceArrival arrival = new ServiceArrival();
							if(includeRealtime) {
								arrival.setTimetabledTime(LocalDateTime.ofEpochSecond(st.serviceDay + st.realtimeArrival, 0, zoneOffSet));
							}
							
							arrival.setTimetabledTime(LocalDateTime.ofEpochSecond(st.serviceDay + st.scheduledArrival, 0, zoneOffSet));
							
							
							mCallAtStop.setServiceArrival(arrival);
						}
						
						if(stopEventType.equals(StopEventTypeEnumeration.BOTH) || stopEventType.equals(StopEventTypeEnumeration.DEPARTURE)) {
							ServiceDeparture departure = new ServiceDeparture();
							if(includeRealtime) {
								departure.setEstimatedTime(LocalDateTime.ofEpochSecond(st.serviceDay + st.realtimeDeparture, 0, zoneOffSet));
							}
							
							departure.setTimetabledTime(LocalDateTime.ofEpochSecond(st.serviceDay + st.scheduledDeparture, 0, zoneOffSet));
											
							
							mCallAtStop.setServiceDeparture(departure);
							
						}
						
						
						
												
						mCall.setCallAtStop(mCallAtStop );
						s.getPreviousCall().add(mCall );
					});
				}
				
				stopEvent.setStopEvent(s);
				
				event.getStopEventResult().add(stopEvent);
			}
				
		}
		
	
		
		event.setStopEventResponseContext(context);
		
		long timeEnd = System.currentTimeMillis();
		event.setCalcTime(BigInteger.valueOf(timeEnd - timeStart));
		return event;
	}
	
}

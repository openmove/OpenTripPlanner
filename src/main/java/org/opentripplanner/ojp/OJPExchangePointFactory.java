package org.opentripplanner.ojp;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.Envelope;
import org.onebusaway.gtfs.model.Location;
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

import de.vdv.ojp.ExchangePointsResultStructure;
import de.vdv.ojp.InternationalTextStructure;
import de.vdv.ojp.ModeStructure;
import de.vdv.ojp.OJPExchangePointsDeliveryStructure;
import de.vdv.ojp.OJPExchangePointsRequestStructure;
import de.vdv.ojp.OJPLocationInformationDeliveryStructure;
import de.vdv.ojp.OJPLocationInformationRequestStructure;
import de.vdv.ojp.ObjectFactory;
import de.vdv.ojp.PlaceResultStructure;
import de.vdv.ojp.PlaceStructure;
import de.vdv.ojp.PlaceTypeEnumeration;
import de.vdv.ojp.StopPlaceRefStructure;
import de.vdv.ojp.StopPlaceStructure;
import de.vdv.ojp.StopPointStructure;

public class OJPExchangePointFactory {
	
	private final OJPExchangePointsRequestStructure exchangePointsRequest;
	private final GraphIndex graphIndex;
	private List<VehicleModesOfTransportEnumeration> modeList = new ArrayList<>();
	private List<String> requestModes = new ArrayList<>();
	private ObjectFactory factory;
	
	List<String> allOTPModes = Arrays.asList("TRAM","SUBWAY","RAIL","BUS","FERRY","GONDOLA","FUNICULAR");
	
	public OJPExchangePointFactory(GraphIndex graphIndex, OJPExchangePointsRequestStructure exchangePointsRequest, ObjectFactory factory) {
		this.graphIndex = graphIndex;
		this.exchangePointsRequest = exchangePointsRequest;
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
    
    
	
	public OJPExchangePointsDeliveryStructure create() {
		OJPExchangePointsDeliveryStructure location = new OJPExchangePointsDeliveryStructure();
		
		long timeStart = System.currentTimeMillis();
		
		String stopCode = null;
		
		int continueAt = 0;
		boolean includePtModes = false;
		long maxResults = Integer.MAX_VALUE;
		
		if(exchangePointsRequest.getPlaceRef() != null) {
			if(exchangePointsRequest.getPlaceRef().getStopPointRef() != null) {
				stopCode = exchangePointsRequest.getPlaceRef().getStopPointRef().getValue();
			} else if(exchangePointsRequest.getPlaceRef().getStopPlaceRef() != null) {
				stopCode = exchangePointsRequest.getPlaceRef().getStopPlaceRef().getValue();
			}	
		}
		
		

		if(exchangePointsRequest.getParams() != null) {
						
			
			if(exchangePointsRequest.getParams().getContinueAt()!=null) {
				continueAt = exchangePointsRequest.getParams().getContinueAt().intValue();
			}
			
			if(exchangePointsRequest.getParams().getNumberOfResults() != null) {
				maxResults = exchangePointsRequest.getParams().getNumberOfResults().longValue();
			}
			
			if(exchangePointsRequest.getParams().getPtModes() != null) {
				modeList = exchangePointsRequest.getParams().getPtModes().getPtMode();
				boolean excludeModes = exchangePointsRequest.getParams().getPtModes().isExclude();
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
			
			
			
		}
		
		List<Stop> tmpStops = new ArrayList<>();
		
		if(stopCode != null) {
			//search by id
			Stop stop = graphIndex.stopForId.get(FeedScopedId.convertFromString(stopCode));
			if(stop != null && stop.getLocationType() == 1) {
				tmpStops.add(stop);
			}
			
		}else {
			tmpStops = graphIndex.stopForId.values().stream()
					.filter(s -> s.getLocationType() == 1)
					.collect(Collectors.toList());
		}
		
				
		List<Stop> stops = tmpStops.stream().filter(mStop -> {
			//filter by modes
			if(!requestModes.isEmpty()) {
				Set<Route> routes = graphIndex.routesForStop(mStop);

				List<VehicleModesOfTransportEnumeration> types = getTraverseModes(routes);
						
				if(Collections.disjoint(requestModes, types)) { //at list one mode must be in common
					return false;
				}
			}
						
			return true;
		}).skip(continueAt).limit(maxResults).collect(Collectors.toList());
		
		BigInteger mContinueAt = BigInteger.valueOf(continueAt + stops.size());
		
		if(stops.isEmpty()) {
			location.setStatus(false);
			ServiceDeliveryErrorConditionStructure error = new ServiceDeliveryErrorConditionStructure();
			ErrorDescriptionStructure descr = new ErrorDescriptionStructure();
			descr.setValue("No Exchange Point");
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
		
		
		
		
		for(Stop stop : stops) {
			PlaceStructure p = new PlaceStructure();
			StopPlaceStructure sp = new StopPlaceStructure();
			InternationalTextStructure it = new InternationalTextStructure();
			NaturalLanguageStringStructure nL = new NaturalLanguageStringStructure();
			String lang = graphIndex.agenciesForFeedId.get(stop.getId().getAgencyId()).values().iterator().next().getLang();
			nL.setLang(lang);
			nL.setValue(stop.getName());
			it.setText(nL);
			sp.setStopPlaceName(it);
			sp.setWheelchairAccessible(stop.getWheelchairBoarding() == 1);
			LocationStructure geo = new LocationStructure();
			geo.setLatitude(BigDecimal.valueOf(stop.getLat()));
			geo.setLongitude(BigDecimal.valueOf(stop.getLon()));
			p.setGeoPosition(geo);
			StopPlaceRefStructure sRef = new StopPlaceRefStructure();
			sRef.setValue(stop.getCode());
			sp.setStopPlaceRef(sRef );
			
			p.setStopPlace(sp);
			p.setLocationName(it);
			
			
			ExchangePointsResultStructure exchangePoint = new ExchangePointsResultStructure();
			exchangePoint.setPlace(p);
			
			Set<Route> routes = graphIndex.routesForStop(stop);
			
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
				exchangePoint.getMode().add(m);
			});
			
			location.getPlace().add(exchangePoint );
		}
		long timeEnd = System.currentTimeMillis();
		location.setCalcTime(BigInteger.valueOf(timeEnd - timeStart));
		return location;
	}
	
}

package org.opentripplanner.index;

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.opentripplanner.common.LuceneIndex;
import org.opentripplanner.model.Route;
import org.opentripplanner.routing.graph.GraphIndex;
import org.opentripplanner.routing.graph.GraphIndex.StopAndDistance;
import org.opentripplanner.standalone.OTPServer;
import org.opentripplanner.standalone.Router;
import org.rutebanken.netex.model.DayType;

import com.bliksemlabs.ojp.model.BusSubmodesOfTransportEnumeration;
import com.bliksemlabs.ojp.model.FunicularSubmodesOfTransportEnumeration;
import com.bliksemlabs.ojp.model.LocationStructure;
import com.bliksemlabs.ojp.model.MetroSubmodesOfTransportEnumeration;
import com.bliksemlabs.ojp.model.NaturalLanguageStringStructure;
import com.bliksemlabs.ojp.model.OJP;
import com.bliksemlabs.ojp.model.OJPResponseStructure;
import com.bliksemlabs.ojp.model.ParticipantRefStructure;
import com.bliksemlabs.ojp.model.RailSubmodesOfTransportEnumeration;
import com.bliksemlabs.ojp.model.ServiceDelivery;
import com.bliksemlabs.ojp.model.StopPointRefStructure;
import com.bliksemlabs.ojp.model.TelecabinSubmodesOfTransportEnumeration;
import com.bliksemlabs.ojp.model.TramSubmodesOfTransportEnumeration;
import com.bliksemlabs.ojp.model.VehicleModesOfTransportEnumeration;
import com.bliksemlabs.ojp.model.WaterSubmodesOfTransportEnumeration;
import com.google.common.collect.Sets;

import de.vdv.ojp.InternationalTextStructure;
import de.vdv.ojp.ModeStructure;
import de.vdv.ojp.OJPLocationInformationDeliveryStructure;
import de.vdv.ojp.PlaceResultStructure;
import de.vdv.ojp.PlaceStructure;
import de.vdv.ojp.StopPlaceStructure;
import de.vdv.ojp.StopPointStructure;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

/**
 * OTP simple built-in OJP API module.
 */
@Path("/routers/{routerId}/ojp")
@Produces(MediaType.APPLICATION_XML)
public class OJPResource {

    private final GraphIndex graphIndex;

    public OJPResource (@Context OTPServer otpServer, @PathParam("routerId") String routerId) {
        Router router = otpServer.getRouter(routerId);
        graphIndex = router.graph.index;
    }

    /**
     * OJP using OTP graph
     *
     * @return OJP response
     */
    @POST
    @Consumes(MediaType.APPLICATION_XML)
    public Response ojpExec (OJP request) {
    	
    	OJP ojp = new OJP();
    	OJPResponseStructure v = new OJPResponseStructure();
    	ServiceDelivery s = new ServiceDelivery();
    	
    	ParticipantRefStructure producer = new ParticipantRefStructure();
    	producer.setValue("OpenMove");
		s.setProducerRef(producer );
		
		List<StopAndDistance> stops = graphIndex.findClosestStopsFlyCrow(44.827360,8.454970, 200);
	
		
		OJPLocationInformationDeliveryStructure location = new OJPLocationInformationDeliveryStructure();
		
		location.setStatus(true);
		
		float sumDistances = 0;
		
		for(StopAndDistance stop : stops) {
			 float mDistance = stop.distance;
			 if(mDistance == 0) {
				 mDistance = (float) 0.001;
			 }
			 sumDistances += (float) (1 / mDistance);
		}
		
		
		for(StopAndDistance stop : stops) {
			PlaceResultStructure place = new PlaceResultStructure();
			PlaceStructure p = new PlaceStructure();
			StopPointStructure sp = new StopPointStructure();
			InternationalTextStructure it = new InternationalTextStructure();
			NaturalLanguageStringStructure nL = new NaturalLanguageStringStructure();
			nL.setLang("it");
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
			
			
			Set<Route> routes = graphIndex.routesForStop(stop.stop);
			
			List<Integer> types = new ArrayList<Integer>();
			
			for(Route r : routes) {
					if(!types.contains(r.getType())){
						types.add(r.getType());
					}
			
			}
			
			for(Integer type : types) {
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
			}
			
			
			place.setComplete(true);
			//   1/distance / sum(1/distance)
			
			float mDistance = stop.distance;
			 if(mDistance == 0) { // cannot be 0
				 mDistance = (float) 0.001;
			 }
			
			place.setProbability((float)((double)((float) ((1/mDistance) / sumDistances) * 100)));
					
			location.getLocation().add(place);
		}
		
		
		JAXBElement<OJPLocationInformationDeliveryStructure> locationElem = 
				new JAXBElement<OJPLocationInformationDeliveryStructure>(
						new QName("http://www.vdv.de/ojp","OJPLocationInformationDelivery"), 
						OJPLocationInformationDeliveryStructure.class, 
						location
						);
   	 
		
		s.getAbstractFunctionalServiceDelivery().add(locationElem);

		s.setResponseTimestamp(request.getOJPRequest().getServiceRequest().getRequestTimestamp());
		s.setStatus(true);
    	v.setServiceDelivery(s);
    	
    	ojp.setOJPResponse(v);
    	
        return Response.status(Response.Status.OK).entity(ojp).build();
    }

}

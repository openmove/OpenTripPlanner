package org.opentripplanner.index;

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.opentripplanner.common.LuceneIndex;
import org.opentripplanner.model.Route;
import org.opentripplanner.routing.graph.GraphIndex;
import org.opentripplanner.routing.graph.GraphIndex.StopAndDistance;
import org.opentripplanner.standalone.OTPServer;
import org.opentripplanner.standalone.Router;
import org.rutebanken.netex.model.DayType;

import com.bliksemlabs.ojp.model.AbstractFunctionalServiceRequestStructure;
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
import com.bliksemlabs.ojp.model.ServiceDeliveryErrorConditionStructure;
import com.bliksemlabs.ojp.model.StopPointRefStructure;
import com.bliksemlabs.ojp.model.TelecabinSubmodesOfTransportEnumeration;
import com.bliksemlabs.ojp.model.TramSubmodesOfTransportEnumeration;
import com.bliksemlabs.ojp.model.VehicleModesOfTransportEnumeration;
import com.bliksemlabs.ojp.model.WaterSubmodesOfTransportEnumeration;
import com.google.common.collect.Sets;

import de.vdv.ojp.InternationalTextStructure;
import de.vdv.ojp.ModeStructure;
import de.vdv.ojp.OJPLocationInformationDeliveryStructure;
import de.vdv.ojp.OJPLocationInformationRequestStructure;
import de.vdv.ojp.OJPMultiPointTripRequestStructure;
import de.vdv.ojp.OJPStopEventRequestStructure;
import de.vdv.ojp.OJPTripInfoRequestStructure;
import de.vdv.ojp.OJPTripRequestStructure;
import de.vdv.ojp.PlaceResultStructure;
import de.vdv.ojp.PlaceStructure;
import de.vdv.ojp.PlaceTypeEnumeration;
import de.vdv.ojp.PtModeFilterStructure;
import de.vdv.ojp.StopPlaceStructure;
import de.vdv.ojp.StopPointStructure;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

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
    	
    	List<JAXBElement<? extends AbstractFunctionalServiceRequestStructure>> list = request.getOJPRequest().getServiceRequest().getAbstractFunctionalServiceRequest();
    	
    	OJP ojp = new OJP();
    	OJPResponseStructure v = new OJPResponseStructure();
    	ServiceDelivery s = new ServiceDelivery();
    	
    	ParticipantRefStructure producer = new ParticipantRefStructure();
    	producer.setValue("OpenMove");
		s.setProducerRef(producer );
    	
    	for(JAXBElement<? extends AbstractFunctionalServiceRequestStructure> elem : list) {
    		if(elem.getDeclaredType().equals(OJPLocationInformationRequestStructure.class)) {
    			//Prepare OJPLocationInformationDeliveryStructure
    			
    			OJPLocationInformationRequestStructure informationRequest = (OJPLocationInformationRequestStructure) elem.getValue();
    			OJPLocationDeliveryFactory locationDeliveryFactory = new OJPLocationDeliveryFactory(graphIndex, informationRequest);
   			
    			OJPLocationInformationDeliveryStructure location = locationDeliveryFactory.create();
    			JAXBElement<OJPLocationInformationDeliveryStructure> locationElem = 
    					new JAXBElement<OJPLocationInformationDeliveryStructure>(
    							new QName("http://www.vdv.de/ojp","OJPLocationInformationDelivery"), 
    							OJPLocationInformationDeliveryStructure.class, 
    							location
    							);
    	   	 
    			
    			s.getAbstractFunctionalServiceDelivery().add(locationElem);
    			
    			
    		}
    		
    		if(elem.getDeclaredType().equals(OJPStopEventRequestStructure.class)) {
    			
    		}
    		
    		if(elem.getDeclaredType().equals(OJPTripInfoRequestStructure.class)) {
    			
    		}
    		
    		if(elem.getDeclaredType().equals(OJPTripRequestStructure.class)) {
    			
    		}
    		
    		if(elem.getDeclaredType().equals(OJPMultiPointTripRequestStructure.class)) {
    			
    		}
    	}
    	
  
    	ZonedDateTime responseTimestamp = ZonedDateTime.now();
    	s.setResponseTimestamp(responseTimestamp.toLocalDateTime());
		s.setStatus(true);
    	v.setServiceDelivery(s);
    	
    	ojp.setOJPResponse(v);
    	
        return Response.status(Response.Status.OK).entity(ojp).build();
    }

}

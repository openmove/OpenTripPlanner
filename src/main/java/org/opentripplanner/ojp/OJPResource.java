package org.opentripplanner.ojp;

import org.opentripplanner.routing.graph.GraphIndex;
import org.opentripplanner.standalone.OTPServer;
import org.opentripplanner.standalone.Router;
import com.bliksemlabs.ojp.model.AbstractFunctionalServiceRequestStructure;
import com.bliksemlabs.ojp.model.OJP;
import com.bliksemlabs.ojp.model.OJPResponseStructure;
import com.bliksemlabs.ojp.model.ParticipantRefStructure;
import com.bliksemlabs.ojp.model.ServiceDelivery;

import de.vdv.ojp.OJPLocationInformationDeliveryStructure;
import de.vdv.ojp.OJPLocationInformationRequestStructure;
import de.vdv.ojp.OJPMultiPointTripRequestStructure;
import de.vdv.ojp.OJPStopEventDeliveryStructure;
import de.vdv.ojp.OJPStopEventRequestStructure;
import de.vdv.ojp.OJPTripDeliveryStructure;
import de.vdv.ojp.OJPTripInfoDeliveryStructure;
import de.vdv.ojp.OJPTripInfoRequestStructure;
import de.vdv.ojp.OJPTripRequestStructure;

import java.time.ZonedDateTime;
import java.util.List;

import javax.ws.rs.Consumes;
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
    			OJPStopEventRequestStructure stopEventRequest = (OJPStopEventRequestStructure) elem.getValue();
    			OJPStopEventsFactory eventDeliveryFactory = new OJPStopEventsFactory(graphIndex,stopEventRequest);
    			OJPStopEventDeliveryStructure event = eventDeliveryFactory.create();
    			
    			JAXBElement<OJPStopEventDeliveryStructure> eventElem = 
    					new JAXBElement<OJPStopEventDeliveryStructure>(
    							new QName("http://www.vdv.de/ojp","OJPStopEventDelivery"), 
    							OJPStopEventDeliveryStructure.class, 
    							event
    							);
				s.getAbstractFunctionalServiceDelivery().add(eventElem);
    		}
    		
    		if(elem.getDeclaredType().equals(OJPTripInfoRequestStructure.class)) {
    			OJPTripInfoRequestStructure tripInfoRequest = (OJPTripInfoRequestStructure) elem.getValue();
    			OJPTripInfoFactory tripInfoFactory = new OJPTripInfoFactory(graphIndex,tripInfoRequest);
    			OJPTripInfoDeliveryStructure tripInfo = tripInfoFactory.create();
    			JAXBElement<OJPTripInfoDeliveryStructure> eventElem = 
    					new JAXBElement<OJPTripInfoDeliveryStructure>(
    							new QName("http://www.vdv.de/ojp","OJPTripInfoDelivery"), 
    							OJPTripInfoDeliveryStructure.class, 
    							tripInfo
    							);
				s.getAbstractFunctionalServiceDelivery().add(eventElem);
    		}
    		
    		if(elem.getDeclaredType().equals(OJPTripRequestStructure.class)) {
    			OJPTripRequestStructure tripRequest = (OJPTripRequestStructure) elem.getValue();
    			
    			OJPTripFactory tripFactory = new OJPTripFactory(graphIndex,tripRequest);
    			OJPTripDeliveryStructure trip = tripFactory.create();
    			JAXBElement<OJPTripDeliveryStructure> tripElem = 
    					new JAXBElement<OJPTripDeliveryStructure>(
    							new QName("http://www.vdv.de/ojp","OJPTripDelivery"), 
    							OJPTripDeliveryStructure.class, 
    							trip
    							);
    			
    			s.getAbstractFunctionalServiceDelivery().add(tripElem);
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

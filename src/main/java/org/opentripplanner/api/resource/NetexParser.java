package org.opentripplanner.api.resource;

import org.opentripplanner.standalone.OTPServer;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.events.XMLEvent;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;
import javax.xml.namespace.QName;
import java.io.FileInputStream;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import java.io.StringWriter;

import java.io.File;

@Path("/routers/{routerId}/netex/{feedId}/")
public class NetexParser {

    @Context
    OTPServer otpServer;
    

    @GET
    @Produces({ MediaType.APPLICATION_XML })
    public Response queryNetexXML(
    		@QueryParam("tag") String tag,
            @QueryParam("id") String id,
    		@PathParam("routerId") String routerId,
    		@PathParam("feedId") String feedId
    	) {

        try {

        if(tag == null || id == null) {
        	return null;
        }
        	
        String filePath = otpServer.params.graphDirectory + File.separator + routerId + File.separator + feedId + ".netex.xml";
               
        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        XMLEventReader xmlEventReader = xmlInputFactory.createXMLEventReader(new FileInputStream(filePath));
        XMLOutputFactory xmlOutputFactory = XMLOutputFactory.newInstance();
        StringWriter stringWriter = new StringWriter();
        XMLEventWriter xmlEventWriter = xmlOutputFactory.createXMLEventWriter(stringWriter);
        
        boolean insideTargetElement = false;
        int depth = 0;

        while (xmlEventReader.hasNext()) {
            XMLEvent xmlEvent = xmlEventReader.nextEvent();

            
            
            if (!insideTargetElement && xmlEvent.isStartElement()) {
                StartElement startElement = xmlEvent.asStartElement();
                if (startElement.getName().getLocalPart().equals(tag)) {
                	Attribute attribute = startElement.getAttributeByName(new QName("id"));
	                  if (attribute != null && attribute.getValue().equals(id)) {
	                	  insideTargetElement = true;
	                      depth = 1;
	                      xmlEventWriter.add(xmlEvent); // Start writing when the target element is found
	                      continue;
	                  }                    
                }
            }

            if (insideTargetElement) {
                xmlEventWriter.add(xmlEvent);
                if (xmlEvent.isStartElement()) {
                    depth++;
                } else if (xmlEvent.isEndElement()) {
                    depth--;
                    if (depth == 0) {
                        insideTargetElement = false; // Stop writing when the target element ends
                        xmlEventWriter.flush();
                        break;
                    }
                }
            }
        }

        xmlEventWriter.close();
        //return stringWriter.toString();
        return Response.status(Status.OK).entity(stringWriter.toString()).build();
        }catch(Exception e) {
        	e.printStackTrace();
        	return Response.status(Status.NOT_FOUND).build();
        }
        
    }
}
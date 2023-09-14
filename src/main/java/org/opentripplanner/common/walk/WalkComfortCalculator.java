package org.opentripplanner.common.walk;

import com.fasterxml.jackson.databind.JsonNode;

import org.geotools.geometry.jts.JTS;
import org.geotools.referencing.CRS;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.Geometry;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.LineString;
import org.opengis.referencing.crs.CoordinateReferenceSystem;
import org.opengis.referencing.operation.MathTransform;
import org.opentripplanner.common.geometry.GeometryUtils;
import org.opentripplanner.openstreetmap.model.OSMWithTags;
import org.opentripplanner.routing.edgetype.StreetEdge;
import org.opentripplanner.util.I18NString;
import org.opentripplanner.util.NonLocalizedString;
import org.opentripplanner.util.PolylineEncoder;
import org.opentripplanner.util.model.EncodedPolylineBean;
import org.opentripplanner.util.xml.XmlDataListDownloader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.InputSource;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;

/**
 * Created by demory on 11/20/17.
 */

public class WalkComfortCalculator {
    private static Logger LOG = LoggerFactory.getLogger(WalkComfortCalculator.class);

    public static final String WALK_CONFIG_FILENAME = "walk-config.json";
    private List<WalkComfortRule> rules = new ArrayList<>();
    private List<WalkComfortStreet> streets = new ArrayList<>();
    

    public WalkComfortCalculator(JsonNode walkConfig) {

        if (walkConfig == null 
        		|| (!walkConfig.has("rules") && !walkConfig.has("streets"))
        	) {
            LOG.info("Rules and/or streets have to be defined as arrays in walk config");
            return;
        }

        if(walkConfig.has("rules") && walkConfig.get("rules").isArray()) {
	        Iterator<JsonNode> ruleIter = walkConfig.get("rules").elements();
	        while(ruleIter.hasNext()) {
	            JsonNode ruleNode = ruleIter.next();
	            rules.add(new WalkComfortRule(ruleNode));
	        }
        }
               
        
        if(walkConfig.has("streets") && walkConfig.get("streets").isArray()) {
        	Iterator<JsonNode> streetIter = walkConfig.get("streets").elements();
            while(streetIter.hasNext()) {
                JsonNode streetNode = streetIter.next();
                GeometryFactory geometryFactory = new GeometryFactory();
                if(streetNode.has("url")) {
                		XmlDataListDownloader<HikePath> xmlDownloader;
                		xmlDownloader = new XmlDataListDownloader<HikePath>();
                		xmlDownloader.setRawAttributes(true);
                		xmlDownloader
                        .setPath("//*[local-name()='kml']/*[local-name()='Document']/*[local-name()='Placemark']|//*[local-name()='kml']/*[local-name()='Document']/*[local-name()='Folder']/*[local-name()='Placemark']");
            		    xmlDownloader.setDataFactory(new XmlDataListDownloader.XmlDataFactory<HikePath>() {
            		        @Override
            		        public HikePath build(Map<String, String> attributes) {
            		        	
            		        	
            		        	HikePath hikePath = new HikePath();
            		            if (!attributes.containsKey("name")) {
            		                LOG.warn("Missing name in KML Placemark, cannot create path.");
            		                return null;
            		            }
            		            if (!attributes.containsKey("LineString")) {
            		                LOG.warn("Missing LineString geometry in KML Placemark, cannot create path.");
            		                return null;
            		            }
            		            
            		            
            		            try {
            		            	DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
                	                DocumentBuilder db = dbf.newDocumentBuilder();
                	                XPathFactory xpathFactory = XPathFactory.newInstance();
                	                XPath xpath = xpathFactory.newXPath();
            		            	
            		            	InputSource sourceExtData = new InputSource(new StringReader(attributes.get("ExtendedData")));
            		            	InputSource sourceName = new InputSource(new StringReader(attributes.get("name")));
            		            	InputSource sourceDescription = new InputSource(new StringReader(attributes.get("description")));
            		            	InputSource sourceLinestring = new InputSource(new StringReader(attributes.get("LineString")));
                		            
            		            	
            		            	
                	                org.w3c.dom.Document documentExt = db.parse(sourceExtData);
                	                org.w3c.dom.Document documentName = db.parse(sourceName);
                	                org.w3c.dom.Document documentDescription = db.parse(sourceDescription);
                	                org.w3c.dom.Document documentLineString = db.parse(sourceLinestring);
                	               
                	                
                	                String name = xpath.evaluate("/name/text()", documentName);
                	                String description = xpath.evaluate("/description/text()", documentDescription);
                    		            	
                    		        hikePath.name = name;
                	                
                    		        if(description != null && !description.equals("")) {
                    		        	hikePath.name += " - "+description;
                    		        }
                    		        
                	                String level = xpath.evaluate("/ExtendedData/SchemaData/SimpleData[@name=\"difficolta\"]/text()", documentExt);
                	                
                	                hikePath.type = level;
                	                
                	                
                	                String coordinates = xpath.evaluate("/LineString/coordinates/text()", documentLineString);
                	                String[] coords = coordinates.split(" ");
                		            
                		            List<Coordinate> coordsArray = new ArrayList<>();
                		            for(String coor: coords) {
                		               String[] c = coor.split(",");
                		               coordsArray.add(new Coordinate(Double.valueOf(c[0]).doubleValue(), Double.valueOf(c[1]).doubleValue()));
                		            }
                		            
                		            LineString line = geometryFactory
                		            		.createLineString(coordsArray.toArray(new Coordinate[coordsArray.size()]));
                		            
                		            
                		            hikePath.geometry = line;
                		            
                	                
            		            }catch(Exception e) {
            		            	e.printStackTrace();
            		            }
            		            
            		            
            		            
            		            
            		            return hikePath;
            		        }
            		    });
                		
                		List<HikePath> paths = xmlDownloader.download(streetNode.get("url").textValue(), false);
                		for(HikePath hike : paths) {
                			new WalkComfortStreet(hike);
                		}
                }else {
                	streets.add(new WalkComfortStreet(streetNode));	
                }
                
        }
      }
        
    }

    public float computeScore(OSMWithTags way) {
        return computeScore(way.getTags());
    }

    public float computeScore(Map<String, String> tags) {
        float factor = 1.0f;
        for(WalkComfortRule rule : rules) {
            float f = rule.computeFactor(tags);
            factor = factor * f;
        }
        return factor;
    }
    
    public float computeScore(StreetEdge streetEdge) {
    	Map<String, String> tags = streetEdge.getOsmTags();
    	
        float factor = 1.0f;
        for(WalkComfortRule rule : rules) {
            float f = rule.computeFactor(tags);
            factor = factor * f;
        }
        
        if(streetEdge.getGeometry() != null) {
        	LineString line = streetEdge.getGeometry();
        	for(WalkComfortStreet street : streets) {
        		Geometry geom = street.getGeometry();
        		boolean covers = geom.covers(line);
        		if(covers) {
        			factor = factor * street.getFactor();
        			
        			if(streetEdge.hasBogusName()) {
        				I18NString name = new NonLocalizedString(street.getName());
        				streetEdge.setName(name);
    					streetEdge.setHasBogusName(false);
        			}
					
        		}
        	}
        	
        }
        
       
        
        return factor;
    }

    public int getRuleCount() {
        return rules.size();
    }
}

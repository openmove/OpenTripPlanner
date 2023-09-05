package org.opentripplanner.common.walk;

import com.fasterxml.jackson.databind.JsonNode;

import org.geotools.geometry.jts.JTS;
import org.geotools.referencing.CRS;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.Geometry;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.LineString;
import org.locationtech.jts.io.WKTWriter;
import org.opengis.referencing.crs.CoordinateReferenceSystem;
import org.opengis.referencing.operation.MathTransform;
import org.opentripplanner.routing.bike_park.BikePark;
import org.opentripplanner.util.PolylineEncoder;
import org.opentripplanner.util.model.EncodedPolylineBean;
import org.opentripplanner.util.xml.XmlDataListDownloader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/**
 * A single rule for use in calculating walk comfort scores. Maps an WalkComfortTest
 * to a factor (relative to 1.0) that is used in computing the score.
 *
 * Created by demory on 11/20/17.
 */

public class WalkComfortStreet {

    private static final Logger LOG = LoggerFactory.getLogger(WalkComfortStreet.class);


    /**
     * the factor to apply to the composite comfort score if this rule's test is satisfied
     */
    private float factor;
    private String name;
    private GeometryFactory geometryFactory = new GeometryFactory();
    private Geometry geometry;

    public WalkComfortStreet(JsonNode streetNode) {
    	
    		this.factor = convertTypeInFactor(streetNode.get("type").textValue());
            this.setName(streetNode.get("name").textValue());
            
            EncodedPolylineBean bean = new EncodedPolylineBean(streetNode.get("path").textValue(), null, 0);
            List<Coordinate> coords = PolylineEncoder.decode(bean);
            LineString line = geometryFactory.createLineString(coords.toArray(new Coordinate[coords.size()]));
            
            this.geometry = addBuffer(line,20);    	
    }
    
    
    public WalkComfortStreet(HikePath path) {
    	this.factor = convertTypeInFactor(path.type);
    	this.name = path.name;
    	this.geometry = addBuffer(path.geometry,20);
    }
    

    private Geometry addBuffer(Geometry line, int buffer) {
    	try {
        	CoordinateReferenceSystem sourceCRS = CRS.decode("EPSG:4326");
        	CoordinateReferenceSystem targetCRS = CRS.decode("EPSG:3857");
        	MathTransform transform = CRS.findMathTransform(sourceCRS, targetCRS);
        	MathTransform transform2 = CRS.findMathTransform(targetCRS, sourceCRS);
        	Geometry targetGeometry = JTS.transform( line, transform);
        	Geometry bufferedTargetGeometry = targetGeometry.buffer(buffer);
			return JTS.transform( bufferedTargetGeometry, transform2);
		} catch (Exception e) {
			e.printStackTrace();
			return line;
		}
	}

	private float convertTypeInFactor(String textValue) {
    	//Italian classification of a path
    	switch(textValue) {
    		case "T": return 0.10f; //tourist path (to be privileged)
    		case "E": return 0.50f; //hike path (to be privileged, if you walk near)
    		case "EE": return 0.95f; //hike path for experts (to be privileged a little, because could be dangerous)
    		case "EEA": return 1.0f; //path for experts with mountaineering equipment (i.e. climbing) (no privilege, could be dangerous) 
    		default: return 1.0f;
    	}
	}

	public float getFactor() {
        return this.factor;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Geometry getGeometry() {
		return geometry;
	}

	public void setGeometry(Geometry geometry) {
		this.geometry = geometry;
	}

}

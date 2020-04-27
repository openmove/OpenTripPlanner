package org.opentripplanner.api.resource;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.vividsolutions.jts.geom.*;
import com.vividsolutions.jts.io.ParseException;
import org.opentripplanner.common.geometry.GeometryUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.vividsolutions.jts.io.WKTReader;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class LandmarksFilter {
    private static final Logger LOG = LoggerFactory.getLogger(LandmarksFilter.class);

    /*
    private Coordinate coord;
    private Coordinate[] coords;
    class AreaLandmark implements Serializable {
        String landmarkName;
        Coordinate[] landmarkArea;
        Coordinate landmarkTarget;

        public String getLandmarkName() {
            return this.landmarkName;
        }
        public Coordinate[] getLandmarkArea() {
            return this.landmarkArea;
        }
        public Coordinate getLandmarketTarget() {return this.landmarkTarget; }

        AreaLandmark(String landmarkName, Coordinate[] landmarkArea, Coordinate landmarkTarget) {
            this.landmarkName = landmarkName;
            this.landmarkArea = landmarkArea;
            this.landmarkTarget = landmarkTarget;
        }
    }

    private Coordinate[] lgacoords  =
            new Coordinate[] {
                    new Coordinate(40.7799078, -73.8829494),
                    new Coordinate(40.7709544, -73.8831425),
                    new Coordinate( 40.7703856, -73.8627577),
                    new Coordinate( 40.7800540, -73.8624573),
                    new Coordinate(40.7799078, -73.8829494)
            };
    private Coordinate lgatarget =
                   new Coordinate (40.7746067, -73.8718579);

    AreaLandmark lga = new AreaLandmark("LGA Airport", lgacoords, lgatarget);
*/
    public String testLoc(String location, String routerConfig) throws ParseException, IOException {

        LOG.info("LandmarksFilter found");
        String lgaTargetWkt = new String();
        String lgaAreaWkt = new String();
        try {
            ObjectMapper mapper = new ObjectMapper();
            JsonNode routerConfigJson = mapper.readTree(routerConfig);
            lgaTargetWkt = routerConfigJson.get("landmarksFilter").get(0).get("target").textValue();
            lgaAreaWkt = routerConfigJson.get("landmarksFilter").get(0).get("area").textValue();
        } catch (IOException ioe) {
            LOG.info("Couldn't read in routeConfig", ioe);
            return null;
        }
        //String lgaTargetWkt = "POINT (40.7746067 -73.8718579)";
        //String lgaAreaWkt = "POLYGON ((40.7799078 -73.8829494, 40.7709544 -73.8831425, 40.7703856 -73.8627577, 40.7800540 -73.8624573, 40.7799078 -73.8829494))";
        WKTReader reader = new WKTReader();
        Geometry lgaTarget = reader.read(lgaTargetWkt);
        Geometry lgaArea = reader.read(lgaAreaWkt);

        String[] locationArray=location.split(",");
        String locationWkt = "POINT ("+locationArray[0] + " " + locationArray[1] + ")";
        Geometry locationGeometry = reader.read(locationWkt);
        if (locationGeometry != null && lgaArea.contains(locationGeometry)) {
            return (lgaTarget.getCoordinate().x+","+lgaTarget.getCoordinate().y);
        } else {
            return null;
        }

    }


/*
    public boolean containsCustom(Coordinate coord, Coordinate[] coords) {
        // Based off of org/opentripplanner/analyst/batch/GraphGeographicFilter.java
        GeometryFactory geometryFactory = new GeometryFactory();

        Point referencePoint = geometryFactory.createPoint(coord);
        Polygon landmarkArea = geometryFactory.createPolygon(coords);
        boolean areaContains = landmarkArea.contains(referencePoint);
        LOG.info("testing for coord in Landmark coords");
        return areaContains;
    }
*/
}

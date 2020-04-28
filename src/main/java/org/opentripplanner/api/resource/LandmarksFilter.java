package org.opentripplanner.api.resource;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vividsolutions.jts.geom.*;
import com.vividsolutions.jts.io.ParseException;
import com.vividsolutions.jts.io.WKTReader;

import java.awt.geom.Area;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** An AreaLandmark is a Landmark described by a polygon and maps to a specific point or set of points. **/
class AreaLandmark implements Serializable {
    String name;
    String target;
    String area;

    public String getName() {
        return this.name;
    }

    public String getArea() {
        return this.area;
    }

    public String getTarget() {
        return this.target;
    }

    AreaLandmark(String landmarkName, String landmarkArea, String landmarkTarget) {
        this.name = landmarkName;
        this.target = landmarkTarget;
        this.area = landmarkArea;

    }
}

public class LandmarksFilter {
    private static final Logger LOG = LoggerFactory.getLogger(LandmarksFilter.class);

    public String[] testLoc(Response response, String routerConfig) throws ParseException {
        LOG.info("LandmarksFilter found");
        //List<String> targetWkt;
        //List<String> areaWkt;
        List<AreaLandmark> landmarks = new ArrayList<AreaLandmark>();
        String fromPlace;
        String toPlace;
        String[] locationUpdate = {null, null};
        fromPlace = response.requestParameters.get("fromPlace").replaceAll(","," ");
        toPlace = response.requestParameters.get("toPlace").replaceAll(","," ");

        try {
            ObjectMapper mapper = new ObjectMapper();
            JsonNode landmarksTree = mapper.readTree(routerConfig).get("landmarksFilter");
            Iterator<JsonNode> landmarksIterator = landmarksTree.iterator();
            WKTReader reader = new WKTReader();
            LOG.info("break");
            //landmarksIterator.forEachRemaining(n) -> landmarks.add(AreaLandmark(n.name, n.target, n.area)));

            while (landmarksIterator.hasNext()) {
                JsonNode currentLandmark = landmarksIterator.next();
                String targetWkt = currentLandmark.get("target").textValue();
                String areaWkt = currentLandmark.get("area").textValue();
                Geometry targetGeometry = reader.read(targetWkt);
                Geometry areaGeometry = reader.read(areaWkt);
                Geometry locationGeometry = reader.read("POINT (" + fromPlace + ")");
                if (locationGeometry != null && areaGeometry.contains(locationGeometry)) {
                    locationUpdate[0] = targetGeometry.getCoordinate().x+","+targetGeometry.getCoordinate().y;
                }
                locationGeometry = reader.read("POINT (" + toPlace + ")");
                if (locationGeometry != null && areaGeometry.contains(locationGeometry)) {
                    locationUpdate[1] = targetGeometry.getCoordinate().x+","+targetGeometry.getCoordinate().y;
                }
                //landmarks.add(new AreaLandmark(currentLandmark.get("name").asText(), currentLandmark.get("target").asText(), currentLandmark.get("area").asText()));


            }
                //lgaTargetWkt = landmarks.get("target").textValue();
                //lgaAreaWkt = landmarks.get(0).get("area").textValue();
            //}
        } catch (IOException ioe) {
            LOG.info("Couldn't read in routeConfig", ioe);
            return null;

        }
       // WKTReader reader = new WKTReader();
        /*Geometry lgaTarget = reader.read(lgaTargetWkt);
        Geometry lgaArea = reader.read(lgaAreaWkt);
        Geometry locationGeometry = reader.read("POINT (" + fromPlace + ")");
        if (locationGeometry != null && lgaArea.contains(locationGeometry)) {
        locationUpdate[0] = lgaTarget.getCoordinate().x+","+lgaTarget.getCoordinate().y;
        }
        locationGeometry = reader.read("POINT (" + toPlace + ")");
        if (locationGeometry != null && lgaArea.contains(locationGeometry)) {
            locationUpdate[1] = lgaTarget.getCoordinate().x+","+lgaTarget.getCoordinate().y;
        }*/
        return locationUpdate;
    }
}

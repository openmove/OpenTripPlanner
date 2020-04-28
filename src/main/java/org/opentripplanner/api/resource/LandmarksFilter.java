package org.opentripplanner.api.resource;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vividsolutions.jts.geom.*;
import com.vividsolutions.jts.io.ParseException;
import com.vividsolutions.jts.io.WKTReader;
import java.io.IOException;
import java.util.Iterator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LandmarksFilter {
    private static final Logger LOG = LoggerFactory.getLogger(LandmarksFilter.class);

    public String[] testLoc(Response response, String routerConfig) throws ParseException {
        LOG.info("LandmarksFilter found");
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
            }
            LOG.info("New from: {}, New to: {}", locationUpdate[0], locationUpdate[1]);
        } catch (IOException ioe) {
            LOG.info("Couldn't read in routeConfig", ioe);
            return null;
        }

        return locationUpdate;
    }
}

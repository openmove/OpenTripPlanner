package org.opentripplanner.api.resource;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vividsolutions.jts.geom.*;
import com.vividsolutions.jts.io.ParseException;
import com.vividsolutions.jts.io.WKTReader;
import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class LandmarksFilter {
    private static final Logger LOG = LoggerFactory.getLogger(LandmarksFilter.class);

    public String[] testLoc(Response response, String routerConfig) throws ParseException {
        LOG.info("LandmarksFilter found");
        String lgaTargetWkt;
        String lgaAreaWkt;
        String fromPlace;
        String toPlace;
        String[] locationUpdate = {null, null};
        fromPlace = response.requestParameters.get("fromPlace").replaceAll(","," ");
        toPlace = response.requestParameters.get("toPlace").replaceAll(","," ");

        try {
            ObjectMapper mapper = new ObjectMapper();
            JsonNode routerConfigJson = mapper.readTree(routerConfig);
            lgaTargetWkt = routerConfigJson.get("landmarksFilter").get(0).get("target").textValue();
            lgaAreaWkt = routerConfigJson.get("landmarksFilter").get(0).get("area").textValue();
        } catch (IOException ioe) {
            LOG.info("Couldn't read in routeConfig", ioe);
            return null;

        }
        WKTReader reader = new WKTReader();
        Geometry lgaTarget = reader.read(lgaTargetWkt);
        Geometry lgaArea = reader.read(lgaAreaWkt);
        Geometry locationGeometry = reader.read("POINT (" + fromPlace + ")");
        if (locationGeometry != null && lgaArea.contains(locationGeometry)) {
            locationUpdate[0] = lgaTarget.getCoordinate().x+","+lgaTarget.getCoordinate().y;
        }
        locationGeometry = reader.read("POINT (" + toPlace + ")");
        if (locationGeometry != null && lgaArea.contains(locationGeometry)) {
            locationUpdate[1] = lgaTarget.getCoordinate().x+","+lgaTarget.getCoordinate().y;
        }
        return locationUpdate;
    }
}

package org.opentripplanner.api.resource;

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Polygon;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;


public class LandmarksFilter {
    private static final Logger LOG = LoggerFactory.getLogger(LandmarksFilter.class);
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

    public String testLoc(String location) {
        LOG.info("LandmarksFilter found");
        String[] locationArray = location.split(",",2);
        Coordinate locationCoord =
                new Coordinate(Double.parseDouble(locationArray[0]), Double.parseDouble(locationArray[1]));

        if (locationCoord != null && this.contains(locationCoord, lga.landmarkArea)) {
            return (lgatarget.x+","+lgatarget.y);
        } else {
            return null;
        }

    }

    public boolean contains(Coordinate coord, Coordinate[] coords) {
        // Based off of org/opentripplanner/analyst/batch/GraphGeographicFilter.java
        GeometryFactory geometryFactory = new GeometryFactory();

        Point referencePoint = geometryFactory.createPoint(coord);
        Polygon landmarkArea = geometryFactory.createPolygon(coords);
        boolean contains = landmarkArea.contains(referencePoint);
        LOG.info("testing for point in Landmark polygon");
        return contains;
    }
}

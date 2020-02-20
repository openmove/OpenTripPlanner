package org.opentripplanner.api.common;

import java.io.IOException;
import java.io.Serializable;

import org.opentripplanner.common.model.GenericLocation;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.PreMatching;
import javax.ws.rs.core.UriBuilder;

import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Polygon;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.Coordinate;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** An AreaLdanmark is a Landmark described by a polygon and maps to specifc point or set of points. **/
class AreaLandmark implements Serializable {
    String landmarkName;
    Coordinate[] landmarkArea;
    Coordinate[] landmarkTarget;

    public String getLandmarkName() {
        return this.landmarkName;
    }
    public Coordinate[] getLandmarkArea() {
        return this.landmarkArea;
    }
    public Coordinate[] getLandmarketTarget() {return this.landmarkTarget; }

    AreaLandmark(String landmarkName, Coordinate[] landmarkArea, Coordinate[] landmarkTarget) {
        this.landmarkName = landmarkName;
        this.landmarkArea = landmarkArea;
        this.landmarkTarget = landmarkTarget;
    }
}


@Path("routers/{routerId}/plan")
@PreMatching
public class LandmarkLocationRequestFilter implements ContainerRequestFilter {

    private static final Logger LOG = LoggerFactory.getLogger(LandmarkLocationRequestFilter.class);
    private static GeometryFactory GeometryFactory = new GeometryFactory();

    private Coordinate[] lgacoords  =
            new Coordinate[] {
                    new Coordinate(40.7799078, -73.8829494),
                    new Coordinate(40.7709544, -73.8831425),
                    new Coordinate( 40.7703856, -73.8627577),
                    new Coordinate( 40.7800540, -73.8624573),
                    new Coordinate(40.7799078, -73.8829494)
            };
    private Coordinate[] lgatarget =
            new Coordinate [] {
                    new Coordinate (40.7746067, -73.8718579)
            };

    //GenericLocation loc = new GenericLocation(40.7746067, -73.8718579);
    AreaLandmark lga = new AreaLandmark("LGA Airport", lgacoords, lgatarget);

    @GET
    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException {
        /** The start location */
        if (requestContext.getUriInfo().getQueryParameters().containsKey("fromPlace")) {
            GenericLocation from = new GenericLocation("from", requestContext.getUriInfo().getQueryParameters().get("fromPlace").toString());
            Coordinate coordFrom = new Coordinate(from.lat, from.lng);
            /** The end location */
            GenericLocation to = new GenericLocation("to", requestContext.getUriInfo().getQueryParameters().get("toPlace").toString());
            Coordinate coordTo = new Coordinate(to.lat, to.lng);
            LOG.info("Landmark fromPlace: {}, toPlace: {}", from.toString(), to.toString());
            if (this.contains(coordTo, lga.landmarkArea)) {
                try {
                    UriBuilder builder = requestContext.getUriInfo().getRequestUriBuilder();
                    builder.replaceQueryParam("toPlace", lga.getLandmarketTarget());
                    requestContext.setRequestUri(builder.build());
                    LOG.info("Landmark new toPlace: " + lga.getLandmarketTarget());
                } catch (Exception ex) {
                    LOG.info("Remapping Landmark new toPlace failed", ex);
                }
            }
            if (this.contains(coordFrom, lga.landmarkArea)) {
                try {
                    UriBuilder builder = requestContext.getUriInfo().getRequestUriBuilder();
                    builder.replaceQueryParam("fromPlace", lga.getLandmarketTarget());
                    requestContext.setRequestUri(builder.build());
                    LOG.info("Landmark new fromPlace:" + lga.getLandmarketTarget());
                } catch (Exception ex) {
                    LOG.info("Remapping Landmark new toPlace failed", ex);
                }
            }
        }
    }

    public boolean contains(Coordinate coord, Coordinate[] coords) {
        // Based off of org/opentripplanner/analyst/batch/GraphGeographicFilter.java
        Point referencePoint = GeometryFactory.createPoint(coord);
        Polygon landmarkArea = GeometryFactory.createPolygon(coords);
        boolean contains = landmarkArea.contains(referencePoint);
        LOG.info("testing for point in Landmark polygon");
        return contains;
    }
}
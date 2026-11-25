package org.opentripplanner.routing.edgetype;

import org.junit.Before;
import org.junit.Test;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.LineString;
import org.opentripplanner.common.geometry.GeometryUtils;
import org.opentripplanner.model.FeedScopedId;
import org.opentripplanner.model.Stop;
import org.opentripplanner.routing.core.RoutingRequest;
import org.opentripplanner.routing.core.State;
import org.opentripplanner.routing.core.StateEditor;
import org.opentripplanner.routing.core.TraverseMode;
import org.opentripplanner.routing.graph.Graph;
import org.opentripplanner.routing.vehicle_rental.VehicleRentalStationService;
import org.opentripplanner.routing.vertextype.IntersectionVertex;
import org.opentripplanner.routing.vertextype.TransitStop;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/** A car rented through vehicle rental is dropped on the street before boarding transit. */
public class StreetTransitLinkVehicleRentalTest {

    private static final Set<String> NETWORKS = new HashSet<>(Collections.singletonList("carshare"));

    private Graph graph;
    private IntersectionVertex start;
    private IntersectionVertex stopCorner;
    private StreetEdge road;
    private StreetTransitLink link;
    private StreetTransitLink linkOut;

    @Before
    public void before() {
        graph = new Graph();
        graph.putService(VehicleRentalStationService.class, new VehicleRentalStationService());
        start = new IntersectionVertex(graph, "start", 0.0, 0.0);
        stopCorner = new IntersectionVertex(graph, "stopCorner", 0.0, 0.002);
        road = edge(start, stopCorner, 222.0, StreetTraversalPermission.CAR);
        road.addVehicleNetwork("carshare");

        Stop stop = new Stop();
        stop.setId(new FeedScopedId("TEST", "stop"));
        stop.setName("stop");
        stop.setLat(0.002);
        stop.setLon(0.0001);
        TransitStop transitStop = new TransitStop(graph, stop);
        link = new StreetTransitLink(stopCorner, transitStop);
        linkOut = new StreetTransitLink(transitStop, stopCorner);
    }

    @Test
    public void departAtDropsCarAndEntersStop() {
        State s1 = link.traverse(carDrivenOnRoad());
        assertNotNull(s1);
        assertFalse(s1.isVehicleRenting());
        assertEquals(TraverseMode.WALK, s1.getNonTransitMode());
        assertEquals(TraverseMode.LEG_SWITCH, s1.getBackMode());
    }

    @Test
    public void departAtRefusesWhenBackEdgeIsNotSuitableForCarDropoff() {
        road.setFloatingCarDropoffSuitability(false);
        assertNull(link.traverse(carDrivenOnRoad()));
    }

    @Test
    public void arriveByRefusesCarRentingState() {
        // going backwards from the street to the stop while renting would bring the car on transit
        StateEditor editor = new StateEditor(options(true), stopCorner);
        editor.beginVehicleRenting(0, NETWORKS, true);
        assertNull(linkOut.traverse(editor.makeState()));
    }

    private RoutingRequest options(boolean arriveBy) {
        RoutingRequest options = new RoutingRequest("CAR_RENT,WALK,TRANSIT");
        options.setArriveBy(arriveBy);
        options.setRoutingContext(graph, start, stopCorner);
        return options;
    }

    /** A depart-at car sharing state that drove the road and stands at its end, renting the car. */
    private State carDrivenOnRoad() {
        State atStart = new StateEditor(options(false), start).makeState();
        StateEditor editor = atStart.edit(road);
        editor.beginVehicleRenting(0, NETWORKS, true);
        editor.incrementVehicleRentalDistance(road.getDistance());
        editor.setBackMode(TraverseMode.CAR);
        return editor.makeState();
    }

    private static StreetEdge edge(IntersectionVertex a, IntersectionVertex b, double length,
            StreetTraversalPermission permission) {
        Coordinate[] coords = new Coordinate[] { a.getCoordinate(), b.getCoordinate() };
        LineString geometry = GeometryUtils.getGeometryFactory().createLineString(coords);
        return new StreetEdge(a, b, geometry, a.getLabel() + "_" + b.getLabel(), length, permission, false);
    }
}

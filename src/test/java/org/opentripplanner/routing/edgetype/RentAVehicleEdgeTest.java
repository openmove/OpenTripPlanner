package org.opentripplanner.routing.edgetype;

import org.junit.Before;
import org.junit.Test;
import org.locationtech.jts.geom.Coordinate;
import org.opentripplanner.common.geometry.GeometryUtils;
import org.opentripplanner.routing.core.RoutingRequest;
import org.opentripplanner.routing.core.State;
import org.opentripplanner.routing.core.StateEditor;
import org.opentripplanner.routing.core.TraverseMode;
import org.opentripplanner.routing.graph.Graph;
import org.opentripplanner.routing.vehicle_rental.VehicleRentalStation;
import org.opentripplanner.routing.vehicle_rental.VehicleRentalStationService;
import org.opentripplanner.routing.vertextype.IntersectionVertex;
import org.opentripplanner.routing.vertextype.VehicleRentalStationVertex;
import org.opentripplanner.util.NonLocalizedString;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

/** Form factor filter of RentAVehicleOnEdge and car refusal of RentAVehicleOffEdge. */
public class RentAVehicleEdgeTest {

    private static final String CAR_SEARCH = "CAR_RENT,WALK";
    private static final String MICROMOBILITY_SEARCH = "MICROMOBILITY_RENT,WALK";
    private static final Set<String> NETWORKS = new HashSet<>(Collections.singletonList("carshare"));

    private Graph graph;
    private IntersectionVertex from;
    private IntersectionVertex to;
    private VehicleRentalStationVertex carVertex;
    private VehicleRentalStationVertex scooterVertex;
    private VehicleRentalStationVertex dockVertex;
    private RentAVehicleOnEdge rentCar;
    private RentAVehicleOnEdge rentScooter;
    private RentAVehicleOffEdge dropAtDock;

    @Before
    public void before() {
        graph = new Graph();
        graph.putService(VehicleRentalStationService.class, new VehicleRentalStationService());
        from = new IntersectionVertex(graph, "from", 0.0, 0.0);
        to = new IntersectionVertex(graph, "to", 0.0, 0.01);
        // an arriveBy State looks for the first street edge reachable from its vertex
        new StreetEdge(from, to, GeometryUtils.getGeometryFactory().createLineString(
            new Coordinate[] { from.getCoordinate(), to.getCoordinate() }), "footway", 1100,
            StreetTraversalPermission.PEDESTRIAN, false);

        VehicleRentalStation car = floatingVehicle("car", "CAR");
        carVertex = new VehicleRentalStationVertex(graph, car);
        rentCar = new RentAVehicleOnEdge(carVertex, car);
        new StreetVehicleRentalLink(to, carVertex);

        VehicleRentalStation scooter = floatingVehicle("scooter", "SCOOTER");
        scooterVertex = new VehicleRentalStationVertex(graph, scooter);
        rentScooter = new RentAVehicleOnEdge(scooterVertex, scooter);
        new StreetVehicleRentalLink(to, scooterVertex);

        VehicleRentalStation dock = new VehicleRentalStation();
        dock.id = "dock";
        dock.name = new NonLocalizedString("dock");
        dock.vehiclesAvailable = 1;
        dock.spacesAvailable = 1;
        dock.isFloatingVehicle = false;
        dock.allowPickup = true;
        dock.allowDropoff = true;
        dock.networks = NETWORKS;
        dockVertex = new VehicleRentalStationVertex(graph, dock);
        dropAtDock = new RentAVehicleOffEdge(dockVertex, dock);
        new StreetVehicleRentalLink(to, dockVertex);
    }

    @Test
    public void carSearchDepartAtRentsCarAndDrivesIt() {
        State s1 = rentCar.traverse(walkingState(CAR_SEARCH, false, carVertex));
        assertNotNull(s1);
        assertTrue(s1.isVehicleRenting());
        assertEquals(TraverseMode.CAR, s1.getNonTransitMode());
    }

    @Test
    public void carSearchDepartAtRefusesScooter() {
        assertNull(rentScooter.traverse(walkingState(CAR_SEARCH, false, scooterVertex)));
    }

    @Test
    public void micromobilitySearchDepartAtRefusesCar() {
        assertNull(rentCar.traverse(walkingState(MICROMOBILITY_SEARCH, false, carVertex)));
    }

    @Test
    public void micromobilitySearchDepartAtRentsScooter() {
        State s1 = rentScooter.traverse(walkingState(MICROMOBILITY_SEARCH, false, scooterVertex));
        assertNotNull(s1);
        assertTrue(s1.isVehicleRenting());
        assertEquals(TraverseMode.MICROMOBILITY, s1.getNonTransitMode());
    }

    @Test
    public void carSearchArriveByEndsCarRental() {
        State s1 = rentCar.traverse(rentingState(CAR_SEARCH, true, carVertex));
        assertNotNull(s1);
        assertFalse(s1.isVehicleRenting());
    }

    @Test
    public void carSearchArriveByRefusesScooter() {
        assertNull(rentScooter.traverse(rentingState(CAR_SEARCH, true, scooterVertex)));
    }

    @Test
    public void micromobilitySearchArriveByRefusesCar() {
        assertNull(rentCar.traverse(rentingState(MICROMOBILITY_SEARCH, true, carVertex)));
    }

    @Test
    public void micromobilitySearchArriveByEndsScooterRental() {
        State s1 = rentScooter.traverse(rentingState(MICROMOBILITY_SEARCH, true, scooterVertex));
        assertNotNull(s1);
        assertFalse(s1.isVehicleRenting());
    }

    @Test
    public void carSearchDepartAtCannotDropAtDock() {
        assertNull(dropAtDock.traverse(rentingState(CAR_SEARCH, false, dockVertex)));
    }

    @Test
    public void carSearchArriveByCannotDropAtDock() {
        assertNull(dropAtDock.traverse(walkingState(CAR_SEARCH, true, dockVertex)));
    }

    @Test
    public void micromobilitySearchDepartAtDropsAtDock() {
        State s1 = dropAtDock.traverse(rentingState(MICROMOBILITY_SEARCH, false, dockVertex));
        assertNotNull(s1);
        assertFalse(s1.isVehicleRenting());
    }

    @Test
    public void micromobilitySearchArriveByDropsAtDock() {
        State s1 = dropAtDock.traverse(walkingState(MICROMOBILITY_SEARCH, true, dockVertex));
        assertNotNull(s1);
        assertTrue(s1.isVehicleRenting());
    }

    private static VehicleRentalStation floatingVehicle(String id, String vehicleType) {
        VehicleRentalStation station = new VehicleRentalStation();
        station.id = id;
        station.name = new NonLocalizedString(id);
        station.vehiclesAvailable = 1;
        station.spacesAvailable = 0;
        station.isFloatingVehicle = true;
        station.allowPickup = true;
        station.allowDropoff = false;
        station.networks = NETWORKS;
        station.vehicleType = vehicleType;
        return station;
    }

    private RoutingRequest options(String modes, boolean arriveBy) {
        RoutingRequest options = new RoutingRequest(modes);
        options.setArriveBy(arriveBy);
        options.setRoutingContext(graph, from, to);
        return options;
    }

    private State walkingState(String modes, boolean arriveBy, VehicleRentalStationVertex at) {
        return new StateEditor(options(modes, arriveBy), at).makeState();
    }

    /** A state renting the search's vehicle, already ridden beyond minimumVehicleRentalDistance. */
    private State rentingState(String modes, boolean arriveBy, VehicleRentalStationVertex at) {
        StateEditor editor = new StateEditor(options(modes, arriveBy), at);
        editor.beginVehicleRenting(200, NETWORKS, true);
        return editor.makeState();
    }
}

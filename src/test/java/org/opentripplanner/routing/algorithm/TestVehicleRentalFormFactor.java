package org.opentripplanner.routing.algorithm;

import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.read.ListAppender;
import org.junit.Before;
import org.junit.Test;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.LineString;
import org.opentripplanner.api.model.Itinerary;
import org.opentripplanner.api.model.Leg;
import org.opentripplanner.api.resource.GraphPathToTripPlanConverter;
import org.opentripplanner.common.TurnRestriction;
import org.opentripplanner.common.geometry.GeometryUtils;
import org.opentripplanner.routing.core.RoutingRequest;
import org.opentripplanner.routing.core.State;
import org.opentripplanner.routing.core.TraverseMode;
import org.opentripplanner.routing.core.TraverseModeSet;
import org.opentripplanner.routing.edgetype.FreeEdge;
import org.opentripplanner.routing.edgetype.RentAVehicleOnEdge;
import org.opentripplanner.routing.edgetype.StreetEdge;
import org.opentripplanner.routing.edgetype.StreetTraversalPermission;
import org.opentripplanner.routing.edgetype.StreetVehicleRentalLink;
import org.opentripplanner.routing.graph.Edge;
import org.opentripplanner.routing.graph.Graph;
import org.opentripplanner.routing.graph.Vertex;
import org.opentripplanner.routing.spt.GraphPath;
import org.opentripplanner.routing.spt.ShortestPathTree;
import org.opentripplanner.routing.vehicle_rental.VehicleRentalRegion;
import org.opentripplanner.routing.vehicle_rental.VehicleRentalStation;
import org.opentripplanner.routing.vehicle_rental.VehicleRentalStationService;
import org.opentripplanner.routing.vertextype.IntersectionVertex;
import org.opentripplanner.routing.vertextype.VehicleRentalStationVertex;
import org.opentripplanner.util.NonLocalizedString;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Car form factor in vehicle rental, end to end on a tiny graph:
 *
 * <pre>
 *   A --walk 200 m-- B ==car road 400 m (13.9 m/s)== C --walk 250 m-- D
 *                     \--cycleway 300 m (walk, bike, micromobility)--/
 * </pre>
 *
 * Every edge is longer than minimumVehicleRentalDistance (100 m), exists in both directions and is in the
 * "carshare" vehicle network. Rental vehicles float at B.
 */
public class TestVehicleRentalFormFactor {

    private static final String NETWORK = "carshare";
    private static final Set<String> NETWORKS = new HashSet<>(Collections.singletonList(NETWORK));
    private static final float ROAD_CAR_SPEED = 13.9f;
    private static final String CAR_SEARCH = "CAR_RENT,WALK";
    private static final String SCOOTER_SEARCH = "MICROMOBILITY_RENT,WALK";

    private Graph graph;
    private IntersectionVertex a, b, c, d;
    private StreetEdge ab, ba, cd, dc, cycleBC, cycleCB;
    /** Car road B to C, one edge per direction unless the road is split at M. */
    private List<StreetEdge> roadBC = new ArrayList<>();
    private List<StreetEdge> roadCB = new ArrayList<>();
    private RentAVehicleOnEdge rentCar;
    private RentAVehicleOnEdge rentScooter;
    private ShortestPathTree tree;

    @Before
    public void before() {
        buildGraph(false);
    }

    // ---- car sharing, departAt and arriveBy ----

    @Test
    public void carDepartAtDrivesTheRoad() {
        addCar();
        GraphPath path = plan(CAR_SEARCH, false, false);

        assertNotNull(path);
        assertTrue(path.edges.contains(rentCar));
        assertTrue(path.edges.containsAll(roadBC));
        assertFalse(path.edges.contains(cycleBC));
        for (State s : path.states) {
            if (roadBC.contains(s.getBackEdge())) {
                assertEquals(TraverseMode.CAR, s.getBackMode());
                assertTrue(s.isVehicleRenting());
            }
            if (s.getBackEdge() == ab || s.getBackEdge() == cd) {
                assertEquals(TraverseMode.WALK, s.getBackMode());
                assertFalse(s.isVehicleRenting());
            }
        }
        assertFalse(path.states.getLast().isVehicleRenting());
    }

    @Test
    public void carDepartAtRoadTimeFollowsRoadSpeed() {
        addCar();
        GraphPath path = plan(CAR_SEARCH, false, false);

        State onRoad = stateAfter(path, roadBC.get(0));
        long roadSeconds = onRoad.getTimeSeconds() - onRoad.getBackState().getTimeSeconds();
        assertEquals((long) Math.ceil(400 / ROAD_CAR_SPEED), roadSeconds);
    }

    @Test
    public void carArriveByUsesSameEdges() {
        addCar();
        GraphPath departAt = plan(CAR_SEARCH, false, false);
        GraphPath arriveBy = plan(CAR_SEARCH, true, false);

        assertNotNull(arriveBy);
        assertEquals(departAt.edges, arriveBy.edges);
        // the reversed path is checked in carLegInArriveByResponse
        assertEquals(TraverseMode.CAR, searchStateAfter(roadBC.get(0)).getBackMode());
    }

    @Test
    public void carNeverOnCyclewayNorWalkedDepartAt() {
        addCar();
        assertNotNull(plan(CAR_SEARCH, false, false));
        assertNoRentedCarOnCyclewayOrWalked();
    }

    @Test
    public void carNeverOnCyclewayNorWalkedArriveBy() {
        addCar();
        assertNotNull(plan(CAR_SEARCH, true, false));
        assertNoRentedCarOnCyclewayOrWalked();
    }

    // ---- reverse optimization ----

    @Test
    public void carDepartAtOptimizedPathKeepsEdges() {
        addCar();
        GraphPath plain = plan(CAR_SEARCH, false, false);
        // GraphPath optimizes only searches with transit modes
        List<ILoggingEvent> errors = captureStateErrors(() -> {
            GraphPath optimized = plan(CAR_SEARCH + ",TRANSIT", false, true);
            assertNotNull(optimized);
            assertEquals(plain.edges, optimized.edges);
        });
        assertTrue("reverse optimization fell back: " + errors, errors.isEmpty());
    }

    @Test
    public void carArriveByOptimizedPathKeepsEdges() {
        addCar();
        GraphPath plain = plan(CAR_SEARCH, false, false);
        List<ILoggingEvent> errors = captureStateErrors(() -> {
            GraphPath optimized = plan(CAR_SEARCH + ",TRANSIT", true, true);
            assertNotNull(optimized);
            assertEquals(plain.edges, optimized.edges);
        });
        assertTrue("reverse optimization fell back: " + errors, errors.isEmpty());
    }

    // ---- form factor filter ----

    @Test
    public void scooterSearchNeverRentsTheCar() {
        addCar();
        addScooter();
        GraphPath path = plan(SCOOTER_SEARCH, false, false);

        assertNotNull(path);
        assertTrue(path.edges.contains(rentScooter));
        assertFalse(treeUses(rentCar));
    }

    @Test
    public void carSearchNeverRentsTheScooter() {
        addCar();
        addScooter();
        GraphPath path = plan(CAR_SEARCH, false, false);

        assertNotNull(path);
        assertTrue(path.edges.contains(rentCar));
        assertFalse(treeUses(rentScooter));
    }

    @Test
    public void scooterSearchArriveByNeverRentsTheCar() {
        addCar();
        addScooter();
        assertNotNull(plan(SCOOTER_SEARCH, true, false));
        assertFalse(treeUses(rentCar));
    }

    @Test
    public void carSearchArriveByNeverRentsTheScooter() {
        addCar();
        addScooter();
        assertNotNull(plan(CAR_SEARCH, true, false));
        assertFalse(treeUses(rentScooter));
    }

    // ---- drop-off rules ----

    @Test
    public void carIsNotLeftOnEdgeUnsuitableForCarDropoff() {
        for (StreetEdge e : roadBC) e.setFloatingCarDropoffSuitability(false);
        for (StreetEdge e : roadCB) e.setFloatingCarDropoffSuitability(false);
        addCar();

        assertCarNeverDropped(plan(CAR_SEARCH, false, false));
        assertCarNeverDropped(plan(CAR_SEARCH, true, false));
    }

    @Test
    public void carIsNotLeftOutsideItsNetworkRegion() {
        graph.getService(VehicleRentalStationService.class)
            .addVehicleRentalRegion(
                new VehicleRentalRegion(NETWORK, GeometryUtils.getGeometryFactory().createPoint(a.getCoordinate())));
        for (StreetEdge e : roadBC) e.setVehicleNetworks(new HashSet<>());
        for (StreetEdge e : roadCB) e.setVehicleNetworks(new HashSet<>());
        addCar();

        assertCarNeverDropped(plan(CAR_SEARCH, false, false));
    }

    /**
     * The network region ends at M and the road goes on: the car is left on the last road edge inside the region
     * and the rest is walked, in both search directions.
     */
    @Test
    public void carIsLeftOnTheLastEdgeInsideItsNetworkRegion() {
        buildGraph(true);
        graph.getService(VehicleRentalStationService.class)
            .addVehicleRentalRegion(
                new VehicleRentalRegion(NETWORK, GeometryUtils.getGeometryFactory().createPoint(a.getCoordinate())));
        StreetEdge outside = roadBC.get(1);
        outside.setPermission(StreetTraversalPermission.ALL);
        outside.setVehicleNetworks(new HashSet<>());
        addCar();

        for (boolean arriveBy : new boolean[] { false, true }) {
            RoutingRequest options = new RoutingRequest(CAR_SEARCH);
            // without the pickup and drop-off costs the short drive beats walking the cycleway
            options.vehicleRentalPickupCost = 0;
            options.vehicleRentalDropoffCost = 0;
            options.setArriveBy(arriveBy);
            options.setRoutingContext(graph, a, d);
            GraphPath path = new AStar().getShortestPathTree(options).getPath(arriveBy ? a : d, false);
            assertNotNull(path);
            assertTrue("car not rented, arriveBy=" + arriveBy, path.edges.contains(rentCar));
            assertEquals(TraverseMode.CAR, stateAfter(path, roadBC.get(0)).getBackMode());
            assertEquals(TraverseMode.WALK, stateAfter(path, outside).getBackMode());
        }
    }

    // ---- turn restrictions ----

    @Test
    public void rentedCarObeysTurnRestrictionDepartAt() {
        buildGraph(true);
        addCar();
        graph.addTurnRestriction(roadBC.get(0),
            new TurnRestriction(roadBC.get(0), roadBC.get(1), null, new TraverseModeSet(TraverseMode.CAR)));

        assertNotNull(plan(CAR_SEARCH, false, false));
        assertNoForbiddenTurn(roadBC.get(0), roadBC.get(1));
    }

    @Test
    public void rentedCarObeysTurnRestrictionArriveBy() {
        buildGraph(true);
        addCar();
        graph.addTurnRestriction(roadBC.get(0),
            new TurnRestriction(roadBC.get(0), roadBC.get(1), null, new TraverseModeSet(TraverseMode.CAR)));

        assertNotNull(plan(CAR_SEARCH, true, false));
        assertNoForbiddenTurn(roadBC.get(0), roadBC.get(1));
    }

    @Test
    public void rentedCarIsLeftBeforeAnEdgeItCannotDrive() {
        // C-D allows cars, but a turn restriction stops the rented car at C: it is left on the road, C-D is walked
        cd.setPermission(StreetTraversalPermission.ALL);
        dc.setPermission(StreetTraversalPermission.ALL);
        addCar();
        graph.addTurnRestriction(roadBC.get(0),
            new TurnRestriction(roadBC.get(0), cd, null, new TraverseModeSet(TraverseMode.CAR)));

        GraphPath departAt = plan(CAR_SEARCH, false, false);
        assertNotNull(departAt);
        assertTrue(departAt.edges.contains(rentCar));
        assertTrue(departAt.edges.containsAll(roadBC));
        assertEquals(TraverseMode.WALK, stateAfter(departAt, cd).getBackMode());
        assertFalse(stateAfter(departAt, cd).isVehicleRenting());
        assertEquals(departAt.edges, plan(CAR_SEARCH, true, false).edges);
    }

    @Test
    public void rentedCarDrivesSplitRoadWithoutTurnRestriction() {
        buildGraph(true);
        addCar();

        GraphPath path = plan(CAR_SEARCH, false, false);
        assertNotNull(path);
        assertTrue(path.edges.containsAll(roadBC));
    }

    // ---- micromobility regression (same results as the base commit) ----

    @Test
    public void scooterDepartAtRidesCycleway() {
        addScooter();
        GraphPath path = plan(SCOOTER_SEARCH, false, false);

        assertScooterOnCycleway(path);
        assertEquals(SCOOTER_DEPART_AT_DURATION, path.getDuration());
        assertEquals(SCOOTER_DEPART_AT_WEIGHT, path.getWeight(), 1e-6);
    }

    @Test
    public void scooterArriveByRidesCycleway() {
        addScooter();
        GraphPath path = plan(SCOOTER_SEARCH, true, false);

        assertScooterOnCycleway(path);
        assertEquals(SCOOTER_ARRIVE_BY_DURATION, path.getDuration());
        assertEquals(SCOOTER_ARRIVE_BY_WEIGHT, path.getWeight(), 1e-6);
    }

    // Measured on origin/openmove (ea0c90475) with the same graph and request.
    // The arriveBy values are higher because the StreetEdge arriveBy fork and RentAVehicleOnEdge both charge the
    // pickup cost and time on the base commit.
    private static final int SCOOTER_DEPART_AT_DURATION = 459;
    private static final double SCOOTER_DEPART_AT_WEIGHT = 916.6917293233082;
    private static final int SCOOTER_ARRIVE_BY_DURATION = 519;
    private static final double SCOOTER_ARRIVE_BY_WEIGHT = 1036.6917293233082;

    // ---- response ----

    @Test
    public void carLegInResponse() {
        addCar();
        GraphPath path = plan(CAR_SEARCH, false, false);
        Itinerary itinerary = GraphPathToTripPlanConverter.generateItinerary(path, false, false, Locale.ENGLISH);

        Leg carLeg = null;
        for (Leg leg : itinerary.legs) {
            if ("CAR".equals(leg.mode)) {
                carLeg = leg;
            }
        }
        assertNotNull("no CAR leg in " + itinerary.legs, carLeg);
        assertEquals(Boolean.TRUE, carLeg.rentedVehicle);
        assertEquals("CAR_COMBUSTION", carLeg.vehicleType);
        assertNotNull(carLeg.from.networks);
        assertTrue(carLeg.from.networks.contains(NETWORK));
    }

    @Test
    public void carLegInArriveByResponse() {
        addCar();
        GraphPath path = plan(CAR_SEARCH, true, false);
        Itinerary itinerary = GraphPathToTripPlanConverter.generateItinerary(path, false, false, Locale.ENGLISH);

        Leg carLeg = null;
        for (Leg leg : itinerary.legs) {
            if ("CAR".equals(leg.mode)) {
                carLeg = leg;
            }
        }
        assertNotNull("no CAR leg in " + itinerary.legs, carLeg);
        assertEquals(Boolean.TRUE, carLeg.rentedVehicle);
        assertEquals(400, carLeg.distance, 1e-6);
        State onRoad = stateAfter(path, roadBC.get(0));
        assertEquals(TraverseMode.CAR, onRoad.getBackMode());
        assertTrue(onRoad.isVehicleRenting());
        assertFalse(stateAfter(path, cd).isVehicleRenting());
    }

    /**
     * The car is driven up to the destination: the road ends at C and the destination T hangs off C through a free
     * edge, as a requested location does. The rental is not ended there in departAt, so the reversed arriveBy path
     * must report a rented car leg too.
     */
    @Test
    public void carLegDrivenToDestinationInArriveByResponse() {
        addCar();
        IntersectionVertex t = new IntersectionVertex(graph, "T", 0.0, 0.004);
        new FreeEdge(c, t);
        RoutingRequest options = new RoutingRequest(CAR_SEARCH);
        options.setArriveBy(true);
        options.setRoutingContext(graph, a, t);
        GraphPath path = new AStar().getShortestPathTree(options).getPath(a, false);
        assertNotNull(path);
        Itinerary itinerary = GraphPathToTripPlanConverter.generateItinerary(path, false, false, Locale.ENGLISH);

        Leg lastLeg = itinerary.legs.get(itinerary.legs.size() - 1);
        assertEquals("CAR", lastLeg.mode);
        assertEquals(Boolean.TRUE, lastLeg.rentedVehicle);
        assertEquals(400, lastLeg.distance, 1e-6);
    }

    // ---- helpers ----

    private void buildGraph(boolean splitRoad) {
        graph = new Graph();
        graph.putService(VehicleRentalStationService.class, new VehicleRentalStationService());
        roadBC = new ArrayList<>();
        roadCB = new ArrayList<>();
        // 0.001 degrees of latitude is about 111 m: straight-line distances stay below the edge lengths
        a = new IntersectionVertex(graph, "A", 0.0, 0.0);
        b = new IntersectionVertex(graph, "B", 0.0, 0.0015);
        c = new IntersectionVertex(graph, "C", 0.0, 0.004);
        d = new IntersectionVertex(graph, "D", 0.0, 0.006);

        ab = edge(a, b, 200, StreetTraversalPermission.PEDESTRIAN);
        ba = edge(b, a, 200, StreetTraversalPermission.PEDESTRIAN);
        if (splitRoad) {
            IntersectionVertex m = new IntersectionVertex(graph, "M", 0.0, 0.00275);
            roadBC.add(road(b, m, 200));
            roadBC.add(road(m, c, 200));
            roadCB.add(road(c, m, 200));
            roadCB.add(road(m, b, 200));
        } else {
            roadBC.add(road(b, c, 400));
            roadCB.add(road(c, b, 400));
        }
        cycleBC = edge(b, c, 300, StreetTraversalPermission.PEDESTRIAN_AND_BICYCLE_AND_MICROMOBILITY);
        cycleCB = edge(c, b, 300, StreetTraversalPermission.PEDESTRIAN_AND_BICYCLE_AND_MICROMOBILITY);
        cd = edge(c, d, 250, StreetTraversalPermission.PEDESTRIAN);
        dc = edge(d, c, 250, StreetTraversalPermission.PEDESTRIAN);
    }

    private StreetEdge road(IntersectionVertex from, IntersectionVertex to, double length) {
        StreetEdge e = edge(from, to, length, StreetTraversalPermission.CAR);
        e.setCarSpeed(ROAD_CAR_SPEED);
        return e;
    }

    private StreetEdge edge(IntersectionVertex from, IntersectionVertex to, double length,
            StreetTraversalPermission permission) {
        Coordinate[] coords = new Coordinate[] { from.getCoordinate(), to.getCoordinate() };
        LineString geometry = GeometryUtils.getGeometryFactory().createLineString(coords);
        String name = from.getLabel() + "_" + to.getLabel() + "_" + permission;
        StreetEdge e = new StreetEdge(from, to, geometry, name, length, permission, false);
        e.addVehicleNetwork(NETWORK);
        return e;
    }

    private void addCar() {
        rentCar = addFloatingVehicle("car", "CAR", "COMBUSTION");
    }

    private void addScooter() {
        rentScooter = addFloatingVehicle("scooter", "SCOOTER", "ELECTRIC");
    }

    /** Same vertex and edges as VehicleRentalUpdater.makeVertex for a vehicle snapped onto vertex B. */
    private RentAVehicleOnEdge addFloatingVehicle(String id, String vehicleType, String propulsionType) {
        VehicleRentalStation station = new VehicleRentalStation();
        station.id = id;
        station.name = new NonLocalizedString(id);
        station.x = b.getX();
        station.y = b.getY();
        station.vehiclesAvailable = 1;
        station.spacesAvailable = 0;
        station.isFloatingVehicle = true;
        station.allowPickup = true;
        station.allowDropoff = false;
        station.networks = NETWORKS;
        station.vehicleType = vehicleType;
        station.propulsionType = propulsionType;
        graph.getService(VehicleRentalStationService.class).addVehicleRentalStation(station);

        VehicleRentalStationVertex vertex = new VehicleRentalStationVertex(graph, station);
        new StreetVehicleRentalLink(b, vertex);
        new StreetVehicleRentalLink(vertex, b);
        return new RentAVehicleOnEdge(vertex, station);
    }

    private GraphPath plan(String modes, boolean arriveBy, boolean optimize) {
        RoutingRequest options = new RoutingRequest(modes);
        options.setArriveBy(arriveBy);
        options.setRoutingContext(graph, a, d);
        tree = new AStar().getShortestPathTree(options);
        return tree.getPath(arriveBy ? a : d, optimize);
    }

    private static State stateAfter(GraphPath path, Edge edge) {
        for (State s : path.states) {
            if (s.getBackEdge() == edge) return s;
        }
        throw new AssertionError("path does not traverse " + edge);
    }

    private boolean treeUses(Edge edge) {
        for (State s : tree.getAllStates()) {
            if (s.getBackEdge() == edge) return true;
        }
        return false;
    }

    /** In a car search every renting state is in a rented car: on a street it must be driving it. */
    private void assertNoRentedCarOnCyclewayOrWalked() {
        for (State s : tree.getAllStates()) {
            if (!s.isVehicleRenting() || !(s.getBackEdge() instanceof StreetEdge)) continue;
            assertFalse("rented car on the cycleway: " + s,
                s.getBackEdge() == cycleBC || s.getBackEdge() == cycleCB);
            assertEquals("rented car not driven: " + s, TraverseMode.CAR, s.getBackMode());
        }
    }

    /** The only drivable edges forbid the drop-off, so the car is never used and the trip is walked. */
    private void assertCarNeverDropped(GraphPath path) {
        assertNotNull(path);
        for (State s : path.states) {
            assertFalse("rented car in the path: " + s, s.isVehicleRenting());
        }
        assertFalse(path.edges.contains(rentCar));
        assertNoRentedCarOnCyclewayOrWalked();
    }

    /** No car state in the tree turns from {@code from} onto {@code to}, in either search direction. */
    private void assertNoForbiddenTurn(StreetEdge from, StreetEdge to) {
        for (State s : tree.getAllStates()) {
            State back = s.getBackState();
            if (back == null || s.getBackMode() != TraverseMode.CAR || back.getBackMode() != TraverseMode.CAR) {
                continue;
            }
            boolean departAtTurn = s.getBackEdge() == to && back.getBackEdge() == from;
            boolean arriveByTurn = s.getBackEdge() == from && back.getBackEdge() == to;
            assertFalse("rented car turned from " + from + " onto " + to, departAtTurn || arriveByTurn);
        }
    }

    private void assertScooterOnCycleway(GraphPath path) {
        assertNotNull(path);
        assertTrue(path.edges.contains(rentScooter));
        assertTrue(path.edges.contains(cycleBC));
        assertEquals(TraverseMode.MICROMOBILITY, searchStateAfter(cycleBC).getBackMode());
    }

    /** The search state (not the reversed path state) that traversed the edge on the way to the search target. */
    private State searchStateAfter(Edge edge) {
        Vertex target = tree.getOptions().arriveBy ? a : d;
        for (State s = tree.getState(target); s != null; s = s.getBackState()) {
            if (s.getBackEdge() == edge) return s;
        }
        throw new AssertionError("search did not traverse " + edge);
    }

    private static List<ILoggingEvent> captureStateErrors(Runnable action) {
        Logger logger = (Logger) LoggerFactory.getLogger(State.class);
        ListAppender<ILoggingEvent> appender = new ListAppender<>();
        appender.start();
        logger.addAppender(appender);
        try {
            action.run();
        } finally {
            logger.detachAppender(appender);
        }
        List<ILoggingEvent> errors = new ArrayList<>();
        for (ILoggingEvent event : appender.list) {
            if (event.getLevel().isGreaterOrEqual(ch.qos.logback.classic.Level.ERROR)) {
                errors.add(event);
            }
        }
        return errors;
    }
}

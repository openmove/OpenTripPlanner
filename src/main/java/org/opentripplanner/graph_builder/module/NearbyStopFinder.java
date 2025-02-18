package org.opentripplanner.graph_builder.module;

import com.beust.jcommander.internal.Lists;
import com.beust.jcommander.internal.Sets;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.LineString;

import org.opentripplanner.api.resource.CoordinateArrayListSequence;
import org.opentripplanner.api.resource.SimpleIsochrone;
import org.opentripplanner.common.geometry.GeometryUtils;
import org.opentripplanner.common.geometry.PackedCoordinateSequence;
import org.opentripplanner.common.geometry.SphericalDistanceLibrary;
import org.opentripplanner.profile.StopAtDistance;
import org.opentripplanner.routing.algorithm.EarliestArrivalSearch;
import org.opentripplanner.routing.core.RoutingRequest;
import org.opentripplanner.routing.core.State;
import org.opentripplanner.routing.core.TraverseMode;
import org.opentripplanner.routing.edgetype.StreetEdge;
import org.opentripplanner.routing.edgetype.TripPattern;
import org.opentripplanner.routing.graph.Edge;
import org.opentripplanner.routing.graph.Graph;
import org.opentripplanner.routing.graph.Vertex;
import org.opentripplanner.routing.services.StreetVertexIndexService;
import org.opentripplanner.routing.spt.GraphPath;
import org.opentripplanner.routing.spt.ShortestPathTree;
import org.opentripplanner.routing.vertextype.TransitStop;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * These library functions are used by the streetless and streetful stop linkers, and in profile transfer generation.
 * Ideally they could also be used in long distance mode and profile routing for the street segments.
 * For each stop, it finds the closest stops on all other patterns. This reduces the number of transfer edges
 * significantly compared to simple radius-constrained all-to-all stop linkage.
 */
public class NearbyStopFinder {

    private static Logger LOG = LoggerFactory.getLogger(NearbyStopFinder.class);
    private static GeometryFactory geometryFactory = GeometryUtils.getGeometryFactory();

    public  final boolean useStreets;
    private Graph graph;
    private double radiusMeters;

    /* Fields used when finding stops via the street network. */
    private EarliestArrivalSearch earliestArrivalSearch;

    /* Fields used when finding stops without a street network. */
    private StreetVertexIndexService streetIndex;

    /**
     * Construct a NearbyStopFinder for the given graph and search radius, choosing whether to search via the street
     * network or straight line distance based on the presence of OSM street data in the graph.
     */
    public NearbyStopFinder(Graph graph, double radiusMeters) {
        this.graph = graph;
        this.useStreets = graph.hasStreets;
        this.radiusMeters = radiusMeters;
        if (useStreets) {
            earliestArrivalSearch = new EarliestArrivalSearch();
            // We need to accommodate straight line distance (in meters) but when streets are present we use an
            // earliest arrival search, which optimizes on time. Ideally we'd specify in meters,
            // but we don't have much of a choice here. Use the default walking speed to convert.
            earliestArrivalSearch.maxDuration = (int) (radiusMeters / new RoutingRequest().walkSpeed);
        } else {
            streetIndex = graph.streetIndex;
        }
    }

    /**
     * Find all unique nearby stops that are the closest stop on some trip pattern.
     * Note that the result will include the origin vertex if it is an instance of TransitStop.
     * This is intentional: we don't want to return the next stop down the line for trip patterns that pass through the
     * origin vertex.
     */
    public Set<StopAtDistance> findNearbyStopsConsideringPatterns (Vertex vertex, boolean wheelchairAccessible) {

        /* Track the closest stop on each pattern passing nearby. */
        SimpleIsochrone.MinMap<TripPattern, StopAtDistance> closestStopForPattern =
                new SimpleIsochrone.MinMap<TripPattern, StopAtDistance>();

        /* Iterate over nearby stops via the street network or using straight-line distance, depending on the graph. */
        for (NearbyStopFinder.StopAtDistance stopAtDistance : findNearbyStops(vertex, wheelchairAccessible)) {
            /* Filter out destination stops that are already reachable via pathways or transfers. */
            // FIXME why is the above comment relevant here? how does the next line achieve this?
            TransitStop ts1 = stopAtDistance.tstop;
            if (!ts1.isStreetLinkable()) continue;
            /* Consider this destination stop as a candidate for every trip pattern passing through it. */
            for (TripPattern pattern : graph.index.patternsForStop.get(ts1.getStop())) {
                // In certain GTFS feeds, there can be stops where all stop times do not allow boardings and therefore
                // should not be considered as candidates for creating transfer edges. Therefore, only add a stop for a
                // pattern if at least one of the stop times associated with the pattern allows boarding at this stop.
                // Otherwise, there will be issues with certain GTFS feeds where some trips end at an alight-only stop
                // and then other trips begin at the alight-only stop, but do not allow boarding there.
                //
                // TripPatterns are created based off of StopPatterns which differentiate between stop sequences with
                // the same stops, but different boarding and alighting values. Therefore, this check applies to all
                // possible stop pattern combinations.
                //
                // See this issue for further info: https://github.com/opentripplanner/OpenTripPlanner/issues/3026
                if (pattern.canBoard(pattern.getStops().indexOf(ts1.getStop()))) {
                    closestStopForPattern.putMin(pattern, stopAtDistance);
                }
            }
        }

        /* Make a transfer from the origin stop to each destination stop that was the closest stop on any pattern. */
        Set<StopAtDistance> uniqueStops = Sets.newHashSet();
        uniqueStops.addAll(closestStopForPattern.values());
        return uniqueStops;

    }


    /**
     * Return all stops within a certain radius of the given vertex, using network distance along streets.
     * Use the correct method depending on whether the graph has street data or not.
     * If the origin vertex is a TransitStop, the result will include it; this characteristic is essential for
     * associating the correct stop with each trip pattern in the vicinity.
     */
    public List<StopAtDistance> findNearbyStops (Vertex vertex, boolean wheelchairAccessible) {
        return useStreets ? findNearbyStopsViaStreets(vertex, wheelchairAccessible) : findNearbyStopsEuclidean(vertex);
    }

    /**
     * Return all stops within a certain radius of the given vertex, using network distance along streets.
     * If the origin vertex is a TransitStop, the result will include it.
     */
    public List<StopAtDistance> findNearbyStopsViaStreets(Vertex originVertex, boolean wheelchairAccessible) {
        ShortestPathTree spt = calculateWalkTree(originVertex, null, wheelchairAccessible);
        List<StopAtDistance> stopsFound = Lists.newArrayList();
        if (spt != null) {
            // TODO use GenericAStar and a traverseVisitor? Add an earliestArrival switch to genericAStar?
            for (State state : spt.getAllStates()) {
                Vertex targetVertex = state.getVertex();
                if (targetVertex == originVertex) continue;
                if (targetVertex instanceof TransitStop) {
                    stopsFound.add(stopAtDistanceForState(state));
                }
            }
        }
        /* Add the origin vertex if needed. The SPT does not include the initial state. FIXME shouldn't it? */
        if (originVertex instanceof TransitStop) {
            stopsFound.add(new StopAtDistance((TransitStop)originVertex, 0));
        }
        return stopsFound;

    }

    /**
     * Given an origin and destination calculate a shortest path tree.
     *
     * Can also be used to do a radius search to return all stops nearby.
     *
     * @param destination where the destination of the search should be. setting this to null will
     *                    lead to radius search where all stops in the vicinity are returned.
     */
    private ShortestPathTree calculateWalkTree(Vertex origin, Vertex destination, boolean wheelchairAccessible) {
        RoutingRequest routingRequest = new RoutingRequest(TraverseMode.WALK);
        routingRequest.clampInitialWait = (0L);
        routingRequest.wheelchairAccessible = wheelchairAccessible;
        // setting null as the destination vertex will lead to a radius search where all nearby stops are returned.
        routingRequest.setRoutingContext(graph, origin, destination);
        ShortestPathTree spt = earliestArrivalSearch.getShortestPathTree(routingRequest);
        routingRequest.cleanup();
        return spt;
    }

    /**
     * If you already know what the transfer stop is - for example when re-computing a transfer
     * to be wheelchair-accessible - use this method to calculate the path from the origin stop
     * to the transfer stop vertex.
     */
    public StopAtDistance calculateStopAtDistance(Vertex origin, Vertex destination, boolean wheelchairAccessible) {
        ShortestPathTree spt = calculateWalkTree(origin, destination, wheelchairAccessible);
        State state = spt.getState(destination);
        if(state == null) {
            return null;
        }
        return stopAtDistanceForState(state);
    }

    /**
     * Return all stops within a certain radius of the given vertex, using straight-line distance independent of streets.
     * If the origin vertex is a TransitStop, the result will include it.
     */
    public List<StopAtDistance> findNearbyStopsEuclidean (Vertex originVertex) {
        List<StopAtDistance> stopsFound = Lists.newArrayList();
        Coordinate c0 = originVertex.getCoordinate();
        for (TransitStop ts1 : streetIndex.getNearbyTransitStops(c0, radiusMeters)) {
            double distance = SphericalDistanceLibrary.distance(c0, ts1.getCoordinate());
            if (distance < radiusMeters) {
                Coordinate coordinates[] = new Coordinate[] {c0, ts1.getCoordinate()};
                StopAtDistance sd = new StopAtDistance(ts1, distance);
                sd.geom = geometryFactory.createLineString(coordinates);
                stopsFound.add(sd);
            }
        }
        return stopsFound;
    }

    /**
     * Represents a stop that is comparable to other stops on the basis of its distance from some point.
     */
    public static class StopAtDistance implements Comparable<StopAtDistance> {

        public TransitStop tstop;
        public double      dist;
        public LineString  geom;
        public List<Edge>  edges;

        public StopAtDistance(TransitStop tstop, double dist) {
            this.tstop = tstop;
            this.dist = dist;
        }

        @Override
        public int compareTo(StopAtDistance that) {
            return (int) (this.dist) - (int) (that.dist);
        }

        public String toString() {
            return String.format("stop %s at %.1f meters", tstop, dist);
        }

    }

    /**
     * Given a State at a TransitStop, bundle the TransitStop together with information about how far away it is
     * and the geometry of the path leading up to the given State.
     *
     * TODO this should probably be merged with similar classes in Profile routing.
     */
    public static StopAtDistance stopAtDistanceForState (State state) {
        double distance = 0.0;
        GraphPath graphPath = new GraphPath(state, false);
        CoordinateArrayListSequence coordinates = new CoordinateArrayListSequence();
        List<Edge> edges = new ArrayList<>();
        for (Edge edge : graphPath.edges) {
            if (edge instanceof StreetEdge) {
                LineString geometry = edge.getGeometry();
                if (geometry != null) {
                    if (coordinates.size() == 0) {
                        coordinates.extend(geometry.getCoordinates());
                    } else {
                        coordinates.extend(geometry.getCoordinates(), 1);
                    }
                }
                distance += edge.getDistance();
            }
            edges.add(edge);
        }
        if (coordinates.size() < 2) {   // Otherwise the walk step generator breaks.
            ArrayList<Coordinate> coordinateList = new ArrayList<Coordinate>(2);
            coordinateList.add(graphPath.states.get(1).getVertex().getCoordinate());
            State lastState = graphPath.states.getLast().getBackState();
            coordinateList.add(lastState.getVertex().getCoordinate());
            coordinates = new CoordinateArrayListSequence(coordinateList);
        }
        StopAtDistance sd = new StopAtDistance((TransitStop) state.getVertex(), distance);
        sd.geom = geometryFactory.createLineString(new PackedCoordinateSequence.Double(coordinates.toCoordinateArray()));
        sd.edges = edges;
        return sd;
    }


}

package org.opentripplanner.api.resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Supplier;
import java.util.stream.Stream;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.Geometry;
import org.locationtech.jts.geom.LineString;
import org.onebusaway.gtfs.model.FeedInfo;
import org.opentripplanner.api.model.BoardAlightType;
import org.opentripplanner.api.model.BookingRuleSummary;
import org.opentripplanner.api.model.Itinerary;
import org.opentripplanner.api.model.Leg;
import org.opentripplanner.api.model.Place;
import org.opentripplanner.api.model.RelativeDirection;
import org.opentripplanner.api.model.TransportationNetworkCompanySummary;
import org.opentripplanner.api.model.TripPlan;
import org.opentripplanner.api.model.VertexType;
import org.opentripplanner.api.model.WalkStep;
import org.opentripplanner.common.geometry.DirectionUtils;
import org.opentripplanner.common.geometry.GeometryUtils;
import org.opentripplanner.common.geometry.PackedCoordinateSequence;
import org.opentripplanner.common.model.P2;
import org.opentripplanner.gtfs.WheelchairAccess;
import org.opentripplanner.model.Agency;
import org.opentripplanner.model.BookingRule;
import org.opentripplanner.model.FeedScopedId;
import org.opentripplanner.model.Route;
import org.opentripplanner.model.Stop;
import org.opentripplanner.model.Trip;
import org.opentripplanner.profile.BikeRentalStationInfo;
import org.opentripplanner.routing.alertpatch.Alert;
import org.opentripplanner.routing.alertpatch.AlertPatch;
import org.opentripplanner.routing.core.RoutingContext;
import org.opentripplanner.routing.core.RoutingRequest;
import org.opentripplanner.routing.core.ServiceDay;
import org.opentripplanner.routing.core.State;
import org.opentripplanner.routing.core.StateEditor;
import org.opentripplanner.routing.core.TraverseMode;
import org.opentripplanner.routing.edgetype.AreaEdge;
import org.opentripplanner.routing.edgetype.ElevatorAlightEdge;
import org.opentripplanner.routing.edgetype.ElevatorBoardEdge;
import org.opentripplanner.routing.edgetype.FreeEdge;
import org.opentripplanner.routing.edgetype.HopEdge;
import org.opentripplanner.routing.edgetype.OnboardEdge;
import org.opentripplanner.routing.edgetype.PathwayEdge;
import org.opentripplanner.routing.edgetype.PatternEdge;
import org.opentripplanner.routing.edgetype.PatternInterlineDwell;
import org.opentripplanner.routing.edgetype.RentABikeOffEdge;
import org.opentripplanner.routing.edgetype.RentABikeOnEdge;
import org.opentripplanner.routing.edgetype.SimpleTransfer;
import org.opentripplanner.routing.edgetype.StreetEdge;
import org.opentripplanner.routing.edgetype.TimedTransferEdge;
import org.opentripplanner.routing.edgetype.TransitBoardAlight;
import org.opentripplanner.routing.edgetype.TripPattern;
import org.opentripplanner.routing.edgetype.flex.PartialPatternHop;
import org.opentripplanner.routing.edgetype.flex.TemporaryDirectPatternHop;
import org.opentripplanner.routing.error.TransportationNetworkCompanyAvailabilityException;
import org.opentripplanner.routing.error.TrivialPathException;
import org.opentripplanner.routing.graph.Edge;
import org.opentripplanner.routing.graph.Graph;
import org.opentripplanner.routing.graph.Vertex;
import org.opentripplanner.routing.location.TemporaryStreetLocation;
import org.opentripplanner.routing.services.FareService;
import org.opentripplanner.routing.spt.GraphPath;
import org.opentripplanner.routing.transportation_network_company.ArrivalTime;
import org.opentripplanner.routing.transportation_network_company.RideEstimate;
import org.opentripplanner.routing.transportation_network_company.TransportationNetworkCompanyService;
import org.opentripplanner.routing.trippattern.TripTimes;
import org.opentripplanner.routing.vertextype.*;
import org.opentripplanner.routing.vertextype.BikeParkVertex;
import org.opentripplanner.routing.vertextype.BikeRentalStationVertex;
import org.opentripplanner.routing.vertextype.CarRentalStationVertex;
import org.opentripplanner.routing.vertextype.ExitVertex;
import org.opentripplanner.routing.vertextype.OnboardDepartVertex;
import org.opentripplanner.routing.vertextype.StreetVertex;
import org.opentripplanner.routing.vertextype.TransitVertex;
import org.opentripplanner.routing.vertextype.VehicleRentalStationVertex;
import org.opentripplanner.util.PolylineEncoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A library class with only static methods used in converting internal GraphPaths to TripPlans, which are
 * returned by the OTP "planner" web service. TripPlans are made up of Itineraries, so the functions to produce them
 * are also bundled together here.
 */
public abstract class GraphPathToTripPlanConverter {

    private static final Logger LOG = LoggerFactory.getLogger(GraphPathToTripPlanConverter.class);
    private static final double MAX_ZAG_DISTANCE = 30; // TODO add documentation, what is a "zag"?

    /**
     * Generates a TripPlan from a set of paths
     */
    public static TripPlan generatePlan(List<GraphPath> paths, RoutingRequest request) {

        Locale requestedLocale = request.locale;

        GraphPath exemplar = paths.get(0);
        Vertex tripStartVertex = exemplar.getStartVertex();
        Vertex tripEndVertex = exemplar.getEndVertex();
        String startName = tripStartVertex.getName(requestedLocale);
        String endName = tripEndVertex.getName(requestedLocale);

        // Use vertex labels if they don't have names
        if (startName == null) {
            startName = tripStartVertex.getLabel();
        }
        if (endName == null) {
            endName = tripEndVertex.getLabel();
        }
        Place from = new Place(tripStartVertex.getX(), tripStartVertex.getY(), startName);
        Place to = new Place(tripEndVertex.getX(), tripEndVertex.getY(), endName);

        from.orig = request.from.name;
        to.orig = request.to.name;

        TripPlan plan = new TripPlan(from, to, request.getDateTime());

        // Convert GraphPaths to Itineraries, keeping track of the best non-transit (e.g. walk/bike-only) option time
        long bestNonTransitTime = Long.MAX_VALUE;
        List<Itinerary> itineraries = new LinkedList<>();
        for (GraphPath path : paths) {
            Itinerary itinerary = generateItinerary(
                    path,
                    request.showIntermediateStops,
                    request.disableAlertFiltering,
                    requestedLocale
            );
            itinerary = adjustItinerary(request, itinerary);
            if(itinerary.transitTime == 0 && itinerary.walkTime < bestNonTransitTime) {
                bestNonTransitTime = itinerary.walkTime;
            }
            itineraries.add(itinerary);
        }

        // Filter and add itineraries to plan
        for (Itinerary itinerary : itineraries) {
            // If this is a transit option whose walk/bike time is greater than that of the walk/bike-only option,
            // do not include in plan
            if(itinerary.transitTime > 0 && itinerary.walkTime > bestNonTransitTime) continue;

            // If this is a transit option and minTransitDistance is specified, do not include in plan if the
            // itinerary's total transit distance is less than minTransitDistance
            if (itinerary.transitTime > 0 && request.minTransitDistance != null) {
                double totalDistance = 0, transitDistance = 0;
                for (Leg leg : itinerary.legs) {
                    totalDistance += leg.distance;
                    if (leg.isTransitLeg()) transitDistance += leg.distance;
                }

                // Handle percentage case
                // TODO: handle number formatting errors
                if (request.minTransitDistance.endsWith("%")) {
                    double pctTransit = transitDistance / totalDistance;
                    double minPct = Double.parseDouble(request.minTransitDistance.substring(0, request.minTransitDistance.length() - 1)) / 100;
                    if (pctTransit < minPct) continue;
                } else {
                	double minDistance = Double.parseDouble(request.minTransitDistance);
                	if(transitDistance < minDistance) continue;
                }
            }

            // Add TNC data after the filter stage so that OTP does not make requests to a
            // rate-limited TNC API service for itineraries that ultimately never make it back to
            // the requester. It is possible that TNC service may not actually be available, so if
            // the method returns false, don't include this itinerary in the results.
            if (!addTNCData(exemplar, itinerary)) continue;
            plan.addItinerary(itinerary);
        }

        if (plan != null) {
            for (Itinerary i : plan.itinerary) {
                /* Communicate the fact that the only way we were able to get a response was by removing a slope limit. */
                i.tooSloped = request.rctx.slopeRestrictionRemoved;
                /* fix up from/to on first/last legs */
                if (i.legs.size() == 0) {
                    LOG.warn("itinerary has no legs");
                    continue;
                }
                
                Graph graph = exemplar.getRoutingContext().graph;
                for (Leg leg : i.legs) {
                    if (leg.isTransitLeg()) {
                    	org.opentripplanner.model.FeedInfo feedInfo = graph.getFeedInfo(leg.routeId.getAgencyId());
                    	if(feedInfo != null && feedInfo.getVersion() != null) {
                    		request.rctx.debugOutput.feeds.add(leg.routeId.getAgencyId()+":"+feedInfo.getVersion() );
                    	}
                    }
                }
                
                Leg firstLeg = i.legs.get(0);
                firstLeg.from.orig = plan.from.orig;
                Leg lastLeg = i.legs.get(i.legs.size() - 1);
                lastLeg.to.orig = plan.to.orig;
            }
        }
        request.rctx.debugOutput.finishedRendering();
        return plan;
    }

    /**
     * Check whether itinerary needs adjustments based on the request.
     * @param itinerary is the itinerary
     * @param request is the request containing the original trip planning options
     * @return the (adjusted) itinerary
     */
    private static Itinerary adjustItinerary(RoutingRequest request, Itinerary itinerary) {
        // Check walk limit distance
        if (itinerary.walkDistance > request.maxWalkDistance) {
            itinerary.walkLimitExceeded = true;
        }
        // Return itinerary
        return itinerary;
    }

    /**
     * Generate an itinerary from a {@link GraphPath}. This method first slices the list of states
     * at the leg boundaries. These smaller state arrays are then used to generate legs. Finally the
     * rest of the itinerary is generated based on the complete state array.
     *
     * @param path The graph path to base the itinerary on
     * @param showIntermediateStops Whether to include intermediate stops in the itinerary or not
     * @return The generated itinerary
     */
    public static Itinerary generateItinerary(
            GraphPath path,
            boolean showIntermediateStops,
            boolean disableAlertFiltering,
            Locale requestedLocale
    ) {
        Itinerary itinerary = new Itinerary();

        State[] states = new State[path.states.size()];
        State lastState = path.states.getLast();
        states = path.states.toArray(states);

        Edge[] edges = new Edge[path.edges.size()];
        edges = path.edges.toArray(edges);

        Graph graph = path.getRoutingContext().graph;

        FareService fareService = graph.getService(FareService.class);

        State[][] legsStates = sliceStates(states);

        for (State[] legStates : legsStates) {
            itinerary.addLeg(generateLeg(graph, legStates, showIntermediateStops, disableAlertFiltering, requestedLocale));
        }

        // getCost() needs legs to be generated first, for fare-by-leg support.
//        if (fareService != null) {
//            itinerary.fare = fareService.getCost(path, itinerary.legs);
//        }
        if (fareService != null) {
            itinerary.fare = fareService.getCost(path);
        }

        addWalkSteps(graph, itinerary.legs, legsStates, requestedLocale);

        fixupLegs(itinerary.legs, legsStates);

        addAccessibilityScore(itinerary.legs, legsStates);

        itinerary.duration = lastState.getElapsedTimeSeconds();
        itinerary.startTime = makeCalendar(states[0]);
        itinerary.endTime = makeCalendar(lastState);

        calculateTimes(itinerary, states);

        calculateElevations(itinerary, edges);

        itinerary.walkDistance = lastState.getWalkDistance();

        itinerary.transfers = lastState.getNumBoardings();
        if (itinerary.transfers > 0 && !(states[0].getVertex() instanceof OnboardDepartVertex)) {
            itinerary.transfers--;
        }

        return itinerary;
    }

    /**
     * Iterates over the legs and computes the accessibility scores for transit and walk
     * legs.
     */
    private static void addAccessibilityScore(List<Leg> legs, State[][] states) {
        RoutingRequest request = states[0][0].getOptions();
        for (int i = 0; i < legs.size(); i++) {
            Leg currentLeg = legs.get(i);
            State[] legStates = states[i];
            if (currentLeg.isTransitLeg()) {
                Trip trip = legStates[legStates.length - 1].getBackTrip();
                Leg nextLeg = null;
                int nextIndex = i + 1;
                if(nextIndex < legs.size()){
                    nextLeg = legs.get(nextIndex);
                }
                currentLeg.accessibilityScore =
                        computeAccessibilityScore(trip, currentLeg, nextLeg, request);
            }
            else if (currentLeg.mode.equals("WALK") && request.wheelchairAccessible) {
                currentLeg.accessibilityScore = computeWalkingAccessibilityScore(request, legStates);
            }
        }
    }

    /**
     * Computes the accessibility score for a walking leg from 0 (bad) to 1 (good).
     *
     * It consists of two parts:
     *
     * - if all street edges on the leg are wheelchair-accessible 0.5 is added to the score
     * - if there are no edges steeper than maxSlope another 0.5 is added
     *      - if there are edges steeper then those 0.5 are decreased by (excess degrees^2)/10
     *        this of course quickly degrades: everything that is more than 3 degrees
     *        steeper will have score of 0.
     */
    private static float computeWalkingAccessibilityScore(RoutingRequest request, State[] legStates) {
        Supplier<Stream<StreetEdge>> edges = () -> Arrays.stream(legStates)
                .map(State::getBackEdge)
                .filter(Objects::nonNull)
                .filter(StreetEdge.class::isInstance)
                .map(StreetEdge.class::cast);

        float score = 0;

        // calculate the worst percentage we go over the max slope
        // max slope is always above 0
        // see SlopeCosts.java: https://github.com/ibi-group/OpenTripPlanner/blob/08e034faace255e092211290220af3f60e553fa7/src/main/java/org/opentripplanner/routing/util/SlopeCosts.java#L7
        double maxSlopeExceeded = edges.get()
                .filter(s -> s.getMaxSlope() > request.maxSlope)
                .map(s -> s.getMaxSlope() - request.maxSlope)
                .mapToDouble(Double::doubleValue)
                .map(d -> d * 100)
                .max()
                .orElse(0);

        // for every percent of being over the max slope we decrease the score quadratically
        // so 2 percent over the max slope is 4 times as bad as being 1 percent over.
        // this quickly degrades to 0: being 3 degrees over the max slope can at best give you
        // a score 0.1, everything worse will give you a score of 0!
        double slopeMalus = (maxSlopeExceeded * maxSlopeExceeded) / 10;

        score += (0.5 - slopeMalus);

        boolean allEdgesAreAccessible = edges.get().allMatch(StreetEdge::isWheelchairAccessible);
        if (allEdgesAreAccessible) {
           score += 0.5f;
        }

        return Math.max(score, 0);
    }

    private static Calendar makeCalendar(State state) {
        RoutingContext rctx = state.getContext();
        TimeZone timeZone = rctx.graph.getTimeZone();
        return makeCalendar(timeZone, state.getTimeInMillis());
    }

    private static Calendar makeCalendar(TimeZone timeZone, long timeMillis) {
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.setTimeInMillis(timeMillis);
        return calendar;
    }

    /**
     * Generate a {@link CoordinateArrayListSequence} based on an {@link Edge} array.
     *
     * @param edges The array of input edges
     * @return The coordinates of the points on the edges
     */
    public static CoordinateArrayListSequence makeCoordinates(Edge[] edges) {
        CoordinateArrayListSequence coordinates = new CoordinateArrayListSequence();

        for (Edge edge : edges) {
            LineString geometry = edge.getDisplayGeometry();

            if (geometry != null) {
                if (coordinates.size() == 0) {
                    coordinates.extend(geometry.getCoordinates());
                } else {
                    coordinates.extend(geometry.getCoordinates(), 1); // Avoid duplications
                }
            }
        }

        return coordinates;
    }

    /**
     * Slice a {@link State} array at the leg boundaries. Leg switches occur when:
     * 1. A LEG_SWITCH mode (which itself isn't part of any leg) is seen
     * 2. The mode changes otherwise, for instance from BICYCLE to WALK
     * 3. A PatternInterlineDwell edge (i.e. interlining) is seen
     *
     * @param states The one-dimensional array of input states
     * @return An array of arrays of states belonging to a single leg (i.e. a two-dimensional array)
     */
    private static State[][] sliceStates(State[] states) {
        boolean trivial = true;

        for (State state : states) {
            TraverseMode traverseMode = state.getBackMode();

            if (traverseMode != null && traverseMode != TraverseMode.LEG_SWITCH) {
                trivial = false;
                break;
            }
        }

        if (trivial) {
            throw new TrivialPathException();
        }

        int[] legIndexPairs = {0, states.length - 1};
        List<int[]> legsIndexes = new ArrayList<int[]>();

        for (int i = 1; i < states.length - 1; i++) {
            TraverseMode backMode = states[i].getBackMode();
            TraverseMode forwardMode = states[i + 1].getBackMode();

            if (backMode == null || forwardMode == null) continue;

            Edge edge = states[i + 1].getBackEdge();

            if (backMode == TraverseMode.LEG_SWITCH || forwardMode == TraverseMode.LEG_SWITCH) {
                if (backMode != TraverseMode.LEG_SWITCH) {              // Start of leg switch
                    legIndexPairs[1] = i;
                } else if (forwardMode != TraverseMode.LEG_SWITCH) {    // End of leg switch
                    // if the start edge of the first state in the current leg index pair is a TransitBoardAlight edge
                    // and the edge of the state just after the current leg index pair is a TransitBoardAlight edge,
                    // then make that index be the final state of the current leg. This is to ensure that alerts
                    // associated with TransitBoardAlight vertices are able to be found for legs.
                    if (
                        states[legIndexPairs[0]].getBackMode() != null &&
                        states[legIndexPairs[0]].backEdge instanceof TransitBoardAlight &&
                            states[legIndexPairs[1] + 1].backEdge instanceof TransitBoardAlight &&
                            legIndexPairs[1] + 1 < states.length - 1
                    ) {
                        legIndexPairs[1] = legIndexPairs[1] + 1;
                    }
                    if (legIndexPairs[1] != states.length - 1) {
                        legsIndexes.add(legIndexPairs);
                    }
                    legIndexPairs = new int[] {i, states.length - 1};
                }
            } else if (backMode != forwardMode) {                       // Mode change => leg switch
                legIndexPairs[1] = i;
                legsIndexes.add(legIndexPairs);
                legIndexPairs = new int[] {i, states.length - 1};
            } else if (edge instanceof PatternInterlineDwell) {         // Interlining => leg switch
                legIndexPairs[1] = i;
                legsIndexes.add(legIndexPairs);
                legIndexPairs = new int[] {i + 1, states.length - 1};
            }
        }

        // Final leg
        legsIndexes.add(legIndexPairs);

        State[][] legsStates = new State[legsIndexes.size()][];

        // Fill the two-dimensional array with states
        for (int i = 0; i < legsStates.length; i++) {
            legIndexPairs = legsIndexes.get(i);
            legsStates[i] = new State[legIndexPairs[1] - legIndexPairs[0] + 1];
            for (int j = 0; j <= legIndexPairs[1] - legIndexPairs[0]; j++) {
                legsStates[i][j] = states[legIndexPairs[0] + j];
            }
        }

        return legsStates;
    }

    /**
     * Generate one leg of an itinerary from a {@link State} array.
     *
     * @param states The array of states to base the leg on
     * @param showIntermediateStops Whether to include intermediate stops in the leg or not
     * @return The generated leg
     */
    private static Leg generateLeg(Graph graph, State[] states, boolean showIntermediateStops, boolean disableAlertFiltering, Locale requestedLocale) {
        Leg leg = new Leg();

        Edge[] edges = new Edge[states.length - 1];

        leg.startTime = makeCalendar(states[0]);
        leg.endTime = makeCalendar(getLastOnboardTransitState(states));

        // Calculate leg distance and fill array of edges
        leg.distance = 0.0;
        for (int i = 0; i < edges.length; i++) {
            edges[i] = states[i + 1].getBackEdge();
            leg.distance += edges[i].getDistance();
        }

        TimeZone timeZone = leg.startTime.getTimeZone();
        leg.agencyTimeZoneOffset = timeZone.getOffset(leg.startTime.getTimeInMillis());

        
        
        addTripFields(leg, states, requestedLocale, graph);

        addPlaces(leg, states, edges, showIntermediateStops, requestedLocale);

        CoordinateArrayListSequence coordinates = makeCoordinates(edges);
        Geometry geometry = GeometryUtils.getGeometryFactory().createLineString(coordinates);

        leg.legGeometry = PolylineEncoder.createEncodings(geometry);

        leg.interlineWithPreviousLeg = states[0].getBackEdge() instanceof PatternInterlineDwell;

        addFrequencyFields(states, leg);

        leg.rentedBike = states[0].isBikeRenting() && states[states.length - 1].isBikeRenting();

        leg.rentedCar = states[0].isCarRenting() && states[states.length - 1].isCarRenting();

        leg.rentedVehicle = states[0].isVehicleRenting() && states[states.length - 1].isVehicleRenting();

        // check at start or end because either could be the very beginning or end of the trip
        // which are temporary edges and stuff
        leg.hailedCar = states[0].isUsingHailedCar() || states[states.length - 1].isUsingHailedCar();
        

        addModeAndAlerts(graph, leg, states, disableAlertFiltering, requestedLocale);
        if (leg.isTransitLeg()) {
            addRealTimeData(leg, states);
            
            leg.hasBikeOnBoard = states[0].hasOnBoardBike == 1 && states[states.length - 1].hasOnBoardBike == 1;

            leg.interStopGeometry = new ArrayList<>();
            for (Edge edge : edges) {
                if (edge instanceof HopEdge) {
                    LineString edgeGeom = edge.getGeometry();
                    CoordinateArrayListSequence edgeCoords = new CoordinateArrayListSequence();
                    edgeCoords.extend(edgeGeom.getCoordinates());
                    Geometry geom = GeometryUtils.getGeometryFactory().createLineString(edgeCoords);
                    leg.interStopGeometry.add(PolylineEncoder.createEncodings(geom));
                }
            }
        }
        return leg;
    }

    private static BookingRuleSummary addBookingRule(Graph graph, Trip trip, Agency agency) {
    	if(trip.getRoute().getBookingRule() != null) {
    		return new BookingRuleSummary(trip.getRoute().getBookingRule());
    	}else{
            BookingRule bookingRule = new BookingRule();
            bookingRule.setMessage("INFO");
            bookingRule.setType(0);
            if(agency.getFareUrl() != null){
                bookingRule.setInfoUrl(agency.getFareUrl());
            }else{
                bookingRule.setInfoUrl(agency.getUrl());
            }

            return new BookingRuleSummary(bookingRule);
        }
	}


	/**
     * Adds TNC data to legs with {@link Leg#hailedCar}=true. This makes asynchronous, concurrent requests to the TNC
     * provider's API for price and ETA estimates and associates this data with its respective TNC leg.
     *
     * @return boolean. If false, this means that the availability of TNC service cannot be confirmed.
     */
    private static boolean addTNCData(
        GraphPath path,
        Itinerary itinerary
    ) {
        Graph graph = path.getRoutingContext().graph;
        RoutingRequest request = path.states.getFirst().getOptions();
        String companies = request.companies;
        if (companies == null) {
            // no companies, therefore this request doesn't have any TNC data to add. Return true
            // to indicate no need for removal of this itinerary.
            return true;
        }
        // Store async tasks in lists for any TNC legs that need info.
        List<Callable<List<ArrivalTime>>> arrivalEstimateTasks = new ArrayList<>();
        List<Callable<List<RideEstimate>>> priceEstimateTasks = new ArrayList<>();
        // Keep track of TNC legs here (so the TNC responses can be filled in later).
        List<Leg> tncLegs = new ArrayList<>();
        List<Boolean> tncLegsAreFromOrigin = new ArrayList<>();
        TransportationNetworkCompanyService service = graph.getService(TransportationNetworkCompanyService.class);
        // Accumulate TNC request tasks for each TNC leg.
        for (int i = 0; i < itinerary.legs.size(); i++) {
            Leg leg = itinerary.legs.get(i);
            if (!leg.hailedCar) continue;
            tncLegs.add(leg);
            // If handling the first or second leg, do not attempt to get an arrival estimate for
            // the leg from location and instead use the trip's start location.  Do this is because:
            // 1.  If it is the first leg, this means the trip began with a user taking a TNC
            // 2.  If it is the second leg and the first leg was walking, the itinerary includes
            // walking a little bit to the TNC pickup location, but the graph search still used the
            // ETA for the request's from location.
            //
            // This avoids unnecessary/redundant API requests to TNC providers.
            Place from = leg.from;
            if (request.transportationNetworkCompanyEtaAtOrigin > -1 &&
                (i == 0 || (i == 1 && itinerary.legs.get(0).mode.equals("WALK")))) {
                from = new Place(request.from.lng, request.from.lat, request.from.name);
                tncLegsAreFromOrigin.add(true);
            } else {
                tncLegsAreFromOrigin.add(false);
            }
            Place finalFrom = from;
            priceEstimateTasks.add(() -> service.getRideEstimates(companies, finalFrom, leg.to, leg.distance.doubleValue()));
            arrivalEstimateTasks.add(() -> service.getArrivalTimes(companies, finalFrom));
        }

        // This variable is used to keep track of whether an API error was encountered thus calling
        // into question whether the TNC trip is possible at all. This typically happens when a TNC
        // company says that it does not provide service at an error. Since the TNC companies don't
        // have readily available APIs it's kinda anyone's best guess as to whether TNC service is
        // available somewhere, but for the most part OTP assumes that TNC service is available
        // within walking distance of transit.
        boolean encounteredError = false;
        if (tncLegs.size() > 0) {
            // Use a thread pool so that requests are asynchronous and concurrent. # of threads
            // should accommodate 2x however many TNC legs there are.
            ExecutorService pool = Executors.newFixedThreadPool(tncLegs.size() * 2);

            try {
                // Execute TNC requests.
                List<Future<List<ArrivalTime>>> etaResults = pool.invokeAll(arrivalEstimateTasks);
                List<Future<List<RideEstimate>>> priceResults = pool.invokeAll(priceEstimateTasks);
                int resultCount = priceResults.size() + etaResults.size();
                LOG.info("Collating {} TNC results for {} legs for {}", resultCount, tncLegs.size(), itinerary);
                // Collate results into itinerary legs.
                for (int i = 0; i < tncLegs.size(); i++) {
                    // Choose the TNC result with the fastest ride time or ride time and ETA time if it is the first leg
                    int bestTime = Integer.MAX_VALUE;
                    ArrivalTime bestArrivalTime = null;
                    RideEstimate bestRideEstimate = null;

                    List<ArrivalTime> arrivalTimes = etaResults.get(i).get();
                    List<RideEstimate> rideEstimates = priceResults.get(i).get();
                    boolean tncLegIsFromOrigin = tncLegsAreFromOrigin.get(i);

                    for (ArrivalTime arrivalTime : arrivalTimes) {
                        for (RideEstimate rideEstimate : rideEstimates) {
                            // check if the arrival and ride estimate match and also if the
                            // arrival and ride estimate match the wheelchair accessibility option
                            // set in the routing request
                            if (
                                arrivalTime.company.equals(rideEstimate.company) &&
                                    arrivalTime.productId.equals(rideEstimate.rideType) &&
                                    arrivalTime.wheelchairAccessible == request.wheelchairAccessible &&
                                    rideEstimate.wheelchairAccessible == request.wheelchairAccessible
                            ) {
                                int combinedTime = rideEstimate.duration +
                                    (tncLegIsFromOrigin ? arrivalTime.estimatedSeconds : 0);
                                if (combinedTime < bestTime) {
                                    bestTime = combinedTime;
                                    bestArrivalTime = arrivalTime;
                                    bestRideEstimate = rideEstimate;
                                }
                            }
                        }
                    }
                    if (bestArrivalTime == null || bestRideEstimate == null) {
                        // this occurs when TNC service is actually not available at a certain
                        // location which results in empty responses for arrival and ride estimates.
                        // The error thrown here is caught within this method below.
                        throw new TransportationNetworkCompanyAvailabilityException();
                    }
                    tncLegs.get(i).tncData = new TransportationNetworkCompanySummary(
                        bestRideEstimate,
                        bestArrivalTime
                    );
                }
            } catch (TransportationNetworkCompanyAvailabilityException e) {
                LOG.warn("Removing itinerary due to TNC unavailability");
                encounteredError = true;
            } catch (Exception e) {
                LOG.error("Error fetching TNC data");
                e.printStackTrace();
                encounteredError = true;
            }
            // Shutdown thread pool.
            pool.shutdown();
        }
        return !encounteredError;
    }

    private static void addFrequencyFields(State[] states, Leg leg) {
        /* TODO adapt to new frequency handling.
        if (states[0].getBackEdge() instanceof FrequencyBoard) {
            State preBoardState = states[0].getBackState();

            FrequencyBoard fb = (FrequencyBoard) states[0].getBackEdge();
            FrequencyBasedTripPattern pt = fb.getPattern();
            int boardTime;
            if (preBoardState.getServiceDay() == null) {
                boardTime = 0; //TODO why is this happening?
            } else {
                boardTime = preBoardState.getServiceDay().secondsSinceMidnight(
                        preBoardState.getTimeSeconds());
            }
            int period = pt.getPeriod(fb.getStopIndex(), boardTime); //TODO fix

            leg.isNonExactFrequency = !pt.isExact();
            leg.headway = period;
        }
        */
    }

    /**
     * Add a {@link WalkStep} {@link List} to a {@link Leg} {@link List}.
     * It's more convenient to process all legs in one go because the previous step should be kept.
     *
     * @param legs The legs of the itinerary
     * @param legsStates The states that go with the legs
     */
    private static void addWalkSteps(Graph graph, List<Leg> legs, State[][] legsStates, Locale requestedLocale) {
        WalkStep previousStep = null;

        String lastMode = null;

        BikeRentalStationVertex onVertex = null, offVertex = null;

        for (int i = 0; i < legsStates.length; i++) {
            List<WalkStep> walkSteps = generateWalkSteps(graph, legsStates[i], previousStep, requestedLocale);
            String legMode = legs.get(i).mode;
            if(legMode != lastMode && !walkSteps.isEmpty()) {
                walkSteps.get(0).newMode = legMode;
                lastMode = legMode;
            }

            legs.get(i).walkSteps = walkSteps;

            if (walkSteps.size() > 0) {
                previousStep = walkSteps.get(walkSteps.size() - 1);
            } else {
                previousStep = null;
            }
        }
    }

    /**
     * This was originally in TransitUtils.handleBoardAlightType.
     * Edges that always block traversal (forbidden pickups/dropoffs) are simply not ever created.
     */
    public static String getBoardAlightMessage (int boardAlightType) {
        switch (boardAlightType) {
        case 1:
            return "impossible";
        case 2:
            return "mustPhone";
        case 3:
            return "coordinateWithDriver";
        default:
            return null;
        }
    }

    /**
     * Fix up a {@link Leg} {@link List} using the information available at the leg boundaries.
     * This method will fill holes in the arrival and departure times associated with a
     * {@link Place} within a leg and add board and alight rules. It will also ensure that stop
     * names propagate correctly to the non-transit legs that connect to them.
     *
     * @param legs The legs of the itinerary
     * @param legsStates The states that go with the legs
     */
    private static void fixupLegs(List<Leg> legs, State[][] legsStates) {
        for (int i = 0; i < legsStates.length; i++) {
            boolean toOther = i + 1 < legsStates.length && legs.get(i + 1).interlineWithPreviousLeg;
            boolean fromOther = legs.get(i).interlineWithPreviousLeg;
            String boardRule = null;
            String alightRule = null;

            for (int j = 1; j < legsStates[i].length; j++) {
                Edge backEdge = legsStates[i][j].getBackEdge();
                if (backEdge instanceof TimedTransferEdge) {
                    // TimedTransferEdges bypass the street network (thus not resulting in the traversal of pathway
                    // edges) and are going to force a transfer (thus not interlining with a previous leg). Therefore,
                    // this loop can be exited safely since this information does not need to be collected. If this loop
                    // isn't exited from in this case, an ArrayIndexOutOfBounds exception might occur resulting from a
                    // mismatch of transit data in the leg state data info (which might be another bug in itself (at
                    // least with the data inserted into the Leg instance representing the timed transfer)).
                    break;
                }
                if (backEdge instanceof PatternEdge) {
                    PatternEdge patternEdge = (PatternEdge) backEdge;
                    TripPattern tripPattern = patternEdge.getPattern();

                    Integer fromIndex = legs.get(i).from.stopIndex;
                    Integer toIndex = legs.get(i).to.stopIndex;

                    int boardType = (fromIndex != null) ? (tripPattern.getBoardType(fromIndex)) : 0;
                    int alightType = (toIndex != null) ? (tripPattern.getAlightType(toIndex)) : 0;

                    boardRule = getBoardAlightMessage(boardType);
                    alightRule = getBoardAlightMessage(alightType);
                }
                if (backEdge instanceof PathwayEdge) {
                    legs.get(i).pathway = true;
                }
            }

            if (i + 1 < legsStates.length) {
                legs.get(i + 1).from.arrival = legs.get(i).to.arrival;
                legs.get(i).to.departure = legs.get(i + 1).from.departure;

                if (legs.get(i).isTransitLeg() && !legs.get(i + 1).isTransitLeg()) {
                    legs.get(i + 1).from = legs.get(i).to;
                }
                if (!legs.get(i).isTransitLeg() && legs.get(i + 1).isTransitLeg()) {
                    legs.get(i).to = legs.get(i + 1).from;
                }
            }

            if (legs.get(i).isTransitLeg()) {
                if (boardRule != null && !fromOther) {      // If boarding in some other leg
                    legs.get(i).boardRule = boardRule;      // (interline), don't board now.
                }
                if (alightRule != null && !toOther) {       // If alighting in some other
                    legs.get(i).alightRule = alightRule;    // leg, don't alight now.
                }
            }
        }
    }

    /**
     * Calculate the walkTime, transitTime and waitingTime of an {@link Itinerary}.
     *
     * @param itinerary The itinerary to calculate the times for
     * @param states The states that go with the itinerary
     */
    private static void calculateTimes(Itinerary itinerary, State[] states) {
        for (State state : states) {
            if (state.getBackMode() == null) continue;

            switch (state.getBackMode()) {
            default:
                itinerary.transitTime += state.getTimeDeltaSeconds();
                break;

            case LEG_SWITCH:
                itinerary.waitingTime += state.getTimeDeltaSeconds();
                break;

            case WALK:
            case BICYCLE:
            case CAR:
                itinerary.walkTime += state.getTimeDeltaSeconds();
            }
        }
    }

    /**
     * Calculate the elevationGained and elevationLost fields of an {@link Itinerary}.
     *
     * @param itinerary The itinerary to calculate the elevation changes for
     * @param edges The edges that go with the itinerary
     */
    private static void calculateElevations(Itinerary itinerary, Edge[] edges) {
        for (Edge edge : edges) {
            if (!(edge instanceof StreetEdge)) continue;

            StreetEdge edgeWithElevation = (StreetEdge) edge;
            PackedCoordinateSequence coordinates = edgeWithElevation.getElevationProfile();

            if (coordinates == null) continue;
            // TODO Check the test below, AFAIU current elevation profile has 3 dimensions.
            if (coordinates.getDimension() != 2) continue;

            for (int i = 0; i < coordinates.size() - 1; i++) {
                double change = coordinates.getOrdinate(i + 1, 1) - coordinates.getOrdinate(i, 1);

                if (change > 0) {
                    itinerary.elevationGained += change;
                } else if (change < 0) {
                    itinerary.elevationLost -= change;
                }
            }
        }
    }

    /**
     * Add mode and alerts fields to a {@link Leg}.
     *
     * @param leg The leg to add the mode and alerts to
     * @param states The states that go with the leg
     */
    private static void addModeAndAlerts(Graph graph, Leg leg, State[] states, boolean disableAlertFiltering, Locale requestedLocale) {
        for (State state : states) {
            TraverseMode mode = state.getBackMode();
            Set<Alert> alerts = graph.streetNotesService.getNotes(state);
            Edge edge = state.getBackEdge();

            // Update the mode for each state, unless it is null or a LEG_SWITCH mode
            if (mode != null && mode != TraverseMode.LEG_SWITCH) {
                leg.mode = mode.toString();
            }

            if (alerts != null) {
                for (Alert alert : alerts) {
                    leg.addAlert(alert, requestedLocale);
                }
            }


            for (AlertPatch alertPatch : graph.getAlertPatches(edge)) {
                if (disableAlertFiltering || alertPatch.displayDuring(state)) {
                    if (alertPatch.hasTrip()) {
                        // If the alert patch contains a trip and that trip match this leg only add the alert for
                        // this leg.
                        if (alertPatch.getTrip().equals(leg.tripId)) {
                            leg.addAlert(alertPatch.getAlert(), requestedLocale);
                        }
                    } else {
                        // If we are not matching a particular trip add all known alerts for this trip pattern.
                        leg.addAlert(alertPatch.getAlert(), requestedLocale);
                    }
                }
            }
        }
    }

    /**
     * Add trip-related fields to a {@link Leg}.
     *
     * @param leg The leg to add the trip-related fields to
     * @param states The states that go with the leg
     * @param graph 
     */
     
    
    private static void addTripFields(Leg leg, State[] states, Locale requestedLocale, Graph graph) {
        Trip trip = states[states.length - 1].getBackTrip();

        if (trip != null) {
            Route route = trip.getRoute();
            Agency agency = route.getAgency();
            State lastOnboardTransitState = getLastOnboardTransitState(states);
            ServiceDay serviceDay = lastOnboardTransitState.getServiceDay();

            leg.agencyId = agency.getId();
            leg.agencyName = agency.getName();
            leg.agencyUrl = agency.getUrl();
            leg.agencyBrandingUrl = agency.getBrandingUrl();
            leg.agencyFareUrl = agency.getFareUrl();
            
            if(graph!= null) {
            	leg.agencyBookingRule = addBookingRule(graph,trip, agency);
            }
            
            leg.headsign = states[1].getBackDirection();
            leg.route = lastOnboardTransitState.getBackEdge().getName(requestedLocale);
            leg.routeColor = route.getColor();
            leg.routeId = route.getId();
            leg.routeLongName = route.getLongName();
            leg.routeShortName = route.getShortName();
            leg.routeTextColor = route.getTextColor();
            leg.routeType = route.getType();
            leg.routeBrandingUrl = route.getBrandingUrl();
            leg.routeRegionalFareCardAccepted = route.getRegionalFareCardAccepted();
            leg.tripId = trip.getId();
            leg.tripShortName = trip.getTripShortName();
            leg.tripBlockId = trip.getBlockId();
            leg.flexDrtAdvanceBookMin = trip.getDrtAdvanceBookMin();
            leg.flexDrtPickupMessage = trip.getDrtPickupMessage();
            leg.flexDrtDropOffMessage = trip.getDrtDropOffMessage();
            leg.flexFlagStopPickupMessage = trip.getContinuousPickupMessage();
            leg.flexFlagStopDropOffMessage = trip.getContinuousDropOffMessage();

            if (serviceDay != null) {
                leg.serviceDate = serviceDay.getServiceDate().getAsString();
            }

            if (leg.headsign == null) {
                leg.headsign = trip.getTripHeadsign();
            }

            Edge edge = lastOnboardTransitState.backEdge;
            if (edge instanceof TemporaryDirectPatternHop) {
                leg.callAndRide = true;
            }
            if (edge instanceof PartialPatternHop) {
                PartialPatternHop hop = (PartialPatternHop) edge;
                int directTime = hop.getDirectVehicleTime();
                TripTimes tt = lastOnboardTransitState.getTripTimes();
                int maxTime = tt.getDemandResponseMaxTime(directTime);
                int avgTime = tt.getDemandResponseAvgTime(directTime);
                int delta = maxTime - avgTime;
                if (directTime != 0 && delta > 0) {
                    if (hop.isDeviatedRouteBoard()) {
                        long maxStartTime = leg.startTime.getTimeInMillis() + (delta * 1000);
                        leg.flexCallAndRideMaxStartTime = makeCalendar(leg.startTime.getTimeZone(), maxStartTime);
                    }
                    if (hop.isDeviatedRouteAlight()) {
                        long minEndTime = leg.endTime.getTimeInMillis() - (delta * 1000);
                        leg.flexCallAndRideMinEndTime = makeCalendar(leg.endTime.getTimeZone(), minEndTime);
                    }
                }
            }

        }
    }

    /**
     * Computes how easy a leg is to use for a wheelchair user on a scale from 0 to 1 where
     * 0 is bad and 1 is good.
     *
     * The score is computed as follows: each the trip and the board and alight stops count
     * 1/3 of the score.
     *
     * If there are interlined transfers then the alight/board stop pairs are not taken into account
     * as the passengers don't leave the vehicle.
     */
    private static Float computeAccessibilityScore(
            Trip trip,
            Leg currentLeg,
            Leg nextLeg,
            RoutingRequest options
    ) {
        if (options.wheelchairAccessible) {
            List<Float> scores = new ArrayList<>();

            if(currentLeg.interlineWithPreviousLeg == null || !currentLeg.interlineWithPreviousLeg) {
                float fromScore = computeAccessibilityScore(currentLeg.from.wheelchairBoarding);
                scores.add(fromScore);
            }

            if(nextLeg == null || nextLeg.interlineWithPreviousLeg == null || !nextLeg.interlineWithPreviousLeg) {
                float toScore = computeAccessibilityScore(currentLeg.to.wheelchairBoarding);
                scores.add(toScore);
            }

            float tripScore = computeAccessibilityScore(
                    WheelchairAccess.fromGtfsValue(trip.getWheelchairAccessible()));
            scores.add(tripScore);

            // sadly there doesn't seem to be a mapToFloat, so we have to convert
            double sum = scores.stream().mapToDouble(Float::doubleValue).sum();

            return (float) sum / scores.size();
        }
        else {
            return null;
        }
    }

    /**
     * Converts a WheelchairAccess value into a numeric score between 0 and 1. These individual
     * score (for stops for example) can then be added up to compute a compound score for a leg
     * or an itinerary.
     */
    private static float computeAccessibilityScore(WheelchairAccess access) {
        switch(access) {
            case ALLOWED: // is accessible
                return 1;
            case NOT_ALLOWED: // not accessible
                return 0;
            default: // don't know
                return 0.5f;
        }
    }

    /**
     * Add {@link Place} fields to a {@link Leg}.
     * There is some code duplication because of subtle differences between departure, arrival and
     * intermediate stops.
     *
     * @param leg The leg to add the places to
     * @param states The states that go with the leg
     * @param edges The edges that go with the leg
     * @param showIntermediateStops Whether to include intermediate stops in the leg or not
     */
    private static void addPlaces(Leg leg, State[] states, Edge[] edges, boolean showIntermediateStops,
        Locale requestedLocale) {
        Vertex firstVertex = states[0].getVertex();
        Vertex lastVertex = states[states.length - 1].getVertex();

        Stop firstStop = firstVertex instanceof TransitVertex ?
            ((TransitVertex) firstVertex).getStop(): null;
        Stop lastStop = lastVertex instanceof TransitVertex ?
            ((TransitVertex) lastVertex).getStop(): null;
        TripTimes tripTimes = states[states.length - 1].getTripTimes();

        leg.from = makePlace(states[0], firstVertex, edges[0], firstStop, tripTimes, requestedLocale);
        leg.from.arrival = null;
        leg.to = makePlace(getLastOnboardTransitState(states), lastVertex, null, lastStop, tripTimes, requestedLocale);
        leg.to.departure = null;

        if(leg.from.vertexSubType != null) {
        	leg.vehicleType = leg.from.vertexSubType;
        }
        
        if (showIntermediateStops) {
            leg.stop = new ArrayList<Place>();

            Stop previousStop = null;
            Stop currentStop;

            for (int i = 1; i < edges.length; i++) {
                Vertex vertex = states[i].getVertex();

                if (!(vertex instanceof TransitVertex)) continue;

                currentStop = ((TransitVertex) vertex).getStop();
                if (currentStop == firstStop) continue;

                if (currentStop == previousStop) {                  // Avoid duplication of stops
                    leg.stop.get(leg.stop.size() - 1).departure = makeCalendar(states[i]);
                    continue;
                }

                previousStop = currentStop;
                if (currentStop == lastStop) break;

                leg.stop.add(makePlace(states[i], vertex, edges[i], currentStop, tripTimes, requestedLocale));
            }
        }
    }

    /**
     * In some leg states, the final state might be a TransitBoardAlight edge type, where instead we may want an edge
     * containing information about the transit route/pattern/etc. This method will find and return the correct state to
     * use for calculating transit-related items for a leg.
     *
     * @param states An array of states representing a leg
     */
    private static State getLastOnboardTransitState(State[] states) {
        int lastTransitStateIndex = states[states.length - 1].backEdge instanceof TransitBoardAlight
            ? states.length - 2
            : states.length - 1;
        return states[lastTransitStateIndex];
    }

    /**
     * Make a {@link Place} to add to a {@link Leg}.
     *
     * @param state The {@link State} that the {@link Place} pertains to.
     * @param vertex The {@link Vertex} at the {@link State}.
     * @param edge The {@link Edge} leading out of the {@link Vertex}.
     * @param stop The {@link Stop} associated with the {@link Vertex}.
     * @param tripTimes The {@link TripTimes} associated with the {@link Leg}.
     * @return The resulting {@link Place} object.
     */
    private static Place makePlace(State state, Vertex vertex, Edge edge, Stop stop, TripTimes tripTimes, Locale requestedLocale) {
        // If no edge was given, it means we're at the end of this leg and need to work around that.
        boolean endOfLeg = (edge == null);
        String name = vertex.getName(requestedLocale);

        //This gets nicer names instead of osm:node:id when changing mode of transport
        //Names are generated from all the streets in a corner, same as names in origin and destination
        //We use name in TemporaryStreetLocation since this name generation already happened when temporary location was generated
        if (vertex instanceof StreetVertex && !(vertex instanceof TemporaryStreetLocation)) {
            name = ((StreetVertex) vertex).getIntersectionName(requestedLocale).toString(requestedLocale);
        }
        Place place = new Place(vertex.getX(), vertex.getY(), name,
            makeCalendar(state), makeCalendar(state));

        if (endOfLeg) edge = state.getBackEdge();

        // Add vertex type information to the place. For example, a transit stop gets stop attributes attached and bike
        // share (or other vehicle rental types) will get information about the vehicle ID and networks served.
        if (vertex instanceof TransitVertex && edge instanceof OnboardEdge) {
            place.stopId = stop.getId();
            place.wheelchairBoarding = WheelchairAccess.fromGtfsValue(stop.getWheelchairBoarding());
            place.stopCode = stop.getCode();
            place.platformCode = stop.getPlatformCode();
            place.zoneId = stop.getZoneId();
            place.stopIndex = ((OnboardEdge) edge).getStopIndex();
            // TransitBoardAlight edges don't advance the stopIndex, so don't increment if one is encountered at the end
            if (endOfLeg && !(edge instanceof TransitBoardAlight)) place.stopIndex++;
            if (tripTimes != null) {
                place.stopSequence = tripTimes.getStopSequence(place.stopIndex);
            }
            place.vertexType = VertexType.TRANSIT;
            place.boardAlightType = BoardAlightType.DEFAULT;
            if (edge instanceof PartialPatternHop) {
                PartialPatternHop hop = (PartialPatternHop) edge;
                if (hop.hasBoardArea() && !endOfLeg) {
                    place.flagStopArea = PolylineEncoder.createEncodings(hop.getBoardArea());
                }
                if (hop.hasAlightArea() && endOfLeg) {
                    place.flagStopArea = PolylineEncoder.createEncodings(hop.getAlightArea());
                }
                if ((endOfLeg && hop.isFlagStopAlight()) || (!endOfLeg && hop.isFlagStopBoard())) {
                    place.boardAlightType = BoardAlightType.FLAG_STOP;
                }
                if ((endOfLeg && hop.isDeviatedRouteAlight()) || (!endOfLeg && hop.isDeviatedRouteBoard())) {
                    place.boardAlightType = BoardAlightType.DEVIATED;
                }
            }
        } else if(vertex instanceof BikeRentalStationVertex) {
            place.bikeShareId = ((BikeRentalStationVertex) vertex).getId();
            LOG.trace("Added bike share Id {} to place", place.bikeShareId);
            place.networks = ((BikeRentalStationVertex) vertex).getNetworks();
            place.vertexType = VertexType.BIKESHARE;
        } else if (vertex instanceof BikeParkVertex) {
            place.bikeParkId = ((BikeParkVertex) vertex).getId();
            place.vertexType = VertexType.BIKEPARK;
        } else if (vertex instanceof CarRentalStationVertex) {
            place.address = ((CarRentalStationVertex) vertex).getAddress();
            place.networks = ((CarRentalStationVertex) vertex).getNetworks();
            place.vertexType = VertexType.CARSHARE;
        } else if (vertex instanceof VehicleRentalStationVertex) {
            place.networks = ((VehicleRentalStationVertex) vertex).getNetworks();
            place.vertexType = VertexType.VEHICLERENTAL;
            place.vertexSubType = ((VehicleRentalStationVertex) vertex).getVehicleType() + '_' + ((VehicleRentalStationVertex) vertex).getVehiclePropulsionType() ;
            if(!((VehicleRentalStationVertex) vertex).isStation()
                    && ((VehicleRentalStationVertex) vertex).getParentStationName() != null){
                place.parentStationName = ((VehicleRentalStationVertex) vertex).getParentStationName();
            }

        } else if (vertex instanceof ParkAndRideVertex) {
            place.carParkId = ((ParkAndRideVertex) vertex).getId();
            place.vertexType = VertexType.CARPARK;
        } else {
            place.vertexType = VertexType.NORMAL;
        }

        return place;
    }

    /**
     * Add information about real-time data to a {@link Leg}.
     *
     * @param leg The leg to add the real-time information to
     * @param states The states that go with the leg
     */
    private static void addRealTimeData(Leg leg, State[] states) {
        TripTimes tripTimes = states[states.length - 1].getTripTimes();

        if (tripTimes != null && !tripTimes.isScheduled()) {
            leg.realTime = true;
            leg.realtimeState = tripTimes.getRealTimeState();
            if (leg.from.stopIndex != null) {
                leg.departureDelay = tripTimes.getDepartureDelay(leg.from.stopIndex);
            }
            leg.arrivalDelay = tripTimes.getArrivalDelay(leg.to.stopIndex);
        }
    }

    /**
     * Converts a list of street edges to a list of turn-by-turn directions.
     *
     * @param previous a non-transit leg that immediately precedes this one (bike-walking, say), or null
     *
     * @return
     */
    public static List<WalkStep> generateWalkSteps(Graph graph, State[] states, WalkStep previous, Locale requestedLocale) {
        List<WalkStep> steps = new ArrayList<WalkStep>();
        WalkStep step = null;
        double lastAngle = 0, distance = 0; // distance used for appending elevation profiles
        int roundaboutExit = 0; // track whether we are in a roundabout, and if so the exit number
        String roundaboutPreviousStreet = null;

        State onBikeRentalState = null, offBikeRentalState = null;

        // Check if this leg is a SimpleTransfer; if so, rebuild state array based on stored transfer edges
        if (states.length == 2 && states[1].getBackEdge() instanceof SimpleTransfer) {
            SimpleTransfer transferEdge = ((SimpleTransfer) states[1].getBackEdge());
            List<Edge> transferEdges = transferEdge.getEdges();
            if (transferEdges != null) {
                // Create a new initial state. Some parameters may have change along the way, copy them from the first state
                StateEditor se = new StateEditor(states[0].getOptions(), transferEdges.get(0).getFromVertex());
                se.setNonTransitOptionsFromState(states[0]);
                State s = se.makeState();
                ArrayList<State> transferStates = new ArrayList<>();
                transferStates.add(s);
                for (Edge e : transferEdges) {
                    s = e.traverse(s);
                    transferStates.add(s);
                }
                states = transferStates.toArray(new State[transferStates.size()]);
            }
        }

        for (int i = 0; i < states.length - 1; i++) {
            State backState = states[i];
            State forwardState = states[i + 1];
            Edge edge = forwardState.getBackEdge();

            if(edge instanceof RentABikeOnEdge) onBikeRentalState = forwardState;
            if(edge instanceof RentABikeOffEdge) offBikeRentalState = forwardState;

            boolean createdNewStep = false, disableZagRemovalForThisStep = false;
            if (edge instanceof FreeEdge) {
                continue;
            }
            if (forwardState.getBackMode() == null || !forwardState.getBackMode().isOnStreetNonTransit()) {
                continue; // ignore STLs and the like
            }
            // ignore ElevatorBoardEdges, narratives for elevators only come from ElevatorAlightEdges
            if (edge instanceof ElevatorBoardEdge)
                continue;

            Geometry geom = edge.getGeometry();
            if (geom == null) {
                continue;
            }

            // generate a step for getting off an elevator (all
            // elevator narrative generation occurs when alighting). We don't need to know what came
            // before or will come after
            if (edge instanceof ElevatorAlightEdge) {
                // don't care what came before or comes after
                step = createWalkStep(graph, forwardState, requestedLocale);
                createdNewStep = true;
                disableZagRemovalForThisStep = true;

                // tell the user where to get off the elevator using the exit notation, so the
                // i18n interface will say 'Elevator to <exit>'
                // what happens is that the webapp sees name == null and ignores that, and it sees
                // exit != null and uses to <exit>
                // the floor name is the AlightEdge name
                // reset to avoid confusion with 'Elevator on floor 1 to floor 1'
                step.streetName = ((ElevatorAlightEdge) edge).getName(requestedLocale);

                step.relativeDirection = RelativeDirection.ELEVATOR;

                steps.add(step);
                continue;
            }

            String streetName = edge.getName(requestedLocale);
            int idx = streetName.indexOf('(');
            String streetNameNoParens;
            if (idx > 0)
                streetNameNoParens = streetName.substring(0, idx - 1);
            else
                streetNameNoParens = streetName;

            if (step == null) {
                // first step
                step = createWalkStep(graph, forwardState, requestedLocale);
                createdNewStep = true;

                steps.add(step);
                double thisAngle = DirectionUtils.getFirstAngle(geom);
                if (previous == null) {
                    step.setAbsoluteDirection(thisAngle);
                    step.relativeDirection = RelativeDirection.DEPART;
                } else {
                    step.setDirections(previous.angle, thisAngle, false);
                }
                // new step, set distance to length of first edge
                distance = edge.getDistance();
            } else if (((step.streetName != null && !step.streetNameNoParens().equals(streetNameNoParens))
                && (!step.bogusName || !edge.hasBogusName())) ||
                edge.isRoundabout() != (roundaboutExit > 0) || // went on to or off of a roundabout
                isLink(edge) && !isLink(backState.getBackEdge())) {
                // Street name has changed, or we've gone on to or off of a roundabout.
                if (roundaboutExit > 0) {
                    // if we were just on a roundabout,
                    // make note of which exit was taken in the existing step
                    step.exit = Integer.toString(roundaboutExit); // ordinal numbers from
                    if (streetNameNoParens.equals(roundaboutPreviousStreet)) {
                        step.stayOn = true;
                    }
                    roundaboutExit = 0;
                }
                /* start a new step */
                step = createWalkStep(graph, forwardState, requestedLocale);
                createdNewStep = true;

                steps.add(step);
                if (edge.isRoundabout()) {
                    // indicate that we are now on a roundabout
                    // and use one-based exit numbering
                    roundaboutExit = 1;
                    roundaboutPreviousStreet = backState.getBackEdge().getName(requestedLocale);
                    idx = roundaboutPreviousStreet.indexOf('(');
                    if (idx > 0)
                        roundaboutPreviousStreet = roundaboutPreviousStreet.substring(0, idx - 1);
                }
                double thisAngle = DirectionUtils.getFirstAngle(geom);
                step.setDirections(lastAngle, thisAngle, edge.isRoundabout());
                // new step, set distance to length of first edge
                distance = edge.getDistance();
            } else {
                /* street name has not changed */
                double thisAngle = DirectionUtils.getFirstAngle(geom);
                RelativeDirection direction = WalkStep.getRelativeDirection(lastAngle, thisAngle,
                    edge.isRoundabout());
                boolean optionsBefore = backState.multipleOptionsBefore();
                if (edge.isRoundabout()) {
                    // we are on a roundabout, and have already traversed at least one edge of it.
                    if (optionsBefore) {
                        // increment exit count if we passed one.
                        roundaboutExit += 1;
                    }
                }
                if (edge.isRoundabout() || direction == RelativeDirection.CONTINUE) {
                    // we are continuing almost straight, or continuing along a roundabout.
                    // just append elevation info onto the existing step.

                } else {
                    // we are not on a roundabout, and not continuing straight through.

                    // figure out if there were other plausible turn options at the last
                    // intersection
                    // to see if we should generate a "left to continue" instruction.
                    boolean shouldGenerateContinue = false;
                    if (edge instanceof StreetEdge) {
                        // the next edges will be PlainStreetEdges, we hope
                        double angleDiff = getAbsoluteAngleDiff(thisAngle, lastAngle);
                        for (Edge alternative : backState.getVertex().getOutgoingStreetEdges()) {
                            if (alternative.getName(requestedLocale).equals(streetName)) {
                                // alternatives that have the same name
                                // are usually caused by street splits
                                continue;
                            }
                            double altAngle = DirectionUtils.getFirstAngle(alternative
                                .getGeometry());
                            double altAngleDiff = getAbsoluteAngleDiff(altAngle, lastAngle);
                            if (angleDiff > Math.PI / 4 || altAngleDiff - angleDiff < Math.PI / 16) {
                                shouldGenerateContinue = true;
                                break;
                            }
                        }
                    } else {
                        double angleDiff = getAbsoluteAngleDiff(lastAngle, thisAngle);
                        // FIXME: this code might be wrong with the removal of the edge-based graph
                        State twoStatesBack = backState.getBackState();
                        Vertex backVertex = twoStatesBack.getVertex();
                        for (Edge alternative : backVertex.getOutgoingStreetEdges()) {
                            List<Edge> alternatives = alternative.getToVertex()
                                .getOutgoingStreetEdges();
                            if (alternatives.size() == 0) {
                                continue; // this is not an alternative
                            }
                            alternative = alternatives.get(0);
                            if (alternative.getName(requestedLocale).equals(streetName)) {
                                // alternatives that have the same name
                                // are usually caused by street splits
                                continue;
                            }
                            double altAngle = DirectionUtils.getFirstAngle(alternative
                                .getGeometry());
                            double altAngleDiff = getAbsoluteAngleDiff(altAngle, lastAngle);
                            if (angleDiff > Math.PI / 4 || altAngleDiff - angleDiff < Math.PI / 16) {
                                shouldGenerateContinue = true;
                                break;
                            }
                        }
                    }

                    if (shouldGenerateContinue) {
                        // turn to stay on same-named street
                        step = createWalkStep(graph, forwardState, requestedLocale);
                        createdNewStep = true;
                        steps.add(step);
                        step.setDirections(lastAngle, thisAngle, false);
                        step.stayOn = true;
                        // new step, set distance to length of first edge
                        distance = edge.getDistance();
                    }
                }
            }

            State exitState = backState;
            Edge exitEdge = exitState.getBackEdge();
            while (exitEdge instanceof FreeEdge) {
                exitState = exitState.getBackState();
                exitEdge = exitState.getBackEdge();
            }
            if (exitState.getVertex() instanceof ExitVertex) {
                step.exit = ((ExitVertex) exitState.getVertex()).getExitName();
            }

            if (createdNewStep && !disableZagRemovalForThisStep && forwardState.getBackMode() == backState.getBackMode()) {
                //check last three steps for zag
                int last = steps.size() - 1;
                if (last >= 2) {
                    WalkStep threeBack = steps.get(last - 2);
                    WalkStep twoBack = steps.get(last - 1);
                    WalkStep lastStep = steps.get(last);

                    if (twoBack.distance < MAX_ZAG_DISTANCE
                        && lastStep.streetNameNoParens().equals(threeBack.streetNameNoParens())) {

                        if (((lastStep.relativeDirection == RelativeDirection.RIGHT ||
                            lastStep.relativeDirection == RelativeDirection.HARD_RIGHT) &&
                            (twoBack.relativeDirection == RelativeDirection.RIGHT ||
                                twoBack.relativeDirection == RelativeDirection.HARD_RIGHT)) ||
                            ((lastStep.relativeDirection == RelativeDirection.LEFT ||
                                lastStep.relativeDirection == RelativeDirection.HARD_LEFT) &&
                                (twoBack.relativeDirection == RelativeDirection.LEFT ||
                                    twoBack.relativeDirection == RelativeDirection.HARD_LEFT))) {
                            // in this case, we have two left turns or two right turns in quick 
                            // succession; this is probably a U-turn.

                            steps.remove(last - 1);

                            lastStep.distance += twoBack.distance;

                            // A U-turn to the left, typical in the US. 
                            if (lastStep.relativeDirection == RelativeDirection.LEFT ||
                                lastStep.relativeDirection == RelativeDirection.HARD_LEFT)
                                lastStep.relativeDirection = RelativeDirection.UTURN_LEFT;
                            else
                                lastStep.relativeDirection = RelativeDirection.UTURN_RIGHT;

                            // in this case, we're definitely staying on the same street 
                            // (since it's zag removal, the street names are the same)
                            lastStep.stayOn = true;
                        } else if (!twoBack.relativeDirection.equals(RelativeDirection.ELEVATOR)) {
                            // What is a zag? TODO write meaningful documentation for this.
                            // It appears to mean simplifying out several rapid turns in succession
                            // from the description.
                            // total hack to remove zags.
                            steps.remove(last);
                            steps.remove(last - 1);
                            step = threeBack;
                            step.distance += twoBack.distance;
                            distance += step.distance;
                            if (twoBack.elevation != null) {
                                if (step.elevation == null) {
                                    step.elevation = twoBack.elevation;
                                } else {
                                    for (P2<Double> d : twoBack.elevation) {
                                        step.elevation.add(new P2<Double>(d.first + step.distance, d.second));
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                if (!createdNewStep && step.elevation != null) {
                    List<P2<Double>> s = encodeElevationProfile(edge, distance,
                        backState.getOptions().geoidElevation ? -graph.ellipsoidToGeoidDifference : 0);
                    if (step.elevation != null && step.elevation.size() > 0) {
                        step.elevation.addAll(s);
                    } else {
                        step.elevation = s;
                    }
                }
                if (!createdNewStep) distance += edge.getDistance();

            }

            // increment the total length for this step
            step.distance += edge.getDistance();
            step.addAlerts(graph.streetNotesService.getNotes(forwardState), requestedLocale);
            lastAngle = DirectionUtils.getLastAngle(geom);

            step.edges.add(edge);
        }

        // add bike rental information if applicable
        if(onBikeRentalState != null && !steps.isEmpty()) {
            steps.get(steps.size()-1).bikeRentalOnStation =
                new BikeRentalStationInfo((BikeRentalStationVertex) onBikeRentalState.getBackEdge().getToVertex());
        }
        if(offBikeRentalState != null && !steps.isEmpty()) {
            steps.get(0).bikeRentalOffStation =
                new BikeRentalStationInfo((BikeRentalStationVertex) offBikeRentalState.getBackEdge().getFromVertex());
        }

        return steps;
    }

    private static boolean isLink(Edge edge) {
        return edge instanceof StreetEdge && (((StreetEdge)edge).getStreetClass() & StreetEdge.CLASS_LINK) == StreetEdge.CLASS_LINK;
    }

    private static double getAbsoluteAngleDiff(double thisAngle, double lastAngle) {
        double angleDiff = thisAngle - lastAngle;
        if (angleDiff < 0) {
            angleDiff += Math.PI * 2;
        }
        double ccwAngleDiff = Math.PI * 2 - angleDiff;
        if (ccwAngleDiff < angleDiff) {
            angleDiff = ccwAngleDiff;
        }
        return angleDiff;
    }

    private static WalkStep createWalkStep(Graph graph, State s, Locale wantedLocale) {
        Edge en = s.getBackEdge();
        WalkStep step;
        step = new WalkStep();
        step.streetName = en.getName(wantedLocale);
        step.lon = en.getFromVertex().getX();
        step.lat = en.getFromVertex().getY();
        step.elevation = encodeElevationProfile(s.getBackEdge(), 0,
            s.getOptions().geoidElevation ? -graph.ellipsoidToGeoidDifference : 0);
        step.bogusName = en.hasBogusName();
        step.addAlerts(graph.streetNotesService.getNotes(s), wantedLocale);
        step.angle = DirectionUtils.getFirstAngle(s.getBackEdge().getGeometry());
        if (s.getBackEdge() instanceof AreaEdge) {
            step.area = true;
        }
        return step;
    }

    private static List<P2<Double>> encodeElevationProfile(Edge edge, double distanceOffset, double heightOffset) {
        if (!(edge instanceof StreetEdge)) {
            return new ArrayList<P2<Double>>();
        }
        StreetEdge elevEdge = (StreetEdge) edge;
        if (elevEdge.getElevationProfile() == null) {
            return new ArrayList<P2<Double>>();
        }
        ArrayList<P2<Double>> out = new ArrayList<P2<Double>>();
        Coordinate[] coordArr = elevEdge.getElevationProfile().toCoordinateArray();
        for (int i = 0; i < coordArr.length; i++) {
            out.add(new P2<Double>(coordArr[i].x + distanceOffset, coordArr[i].y + heightOffset));
        }
        return out;
    }

}

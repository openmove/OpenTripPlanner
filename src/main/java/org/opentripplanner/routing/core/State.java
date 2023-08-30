package org.opentripplanner.routing.core;

import org.opentripplanner.model.FeedScopedId;
import org.opentripplanner.model.Stop;
import org.opentripplanner.model.Trip;
import org.opentripplanner.routing.algorithm.NegativeWeightException;
import org.opentripplanner.routing.car_rental.CarRentalStationService;
import org.opentripplanner.routing.edgetype.OnboardEdge;
import org.opentripplanner.routing.edgetype.PatternInterlineDwell;
import org.opentripplanner.routing.edgetype.RentAVehicleAbstractEdge;
import org.opentripplanner.routing.edgetype.StreetEdge;
import org.opentripplanner.routing.edgetype.TablePatternEdge;
import org.opentripplanner.routing.edgetype.TransitBoardAlight;
import org.opentripplanner.routing.edgetype.TripPattern;
import org.opentripplanner.routing.graph.Edge;
import org.opentripplanner.routing.graph.Vertex;
import org.opentripplanner.routing.trippattern.TripTimes;
import org.opentripplanner.routing.vehicle_rental.VehicleRentalStationService;
import org.opentripplanner.routing.vertextype.BikeRentalStationVertex;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class State implements Cloneable {
    /* Data which is likely to change at most traversals */

    // the current time at this state, in milliseconds
    protected long time;

    // accumulated weight up to this state
    public double weight;

    // associate this state with a vertex in the graph
    protected Vertex vertex;

    // allow path reconstruction from states
    protected State backState;

    public Edge backEdge;

    // allow traverse result chaining (multiple results)
    protected State next;

    /* StateData contains data which is unlikely to change as often */
    public StateData stateData;

    // how far have we walked
    // TODO(flamholz): this is a very confusing name as it actually applies to all non-transit modes.
    // we should DEFINITELY rename this variable and the associated methods.
    public double walkDistance;

    // The time traveled pre-transit, for park and ride or kiss and ride searches
    int preTransitTime;

    // The current distance traveled in a transportation network company vehicle
    public double transportationNetworkCompanyDriveDistance;

    // The current distance traveled in a car rental
    public double carRentalDriveDistance;

    // The current distance traveled in a vehicle rental
    public double vehicleRentalDistance;

    // track the states of all path parsers -- probably changes frequently
    protected int[] pathParserStates;

    int callAndRideTime = 0;
    
    public int hasOnBoardBike = 0;

    private static final Logger LOG = LoggerFactory.getLogger(State.class);

    /* CONSTRUCTORS */

    /**
     * Create an initial state representing the beginning of a search for the given routing context.
     * Initial "parent-less" states can only be created at the beginning of a trip. elsewhere, all
     * states must be created from a parent and associated with an edge.
     */
    public State(RoutingRequest opt) {
        this(opt.rctx.origin, opt.rctx.originBackEdge, opt.getSecondsSinceEpoch(), opt);
    }

    /**
     * Create an initial state, forcing vertex to the specified value. Useful for reusing a 
     * RoutingContext in TransitIndex, tests, etc.
     */
    public State(Vertex vertex, RoutingRequest opt) {
        // Since you explicitly specify, the vertex, we don't set the backEdge.
        this(vertex, opt.getSecondsSinceEpoch(), opt);
    }

    /**
     * Create an initial state, forcing vertex and time to the specified values. Useful for reusing 
     * a RoutingContext in TransitIndex, tests, etc.
     */
    public State(Vertex vertex, long timeSeconds, RoutingRequest options) {
        // Since you explicitly specify, the vertex, we don't set the backEdge.
        this(vertex, null, timeSeconds, options);
    }

    /**
     * Create an initial state, forcing vertex, back edge and time to the specified values. Useful for reusing 
     * a RoutingContext in TransitIndex, tests, etc.
     */
    public State(Vertex vertex, Edge backEdge, long timeSeconds, RoutingRequest options) {
        this(vertex, backEdge, timeSeconds, timeSeconds, options);
    }

    /**
     * Create an initial state, forcing vertex, back edge, time and start time to the specified values. Useful for
     * starting a multiple initial state search, for example when propagating profile results to the street network in
     * RoundBasedProfileRouter.
     */
    public State(Vertex vertex, Edge backEdge, long timeSeconds, long startTime, RoutingRequest options) {
        this.weight = 0;
        this.vertex = vertex;
        this.backEdge = backEdge;
        this.backState = null;
        this.stateData = new StateData(options);
        // note that here we are breaking the circular reference between rctx and options
        // this should be harmless since reversed clones are only used when routing has finished
        this.stateData.opt = options;
        this.stateData.startTime = startTime;
        // set the current time of the state here as it could be pushed back further in certain queries with
        // Transportation Network Companies enabled.
        this.time = timeSeconds * 1000;
        this.stateData.usingRentedBike = false;
        /* If the itinerary is to begin with a car that is left for transit, the initial state of arriveBy searches is
           with the car already "parked" and in WALK mode. Otherwise, we are in CAR mode and "unparked". */
        if (options.parkAndRide || options.kissAndRide) {
            this.stateData.carParked = options.arriveBy;
            this.stateData.nonTransitMode = this.stateData.carParked ? TraverseMode.WALK : TraverseMode.CAR;
        } else if (options.bikeParkAndRide) {
            this.stateData.bikeParked = options.arriveBy;
            this.stateData.nonTransitMode = this.stateData.bikeParked ? TraverseMode.WALK
                : TraverseMode.BICYCLE;
        }
        // if allowed to hail a car, initialize state with CAR mode if the first seen StreetEdge allows cars and a TNC
        // stop would be allowed there
        else if (options.modes.isTransit() && options.useTransportationNetworkCompany) {
            StreetEdge firstStreetEdge = getFirstSeenStreetEdge(vertex);
            if (firstStreetEdge.getPermission().allows(TraverseMode.CAR) && isTNCStopAllowed(firstStreetEdge)) {
                boardHailedCar(0);
            } else {
                stateData.nonTransitMode = TraverseMode.WALK;
            }
        } else if (options.useTransportationNetworkCompany) {
        	boardHailedCar(0);
        }
        // Initialize the non-transit mode when a car rental is possible.
        else if (options.allowCarRental) {
            if (options.arriveBy) {
                // if searching with arriveBy mode, it is possible that the search ended with a rental car being dropped
                // off at the target. See if that could be possible.
                StreetEdge firstStreetEdge = getFirstSeenStreetEdge(vertex);
                if (
                    firstStreetEdge.getPermission().allows(TraverseMode.CAR) &&
                        isCarRentalDropoffAllowed(firstStreetEdge, false)
                ) {
                    // looks like it is possible to have began renting a car from the first seen street edge
                    // begin the search with a rented car in use.
                    beginCarRenting(0, firstStreetEdge.getCarNetworks(), true);
                } else {
                    // not possible to have rented a car, start out in walk mode
                    stateData.nonTransitMode = TraverseMode.WALK;
                }
            } else {
                // always start depart at searches in WALK mode. Need to walk to a car rental station in order to pick
                // up a car
                stateData.nonTransitMode = TraverseMode.WALK;
            }
        }
        // Initialize the non-transit mode when a vehicle rental is possible.
        else if (options.allowVehicleRental) {
            if (options.arriveBy) {
                // if searching with arriveBy mode, it is possible that the search ended with a rental car being dropped
                // off at the target. See if that could be possible.
                StreetEdge firstStreetEdge = getFirstSeenStreetEdge(vertex);
                if (
                    firstStreetEdge.getPermission().allows(TraverseMode.MICROMOBILITY) &&
                        isVehicleRentalDropoffAllowed(firstStreetEdge, false)
                ) {
                    // looks like it is possible to have began renting a vehicle from the first seen street edge
                    // begin the search with a rented vehicle in use.
                    beginVehicleRenting(0, firstStreetEdge.getVehicleNetworks(), true);
                } else {
                    // not possible to have rented a vehicle, start out in walk mode
                    stateData.nonTransitMode = TraverseMode.WALK;
                }
            } else {
                // always start depart at searches in WALK mode. Need to walk to a vehicle rental station in order to
                // pick up a vehicle
                stateData.nonTransitMode = TraverseMode.WALK;
            }
        }
        this.walkDistance = 0;
        this.preTransitTime = 0;
        this.transportationNetworkCompanyDriveDistance = 0;
        this.carRentalDriveDistance = 0;
        stateData.routeSequence = new FeedScopedId[0];
    }

    /**
     * Create a state editor to produce a child of this state, which will be the result of
     * traversing the given edge.
     *
     * @param e
     * @return
     */
    public StateEditor edit(Edge e) {
        return new StateEditor(this, e);
    }

    protected State clone() {
        State ret;
        try {
            ret = (State) super.clone();
        } catch (CloneNotSupportedException e1) {
            throw new IllegalStateException("This is not happening");
        }
        return ret;
    }

    /*
     * FIELD ACCESSOR METHODS States are immutable, so they have only get methods. The corresponding
     * set methods are in StateEditor.
     */

    /**
     * Retrieve a State extension based on its key.
     *
     * @param key - An Object that is a key in this State's extension map
     * @return - The extension value for the given key, or null if not present
     */
    public Object getExtension(Object key) {
        if (stateData.extensions == null) {
            return null;
        }
        return stateData.extensions.get(key);
    }

    public String toString() {
        return "<State " + new Date(getTimeInMillis()) + " [" + weight + "] " +
            (isBikeRenting() ? "BIKE_RENT " : "") +
            (isCarParked() ? "CAR_PARKED " : "") +
            (isUsingHailedCar() ? "CAR_HAIL " : "") +
            (isCarRenting() ? "CAR_RENT " : "") +
            (isVehicleRenting() ? "VEHICLE_RENT " : "") +
            " " + (getBackMode() != null ? getBackMode() : "") + " "
            + vertex + ">";
    }

    public String toStringVerbose() {
        return "<State " + new Date(getTimeInMillis()) +
            " w=" + this.getWeight() +
            " t=" + this.getElapsedTimeSeconds() +
            " d=" + this.getWalkDistance() +
            " p=" + this.getPreTransitTime() +
            " b=" + this.getNumBoardings() +
            " br=" + this.isBikeRenting() +
            " pr=" + this.isCarParked() + ">";
    }

    /** Returns time in seconds since epoch */
    public long getTimeSeconds() {
        return time / 1000;
    }

    /** returns the length of the trip in seconds up to this state */
    public long getElapsedTimeSeconds() {
        return Math.abs(getTimeSeconds() - stateData.startTime);
    }

    public TripTimes getTripTimes() {
        return stateData.tripTimes;
    }

    /**
     * Returns the length of the trip in seconds up to this time, not including the initial wait.
     * It subtracts out the initial wait, up to a clamp value specified in the request.
     * If the clamp value is set to -1, no clamping will occur.
     * If the clamp value is set to 0, the initial wait time will not be subtracted out 
     * (i.e. it will be clamped to zero).
     * This is used in lieu of reverse optimization in Analyst.
     */
    public long getActiveTime () {
        long clampInitialWait = stateData.opt.clampInitialWait;

        long initialWait = stateData.initialWaitTime;

        // only subtract up the clamp value
        if (clampInitialWait >= 0 && initialWait > clampInitialWait)
            initialWait = clampInitialWait;

        long activeTime = getElapsedTimeSeconds() - initialWait;

        // TODO: what should be done here? (Does this ever happen?)
        if (activeTime < 0) {
            LOG.warn("initial wait was greater than elapsed time.");
            activeTime = getElapsedTimeSeconds();
        }

        return activeTime;
    }

    public FeedScopedId getTripId() {
        return stateData.tripId;
    }

    public Trip getPreviousTrip() {
        return stateData.previousTrip;
    }

    public String getZone() {
        return stateData.zone;
    }

    public FeedScopedId getRoute() {
        return stateData.route;
    }

    public int getNumBoardings() {
        return stateData.numBoardings;
    }


    /**
     * Whether this path has ever previously boarded (or alighted from, in a reverse search) a
     * transit vehicle
     */
    public boolean isEverBoarded() {
        return stateData.everBoarded;
    }

    public boolean isBikeRenting() {
        return stateData.usingRentedBike;
    }

    public boolean isCarRenting() { return stateData.usingRentedCar; }

    public boolean isUsingHailedCar() { return stateData.usingHailedCar; }

    public boolean isCarParked() {
        return stateData.carParked;
    }

    public boolean isBikeParked() {
        return stateData.bikeParked;
    }

    /**
     * @return True if the state at vertex can be the end of path.
     */
    public boolean isFinal() {
        // When drive-to-transit is enabled, we need to check whether the car has been parked (or whether it has been picked up in reverse).
        boolean parkAndRide = stateData.opt.parkAndRide || stateData.opt.kissAndRide;
        boolean bikeParkAndRide = stateData.opt.bikeParkAndRide;
        boolean bikeRentingOk = false;
        boolean bikeParkAndRideOk = false;
        boolean carParkAndRideOk = false;
        boolean carRentingOk = false;
        boolean vehicleRentingOk;
        boolean tncOK = !stateData.opt.useTransportationNetworkCompany || (
            //isEverBoarded() &&
                (!isUsingHailedCar() || isTNCStopAllowed())
        );
        if (stateData.opt.arriveBy) {
            bikeRentingOk = !isBikeRenting();
            bikeParkAndRideOk = !bikeParkAndRide || !isBikeParked();
            carParkAndRideOk = !parkAndRide || !isCarParked();
            // If a car or vehicle is being rented and the search is progressing backward, the search must
            // reach a car/vehicle rental station that this car/vehicle could have been picked up at
            carRentingOk = !isCarRenting();
            vehicleRentingOk = !isVehicleRenting();
        } else {
            bikeRentingOk = !isBikeRenting();
            bikeParkAndRideOk = !bikeParkAndRide || isBikeParked();
            carParkAndRideOk = !parkAndRide || isCarParked();
            // if still renting a car/vehicle, check if it is possible to dropoff a rental car/vehicle at the last
            // seen edge
            carRentingOk = !isCarRenting() || isCarRentalDropoffAllowed(false);
            vehicleRentingOk = !isVehicleRenting() || isVehicleRentalDropoffAllowed(false);
        }
        return bikeRentingOk && bikeParkAndRideOk && carParkAndRideOk && tncOK && carRentingOk && vehicleRentingOk;
    }

    public Stop getPreviousStop() {
        return stateData.previousStop;
    }

    public long getLastAlightedTimeSeconds() {
        return stateData.lastAlightedTime;
    }

    public double getWalkDistance() {
        return walkDistance;
    }

    public int getPreTransitTime() {
        return preTransitTime;
    }

    public int getCallAndRideTime() {
        return callAndRideTime;
    }

    public Vertex getVertex() {
        return this.vertex;
    }

    public int getLastNextArrivalDelta () {
        return stateData.lastNextArrivalDelta;
    }

    public double getWeight() {
        return this.weight;
    }

    public int getTimeDeltaSeconds() {
        return backState != null ? (int) (getTimeSeconds() - backState.getTimeSeconds()) : 0;
    }

    public int getAbsTimeDeltaSeconds() {
        return Math.abs(getTimeDeltaSeconds());
    }

    public double getWalkDistanceDelta () {
        if (backState != null)
            return Math.abs(this.walkDistance - backState.walkDistance);
        else
            return 0.0;
    }

    public int getPreTransitTimeDelta () {
        if (backState != null)
            return Math.abs(this.preTransitTime - backState.preTransitTime);
        else
            return 0;
    }

    public double getWeightDelta() {
        return this.weight - backState.weight;
    }

    public double getTransportationNetworkCompanyDistanceDelta() {
        if (backState != null)
            return Math.abs(this.transportationNetworkCompanyDriveDistance - backState.transportationNetworkCompanyDriveDistance);
        else
            return 0;
    }

    public double getCarRentalDistanceDelta() {
        if (backState != null)
            return Math.abs(this.carRentalDriveDistance - backState.carRentalDriveDistance);
        else
            return 0;
    }

    public double getVehicleRentalDistanceDelta() {
        if (backState != null)
            return Math.abs(this.vehicleRentalDistance - backState.vehicleRentalDistance);
        else
            return 0;
    }

    public void checkNegativeWeight() {
        double dw = this.weight - backState.weight;
        if (dw < 0) {
            throw new NegativeWeightException(String.valueOf(dw) + " on edge " + backEdge);
        }
    }

    public boolean isOnboard() {
        return this.backEdge instanceof OnboardEdge;
    }

    public State getBackState() {
        return this.backState;
    }

    public TraverseMode getBackMode () {
        return stateData.backMode;
    }

    public boolean isBackWalkingBike () {
        return stateData.backWalkingBike;
    }

    /**
     * Get the name of the direction used to get to this state. For transit, it is the headsign,
     * while for other things it is what you would expect.
     */
    public String getBackDirection () {
        // This can happen when stop_headsign says different things at two trips on the same 
        // pattern and at the same stop.
        if (backEdge instanceof TablePatternEdge) {
            return stateData.tripTimes.getHeadsign(((TablePatternEdge)backEdge).getStopIndex());
        }
        else {
            return backEdge.getDirection();
        }
    }

    /**
     * Get the back trip of the given state. For time dependent transit, State will find the
     * right thing to do.
     */
    public Trip getBackTrip () {
        if (backEdge instanceof TablePatternEdge || backEdge instanceof PatternInterlineDwell) {
            return stateData.tripTimes.trip;
        }
        else {
            return backEdge.getTrip();
        }
    }

    public Edge getBackEdge() {
        return this.backEdge;
    }

    public boolean exceedsWeightLimit(double maxWeight) {
        return weight > maxWeight;
    }

    public long getStartTimeSeconds() {
        return stateData.startTime;
    }

    /**
     * Optional next result that allows {@link Edge} to return multiple results.
     *
     * @return the next additional result from an edge traversal, or null if no more results
     */
    public State getNextResult() {
        return next;
    }

    /**
     * Extend an exiting result chain by appending this result to the existing chain. The usage
     * model looks like this:
     *
     * <code>
     * TraverseResult result = null;
     *
     * for( ... ) {
     *   TraverseResult individualResult = ...;
     *   result = individualResult.addToExistingResultChain(result);
     * }
     *
     * return result;
     * </code>
     *
     * @param existingResultChain the tail of an existing result chain, or null if the chain has not
     *        been started
     * @return
     */
    public State addToExistingResultChain(State existingResultChain) {
        if (this.getNextResult() != null)
            throw new IllegalStateException("this result already has a next result set");
        next = existingResultChain;
        return this;
    }

    public State detachNextResult() {
        State ret = this.next;
        this.next = null;
        return ret;
    }

    public RoutingContext getContext() {
        return stateData.opt.rctx;
    }

    public RoutingRequest getOptions () {
        return stateData.opt;
    }

    /**
     * This method is on State rather than RoutingRequest because we care whether the user is in
     * possession of a rented bike.
     *
     * @return BICYCLE if routing with an owned bicycle, or if at this state the user is holding on
     *         to a rented bicycle.
     */
    public TraverseMode getNonTransitMode() {
        return stateData.nonTransitMode;
    }
    // TODO: There is no documentation about what this means. No one knows precisely.
    // Needs to be replaced with clearly defined fields.

    public State reversedClone() {
        // We no longer compensate for schedule slack (minTransferTime) here.
        // It is distributed symmetrically over all preboard and prealight edges.
        State newState = new State(this.vertex, getTimeSeconds(), stateData.opt.reversedClone());
        newState.stateData.tripTimes = stateData.tripTimes;
        newState.stateData.initialWaitTime = stateData.initialWaitTime;
        // TODO Check if those two lines are needed:
        newState.stateData.usingRentedBike = stateData.usingRentedBike;
        newState.stateData.carParked = stateData.carParked;
        newState.stateData.bikeParked = stateData.bikeParked;
        // set to whatever the final TNC state was
        newState.stateData.usingHailedCar = stateData.usingHailedCar;
        // if the original request options was depart At, there is a chance that the new reversed state could
        // immediately board a TNC even if it didn't end that way. If the original trip didn't end this way, the TNC
        // boarding must be undone.
        if (!stateData.opt.arriveBy && !stateData.usingHailedCar) {
            newState.stateData.hasHailedCarPreTransit = false;
            newState.stateData.backMode = TraverseMode.WALK;
            newState.stateData.nonTransitMode = TraverseMode.WALK;
            if (stateData.opt.transportationNetworkCompanyEtaAtOrigin > -1) {
                newState.time -= stateData.opt.transportationNetworkCompanyEtaAtOrigin * 1000;
            }
        }
        newState.stateData.usingRentedCar = stateData.usingRentedCar;
        // if the original request options was depart At, there is a chance that the new reversed state could
        // immediately begin renting a car even if it didn't end that way. If the original trip didn't end this way, the
        // car rental must be undone.
        if (!stateData.opt.arriveBy && !stateData.usingRentedCar) {
            newState.stateData.nonTransitMode = TraverseMode.WALK;
            newState.stateData.hasRentedCarPreTransit = false;
        }
        // If the original trip was depart at and did end with dropping off the car at the destination, we need to
        // immediately set the back mode to match the final state of the original trip
        else if (!stateData.opt.arriveBy && stateData.usingRentedCar) {
            newState.stateData.backMode = TraverseMode.CAR;
        }
        newState.stateData.usingRentedVehicle = stateData.usingRentedVehicle;
        // if the original request options was depart At, there is a chance that the new reversed state could
        // immediately begin renting a vehicle even if it didn't end that way. If the original trip didn't end this way,
        // the vehicle rental must be undone.
        if (!stateData.opt.arriveBy && !stateData.usingRentedVehicle) {
            newState.stateData.nonTransitMode = TraverseMode.WALK;
            newState.stateData.hasRentedVehiclePreTransit = false;
        }
        // If the original trip was depart at and did end with dropping off the vehicle at the destination, we need to
        // immediately set the back mode to match the final state of the original trip
        else if (!stateData.opt.arriveBy && stateData.usingRentedVehicle) {
            newState.stateData.backMode = TraverseMode.MICROMOBILITY;
        }
        // begin with the same non-transit mode that the end state had
        newState.stateData.nonTransitMode = stateData.nonTransitMode;
        return newState;
    }

    public void dumpPath() {
        System.out.printf("---- FOLLOWING CHAIN OF STATES ----\n");
        State s = this;
        while (s != null) {
            System.out.printf("%s via %s by %s\n", s, s.backEdge, s.getBackMode());
            s = s.backState;
        }
        System.out.printf("---- END CHAIN OF STATES ----\n");
    }

    public long getTimeInMillis() {
        return time;
    }

    // symmetric prefix check
    public boolean routeSequencePrefix (State that) {
        FeedScopedId[] rs0 = this.stateData.routeSequence;
        FeedScopedId[] rs1 = that.stateData.routeSequence;
        if (rs0 == rs1)
            return true;
        int n = rs0.length < rs1.length ? rs0.length : rs1.length;
        for (int i = 0; i < n; i++)
            if (rs0[i] != rs1[i])
                return false;
        return true;
    }

    // symmetric subset check
    public boolean routeSequenceSubsetSymmetric (State that) {
        FeedScopedId[] rs0 = this.stateData.routeSequence;
        FeedScopedId[] rs1 = that.stateData.routeSequence;
        if (rs0 == rs1)
            return true;
        FeedScopedId[] shorter, longer;
        if (rs0.length < rs1.length) {
            shorter = rs0;
            longer  = rs1;
        } else {
            shorter = rs1;
            longer  = rs0;
        }
        /* bad complexity, but these are tiny arrays */
        for (FeedScopedId ais : shorter) {
            boolean match = false;
            for (FeedScopedId ail : longer) {
                if (ais == ail) {
                    match = true;
                    break;
                }
            }
            if (!match) return false;
        }
        return true;
    }

    // subset check: is this a subset of that?
    public boolean routeSequenceSubset (State that) {
        FeedScopedId[] rs0 = this.stateData.routeSequence;
        FeedScopedId[] rs1 = that.stateData.routeSequence;
        if (rs0 == rs1) return true;
        if (rs0.length > rs1.length) return false;
        /* bad complexity, but these are tiny arrays */
        for (FeedScopedId r0 : rs0) {
            boolean match = false;
            for (FeedScopedId r1 : rs1) {
                if (r0 == r1) {
                    match = true;
                    break;
                }
            }
            if (!match) return false;
        }
        return true;
    }

    public boolean routeSequenceSuperset (State that) {
        return that.routeSequenceSubset(this);
    }

    public double getWalkSinceLastTransit() {
        return walkDistance - stateData.lastTransitWalk;
    }

    public double getWalkAtLastTransit() {
        return stateData.lastTransitWalk;
    }

    public boolean multipleOptionsBefore() {
        boolean foundAlternatePaths = false;
        TraverseMode requestedMode = getNonTransitMode();
        for (Edge out : backState.vertex.getOutgoing()) {
            if (out == backEdge) {
                continue;
            }
            if (!(out instanceof StreetEdge)) {
                continue;
            }
            State outState = out.traverse(backState);
            if (outState == null) {
                continue;
            }
            if (!outState.getBackMode().equals(requestedMode)) {
                //walking a bike, so, not really an exit
                continue;
            }
            // this section handles the case of an option which is only an option if you walk your
            // bike. It is complicated because you will not need to walk your bike until one
            // edge after the current edge.

            //now, from here, try a continuing path.
            Vertex tov = outState.getVertex();
            boolean found = false;
            for (Edge out2 : tov.getOutgoing()) {
                State outState2 = out2.traverse(outState);
                if (outState2 != null && !outState2.getBackMode().equals(requestedMode)) {
                    // walking a bike, so, not really an exit
                    continue;
                }
                found = true;
                break;
            }
            if (!found) {
                continue;
            }

            // there were paths we didn't take.
            foundAlternatePaths = true;
            break;
        }
        return foundAlternatePaths;
    }

    public String getPathParserStates() {
        StringBuilder sb = new StringBuilder();
        sb.append("( ");
        for (int i : pathParserStates) {
            sb.append(String.format("%02d ", i));
        }
        sb.append(")");
        return sb.toString();
    }

    /** @return the last TripPattern used in this path (which is set when leaving the vehicle). */
    public TripPattern getLastPattern() {
        return stateData.lastPattern;
    }

    public boolean isLastBoardAlightDeviated() {
        return stateData.isLastBoardAlightDeviated;
    }

    public ServiceDay getServiceDay() {
        return stateData.serviceDay;
    }

    public Set<String> getBikeRentalNetworks() {
        return stateData.bikeRentalNetworks;
    }

    public Set<String> getCarRentalNetworks() { return stateData.carRentalNetworks; }

    /**
     * Reverse the path implicit in the given state, re-traversing all edges in the opposite
     * direction so as to remove any unnecessary waiting in the resulting itinerary. This produces a
     * path that passes through all the same edges, but which may have a shorter overall duration
     * due to different weights on time-dependent (e.g. transit boarding) edges. If the optimize 
     * parameter is false, the path will be reversed but will have the same duration. This is the 
     * result of combining the functions from GraphPath optimize and reverse.
     *
     * @param optimize Should this path be optimized or just reversed?
     * @param forward Is this an on-the-fly reverse search in the midst of a forward search?
     * @returns a state at the other end (or this end, in the case of a forward search) 
     * of a reversed, optimized path
     */
    public State optimizeOrReverse (boolean optimize, boolean forward) {
        State orig = this;
        State unoptimized = orig;
        State ret = orig.reversedClone();
        long newInitialWaitTime = this.stateData.initialWaitTime;

        Edge edge = null;

        while (orig.getBackState() != null) {
            edge = orig.getBackEdge();

            if (optimize) {
                // first board/last alight: figure in wait time in on the fly optimization
                if (edge instanceof TransitBoardAlight &&
                    forward &&
                    orig.getNumBoardings() == 1 &&
                    (
                        // boarding in a forward main search
                        (((TransitBoardAlight) edge).boarding &&
                            !stateData.opt.arriveBy) ||
                            // alighting in a reverse main search
                            (!((TransitBoardAlight) edge).boarding &&
                                stateData.opt.arriveBy)
                    )
                ) {

                    ret = ((TransitBoardAlight) edge).traverse(ret, orig.getBackState().getTimeSeconds());
                    newInitialWaitTime = ret.stateData.initialWaitTime;
                } else {
                    ret = edge.traverse(ret);
                }

                // Sometimes states are forked, so we have to find the proper forked state to continue reverse
                // optimization.
                while (
                    // avoid non-reverse-traversable edges
                    ret != null &&
                        // make sure the backmode is not null (can occur on first/last states)
                        ret.getBackMode() != null &&
                        orig.getBackMode() != null &&
                        // make sure the modes are the same
                        (ret.getBackMode() != orig.getBackMode() ||
                            // Also make sure vehicle rental states are the same if the mode is the same. The rental
                            // states can differ despite the modes being the same when a vehicle rental is ended on an
                            // edge like steps that requires walking
                            (ret.getBackMode() == orig.getBackMode() &&
                                ret.isVehicleRenting() != orig.isVehicleRenting() &&
                                // Only take into consideration edge traversals that were not on
                                // RentAVehicleAbstractEdges as the rented vehicle state differs on arriveBy vs departAt
                                // queries
                                !(edge instanceof RentAVehicleAbstractEdge)
                            )
                        )
                ) {
                    ret = ret.next; // Keep the mode the same as on the original graph path (in K+R)
                }

                if (ret == null) {
                    LOG.error("Cannot reverse path at edge: " + edge + ", returning unoptimized "
                        + "path. If this edge is a PatternInterlineDwell, or if there is a "
                        + "time-dependent turn restriction here, or if there is no transit leg "
                        + "in a K+R result, this is not totally unexpected. Otherwise, you "
                        + "might want to look into it.");

                    if (forward)
                        return this;
                    else
                        return unoptimized.reverse();
                }
            }
            // Not reverse-optimizing, so we don't re-traverse the edges backward.
            // Instead we just replicate all the states, and replicate the deltas between the state's incremental fields.
            // TODO determine whether this is really necessary, and whether there's a more maintainable way to do this.
            else {
                StateEditor editor = ret.edit(edge);
                // note the distinction between setFromState and setBackState
                editor.setFromState(orig);

                editor.incrementTimeInSeconds(orig.getAbsTimeDeltaSeconds());
                editor.incrementWeight(orig.getWeightDelta());
                editor.incrementWalkDistance(orig.getWalkDistanceDelta());
                editor.incrementPreTransitTime(orig.getPreTransitTimeDelta());
                editor.incrementTransportationNetworkCompanyDistance(orig.getTransportationNetworkCompanyDistanceDelta());
                editor.incrementCarRentalDistance(orig.getCarRentalDistanceDelta());
                editor.incrementVehicleRentalDistance(orig.getVehicleRentalDistanceDelta());

                // propagate the modes through to the reversed edge
                editor.setBackMode(orig.getBackMode());

                State origBackState = orig.getBackState();

                if (orig.isBikeRenting() && !origBackState.isBikeRenting()) {
                    editor.doneVehicleRenting();
                } else if (!orig.isBikeRenting() && origBackState.isBikeRenting()) {
                    editor.beginVehicleRenting(((BikeRentalStationVertex)orig.vertex).getVehicleMode());
                }
                if (orig.isCarRenting() && !origBackState.isCarRenting()) {
                    editor.endCarRenting();
                } else if (!orig.isCarRenting() && origBackState.isCarRenting()) {
                    editor.beginCarRenting(
                        orig.carRentalDriveDistance,
                        orig.getCarRentalNetworks(),
                        orig.stateData.rentedCarAllowsFloatingDropoffs
                    );
                }
                if (orig.isVehicleRenting() && !origBackState.isVehicleRenting()) {
                    editor.endVehicleRenting();
                } else if (!orig.isVehicleRenting() && origBackState.isVehicleRenting()) {
                    editor.beginVehicleRenting(
                        orig.vehicleRentalDistance,
                        orig.getVehicleRentalNetworks(),
                        orig.stateData.rentedVehicleAllowsFloatingDropoffs
                    );
                }
                if (orig.isCarParked() != origBackState.isCarParked())
                    editor.setCarParked(!orig.isCarParked());
                if (orig.isBikeParked() != origBackState.isBikeParked())
                    editor.setBikeParked(!orig.isBikeParked());
                if (orig.isUsingHailedCar() != origBackState.isUsingHailedCar())
                    editor.setUsingHailedCar(!orig.isUsingHailedCar());
                if (orig.isCarRenting() != origBackState.isCarRenting())
                    editor.setCarRenting(!orig.isCarRenting());
                if (orig.isVehicleRenting() != origBackState.isVehicleRenting())
                    editor.setVehicleRenting(!orig.isVehicleRenting());

                editor.setNumBoardings(getNumBoardings() - orig.getNumBoardings());

                ret = editor.makeState();

                //EdgeNarrative origNarrative = orig.getBackEdgeNarrative();
                //EdgeNarrative retNarrative = ret.getBackEdgeNarrative();
                //copyExistingNarrativeToNewNarrativeAsAppropriate(origNarrative, retNarrative);
            }

            orig = orig.getBackState();
        }

        if (forward) {
            State reversed = ret.reverse();
            if (getWeight() <= reversed.getWeight())
                LOG.warn("Optimization did not decrease weight: before " + this.getWeight()
                    + " after " + reversed.getWeight());
            if (getElapsedTimeSeconds() != reversed.getElapsedTimeSeconds())
                LOG.warn("Optimization changed time: before " + this.getElapsedTimeSeconds() + " after "
                    + reversed.getElapsedTimeSeconds());
            if (getActiveTime() <= reversed.getActiveTime())
                // NOTE: this can happen and it isn't always bad (i.e. it doesn't always mean that
                // reverse-opt got called when it shouldn't have). Imagine three lines A, B and C
                // A trip takes line A at 7:00 and arrives at the first transit center at 7:30, where line
                // B is boarded at 7:40 to another transit center with an arrival at 8:00. At 8:30, line C
                // is boarded. Suppose line B runs every ten minutes and the other two run every hour. The
                // optimizer will optimize the B->C connection, moving the trip on line B forward
                // ten minutes. However, it will not be able to move the trip on Line A forward because
                // there is not another possible trip. The waiting time will get pushed towards the
                // the beginning, but not all the way.
                LOG.warn("Optimization did not decrease active time: before "
                    + this.getActiveTime() + " after " + reversed.getActiveTime()
                    + ", boardings: " + this.getNumBoardings());
            if (reversed.getWeight() < this.getBackState().getWeight())
                // This is possible; imagine a trip involving three lines, line A, line B and
                // line C. Lines A and C run hourly while Line B runs every ten minute starting
                // at 8:55. The user boards line A at 7:00 and gets off at the first transfer point
                // (point u) at 8:00. The user then boards the first run of line B at 8:55, an optimal
                // transfer since there is no later trip on line A that could have been taken. The user
                // deboards line B at point v at 10:00, and boards line C at 10:15. This is a
                // non-optimal transfer; the trip on line B can be moved forward 10 minutes. When
                // that happens, the first transfer becomes non-optimal (8:00 to 9:05) and the trip
                // on line A can be moved forward an hour, thus moving 55 minutes of waiting time
                // from a previous state to the beginning of the trip where it is significantly
                // cheaper.
                LOG.warn("Weight has been reduced enough to make it run backwards, now:"
                    + reversed.getWeight() + " backState " + getBackState().getWeight() + ", "
                    + "number of boardings: " + getNumBoardings());
            if (getTimeSeconds() != reversed.getTimeSeconds())
                LOG.warn("Times do not match");
            if (Math.abs(getWeight() - reversed.getWeight()) > 1
                && newInitialWaitTime == stateData.initialWaitTime)
                LOG.warn("Weight is changed (before: " + getWeight() + ", after: "
                    + reversed.getWeight() + "), initial wait times " + "constant at "
                    + newInitialWaitTime);
            if (newInitialWaitTime != reversed.stateData.initialWaitTime)
                LOG.warn("Initial wait time not propagated: is "
                    + reversed.stateData.initialWaitTime + ", should be " + newInitialWaitTime);

            // copy the path parser states so this path is not thrown out going forward
            //            reversed.pathParserStates =
            //                    Arrays.copyOf(this.pathParserStates, this.pathParserStates.length, newLength);

            // copy things that didn't get copied
            reversed.initializeFieldsFrom(this);
            return reversed;
        }
        else
            return ret;
    }

    /**
     * Reverse-optimize a path after it is complete, by default
     */
    public State optimize() {
        return optimizeOrReverse(true, false);
    }

    /**
     * Reverse a path
     */
    public State reverse() {
        return optimizeOrReverse(false, false);
    }

    /**
     * After reverse-optimizing, many things are not set. Set them from the unoptimized state.
     * @param o The other state to initialize things from.
     */
    private void initializeFieldsFrom (State o) {
        StateData currentStateData = this.stateData;

        // easier to clone and copy back, plus more future proof
        this.stateData = o.stateData.clone();
        this.stateData.initialWaitTime = currentStateData.initialWaitTime;
        // this will get re-set on the next alight (or board in a reverse search)
        this.stateData.lastNextArrivalDelta = -1;
    }

    public boolean getReverseOptimizing () {
        return stateData.opt.reverseOptimizing;
    }

    public double getOptimizedElapsedTimeSeconds() {
        return getElapsedTimeSeconds() - stateData.initialWaitTime;
    }

    public boolean hasEnteredNoThruTrafficArea() {
        return stateData.enteredNoThroughTrafficArea;
    }

    /**
     * Search from a vertex until a StreetEdge is found.
     */
    private StreetEdge getFirstSeenStreetEdge(Vertex vertex) {
        Collection<Edge> curEdges = getOptions().arriveBy ? vertex.getIncoming() : vertex.getOutgoing();
        Set<Vertex> seenVertices = new HashSet<>();
        seenVertices.add(vertex);
        int maxBreadth = 5;
        int curBreadth = 1;
        while (curEdges.size() > 0 && curBreadth < maxBreadth) {
            List<Edge> nextEdges = new ArrayList<>();
            for (Edge edge : curEdges) {
                if (edge instanceof StreetEdge) {
                    return (StreetEdge) edge;
                }
                Vertex nextVertex = getOptions().arriveBy ? edge.getFromVertex() : edge.getToVertex();
                if (seenVertices.contains(nextVertex)) {
                    continue;
                }
                nextEdges.addAll(getOptions().arriveBy ? nextVertex.getIncoming() : nextVertex.getOutgoing());
                seenVertices.add(nextVertex);
            }
            curEdges = nextEdges;
            curBreadth++;
        }
        throw new IllegalStateException("Too many rounds of searching for a StreetEdge encountered");
    }

    public void boardHailedCar(double initialEdgeDistance) {
        stateData.usingHailedCar = true;
        stateData.nonTransitMode = TraverseMode.CAR;
        stateData.backMode = TraverseMode.CAR;
        RoutingRequest options = getOptions();
        if (isEverBoarded()) {
            if (options.arriveBy) {
                stateData.hasHailedCarPreTransit = true;
            } else {
                stateData.hasHailedCarPostTransit = true;
            }
        } else {
            if (options.arriveBy) {
                stateData.hasHailedCarPostTransit = true;
            } else {
                stateData.hasHailedCarPreTransit = true;

                // add the earliest ETA of a TNC vehicle if using "departing at" mode and if before transit.
                // This uses the ETA of a TNC vehicle at the origin, so this code is making the assumption that the ETA
                // estimate obtained for the origin is applicable at other places and times so long as transit has not been
                // boarded yet.  The way to obtain ETA estimates for every possible street and vertex would involve making
                // potentially hundreds of thousands of http requests to existing TNC API endpoints.  It sure would be nice
                // if there were a way to download network-wide ETA estimates in a single request, but that option currently
                // does not exist.
                //
                // FIXME: If a non-transit mode travels a significant distance from the origin prior to boarding a TNC, the
                // ETA will still be added when it probably shouldn't be.
                if (options.transportationNetworkCompanyEtaAtOrigin > -1 && !stateData.everBoarded) {
                    // increment the time by the ETA at the origin.
                    time += options.transportationNetworkCompanyEtaAtOrigin * 1000;
                }
            }
        }

        // Add the initial TNC distance as the first StreetEdge traversed is done so while the usingHailedCar flag is
        // still set to false
        transportationNetworkCompanyDriveDistance = initialEdgeDistance;
    }

    public boolean isTNCStopAllowed() {
        return isTNCStopAllowed(getLastSeenStreetEdge(this));
    }

    public boolean isTNCStopAllowed (StreetEdge theEdge) {
        // Make sure travel distance in car is greater than minimum distance
        if (this.transportationNetworkCompanyDriveDistance <
            this.stateData.opt.minimumTransportationNetworkCompanyDistance) {
            return false;
        }

        // see if street edge has some kind of characteristic that forbids TNC pickups/dropoffs
        if (!theEdge.getTNCStopSuitability())
            return false;

        return true;
    }

    /**
     * Helper method for checking if a car rental dropoff is possible at the last seen StreetEdge.
     * If the droppingOffAtDesignatedDropoffArea is true, then the last seen StreetEdge is
     * irrelevant.
     */
    public boolean isCarRentalDropoffAllowed(boolean droppingOffAtDesignatedDropoffArea) {
        return isCarRentalDropoffAllowed(
            droppingOffAtDesignatedDropoffArea ? null : getLastSeenStreetEdge(this),
            droppingOffAtDesignatedDropoffArea
        );
    }

    /**
     * Check if the current search state would allow for the dropoff of a rental car.  If in "arrive
     * by" mode, the search is proceeding backwards and might reach a potential spot where a rental
     * car could be dropped off.  In "depart at" searches, this is checking if the rental car
     * currently being rented could be dropped off at this point.
     *
     * @param theEdge  The StreetEdge that the rental car could be dropped off at.
     * @param droppingOffAtDesignatedDropoffArea  Whether the car is being dropped off at a
     *                                            designated car rental dropoff area.
     * @return
     */
    public boolean isCarRentalDropoffAllowed(
        StreetEdge theEdge,
        boolean droppingOffAtDesignatedDropoffArea
    ) {
        RoutingRequest options = this.stateData.opt;

        // To rent a car, we need to have car rental allowed in request.
        if (!options.allowCarRental)
            return false;

        if (options.arriveBy) {
            // the search is progressing backwards, so this is the point where a car rental would "begin" by entering
            // into a car rental state.

            // make sure a car is not currently being rented.  Why drive 2 cars at once?
            if (this.isCarRenting()) {
                // already renting a car, don't allow 2 car rentals at once.
                return false;
            }

            if (isEverBoarded()) {
                // make sure a car hasn't already been rented after transit
                if (stateData.hasRentedCarPostTransit()) {
                    // a car has already been rented after taking transit, car rental not possible anymore
                    return false;
                }
            } else {
                // make sure a car hasn't already been rented before transit
                if (stateData.hasRentedCarPreTransit()) {
                    // a car has already been rented before transit, don't begin renting another one until we take
                    // transit
                    return false;
                }
            }
        } else {
            // make sure a car is currently being rented.
            if (!this.isCarRenting()) {
                // Can't dropoff a car that isn't being rented
                return false;
            }
        }

        // If not searching backwards, make sure travel distance in car is greater than minimum distance
        if (
            !options.arriveBy &&
                this.carRentalDriveDistance < this.stateData.opt.minimumCarRentalDistance
        ) {
            // haven't traveled far enough, dropoff not possible
            return false;
        }

        // if the car is being dropped off at a designated dropoff area such as a car rental station that might have
        // parking spaces. No further state checks are needed, so return true.
        if (droppingOffAtDesignatedDropoffArea) {
            return true;
        }

        // At this point, the car is going to be dropped off on some kind of StreetEdge.  But first, a sanity check is
        // needed to  make sure we're actually working with an edge here.
        if (theEdge == null) {
            return false;
        }

        // check if the street edge has some characteristic that would not be suitable for leaving the car at
        if (!theEdge.getFloatingCarDropoffSuitability()) {
            // Dropping off not allowed at the StreetEdge, return false.
            return false;
        }

        if (options.allowCarRentalDropoffAnywhere) {
            // User has specified in routing request they intend to keep car even if dropping off outside a car rental
            // region.
            return true;
        }

        // make sure the car networks associated with the edge make a floating dropoff possible.
        if (options.arriveBy) {
            // the search is progressing backwards to the origin an a floating car dropoff might have occurred at this
            // StreetEdge. Make sure there is at least one possible car network that allows floating dropoffs at this
            // StreetEdge.
            return theEdge.getCarNetworks() != null && theEdge.getCarNetworks().size() > 0;
        } else {
            // if the car is not being dropped off at a designated area for dropping off car rentals and the user wants
            // to do a dropoff inside the car rental region, make sure that the car that was rented allows floating
            // dropoffs
            if (!stateData.rentedCarAllowsFloatingDropoffs) {
                // the car must be returned at a car rental station, return false.
                return false;
            }

            // Check if the floating car is within a compatible car rental region
            CarRentalStationService carService = getContext().graph.getService(
                CarRentalStationService.class
            );
            for (String network : stateData.carRentalNetworks) {
                boolean hasRegionDefined = carService.getCarRentalRegions().get(network) != null;
                if (!hasRegionDefined || theEdge.containsCarNetwork(network)) {
                    return true;
                }
            }
            // The rented car and StreetEdge do not share any common car rental networks, therefore a dropoff is not
            // allowed
            return false;
        }
    }

    public void beginCarRenting(double initialEdgeDistance, Set<String> networks, boolean rentedCarAllowsFloatingDropoffs) {
        stateData.usingRentedCar = true;
        stateData.nonTransitMode = TraverseMode.CAR;
        stateData.backMode = backState != null ? backState.getNonTransitMode() : null;
        stateData.carRentalNetworks = networks;
        stateData.rentedCarAllowsFloatingDropoffs = rentedCarAllowsFloatingDropoffs;
        if (isEverBoarded()) {
            stateData.hasRentedCarPostTransit = true;
        } else {
            stateData.hasRentedCarPreTransit = true;
        }
        carRentalDriveDistance = initialEdgeDistance;
    }

    /**
     * Returns the last street edge traversed by scanning the backEdge of the state chain backward.
     * @param state a State
     */
    private StreetEdge getLastSeenStreetEdge(State state) {
        if (state == null) {
            return null;
        }
        if (state.backEdge instanceof StreetEdge) {
            return (StreetEdge) state.backEdge;
        }
        return getLastSeenStreetEdge(state.backState);
    }

    /**
     * Helper method for checking if a vehicle rental dropoff is possible at the last seen StreetEdge.
     * If the droppingOffAtDesignatedDropoffArea is true, then the last seen StreetEdge is
     * irrelevant.
     */
    public boolean isVehicleRentalDropoffAllowed(boolean droppingOffAtDesignatedDropoffArea) {
        return isVehicleRentalDropoffAllowed(
            droppingOffAtDesignatedDropoffArea ? null : getLastSeenStreetEdge(this),
            droppingOffAtDesignatedDropoffArea
        );
    }

    /**
     * Check if the current search state would allow for the dropoff of a rental vehicle.  If in "arrive
     * by" mode, the search is proceeding backwards and might reach a potential spot where a rental
     * vehicle could be dropped off.  In "depart at" searches, this is checking if the rental vehicle
     * currently being rented could be dropped off at this point.
     *
     * @param theEdge  The StreetEdge that the rental vehicle could be dropped off at.
     * @param droppingOffAtDesignatedDropoffArea  Whether the vehicle is being dropped off at a
     *                                            designated vehicle rental dropoff area.
     * @return
     */
    public boolean isVehicleRentalDropoffAllowed(
        StreetEdge theEdge,
        boolean droppingOffAtDesignatedDropoffArea
    ) {
        RoutingRequest options = this.stateData.opt;

        // To rent a vehicle, we need to have vehicle rental allowed in request.
        if (!options.allowVehicleRental)
            return false;

        if (options.arriveBy) {
            // the search is progressing backwards, so this is the point where a vehicle rental would "begin" by
            // entering into a vehicle rental state.

            // make sure a vehicle is not currently being rented.
            if (this.isVehicleRenting()) {
                // Forbid using more than 1 rental vehicle at once.
                return false;
            }

            if (isEverBoarded()) {
                // make sure a vehicle hasn't already been rented after transit
                if (stateData.hasRentedVehiclePostTransit()) {
                    // a vehicle has already been rented after taking transit, vehicle rental not possible anymore
                    return false;
                }
            } else {
                // make sure a vehicle hasn't already been rented before transit
                if (stateData.hasRentedVehiclePreTransit()) {
                    // a vehicle has already been rented before transit, don't begin renting another one until we take
                    // transit
                    return false;
                }
            }
        } else {
            // make sure a vehicle is currently being rented.
            if (!this.isVehicleRenting()) {
                // Can't dropoff a vehicle that isn't being rented
                return false;
            }
        }

        // If not searching backwards, make sure travel distance in vehicle is greater than minimum distance
        if (
            !options.arriveBy &&
                this.vehicleRentalDistance < this.stateData.opt.minimumVehicleRentalDistance
        ) {
            // vehicle hasn't been ridden far enough
            return false;
        }

        // if the vehicle is being dropped off at a designated dropoff area such as a docking station that might have
        //  parking spaces. No further state checks are needed, so return true.
        if (droppingOffAtDesignatedDropoffArea) {
            return true;
        }

        // At this point, the vehicle could be dropped off on some kind of StreetEdge unless the StreetEdge forbids it.
        // First, a sanity check is needed to  make sure we're actually working with an edge here.
        if (theEdge == null) {
            return false;
        }

        // check if the street edge has some characteristic that would not be suitable for leaving the vehicle at
        if (!theEdge.getFloatingVehicleDropoffSuitability()) {
            // Floating vehicles cannot be dropped off at the edge.
            return false;
        }

        if (options.allowVehicleRentalDropoffAnywhere) {
            // User has specified in routing request they intend to keep the vehicle even if dropping off outside a
            // vehicle rental region.
            return true;
        }

        // make sure the vehicle networks associated with the edge make a floating dropoff possible.
        if (options.arriveBy) {
            // the search is progressing backwards to the origin an a floating vehicle dropoff might have occurred at
            // this StreetEdge. Make sure there is at least one possible vehicle network that allows floating dropoffs
            // at this StreetEdge.
            return theEdge.getVehicleNetworks() != null && theEdge.getVehicleNetworks().size() > 0;
        } else {
            // if the vehicle is not being dropped off at a designated area for dropping off vehicle rentals
            // and the user wants to do a dropoff inside the vehicle rental region, make sure that the
            // vehicle that was rented allows floating dropoffs
            if (!stateData.rentedVehicleAllowsFloatingDropoffs) {
                // rented vehicle must be dropped off at a vehicle rental station
                return false;
            }

            // Check if the floating vehicle is within a compatible vehicle rental region
            VehicleRentalStationService vehicleService = getContext().graph.getService(
                VehicleRentalStationService.class
            );
            for (String network : stateData.vehicleRentalNetworks) {
                boolean hasRegionDefined = vehicleService.getVehicleRentalRegions().get(network) != null;
                if (!hasRegionDefined || theEdge.containsVehicleNetwork(network)) {
                    return true;
                }
            }

            // The rented vehicle's networks and the edge's networks don't have any compatibility, so a dropoff is not
            // possible here.
            return false;
        }
    }

    public boolean isVehicleRenting() { return stateData.usingRentedVehicle; }

    public Set<String> getVehicleRentalNetworks() { return stateData.vehicleRentalNetworks; }

    public void beginVehicleRenting(
        double initialEdgeDistance,
        Set<String> networks,
        boolean rentedVehicleAllowsFloatingDropoffs
    ) {
        stateData.usingRentedVehicle = true;
        stateData.nonTransitMode = TraverseMode.MICROMOBILITY;
        stateData.backMode = backState != null ? backState.getNonTransitMode() : null;
        stateData.vehicleRentalNetworks = networks;
        stateData.rentedVehicleAllowsFloatingDropoffs = rentedVehicleAllowsFloatingDropoffs;
        if (isEverBoarded()) {
            stateData.hasRentedVehiclePostTransit = true;
        } else {
            stateData.hasRentedVehiclePreTransit = true;
        }
        vehicleRentalDistance = initialEdgeDistance;
    }
}

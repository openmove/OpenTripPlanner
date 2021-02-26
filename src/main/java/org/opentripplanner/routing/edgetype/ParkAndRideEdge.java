package org.opentripplanner.routing.edgetype;

import org.opentripplanner.common.MavenVersion;
import org.opentripplanner.common.geometry.GeometryUtils;
import org.opentripplanner.common.geometry.SphericalDistanceLibrary;
import org.opentripplanner.routing.core.RoutingRequest;
import org.opentripplanner.routing.core.State;
import org.opentripplanner.routing.core.StateEditor;
import org.opentripplanner.routing.core.TraverseMode;
import org.opentripplanner.routing.graph.Edge;
import org.opentripplanner.routing.graph.Vertex;
import org.opentripplanner.routing.vertextype.ParkAndRideVertex;

import org.locationtech.jts.geom.LineString;
import java.util.Locale;

/**
 * Parking a car at a park-and-ride station.
 * 
 * We only allow going from CAR to WALK mode. Routing the opposite way would need more information
 * (ie knowing where you park your car in the first place), and is probably better handled by a
 * two-step routing (in walk mode from origin to parking, then in car mode from the parking to
 * destination).
 * 
 * @author laurent
 * 
 */
public class ParkAndRideEdge extends Edge {

    private static final long serialVersionUID = MavenVersion.VERSION.getUID();

    public ParkAndRideEdge(ParkAndRideVertex parkAndRide) {
        super(parkAndRide, parkAndRide);
    }

    @Override
    public State traverse(State s0) {
        RoutingRequest request = s0.getOptions();
        if (!request.parkAndRide) {
            return null;
        }
        if (request.arriveBy) {
            /*
             * To get back a car, we need to walk and have car mode enabled.
             */
            if (s0.getNonTransitMode() != TraverseMode.WALK) {
                return null;
            }
            if (!s0.isCarParked()) {
                throw new IllegalStateException("Stolen car?");
            }
            StateEditor s1 = s0.edit(this);
            int time = request.carDropoffTime;
            s1.incrementWeight(time);
            s1.incrementWeight(calculateProximityPenalty(request));
            s1.incrementTimeInSeconds(time);
            s1.setCarParked(false);
            s1.setBackMode(TraverseMode.LEG_SWITCH);
            return s1.makeState();
        } else {
            /*
             * To park a car, we need to be in one and have allowed walk modes.
             */
            if (s0.getNonTransitMode() != TraverseMode.CAR) {
                return null;
            }
            if (s0.isCarParked()) {
                throw new IllegalStateException("Can't drive 2 cars");
            }
            StateEditor s1 = s0.edit(this);
            int time = request.carDropoffTime;
            s1.incrementWeight(time);
            s1.incrementWeight(calculateProximityPenalty(request));
            s1.incrementTimeInSeconds(time);
            s1.setCarParked(true);
            s1.setBackMode(TraverseMode.LEG_SWITCH);
            return s1.makeState();
        }
    }

    /**
     * Calculates a one-time addition of weight to add to the state based on the proximity of the Park and Ride to the
     * destination relative to the overall journey length. The calculated weight increases exponentially the closer the
     * Park and Ride is to the destination. This will result in Park and Rides very close to the destination having
     * large weights added while those further away not receiving any additional weight which disincentivizes journeys
     * that utilize a Park and Ride close to the destination.
     */
    private double calculateProximityPenalty(RoutingRequest request) {
        // calculate the total straight-line distance of the journey from origin to destination
        Vertex origin = request.rctx.origin;
        Vertex destination = request.rctx.target;
        double totalDistance = SphericalDistanceLibrary.fastDistance(
            origin.getLat(),
            origin.getLon(),
            destination.getLat(),
            destination.getLon()
        );

        // calculate the remaining straight-line distance from the Park and Ride to the destination
        double remainingDistance = SphericalDistanceLibrary.fastDistance(
            fromv.getLat(),
            fromv.getLon(),
            destination.getLat(),
            destination.getLon()
        );

        // calculate the remaining distance as a percent of the total distance
        double pctRemainingDistance = remainingDistance / totalDistance;

        // calculate the weight multiplier using the following made-up polynomial function. This function creates a
        // multiplier of 0 when at the origin and a multiplier of 8 when at the destination. At halfway the multiplier
        // is 0.26 and at three-quarters of the way to the park and ride the multiplier is 1.66.
        double multiplier = 4 * Math.pow(1 - pctRemainingDistance, 8) + 4 * Math.pow(1 - pctRemainingDistance, 4);

        // calculate the additional weight by applying the multiplier to the time it would take to drive in a straight
        // line the whole way from origin to destination. This results in Park and Rides having increasingly large
        // weight penalties applied as they get closer to the destination.
//        return totalDistance / request.rctx.opt.carSpeed * multiplier;
        return 0;
    }

    @Override
    public double getDistance() {
        return 0;
    }

    @Override
    public LineString getGeometry() {
        return null;
    }

    @Override
    public String getName() {
        return getToVertex().getName();
    }

    @Override
    public String getName(Locale locale) {
        return getToVertex().getName(locale);
    }

    @Override
    public boolean hasBogusName() {
        return false;
    }
}

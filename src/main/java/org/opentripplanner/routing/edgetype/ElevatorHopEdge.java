package org.opentripplanner.routing.edgetype;

import org.opentripplanner.routing.core.State;
import org.opentripplanner.routing.core.StateEditor;
import org.opentripplanner.routing.core.TraverseMode;
import org.opentripplanner.routing.core.RoutingRequest;
import org.opentripplanner.routing.graph.Edge;
import org.opentripplanner.routing.graph.Vertex;

import org.locationtech.jts.geom.LineString;
import java.util.Locale;

/**
 * A relatively low cost edge for travelling one level in an elevator.
 * @author mattwigway
 *
 */
public class ElevatorHopEdge extends Edge implements ElevatorEdge, WheelchairEdge {

    private static final long serialVersionUID = 3925814840369402222L;

    private StreetTraversalPermission permission;

    public boolean wheelchairAccessible = true;

    public ElevatorHopEdge(Vertex from, Vertex to, StreetTraversalPermission permission) {
        super(from, to);
        this.permission = permission;
    }
    
    @Override
    public State traverse(State s0) {
        RoutingRequest options = s0.getOptions();

        TraverseMode mode = s0.getNonTransitMode();

        if (mode == TraverseMode.WALK && 
            !permission.allows(StreetTraversalPermission.PEDESTRIAN)) {
            return null;
        }

        if (mode == TraverseMode.BICYCLE &&
            !permission.allows(StreetTraversalPermission.BICYCLE)) {
            return null;
        }

        if (mode == TraverseMode.MICROMOBILITY &&
            !permission.allows(StreetTraversalPermission.MICROMOBILITY)) {
            return null;
        }
        // there are elevators which allow cars
        if (mode == TraverseMode.CAR
            && !permission.allows(StreetTraversalPermission.CAR)) {
            return null;
        }

        StateEditor s1 = s0.edit(this);

        s1.setBackMode(TraverseMode.WALK);

        if (options.wheelchairAccessible && !wheelchairAccessible) {
            // Apply a time penalty, in addition to the cost penalty, so that accessible transfers
            // work. When we compute transfers we only look at the time and hence increasing just
            // the cost would not work:
            // https://github.com/ibi-group/OpenTripPlanner/blob/f2b375364985b8dd83f791950d955e3ec5c9cb34/src/main/java/org/opentripplanner/routing/algorithm/EarliestArrivalSearch.java#L76
            s1.incrementWeight(options.noWheelchairAccessOnElevatorPenalty);
            s1.incrementTimeInSeconds(options.noWheelchairAccessOnElevatorPenalty);
        }

        s1.incrementWeight(options.elevatorHopCost);
        s1.incrementTimeInSeconds(options.elevatorHopTime);

        return s1.makeState();
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
        return null;
    }
    
    public String toString() {
        return "ElevatorHopEdge(" + fromv + " -> " + tov + ")";
    }

    @Override
    public String getName(Locale locale) {
        return this.getName();
    }

    @Override
    public boolean isWheelchairAccessible() {
        return wheelchairAccessible;
    }
}

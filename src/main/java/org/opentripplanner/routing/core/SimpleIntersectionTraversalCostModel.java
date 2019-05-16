package org.opentripplanner.routing.core;

import org.opentripplanner.routing.edgetype.StreetEdge;
import org.opentripplanner.routing.vertextype.IntersectionVertex;

import java.io.Serializable;

public class SimpleIntersectionTraversalCostModel extends AbstractIntersectionTraversalCostModel implements Serializable {

    // Model parameters are here. //
    // Constants for when there is a traffic light.

    /** Expected time it takes to make a right at a light. */
    private Double expectedRightAtLightTimeSec = 15.0;

    /** Expected time it takes to continue straight at a light. */
    private Double expectedStraightAtLightTimeSec = 15.0;

    /** Expected time it takes to turn left at a light. */
    private Double expectedLeftAtLightTimeSec = 15.0;

    // Constants for when there is no traffic light

    /** Expected time it takes to make a right without a stop light. */
    private Double expectedRightNoLightTimeSec = 8.0;

    /** Expected time it takes to continue straight without a stop light. */
    private Double expectedStraightNoLightTimeSec = 5.0;

    /** Expected time it takes to turn left without a stop light. */
    private Double expectedLeftNoLightTimeSec = 8.0;

    @Override
    public double computeTraversalCost(IntersectionVertex v, StreetEdge from, StreetEdge to, TraverseMode mode,
                                       RoutingRequest options, float fromSpeed, float toSpeed) {

        // If the vertex is free-flowing then (by definition) there is no cost to traverse it.
        if (v.inferredFreeFlowing()) {
            return 0;
        }

        // Non-driving cases are much simpler. Handled generically in the base class.
        // The turn times are much lower with non-driving, so if using Micromobility, use driving turn times
        if (!mode.isDriving() && mode != TraverseMode.MICROMOBILITY) {
            return computeNonDrivingTraversalCost(v, from, to, fromSpeed, toSpeed);
        }

        double turnCost = 0;

        int turnAngle = calculateTurnAngle(from, to, options);
        if (v.trafficLight) {
            // Use constants that apply when there are stop lights.
            if (isRightTurn(turnAngle)) {
                turnCost = expectedRightAtLightTimeSec;
            } else if (isLeftTurn(turnAngle)) {
                turnCost = getLeftTurnCost(expectedLeftAtLightTimeSec, from, to);
            } else {
                turnCost = getStraightTurnCost(v, from, to, expectedStraightAtLightTimeSec);
            }
        } else {

            //assume highway vertex
            if(from.getCarSpeed()>25 && to.getCarSpeed()>25) {
                return 0;
            }

            // Use constants that apply when no stop lights.
            if (isRightTurn(turnAngle)) {
                turnCost = expectedRightNoLightTimeSec;
            } else if (isLeftTurn(turnAngle)) {
                turnCost = getLeftTurnCost(expectedLeftNoLightTimeSec, from, to);;
            } else {
                turnCost = getStraightTurnCost(v, from, to, expectedStraightNoLightTimeSec);
            }
        }

        return turnCost;
    }

    /**
     * Add a big penalty for left turns from tertiary roads to non-tertiary roads.
     */
    private double getLeftTurnCost(Double baseTurnCost, StreetEdge from, StreetEdge to) {
        int roadWayClassDiff = from.getRoadWayClass() - to.getRoadWayClass();
        return roadWayClassDiff < 0
            // going from a higher class to a lower class
            // reduce the penalty from base case by 1 second
            ? baseTurnCost - 1
            // turning from an equal or lower class onto an equal or higher class
            // multiply the penalty by the log of the difference in classes + 1
            : baseTurnCost * (1 + Math.log(roadWayClassDiff + 1));
    }

    /**
     * Straight turns should often have lower delay, but certain characteristics should make the delay even lower.
     * For example, one-way streets are generally faster than two-way streets. Also, straight turns at intersections
     * where all other roadway types are an equal or lower classification of roadway should be considered free-flowing.
     *
     * @param v
     * @param from
     * @param to
     * @param baseTurnCost
     * @return
     */
    private double getStraightTurnCost(
        IntersectionVertex v,
        StreetEdge from,
        StreetEdge to,
        double baseTurnCost
    ) {
        // iterate through all other outgoing edges to check if they have a greater or equal classification
        boolean otherOutgoingEdgesHaveLowerClassification = true;
        int maxOtherClassification = 0;
        for (StreetEdge outgoingStreetEdge : v.getOutgoingStreetEdges()) {
            if (outgoingStreetEdge != from && outgoingStreetEdge.wayId != from.wayId &&
                outgoingStreetEdge != to && outgoingStreetEdge.wayId != to.wayId &&
                outgoingStreetEdge.getRoadWayClass() >= from.getRoadWayClass() &&
                outgoingStreetEdge.getRoadWayClass() >= to.getRoadWayClass()
            ) {
                otherOutgoingEdgesHaveLowerClassification = false;
                maxOtherClassification = Math.max(maxOtherClassification, outgoingStreetEdge.getRoadWayClass());
            }
        }
        boolean oneWayTurn = from.isOneWay() && to.isOneWay();
        return otherOutgoingEdgesHaveLowerClassification
            // lower delay due to other StreetEdges being of lower classification
            ? (oneWayTurn
                ? ((maxOtherClassification == 7 && from.getRoadWayClass() > 7 && to.getRoadWayClass() > 7)
                    // 0 turn penalty if
                    // - on a one-way
                    // - both from and to edgesAV having class > 7
                    // - all other edges being lowest class ways (service, footway, etc)
                    ? 0
                    // give all other one ways half the base cost for all other types
                    : baseTurnCost * 0.5)
                // not one-way, but other roadways are equal or lower class, so give a slight advantage over the base cost
                : baseTurnCost * 0.8
            )
            // outgoing edges have greater or equal classification, bump up cost a little
            : baseTurnCost * (oneWayTurn ? 1.1 : 1.2);
    }
}

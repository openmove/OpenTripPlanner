package org.opentripplanner.openstreetmap.model;

import java.util.ArrayList;
import java.util.List;

public class OSMWay extends OSMWithTags {

    private List<Long> nodes = new ArrayList<Long>();

    public void addNodeRef(OSMNodeRef nodeRef) {
        nodes.add(nodeRef.getRef());
    }

    public void addNodeRef(long nodeRef) {
        nodes.add(nodeRef);
    }

    public void addNodeRef(long nodeRef, int index) {
        nodes.add(index, nodeRef);
    }

    public List<Long> getNodeRefs() {
        return nodes;
    }

    public String toString() {
        return "osm way " + id;
    }

    /**
     * Returns true if bicycle dismounts are forced.
     * 
     * @return
     */
    public boolean isBicycleDismountForced() {
        String bicycle = getTag("bicycle");
        return isTag("cycleway", "dismount") || "dismount".equals(bicycle);
    }

    /**
     * Returns true if these are steps.
     * 
     * @return
     */
    public boolean isSteps() {
        return "steps".equals(getTag("highway"));
    }

    /**
     * Is this way a roundabout?
     * 
     * @return
     */
    public boolean isRoundabout() {
        return "roundabout".equals(getTag("junction"));
    }

    /**
     * Returns true if this is a one-way street for driving.
     * 
     * @return
     */
    public boolean isOneWayForwardDriving() {
        return isTagTrue("oneway");
    }

    /**
     * Returns true if this way is one-way in the opposite direction of its definition.
     * 
     * @return
     */
    public boolean isOneWayReverseDriving() {
        return isTag("oneway", "-1");
    }

    /**
     * Returns true if bikes can only go forward.
     * 
     * @return
     */
    public boolean isOneWayForwardBicycle() {
        String oneWayBicycle = getTag("oneway:bicycle");
        return isTrue(oneWayBicycle) || isTagFalse("bicycle:backwards");
    }

    /**
     * Returns true if bikes can only go in the reverse direction.
     * 
     * @return
     */
    public boolean isOneWayReverseBicycle() {
        return "-1".equals(getTag("oneway:bicycle"));
    }

    /**
     * Returns true if bikes must use sidepath in forward direction
     * 
     * @return 
     */
    public boolean isForwardDirectionSidepath() {
        return "use_sidepath".equals(getTag("bicycle:forward"));
    }

    /**
     * Returns true if bikes must use sidepath in reverse direction
     * 
     * @return 
     */
    public boolean isReverseDirectionSidepath() {
        return "use_sidepath".equals(getTag("bicycle:backward"));
    }

    /**
     * Some cycleways allow contraflow biking.
     * 
     * @return
     */
    public boolean isOpposableCycleway() {
        // any cycleway which is opposite* allows contraflow biking
        String cycleway = getTag("cycleway");
        String cyclewayLeft = getTag("cycleway:left");
        String cyclewayRight = getTag("cycleway:right");

        return (cycleway != null && cycleway.startsWith("opposite"))
                || (cyclewayLeft != null && cyclewayLeft.startsWith("opposite"))
                || (cyclewayRight != null && cyclewayRight.startsWith("opposite"));
    }

    /**
     * Returns true if any cycleway: track tag exists on the way.
     */
    public boolean hasAnyCycleTrack() {
        String cycleway = getTag("cycleway");
        String cyclewayLeft = getTag("cycleway:left");
        String cyclewayRight = getTag("cycleway:right");

        return (cycleway != null && cycleway.contains("track"))
            || (cyclewayLeft != null && cyclewayLeft.contains("track"))
            || (cyclewayRight != null && cyclewayRight.contains("track"));
    }

    // an array of highway tags considered tertiary.
    // See descriptions of each tag type here: https://wiki.openstreetmap.org/wiki/Key:highway
    private static final String[] tertiaryHighwayTagTypes = new String[]{
        "service",
        "pedestrian",
        "escape",
        "footway",
        "bridleway",
        "steps",
        "path",
        "cycleway",
        "elevator",
        "rest_area",
        "services",
        "emergency_bay",
        "trail"
    };

    /**
     * Returns true if this way is NOT some kind of primary or secondary road (ie is a service way, footpath, steps or
     * other kind of way that does not warrant adding extra delay to the CAR or MICROMOBILITY modes on straight turns)
     */
    public boolean isTertiaryWay() {
        String highwayType = getTag("highway");
        if (highwayType == null) return true; // is it possible to have a streetedge without a highway tag?
        for (String tertiaryHighwayTagType : tertiaryHighwayTagTypes) {
            if (highwayType.equalsIgnoreCase(tertiaryHighwayTagType)) return true;
        }
        return false;
    }
}

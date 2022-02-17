package org.opentripplanner.model;

import org.locationtech.jts.geom.Geometry;
import org.opentripplanner.routing.trippattern.Deduplicator;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Class to keep track of GTFS-Flex related StopPattern parameters
 */
public class StopPatternFlexFields implements Serializable {

    private static final long serialVersionUID = 1L;

    public final int size;

    public final int[] continuousPickup;
    public final int[] continuousDropOff;
    public final double[] serviceAreaRadius;
    public final Geometry[] serviceAreas; // likely at most one distinct object will be in this array
    public final int[] flexStartWindow;
    public final int[] flexEndWindow;

    /**
     * Default constructor.
     * @param stopTimes stopTimes for this pattern
     * @param areaGeometryByArea Map of GTFS-Flex areas, keyed by area ID
     * @param deduplicator Deduplicator
     */
    public StopPatternFlexFields(List<StopTime> stopTimes, Map<String, Geometry> areaGeometryByArea, Deduplicator deduplicator) {
        size = stopTimes.size();
        if (size == 0) {
            continuousPickup = new int[size];
            continuousDropOff = new int[size];
            serviceAreaRadius = new double[size];
            serviceAreas = new Geometry[size];
            flexEndWindow = new int[size];
            flexStartWindow = new int[size];

            return;
        }
        int[] continuousPickup = new int[size];
        int[] continuousDropOff = new int[size];
        double[] serviceAreaRadius = new double[size];
        int[] flexEndWindow = new int[size];
        int[] flexStartWindow = new int[size];

        serviceAreas = new Geometry[size];
        double lastServiceAreaRadius = 0;
        Geometry lastServiceArea = null;
        for (int i = 0; i < size; ++i) {
            StopTime stopTime = stopTimes.get(i);

            // continuous stops can be empty, which means 1 (no continuous stopping behavior)
            continuousPickup[i] = stopTime.getContinuousPickup() == StopTime.MISSING_VALUE ? 1 : stopTime.getContinuousPickup();
            continuousDropOff[i] = stopTime.getContinuousDropOff() == StopTime.MISSING_VALUE ? 1 : stopTime.getContinuousDropOff();

            flexStartWindow[i] = stopTime.getFlexWindowStart() == StopTime.MISSING_VALUE ? -1 : stopTime.getFlexWindowStart();
            flexEndWindow[i] = stopTime.getFlexWindowEnd() == StopTime.MISSING_VALUE ? -1 : stopTime.getFlexWindowEnd();

            if (stopTime.getStartServiceAreaRadius() != StopTime.MISSING_VALUE) {
                lastServiceAreaRadius = stopTime.getStartServiceAreaRadius();
            }
            serviceAreaRadius[i] = lastServiceAreaRadius;
            if (stopTime.getEndServiceAreaRadius() != StopTime.MISSING_VALUE) {
                lastServiceAreaRadius = 0;
            }

            if (areaGeometryByArea != null) {
                if (stopTime.getStartServiceArea() != null) {
                    lastServiceArea = areaGeometryByArea.get(stopTime.getStartServiceArea().getAreaId());
                }
                serviceAreas[i] = lastServiceArea;
                if (stopTime.getEndServiceArea() != null) {
                    lastServiceArea = null;
                }
            }
        }
        this.continuousPickup = deduplicator.deduplicateIntArray(continuousPickup);
        this.continuousDropOff = deduplicator.deduplicateIntArray(continuousDropOff);

        this.flexStartWindow = deduplicator.deduplicateIntArray(flexStartWindow);
        this.flexEndWindow = deduplicator.deduplicateIntArray(flexEndWindow);

        this.serviceAreaRadius = deduplicator.deduplicateDoubleArray(serviceAreaRadius);

    }

    @Override
    public int hashCode() {
        int hash = size;
        hash += Arrays.hashCode(this.continuousPickup);
        hash *= 31;
        hash += Arrays.hashCode(this.continuousDropOff);
        hash *= 31;
        hash += Arrays.hashCode(this.flexStartWindow);
        hash *= 31;
        hash += Arrays.hashCode(this.flexEndWindow);
        hash *= 31;
        hash += Arrays.hashCode(this.serviceAreas);
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StopPatternFlexFields that = (StopPatternFlexFields) o;
        if (size != that.size) return false;
        if (!Arrays.equals(continuousPickup, that.continuousPickup)) return false;
        if (!Arrays.equals(continuousDropOff, that.continuousDropOff)) return false;
        if (!Arrays.equals(serviceAreaRadius, that.serviceAreaRadius)) return false;
        if (!Arrays.equals(flexEndWindow, that.flexEndWindow)) return false;
        if (!Arrays.equals(flexStartWindow, that.flexStartWindow)) return false;
        return Arrays.equals(serviceAreas, that.serviceAreas);
    }
}

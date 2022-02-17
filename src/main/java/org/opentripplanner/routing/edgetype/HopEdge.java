package org.opentripplanner.routing.edgetype;

import org.opentripplanner.model.Stop;

import org.locationtech.jts.geom.LineString;
import org.opentripplanner.model.StopLocation;

/**
 * FrequencyHops and PatternHops have start/stop Stops
 * @author novalis
 *
 */
public interface HopEdge {

    StopLocation getEndStop();

    StopLocation getBeginStop();

    void setGeometry(LineString geometry);

    String getFeedId();
}

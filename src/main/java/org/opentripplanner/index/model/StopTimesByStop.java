/* This program is free software: you can redistribute it and/or
modify it under the terms of the GNU Lesser General Public License
as published by the Free Software Foundation, either version 3 of
the License, or (at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>. */

package org.opentripplanner.index.model;

import com.google.common.collect.Lists;
import com.vividsolutions.jts.geom.Coordinate;
import org.onebusaway.gtfs.model.Stop;
import org.opentripplanner.api.model.alertpatch.LocalizedAlert;
import org.opentripplanner.routing.alertpatch.Alert;
import org.opentripplanner.util.PolylineEncoder;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Some stopTimes all from the same stop.
 */
public class StopTimesByStop {

    private StopShort stop;

    private List<StopTimesInPattern> patterns = Lists.newArrayList();

    public List<LocalizedAlert> alerts;

    public StopTimesByStop(Stop stop, double distance, long walkTime, Iterable<Coordinate> coordinates, boolean groupByParent, List<StopTimesInPattern> stopTimesInPattern) {
        this.stop = new StopShort(stop);
        if (distance >= 0) {
            this.stop.dist = (int) Math.round(distance);
        }
        if (coordinates != null) {
            this.stop.geometry = PolylineEncoder.createEncodings(coordinates);
        }
        if (walkTime >= 0) {
            this.stop.walkTime = walkTime;
        }
        if (stop.getParentStation() != null && groupByParent) {
            this.stop.id.setId(stop.getParentStation());
            this.stop.cluster = null;
            // TODO we only know lat and lon match because it's an MTA convention
        }
        this.patterns = stopTimesInPattern;
    }

    public StopTimesByStop(Stop stop, boolean groupByParent, List<StopTimesInPattern> stopTimesInPattern) {
        this(stop, -1, -1, null, groupByParent, stopTimesInPattern);
    }

        /**
         * Stop which these arrival-departures are supplied for. If groupByParent = true, this will be a parent station
         * (if parent stations are given in GTFS).
         */
    public StopShort getStop() {
        return stop;
    }

    /**
     * List of groups of arrival-departures, separated out by TripPattern
     */
    public List<StopTimesInPattern> getPatterns() {
        return patterns;
    }

    public void addPatterns(List<StopTimesInPattern> stip) {
        patterns.addAll(stip);
    }

    public void addAlert(Alert alert, Locale locale) {
        if (alerts == null) {
            alerts = new ArrayList<>();
        }
        for (LocalizedAlert a : alerts) {
            if (a.alert.equals(alert)) {
                return;
            }
        }
        alerts.add(new LocalizedAlert(alert, locale));
    }
}

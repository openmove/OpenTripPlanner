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

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

/** StopTimes, all with same route and headsign */
public class StopTimesByRouteAndHeadsign {
    /**
     * Route which these arrival-departures are associated with.
     */
    private RouteShort route;

    /** Upcoming arrivals/departures at stop, ordered by earliest arrival */
    private SortedSet<TripTimeShort> times = new TreeSet<>(Comparator.comparingInt(TripTimeShort::getRealtimeArrival));

    /** Headsign of this group */
    private String headsign;

    /** Is the grouping headsign a stopHeadsign or tripHeadsign */
    private boolean isStopHeadsign;

    public StopTimesByRouteAndHeadsign(RouteShort route, String headsign, boolean isStopHeadsign) {
        this.route = route;
        this.headsign = headsign;
        this.isStopHeadsign = isStopHeadsign;
    }

    public void addTime(TripTimeShort tripTime) {
        times.add(tripTime);
    }

    public RouteShort getRoute() {
        return route;
    }

    public SortedSet<TripTimeShort> getTimes() {
        return times;
    }

    public String getHeadsign() {
        return headsign;
    }

    public boolean isStopHeadsign() {
        return isStopHeadsign;
    }
}

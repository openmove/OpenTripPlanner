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

import org.onebusaway.gtfs.model.Trip;
import org.opentripplanner.util.model.EncodedPolylineBean;

import java.util.List;

public class TripDetail {

    private Trip trip;

    private EncodedPolylineBean geometry;

    private List<TripTimeShort> stopTimes;

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    public EncodedPolylineBean getGeometry() {
        return geometry;
    }

    public void setGeometry(EncodedPolylineBean geometry) {
        this.geometry = geometry;
    }

    public List<TripTimeShort> getStopTimes() {
        return stopTimes;
    }

    public void setStopTimes(List<TripTimeShort> stopTimes) {
        this.stopTimes = stopTimes;
    }
}

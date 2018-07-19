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

import com.fasterxml.jackson.annotation.JsonInclude;
import org.onebusaway.gtfs.model.Stop;
import org.opentripplanner.util.model.EncodedPolylineBean;

public class StopDetail extends StopShort {

    public StopDetail(Stop stop) {
        super(stop);
    }

    /** @param distance in integral meters, to avoid serializing a bunch of decimal places. */
    public StopDetail(Stop stop, int distance) {
        super(stop);
        this.dist = distance;
    }

    /** Distance to the stop when it is returned from a location-based query. */
    @JsonInclude(JsonInclude.Include.NON_NULL) public Integer dist;

    /** Geometry of the walking path to the stop, if returned from a search-based query */
    @JsonInclude(JsonInclude.Include.NON_NULL) public EncodedPolylineBean geometry;

    /** Walking time, if returned from a search-based query */
    @JsonInclude(JsonInclude.Include.NON_NULL) public Long walkTime;

    /** OSM Way ID this stop is linked to, if returning debug information. */
    @JsonInclude(JsonInclude.Include.NON_NULL) public Long wayId;

    /** Distance to OSM way, if returning debug information. */
    @JsonInclude(JsonInclude.Include.NON_NULL) public Double distance;
}

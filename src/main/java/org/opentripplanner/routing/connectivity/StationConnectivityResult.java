/*
 *  This program is free software: you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public License
 *  as published by the Free Software Foundation, either version 3 of
 *  the License, or (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.opentripplanner.routing.connectivity;

import org.onebusaway.gtfs.model.Stop;
import org.opentripplanner.routing.alertpatch.Alert;
import org.opentripplanner.routing.graph.Vertex;
import org.opentripplanner.routing.vertextype.TransitStop;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StationConnectivityResult {
    private String stationName;
    private String stationId;
    private String initialStopId;
    private Set<StationNode> nodes;
    private List<Alert> alerts;

    public String getStationId() {
        return stationId;
    }

    public Set<StationNode> getNodes() {
        return nodes;
    }

    public List<Alert> getAlerts() {
        return alerts;
    }

    public String getStationName() {
        return stationName;
    }

    public StationConnectivityResult(TransitStop initialStop, Set<Vertex> vertices, Set<Vertex> accessibles,
                                     List<Alert> alerts) {
        this.stationName = initialStop.getName();
        this.stationId = initialStop.getStop().getParentStation();
        this.initialStopId = initialStop.getLabel();

        this.nodes = new HashSet<>();
        for (Vertex v: vertices) {
            nodes.add(new StationNode(v, accessibles.contains(v)));
        }
        this.alerts = alerts;
    }

}

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
package org.opentripplanner.routing.transfers;

import org.onebusaway.gtfs.model.Stop;
import org.onebusaway.gtfs.model.Trip;
import org.opentripplanner.routing.core.RoutingRequest;
import org.opentripplanner.routing.core.State;
import org.opentripplanner.routing.core.StopTransfer;
import org.opentripplanner.routing.core.TransferTable;
import org.opentripplanner.routing.edgetype.PathwayEdge;
import org.opentripplanner.routing.edgetype.StreetTransitLink;
import org.opentripplanner.routing.graph.Edge;
import org.opentripplanner.routing.graph.Graph;
import org.opentripplanner.routing.graph.Vertex;
import org.opentripplanner.routing.vertextype.TransitStop;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class MTATransferPermissionStrategy implements TransferPermissionStrategy {

    private TransferTable transferTable;

    private Graph graph;

    public MTATransferPermissionStrategy(Graph graph) {
        this.graph = graph;
        transferTable = graph.getTransferTable();
    }

    @Override
    public boolean isTransferAllowed(State state, Stop fromStop, Stop toStop, Trip fromTrip, Trip toTrip, boolean boarding, int transferTime) {
        RoutingRequest options = state.getOptions();
        String fromFeed = fromStop.getId().getAgencyId();
        String toFeed = toStop.getId().getAgencyId();
        if (transferTime == StopTransfer.UNKNOWN_TRANSFER && !options.allowUnknownTransfers && transferTable.hasFeedTransfers(fromFeed, toFeed, boarding)) {
            return false;
        }

        // Don't apply transfer rules unless both stops are MTASBWY stops.
        if (fromStop.getId().getAgencyId().equals("MTASBWY") && toStop.getId().getAgencyId().equals("MTASBWY")) {
            if (options.wheelchairAccessible && !fromStop.equals(toStop)) {
                if (!stopIsAccessibleFromStreet(state, fromStop) || !stopIsAccessibleFromStreet(state, toStop)) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean stopIsAccessibleFromStreet(State state, Stop stop) {
        TransitStop tstop = graph.index.stopVertexForStop.get(stop);
        // only by traversing pathways, can we get to the street?
        Set<Vertex> seen = new HashSet<>();
        LinkedList<Vertex> queue = new LinkedList<>();
        queue.push(tstop);
        seen.add(tstop);
        while (!queue.isEmpty()) {
            Vertex v = queue.pop();
            if (v instanceof TransitStop
                && ((TransitStop) v).isEntrance() && ((TransitStop) v).hasWheelchairEntrance()) {
                // success
                return true;
            }
            for (Edge e : v.getOutgoing()) {
                if (e instanceof PathwayEdge && canUsePathway(state, (PathwayEdge) e)) {
                    Vertex w = e.getToVertex();
                    if (!seen.contains(w)) {
                        seen.add(w);
                        queue.add(w);
                    }
                }
            }
        }
        return false;
    }

    private boolean canUsePathway(State state, PathwayEdge pathway) {
        if (!pathway.isWheelchairAccessible())
            return false;
        if (!pathway.isElevator())
            return true;
        return !pathway.elevatorIsOutOfService(state);
    }
}

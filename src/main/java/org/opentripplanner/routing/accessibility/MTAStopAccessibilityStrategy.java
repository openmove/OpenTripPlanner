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
package org.opentripplanner.routing.accessibility;

import org.opentripplanner.routing.core.State;
import org.opentripplanner.routing.edgetype.PathwayEdge;
import org.opentripplanner.routing.graph.Edge;
import org.opentripplanner.routing.graph.Graph;
import org.opentripplanner.routing.graph.Vertex;
import org.opentripplanner.routing.vertextype.TransitStop;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class MTAStopAccessibilityStrategy extends DefaultStopAccessibilityStrategy {

    private Graph graph;

    public MTAStopAccessibilityStrategy(Graph graph) {
        this.graph = graph;
    }

    @Override
    public boolean stopIsAccessible(State state, TransitStop stop) {
        if (stop.getStopId().getAgencyId().equals("MTASBWY"))
            return stopIsAccessibleFromStreet(state, stop);
        return super.stopIsAccessible(state, stop);
    }

    private boolean stopIsAccessibleFromStreet(State state, TransitStop tstop) {
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
        return !pathway.elevatorIsOutOfService(graph, state) || state.getOptions().ignoreRealtimeUpdates;
    }
}

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

import org.opentripplanner.routing.alertpatch.Alert;
import org.opentripplanner.routing.core.State;
import org.opentripplanner.routing.edgetype.PathwayEdge;
import org.opentripplanner.routing.graph.Edge;
import org.opentripplanner.routing.graph.Graph;
import org.opentripplanner.routing.graph.Vertex;
import org.opentripplanner.routing.vertextype.TransitStop;

import java.util.*;

public abstract class ConnectivityTemplate <T>{

    protected Graph graph;

    public ConnectivityTemplate(Graph graph) {
        this.graph = graph;
    }

    public T computeConnectivityResult(State state, TransitStop tstop) {
        Set<Vertex> seen = new HashSet<>();
        LinkedList<Vertex> queue = new LinkedList<>();
        Set<Vertex> vAccessibles = new HashSet<>();
        Set<Edge> eAccessibles = new HashSet<>();

        queue.push(tstop);
        seen.add(tstop);
        List<Alert> alerts = new ArrayList<>();
        String parentStation = tstop.getStop().getParentStation();

        while (!queue.isEmpty()) {
            Vertex v = queue.pop();
            if (testForEarlyReturn(v)) {
//            if (v instanceof TransitStop
//                    && ((TransitStop) v).isEntrance() && ((TransitStop) v).hasWheelchairEntrance()) {
                // success
                // return AccessibilityResult.ALWAYS_ACCESSIBLE;
                return buildResult(tstop, seen, vAccessibles, alerts);
            }
            if (v instanceof TransitStop &&
                    ((TransitStop) v).isEntrance() &&
                    ((TransitStop) v).hasWheelchairEntrance()) {
                vAccessibles.add(v);
            }
            for (Edge e : v.getOutgoing()) {
                if (e instanceof PathwayEdge && canUsePathway(state, (PathwayEdge) e, alerts)) {
                    if (e.isWheelchairAccessible()) eAccessibles.add(e);
                    Vertex w = e.getToVertex();
                    if (!seen.contains(w)) {
                        seen.add(w);
                        queue.add(w);
                    }
                }
            }
        }
        queue.addAll(vAccessibles);
        while (!queue.isEmpty()) {
            Vertex v = queue.pop();
            for (Edge e : v.getOutgoing()) {
                if (eAccessibles.contains(e)) {
                    Vertex to = e.getToVertex();
                    if (!vAccessibles.contains(to)) {
                        vAccessibles.add(to);
                        queue.add(to);
                    }
                }
            }
        }
        // return AccessibilityResult.notAccessibleForReason(alerts);
        return buildResult(tstop, seen, vAccessibles, alerts);
    }

    abstract protected T buildResult(TransitStop tstop, Set<Vertex> vertices, Set<Vertex> accessibles, List<Alert> alerts);
    abstract protected boolean testForEarlyReturn(Vertex v);
    abstract protected boolean canUsePathway(State state, PathwayEdge pathway, List<Alert> alerts);

//    private boolean canUsePathway(State state, PathwayEdge pathway, List<Alert> alerts) {
//        if (!pathway.isWheelchairAccessible())
//            return false;
//        if (!pathway.isElevator())
//            return true;
//        if (state.getOptions().ignoreRealtimeUpdates)
//            return true;
//        List<Alert> newAlerts = pathway.getElevatorIsOutOfServiceAlerts(graph, state);
//        alerts.addAll(newAlerts);
//        return newAlerts.isEmpty();
//    }
}

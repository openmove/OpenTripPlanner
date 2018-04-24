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

package org.opentripplanner.routing.edgetype;

import org.opentripplanner.routing.core.State;
import org.opentripplanner.routing.graph.Vertex;

public class LandmarkEdge extends FreeEdge {

    public LandmarkEdge(Vertex from, Vertex to) {
        super(from, to);
    }

    @Override
    public State traverse(State s0) {
        // Disallow two in a row
        if (s0.backEdge != null && (s0.backEdge instanceof LandmarkEdge
                || s0.backEdge instanceof PathwayEdge
                || s0.backEdge instanceof TransferEdge)) {
            return null;
        }
        return super.traverse(s0);
    }
}

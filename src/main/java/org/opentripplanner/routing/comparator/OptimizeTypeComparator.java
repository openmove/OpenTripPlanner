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
package org.opentripplanner.routing.comparator;

import org.opentripplanner.routing.core.OptimizeType;
import org.opentripplanner.routing.spt.GraphPath;

import java.util.Comparator;

public class OptimizeTypeComparator implements Comparator<GraphPath> {

    private Comparator<GraphPath> defaultCmp, transfersCmp, walkCmp;

    public OptimizeTypeComparator(boolean compareStartTimes) {
        defaultCmp = new PathComparator(compareStartTimes);
        transfersCmp = new TransfersComparator();
        walkCmp = new WalkingComparator();
    }

    @Override
    public int compare(GraphPath o1, GraphPath o2) {
        OptimizeType optimizeType = o1.states.getFirst().getOptions().requestedOptimize;
        int cmp = 0;
        if (optimizeType.equals(OptimizeType.TRANSFERS)) {
            cmp = transfersCmp.compare(o1, o2);
        } else if (optimizeType.equals(OptimizeType.WALKING)) {
            cmp = walkCmp.compare(o1, o2);
        }
        if (cmp == 0) {
            cmp = defaultCmp.compare(o1, o2);
        }
        return cmp;
    }
}

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

import org.junit.Test;
import org.onebusaway.gtfs.model.AgencyAndId;
import org.opentripplanner.routing.spt.GraphPath;

import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TransfersComparatorTest {

    @Test
    public void testLessThan() {
        GraphPath path1 = path(1);
        GraphPath path2 = path(2);
        TransfersComparator cmp = new TransfersComparator();
        assertTrue(cmp.compare(path1, path2) < 0);
    }

    @Test
    public void testGreaterThan() {
        GraphPath path1 = path(1);
        GraphPath path2 = path(2);
        TransfersComparator cmp = new TransfersComparator();
        assertTrue(cmp.compare(path2, path1) > 0);
    }

    @Test
    public void testEquals() {
        GraphPath path1 = path(1);
        GraphPath path2 = path(1);
        TransfersComparator cmp = new TransfersComparator();
        assertTrue(cmp.compare(path1, path2) == 0);
    }

    private GraphPath path(int numTrips) {
        GraphPath path = mock(GraphPath.class);
        List<AgencyAndId> trips = mock(List.class);
        when(trips.size()).thenReturn(numTrips);
        when(path.getTrips()).thenReturn(trips);
        return path;
    }
}

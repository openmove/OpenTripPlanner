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
import org.opentripplanner.routing.spt.GraphPath;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

public class WalkingComparatorTest {

    @Test
    public void testLessThan() {
        GraphPath path100 = path(100);
        GraphPath path200 = path(200);
        WalkingComparator cmp = new WalkingComparator();
        assertTrue(cmp.compare(path100, path200) < 0);
    }

    @Test
    public void testGreaterThan() {
        GraphPath path100 = path(100);
        GraphPath path200 = path(200);
        WalkingComparator cmp = new WalkingComparator();
        assertTrue(cmp.compare(path200, path100) > 0);
    }

    @Test
    public void testEquals() {
        GraphPath path100 = path(100);
        GraphPath path200 = path(100);
        WalkingComparator cmp = new WalkingComparator();
        assertTrue(cmp.compare(path100, path200) == 0);
    }

    private GraphPath path(double dist) {
        GraphPath path = mock(GraphPath.class);
        when(path.getWalkTime()).thenReturn(dist);
        return path;
    }
}

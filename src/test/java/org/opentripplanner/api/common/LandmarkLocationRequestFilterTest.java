package org.opentripplanner.api.common;

import com.vividsolutions.jts.geom.Coordinate;
import junit.framework.TestCase;
import static org.junit.Assert.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LandmarkLocationRequestFilterTest extends TestCase {
    private static final Logger LOG = LoggerFactory.getLogger(LandmarkLocationRequestFilterTest.class);

    public void testContains() {
        //Coordinate coordIn = new Coordinate(1, 1);
        //Coordinate coordOut = new Coordinate(5, 5);

        //Coordinate[] coords  =
        //        new Coordinate[] {new Coordinate(0, 0), new Coordinate(0, 4),
        //                new Coordinate(4, 4), new Coordinate(4, 0), new Coordinate(0, 0) };

        LandmarkLocationRequestFilter testLandmarkLocationRequestFilter = new LandmarkLocationRequestFilter();
        //assertTrue(testLandmarkLocationRequestFilter.contains(coordIn, coords));
        //assertFalse(testLandmarkLocationRequestFilter.contains(coordOut, coords));
        LOG.info("testing LandmarkLocationRequestFilter");
    }

}
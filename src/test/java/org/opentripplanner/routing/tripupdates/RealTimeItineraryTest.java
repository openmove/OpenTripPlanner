package org.opentripplanner.routing.tripupdates;

import org.opentripplanner.GtfsTest;
import org.opentripplanner.api.model.Leg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RealTimeItineraryTest extends GtfsTest {
    private static final Logger LOG = LoggerFactory.getLogger(RealTimeItineraryTest.class);
    @Override
    public String getFeedName() {
        return "kcm_gtfs.zip";
    }

    public void testRealTimeLeg() {
        Leg leg = plan(
            // 2016/04/27 03:58 PM ET
            1461787020,
//            "1:100001:1:02_00_D",
            // 10th Ave W & W Fulton St, Seattle, WA, USA
            "47.645351,-122.370277",
            // 10th Ave W & W Howe St, Seattle, WA, USA
            "47.635783590864854,-122.37027161892249",
            "30935549",
            true,
            false,
            null,
            "",
            ""
        );
        assertTrue(leg.realTime);
        assertFalse(leg.arrivalDelay == 0);
//        validateLeg(
//            leg,
//            1461787134000L,
//            1461788270000L,
//            "2070",
//            "2010",
//            null
//        );
    }
}

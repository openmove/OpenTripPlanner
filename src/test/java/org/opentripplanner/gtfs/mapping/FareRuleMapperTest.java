package org.opentripplanner.gtfs.mapping;

import org.junit.Test;
import org.onebusaway.gtfs.model.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class FareRuleMapperTest {
    private static final org.onebusaway.gtfs.model.FareRule FARE_RULE = new org.onebusaway.gtfs.model.FareRule();

    private static final AgencyAndId AGENCY_AND_ID = new AgencyAndId("A", "1");

    private static final Integer ID = 45;

    private static final String CONTAINS_ID = "Contains Id";

    private static final String DESTINATION_ID = "Destination Id";

    private static final FareAttribute FARE_ATTRIBUTE = new FareAttribute();

    private static final String ORIGIN_ID = "Origin Id";

    private static final Route ROUTE = new Route();

    private static final String ROUTING_ID = "Routing Id";

    static {
        FARE_ATTRIBUTE.setId(AGENCY_AND_ID);
        ROUTE.setId(AGENCY_AND_ID);

        FARE_RULE.setId(ID);
        FARE_RULE.setContainsId(CONTAINS_ID);
        FARE_RULE.setDestinationId(DESTINATION_ID);
        FARE_RULE.setFare(FARE_ATTRIBUTE);
        FARE_RULE.setOriginId(ORIGIN_ID);
        FARE_RULE.setRoute(ROUTE);
        FARE_RULE.setRoutingId(ROUTING_ID);
    }

    private FareRuleMapper subject = new FareRuleMapper(new RouteMapper(new AgencyMapper()),
            new FareAttributeMapper());

    @Test
    public void testMapCollection() throws Exception {
        assertNull(subject.map((Collection<FareRule>) null, null));
        assertTrue(subject.map(Collections.emptyList(), null).isEmpty());
        List<org.opentripplanner.model.FareRule> mTest = (List<org.opentripplanner.model.FareRule>) subject.map(Collections.singleton(FARE_RULE), null);
        assertEquals(1, mTest.size());
    }

    @Test
    public void testMap() throws Exception {
        org.opentripplanner.model.FareRule result = subject.map(FARE_RULE);

        assertEquals(CONTAINS_ID, result.getContainsId());
        assertEquals(DESTINATION_ID, result.getDestinationId());
        assertEquals(ORIGIN_ID, result.getOriginId());
        assertEquals(ROUTING_ID, result.getRoutingId());
        assertNotNull(result.getFare());
        assertNotNull(result.getRoute());
    }

    @Test
    public void testMapWithNulls() throws Exception {
        org.opentripplanner.model.FareRule result = subject.map(new FareRule());

        assertNull(result.getContainsId());
        assertNull(result.getDestinationId());
        assertNull(result.getOriginId());
        assertNull(result.getFare());
        assertNull(result.getRoute());
        assertNull(result.getRoutingId());
    }

    /** Mapping the same object twice, should return the the same instance. */
    @Test
    public void testMapCache() throws Exception {
        org.opentripplanner.model.FareRule result1 = subject.map(FARE_RULE);
        org.opentripplanner.model.FareRule result2 = subject.map(FARE_RULE);

        assertTrue(result1 == result2);
    }
}
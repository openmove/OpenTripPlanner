package org.opentripplanner.routing.alertpatch;

import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

import junit.framework.TestCase;

import org.opentripplanner.model.FeedScopedId;
import org.opentripplanner.model.calendar.CalendarServiceData;
import org.opentripplanner.ConstantsForTests;
import org.opentripplanner.gtfs.GtfsContext;
import org.opentripplanner.gtfs.GtfsLibrary;
import org.opentripplanner.routing.algorithm.AStar;
import org.opentripplanner.routing.core.RoutingRequest;
import org.opentripplanner.routing.core.State;
import org.opentripplanner.routing.edgetype.factory.PatternHopFactory;
import org.opentripplanner.routing.graph.Edge;
import org.opentripplanner.routing.graph.Graph;
import org.opentripplanner.routing.graph.Vertex;
import org.opentripplanner.routing.spt.GraphPath;
import org.opentripplanner.routing.spt.ShortestPathTree;
import org.opentripplanner.util.TestUtils;

import static org.opentripplanner.calendar.impl.CalendarServiceDataFactoryImpl.createCalendarServiceData;

public class AlertPatchTest extends TestCase {
    private Graph graph;

    private RoutingRequest options;

    private AStar aStar;

    private String feedId;

    public void setUp() throws Exception {
        aStar = new AStar();
        GtfsContext context = GtfsLibrary.readGtfs(new File(ConstantsForTests.FAKE_GTFS));
        options = new RoutingRequest();
        graph = new Graph();
        PatternHopFactory factory = new PatternHopFactory(context);
        factory.run(graph);
        graph.putService(
                CalendarServiceData.class,
                createCalendarServiceData(context.getOtpTransitService())
        );
        graph.index(false);

        feedId = context.getFeedId().getId();
    }

    public void testStopAlertPatch() {
        AlertPatch snp1 = new AlertPatch();
        snp1.setFeedId(feedId);
        snp1.setTimePeriods(Collections.singletonList(new TimePeriod(
                0, 1000L * 60 * 60 * 24 * 365 * 40))); // until ~1/1/2011
        Alert note1 = Alert.createSimpleAlerts("The first note");
        snp1.setAlert(note1);
        snp1.setId("id1");
        snp1.setStop(new FeedScopedId(feedId, "A"));
        snp1.apply(graph);

        Vertex stop_a = graph.getVertex(feedId + ":A");
        Vertex stop_e = graph.getVertex(feedId + ":E_arrive");

        ShortestPathTree spt;
        GraphPath optimizedPath, unoptimizedPath;

        options.dateTime = TestUtils.dateInSeconds("America/New_York", 2009, 8, 7, 0, 0, 0);
        options.setRoutingContext(graph, stop_a, stop_e);
        spt = aStar.getShortestPathTree(options);

        optimizedPath = spt.getPath(stop_e, true);
        unoptimizedPath = spt.getPath(stop_e, false);
        assertNotNull(optimizedPath);
        HashSet<Alert> expectedAlerts = new HashSet<Alert>();
        expectedAlerts.add(note1);

        Edge optimizedEdge = optimizedPath.states.get(1).getBackEdge();
        HashSet<Alert> optimizedAlerts = new HashSet<Alert>();
        for (AlertPatch alertPatch : graph.getAlertPatches(optimizedEdge)) {
            optimizedAlerts.add(alertPatch.getAlert());
        }
        assertEquals(expectedAlerts, optimizedAlerts);

        Edge unoptimizedEdge = unoptimizedPath.states.get(1).getBackEdge();
        HashSet<Alert> unoptimizedAlerts = new HashSet<Alert>();
        for (AlertPatch alertPatch : graph.getAlertPatches(unoptimizedEdge)) {
            unoptimizedAlerts.add(alertPatch.getAlert());
        }
        assertEquals(expectedAlerts, unoptimizedAlerts);
    }

    public void testTimeRanges() {
        AlertPatch snp1 = new AlertPatch();
        snp1.setFeedId(feedId);
        LinkedList<TimePeriod> timePeriods = new LinkedList<TimePeriod>();
        long breakTime = TestUtils.dateInSeconds("America/New_York", 2009, 8, 7, 0, 0, 0);
        timePeriods.add(new TimePeriod(0, breakTime)); // until the beginning of the day
        long secondPeriodStartTime = TestUtils.dateInSeconds("America/New_York", 2009, 8, 7, 7, 0, 0);
        long secondPeriodEndTime = TestUtils.dateInSeconds("America/New_York", 2009, 8, 8, 0, 0, 0);
        timePeriods.add(new TimePeriod(secondPeriodStartTime, secondPeriodEndTime));
        snp1.setTimePeriods(timePeriods);
        Alert note1 = Alert.createSimpleAlerts("The first note");
        snp1.setAlert(note1);
        snp1.setId("id1");
        snp1.setStop(new FeedScopedId(feedId, "A"));
        snp1.apply(graph);

        Vertex stop_a = graph.getVertex(feedId + ":A");
        Vertex stop_e = graph.getVertex(feedId + ":E_arrive");

        ShortestPathTree spt;
        GraphPath path;

        options.dateTime = TestUtils.dateInSeconds("America/New_York", 2009, 8, 7, 0, 0, 0);
        options.setRoutingContext(graph, stop_a, stop_e);
        spt = aStar.getShortestPathTree(options);

        path = spt.getPath(stop_e, true);
        assertNotNull(path);
        // expect no notes because we are during the break
        State noAlertPatchesState = path.states.get(1);
        Edge noAlertPatchesEdge = noAlertPatchesState.getBackEdge();
        HashSet<Alert> noAlertPatchesAlerts = new HashSet<Alert>();
        for (AlertPatch alertPatch : graph.getAlertPatches(noAlertPatchesEdge)) {
            if (alertPatch.displayDuring(noAlertPatchesState)) {
                noAlertPatchesAlerts.add(alertPatch.getAlert());
            }
        }
        assertEquals(new HashSet<Alert>(), noAlertPatchesAlerts);

        // now a trip during the second period
        options.dateTime = TestUtils.dateInSeconds("America/New_York", 2009, 8, 7, 8, 0, 0);
        options.setRoutingContext(graph, stop_a, stop_e);
        spt = aStar.getShortestPathTree(options);

        path = spt.getPath(stop_e, false); // do not optimize because we want the first trip
        assertNotNull(path);
        HashSet<Alert> expectedNotes = new HashSet<Alert>();
        expectedNotes.add(note1);
        State oneAlertPatchState = path.states.get(1);
        Edge oneAlertPatchEdge = oneAlertPatchState.getBackEdge();
        HashSet<Alert> oneAlertPatchAlerts = new HashSet<Alert>();
        for (AlertPatch alertPatch : graph.getAlertPatches(oneAlertPatchEdge)) {
            if (alertPatch.displayDuring(oneAlertPatchState)) {
                oneAlertPatchAlerts.add(alertPatch.getAlert());
            }
        }
        assertEquals(expectedNotes, oneAlertPatchAlerts);
    }

    public void testRouteNotePatch() {
        AlertPatch rnp1 = new AlertPatch();
        rnp1.setFeedId(feedId);

        rnp1.setTimePeriods(Collections.singletonList(new TimePeriod(
                0, 1000L * 60 * 60 * 24 * 365 * 40))); // until ~1/1/2011
        Alert note1 = Alert.createSimpleAlerts("The route note");
        rnp1.setAlert(note1);
        rnp1.setId("id1");
        // Routes isn't patched in tests through GtfsBundle, which is why we have have a reference to agency id here.
        rnp1.setRoute(new FeedScopedId("agency", "1"));
        rnp1.apply(graph);

        Vertex stop_a = graph.getVertex(feedId + ":A");
        Vertex stop_e = graph.getVertex(feedId + ":E_arrive");

        ShortestPathTree spt;
        GraphPath path;

        options.setRoutingContext(graph, stop_a, stop_e);
        spt = aStar.getShortestPathTree(options);

        path = spt.getPath(stop_e, false);
        assertNotNull(path);
        HashSet<Alert> expectedAlerts = new HashSet<Alert>();
        expectedAlerts.add(note1);
        Edge actualEdge = path.states.get(2).getBackEdge();
        HashSet<Alert> actualAlerts = new HashSet<Alert>();
        for (AlertPatch alertPatch : graph.getAlertPatches(actualEdge)) {
            actualAlerts.add(alertPatch.getAlert());
        }
        assertEquals(expectedAlerts, actualAlerts);
    }

    /**
     * Tests whether an alert that applies to a specific direction of a route shows up properly and that an alert that
     * applies to the reverse direction will not show up.
     * test originally written by sdjacobs. See https://github.com/opentripplanner/OpenTripPlanner/pull/2607
     */
    public void testRouteDirectionAlert() {
        AlertPatch rnp1 = new AlertPatch();
        rnp1.setFeedId(feedId);
        rnp1.setTimePeriods(Collections.singletonList(new TimePeriod(
            0, 1000L * 60 * 60 * 24 * 365 * 40))); // until ~1/1/2011
        Alert note1 = Alert.createSimpleAlerts("The route alert for route 18 directionId=1");
        rnp1.setAlert(note1);
        rnp1.setId("id1");
        // on route 18, direction 1 (N) is E -> D, 0 (S) is D -> E
        rnp1.setRoute(new FeedScopedId("agency", "18"));
        rnp1.setDirectionId(1);
        rnp1.apply(graph);

        AlertPatch rnp2 = new AlertPatch();
        rnp2.setFeedId(feedId);
        rnp2.setTimePeriods(Collections.singletonList(new TimePeriod(
            0, 1000L * 60 * 60 * 24 * 365 * 40))); // until ~1/1/2011
        Alert note2 = Alert.createSimpleAlerts("The route alert for route 18 directionId=0");
        rnp2.setAlert(note2);
        rnp2.setId("id2");
        // on route 18, direction 1 (N) is E -> D, 0 (S) is D -> E
        rnp2.setRoute(new FeedScopedId("agency", "18"));
        rnp2.setDirectionId(0);
        rnp2.apply(graph);

        Vertex stop_d = graph.getVertex(feedId + ":D");
        Vertex stop_e = graph.getVertex(feedId + ":E_arrive");

        ShortestPathTree spt;
        GraphPath path;

        options.dateTime = TestUtils.dateInSeconds("America/New_York", 2009, 8, 7, 8, 0, 0);
        options.setRoutingContext(graph, stop_d, stop_e);
        spt = aStar.getShortestPathTree(options);

        path = spt.getPath(stop_e, false);
        assertNotNull(path);
        HashSet<Alert> expectedAlerts = new HashSet<Alert>();
        expectedAlerts.add(note2);
        Edge actualEdge = path.states.get(2).getBackEdge();
        HashSet<Alert> actualAlerts = new HashSet<Alert>();
        for (AlertPatch alertPatch : graph.getAlertPatches(actualEdge)) {
            actualAlerts.add(alertPatch.getAlert());
        }
        assertEquals(expectedAlerts, actualAlerts);
    }

    /**
     * Tests whether an alert that applies to a specific route type shows up properly and that an alert that applies to
     * a different route type will not show up.
     */
    public void testRouteTypeAlert() {
        AlertPatch rnp1 = new AlertPatch();
        rnp1.setFeedId("agency");
        rnp1.setTimePeriods(Collections.singletonList(new TimePeriod(
            0, 1000L * 60 * 60 * 24 * 365 * 40))); // until ~1/1/2011
        Alert note1 = Alert.createSimpleAlerts("The route alert for route_type=1");
        rnp1.setAlert(note1);
        rnp1.setId("id1");
        rnp1.setRouteType(1);
        rnp1.apply(graph);

        AlertPatch rnp2 = new AlertPatch();
        rnp2.setFeedId("agency");
        rnp2.setTimePeriods(Collections.singletonList(new TimePeriod(
            0, 1000L * 60 * 60 * 24 * 365 * 40))); // until ~1/1/2011
        Alert note2 = Alert.createSimpleAlerts("The route alert for route_type=2");
        rnp2.setAlert(note2);
        rnp2.setId("id2");
        rnp2.setRouteType(2);
        rnp2.apply(graph);

        Vertex stop_d = graph.getVertex(feedId + ":D");
        Vertex stop_e = graph.getVertex(feedId + ":E_arrive");

        ShortestPathTree spt;
        GraphPath path;

        options.dateTime = TestUtils.dateInSeconds("America/New_York", 2009, 8, 7, 8, 0, 0);
        options.setRoutingContext(graph, stop_d, stop_e);
        spt = aStar.getShortestPathTree(options);

        path = spt.getPath(stop_e, false);
        assertNotNull(path);
        HashSet<Alert> expectedAlerts = new HashSet<Alert>();
        expectedAlerts.add(note2);
        Edge actualEdge = path.states.get(2).getBackEdge();
        HashSet<Alert> actualAlerts = new HashSet<Alert>();
        for (AlertPatch alertPatch : graph.getAlertPatches(actualEdge)) {
            actualAlerts.add(alertPatch.getAlert());
        }
        assertEquals(expectedAlerts, actualAlerts);
    }
}

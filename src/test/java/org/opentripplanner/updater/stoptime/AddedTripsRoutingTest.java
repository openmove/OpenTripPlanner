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
package org.opentripplanner.updater.stoptime;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.google.protobuf.ExtensionRegistry;
import com.google.transit.realtime.GtfsRealtime;
import com.google.transit.realtime.GtfsRealtimeNYCT;
import org.junit.BeforeClass;
import org.junit.Test;
import org.onebusaway.gtfs.model.AgencyAndId;
import org.opentripplanner.ConstantsForTests;
import org.opentripplanner.routing.algorithm.AStar;
import org.opentripplanner.routing.core.RoutingRequest;
import org.opentripplanner.routing.graph.Graph;
import org.opentripplanner.routing.impl.DefaultStreetVertexIndexFactory;
import org.opentripplanner.routing.spt.GraphPath;
import org.opentripplanner.routing.spt.ShortestPathTree;
import org.opentripplanner.routing.trippattern.RealTimeState;
import org.opentripplanner.routing.trippattern.TripTimes;
import org.opentripplanner.util.TestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class AddedTripsRoutingTest {
    private static final String NYCT_SUBWAYS_GTFS = "src/test/resources/mta/nyct_subways_gtfs.zip";

    private static final String NYCT_TU = "mta/tu-example-Mar-14-17:57:11-EDT-2018.pb";

    private static final String FEED_ID = "MTASBWY";

    private static ExtensionRegistry _extensionRegistry;

    private static Graph graph;

    private static TimetableSnapshotSource updater;

    private static final Logger LOG = LoggerFactory.getLogger(AddedTripsRoutingTest.class);

    @BeforeClass
    public static void setUpClass() throws Exception {
        _extensionRegistry = ExtensionRegistry.newInstance();
        _extensionRegistry.add(GtfsRealtimeNYCT.nyctFeedHeader);
        _extensionRegistry.add(GtfsRealtimeNYCT.nyctTripDescriptor);
        _extensionRegistry.add(GtfsRealtimeNYCT.nyctStopTimeUpdate);


        graph = ConstantsForTests.buildGraph(NYCT_SUBWAYS_GTFS);
        graph.index(new DefaultStreetVertexIndexFactory());
        updater = new TimetableSnapshotSource(graph);
        graph.timetableSnapshotSource = updater;

        InputStream pb = AddedTripsRoutingTest.class.getResourceAsStream("/" + NYCT_TU);
        GtfsRealtime.FeedMessage message = GtfsRealtime.FeedMessage.parseFrom(pb, _extensionRegistry);
        List<GtfsRealtime.TripUpdate> updates = message.getEntityList().stream()
                .filter(GtfsRealtime.FeedEntity::hasTripUpdate)
                .map(GtfsRealtime.FeedEntity::getTripUpdate)
                .collect(Collectors.toList());
        updater.applyTripUpdates(graph,  true, updates, FEED_ID);
    }

    // J23S -> G05S 104450_Z..S
    @Test
    public void testFindsCancelledAndAddedZ() {
        AStar aStar = new AStar();
        RoutingRequest options = new RoutingRequest();
        options.setRoutingContext(graph, FEED_ID+":J27S", FEED_ID+":G05S");
        options.setDateTime("2018-03-14", "5:58pm", graph.getTimeZone());
        ShortestPathTree spt = aStar.getShortestPathTree(options);
        GraphPath path = spt.getPath(graph.getVertex(FEED_ID+":G05N"), true);

        String hash = path.getRoutePatternHash();
        LOG.info("found path: {} from {} to {}", hash, new Date(path.getStartTime() * 1000), new Date(path.getEndTime() * 1000));

        // Make sure we found a Z trip that arrives within 60min
        List<AgencyAndId> trips = path.getTrips();
        assertEquals(1, trips.size());
        assertEquals("104450_Z..S", trips.get(0).getId());

        // month is 0-indexed
        long endLimit = TestUtils.dateInSeconds("America/New_York", 2018, 2, 14, 19, 0, 0);
        assertTrue(path.getEndTime() < endLimit);

        TripTimes tt = path.states.getLast().getTripTimes();
        assertEquals(tt.getRealTimeState(), RealTimeState.ADDED);
    }

}

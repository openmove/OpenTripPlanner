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
package org.opentripplanner.api.connectivity;

import org.onebusaway.gtfs.model.Stop;
import org.opentripplanner.routing.alertpatch.Alert;
import org.opentripplanner.routing.connectivity.ConnectivityTemplate;
import org.opentripplanner.routing.connectivity.StationConnectivityResult;
import org.opentripplanner.routing.connectivity.StationConnectivityStrategy;
import org.opentripplanner.routing.connectivity.StationNode;
import org.opentripplanner.routing.core.RoutingRequest;
import org.opentripplanner.routing.core.State;
import org.opentripplanner.routing.core.TraverseMode;
import org.opentripplanner.routing.core.TraverseModeSet;
import org.opentripplanner.routing.graph.GraphIndex;
import org.opentripplanner.routing.graph.Vertex;
import org.opentripplanner.routing.vertextype.TransitStop;
import org.opentripplanner.standalone.OTPServer;
import org.opentripplanner.standalone.Router;
import org.opentripplanner.util.DateUtils;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.*;

/**
 * Return the station connectivity, i.e. internal nodes and links, for the station associatied with the given stop.
 */
@Path("/routers/{routerId}/stationConnectivity")
@XmlRootElement
public class StationConnectivityResource {

    /**
     *
     */
    @QueryParam("stopId")
    private String stopIdString;

    @QueryParam("date")
    private String date;

    @QueryParam("time")
    private String time;

    private GraphIndex index;

    private Router router;

    public StationConnectivityResource(@Context OTPServer otpServer, @PathParam("routerId") String routerId) {
        Router router = otpServer.getRouter(routerId);
        this.router = router;
        index = router.graph.index;
    }

    /**
     *
     */
    @GET
    @Produces({ MediaType.APPLICATION_JSON })
    public StationConnectivityResult getConnectivity() {
        TransitStop tstop = (TransitStop)index.vertexForId.get(stopIdString);
        long timeSeconds = DateUtils.toDate(date, time, TimeZone.getDefault()).getTime()/1000;
        State state = new State(tstop, timeSeconds, new RoutingRequest(new TraverseModeSet(TraverseMode.WALK)));

        StationConnectivityStrategy strategy = new StationConnectivityStrategy(router.graph);
        StationConnectivityResult result = strategy.computeConnectivityResult(state, tstop);
        // Would we ever want to ignore elevator alerts?

//        Stop stop = tstop.getStop();
//        Set<Vertex> nodes = new HashSet<>();
//        nodes.add(tstop);
//        List<Alert> alerts = new ArrayList<>();
//
//        StationConnectivityResult result = new StationConnectivityResult(stop.getParentStation(), nodes, alerts);

        return result;
    }
}

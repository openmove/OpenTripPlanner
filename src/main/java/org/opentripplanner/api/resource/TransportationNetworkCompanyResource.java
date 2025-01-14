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

package org.opentripplanner.api.resource;

import org.opentripplanner.api.model.Place;
import org.opentripplanner.api.model.TransportationNetworkCompanyResponse;
import org.opentripplanner.routing.transportation_network_company.ArrivalTime;
import org.opentripplanner.routing.transportation_network_company.RideEstimate;
import org.opentripplanner.routing.transportation_network_company.TransportationNetworkCompanyService;
import org.opentripplanner.standalone.OTPServer;
import org.opentripplanner.standalone.Router;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import java.util.List;

import static org.opentripplanner.api.param.QueryParameter.checkRangeInclusive;
import static org.opentripplanner.api.resource.ServerInfo.Q;

@Path("/routers/{routerId}/transportation_network_company")
public class TransportationNetworkCompanyResource {
    private static final Logger LOG = LoggerFactory.getLogger(TransportationNetworkCompanyResource.class);

    @Context
    OTPServer otpServer;

    @GET
    @Path("/eta_estimate")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML + Q, MediaType.TEXT_XML + Q})
    public TransportationNetworkCompanyResponse getEtaEstimates(
        @QueryParam("from") String from,
        @QueryParam("companies") String companies,
        @PathParam("routerId") String routerId
    ) {
        LOG.info("Received eta_estimate request");

        TransportationNetworkCompanyResponse response = new TransportationNetworkCompanyResponse();

        try {
            requireParameter(companies, "companies");
            Place fromPlace = getPlace(from, "from");
            TransportationNetworkCompanyService service = getService(routerId);
            List<ArrivalTime> arrivalTimes = service.getArrivalTimes(companies, fromPlace);
            if (arrivalTimes.size() == 0)
                throw new Exception("Could not find any arrival estimates for the specified companies and ridetypes");
            response.setEtaEstimates(arrivalTimes);
        } catch (Exception e) {
            response.setError(e);
        }

        return response;
    }

    @GET
    @Path("/ride_estimate")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML + Q, MediaType.TEXT_XML + Q})
    public TransportationNetworkCompanyResponse getRideEstimate(
        @QueryParam("from") String from,
        @QueryParam("to") String to,
        @QueryParam("company") String company,
        @QueryParam("rideType") String rideType,
        @QueryParam("distance") String distance,
        @PathParam("routerId") String routerId
    ) {
        LOG.info("Received ride_estimate request");

        TransportationNetworkCompanyResponse response = new TransportationNetworkCompanyResponse();

        try {
            requireParameter(company, "company");
            requireParameter(rideType, "rideType");
            Place fromPlace = getPlace(from, "from");
            Place toPlace = getPlace(to, "to");
            
            double distanceValue = 0;
            try {
            	distanceValue = Double.valueOf(distance).doubleValue();
            }catch(Exception e) {
            	e.printStackTrace();
            }
            
            TransportationNetworkCompanyService service = getService(routerId);
            List<RideEstimate> rideEstimates = service.getRideEstimates(company, fromPlace, toPlace, distanceValue);
            if (rideEstimates.size() == 0)
                throw new Exception("Could not find any ride estimates for the specified company and ridetype");
            response.setRideEstimate(rideEstimates.get(0));
        } catch (Exception e) {
            response.setError(e);
        }

        return response;
    }

    private Place getPlace(String positionString, String paramName) throws Exception {
        requireParameter(positionString, paramName);

        String[] fields = positionString.split(",");
        double latitude, longitude;
        try {
            latitude = Double.parseDouble(fields[0]);
            longitude = Double.parseDouble(fields[1]);
        } catch (Exception e) {
            throw new Exception("Invalid format of " + paramName + " parameter.  Should be `lat,lon`.");
        }

        checkRangeInclusive(latitude, -90, 90);
        checkRangeInclusive(longitude, -180, 180);

        Place place = new Place();
        place.lat = latitude;
        place.lon = longitude;

        return place;
    }

    private TransportationNetworkCompanyService getService(String routerId) {
        Router router = otpServer.getRouter(routerId);
        if (router == null) {
            throw new UnsupportedOperationException("Unable to find router with id: " + routerId);
        }

        TransportationNetworkCompanyService service = router.graph.getService(TransportationNetworkCompanyService.class);
        if (service == null) {
            throw new UnsupportedOperationException("Unconfigured Transportaiton Network Company service for router with id: " + routerId);
        }

        return service;
    }

    private void requireParameter(String param, String paramName) {
        if (param == null) {
            throw new UnsupportedOperationException(paramName + " paramater is required");
        }
    }
}

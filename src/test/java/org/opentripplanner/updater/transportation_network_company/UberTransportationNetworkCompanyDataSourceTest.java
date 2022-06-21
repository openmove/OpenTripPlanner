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

package org.opentripplanner.updater.transportation_network_company;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import com.github.tomakehurst.wiremock.matching.StringValuePattern;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.opentripplanner.routing.transportation_network_company.ArrivalTime;
import org.opentripplanner.routing.transportation_network_company.RideEstimate;
import org.opentripplanner.updater.transportation_network_company.uber.UberAuthenticationRequestBody;
import org.opentripplanner.updater.transportation_network_company.uber.UberTransportationNetworkCompanyDataSource;

import java.util.List;
import java.util.concurrent.ExecutionException;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class UberTransportationNetworkCompanyDataSourceTest {

    public static final String CLIENT_ID = "testClientId";
    public static final String CLIENT_SECRET = "testClientSecret";

    private static UberTransportationNetworkCompanyDataSource source = new UberTransportationNetworkCompanyDataSource(
        "http://localhost:8089/",
        CLIENT_ID,
        CLIENT_SECRET
    );

    @Rule
    public WireMockRule wireMockRule = new WireMockRule(
        options()
            .port(8089)
            .usingFilesUnderDirectory("src/test/resources/updater/")
    );

    // Copied from lyft code (TODO: refactor)
    @Before
    public void setUp() throws Exception {
        // setup mock server to respond to ride estimate request
        stubFor(
            post(urlPathEqualTo("/oauth/v2/token"))
                .withRequestBody(equalTo(
                    new UberAuthenticationRequestBody(
                        CLIENT_ID,
                        CLIENT_SECRET,
                        "client_credentials",
                        // Any valid scope should be accepted per, e.g.:
                        // https://developer.uber.com/docs/riders/references/api/v1.2/estimates-price-get
                        "places"
                    ).toFormUrlEncoded()
                ))
                .willReturn(
                    aResponse()
                        .withBodyFile("uber_authentication.json")
                )
        );
    }

    @Test
    public void testGetArrivalTimes() throws ExecutionException {
        // Setup mock server to respond to ride estimate request.
        // The mock server expects a bearer token in the header per Uber API requirements as of 2022.
        stubFor(
            get(urlPathEqualTo("/estimates/time"))
                .withHeader("Authorization", matching("^Bearer [\\w|\\.]*"))
                .withQueryParam("start_latitude", equalTo("1.2"))
                .withQueryParam("start_longitude", equalTo("3.4"))
                .willReturn(
                    aResponse()
                        .withBodyFile("uber_arrival_estimates.json")
                )
        );
        // Old server tokens will be rejected at some point, so treat them the same as unauthorized.
        stubFor(
            get(urlPathEqualTo("/estimates/time"))
                .withHeader("Authorization", matching("^Token [\\w|\\.]*"))
                .withQueryParam("start_latitude", equalTo("1.2"))
                .withQueryParam("start_longitude", equalTo("3.4"))
                .willReturn(unauthorized())
        );
        // If no authentication is passed, I guess the API would return unauthorized.
        stubFor(
            get(urlPathEqualTo("/estimates/time"))
                .withHeader("Authorization", StringValuePattern.ABSENT)
                .withQueryParam("start_latitude", equalTo("1.2"))
                .withQueryParam("start_longitude", equalTo("3.4"))
                .willReturn(unauthorized())
        );


        List<ArrivalTime> arrivalTimes = source.getArrivalTimes(1.2, 3.4);

        assertEquals(arrivalTimes.size(),  8);
        ArrivalTime arrival = arrivalTimes.get(0);
        assertEquals(arrival.displayName, "POOL");
        assertEquals(arrival.productId, "26546650-e557-4a7b-86e7-6a3942445247");
        assertEquals(arrival.estimatedSeconds, 60);
    }

    @Test
    public void testGetEstimatedRideTimeAndCost() throws ExecutionException {
        // Setup mock server to respond to estimated ride time request.
        // The mock server expects a bearer token in the header per Uber API requirements as of 2022.
        stubFor(
            get(urlPathEqualTo("/estimates/price"))
                .withHeader("Authorization", matching("^Bearer [\\w|\\.]*"))
                .withQueryParam("start_latitude", equalTo("1.2"))
                .withQueryParam("start_longitude", equalTo("3.4"))
                .withQueryParam("end_latitude", equalTo("1.201"))
                .withQueryParam("end_longitude", equalTo("3.401"))
                .willReturn(
                    aResponse()
                        .withBodyFile("uber_trip_estimates.json")
                )
        );
        // Old server tokens will be rejected at some point, so treat them the same as unauthorized.
        stubFor(
            get(urlPathEqualTo("/estimates/price"))
                .withHeader("Authorization", matching("^Token [\\w|\\.]*"))
                .withQueryParam("start_latitude", equalTo("1.2"))
                .withQueryParam("start_longitude", equalTo("3.4"))
                .withQueryParam("end_latitude", equalTo("1.201"))
                .withQueryParam("end_longitude", equalTo("3.401"))
                .willReturn(unauthorized())
        );
        // If no authentication is passed, I guess the API would return unauthorized.
        stubFor(
            get(urlPathEqualTo("/estimates/price"))
                .withHeader("Authorization", StringValuePattern.ABSENT)
                .withQueryParam("start_latitude", equalTo("1.2"))
                .withQueryParam("start_longitude", equalTo("3.4"))
                .withQueryParam("end_latitude", equalTo("1.201"))
                .withQueryParam("end_longitude", equalTo("3.401"))
                .willReturn(unauthorized())
        );

        List<RideEstimate> rideEstimates = source.getRideEstimates(
            1.2,
            3.4,
            1.201,
            3.401
        );

        RideEstimate rideEstimate = null;

        for (RideEstimate estimate : rideEstimates) {
            if (estimate.rideType.equals("a1111c8c-c720-46c3-8534-2fcdd730040d")) {
                rideEstimate = estimate;
                break;
            }
        }

        assertNotNull(rideEstimate);
        assertEquals(1080, rideEstimate.duration);
        assertEquals(13, rideEstimate.minCost, 0.001);
        assertEquals(17, rideEstimate.maxCost, 0.001);
    }
}

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

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.tomakehurst.wiremock.junit.WireMockRule;
import com.github.tomakehurst.wiremock.matching.StringValuePattern;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.opentripplanner.routing.transportation_network_company.ArrivalTime;
import org.opentripplanner.routing.transportation_network_company.RideEstimate;
import org.opentripplanner.updater.transportation_network_company.uber.UberAuthenticationRequestBody;
import org.opentripplanner.updater.transportation_network_company.uber.UberAuthenticationResponse;
import org.opentripplanner.updater.transportation_network_company.uber.UberTransportationNetworkCompanyDataSource;

import java.io.IOException;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class UberTransportationNetworkCompanyDataSourceTest {

    public static final String CLIENT_ID = "testClientId";
    public static final String CLIENT_SECRET = "testClientSecret";

    private static final UberTransportationNetworkCompanyDataSource source = new UberTransportationNetworkCompanyDataSource(
        "http://localhost:8089/",
        "http://localhost:8090/",
        CLIENT_ID,
        CLIENT_SECRET
    );

    private static final UUID TOKEN_STUB_ID = UUID.randomUUID();

    @Rule
    public WireMockRule wireMockRule = new WireMockRule(
        options()
            .port(8090)
            .usingFilesUnderDirectory("src/test/resources/updater/")
    );

    // Copied from lyft code (TODO: refactor)
    @Before
    public void setUp() throws Exception {
        String accessToken = UUID.randomUUID().toString();
        // setup mock server to respond to ride estimate request
        stubFor(
            post(urlPathEqualTo("/oauth/v2/token"))
                .withId(TOKEN_STUB_ID)
                .withRequestBody(equalTo(
                    new UberAuthenticationRequestBody(
                        CLIENT_ID,
                        CLIENT_SECRET,
                        "client_credentials",
                        "ride_request.estimate"
                    ).toRequestParamString()
                ))
                .willReturn(
                    aResponse()
                        .withBody(getAuthorizationResponseBody(accessToken))
                )
        );
    }

    private String getAuthorizationResponseBody(String accessToken) throws JsonProcessingException {
        UberAuthenticationResponse response = new UberAuthenticationResponse();
        response.access_token = accessToken;
        response.expires_in = 2592000;
        response.scope = "ride_request.estimate";
        response.token_type = "Bearer";
        return new ObjectMapper().writeValueAsString(response);
    }

    @Test
    public void testGetAccessTokenSuccessful() throws IOException {
        // Get access token for the first time.
        String token1 = source.getAccessToken();

        // Edit stub so that it returns a different token when called.
        // (Modified stub doesn't need to be reset as we don't rely on a particular token value.)
        String newAccessToken = UUID.randomUUID().toString();
        editStub(get(urlPathEqualTo("/oauth/v2/token"))
            .withId(TOKEN_STUB_ID)
            .willReturn(
                aResponse()
                    .withBody(getAuthorizationResponseBody(newAccessToken))));

        // Second call to getAccessToken should return the same original token, as it has not expired yet.
        String token2 = source.getAccessToken();
        assertEquals(token1, token2);
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

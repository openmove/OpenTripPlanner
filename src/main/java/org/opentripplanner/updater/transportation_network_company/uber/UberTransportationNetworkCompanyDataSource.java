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

package org.opentripplanner.updater.transportation_network_company.uber;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.opentripplanner.routing.transportation_network_company.ArrivalTime;
import org.opentripplanner.routing.transportation_network_company.RideEstimate;
import org.opentripplanner.routing.transportation_network_company.TransportationNetworkCompany;
import org.opentripplanner.updater.transportation_network_company.Position;
import org.opentripplanner.updater.transportation_network_company.RideEstimateRequest;
import org.opentripplanner.updater.transportation_network_company.TransportationNetworkCompanyDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.core.UriBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UberTransportationNetworkCompanyDataSource extends TransportationNetworkCompanyDataSource {

    private static final Logger LOG = LoggerFactory.getLogger(UberTransportationNetworkCompanyDataSource.class);

    private static final String UBER_API_URL = "https://api.uber.com/v1.2/";

    private final String baseUrl; // for testing purposes
    private final String clientId;
    private final String clientSecret;

    private String accessToken = "1234";
    private Date tokenExpirationTime;

    public UberTransportationNetworkCompanyDataSource(JsonNode config) {
        this.baseUrl = UBER_API_URL;
        this.clientId = config.path("clientId").asText();
        this.clientSecret = config.path("clientSecret").asText();
        this.wheelChairAccessibleRideType = config.path("wheelChairAccessibleRideType").asText();
    }

    public UberTransportationNetworkCompanyDataSource (String baseUrl, String clientId, String clientSecret) {
        this.baseUrl = baseUrl;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

    // Copied from Lyft class (TODO: Refactor).
    private String getAccessToken() throws IOException {
        // check if token needs to be obtained
        Date now = new Date();
        if (tokenExpirationTime == null || now.after(tokenExpirationTime)) {
            // token needs to be obtained
            LOG.info("Requesting new Uber access token");

            // prepare request to get token
            UriBuilder uriBuilder = UriBuilder.fromUri(baseUrl + "oauth/v2/token");
            URL url = new URL(uriBuilder.toString());
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

            // set request body
            UberAuthenticationRequestBody authRequest = new UberAuthenticationRequestBody(
                clientId,
                clientSecret,
                "client_credentials",
                "places"
            );
            connection.setDoOutput(true);
            try (PrintWriter writer = new PrintWriter(connection.getOutputStream(), true)) {
                writer.print(authRequest.toFormUrlEncoded());
            }

            // send request and parse response
            ObjectMapper mapper = new ObjectMapper();
            InputStream responseStream = connection.getInputStream();
            UberAuthenticationResponse response = mapper.readValue(responseStream, UberAuthenticationResponse.class);
            accessToken = response.access_token;
            tokenExpirationTime = new Date();
            tokenExpirationTime.setTime(tokenExpirationTime.getTime() + (response.expires_in - 60) * 1000L);

            LOG.info("Received new Uber access token");
        }

        return accessToken;
    }

    @Override
    public TransportationNetworkCompany getTransportationNetworkCompanyType() {
        return TransportationNetworkCompany.UBER;
    }

    @Override
    public List<ArrivalTime> queryArrivalTimes(Position position) throws IOException {
        // prepare request
        UriBuilder uriBuilder = UriBuilder.fromUri(baseUrl + "estimates/time");
        uriBuilder.queryParam("start_latitude", position.latitude);
        uriBuilder.queryParam("start_longitude", position.longitude);
        String requestUrl = uriBuilder.toString();
        URL uberUrl = new URL(requestUrl);
        HttpURLConnection connection = (HttpURLConnection) uberUrl.openConnection();
        connection.setRequestProperty("Authorization", "Bearer " + getAccessToken());
        connection.setRequestProperty("Accept-Language", "en_US");
        connection.setRequestProperty("Content-Type", "application/json");

        LOG.info("Made arrival time request to Uber API at following URL: {}", requestUrl);

        // Make request, parse response
        InputStream responseStream = connection.getInputStream();
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        UberArrivalEstimateResponse response = mapper.readValue(responseStream, UberArrivalEstimateResponse.class);

        // serialize into Arrival Time objects
        List<ArrivalTime> arrivalTimes = new ArrayList<>();

        LOG.debug("Received {} Uber arrival time estimates", response.times.size());

        for (final UberArrivalEstimate time: response.times) {
            arrivalTimes.add(
                new ArrivalTime(
                    TransportationNetworkCompany.UBER,
                    time.product_id,
                    time.localized_display_name,
                    time.estimate,
                    productIsWheelChairAccessible(time.product_id)
                )
            );
        }

        if (arrivalTimes.isEmpty()) {
            LOG.warn(
                "No Uber service available at {}, {}",
                position.latitude,
                position.longitude
            );
        }

        return arrivalTimes;
    }

    @Override
    public List<RideEstimate> queryRideEstimates(
        RideEstimateRequest request
    ) throws IOException {
        // prepare request
        UriBuilder uriBuilder = UriBuilder.fromUri(baseUrl + "estimates/price");
        uriBuilder.queryParam("start_latitude", request.startPosition.latitude);
        uriBuilder.queryParam("start_longitude", request.startPosition.longitude);
        uriBuilder.queryParam("end_latitude", request.endPosition.latitude);
        uriBuilder.queryParam("end_longitude", request.endPosition.longitude);
        String requestUrl = uriBuilder.toString();
        URL uberUrl = new URL(requestUrl);
        HttpURLConnection connection = (HttpURLConnection) uberUrl.openConnection();
        connection.setRequestProperty("Authorization", "Bearer " + getAccessToken());
        connection.setRequestProperty("Accept-Language", "en_US");
        connection.setRequestProperty("Content-Type", "application/json");

        LOG.info("Made price estimate request to Uber API at following URL: {}", requestUrl);

        // Make request, parse response
        InputStream responseStream = connection.getInputStream();
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        UberTripTimeEstimateResponse response = mapper.readValue(responseStream, UberTripTimeEstimateResponse.class);

        if (response.prices == null) {
            throw new IOException("Unexpected response format");
        }

        LOG.debug("Received {} Uber price estimates", response.prices.size());

        List<RideEstimate> estimates = new ArrayList<>();

        for (final UberTripTimeEstimate price: response.prices) {
            estimates.add(new RideEstimate(
                TransportationNetworkCompany.UBER,
                price.currency_code,
                price.duration,
                price.high_estimate,
                price.low_estimate,
                price.product_id,
                productIsWheelChairAccessible(price.product_id)
            ));
        }

        if (estimates.isEmpty()) {
            LOG.warn(
                "No Uber service available for trip from {}, {} to {}, {}",
                request.startPosition.latitude,
                request.startPosition.longitude,
                request.endPosition.latitude,
                request.endPosition.longitude
            );
        }

        return estimates;
    }
}

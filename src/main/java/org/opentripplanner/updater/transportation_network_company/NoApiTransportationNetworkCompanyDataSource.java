package org.opentripplanner.updater.transportation_network_company;

import com.fasterxml.jackson.databind.JsonNode;
import org.opentripplanner.routing.transportation_network_company.ArrivalTime;
import org.opentripplanner.routing.transportation_network_company.RideEstimate;
import org.opentripplanner.routing.transportation_network_company.TransportationNetworkCompany;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;

/**
 * This data source is to model a transportation network company for which no API exists to calculate real-time arrival
 * estimates or ride estimates. The config for this updater can include a default value for the estimated arrival time
 * which will always be provided when estimates for the arrival time are desired.
 */
public class NoApiTransportationNetworkCompanyDataSource extends TransportationNetworkCompanyDataSource {
    private static final Logger LOG = LoggerFactory.getLogger(NoApiTransportationNetworkCompanyDataSource.class);

    /**
     * The default arrival time in seconds to respond with for all valid arrival time estimate requests. Defaults to 0.
     */
    private int defaultArrivalTimeSeconds = 0;

    /**
     * Whether or not the TNC service being modeled is wheelchair accessible. Defaults to false.
     */
    private boolean isWheelChairAccessible = false;
    private String name = "no-api-tnc-service";
    private String currency = "undefined";
    private double priceAtKm = 0;

    /**
     * Configures the data source. At this point, the only values the config could contain are the following:
     * - defaultArrivalTimeSeconds
     * - isWheelChairAccessible
     */
    public NoApiTransportationNetworkCompanyDataSource(JsonNode config) {
        defaultArrivalTimeSeconds = config.path("defaultArrivalTimeSeconds").asInt();
        isWheelChairAccessible = config.path("isWheelChairAccessible").asBoolean();
        
        if(config.path("data") != null && config.path("data").isContainerNode()) {
        	name = config.path("data").get("name").asText();
        	currency = config.path("data").get("currency").asText();
        	priceAtKm = config.path("data").get("kmPrice").asDouble();
        }
        
    }

    /**
     * For testing purposes only.
     */
    public NoApiTransportationNetworkCompanyDataSource(int defaultArrivalTimeSeconds, boolean isWheelChairAccessible) {
        this.defaultArrivalTimeSeconds = defaultArrivalTimeSeconds;
        this.isWheelChairAccessible = isWheelChairAccessible;
    }

    @Override public TransportationNetworkCompany getTransportationNetworkCompanyType() {
        return TransportationNetworkCompany.NOAPI;
    }

    @Override
    protected HttpURLConnection buildOAuthConnection() {
        // There is no authentication for this class.
        return null;
    }

    /**
     * In lieu of making an API request, this will merely return a single arrival estimate with the default arrive time.
     * TODO: add the ability to parse GeoJSON representing the service area of the TNC provider in order to be able to
     *  determine if TNC service is unavailable at the given position.
     */
    @Override protected List<ArrivalTime> queryArrivalTimes(Position position) throws IOException {
        List arrivalEstimates = new ArrayList();
        arrivalEstimates.add(new ArrivalTime(
            TransportationNetworkCompany.NOAPI,
            name,
            name,
            defaultArrivalTimeSeconds,
            isWheelChairAccessible

        ));
        return arrivalEstimates;
    }

    /**
     * In lieu of making an API request, this will merely return a single ride estimate with 0 duration and cost, but
     * with the wheelchair accessibility type that is possibly defined in the config.
     */
    @Override protected List<RideEstimate> queryRideEstimates(RideEstimateRequest request) throws IOException {
        List rideEstimates = new ArrayList();
        rideEstimates.add(new RideEstimate(
            TransportationNetworkCompany.NOAPI,
            currency,
            0,
            request.distance / 1000 * priceAtKm,
            request.distance / 1000 * priceAtKm,
            name,
            isWheelChairAccessible
        ));
        return rideEstimates;
    }
}

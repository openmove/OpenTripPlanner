package org.opentripplanner.routing.fares;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.opentripplanner.model.Agency;
import org.opentripplanner.model.FeedScopedId;
import org.opentripplanner.model.Route;
import org.opentripplanner.model.Stop;
import org.opentripplanner.routing.core.Fare;
import org.opentripplanner.routing.core.FareRuleSet;
import org.opentripplanner.routing.impl.ATLFareServiceImpl;
import org.opentripplanner.routing.impl.OrcaFareServiceImpl;
import org.opentripplanner.routing.impl.Ride;

import java.util.*;

import static org.opentripplanner.routing.impl.ATLFareServiceImpl.COBB_AGENCY_ID;
import static org.opentripplanner.routing.impl.ATLFareServiceImpl.GCT_AGENCY_ID;
import static org.opentripplanner.routing.impl.ATLFareServiceImpl.MARTA_AGENCY_ID;
import static org.opentripplanner.routing.impl.ATLFareServiceImpl.XPRESS_AGENCY_ID;

public class ATLFareServiceTest {
    private static ATLFareServiceImpl atlFareService;
    public static final float DEFAULT_TEST_RIDE_PRICE = 3.49f;
    public static final float DEFAULT_RIDE_PRICE_IN_CENTS = DEFAULT_TEST_RIDE_PRICE * 100;

    private static class TestATLFareServiceImpl extends ATLFareServiceImpl {

        public TestATLFareServiceImpl(Collection<FareRuleSet> regularFareRules) {
            super(regularFareRules);
        }
        @Override
        protected float getRidePrice(Ride ride, Fare.FareType fareType, Collection<FareRuleSet> fareRules) {
            String routeShortName = ride.routeData.getShortName().toLowerCase();
            // Testing, return default test ride price.
            switch (routeShortName) {
                case "101":
                    return DEFAULT_TEST_RIDE_PRICE + 1;
                case "102":
                    return DEFAULT_TEST_RIDE_PRICE + 2;
                case "atlsc":
                    return DEFAULT_TEST_RIDE_PRICE - 1;
                case "blue":
                    return 0; // free circulator
            }
            return DEFAULT_TEST_RIDE_PRICE;
        }
    }

    @BeforeAll
    public static void setUpClass() {
        Map<FeedScopedId, FareRuleSet> regularFareRules = new HashMap<>();
        atlFareService = new TestATLFareServiceImpl(regularFareRules.values());
    }

    @Test
    public void fromMartaTransfers() {
        List<Ride> rides = Arrays.asList(
            getRide(MARTA_AGENCY_ID, 0),
            getRide(XPRESS_AGENCY_ID, 1)
        );
        calculateFare(rides, Fare.FareType.electronicRegular, 349);

        rides = Arrays.asList(
            getRide(MARTA_AGENCY_ID, 0),
            getRide(GCT_AGENCY_ID, 1)
        );
        calculateFare(rides, Fare.FareType.electronicRegular, 349);

        // to GCT Express
        rides = Arrays.asList(
            getRide(MARTA_AGENCY_ID, 0),
            getRide(GCT_AGENCY_ID, "101", 1)
        );
        calculateFare(rides, Fare.FareType.electronicRegular, 349);

        rides = Arrays.asList(
            getRide(MARTA_AGENCY_ID, 0),
            getRide(COBB_AGENCY_ID, 1)
        );
        calculateFare(rides, Fare.FareType.electronicRegular, 349);

        // To Cobb Express
        rides = Arrays.asList(
            getRide(MARTA_AGENCY_ID, 0),
            getRide(COBB_AGENCY_ID, "101", 1)
        );
        calculateFare(rides, Fare.FareType.electronicRegular, 349);
    }

    @Test
    public void fromCobbTransfers() {
        List<Ride> rides = Arrays.asList(
            getRide(COBB_AGENCY_ID, 0),
            getRide(MARTA_AGENCY_ID, 1)
        );
        calculateFare(rides, Fare.FareType.electronicRegular, DEFAULT_RIDE_PRICE_IN_CENTS);

        // Local to express
        rides = Arrays.asList(
            getRide(COBB_AGENCY_ID, 0),
            getRide(COBB_AGENCY_ID, "101", 1)
        );
        calculateFare(rides, Fare.FareType.electronicRegular, DEFAULT_RIDE_PRICE_IN_CENTS + 100);

        rides = Arrays.asList(
            getRide(COBB_AGENCY_ID, 0),
            getRide(XPRESS_AGENCY_ID, 1)
        );
        calculateFare(rides, Fare.FareType.electronicRegular, DEFAULT_RIDE_PRICE_IN_CENTS + 150);

        // Express to local
        rides = Arrays.asList(
            getRide(COBB_AGENCY_ID, "101", 0),
            getRide(COBB_AGENCY_ID, 1)
        );
        calculateFare(rides, Fare.FareType.electronicRegular, DEFAULT_RIDE_PRICE_IN_CENTS + 100);

        rides = Arrays.asList(
            getRide(COBB_AGENCY_ID, "101", 0),
            getRide(GCT_AGENCY_ID, "102", 1)
        );
        calculateFare(rides, Fare.FareType.electronicRegular, DEFAULT_RIDE_PRICE_IN_CENTS * 2 + 300);

        // Local to circulator to express
        rides = Arrays.asList(
            getRide(COBB_AGENCY_ID, 0),
            getRide(COBB_AGENCY_ID, "BLUE", 1),
            getRide(COBB_AGENCY_ID, "101", 1)
        );
        calculateFare(rides, Fare.FareType.electronicRegular, DEFAULT_RIDE_PRICE_IN_CENTS + 100);
    }

    @Test
    public void fromGctTransfers() {
        List<Ride> rides = Arrays.asList(
            getRide(GCT_AGENCY_ID, 0),
            getRide(MARTA_AGENCY_ID, 1)
        );
        calculateFare(rides, Fare.FareType.electronicRegular, DEFAULT_RIDE_PRICE_IN_CENTS);
    }

    @Test
    public void tooManyRides() {
        List<Ride> rides = Arrays.asList(
            getRide(MARTA_AGENCY_ID, 0),
            getRide(MARTA_AGENCY_ID, 1),
            getRide(MARTA_AGENCY_ID, 2),
            getRide(MARTA_AGENCY_ID, 3),
            getRide(MARTA_AGENCY_ID, 4),
            getRide(MARTA_AGENCY_ID, 5)
        );
        calculateFare(rides, Fare.FareType.electronicRegular, DEFAULT_RIDE_PRICE_IN_CENTS * 2);

        rides = Arrays.asList(
            getRide(MARTA_AGENCY_ID, 0),
            getRide(MARTA_AGENCY_ID, 1),
            getRide(GCT_AGENCY_ID, 2),
            getRide(GCT_AGENCY_ID, 3),
            getRide(MARTA_AGENCY_ID, 4),
            getRide(COBB_AGENCY_ID, 5)
        );
        calculateFare(rides, Fare.FareType.electronicRegular, DEFAULT_RIDE_PRICE_IN_CENTS * 2);

        rides = Arrays.asList(
            getRide(GCT_AGENCY_ID, 0),
            getRide(MARTA_AGENCY_ID, 1),
            getRide(MARTA_AGENCY_ID, 2),
            getRide(MARTA_AGENCY_ID, 3)
        );
        calculateFare(rides, Fare.FareType.electronicRegular, DEFAULT_RIDE_PRICE_IN_CENTS);

        rides = Arrays.asList(
                getRide(GCT_AGENCY_ID, 0),
                getRide(MARTA_AGENCY_ID, 1),
                getRide(MARTA_AGENCY_ID, 2),
                getRide(MARTA_AGENCY_ID, 3),
                // new transfer - only got 3 from GCT
                getRide(MARTA_AGENCY_ID, 4)
        );
        calculateFare(rides, Fare.FareType.electronicRegular, DEFAULT_RIDE_PRICE_IN_CENTS * 2);

        rides = Arrays.asList(
            getRide(MARTA_AGENCY_ID, 0),
            getRide(MARTA_AGENCY_ID, 1),
            getRide(MARTA_AGENCY_ID, 2),
            getRide(GCT_AGENCY_ID, 3),
            getRide(GCT_AGENCY_ID, 4)
        );
        calculateFare(rides, Fare.FareType.electronicRegular, DEFAULT_RIDE_PRICE_IN_CENTS);
    }

    @Test
    public void expiredTransfer() {
        List<Ride> rides = Arrays.asList(
            getRide(MARTA_AGENCY_ID, 0),
            getRide(MARTA_AGENCY_ID, 1),
            getRide(MARTA_AGENCY_ID, 181),
            getRide(MARTA_AGENCY_ID, 179)
        );
        calculateFare(rides, Fare.FareType.electronicRegular, DEFAULT_RIDE_PRICE_IN_CENTS * 2);

        rides = Arrays.asList(
            getRide(MARTA_AGENCY_ID, 0),
            getRide(GCT_AGENCY_ID, 1),
            getRide(GCT_AGENCY_ID, 181),
            getRide(MARTA_AGENCY_ID, 181 + 178),
            getRide(MARTA_AGENCY_ID, 181 + 179)
        );
        calculateFare(rides, Fare.FareType.electronicRegular, DEFAULT_RIDE_PRICE_IN_CENTS * 2);
    }

    @Test
    public void useStreetcar() {
        final float STREETCAR_PRICE = DEFAULT_RIDE_PRICE_IN_CENTS-100f;
        List<Ride> rides = Arrays.asList(
            getRide(MARTA_AGENCY_ID, 0),
            getRide(MARTA_AGENCY_ID, "atlsc", 1 ),
            getRide(MARTA_AGENCY_ID, 2),
            getRide(MARTA_AGENCY_ID, 3),
            getRide(MARTA_AGENCY_ID, 4)
        );
        calculateFare(rides, Fare.FareType.electronicRegular, DEFAULT_RIDE_PRICE_IN_CENTS + STREETCAR_PRICE);

        rides = Arrays.asList(
            getRide(COBB_AGENCY_ID, 0),
            getRide(MARTA_AGENCY_ID, "atlsc", 1),
            getRide(COBB_AGENCY_ID, "101", 2)
        );
        calculateFare(
            rides,
            Fare.FareType.electronicRegular,
            DEFAULT_RIDE_PRICE_IN_CENTS + 100 + STREETCAR_PRICE);
    }

    /**
     * These tests are designed to specifically validate ATL fares. Since these fares are hard-coded, it is acceptable
     * to make direct calls to the ATL fare service with predefined routes. Where the default fare is applied a test
     * substitute {@link ATLFareServiceTest#DEFAULT_TEST_RIDE_PRICE} is used. This will be the same for all cash fare
     * types except when overriden above.
     */
    private static void calculateFare(List<Ride> rides,
                                      Fare.FareType fareType,
                                      float expectedFareInCents
    ) {
        Fare fare = new Fare();
        atlFareService.populateFare(fare, null, fareType, rides, null);
        Assertions.assertEquals(expectedFareInCents, fare.getFare(fareType).getCents());
    }

    private static Ride getRide(String agencyId, long startTimeMins) {
        return createRide(agencyId, "-1", -1, null, startTimeMins, "", "", "");
    }

    private static Ride getRide(String agencyId, String shortName, long startTimeMins) {
        return createRide(agencyId, shortName, -1, null,startTimeMins, "", "", "");
    }

    /**
     * Create a {@link Ride} containing route data that will be used by {@link OrcaFareServiceImpl} to determine the
     * correct ride type.
     */
    private static Ride createRide(String agencyId,
                                   String shortName,
                                   int rideType,
                                   String desc,
                                   long startTimeMins,
                                   String routeId,
                                   String tripId,
                                   String routeLongName
    ) {
        return createRide(agencyId, shortName, rideType, desc, startTimeMins, routeId, tripId, routeLongName, "", "");
    }

    /**
     * Create a {@link Ride} containing route data that will be used by {@link OrcaFareServiceImpl} to determine the
     * correct ride type.
     */
    private static Ride createRide(String agencyId,
                                   String shortName,
                                   int rideType,
                                   String desc,
                                   long startTimeMins,
                                   String routeId,
                                   String tripId,
                                   String routeLongName,
                                   String firstStopName,
                                   String lastStopName
    ) {
        Ride ride = new Ride();
        Agency agency = new Agency();
        agency.setId(agencyId);
        Route route = new Route();

        // Set up stops
        Stop firstStop = new Stop();
        firstStop.setName(firstStopName);
        Stop lastStop = new Stop();
        lastStop.setName(lastStopName);
        ride.firstStop = firstStop;
        ride.lastStop = lastStop;

        FeedScopedId routeFeedScopeId = new FeedScopedId();
        routeFeedScopeId.setId(routeId);
        route.setId(routeFeedScopeId);
        route.setAgency(agency);
        route.setShortName(shortName);
        route.setType(rideType);
        route.setDesc(desc);
        route.setLongName(routeLongName);
        ride.routeData = route;
        ride.startTime = startTimeMins * 60;
        FeedScopedId tripFeedScopeId = new FeedScopedId();
        tripFeedScopeId.setId(tripId);
        tripFeedScopeId.setAgencyId(agencyId);
        ride.trip = tripFeedScopeId;
        ride.routeData.setId(tripFeedScopeId);
        return ride;
    }
}

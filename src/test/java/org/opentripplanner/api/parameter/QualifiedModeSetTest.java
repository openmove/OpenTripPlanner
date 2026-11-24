package org.opentripplanner.api.parameter;

import org.junit.Test;
import org.opentripplanner.routing.core.RoutingRequest;
import org.opentripplanner.routing.core.TraverseMode;
import org.opentripplanner.routing.core.TraverseModeSet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class QualifiedModeSetTest {

    private static RoutingRequest apply(String modes) {
        RoutingRequest req = new RoutingRequest();
        new QualifiedModeSet(modes).applyToRoutingRequest(req);
        return req;
    }

    private static void assertCarSharing(RoutingRequest req) {
        assertTrue(req.allowVehicleRental);
        assertEquals(TraverseMode.CAR, req.rentedVehicleMode);
        assertFalse(req.allowCarRental);
        assertFalse(req.modes.getCar());
        assertTrue(req.modes.getWalk());
        assertFalse(req.modes.getMicromobility());
        assertFalse(req.kissAndRide);
        assertFalse(req.parkAndRide);
        assertFalse(req.onlyTransitTrips);
    }

    @Test
    public void carRentWalkIsCarSharing() {
        RoutingRequest req = apply("CAR_RENT,WALK");
        assertCarSharing(req);
        assertEquals(new TraverseModeSet(TraverseMode.WALK), req.modes);
    }

    @Test
    public void carRentWalkTransitIsCarSharingWithTransit() {
        RoutingRequest req = apply("CAR_RENT,WALK,TRANSIT");
        assertCarSharing(req);
        assertEquals(new TraverseModeSet(TraverseMode.WALK, TraverseMode.TRANSIT), req.modes);
    }

    @Test
    public void carRentAloneIsCarSharing() {
        RoutingRequest req = apply("CAR_RENT");
        assertCarSharing(req);
        assertEquals(new TraverseModeSet(TraverseMode.WALK), req.modes);
    }

    @Test
    public void carSharingSurvivesStringConstructor() {
        assertCarSharing(new RoutingRequest("CAR_RENT,WALK"));
    }

    @Test
    public void carRentWithMicromobilityRentIsRejected() {
        try {
            apply("MICROMOBILITY_RENT,CAR_RENT,WALK");
            fail("CAR_RENT combined with MICROMOBILITY_RENT must be rejected");
        } catch (IllegalArgumentException expected) {
            // expected
        }
    }

    @Test
    public void micromobilityRentWalkUnchanged() {
        RoutingRequest req = apply("MICROMOBILITY_RENT,WALK");
        assertTrue(req.allowVehicleRental);
        assertEquals(TraverseMode.MICROMOBILITY, req.rentedVehicleMode);
        assertFalse(req.allowCarRental);
        assertEquals(new TraverseModeSet(TraverseMode.MICROMOBILITY, TraverseMode.WALK), req.modes);
    }

    @Test
    public void carTransitUnchanged() {
        RoutingRequest req = apply("CAR,TRANSIT");
        assertTrue(req.kissAndRide);
        assertTrue(req.onlyTransitTrips);
        assertFalse(req.allowVehicleRental);
        assertFalse(req.allowCarRental);
        assertEquals(TraverseMode.MICROMOBILITY, req.rentedVehicleMode);
        assertEquals(new TraverseModeSet(TraverseMode.CAR, TraverseMode.WALK, TraverseMode.TRANSIT), req.modes);
    }

    @Test
    public void carParkTransitUnchanged() {
        RoutingRequest req = apply("CAR_PARK,TRANSIT");
        assertTrue(req.parkAndRide);
        assertTrue(req.onlyTransitTrips);
        assertFalse(req.kissAndRide);
        assertFalse(req.allowVehicleRental);
        assertFalse(req.allowCarRental);
        assertEquals(TraverseMode.MICROMOBILITY, req.rentedVehicleMode);
        assertEquals(new TraverseModeSet(TraverseMode.CAR, TraverseMode.WALK, TraverseMode.TRANSIT), req.modes);
    }

    @Test
    public void carRentWithCarParkTransitUnchanged() {
        // another CAR mode is present, so this is not car sharing: car2go rental plus park and ride, as before
        RoutingRequest req = apply("CAR_RENT,CAR_PARK,TRANSIT");
        assertTrue(req.allowCarRental);
        assertTrue(req.parkAndRide);
        assertTrue(req.onlyTransitTrips);
        assertFalse(req.allowVehicleRental);
        assertEquals(TraverseMode.MICROMOBILITY, req.rentedVehicleMode);
        assertEquals(new TraverseModeSet(TraverseMode.CAR, TraverseMode.WALK, TraverseMode.TRANSIT), req.modes);
    }

    @Test
    public void bicycleRentUnchanged() {
        RoutingRequest req = apply("BICYCLE_RENT");
        assertTrue(req.allowBikeRental);
        assertFalse(req.allowVehicleRental);
        assertFalse(req.allowCarRental);
        assertEquals(TraverseMode.MICROMOBILITY, req.rentedVehicleMode);
        assertEquals(new TraverseModeSet(TraverseMode.BICYCLE, TraverseMode.WALK), req.modes);
    }

    @Test
    public void walkTransitUnchanged() {
        RoutingRequest req = apply("WALK,TRANSIT");
        assertFalse(req.allowBikeRental);
        assertFalse(req.allowVehicleRental);
        assertFalse(req.allowCarRental);
        assertFalse(req.kissAndRide);
        assertFalse(req.parkAndRide);
        assertFalse(req.onlyTransitTrips);
        assertEquals(TraverseMode.MICROMOBILITY, req.rentedVehicleMode);
        assertEquals(new TraverseModeSet(TraverseMode.WALK, TraverseMode.TRANSIT), req.modes);
    }

    @Test
    public void laterModeSetReplacesCarSharing() {
        RoutingRequest req = new RoutingRequest("CAR_RENT,WALK");
        new QualifiedModeSet("MICROMOBILITY_RENT,WALK").applyToRoutingRequest(req);
        assertEquals(TraverseMode.MICROMOBILITY, req.rentedVehicleMode);
        assertTrue(req.allowVehicleRental);

        req = new RoutingRequest("CAR_RENT,WALK");
        new QualifiedModeSet("WALK").applyToRoutingRequest(req);
        assertEquals(TraverseMode.MICROMOBILITY, req.rentedVehicleMode);
        assertFalse(req.allowVehicleRental);
    }
}

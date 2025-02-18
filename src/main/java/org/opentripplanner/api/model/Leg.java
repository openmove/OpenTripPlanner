package org.opentripplanner.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.opentripplanner.api.model.alertpatch.LocalizedAlert;
import org.opentripplanner.model.FeedScopedId;
import org.opentripplanner.routing.alertpatch.Alert;
import org.opentripplanner.routing.core.TraverseMode;
import org.opentripplanner.routing.trippattern.RealTimeState;
import org.opentripplanner.util.model.EncodedPolylineBean;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/**
 * One leg of a trip -- that is, a temporally continuous piece of the journey that takes place on a
 * particular vehicle (or on foot).
 */

public class Leg {

    /**
     * The date and time this leg begins.
     */
    public Calendar startTime = null;

    /**
     * The date and time this leg ends.
     */
    public Calendar endTime = null;

    /**
     * For transit leg, the offset from the scheduled departure-time of the boarding stop in this leg.
     * "scheduled time of departure at boarding stop" = startTime - departureDelay
     */
    public int departureDelay = 0;
    /**
     * For transit leg, the offset from the scheduled arrival-time of the alighting stop in this leg.
     * "scheduled time of arrival at alighting stop" = endTime - arrivalDelay
     */
    public int arrivalDelay = 0;
    /**
     * Whether there is real-time data about this Leg
     */
    public Boolean realTime = false;

    public RealTimeState realtimeState = RealTimeState.SCHEDULED;

    /**
     * Is this a frequency-based trip with non-strict departure times?
     */
    public Boolean isNonExactFrequency = null;

    /**
     * The best estimate of the time between two arriving vehicles. This is particularly important
     * for non-strict frequency trips, but could become important for real-time trips, strict
     * frequency trips, and scheduled trips with empirical headways.
     */
    public Integer headway = null;

    /**
     * The distance traveled while traversing the leg in meters.
     */
    public Double distance = null;

    /**
     * Is this leg a traversing pathways?
     */
    public Boolean pathway = false;

    /**
     * The mode (e.g., <code>Walk</code>) used when traversing this leg.
     */
    @JsonSerialize
    public String mode = TraverseMode.WALK.toString();

    /**
     * For transit legs, the route of the bus or train being used. For non-transit legs, the name of
     * the street being traversed.
     */
    @JsonSerialize
    public String route = "";

    @JsonSerialize
    public String agencyName;

    @JsonSerialize
    public String agencyUrl;
    
    @JsonSerialize
    public String agencyFareUrl;

    @JsonSerialize
    public String agencyBrandingUrl;

    @JsonSerialize
    public int agencyTimeZoneOffset;
    
    @JsonSerialize
    public BookingRuleSummary agencyBookingRule;
    
    @JsonSerialize
    public Integer routeRegionalFareCardAccepted;

    /**
     * For transit leg, the route's (background) color (if one exists). For non-transit legs, null.
     */
    @JsonSerialize
    public String routeColor = null;

    /**
     * For transit legs, the type of the route. Non transit -1
     * When 0-7: 0 Tram, 1 Subway, 2 Train, 3 Bus, 4 Ferry, 5 Cable Car, 6 Gondola, 7 Funicular
     * When equal or highter than 100, it is coded using the Hierarchical Vehicle Type (HVT) codes from the European TPEG standard
     * Also see http://groups.google.com/group/gtfs-changes/msg/ed917a69cf8c5bef
     */
    @JsonSerialize
    public Integer routeType = null;

    
    
    /**
     * For transit legs, the ID of the route.
     * For non-transit legs, null.
     */
    public FeedScopedId routeId = null;

    /**
     * For transit leg, the route's text color (if one exists). For non-transit legs, null.
     */
    @JsonSerialize
    public String routeTextColor = null;

    /**
     * For transit legs, if the rider should stay on the vehicle as it changes route names.
     */
    @JsonSerialize
    public Boolean interlineWithPreviousLeg;


    /**
     * For transit leg, the trip's short name (if one exists). For non-transit legs, null.
     */
    @JsonSerialize
    public String tripShortName = null;

    /**
     * For transit leg, the trip's block ID (if one exists). For non-transit legs, null.
     */
    @JsonSerialize
    public String tripBlockId = null;

    /**
     * For transit legs, the headsign of the bus or train being used. For non-transit legs, null.
     */
    @JsonSerialize
    public String headsign = null;

    /**
     * For transit legs, the ID of the transit agency that operates the service used for this leg.
     * For non-transit legs, null.
     */
    @JsonSerialize
    public String agencyId = null;

    /**
     * For transit legs, the ID of the trip.
     * For non-transit legs, null.
     */
    public FeedScopedId tripId = null;

    /**
     * For transit legs, the service date of the trip.
     * For non-transit legs, null.
     */
    @JsonSerialize
    public String serviceDate = null;

    /**
     * For transit leg, the route's branding URL (if one exists). For non-transit legs, null.
     */
    @JsonSerialize
    public String routeBrandingUrl = null;

    @JsonSerialize
    public String vehicleType = null;
    
    /**
     * The Place where the leg originates.
     */
    public Place from = null;

    /**
     * The Place where the leg begins.
     */
    public Place to = null;

    /**
     * For transit legs, intermediate stops between the Place where the leg originates and the Place where the leg ends.
     * For non-transit legs, null.
     * This field is optional i.e. it is always null unless "showIntermediateStops" parameter is set to "true" in the planner request.
     */
    @JsonProperty(value="intermediateStops")
    public List<Place> stop;

    /**
     * The leg's geometry.
     */
    public EncodedPolylineBean legGeometry;

    public List<EncodedPolylineBean> interStopGeometry;

    /**
     * A series of turn by turn instructions used for walking, biking and driving.
     */
    @JsonProperty(value="steps")
    public List<WalkStep> walkSteps;

    @JsonSerialize
    public List<LocalizedAlert> alerts;

    @JsonSerialize
    public String routeShortName;

    @JsonSerialize
    public String routeLongName;

    @JsonSerialize
    public String boardRule;

    @JsonSerialize
    public String alightRule;

    @JsonSerialize
    public Boolean rentedBike;

    @JsonSerialize
    public Boolean rentedCar;

    @JsonSerialize
    public Boolean rentedVehicle;

    @JsonSerialize
    public Boolean hailedCar;

    @JsonSerialize
    public TransportationNetworkCompanySummary tncData;

    /**
     * True if this is a call-and-ride leg.
     */
    @JsonSerialize
    public Boolean callAndRide;

    /* For call-n-ride leg, supply maximum start time based on calculation. */
    @JsonSerialize
    public Calendar flexCallAndRideMaxStartTime = null;

    /* For call-n-ride leg, supply minimum end time based on calculation. */
    @JsonSerialize
    public Calendar flexCallAndRideMinEndTime = null;

    /** trip.drt_advance_book_min if this is a demand-response leg */
    @JsonSerialize
    public double flexDrtAdvanceBookMin;

    /**
     *  Agency message if this is leg has a demand-response pickup and the Trip has
     *  `drt_pickup_message` defined.
     */
    @JsonSerialize
    public String flexDrtPickupMessage;

    /**
     * Agency message if this is leg has a demand-response dropoff and the Trip has
     * `drt_drop_off_message` defined.
     */
    @JsonSerialize
    public String flexDrtDropOffMessage;

    /**
     * Agency message if this is leg has a flag stop pickup and the Trip has
     * `continuous_pickup_message` defined.
     */
    @JsonSerialize
    public String flexFlagStopPickupMessage;

    /**
     * Agency message if this is leg has a flag stop dropoff and the Trip has
     * `continuous_drop_off_message` defined.
     */
    @JsonSerialize
    public String flexFlagStopDropOffMessage;
    
    /**
     * true if this (transit) leg has bike on board
     */
    @JsonSerialize
    public Boolean hasBikeOnBoard;

    /**
     * How easy is it to use this leg when using a wheelchair.
     *
     * 0 = terrible accessibility
     * 1 = great accessibility
     */
    @JsonSerialize
    public Float accessibilityScore;

    /**
     * Whether this leg is a transit leg or not.
     * @return Boolean true if the leg is a transit leg
     */
    public Boolean isTransitLeg() {
        if (mode == null) return null;
        else if (mode.equals(TraverseMode.WALK.toString())) return false;
        else if (mode.equals(TraverseMode.CAR.toString())) return false;
        else if (mode.equals(TraverseMode.BICYCLE.toString())) return false;
        else if (mode.equals(TraverseMode.MICROMOBILITY.toString())) return false;
        else return true;
    }

    /**
     * The leg's duration in seconds
     */
    @JsonSerialize
    public double getDuration() {
        return endTime.getTimeInMillis()/1000.0 - startTime.getTimeInMillis()/1000.0;
    }

    public void addAlert(Alert alert, Locale locale) {
        if (alerts == null) {
            alerts = new ArrayList<>();
        }
        for (LocalizedAlert a : alerts) {
            if (a.alert.equals(alert)) {
                return;
            }
        }
        alerts.add(new LocalizedAlert(alert, locale));
    }

    public void setTimeZone(TimeZone timeZone) {
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.setTime(startTime.getTime());
        startTime = calendar;
        calendar = Calendar.getInstance(timeZone);
        calendar.setTime(endTime.getTime());
        endTime = calendar;
        agencyTimeZoneOffset = timeZone.getOffset(startTime.getTimeInMillis());
    }
}

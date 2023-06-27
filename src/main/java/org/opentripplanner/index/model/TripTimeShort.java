package org.opentripplanner.index.model;

import java.util.List;

import org.opentripplanner.model.FeedScopedId;
import org.opentripplanner.model.Stop;
import org.opentripplanner.model.Trip;
import org.opentripplanner.routing.core.ServiceDay;
import org.opentripplanner.routing.edgetype.Timetable;
import org.opentripplanner.routing.trippattern.FrequencyEntry;
import org.opentripplanner.routing.trippattern.RealTimeState;
import org.opentripplanner.routing.trippattern.TripTimes;

import com.beust.jcommander.internal.Lists;

public class TripTimeShort {

    public static final int UNDEFINED = -1;
    public FeedScopedId stopId;
    public int stopIndex;
    public int stopCount;
    public int stopSequence;
    public int scheduledArrival = UNDEFINED ;
    public int scheduledDeparture = UNDEFINED ;
    public int realtimeArrival = UNDEFINED ;
    public int realtimeDeparture = UNDEFINED ;
    public int arrivalDelay = UNDEFINED ;
    public int departureDelay = UNDEFINED ;
    public boolean timepoint = false;
    public boolean realtime = false;
    public RealTimeState realtimeState = RealTimeState.SCHEDULED ;
    public long serviceDay;
    public FeedScopedId tripId;
    public String blockId;
    public String headsign;
    public int continuousPickup;
    public int continuousDropOff;
    public double serviceAreaRadius;
    public String serviceArea;
    public int pickupType;
    public int dropOffType;
    

    /**
     * This is stop-specific, so the index i is a stop index, not a hop index.
     */
    public TripTimeShort(TripTimes tt, int i, Stop stop) {
        stopId = stop.getId();
        stopIndex          = i;
        stopCount          = tt.getNumStops();
        scheduledArrival   = tt.getScheduledArrivalTime(i);
        realtimeArrival    = tt.getArrivalTime(i);
        arrivalDelay       = tt.getArrivalDelay(i);
        scheduledDeparture = tt.getScheduledDepartureTime(i);
        realtimeDeparture  = tt.getDepartureTime(i);
        departureDelay     = tt.getDepartureDelay(i);
        timepoint          = tt.isTimepoint(i);
        realtime           = !tt.isScheduled();
        realtimeState      = tt.getRealTimeState();
        blockId            = tt.trip.getBlockId();
        headsign           = tt.getHeadsign(i);
        continuousPickup   = tt.getContinuousPickup(i);
        continuousDropOff  = tt.getContinuousDropOff(i);
        serviceAreaRadius  = tt.getServiceAreaRadius(i);
        serviceArea        = tt.getServiceArea(i);
        stopSequence       = tt.getStopSequence(i);
        pickupType		   = tt.getPickupType(i);
        dropOffType		   = tt.getDropOffType(i);
        
    }

    public TripTimeShort(TripTimes tt, int i, Stop stop, ServiceDay sd) {
        this(tt, i, stop);
        tripId = tt.trip.getId();
        serviceDay = sd.time(0);
    }

    /**
     * must pass in both table and trip, because tripTimes do not have stops.
     */
    public static List<TripTimeShort> fromTripTimes (Timetable table, Trip trip) {
    	int index = table.getTripIndex(trip.getId());
    	TripTimes times = null;
    	if(index > -1) {
    		times = table.getTripTimes(index);       
    	}else if(!table.frequencyEntries.isEmpty()){
    		for (FrequencyEntry freq : table.frequencyEntries) {
    			if(freq.tripTimes.trip.getId().equals(trip.getId())) {
    				times = freq.tripTimes;
    				break;
    			}
            }
    	} else {
    		return null;
    	}
        List<TripTimeShort> out = Lists.newArrayList();
        // one per stop, not one per hop, thus the <= operator
        for (int i = 0; i < times.getNumStops(); ++i) {
            out.add(new TripTimeShort(times, i, table.pattern.getStop(i)));
        }
        return out;
    }

    public static List<TripTimeShort> fromTripTimes (Timetable table, Trip trip, ServiceDay sd) {
    	int index = table.getTripIndex(trip.getId());
    	TripTimes times = null;
    	if(index > -1) {
    		times = table.getTripTimes(index);
    	}else if(!table.frequencyEntries.isEmpty()){
    		for (FrequencyEntry freq : table.frequencyEntries) {
    			if(freq.tripTimes.trip.getId().equals(trip.getId())) {
    				times = freq.tripTimes;
    				break;
    			}
            }
    	}else {return null;}
    	
        List<TripTimeShort> out = Lists.newArrayList();
        // one per stop, not one per hop, thus the <= operator
        for (int i = 0; i < times.getNumStops(); ++i) {
            out.add(new TripTimeShort(times, i, table.pattern.getStop(i), sd));
        }
        return out;
    }
    
}

package org.opentripplanner.updater.trip_capacity;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.locks.ReentrantLock;

import org.opentripplanner.model.Agency;
import org.opentripplanner.model.FeedScopedId;
import org.opentripplanner.model.Route;
import org.opentripplanner.model.Stop;
import org.opentripplanner.model.StopPattern;
import org.opentripplanner.model.StopTime;
import org.opentripplanner.model.Trip;
import org.opentripplanner.model.calendar.ServiceDate;
import org.opentripplanner.routing.edgetype.Timetable;
import org.opentripplanner.routing.edgetype.TimetableSnapshot;
import org.opentripplanner.routing.edgetype.TripPattern;
import org.opentripplanner.routing.graph.Graph;
import org.opentripplanner.routing.graph.GraphIndex;
import org.opentripplanner.routing.trippattern.RealTimeState;
import org.opentripplanner.routing.trippattern.TripTimes;
import org.opentripplanner.updater.GtfsRealtimeFuzzyTripMatcher;
import org.opentripplanner.updater.stoptime.TimetableSnapshotSource;
import org.opentripplanner.updater.stoptime.TripPatternCache;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Preconditions;
import com.google.transit.realtime.GtfsRealtime.TripDescriptor;
import com.google.transit.realtime.GtfsRealtime.TripUpdate;
import com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate;

/**
 * This class should be used to create snapshots of lookup tables of realtime data. This is
 * necessary to provide planning threads a consistent constant view of a graph with realtime data at
 * a specific point in time.
 */
public class TimetableCapacitySnapshotSource extends TimetableSnapshotSource{
    

	private static final Logger LOG = LoggerFactory.getLogger(TimetableCapacitySnapshotSource.class);

    /**
     * Number of milliseconds per second
     */
    private static final int MILLIS_PER_SECOND = 1000;

    /**
     * Maximum time in seconds since midnight for arrivals and departures
     */
    private static final long MAX_ARRIVAL_DEPARTURE_TIME = 48 * 60 * 60;

    public int logFrequency = 2000;

    private int appliedBlockCount = 0;

    /**
     * If a timetable snapshot is requested less than this number of milliseconds after the previous
     * snapshot, just return the same one. Throttles the potentially resource-consuming task of
     * duplicating a TripPattern -> Timetable map and indexing the new Timetables.
     */
    public int maxSnapshotFrequency = 1000; // msec

    /**
     * The last committed snapshot that was handed off to a routing thread. This snapshot may be
     * given to more than one routing thread if the maximum snapshot frequency is exceeded.
     */
    private volatile TimetableSnapshot snapshot = null;

    /**
     * The working copy of the timetable snapshot. Should not be visible to routing threads. Should
     * only be modified by a thread that holds a lock on {@link #bufferLock}. All public methods that
     * might modify this buffer will correctly acquire the lock.
     */
    private final TimetableSnapshot buffer = new TimetableSnapshot();

    /**
     * Lock to indicate that buffer is in use
     */
    private final ReentrantLock bufferLock = new ReentrantLock(true);

    /**
     * A synchronized cache of trip patterns that are added to the graph due to GTFS-realtime messages.
     */
    private final TripPatternCache tripPatternCache = new TripPatternCache();

    /** Should expired realtime data be purged from the graph. */
    public boolean purgeExpiredData = true;

    protected ServiceDate lastPurgeDate = null;

    protected long lastSnapshotTime = -1;

    private final TimeZone timeZone;

    private final GraphIndex graphIndex;

    public GtfsRealtimeFuzzyTripMatcher fuzzyTripMatcher;

    public TimetableCapacitySnapshotSource(final Graph graph) {
    	super(graph);
        timeZone = graph.getTimeZone();
        graphIndex = graph.index;
    }

    /**
     * @return an up-to-date snapshot mapping TripPatterns to Timetables. This snapshot and the
     *         timetable objects it references are guaranteed to never change, so the requesting
     *         thread is provided a consistent view of all TripTimes. The routing thread need only
     *         release its reference to the snapshot to release resources.
     */
    public TimetableSnapshot getTimetableSnapshot() {
        TimetableSnapshot snapshotToReturn;

        // Try to get a lock on the buffer
        if (bufferLock.tryLock()) {
            // Make a new snapshot if necessary
            try {
                snapshotToReturn = getTimetableSnapshot(false);
            } finally {
                bufferLock.unlock();
            }
        } else {
            // No lock could be obtained because there is either a snapshot commit busy or updates
            // are applied at this moment, just return the current snapshot
            snapshotToReturn = snapshot;
        }

        return snapshotToReturn;
    }

    private TimetableSnapshot getTimetableSnapshot(final boolean force) {
        final long now = System.currentTimeMillis();
        if (force || now - lastSnapshotTime > maxSnapshotFrequency) {
            if (force || buffer.isDirty()) {
                LOG.debug("Committing {}", buffer.toString());
                snapshot = buffer.commit(force);
            } else {
                LOG.debug("Buffer was unchanged, keeping old snapshot.");
            }
            lastSnapshotTime = System.currentTimeMillis();
        } else {
            LOG.debug("Snapshot frequency exceeded. Reusing snapshot {}", snapshot);
        }
        return snapshot;
    }

    /**
     * Method to apply a trip update list to the most recent version of the timetable snapshot. A
     * GTFS-RT feed is always applied against a single static feed (indicated by feedId).
     *
     * However, multi-feed support is not completed and we currently assume there is only one static
     * feed when matching IDs.
     *
     * @param graph graph to update (needed for adding/changing stop patterns)
     * @param fullDataset true iff the list with updates represent all updates that are active right
     *        now, i.e. all previous updates should be disregarded
     * @param updates GTFS-RT TripUpdate's that should be applied atomically
     * @param feedId
     */
    public void applyTripCapacityUpdates(final Graph graph, final boolean fullDataset, final List<TripCapacityUpdate> updates, final String feedId) {
        if (updates == null) {
            LOG.warn("updates is null");
            return;
        }

        // Acquire lock on buffer
        bufferLock.lock();

        try {
            if (fullDataset) {
                // Remove all updates from the buffer
                buffer.clear(feedId);
            }

            LOG.debug("message contains {} trip updates", updates.size());
            int uIndex = 0;
            for (TripCapacityUpdate tripUpdate : updates) {
                

                ServiceDate serviceDate = new ServiceDate();
                
                serviceDate = ServiceDate.parseString(tripUpdate.date);
                
                uIndex += 1;
                LOG.trace("{}", tripUpdate);

                // Determine what kind of trip update this is
                boolean applied = handleUpdateCapacityTrip(tripUpdate, feedId, serviceDate);

                if (applied) {
                    appliedBlockCount++;
                } else {
                    LOG.warn("Failed to apply TripUpdate.");
                    LOG.trace(" Contents: {}", tripUpdate);
                }

                if (appliedBlockCount % logFrequency == 0) {
                    LOG.info("Applied {} trip updates.", appliedBlockCount);
                }
            }
            LOG.debug("end of update message");

            // Make a snapshot after each message in anticipation of incoming requests
            // Purge data if necessary (and force new snapshot if anything was purged)
            // Make sure that the public (locking) getTimetableSnapshot function is not called.
            if (purgeExpiredData) {
                final boolean modified = purgeExpiredData();
                getTimetableSnapshot(modified);
            } else {
                getTimetableSnapshot(false);
            }
        } catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
            // Always release lock
            bufferLock.unlock();
        }
    }

    private boolean handleUpdateCapacityTrip(final TripCapacityUpdate tripUpdate, final String feedId, final ServiceDate serviceDate) {
        
        // This does not include Agency ID or feed ID, trips are feed-unique and we currently assume a single static feed.
        final String tripId = tripUpdate.tripId;
        Trip trip = getTripForTripId(feedId, tripId);
        final TripPattern pattern = getPatternForTripId(feedId, tripId);

        if (pattern == null) {
            LOG.warn("No pattern found for tripId {}, skipping TripUpdate.", tripId);
            return false;
        }

        
        // Apply update on the *scheduled* time table and set the updated trip times in the buffer
        final TripTimes updatedTripTimes = pattern.scheduledTimetable.getTripTimes(trip);
        
        if (updatedTripTimes == null) {
            return false;
        }
        
        updatedTripTimes.setBikesCapacity(tripUpdate.bikesCapacity);
        updatedTripTimes.setTravelersCapacity(tripUpdate.travelersCapacity);
        // Make sure that updated trip times have the correct real time state
        updatedTripTimes.setRealTimeState(RealTimeState.UPDATED);

        final boolean success = buffer.update(feedId, pattern, updatedTripTimes, serviceDate);
        return success;
    }

 

    private boolean purgeExpiredData() {
        final ServiceDate today = new ServiceDate();
        final ServiceDate previously = today.previous().previous(); // Just to be safe...

        if(lastPurgeDate != null && lastPurgeDate.compareTo(previously) > 0) {
            return false;
        }

        LOG.debug("purging expired realtime data");

        lastPurgeDate = previously;

        return buffer.purgeExpiredData(previously);
    }

    /**
     * Retrieve a trip pattern given a feed id and trid id.
     *
     * @param feedId feed id for the trip id
     * @param tripId trip id without agency
     * @return trip pattern or null if no trip pattern was found
     */
    private TripPattern getPatternForTripId(String feedId, String tripId) {
        Trip trip = graphIndex.tripForId.get(new FeedScopedId(feedId, tripId));
        TripPattern pattern = graphIndex.patternForTrip.get(trip);
        return pattern;
    }

    /**
     * Retrieve trip given a trip id without an agency
     *
     * @param feedId feed id for the trip id
     * @param tripId trip id without the agency
     * @return trip or null if trip can't be found in graph index
     */
    private Trip getTripForTripId(String feedId, String tripId) {
        Trip trip = graphIndex.tripForId.get(new FeedScopedId(feedId, tripId));
        return trip;
    }


}

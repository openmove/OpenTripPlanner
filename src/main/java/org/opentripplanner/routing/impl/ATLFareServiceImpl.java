package org.opentripplanner.routing.impl;

import com.google.common.collect.Lists;
import org.opentripplanner.model.Route;
import org.opentripplanner.routing.core.Fare;
import org.opentripplanner.routing.core.FareRuleSet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Instant;
import java.time.ZoneId;
import java.util.*;

public class ATLFareServiceImpl extends DefaultFareServiceImpl {
    public static final String COBB_AGENCY_ID = "2";
    public static final String XPRESS_AGENCY_ID = "6";
    public static final String MARTA_AGENCY_ID = "5";
    public static final String GCT_AGENCY_ID = "4";

    private enum TransferType {
        END_TRANSFER, // Ends this transfer entirely.
        NO_TRANSFER, // Effectively no transfer, but don't invalidate this transfer
        FREE_TRANSFER, // Transfer is free
        TRANSFER_WITH_UPCHARGE, // Transfer has a set upcharge
        TRANSFER_PAY_DIFFERENCE // Transfer pays difference between default fares
    }

    private enum RideType {
        FREE_RIDE,
        MARTA,
        COBB_LOCAL, COBB_EXPRESS("100", "101", "102"),
        GCT_LOCAL, GCT_EXPRESS_Z1("102", "103a", "110", "swpr"), GCT_EXPRESS_Z2("101", "103"),
        XPRESS_MORNING, XPRESS_AFTERNOON,
        STREETCAR("atlsc");
        private final HashSet<String> routeNames;
        RideType(String... members){
            this.routeNames = new HashSet<String>(Arrays.asList(members));
        }
        public boolean routeNamesContains(String s) {
            return routeNames.contains(s.toLowerCase());
        }
    }

    private static class ATLTransfer {
        List<Ride> rides = new ArrayList<>();
        List<Fare> fares = new ArrayList<>();
        final Fare.FareType fareType;
        final Currency currency;
        float lastFareWithTransfer;
        int maxRides;
        int transferWindow;

        public ATLTransfer(Currency currency, Fare.FareType fareType) {
            this.fareType = fareType;
            this.currency = currency;
        }

        /**
         * Adds a ride to this transfer.
         * @param ride Ride to be added
         * @param defaultFare Default fare to use for transfer calculations (usually from GTFS)
         * @return Whether the added ride is valid or not. If invalid, then this transfer has ended and a new one is needed for the ride.
         */
        public boolean addRide(Ride ride, float defaultFare) {
            // A transfer will always contain at least one ride.
            Fare fare = new Fare();
            RideType toRideType = classify(ride);
            if (rides.size() == 0) {
                rides.add(ride);
                fare.addFare(fareType, getMoney(currency, defaultFare));
                fares.add(fare);
                lastFareWithTransfer = defaultFare;
                maxRides = getMaxTransfers(toRideType);
                transferWindow = getTransferWindow(toRideType);
                return true;
            }

            Ride latestRide = rides.get(rides.size() - 1);
            // TODO: Potential problem if the first trip of a transfer is a pay on exit?
            long transferStartTime = rides.get(0).startTime;
            RideType fromRideType = classify(latestRide);
            TransferMeta transferClassification = classifyTransfer(toRideType, fromRideType, this.fareType);

            long transferUseTime = transferClassification.payOnExit ? ride.endTime : ride.startTime;

            // If transfer is NO_TRANSFER, it will not have a window or maxTransfers set,
            // so we only check if it's valid if the transfer is going to be used.
            if (!transferClassification.type.equals(TransferType.NO_TRANSFER)) {
                // Consider the conditions under which this transfer will no longer be valid.
                if (transferClassification.type.equals(TransferType.END_TRANSFER)) return false;
                else if (transferUseTime >= transferStartTime + transferWindow * 60L) return false;
                else if (rides.size() > maxRides) return false;
            }

            // The transfer is valid for this ride, so create a fare object.
            // TODO: Change this fare object out for the one on the Ride object when Fare-by-leg is added
            fares.add(fare);

            if (transferClassification.type.equals(TransferType.NO_TRANSFER)) {
                fare.addFare(fareType, getMoney(currency, defaultFare));
                // Full fare is charged, but transfer is still valid.
                // Ride is not added to rides list since it doesn't count towards transfer limit.
                // NOTE: Rides and fares list will not always be in sync because of this.
                return true;
            }

            // All conditions below this point "use" the transfer, so we add the ride.
            rides.add(ride);
            if (transferClassification.type.equals(TransferType.FREE_TRANSFER)) {
                fare.addFare(fareType, getMoney(currency, 0));
                lastFareWithTransfer = defaultFare;
                return true;
            } else if (transferClassification.type.equals(TransferType.TRANSFER_PAY_DIFFERENCE)) {
                float newCost = 0;
                if (defaultFare > lastFareWithTransfer) {
                    newCost = defaultFare - lastFareWithTransfer;
                }
                fare.addFare(fareType, getMoney(currency, newCost));
                lastFareWithTransfer = defaultFare;
                return true;
            } else if (transferClassification.type.equals(TransferType.TRANSFER_WITH_UPCHARGE)) {
                fare.addFare(fareType, getMoney(currency, (float) transferClassification.upcharge / 100));
                lastFareWithTransfer = defaultFare;
                return true;
            }
            return true;
        }

        public float getTotal() {
            int total = 0;
            for (Fare f : fares) {
               total += f.getFare(fareType).getCents();
            }
            return (float) total / 100;
        }
    }

    /**
     * Get the ride price for a single leg. If testing, this class is being called directly so the required agency cash
     * values are not available therefore the default test price is used instead.
     */
    protected float getRidePrice(Ride ride, Fare.FareType fareType, Collection<FareRuleSet> fareRules) {
        return calculateCost(fareType, Lists.newArrayList(ride), fareRules);
    }

    private static class TransferMeta {
        public final TransferType type;
        public final int upcharge;
        public final boolean payOnExit;

        /**
         * Create a TransferMeta
         * @param type Type of transfer
         * @param upcharge Upcharge for the transfer in cents
         * @param payOnExit Whether the fare is charged at end of leg
         */
        public TransferMeta(TransferType type, int upcharge, boolean payOnExit) {
            this.type = type;
            this.upcharge = upcharge;
            this.payOnExit = payOnExit;
        }

        public TransferMeta(TransferType type) {
            this(type, 0, false);
        }
    }

    private static RideType classify(Ride ride) {
        Route routeData = ride.routeData;
        String shortName = routeData.getShortName().toLowerCase();
        final HashSet<String> COBB_FREE_RIDE_SHORT_NAMES = new HashSet<>(Arrays.asList("blue", "green"));

        switch(routeData.getId().getAgencyId()) {
            case COBB_AGENCY_ID:
                if (RideType.COBB_EXPRESS.routeNamesContains(shortName)) {
                    return RideType.COBB_EXPRESS;
                } else if (COBB_FREE_RIDE_SHORT_NAMES.contains(shortName)) {
                    return RideType.FREE_RIDE;
                }
                return RideType.COBB_LOCAL;
            case XPRESS_AGENCY_ID:
                // Get hour of trip start
                long hours = Instant.ofEpochSecond(ride.startTime).atZone(ZoneId.of("America/New_York")).getHour();
                if (hours >= 12) {
                    return RideType.XPRESS_AFTERNOON;
                } else {
                    return RideType.XPRESS_MORNING;
                }
            case GCT_AGENCY_ID:
                if (RideType.GCT_EXPRESS_Z1.routeNamesContains(shortName)) {
                    return RideType.GCT_EXPRESS_Z1;
                } else if (RideType.GCT_EXPRESS_Z2.routeNamesContains(shortName)) {
                    return RideType.GCT_EXPRESS_Z2;
                }
                return RideType.GCT_LOCAL;
            // Also catches MARTA_AGENCY_ID
            default:
                // Streetcar GTFS published by MARTA
                if(RideType.STREETCAR.routeNamesContains(shortName)) {
                    return RideType.STREETCAR;
                }
                return RideType.MARTA;
        }
    }

    private static int getMaxTransfers(RideType rideType) {
        switch (rideType) {
            // GCT only allows 3 transfers.
            case GCT_EXPRESS_Z1:
            case GCT_LOCAL:
            case GCT_EXPRESS_Z2:
                return 3;
            default:
                return 4;
        }
    }

    private static int getTransferWindow(RideType rideType) {
        return 180;
    }

    private static TransferMeta classifyTransfer(RideType toRideType, RideType fromRideType, Fare.FareType fareType) {
        switch (toRideType) {
            case STREETCAR:
            case FREE_RIDE:
                return new TransferMeta(TransferType.NO_TRANSFER);
            case COBB_LOCAL:
                if (!isElectronicPayment(fareType)) {
                    if (fromRideType == RideType.COBB_LOCAL || fromRideType == RideType.COBB_EXPRESS) {
                        return new TransferMeta(TransferType.FREE_TRANSFER);
                    }
                    return new TransferMeta(TransferType.END_TRANSFER);
                }
                switch(fromRideType) {
                    case COBB_LOCAL:
                    case COBB_EXPRESS:
                    case MARTA:
                        return new TransferMeta(TransferType.FREE_TRANSFER);
                    default:
                        return new TransferMeta(TransferType.END_TRANSFER);
                }
            case COBB_EXPRESS:
                if (!isElectronicPayment(fareType)) {
                    switch(fromRideType) {
                        case COBB_EXPRESS:
                            return new TransferMeta(TransferType.FREE_TRANSFER);
                        case COBB_LOCAL:
                            return new TransferMeta(TransferType.TRANSFER_PAY_DIFFERENCE);
                        default:
                            return new TransferMeta(TransferType.END_TRANSFER);
                    }
                }
                // Electronic payment
                switch(fromRideType) {
                    case COBB_EXPRESS:
                    case MARTA:
                        return new TransferMeta(TransferType.FREE_TRANSFER);
                    case COBB_LOCAL:
                        return new TransferMeta(TransferType.TRANSFER_PAY_DIFFERENCE);
                    default:
                        return new TransferMeta(TransferType.NO_TRANSFER);
                }
            case MARTA:
               if (!isElectronicPayment(fareType)) return new TransferMeta(TransferType.END_TRANSFER);
               switch(fromRideType) {
                   case MARTA:
                   case XPRESS_AFTERNOON:
                   case XPRESS_MORNING:
                   case COBB_LOCAL:
                   case COBB_EXPRESS:
                   case GCT_EXPRESS_Z1:
                   case GCT_EXPRESS_Z2:
                   case GCT_LOCAL:
                       return new TransferMeta(TransferType.FREE_TRANSFER);
                   default:
                       return new TransferMeta(TransferType.END_TRANSFER);
               }
            case XPRESS_MORNING:
            case XPRESS_AFTERNOON:
                boolean payOnExit = toRideType == RideType.XPRESS_AFTERNOON;
                if (!isElectronicPayment(fareType)) return new TransferMeta(TransferType.END_TRANSFER);
                switch(fromRideType) {
                    case MARTA:
                    case COBB_EXPRESS:
                    case GCT_EXPRESS_Z1:
                    case GCT_EXPRESS_Z2:
                    case XPRESS_AFTERNOON:
                    case XPRESS_MORNING:
                        return new TransferMeta(TransferType.FREE_TRANSFER, 0, payOnExit);
                    case COBB_LOCAL:
                        return new TransferMeta(TransferType.TRANSFER_WITH_UPCHARGE, 150, payOnExit);
                    case GCT_LOCAL:
                        return new TransferMeta(TransferType.TRANSFER_WITH_UPCHARGE, 100, payOnExit);
                    default:
                        return new TransferMeta(TransferType.END_TRANSFER);
                }
            case GCT_LOCAL:
                if (!isElectronicPayment(fareType))
                    return new TransferMeta(TransferType.END_TRANSFER);
                switch (fromRideType) {
                    case MARTA:
                    case GCT_LOCAL:
                    case GCT_EXPRESS_Z1:
                    case GCT_EXPRESS_Z2:
                        return new TransferMeta(TransferType.FREE_TRANSFER);
                    default:
                        return new TransferMeta(TransferType.END_TRANSFER);
                }
            case GCT_EXPRESS_Z1:
            case GCT_EXPRESS_Z2:
                if (!isElectronicPayment(fareType)) return new TransferMeta(TransferType.END_TRANSFER);
                switch(fromRideType) {
                    case MARTA:
                        return new TransferMeta(TransferType.FREE_TRANSFER);
                    case GCT_LOCAL:
                    case GCT_EXPRESS_Z1:
                    case GCT_EXPRESS_Z2:
                        return new TransferMeta(TransferType.TRANSFER_PAY_DIFFERENCE);
                    default:
                        return new TransferMeta(TransferType.END_TRANSFER);
                }
           default:
              return new TransferMeta(TransferType.END_TRANSFER);
       }
    }

    private static boolean isElectronicPayment(Fare.FareType fareType) {
        return fareType.equals(Fare.FareType.electronicRegular) ||
            fareType.equals(Fare.FareType.electronicSenior) ||
            fareType.equals(Fare.FareType.electronicSpecial) ||
            fareType.equals(Fare.FareType.electronicYouth);
    }

    private static final Logger LOG = LoggerFactory.getLogger(ATLFareServiceImpl.class);

    public ATLFareServiceImpl(Collection<FareRuleSet> regularFareRules) {
        addFareRules(Fare.FareType.regular, regularFareRules);
        addFareRules(Fare.FareType.senior, regularFareRules);
        addFareRules(Fare.FareType.youth, regularFareRules);
        addFareRules(Fare.FareType.electronicRegular, regularFareRules);
        addFareRules(Fare.FareType.electronicYouth, regularFareRules);
        addFareRules(Fare.FareType.electronicSpecial, regularFareRules);
        addFareRules(Fare.FareType.electronicSenior, regularFareRules);
    }

    @Override
    public boolean populateFare(Fare fare,
                                Currency currency,
                                Fare.FareType fareType,
                                List<Ride> rides,
                                Collection<FareRuleSet> fareRules
    ) {
        LOG.info("ATL populateFare: {}, {} rides", fareType, rides.size());
        List<ATLTransfer> transfers = new ArrayList<ATLTransfer>();
        for (Ride ride : rides) {
            float defaultFare = getRidePrice(ride, fareType, fareRules);
            if (transfers.isEmpty()) {
                transfers.add(new ATLTransfer(currency, fareType));
            }
            ATLTransfer latestTransfer = transfers.get(transfers.size() - 1);
            if (!latestTransfer.addRide(ride, defaultFare)) {
                // Transfer is invalid, create a new one.
                ATLTransfer newXfer = new ATLTransfer(currency, fareType);
                newXfer.addRide(ride, defaultFare);
                transfers.add(newXfer);
            }
        }

        float cost = 0;
        for (ATLTransfer transfer : transfers) {
            cost += transfer.getTotal();
        }

        fare.addFare(fareType, getMoney(currency, cost));

        return true;
    }
}

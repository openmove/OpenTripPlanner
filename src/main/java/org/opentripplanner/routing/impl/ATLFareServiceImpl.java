package org.opentripplanner.routing.impl;

import com.google.common.collect.Lists;
import org.opentripplanner.model.Route;
import org.opentripplanner.model.Transfer;
import org.opentripplanner.routing.core.Fare;
import org.opentripplanner.routing.core.FareRuleSet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Currency;
import java.util.List;

public class ATLFareServiceImpl extends DefaultFareServiceImpl {
    private enum TransferType {
        END_TRANSFER, // Ends this transfer entirely.
        NO_TRANSFER, // Effectively no transfer, but don't invalidate this transfer
        FREE_TRANSFER, // Transfer is free
        TRANSFER_WITH_UPCHARGE, // Transfer has a set upcharge
        TRANSFER_PAY_DIFFERENCE // Transfer pays difference between default fares
    }

    private enum RideType {
        MARTA, COBB_LOCAL, COBB_EXPRESS, GCT_LOCAL, GCT_EXPRESS_Z1, GCT_EXPRESS_Z2, XPRESS_GREEN, XPRESS_BLUE, STREETCAR
    }

    private static class ATLTransfer {
        List<Ride> rides = new ArrayList<Ride>();
        List<Fare> fares = new ArrayList<Fare>();
        Fare.FareType fareType;
        Currency currency;
        float currentDiscount = 0;

        public ATLTransfer(Currency currency, Fare.FareType fareType) {
            this.fareType = fareType;
            this.currency = currency;
        }

        /**
         *
         * @param ride
         * @param defaultFare
         * @return If the added ride is valid or not. If invalid, then this transfer has ended and a new one is needed for the ride.
         */
        public boolean addRide(Ride ride, float defaultFare) {
            // A transfer will always contain at least one ride.
            Fare fare = new Fare();
            if(rides.size() == 0) {
                rides.add(ride);
                // TODO: Add Fare
                fare.addFare(fareType, getMoney(currency, defaultFare));
                fares.add(fare);
                return true;
            }

            Ride latestRide = rides.get(rides.size() - 1);
            long transferStartTime = rides.get(0).startTime;
            RideType fromRideType = classify(latestRide);
            RideType toRideType = classify(ride);
            TransferMeta transferClassification = classifyTransfer(toRideType, fromRideType, this.fareType);

            // Consider the conditions under which this transfer will no longer be valid.
            if(transferClassification.type.equals(TransferType.END_TRANSFER)) return false;
            else if(ride.startTime >= transferStartTime + transferClassification.window) return false;
            else if(rides.size() >= transferClassification.maxTransfers) return false;

            // The transfer is valid for this ride, so create a fare object.
            // TODO: Change this fare object out for the one on the Ride object when Fare-by-leg is added
            fares.add(fare);

            if(transferClassification.type.equals(TransferType.NO_TRANSFER)) {
                fare.addFare(fareType, getMoney(currency, defaultFare));
                // Full fare is charged, but transfer is still valid.
                // Ride is not added to rides list since it doesn't cound towards transfer limit.
                // NOTE: Rides and fares list will not always be in sync because of this.
                return true;
            }

            // All conditions below this point "use" the transfer, so we add the ride.
            rides.add(ride);
            if(transferClassification.type.equals(TransferType.FREE_TRANSFER)) {
                fare.addFare(fareType, getMoney(currency, 0));
                return true;
            } else if(transferClassification.type.equals(TransferType.TRANSFER_PAY_DIFFERENCE)) {
                float newCost;
                if(defaultFare > currentDiscount) {
                    newCost = defaultFare - currentDiscount;
                    currentDiscount = defaultFare;
                } else {
                    newCost = defaultFare;
                }
                fare.addFare(fareType, getMoney(currency, newCost));
                return true;
            } else if(transferClassification.type.equals(TransferType.TRANSFER_WITH_UPCHARGE)) {
                fare.addFare(fareType, getMoney(currency, transferClassification.upcharge));
                return true;
            }
            return true;
        }

        public float getTotal() {
            int total = 0;
            for(Fare f : fares) {
               total += f.getFare(fareType).getCents();
            }
            return (float) total / 100;
        }
    }

    /**
     * Get the ride price for a single leg. If testing, this class is being called directly so the required agency cash
     * values are not available therefore the default test price is used instead.
     */
    private float getRidePrice(Ride ride, Fare.FareType fareType, Collection<FareRuleSet> fareRules) {
//        if (IS_TEST) {
//            // Testing, return default test ride price.
//            return DEFAULT_TEST_RIDE_PRICE;
//        }
        return calculateCost(fareType, Lists.newArrayList(ride), fareRules);
    }

    private static class TransferMeta {
        public int window; // Transfer window in mins
        public int maxTransfers; // How many transfers are allowed within window
        public TransferType type;
        public int upcharge;

        /**
         * Create a TransferMeta
         * @param type Type of transfer
         * @param window Window for transfer in mins
         * @param maxTransfers Max transfers that can be made on one fare
         * @param upcharge Upcharge for the transfer in cents
         */
        public TransferMeta(TransferType type, int window, int maxTransfers, int upcharge) {
            this.type = type;
            this.window = window;
            this.maxTransfers = maxTransfers;
            this.upcharge = upcharge;
        }

        public TransferMeta(TransferType type, int window, int maxTransfers) {
            this(type, window, maxTransfers, 0);
            if(type.equals(TransferType.TRANSFER_WITH_UPCHARGE)) {
                throw new IllegalArgumentException("Must specify the upcharge.");
            }
        }

        public TransferMeta(TransferType type) {
            this(type, 0, 0, 0);
            if(!(type.equals(TransferType.END_TRANSFER) || type.equals(TransferType.NO_TRANSFER))) {
                throw new IllegalArgumentException("Window and maxTransfers arguments required for this transfer type.");
            }
        }
    }

    private static RideType classify(Ride ride) {
        Route routeData = ride.routeData;

        return RideType.MARTA;
        // TODO: Finish
    }

    private static TransferMeta classifyTransfer(RideType toRideType, RideType fromRideType, Fare.FareType fareType) {
       switch (toRideType) {
           case MARTA:
               if(isElectronicPayment(fareType)) {
                   switch(fromRideType) {
                       case MARTA:
                       case XPRESS_BLUE:
                       case XPRESS_GREEN:
                           return new TransferMeta(TransferType.FREE_TRANSFER, 180, 4);
                       case STREETCAR:
                           return new TransferMeta(TransferType.NO_TRANSFER);
                       default:
                           return new TransferMeta(TransferType.END_TRANSFER);
                   }
               } else {
                   return new TransferMeta(TransferType.END_TRANSFER);
               }
           case STREETCAR:
               return new TransferMeta(TransferType.NO_TRANSFER);
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
        LOG.info("ATL populateFare: " + fareType + ", " + rides.size() + " rides");
        Long freeTransferStartTime = null;
        List<ATLTransfer> transfers = new ArrayList<ATLTransfer>();
        for (Ride ride : rides) {
            float defaultFare = getRidePrice(ride, fareType, fareRules);
            if(transfers.size() == 0) {
                transfers.add(new ATLTransfer(currency, fareType));
            }
            ATLTransfer latestTransfer = transfers.get(transfers.size() - 1);
            if(!latestTransfer.addRide(ride, defaultFare)) {
                // Transfer is invalid, create a new one.
                ATLTransfer newXfer = new ATLTransfer(currency, fareType);
                newXfer.addRide(ride, defaultFare);
                transfers.add(newXfer);
            }
        }

        float cost = 0;
        for(ATLTransfer transfer : transfers) {
            cost += transfer.getTotal();
        }

        return true;
    }
}

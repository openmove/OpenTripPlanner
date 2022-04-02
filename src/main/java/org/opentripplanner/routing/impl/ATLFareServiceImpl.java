package org.opentripplanner.routing.impl;

import org.opentripplanner.routing.core.Fare;
import org.opentripplanner.routing.core.FareRuleSet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;
import java.util.Currency;
import java.util.List;

public class ATLFareServiceImpl extends DefaultFareServiceImpl {
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
        return true;
    }
}

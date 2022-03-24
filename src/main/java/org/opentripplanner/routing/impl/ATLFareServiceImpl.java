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

    @Override
    public boolean populateFare(Fare fare,
                                Currency currency,
                                Fare.FareType fareType,
                                List<Ride> rides,
                                Collection<FareRuleSet> fareRules
    ) {
        LOG.info("ATL populateFare: " + fareType + ", " + rides.size() + " rides");
        return false;
    }
}

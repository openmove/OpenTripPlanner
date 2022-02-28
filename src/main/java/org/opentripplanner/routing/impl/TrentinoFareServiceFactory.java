package org.opentripplanner.routing.impl;

import org.opentripplanner.routing.services.FareService;

public class TrentinoFareServiceFactory extends DefaultFareServiceFactory {
    @Override
    public FareService makeFareService() { 
        return new TrentinoFareServiceImpl(regularFareRules.values());
    }
}

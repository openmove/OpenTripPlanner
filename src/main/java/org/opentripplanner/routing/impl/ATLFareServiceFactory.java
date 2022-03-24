package org.opentripplanner.routing.impl;

import org.opentripplanner.routing.services.FareService;

public class ATLFareServiceFactory extends DefaultFareServiceFactory {
    @Override
    public FareService makeFareService() {
        return new ATLFareServiceImpl();
    }
}

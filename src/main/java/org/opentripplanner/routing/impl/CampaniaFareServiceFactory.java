package org.opentripplanner.routing.impl;

import org.opentripplanner.routing.services.FareService;

public class CampaniaFareServiceFactory extends DefaultFareServiceFactory {
    @Override
    public FareService makeFareService() { 
        return new CampaniaFareServiceImpl(regularFareRules.values());
    }
}

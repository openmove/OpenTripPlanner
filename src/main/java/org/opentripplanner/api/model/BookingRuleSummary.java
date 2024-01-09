package org.opentripplanner.api.model;

import org.opentripplanner.model.BookingRule;
import org.opentripplanner.routing.transportation_network_company.ArrivalTime;
import org.opentripplanner.routing.transportation_network_company.RideEstimate;
import org.opentripplanner.routing.transportation_network_company.TransportationNetworkCompany;

/**
 * Simplified BookingRule summary included with itinerary {@link Leg}.
 */
public class BookingRuleSummary {
	public String infoUrl;
	public String url;
	public String message;
	public String phoneNumber;

    public BookingRuleSummary (BookingRule br) {
    	this.infoUrl = br.getInfoUrl();
        if (br.getType() != 99) {            
            this.url = br.getUrl();
            this.message = br.getMessage();
            this.phoneNumber = br.getPhoneNumber();
        }else {
        	this.message = br.getMessage();
        }
        
    }
}

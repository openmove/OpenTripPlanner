//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package com.bliksemlabs.ojp.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per TicketingFacilityEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TicketingFacilityEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="ticketMachines"/&gt;
 *     &lt;enumeration value="ticketOffice"/&gt;
 *     &lt;enumeration value="ticketOnDemandMachines"/&gt;
 *     &lt;enumeration value="ticketSales"/&gt;
 *     &lt;enumeration value="mobileTicketing"/&gt;
 *     &lt;enumeration value="ticketCollection"/&gt;
 *     &lt;enumeration value="centralReservations"/&gt;
 *     &lt;enumeration value="localTickets"/&gt;
 *     &lt;enumeration value="nationalTickets"/&gt;
 *     &lt;enumeration value="internationalTickets"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TicketingFacilityEnumeration")
@XmlEnum
public enum TicketingFacilityEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("ticketMachines")
    TICKET_MACHINES("ticketMachines"),
    @XmlEnumValue("ticketOffice")
    TICKET_OFFICE("ticketOffice"),
    @XmlEnumValue("ticketOnDemandMachines")
    TICKET_ON_DEMAND_MACHINES("ticketOnDemandMachines"),
    @XmlEnumValue("ticketSales")
    TICKET_SALES("ticketSales"),
    @XmlEnumValue("mobileTicketing")
    MOBILE_TICKETING("mobileTicketing"),
    @XmlEnumValue("ticketCollection")
    TICKET_COLLECTION("ticketCollection"),
    @XmlEnumValue("centralReservations")
    CENTRAL_RESERVATIONS("centralReservations"),
    @XmlEnumValue("localTickets")
    LOCAL_TICKETS("localTickets"),
    @XmlEnumValue("nationalTickets")
    NATIONAL_TICKETS("nationalTickets"),
    @XmlEnumValue("internationalTickets")
    INTERNATIONAL_TICKETS("internationalTickets");
    private final String value;

    TicketingFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TicketingFacilityEnumeration fromValue(String v) {
        for (TicketingFacilityEnumeration c: TicketingFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

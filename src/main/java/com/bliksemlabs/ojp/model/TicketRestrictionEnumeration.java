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
 * <p>Classe Java per TicketRestrictionEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TicketRestrictionEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="pti25_0"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="pti25_1"/&gt;
 *     &lt;enumeration value="allTicketClassesValid"/&gt;
 *     &lt;enumeration value="pti25_2"/&gt;
 *     &lt;enumeration value="fullFareOnly"/&gt;
 *     &lt;enumeration value="pti25_3"/&gt;
 *     &lt;enumeration value="certainTicketsOnly"/&gt;
 *     &lt;enumeration value="pti25_4"/&gt;
 *     &lt;enumeration value="ticketWithReservation"/&gt;
 *     &lt;enumeration value="pti25_5"/&gt;
 *     &lt;enumeration value="specialFare"/&gt;
 *     &lt;enumeration value="pti25_6"/&gt;
 *     &lt;enumeration value="onlyTicketsOfSpecifiedOperator"/&gt;
 *     &lt;enumeration value="pti25_7"/&gt;
 *     &lt;enumeration value="noRestrictions"/&gt;
 *     &lt;enumeration value="pti25_8"/&gt;
 *     &lt;enumeration value="noOffPeakTickets"/&gt;
 *     &lt;enumeration value="pti25_9"/&gt;
 *     &lt;enumeration value="noWeekendReturnTickets"/&gt;
 *     &lt;enumeration value="pti25_10"/&gt;
 *     &lt;enumeration value="noReducedFareTickets"/&gt;
 *     &lt;enumeration value="pti25_255"/&gt;
 *     &lt;enumeration value="unknownTicketRestriction"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TicketRestrictionEnumeration")
@XmlEnum
public enum TicketRestrictionEnumeration {

    @XmlEnumValue("pti25_0")
    PTI_25___0("pti25_0"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pti25_1")
    PTI_25___1("pti25_1"),
    @XmlEnumValue("allTicketClassesValid")
    ALL_TICKET_CLASSES_VALID("allTicketClassesValid"),
    @XmlEnumValue("pti25_2")
    PTI_25___2("pti25_2"),
    @XmlEnumValue("fullFareOnly")
    FULL_FARE_ONLY("fullFareOnly"),
    @XmlEnumValue("pti25_3")
    PTI_25___3("pti25_3"),
    @XmlEnumValue("certainTicketsOnly")
    CERTAIN_TICKETS_ONLY("certainTicketsOnly"),
    @XmlEnumValue("pti25_4")
    PTI_25___4("pti25_4"),
    @XmlEnumValue("ticketWithReservation")
    TICKET_WITH_RESERVATION("ticketWithReservation"),
    @XmlEnumValue("pti25_5")
    PTI_25___5("pti25_5"),
    @XmlEnumValue("specialFare")
    SPECIAL_FARE("specialFare"),
    @XmlEnumValue("pti25_6")
    PTI_25___6("pti25_6"),
    @XmlEnumValue("onlyTicketsOfSpecifiedOperator")
    ONLY_TICKETS_OF_SPECIFIED_OPERATOR("onlyTicketsOfSpecifiedOperator"),
    @XmlEnumValue("pti25_7")
    PTI_25___7("pti25_7"),
    @XmlEnumValue("noRestrictions")
    NO_RESTRICTIONS("noRestrictions"),
    @XmlEnumValue("pti25_8")
    PTI_25___8("pti25_8"),
    @XmlEnumValue("noOffPeakTickets")
    NO_OFF_PEAK_TICKETS("noOffPeakTickets"),
    @XmlEnumValue("pti25_9")
    PTI_25___9("pti25_9"),
    @XmlEnumValue("noWeekendReturnTickets")
    NO_WEEKEND_RETURN_TICKETS("noWeekendReturnTickets"),
    @XmlEnumValue("pti25_10")
    PTI_25___10("pti25_10"),
    @XmlEnumValue("noReducedFareTickets")
    NO_REDUCED_FARE_TICKETS("noReducedFareTickets"),
    @XmlEnumValue("pti25_255")
    PTI_25___255("pti25_255"),
    @XmlEnumValue("unknownTicketRestriction")
    UNKNOWN_TICKET_RESTRICTION("unknownTicketRestriction");
    private final String value;

    TicketRestrictionEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TicketRestrictionEnumeration fromValue(String v) {
        for (TicketRestrictionEnumeration c: TicketRestrictionEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

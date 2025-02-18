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
 * <p>Classe Java per BookingStatusEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="BookingStatusEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="pti24_0"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="pti17_1"/&gt;
 *     &lt;enumeration value="available"/&gt;
 *     &lt;enumeration value="pti24_2"/&gt;
 *     &lt;enumeration value="limited"/&gt;
 *     &lt;enumeration value="pti24_3"/&gt;
 *     &lt;enumeration value="veryLimited"/&gt;
 *     &lt;enumeration value="pti24_4"/&gt;
 *     &lt;enumeration value="full"/&gt;
 *     &lt;enumeration value="pti24_5"/&gt;
 *     &lt;enumeration value="waitingList"/&gt;
 *     &lt;enumeration value="pti24_6"/&gt;
 *     &lt;enumeration value="noBookingRequired"/&gt;
 *     &lt;enumeration value="pti24_7"/&gt;
 *     &lt;enumeration value="bookingRequired"/&gt;
 *     &lt;enumeration value="pti24_8"/&gt;
 *     &lt;enumeration value="bookingOptional"/&gt;
 *     &lt;enumeration value="pti24_255"/&gt;
 *     &lt;enumeration value="undefinedBookingInformation"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BookingStatusEnumeration")
@XmlEnum
public enum BookingStatusEnumeration {

    @XmlEnumValue("pti24_0")
    PTI_24___0("pti24_0"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pti17_1")
    PTI_17___1("pti17_1"),
    @XmlEnumValue("available")
    AVAILABLE("available"),
    @XmlEnumValue("pti24_2")
    PTI_24___2("pti24_2"),
    @XmlEnumValue("limited")
    LIMITED("limited"),
    @XmlEnumValue("pti24_3")
    PTI_24___3("pti24_3"),
    @XmlEnumValue("veryLimited")
    VERY_LIMITED("veryLimited"),
    @XmlEnumValue("pti24_4")
    PTI_24___4("pti24_4"),
    @XmlEnumValue("full")
    FULL("full"),
    @XmlEnumValue("pti24_5")
    PTI_24___5("pti24_5"),
    @XmlEnumValue("waitingList")
    WAITING_LIST("waitingList"),
    @XmlEnumValue("pti24_6")
    PTI_24___6("pti24_6"),
    @XmlEnumValue("noBookingRequired")
    NO_BOOKING_REQUIRED("noBookingRequired"),
    @XmlEnumValue("pti24_7")
    PTI_24___7("pti24_7"),
    @XmlEnumValue("bookingRequired")
    BOOKING_REQUIRED("bookingRequired"),
    @XmlEnumValue("pti24_8")
    PTI_24___8("pti24_8"),
    @XmlEnumValue("bookingOptional")
    BOOKING_OPTIONAL("bookingOptional"),
    @XmlEnumValue("pti24_255")
    PTI_24___255("pti24_255"),
    @XmlEnumValue("undefinedBookingInformation")
    UNDEFINED_BOOKING_INFORMATION("undefinedBookingInformation");
    private final String value;

    BookingStatusEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BookingStatusEnumeration fromValue(String v) {
        for (BookingStatusEnumeration c: BookingStatusEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

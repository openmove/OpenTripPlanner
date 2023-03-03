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
 * <p>Classe Java per OccupancyEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="OccupancyEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="full"/&gt;
 *     &lt;enumeration value="seatsAvailable"/&gt;
 *     &lt;enumeration value="standingAvailable"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OccupancyEnumeration")
@XmlEnum
public enum OccupancyEnumeration {

    @XmlEnumValue("full")
    FULL("full"),
    @XmlEnumValue("seatsAvailable")
    SEATS_AVAILABLE("seatsAvailable"),
    @XmlEnumValue("standingAvailable")
    STANDING_AVAILABLE("standingAvailable");
    private final String value;

    OccupancyEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OccupancyEnumeration fromValue(String v) {
        for (OccupancyEnumeration c: OccupancyEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

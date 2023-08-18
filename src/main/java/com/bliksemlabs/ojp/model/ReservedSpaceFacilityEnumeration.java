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
 * <p>Classe Java per ReservedSpaceFacilityEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ReservedSpaceFacilityEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="lounge"/&gt;
 *     &lt;enumeration value="hall"/&gt;
 *     &lt;enumeration value="meetingpoint"/&gt;
 *     &lt;enumeration value="groupPoint"/&gt;
 *     &lt;enumeration value="reception"/&gt;
 *     &lt;enumeration value="shelter"/&gt;
 *     &lt;enumeration value="seats"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReservedSpaceFacilityEnumeration")
@XmlEnum
public enum ReservedSpaceFacilityEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("lounge")
    LOUNGE("lounge"),
    @XmlEnumValue("hall")
    HALL("hall"),
    @XmlEnumValue("meetingpoint")
    MEETINGPOINT("meetingpoint"),
    @XmlEnumValue("groupPoint")
    GROUP_POINT("groupPoint"),
    @XmlEnumValue("reception")
    RECEPTION("reception"),
    @XmlEnumValue("shelter")
    SHELTER("shelter"),
    @XmlEnumValue("seats")
    SEATS("seats");
    private final String value;

    ReservedSpaceFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReservedSpaceFacilityEnumeration fromValue(String v) {
        for (ReservedSpaceFacilityEnumeration c: ReservedSpaceFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

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
 * <p>Classe Java per SanitaryFacilityEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="SanitaryFacilityEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="pti23_22"/&gt;
 *     &lt;enumeration value="toilet"/&gt;
 *     &lt;enumeration value="pti23_23"/&gt;
 *     &lt;enumeration value="noToilet"/&gt;
 *     &lt;enumeration value="shower"/&gt;
 *     &lt;enumeration value="wheelchairAcccessToilet"/&gt;
 *     &lt;enumeration value="babyChange"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SanitaryFacilityEnumeration")
@XmlEnum
public enum SanitaryFacilityEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pti23_22")
    PTI_23___22("pti23_22"),
    @XmlEnumValue("toilet")
    TOILET("toilet"),
    @XmlEnumValue("pti23_23")
    PTI_23___23("pti23_23"),
    @XmlEnumValue("noToilet")
    NO_TOILET("noToilet"),
    @XmlEnumValue("shower")
    SHOWER("shower"),
    @XmlEnumValue("wheelchairAcccessToilet")
    WHEELCHAIR_ACCCESS_TOILET("wheelchairAcccessToilet"),
    @XmlEnumValue("babyChange")
    BABY_CHANGE("babyChange");
    private final String value;

    SanitaryFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SanitaryFacilityEnumeration fromValue(String v) {
        for (SanitaryFacilityEnumeration c: SanitaryFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

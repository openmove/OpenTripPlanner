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
 * <p>Classe Java per FacilityStatusEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="FacilityStatusEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="available"/&gt;
 *     &lt;enumeration value="notAvailable"/&gt;
 *     &lt;enumeration value="partiallyAvailable"/&gt;
 *     &lt;enumeration value="added"/&gt;
 *     &lt;enumeration value="removed"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FacilityStatusEnumeration")
@XmlEnum
public enum FacilityStatusEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("available")
    AVAILABLE("available"),
    @XmlEnumValue("notAvailable")
    NOT_AVAILABLE("notAvailable"),
    @XmlEnumValue("partiallyAvailable")
    PARTIALLY_AVAILABLE("partiallyAvailable"),
    @XmlEnumValue("added")
    ADDED("added"),
    @XmlEnumValue("removed")
    REMOVED("removed");
    private final String value;

    FacilityStatusEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FacilityStatusEnumeration fromValue(String v) {
        for (FacilityStatusEnumeration c: FacilityStatusEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

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
 * <p>Classe Java per RemedyTypeEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="RemedyTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="replace"/&gt;
 *     &lt;enumeration value="repair"/&gt;
 *     &lt;enumeration value="remove"/&gt;
 *     &lt;enumeration value="otherRoute"/&gt;
 *     &lt;enumeration value="otherLocation"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RemedyTypeEnumeration")
@XmlEnum
public enum RemedyTypeEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("replace")
    REPLACE("replace"),
    @XmlEnumValue("repair")
    REPAIR("repair"),
    @XmlEnumValue("remove")
    REMOVE("remove"),
    @XmlEnumValue("otherRoute")
    OTHER_ROUTE("otherRoute"),
    @XmlEnumValue("otherLocation")
    OTHER_LOCATION("otherLocation");
    private final String value;

    RemedyTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RemedyTypeEnumeration fromValue(String v) {
        for (RemedyTypeEnumeration c: RemedyTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

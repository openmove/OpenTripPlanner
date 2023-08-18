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
 * <p>Classe Java per FirstOrLastJourneyEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="FirstOrLastJourneyEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="firstServiceOfDay"/&gt;
 *     &lt;enumeration value="otherService"/&gt;
 *     &lt;enumeration value="lastServiceOfDay"/&gt;
 *     &lt;enumeration value="unspecified"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FirstOrLastJourneyEnumeration")
@XmlEnum
public enum FirstOrLastJourneyEnumeration {

    @XmlEnumValue("firstServiceOfDay")
    FIRST_SERVICE_OF_DAY("firstServiceOfDay"),
    @XmlEnumValue("otherService")
    OTHER_SERVICE("otherService"),
    @XmlEnumValue("lastServiceOfDay")
    LAST_SERVICE_OF_DAY("lastServiceOfDay"),
    @XmlEnumValue("unspecified")
    UNSPECIFIED("unspecified");
    private final String value;

    FirstOrLastJourneyEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FirstOrLastJourneyEnumeration fromValue(String v) {
        for (FirstOrLastJourneyEnumeration c: FirstOrLastJourneyEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

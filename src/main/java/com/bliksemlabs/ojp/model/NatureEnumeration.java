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
 * <p>Classe Java per NatureEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="NatureEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="plannedOnly"/&gt;
 *     &lt;enumeration value="unplannedOnly"/&gt;
 *     &lt;enumeration value="both"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NatureEnumeration")
@XmlEnum
public enum NatureEnumeration {

    @XmlEnumValue("plannedOnly")
    PLANNED_ONLY("plannedOnly"),
    @XmlEnumValue("unplannedOnly")
    UNPLANNED_ONLY("unplannedOnly"),
    @XmlEnumValue("both")
    BOTH("both");
    private final String value;

    NatureEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NatureEnumeration fromValue(String v) {
        for (NatureEnumeration c: NatureEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

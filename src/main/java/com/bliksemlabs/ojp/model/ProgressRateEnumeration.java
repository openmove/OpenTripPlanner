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
 * <p>Classe Java per ProgressRateEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ProgressRateEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="noProgress"/&gt;
 *     &lt;enumeration value="slowProgress"/&gt;
 *     &lt;enumeration value="normalProgress"/&gt;
 *     &lt;enumeration value="fastProgress"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ProgressRateEnumeration")
@XmlEnum
public enum ProgressRateEnumeration {

    @XmlEnumValue("noProgress")
    NO_PROGRESS("noProgress"),
    @XmlEnumValue("slowProgress")
    SLOW_PROGRESS("slowProgress"),
    @XmlEnumValue("normalProgress")
    NORMAL_PROGRESS("normalProgress"),
    @XmlEnumValue("fastProgress")
    FAST_PROGRESS("fastProgress"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    ProgressRateEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProgressRateEnumeration fromValue(String v) {
        for (ProgressRateEnumeration c: ProgressRateEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

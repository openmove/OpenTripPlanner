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
 * <p>Classe Java per CallStatusEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="CallStatusEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="onTime"/&gt;
 *     &lt;enumeration value="early"/&gt;
 *     &lt;enumeration value="delayed"/&gt;
 *     &lt;enumeration value="cancelled"/&gt;
 *     &lt;enumeration value="arrived"/&gt;
 *     &lt;enumeration value="departed"/&gt;
 *     &lt;enumeration value="missed"/&gt;
 *     &lt;enumeration value="noReport"/&gt;
 *     &lt;enumeration value="notExpected"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CallStatusEnumeration")
@XmlEnum
public enum CallStatusEnumeration {

    @XmlEnumValue("onTime")
    ON_TIME("onTime"),
    @XmlEnumValue("early")
    EARLY("early"),
    @XmlEnumValue("delayed")
    DELAYED("delayed"),
    @XmlEnumValue("cancelled")
    CANCELLED("cancelled"),
    @XmlEnumValue("arrived")
    ARRIVED("arrived"),
    @XmlEnumValue("departed")
    DEPARTED("departed"),
    @XmlEnumValue("missed")
    MISSED("missed"),
    @XmlEnumValue("noReport")
    NO_REPORT("noReport"),
    @XmlEnumValue("notExpected")
    NOT_EXPECTED("notExpected");
    private final String value;

    CallStatusEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CallStatusEnumeration fromValue(String v) {
        for (CallStatusEnumeration c: CallStatusEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

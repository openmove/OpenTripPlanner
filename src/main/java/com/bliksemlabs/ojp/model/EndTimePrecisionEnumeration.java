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
 * <p>Classe Java per EndTimePrecisionEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="EndTimePrecisionEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="day"/&gt;
 *     &lt;enumeration value="hour"/&gt;
 *     &lt;enumeration value="second"/&gt;
 *     &lt;enumeration value="milliSecond"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EndTimePrecisionEnumeration")
@XmlEnum
public enum EndTimePrecisionEnumeration {

    @XmlEnumValue("day")
    DAY("day"),
    @XmlEnumValue("hour")
    HOUR("hour"),
    @XmlEnumValue("second")
    SECOND("second"),
    @XmlEnumValue("milliSecond")
    MILLI_SECOND("milliSecond");
    private final String value;

    EndTimePrecisionEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EndTimePrecisionEnumeration fromValue(String v) {
        for (EndTimePrecisionEnumeration c: EndTimePrecisionEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

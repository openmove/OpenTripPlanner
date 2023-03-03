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
 * <p>Classe Java per SensitivityEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="SensitivityEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="veryHigh"/&gt;
 *     &lt;enumeration value="high"/&gt;
 *     &lt;enumeration value="medium"/&gt;
 *     &lt;enumeration value="low"/&gt;
 *     &lt;enumeration value="veryLow"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SensitivityEnumeration")
@XmlEnum
public enum SensitivityEnumeration {

    @XmlEnumValue("veryHigh")
    VERY_HIGH("veryHigh"),
    @XmlEnumValue("high")
    HIGH("high"),
    @XmlEnumValue("medium")
    MEDIUM("medium"),
    @XmlEnumValue("low")
    LOW("low"),
    @XmlEnumValue("veryLow")
    VERY_LOW("veryLow");
    private final String value;

    SensitivityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SensitivityEnumeration fromValue(String v) {
        for (SensitivityEnumeration c: SensitivityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

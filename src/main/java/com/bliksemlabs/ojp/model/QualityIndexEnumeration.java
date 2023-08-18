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
 * <p>Classe Java per QualityIndexEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="QualityIndexEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="certain"/&gt;
 *     &lt;enumeration value="veryReliable"/&gt;
 *     &lt;enumeration value="reliable"/&gt;
 *     &lt;enumeration value="probablyReliable"/&gt;
 *     &lt;enumeration value="unconfirmed"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "QualityIndexEnumeration")
@XmlEnum
public enum QualityIndexEnumeration {

    @XmlEnumValue("certain")
    CERTAIN("certain"),
    @XmlEnumValue("veryReliable")
    VERY_RELIABLE("veryReliable"),
    @XmlEnumValue("reliable")
    RELIABLE("reliable"),
    @XmlEnumValue("probablyReliable")
    PROBABLY_RELIABLE("probablyReliable"),
    @XmlEnumValue("unconfirmed")
    UNCONFIRMED("unconfirmed");
    private final String value;

    QualityIndexEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QualityIndexEnumeration fromValue(String v) {
        for (QualityIndexEnumeration c: QualityIndexEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

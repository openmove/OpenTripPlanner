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
 * <p>Classe Java per VerificationStatusEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VerificationStatusEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="pti32_0"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="pti32_1"/&gt;
 *     &lt;enumeration value="unverified"/&gt;
 *     &lt;enumeration value="pti32_255"/&gt;
 *     &lt;enumeration value="verified"/&gt;
 *     &lt;enumeration value="verifiedAsDuplicate"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VerificationStatusEnumeration")
@XmlEnum
public enum VerificationStatusEnumeration {

    @XmlEnumValue("pti32_0")
    PTI_32___0("pti32_0"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pti32_1")
    PTI_32___1("pti32_1"),
    @XmlEnumValue("unverified")
    UNVERIFIED("unverified"),
    @XmlEnumValue("pti32_255")
    PTI_32___255("pti32_255"),
    @XmlEnumValue("verified")
    VERIFIED("verified"),
    @XmlEnumValue("verifiedAsDuplicate")
    VERIFIED_AS_DUPLICATE("verifiedAsDuplicate");
    private final String value;

    VerificationStatusEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VerificationStatusEnumeration fromValue(String v) {
        for (VerificationStatusEnumeration c: VerificationStatusEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

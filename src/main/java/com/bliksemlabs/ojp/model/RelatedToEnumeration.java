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
 * <p>Classe Java per RelatedToEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="RelatedToEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="cause"/&gt;
 *     &lt;enumeration value="effect"/&gt;
 *     &lt;enumeration value="update"/&gt;
 *     &lt;enumeration value="supercedes"/&gt;
 *     &lt;enumeration value="supercededBy"/&gt;
 *     &lt;enumeration value="associated"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RelatedToEnumeration")
@XmlEnum
public enum RelatedToEnumeration {

    @XmlEnumValue("cause")
    CAUSE("cause"),
    @XmlEnumValue("effect")
    EFFECT("effect"),
    @XmlEnumValue("update")
    UPDATE("update"),
    @XmlEnumValue("supercedes")
    SUPERCEDES("supercedes"),
    @XmlEnumValue("supercededBy")
    SUPERCEDED_BY("supercededBy"),
    @XmlEnumValue("associated")
    ASSOCIATED("associated");
    private final String value;

    RelatedToEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RelatedToEnumeration fromValue(String v) {
        for (RelatedToEnumeration c: RelatedToEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

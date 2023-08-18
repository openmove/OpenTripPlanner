//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package de.vdv.ojp;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per MultiPointTypeEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="MultiPointTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="anyPoint"/&gt;
 *     &lt;enumeration value="eachOrigin"/&gt;
 *     &lt;enumeration value="eachDestination"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MultiPointTypeEnumeration")
@XmlEnum
public enum MultiPointTypeEnumeration {

    @XmlEnumValue("anyPoint")
    ANY_POINT("anyPoint"),
    @XmlEnumValue("eachOrigin")
    EACH_ORIGIN("eachOrigin"),
    @XmlEnumValue("eachDestination")
    EACH_DESTINATION("eachDestination");
    private final String value;

    MultiPointTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MultiPointTypeEnumeration fromValue(String v) {
        for (MultiPointTypeEnumeration c: MultiPointTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

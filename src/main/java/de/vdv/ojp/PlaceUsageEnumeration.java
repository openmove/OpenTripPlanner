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
 * <p>Classe Java per PlaceUsageEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="PlaceUsageEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="origin"/&gt;
 *     &lt;enumeration value="via"/&gt;
 *     &lt;enumeration value="destination"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PlaceUsageEnumeration")
@XmlEnum
public enum PlaceUsageEnumeration {

    @XmlEnumValue("origin")
    ORIGIN("origin"),
    @XmlEnumValue("via")
    VIA("via"),
    @XmlEnumValue("destination")
    DESTINATION("destination");
    private final String value;

    PlaceUsageEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PlaceUsageEnumeration fromValue(String v) {
        for (PlaceUsageEnumeration c: PlaceUsageEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

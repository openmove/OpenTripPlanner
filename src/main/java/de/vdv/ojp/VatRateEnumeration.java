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
 * <p>Classe Java per VatRateEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VatRateEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="no"/&gt;
 *     &lt;enumeration value="full"/&gt;
 *     &lt;enumeration value="half"/&gt;
 *     &lt;enumeration value="mixed"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VatRateEnumeration")
@XmlEnum
public enum VatRateEnumeration {

    @XmlEnumValue("no")
    NO("no"),
    @XmlEnumValue("full")
    FULL("full"),
    @XmlEnumValue("half")
    HALF("half"),
    @XmlEnumValue("mixed")
    MIXED("mixed"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    VatRateEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VatRateEnumeration fromValue(String v) {
        for (VatRateEnumeration c: VatRateEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

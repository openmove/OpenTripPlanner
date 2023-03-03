//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package uk.org.ifopt.ifopt;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per InterchangeWeightingEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="InterchangeWeightingEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="noInterchange"/&gt;
 *     &lt;enumeration value="interchangeAllowed"/&gt;
 *     &lt;enumeration value="recommendedInterchange"/&gt;
 *     &lt;enumeration value="preferredInterchange"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InterchangeWeightingEnumeration")
@XmlEnum
public enum InterchangeWeightingEnumeration {

    @XmlEnumValue("noInterchange")
    NO_INTERCHANGE("noInterchange"),
    @XmlEnumValue("interchangeAllowed")
    INTERCHANGE_ALLOWED("interchangeAllowed"),
    @XmlEnumValue("recommendedInterchange")
    RECOMMENDED_INTERCHANGE("recommendedInterchange"),
    @XmlEnumValue("preferredInterchange")
    PREFERRED_INTERCHANGE("preferredInterchange");
    private final String value;

    InterchangeWeightingEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InterchangeWeightingEnumeration fromValue(String v) {
        for (InterchangeWeightingEnumeration c: InterchangeWeightingEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

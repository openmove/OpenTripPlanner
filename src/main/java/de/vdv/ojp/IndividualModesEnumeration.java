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
 * <p>Classe Java per IndividualModesEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="IndividualModesEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="walk"/&gt;
 *     &lt;enumeration value="cycle"/&gt;
 *     &lt;enumeration value="taxi"/&gt;
 *     &lt;enumeration value="self-drive-car"/&gt;
 *     &lt;enumeration value="others-drive-car"/&gt;
 *     &lt;enumeration value="motorcycle"/&gt;
 *     &lt;enumeration value="truck"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IndividualModesEnumeration")
@XmlEnum
public enum IndividualModesEnumeration {

    @XmlEnumValue("walk")
    WALK("walk"),
    @XmlEnumValue("cycle")
    CYCLE("cycle"),
    @XmlEnumValue("taxi")
    TAXI("taxi"),
    @XmlEnumValue("self-drive-car")
    SELF___DRIVE___CAR("self-drive-car"),
    @XmlEnumValue("others-drive-car")
    OTHERS___DRIVE___CAR("others-drive-car"),
    @XmlEnumValue("motorcycle")
    MOTORCYCLE("motorcycle"),
    @XmlEnumValue("truck")
    TRUCK("truck");
    private final String value;

    IndividualModesEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IndividualModesEnumeration fromValue(String v) {
        for (IndividualModesEnumeration c: IndividualModesEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

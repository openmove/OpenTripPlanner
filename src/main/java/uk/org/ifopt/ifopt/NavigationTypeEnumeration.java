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
 * <p>Classe Java per NavigationTypeEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="NavigationTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="hallToQuay"/&gt;
 *     &lt;enumeration value="hallToStreet"/&gt;
 *     &lt;enumeration value="quayToHall"/&gt;
 *     &lt;enumeration value="quayToQuay"/&gt;
 *     &lt;enumeration value="quayToStreet"/&gt;
 *     &lt;enumeration value="streetToHall"/&gt;
 *     &lt;enumeration value="streetToQuay"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NavigationTypeEnumeration")
@XmlEnum
public enum NavigationTypeEnumeration {

    @XmlEnumValue("hallToQuay")
    HALL_TO_QUAY("hallToQuay"),
    @XmlEnumValue("hallToStreet")
    HALL_TO_STREET("hallToStreet"),
    @XmlEnumValue("quayToHall")
    QUAY_TO_HALL("quayToHall"),
    @XmlEnumValue("quayToQuay")
    QUAY_TO_QUAY("quayToQuay"),
    @XmlEnumValue("quayToStreet")
    QUAY_TO_STREET("quayToStreet"),
    @XmlEnumValue("streetToHall")
    STREET_TO_HALL("streetToHall"),
    @XmlEnumValue("streetToQuay")
    STREET_TO_QUAY("streetToQuay"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    NavigationTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NavigationTypeEnumeration fromValue(String v) {
        for (NavigationTypeEnumeration c: NavigationTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

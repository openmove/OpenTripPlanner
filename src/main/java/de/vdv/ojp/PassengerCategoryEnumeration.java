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
 * <p>Classe Java per PassengerCategoryEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="PassengerCategoryEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Adult"/&gt;
 *     &lt;enumeration value="Child"/&gt;
 *     &lt;enumeration value="Senior"/&gt;
 *     &lt;enumeration value="Youth"/&gt;
 *     &lt;enumeration value="Disabled"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PassengerCategoryEnumeration")
@XmlEnum
public enum PassengerCategoryEnumeration {

    @XmlEnumValue("Adult")
    ADULT("Adult"),
    @XmlEnumValue("Child")
    CHILD("Child"),
    @XmlEnumValue("Senior")
    SENIOR("Senior"),
    @XmlEnumValue("Youth")
    YOUTH("Youth"),
    @XmlEnumValue("Disabled")
    DISABLED("Disabled");
    private final String value;

    PassengerCategoryEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PassengerCategoryEnumeration fromValue(String v) {
        for (PassengerCategoryEnumeration c: PassengerCategoryEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

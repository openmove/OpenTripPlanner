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
 * <p>Classe Java per TypeOfFareClassEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeOfFareClassEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="all"/&gt;
 *     &lt;enumeration value="first"/&gt;
 *     &lt;enumeration value="second"/&gt;
 *     &lt;enumeration value="third"/&gt;
 *     &lt;enumeration value="business"/&gt;
 *     &lt;enumeration value="economy"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TypeOfFareClassEnumeration")
@XmlEnum
public enum TypeOfFareClassEnumeration {

    @XmlEnumValue("all")
    ALL("all"),
    @XmlEnumValue("first")
    FIRST("first"),
    @XmlEnumValue("second")
    SECOND("second"),
    @XmlEnumValue("third")
    THIRD("third"),
    @XmlEnumValue("business")
    BUSINESS("business"),
    @XmlEnumValue("economy")
    ECONOMY("economy");
    private final String value;

    TypeOfFareClassEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeOfFareClassEnumeration fromValue(String v) {
        for (TypeOfFareClassEnumeration c: TypeOfFareClassEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

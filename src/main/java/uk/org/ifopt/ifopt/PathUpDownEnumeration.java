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
 * <p>Classe Java per PathUpDownEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="PathUpDownEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="up"/&gt;
 *     &lt;enumeration value="down"/&gt;
 *     &lt;enumeration value="level"/&gt;
 *     &lt;enumeration value="upAndDown"/&gt;
 *     &lt;enumeration value="downAndUp"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PathUpDownEnumeration")
@XmlEnum
public enum PathUpDownEnumeration {

    @XmlEnumValue("up")
    UP("up"),
    @XmlEnumValue("down")
    DOWN("down"),
    @XmlEnumValue("level")
    LEVEL("level"),
    @XmlEnumValue("upAndDown")
    UP_AND_DOWN("upAndDown"),
    @XmlEnumValue("downAndUp")
    DOWN_AND_UP("downAndUp");
    private final String value;

    PathUpDownEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PathUpDownEnumeration fromValue(String v) {
        for (PathUpDownEnumeration c: PathUpDownEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

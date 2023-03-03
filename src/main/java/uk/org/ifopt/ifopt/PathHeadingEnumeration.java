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
 * <p>Classe Java per PathHeadingEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="PathHeadingEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="left"/&gt;
 *     &lt;enumeration value="right"/&gt;
 *     &lt;enumeration value="forward"/&gt;
 *     &lt;enumeration value="back"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PathHeadingEnumeration")
@XmlEnum
public enum PathHeadingEnumeration {

    @XmlEnumValue("left")
    LEFT("left"),
    @XmlEnumValue("right")
    RIGHT("right"),
    @XmlEnumValue("forward")
    FORWARD("forward"),
    @XmlEnumValue("back")
    BACK("back");
    private final String value;

    PathHeadingEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PathHeadingEnumeration fromValue(String v) {
        for (PathHeadingEnumeration c: PathHeadingEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

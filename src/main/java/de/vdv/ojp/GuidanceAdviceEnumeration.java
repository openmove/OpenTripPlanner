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
 * <p>Classe Java per GuidanceAdviceEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="GuidanceAdviceEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="origin"/&gt;
 *     &lt;enumeration value="destination"/&gt;
 *     &lt;enumeration value="continue"/&gt;
 *     &lt;enumeration value="keep"/&gt;
 *     &lt;enumeration value="turn"/&gt;
 *     &lt;enumeration value="leave"/&gt;
 *     &lt;enumeration value="enter"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GuidanceAdviceEnumeration")
@XmlEnum
public enum GuidanceAdviceEnumeration {

    @XmlEnumValue("origin")
    ORIGIN("origin"),
    @XmlEnumValue("destination")
    DESTINATION("destination"),
    @XmlEnumValue("continue")
    CONTINUE("continue"),
    @XmlEnumValue("keep")
    KEEP("keep"),
    @XmlEnumValue("turn")
    TURN("turn"),
    @XmlEnumValue("leave")
    LEAVE("leave"),
    @XmlEnumValue("enter")
    ENTER("enter");
    private final String value;

    GuidanceAdviceEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GuidanceAdviceEnumeration fromValue(String v) {
        for (GuidanceAdviceEnumeration c: GuidanceAdviceEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

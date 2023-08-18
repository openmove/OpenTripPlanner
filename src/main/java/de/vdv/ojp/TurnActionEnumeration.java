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
 * <p>Classe Java per TurnActionEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TurnActionEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="sharp left"/&gt;
 *     &lt;enumeration value="left"/&gt;
 *     &lt;enumeration value="half left"/&gt;
 *     &lt;enumeration value="straight on"/&gt;
 *     &lt;enumeration value="half right"/&gt;
 *     &lt;enumeration value="right"/&gt;
 *     &lt;enumeration value="sharp right"/&gt;
 *     &lt;enumeration value="uturn"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TurnActionEnumeration")
@XmlEnum
public enum TurnActionEnumeration {

    @XmlEnumValue("sharp left")
    SHARP___LEFT("sharp left"),
    @XmlEnumValue("left")
    LEFT("left"),
    @XmlEnumValue("half left")
    HALF___LEFT("half left"),
    @XmlEnumValue("straight on")
    STRAIGHT___ON("straight on"),
    @XmlEnumValue("half right")
    HALF___RIGHT("half right"),
    @XmlEnumValue("right")
    RIGHT("right"),
    @XmlEnumValue("sharp right")
    SHARP___RIGHT("sharp right"),
    @XmlEnumValue("uturn")
    UTURN("uturn");
    private final String value;

    TurnActionEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TurnActionEnumeration fromValue(String v) {
        for (TurnActionEnumeration c: TurnActionEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

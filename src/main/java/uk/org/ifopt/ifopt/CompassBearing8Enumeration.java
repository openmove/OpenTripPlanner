//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package uk.org.ifopt.ifopt;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per CompassBearing8Enumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="CompassBearing8Enumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SW"/&gt;
 *     &lt;enumeration value="SE"/&gt;
 *     &lt;enumeration value="NW"/&gt;
 *     &lt;enumeration value="NE"/&gt;
 *     &lt;enumeration value="W"/&gt;
 *     &lt;enumeration value="E"/&gt;
 *     &lt;enumeration value="S"/&gt;
 *     &lt;enumeration value="N"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CompassBearing8Enumeration")
@XmlEnum
public enum CompassBearing8Enumeration {

    SW,
    SE,
    NW,
    NE,
    W,
    E,
    S,
    N;

    public String value() {
        return name();
    }

    public static CompassBearing8Enumeration fromValue(String v) {
        return valueOf(v);
    }

}

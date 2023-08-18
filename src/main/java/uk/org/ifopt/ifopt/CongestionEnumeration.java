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
 * <p>Classe Java per CongestionEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="CongestionEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="noWaiting"/&gt;
 *     &lt;enumeration value="queue"/&gt;
 *     &lt;enumeration value="crowding"/&gt;
 *     &lt;enumeration value="full"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CongestionEnumeration")
@XmlEnum
public enum CongestionEnumeration {

    @XmlEnumValue("noWaiting")
    NO_WAITING("noWaiting"),
    @XmlEnumValue("queue")
    QUEUE("queue"),
    @XmlEnumValue("crowding")
    CROWDING("crowding"),
    @XmlEnumValue("full")
    FULL("full");
    private final String value;

    CongestionEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CongestionEnumeration fromValue(String v) {
        for (CongestionEnumeration c: CongestionEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

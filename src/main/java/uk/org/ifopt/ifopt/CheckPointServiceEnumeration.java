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
 * <p>Classe Java per CheckPointServiceEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="CheckPointServiceEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="selfserviceMachine"/&gt;
 *     &lt;enumeration value="counterService"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CheckPointServiceEnumeration")
@XmlEnum
public enum CheckPointServiceEnumeration {

    @XmlEnumValue("selfserviceMachine")
    SELFSERVICE_MACHINE("selfserviceMachine"),
    @XmlEnumValue("counterService")
    COUNTER_SERVICE("counterService"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    CheckPointServiceEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CheckPointServiceEnumeration fromValue(String v) {
        for (CheckPointServiceEnumeration c: CheckPointServiceEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

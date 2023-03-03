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
 * <p>Classe Java per VehicleProgressEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VehicleProgressEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Not yet operated"/&gt;
 *     &lt;enumeration value="Operation finished"/&gt;
 *     &lt;enumeration value="At stop"/&gt;
 *     &lt;enumeration value="Between stops"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VehicleProgressEnumeration")
@XmlEnum
public enum VehicleProgressEnumeration {

    @XmlEnumValue("Not yet operated")
    NOT___YET___OPERATED("Not yet operated"),
    @XmlEnumValue("Operation finished")
    OPERATION___FINISHED("Operation finished"),
    @XmlEnumValue("At stop")
    AT___STOP("At stop"),
    @XmlEnumValue("Between stops")
    BETWEEN___STOPS("Between stops");
    private final String value;

    VehicleProgressEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehicleProgressEnumeration fromValue(String v) {
        for (VehicleProgressEnumeration c: VehicleProgressEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

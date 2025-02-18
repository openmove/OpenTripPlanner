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
 * <p>Classe Java per RelationToVehicleEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="RelationToVehicleEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="frontLeft"/&gt;
 *     &lt;enumeration value="frontRight"/&gt;
 *     &lt;enumeration value="backRight"/&gt;
 *     &lt;enumeration value="backRight"/&gt;
 *     &lt;enumeration value="driverLeft"/&gt;
 *     &lt;enumeration value="driverRight"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RelationToVehicleEnumeration")
@XmlEnum
public enum RelationToVehicleEnumeration {

    @XmlEnumValue("frontLeft")
    FRONT_LEFT("frontLeft"),
    @XmlEnumValue("frontRight")
    FRONT_RIGHT("frontRight"),
    @XmlEnumValue("backRight")
    BACK_RIGHT("backRight"),
    @XmlEnumValue("driverLeft")
    DRIVER_LEFT("driverLeft"),
    @XmlEnumValue("driverRight")
    DRIVER_RIGHT("driverRight");
    private final String value;

    RelationToVehicleEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RelationToVehicleEnumeration fromValue(String v) {
        for (RelationToVehicleEnumeration c: RelationToVehicleEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

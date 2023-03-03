//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per InvolvementRolesEnum.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="InvolvementRolesEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="cyclist"/&gt;
 *     &lt;enumeration value="pedestrian"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="vehicleDriver"/&gt;
 *     &lt;enumeration value="vehicleOccupant"/&gt;
 *     &lt;enumeration value="vehiclePassenger"/&gt;
 *     &lt;enumeration value="witness"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InvolvementRolesEnum")
@XmlEnum
public enum InvolvementRolesEnum {

    @XmlEnumValue("cyclist")
    CYCLIST("cyclist"),
    @XmlEnumValue("pedestrian")
    PEDESTRIAN("pedestrian"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("vehicleDriver")
    VEHICLE_DRIVER("vehicleDriver"),
    @XmlEnumValue("vehicleOccupant")
    VEHICLE_OCCUPANT("vehicleOccupant"),
    @XmlEnumValue("vehiclePassenger")
    VEHICLE_PASSENGER("vehiclePassenger"),
    @XmlEnumValue("witness")
    WITNESS("witness");
    private final String value;

    InvolvementRolesEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InvolvementRolesEnum fromValue(String v) {
        for (InvolvementRolesEnum c: InvolvementRolesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

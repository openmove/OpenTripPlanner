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
 * <p>Classe Java per TransferModesEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TransferModesEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="walk"/&gt;
 *     &lt;enumeration value="parkAndRide"/&gt;
 *     &lt;enumeration value="bikeAndRide"/&gt;
 *     &lt;enumeration value="carHire"/&gt;
 *     &lt;enumeration value="bikeHire"/&gt;
 *     &lt;enumeration value="protectedConnection"/&gt;
 *     &lt;enumeration value="guaranteedConnection"/&gt;
 *     &lt;enumeration value="remainInVehicle"/&gt;
 *     &lt;enumeration value="changeWithinVehicle"/&gt;
 *     &lt;enumeration value="checkIn"/&gt;
 *     &lt;enumeration value="checkOut"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransferModesEnumeration")
@XmlEnum
public enum TransferModesEnumeration {

    @XmlEnumValue("walk")
    WALK("walk"),
    @XmlEnumValue("parkAndRide")
    PARK_AND_RIDE("parkAndRide"),
    @XmlEnumValue("bikeAndRide")
    BIKE_AND_RIDE("bikeAndRide"),
    @XmlEnumValue("carHire")
    CAR_HIRE("carHire"),
    @XmlEnumValue("bikeHire")
    BIKE_HIRE("bikeHire"),
    @XmlEnumValue("protectedConnection")
    PROTECTED_CONNECTION("protectedConnection"),
    @XmlEnumValue("guaranteedConnection")
    GUARANTEED_CONNECTION("guaranteedConnection"),
    @XmlEnumValue("remainInVehicle")
    REMAIN_IN_VEHICLE("remainInVehicle"),
    @XmlEnumValue("changeWithinVehicle")
    CHANGE_WITHIN_VEHICLE("changeWithinVehicle"),
    @XmlEnumValue("checkIn")
    CHECK_IN("checkIn"),
    @XmlEnumValue("checkOut")
    CHECK_OUT("checkOut");
    private final String value;

    TransferModesEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransferModesEnumeration fromValue(String v) {
        for (TransferModesEnumeration c: TransferModesEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

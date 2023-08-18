//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package com.bliksemlabs.ojp.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ParkingFacilityEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ParkingFacilityEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="carPark"/&gt;
 *     &lt;enumeration value="parkAndRidePark"/&gt;
 *     &lt;enumeration value="motorcyclePark"/&gt;
 *     &lt;enumeration value="cyclePark"/&gt;
 *     &lt;enumeration value="rentalCarPark"/&gt;
 *     &lt;enumeration value="coachPark"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ParkingFacilityEnumeration")
@XmlEnum
public enum ParkingFacilityEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("carPark")
    CAR_PARK("carPark"),
    @XmlEnumValue("parkAndRidePark")
    PARK_AND_RIDE_PARK("parkAndRidePark"),
    @XmlEnumValue("motorcyclePark")
    MOTORCYCLE_PARK("motorcyclePark"),
    @XmlEnumValue("cyclePark")
    CYCLE_PARK("cyclePark"),
    @XmlEnumValue("rentalCarPark")
    RENTAL_CAR_PARK("rentalCarPark"),
    @XmlEnumValue("coachPark")
    COACH_PARK("coachPark");
    private final String value;

    ParkingFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParkingFacilityEnumeration fromValue(String v) {
        for (ParkingFacilityEnumeration c: ParkingFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

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
 * <p>Classe Java per VehicleModesEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VehicleModesEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="air"/&gt;
 *     &lt;enumeration value="bus"/&gt;
 *     &lt;enumeration value="coach"/&gt;
 *     &lt;enumeration value="ferry"/&gt;
 *     &lt;enumeration value="metro"/&gt;
 *     &lt;enumeration value="rail"/&gt;
 *     &lt;enumeration value="tram"/&gt;
 *     &lt;enumeration value="underground"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VehicleModesEnumeration")
@XmlEnum
public enum VehicleModesEnumeration {

    @XmlEnumValue("air")
    AIR("air"),
    @XmlEnumValue("bus")
    BUS("bus"),
    @XmlEnumValue("coach")
    COACH("coach"),
    @XmlEnumValue("ferry")
    FERRY("ferry"),
    @XmlEnumValue("metro")
    METRO("metro"),
    @XmlEnumValue("rail")
    RAIL("rail"),
    @XmlEnumValue("tram")
    TRAM("tram"),
    @XmlEnumValue("underground")
    UNDERGROUND("underground");
    private final String value;

    VehicleModesEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehicleModesEnumeration fromValue(String v) {
        for (VehicleModesEnumeration c: VehicleModesEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

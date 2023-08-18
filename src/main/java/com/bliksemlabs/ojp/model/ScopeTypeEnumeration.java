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
 * <p>Classe Java per ScopeTypeEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ScopeTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="general"/&gt;
 *     &lt;enumeration value="operator"/&gt;
 *     &lt;enumeration value="network"/&gt;
 *     &lt;enumeration value="route"/&gt;
 *     &lt;enumeration value="line"/&gt;
 *     &lt;enumeration value="place"/&gt;
 *     &lt;enumeration value="stopPlace"/&gt;
 *     &lt;enumeration value="stopPlaceComponent"/&gt;
 *     &lt;enumeration value="stopPoint"/&gt;
 *     &lt;enumeration value="vehicleJourney"/&gt;
 *     &lt;enumeration value="datedVehicleJourney"/&gt;
 *     &lt;enumeration value="connectionLink"/&gt;
 *     &lt;enumeration value="interchange"/&gt;
 *     &lt;enumeration value="allPT"/&gt;
 *     &lt;enumeration value="road"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ScopeTypeEnumeration")
@XmlEnum
public enum ScopeTypeEnumeration {

    @XmlEnumValue("general")
    GENERAL("general"),
    @XmlEnumValue("operator")
    OPERATOR("operator"),
    @XmlEnumValue("network")
    NETWORK("network"),
    @XmlEnumValue("route")
    ROUTE("route"),
    @XmlEnumValue("line")
    LINE("line"),
    @XmlEnumValue("place")
    PLACE("place"),
    @XmlEnumValue("stopPlace")
    STOP_PLACE("stopPlace"),
    @XmlEnumValue("stopPlaceComponent")
    STOP_PLACE_COMPONENT("stopPlaceComponent"),
    @XmlEnumValue("stopPoint")
    STOP_POINT("stopPoint"),
    @XmlEnumValue("vehicleJourney")
    VEHICLE_JOURNEY("vehicleJourney"),
    @XmlEnumValue("datedVehicleJourney")
    DATED_VEHICLE_JOURNEY("datedVehicleJourney"),
    @XmlEnumValue("connectionLink")
    CONNECTION_LINK("connectionLink"),
    @XmlEnumValue("interchange")
    INTERCHANGE("interchange"),
    @XmlEnumValue("allPT")
    ALL_PT("allPT"),
    @XmlEnumValue("road")
    ROAD("road");
    private final String value;

    ScopeTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ScopeTypeEnumeration fromValue(String v) {
        for (ScopeTypeEnumeration c: ScopeTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

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
 * <p>Classe Java per WaterSubmodesOfTransportEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="WaterSubmodesOfTransportEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="pti7_0"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="pti7_1"/&gt;
 *     &lt;enumeration value="internationalCarFerryService"/&gt;
 *     &lt;enumeration value="pti7_2"/&gt;
 *     &lt;enumeration value="nationalCarFerryService"/&gt;
 *     &lt;enumeration value="pti7_3"/&gt;
 *     &lt;enumeration value="regionalCarFerryService"/&gt;
 *     &lt;enumeration value="pti7_4"/&gt;
 *     &lt;enumeration value="localCarFerryService"/&gt;
 *     &lt;enumeration value="pti7_5"/&gt;
 *     &lt;enumeration value="internationalPassengerFerry"/&gt;
 *     &lt;enumeration value="pti7_6"/&gt;
 *     &lt;enumeration value="nationalPassengerFerry"/&gt;
 *     &lt;enumeration value="pti7_7"/&gt;
 *     &lt;enumeration value="regionalPassengerFerry"/&gt;
 *     &lt;enumeration value="pti7_8"/&gt;
 *     &lt;enumeration value="localPassengerFerry"/&gt;
 *     &lt;enumeration value="pti7_9"/&gt;
 *     &lt;enumeration value="postBoat"/&gt;
 *     &lt;enumeration value="pti7_10"/&gt;
 *     &lt;enumeration value="trainFerry"/&gt;
 *     &lt;enumeration value="pti7_11"/&gt;
 *     &lt;enumeration value="roadFerryLink"/&gt;
 *     &lt;enumeration value="pti7_12"/&gt;
 *     &lt;enumeration value="airportBoatLink"/&gt;
 *     &lt;enumeration value="pti7_13"/&gt;
 *     &lt;enumeration value="highSpeedVehicleService"/&gt;
 *     &lt;enumeration value="pti7_14"/&gt;
 *     &lt;enumeration value="highSpeedPassengerService"/&gt;
 *     &lt;enumeration value="pti7_15"/&gt;
 *     &lt;enumeration value="sightseeingService"/&gt;
 *     &lt;enumeration value="pti7_16"/&gt;
 *     &lt;enumeration value="schoolBoat"/&gt;
 *     &lt;enumeration value="pti7_17"/&gt;
 *     &lt;enumeration value="cableFerry"/&gt;
 *     &lt;enumeration value="pti7_18"/&gt;
 *     &lt;enumeration value="riverBus"/&gt;
 *     &lt;enumeration value="pti7_19"/&gt;
 *     &lt;enumeration value="scheduledFerry"/&gt;
 *     &lt;enumeration value="pti7_20"/&gt;
 *     &lt;enumeration value="shuttleFerryService"/&gt;
 *     &lt;enumeration value="pti7_21"/&gt;
 *     &lt;enumeration value="allWaterTransportServices"/&gt;
 *     &lt;enumeration value="pti7_255"/&gt;
 *     &lt;enumeration value="undefinedWaterTransport"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WaterSubmodesOfTransportEnumeration")
@XmlEnum
public enum WaterSubmodesOfTransportEnumeration {

    @XmlEnumValue("pti7_0")
    PTI_7___0("pti7_0"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pti7_1")
    PTI_7___1("pti7_1"),
    @XmlEnumValue("internationalCarFerryService")
    INTERNATIONAL_CAR_FERRY_SERVICE("internationalCarFerryService"),
    @XmlEnumValue("pti7_2")
    PTI_7___2("pti7_2"),
    @XmlEnumValue("nationalCarFerryService")
    NATIONAL_CAR_FERRY_SERVICE("nationalCarFerryService"),
    @XmlEnumValue("pti7_3")
    PTI_7___3("pti7_3"),
    @XmlEnumValue("regionalCarFerryService")
    REGIONAL_CAR_FERRY_SERVICE("regionalCarFerryService"),
    @XmlEnumValue("pti7_4")
    PTI_7___4("pti7_4"),
    @XmlEnumValue("localCarFerryService")
    LOCAL_CAR_FERRY_SERVICE("localCarFerryService"),
    @XmlEnumValue("pti7_5")
    PTI_7___5("pti7_5"),
    @XmlEnumValue("internationalPassengerFerry")
    INTERNATIONAL_PASSENGER_FERRY("internationalPassengerFerry"),
    @XmlEnumValue("pti7_6")
    PTI_7___6("pti7_6"),
    @XmlEnumValue("nationalPassengerFerry")
    NATIONAL_PASSENGER_FERRY("nationalPassengerFerry"),
    @XmlEnumValue("pti7_7")
    PTI_7___7("pti7_7"),
    @XmlEnumValue("regionalPassengerFerry")
    REGIONAL_PASSENGER_FERRY("regionalPassengerFerry"),
    @XmlEnumValue("pti7_8")
    PTI_7___8("pti7_8"),
    @XmlEnumValue("localPassengerFerry")
    LOCAL_PASSENGER_FERRY("localPassengerFerry"),
    @XmlEnumValue("pti7_9")
    PTI_7___9("pti7_9"),
    @XmlEnumValue("postBoat")
    POST_BOAT("postBoat"),
    @XmlEnumValue("pti7_10")
    PTI_7___10("pti7_10"),
    @XmlEnumValue("trainFerry")
    TRAIN_FERRY("trainFerry"),
    @XmlEnumValue("pti7_11")
    PTI_7___11("pti7_11"),
    @XmlEnumValue("roadFerryLink")
    ROAD_FERRY_LINK("roadFerryLink"),
    @XmlEnumValue("pti7_12")
    PTI_7___12("pti7_12"),
    @XmlEnumValue("airportBoatLink")
    AIRPORT_BOAT_LINK("airportBoatLink"),
    @XmlEnumValue("pti7_13")
    PTI_7___13("pti7_13"),
    @XmlEnumValue("highSpeedVehicleService")
    HIGH_SPEED_VEHICLE_SERVICE("highSpeedVehicleService"),
    @XmlEnumValue("pti7_14")
    PTI_7___14("pti7_14"),
    @XmlEnumValue("highSpeedPassengerService")
    HIGH_SPEED_PASSENGER_SERVICE("highSpeedPassengerService"),
    @XmlEnumValue("pti7_15")
    PTI_7___15("pti7_15"),
    @XmlEnumValue("sightseeingService")
    SIGHTSEEING_SERVICE("sightseeingService"),
    @XmlEnumValue("pti7_16")
    PTI_7___16("pti7_16"),
    @XmlEnumValue("schoolBoat")
    SCHOOL_BOAT("schoolBoat"),
    @XmlEnumValue("pti7_17")
    PTI_7___17("pti7_17"),
    @XmlEnumValue("cableFerry")
    CABLE_FERRY("cableFerry"),
    @XmlEnumValue("pti7_18")
    PTI_7___18("pti7_18"),
    @XmlEnumValue("riverBus")
    RIVER_BUS("riverBus"),
    @XmlEnumValue("pti7_19")
    PTI_7___19("pti7_19"),
    @XmlEnumValue("scheduledFerry")
    SCHEDULED_FERRY("scheduledFerry"),
    @XmlEnumValue("pti7_20")
    PTI_7___20("pti7_20"),
    @XmlEnumValue("shuttleFerryService")
    SHUTTLE_FERRY_SERVICE("shuttleFerryService"),
    @XmlEnumValue("pti7_21")
    PTI_7___21("pti7_21"),
    @XmlEnumValue("allWaterTransportServices")
    ALL_WATER_TRANSPORT_SERVICES("allWaterTransportServices"),
    @XmlEnumValue("pti7_255")
    PTI_7___255("pti7_255"),
    @XmlEnumValue("undefinedWaterTransport")
    UNDEFINED_WATER_TRANSPORT("undefinedWaterTransport");
    private final String value;

    WaterSubmodesOfTransportEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WaterSubmodesOfTransportEnumeration fromValue(String v) {
        for (WaterSubmodesOfTransportEnumeration c: WaterSubmodesOfTransportEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

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
 * <p>Classe Java per RailSubmodesOfTransportEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="RailSubmodesOfTransportEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="pti2_0"/&gt;
 *     &lt;enumeration value="loc13_0"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="pti2_1"/&gt;
 *     &lt;enumeration value="highSpeedRailService"/&gt;
 *     &lt;enumeration value="pti2_2"/&gt;
 *     &lt;enumeration value="loc13_3"/&gt;
 *     &lt;enumeration value="longDistanceTrain"/&gt;
 *     &lt;enumeration value="pti2_3"/&gt;
 *     &lt;enumeration value="loc13_2"/&gt;
 *     &lt;enumeration value="interRegionalRailService"/&gt;
 *     &lt;enumeration value="pti2_4"/&gt;
 *     &lt;enumeration value="carTransportRailService"/&gt;
 *     &lt;enumeration value="pti2_5"/&gt;
 *     &lt;enumeration value="sleeperRailService"/&gt;
 *     &lt;enumeration value="pti2_6"/&gt;
 *     &lt;enumeration value="loc13_4"/&gt;
 *     &lt;enumeration value="regionalRail"/&gt;
 *     &lt;enumeration value="pti2_7"/&gt;
 *     &lt;enumeration value="loc13_7"/&gt;
 *     &lt;enumeration value="touristRailway"/&gt;
 *     &lt;enumeration value="pti2_8"/&gt;
 *     &lt;enumeration value="railShuttle"/&gt;
 *     &lt;enumeration value="pti2_9"/&gt;
 *     &lt;enumeration value="loc13_5"/&gt;
 *     &lt;enumeration value="suburbanRailway"/&gt;
 *     &lt;enumeration value="pti2_10"/&gt;
 *     &lt;enumeration value="replacementRailService"/&gt;
 *     &lt;enumeration value="pti2_11"/&gt;
 *     &lt;enumeration value="specialTrainService"/&gt;
 *     &lt;enumeration value="pti2_12"/&gt;
 *     &lt;enumeration value="lorryTransportRailService"/&gt;
 *     &lt;enumeration value="pti2_13"/&gt;
 *     &lt;enumeration value="allRailServices"/&gt;
 *     &lt;enumeration value="pti2_14"/&gt;
 *     &lt;enumeration value="crossCountryRailService"/&gt;
 *     &lt;enumeration value="pti2_15"/&gt;
 *     &lt;enumeration value="vehicleRailTransportService"/&gt;
 *     &lt;enumeration value="pti2_16"/&gt;
 *     &lt;enumeration value="loc13_8"/&gt;
 *     &lt;enumeration value="rackAndPinionRailway"/&gt;
 *     &lt;enumeration value="pti2_17"/&gt;
 *     &lt;enumeration value="additionalTrainService"/&gt;
 *     &lt;enumeration value="pti2_255"/&gt;
 *     &lt;enumeration value="undefined"/&gt;
 *     &lt;enumeration value="loc13_6"/&gt;
 *     &lt;enumeration value="local"/&gt;
 *     &lt;enumeration value="loc13_1"/&gt;
 *     &lt;enumeration value="international"/&gt;
 *     &lt;enumeration value="avg"/&gt;
 *     &lt;enumeration value="ra"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RailSubmodesOfTransportEnumeration")
@XmlEnum
public enum RailSubmodesOfTransportEnumeration {

    @XmlEnumValue("pti2_0")
    PTI_2___0("pti2_0"),
    @XmlEnumValue("loc13_0")
    LOC_13___0("loc13_0"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pti2_1")
    PTI_2___1("pti2_1"),
    @XmlEnumValue("highSpeedRailService")
    HIGH_SPEED_RAIL_SERVICE("highSpeedRailService"),
    @XmlEnumValue("pti2_2")
    PTI_2___2("pti2_2"),
    @XmlEnumValue("loc13_3")
    LOC_13___3("loc13_3"),
    @XmlEnumValue("longDistanceTrain")
    LONG_DISTANCE_TRAIN("longDistanceTrain"),
    @XmlEnumValue("pti2_3")
    PTI_2___3("pti2_3"),
    @XmlEnumValue("loc13_2")
    LOC_13___2("loc13_2"),
    @XmlEnumValue("interRegionalRailService")
    INTER_REGIONAL_RAIL_SERVICE("interRegionalRailService"),
    @XmlEnumValue("pti2_4")
    PTI_2___4("pti2_4"),
    @XmlEnumValue("carTransportRailService")
    CAR_TRANSPORT_RAIL_SERVICE("carTransportRailService"),
    @XmlEnumValue("pti2_5")
    PTI_2___5("pti2_5"),
    @XmlEnumValue("sleeperRailService")
    SLEEPER_RAIL_SERVICE("sleeperRailService"),
    @XmlEnumValue("pti2_6")
    PTI_2___6("pti2_6"),
    @XmlEnumValue("loc13_4")
    LOC_13___4("loc13_4"),
    @XmlEnumValue("regionalRail")
    REGIONAL_RAIL("regionalRail"),
    @XmlEnumValue("pti2_7")
    PTI_2___7("pti2_7"),
    @XmlEnumValue("loc13_7")
    LOC_13___7("loc13_7"),
    @XmlEnumValue("touristRailway")
    TOURIST_RAILWAY("touristRailway"),
    @XmlEnumValue("pti2_8")
    PTI_2___8("pti2_8"),
    @XmlEnumValue("railShuttle")
    RAIL_SHUTTLE("railShuttle"),
    @XmlEnumValue("pti2_9")
    PTI_2___9("pti2_9"),
    @XmlEnumValue("loc13_5")
    LOC_13___5("loc13_5"),
    @XmlEnumValue("suburbanRailway")
    SUBURBAN_RAILWAY("suburbanRailway"),
    @XmlEnumValue("pti2_10")
    PTI_2___10("pti2_10"),
    @XmlEnumValue("replacementRailService")
    REPLACEMENT_RAIL_SERVICE("replacementRailService"),
    @XmlEnumValue("pti2_11")
    PTI_2___11("pti2_11"),
    @XmlEnumValue("specialTrainService")
    SPECIAL_TRAIN_SERVICE("specialTrainService"),
    @XmlEnumValue("pti2_12")
    PTI_2___12("pti2_12"),
    @XmlEnumValue("lorryTransportRailService")
    LORRY_TRANSPORT_RAIL_SERVICE("lorryTransportRailService"),
    @XmlEnumValue("pti2_13")
    PTI_2___13("pti2_13"),
    @XmlEnumValue("allRailServices")
    ALL_RAIL_SERVICES("allRailServices"),
    @XmlEnumValue("pti2_14")
    PTI_2___14("pti2_14"),
    @XmlEnumValue("crossCountryRailService")
    CROSS_COUNTRY_RAIL_SERVICE("crossCountryRailService"),
    @XmlEnumValue("pti2_15")
    PTI_2___15("pti2_15"),
    @XmlEnumValue("vehicleRailTransportService")
    VEHICLE_RAIL_TRANSPORT_SERVICE("vehicleRailTransportService"),
    @XmlEnumValue("pti2_16")
    PTI_2___16("pti2_16"),
    @XmlEnumValue("loc13_8")
    LOC_13___8("loc13_8"),
    @XmlEnumValue("rackAndPinionRailway")
    RACK_AND_PINION_RAILWAY("rackAndPinionRailway"),
    @XmlEnumValue("pti2_17")
    PTI_2___17("pti2_17"),
    @XmlEnumValue("additionalTrainService")
    ADDITIONAL_TRAIN_SERVICE("additionalTrainService"),
    @XmlEnumValue("pti2_255")
    PTI_2___255("pti2_255"),
    @XmlEnumValue("undefined")
    UNDEFINED("undefined"),
    @XmlEnumValue("loc13_6")
    LOC_13___6("loc13_6"),
    @XmlEnumValue("local")
    LOCAL("local"),
    @XmlEnumValue("loc13_1")
    LOC_13___1("loc13_1"),
    @XmlEnumValue("international")
    INTERNATIONAL("international"),
    @XmlEnumValue("avg")
    AVG("avg"),
    @XmlEnumValue("ra")
    RA("ra");
    private final String value;

    RailSubmodesOfTransportEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RailSubmodesOfTransportEnumeration fromValue(String v) {
        for (RailSubmodesOfTransportEnumeration c: RailSubmodesOfTransportEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

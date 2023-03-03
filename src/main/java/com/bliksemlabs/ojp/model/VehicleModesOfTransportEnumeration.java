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
 * <p>Classe Java per VehicleModesOfTransportEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VehicleModesOfTransportEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="pti1_0"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="pti1_1"/&gt;
 *     &lt;enumeration value="railwayService"/&gt;
 *     &lt;enumeration value="rail"/&gt;
 *     &lt;enumeration value="pti1_2"/&gt;
 *     &lt;enumeration value="coachService"/&gt;
 *     &lt;enumeration value="coach"/&gt;
 *     &lt;enumeration value="pti1_3"/&gt;
 *     &lt;enumeration value="suburbanRailwayService"/&gt;
 *     &lt;enumeration value="suburbanRail"/&gt;
 *     &lt;enumeration value="pti1_4"/&gt;
 *     &lt;enumeration value="urbanRailwayService"/&gt;
 *     &lt;enumeration value="urbanRail"/&gt;
 *     &lt;enumeration value="pti1_5"/&gt;
 *     &lt;enumeration value="metroService"/&gt;
 *     &lt;enumeration value="metro"/&gt;
 *     &lt;enumeration value="pti1_6"/&gt;
 *     &lt;enumeration value="undergroundService"/&gt;
 *     &lt;enumeration value="underground"/&gt;
 *     &lt;enumeration value="pti1_7"/&gt;
 *     &lt;enumeration value="busService"/&gt;
 *     &lt;enumeration value="bus"/&gt;
 *     &lt;enumeration value="pti1_8"/&gt;
 *     &lt;enumeration value="trolleyBusService"/&gt;
 *     &lt;enumeration value="trolleyBus"/&gt;
 *     &lt;enumeration value="pti1_9"/&gt;
 *     &lt;enumeration value="tramService"/&gt;
 *     &lt;enumeration value="tram"/&gt;
 *     &lt;enumeration value="pti1_10"/&gt;
 *     &lt;enumeration value="waterTransportService"/&gt;
 *     &lt;enumeration value="waterTransport"/&gt;
 *     &lt;enumeration value="pti1_11"/&gt;
 *     &lt;enumeration value="airService"/&gt;
 *     &lt;enumeration value="air"/&gt;
 *     &lt;enumeration value="pti1_12"/&gt;
 *     &lt;enumeration value="ferryService"/&gt;
 *     &lt;enumeration value="water"/&gt;
 *     &lt;enumeration value="pti1_13"/&gt;
 *     &lt;enumeration value="telecabinService"/&gt;
 *     &lt;enumeration value="telecabin"/&gt;
 *     &lt;enumeration value="pti1_14"/&gt;
 *     &lt;enumeration value="funicularService"/&gt;
 *     &lt;enumeration value="funicular"/&gt;
 *     &lt;enumeration value="pti1_15"/&gt;
 *     &lt;enumeration value="taxiService"/&gt;
 *     &lt;enumeration value="taxi"/&gt;
 *     &lt;enumeration value="pti1_16"/&gt;
 *     &lt;enumeration value="selfDrive"/&gt;
 *     &lt;enumeration value="pti1_17"/&gt;
 *     &lt;enumeration value="allServices"/&gt;
 *     &lt;enumeration value="all"/&gt;
 *     &lt;enumeration value="pti1_18"/&gt;
 *     &lt;enumeration value="allServicesExcept"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VehicleModesOfTransportEnumeration")
@XmlEnum
public enum VehicleModesOfTransportEnumeration {

    @XmlEnumValue("pti1_0")
    PTI_1___0("pti1_0"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pti1_1")
    PTI_1___1("pti1_1"),
    @XmlEnumValue("railwayService")
    RAILWAY_SERVICE("railwayService"),
    @XmlEnumValue("rail")
    RAIL("rail"),
    @XmlEnumValue("pti1_2")
    PTI_1___2("pti1_2"),
    @XmlEnumValue("coachService")
    COACH_SERVICE("coachService"),
    @XmlEnumValue("coach")
    COACH("coach"),
    @XmlEnumValue("pti1_3")
    PTI_1___3("pti1_3"),
    @XmlEnumValue("suburbanRailwayService")
    SUBURBAN_RAILWAY_SERVICE("suburbanRailwayService"),
    @XmlEnumValue("suburbanRail")
    SUBURBAN_RAIL("suburbanRail"),
    @XmlEnumValue("pti1_4")
    PTI_1___4("pti1_4"),
    @XmlEnumValue("urbanRailwayService")
    URBAN_RAILWAY_SERVICE("urbanRailwayService"),
    @XmlEnumValue("urbanRail")
    URBAN_RAIL("urbanRail"),
    @XmlEnumValue("pti1_5")
    PTI_1___5("pti1_5"),
    @XmlEnumValue("metroService")
    METRO_SERVICE("metroService"),
    @XmlEnumValue("metro")
    METRO("metro"),
    @XmlEnumValue("pti1_6")
    PTI_1___6("pti1_6"),
    @XmlEnumValue("undergroundService")
    UNDERGROUND_SERVICE("undergroundService"),
    @XmlEnumValue("underground")
    UNDERGROUND("underground"),
    @XmlEnumValue("pti1_7")
    PTI_1___7("pti1_7"),
    @XmlEnumValue("busService")
    BUS_SERVICE("busService"),
    @XmlEnumValue("bus")
    BUS("bus"),
    @XmlEnumValue("pti1_8")
    PTI_1___8("pti1_8"),
    @XmlEnumValue("trolleyBusService")
    TROLLEY_BUS_SERVICE("trolleyBusService"),
    @XmlEnumValue("trolleyBus")
    TROLLEY_BUS("trolleyBus"),
    @XmlEnumValue("pti1_9")
    PTI_1___9("pti1_9"),
    @XmlEnumValue("tramService")
    TRAM_SERVICE("tramService"),
    @XmlEnumValue("tram")
    TRAM("tram"),
    @XmlEnumValue("pti1_10")
    PTI_1___10("pti1_10"),
    @XmlEnumValue("waterTransportService")
    WATER_TRANSPORT_SERVICE("waterTransportService"),
    @XmlEnumValue("waterTransport")
    WATER_TRANSPORT("waterTransport"),
    @XmlEnumValue("pti1_11")
    PTI_1___11("pti1_11"),
    @XmlEnumValue("airService")
    AIR_SERVICE("airService"),
    @XmlEnumValue("air")
    AIR("air"),
    @XmlEnumValue("pti1_12")
    PTI_1___12("pti1_12"),
    @XmlEnumValue("ferryService")
    FERRY_SERVICE("ferryService"),
    @XmlEnumValue("water")
    WATER("water"),
    @XmlEnumValue("pti1_13")
    PTI_1___13("pti1_13"),
    @XmlEnumValue("telecabinService")
    TELECABIN_SERVICE("telecabinService"),
    @XmlEnumValue("telecabin")
    TELECABIN("telecabin"),
    @XmlEnumValue("pti1_14")
    PTI_1___14("pti1_14"),
    @XmlEnumValue("funicularService")
    FUNICULAR_SERVICE("funicularService"),
    @XmlEnumValue("funicular")
    FUNICULAR("funicular"),
    @XmlEnumValue("pti1_15")
    PTI_1___15("pti1_15"),
    @XmlEnumValue("taxiService")
    TAXI_SERVICE("taxiService"),
    @XmlEnumValue("taxi")
    TAXI("taxi"),
    @XmlEnumValue("pti1_16")
    PTI_1___16("pti1_16"),
    @XmlEnumValue("selfDrive")
    SELF_DRIVE("selfDrive"),
    @XmlEnumValue("pti1_17")
    PTI_1___17("pti1_17"),
    @XmlEnumValue("allServices")
    ALL_SERVICES("allServices"),
    @XmlEnumValue("all")
    ALL("all"),
    @XmlEnumValue("pti1_18")
    PTI_1___18("pti1_18"),
    @XmlEnumValue("allServicesExcept")
    ALL_SERVICES_EXCEPT("allServicesExcept");
    private final String value;

    VehicleModesOfTransportEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehicleModesOfTransportEnumeration fromValue(String v) {
        for (VehicleModesOfTransportEnumeration c: VehicleModesOfTransportEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

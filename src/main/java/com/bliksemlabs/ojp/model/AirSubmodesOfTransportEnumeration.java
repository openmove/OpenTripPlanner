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
 * <p>Classe Java per AirSubmodesOfTransportEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="AirSubmodesOfTransportEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="pti8_0"/&gt;
 *     &lt;enumeration value="loc15_0"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="pti8_1"/&gt;
 *     &lt;enumeration value="loc15_2"/&gt;
 *     &lt;enumeration value="internationalFlight"/&gt;
 *     &lt;enumeration value="pti8_2"/&gt;
 *     &lt;enumeration value="domesticFlight"/&gt;
 *     &lt;enumeration value="pti8_3"/&gt;
 *     &lt;enumeration value="loc15_1"/&gt;
 *     &lt;enumeration value="intercontinentalFlight"/&gt;
 *     &lt;enumeration value="pti8_4"/&gt;
 *     &lt;enumeration value="loc15_4"/&gt;
 *     &lt;enumeration value="domesticScheduledFlight"/&gt;
 *     &lt;enumeration value="pti8_5"/&gt;
 *     &lt;enumeration value="loc15_9"/&gt;
 *     &lt;enumeration value="shuttleFlight"/&gt;
 *     &lt;enumeration value="pti8_6"/&gt;
 *     &lt;enumeration value="loc15_5"/&gt;
 *     &lt;enumeration value="intercontinentalCharterFlight"/&gt;
 *     &lt;enumeration value="pti8_7"/&gt;
 *     &lt;enumeration value="loc15_6"/&gt;
 *     &lt;enumeration value="internationalCharterFlight"/&gt;
 *     &lt;enumeration value="pti8_8"/&gt;
 *     &lt;enumeration value="roundTripCharterFlight"/&gt;
 *     &lt;enumeration value="pti8_9"/&gt;
 *     &lt;enumeration value="loc15_8"/&gt;
 *     &lt;enumeration value="sightseeingFlight"/&gt;
 *     &lt;enumeration value="pti8_10"/&gt;
 *     &lt;enumeration value="loc15_10"/&gt;
 *     &lt;enumeration value="helicopterService"/&gt;
 *     &lt;enumeration value="pti8_11"/&gt;
 *     &lt;enumeration value="loc15_7"/&gt;
 *     &lt;enumeration value="domesticCharterFlight"/&gt;
 *     &lt;enumeration value="pti8_12"/&gt;
 *     &lt;enumeration value="SchengenAreaFlight"/&gt;
 *     &lt;enumeration value="pti8_13"/&gt;
 *     &lt;enumeration value="airshipService"/&gt;
 *     &lt;enumeration value="pti8_14"/&gt;
 *     &lt;enumeration value="allAirServices"/&gt;
 *     &lt;enumeration value="loc14_3"/&gt;
 *     &lt;enumeration value="shortHaulInternationalFlight"/&gt;
 *     &lt;enumeration value="pti8_255"/&gt;
 *     &lt;enumeration value="loc15_255"/&gt;
 *     &lt;enumeration value="undefinedAircraftService"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AirSubmodesOfTransportEnumeration")
@XmlEnum
public enum AirSubmodesOfTransportEnumeration {

    @XmlEnumValue("pti8_0")
    PTI_8___0("pti8_0"),
    @XmlEnumValue("loc15_0")
    LOC_15___0("loc15_0"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pti8_1")
    PTI_8___1("pti8_1"),
    @XmlEnumValue("loc15_2")
    LOC_15___2("loc15_2"),
    @XmlEnumValue("internationalFlight")
    INTERNATIONAL_FLIGHT("internationalFlight"),
    @XmlEnumValue("pti8_2")
    PTI_8___2("pti8_2"),
    @XmlEnumValue("domesticFlight")
    DOMESTIC_FLIGHT("domesticFlight"),
    @XmlEnumValue("pti8_3")
    PTI_8___3("pti8_3"),
    @XmlEnumValue("loc15_1")
    LOC_15___1("loc15_1"),
    @XmlEnumValue("intercontinentalFlight")
    INTERCONTINENTAL_FLIGHT("intercontinentalFlight"),
    @XmlEnumValue("pti8_4")
    PTI_8___4("pti8_4"),
    @XmlEnumValue("loc15_4")
    LOC_15___4("loc15_4"),
    @XmlEnumValue("domesticScheduledFlight")
    DOMESTIC_SCHEDULED_FLIGHT("domesticScheduledFlight"),
    @XmlEnumValue("pti8_5")
    PTI_8___5("pti8_5"),
    @XmlEnumValue("loc15_9")
    LOC_15___9("loc15_9"),
    @XmlEnumValue("shuttleFlight")
    SHUTTLE_FLIGHT("shuttleFlight"),
    @XmlEnumValue("pti8_6")
    PTI_8___6("pti8_6"),
    @XmlEnumValue("loc15_5")
    LOC_15___5("loc15_5"),
    @XmlEnumValue("intercontinentalCharterFlight")
    INTERCONTINENTAL_CHARTER_FLIGHT("intercontinentalCharterFlight"),
    @XmlEnumValue("pti8_7")
    PTI_8___7("pti8_7"),
    @XmlEnumValue("loc15_6")
    LOC_15___6("loc15_6"),
    @XmlEnumValue("internationalCharterFlight")
    INTERNATIONAL_CHARTER_FLIGHT("internationalCharterFlight"),
    @XmlEnumValue("pti8_8")
    PTI_8___8("pti8_8"),
    @XmlEnumValue("roundTripCharterFlight")
    ROUND_TRIP_CHARTER_FLIGHT("roundTripCharterFlight"),
    @XmlEnumValue("pti8_9")
    PTI_8___9("pti8_9"),
    @XmlEnumValue("loc15_8")
    LOC_15___8("loc15_8"),
    @XmlEnumValue("sightseeingFlight")
    SIGHTSEEING_FLIGHT("sightseeingFlight"),
    @XmlEnumValue("pti8_10")
    PTI_8___10("pti8_10"),
    @XmlEnumValue("loc15_10")
    LOC_15___10("loc15_10"),
    @XmlEnumValue("helicopterService")
    HELICOPTER_SERVICE("helicopterService"),
    @XmlEnumValue("pti8_11")
    PTI_8___11("pti8_11"),
    @XmlEnumValue("loc15_7")
    LOC_15___7("loc15_7"),
    @XmlEnumValue("domesticCharterFlight")
    DOMESTIC_CHARTER_FLIGHT("domesticCharterFlight"),
    @XmlEnumValue("pti8_12")
    PTI_8___12("pti8_12"),
    @XmlEnumValue("SchengenAreaFlight")
    SCHENGEN_AREA_FLIGHT("SchengenAreaFlight"),
    @XmlEnumValue("pti8_13")
    PTI_8___13("pti8_13"),
    @XmlEnumValue("airshipService")
    AIRSHIP_SERVICE("airshipService"),
    @XmlEnumValue("pti8_14")
    PTI_8___14("pti8_14"),
    @XmlEnumValue("allAirServices")
    ALL_AIR_SERVICES("allAirServices"),
    @XmlEnumValue("loc14_3")
    LOC_14___3("loc14_3"),
    @XmlEnumValue("shortHaulInternationalFlight")
    SHORT_HAUL_INTERNATIONAL_FLIGHT("shortHaulInternationalFlight"),
    @XmlEnumValue("pti8_255")
    PTI_8___255("pti8_255"),
    @XmlEnumValue("loc15_255")
    LOC_15___255("loc15_255"),
    @XmlEnumValue("undefinedAircraftService")
    UNDEFINED_AIRCRAFT_SERVICE("undefinedAircraftService");
    private final String value;

    AirSubmodesOfTransportEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AirSubmodesOfTransportEnumeration fromValue(String v) {
        for (AirSubmodesOfTransportEnumeration c: AirSubmodesOfTransportEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

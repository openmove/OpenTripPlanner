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
 * <p>Classe Java per EquipmentReasonEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="EquipmentReasonEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="pti21_0"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="pti21_1"/&gt;
 *     &lt;enumeration value="pointsProblem"/&gt;
 *     &lt;enumeration value="pti21_2"/&gt;
 *     &lt;enumeration value="pointsFailure"/&gt;
 *     &lt;enumeration value="pti21_3"/&gt;
 *     &lt;enumeration value="signalProblem"/&gt;
 *     &lt;enumeration value="pti21_3_Alias_1"/&gt;
 *     &lt;enumeration value="trainWarningSystemProblem"/&gt;
 *     &lt;enumeration value="pti21_3_Alias_2"/&gt;
 *     &lt;enumeration value="trackCircuitProblem"/&gt;
 *     &lt;enumeration value="pti21_4"/&gt;
 *     &lt;enumeration value="signalFailure"/&gt;
 *     &lt;enumeration value="pti21_4_Alias_1"/&gt;
 *     &lt;enumeration value="signalAndSwitchFailure"/&gt;
 *     &lt;enumeration value="pti21_5"/&gt;
 *     &lt;enumeration value="derailment"/&gt;
 *     &lt;enumeration value="pti21_6"/&gt;
 *     &lt;enumeration value="engineFailure"/&gt;
 *     &lt;enumeration value="pti21_6_Alias_1"/&gt;
 *     &lt;enumeration value="tractionFailure"/&gt;
 *     &lt;enumeration value="pti21_7"/&gt;
 *     &lt;enumeration value="breakDown"/&gt;
 *     &lt;enumeration value="pti21_8"/&gt;
 *     &lt;enumeration value="technicalProblem"/&gt;
 *     &lt;enumeration value="pti21_8_Alias_1"/&gt;
 *     &lt;enumeration value="brokenRail"/&gt;
 *     &lt;enumeration value="pti21_8_Alias_2"/&gt;
 *     &lt;enumeration value="poorRailConditions"/&gt;
 *     &lt;enumeration value="pti21_8_Alias_3"/&gt;
 *     &lt;enumeration value="wheelImpactLoad"/&gt;
 *     &lt;enumeration value="pti21_8_Alias_4"/&gt;
 *     &lt;enumeration value="lackOfOperationalStock"/&gt;
 *     &lt;enumeration value="pti21_8_Alias_5"/&gt;
 *     &lt;enumeration value="defectiveFireAlarmEquipment"/&gt;
 *     &lt;enumeration value="pti21_8_Alias_6"/&gt;
 *     &lt;enumeration value="defectivePlatformEdgeDoors"/&gt;
 *     &lt;enumeration value="pti21_8_Alias_7"/&gt;
 *     &lt;enumeration value="defectiveCctv"/&gt;
 *     &lt;enumeration value="pti21_8_Alias_8"/&gt;
 *     &lt;enumeration value="defectivePublicAnnouncementSystem"/&gt;
 *     &lt;enumeration value="pti21_8_Alias_9"/&gt;
 *     &lt;enumeration value="ticketingSystemNotAvailable"/&gt;
 *     &lt;enumeration value="pti21_8_Alias_10"/&gt;
 *     &lt;enumeration value="leveCrossingFailure"/&gt;
 *     &lt;enumeration value="pti21_9"/&gt;
 *     &lt;enumeration value="repairWork"/&gt;
 *     &lt;enumeration value="pti21_10"/&gt;
 *     &lt;enumeration value="constructionWork"/&gt;
 *     &lt;enumeration value="pti21_11"/&gt;
 *     &lt;enumeration value="maintenanceWork"/&gt;
 *     &lt;enumeration value="pti21_11_Alias_1"/&gt;
 *     &lt;enumeration value="emergencyEngineeringWork"/&gt;
 *     &lt;enumeration value="pti21_11_Alias_2"/&gt;
 *     &lt;enumeration value="lateFinishToEngineeringWork"/&gt;
 *     &lt;enumeration value="pti21_12"/&gt;
 *     &lt;enumeration value="powerProblem"/&gt;
 *     &lt;enumeration value="pti21_12_Alias_1"/&gt;
 *     &lt;enumeration value="oveheadWireFailure"/&gt;
 *     &lt;enumeration value="pti21_13"/&gt;
 *     &lt;enumeration value="fuelProblem"/&gt;
 *     &lt;enumeration value="pti21_14"/&gt;
 *     &lt;enumeration value="swingBridgeFailure"/&gt;
 *     &lt;enumeration value="pti21_15"/&gt;
 *     &lt;enumeration value="escalatorFailure"/&gt;
 *     &lt;enumeration value="pti21_16"/&gt;
 *     &lt;enumeration value="liftFailure"/&gt;
 *     &lt;enumeration value="pti21_17"/&gt;
 *     &lt;enumeration value="gangwayProblem"/&gt;
 *     &lt;enumeration value="pti21_18"/&gt;
 *     &lt;enumeration value="closedForMaintenance"/&gt;
 *     &lt;enumeration value="pti21_19"/&gt;
 *     &lt;enumeration value="fuelShortage"/&gt;
 *     &lt;enumeration value="pti21_20"/&gt;
 *     &lt;enumeration value="deicingWork"/&gt;
 *     &lt;enumeration value="pti21_21"/&gt;
 *     &lt;enumeration value="wheelProblem"/&gt;
 *     &lt;enumeration value="pti21_21_Alias_1"/&gt;
 *     &lt;enumeration value="slipperyTrack"/&gt;
 *     &lt;enumeration value="pti21_22"/&gt;
 *     &lt;enumeration value="luggageCarouselProblem"/&gt;
 *     &lt;enumeration value="pti21_255"/&gt;
 *     &lt;enumeration value="undefinedEquipmentProblem"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EquipmentReasonEnumeration")
@XmlEnum
public enum EquipmentReasonEnumeration {

    @XmlEnumValue("pti21_0")
    PTI_21___0("pti21_0"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pti21_1")
    PTI_21___1("pti21_1"),
    @XmlEnumValue("pointsProblem")
    POINTS_PROBLEM("pointsProblem"),
    @XmlEnumValue("pti21_2")
    PTI_21___2("pti21_2"),
    @XmlEnumValue("pointsFailure")
    POINTS_FAILURE("pointsFailure"),
    @XmlEnumValue("pti21_3")
    PTI_21___3("pti21_3"),
    @XmlEnumValue("signalProblem")
    SIGNAL_PROBLEM("signalProblem"),
    @XmlEnumValue("pti21_3_Alias_1")
    PTI_21___3___ALIAS___1("pti21_3_Alias_1"),
    @XmlEnumValue("trainWarningSystemProblem")
    TRAIN_WARNING_SYSTEM_PROBLEM("trainWarningSystemProblem"),
    @XmlEnumValue("pti21_3_Alias_2")
    PTI_21___3___ALIAS___2("pti21_3_Alias_2"),
    @XmlEnumValue("trackCircuitProblem")
    TRACK_CIRCUIT_PROBLEM("trackCircuitProblem"),
    @XmlEnumValue("pti21_4")
    PTI_21___4("pti21_4"),
    @XmlEnumValue("signalFailure")
    SIGNAL_FAILURE("signalFailure"),
    @XmlEnumValue("pti21_4_Alias_1")
    PTI_21___4___ALIAS___1("pti21_4_Alias_1"),
    @XmlEnumValue("signalAndSwitchFailure")
    SIGNAL_AND_SWITCH_FAILURE("signalAndSwitchFailure"),
    @XmlEnumValue("pti21_5")
    PTI_21___5("pti21_5"),
    @XmlEnumValue("derailment")
    DERAILMENT("derailment"),
    @XmlEnumValue("pti21_6")
    PTI_21___6("pti21_6"),
    @XmlEnumValue("engineFailure")
    ENGINE_FAILURE("engineFailure"),
    @XmlEnumValue("pti21_6_Alias_1")
    PTI_21___6___ALIAS___1("pti21_6_Alias_1"),
    @XmlEnumValue("tractionFailure")
    TRACTION_FAILURE("tractionFailure"),
    @XmlEnumValue("pti21_7")
    PTI_21___7("pti21_7"),
    @XmlEnumValue("breakDown")
    BREAK_DOWN("breakDown"),
    @XmlEnumValue("pti21_8")
    PTI_21___8("pti21_8"),
    @XmlEnumValue("technicalProblem")
    TECHNICAL_PROBLEM("technicalProblem"),
    @XmlEnumValue("pti21_8_Alias_1")
    PTI_21___8___ALIAS___1("pti21_8_Alias_1"),
    @XmlEnumValue("brokenRail")
    BROKEN_RAIL("brokenRail"),
    @XmlEnumValue("pti21_8_Alias_2")
    PTI_21___8___ALIAS___2("pti21_8_Alias_2"),
    @XmlEnumValue("poorRailConditions")
    POOR_RAIL_CONDITIONS("poorRailConditions"),
    @XmlEnumValue("pti21_8_Alias_3")
    PTI_21___8___ALIAS___3("pti21_8_Alias_3"),
    @XmlEnumValue("wheelImpactLoad")
    WHEEL_IMPACT_LOAD("wheelImpactLoad"),
    @XmlEnumValue("pti21_8_Alias_4")
    PTI_21___8___ALIAS___4("pti21_8_Alias_4"),
    @XmlEnumValue("lackOfOperationalStock")
    LACK_OF_OPERATIONAL_STOCK("lackOfOperationalStock"),
    @XmlEnumValue("pti21_8_Alias_5")
    PTI_21___8___ALIAS___5("pti21_8_Alias_5"),
    @XmlEnumValue("defectiveFireAlarmEquipment")
    DEFECTIVE_FIRE_ALARM_EQUIPMENT("defectiveFireAlarmEquipment"),
    @XmlEnumValue("pti21_8_Alias_6")
    PTI_21___8___ALIAS___6("pti21_8_Alias_6"),
    @XmlEnumValue("defectivePlatformEdgeDoors")
    DEFECTIVE_PLATFORM_EDGE_DOORS("defectivePlatformEdgeDoors"),
    @XmlEnumValue("pti21_8_Alias_7")
    PTI_21___8___ALIAS___7("pti21_8_Alias_7"),
    @XmlEnumValue("defectiveCctv")
    DEFECTIVE_CCTV("defectiveCctv"),
    @XmlEnumValue("pti21_8_Alias_8")
    PTI_21___8___ALIAS___8("pti21_8_Alias_8"),
    @XmlEnumValue("defectivePublicAnnouncementSystem")
    DEFECTIVE_PUBLIC_ANNOUNCEMENT_SYSTEM("defectivePublicAnnouncementSystem"),
    @XmlEnumValue("pti21_8_Alias_9")
    PTI_21___8___ALIAS___9("pti21_8_Alias_9"),
    @XmlEnumValue("ticketingSystemNotAvailable")
    TICKETING_SYSTEM_NOT_AVAILABLE("ticketingSystemNotAvailable"),
    @XmlEnumValue("pti21_8_Alias_10")
    PTI_21___8___ALIAS___10("pti21_8_Alias_10"),
    @XmlEnumValue("leveCrossingFailure")
    LEVE_CROSSING_FAILURE("leveCrossingFailure"),
    @XmlEnumValue("pti21_9")
    PTI_21___9("pti21_9"),
    @XmlEnumValue("repairWork")
    REPAIR_WORK("repairWork"),
    @XmlEnumValue("pti21_10")
    PTI_21___10("pti21_10"),
    @XmlEnumValue("constructionWork")
    CONSTRUCTION_WORK("constructionWork"),
    @XmlEnumValue("pti21_11")
    PTI_21___11("pti21_11"),
    @XmlEnumValue("maintenanceWork")
    MAINTENANCE_WORK("maintenanceWork"),
    @XmlEnumValue("pti21_11_Alias_1")
    PTI_21___11___ALIAS___1("pti21_11_Alias_1"),
    @XmlEnumValue("emergencyEngineeringWork")
    EMERGENCY_ENGINEERING_WORK("emergencyEngineeringWork"),
    @XmlEnumValue("pti21_11_Alias_2")
    PTI_21___11___ALIAS___2("pti21_11_Alias_2"),
    @XmlEnumValue("lateFinishToEngineeringWork")
    LATE_FINISH_TO_ENGINEERING_WORK("lateFinishToEngineeringWork"),
    @XmlEnumValue("pti21_12")
    PTI_21___12("pti21_12"),
    @XmlEnumValue("powerProblem")
    POWER_PROBLEM("powerProblem"),
    @XmlEnumValue("pti21_12_Alias_1")
    PTI_21___12___ALIAS___1("pti21_12_Alias_1"),
    @XmlEnumValue("oveheadWireFailure")
    OVEHEAD_WIRE_FAILURE("oveheadWireFailure"),
    @XmlEnumValue("pti21_13")
    PTI_21___13("pti21_13"),
    @XmlEnumValue("fuelProblem")
    FUEL_PROBLEM("fuelProblem"),
    @XmlEnumValue("pti21_14")
    PTI_21___14("pti21_14"),
    @XmlEnumValue("swingBridgeFailure")
    SWING_BRIDGE_FAILURE("swingBridgeFailure"),
    @XmlEnumValue("pti21_15")
    PTI_21___15("pti21_15"),
    @XmlEnumValue("escalatorFailure")
    ESCALATOR_FAILURE("escalatorFailure"),
    @XmlEnumValue("pti21_16")
    PTI_21___16("pti21_16"),
    @XmlEnumValue("liftFailure")
    LIFT_FAILURE("liftFailure"),
    @XmlEnumValue("pti21_17")
    PTI_21___17("pti21_17"),
    @XmlEnumValue("gangwayProblem")
    GANGWAY_PROBLEM("gangwayProblem"),
    @XmlEnumValue("pti21_18")
    PTI_21___18("pti21_18"),
    @XmlEnumValue("closedForMaintenance")
    CLOSED_FOR_MAINTENANCE("closedForMaintenance"),
    @XmlEnumValue("pti21_19")
    PTI_21___19("pti21_19"),
    @XmlEnumValue("fuelShortage")
    FUEL_SHORTAGE("fuelShortage"),
    @XmlEnumValue("pti21_20")
    PTI_21___20("pti21_20"),
    @XmlEnumValue("deicingWork")
    DEICING_WORK("deicingWork"),
    @XmlEnumValue("pti21_21")
    PTI_21___21("pti21_21"),
    @XmlEnumValue("wheelProblem")
    WHEEL_PROBLEM("wheelProblem"),
    @XmlEnumValue("pti21_21_Alias_1")
    PTI_21___21___ALIAS___1("pti21_21_Alias_1"),
    @XmlEnumValue("slipperyTrack")
    SLIPPERY_TRACK("slipperyTrack"),
    @XmlEnumValue("pti21_22")
    PTI_21___22("pti21_22"),
    @XmlEnumValue("luggageCarouselProblem")
    LUGGAGE_CAROUSEL_PROBLEM("luggageCarouselProblem"),
    @XmlEnumValue("pti21_255")
    PTI_21___255("pti21_255"),
    @XmlEnumValue("undefinedEquipmentProblem")
    UNDEFINED_EQUIPMENT_PROBLEM("undefinedEquipmentProblem");
    private final String value;

    EquipmentReasonEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EquipmentReasonEnumeration fromValue(String v) {
        for (EquipmentReasonEnumeration c: EquipmentReasonEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

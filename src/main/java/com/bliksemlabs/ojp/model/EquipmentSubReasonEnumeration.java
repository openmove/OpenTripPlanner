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
 * <p>Classe Java per EquipmentSubReasonEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="EquipmentSubReasonEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="pointsProblem"/&gt;
 *     &lt;enumeration value="pointsFailure"/&gt;
 *     &lt;enumeration value="signalProblem"/&gt;
 *     &lt;enumeration value="trainWarningSystemProblem"/&gt;
 *     &lt;enumeration value="trackCircuitProblem"/&gt;
 *     &lt;enumeration value="signalFailure"/&gt;
 *     &lt;enumeration value="signalAndSwitchFailure"/&gt;
 *     &lt;enumeration value="derailment"/&gt;
 *     &lt;enumeration value="engineFailure"/&gt;
 *     &lt;enumeration value="tractionFailure"/&gt;
 *     &lt;enumeration value="breakDown"/&gt;
 *     &lt;enumeration value="technicalProblem"/&gt;
 *     &lt;enumeration value="brokenRail"/&gt;
 *     &lt;enumeration value="poorRailConditions"/&gt;
 *     &lt;enumeration value="wheelImpactLoad"/&gt;
 *     &lt;enumeration value="lackOfOperationalStock"/&gt;
 *     &lt;enumeration value="defectiveFireAlarmEquipment"/&gt;
 *     &lt;enumeration value="defectivePlatformEdgeDoors"/&gt;
 *     &lt;enumeration value="defectiveCctv"/&gt;
 *     &lt;enumeration value="defectivePublicAnnouncementSystem"/&gt;
 *     &lt;enumeration value="ticketingSystemNotAvailable"/&gt;
 *     &lt;enumeration value="leveCrossingFailure"/&gt;
 *     &lt;enumeration value="repairWork"/&gt;
 *     &lt;enumeration value="constructionWork"/&gt;
 *     &lt;enumeration value="maintenanceWork"/&gt;
 *     &lt;enumeration value="emergencyEngineeringWork"/&gt;
 *     &lt;enumeration value="lateFinishToEngineeringWork"/&gt;
 *     &lt;enumeration value="powerProblem"/&gt;
 *     &lt;enumeration value="oveheadWireFailure"/&gt;
 *     &lt;enumeration value="fuelProblem"/&gt;
 *     &lt;enumeration value="swingBridgeFailure"/&gt;
 *     &lt;enumeration value="escalatorFailure"/&gt;
 *     &lt;enumeration value="liftFailure"/&gt;
 *     &lt;enumeration value="gangwayProblem"/&gt;
 *     &lt;enumeration value="closedForMaintenance"/&gt;
 *     &lt;enumeration value="fuelShortage"/&gt;
 *     &lt;enumeration value="deicingWork"/&gt;
 *     &lt;enumeration value="wheelProblem"/&gt;
 *     &lt;enumeration value="slipperyTrack"/&gt;
 *     &lt;enumeration value="luggageCarouselProblem"/&gt;
 *     &lt;enumeration value="undefinedEquipmentProblem"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EquipmentSubReasonEnumeration")
@XmlEnum
public enum EquipmentSubReasonEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pointsProblem")
    POINTS_PROBLEM("pointsProblem"),
    @XmlEnumValue("pointsFailure")
    POINTS_FAILURE("pointsFailure"),
    @XmlEnumValue("signalProblem")
    SIGNAL_PROBLEM("signalProblem"),
    @XmlEnumValue("trainWarningSystemProblem")
    TRAIN_WARNING_SYSTEM_PROBLEM("trainWarningSystemProblem"),
    @XmlEnumValue("trackCircuitProblem")
    TRACK_CIRCUIT_PROBLEM("trackCircuitProblem"),
    @XmlEnumValue("signalFailure")
    SIGNAL_FAILURE("signalFailure"),
    @XmlEnumValue("signalAndSwitchFailure")
    SIGNAL_AND_SWITCH_FAILURE("signalAndSwitchFailure"),
    @XmlEnumValue("derailment")
    DERAILMENT("derailment"),
    @XmlEnumValue("engineFailure")
    ENGINE_FAILURE("engineFailure"),
    @XmlEnumValue("tractionFailure")
    TRACTION_FAILURE("tractionFailure"),
    @XmlEnumValue("breakDown")
    BREAK_DOWN("breakDown"),
    @XmlEnumValue("technicalProblem")
    TECHNICAL_PROBLEM("technicalProblem"),
    @XmlEnumValue("brokenRail")
    BROKEN_RAIL("brokenRail"),
    @XmlEnumValue("poorRailConditions")
    POOR_RAIL_CONDITIONS("poorRailConditions"),
    @XmlEnumValue("wheelImpactLoad")
    WHEEL_IMPACT_LOAD("wheelImpactLoad"),
    @XmlEnumValue("lackOfOperationalStock")
    LACK_OF_OPERATIONAL_STOCK("lackOfOperationalStock"),
    @XmlEnumValue("defectiveFireAlarmEquipment")
    DEFECTIVE_FIRE_ALARM_EQUIPMENT("defectiveFireAlarmEquipment"),
    @XmlEnumValue("defectivePlatformEdgeDoors")
    DEFECTIVE_PLATFORM_EDGE_DOORS("defectivePlatformEdgeDoors"),
    @XmlEnumValue("defectiveCctv")
    DEFECTIVE_CCTV("defectiveCctv"),
    @XmlEnumValue("defectivePublicAnnouncementSystem")
    DEFECTIVE_PUBLIC_ANNOUNCEMENT_SYSTEM("defectivePublicAnnouncementSystem"),
    @XmlEnumValue("ticketingSystemNotAvailable")
    TICKETING_SYSTEM_NOT_AVAILABLE("ticketingSystemNotAvailable"),
    @XmlEnumValue("leveCrossingFailure")
    LEVE_CROSSING_FAILURE("leveCrossingFailure"),
    @XmlEnumValue("repairWork")
    REPAIR_WORK("repairWork"),
    @XmlEnumValue("constructionWork")
    CONSTRUCTION_WORK("constructionWork"),
    @XmlEnumValue("maintenanceWork")
    MAINTENANCE_WORK("maintenanceWork"),
    @XmlEnumValue("emergencyEngineeringWork")
    EMERGENCY_ENGINEERING_WORK("emergencyEngineeringWork"),
    @XmlEnumValue("lateFinishToEngineeringWork")
    LATE_FINISH_TO_ENGINEERING_WORK("lateFinishToEngineeringWork"),
    @XmlEnumValue("powerProblem")
    POWER_PROBLEM("powerProblem"),
    @XmlEnumValue("oveheadWireFailure")
    OVEHEAD_WIRE_FAILURE("oveheadWireFailure"),
    @XmlEnumValue("fuelProblem")
    FUEL_PROBLEM("fuelProblem"),
    @XmlEnumValue("swingBridgeFailure")
    SWING_BRIDGE_FAILURE("swingBridgeFailure"),
    @XmlEnumValue("escalatorFailure")
    ESCALATOR_FAILURE("escalatorFailure"),
    @XmlEnumValue("liftFailure")
    LIFT_FAILURE("liftFailure"),
    @XmlEnumValue("gangwayProblem")
    GANGWAY_PROBLEM("gangwayProblem"),
    @XmlEnumValue("closedForMaintenance")
    CLOSED_FOR_MAINTENANCE("closedForMaintenance"),
    @XmlEnumValue("fuelShortage")
    FUEL_SHORTAGE("fuelShortage"),
    @XmlEnumValue("deicingWork")
    DEICING_WORK("deicingWork"),
    @XmlEnumValue("wheelProblem")
    WHEEL_PROBLEM("wheelProblem"),
    @XmlEnumValue("slipperyTrack")
    SLIPPERY_TRACK("slipperyTrack"),
    @XmlEnumValue("luggageCarouselProblem")
    LUGGAGE_CAROUSEL_PROBLEM("luggageCarouselProblem"),
    @XmlEnumValue("undefinedEquipmentProblem")
    UNDEFINED_EQUIPMENT_PROBLEM("undefinedEquipmentProblem");
    private final String value;

    EquipmentSubReasonEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EquipmentSubReasonEnumeration fromValue(String v) {
        for (EquipmentSubReasonEnumeration c: EquipmentSubReasonEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

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
 * <p>Classe Java per MiscellaneousSubReasonEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="MiscellaneousSubReasonEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="previousDisturbances"/&gt;
 *     &lt;enumeration value="incident"/&gt;
 *     &lt;enumeration value="safetyViolation"/&gt;
 *     &lt;enumeration value="nearMiss"/&gt;
 *     &lt;enumeration value="signalPassedAtDanger"/&gt;
 *     &lt;enumeration value="stationOverrun"/&gt;
 *     &lt;enumeration value="trainDoor"/&gt;
 *     &lt;enumeration value="bombExplosion"/&gt;
 *     &lt;enumeration value="securityAlert"/&gt;
 *     &lt;enumeration value="emergencyServicesCall"/&gt;
 *     &lt;enumeration value="policeRequest"/&gt;
 *     &lt;enumeration value="fireBrigadeSafetyChecks"/&gt;
 *     &lt;enumeration value="unattendedBag"/&gt;
 *     &lt;enumeration value="telephonedThreat"/&gt;
 *     &lt;enumeration value="suspectVehicle"/&gt;
 *     &lt;enumeration value="civilEmergency"/&gt;
 *     &lt;enumeration value="airRaid"/&gt;
 *     &lt;enumeration value="sabotage"/&gt;
 *     &lt;enumeration value="bombALert"/&gt;
 *     &lt;enumeration value="attack"/&gt;
 *     &lt;enumeration value="evacuation"/&gt;
 *     &lt;enumeration value="terroristIncident"/&gt;
 *     &lt;enumeration value="gunfireOnRoadway"/&gt;
 *     &lt;enumeration value="explosion"/&gt;
 *     &lt;enumeration value="explosionHazard"/&gt;
 *     &lt;enumeration value="securityIncident"/&gt;
 *     &lt;enumeration value="fireBrigadeOrder"/&gt;
 *     &lt;enumeration value="policeActivity"/&gt;
 *     &lt;enumeration value="fire"/&gt;
 *     &lt;enumeration value="linesideFire"/&gt;
 *     &lt;enumeration value="vandalism"/&gt;
 *     &lt;enumeration value="passengerAction"/&gt;
 *     &lt;enumeration value="staffAssault"/&gt;
 *     &lt;enumeration value="railwayCrime"/&gt;
 *     &lt;enumeration value="theft"/&gt;
 *     &lt;enumeration value="altercation"/&gt;
 *     &lt;enumeration value="illVehicleOccupants"/&gt;
 *     &lt;enumeration value="accident"/&gt;
 *     &lt;enumeration value="fatality"/&gt;
 *     &lt;enumeration value="personUnderTrain"/&gt;
 *     &lt;enumeration value="personHitByTrain"/&gt;
 *     &lt;enumeration value="personIllOnVehicle"/&gt;
 *     &lt;enumeration value="emergencyServices"/&gt;
 *     &lt;enumeration value="collision"/&gt;
 *     &lt;enumeration value="overcrowded"/&gt;
 *     &lt;enumeration value="insufficientDemand"/&gt;
 *     &lt;enumeration value="lightingFailure"/&gt;
 *     &lt;enumeration value="leaderBoardFailure"/&gt;
 *     &lt;enumeration value="serviceIndicatorFailure"/&gt;
 *     &lt;enumeration value="serviceFailure"/&gt;
 *     &lt;enumeration value="operatorCeasedTrading"/&gt;
 *     &lt;enumeration value="operatorSuspended"/&gt;
 *     &lt;enumeration value="congestion"/&gt;
 *     &lt;enumeration value="routeBlockage"/&gt;
 *     &lt;enumeration value="personOnTheLine"/&gt;
 *     &lt;enumeration value="vehicleOnTheLine"/&gt;
 *     &lt;enumeration value="objectOnTheLine"/&gt;
 *     &lt;enumeration value="fallenTreeOnTheLine"/&gt;
 *     &lt;enumeration value="vegetation"/&gt;
 *     &lt;enumeration value="trainStruckAnimal"/&gt;
 *     &lt;enumeration value="trainStruckObject"/&gt;
 *     &lt;enumeration value="levelCrossingIncident"/&gt;
 *     &lt;enumeration value="animalOnTheLine"/&gt;
 *     &lt;enumeration value="routeDiversion"/&gt;
 *     &lt;enumeration value="roadClosed"/&gt;
 *     &lt;enumeration value="roadworks"/&gt;
 *     &lt;enumeration value="sewerageMaintenance"/&gt;
 *     &lt;enumeration value="roadMaintenance"/&gt;
 *     &lt;enumeration value="asphalting"/&gt;
 *     &lt;enumeration value="paving"/&gt;
 *     &lt;enumeration value="specialEvent"/&gt;
 *     &lt;enumeration value="march"/&gt;
 *     &lt;enumeration value="procession"/&gt;
 *     &lt;enumeration value="demonstration"/&gt;
 *     &lt;enumeration value="publicDisturbance"/&gt;
 *     &lt;enumeration value="filterBlockade"/&gt;
 *     &lt;enumeration value="sightseersObstructingAccess"/&gt;
 *     &lt;enumeration value="holiday"/&gt;
 *     &lt;enumeration value="bridgeStrike"/&gt;
 *     &lt;enumeration value="viaductFailure"/&gt;
 *     &lt;enumeration value="overheadObstruction"/&gt;
 *     &lt;enumeration value="undefinedProblem"/&gt;
 *     &lt;enumeration value="problemsAtBorderPost"/&gt;
 *     &lt;enumeration value="problemsAtCustomsPost"/&gt;
 *     &lt;enumeration value="problemsOnLocalRoad"/&gt;
 *     &lt;enumeration value="speedRestrictions"/&gt;
 *     &lt;enumeration value="logisticProblems"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MiscellaneousSubReasonEnumeration")
@XmlEnum
public enum MiscellaneousSubReasonEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("previousDisturbances")
    PREVIOUS_DISTURBANCES("previousDisturbances"),
    @XmlEnumValue("incident")
    INCIDENT("incident"),
    @XmlEnumValue("safetyViolation")
    SAFETY_VIOLATION("safetyViolation"),
    @XmlEnumValue("nearMiss")
    NEAR_MISS("nearMiss"),
    @XmlEnumValue("signalPassedAtDanger")
    SIGNAL_PASSED_AT_DANGER("signalPassedAtDanger"),
    @XmlEnumValue("stationOverrun")
    STATION_OVERRUN("stationOverrun"),
    @XmlEnumValue("trainDoor")
    TRAIN_DOOR("trainDoor"),
    @XmlEnumValue("bombExplosion")
    BOMB_EXPLOSION("bombExplosion"),
    @XmlEnumValue("securityAlert")
    SECURITY_ALERT("securityAlert"),
    @XmlEnumValue("emergencyServicesCall")
    EMERGENCY_SERVICES_CALL("emergencyServicesCall"),
    @XmlEnumValue("policeRequest")
    POLICE_REQUEST("policeRequest"),
    @XmlEnumValue("fireBrigadeSafetyChecks")
    FIRE_BRIGADE_SAFETY_CHECKS("fireBrigadeSafetyChecks"),
    @XmlEnumValue("unattendedBag")
    UNATTENDED_BAG("unattendedBag"),
    @XmlEnumValue("telephonedThreat")
    TELEPHONED_THREAT("telephonedThreat"),
    @XmlEnumValue("suspectVehicle")
    SUSPECT_VEHICLE("suspectVehicle"),
    @XmlEnumValue("civilEmergency")
    CIVIL_EMERGENCY("civilEmergency"),
    @XmlEnumValue("airRaid")
    AIR_RAID("airRaid"),
    @XmlEnumValue("sabotage")
    SABOTAGE("sabotage"),
    @XmlEnumValue("bombALert")
    BOMB_A_LERT("bombALert"),
    @XmlEnumValue("attack")
    ATTACK("attack"),
    @XmlEnumValue("evacuation")
    EVACUATION("evacuation"),
    @XmlEnumValue("terroristIncident")
    TERRORIST_INCIDENT("terroristIncident"),
    @XmlEnumValue("gunfireOnRoadway")
    GUNFIRE_ON_ROADWAY("gunfireOnRoadway"),
    @XmlEnumValue("explosion")
    EXPLOSION("explosion"),
    @XmlEnumValue("explosionHazard")
    EXPLOSION_HAZARD("explosionHazard"),
    @XmlEnumValue("securityIncident")
    SECURITY_INCIDENT("securityIncident"),
    @XmlEnumValue("fireBrigadeOrder")
    FIRE_BRIGADE_ORDER("fireBrigadeOrder"),
    @XmlEnumValue("policeActivity")
    POLICE_ACTIVITY("policeActivity"),
    @XmlEnumValue("fire")
    FIRE("fire"),
    @XmlEnumValue("linesideFire")
    LINESIDE_FIRE("linesideFire"),
    @XmlEnumValue("vandalism")
    VANDALISM("vandalism"),
    @XmlEnumValue("passengerAction")
    PASSENGER_ACTION("passengerAction"),
    @XmlEnumValue("staffAssault")
    STAFF_ASSAULT("staffAssault"),
    @XmlEnumValue("railwayCrime")
    RAILWAY_CRIME("railwayCrime"),
    @XmlEnumValue("theft")
    THEFT("theft"),
    @XmlEnumValue("altercation")
    ALTERCATION("altercation"),
    @XmlEnumValue("illVehicleOccupants")
    ILL_VEHICLE_OCCUPANTS("illVehicleOccupants"),
    @XmlEnumValue("accident")
    ACCIDENT("accident"),
    @XmlEnumValue("fatality")
    FATALITY("fatality"),
    @XmlEnumValue("personUnderTrain")
    PERSON_UNDER_TRAIN("personUnderTrain"),
    @XmlEnumValue("personHitByTrain")
    PERSON_HIT_BY_TRAIN("personHitByTrain"),
    @XmlEnumValue("personIllOnVehicle")
    PERSON_ILL_ON_VEHICLE("personIllOnVehicle"),
    @XmlEnumValue("emergencyServices")
    EMERGENCY_SERVICES("emergencyServices"),
    @XmlEnumValue("collision")
    COLLISION("collision"),
    @XmlEnumValue("overcrowded")
    OVERCROWDED("overcrowded"),
    @XmlEnumValue("insufficientDemand")
    INSUFFICIENT_DEMAND("insufficientDemand"),
    @XmlEnumValue("lightingFailure")
    LIGHTING_FAILURE("lightingFailure"),
    @XmlEnumValue("leaderBoardFailure")
    LEADER_BOARD_FAILURE("leaderBoardFailure"),
    @XmlEnumValue("serviceIndicatorFailure")
    SERVICE_INDICATOR_FAILURE("serviceIndicatorFailure"),
    @XmlEnumValue("serviceFailure")
    SERVICE_FAILURE("serviceFailure"),
    @XmlEnumValue("operatorCeasedTrading")
    OPERATOR_CEASED_TRADING("operatorCeasedTrading"),
    @XmlEnumValue("operatorSuspended")
    OPERATOR_SUSPENDED("operatorSuspended"),
    @XmlEnumValue("congestion")
    CONGESTION("congestion"),
    @XmlEnumValue("routeBlockage")
    ROUTE_BLOCKAGE("routeBlockage"),
    @XmlEnumValue("personOnTheLine")
    PERSON_ON_THE_LINE("personOnTheLine"),
    @XmlEnumValue("vehicleOnTheLine")
    VEHICLE_ON_THE_LINE("vehicleOnTheLine"),
    @XmlEnumValue("objectOnTheLine")
    OBJECT_ON_THE_LINE("objectOnTheLine"),
    @XmlEnumValue("fallenTreeOnTheLine")
    FALLEN_TREE_ON_THE_LINE("fallenTreeOnTheLine"),
    @XmlEnumValue("vegetation")
    VEGETATION("vegetation"),
    @XmlEnumValue("trainStruckAnimal")
    TRAIN_STRUCK_ANIMAL("trainStruckAnimal"),
    @XmlEnumValue("trainStruckObject")
    TRAIN_STRUCK_OBJECT("trainStruckObject"),
    @XmlEnumValue("levelCrossingIncident")
    LEVEL_CROSSING_INCIDENT("levelCrossingIncident"),
    @XmlEnumValue("animalOnTheLine")
    ANIMAL_ON_THE_LINE("animalOnTheLine"),
    @XmlEnumValue("routeDiversion")
    ROUTE_DIVERSION("routeDiversion"),
    @XmlEnumValue("roadClosed")
    ROAD_CLOSED("roadClosed"),
    @XmlEnumValue("roadworks")
    ROADWORKS("roadworks"),
    @XmlEnumValue("sewerageMaintenance")
    SEWERAGE_MAINTENANCE("sewerageMaintenance"),
    @XmlEnumValue("roadMaintenance")
    ROAD_MAINTENANCE("roadMaintenance"),
    @XmlEnumValue("asphalting")
    ASPHALTING("asphalting"),
    @XmlEnumValue("paving")
    PAVING("paving"),
    @XmlEnumValue("specialEvent")
    SPECIAL_EVENT("specialEvent"),
    @XmlEnumValue("march")
    MARCH("march"),
    @XmlEnumValue("procession")
    PROCESSION("procession"),
    @XmlEnumValue("demonstration")
    DEMONSTRATION("demonstration"),
    @XmlEnumValue("publicDisturbance")
    PUBLIC_DISTURBANCE("publicDisturbance"),
    @XmlEnumValue("filterBlockade")
    FILTER_BLOCKADE("filterBlockade"),
    @XmlEnumValue("sightseersObstructingAccess")
    SIGHTSEERS_OBSTRUCTING_ACCESS("sightseersObstructingAccess"),
    @XmlEnumValue("holiday")
    HOLIDAY("holiday"),
    @XmlEnumValue("bridgeStrike")
    BRIDGE_STRIKE("bridgeStrike"),
    @XmlEnumValue("viaductFailure")
    VIADUCT_FAILURE("viaductFailure"),
    @XmlEnumValue("overheadObstruction")
    OVERHEAD_OBSTRUCTION("overheadObstruction"),
    @XmlEnumValue("undefinedProblem")
    UNDEFINED_PROBLEM("undefinedProblem"),
    @XmlEnumValue("problemsAtBorderPost")
    PROBLEMS_AT_BORDER_POST("problemsAtBorderPost"),
    @XmlEnumValue("problemsAtCustomsPost")
    PROBLEMS_AT_CUSTOMS_POST("problemsAtCustomsPost"),
    @XmlEnumValue("problemsOnLocalRoad")
    PROBLEMS_ON_LOCAL_ROAD("problemsOnLocalRoad"),
    @XmlEnumValue("speedRestrictions")
    SPEED_RESTRICTIONS("speedRestrictions"),
    @XmlEnumValue("logisticProblems")
    LOGISTIC_PROBLEMS("logisticProblems");
    private final String value;

    MiscellaneousSubReasonEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MiscellaneousSubReasonEnumeration fromValue(String v) {
        for (MiscellaneousSubReasonEnumeration c: MiscellaneousSubReasonEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

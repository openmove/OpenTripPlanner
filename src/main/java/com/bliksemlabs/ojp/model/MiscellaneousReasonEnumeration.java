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
 * <p>Classe Java per MiscellaneousReasonEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="MiscellaneousReasonEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="pti19_0"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="pti19_0_1"/&gt;
 *     &lt;enumeration value="previousDisturbances"/&gt;
 *     &lt;enumeration value="pti19_1"/&gt;
 *     &lt;enumeration value="incident"/&gt;
 *     &lt;enumeration value="pti19_1_Alias_1"/&gt;
 *     &lt;enumeration value="nearMiss"/&gt;
 *     &lt;enumeration value="pti19_1_Alias_2"/&gt;
 *     &lt;enumeration value="safetyViolation"/&gt;
 *     &lt;enumeration value="pti19_1_Alias_3"/&gt;
 *     &lt;enumeration value="signalPassedAtDanger"/&gt;
 *     &lt;enumeration value="pti19_1_Alias_4"/&gt;
 *     &lt;enumeration value="stationOverrun"/&gt;
 *     &lt;enumeration value="pti19_1_Alias_5"/&gt;
 *     &lt;enumeration value="trainDoor"/&gt;
 *     &lt;enumeration value="pti19_1_Alias_6"/&gt;
 *     &lt;enumeration value="emergencyServicesCall"/&gt;
 *     &lt;enumeration value="pti19_2"/&gt;
 *     &lt;enumeration value="bombExplosion"/&gt;
 *     &lt;enumeration value="pti19_3"/&gt;
 *     &lt;enumeration value="securityAlert"/&gt;
 *     &lt;enumeration value="pti19_3_Alias_1"/&gt;
 *     &lt;enumeration value="policeRequest"/&gt;
 *     &lt;enumeration value="pti19_3_Alias_2"/&gt;
 *     &lt;enumeration value="fireBrigadeSafetyChecks"/&gt;
 *     &lt;enumeration value="pti19_3_Alias_3"/&gt;
 *     &lt;enumeration value="unattendedBag"/&gt;
 *     &lt;enumeration value="pti19_3_Alias_4"/&gt;
 *     &lt;enumeration value="telephonedThreat"/&gt;
 *     &lt;enumeration value="pti19_3_Alias_5"/&gt;
 *     &lt;enumeration value="suspectVehicle"/&gt;
 *     &lt;enumeration value="pti19_3_Alias_6"/&gt;
 *     &lt;enumeration value="civilEmergency"/&gt;
 *     &lt;enumeration value="pti19_3_Alias_7"/&gt;
 *     &lt;enumeration value="airRaid"/&gt;
 *     &lt;enumeration value="pti19_3_Alias_8"/&gt;
 *     &lt;enumeration value="sabotage"/&gt;
 *     &lt;enumeration value="pti19_3_Alias_9"/&gt;
 *     &lt;enumeration value="bombAlert"/&gt;
 *     &lt;enumeration value="pti19_3_Alias_10"/&gt;
 *     &lt;enumeration value="attack"/&gt;
 *     &lt;enumeration value="pti19_3_Alias_11"/&gt;
 *     &lt;enumeration value="evacuation"/&gt;
 *     &lt;enumeration value="pti19_3_Alias_12"/&gt;
 *     &lt;enumeration value="terroristIncident"/&gt;
 *     &lt;enumeration value="pti19_3_Alias_13"/&gt;
 *     &lt;enumeration value="gunfireOnRoadway"/&gt;
 *     &lt;enumeration value="pti19_3_Alias_14"/&gt;
 *     &lt;enumeration value="explosion"/&gt;
 *     &lt;enumeration value="pti19_3_Alias_15"/&gt;
 *     &lt;enumeration value="explosionHazard"/&gt;
 *     &lt;enumeration value="pti19_3_Alias_16"/&gt;
 *     &lt;enumeration value="securityIncident"/&gt;
 *     &lt;enumeration value="pti19_3_Alias_17"/&gt;
 *     &lt;enumeration value="fireBrigadeOrder"/&gt;
 *     &lt;enumeration value="pti19_3_Alias_18"/&gt;
 *     &lt;enumeration value="policeActivity"/&gt;
 *     &lt;enumeration value="pti19_4"/&gt;
 *     &lt;enumeration value="fire"/&gt;
 *     &lt;enumeration value="pti19_4_Alias_1"/&gt;
 *     &lt;enumeration value="linesideFire"/&gt;
 *     &lt;enumeration value="pti19_5"/&gt;
 *     &lt;enumeration value="vandalism"/&gt;
 *     &lt;enumeration value="pti19_5_Alias_1"/&gt;
 *     &lt;enumeration value="passengerAction"/&gt;
 *     &lt;enumeration value="pti19_5_Alias_2"/&gt;
 *     &lt;enumeration value="staffAssault"/&gt;
 *     &lt;enumeration value="pti19_5_Alias_3"/&gt;
 *     &lt;enumeration value="railwayCrime"/&gt;
 *     &lt;enumeration value="pti19_5_Alias_4"/&gt;
 *     &lt;enumeration value="assault"/&gt;
 *     &lt;enumeration value="pti19_5_Alias_5"/&gt;
 *     &lt;enumeration value="theft"/&gt;
 *     &lt;enumeration value="pti19_1_Alias_6"/&gt;
 *     &lt;enumeration value="altercation"/&gt;
 *     &lt;enumeration value="pti19_1_Alias_7"/&gt;
 *     &lt;enumeration value="illVehicleOccupants"/&gt;
 *     &lt;enumeration value="pti19_6"/&gt;
 *     &lt;enumeration value="accident"/&gt;
 *     &lt;enumeration value="pti19_6_Alias_1"/&gt;
 *     &lt;enumeration value="fatality"/&gt;
 *     &lt;enumeration value="pti19_6_Alias_2"/&gt;
 *     &lt;enumeration value="personUnderTrain"/&gt;
 *     &lt;enumeration value="pti19_6_Alias_3"/&gt;
 *     &lt;enumeration value="personHitByTrain"/&gt;
 *     &lt;enumeration value="pti19_6_Alias_4"/&gt;
 *     &lt;enumeration value="personIllOnVehicle"/&gt;
 *     &lt;enumeration value="pti19_6_Alias_5"/&gt;
 *     &lt;enumeration value="emergencyServices"/&gt;
 *     &lt;enumeration value="pti19_6_Alias_6"/&gt;
 *     &lt;enumeration value="collision"/&gt;
 *     &lt;enumeration value="pti19_7"/&gt;
 *     &lt;enumeration value="overcrowded"/&gt;
 *     &lt;enumeration value="pti19_8"/&gt;
 *     &lt;enumeration value="insufficientDemand"/&gt;
 *     &lt;enumeration value="pti19_9"/&gt;
 *     &lt;enumeration value="lightingFailure"/&gt;
 *     &lt;enumeration value="pti19_10"/&gt;
 *     &lt;enumeration value="leaderBoardFailure"/&gt;
 *     &lt;enumeration value="pti19_11"/&gt;
 *     &lt;enumeration value="serviceIndicatorFailure"/&gt;
 *     &lt;enumeration value="pti19_12"/&gt;
 *     &lt;enumeration value="serviceFailure"/&gt;
 *     &lt;enumeration value="pti19_13"/&gt;
 *     &lt;enumeration value="operatorCeasedTrading"/&gt;
 *     &lt;enumeration value="pti19_14"/&gt;
 *     &lt;enumeration value="operatorSuspended"/&gt;
 *     &lt;enumeration value="pti19_15"/&gt;
 *     &lt;enumeration value="congestion"/&gt;
 *     &lt;enumeration value="pti19_16"/&gt;
 *     &lt;enumeration value="routeBlockage"/&gt;
 *     &lt;enumeration value="pti19_17"/&gt;
 *     &lt;enumeration value="personOnTheLine"/&gt;
 *     &lt;enumeration value="pti19_18"/&gt;
 *     &lt;enumeration value="vehicleOnTheLine"/&gt;
 *     &lt;enumeration value="pti19_18_Alias_1"/&gt;
 *     &lt;enumeration value="levelCrossingIncident"/&gt;
 *     &lt;enumeration value="pti19_19"/&gt;
 *     &lt;enumeration value="objectOnTheLine"/&gt;
 *     &lt;enumeration value="pti19_19_Alias_1"/&gt;
 *     &lt;enumeration value="fallenTreeOnTheLine"/&gt;
 *     &lt;enumeration value="pti19_19_Alias_2"/&gt;
 *     &lt;enumeration value="vegetation"/&gt;
 *     &lt;enumeration value="pti19_19_Alias_3"/&gt;
 *     &lt;enumeration value="trainStruckAnimal"/&gt;
 *     &lt;enumeration value="pti19_19_Alias_4"/&gt;
 *     &lt;enumeration value="trainStruckObject"/&gt;
 *     &lt;enumeration value="pti19_20"/&gt;
 *     &lt;enumeration value="animalOnTheLine"/&gt;
 *     &lt;enumeration value="pti19_21"/&gt;
 *     &lt;enumeration value="routeDiversion"/&gt;
 *     &lt;enumeration value="pti19_22"/&gt;
 *     &lt;enumeration value="roadClosed"/&gt;
 *     &lt;enumeration value="pti19_23"/&gt;
 *     &lt;enumeration value="roadworks"/&gt;
 *     &lt;enumeration value="pti19_23_Alias_1"/&gt;
 *     &lt;enumeration value="sewerageMaintenance"/&gt;
 *     &lt;enumeration value="pti19_23_Alias_2"/&gt;
 *     &lt;enumeration value="roadMaintenance"/&gt;
 *     &lt;enumeration value="pti19_23_Alias_3"/&gt;
 *     &lt;enumeration value="asphalting"/&gt;
 *     &lt;enumeration value="pti19_23_Alias_4"/&gt;
 *     &lt;enumeration value="paving"/&gt;
 *     &lt;enumeration value="pti19_24"/&gt;
 *     &lt;enumeration value="specialEvent"/&gt;
 *     &lt;enumeration value="pti19_24_Alias_1"/&gt;
 *     &lt;enumeration value="march"/&gt;
 *     &lt;enumeration value="pti19_24_Alias_2"/&gt;
 *     &lt;enumeration value="procession"/&gt;
 *     &lt;enumeration value="pti19_24_Alias_3"/&gt;
 *     &lt;enumeration value="demonstration"/&gt;
 *     &lt;enumeration value="pti19_24_Alias_4"/&gt;
 *     &lt;enumeration value="publicDisturbance"/&gt;
 *     &lt;enumeration value="pti19_24_Alias_5"/&gt;
 *     &lt;enumeration value="filterBlockade"/&gt;
 *     &lt;enumeration value="pti19_24_Alias_6"/&gt;
 *     &lt;enumeration value="sightseersObstructingAccess"/&gt;
 *     &lt;enumeration value="pti19_24_Alias_7"/&gt;
 *     &lt;enumeration value="holiday"/&gt;
 *     &lt;enumeration value="pti19_25"/&gt;
 *     &lt;enumeration value="bridgeStrike"/&gt;
 *     &lt;enumeration value="pti19_25_Alias_1"/&gt;
 *     &lt;enumeration value="viaductFailure"/&gt;
 *     &lt;enumeration value="pti19_26"/&gt;
 *     &lt;enumeration value="overheadObstruction"/&gt;
 *     &lt;enumeration value="pti19_27"/&gt;
 *     &lt;enumeration value="undefinedProblem"/&gt;
 *     &lt;enumeration value="pti19_15_Alias_1"/&gt;
 *     &lt;enumeration value="problemsAtBorderPost"/&gt;
 *     &lt;enumeration value="pti19_15_Alias_2"/&gt;
 *     &lt;enumeration value="problemsAtCustomsPost"/&gt;
 *     &lt;enumeration value="pti19_15_Alias_3"/&gt;
 *     &lt;enumeration value="speedRestrictions"/&gt;
 *     &lt;enumeration value="pti19_255_Alias_1"/&gt;
 *     &lt;enumeration value="logisticProblems"/&gt;
 *     &lt;enumeration value="pti19_255_Alias_2"/&gt;
 *     &lt;enumeration value="problemsOnLocalRoad"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MiscellaneousReasonEnumeration")
@XmlEnum
public enum MiscellaneousReasonEnumeration {

    @XmlEnumValue("pti19_0")
    PTI_19___0("pti19_0"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pti19_0_1")
    PTI_19___0___1("pti19_0_1"),
    @XmlEnumValue("previousDisturbances")
    PREVIOUS_DISTURBANCES("previousDisturbances"),
    @XmlEnumValue("pti19_1")
    PTI_19___1("pti19_1"),
    @XmlEnumValue("incident")
    INCIDENT("incident"),
    @XmlEnumValue("pti19_1_Alias_1")
    PTI_19___1___ALIAS___1("pti19_1_Alias_1"),
    @XmlEnumValue("nearMiss")
    NEAR_MISS("nearMiss"),
    @XmlEnumValue("pti19_1_Alias_2")
    PTI_19___1___ALIAS___2("pti19_1_Alias_2"),
    @XmlEnumValue("safetyViolation")
    SAFETY_VIOLATION("safetyViolation"),
    @XmlEnumValue("pti19_1_Alias_3")
    PTI_19___1___ALIAS___3("pti19_1_Alias_3"),
    @XmlEnumValue("signalPassedAtDanger")
    SIGNAL_PASSED_AT_DANGER("signalPassedAtDanger"),
    @XmlEnumValue("pti19_1_Alias_4")
    PTI_19___1___ALIAS___4("pti19_1_Alias_4"),
    @XmlEnumValue("stationOverrun")
    STATION_OVERRUN("stationOverrun"),
    @XmlEnumValue("pti19_1_Alias_5")
    PTI_19___1___ALIAS___5("pti19_1_Alias_5"),
    @XmlEnumValue("trainDoor")
    TRAIN_DOOR("trainDoor"),
    @XmlEnumValue("pti19_1_Alias_6")
    PTI_19___1___ALIAS___6("pti19_1_Alias_6"),
    @XmlEnumValue("emergencyServicesCall")
    EMERGENCY_SERVICES_CALL("emergencyServicesCall"),
    @XmlEnumValue("pti19_2")
    PTI_19___2("pti19_2"),
    @XmlEnumValue("bombExplosion")
    BOMB_EXPLOSION("bombExplosion"),
    @XmlEnumValue("pti19_3")
    PTI_19___3("pti19_3"),
    @XmlEnumValue("securityAlert")
    SECURITY_ALERT("securityAlert"),
    @XmlEnumValue("pti19_3_Alias_1")
    PTI_19___3___ALIAS___1("pti19_3_Alias_1"),
    @XmlEnumValue("policeRequest")
    POLICE_REQUEST("policeRequest"),
    @XmlEnumValue("pti19_3_Alias_2")
    PTI_19___3___ALIAS___2("pti19_3_Alias_2"),
    @XmlEnumValue("fireBrigadeSafetyChecks")
    FIRE_BRIGADE_SAFETY_CHECKS("fireBrigadeSafetyChecks"),
    @XmlEnumValue("pti19_3_Alias_3")
    PTI_19___3___ALIAS___3("pti19_3_Alias_3"),
    @XmlEnumValue("unattendedBag")
    UNATTENDED_BAG("unattendedBag"),
    @XmlEnumValue("pti19_3_Alias_4")
    PTI_19___3___ALIAS___4("pti19_3_Alias_4"),
    @XmlEnumValue("telephonedThreat")
    TELEPHONED_THREAT("telephonedThreat"),
    @XmlEnumValue("pti19_3_Alias_5")
    PTI_19___3___ALIAS___5("pti19_3_Alias_5"),
    @XmlEnumValue("suspectVehicle")
    SUSPECT_VEHICLE("suspectVehicle"),
    @XmlEnumValue("pti19_3_Alias_6")
    PTI_19___3___ALIAS___6("pti19_3_Alias_6"),
    @XmlEnumValue("civilEmergency")
    CIVIL_EMERGENCY("civilEmergency"),
    @XmlEnumValue("pti19_3_Alias_7")
    PTI_19___3___ALIAS___7("pti19_3_Alias_7"),
    @XmlEnumValue("airRaid")
    AIR_RAID("airRaid"),
    @XmlEnumValue("pti19_3_Alias_8")
    PTI_19___3___ALIAS___8("pti19_3_Alias_8"),
    @XmlEnumValue("sabotage")
    SABOTAGE("sabotage"),
    @XmlEnumValue("pti19_3_Alias_9")
    PTI_19___3___ALIAS___9("pti19_3_Alias_9"),
    @XmlEnumValue("bombAlert")
    BOMB_ALERT("bombAlert"),
    @XmlEnumValue("pti19_3_Alias_10")
    PTI_19___3___ALIAS___10("pti19_3_Alias_10"),
    @XmlEnumValue("attack")
    ATTACK("attack"),
    @XmlEnumValue("pti19_3_Alias_11")
    PTI_19___3___ALIAS___11("pti19_3_Alias_11"),
    @XmlEnumValue("evacuation")
    EVACUATION("evacuation"),
    @XmlEnumValue("pti19_3_Alias_12")
    PTI_19___3___ALIAS___12("pti19_3_Alias_12"),
    @XmlEnumValue("terroristIncident")
    TERRORIST_INCIDENT("terroristIncident"),
    @XmlEnumValue("pti19_3_Alias_13")
    PTI_19___3___ALIAS___13("pti19_3_Alias_13"),
    @XmlEnumValue("gunfireOnRoadway")
    GUNFIRE_ON_ROADWAY("gunfireOnRoadway"),
    @XmlEnumValue("pti19_3_Alias_14")
    PTI_19___3___ALIAS___14("pti19_3_Alias_14"),
    @XmlEnumValue("explosion")
    EXPLOSION("explosion"),
    @XmlEnumValue("pti19_3_Alias_15")
    PTI_19___3___ALIAS___15("pti19_3_Alias_15"),
    @XmlEnumValue("explosionHazard")
    EXPLOSION_HAZARD("explosionHazard"),
    @XmlEnumValue("pti19_3_Alias_16")
    PTI_19___3___ALIAS___16("pti19_3_Alias_16"),
    @XmlEnumValue("securityIncident")
    SECURITY_INCIDENT("securityIncident"),
    @XmlEnumValue("pti19_3_Alias_17")
    PTI_19___3___ALIAS___17("pti19_3_Alias_17"),
    @XmlEnumValue("fireBrigadeOrder")
    FIRE_BRIGADE_ORDER("fireBrigadeOrder"),
    @XmlEnumValue("pti19_3_Alias_18")
    PTI_19___3___ALIAS___18("pti19_3_Alias_18"),
    @XmlEnumValue("policeActivity")
    POLICE_ACTIVITY("policeActivity"),
    @XmlEnumValue("pti19_4")
    PTI_19___4("pti19_4"),
    @XmlEnumValue("fire")
    FIRE("fire"),
    @XmlEnumValue("pti19_4_Alias_1")
    PTI_19___4___ALIAS___1("pti19_4_Alias_1"),
    @XmlEnumValue("linesideFire")
    LINESIDE_FIRE("linesideFire"),
    @XmlEnumValue("pti19_5")
    PTI_19___5("pti19_5"),
    @XmlEnumValue("vandalism")
    VANDALISM("vandalism"),
    @XmlEnumValue("pti19_5_Alias_1")
    PTI_19___5___ALIAS___1("pti19_5_Alias_1"),
    @XmlEnumValue("passengerAction")
    PASSENGER_ACTION("passengerAction"),
    @XmlEnumValue("pti19_5_Alias_2")
    PTI_19___5___ALIAS___2("pti19_5_Alias_2"),
    @XmlEnumValue("staffAssault")
    STAFF_ASSAULT("staffAssault"),
    @XmlEnumValue("pti19_5_Alias_3")
    PTI_19___5___ALIAS___3("pti19_5_Alias_3"),
    @XmlEnumValue("railwayCrime")
    RAILWAY_CRIME("railwayCrime"),
    @XmlEnumValue("pti19_5_Alias_4")
    PTI_19___5___ALIAS___4("pti19_5_Alias_4"),
    @XmlEnumValue("assault")
    ASSAULT("assault"),
    @XmlEnumValue("pti19_5_Alias_5")
    PTI_19___5___ALIAS___5("pti19_5_Alias_5"),
    @XmlEnumValue("theft")
    THEFT("theft"),
    @XmlEnumValue("altercation")
    ALTERCATION("altercation"),
    @XmlEnumValue("pti19_1_Alias_7")
    PTI_19___1___ALIAS___7("pti19_1_Alias_7"),
    @XmlEnumValue("illVehicleOccupants")
    ILL_VEHICLE_OCCUPANTS("illVehicleOccupants"),
    @XmlEnumValue("pti19_6")
    PTI_19___6("pti19_6"),
    @XmlEnumValue("accident")
    ACCIDENT("accident"),
    @XmlEnumValue("pti19_6_Alias_1")
    PTI_19___6___ALIAS___1("pti19_6_Alias_1"),
    @XmlEnumValue("fatality")
    FATALITY("fatality"),
    @XmlEnumValue("pti19_6_Alias_2")
    PTI_19___6___ALIAS___2("pti19_6_Alias_2"),
    @XmlEnumValue("personUnderTrain")
    PERSON_UNDER_TRAIN("personUnderTrain"),
    @XmlEnumValue("pti19_6_Alias_3")
    PTI_19___6___ALIAS___3("pti19_6_Alias_3"),
    @XmlEnumValue("personHitByTrain")
    PERSON_HIT_BY_TRAIN("personHitByTrain"),
    @XmlEnumValue("pti19_6_Alias_4")
    PTI_19___6___ALIAS___4("pti19_6_Alias_4"),
    @XmlEnumValue("personIllOnVehicle")
    PERSON_ILL_ON_VEHICLE("personIllOnVehicle"),
    @XmlEnumValue("pti19_6_Alias_5")
    PTI_19___6___ALIAS___5("pti19_6_Alias_5"),
    @XmlEnumValue("emergencyServices")
    EMERGENCY_SERVICES("emergencyServices"),
    @XmlEnumValue("pti19_6_Alias_6")
    PTI_19___6___ALIAS___6("pti19_6_Alias_6"),
    @XmlEnumValue("collision")
    COLLISION("collision"),
    @XmlEnumValue("pti19_7")
    PTI_19___7("pti19_7"),
    @XmlEnumValue("overcrowded")
    OVERCROWDED("overcrowded"),
    @XmlEnumValue("pti19_8")
    PTI_19___8("pti19_8"),
    @XmlEnumValue("insufficientDemand")
    INSUFFICIENT_DEMAND("insufficientDemand"),
    @XmlEnumValue("pti19_9")
    PTI_19___9("pti19_9"),
    @XmlEnumValue("lightingFailure")
    LIGHTING_FAILURE("lightingFailure"),
    @XmlEnumValue("pti19_10")
    PTI_19___10("pti19_10"),
    @XmlEnumValue("leaderBoardFailure")
    LEADER_BOARD_FAILURE("leaderBoardFailure"),
    @XmlEnumValue("pti19_11")
    PTI_19___11("pti19_11"),
    @XmlEnumValue("serviceIndicatorFailure")
    SERVICE_INDICATOR_FAILURE("serviceIndicatorFailure"),
    @XmlEnumValue("pti19_12")
    PTI_19___12("pti19_12"),
    @XmlEnumValue("serviceFailure")
    SERVICE_FAILURE("serviceFailure"),
    @XmlEnumValue("pti19_13")
    PTI_19___13("pti19_13"),
    @XmlEnumValue("operatorCeasedTrading")
    OPERATOR_CEASED_TRADING("operatorCeasedTrading"),
    @XmlEnumValue("pti19_14")
    PTI_19___14("pti19_14"),
    @XmlEnumValue("operatorSuspended")
    OPERATOR_SUSPENDED("operatorSuspended"),
    @XmlEnumValue("pti19_15")
    PTI_19___15("pti19_15"),
    @XmlEnumValue("congestion")
    CONGESTION("congestion"),
    @XmlEnumValue("pti19_16")
    PTI_19___16("pti19_16"),
    @XmlEnumValue("routeBlockage")
    ROUTE_BLOCKAGE("routeBlockage"),
    @XmlEnumValue("pti19_17")
    PTI_19___17("pti19_17"),
    @XmlEnumValue("personOnTheLine")
    PERSON_ON_THE_LINE("personOnTheLine"),
    @XmlEnumValue("pti19_18")
    PTI_19___18("pti19_18"),
    @XmlEnumValue("vehicleOnTheLine")
    VEHICLE_ON_THE_LINE("vehicleOnTheLine"),
    @XmlEnumValue("pti19_18_Alias_1")
    PTI_19___18___ALIAS___1("pti19_18_Alias_1"),
    @XmlEnumValue("levelCrossingIncident")
    LEVEL_CROSSING_INCIDENT("levelCrossingIncident"),
    @XmlEnumValue("pti19_19")
    PTI_19___19("pti19_19"),
    @XmlEnumValue("objectOnTheLine")
    OBJECT_ON_THE_LINE("objectOnTheLine"),
    @XmlEnumValue("pti19_19_Alias_1")
    PTI_19___19___ALIAS___1("pti19_19_Alias_1"),
    @XmlEnumValue("fallenTreeOnTheLine")
    FALLEN_TREE_ON_THE_LINE("fallenTreeOnTheLine"),
    @XmlEnumValue("pti19_19_Alias_2")
    PTI_19___19___ALIAS___2("pti19_19_Alias_2"),
    @XmlEnumValue("vegetation")
    VEGETATION("vegetation"),
    @XmlEnumValue("pti19_19_Alias_3")
    PTI_19___19___ALIAS___3("pti19_19_Alias_3"),
    @XmlEnumValue("trainStruckAnimal")
    TRAIN_STRUCK_ANIMAL("trainStruckAnimal"),
    @XmlEnumValue("pti19_19_Alias_4")
    PTI_19___19___ALIAS___4("pti19_19_Alias_4"),
    @XmlEnumValue("trainStruckObject")
    TRAIN_STRUCK_OBJECT("trainStruckObject"),
    @XmlEnumValue("pti19_20")
    PTI_19___20("pti19_20"),
    @XmlEnumValue("animalOnTheLine")
    ANIMAL_ON_THE_LINE("animalOnTheLine"),
    @XmlEnumValue("pti19_21")
    PTI_19___21("pti19_21"),
    @XmlEnumValue("routeDiversion")
    ROUTE_DIVERSION("routeDiversion"),
    @XmlEnumValue("pti19_22")
    PTI_19___22("pti19_22"),
    @XmlEnumValue("roadClosed")
    ROAD_CLOSED("roadClosed"),
    @XmlEnumValue("pti19_23")
    PTI_19___23("pti19_23"),
    @XmlEnumValue("roadworks")
    ROADWORKS("roadworks"),
    @XmlEnumValue("pti19_23_Alias_1")
    PTI_19___23___ALIAS___1("pti19_23_Alias_1"),
    @XmlEnumValue("sewerageMaintenance")
    SEWERAGE_MAINTENANCE("sewerageMaintenance"),
    @XmlEnumValue("pti19_23_Alias_2")
    PTI_19___23___ALIAS___2("pti19_23_Alias_2"),
    @XmlEnumValue("roadMaintenance")
    ROAD_MAINTENANCE("roadMaintenance"),
    @XmlEnumValue("pti19_23_Alias_3")
    PTI_19___23___ALIAS___3("pti19_23_Alias_3"),
    @XmlEnumValue("asphalting")
    ASPHALTING("asphalting"),
    @XmlEnumValue("pti19_23_Alias_4")
    PTI_19___23___ALIAS___4("pti19_23_Alias_4"),
    @XmlEnumValue("paving")
    PAVING("paving"),
    @XmlEnumValue("pti19_24")
    PTI_19___24("pti19_24"),
    @XmlEnumValue("specialEvent")
    SPECIAL_EVENT("specialEvent"),
    @XmlEnumValue("pti19_24_Alias_1")
    PTI_19___24___ALIAS___1("pti19_24_Alias_1"),
    @XmlEnumValue("march")
    MARCH("march"),
    @XmlEnumValue("pti19_24_Alias_2")
    PTI_19___24___ALIAS___2("pti19_24_Alias_2"),
    @XmlEnumValue("procession")
    PROCESSION("procession"),
    @XmlEnumValue("pti19_24_Alias_3")
    PTI_19___24___ALIAS___3("pti19_24_Alias_3"),
    @XmlEnumValue("demonstration")
    DEMONSTRATION("demonstration"),
    @XmlEnumValue("pti19_24_Alias_4")
    PTI_19___24___ALIAS___4("pti19_24_Alias_4"),
    @XmlEnumValue("publicDisturbance")
    PUBLIC_DISTURBANCE("publicDisturbance"),
    @XmlEnumValue("pti19_24_Alias_5")
    PTI_19___24___ALIAS___5("pti19_24_Alias_5"),
    @XmlEnumValue("filterBlockade")
    FILTER_BLOCKADE("filterBlockade"),
    @XmlEnumValue("pti19_24_Alias_6")
    PTI_19___24___ALIAS___6("pti19_24_Alias_6"),
    @XmlEnumValue("sightseersObstructingAccess")
    SIGHTSEERS_OBSTRUCTING_ACCESS("sightseersObstructingAccess"),
    @XmlEnumValue("pti19_24_Alias_7")
    PTI_19___24___ALIAS___7("pti19_24_Alias_7"),
    @XmlEnumValue("holiday")
    HOLIDAY("holiday"),
    @XmlEnumValue("pti19_25")
    PTI_19___25("pti19_25"),
    @XmlEnumValue("bridgeStrike")
    BRIDGE_STRIKE("bridgeStrike"),
    @XmlEnumValue("pti19_25_Alias_1")
    PTI_19___25___ALIAS___1("pti19_25_Alias_1"),
    @XmlEnumValue("viaductFailure")
    VIADUCT_FAILURE("viaductFailure"),
    @XmlEnumValue("pti19_26")
    PTI_19___26("pti19_26"),
    @XmlEnumValue("overheadObstruction")
    OVERHEAD_OBSTRUCTION("overheadObstruction"),
    @XmlEnumValue("pti19_27")
    PTI_19___27("pti19_27"),
    @XmlEnumValue("undefinedProblem")
    UNDEFINED_PROBLEM("undefinedProblem"),
    @XmlEnumValue("pti19_15_Alias_1")
    PTI_19___15___ALIAS___1("pti19_15_Alias_1"),
    @XmlEnumValue("problemsAtBorderPost")
    PROBLEMS_AT_BORDER_POST("problemsAtBorderPost"),
    @XmlEnumValue("pti19_15_Alias_2")
    PTI_19___15___ALIAS___2("pti19_15_Alias_2"),
    @XmlEnumValue("problemsAtCustomsPost")
    PROBLEMS_AT_CUSTOMS_POST("problemsAtCustomsPost"),
    @XmlEnumValue("pti19_15_Alias_3")
    PTI_19___15___ALIAS___3("pti19_15_Alias_3"),
    @XmlEnumValue("speedRestrictions")
    SPEED_RESTRICTIONS("speedRestrictions"),
    @XmlEnumValue("pti19_255_Alias_1")
    PTI_19___255___ALIAS___1("pti19_255_Alias_1"),
    @XmlEnumValue("logisticProblems")
    LOGISTIC_PROBLEMS("logisticProblems"),
    @XmlEnumValue("pti19_255_Alias_2")
    PTI_19___255___ALIAS___2("pti19_255_Alias_2"),
    @XmlEnumValue("problemsOnLocalRoad")
    PROBLEMS_ON_LOCAL_ROAD("problemsOnLocalRoad");
    private final String value;

    MiscellaneousReasonEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MiscellaneousReasonEnumeration fromValue(String v) {
        for (MiscellaneousReasonEnumeration c: MiscellaneousReasonEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

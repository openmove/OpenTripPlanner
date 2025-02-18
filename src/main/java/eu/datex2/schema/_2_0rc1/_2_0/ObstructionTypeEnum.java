//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ObstructionTypeEnum.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ObstructionTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="airCrash"/&gt;
 *     &lt;enumeration value="childrenOnRoadway"/&gt;
 *     &lt;enumeration value="clearanceWork"/&gt;
 *     &lt;enumeration value="craneOperating"/&gt;
 *     &lt;enumeration value="cyclistsOnRoadway"/&gt;
 *     &lt;enumeration value="debris"/&gt;
 *     &lt;enumeration value="explosion"/&gt;
 *     &lt;enumeration value="explosionHazard"/&gt;
 *     &lt;enumeration value="hazardsOnTheRoad"/&gt;
 *     &lt;enumeration value="highSpeedChase"/&gt;
 *     &lt;enumeration value="houseFire"/&gt;
 *     &lt;enumeration value="incident"/&gt;
 *     &lt;enumeration value="industrialAccident"/&gt;
 *     &lt;enumeration value="objectOnTheRoad"/&gt;
 *     &lt;enumeration value="objectsFallingFromMovingVehicle"/&gt;
 *     &lt;enumeration value="obstructionOnTheRoad"/&gt;
 *     &lt;enumeration value="peopleOnRoadway"/&gt;
 *     &lt;enumeration value="railCrash"/&gt;
 *     &lt;enumeration value="recklessDriver"/&gt;
 *     &lt;enumeration value="rescueAndRecoveryWork"/&gt;
 *     &lt;enumeration value="severeFrostDamagedRoadway"/&gt;
 *     &lt;enumeration value="shedLoad"/&gt;
 *     &lt;enumeration value="snowAndIceDebris"/&gt;
 *     &lt;enumeration value="spillageOccurringFromMovingVehicle"/&gt;
 *     &lt;enumeration value="spillageOnTheRoad"/&gt;
 *     &lt;enumeration value="unprotectedAccidentArea"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ObstructionTypeEnum")
@XmlEnum
public enum ObstructionTypeEnum {

    @XmlEnumValue("airCrash")
    AIR_CRASH("airCrash"),
    @XmlEnumValue("childrenOnRoadway")
    CHILDREN_ON_ROADWAY("childrenOnRoadway"),
    @XmlEnumValue("clearanceWork")
    CLEARANCE_WORK("clearanceWork"),
    @XmlEnumValue("craneOperating")
    CRANE_OPERATING("craneOperating"),
    @XmlEnumValue("cyclistsOnRoadway")
    CYCLISTS_ON_ROADWAY("cyclistsOnRoadway"),
    @XmlEnumValue("debris")
    DEBRIS("debris"),
    @XmlEnumValue("explosion")
    EXPLOSION("explosion"),
    @XmlEnumValue("explosionHazard")
    EXPLOSION_HAZARD("explosionHazard"),
    @XmlEnumValue("hazardsOnTheRoad")
    HAZARDS_ON_THE_ROAD("hazardsOnTheRoad"),
    @XmlEnumValue("highSpeedChase")
    HIGH_SPEED_CHASE("highSpeedChase"),
    @XmlEnumValue("houseFire")
    HOUSE_FIRE("houseFire"),
    @XmlEnumValue("incident")
    INCIDENT("incident"),
    @XmlEnumValue("industrialAccident")
    INDUSTRIAL_ACCIDENT("industrialAccident"),
    @XmlEnumValue("objectOnTheRoad")
    OBJECT_ON_THE_ROAD("objectOnTheRoad"),
    @XmlEnumValue("objectsFallingFromMovingVehicle")
    OBJECTS_FALLING_FROM_MOVING_VEHICLE("objectsFallingFromMovingVehicle"),
    @XmlEnumValue("obstructionOnTheRoad")
    OBSTRUCTION_ON_THE_ROAD("obstructionOnTheRoad"),
    @XmlEnumValue("peopleOnRoadway")
    PEOPLE_ON_ROADWAY("peopleOnRoadway"),
    @XmlEnumValue("railCrash")
    RAIL_CRASH("railCrash"),
    @XmlEnumValue("recklessDriver")
    RECKLESS_DRIVER("recklessDriver"),
    @XmlEnumValue("rescueAndRecoveryWork")
    RESCUE_AND_RECOVERY_WORK("rescueAndRecoveryWork"),
    @XmlEnumValue("severeFrostDamagedRoadway")
    SEVERE_FROST_DAMAGED_ROADWAY("severeFrostDamagedRoadway"),
    @XmlEnumValue("shedLoad")
    SHED_LOAD("shedLoad"),
    @XmlEnumValue("snowAndIceDebris")
    SNOW_AND_ICE_DEBRIS("snowAndIceDebris"),
    @XmlEnumValue("spillageOccurringFromMovingVehicle")
    SPILLAGE_OCCURRING_FROM_MOVING_VEHICLE("spillageOccurringFromMovingVehicle"),
    @XmlEnumValue("spillageOnTheRoad")
    SPILLAGE_ON_THE_ROAD("spillageOnTheRoad"),
    @XmlEnumValue("unprotectedAccidentArea")
    UNPROTECTED_ACCIDENT_AREA("unprotectedAccidentArea"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    ObstructionTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ObstructionTypeEnum fromValue(String v) {
        for (ObstructionTypeEnum c: ObstructionTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

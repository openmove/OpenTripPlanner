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
 * <p>Classe Java per AccidentCauseEnum.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="AccidentCauseEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="avoidanceOfObstacles"/&gt;
 *     &lt;enumeration value="driverDistraction"/&gt;
 *     &lt;enumeration value="driverDrugAbuse"/&gt;
 *     &lt;enumeration value="driverIllness"/&gt;
 *     &lt;enumeration value="exceedingSpeedsLimits"/&gt;
 *     &lt;enumeration value="excessAlcohol"/&gt;
 *     &lt;enumeration value="excessiveDriverTiredness"/&gt;
 *     &lt;enumeration value="impermissibleManoeuvre"/&gt;
 *     &lt;enumeration value="limitedVisibility"/&gt;
 *     &lt;enumeration value="notKeepingASafeDistance"/&gt;
 *     &lt;enumeration value="onTheWrongSideOfTheRoad"/&gt;
 *     &lt;enumeration value="pedestrianInRoad"/&gt;
 *     &lt;enumeration value="poorLaneAdherence"/&gt;
 *     &lt;enumeration value="poorMergeEntryOrExitJudgement"/&gt;
 *     &lt;enumeration value="poorRoadSurfaceCondition"/&gt;
 *     &lt;enumeration value="poorSurfaceAdherence"/&gt;
 *     &lt;enumeration value="undisclosed"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="vehicleFailure"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AccidentCauseEnum")
@XmlEnum
public enum AccidentCauseEnum {

    @XmlEnumValue("avoidanceOfObstacles")
    AVOIDANCE_OF_OBSTACLES("avoidanceOfObstacles"),
    @XmlEnumValue("driverDistraction")
    DRIVER_DISTRACTION("driverDistraction"),
    @XmlEnumValue("driverDrugAbuse")
    DRIVER_DRUG_ABUSE("driverDrugAbuse"),
    @XmlEnumValue("driverIllness")
    DRIVER_ILLNESS("driverIllness"),
    @XmlEnumValue("exceedingSpeedsLimits")
    EXCEEDING_SPEEDS_LIMITS("exceedingSpeedsLimits"),
    @XmlEnumValue("excessAlcohol")
    EXCESS_ALCOHOL("excessAlcohol"),
    @XmlEnumValue("excessiveDriverTiredness")
    EXCESSIVE_DRIVER_TIREDNESS("excessiveDriverTiredness"),
    @XmlEnumValue("impermissibleManoeuvre")
    IMPERMISSIBLE_MANOEUVRE("impermissibleManoeuvre"),
    @XmlEnumValue("limitedVisibility")
    LIMITED_VISIBILITY("limitedVisibility"),
    @XmlEnumValue("notKeepingASafeDistance")
    NOT_KEEPING_A_SAFE_DISTANCE("notKeepingASafeDistance"),
    @XmlEnumValue("onTheWrongSideOfTheRoad")
    ON_THE_WRONG_SIDE_OF_THE_ROAD("onTheWrongSideOfTheRoad"),
    @XmlEnumValue("pedestrianInRoad")
    PEDESTRIAN_IN_ROAD("pedestrianInRoad"),
    @XmlEnumValue("poorLaneAdherence")
    POOR_LANE_ADHERENCE("poorLaneAdherence"),
    @XmlEnumValue("poorMergeEntryOrExitJudgement")
    POOR_MERGE_ENTRY_OR_EXIT_JUDGEMENT("poorMergeEntryOrExitJudgement"),
    @XmlEnumValue("poorRoadSurfaceCondition")
    POOR_ROAD_SURFACE_CONDITION("poorRoadSurfaceCondition"),
    @XmlEnumValue("poorSurfaceAdherence")
    POOR_SURFACE_ADHERENCE("poorSurfaceAdherence"),
    @XmlEnumValue("undisclosed")
    UNDISCLOSED("undisclosed"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("vehicleFailure")
    VEHICLE_FAILURE("vehicleFailure"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    AccidentCauseEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccidentCauseEnum fromValue(String v) {
        for (AccidentCauseEnum c: AccidentCauseEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

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
 * <p>Classe Java per SourceTypeEnum.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="SourceTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="automobileClubPatrol"/&gt;
 *     &lt;enumeration value="cameraObservation"/&gt;
 *     &lt;enumeration value="freightVehicleOperator"/&gt;
 *     &lt;enumeration value="inductionLoopMonitoringStation"/&gt;
 *     &lt;enumeration value="infraredMonitoringStation"/&gt;
 *     &lt;enumeration value="microwaveMonitoringStation"/&gt;
 *     &lt;enumeration value="mobileTelephoneCaller"/&gt;
 *     &lt;enumeration value="nonPoliceEmergencyServicePatrol"/&gt;
 *     &lt;enumeration value="otherInformation"/&gt;
 *     &lt;enumeration value="otherOfficialVehicle"/&gt;
 *     &lt;enumeration value="policePatrol"/&gt;
 *     &lt;enumeration value="privateBreakdownService"/&gt;
 *     &lt;enumeration value="publicAndPrivateUtilities"/&gt;
 *     &lt;enumeration value="registeredMotoristObserver"/&gt;
 *     &lt;enumeration value="roadAuthorities"/&gt;
 *     &lt;enumeration value="roadOperatorPatrol"/&gt;
 *     &lt;enumeration value="roadsideTelephoneCaller"/&gt;
 *     &lt;enumeration value="spotterAircraft"/&gt;
 *     &lt;enumeration value="trafficMonitoringStation"/&gt;
 *     &lt;enumeration value="transitOperator"/&gt;
 *     &lt;enumeration value="vehicleProbeMeasurement"/&gt;
 *     &lt;enumeration value="videoProcessingMonitoringStation"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SourceTypeEnum")
@XmlEnum
public enum SourceTypeEnum {

    @XmlEnumValue("automobileClubPatrol")
    AUTOMOBILE_CLUB_PATROL("automobileClubPatrol"),
    @XmlEnumValue("cameraObservation")
    CAMERA_OBSERVATION("cameraObservation"),
    @XmlEnumValue("freightVehicleOperator")
    FREIGHT_VEHICLE_OPERATOR("freightVehicleOperator"),
    @XmlEnumValue("inductionLoopMonitoringStation")
    INDUCTION_LOOP_MONITORING_STATION("inductionLoopMonitoringStation"),
    @XmlEnumValue("infraredMonitoringStation")
    INFRARED_MONITORING_STATION("infraredMonitoringStation"),
    @XmlEnumValue("microwaveMonitoringStation")
    MICROWAVE_MONITORING_STATION("microwaveMonitoringStation"),
    @XmlEnumValue("mobileTelephoneCaller")
    MOBILE_TELEPHONE_CALLER("mobileTelephoneCaller"),
    @XmlEnumValue("nonPoliceEmergencyServicePatrol")
    NON_POLICE_EMERGENCY_SERVICE_PATROL("nonPoliceEmergencyServicePatrol"),
    @XmlEnumValue("otherInformation")
    OTHER_INFORMATION("otherInformation"),
    @XmlEnumValue("otherOfficialVehicle")
    OTHER_OFFICIAL_VEHICLE("otherOfficialVehicle"),
    @XmlEnumValue("policePatrol")
    POLICE_PATROL("policePatrol"),
    @XmlEnumValue("privateBreakdownService")
    PRIVATE_BREAKDOWN_SERVICE("privateBreakdownService"),
    @XmlEnumValue("publicAndPrivateUtilities")
    PUBLIC_AND_PRIVATE_UTILITIES("publicAndPrivateUtilities"),
    @XmlEnumValue("registeredMotoristObserver")
    REGISTERED_MOTORIST_OBSERVER("registeredMotoristObserver"),
    @XmlEnumValue("roadAuthorities")
    ROAD_AUTHORITIES("roadAuthorities"),
    @XmlEnumValue("roadOperatorPatrol")
    ROAD_OPERATOR_PATROL("roadOperatorPatrol"),
    @XmlEnumValue("roadsideTelephoneCaller")
    ROADSIDE_TELEPHONE_CALLER("roadsideTelephoneCaller"),
    @XmlEnumValue("spotterAircraft")
    SPOTTER_AIRCRAFT("spotterAircraft"),
    @XmlEnumValue("trafficMonitoringStation")
    TRAFFIC_MONITORING_STATION("trafficMonitoringStation"),
    @XmlEnumValue("transitOperator")
    TRANSIT_OPERATOR("transitOperator"),
    @XmlEnumValue("vehicleProbeMeasurement")
    VEHICLE_PROBE_MEASUREMENT("vehicleProbeMeasurement"),
    @XmlEnumValue("videoProcessingMonitoringStation")
    VIDEO_PROCESSING_MONITORING_STATION("videoProcessingMonitoringStation");
    private final String value;

    SourceTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SourceTypeEnum fromValue(String v) {
        for (SourceTypeEnum c: SourceTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

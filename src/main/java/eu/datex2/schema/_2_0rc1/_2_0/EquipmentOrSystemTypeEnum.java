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
 * <p>Classe Java per EquipmentOrSystemTypeEnum.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="EquipmentOrSystemTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="automatedTollSystem"/&gt;
 *     &lt;enumeration value="emergencyRoadsideTelephones"/&gt;
 *     &lt;enumeration value="galleryLights"/&gt;
 *     &lt;enumeration value="laneControlSigns"/&gt;
 *     &lt;enumeration value="levelCrossing"/&gt;
 *     &lt;enumeration value="matrixSigns"/&gt;
 *     &lt;enumeration value="rampControls"/&gt;
 *     &lt;enumeration value="roadsideCommunicationsSystem"/&gt;
 *     &lt;enumeration value="roadsidePowerSystem"/&gt;
 *     &lt;enumeration value="speedControlSigns"/&gt;
 *     &lt;enumeration value="streetLighting"/&gt;
 *     &lt;enumeration value="temporaryTrafficLights"/&gt;
 *     &lt;enumeration value="tollGates"/&gt;
 *     &lt;enumeration value="trafficLightSets"/&gt;
 *     &lt;enumeration value="trafficSignals"/&gt;
 *     &lt;enumeration value="tunnelLights"/&gt;
 *     &lt;enumeration value="tunnelVentilation"/&gt;
 *     &lt;enumeration value="variableMessageSigns"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EquipmentOrSystemTypeEnum")
@XmlEnum
public enum EquipmentOrSystemTypeEnum {

    @XmlEnumValue("automatedTollSystem")
    AUTOMATED_TOLL_SYSTEM("automatedTollSystem"),
    @XmlEnumValue("emergencyRoadsideTelephones")
    EMERGENCY_ROADSIDE_TELEPHONES("emergencyRoadsideTelephones"),
    @XmlEnumValue("galleryLights")
    GALLERY_LIGHTS("galleryLights"),
    @XmlEnumValue("laneControlSigns")
    LANE_CONTROL_SIGNS("laneControlSigns"),
    @XmlEnumValue("levelCrossing")
    LEVEL_CROSSING("levelCrossing"),
    @XmlEnumValue("matrixSigns")
    MATRIX_SIGNS("matrixSigns"),
    @XmlEnumValue("rampControls")
    RAMP_CONTROLS("rampControls"),
    @XmlEnumValue("roadsideCommunicationsSystem")
    ROADSIDE_COMMUNICATIONS_SYSTEM("roadsideCommunicationsSystem"),
    @XmlEnumValue("roadsidePowerSystem")
    ROADSIDE_POWER_SYSTEM("roadsidePowerSystem"),
    @XmlEnumValue("speedControlSigns")
    SPEED_CONTROL_SIGNS("speedControlSigns"),
    @XmlEnumValue("streetLighting")
    STREET_LIGHTING("streetLighting"),
    @XmlEnumValue("temporaryTrafficLights")
    TEMPORARY_TRAFFIC_LIGHTS("temporaryTrafficLights"),
    @XmlEnumValue("tollGates")
    TOLL_GATES("tollGates"),
    @XmlEnumValue("trafficLightSets")
    TRAFFIC_LIGHT_SETS("trafficLightSets"),
    @XmlEnumValue("trafficSignals")
    TRAFFIC_SIGNALS("trafficSignals"),
    @XmlEnumValue("tunnelLights")
    TUNNEL_LIGHTS("tunnelLights"),
    @XmlEnumValue("tunnelVentilation")
    TUNNEL_VENTILATION("tunnelVentilation"),
    @XmlEnumValue("variableMessageSigns")
    VARIABLE_MESSAGE_SIGNS("variableMessageSigns"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    EquipmentOrSystemTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EquipmentOrSystemTypeEnum fromValue(String v) {
        for (EquipmentOrSystemTypeEnum c: EquipmentOrSystemTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

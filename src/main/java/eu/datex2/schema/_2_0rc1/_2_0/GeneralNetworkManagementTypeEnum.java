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
 * <p>Classe Java per GeneralNetworkManagementTypeEnum.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="GeneralNetworkManagementTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="bridgeSwingInOperation"/&gt;
 *     &lt;enumeration value="convoyService"/&gt;
 *     &lt;enumeration value="obstacleSignalling"/&gt;
 *     &lt;enumeration value="rampMeteringInOperation"/&gt;
 *     &lt;enumeration value="temporaryTrafficLights"/&gt;
 *     &lt;enumeration value="tollGatesOpen"/&gt;
 *     &lt;enumeration value="trafficBeingManuallyDirected"/&gt;
 *     &lt;enumeration value="trafficHeld"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GeneralNetworkManagementTypeEnum")
@XmlEnum
public enum GeneralNetworkManagementTypeEnum {

    @XmlEnumValue("bridgeSwingInOperation")
    BRIDGE_SWING_IN_OPERATION("bridgeSwingInOperation"),
    @XmlEnumValue("convoyService")
    CONVOY_SERVICE("convoyService"),
    @XmlEnumValue("obstacleSignalling")
    OBSTACLE_SIGNALLING("obstacleSignalling"),
    @XmlEnumValue("rampMeteringInOperation")
    RAMP_METERING_IN_OPERATION("rampMeteringInOperation"),
    @XmlEnumValue("temporaryTrafficLights")
    TEMPORARY_TRAFFIC_LIGHTS("temporaryTrafficLights"),
    @XmlEnumValue("tollGatesOpen")
    TOLL_GATES_OPEN("tollGatesOpen"),
    @XmlEnumValue("trafficBeingManuallyDirected")
    TRAFFIC_BEING_MANUALLY_DIRECTED("trafficBeingManuallyDirected"),
    @XmlEnumValue("trafficHeld")
    TRAFFIC_HELD("trafficHeld"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    GeneralNetworkManagementTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GeneralNetworkManagementTypeEnum fromValue(String v) {
        for (GeneralNetworkManagementTypeEnum c: GeneralNetworkManagementTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

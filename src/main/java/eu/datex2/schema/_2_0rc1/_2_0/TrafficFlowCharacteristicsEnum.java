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
 * <p>Classe Java per TrafficFlowCharacteristicsEnum.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TrafficFlowCharacteristicsEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="erraticFlow"/&gt;
 *     &lt;enumeration value="smoothFlow"/&gt;
 *     &lt;enumeration value="stopAndGo"/&gt;
 *     &lt;enumeration value="trafficBlocked"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TrafficFlowCharacteristicsEnum")
@XmlEnum
public enum TrafficFlowCharacteristicsEnum {

    @XmlEnumValue("erraticFlow")
    ERRATIC_FLOW("erraticFlow"),
    @XmlEnumValue("smoothFlow")
    SMOOTH_FLOW("smoothFlow"),
    @XmlEnumValue("stopAndGo")
    STOP_AND_GO("stopAndGo"),
    @XmlEnumValue("trafficBlocked")
    TRAFFIC_BLOCKED("trafficBlocked");
    private final String value;

    TrafficFlowCharacteristicsEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrafficFlowCharacteristicsEnum fromValue(String v) {
        for (TrafficFlowCharacteristicsEnum c: TrafficFlowCharacteristicsEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

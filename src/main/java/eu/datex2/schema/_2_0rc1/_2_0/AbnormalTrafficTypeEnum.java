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
 * <p>Classe Java per AbnormalTrafficTypeEnum.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="AbnormalTrafficTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="stationaryTraffic"/&gt;
 *     &lt;enumeration value="queuingTraffic"/&gt;
 *     &lt;enumeration value="slowTraffic"/&gt;
 *     &lt;enumeration value="heavyTraffic"/&gt;
 *     &lt;enumeration value="unspecifiedAbnormalTraffic"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AbnormalTrafficTypeEnum")
@XmlEnum
public enum AbnormalTrafficTypeEnum {

    @XmlEnumValue("stationaryTraffic")
    STATIONARY_TRAFFIC("stationaryTraffic"),
    @XmlEnumValue("queuingTraffic")
    QUEUING_TRAFFIC("queuingTraffic"),
    @XmlEnumValue("slowTraffic")
    SLOW_TRAFFIC("slowTraffic"),
    @XmlEnumValue("heavyTraffic")
    HEAVY_TRAFFIC("heavyTraffic"),
    @XmlEnumValue("unspecifiedAbnormalTraffic")
    UNSPECIFIED_ABNORMAL_TRAFFIC("unspecifiedAbnormalTraffic"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    AbnormalTrafficTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AbnormalTrafficTypeEnum fromValue(String v) {
        for (AbnormalTrafficTypeEnum c: AbnormalTrafficTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

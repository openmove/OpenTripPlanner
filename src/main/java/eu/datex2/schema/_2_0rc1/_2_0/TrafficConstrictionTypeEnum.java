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
 * <p>Classe Java per TrafficConstrictionTypeEnum.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TrafficConstrictionTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="carriagewayBlocked"/&gt;
 *     &lt;enumeration value="carriagewayPartiallyObstructed"/&gt;
 *     &lt;enumeration value="lanesBlocked"/&gt;
 *     &lt;enumeration value="lanesPartiallyObstructed"/&gt;
 *     &lt;enumeration value="roadBlocked"/&gt;
 *     &lt;enumeration value="roadPartiallyObstructed"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TrafficConstrictionTypeEnum")
@XmlEnum
public enum TrafficConstrictionTypeEnum {

    @XmlEnumValue("carriagewayBlocked")
    CARRIAGEWAY_BLOCKED("carriagewayBlocked"),
    @XmlEnumValue("carriagewayPartiallyObstructed")
    CARRIAGEWAY_PARTIALLY_OBSTRUCTED("carriagewayPartiallyObstructed"),
    @XmlEnumValue("lanesBlocked")
    LANES_BLOCKED("lanesBlocked"),
    @XmlEnumValue("lanesPartiallyObstructed")
    LANES_PARTIALLY_OBSTRUCTED("lanesPartiallyObstructed"),
    @XmlEnumValue("roadBlocked")
    ROAD_BLOCKED("roadBlocked"),
    @XmlEnumValue("roadPartiallyObstructed")
    ROAD_PARTIALLY_OBSTRUCTED("roadPartiallyObstructed");
    private final String value;

    TrafficConstrictionTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrafficConstrictionTypeEnum fromValue(String v) {
        for (TrafficConstrictionTypeEnum c: TrafficConstrictionTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

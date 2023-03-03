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
 * <p>Classe Java per DrivingConditionTypeEnum.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DrivingConditionTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="impossible"/&gt;
 *     &lt;enumeration value="hazardous"/&gt;
 *     &lt;enumeration value="normal"/&gt;
 *     &lt;enumeration value="passableWithCare"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="veryHazardous"/&gt;
 *     &lt;enumeration value="winterConditions"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DrivingConditionTypeEnum")
@XmlEnum
public enum DrivingConditionTypeEnum {

    @XmlEnumValue("impossible")
    IMPOSSIBLE("impossible"),
    @XmlEnumValue("hazardous")
    HAZARDOUS("hazardous"),
    @XmlEnumValue("normal")
    NORMAL("normal"),
    @XmlEnumValue("passableWithCare")
    PASSABLE_WITH_CARE("passableWithCare"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("veryHazardous")
    VERY_HAZARDOUS("veryHazardous"),
    @XmlEnumValue("winterConditions")
    WINTER_CONDITIONS("winterConditions"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    DrivingConditionTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DrivingConditionTypeEnum fromValue(String v) {
        for (DrivingConditionTypeEnum c: DrivingConditionTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

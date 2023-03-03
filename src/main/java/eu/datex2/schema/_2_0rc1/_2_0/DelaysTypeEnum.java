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
 * <p>Classe Java per DelaysTypeEnum.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DelaysTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="delays"/&gt;
 *     &lt;enumeration value="delaysOfUncertainDuration"/&gt;
 *     &lt;enumeration value="longDelays"/&gt;
 *     &lt;enumeration value="veryLongDelays"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DelaysTypeEnum")
@XmlEnum
public enum DelaysTypeEnum {

    @XmlEnumValue("delays")
    DELAYS("delays"),
    @XmlEnumValue("delaysOfUncertainDuration")
    DELAYS_OF_UNCERTAIN_DURATION("delaysOfUncertainDuration"),
    @XmlEnumValue("longDelays")
    LONG_DELAYS("longDelays"),
    @XmlEnumValue("veryLongDelays")
    VERY_LONG_DELAYS("veryLongDelays");
    private final String value;

    DelaysTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DelaysTypeEnum fromValue(String v) {
        for (DelaysTypeEnum c: DelaysTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

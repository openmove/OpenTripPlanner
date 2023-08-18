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
 * <p>Classe Java per InjuryStatusTypeEnum.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="InjuryStatusTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="dead"/&gt;
 *     &lt;enumeration value="injured"/&gt;
 *     &lt;enumeration value="seriouslyInjured"/&gt;
 *     &lt;enumeration value="slightlyInjured"/&gt;
 *     &lt;enumeration value="uninjured"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InjuryStatusTypeEnum")
@XmlEnum
public enum InjuryStatusTypeEnum {

    @XmlEnumValue("dead")
    DEAD("dead"),
    @XmlEnumValue("injured")
    INJURED("injured"),
    @XmlEnumValue("seriouslyInjured")
    SERIOUSLY_INJURED("seriouslyInjured"),
    @XmlEnumValue("slightlyInjured")
    SLIGHTLY_INJURED("slightlyInjured"),
    @XmlEnumValue("uninjured")
    UNINJURED("uninjured"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    InjuryStatusTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InjuryStatusTypeEnum fromValue(String v) {
        for (InjuryStatusTypeEnum c: InjuryStatusTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

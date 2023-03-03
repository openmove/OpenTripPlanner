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
 * <p>Classe Java per EquipmentOrSystemFaultTypeEnum.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="EquipmentOrSystemFaultTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="notWorking"/&gt;
 *     &lt;enumeration value="outOfService"/&gt;
 *     &lt;enumeration value="workingIncorrectly"/&gt;
 *     &lt;enumeration value="workingIntermittently"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EquipmentOrSystemFaultTypeEnum")
@XmlEnum
public enum EquipmentOrSystemFaultTypeEnum {

    @XmlEnumValue("notWorking")
    NOT_WORKING("notWorking"),
    @XmlEnumValue("outOfService")
    OUT_OF_SERVICE("outOfService"),
    @XmlEnumValue("workingIncorrectly")
    WORKING_INCORRECTLY("workingIncorrectly"),
    @XmlEnumValue("workingIntermittently")
    WORKING_INTERMITTENTLY("workingIntermittently");
    private final String value;

    EquipmentOrSystemFaultTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EquipmentOrSystemFaultTypeEnum fromValue(String v) {
        for (EquipmentOrSystemFaultTypeEnum c: EquipmentOrSystemFaultTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

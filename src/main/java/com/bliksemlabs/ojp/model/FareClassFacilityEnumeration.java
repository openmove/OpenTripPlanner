//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package com.bliksemlabs.ojp.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per FareClassFacilityEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="FareClassFacilityEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="pti23_0"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="pti23_6"/&gt;
 *     &lt;enumeration value="firstClass"/&gt;
 *     &lt;enumeration value="pti23_7"/&gt;
 *     &lt;enumeration value="secondClass"/&gt;
 *     &lt;enumeration value="pti23_8"/&gt;
 *     &lt;enumeration value="thirdClass"/&gt;
 *     &lt;enumeration value="pti23_9"/&gt;
 *     &lt;enumeration value="economyClass"/&gt;
 *     &lt;enumeration value="pti23_10"/&gt;
 *     &lt;enumeration value="businessClass"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FareClassFacilityEnumeration")
@XmlEnum
public enum FareClassFacilityEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pti23_0")
    PTI_23___0("pti23_0"),
    @XmlEnumValue("pti23_6")
    PTI_23___6("pti23_6"),
    @XmlEnumValue("firstClass")
    FIRST_CLASS("firstClass"),
    @XmlEnumValue("pti23_7")
    PTI_23___7("pti23_7"),
    @XmlEnumValue("secondClass")
    SECOND_CLASS("secondClass"),
    @XmlEnumValue("pti23_8")
    PTI_23___8("pti23_8"),
    @XmlEnumValue("thirdClass")
    THIRD_CLASS("thirdClass"),
    @XmlEnumValue("pti23_9")
    PTI_23___9("pti23_9"),
    @XmlEnumValue("economyClass")
    ECONOMY_CLASS("economyClass"),
    @XmlEnumValue("pti23_10")
    PTI_23___10("pti23_10"),
    @XmlEnumValue("businessClass")
    BUSINESS_CLASS("businessClass");
    private final String value;

    FareClassFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FareClassFacilityEnumeration fromValue(String v) {
        for (FareClassFacilityEnumeration c: FareClassFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

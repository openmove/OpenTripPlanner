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
 * <p>Classe Java per FunicularSubmodesOfTransportEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="FunicularSubmodesOfTransportEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="pti10_0"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="pti10_1"/&gt;
 *     &lt;enumeration value="loc14_2"/&gt;
 *     &lt;enumeration value="funicular"/&gt;
 *     &lt;enumeration value="pti10_2"/&gt;
 *     &lt;enumeration value="allFunicularServices"/&gt;
 *     &lt;enumeration value="pti10_255"/&gt;
 *     &lt;enumeration value="undefinedFunicular"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FunicularSubmodesOfTransportEnumeration")
@XmlEnum
public enum FunicularSubmodesOfTransportEnumeration {

    @XmlEnumValue("pti10_0")
    PTI_10___0("pti10_0"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pti10_1")
    PTI_10___1("pti10_1"),
    @XmlEnumValue("loc14_2")
    LOC_14___2("loc14_2"),
    @XmlEnumValue("funicular")
    FUNICULAR("funicular"),
    @XmlEnumValue("pti10_2")
    PTI_10___2("pti10_2"),
    @XmlEnumValue("allFunicularServices")
    ALL_FUNICULAR_SERVICES("allFunicularServices"),
    @XmlEnumValue("pti10_255")
    PTI_10___255("pti10_255"),
    @XmlEnumValue("undefinedFunicular")
    UNDEFINED_FUNICULAR("undefinedFunicular");
    private final String value;

    FunicularSubmodesOfTransportEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FunicularSubmodesOfTransportEnumeration fromValue(String v) {
        for (FunicularSubmodesOfTransportEnumeration c: FunicularSubmodesOfTransportEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

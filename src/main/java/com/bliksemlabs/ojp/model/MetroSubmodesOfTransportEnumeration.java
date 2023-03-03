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
 * <p>Classe Java per MetroSubmodesOfTransportEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="MetroSubmodesOfTransportEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="pti4_0"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="pti4_1"/&gt;
 *     &lt;enumeration value="metro"/&gt;
 *     &lt;enumeration value="pti4_2"/&gt;
 *     &lt;enumeration value="tube"/&gt;
 *     &lt;enumeration value="pti4_3"/&gt;
 *     &lt;enumeration value="urbanRailway"/&gt;
 *     &lt;enumeration value="pti4_4"/&gt;
 *     &lt;enumeration value="allRailServices"/&gt;
 *     &lt;enumeration value="pti4_255"/&gt;
 *     &lt;enumeration value="undefined"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MetroSubmodesOfTransportEnumeration")
@XmlEnum
public enum MetroSubmodesOfTransportEnumeration {

    @XmlEnumValue("pti4_0")
    PTI_4___0("pti4_0"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pti4_1")
    PTI_4___1("pti4_1"),
    @XmlEnumValue("metro")
    METRO("metro"),
    @XmlEnumValue("pti4_2")
    PTI_4___2("pti4_2"),
    @XmlEnumValue("tube")
    TUBE("tube"),
    @XmlEnumValue("pti4_3")
    PTI_4___3("pti4_3"),
    @XmlEnumValue("urbanRailway")
    URBAN_RAILWAY("urbanRailway"),
    @XmlEnumValue("pti4_4")
    PTI_4___4("pti4_4"),
    @XmlEnumValue("allRailServices")
    ALL_RAIL_SERVICES("allRailServices"),
    @XmlEnumValue("pti4_255")
    PTI_4___255("pti4_255"),
    @XmlEnumValue("undefined")
    UNDEFINED("undefined");
    private final String value;

    MetroSubmodesOfTransportEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MetroSubmodesOfTransportEnumeration fromValue(String v) {
        for (MetroSubmodesOfTransportEnumeration c: MetroSubmodesOfTransportEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

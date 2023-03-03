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
 * <p>Classe Java per AccessFacilityEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="AccessFacilityEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="lift"/&gt;
 *     &lt;enumeration value="escalator"/&gt;
 *     &lt;enumeration value="travelator"/&gt;
 *     &lt;enumeration value="ramp"/&gt;
 *     &lt;enumeration value="stairs"/&gt;
 *     &lt;enumeration value="shuttle"/&gt;
 *     &lt;enumeration value="narrowEntrance"/&gt;
 *     &lt;enumeration value="barrier"/&gt;
 *     &lt;enumeration value="palletAccess_lowFloor"/&gt;
 *     &lt;enumeration value="validator"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AccessFacilityEnumeration")
@XmlEnum
public enum AccessFacilityEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("lift")
    LIFT("lift"),
    @XmlEnumValue("escalator")
    ESCALATOR("escalator"),
    @XmlEnumValue("travelator")
    TRAVELATOR("travelator"),
    @XmlEnumValue("ramp")
    RAMP("ramp"),
    @XmlEnumValue("stairs")
    STAIRS("stairs"),
    @XmlEnumValue("shuttle")
    SHUTTLE("shuttle"),
    @XmlEnumValue("narrowEntrance")
    NARROW_ENTRANCE("narrowEntrance"),
    @XmlEnumValue("barrier")
    BARRIER("barrier"),
    @XmlEnumValue("palletAccess_lowFloor")
    PALLET_ACCESS___LOW_FLOOR("palletAccess_lowFloor"),
    @XmlEnumValue("validator")
    VALIDATOR("validator");
    private final String value;

    AccessFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccessFacilityEnumeration fromValue(String v) {
        for (AccessFacilityEnumeration c: AccessFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

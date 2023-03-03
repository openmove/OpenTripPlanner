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
 * <p>Classe Java per ContinuousModesEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ContinuousModesEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="walk"/&gt;
 *     &lt;enumeration value="car"/&gt;
 *     &lt;enumeration value="taxi"/&gt;
 *     &lt;enumeration value="cycle"/&gt;
 *     &lt;enumeration value="drt"/&gt;
 *     &lt;enumeration value="movingWalkway"/&gt;
 *     &lt;enumeration value="through"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ContinuousModesEnumeration")
@XmlEnum
public enum ContinuousModesEnumeration {

    @XmlEnumValue("walk")
    WALK("walk"),
    @XmlEnumValue("car")
    CAR("car"),
    @XmlEnumValue("taxi")
    TAXI("taxi"),
    @XmlEnumValue("cycle")
    CYCLE("cycle"),
    @XmlEnumValue("drt")
    DRT("drt"),
    @XmlEnumValue("movingWalkway")
    MOVING_WALKWAY("movingWalkway"),
    @XmlEnumValue("through")
    THROUGH("through");
    private final String value;

    ContinuousModesEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContinuousModesEnumeration fromValue(String v) {
        for (ContinuousModesEnumeration c: ContinuousModesEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

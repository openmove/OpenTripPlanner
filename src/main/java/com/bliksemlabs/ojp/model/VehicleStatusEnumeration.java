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
 * <p>Classe Java per VehicleStatusEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VehicleStatusEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="expected"/&gt;
 *     &lt;enumeration value="notExpected"/&gt;
 *     &lt;enumeration value="cancelled"/&gt;
 *     &lt;enumeration value="assigned"/&gt;
 *     &lt;enumeration value="signedOn"/&gt;
 *     &lt;enumeration value="atOrigin"/&gt;
 *     &lt;enumeration value="inProgress"/&gt;
 *     &lt;enumeration value="aborted"/&gt;
 *     &lt;enumeration value="offRoute"/&gt;
 *     &lt;enumeration value="completed"/&gt;
 *     &lt;enumeration value="assumedCompleted"/&gt;
 *     &lt;enumeration value="notRun"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VehicleStatusEnumeration")
@XmlEnum
public enum VehicleStatusEnumeration {

    @XmlEnumValue("expected")
    EXPECTED("expected"),
    @XmlEnumValue("notExpected")
    NOT_EXPECTED("notExpected"),
    @XmlEnumValue("cancelled")
    CANCELLED("cancelled"),
    @XmlEnumValue("assigned")
    ASSIGNED("assigned"),
    @XmlEnumValue("signedOn")
    SIGNED_ON("signedOn"),
    @XmlEnumValue("atOrigin")
    AT_ORIGIN("atOrigin"),
    @XmlEnumValue("inProgress")
    IN_PROGRESS("inProgress"),
    @XmlEnumValue("aborted")
    ABORTED("aborted"),
    @XmlEnumValue("offRoute")
    OFF_ROUTE("offRoute"),
    @XmlEnumValue("completed")
    COMPLETED("completed"),
    @XmlEnumValue("assumedCompleted")
    ASSUMED_COMPLETED("assumedCompleted"),
    @XmlEnumValue("notRun")
    NOT_RUN("notRun");
    private final String value;

    VehicleStatusEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehicleStatusEnumeration fromValue(String v) {
        for (VehicleStatusEnumeration c: VehicleStatusEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

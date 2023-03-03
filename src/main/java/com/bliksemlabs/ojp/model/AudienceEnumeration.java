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
 * <p>Classe Java per AudienceEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="AudienceEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="public"/&gt;
 *     &lt;enumeration value="emergencyServices"/&gt;
 *     &lt;enumeration value="staff"/&gt;
 *     &lt;enumeration value="stationStaff"/&gt;
 *     &lt;enumeration value="management"/&gt;
 *     &lt;enumeration value="infoServices"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AudienceEnumeration")
@XmlEnum
public enum AudienceEnumeration {

    @XmlEnumValue("public")
    PUBLIC("public"),
    @XmlEnumValue("emergencyServices")
    EMERGENCY_SERVICES("emergencyServices"),
    @XmlEnumValue("staff")
    STAFF("staff"),
    @XmlEnumValue("stationStaff")
    STATION_STAFF("stationStaff"),
    @XmlEnumValue("management")
    MANAGEMENT("management"),
    @XmlEnumValue("infoServices")
    INFO_SERVICES("infoServices");
    private final String value;

    AudienceEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AudienceEnumeration fromValue(String v) {
        for (AudienceEnumeration c: AudienceEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

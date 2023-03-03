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
 * <p>Classe Java per AccommodationFacilityEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="AccommodationFacilityEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="pti23_3"/&gt;
 *     &lt;enumeration value="sleeper"/&gt;
 *     &lt;enumeration value="pti23_4"/&gt;
 *     &lt;enumeration value="couchette"/&gt;
 *     &lt;enumeration value="pti23_5"/&gt;
 *     &lt;enumeration value="specialSeating"/&gt;
 *     &lt;enumeration value="pti23_11"/&gt;
 *     &lt;enumeration value="freeSeating"/&gt;
 *     &lt;enumeration value="pti23_12"/&gt;
 *     &lt;enumeration value="recliningSeats"/&gt;
 *     &lt;enumeration value="pti23_13"/&gt;
 *     &lt;enumeration value="babyCompartment"/&gt;
 *     &lt;enumeration value="familyCarriage"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AccommodationFacilityEnumeration")
@XmlEnum
public enum AccommodationFacilityEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pti23_3")
    PTI_23___3("pti23_3"),
    @XmlEnumValue("sleeper")
    SLEEPER("sleeper"),
    @XmlEnumValue("pti23_4")
    PTI_23___4("pti23_4"),
    @XmlEnumValue("couchette")
    COUCHETTE("couchette"),
    @XmlEnumValue("pti23_5")
    PTI_23___5("pti23_5"),
    @XmlEnumValue("specialSeating")
    SPECIAL_SEATING("specialSeating"),
    @XmlEnumValue("pti23_11")
    PTI_23___11("pti23_11"),
    @XmlEnumValue("freeSeating")
    FREE_SEATING("freeSeating"),
    @XmlEnumValue("pti23_12")
    PTI_23___12("pti23_12"),
    @XmlEnumValue("recliningSeats")
    RECLINING_SEATS("recliningSeats"),
    @XmlEnumValue("pti23_13")
    PTI_23___13("pti23_13"),
    @XmlEnumValue("babyCompartment")
    BABY_COMPARTMENT("babyCompartment"),
    @XmlEnumValue("familyCarriage")
    FAMILY_CARRIAGE("familyCarriage");
    private final String value;

    AccommodationFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccommodationFacilityEnumeration fromValue(String v) {
        for (AccommodationFacilityEnumeration c: AccommodationFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

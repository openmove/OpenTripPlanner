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
 * <p>Classe Java per FacilityCategoryEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="FacilityCategoryEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="fixedEquipment"/&gt;
 *     &lt;enumeration value="serviceProvidedByIndividual"/&gt;
 *     &lt;enumeration value="serviceForPersonalDevice"/&gt;
 *     &lt;enumeration value="reservedArea"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FacilityCategoryEnumeration")
@XmlEnum
public enum FacilityCategoryEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("fixedEquipment")
    FIXED_EQUIPMENT("fixedEquipment"),
    @XmlEnumValue("serviceProvidedByIndividual")
    SERVICE_PROVIDED_BY_INDIVIDUAL("serviceProvidedByIndividual"),
    @XmlEnumValue("serviceForPersonalDevice")
    SERVICE_FOR_PERSONAL_DEVICE("serviceForPersonalDevice"),
    @XmlEnumValue("reservedArea")
    RESERVED_AREA("reservedArea");
    private final String value;

    FacilityCategoryEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FacilityCategoryEnumeration fromValue(String v) {
        for (FacilityCategoryEnumeration c: FacilityCategoryEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

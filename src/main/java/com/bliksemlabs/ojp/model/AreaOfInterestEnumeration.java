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
 * <p>Classe Java per AreaOfInterestEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="AreaOfInterestEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="continentWide"/&gt;
 *     &lt;enumeration value="national"/&gt;
 *     &lt;enumeration value="neighboroughingCountries"/&gt;
 *     &lt;enumeration value="regional"/&gt;
 *     &lt;enumeration value="notSpecified"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AreaOfInterestEnumeration")
@XmlEnum
public enum AreaOfInterestEnumeration {

    @XmlEnumValue("continentWide")
    CONTINENT_WIDE("continentWide"),
    @XmlEnumValue("national")
    NATIONAL("national"),
    @XmlEnumValue("neighboroughingCountries")
    NEIGHBOROUGHING_COUNTRIES("neighboroughingCountries"),
    @XmlEnumValue("regional")
    REGIONAL("regional"),
    @XmlEnumValue("notSpecified")
    NOT_SPECIFIED("notSpecified");
    private final String value;

    AreaOfInterestEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AreaOfInterestEnumeration fromValue(String v) {
        for (AreaOfInterestEnumeration c: AreaOfInterestEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

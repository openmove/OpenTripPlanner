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
 * <p>Classe Java per ImageContentEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ImageContentEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="map"/&gt;
 *     &lt;enumeration value="graphic"/&gt;
 *     &lt;enumeration value="logo"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ImageContentEnumeration")
@XmlEnum
public enum ImageContentEnumeration {

    @XmlEnumValue("map")
    MAP("map"),
    @XmlEnumValue("graphic")
    GRAPHIC("graphic"),
    @XmlEnumValue("logo")
    LOGO("logo");
    private final String value;

    ImageContentEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ImageContentEnumeration fromValue(String v) {
        for (ImageContentEnumeration c: ImageContentEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

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
 * <p>Classe Java per LinkContentEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="LinkContentEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="timetable"/&gt;
 *     &lt;enumeration value="relatedSite"/&gt;
 *     &lt;enumeration value="details"/&gt;
 *     &lt;enumeration value="advice"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LinkContentEnumeration")
@XmlEnum
public enum LinkContentEnumeration {

    @XmlEnumValue("timetable")
    TIMETABLE("timetable"),
    @XmlEnumValue("relatedSite")
    RELATED_SITE("relatedSite"),
    @XmlEnumValue("details")
    DETAILS("details"),
    @XmlEnumValue("advice")
    ADVICE("advice"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    LinkContentEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LinkContentEnumeration fromValue(String v) {
        for (LinkContentEnumeration c: LinkContentEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

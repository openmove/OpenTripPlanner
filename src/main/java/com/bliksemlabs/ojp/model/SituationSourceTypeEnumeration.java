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
 * <p>Classe Java per SituationSourceTypeEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="SituationSourceTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="directReport"/&gt;
 *     &lt;enumeration value="email"/&gt;
 *     &lt;enumeration value="phone"/&gt;
 *     &lt;enumeration value="fax"/&gt;
 *     &lt;enumeration value="post"/&gt;
 *     &lt;enumeration value="feed"/&gt;
 *     &lt;enumeration value="radio"/&gt;
 *     &lt;enumeration value="tv"/&gt;
 *     &lt;enumeration value="web"/&gt;
 *     &lt;enumeration value="pager"/&gt;
 *     &lt;enumeration value="text"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SituationSourceTypeEnumeration")
@XmlEnum
public enum SituationSourceTypeEnumeration {

    @XmlEnumValue("directReport")
    DIRECT_REPORT("directReport"),
    @XmlEnumValue("email")
    EMAIL("email"),
    @XmlEnumValue("phone")
    PHONE("phone"),
    @XmlEnumValue("fax")
    FAX("fax"),
    @XmlEnumValue("post")
    POST("post"),
    @XmlEnumValue("feed")
    FEED("feed"),
    @XmlEnumValue("radio")
    RADIO("radio"),
    @XmlEnumValue("tv")
    TV("tv"),
    @XmlEnumValue("web")
    WEB("web"),
    @XmlEnumValue("pager")
    PAGER("pager"),
    @XmlEnumValue("text")
    TEXT("text"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    SituationSourceTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SituationSourceTypeEnumeration fromValue(String v) {
        for (SituationSourceTypeEnumeration c: SituationSourceTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

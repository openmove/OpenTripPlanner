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
 * <p>Classe Java per SeverityEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="SeverityEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="pti26_0"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="pti26_1"/&gt;
 *     &lt;enumeration value="verySlight"/&gt;
 *     &lt;enumeration value="pti26_2"/&gt;
 *     &lt;enumeration value="slight"/&gt;
 *     &lt;enumeration value="pti26_3"/&gt;
 *     &lt;enumeration value="normal"/&gt;
 *     &lt;enumeration value="pti26_4"/&gt;
 *     &lt;enumeration value="severe"/&gt;
 *     &lt;enumeration value="pti26_5"/&gt;
 *     &lt;enumeration value="verySevere"/&gt;
 *     &lt;enumeration value="pti26_6"/&gt;
 *     &lt;enumeration value="noImpact"/&gt;
 *     &lt;enumeration value="pti26_255"/&gt;
 *     &lt;enumeration value="undefined"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SeverityEnumeration")
@XmlEnum
public enum SeverityEnumeration {

    @XmlEnumValue("pti26_0")
    PTI_26___0("pti26_0"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pti26_1")
    PTI_26___1("pti26_1"),
    @XmlEnumValue("verySlight")
    VERY_SLIGHT("verySlight"),
    @XmlEnumValue("pti26_2")
    PTI_26___2("pti26_2"),
    @XmlEnumValue("slight")
    SLIGHT("slight"),
    @XmlEnumValue("pti26_3")
    PTI_26___3("pti26_3"),
    @XmlEnumValue("normal")
    NORMAL("normal"),
    @XmlEnumValue("pti26_4")
    PTI_26___4("pti26_4"),
    @XmlEnumValue("severe")
    SEVERE("severe"),
    @XmlEnumValue("pti26_5")
    PTI_26___5("pti26_5"),
    @XmlEnumValue("verySevere")
    VERY_SEVERE("verySevere"),
    @XmlEnumValue("pti26_6")
    PTI_26___6("pti26_6"),
    @XmlEnumValue("noImpact")
    NO_IMPACT("noImpact"),
    @XmlEnumValue("pti26_255")
    PTI_26___255("pti26_255"),
    @XmlEnumValue("undefined")
    UNDEFINED("undefined");
    private final String value;

    SeverityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SeverityEnumeration fromValue(String v) {
        for (SeverityEnumeration c: SeverityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

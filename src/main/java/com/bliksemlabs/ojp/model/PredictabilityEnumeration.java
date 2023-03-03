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
 * <p>Classe Java per PredictabilityEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="PredictabilityEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="planned"/&gt;
 *     &lt;enumeration value="unplanned"/&gt;
 *     &lt;enumeration value="all"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PredictabilityEnumeration")
@XmlEnum
public enum PredictabilityEnumeration {

    @XmlEnumValue("planned")
    PLANNED("planned"),
    @XmlEnumValue("unplanned")
    UNPLANNED("unplanned"),
    @XmlEnumValue("all")
    ALL("all");
    private final String value;

    PredictabilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PredictabilityEnumeration fromValue(String v) {
        for (PredictabilityEnumeration c: PredictabilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

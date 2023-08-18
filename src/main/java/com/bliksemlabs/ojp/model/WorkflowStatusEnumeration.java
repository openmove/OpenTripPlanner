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
 * <p>Classe Java per WorkflowStatusEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="WorkflowStatusEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="draft"/&gt;
 *     &lt;enumeration value="approvedDraft"/&gt;
 *     &lt;enumeration value="open"/&gt;
 *     &lt;enumeration value="published"/&gt;
 *     &lt;enumeration value="closing"/&gt;
 *     &lt;enumeration value="closed"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WorkflowStatusEnumeration")
@XmlEnum
public enum WorkflowStatusEnumeration {

    @XmlEnumValue("draft")
    DRAFT("draft"),
    @XmlEnumValue("approvedDraft")
    APPROVED_DRAFT("approvedDraft"),
    @XmlEnumValue("open")
    OPEN("open"),
    @XmlEnumValue("published")
    PUBLISHED("published"),
    @XmlEnumValue("closing")
    CLOSING("closing"),
    @XmlEnumValue("closed")
    CLOSED("closed");
    private final String value;

    WorkflowStatusEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WorkflowStatusEnumeration fromValue(String v) {
        for (WorkflowStatusEnumeration c: WorkflowStatusEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

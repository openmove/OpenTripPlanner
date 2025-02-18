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
 * <p>Classe Java per InterchangeStatusEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="InterchangeStatusEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="pti31_0"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="pti31_1"/&gt;
 *     &lt;enumeration value="connection"/&gt;
 *     &lt;enumeration value="pti31_2"/&gt;
 *     &lt;enumeration value="replacement"/&gt;
 *     &lt;enumeration value="pti31_3"/&gt;
 *     &lt;enumeration value="alternative"/&gt;
 *     &lt;enumeration value="pti31_4"/&gt;
 *     &lt;enumeration value="connectionNotHeld"/&gt;
 *     &lt;enumeration value="pti31_5"/&gt;
 *     &lt;enumeration value="connectionHeld"/&gt;
 *     &lt;enumeration value="pti31_6"/&gt;
 *     &lt;enumeration value="statusOfConenctionUndecided"/&gt;
 *     &lt;enumeration value="pti31_255"/&gt;
 *     &lt;enumeration value="undefinedCrossReferenceInformation"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InterchangeStatusEnumeration")
@XmlEnum
public enum InterchangeStatusEnumeration {

    @XmlEnumValue("pti31_0")
    PTI_31___0("pti31_0"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pti31_1")
    PTI_31___1("pti31_1"),
    @XmlEnumValue("connection")
    CONNECTION("connection"),
    @XmlEnumValue("pti31_2")
    PTI_31___2("pti31_2"),
    @XmlEnumValue("replacement")
    REPLACEMENT("replacement"),
    @XmlEnumValue("pti31_3")
    PTI_31___3("pti31_3"),
    @XmlEnumValue("alternative")
    ALTERNATIVE("alternative"),
    @XmlEnumValue("pti31_4")
    PTI_31___4("pti31_4"),
    @XmlEnumValue("connectionNotHeld")
    CONNECTION_NOT_HELD("connectionNotHeld"),
    @XmlEnumValue("pti31_5")
    PTI_31___5("pti31_5"),
    @XmlEnumValue("connectionHeld")
    CONNECTION_HELD("connectionHeld"),
    @XmlEnumValue("pti31_6")
    PTI_31___6("pti31_6"),
    @XmlEnumValue("statusOfConenctionUndecided")
    STATUS_OF_CONENCTION_UNDECIDED("statusOfConenctionUndecided"),
    @XmlEnumValue("pti31_255")
    PTI_31___255("pti31_255"),
    @XmlEnumValue("undefinedCrossReferenceInformation")
    UNDEFINED_CROSS_REFERENCE_INFORMATION("undefinedCrossReferenceInformation");
    private final String value;

    InterchangeStatusEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InterchangeStatusEnumeration fromValue(String v) {
        for (InterchangeStatusEnumeration c: InterchangeStatusEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

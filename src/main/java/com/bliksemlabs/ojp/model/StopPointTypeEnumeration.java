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
 * <p>Classe Java per StopPointTypeEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="StopPointTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="pti17_0"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="pti17_1"/&gt;
 *     &lt;enumeration value="platformNumber"/&gt;
 *     &lt;enumeration value="pti17_2"/&gt;
 *     &lt;enumeration value="terminalGate"/&gt;
 *     &lt;enumeration value="pti17_3"/&gt;
 *     &lt;enumeration value="ferryBerth"/&gt;
 *     &lt;enumeration value="pti17_4"/&gt;
 *     &lt;enumeration value="harbourPier"/&gt;
 *     &lt;enumeration value="pti17_5"/&gt;
 *     &lt;enumeration value="landingStage"/&gt;
 *     &lt;enumeration value="pti17_6"/&gt;
 *     &lt;enumeration value="busStop"/&gt;
 *     &lt;enumeration value="pti17_255"/&gt;
 *     &lt;enumeration value="undefinedBookingInformation"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StopPointTypeEnumeration")
@XmlEnum
public enum StopPointTypeEnumeration {

    @XmlEnumValue("pti17_0")
    PTI_17___0("pti17_0"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pti17_1")
    PTI_17___1("pti17_1"),
    @XmlEnumValue("platformNumber")
    PLATFORM_NUMBER("platformNumber"),
    @XmlEnumValue("pti17_2")
    PTI_17___2("pti17_2"),
    @XmlEnumValue("terminalGate")
    TERMINAL_GATE("terminalGate"),
    @XmlEnumValue("pti17_3")
    PTI_17___3("pti17_3"),
    @XmlEnumValue("ferryBerth")
    FERRY_BERTH("ferryBerth"),
    @XmlEnumValue("pti17_4")
    PTI_17___4("pti17_4"),
    @XmlEnumValue("harbourPier")
    HARBOUR_PIER("harbourPier"),
    @XmlEnumValue("pti17_5")
    PTI_17___5("pti17_5"),
    @XmlEnumValue("landingStage")
    LANDING_STAGE("landingStage"),
    @XmlEnumValue("pti17_6")
    PTI_17___6("pti17_6"),
    @XmlEnumValue("busStop")
    BUS_STOP("busStop"),
    @XmlEnumValue("pti17_255")
    PTI_17___255("pti17_255"),
    @XmlEnumValue("undefinedBookingInformation")
    UNDEFINED_BOOKING_INFORMATION("undefinedBookingInformation");
    private final String value;

    StopPointTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StopPointTypeEnumeration fromValue(String v) {
        for (StopPointTypeEnumeration c: StopPointTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

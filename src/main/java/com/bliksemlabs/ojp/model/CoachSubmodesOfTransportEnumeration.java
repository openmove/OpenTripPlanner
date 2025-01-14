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
 * <p>Classe Java per CoachSubmodesOfTransportEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="CoachSubmodesOfTransportEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="pti3_0"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="pti3_1"/&gt;
 *     &lt;enumeration value="internationalCoachService"/&gt;
 *     &lt;enumeration value="pti3_2"/&gt;
 *     &lt;enumeration value="nationalCoachService"/&gt;
 *     &lt;enumeration value="pti3_3"/&gt;
 *     &lt;enumeration value="shuttleCoachService"/&gt;
 *     &lt;enumeration value="pti3_4"/&gt;
 *     &lt;enumeration value="regionalCoachService"/&gt;
 *     &lt;enumeration value="pti3_5"/&gt;
 *     &lt;enumeration value="specialCoachService"/&gt;
 *     &lt;enumeration value="pti3_6"/&gt;
 *     &lt;enumeration value="sightseeingCoachService"/&gt;
 *     &lt;enumeration value="pti3_7"/&gt;
 *     &lt;enumeration value="touristCoachService"/&gt;
 *     &lt;enumeration value="pti3_8"/&gt;
 *     &lt;enumeration value="commuterCoachService"/&gt;
 *     &lt;enumeration value="pti3_9"/&gt;
 *     &lt;enumeration value="allCoachServices"/&gt;
 *     &lt;enumeration value="pti3_255"/&gt;
 *     &lt;enumeration value="undefined"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CoachSubmodesOfTransportEnumeration")
@XmlEnum
public enum CoachSubmodesOfTransportEnumeration {

    @XmlEnumValue("pti3_0")
    PTI_3___0("pti3_0"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pti3_1")
    PTI_3___1("pti3_1"),
    @XmlEnumValue("internationalCoachService")
    INTERNATIONAL_COACH_SERVICE("internationalCoachService"),
    @XmlEnumValue("pti3_2")
    PTI_3___2("pti3_2"),
    @XmlEnumValue("nationalCoachService")
    NATIONAL_COACH_SERVICE("nationalCoachService"),
    @XmlEnumValue("pti3_3")
    PTI_3___3("pti3_3"),
    @XmlEnumValue("shuttleCoachService")
    SHUTTLE_COACH_SERVICE("shuttleCoachService"),
    @XmlEnumValue("pti3_4")
    PTI_3___4("pti3_4"),
    @XmlEnumValue("regionalCoachService")
    REGIONAL_COACH_SERVICE("regionalCoachService"),
    @XmlEnumValue("pti3_5")
    PTI_3___5("pti3_5"),
    @XmlEnumValue("specialCoachService")
    SPECIAL_COACH_SERVICE("specialCoachService"),
    @XmlEnumValue("pti3_6")
    PTI_3___6("pti3_6"),
    @XmlEnumValue("sightseeingCoachService")
    SIGHTSEEING_COACH_SERVICE("sightseeingCoachService"),
    @XmlEnumValue("pti3_7")
    PTI_3___7("pti3_7"),
    @XmlEnumValue("touristCoachService")
    TOURIST_COACH_SERVICE("touristCoachService"),
    @XmlEnumValue("pti3_8")
    PTI_3___8("pti3_8"),
    @XmlEnumValue("commuterCoachService")
    COMMUTER_COACH_SERVICE("commuterCoachService"),
    @XmlEnumValue("pti3_9")
    PTI_3___9("pti3_9"),
    @XmlEnumValue("allCoachServices")
    ALL_COACH_SERVICES("allCoachServices"),
    @XmlEnumValue("pti3_255")
    PTI_3___255("pti3_255"),
    @XmlEnumValue("undefined")
    UNDEFINED("undefined");
    private final String value;

    CoachSubmodesOfTransportEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CoachSubmodesOfTransportEnumeration fromValue(String v) {
        for (CoachSubmodesOfTransportEnumeration c: CoachSubmodesOfTransportEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

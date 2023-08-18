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
 * <p>Classe Java per PassengerInformationFacilityEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="PassengerInformationFacilityEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="nextStopIndicator"/&gt;
 *     &lt;enumeration value="stopAnnouncements"/&gt;
 *     &lt;enumeration value="passengerInformationDisplay"/&gt;
 *     &lt;enumeration value="audioInformation"/&gt;
 *     &lt;enumeration value="visualInformation"/&gt;
 *     &lt;enumeration value="tactilePlatformEdges"/&gt;
 *     &lt;enumeration value="tactileInformation"/&gt;
 *     &lt;enumeration value="walkingGuidance"/&gt;
 *     &lt;enumeration value="journeyPlanning"/&gt;
 *     &lt;enumeration value="lostFound"/&gt;
 *     &lt;enumeration value="informationDesk"/&gt;
 *     &lt;enumeration value="interactiveKiosk-Display"/&gt;
 *     &lt;enumeration value="printedPublicNotice"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PassengerInformationFacilityEnumeration")
@XmlEnum
public enum PassengerInformationFacilityEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("nextStopIndicator")
    NEXT_STOP_INDICATOR("nextStopIndicator"),
    @XmlEnumValue("stopAnnouncements")
    STOP_ANNOUNCEMENTS("stopAnnouncements"),
    @XmlEnumValue("passengerInformationDisplay")
    PASSENGER_INFORMATION_DISPLAY("passengerInformationDisplay"),
    @XmlEnumValue("audioInformation")
    AUDIO_INFORMATION("audioInformation"),
    @XmlEnumValue("visualInformation")
    VISUAL_INFORMATION("visualInformation"),
    @XmlEnumValue("tactilePlatformEdges")
    TACTILE_PLATFORM_EDGES("tactilePlatformEdges"),
    @XmlEnumValue("tactileInformation")
    TACTILE_INFORMATION("tactileInformation"),
    @XmlEnumValue("walkingGuidance")
    WALKING_GUIDANCE("walkingGuidance"),
    @XmlEnumValue("journeyPlanning")
    JOURNEY_PLANNING("journeyPlanning"),
    @XmlEnumValue("lostFound")
    LOST_FOUND("lostFound"),
    @XmlEnumValue("informationDesk")
    INFORMATION_DESK("informationDesk"),
    @XmlEnumValue("interactiveKiosk-Display")
    INTERACTIVE_KIOSK___DISPLAY("interactiveKiosk-Display"),
    @XmlEnumValue("printedPublicNotice")
    PRINTED_PUBLIC_NOTICE("printedPublicNotice");
    private final String value;

    PassengerInformationFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PassengerInformationFacilityEnumeration fromValue(String v) {
        for (PassengerInformationFacilityEnumeration c: PassengerInformationFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

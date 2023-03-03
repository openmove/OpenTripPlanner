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
 * <p>Classe Java per PassengerCommsFacilityEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="PassengerCommsFacilityEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="faccomms_1"/&gt;
 *     &lt;enumeration value="passengerWifi"/&gt;
 *     &lt;enumeration value="pti23_21"/&gt;
 *     &lt;enumeration value="telephone"/&gt;
 *     &lt;enumeration value="pti23_14"/&gt;
 *     &lt;enumeration value="audioServices"/&gt;
 *     &lt;enumeration value="pti23_15"/&gt;
 *     &lt;enumeration value="videoServices"/&gt;
 *     &lt;enumeration value="pti23_25"/&gt;
 *     &lt;enumeration value="businessServices"/&gt;
 *     &lt;enumeration value="internet"/&gt;
 *     &lt;enumeration value="postoffice"/&gt;
 *     &lt;enumeration value="letterbox"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PassengerCommsFacilityEnumeration")
@XmlEnum
public enum PassengerCommsFacilityEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("faccomms_1")
    FACCOMMS___1("faccomms_1"),
    @XmlEnumValue("passengerWifi")
    PASSENGER_WIFI("passengerWifi"),
    @XmlEnumValue("pti23_21")
    PTI_23___21("pti23_21"),
    @XmlEnumValue("telephone")
    TELEPHONE("telephone"),
    @XmlEnumValue("pti23_14")
    PTI_23___14("pti23_14"),
    @XmlEnumValue("audioServices")
    AUDIO_SERVICES("audioServices"),
    @XmlEnumValue("pti23_15")
    PTI_23___15("pti23_15"),
    @XmlEnumValue("videoServices")
    VIDEO_SERVICES("videoServices"),
    @XmlEnumValue("pti23_25")
    PTI_23___25("pti23_25"),
    @XmlEnumValue("businessServices")
    BUSINESS_SERVICES("businessServices"),
    @XmlEnumValue("internet")
    INTERNET("internet"),
    @XmlEnumValue("postoffice")
    POSTOFFICE("postoffice"),
    @XmlEnumValue("letterbox")
    LETTERBOX("letterbox");
    private final String value;

    PassengerCommsFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PassengerCommsFacilityEnumeration fromValue(String v) {
        for (PassengerCommsFacilityEnumeration c: PassengerCommsFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

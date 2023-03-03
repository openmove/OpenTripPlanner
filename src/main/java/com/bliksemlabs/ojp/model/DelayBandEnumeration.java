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
 * <p>Classe Java per DelayBandEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DelayBandEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *     &lt;enumeration value="delayTwoMinutes"/&gt;
 *     &lt;enumeration value="upToThreeMinutes"/&gt;
 *     &lt;enumeration value="upToFourMinutes"/&gt;
 *     &lt;enumeration value="upToFiveMinutes"/&gt;
 *     &lt;enumeration value="upToEightMinutes"/&gt;
 *     &lt;enumeration value="negligible"/&gt;
 *     &lt;enumeration value="upToTenMinutes"/&gt;
 *     &lt;enumeration value="betweenTenMinutesAndThirtyMinutes"/&gt;
 *     &lt;enumeration value="betweenThirtyMinutesAndOneHour"/&gt;
 *     &lt;enumeration value="betweenOneHourAndThreeHours"/&gt;
 *     &lt;enumeration value="betweenThreeHoursAndSixHours"/&gt;
 *     &lt;enumeration value="longerThanSixHours"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DelayBandEnumeration")
@XmlEnum
public enum DelayBandEnumeration {

    @XmlEnumValue("delayTwoMinutes")
    DELAY_TWO_MINUTES("delayTwoMinutes"),
    @XmlEnumValue("upToThreeMinutes")
    UP_TO_THREE_MINUTES("upToThreeMinutes"),
    @XmlEnumValue("upToFourMinutes")
    UP_TO_FOUR_MINUTES("upToFourMinutes"),
    @XmlEnumValue("upToFiveMinutes")
    UP_TO_FIVE_MINUTES("upToFiveMinutes"),
    @XmlEnumValue("upToEightMinutes")
    UP_TO_EIGHT_MINUTES("upToEightMinutes"),
    @XmlEnumValue("negligible")
    NEGLIGIBLE("negligible"),
    @XmlEnumValue("upToTenMinutes")
    UP_TO_TEN_MINUTES("upToTenMinutes"),
    @XmlEnumValue("betweenTenMinutesAndThirtyMinutes")
    BETWEEN_TEN_MINUTES_AND_THIRTY_MINUTES("betweenTenMinutesAndThirtyMinutes"),
    @XmlEnumValue("betweenThirtyMinutesAndOneHour")
    BETWEEN_THIRTY_MINUTES_AND_ONE_HOUR("betweenThirtyMinutesAndOneHour"),
    @XmlEnumValue("betweenOneHourAndThreeHours")
    BETWEEN_ONE_HOUR_AND_THREE_HOURS("betweenOneHourAndThreeHours"),
    @XmlEnumValue("betweenThreeHoursAndSixHours")
    BETWEEN_THREE_HOURS_AND_SIX_HOURS("betweenThreeHoursAndSixHours"),
    @XmlEnumValue("longerThanSixHours")
    LONGER_THAN_SIX_HOURS("longerThanSixHours");
    private final String value;

    DelayBandEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DelayBandEnumeration fromValue(String v) {
        for (DelayBandEnumeration c: DelayBandEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

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
 * <p>Classe Java per DaysOfWeekEnumerationx.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DaysOfWeekEnumerationx"&gt;
 *   &lt;restriction base="{http://www.siri.org.uk/siri}DayTypeEnumeration"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="monday"/&gt;
 *     &lt;enumeration value="tuesday"/&gt;
 *     &lt;enumeration value="wednesday"/&gt;
 *     &lt;enumeration value="thursday"/&gt;
 *     &lt;enumeration value="friday"/&gt;
 *     &lt;enumeration value="saturday"/&gt;
 *     &lt;enumeration value="sunday"/&gt;
 *     &lt;enumeration value="mondayToFriday"/&gt;
 *     &lt;enumeration value="mondayToSaturday"/&gt;
 *     &lt;enumeration value="weekdays"/&gt;
 *     &lt;enumeration value="weekends"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DaysOfWeekEnumerationx")
@XmlEnum(DayTypeEnumeration.class)
public enum DaysOfWeekEnumerationx {

    @XmlEnumValue("unknown")
    UNKNOWN(DayTypeEnumeration.UNKNOWN),
    @XmlEnumValue("monday")
    MONDAY(DayTypeEnumeration.MONDAY),
    @XmlEnumValue("tuesday")
    TUESDAY(DayTypeEnumeration.TUESDAY),
    @XmlEnumValue("wednesday")
    WEDNESDAY(DayTypeEnumeration.WEDNESDAY),
    @XmlEnumValue("thursday")
    THURSDAY(DayTypeEnumeration.THURSDAY),
    @XmlEnumValue("friday")
    FRIDAY(DayTypeEnumeration.FRIDAY),
    @XmlEnumValue("saturday")
    SATURDAY(DayTypeEnumeration.SATURDAY),
    @XmlEnumValue("sunday")
    SUNDAY(DayTypeEnumeration.SUNDAY),
    @XmlEnumValue("mondayToFriday")
    MONDAY_TO_FRIDAY(DayTypeEnumeration.MONDAY_TO_FRIDAY),
    @XmlEnumValue("mondayToSaturday")
    MONDAY_TO_SATURDAY(DayTypeEnumeration.MONDAY_TO_SATURDAY),
    @XmlEnumValue("weekdays")
    WEEKDAYS(DayTypeEnumeration.WEEKDAYS),
    @XmlEnumValue("weekends")
    WEEKENDS(DayTypeEnumeration.WEEKENDS);
    private final DayTypeEnumeration value;

    DaysOfWeekEnumerationx(DayTypeEnumeration v) {
        value = v;
    }

    public DayTypeEnumeration value() {
        return value;
    }

    public static DaysOfWeekEnumerationx fromValue(DayTypeEnumeration v) {
        for (DaysOfWeekEnumerationx c: DaysOfWeekEnumerationx.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}

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
 * <p>Classe Java per HolidayTypeEnumerationx.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="HolidayTypeEnumerationx"&gt;
 *   &lt;restriction base="{http://www.siri.org.uk/siri}DayTypeEnumeration"&gt;
 *     &lt;enumeration value="holiday"/&gt;
 *     &lt;enumeration value="publicHoliday"/&gt;
 *     &lt;enumeration value="religiousHoliday"/&gt;
 *     &lt;enumeration value="federalHoliday"/&gt;
 *     &lt;enumeration value="regionalHoliday"/&gt;
 *     &lt;enumeration value="nationalHoliday"/&gt;
 *     &lt;enumeration value="sundaysAndPublicHolidays"/&gt;
 *     &lt;enumeration value="schoolDays"/&gt;
 *     &lt;enumeration value="everyDay"/&gt;
 *     &lt;enumeration value="undefinedDayType"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HolidayTypeEnumerationx")
@XmlEnum(DayTypeEnumeration.class)
public enum HolidayTypeEnumerationx {

    @XmlEnumValue("holiday")
    HOLIDAY(DayTypeEnumeration.HOLIDAY),
    @XmlEnumValue("publicHoliday")
    PUBLIC_HOLIDAY(DayTypeEnumeration.PUBLIC_HOLIDAY),
    @XmlEnumValue("religiousHoliday")
    RELIGIOUS_HOLIDAY(DayTypeEnumeration.RELIGIOUS_HOLIDAY),
    @XmlEnumValue("federalHoliday")
    FEDERAL_HOLIDAY(DayTypeEnumeration.FEDERAL_HOLIDAY),
    @XmlEnumValue("regionalHoliday")
    REGIONAL_HOLIDAY(DayTypeEnumeration.REGIONAL_HOLIDAY),
    @XmlEnumValue("nationalHoliday")
    NATIONAL_HOLIDAY(DayTypeEnumeration.NATIONAL_HOLIDAY),
    @XmlEnumValue("sundaysAndPublicHolidays")
    SUNDAYS_AND_PUBLIC_HOLIDAYS(DayTypeEnumeration.SUNDAYS_AND_PUBLIC_HOLIDAYS),
    @XmlEnumValue("schoolDays")
    SCHOOL_DAYS(DayTypeEnumeration.SCHOOL_DAYS),
    @XmlEnumValue("everyDay")
    EVERY_DAY(DayTypeEnumeration.EVERY_DAY),
    @XmlEnumValue("undefinedDayType")
    UNDEFINED_DAY_TYPE(DayTypeEnumeration.UNDEFINED_DAY_TYPE);
    private final DayTypeEnumeration value;

    HolidayTypeEnumerationx(DayTypeEnumeration v) {
        value = v;
    }

    public DayTypeEnumeration value() {
        return value;
    }

    public static HolidayTypeEnumerationx fromValue(DayTypeEnumeration v) {
        for (HolidayTypeEnumerationx c: HolidayTypeEnumerationx.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}

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
 * <p>Classe Java per DayTypeEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DayTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="pti34_0"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="pti34_1"/&gt;
 *     &lt;enumeration value="monday"/&gt;
 *     &lt;enumeration value="pti34_2"/&gt;
 *     &lt;enumeration value="tuesday"/&gt;
 *     &lt;enumeration value="pti34_3"/&gt;
 *     &lt;enumeration value="wednesday"/&gt;
 *     &lt;enumeration value="pti34_4"/&gt;
 *     &lt;enumeration value="thursday"/&gt;
 *     &lt;enumeration value="pti34_5"/&gt;
 *     &lt;enumeration value="friday"/&gt;
 *     &lt;enumeration value="pti34_6"/&gt;
 *     &lt;enumeration value="saturday"/&gt;
 *     &lt;enumeration value="pti34_7"/&gt;
 *     &lt;enumeration value="sunday"/&gt;
 *     &lt;enumeration value="pti34_8"/&gt;
 *     &lt;enumeration value="weekdays"/&gt;
 *     &lt;enumeration value="pti34_9"/&gt;
 *     &lt;enumeration value="weekends"/&gt;
 *     &lt;enumeration value="pti34_10"/&gt;
 *     &lt;enumeration value="holiday"/&gt;
 *     &lt;enumeration value="pti34_11"/&gt;
 *     &lt;enumeration value="publicHoliday"/&gt;
 *     &lt;enumeration value="pti34_12"/&gt;
 *     &lt;enumeration value="religiousHoliday"/&gt;
 *     &lt;enumeration value="pti34_13"/&gt;
 *     &lt;enumeration value="federalHoliday"/&gt;
 *     &lt;enumeration value="pti34_14"/&gt;
 *     &lt;enumeration value="regionalHoliday"/&gt;
 *     &lt;enumeration value="pti34_15"/&gt;
 *     &lt;enumeration value="nationalHoliday"/&gt;
 *     &lt;enumeration value="pti34_16"/&gt;
 *     &lt;enumeration value="mondayToFriday"/&gt;
 *     &lt;enumeration value="pti34_17"/&gt;
 *     &lt;enumeration value="mondayToSaturday"/&gt;
 *     &lt;enumeration value="pti34_18"/&gt;
 *     &lt;enumeration value="sundaysAndPublicHolidays"/&gt;
 *     &lt;enumeration value="pti34_19"/&gt;
 *     &lt;enumeration value="schoolDays"/&gt;
 *     &lt;enumeration value="pti34_20"/&gt;
 *     &lt;enumeration value="everyDay"/&gt;
 *     &lt;enumeration value="pti34_255"/&gt;
 *     &lt;enumeration value="undefinedDayType"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DayTypeEnumeration")
@XmlEnum
public enum DayTypeEnumeration {

    @XmlEnumValue("pti34_0")
    PTI_34___0("pti34_0"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pti34_1")
    PTI_34___1("pti34_1"),
    @XmlEnumValue("monday")
    MONDAY("monday"),
    @XmlEnumValue("pti34_2")
    PTI_34___2("pti34_2"),
    @XmlEnumValue("tuesday")
    TUESDAY("tuesday"),
    @XmlEnumValue("pti34_3")
    PTI_34___3("pti34_3"),
    @XmlEnumValue("wednesday")
    WEDNESDAY("wednesday"),
    @XmlEnumValue("pti34_4")
    PTI_34___4("pti34_4"),
    @XmlEnumValue("thursday")
    THURSDAY("thursday"),
    @XmlEnumValue("pti34_5")
    PTI_34___5("pti34_5"),
    @XmlEnumValue("friday")
    FRIDAY("friday"),
    @XmlEnumValue("pti34_6")
    PTI_34___6("pti34_6"),
    @XmlEnumValue("saturday")
    SATURDAY("saturday"),
    @XmlEnumValue("pti34_7")
    PTI_34___7("pti34_7"),
    @XmlEnumValue("sunday")
    SUNDAY("sunday"),
    @XmlEnumValue("pti34_8")
    PTI_34___8("pti34_8"),
    @XmlEnumValue("weekdays")
    WEEKDAYS("weekdays"),
    @XmlEnumValue("pti34_9")
    PTI_34___9("pti34_9"),
    @XmlEnumValue("weekends")
    WEEKENDS("weekends"),
    @XmlEnumValue("pti34_10")
    PTI_34___10("pti34_10"),
    @XmlEnumValue("holiday")
    HOLIDAY("holiday"),
    @XmlEnumValue("pti34_11")
    PTI_34___11("pti34_11"),
    @XmlEnumValue("publicHoliday")
    PUBLIC_HOLIDAY("publicHoliday"),
    @XmlEnumValue("pti34_12")
    PTI_34___12("pti34_12"),
    @XmlEnumValue("religiousHoliday")
    RELIGIOUS_HOLIDAY("religiousHoliday"),
    @XmlEnumValue("pti34_13")
    PTI_34___13("pti34_13"),
    @XmlEnumValue("federalHoliday")
    FEDERAL_HOLIDAY("federalHoliday"),
    @XmlEnumValue("pti34_14")
    PTI_34___14("pti34_14"),
    @XmlEnumValue("regionalHoliday")
    REGIONAL_HOLIDAY("regionalHoliday"),
    @XmlEnumValue("pti34_15")
    PTI_34___15("pti34_15"),
    @XmlEnumValue("nationalHoliday")
    NATIONAL_HOLIDAY("nationalHoliday"),
    @XmlEnumValue("pti34_16")
    PTI_34___16("pti34_16"),
    @XmlEnumValue("mondayToFriday")
    MONDAY_TO_FRIDAY("mondayToFriday"),
    @XmlEnumValue("pti34_17")
    PTI_34___17("pti34_17"),
    @XmlEnumValue("mondayToSaturday")
    MONDAY_TO_SATURDAY("mondayToSaturday"),
    @XmlEnumValue("pti34_18")
    PTI_34___18("pti34_18"),
    @XmlEnumValue("sundaysAndPublicHolidays")
    SUNDAYS_AND_PUBLIC_HOLIDAYS("sundaysAndPublicHolidays"),
    @XmlEnumValue("pti34_19")
    PTI_34___19("pti34_19"),
    @XmlEnumValue("schoolDays")
    SCHOOL_DAYS("schoolDays"),
    @XmlEnumValue("pti34_20")
    PTI_34___20("pti34_20"),
    @XmlEnumValue("everyDay")
    EVERY_DAY("everyDay"),
    @XmlEnumValue("pti34_255")
    PTI_34___255("pti34_255"),
    @XmlEnumValue("undefinedDayType")
    UNDEFINED_DAY_TYPE("undefinedDayType");
    private final String value;

    DayTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DayTypeEnumeration fromValue(String v) {
        for (DayTypeEnumeration c: DayTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

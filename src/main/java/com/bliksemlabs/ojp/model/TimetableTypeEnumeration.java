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
 * <p>Classe Java per TimetableTypeEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TimetableTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="pti33_0"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="pti33_1"/&gt;
 *     &lt;enumeration value="winter"/&gt;
 *     &lt;enumeration value="pti33_2"/&gt;
 *     &lt;enumeration value="spring"/&gt;
 *     &lt;enumeration value="pti33_3"/&gt;
 *     &lt;enumeration value="summer"/&gt;
 *     &lt;enumeration value="pti33_4"/&gt;
 *     &lt;enumeration value="autumn"/&gt;
 *     &lt;enumeration value="pti33_5"/&gt;
 *     &lt;enumeration value="special"/&gt;
 *     &lt;enumeration value="pti33_6"/&gt;
 *     &lt;enumeration value="emergency"/&gt;
 *     &lt;enumeration value="pti33_255"/&gt;
 *     &lt;enumeration value="undefinedTimetableType"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TimetableTypeEnumeration")
@XmlEnum
public enum TimetableTypeEnumeration {

    @XmlEnumValue("pti33_0")
    PTI_33___0("pti33_0"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pti33_1")
    PTI_33___1("pti33_1"),
    @XmlEnumValue("winter")
    WINTER("winter"),
    @XmlEnumValue("pti33_2")
    PTI_33___2("pti33_2"),
    @XmlEnumValue("spring")
    SPRING("spring"),
    @XmlEnumValue("pti33_3")
    PTI_33___3("pti33_3"),
    @XmlEnumValue("summer")
    SUMMER("summer"),
    @XmlEnumValue("pti33_4")
    PTI_33___4("pti33_4"),
    @XmlEnumValue("autumn")
    AUTUMN("autumn"),
    @XmlEnumValue("pti33_5")
    PTI_33___5("pti33_5"),
    @XmlEnumValue("special")
    SPECIAL("special"),
    @XmlEnumValue("pti33_6")
    PTI_33___6("pti33_6"),
    @XmlEnumValue("emergency")
    EMERGENCY("emergency"),
    @XmlEnumValue("pti33_255")
    PTI_33___255("pti33_255"),
    @XmlEnumValue("undefinedTimetableType")
    UNDEFINED_TIMETABLE_TYPE("undefinedTimetableType");
    private final String value;

    TimetableTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TimetableTypeEnumeration fromValue(String v) {
        for (TimetableTypeEnumeration c: TimetableTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

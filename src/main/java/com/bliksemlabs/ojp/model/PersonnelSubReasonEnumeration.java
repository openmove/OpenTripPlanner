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
 * <p>Classe Java per PersonnelSubReasonEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="PersonnelSubReasonEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="staffSickness"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="staffInjury"/&gt;
 *     &lt;enumeration value="contractorStaffInjury"/&gt;
 *     &lt;enumeration value="staffAbsence"/&gt;
 *     &lt;enumeration value="staffInWrongPlace"/&gt;
 *     &lt;enumeration value="staffShortage"/&gt;
 *     &lt;enumeration value="industrialAction"/&gt;
 *     &lt;enumeration value="unofficialIndustrialAction"/&gt;
 *     &lt;enumeration value="workToRule"/&gt;
 *     &lt;enumeration value="undefinedPersonnelProblem"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PersonnelSubReasonEnumeration")
@XmlEnum
public enum PersonnelSubReasonEnumeration {

    @XmlEnumValue("staffSickness")
    STAFF_SICKNESS("staffSickness"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("staffInjury")
    STAFF_INJURY("staffInjury"),
    @XmlEnumValue("contractorStaffInjury")
    CONTRACTOR_STAFF_INJURY("contractorStaffInjury"),
    @XmlEnumValue("staffAbsence")
    STAFF_ABSENCE("staffAbsence"),
    @XmlEnumValue("staffInWrongPlace")
    STAFF_IN_WRONG_PLACE("staffInWrongPlace"),
    @XmlEnumValue("staffShortage")
    STAFF_SHORTAGE("staffShortage"),
    @XmlEnumValue("industrialAction")
    INDUSTRIAL_ACTION("industrialAction"),
    @XmlEnumValue("unofficialIndustrialAction")
    UNOFFICIAL_INDUSTRIAL_ACTION("unofficialIndustrialAction"),
    @XmlEnumValue("workToRule")
    WORK_TO_RULE("workToRule"),
    @XmlEnumValue("undefinedPersonnelProblem")
    UNDEFINED_PERSONNEL_PROBLEM("undefinedPersonnelProblem");
    private final String value;

    PersonnelSubReasonEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PersonnelSubReasonEnumeration fromValue(String v) {
        for (PersonnelSubReasonEnumeration c: PersonnelSubReasonEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

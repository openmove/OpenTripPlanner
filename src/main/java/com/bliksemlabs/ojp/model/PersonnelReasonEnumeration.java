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
 * <p>Classe Java per PersonnelReasonEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="PersonnelReasonEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="pti20_0"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="pti20_1"/&gt;
 *     &lt;enumeration value="staffSickness"/&gt;
 *     &lt;enumeration value="pti20_1_Alias_1"/&gt;
 *     &lt;enumeration value="staffInjury"/&gt;
 *     &lt;enumeration value="pti20_1_Alias_2"/&gt;
 *     &lt;enumeration value="contractorStaffInjury"/&gt;
 *     &lt;enumeration value="pti20_2"/&gt;
 *     &lt;enumeration value="staffAbsence"/&gt;
 *     &lt;enumeration value="pti20_3"/&gt;
 *     &lt;enumeration value="staffInWrongPlace"/&gt;
 *     &lt;enumeration value="pti20_4"/&gt;
 *     &lt;enumeration value="staffShortage"/&gt;
 *     &lt;enumeration value="pti20_5"/&gt;
 *     &lt;enumeration value="industrialAction"/&gt;
 *     &lt;enumeration value="pti20_5_Alias_1"/&gt;
 *     &lt;enumeration value="unofficialIndustrialAction"/&gt;
 *     &lt;enumeration value="pti20_6"/&gt;
 *     &lt;enumeration value="workToRule"/&gt;
 *     &lt;enumeration value="pti20_255"/&gt;
 *     &lt;enumeration value="undefinedPersonnelProblem"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PersonnelReasonEnumeration")
@XmlEnum
public enum PersonnelReasonEnumeration {

    @XmlEnumValue("pti20_0")
    PTI_20___0("pti20_0"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pti20_1")
    PTI_20___1("pti20_1"),
    @XmlEnumValue("staffSickness")
    STAFF_SICKNESS("staffSickness"),
    @XmlEnumValue("pti20_1_Alias_1")
    PTI_20___1___ALIAS___1("pti20_1_Alias_1"),
    @XmlEnumValue("staffInjury")
    STAFF_INJURY("staffInjury"),
    @XmlEnumValue("pti20_1_Alias_2")
    PTI_20___1___ALIAS___2("pti20_1_Alias_2"),
    @XmlEnumValue("contractorStaffInjury")
    CONTRACTOR_STAFF_INJURY("contractorStaffInjury"),
    @XmlEnumValue("pti20_2")
    PTI_20___2("pti20_2"),
    @XmlEnumValue("staffAbsence")
    STAFF_ABSENCE("staffAbsence"),
    @XmlEnumValue("pti20_3")
    PTI_20___3("pti20_3"),
    @XmlEnumValue("staffInWrongPlace")
    STAFF_IN_WRONG_PLACE("staffInWrongPlace"),
    @XmlEnumValue("pti20_4")
    PTI_20___4("pti20_4"),
    @XmlEnumValue("staffShortage")
    STAFF_SHORTAGE("staffShortage"),
    @XmlEnumValue("pti20_5")
    PTI_20___5("pti20_5"),
    @XmlEnumValue("industrialAction")
    INDUSTRIAL_ACTION("industrialAction"),
    @XmlEnumValue("pti20_5_Alias_1")
    PTI_20___5___ALIAS___1("pti20_5_Alias_1"),
    @XmlEnumValue("unofficialIndustrialAction")
    UNOFFICIAL_INDUSTRIAL_ACTION("unofficialIndustrialAction"),
    @XmlEnumValue("pti20_6")
    PTI_20___6("pti20_6"),
    @XmlEnumValue("workToRule")
    WORK_TO_RULE("workToRule"),
    @XmlEnumValue("pti20_255")
    PTI_20___255("pti20_255"),
    @XmlEnumValue("undefinedPersonnelProblem")
    UNDEFINED_PERSONNEL_PROBLEM("undefinedPersonnelProblem");
    private final String value;

    PersonnelReasonEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PersonnelReasonEnumeration fromValue(String v) {
        for (PersonnelReasonEnumeration c: PersonnelReasonEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

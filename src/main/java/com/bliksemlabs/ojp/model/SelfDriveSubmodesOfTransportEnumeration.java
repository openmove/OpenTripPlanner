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
 * <p>Classe Java per SelfDriveSubmodesOfTransportEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="SelfDriveSubmodesOfTransportEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="pti12_0"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="pti12_1"/&gt;
 *     &lt;enumeration value="hireCar"/&gt;
 *     &lt;enumeration value="pti12_2"/&gt;
 *     &lt;enumeration value="hireVan"/&gt;
 *     &lt;enumeration value="pti12_3"/&gt;
 *     &lt;enumeration value="hireMotorbike"/&gt;
 *     &lt;enumeration value="pti12_4"/&gt;
 *     &lt;enumeration value="hireCycle"/&gt;
 *     &lt;enumeration value="pti12_5"/&gt;
 *     &lt;enumeration value="allHireVehicles"/&gt;
 *     &lt;enumeration value="pti12_255"/&gt;
 *     &lt;enumeration value="undefinedHireVehicle"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SelfDriveSubmodesOfTransportEnumeration")
@XmlEnum
public enum SelfDriveSubmodesOfTransportEnumeration {

    @XmlEnumValue("pti12_0")
    PTI_12___0("pti12_0"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pti12_1")
    PTI_12___1("pti12_1"),
    @XmlEnumValue("hireCar")
    HIRE_CAR("hireCar"),
    @XmlEnumValue("pti12_2")
    PTI_12___2("pti12_2"),
    @XmlEnumValue("hireVan")
    HIRE_VAN("hireVan"),
    @XmlEnumValue("pti12_3")
    PTI_12___3("pti12_3"),
    @XmlEnumValue("hireMotorbike")
    HIRE_MOTORBIKE("hireMotorbike"),
    @XmlEnumValue("pti12_4")
    PTI_12___4("pti12_4"),
    @XmlEnumValue("hireCycle")
    HIRE_CYCLE("hireCycle"),
    @XmlEnumValue("pti12_5")
    PTI_12___5("pti12_5"),
    @XmlEnumValue("allHireVehicles")
    ALL_HIRE_VEHICLES("allHireVehicles"),
    @XmlEnumValue("pti12_255")
    PTI_12___255("pti12_255"),
    @XmlEnumValue("undefinedHireVehicle")
    UNDEFINED_HIRE_VEHICLE("undefinedHireVehicle");
    private final String value;

    SelfDriveSubmodesOfTransportEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SelfDriveSubmodesOfTransportEnumeration fromValue(String v) {
        for (SelfDriveSubmodesOfTransportEnumeration c: SelfDriveSubmodesOfTransportEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

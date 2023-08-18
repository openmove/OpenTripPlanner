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
 * <p>Classe Java per TelecabinSubmodesOfTransportEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TelecabinSubmodesOfTransportEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="pti9_0"/&gt;
 *     &lt;enumeration value="loc14_0"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="pti9_1"/&gt;
 *     &lt;enumeration value="loc14_1"/&gt;
 *     &lt;enumeration value="telecabin"/&gt;
 *     &lt;enumeration value="pti9_2"/&gt;
 *     &lt;enumeration value="loc14_3"/&gt;
 *     &lt;enumeration value="cableCar"/&gt;
 *     &lt;enumeration value="pti9_3"/&gt;
 *     &lt;enumeration value="loc14_4"/&gt;
 *     &lt;enumeration value="lift"/&gt;
 *     &lt;enumeration value="pti9_4"/&gt;
 *     &lt;enumeration value="loc14_52"/&gt;
 *     &lt;enumeration value="chairLift"/&gt;
 *     &lt;enumeration value="pti9_5"/&gt;
 *     &lt;enumeration value="loc14_6"/&gt;
 *     &lt;enumeration value="dragLift"/&gt;
 *     &lt;enumeration value="pti9_6"/&gt;
 *     &lt;enumeration value="smallTelecabin"/&gt;
 *     &lt;enumeration value="pti9_7"/&gt;
 *     &lt;enumeration value="allTelecabinServices"/&gt;
 *     &lt;enumeration value="pti9_255"/&gt;
 *     &lt;enumeration value="undefined"/&gt;
 *     &lt;enumeration value="loc14_7"/&gt;
 *     &lt;enumeration value="eggLift"/&gt;
 *     &lt;enumeration value="loc14_8"/&gt;
 *     &lt;enumeration value="mineralBuckets"/&gt;
 *     &lt;enumeration value="loc14_255"/&gt;
 *     &lt;enumeration value="telecabinLink"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TelecabinSubmodesOfTransportEnumeration")
@XmlEnum
public enum TelecabinSubmodesOfTransportEnumeration {

    @XmlEnumValue("pti9_0")
    PTI_9___0("pti9_0"),
    @XmlEnumValue("loc14_0")
    LOC_14___0("loc14_0"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pti9_1")
    PTI_9___1("pti9_1"),
    @XmlEnumValue("loc14_1")
    LOC_14___1("loc14_1"),
    @XmlEnumValue("telecabin")
    TELECABIN("telecabin"),
    @XmlEnumValue("pti9_2")
    PTI_9___2("pti9_2"),
    @XmlEnumValue("loc14_3")
    LOC_14___3("loc14_3"),
    @XmlEnumValue("cableCar")
    CABLE_CAR("cableCar"),
    @XmlEnumValue("pti9_3")
    PTI_9___3("pti9_3"),
    @XmlEnumValue("loc14_4")
    LOC_14___4("loc14_4"),
    @XmlEnumValue("lift")
    LIFT("lift"),
    @XmlEnumValue("pti9_4")
    PTI_9___4("pti9_4"),
    @XmlEnumValue("loc14_52")
    LOC_14___52("loc14_52"),
    @XmlEnumValue("chairLift")
    CHAIR_LIFT("chairLift"),
    @XmlEnumValue("pti9_5")
    PTI_9___5("pti9_5"),
    @XmlEnumValue("loc14_6")
    LOC_14___6("loc14_6"),
    @XmlEnumValue("dragLift")
    DRAG_LIFT("dragLift"),
    @XmlEnumValue("pti9_6")
    PTI_9___6("pti9_6"),
    @XmlEnumValue("smallTelecabin")
    SMALL_TELECABIN("smallTelecabin"),
    @XmlEnumValue("pti9_7")
    PTI_9___7("pti9_7"),
    @XmlEnumValue("allTelecabinServices")
    ALL_TELECABIN_SERVICES("allTelecabinServices"),
    @XmlEnumValue("pti9_255")
    PTI_9___255("pti9_255"),
    @XmlEnumValue("undefined")
    UNDEFINED("undefined"),
    @XmlEnumValue("loc14_7")
    LOC_14___7("loc14_7"),
    @XmlEnumValue("eggLift")
    EGG_LIFT("eggLift"),
    @XmlEnumValue("loc14_8")
    LOC_14___8("loc14_8"),
    @XmlEnumValue("mineralBuckets")
    MINERAL_BUCKETS("mineralBuckets"),
    @XmlEnumValue("loc14_255")
    LOC_14___255("loc14_255"),
    @XmlEnumValue("telecabinLink")
    TELECABIN_LINK("telecabinLink");
    private final String value;

    TelecabinSubmodesOfTransportEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TelecabinSubmodesOfTransportEnumeration fromValue(String v) {
        for (TelecabinSubmodesOfTransportEnumeration c: TelecabinSubmodesOfTransportEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

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
 * <p>Classe Java per ServiceConditionEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ServiceConditionEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="pti13_0"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="pti13_1"/&gt;
 *     &lt;enumeration value="altered"/&gt;
 *     &lt;enumeration value="pti13_2"/&gt;
 *     &lt;enumeration value="cancelled"/&gt;
 *     &lt;enumeration value="pti13_3"/&gt;
 *     &lt;enumeration value="delayed"/&gt;
 *     &lt;enumeration value="pti13_4"/&gt;
 *     &lt;enumeration value="diverted"/&gt;
 *     &lt;enumeration value="pti13_5"/&gt;
 *     &lt;enumeration value="noService"/&gt;
 *     &lt;enumeration value="pti13_6"/&gt;
 *     &lt;enumeration value="disrupted"/&gt;
 *     &lt;enumeration value="pti13_7"/&gt;
 *     &lt;enumeration value="additionalService"/&gt;
 *     &lt;enumeration value="pti13_8"/&gt;
 *     &lt;enumeration value="specialService"/&gt;
 *     &lt;enumeration value="pti13_9"/&gt;
 *     &lt;enumeration value="onTime"/&gt;
 *     &lt;enumeration value="pti13_10"/&gt;
 *     &lt;enumeration value="normalService"/&gt;
 *     &lt;enumeration value="pti13_11"/&gt;
 *     &lt;enumeration value="intermittentService"/&gt;
 *     &lt;enumeration value="pti13_12"/&gt;
 *     &lt;enumeration value="shortFormedService"/&gt;
 *     &lt;enumeration value="pti13_13"/&gt;
 *     &lt;enumeration value="fullLengthService"/&gt;
 *     &lt;enumeration value="pti13_14"/&gt;
 *     &lt;enumeration value="extendedService"/&gt;
 *     &lt;enumeration value="pti13_15"/&gt;
 *     &lt;enumeration value="splittingTrain"/&gt;
 *     &lt;enumeration value="pti13_16"/&gt;
 *     &lt;enumeration value="replacementTransport"/&gt;
 *     &lt;enumeration value="pti13_17"/&gt;
 *     &lt;enumeration value="arrivesEarly"/&gt;
 *     &lt;enumeration value="pti13_18"/&gt;
 *     &lt;enumeration value="shuttleService"/&gt;
 *     &lt;enumeration value="pti13_19"/&gt;
 *     &lt;enumeration value="replacementService"/&gt;
 *     &lt;enumeration value="pti13_255"/&gt;
 *     &lt;enumeration value="undefinedServiceInformation"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ServiceConditionEnumeration")
@XmlEnum
public enum ServiceConditionEnumeration {

    @XmlEnumValue("pti13_0")
    PTI_13___0("pti13_0"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pti13_1")
    PTI_13___1("pti13_1"),
    @XmlEnumValue("altered")
    ALTERED("altered"),
    @XmlEnumValue("pti13_2")
    PTI_13___2("pti13_2"),
    @XmlEnumValue("cancelled")
    CANCELLED("cancelled"),
    @XmlEnumValue("pti13_3")
    PTI_13___3("pti13_3"),
    @XmlEnumValue("delayed")
    DELAYED("delayed"),
    @XmlEnumValue("pti13_4")
    PTI_13___4("pti13_4"),
    @XmlEnumValue("diverted")
    DIVERTED("diverted"),
    @XmlEnumValue("pti13_5")
    PTI_13___5("pti13_5"),
    @XmlEnumValue("noService")
    NO_SERVICE("noService"),
    @XmlEnumValue("pti13_6")
    PTI_13___6("pti13_6"),
    @XmlEnumValue("disrupted")
    DISRUPTED("disrupted"),
    @XmlEnumValue("pti13_7")
    PTI_13___7("pti13_7"),
    @XmlEnumValue("additionalService")
    ADDITIONAL_SERVICE("additionalService"),
    @XmlEnumValue("pti13_8")
    PTI_13___8("pti13_8"),
    @XmlEnumValue("specialService")
    SPECIAL_SERVICE("specialService"),
    @XmlEnumValue("pti13_9")
    PTI_13___9("pti13_9"),
    @XmlEnumValue("onTime")
    ON_TIME("onTime"),
    @XmlEnumValue("pti13_10")
    PTI_13___10("pti13_10"),
    @XmlEnumValue("normalService")
    NORMAL_SERVICE("normalService"),
    @XmlEnumValue("pti13_11")
    PTI_13___11("pti13_11"),
    @XmlEnumValue("intermittentService")
    INTERMITTENT_SERVICE("intermittentService"),
    @XmlEnumValue("pti13_12")
    PTI_13___12("pti13_12"),
    @XmlEnumValue("shortFormedService")
    SHORT_FORMED_SERVICE("shortFormedService"),
    @XmlEnumValue("pti13_13")
    PTI_13___13("pti13_13"),
    @XmlEnumValue("fullLengthService")
    FULL_LENGTH_SERVICE("fullLengthService"),
    @XmlEnumValue("pti13_14")
    PTI_13___14("pti13_14"),
    @XmlEnumValue("extendedService")
    EXTENDED_SERVICE("extendedService"),
    @XmlEnumValue("pti13_15")
    PTI_13___15("pti13_15"),
    @XmlEnumValue("splittingTrain")
    SPLITTING_TRAIN("splittingTrain"),
    @XmlEnumValue("pti13_16")
    PTI_13___16("pti13_16"),
    @XmlEnumValue("replacementTransport")
    REPLACEMENT_TRANSPORT("replacementTransport"),
    @XmlEnumValue("pti13_17")
    PTI_13___17("pti13_17"),
    @XmlEnumValue("arrivesEarly")
    ARRIVES_EARLY("arrivesEarly"),
    @XmlEnumValue("pti13_18")
    PTI_13___18("pti13_18"),
    @XmlEnumValue("shuttleService")
    SHUTTLE_SERVICE("shuttleService"),
    @XmlEnumValue("pti13_19")
    PTI_13___19("pti13_19"),
    @XmlEnumValue("replacementService")
    REPLACEMENT_SERVICE("replacementService"),
    @XmlEnumValue("pti13_255")
    PTI_13___255("pti13_255"),
    @XmlEnumValue("undefinedServiceInformation")
    UNDEFINED_SERVICE_INFORMATION("undefinedServiceInformation");
    private final String value;

    ServiceConditionEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ServiceConditionEnumeration fromValue(String v) {
        for (ServiceConditionEnumeration c: ServiceConditionEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

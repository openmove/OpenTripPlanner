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
 * <p>Classe Java per BusSubmodesOfTransportEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="BusSubmodesOfTransportEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="pti5_0"/&gt;
 *     &lt;enumeration value="loc10_0"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="pti5_1"/&gt;
 *     &lt;enumeration value="loc10_6"/&gt;
 *     &lt;enumeration value="regionalBus"/&gt;
 *     &lt;enumeration value="pti5_2"/&gt;
 *     &lt;enumeration value="loc10_1"/&gt;
 *     &lt;enumeration value="expressBus"/&gt;
 *     &lt;enumeration value="pti5_3"/&gt;
 *     &lt;enumeration value="bus"/&gt;
 *     &lt;enumeration value="pti5_4"/&gt;
 *     &lt;enumeration value="loc10_5"/&gt;
 *     &lt;enumeration value="localBusService"/&gt;
 *     &lt;enumeration value="pti5_5"/&gt;
 *     &lt;enumeration value="loc10_2"/&gt;
 *     &lt;enumeration value="nightBus"/&gt;
 *     &lt;enumeration value="pti5_6"/&gt;
 *     &lt;enumeration value="loc10_4"/&gt;
 *     &lt;enumeration value="postBus"/&gt;
 *     &lt;enumeration value="pti5_7"/&gt;
 *     &lt;enumeration value="loc10_8"/&gt;
 *     &lt;enumeration value="specialNeedsBus"/&gt;
 *     &lt;enumeration value="pti5_8"/&gt;
 *     &lt;enumeration value="mobilityBus"/&gt;
 *     &lt;enumeration value="pti5_9"/&gt;
 *     &lt;enumeration value="mobilityBusForRegisteredDisabled"/&gt;
 *     &lt;enumeration value="pti5_10"/&gt;
 *     &lt;enumeration value="loc10_9"/&gt;
 *     &lt;enumeration value="sightseeingBus"/&gt;
 *     &lt;enumeration value="pti5_11"/&gt;
 *     &lt;enumeration value="shuttleBus"/&gt;
 *     &lt;enumeration value="pti5_12"/&gt;
 *     &lt;enumeration value="loc10_7"/&gt;
 *     &lt;enumeration value="schoolBus"/&gt;
 *     &lt;enumeration value="pti5_13"/&gt;
 *     &lt;enumeration value="loc10_13"/&gt;
 *     &lt;enumeration value="schoolAndPublicServiceBus"/&gt;
 *     &lt;enumeration value="pti5_14"/&gt;
 *     &lt;enumeration value="railReplacementBus"/&gt;
 *     &lt;enumeration value="pti5_15"/&gt;
 *     &lt;enumeration value="demandAndResponseBus"/&gt;
 *     &lt;enumeration value="pti5_16"/&gt;
 *     &lt;enumeration value="allBusServices"/&gt;
 *     &lt;enumeration value="loc_10"/&gt;
 *     &lt;enumeration value="airportLinkBus"/&gt;
 *     &lt;enumeration value="pti5_255"/&gt;
 *     &lt;enumeration value="loc10_255"/&gt;
 *     &lt;enumeration value="undefined"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BusSubmodesOfTransportEnumeration")
@XmlEnum
public enum BusSubmodesOfTransportEnumeration {

    @XmlEnumValue("pti5_0")
    PTI_5___0("pti5_0"),
    @XmlEnumValue("loc10_0")
    LOC_10___0("loc10_0"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pti5_1")
    PTI_5___1("pti5_1"),
    @XmlEnumValue("loc10_6")
    LOC_10___6("loc10_6"),
    @XmlEnumValue("regionalBus")
    REGIONAL_BUS("regionalBus"),
    @XmlEnumValue("pti5_2")
    PTI_5___2("pti5_2"),
    @XmlEnumValue("loc10_1")
    LOC_10___1("loc10_1"),
    @XmlEnumValue("expressBus")
    EXPRESS_BUS("expressBus"),
    @XmlEnumValue("pti5_3")
    PTI_5___3("pti5_3"),
    @XmlEnumValue("bus")
    BUS("bus"),
    @XmlEnumValue("pti5_4")
    PTI_5___4("pti5_4"),
    @XmlEnumValue("loc10_5")
    LOC_10___5("loc10_5"),
    @XmlEnumValue("localBusService")
    LOCAL_BUS_SERVICE("localBusService"),
    @XmlEnumValue("pti5_5")
    PTI_5___5("pti5_5"),
    @XmlEnumValue("loc10_2")
    LOC_10___2("loc10_2"),
    @XmlEnumValue("nightBus")
    NIGHT_BUS("nightBus"),
    @XmlEnumValue("pti5_6")
    PTI_5___6("pti5_6"),
    @XmlEnumValue("loc10_4")
    LOC_10___4("loc10_4"),
    @XmlEnumValue("postBus")
    POST_BUS("postBus"),
    @XmlEnumValue("pti5_7")
    PTI_5___7("pti5_7"),
    @XmlEnumValue("loc10_8")
    LOC_10___8("loc10_8"),
    @XmlEnumValue("specialNeedsBus")
    SPECIAL_NEEDS_BUS("specialNeedsBus"),
    @XmlEnumValue("pti5_8")
    PTI_5___8("pti5_8"),
    @XmlEnumValue("mobilityBus")
    MOBILITY_BUS("mobilityBus"),
    @XmlEnumValue("pti5_9")
    PTI_5___9("pti5_9"),
    @XmlEnumValue("mobilityBusForRegisteredDisabled")
    MOBILITY_BUS_FOR_REGISTERED_DISABLED("mobilityBusForRegisteredDisabled"),
    @XmlEnumValue("pti5_10")
    PTI_5___10("pti5_10"),
    @XmlEnumValue("loc10_9")
    LOC_10___9("loc10_9"),
    @XmlEnumValue("sightseeingBus")
    SIGHTSEEING_BUS("sightseeingBus"),
    @XmlEnumValue("pti5_11")
    PTI_5___11("pti5_11"),
    @XmlEnumValue("shuttleBus")
    SHUTTLE_BUS("shuttleBus"),
    @XmlEnumValue("pti5_12")
    PTI_5___12("pti5_12"),
    @XmlEnumValue("loc10_7")
    LOC_10___7("loc10_7"),
    @XmlEnumValue("schoolBus")
    SCHOOL_BUS("schoolBus"),
    @XmlEnumValue("pti5_13")
    PTI_5___13("pti5_13"),
    @XmlEnumValue("loc10_13")
    LOC_10___13("loc10_13"),
    @XmlEnumValue("schoolAndPublicServiceBus")
    SCHOOL_AND_PUBLIC_SERVICE_BUS("schoolAndPublicServiceBus"),
    @XmlEnumValue("pti5_14")
    PTI_5___14("pti5_14"),
    @XmlEnumValue("railReplacementBus")
    RAIL_REPLACEMENT_BUS("railReplacementBus"),
    @XmlEnumValue("pti5_15")
    PTI_5___15("pti5_15"),
    @XmlEnumValue("demandAndResponseBus")
    DEMAND_AND_RESPONSE_BUS("demandAndResponseBus"),
    @XmlEnumValue("pti5_16")
    PTI_5___16("pti5_16"),
    @XmlEnumValue("allBusServices")
    ALL_BUS_SERVICES("allBusServices"),
    @XmlEnumValue("loc_10")
    LOC___10("loc_10"),
    @XmlEnumValue("airportLinkBus")
    AIRPORT_LINK_BUS("airportLinkBus"),
    @XmlEnumValue("pti5_255")
    PTI_5___255("pti5_255"),
    @XmlEnumValue("loc10_255")
    LOC_10___255("loc10_255"),
    @XmlEnumValue("undefined")
    UNDEFINED("undefined");
    private final String value;

    BusSubmodesOfTransportEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BusSubmodesOfTransportEnumeration fromValue(String v) {
        for (BusSubmodesOfTransportEnumeration c: BusSubmodesOfTransportEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

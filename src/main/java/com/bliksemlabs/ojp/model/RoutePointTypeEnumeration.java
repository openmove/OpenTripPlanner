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
 * <p>Classe Java per RoutePointTypeEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="RoutePointTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="pti15_0"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="pti15_1"/&gt;
 *     &lt;enumeration value="startPoint"/&gt;
 *     &lt;enumeration value="pti15_2"/&gt;
 *     &lt;enumeration value="destination"/&gt;
 *     &lt;enumeration value="pti15_3"/&gt;
 *     &lt;enumeration value="stop"/&gt;
 *     &lt;enumeration value="pti15_4"/&gt;
 *     &lt;enumeration value="via"/&gt;
 *     &lt;enumeration value="pti15_5"/&gt;
 *     &lt;enumeration value="notStopping"/&gt;
 *     &lt;enumeration value="pti15_6"/&gt;
 *     &lt;enumeration value="temporaryStop"/&gt;
 *     &lt;enumeration value="pti15_7"/&gt;
 *     &lt;enumeration value="temporarilyNotStopping"/&gt;
 *     &lt;enumeration value="pti15_8"/&gt;
 *     &lt;enumeration value="exceptionalStop"/&gt;
 *     &lt;enumeration value="pti15_9"/&gt;
 *     &lt;enumeration value="additionalStop"/&gt;
 *     &lt;enumeration value="pti15_10"/&gt;
 *     &lt;enumeration value="requestStop"/&gt;
 *     &lt;enumeration value="pti15_11"/&gt;
 *     &lt;enumeration value="frontTrainDestination"/&gt;
 *     &lt;enumeration value="pti15_12"/&gt;
 *     &lt;enumeration value="rearTrainDestination"/&gt;
 *     &lt;enumeration value="pti15_13"/&gt;
 *     &lt;enumeration value="throughServiceDestination"/&gt;
 *     &lt;enumeration value="pti15_14"/&gt;
 *     &lt;enumeration value="notVia"/&gt;
 *     &lt;enumeration value="pti15_15"/&gt;
 *     &lt;enumeration value="alteredStartPoint"/&gt;
 *     &lt;enumeration value="pti15_16"/&gt;
 *     &lt;enumeration value="alteredDestination"/&gt;
 *     &lt;enumeration value="pti15_255"/&gt;
 *     &lt;enumeration value="undefinedRoutePoint"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RoutePointTypeEnumeration")
@XmlEnum
public enum RoutePointTypeEnumeration {

    @XmlEnumValue("pti15_0")
    PTI_15___0("pti15_0"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pti15_1")
    PTI_15___1("pti15_1"),
    @XmlEnumValue("startPoint")
    START_POINT("startPoint"),
    @XmlEnumValue("pti15_2")
    PTI_15___2("pti15_2"),
    @XmlEnumValue("destination")
    DESTINATION("destination"),
    @XmlEnumValue("pti15_3")
    PTI_15___3("pti15_3"),
    @XmlEnumValue("stop")
    STOP("stop"),
    @XmlEnumValue("pti15_4")
    PTI_15___4("pti15_4"),
    @XmlEnumValue("via")
    VIA("via"),
    @XmlEnumValue("pti15_5")
    PTI_15___5("pti15_5"),
    @XmlEnumValue("notStopping")
    NOT_STOPPING("notStopping"),
    @XmlEnumValue("pti15_6")
    PTI_15___6("pti15_6"),
    @XmlEnumValue("temporaryStop")
    TEMPORARY_STOP("temporaryStop"),
    @XmlEnumValue("pti15_7")
    PTI_15___7("pti15_7"),
    @XmlEnumValue("temporarilyNotStopping")
    TEMPORARILY_NOT_STOPPING("temporarilyNotStopping"),
    @XmlEnumValue("pti15_8")
    PTI_15___8("pti15_8"),
    @XmlEnumValue("exceptionalStop")
    EXCEPTIONAL_STOP("exceptionalStop"),
    @XmlEnumValue("pti15_9")
    PTI_15___9("pti15_9"),
    @XmlEnumValue("additionalStop")
    ADDITIONAL_STOP("additionalStop"),
    @XmlEnumValue("pti15_10")
    PTI_15___10("pti15_10"),
    @XmlEnumValue("requestStop")
    REQUEST_STOP("requestStop"),
    @XmlEnumValue("pti15_11")
    PTI_15___11("pti15_11"),
    @XmlEnumValue("frontTrainDestination")
    FRONT_TRAIN_DESTINATION("frontTrainDestination"),
    @XmlEnumValue("pti15_12")
    PTI_15___12("pti15_12"),
    @XmlEnumValue("rearTrainDestination")
    REAR_TRAIN_DESTINATION("rearTrainDestination"),
    @XmlEnumValue("pti15_13")
    PTI_15___13("pti15_13"),
    @XmlEnumValue("throughServiceDestination")
    THROUGH_SERVICE_DESTINATION("throughServiceDestination"),
    @XmlEnumValue("pti15_14")
    PTI_15___14("pti15_14"),
    @XmlEnumValue("notVia")
    NOT_VIA("notVia"),
    @XmlEnumValue("pti15_15")
    PTI_15___15("pti15_15"),
    @XmlEnumValue("alteredStartPoint")
    ALTERED_START_POINT("alteredStartPoint"),
    @XmlEnumValue("pti15_16")
    PTI_15___16("pti15_16"),
    @XmlEnumValue("alteredDestination")
    ALTERED_DESTINATION("alteredDestination"),
    @XmlEnumValue("pti15_255")
    PTI_15___255("pti15_255"),
    @XmlEnumValue("undefinedRoutePoint")
    UNDEFINED_ROUTE_POINT("undefinedRoutePoint");
    private final String value;

    RoutePointTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoutePointTypeEnumeration fromValue(String v) {
        for (RoutePointTypeEnumeration c: RoutePointTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

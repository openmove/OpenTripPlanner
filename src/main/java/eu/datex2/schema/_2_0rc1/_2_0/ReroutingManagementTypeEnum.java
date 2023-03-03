//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ReroutingManagementTypeEnum.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ReroutingManagementTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="doNotFollowDiversionSigns"/&gt;
 *     &lt;enumeration value="doNotUseEntry"/&gt;
 *     &lt;enumeration value="doNotUseExit"/&gt;
 *     &lt;enumeration value="doNotUseIntersectionOrJunction"/&gt;
 *     &lt;enumeration value="followDiversionSigns"/&gt;
 *     &lt;enumeration value="followLocalDiversion"/&gt;
 *     &lt;enumeration value="followSpecialMarkers"/&gt;
 *     &lt;enumeration value="useEntry"/&gt;
 *     &lt;enumeration value="useExit"/&gt;
 *     &lt;enumeration value="useIntersectionOrJunction"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReroutingManagementTypeEnum")
@XmlEnum
public enum ReroutingManagementTypeEnum {

    @XmlEnumValue("doNotFollowDiversionSigns")
    DO_NOT_FOLLOW_DIVERSION_SIGNS("doNotFollowDiversionSigns"),
    @XmlEnumValue("doNotUseEntry")
    DO_NOT_USE_ENTRY("doNotUseEntry"),
    @XmlEnumValue("doNotUseExit")
    DO_NOT_USE_EXIT("doNotUseExit"),
    @XmlEnumValue("doNotUseIntersectionOrJunction")
    DO_NOT_USE_INTERSECTION_OR_JUNCTION("doNotUseIntersectionOrJunction"),
    @XmlEnumValue("followDiversionSigns")
    FOLLOW_DIVERSION_SIGNS("followDiversionSigns"),
    @XmlEnumValue("followLocalDiversion")
    FOLLOW_LOCAL_DIVERSION("followLocalDiversion"),
    @XmlEnumValue("followSpecialMarkers")
    FOLLOW_SPECIAL_MARKERS("followSpecialMarkers"),
    @XmlEnumValue("useEntry")
    USE_ENTRY("useEntry"),
    @XmlEnumValue("useExit")
    USE_EXIT("useExit"),
    @XmlEnumValue("useIntersectionOrJunction")
    USE_INTERSECTION_OR_JUNCTION("useIntersectionOrJunction");
    private final String value;

    ReroutingManagementTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReroutingManagementTypeEnum fromValue(String v) {
        for (ReroutingManagementTypeEnum c: ReroutingManagementTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

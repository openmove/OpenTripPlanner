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
 * <p>Classe Java per CarriagewayEnum.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="CarriagewayEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="connectingCarriageway"/&gt;
 *     &lt;enumeration value="entrySlipRoad"/&gt;
 *     &lt;enumeration value="exitSlipRoad"/&gt;
 *     &lt;enumeration value="flyover"/&gt;
 *     &lt;enumeration value="leftHandFeederRoad"/&gt;
 *     &lt;enumeration value="leftHandParallelCarriageway"/&gt;
 *     &lt;enumeration value="mainCarriageway"/&gt;
 *     &lt;enumeration value="oppositeCarriageway"/&gt;
 *     &lt;enumeration value="parallelCarriageway"/&gt;
 *     &lt;enumeration value="rightHandFeederRoad"/&gt;
 *     &lt;enumeration value="rightHandParallelCarriageway"/&gt;
 *     &lt;enumeration value="serviceRoad"/&gt;
 *     &lt;enumeration value="slipRoads"/&gt;
 *     &lt;enumeration value="underpass"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CarriagewayEnum")
@XmlEnum
public enum CarriagewayEnum {

    @XmlEnumValue("connectingCarriageway")
    CONNECTING_CARRIAGEWAY("connectingCarriageway"),
    @XmlEnumValue("entrySlipRoad")
    ENTRY_SLIP_ROAD("entrySlipRoad"),
    @XmlEnumValue("exitSlipRoad")
    EXIT_SLIP_ROAD("exitSlipRoad"),
    @XmlEnumValue("flyover")
    FLYOVER("flyover"),
    @XmlEnumValue("leftHandFeederRoad")
    LEFT_HAND_FEEDER_ROAD("leftHandFeederRoad"),
    @XmlEnumValue("leftHandParallelCarriageway")
    LEFT_HAND_PARALLEL_CARRIAGEWAY("leftHandParallelCarriageway"),
    @XmlEnumValue("mainCarriageway")
    MAIN_CARRIAGEWAY("mainCarriageway"),
    @XmlEnumValue("oppositeCarriageway")
    OPPOSITE_CARRIAGEWAY("oppositeCarriageway"),
    @XmlEnumValue("parallelCarriageway")
    PARALLEL_CARRIAGEWAY("parallelCarriageway"),
    @XmlEnumValue("rightHandFeederRoad")
    RIGHT_HAND_FEEDER_ROAD("rightHandFeederRoad"),
    @XmlEnumValue("rightHandParallelCarriageway")
    RIGHT_HAND_PARALLEL_CARRIAGEWAY("rightHandParallelCarriageway"),
    @XmlEnumValue("serviceRoad")
    SERVICE_ROAD("serviceRoad"),
    @XmlEnumValue("slipRoads")
    SLIP_ROADS("slipRoads"),
    @XmlEnumValue("underpass")
    UNDERPASS("underpass");
    private final String value;

    CarriagewayEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CarriagewayEnum fromValue(String v) {
        for (CarriagewayEnum c: CarriagewayEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package uk.org.ifopt.ifopt;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per BoardingPositionTypeEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="BoardingPositionTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="doorFromAirlineGate"/&gt;
 *     &lt;enumeration value="positionOnRailPlatform"/&gt;
 *     &lt;enumeration value="positionOnMetroPlatform"/&gt;
 *     &lt;enumeration value="positionAtCoachStop"/&gt;
 *     &lt;enumeration value="positionAtBusStop"/&gt;
 *     &lt;enumeration value="boatGangway"/&gt;
 *     &lt;enumeration value="ferryGangway"/&gt;
 *     &lt;enumeration value="telecabinePlatfrom"/&gt;
 *     &lt;enumeration value="setDownPoint"/&gt;
 *     &lt;enumeration value="taxiBay"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BoardingPositionTypeEnumeration")
@XmlEnum
public enum BoardingPositionTypeEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("doorFromAirlineGate")
    DOOR_FROM_AIRLINE_GATE("doorFromAirlineGate"),
    @XmlEnumValue("positionOnRailPlatform")
    POSITION_ON_RAIL_PLATFORM("positionOnRailPlatform"),
    @XmlEnumValue("positionOnMetroPlatform")
    POSITION_ON_METRO_PLATFORM("positionOnMetroPlatform"),
    @XmlEnumValue("positionAtCoachStop")
    POSITION_AT_COACH_STOP("positionAtCoachStop"),
    @XmlEnumValue("positionAtBusStop")
    POSITION_AT_BUS_STOP("positionAtBusStop"),
    @XmlEnumValue("boatGangway")
    BOAT_GANGWAY("boatGangway"),
    @XmlEnumValue("ferryGangway")
    FERRY_GANGWAY("ferryGangway"),
    @XmlEnumValue("telecabinePlatfrom")
    TELECABINE_PLATFROM("telecabinePlatfrom"),
    @XmlEnumValue("setDownPoint")
    SET_DOWN_POINT("setDownPoint"),
    @XmlEnumValue("taxiBay")
    TAXI_BAY("taxiBay"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    BoardingPositionTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BoardingPositionTypeEnumeration fromValue(String v) {
        for (BoardingPositionTypeEnumeration c: BoardingPositionTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

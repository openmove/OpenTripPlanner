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
 * <p>Classe Java per TpegLoc02DirectionTypeEnum.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TpegLoc02DirectionTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="allDirections"/&gt;
 *     &lt;enumeration value="anticlockwise"/&gt;
 *     &lt;enumeration value="bothWays"/&gt;
 *     &lt;enumeration value="clockwise"/&gt;
 *     &lt;enumeration value="eastBound"/&gt;
 *     &lt;enumeration value="innerRing"/&gt;
 *     &lt;enumeration value="northBound"/&gt;
 *     &lt;enumeration value="northEastBound"/&gt;
 *     &lt;enumeration value="northWestBound"/&gt;
 *     &lt;enumeration value="opposite"/&gt;
 *     &lt;enumeration value="outerRing"/&gt;
 *     &lt;enumeration value="southBound"/&gt;
 *     &lt;enumeration value="southEastBound"/&gt;
 *     &lt;enumeration value="southWestBound"/&gt;
 *     &lt;enumeration value="westBound"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TpegLoc02DirectionTypeEnum")
@XmlEnum
public enum TpegLoc02DirectionTypeEnum {

    @XmlEnumValue("allDirections")
    ALL_DIRECTIONS("allDirections"),
    @XmlEnumValue("anticlockwise")
    ANTICLOCKWISE("anticlockwise"),
    @XmlEnumValue("bothWays")
    BOTH_WAYS("bothWays"),
    @XmlEnumValue("clockwise")
    CLOCKWISE("clockwise"),
    @XmlEnumValue("eastBound")
    EAST_BOUND("eastBound"),
    @XmlEnumValue("innerRing")
    INNER_RING("innerRing"),
    @XmlEnumValue("northBound")
    NORTH_BOUND("northBound"),
    @XmlEnumValue("northEastBound")
    NORTH_EAST_BOUND("northEastBound"),
    @XmlEnumValue("northWestBound")
    NORTH_WEST_BOUND("northWestBound"),
    @XmlEnumValue("opposite")
    OPPOSITE("opposite"),
    @XmlEnumValue("outerRing")
    OUTER_RING("outerRing"),
    @XmlEnumValue("southBound")
    SOUTH_BOUND("southBound"),
    @XmlEnumValue("southEastBound")
    SOUTH_EAST_BOUND("southEastBound"),
    @XmlEnumValue("southWestBound")
    SOUTH_WEST_BOUND("southWestBound"),
    @XmlEnumValue("westBound")
    WEST_BOUND("westBound"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    TpegLoc02DirectionTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TpegLoc02DirectionTypeEnum fromValue(String v) {
        for (TpegLoc02DirectionTypeEnum c: TpegLoc02DirectionTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

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
 * <p>Classe Java per AccessSpaceTypeEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="AccessSpaceTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="concours"/&gt;
 *     &lt;enumeration value="bookingHall"/&gt;
 *     &lt;enumeration value="forecourt"/&gt;
 *     &lt;enumeration value="underpass"/&gt;
 *     &lt;enumeration value="overpass"/&gt;
 *     &lt;enumeration value="passage"/&gt;
 *     &lt;enumeration value="passageSection"/&gt;
 *     &lt;enumeration value="gallery"/&gt;
 *     &lt;enumeration value="garage"/&gt;
 *     &lt;enumeration value="shop"/&gt;
 *     &lt;enumeration value="waitingRoom"/&gt;
 *     &lt;enumeration value="restaurant"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AccessSpaceTypeEnumeration")
@XmlEnum
public enum AccessSpaceTypeEnumeration {

    @XmlEnumValue("concours")
    CONCOURS("concours"),
    @XmlEnumValue("bookingHall")
    BOOKING_HALL("bookingHall"),
    @XmlEnumValue("forecourt")
    FORECOURT("forecourt"),
    @XmlEnumValue("underpass")
    UNDERPASS("underpass"),
    @XmlEnumValue("overpass")
    OVERPASS("overpass"),
    @XmlEnumValue("passage")
    PASSAGE("passage"),
    @XmlEnumValue("passageSection")
    PASSAGE_SECTION("passageSection"),
    @XmlEnumValue("gallery")
    GALLERY("gallery"),
    @XmlEnumValue("garage")
    GARAGE("garage"),
    @XmlEnumValue("shop")
    SHOP("shop"),
    @XmlEnumValue("waitingRoom")
    WAITING_ROOM("waitingRoom"),
    @XmlEnumValue("restaurant")
    RESTAURANT("restaurant"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    AccessSpaceTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccessSpaceTypeEnumeration fromValue(String v) {
        for (AccessSpaceTypeEnumeration c: AccessSpaceTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

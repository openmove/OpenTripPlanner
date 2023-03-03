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
 * <p>Classe Java per StopPlaceTypeEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="StopPlaceTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="airport"/&gt;
 *     &lt;enumeration value="railStation"/&gt;
 *     &lt;enumeration value="metroStation"/&gt;
 *     &lt;enumeration value="coachStation"/&gt;
 *     &lt;enumeration value="busStation"/&gt;
 *     &lt;enumeration value="harbourPort"/&gt;
 *     &lt;enumeration value="ferrytPort"/&gt;
 *     &lt;enumeration value="ferryStop"/&gt;
 *     &lt;enumeration value="onStreetBus"/&gt;
 *     &lt;enumeration value="onStreetTram"/&gt;
 *     &lt;enumeration value="skiLift"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StopPlaceTypeEnumeration")
@XmlEnum
public enum StopPlaceTypeEnumeration {

    @XmlEnumValue("airport")
    AIRPORT("airport"),
    @XmlEnumValue("railStation")
    RAIL_STATION("railStation"),
    @XmlEnumValue("metroStation")
    METRO_STATION("metroStation"),
    @XmlEnumValue("coachStation")
    COACH_STATION("coachStation"),
    @XmlEnumValue("busStation")
    BUS_STATION("busStation"),
    @XmlEnumValue("harbourPort")
    HARBOUR_PORT("harbourPort"),
    @XmlEnumValue("ferrytPort")
    FERRYT_PORT("ferrytPort"),
    @XmlEnumValue("ferryStop")
    FERRY_STOP("ferryStop"),
    @XmlEnumValue("onStreetBus")
    ON_STREET_BUS("onStreetBus"),
    @XmlEnumValue("onStreetTram")
    ON_STREET_TRAM("onStreetTram"),
    @XmlEnumValue("skiLift")
    SKI_LIFT("skiLift"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    StopPlaceTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StopPlaceTypeEnumeration fromValue(String v) {
        for (StopPlaceTypeEnumeration c: StopPlaceTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

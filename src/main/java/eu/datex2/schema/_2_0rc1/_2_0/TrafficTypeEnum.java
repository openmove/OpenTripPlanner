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
 * <p>Classe Java per TrafficTypeEnum.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TrafficTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="accessOnlyTraffic"/&gt;
 *     &lt;enumeration value="destinedForAirport"/&gt;
 *     &lt;enumeration value="destinedForAirportArrivals"/&gt;
 *     &lt;enumeration value="destinedForAirportDepartures"/&gt;
 *     &lt;enumeration value="destinedForFerryService"/&gt;
 *     &lt;enumeration value="destinedForRailService"/&gt;
 *     &lt;enumeration value="holidayTraffic"/&gt;
 *     &lt;enumeration value="localTraffic"/&gt;
 *     &lt;enumeration value="longDistanceTraffic"/&gt;
 *     &lt;enumeration value="regionalTraffic"/&gt;
 *     &lt;enumeration value="residentsOnlyTraffic"/&gt;
 *     &lt;enumeration value="throughTraffic"/&gt;
 *     &lt;enumeration value="visitorTraffic"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TrafficTypeEnum")
@XmlEnum
public enum TrafficTypeEnum {

    @XmlEnumValue("accessOnlyTraffic")
    ACCESS_ONLY_TRAFFIC("accessOnlyTraffic"),
    @XmlEnumValue("destinedForAirport")
    DESTINED_FOR_AIRPORT("destinedForAirport"),
    @XmlEnumValue("destinedForAirportArrivals")
    DESTINED_FOR_AIRPORT_ARRIVALS("destinedForAirportArrivals"),
    @XmlEnumValue("destinedForAirportDepartures")
    DESTINED_FOR_AIRPORT_DEPARTURES("destinedForAirportDepartures"),
    @XmlEnumValue("destinedForFerryService")
    DESTINED_FOR_FERRY_SERVICE("destinedForFerryService"),
    @XmlEnumValue("destinedForRailService")
    DESTINED_FOR_RAIL_SERVICE("destinedForRailService"),
    @XmlEnumValue("holidayTraffic")
    HOLIDAY_TRAFFIC("holidayTraffic"),
    @XmlEnumValue("localTraffic")
    LOCAL_TRAFFIC("localTraffic"),
    @XmlEnumValue("longDistanceTraffic")
    LONG_DISTANCE_TRAFFIC("longDistanceTraffic"),
    @XmlEnumValue("regionalTraffic")
    REGIONAL_TRAFFIC("regionalTraffic"),
    @XmlEnumValue("residentsOnlyTraffic")
    RESIDENTS_ONLY_TRAFFIC("residentsOnlyTraffic"),
    @XmlEnumValue("throughTraffic")
    THROUGH_TRAFFIC("throughTraffic"),
    @XmlEnumValue("visitorTraffic")
    VISITOR_TRAFFIC("visitorTraffic");
    private final String value;

    TrafficTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrafficTypeEnum fromValue(String v) {
        for (TrafficTypeEnum c: TrafficTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

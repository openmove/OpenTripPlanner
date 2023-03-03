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
 * <p>Classe Java per QuayTypeEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="QuayTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="airlineGate"/&gt;
 *     &lt;enumeration value="railPlatform"/&gt;
 *     &lt;enumeration value="metroPlatform"/&gt;
 *     &lt;enumeration value="coachStop"/&gt;
 *     &lt;enumeration value="busStop"/&gt;
 *     &lt;enumeration value="tramStop"/&gt;
 *     &lt;enumeration value="boatQuay"/&gt;
 *     &lt;enumeration value="ferryLanding"/&gt;
 *     &lt;enumeration value="telecabinePlatfrom"/&gt;
 *     &lt;enumeration value="taxiStand"/&gt;
 *     &lt;enumeration value="setDownPlace"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "QuayTypeEnumeration")
@XmlEnum
public enum QuayTypeEnumeration {

    @XmlEnumValue("airlineGate")
    AIRLINE_GATE("airlineGate"),
    @XmlEnumValue("railPlatform")
    RAIL_PLATFORM("railPlatform"),
    @XmlEnumValue("metroPlatform")
    METRO_PLATFORM("metroPlatform"),
    @XmlEnumValue("coachStop")
    COACH_STOP("coachStop"),
    @XmlEnumValue("busStop")
    BUS_STOP("busStop"),
    @XmlEnumValue("tramStop")
    TRAM_STOP("tramStop"),
    @XmlEnumValue("boatQuay")
    BOAT_QUAY("boatQuay"),
    @XmlEnumValue("ferryLanding")
    FERRY_LANDING("ferryLanding"),
    @XmlEnumValue("telecabinePlatfrom")
    TELECABINE_PLATFROM("telecabinePlatfrom"),
    @XmlEnumValue("taxiStand")
    TAXI_STAND("taxiStand"),
    @XmlEnumValue("setDownPlace")
    SET_DOWN_PLACE("setDownPlace"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    QuayTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QuayTypeEnumeration fromValue(String v) {
        for (QuayTypeEnumeration c: QuayTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package de.vdv.ojp;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per OptimisationMethodEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="OptimisationMethodEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="fastest"/&gt;
 *     &lt;enumeration value="minChanges"/&gt;
 *     &lt;enumeration value="leastWalking"/&gt;
 *     &lt;enumeration value="leastCost"/&gt;
 *     &lt;enumeration value="earliestArrival"/&gt;
 *     &lt;enumeration value="latestDeparture"/&gt;
 *     &lt;enumeration value="earliestArrivalAndLatestDeparture"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OptimisationMethodEnumeration")
@XmlEnum
public enum OptimisationMethodEnumeration {

    @XmlEnumValue("fastest")
    FASTEST("fastest"),
    @XmlEnumValue("minChanges")
    MIN_CHANGES("minChanges"),
    @XmlEnumValue("leastWalking")
    LEAST_WALKING("leastWalking"),
    @XmlEnumValue("leastCost")
    LEAST_COST("leastCost"),
    @XmlEnumValue("earliestArrival")
    EARLIEST_ARRIVAL("earliestArrival"),
    @XmlEnumValue("latestDeparture")
    LATEST_DEPARTURE("latestDeparture"),
    @XmlEnumValue("earliestArrivalAndLatestDeparture")
    EARLIEST_ARRIVAL_AND_LATEST_DEPARTURE("earliestArrivalAndLatestDeparture");
    private final String value;

    OptimisationMethodEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OptimisationMethodEnumeration fromValue(String v) {
        for (OptimisationMethodEnumeration c: OptimisationMethodEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

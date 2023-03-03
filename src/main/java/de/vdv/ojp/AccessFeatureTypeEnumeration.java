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
 * <p>Classe Java per AccessFeatureTypeEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="AccessFeatureTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="lift"/&gt;
 *     &lt;enumeration value="stairs"/&gt;
 *     &lt;enumeration value="seriesOfStairs"/&gt;
 *     &lt;enumeration value="escalator"/&gt;
 *     &lt;enumeration value="ramp"/&gt;
 *     &lt;enumeration value="footpath"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AccessFeatureTypeEnumeration")
@XmlEnum
public enum AccessFeatureTypeEnumeration {

    @XmlEnumValue("lift")
    LIFT("lift"),
    @XmlEnumValue("stairs")
    STAIRS("stairs"),
    @XmlEnumValue("seriesOfStairs")
    SERIES_OF_STAIRS("seriesOfStairs"),
    @XmlEnumValue("escalator")
    ESCALATOR("escalator"),
    @XmlEnumValue("ramp")
    RAMP("ramp"),
    @XmlEnumValue("footpath")
    FOOTPATH("footpath");
    private final String value;

    AccessFeatureTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccessFeatureTypeEnumeration fromValue(String v) {
        for (AccessFeatureTypeEnumeration c: AccessFeatureTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

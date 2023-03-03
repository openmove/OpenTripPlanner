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
 * <p>Classe Java per PlaceTypeEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="PlaceTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="stop"/&gt;
 *     &lt;enumeration value="address"/&gt;
 *     &lt;enumeration value="poi"/&gt;
 *     &lt;enumeration value="coord"/&gt;
 *     &lt;enumeration value="topographicPlace"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PlaceTypeEnumeration")
@XmlEnum
public enum PlaceTypeEnumeration {

    @XmlEnumValue("stop")
    STOP("stop"),
    @XmlEnumValue("address")
    ADDRESS("address"),
    @XmlEnumValue("poi")
    POI("poi"),
    @XmlEnumValue("coord")
    COORD("coord"),
    @XmlEnumValue("topographicPlace")
    TOPOGRAPHIC_PLACE("topographicPlace");
    private final String value;

    PlaceTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PlaceTypeEnumeration fromValue(String v) {
        for (PlaceTypeEnumeration c: PlaceTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

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
 * <p>Classe Java per SharingModelEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="SharingModelEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="singleStationBased"/&gt;
 *     &lt;enumeration value="multipleStationBased"/&gt;
 *     &lt;enumeration value="nonStationBased"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SharingModelEnumeration")
@XmlEnum
public enum SharingModelEnumeration {

    @XmlEnumValue("singleStationBased")
    SINGLE_STATION_BASED("singleStationBased"),
    @XmlEnumValue("multipleStationBased")
    MULTIPLE_STATION_BASED("multipleStationBased"),
    @XmlEnumValue("nonStationBased")
    NON_STATION_BASED("nonStationBased");
    private final String value;

    SharingModelEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SharingModelEnumeration fromValue(String v) {
        for (SharingModelEnumeration c: SharingModelEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

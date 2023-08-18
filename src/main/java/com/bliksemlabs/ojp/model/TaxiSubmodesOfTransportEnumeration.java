//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package com.bliksemlabs.ojp.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per TaxiSubmodesOfTransportEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxiSubmodesOfTransportEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="pti11_0"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="pti11_1"/&gt;
 *     &lt;enumeration value="communalTaxi"/&gt;
 *     &lt;enumeration value="pti11_2"/&gt;
 *     &lt;enumeration value="waterTaxi"/&gt;
 *     &lt;enumeration value="pti11_3"/&gt;
 *     &lt;enumeration value="railTaxi"/&gt;
 *     &lt;enumeration value="pti11_4"/&gt;
 *     &lt;enumeration value="bikeTaxi"/&gt;
 *     &lt;enumeration value="pti11_5"/&gt;
 *     &lt;enumeration value="blackCab"/&gt;
 *     &lt;enumeration value="pti11_6"/&gt;
 *     &lt;enumeration value="miniCab"/&gt;
 *     &lt;enumeration value="pti11_7"/&gt;
 *     &lt;enumeration value="allTaxiServices"/&gt;
 *     &lt;enumeration value="pti11_255"/&gt;
 *     &lt;enumeration value="undefinedTaxiService"/&gt;
 *     &lt;enumeration value="valysBasis"/&gt;
 *     &lt;enumeration value="valysBegeleid"/&gt;
 *     &lt;enumeration value="valysVrij"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TaxiSubmodesOfTransportEnumeration")
@XmlEnum
public enum TaxiSubmodesOfTransportEnumeration {

    @XmlEnumValue("pti11_0")
    PTI_11___0("pti11_0"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pti11_1")
    PTI_11___1("pti11_1"),
    @XmlEnumValue("communalTaxi")
    COMMUNAL_TAXI("communalTaxi"),
    @XmlEnumValue("pti11_2")
    PTI_11___2("pti11_2"),
    @XmlEnumValue("waterTaxi")
    WATER_TAXI("waterTaxi"),
    @XmlEnumValue("pti11_3")
    PTI_11___3("pti11_3"),
    @XmlEnumValue("railTaxi")
    RAIL_TAXI("railTaxi"),
    @XmlEnumValue("pti11_4")
    PTI_11___4("pti11_4"),
    @XmlEnumValue("bikeTaxi")
    BIKE_TAXI("bikeTaxi"),
    @XmlEnumValue("pti11_5")
    PTI_11___5("pti11_5"),
    @XmlEnumValue("blackCab")
    BLACK_CAB("blackCab"),
    @XmlEnumValue("pti11_6")
    PTI_11___6("pti11_6"),
    @XmlEnumValue("miniCab")
    MINI_CAB("miniCab"),
    @XmlEnumValue("pti11_7")
    PTI_11___7("pti11_7"),
    @XmlEnumValue("allTaxiServices")
    ALL_TAXI_SERVICES("allTaxiServices"),
    @XmlEnumValue("pti11_255")
    PTI_11___255("pti11_255"),
    @XmlEnumValue("undefinedTaxiService")
    UNDEFINED_TAXI_SERVICE("undefinedTaxiService"),
    @XmlEnumValue("valysBasis")
    VALYS_BASIS("valysBasis"),
    @XmlEnumValue("valysBegeleid")
    VALYS_BEGELEID("valysBegeleid"),
    @XmlEnumValue("valysVrij")
    VALYS_VRIJ("valysVrij");
    private final String value;

    TaxiSubmodesOfTransportEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaxiSubmodesOfTransportEnumeration fromValue(String v) {
        for (TaxiSubmodesOfTransportEnumeration c: TaxiSubmodesOfTransportEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

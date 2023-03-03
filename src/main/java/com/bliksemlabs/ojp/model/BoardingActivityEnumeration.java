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
 * <p>Classe Java per BoardingActivityEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="BoardingActivityEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="boardingAndAlighting"/&gt;
 *     &lt;enumeration value="noBoarding"/&gt;
 *     &lt;enumeration value="noAlighting"/&gt;
 *     &lt;enumeration value="passThru"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BoardingActivityEnumeration")
@XmlEnum
public enum BoardingActivityEnumeration {

    @XmlEnumValue("boardingAndAlighting")
    BOARDING_AND_ALIGHTING("boardingAndAlighting"),
    @XmlEnumValue("noBoarding")
    NO_BOARDING("noBoarding"),
    @XmlEnumValue("noAlighting")
    NO_ALIGHTING("noAlighting"),
    @XmlEnumValue("passThru")
    PASS_THRU("passThru");
    private final String value;

    BoardingActivityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BoardingActivityEnumeration fromValue(String v) {
        for (BoardingActivityEnumeration c: BoardingActivityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

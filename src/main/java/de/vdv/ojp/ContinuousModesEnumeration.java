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
 * <p>Classe Java per ContinuousModesEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ContinuousModesEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="walk"/&gt;
 *     &lt;enumeration value="demandResponsive"/&gt;
 *     &lt;enumeration value="replacementService"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ContinuousModesEnumeration")
@XmlEnum
public enum ContinuousModesEnumeration {

    @XmlEnumValue("walk")
    WALK("walk"),
    @XmlEnumValue("demandResponsive")
    DEMAND_RESPONSIVE("demandResponsive"),
    @XmlEnumValue("replacementService")
    REPLACEMENT_SERVICE("replacementService");
    private final String value;

    ContinuousModesEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContinuousModesEnumeration fromValue(String v) {
        for (ContinuousModesEnumeration c: ContinuousModesEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

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
 * <p>Classe Java per DenyReasonEnum.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DenyReasonEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="unknownReason"/&gt;
 *     &lt;enumeration value="wrongCatalogue"/&gt;
 *     &lt;enumeration value="wrongFilter"/&gt;
 *     &lt;enumeration value="wrongOrder"/&gt;
 *     &lt;enumeration value="wrongPartner"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DenyReasonEnum")
@XmlEnum
public enum DenyReasonEnum {

    @XmlEnumValue("unknownReason")
    UNKNOWN_REASON("unknownReason"),
    @XmlEnumValue("wrongCatalogue")
    WRONG_CATALOGUE("wrongCatalogue"),
    @XmlEnumValue("wrongFilter")
    WRONG_FILTER("wrongFilter"),
    @XmlEnumValue("wrongOrder")
    WRONG_ORDER("wrongOrder"),
    @XmlEnumValue("wrongPartner")
    WRONG_PARTNER("wrongPartner");
    private final String value;

    DenyReasonEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DenyReasonEnum fromValue(String v) {
        for (DenyReasonEnum c: DenyReasonEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

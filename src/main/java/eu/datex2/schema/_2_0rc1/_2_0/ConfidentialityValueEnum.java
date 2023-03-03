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
 * <p>Classe Java per ConfidentialityValueEnum.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ConfidentialityValueEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="internalUse"/&gt;
 *     &lt;enumeration value="noRestriction"/&gt;
 *     &lt;enumeration value="restrictedToAuthorities"/&gt;
 *     &lt;enumeration value="restrictedToAuthoritiesAndTrafficOperators"/&gt;
 *     &lt;enumeration value="restrictedToAuthoritiesTrafficOperatorsAndPublishers"/&gt;
 *     &lt;enumeration value="restrictedToAuthoritiesTrafficOperatorsAndVms"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ConfidentialityValueEnum")
@XmlEnum
public enum ConfidentialityValueEnum {

    @XmlEnumValue("internalUse")
    INTERNAL_USE("internalUse"),
    @XmlEnumValue("noRestriction")
    NO_RESTRICTION("noRestriction"),
    @XmlEnumValue("restrictedToAuthorities")
    RESTRICTED_TO_AUTHORITIES("restrictedToAuthorities"),
    @XmlEnumValue("restrictedToAuthoritiesAndTrafficOperators")
    RESTRICTED_TO_AUTHORITIES_AND_TRAFFIC_OPERATORS("restrictedToAuthoritiesAndTrafficOperators"),
    @XmlEnumValue("restrictedToAuthoritiesTrafficOperatorsAndPublishers")
    RESTRICTED_TO_AUTHORITIES_TRAFFIC_OPERATORS_AND_PUBLISHERS("restrictedToAuthoritiesTrafficOperatorsAndPublishers"),
    @XmlEnumValue("restrictedToAuthoritiesTrafficOperatorsAndVms")
    RESTRICTED_TO_AUTHORITIES_TRAFFIC_OPERATORS_AND_VMS("restrictedToAuthoritiesTrafficOperatorsAndVms");
    private final String value;

    ConfidentialityValueEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConfidentialityValueEnum fromValue(String v) {
        for (ConfidentialityValueEnum c: ConfidentialityValueEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

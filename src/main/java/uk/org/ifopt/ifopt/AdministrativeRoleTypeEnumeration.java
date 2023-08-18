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
 * <p>Classe Java per AdministrativeRoleTypeEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="AdministrativeRoleTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="all"/&gt;
 *     &lt;enumeration value="collects"/&gt;
 *     &lt;enumeration value="validates"/&gt;
 *     &lt;enumeration value="aggregates"/&gt;
 *     &lt;enumeration value="distributes"/&gt;
 *     &lt;enumeration value="redistributes"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AdministrativeRoleTypeEnumeration")
@XmlEnum
public enum AdministrativeRoleTypeEnumeration {

    @XmlEnumValue("all")
    ALL("all"),
    @XmlEnumValue("collects")
    COLLECTS("collects"),
    @XmlEnumValue("validates")
    VALIDATES("validates"),
    @XmlEnumValue("aggregates")
    AGGREGATES("aggregates"),
    @XmlEnumValue("distributes")
    DISTRIBUTES("distributes"),
    @XmlEnumValue("redistributes")
    REDISTRIBUTES("redistributes");
    private final String value;

    AdministrativeRoleTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdministrativeRoleTypeEnumeration fromValue(String v) {
        for (AdministrativeRoleTypeEnumeration c: AdministrativeRoleTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

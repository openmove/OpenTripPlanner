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
 * <p>Classe Java per DeltaModificationEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DeltaModificationEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="new"/&gt;
 *     &lt;enumeration value="delete"/&gt;
 *     &lt;enumeration value="revise"/&gt;
 *     &lt;enumeration value="delta"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DeltaModificationEnumeration")
@XmlEnum
public enum DeltaModificationEnumeration {

    @XmlEnumValue("new")
    NEW("new"),
    @XmlEnumValue("delete")
    DELETE("delete"),
    @XmlEnumValue("revise")
    REVISE("revise"),
    @XmlEnumValue("delta")
    DELTA("delta");
    private final String value;

    DeltaModificationEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeltaModificationEnumeration fromValue(String v) {
        for (DeltaModificationEnumeration c: DeltaModificationEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

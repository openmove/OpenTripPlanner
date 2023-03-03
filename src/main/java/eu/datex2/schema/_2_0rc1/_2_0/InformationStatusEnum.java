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
 * <p>Classe Java per InformationStatusEnum.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="InformationStatusEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="real"/&gt;
 *     &lt;enumeration value="securityExercise"/&gt;
 *     &lt;enumeration value="technicalExercise"/&gt;
 *     &lt;enumeration value="test"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InformationStatusEnum")
@XmlEnum
public enum InformationStatusEnum {

    @XmlEnumValue("real")
    REAL("real"),
    @XmlEnumValue("securityExercise")
    SECURITY_EXERCISE("securityExercise"),
    @XmlEnumValue("technicalExercise")
    TECHNICAL_EXERCISE("technicalExercise"),
    @XmlEnumValue("test")
    TEST("test");
    private final String value;

    InformationStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InformationStatusEnum fromValue(String v) {
        for (InformationStatusEnum c: InformationStatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

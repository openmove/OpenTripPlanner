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
 * <p>Classe Java per VmsTypeEnum.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VmsTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="colourGraphic"/&gt;
 *     &lt;enumeration value="continuousSign"/&gt;
 *     &lt;enumeration value="monochromeGraphic"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VmsTypeEnum")
@XmlEnum
public enum VmsTypeEnum {

    @XmlEnumValue("colourGraphic")
    COLOUR_GRAPHIC("colourGraphic"),
    @XmlEnumValue("continuousSign")
    CONTINUOUS_SIGN("continuousSign"),
    @XmlEnumValue("monochromeGraphic")
    MONOCHROME_GRAPHIC("monochromeGraphic"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    VmsTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VmsTypeEnum fromValue(String v) {
        for (VmsTypeEnum c: VmsTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

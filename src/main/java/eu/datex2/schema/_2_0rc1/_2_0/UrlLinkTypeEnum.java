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
 * <p>Classe Java per UrlLinkTypeEnum.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="UrlLinkTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="documentPdf"/&gt;
 *     &lt;enumeration value="html"/&gt;
 *     &lt;enumeration value="image"/&gt;
 *     &lt;enumeration value="rss"/&gt;
 *     &lt;enumeration value="videoStream"/&gt;
 *     &lt;enumeration value="voiceStream"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UrlLinkTypeEnum")
@XmlEnum
public enum UrlLinkTypeEnum {

    @XmlEnumValue("documentPdf")
    DOCUMENT_PDF("documentPdf"),
    @XmlEnumValue("html")
    HTML("html"),
    @XmlEnumValue("image")
    IMAGE("image"),
    @XmlEnumValue("rss")
    RSS("rss"),
    @XmlEnumValue("videoStream")
    VIDEO_STREAM("videoStream"),
    @XmlEnumValue("voiceStream")
    VOICE_STREAM("voiceStream"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    UrlLinkTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UrlLinkTypeEnum fromValue(String v) {
        for (UrlLinkTypeEnum c: UrlLinkTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

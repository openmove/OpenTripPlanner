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
 * <p>Classe Java per DangerousGoodsRegulationsEnum.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DangerousGoodsRegulationsEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="adr"/&gt;
 *     &lt;enumeration value="iataIcao"/&gt;
 *     &lt;enumeration value="imoImdg"/&gt;
 *     &lt;enumeration value="railroadDangerousGoodsBook"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DangerousGoodsRegulationsEnum")
@XmlEnum
public enum DangerousGoodsRegulationsEnum {

    @XmlEnumValue("adr")
    ADR("adr"),
    @XmlEnumValue("iataIcao")
    IATA_ICAO("iataIcao"),
    @XmlEnumValue("imoImdg")
    IMO_IMDG("imoImdg"),
    @XmlEnumValue("railroadDangerousGoodsBook")
    RAILROAD_DANGEROUS_GOODS_BOOK("railroadDangerousGoodsBook");
    private final String value;

    DangerousGoodsRegulationsEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DangerousGoodsRegulationsEnum fromValue(String v) {
        for (DangerousGoodsRegulationsEnum c: DangerousGoodsRegulationsEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

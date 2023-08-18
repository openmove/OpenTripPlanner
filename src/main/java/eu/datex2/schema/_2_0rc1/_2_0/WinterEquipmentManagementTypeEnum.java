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
 * <p>Classe Java per WinterEquipmentManagementTypeEnum.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="WinterEquipmentManagementTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="doNoUseStudTyres"/&gt;
 *     &lt;enumeration value="useSnowChains"/&gt;
 *     &lt;enumeration value="useSnowChainsOrTyres"/&gt;
 *     &lt;enumeration value="useSnowTyres"/&gt;
 *     &lt;enumeration value="winterEquipmentOnBoardRequired"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WinterEquipmentManagementTypeEnum")
@XmlEnum
public enum WinterEquipmentManagementTypeEnum {

    @XmlEnumValue("doNoUseStudTyres")
    DO_NO_USE_STUD_TYRES("doNoUseStudTyres"),
    @XmlEnumValue("useSnowChains")
    USE_SNOW_CHAINS("useSnowChains"),
    @XmlEnumValue("useSnowChainsOrTyres")
    USE_SNOW_CHAINS_OR_TYRES("useSnowChainsOrTyres"),
    @XmlEnumValue("useSnowTyres")
    USE_SNOW_TYRES("useSnowTyres"),
    @XmlEnumValue("winterEquipmentOnBoardRequired")
    WINTER_EQUIPMENT_ON_BOARD_REQUIRED("winterEquipmentOnBoardRequired"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    WinterEquipmentManagementTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WinterEquipmentManagementTypeEnum fromValue(String v) {
        for (WinterEquipmentManagementTypeEnum c: WinterEquipmentManagementTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

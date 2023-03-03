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
 * <p>Classe Java per VehicleEquipmentEnum.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VehicleEquipmentEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="notUsingSnowChains"/&gt;
 *     &lt;enumeration value="notUsingSnowChainsOrTyres"/&gt;
 *     &lt;enumeration value="snowChainsInUse"/&gt;
 *     &lt;enumeration value="snowTyresInUse"/&gt;
 *     &lt;enumeration value="snowChainsOrTyresInUse"/&gt;
 *     &lt;enumeration value="withoutSnowTyresOrChainsOnBoard"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VehicleEquipmentEnum")
@XmlEnum
public enum VehicleEquipmentEnum {

    @XmlEnumValue("notUsingSnowChains")
    NOT_USING_SNOW_CHAINS("notUsingSnowChains"),
    @XmlEnumValue("notUsingSnowChainsOrTyres")
    NOT_USING_SNOW_CHAINS_OR_TYRES("notUsingSnowChainsOrTyres"),
    @XmlEnumValue("snowChainsInUse")
    SNOW_CHAINS_IN_USE("snowChainsInUse"),
    @XmlEnumValue("snowTyresInUse")
    SNOW_TYRES_IN_USE("snowTyresInUse"),
    @XmlEnumValue("snowChainsOrTyresInUse")
    SNOW_CHAINS_OR_TYRES_IN_USE("snowChainsOrTyresInUse"),
    @XmlEnumValue("withoutSnowTyresOrChainsOnBoard")
    WITHOUT_SNOW_TYRES_OR_CHAINS_ON_BOARD("withoutSnowTyresOrChainsOnBoard");
    private final String value;

    VehicleEquipmentEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehicleEquipmentEnum fromValue(String v) {
        for (VehicleEquipmentEnum c: VehicleEquipmentEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

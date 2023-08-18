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
 * <p>Classe Java per EnvironmentalObstructionTypeEnum.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="EnvironmentalObstructionTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="avalanches"/&gt;
 *     &lt;enumeration value="earthquakeDamage"/&gt;
 *     &lt;enumeration value="fallenTrees"/&gt;
 *     &lt;enumeration value="fallingIce"/&gt;
 *     &lt;enumeration value="fallingLightIceOrSnow"/&gt;
 *     &lt;enumeration value="flashFloods"/&gt;
 *     &lt;enumeration value="flooding"/&gt;
 *     &lt;enumeration value="forestFire"/&gt;
 *     &lt;enumeration value="grassFire"/&gt;
 *     &lt;enumeration value="landslips"/&gt;
 *     &lt;enumeration value="mudSlide"/&gt;
 *     &lt;enumeration value="sewerOverflow"/&gt;
 *     &lt;enumeration value="rockfalls"/&gt;
 *     &lt;enumeration value="seriousFire"/&gt;
 *     &lt;enumeration value="smokeOrFumes"/&gt;
 *     &lt;enumeration value="stormDamage"/&gt;
 *     &lt;enumeration value="subsidence"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EnvironmentalObstructionTypeEnum")
@XmlEnum
public enum EnvironmentalObstructionTypeEnum {

    @XmlEnumValue("avalanches")
    AVALANCHES("avalanches"),
    @XmlEnumValue("earthquakeDamage")
    EARTHQUAKE_DAMAGE("earthquakeDamage"),
    @XmlEnumValue("fallenTrees")
    FALLEN_TREES("fallenTrees"),
    @XmlEnumValue("fallingIce")
    FALLING_ICE("fallingIce"),
    @XmlEnumValue("fallingLightIceOrSnow")
    FALLING_LIGHT_ICE_OR_SNOW("fallingLightIceOrSnow"),
    @XmlEnumValue("flashFloods")
    FLASH_FLOODS("flashFloods"),
    @XmlEnumValue("flooding")
    FLOODING("flooding"),
    @XmlEnumValue("forestFire")
    FOREST_FIRE("forestFire"),
    @XmlEnumValue("grassFire")
    GRASS_FIRE("grassFire"),
    @XmlEnumValue("landslips")
    LANDSLIPS("landslips"),
    @XmlEnumValue("mudSlide")
    MUD_SLIDE("mudSlide"),
    @XmlEnumValue("sewerOverflow")
    SEWER_OVERFLOW("sewerOverflow"),
    @XmlEnumValue("rockfalls")
    ROCKFALLS("rockfalls"),
    @XmlEnumValue("seriousFire")
    SERIOUS_FIRE("seriousFire"),
    @XmlEnumValue("smokeOrFumes")
    SMOKE_OR_FUMES("smokeOrFumes"),
    @XmlEnumValue("stormDamage")
    STORM_DAMAGE("stormDamage"),
    @XmlEnumValue("subsidence")
    SUBSIDENCE("subsidence"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    EnvironmentalObstructionTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnvironmentalObstructionTypeEnum fromValue(String v) {
        for (EnvironmentalObstructionTypeEnum c: EnvironmentalObstructionTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

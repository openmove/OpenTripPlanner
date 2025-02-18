//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package com.bliksemlabs.ojp.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per EnvironmentReasonEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="EnvironmentReasonEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="pti22_0"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="pti22_1"/&gt;
 *     &lt;enumeration value="fog"/&gt;
 *     &lt;enumeration value="pti22_2"/&gt;
 *     &lt;enumeration value="roughSea"/&gt;
 *     &lt;enumeration value="pti22_3"/&gt;
 *     &lt;enumeration value="heavySnowFall"/&gt;
 *     &lt;enumeration value="pti22_3_Alias_1"/&gt;
 *     &lt;enumeration value="driftingSnow"/&gt;
 *     &lt;enumeration value="pti22_3_Alias_2"/&gt;
 *     &lt;enumeration value="blizzardConditions"/&gt;
 *     &lt;enumeration value="pti22_4"/&gt;
 *     &lt;enumeration value="heavyRain"/&gt;
 *     &lt;enumeration value="pti22_5"/&gt;
 *     &lt;enumeration value="strongWinds"/&gt;
 *     &lt;enumeration value="pti22_5_Alias_1"/&gt;
 *     &lt;enumeration value="stormConditions"/&gt;
 *     &lt;enumeration value="pti22_5_Alias_2"/&gt;
 *     &lt;enumeration value="stormDamage"/&gt;
 *     &lt;enumeration value="pti22_6"/&gt;
 *     &lt;enumeration value="tidalRestrictions"/&gt;
 *     &lt;enumeration value="pti22_7"/&gt;
 *     &lt;enumeration value="highTide"/&gt;
 *     &lt;enumeration value="pti22_8"/&gt;
 *     &lt;enumeration value="lowTide"/&gt;
 *     &lt;enumeration value="pti22_9"/&gt;
 *     &lt;enumeration value="ice"/&gt;
 *     &lt;enumeration value="pti22_9_Alias_1"/&gt;
 *     &lt;enumeration value="slipperiness"/&gt;
 *     &lt;enumeration value="pti22_9_Alias_2"/&gt;
 *     &lt;enumeration value="iceDrift"/&gt;
 *     &lt;enumeration value="pti22_9_Alias_3"/&gt;
 *     &lt;enumeration value="glazedFrost"/&gt;
 *     &lt;enumeration value="pti22_10"/&gt;
 *     &lt;enumeration value="frozen"/&gt;
 *     &lt;enumeration value="pti22_11"/&gt;
 *     &lt;enumeration value="hail"/&gt;
 *     &lt;enumeration value="pti22_11_Alias_1"/&gt;
 *     &lt;enumeration value="sleet"/&gt;
 *     &lt;enumeration value="pti22_12"/&gt;
 *     &lt;enumeration value="highTemperatures"/&gt;
 *     &lt;enumeration value="pti22_13"/&gt;
 *     &lt;enumeration value="flooding"/&gt;
 *     &lt;enumeration value="pti22_14"/&gt;
 *     &lt;enumeration value="waterlogged"/&gt;
 *     &lt;enumeration value="pti22_15"/&gt;
 *     &lt;enumeration value="lowWaterLevel"/&gt;
 *     &lt;enumeration value="pti22_16"/&gt;
 *     &lt;enumeration value="highWaterLevel"/&gt;
 *     &lt;enumeration value="pti22_17"/&gt;
 *     &lt;enumeration value="fallenLeaves"/&gt;
 *     &lt;enumeration value="pti22_18"/&gt;
 *     &lt;enumeration value="fallenTree"/&gt;
 *     &lt;enumeration value="pti22_19"/&gt;
 *     &lt;enumeration value="landslide"/&gt;
 *     &lt;enumeration value="pti22_255"/&gt;
 *     &lt;enumeration value="undefinedEnvironmentalProblem"/&gt;
 *     &lt;enumeration value="pti22_255_Alias_1"/&gt;
 *     &lt;enumeration value="lightningStrike"/&gt;
 *     &lt;enumeration value="pti22_255_Alias_2"/&gt;
 *     &lt;enumeration value="sewerOverflow"/&gt;
 *     &lt;enumeration value="pti22_255_Alias_3"/&gt;
 *     &lt;enumeration value="grassFire"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EnvironmentReasonEnumeration")
@XmlEnum
public enum EnvironmentReasonEnumeration {

    @XmlEnumValue("pti22_0")
    PTI_22___0("pti22_0"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pti22_1")
    PTI_22___1("pti22_1"),
    @XmlEnumValue("fog")
    FOG("fog"),
    @XmlEnumValue("pti22_2")
    PTI_22___2("pti22_2"),
    @XmlEnumValue("roughSea")
    ROUGH_SEA("roughSea"),
    @XmlEnumValue("pti22_3")
    PTI_22___3("pti22_3"),
    @XmlEnumValue("heavySnowFall")
    HEAVY_SNOW_FALL("heavySnowFall"),
    @XmlEnumValue("pti22_3_Alias_1")
    PTI_22___3___ALIAS___1("pti22_3_Alias_1"),
    @XmlEnumValue("driftingSnow")
    DRIFTING_SNOW("driftingSnow"),
    @XmlEnumValue("pti22_3_Alias_2")
    PTI_22___3___ALIAS___2("pti22_3_Alias_2"),
    @XmlEnumValue("blizzardConditions")
    BLIZZARD_CONDITIONS("blizzardConditions"),
    @XmlEnumValue("pti22_4")
    PTI_22___4("pti22_4"),
    @XmlEnumValue("heavyRain")
    HEAVY_RAIN("heavyRain"),
    @XmlEnumValue("pti22_5")
    PTI_22___5("pti22_5"),
    @XmlEnumValue("strongWinds")
    STRONG_WINDS("strongWinds"),
    @XmlEnumValue("pti22_5_Alias_1")
    PTI_22___5___ALIAS___1("pti22_5_Alias_1"),
    @XmlEnumValue("stormConditions")
    STORM_CONDITIONS("stormConditions"),
    @XmlEnumValue("pti22_5_Alias_2")
    PTI_22___5___ALIAS___2("pti22_5_Alias_2"),
    @XmlEnumValue("stormDamage")
    STORM_DAMAGE("stormDamage"),
    @XmlEnumValue("pti22_6")
    PTI_22___6("pti22_6"),
    @XmlEnumValue("tidalRestrictions")
    TIDAL_RESTRICTIONS("tidalRestrictions"),
    @XmlEnumValue("pti22_7")
    PTI_22___7("pti22_7"),
    @XmlEnumValue("highTide")
    HIGH_TIDE("highTide"),
    @XmlEnumValue("pti22_8")
    PTI_22___8("pti22_8"),
    @XmlEnumValue("lowTide")
    LOW_TIDE("lowTide"),
    @XmlEnumValue("pti22_9")
    PTI_22___9("pti22_9"),
    @XmlEnumValue("ice")
    ICE("ice"),
    @XmlEnumValue("pti22_9_Alias_1")
    PTI_22___9___ALIAS___1("pti22_9_Alias_1"),
    @XmlEnumValue("slipperiness")
    SLIPPERINESS("slipperiness"),
    @XmlEnumValue("pti22_9_Alias_2")
    PTI_22___9___ALIAS___2("pti22_9_Alias_2"),
    @XmlEnumValue("iceDrift")
    ICE_DRIFT("iceDrift"),
    @XmlEnumValue("pti22_9_Alias_3")
    PTI_22___9___ALIAS___3("pti22_9_Alias_3"),
    @XmlEnumValue("glazedFrost")
    GLAZED_FROST("glazedFrost"),
    @XmlEnumValue("pti22_10")
    PTI_22___10("pti22_10"),
    @XmlEnumValue("frozen")
    FROZEN("frozen"),
    @XmlEnumValue("pti22_11")
    PTI_22___11("pti22_11"),
    @XmlEnumValue("hail")
    HAIL("hail"),
    @XmlEnumValue("pti22_11_Alias_1")
    PTI_22___11___ALIAS___1("pti22_11_Alias_1"),
    @XmlEnumValue("sleet")
    SLEET("sleet"),
    @XmlEnumValue("pti22_12")
    PTI_22___12("pti22_12"),
    @XmlEnumValue("highTemperatures")
    HIGH_TEMPERATURES("highTemperatures"),
    @XmlEnumValue("pti22_13")
    PTI_22___13("pti22_13"),
    @XmlEnumValue("flooding")
    FLOODING("flooding"),
    @XmlEnumValue("pti22_14")
    PTI_22___14("pti22_14"),
    @XmlEnumValue("waterlogged")
    WATERLOGGED("waterlogged"),
    @XmlEnumValue("pti22_15")
    PTI_22___15("pti22_15"),
    @XmlEnumValue("lowWaterLevel")
    LOW_WATER_LEVEL("lowWaterLevel"),
    @XmlEnumValue("pti22_16")
    PTI_22___16("pti22_16"),
    @XmlEnumValue("highWaterLevel")
    HIGH_WATER_LEVEL("highWaterLevel"),
    @XmlEnumValue("pti22_17")
    PTI_22___17("pti22_17"),
    @XmlEnumValue("fallenLeaves")
    FALLEN_LEAVES("fallenLeaves"),
    @XmlEnumValue("pti22_18")
    PTI_22___18("pti22_18"),
    @XmlEnumValue("fallenTree")
    FALLEN_TREE("fallenTree"),
    @XmlEnumValue("pti22_19")
    PTI_22___19("pti22_19"),
    @XmlEnumValue("landslide")
    LANDSLIDE("landslide"),
    @XmlEnumValue("pti22_255")
    PTI_22___255("pti22_255"),
    @XmlEnumValue("undefinedEnvironmentalProblem")
    UNDEFINED_ENVIRONMENTAL_PROBLEM("undefinedEnvironmentalProblem"),
    @XmlEnumValue("pti22_255_Alias_1")
    PTI_22___255___ALIAS___1("pti22_255_Alias_1"),
    @XmlEnumValue("lightningStrike")
    LIGHTNING_STRIKE("lightningStrike"),
    @XmlEnumValue("pti22_255_Alias_2")
    PTI_22___255___ALIAS___2("pti22_255_Alias_2"),
    @XmlEnumValue("sewerOverflow")
    SEWER_OVERFLOW("sewerOverflow"),
    @XmlEnumValue("pti22_255_Alias_3")
    PTI_22___255___ALIAS___3("pti22_255_Alias_3"),
    @XmlEnumValue("grassFire")
    GRASS_FIRE("grassFire");
    private final String value;

    EnvironmentReasonEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnvironmentReasonEnumeration fromValue(String v) {
        for (EnvironmentReasonEnumeration c: EnvironmentReasonEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

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
 * <p>Classe Java per EnvironmentSubReasonEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="EnvironmentSubReasonEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="fog"/&gt;
 *     &lt;enumeration value="roughSea"/&gt;
 *     &lt;enumeration value="heavySnowFall"/&gt;
 *     &lt;enumeration value="driftingSnow"/&gt;
 *     &lt;enumeration value="heavyRain"/&gt;
 *     &lt;enumeration value="blizzardConditions"/&gt;
 *     &lt;enumeration value="strongWinds"/&gt;
 *     &lt;enumeration value="stormConditions"/&gt;
 *     &lt;enumeration value="stormDamage"/&gt;
 *     &lt;enumeration value="tidalRestrictions"/&gt;
 *     &lt;enumeration value="highTide"/&gt;
 *     &lt;enumeration value="lowTide"/&gt;
 *     &lt;enumeration value="ice"/&gt;
 *     &lt;enumeration value="slipperiness"/&gt;
 *     &lt;enumeration value="iceDrift"/&gt;
 *     &lt;enumeration value="glazedFrost"/&gt;
 *     &lt;enumeration value="frozen"/&gt;
 *     &lt;enumeration value="hail"/&gt;
 *     &lt;enumeration value="sleet"/&gt;
 *     &lt;enumeration value="highTemperatures"/&gt;
 *     &lt;enumeration value="flooding"/&gt;
 *     &lt;enumeration value="waterlogged"/&gt;
 *     &lt;enumeration value="lowWaterLevel"/&gt;
 *     &lt;enumeration value="highWaterLevel"/&gt;
 *     &lt;enumeration value="fallenLeaves"/&gt;
 *     &lt;enumeration value="fallenTree"/&gt;
 *     &lt;enumeration value="landslide"/&gt;
 *     &lt;enumeration value="undefinedEnvironmentalProblem"/&gt;
 *     &lt;enumeration value="sewerOverflow"/&gt;
 *     &lt;enumeration value="grassFire"/&gt;
 *     &lt;enumeration value="lighteningStrike"/&gt;
 *     &lt;enumeration value="avalanches"/&gt;
 *     &lt;enumeration value="flashFloods"/&gt;
 *     &lt;enumeration value="mudslip"/&gt;
 *     &lt;enumeration value="rockfalls"/&gt;
 *     &lt;enumeration value="subsidence"/&gt;
 *     &lt;enumeration value="earthquakeDamage"/&gt;
 *     &lt;enumeration value="sewerOverflow"/&gt;
 *     &lt;enumeration value="grassFire"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EnvironmentSubReasonEnumeration")
@XmlEnum
public enum EnvironmentSubReasonEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("fog")
    FOG("fog"),
    @XmlEnumValue("roughSea")
    ROUGH_SEA("roughSea"),
    @XmlEnumValue("heavySnowFall")
    HEAVY_SNOW_FALL("heavySnowFall"),
    @XmlEnumValue("driftingSnow")
    DRIFTING_SNOW("driftingSnow"),
    @XmlEnumValue("heavyRain")
    HEAVY_RAIN("heavyRain"),
    @XmlEnumValue("blizzardConditions")
    BLIZZARD_CONDITIONS("blizzardConditions"),
    @XmlEnumValue("strongWinds")
    STRONG_WINDS("strongWinds"),
    @XmlEnumValue("stormConditions")
    STORM_CONDITIONS("stormConditions"),
    @XmlEnumValue("stormDamage")
    STORM_DAMAGE("stormDamage"),
    @XmlEnumValue("tidalRestrictions")
    TIDAL_RESTRICTIONS("tidalRestrictions"),
    @XmlEnumValue("highTide")
    HIGH_TIDE("highTide"),
    @XmlEnumValue("lowTide")
    LOW_TIDE("lowTide"),
    @XmlEnumValue("ice")
    ICE("ice"),
    @XmlEnumValue("slipperiness")
    SLIPPERINESS("slipperiness"),
    @XmlEnumValue("iceDrift")
    ICE_DRIFT("iceDrift"),
    @XmlEnumValue("glazedFrost")
    GLAZED_FROST("glazedFrost"),
    @XmlEnumValue("frozen")
    FROZEN("frozen"),
    @XmlEnumValue("hail")
    HAIL("hail"),
    @XmlEnumValue("sleet")
    SLEET("sleet"),
    @XmlEnumValue("highTemperatures")
    HIGH_TEMPERATURES("highTemperatures"),
    @XmlEnumValue("flooding")
    FLOODING("flooding"),
    @XmlEnumValue("waterlogged")
    WATERLOGGED("waterlogged"),
    @XmlEnumValue("lowWaterLevel")
    LOW_WATER_LEVEL("lowWaterLevel"),
    @XmlEnumValue("highWaterLevel")
    HIGH_WATER_LEVEL("highWaterLevel"),
    @XmlEnumValue("fallenLeaves")
    FALLEN_LEAVES("fallenLeaves"),
    @XmlEnumValue("fallenTree")
    FALLEN_TREE("fallenTree"),
    @XmlEnumValue("landslide")
    LANDSLIDE("landslide"),
    @XmlEnumValue("undefinedEnvironmentalProblem")
    UNDEFINED_ENVIRONMENTAL_PROBLEM("undefinedEnvironmentalProblem"),
    @XmlEnumValue("sewerOverflow")
    SEWER_OVERFLOW("sewerOverflow"),
    @XmlEnumValue("grassFire")
    GRASS_FIRE("grassFire"),
    @XmlEnumValue("lighteningStrike")
    LIGHTENING_STRIKE("lighteningStrike"),
    @XmlEnumValue("avalanches")
    AVALANCHES("avalanches"),
    @XmlEnumValue("flashFloods")
    FLASH_FLOODS("flashFloods"),
    @XmlEnumValue("mudslip")
    MUDSLIP("mudslip"),
    @XmlEnumValue("rockfalls")
    ROCKFALLS("rockfalls"),
    @XmlEnumValue("subsidence")
    SUBSIDENCE("subsidence"),
    @XmlEnumValue("earthquakeDamage")
    EARTHQUAKE_DAMAGE("earthquakeDamage");
    private final String value;

    EnvironmentSubReasonEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnvironmentSubReasonEnumeration fromValue(String v) {
        for (EnvironmentSubReasonEnumeration c: EnvironmentSubReasonEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

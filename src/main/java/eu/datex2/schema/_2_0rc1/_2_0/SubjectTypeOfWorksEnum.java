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
 * <p>Classe Java per SubjectTypeOfWorksEnum.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="SubjectTypeOfWorksEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="bridge"/&gt;
 *     &lt;enumeration value="buriedCables"/&gt;
 *     &lt;enumeration value="buriedServices"/&gt;
 *     &lt;enumeration value="crashBarrier"/&gt;
 *     &lt;enumeration value="gallery"/&gt;
 *     &lt;enumeration value="gantry"/&gt;
 *     &lt;enumeration value="gasMainWork"/&gt;
 *     &lt;enumeration value="interchange"/&gt;
 *     &lt;enumeration value="junction"/&gt;
 *     &lt;enumeration value="levelCrossing"/&gt;
 *     &lt;enumeration value="lightingSystem"/&gt;
 *     &lt;enumeration value="measurementEquipment"/&gt;
 *     &lt;enumeration value="noiseProtection"/&gt;
 *     &lt;enumeration value="road"/&gt;
 *     &lt;enumeration value="roadsideDrains"/&gt;
 *     &lt;enumeration value="roadsideEmbankment"/&gt;
 *     &lt;enumeration value="roadsideEquipment"/&gt;
 *     &lt;enumeration value="roadSigns"/&gt;
 *     &lt;enumeration value="roundabout"/&gt;
 *     &lt;enumeration value="tollGate"/&gt;
 *     &lt;enumeration value="tunnel"/&gt;
 *     &lt;enumeration value="waterMain"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SubjectTypeOfWorksEnum")
@XmlEnum
public enum SubjectTypeOfWorksEnum {

    @XmlEnumValue("bridge")
    BRIDGE("bridge"),
    @XmlEnumValue("buriedCables")
    BURIED_CABLES("buriedCables"),
    @XmlEnumValue("buriedServices")
    BURIED_SERVICES("buriedServices"),
    @XmlEnumValue("crashBarrier")
    CRASH_BARRIER("crashBarrier"),
    @XmlEnumValue("gallery")
    GALLERY("gallery"),
    @XmlEnumValue("gantry")
    GANTRY("gantry"),
    @XmlEnumValue("gasMainWork")
    GAS_MAIN_WORK("gasMainWork"),
    @XmlEnumValue("interchange")
    INTERCHANGE("interchange"),
    @XmlEnumValue("junction")
    JUNCTION("junction"),
    @XmlEnumValue("levelCrossing")
    LEVEL_CROSSING("levelCrossing"),
    @XmlEnumValue("lightingSystem")
    LIGHTING_SYSTEM("lightingSystem"),
    @XmlEnumValue("measurementEquipment")
    MEASUREMENT_EQUIPMENT("measurementEquipment"),
    @XmlEnumValue("noiseProtection")
    NOISE_PROTECTION("noiseProtection"),
    @XmlEnumValue("road")
    ROAD("road"),
    @XmlEnumValue("roadsideDrains")
    ROADSIDE_DRAINS("roadsideDrains"),
    @XmlEnumValue("roadsideEmbankment")
    ROADSIDE_EMBANKMENT("roadsideEmbankment"),
    @XmlEnumValue("roadsideEquipment")
    ROADSIDE_EQUIPMENT("roadsideEquipment"),
    @XmlEnumValue("roadSigns")
    ROAD_SIGNS("roadSigns"),
    @XmlEnumValue("roundabout")
    ROUNDABOUT("roundabout"),
    @XmlEnumValue("tollGate")
    TOLL_GATE("tollGate"),
    @XmlEnumValue("tunnel")
    TUNNEL("tunnel"),
    @XmlEnumValue("waterMain")
    WATER_MAIN("waterMain"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    SubjectTypeOfWorksEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SubjectTypeOfWorksEnum fromValue(String v) {
        for (SubjectTypeOfWorksEnum c: SubjectTypeOfWorksEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

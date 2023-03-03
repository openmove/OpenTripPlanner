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
 * <p>Classe Java per VehicleStatusEnum.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VehicleStatusEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="abandoned"/&gt;
 *     &lt;enumeration value="brokenDown"/&gt;
 *     &lt;enumeration value="burntOut"/&gt;
 *     &lt;enumeration value="damaged"/&gt;
 *     &lt;enumeration value="damagedAndImmobilized"/&gt;
 *     &lt;enumeration value="onFire"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VehicleStatusEnum")
@XmlEnum
public enum VehicleStatusEnum {

    @XmlEnumValue("abandoned")
    ABANDONED("abandoned"),
    @XmlEnumValue("brokenDown")
    BROKEN_DOWN("brokenDown"),
    @XmlEnumValue("burntOut")
    BURNT_OUT("burntOut"),
    @XmlEnumValue("damaged")
    DAMAGED("damaged"),
    @XmlEnumValue("damagedAndImmobilized")
    DAMAGED_AND_IMMOBILIZED("damagedAndImmobilized"),
    @XmlEnumValue("onFire")
    ON_FIRE("onFire");
    private final String value;

    VehicleStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehicleStatusEnum fromValue(String v) {
        for (VehicleStatusEnum c: VehicleStatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

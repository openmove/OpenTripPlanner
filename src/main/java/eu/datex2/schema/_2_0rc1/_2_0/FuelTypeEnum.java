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
 * <p>Classe Java per FuelTypeEnum.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="FuelTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="battery"/&gt;
 *     &lt;enumeration value="biodiesel"/&gt;
 *     &lt;enumeration value="diesel"/&gt;
 *     &lt;enumeration value="dieselBatteryHybrid"/&gt;
 *     &lt;enumeration value="ethanol"/&gt;
 *     &lt;enumeration value="hydrogen"/&gt;
 *     &lt;enumeration value="liquidGas"/&gt;
 *     &lt;enumeration value="lpg"/&gt;
 *     &lt;enumeration value="methane"/&gt;
 *     &lt;enumeration value="petrol"/&gt;
 *     &lt;enumeration value="petrolBatteryHybrid"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FuelTypeEnum")
@XmlEnum
public enum FuelTypeEnum {

    @XmlEnumValue("battery")
    BATTERY("battery"),
    @XmlEnumValue("biodiesel")
    BIODIESEL("biodiesel"),
    @XmlEnumValue("diesel")
    DIESEL("diesel"),
    @XmlEnumValue("dieselBatteryHybrid")
    DIESEL_BATTERY_HYBRID("dieselBatteryHybrid"),
    @XmlEnumValue("ethanol")
    ETHANOL("ethanol"),
    @XmlEnumValue("hydrogen")
    HYDROGEN("hydrogen"),
    @XmlEnumValue("liquidGas")
    LIQUID_GAS("liquidGas"),
    @XmlEnumValue("lpg")
    LPG("lpg"),
    @XmlEnumValue("methane")
    METHANE("methane"),
    @XmlEnumValue("petrol")
    PETROL("petrol"),
    @XmlEnumValue("petrolBatteryHybrid")
    PETROL_BATTERY_HYBRID("petrolBatteryHybrid");
    private final String value;

    FuelTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FuelTypeEnum fromValue(String v) {
        for (FuelTypeEnum c: FuelTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

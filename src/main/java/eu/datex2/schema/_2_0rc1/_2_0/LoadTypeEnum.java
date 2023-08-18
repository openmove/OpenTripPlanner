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
 * <p>Classe Java per LoadTypeEnum.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="LoadTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="abnormalLoad"/&gt;
 *     &lt;enumeration value="ammunition"/&gt;
 *     &lt;enumeration value="chemicals"/&gt;
 *     &lt;enumeration value="combustibleMaterials"/&gt;
 *     &lt;enumeration value="corrosiveMaterials"/&gt;
 *     &lt;enumeration value="debris"/&gt;
 *     &lt;enumeration value="empty"/&gt;
 *     &lt;enumeration value="explosiveMaterials"/&gt;
 *     &lt;enumeration value="extraHighLoad"/&gt;
 *     &lt;enumeration value="extraLongLoad"/&gt;
 *     &lt;enumeration value="extraWideLoad"/&gt;
 *     &lt;enumeration value="fuel"/&gt;
 *     &lt;enumeration value="glass"/&gt;
 *     &lt;enumeration value="goods"/&gt;
 *     &lt;enumeration value="hazardousMaterials"/&gt;
 *     &lt;enumeration value="liquid"/&gt;
 *     &lt;enumeration value="livestock"/&gt;
 *     &lt;enumeration value="materials"/&gt;
 *     &lt;enumeration value="materialsDangerousForPeople"/&gt;
 *     &lt;enumeration value="materialsDangerousForTheEnvironment"/&gt;
 *     &lt;enumeration value="materialsDangerousForWater"/&gt;
 *     &lt;enumeration value="oil"/&gt;
 *     &lt;enumeration value="ordinary"/&gt;
 *     &lt;enumeration value="perishableProducts"/&gt;
 *     &lt;enumeration value="petrol"/&gt;
 *     &lt;enumeration value="pharmaceuticalMaterials"/&gt;
 *     &lt;enumeration value="radioactiveMaterials"/&gt;
 *     &lt;enumeration value="refuse"/&gt;
 *     &lt;enumeration value="toxicMaterials"/&gt;
 *     &lt;enumeration value="vehicles"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LoadTypeEnum")
@XmlEnum
public enum LoadTypeEnum {

    @XmlEnumValue("abnormalLoad")
    ABNORMAL_LOAD("abnormalLoad"),
    @XmlEnumValue("ammunition")
    AMMUNITION("ammunition"),
    @XmlEnumValue("chemicals")
    CHEMICALS("chemicals"),
    @XmlEnumValue("combustibleMaterials")
    COMBUSTIBLE_MATERIALS("combustibleMaterials"),
    @XmlEnumValue("corrosiveMaterials")
    CORROSIVE_MATERIALS("corrosiveMaterials"),
    @XmlEnumValue("debris")
    DEBRIS("debris"),
    @XmlEnumValue("empty")
    EMPTY("empty"),
    @XmlEnumValue("explosiveMaterials")
    EXPLOSIVE_MATERIALS("explosiveMaterials"),
    @XmlEnumValue("extraHighLoad")
    EXTRA_HIGH_LOAD("extraHighLoad"),
    @XmlEnumValue("extraLongLoad")
    EXTRA_LONG_LOAD("extraLongLoad"),
    @XmlEnumValue("extraWideLoad")
    EXTRA_WIDE_LOAD("extraWideLoad"),
    @XmlEnumValue("fuel")
    FUEL("fuel"),
    @XmlEnumValue("glass")
    GLASS("glass"),
    @XmlEnumValue("goods")
    GOODS("goods"),
    @XmlEnumValue("hazardousMaterials")
    HAZARDOUS_MATERIALS("hazardousMaterials"),
    @XmlEnumValue("liquid")
    LIQUID("liquid"),
    @XmlEnumValue("livestock")
    LIVESTOCK("livestock"),
    @XmlEnumValue("materials")
    MATERIALS("materials"),
    @XmlEnumValue("materialsDangerousForPeople")
    MATERIALS_DANGEROUS_FOR_PEOPLE("materialsDangerousForPeople"),
    @XmlEnumValue("materialsDangerousForTheEnvironment")
    MATERIALS_DANGEROUS_FOR_THE_ENVIRONMENT("materialsDangerousForTheEnvironment"),
    @XmlEnumValue("materialsDangerousForWater")
    MATERIALS_DANGEROUS_FOR_WATER("materialsDangerousForWater"),
    @XmlEnumValue("oil")
    OIL("oil"),
    @XmlEnumValue("ordinary")
    ORDINARY("ordinary"),
    @XmlEnumValue("perishableProducts")
    PERISHABLE_PRODUCTS("perishableProducts"),
    @XmlEnumValue("petrol")
    PETROL("petrol"),
    @XmlEnumValue("pharmaceuticalMaterials")
    PHARMACEUTICAL_MATERIALS("pharmaceuticalMaterials"),
    @XmlEnumValue("radioactiveMaterials")
    RADIOACTIVE_MATERIALS("radioactiveMaterials"),
    @XmlEnumValue("refuse")
    REFUSE("refuse"),
    @XmlEnumValue("toxicMaterials")
    TOXIC_MATERIALS("toxicMaterials"),
    @XmlEnumValue("vehicles")
    VEHICLES("vehicles"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    LoadTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LoadTypeEnum fromValue(String v) {
        for (LoadTypeEnum c: LoadTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

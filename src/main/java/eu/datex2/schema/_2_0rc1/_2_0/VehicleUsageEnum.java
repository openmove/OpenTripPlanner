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
 * <p>Classe Java per VehicleUsageEnum.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VehicleUsageEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="agricultural"/&gt;
 *     &lt;enumeration value="commercial"/&gt;
 *     &lt;enumeration value="emergencyServices"/&gt;
 *     &lt;enumeration value="military"/&gt;
 *     &lt;enumeration value="nonCommercial"/&gt;
 *     &lt;enumeration value="patrol"/&gt;
 *     &lt;enumeration value="recoveryServices"/&gt;
 *     &lt;enumeration value="roadMaintenanceOrConstruction"/&gt;
 *     &lt;enumeration value="roadOperator"/&gt;
 *     &lt;enumeration value="taxi"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VehicleUsageEnum")
@XmlEnum
public enum VehicleUsageEnum {

    @XmlEnumValue("agricultural")
    AGRICULTURAL("agricultural"),
    @XmlEnumValue("commercial")
    COMMERCIAL("commercial"),
    @XmlEnumValue("emergencyServices")
    EMERGENCY_SERVICES("emergencyServices"),
    @XmlEnumValue("military")
    MILITARY("military"),
    @XmlEnumValue("nonCommercial")
    NON_COMMERCIAL("nonCommercial"),
    @XmlEnumValue("patrol")
    PATROL("patrol"),
    @XmlEnumValue("recoveryServices")
    RECOVERY_SERVICES("recoveryServices"),
    @XmlEnumValue("roadMaintenanceOrConstruction")
    ROAD_MAINTENANCE_OR_CONSTRUCTION("roadMaintenanceOrConstruction"),
    @XmlEnumValue("roadOperator")
    ROAD_OPERATOR("roadOperator"),
    @XmlEnumValue("taxi")
    TAXI("taxi");
    private final String value;

    VehicleUsageEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehicleUsageEnum fromValue(String v) {
        for (VehicleUsageEnum c: VehicleUsageEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

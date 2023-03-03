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
 * <p>Classe Java per MaintenanceVehicleActionsEnum.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="MaintenanceVehicleActionsEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="maintenanceVehiclesMergingIntoTrafficFlow"/&gt;
 *     &lt;enumeration value="saltAndGritSpreading"/&gt;
 *     &lt;enumeration value="slowMoving"/&gt;
 *     &lt;enumeration value="snowClearing"/&gt;
 *     &lt;enumeration value="stoppingToServiceEquipments"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MaintenanceVehicleActionsEnum")
@XmlEnum
public enum MaintenanceVehicleActionsEnum {

    @XmlEnumValue("maintenanceVehiclesMergingIntoTrafficFlow")
    MAINTENANCE_VEHICLES_MERGING_INTO_TRAFFIC_FLOW("maintenanceVehiclesMergingIntoTrafficFlow"),
    @XmlEnumValue("saltAndGritSpreading")
    SALT_AND_GRIT_SPREADING("saltAndGritSpreading"),
    @XmlEnumValue("slowMoving")
    SLOW_MOVING("slowMoving"),
    @XmlEnumValue("snowClearing")
    SNOW_CLEARING("snowClearing"),
    @XmlEnumValue("stoppingToServiceEquipments")
    STOPPING_TO_SERVICE_EQUIPMENTS("stoppingToServiceEquipments");
    private final String value;

    MaintenanceVehicleActionsEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MaintenanceVehicleActionsEnum fromValue(String v) {
        for (MaintenanceVehicleActionsEnum c: MaintenanceVehicleActionsEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

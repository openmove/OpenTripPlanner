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
 * <p>Classe Java per RoadsideAssistanceTypeEnum.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="RoadsideAssistanceTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="airAmbulance"/&gt;
 *     &lt;enumeration value="busPassengerAssistance"/&gt;
 *     &lt;enumeration value="emergencyServices"/&gt;
 *     &lt;enumeration value="firstAid"/&gt;
 *     &lt;enumeration value="foodDelivery"/&gt;
 *     &lt;enumeration value="helicopterRescue"/&gt;
 *     &lt;enumeration value="vehicleRepair"/&gt;
 *     &lt;enumeration value="vehicleRecovery"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RoadsideAssistanceTypeEnum")
@XmlEnum
public enum RoadsideAssistanceTypeEnum {

    @XmlEnumValue("airAmbulance")
    AIR_AMBULANCE("airAmbulance"),
    @XmlEnumValue("busPassengerAssistance")
    BUS_PASSENGER_ASSISTANCE("busPassengerAssistance"),
    @XmlEnumValue("emergencyServices")
    EMERGENCY_SERVICES("emergencyServices"),
    @XmlEnumValue("firstAid")
    FIRST_AID("firstAid"),
    @XmlEnumValue("foodDelivery")
    FOOD_DELIVERY("foodDelivery"),
    @XmlEnumValue("helicopterRescue")
    HELICOPTER_RESCUE("helicopterRescue"),
    @XmlEnumValue("vehicleRepair")
    VEHICLE_REPAIR("vehicleRepair"),
    @XmlEnumValue("vehicleRecovery")
    VEHICLE_RECOVERY("vehicleRecovery"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    RoadsideAssistanceTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoadsideAssistanceTypeEnum fromValue(String v) {
        for (RoadsideAssistanceTypeEnum c: RoadsideAssistanceTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

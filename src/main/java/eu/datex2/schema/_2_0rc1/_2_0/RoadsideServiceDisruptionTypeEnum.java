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
 * <p>Classe Java per RoadsideServiceDisruptionTypeEnum.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="RoadsideServiceDisruptionTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="barClosed"/&gt;
 *     &lt;enumeration value="dieselShortage"/&gt;
 *     &lt;enumeration value="fuelShortage"/&gt;
 *     &lt;enumeration value="lpgShortage"/&gt;
 *     &lt;enumeration value="methaneShortage"/&gt;
 *     &lt;enumeration value="noDieselForHeavyVehicles"/&gt;
 *     &lt;enumeration value="noDieselForLightVehicles"/&gt;
 *     &lt;enumeration value="noPublicTelephones"/&gt;
 *     &lt;enumeration value="noToiletFacilities"/&gt;
 *     &lt;enumeration value="noVehicleRepairFacilities"/&gt;
 *     &lt;enumeration value="petrolShortage"/&gt;
 *     &lt;enumeration value="restAreaBusy"/&gt;
 *     &lt;enumeration value="restAreaClosed"/&gt;
 *     &lt;enumeration value="restAreaOvercrowdedDriveToAnotherRestArea"/&gt;
 *     &lt;enumeration value="serviceAreaBusy"/&gt;
 *     &lt;enumeration value="serviceAreaClosed"/&gt;
 *     &lt;enumeration value="serviceAreaFuelStationClosed"/&gt;
 *     &lt;enumeration value="serviceAreaOvercrowdedDriveToAnotherServiceArea"/&gt;
 *     &lt;enumeration value="serviceAreaRestaurantClosed"/&gt;
 *     &lt;enumeration value="someCommercialServicesClosed"/&gt;
 *     &lt;enumeration value="waterShortage"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RoadsideServiceDisruptionTypeEnum")
@XmlEnum
public enum RoadsideServiceDisruptionTypeEnum {

    @XmlEnumValue("barClosed")
    BAR_CLOSED("barClosed"),
    @XmlEnumValue("dieselShortage")
    DIESEL_SHORTAGE("dieselShortage"),
    @XmlEnumValue("fuelShortage")
    FUEL_SHORTAGE("fuelShortage"),
    @XmlEnumValue("lpgShortage")
    LPG_SHORTAGE("lpgShortage"),
    @XmlEnumValue("methaneShortage")
    METHANE_SHORTAGE("methaneShortage"),
    @XmlEnumValue("noDieselForHeavyVehicles")
    NO_DIESEL_FOR_HEAVY_VEHICLES("noDieselForHeavyVehicles"),
    @XmlEnumValue("noDieselForLightVehicles")
    NO_DIESEL_FOR_LIGHT_VEHICLES("noDieselForLightVehicles"),
    @XmlEnumValue("noPublicTelephones")
    NO_PUBLIC_TELEPHONES("noPublicTelephones"),
    @XmlEnumValue("noToiletFacilities")
    NO_TOILET_FACILITIES("noToiletFacilities"),
    @XmlEnumValue("noVehicleRepairFacilities")
    NO_VEHICLE_REPAIR_FACILITIES("noVehicleRepairFacilities"),
    @XmlEnumValue("petrolShortage")
    PETROL_SHORTAGE("petrolShortage"),
    @XmlEnumValue("restAreaBusy")
    REST_AREA_BUSY("restAreaBusy"),
    @XmlEnumValue("restAreaClosed")
    REST_AREA_CLOSED("restAreaClosed"),
    @XmlEnumValue("restAreaOvercrowdedDriveToAnotherRestArea")
    REST_AREA_OVERCROWDED_DRIVE_TO_ANOTHER_REST_AREA("restAreaOvercrowdedDriveToAnotherRestArea"),
    @XmlEnumValue("serviceAreaBusy")
    SERVICE_AREA_BUSY("serviceAreaBusy"),
    @XmlEnumValue("serviceAreaClosed")
    SERVICE_AREA_CLOSED("serviceAreaClosed"),
    @XmlEnumValue("serviceAreaFuelStationClosed")
    SERVICE_AREA_FUEL_STATION_CLOSED("serviceAreaFuelStationClosed"),
    @XmlEnumValue("serviceAreaOvercrowdedDriveToAnotherServiceArea")
    SERVICE_AREA_OVERCROWDED_DRIVE_TO_ANOTHER_SERVICE_AREA("serviceAreaOvercrowdedDriveToAnotherServiceArea"),
    @XmlEnumValue("serviceAreaRestaurantClosed")
    SERVICE_AREA_RESTAURANT_CLOSED("serviceAreaRestaurantClosed"),
    @XmlEnumValue("someCommercialServicesClosed")
    SOME_COMMERCIAL_SERVICES_CLOSED("someCommercialServicesClosed"),
    @XmlEnumValue("waterShortage")
    WATER_SHORTAGE("waterShortage");
    private final String value;

    RoadsideServiceDisruptionTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoadsideServiceDisruptionTypeEnum fromValue(String v) {
        for (RoadsideServiceDisruptionTypeEnum c: RoadsideServiceDisruptionTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

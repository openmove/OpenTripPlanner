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
 * <p>Classe Java per CarParkStatusEnum.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="CarParkStatusEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="carParkClosed"/&gt;
 *     &lt;enumeration value="allCarParksFull"/&gt;
 *     &lt;enumeration value="carParkFacilityFaulty"/&gt;
 *     &lt;enumeration value="carParkFull"/&gt;
 *     &lt;enumeration value="carParkStatusUnknown"/&gt;
 *     &lt;enumeration value="enoughSpacesAvailable"/&gt;
 *     &lt;enumeration value="multiStoryCarParksFull"/&gt;
 *     &lt;enumeration value="noMoreParkingSpacesAvailable"/&gt;
 *     &lt;enumeration value="noParkAndRideInformation"/&gt;
 *     &lt;enumeration value="noParkingAllowed"/&gt;
 *     &lt;enumeration value="noParkingInformationAvailable"/&gt;
 *     &lt;enumeration value="normalParkingRestrictionsLifted"/&gt;
 *     &lt;enumeration value="onlyAFewSpacesAvailable"/&gt;
 *     &lt;enumeration value="parkAndRideServiceNotOperating"/&gt;
 *     &lt;enumeration value="parkAndRideServiceOperating"/&gt;
 *     &lt;enumeration value="specialParkingRestrictionsInForce"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CarParkStatusEnum")
@XmlEnum
public enum CarParkStatusEnum {

    @XmlEnumValue("carParkClosed")
    CAR_PARK_CLOSED("carParkClosed"),
    @XmlEnumValue("allCarParksFull")
    ALL_CAR_PARKS_FULL("allCarParksFull"),
    @XmlEnumValue("carParkFacilityFaulty")
    CAR_PARK_FACILITY_FAULTY("carParkFacilityFaulty"),
    @XmlEnumValue("carParkFull")
    CAR_PARK_FULL("carParkFull"),
    @XmlEnumValue("carParkStatusUnknown")
    CAR_PARK_STATUS_UNKNOWN("carParkStatusUnknown"),
    @XmlEnumValue("enoughSpacesAvailable")
    ENOUGH_SPACES_AVAILABLE("enoughSpacesAvailable"),
    @XmlEnumValue("multiStoryCarParksFull")
    MULTI_STORY_CAR_PARKS_FULL("multiStoryCarParksFull"),
    @XmlEnumValue("noMoreParkingSpacesAvailable")
    NO_MORE_PARKING_SPACES_AVAILABLE("noMoreParkingSpacesAvailable"),
    @XmlEnumValue("noParkAndRideInformation")
    NO_PARK_AND_RIDE_INFORMATION("noParkAndRideInformation"),
    @XmlEnumValue("noParkingAllowed")
    NO_PARKING_ALLOWED("noParkingAllowed"),
    @XmlEnumValue("noParkingInformationAvailable")
    NO_PARKING_INFORMATION_AVAILABLE("noParkingInformationAvailable"),
    @XmlEnumValue("normalParkingRestrictionsLifted")
    NORMAL_PARKING_RESTRICTIONS_LIFTED("normalParkingRestrictionsLifted"),
    @XmlEnumValue("onlyAFewSpacesAvailable")
    ONLY_A_FEW_SPACES_AVAILABLE("onlyAFewSpacesAvailable"),
    @XmlEnumValue("parkAndRideServiceNotOperating")
    PARK_AND_RIDE_SERVICE_NOT_OPERATING("parkAndRideServiceNotOperating"),
    @XmlEnumValue("parkAndRideServiceOperating")
    PARK_AND_RIDE_SERVICE_OPERATING("parkAndRideServiceOperating"),
    @XmlEnumValue("specialParkingRestrictionsInForce")
    SPECIAL_PARKING_RESTRICTIONS_IN_FORCE("specialParkingRestrictionsInForce");
    private final String value;

    CarParkStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CarParkStatusEnum fromValue(String v) {
        for (CarParkStatusEnum c: CarParkStatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

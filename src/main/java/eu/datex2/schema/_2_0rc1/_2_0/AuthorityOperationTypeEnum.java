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
 * <p>Classe Java per AuthorityOperationTypeEnum.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="AuthorityOperationTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="accidentInvestigationWork"/&gt;
 *     &lt;enumeration value="bombSquadInAction"/&gt;
 *     &lt;enumeration value="civilEmergency"/&gt;
 *     &lt;enumeration value="customsOperation"/&gt;
 *     &lt;enumeration value="juridicalReconstruction"/&gt;
 *     &lt;enumeration value="policeCheckPoint"/&gt;
 *     &lt;enumeration value="policeInvestigation"/&gt;
 *     &lt;enumeration value="roadOperatorCheckPoint"/&gt;
 *     &lt;enumeration value="survey"/&gt;
 *     &lt;enumeration value="transportOfVip"/&gt;
 *     &lt;enumeration value="undefinedAuthorityActivity"/&gt;
 *     &lt;enumeration value="vehicleInspectionCheckPoint"/&gt;
 *     &lt;enumeration value="vehicleWeighing"/&gt;
 *     &lt;enumeration value="weighInMotion"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AuthorityOperationTypeEnum")
@XmlEnum
public enum AuthorityOperationTypeEnum {

    @XmlEnumValue("accidentInvestigationWork")
    ACCIDENT_INVESTIGATION_WORK("accidentInvestigationWork"),
    @XmlEnumValue("bombSquadInAction")
    BOMB_SQUAD_IN_ACTION("bombSquadInAction"),
    @XmlEnumValue("civilEmergency")
    CIVIL_EMERGENCY("civilEmergency"),
    @XmlEnumValue("customsOperation")
    CUSTOMS_OPERATION("customsOperation"),
    @XmlEnumValue("juridicalReconstruction")
    JURIDICAL_RECONSTRUCTION("juridicalReconstruction"),
    @XmlEnumValue("policeCheckPoint")
    POLICE_CHECK_POINT("policeCheckPoint"),
    @XmlEnumValue("policeInvestigation")
    POLICE_INVESTIGATION("policeInvestigation"),
    @XmlEnumValue("roadOperatorCheckPoint")
    ROAD_OPERATOR_CHECK_POINT("roadOperatorCheckPoint"),
    @XmlEnumValue("survey")
    SURVEY("survey"),
    @XmlEnumValue("transportOfVip")
    TRANSPORT_OF_VIP("transportOfVip"),
    @XmlEnumValue("undefinedAuthorityActivity")
    UNDEFINED_AUTHORITY_ACTIVITY("undefinedAuthorityActivity"),
    @XmlEnumValue("vehicleInspectionCheckPoint")
    VEHICLE_INSPECTION_CHECK_POINT("vehicleInspectionCheckPoint"),
    @XmlEnumValue("vehicleWeighing")
    VEHICLE_WEIGHING("vehicleWeighing"),
    @XmlEnumValue("weighInMotion")
    WEIGH_IN_MOTION("weighInMotion"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    AuthorityOperationTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AuthorityOperationTypeEnum fromValue(String v) {
        for (AuthorityOperationTypeEnum c: AuthorityOperationTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

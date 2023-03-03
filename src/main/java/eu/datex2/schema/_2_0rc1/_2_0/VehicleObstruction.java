//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per VehicleObstruction complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="VehicleObstruction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}Obstruction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vehicleObstructionType" type="{http://datex2.eu/schema/2_0RC1/2_0}VehicleObstructionTypeEnum"/&gt;
 *         &lt;element name="obstructingVehicle" type="{http://datex2.eu/schema/2_0RC1/2_0}Vehicle" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="vehicleObstructionExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleObstruction", propOrder = {
    "vehicleObstructionType",
    "obstructingVehicle",
    "vehicleObstructionExtension"
})
public class VehicleObstruction
    extends Obstruction
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected VehicleObstructionTypeEnum vehicleObstructionType;
    protected List<Vehicle> obstructingVehicle;
    protected ExtensionType vehicleObstructionExtension;

    /**
     * Recupera il valore della proprietà vehicleObstructionType.
     * 
     * @return
     *     possible object is
     *     {@link VehicleObstructionTypeEnum }
     *     
     */
    public VehicleObstructionTypeEnum getVehicleObstructionType() {
        return vehicleObstructionType;
    }

    /**
     * Imposta il valore della proprietà vehicleObstructionType.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleObstructionTypeEnum }
     *     
     */
    public void setVehicleObstructionType(VehicleObstructionTypeEnum value) {
        this.vehicleObstructionType = value;
    }

    /**
     * Gets the value of the obstructingVehicle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the obstructingVehicle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObstructingVehicle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Vehicle }
     * 
     * 
     */
    public List<Vehicle> getObstructingVehicle() {
        if (obstructingVehicle == null) {
            obstructingVehicle = new ArrayList<Vehicle>();
        }
        return this.obstructingVehicle;
    }

    /**
     * Recupera il valore della proprietà vehicleObstructionExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getVehicleObstructionExtension() {
        return vehicleObstructionExtension;
    }

    /**
     * Imposta il valore della proprietà vehicleObstructionExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setVehicleObstructionExtension(ExtensionType value) {
        this.vehicleObstructionExtension = value;
    }

    public VehicleObstruction withVehicleObstructionType(VehicleObstructionTypeEnum value) {
        setVehicleObstructionType(value);
        return this;
    }

    public VehicleObstruction withObstructingVehicle(Vehicle... values) {
        if (values!= null) {
            for (Vehicle value: values) {
                getObstructingVehicle().add(value);
            }
        }
        return this;
    }

    public VehicleObstruction withObstructingVehicle(Collection<Vehicle> values) {
        if (values!= null) {
            getObstructingVehicle().addAll(values);
        }
        return this;
    }

    public VehicleObstruction withVehicleObstructionExtension(ExtensionType value) {
        setVehicleObstructionExtension(value);
        return this;
    }

    @Override
    public VehicleObstruction withNumberOfObstructions(BigInteger value) {
        setNumberOfObstructions(value);
        return this;
    }

    @Override
    public VehicleObstruction withMobilityOfObstruction(Mobility value) {
        setMobilityOfObstruction(value);
        return this;
    }

    @Override
    public VehicleObstruction withObstructionExtension(ExtensionType value) {
        setObstructionExtension(value);
        return this;
    }

    @Override
    public VehicleObstruction withTrafficElementExtension(ExtensionType value) {
        setTrafficElementExtension(value);
        return this;
    }

    @Override
    public VehicleObstruction withSituationRecordCreationReference(String value) {
        setSituationRecordCreationReference(value);
        return this;
    }

    @Override
    public VehicleObstruction withSituationRecordCreationTime(LocalDateTime value) {
        setSituationRecordCreationTime(value);
        return this;
    }

    @Override
    public VehicleObstruction withSituationRecordObservationTime(LocalDateTime value) {
        setSituationRecordObservationTime(value);
        return this;
    }

    @Override
    public VehicleObstruction withSituationRecordVersion(BigInteger value) {
        setSituationRecordVersion(value);
        return this;
    }

    @Override
    public VehicleObstruction withSituationRecordVersionTime(LocalDateTime value) {
        setSituationRecordVersionTime(value);
        return this;
    }

    @Override
    public VehicleObstruction withSituationRecordFirstSupplierVersionTime(LocalDateTime value) {
        setSituationRecordFirstSupplierVersionTime(value);
        return this;
    }

    @Override
    public VehicleObstruction withConfidentialityOverride(ConfidentialityValueEnum value) {
        setConfidentialityOverride(value);
        return this;
    }

    @Override
    public VehicleObstruction withProbabilityOfOccurrence(ProbabilityOfOccurrenceEnum value) {
        setProbabilityOfOccurrence(value);
        return this;
    }

    @Override
    public VehicleObstruction withSource(Source value) {
        setSource(value);
        return this;
    }

    @Override
    public VehicleObstruction withValidity(Validity value) {
        setValidity(value);
        return this;
    }

    @Override
    public VehicleObstruction withImpact(Impact value) {
        setImpact(value);
        return this;
    }

    @Override
    public VehicleObstruction withCause(Cause value) {
        setCause(value);
        return this;
    }

    @Override
    public VehicleObstruction withGeneralPublicComment(Comment... values) {
        if (values!= null) {
            for (Comment value: values) {
                getGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public VehicleObstruction withGeneralPublicComment(Collection<Comment> values) {
        if (values!= null) {
            getGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public VehicleObstruction withNonGeneralPublicComment(Comment... values) {
        if (values!= null) {
            for (Comment value: values) {
                getNonGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public VehicleObstruction withNonGeneralPublicComment(Collection<Comment> values) {
        if (values!= null) {
            getNonGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public VehicleObstruction withUrlLink(UrlLink... values) {
        if (values!= null) {
            for (UrlLink value: values) {
                getUrlLink().add(value);
            }
        }
        return this;
    }

    @Override
    public VehicleObstruction withUrlLink(Collection<UrlLink> values) {
        if (values!= null) {
            getUrlLink().addAll(values);
        }
        return this;
    }

    @Override
    public VehicleObstruction withGroupOfLocations(GroupOfLocations value) {
        setGroupOfLocations(value);
        return this;
    }

    @Override
    public VehicleObstruction withManagement(Management value) {
        setManagement(value);
        return this;
    }

    @Override
    public VehicleObstruction withSituationRecordExtension(ExtensionType value) {
        setSituationRecordExtension(value);
        return this;
    }

    @Override
    public VehicleObstruction withId(String value) {
        setId(value);
        return this;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, OmitNullsToStringStyle.INSTANCE);
    }

}

//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per GroupOfVehiclesInvolved complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="GroupOfVehiclesInvolved"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numberOfVehicles" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="vehicleStatus" type="{http://datex2.eu/schema/2_0RC1/2_0}VehicleStatusEnum" minOccurs="0"/&gt;
 *         &lt;element name="vehicleCharacteristics" type="{http://datex2.eu/schema/2_0RC1/2_0}VehicleCharacteristics" minOccurs="0"/&gt;
 *         &lt;element name="groupOfVehiclesInvolvedExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupOfVehiclesInvolved", propOrder = {
    "numberOfVehicles",
    "vehicleStatus",
    "vehicleCharacteristics",
    "groupOfVehiclesInvolvedExtension"
})
public class GroupOfVehiclesInvolved {

    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfVehicles;
    @XmlSchemaType(name = "string")
    protected VehicleStatusEnum vehicleStatus;
    protected VehicleCharacteristics vehicleCharacteristics;
    protected ExtensionType groupOfVehiclesInvolvedExtension;

    /**
     * Recupera il valore della proprietà numberOfVehicles.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfVehicles() {
        return numberOfVehicles;
    }

    /**
     * Imposta il valore della proprietà numberOfVehicles.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfVehicles(BigInteger value) {
        this.numberOfVehicles = value;
    }

    /**
     * Recupera il valore della proprietà vehicleStatus.
     * 
     * @return
     *     possible object is
     *     {@link VehicleStatusEnum }
     *     
     */
    public VehicleStatusEnum getVehicleStatus() {
        return vehicleStatus;
    }

    /**
     * Imposta il valore della proprietà vehicleStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleStatusEnum }
     *     
     */
    public void setVehicleStatus(VehicleStatusEnum value) {
        this.vehicleStatus = value;
    }

    /**
     * Recupera il valore della proprietà vehicleCharacteristics.
     * 
     * @return
     *     possible object is
     *     {@link VehicleCharacteristics }
     *     
     */
    public VehicleCharacteristics getVehicleCharacteristics() {
        return vehicleCharacteristics;
    }

    /**
     * Imposta il valore della proprietà vehicleCharacteristics.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleCharacteristics }
     *     
     */
    public void setVehicleCharacteristics(VehicleCharacteristics value) {
        this.vehicleCharacteristics = value;
    }

    /**
     * Recupera il valore della proprietà groupOfVehiclesInvolvedExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getGroupOfVehiclesInvolvedExtension() {
        return groupOfVehiclesInvolvedExtension;
    }

    /**
     * Imposta il valore della proprietà groupOfVehiclesInvolvedExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setGroupOfVehiclesInvolvedExtension(ExtensionType value) {
        this.groupOfVehiclesInvolvedExtension = value;
    }

    public GroupOfVehiclesInvolved withNumberOfVehicles(BigInteger value) {
        setNumberOfVehicles(value);
        return this;
    }

    public GroupOfVehiclesInvolved withVehicleStatus(VehicleStatusEnum value) {
        setVehicleStatus(value);
        return this;
    }

    public GroupOfVehiclesInvolved withVehicleCharacteristics(VehicleCharacteristics value) {
        setVehicleCharacteristics(value);
        return this;
    }

    public GroupOfVehiclesInvolved withGroupOfVehiclesInvolvedExtension(ExtensionType value) {
        setGroupOfVehiclesInvolvedExtension(value);
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

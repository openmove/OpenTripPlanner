//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per Vehicle complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Vehicle"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vehicleColour" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="vehicleCountryOfOrigin" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="vehicleIdentifier" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="vehicleManufacturer" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="vehicleModel" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="vehicleRegistrationPlateIdentifier" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="vehicleStatus" type="{http://datex2.eu/schema/2_0RC1/2_0}VehicleStatusEnum" minOccurs="0"/&gt;
 *         &lt;element name="vehicleCharacteristics" type="{http://datex2.eu/schema/2_0RC1/2_0}VehicleCharacteristics" minOccurs="0"/&gt;
 *         &lt;element name="axleSpacingOnVehicle" type="{http://datex2.eu/schema/2_0RC1/2_0}AxleSpacing" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="specificAxleWeight" type="{http://datex2.eu/schema/2_0RC1/2_0}AxleWeight" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="hazardousGoodsAssociatedWithVehicle" type="{http://datex2.eu/schema/2_0RC1/2_0}HazardousMaterials" minOccurs="0"/&gt;
 *         &lt;element name="vehicleExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vehicle", propOrder = {
    "vehicleColour",
    "vehicleCountryOfOrigin",
    "vehicleIdentifier",
    "vehicleManufacturer",
    "vehicleModel",
    "vehicleRegistrationPlateIdentifier",
    "vehicleStatus",
    "vehicleCharacteristics",
    "axleSpacingOnVehicle",
    "specificAxleWeight",
    "hazardousGoodsAssociatedWithVehicle",
    "vehicleExtension"
})
public class Vehicle {

    protected MultilingualString vehicleColour;
    protected MultilingualString vehicleCountryOfOrigin;
    protected String vehicleIdentifier;
    protected String vehicleManufacturer;
    protected String vehicleModel;
    protected String vehicleRegistrationPlateIdentifier;
    @XmlSchemaType(name = "string")
    protected VehicleStatusEnum vehicleStatus;
    protected VehicleCharacteristics vehicleCharacteristics;
    protected List<AxleSpacing> axleSpacingOnVehicle;
    protected List<AxleWeight> specificAxleWeight;
    protected HazardousMaterials hazardousGoodsAssociatedWithVehicle;
    protected ExtensionType vehicleExtension;

    /**
     * Recupera il valore della proprietà vehicleColour.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getVehicleColour() {
        return vehicleColour;
    }

    /**
     * Imposta il valore della proprietà vehicleColour.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setVehicleColour(MultilingualString value) {
        this.vehicleColour = value;
    }

    /**
     * Recupera il valore della proprietà vehicleCountryOfOrigin.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getVehicleCountryOfOrigin() {
        return vehicleCountryOfOrigin;
    }

    /**
     * Imposta il valore della proprietà vehicleCountryOfOrigin.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setVehicleCountryOfOrigin(MultilingualString value) {
        this.vehicleCountryOfOrigin = value;
    }

    /**
     * Recupera il valore della proprietà vehicleIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleIdentifier() {
        return vehicleIdentifier;
    }

    /**
     * Imposta il valore della proprietà vehicleIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleIdentifier(String value) {
        this.vehicleIdentifier = value;
    }

    /**
     * Recupera il valore della proprietà vehicleManufacturer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleManufacturer() {
        return vehicleManufacturer;
    }

    /**
     * Imposta il valore della proprietà vehicleManufacturer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleManufacturer(String value) {
        this.vehicleManufacturer = value;
    }

    /**
     * Recupera il valore della proprietà vehicleModel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleModel() {
        return vehicleModel;
    }

    /**
     * Imposta il valore della proprietà vehicleModel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleModel(String value) {
        this.vehicleModel = value;
    }

    /**
     * Recupera il valore della proprietà vehicleRegistrationPlateIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleRegistrationPlateIdentifier() {
        return vehicleRegistrationPlateIdentifier;
    }

    /**
     * Imposta il valore della proprietà vehicleRegistrationPlateIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleRegistrationPlateIdentifier(String value) {
        this.vehicleRegistrationPlateIdentifier = value;
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
     * Gets the value of the axleSpacingOnVehicle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the axleSpacingOnVehicle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAxleSpacingOnVehicle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AxleSpacing }
     * 
     * 
     */
    public List<AxleSpacing> getAxleSpacingOnVehicle() {
        if (axleSpacingOnVehicle == null) {
            axleSpacingOnVehicle = new ArrayList<AxleSpacing>();
        }
        return this.axleSpacingOnVehicle;
    }

    /**
     * Gets the value of the specificAxleWeight property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specificAxleWeight property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecificAxleWeight().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AxleWeight }
     * 
     * 
     */
    public List<AxleWeight> getSpecificAxleWeight() {
        if (specificAxleWeight == null) {
            specificAxleWeight = new ArrayList<AxleWeight>();
        }
        return this.specificAxleWeight;
    }

    /**
     * Recupera il valore della proprietà hazardousGoodsAssociatedWithVehicle.
     * 
     * @return
     *     possible object is
     *     {@link HazardousMaterials }
     *     
     */
    public HazardousMaterials getHazardousGoodsAssociatedWithVehicle() {
        return hazardousGoodsAssociatedWithVehicle;
    }

    /**
     * Imposta il valore della proprietà hazardousGoodsAssociatedWithVehicle.
     * 
     * @param value
     *     allowed object is
     *     {@link HazardousMaterials }
     *     
     */
    public void setHazardousGoodsAssociatedWithVehicle(HazardousMaterials value) {
        this.hazardousGoodsAssociatedWithVehicle = value;
    }

    /**
     * Recupera il valore della proprietà vehicleExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getVehicleExtension() {
        return vehicleExtension;
    }

    /**
     * Imposta il valore della proprietà vehicleExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setVehicleExtension(ExtensionType value) {
        this.vehicleExtension = value;
    }

    public Vehicle withVehicleColour(MultilingualString value) {
        setVehicleColour(value);
        return this;
    }

    public Vehicle withVehicleCountryOfOrigin(MultilingualString value) {
        setVehicleCountryOfOrigin(value);
        return this;
    }

    public Vehicle withVehicleIdentifier(String value) {
        setVehicleIdentifier(value);
        return this;
    }

    public Vehicle withVehicleManufacturer(String value) {
        setVehicleManufacturer(value);
        return this;
    }

    public Vehicle withVehicleModel(String value) {
        setVehicleModel(value);
        return this;
    }

    public Vehicle withVehicleRegistrationPlateIdentifier(String value) {
        setVehicleRegistrationPlateIdentifier(value);
        return this;
    }

    public Vehicle withVehicleStatus(VehicleStatusEnum value) {
        setVehicleStatus(value);
        return this;
    }

    public Vehicle withVehicleCharacteristics(VehicleCharacteristics value) {
        setVehicleCharacteristics(value);
        return this;
    }

    public Vehicle withAxleSpacingOnVehicle(AxleSpacing... values) {
        if (values!= null) {
            for (AxleSpacing value: values) {
                getAxleSpacingOnVehicle().add(value);
            }
        }
        return this;
    }

    public Vehicle withAxleSpacingOnVehicle(Collection<AxleSpacing> values) {
        if (values!= null) {
            getAxleSpacingOnVehicle().addAll(values);
        }
        return this;
    }

    public Vehicle withSpecificAxleWeight(AxleWeight... values) {
        if (values!= null) {
            for (AxleWeight value: values) {
                getSpecificAxleWeight().add(value);
            }
        }
        return this;
    }

    public Vehicle withSpecificAxleWeight(Collection<AxleWeight> values) {
        if (values!= null) {
            getSpecificAxleWeight().addAll(values);
        }
        return this;
    }

    public Vehicle withHazardousGoodsAssociatedWithVehicle(HazardousMaterials value) {
        setHazardousGoodsAssociatedWithVehicle(value);
        return this;
    }

    public Vehicle withVehicleExtension(ExtensionType value) {
        setVehicleExtension(value);
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

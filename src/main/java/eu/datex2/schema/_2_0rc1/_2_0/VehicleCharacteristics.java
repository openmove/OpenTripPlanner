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
 * <p>Classe Java per VehicleCharacteristics complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="VehicleCharacteristics"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fuelType" type="{http://datex2.eu/schema/2_0RC1/2_0}FuelTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="loadType" type="{http://datex2.eu/schema/2_0RC1/2_0}LoadTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="vehicleEquipment" type="{http://datex2.eu/schema/2_0RC1/2_0}VehicleEquipmentEnum" minOccurs="0"/&gt;
 *         &lt;element name="vehicleType" type="{http://datex2.eu/schema/2_0RC1/2_0}VehicleTypeEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="vehicleUsage" type="{http://datex2.eu/schema/2_0RC1/2_0}VehicleUsageEnum" minOccurs="0"/&gt;
 *         &lt;element name="grossWeightCharacteristic" type="{http://datex2.eu/schema/2_0RC1/2_0}GrossWeightCharacteristic" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="heightCharacteristic" type="{http://datex2.eu/schema/2_0RC1/2_0}HeightCharacteristic" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="lengthCharacteristic" type="{http://datex2.eu/schema/2_0RC1/2_0}LengthCharacteristic" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="widthCharacteristic" type="{http://datex2.eu/schema/2_0RC1/2_0}WidthCharacteristic" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="heaviestAxleWeightCharacteristic" type="{http://datex2.eu/schema/2_0RC1/2_0}HeaviestAxleWeightCharacteristic" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="numberOfAxlesCharacteristic" type="{http://datex2.eu/schema/2_0RC1/2_0}NumberOfAxlesCharacteristic" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="vehicleCharacteristicsExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleCharacteristics", propOrder = {
    "fuelType",
    "loadType",
    "vehicleEquipment",
    "vehicleType",
    "vehicleUsage",
    "grossWeightCharacteristic",
    "heightCharacteristic",
    "lengthCharacteristic",
    "widthCharacteristic",
    "heaviestAxleWeightCharacteristic",
    "numberOfAxlesCharacteristic",
    "vehicleCharacteristicsExtension"
})
public class VehicleCharacteristics {

    @XmlSchemaType(name = "string")
    protected FuelTypeEnum fuelType;
    @XmlSchemaType(name = "string")
    protected LoadTypeEnum loadType;
    @XmlSchemaType(name = "string")
    protected VehicleEquipmentEnum vehicleEquipment;
    @XmlSchemaType(name = "string")
    protected List<VehicleTypeEnum> vehicleType;
    @XmlSchemaType(name = "string")
    protected VehicleUsageEnum vehicleUsage;
    protected List<GrossWeightCharacteristic> grossWeightCharacteristic;
    protected List<HeightCharacteristic> heightCharacteristic;
    protected List<LengthCharacteristic> lengthCharacteristic;
    protected List<WidthCharacteristic> widthCharacteristic;
    protected List<HeaviestAxleWeightCharacteristic> heaviestAxleWeightCharacteristic;
    protected List<NumberOfAxlesCharacteristic> numberOfAxlesCharacteristic;
    protected ExtensionType vehicleCharacteristicsExtension;

    /**
     * Recupera il valore della proprietà fuelType.
     * 
     * @return
     *     possible object is
     *     {@link FuelTypeEnum }
     *     
     */
    public FuelTypeEnum getFuelType() {
        return fuelType;
    }

    /**
     * Imposta il valore della proprietà fuelType.
     * 
     * @param value
     *     allowed object is
     *     {@link FuelTypeEnum }
     *     
     */
    public void setFuelType(FuelTypeEnum value) {
        this.fuelType = value;
    }

    /**
     * Recupera il valore della proprietà loadType.
     * 
     * @return
     *     possible object is
     *     {@link LoadTypeEnum }
     *     
     */
    public LoadTypeEnum getLoadType() {
        return loadType;
    }

    /**
     * Imposta il valore della proprietà loadType.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadTypeEnum }
     *     
     */
    public void setLoadType(LoadTypeEnum value) {
        this.loadType = value;
    }

    /**
     * Recupera il valore della proprietà vehicleEquipment.
     * 
     * @return
     *     possible object is
     *     {@link VehicleEquipmentEnum }
     *     
     */
    public VehicleEquipmentEnum getVehicleEquipment() {
        return vehicleEquipment;
    }

    /**
     * Imposta il valore della proprietà vehicleEquipment.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleEquipmentEnum }
     *     
     */
    public void setVehicleEquipment(VehicleEquipmentEnum value) {
        this.vehicleEquipment = value;
    }

    /**
     * Gets the value of the vehicleType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleTypeEnum }
     * 
     * 
     */
    public List<VehicleTypeEnum> getVehicleType() {
        if (vehicleType == null) {
            vehicleType = new ArrayList<VehicleTypeEnum>();
        }
        return this.vehicleType;
    }

    /**
     * Recupera il valore della proprietà vehicleUsage.
     * 
     * @return
     *     possible object is
     *     {@link VehicleUsageEnum }
     *     
     */
    public VehicleUsageEnum getVehicleUsage() {
        return vehicleUsage;
    }

    /**
     * Imposta il valore della proprietà vehicleUsage.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleUsageEnum }
     *     
     */
    public void setVehicleUsage(VehicleUsageEnum value) {
        this.vehicleUsage = value;
    }

    /**
     * Gets the value of the grossWeightCharacteristic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the grossWeightCharacteristic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGrossWeightCharacteristic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GrossWeightCharacteristic }
     * 
     * 
     */
    public List<GrossWeightCharacteristic> getGrossWeightCharacteristic() {
        if (grossWeightCharacteristic == null) {
            grossWeightCharacteristic = new ArrayList<GrossWeightCharacteristic>();
        }
        return this.grossWeightCharacteristic;
    }

    /**
     * Gets the value of the heightCharacteristic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the heightCharacteristic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHeightCharacteristic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HeightCharacteristic }
     * 
     * 
     */
    public List<HeightCharacteristic> getHeightCharacteristic() {
        if (heightCharacteristic == null) {
            heightCharacteristic = new ArrayList<HeightCharacteristic>();
        }
        return this.heightCharacteristic;
    }

    /**
     * Gets the value of the lengthCharacteristic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lengthCharacteristic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLengthCharacteristic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LengthCharacteristic }
     * 
     * 
     */
    public List<LengthCharacteristic> getLengthCharacteristic() {
        if (lengthCharacteristic == null) {
            lengthCharacteristic = new ArrayList<LengthCharacteristic>();
        }
        return this.lengthCharacteristic;
    }

    /**
     * Gets the value of the widthCharacteristic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the widthCharacteristic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWidthCharacteristic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WidthCharacteristic }
     * 
     * 
     */
    public List<WidthCharacteristic> getWidthCharacteristic() {
        if (widthCharacteristic == null) {
            widthCharacteristic = new ArrayList<WidthCharacteristic>();
        }
        return this.widthCharacteristic;
    }

    /**
     * Gets the value of the heaviestAxleWeightCharacteristic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the heaviestAxleWeightCharacteristic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHeaviestAxleWeightCharacteristic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HeaviestAxleWeightCharacteristic }
     * 
     * 
     */
    public List<HeaviestAxleWeightCharacteristic> getHeaviestAxleWeightCharacteristic() {
        if (heaviestAxleWeightCharacteristic == null) {
            heaviestAxleWeightCharacteristic = new ArrayList<HeaviestAxleWeightCharacteristic>();
        }
        return this.heaviestAxleWeightCharacteristic;
    }

    /**
     * Gets the value of the numberOfAxlesCharacteristic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numberOfAxlesCharacteristic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumberOfAxlesCharacteristic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NumberOfAxlesCharacteristic }
     * 
     * 
     */
    public List<NumberOfAxlesCharacteristic> getNumberOfAxlesCharacteristic() {
        if (numberOfAxlesCharacteristic == null) {
            numberOfAxlesCharacteristic = new ArrayList<NumberOfAxlesCharacteristic>();
        }
        return this.numberOfAxlesCharacteristic;
    }

    /**
     * Recupera il valore della proprietà vehicleCharacteristicsExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getVehicleCharacteristicsExtension() {
        return vehicleCharacteristicsExtension;
    }

    /**
     * Imposta il valore della proprietà vehicleCharacteristicsExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setVehicleCharacteristicsExtension(ExtensionType value) {
        this.vehicleCharacteristicsExtension = value;
    }

    public VehicleCharacteristics withFuelType(FuelTypeEnum value) {
        setFuelType(value);
        return this;
    }

    public VehicleCharacteristics withLoadType(LoadTypeEnum value) {
        setLoadType(value);
        return this;
    }

    public VehicleCharacteristics withVehicleEquipment(VehicleEquipmentEnum value) {
        setVehicleEquipment(value);
        return this;
    }

    public VehicleCharacteristics withVehicleType(VehicleTypeEnum... values) {
        if (values!= null) {
            for (VehicleTypeEnum value: values) {
                getVehicleType().add(value);
            }
        }
        return this;
    }

    public VehicleCharacteristics withVehicleType(Collection<VehicleTypeEnum> values) {
        if (values!= null) {
            getVehicleType().addAll(values);
        }
        return this;
    }

    public VehicleCharacteristics withVehicleUsage(VehicleUsageEnum value) {
        setVehicleUsage(value);
        return this;
    }

    public VehicleCharacteristics withGrossWeightCharacteristic(GrossWeightCharacteristic... values) {
        if (values!= null) {
            for (GrossWeightCharacteristic value: values) {
                getGrossWeightCharacteristic().add(value);
            }
        }
        return this;
    }

    public VehicleCharacteristics withGrossWeightCharacteristic(Collection<GrossWeightCharacteristic> values) {
        if (values!= null) {
            getGrossWeightCharacteristic().addAll(values);
        }
        return this;
    }

    public VehicleCharacteristics withHeightCharacteristic(HeightCharacteristic... values) {
        if (values!= null) {
            for (HeightCharacteristic value: values) {
                getHeightCharacteristic().add(value);
            }
        }
        return this;
    }

    public VehicleCharacteristics withHeightCharacteristic(Collection<HeightCharacteristic> values) {
        if (values!= null) {
            getHeightCharacteristic().addAll(values);
        }
        return this;
    }

    public VehicleCharacteristics withLengthCharacteristic(LengthCharacteristic... values) {
        if (values!= null) {
            for (LengthCharacteristic value: values) {
                getLengthCharacteristic().add(value);
            }
        }
        return this;
    }

    public VehicleCharacteristics withLengthCharacteristic(Collection<LengthCharacteristic> values) {
        if (values!= null) {
            getLengthCharacteristic().addAll(values);
        }
        return this;
    }

    public VehicleCharacteristics withWidthCharacteristic(WidthCharacteristic... values) {
        if (values!= null) {
            for (WidthCharacteristic value: values) {
                getWidthCharacteristic().add(value);
            }
        }
        return this;
    }

    public VehicleCharacteristics withWidthCharacteristic(Collection<WidthCharacteristic> values) {
        if (values!= null) {
            getWidthCharacteristic().addAll(values);
        }
        return this;
    }

    public VehicleCharacteristics withHeaviestAxleWeightCharacteristic(HeaviestAxleWeightCharacteristic... values) {
        if (values!= null) {
            for (HeaviestAxleWeightCharacteristic value: values) {
                getHeaviestAxleWeightCharacteristic().add(value);
            }
        }
        return this;
    }

    public VehicleCharacteristics withHeaviestAxleWeightCharacteristic(Collection<HeaviestAxleWeightCharacteristic> values) {
        if (values!= null) {
            getHeaviestAxleWeightCharacteristic().addAll(values);
        }
        return this;
    }

    public VehicleCharacteristics withNumberOfAxlesCharacteristic(NumberOfAxlesCharacteristic... values) {
        if (values!= null) {
            for (NumberOfAxlesCharacteristic value: values) {
                getNumberOfAxlesCharacteristic().add(value);
            }
        }
        return this;
    }

    public VehicleCharacteristics withNumberOfAxlesCharacteristic(Collection<NumberOfAxlesCharacteristic> values) {
        if (values!= null) {
            getNumberOfAxlesCharacteristic().addAll(values);
        }
        return this;
    }

    public VehicleCharacteristics withVehicleCharacteristicsExtension(ExtensionType value) {
        setVehicleCharacteristicsExtension(value);
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

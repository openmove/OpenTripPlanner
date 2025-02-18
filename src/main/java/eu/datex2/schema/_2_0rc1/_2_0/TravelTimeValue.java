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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per TravelTimeValue complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TravelTimeValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}BasicDataValue"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="travelTime" type="{http://datex2.eu/schema/2_0RC1/2_0}Seconds" minOccurs="0"/&gt;
 *         &lt;element name="travelTimeTrendType" type="{http://datex2.eu/schema/2_0RC1/2_0}TravelTimeTrendTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="travelTimeType" type="{http://datex2.eu/schema/2_0RC1/2_0}TravelTimeTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="freeFlowSpeed" type="{http://datex2.eu/schema/2_0RC1/2_0}KilometresPerHour" minOccurs="0"/&gt;
 *         &lt;element name="freeFlowTravelTime" type="{http://datex2.eu/schema/2_0RC1/2_0}Seconds" minOccurs="0"/&gt;
 *         &lt;element name="normallyExpectedTravelTime" type="{http://datex2.eu/schema/2_0RC1/2_0}Seconds" minOccurs="0"/&gt;
 *         &lt;element name="vehicleType" type="{http://datex2.eu/schema/2_0RC1/2_0}VehicleTypeEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="travelTimeValueExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelTimeValue", propOrder = {
    "travelTime",
    "travelTimeTrendType",
    "travelTimeType",
    "freeFlowSpeed",
    "freeFlowTravelTime",
    "normallyExpectedTravelTime",
    "vehicleType",
    "travelTimeValueExtension"
})
public class TravelTimeValue
    extends BasicDataValue
{

    protected Float travelTime;
    @XmlSchemaType(name = "string")
    protected TravelTimeTrendTypeEnum travelTimeTrendType;
    @XmlSchemaType(name = "string")
    protected TravelTimeTypeEnum travelTimeType;
    protected Float freeFlowSpeed;
    protected Float freeFlowTravelTime;
    protected Float normallyExpectedTravelTime;
    @XmlSchemaType(name = "string")
    protected List<VehicleTypeEnum> vehicleType;
    protected ExtensionType travelTimeValueExtension;

    /**
     * Recupera il valore della proprietà travelTime.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTravelTime() {
        return travelTime;
    }

    /**
     * Imposta il valore della proprietà travelTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTravelTime(Float value) {
        this.travelTime = value;
    }

    /**
     * Recupera il valore della proprietà travelTimeTrendType.
     * 
     * @return
     *     possible object is
     *     {@link TravelTimeTrendTypeEnum }
     *     
     */
    public TravelTimeTrendTypeEnum getTravelTimeTrendType() {
        return travelTimeTrendType;
    }

    /**
     * Imposta il valore della proprietà travelTimeTrendType.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelTimeTrendTypeEnum }
     *     
     */
    public void setTravelTimeTrendType(TravelTimeTrendTypeEnum value) {
        this.travelTimeTrendType = value;
    }

    /**
     * Recupera il valore della proprietà travelTimeType.
     * 
     * @return
     *     possible object is
     *     {@link TravelTimeTypeEnum }
     *     
     */
    public TravelTimeTypeEnum getTravelTimeType() {
        return travelTimeType;
    }

    /**
     * Imposta il valore della proprietà travelTimeType.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelTimeTypeEnum }
     *     
     */
    public void setTravelTimeType(TravelTimeTypeEnum value) {
        this.travelTimeType = value;
    }

    /**
     * Recupera il valore della proprietà freeFlowSpeed.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFreeFlowSpeed() {
        return freeFlowSpeed;
    }

    /**
     * Imposta il valore della proprietà freeFlowSpeed.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFreeFlowSpeed(Float value) {
        this.freeFlowSpeed = value;
    }

    /**
     * Recupera il valore della proprietà freeFlowTravelTime.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFreeFlowTravelTime() {
        return freeFlowTravelTime;
    }

    /**
     * Imposta il valore della proprietà freeFlowTravelTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFreeFlowTravelTime(Float value) {
        this.freeFlowTravelTime = value;
    }

    /**
     * Recupera il valore della proprietà normallyExpectedTravelTime.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getNormallyExpectedTravelTime() {
        return normallyExpectedTravelTime;
    }

    /**
     * Imposta il valore della proprietà normallyExpectedTravelTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setNormallyExpectedTravelTime(Float value) {
        this.normallyExpectedTravelTime = value;
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
     * Recupera il valore della proprietà travelTimeValueExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTravelTimeValueExtension() {
        return travelTimeValueExtension;
    }

    /**
     * Imposta il valore della proprietà travelTimeValueExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTravelTimeValueExtension(ExtensionType value) {
        this.travelTimeValueExtension = value;
    }

    public TravelTimeValue withTravelTime(Float value) {
        setTravelTime(value);
        return this;
    }

    public TravelTimeValue withTravelTimeTrendType(TravelTimeTrendTypeEnum value) {
        setTravelTimeTrendType(value);
        return this;
    }

    public TravelTimeValue withTravelTimeType(TravelTimeTypeEnum value) {
        setTravelTimeType(value);
        return this;
    }

    public TravelTimeValue withFreeFlowSpeed(Float value) {
        setFreeFlowSpeed(value);
        return this;
    }

    public TravelTimeValue withFreeFlowTravelTime(Float value) {
        setFreeFlowTravelTime(value);
        return this;
    }

    public TravelTimeValue withNormallyExpectedTravelTime(Float value) {
        setNormallyExpectedTravelTime(value);
        return this;
    }

    public TravelTimeValue withVehicleType(VehicleTypeEnum... values) {
        if (values!= null) {
            for (VehicleTypeEnum value: values) {
                getVehicleType().add(value);
            }
        }
        return this;
    }

    public TravelTimeValue withVehicleType(Collection<VehicleTypeEnum> values) {
        if (values!= null) {
            getVehicleType().addAll(values);
        }
        return this;
    }

    public TravelTimeValue withTravelTimeValueExtension(ExtensionType value) {
        setTravelTimeValueExtension(value);
        return this;
    }

    @Override
    public TravelTimeValue withAccuracy(Float value) {
        setAccuracy(value);
        return this;
    }

    @Override
    public TravelTimeValue withComputationalMethod(ComputationMethodEnum value) {
        setComputationalMethod(value);
        return this;
    }

    @Override
    public TravelTimeValue withFault(Boolean value) {
        setFault(value);
        return this;
    }

    @Override
    public TravelTimeValue withFaultReason(MultilingualString value) {
        setFaultReason(value);
        return this;
    }

    @Override
    public TravelTimeValue withNumberOfIncompleteInputs(BigInteger value) {
        setNumberOfIncompleteInputs(value);
        return this;
    }

    @Override
    public TravelTimeValue withNumberOfInputValuesUsed(BigInteger value) {
        setNumberOfInputValuesUsed(value);
        return this;
    }

    @Override
    public TravelTimeValue withPeriod(Float value) {
        setPeriod(value);
        return this;
    }

    @Override
    public TravelTimeValue withSmoothingFactor(Float value) {
        setSmoothingFactor(value);
        return this;
    }

    @Override
    public TravelTimeValue withStandardDeviation(Float value) {
        setStandardDeviation(value);
        return this;
    }

    @Override
    public TravelTimeValue withSupplierCalculatedDataQuality(Float value) {
        setSupplierCalculatedDataQuality(value);
        return this;
    }

    @Override
    public TravelTimeValue withTime(LocalDateTime value) {
        setTime(value);
        return this;
    }

    @Override
    public TravelTimeValue withPertinentLocation(GroupOfLocations value) {
        setPertinentLocation(value);
        return this;
    }

    @Override
    public TravelTimeValue withBasicDataValueExtension(ExtensionType value) {
        setBasicDataValueExtension(value);
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

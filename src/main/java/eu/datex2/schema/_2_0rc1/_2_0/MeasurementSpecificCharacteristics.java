//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per MeasurementSpecificCharacteristics complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="MeasurementSpecificCharacteristics"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accuracy" type="{http://datex2.eu/schema/2_0RC1/2_0}Percentage" minOccurs="0"/&gt;
 *         &lt;element name="period" type="{http://datex2.eu/schema/2_0RC1/2_0}Seconds" minOccurs="0"/&gt;
 *         &lt;element name="smoothingFactor" type="{http://datex2.eu/schema/2_0RC1/2_0}Float" minOccurs="0"/&gt;
 *         &lt;element name="specificLane" type="{http://datex2.eu/schema/2_0RC1/2_0}LaneEnum" minOccurs="0"/&gt;
 *         &lt;element name="specificMeasurementValueType" type="{http://datex2.eu/schema/2_0RC1/2_0}MeasuredOrDerivedDataTypeEnum"/&gt;
 *         &lt;element name="specificVehicleCharacteristics" type="{http://datex2.eu/schema/2_0RC1/2_0}VehicleCharacteristics" minOccurs="0"/&gt;
 *         &lt;element name="measurementSpecificCharacteristicsExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasurementSpecificCharacteristics", propOrder = {
    "accuracy",
    "period",
    "smoothingFactor",
    "specificLane",
    "specificMeasurementValueType",
    "specificVehicleCharacteristics",
    "measurementSpecificCharacteristicsExtension"
})
@XmlSeeAlso({
    eu.datex2.schema._2_0rc1._2_0.MeasurementSiteRecord.MeasurementSpecificCharacteristics.class
})
public class MeasurementSpecificCharacteristics {

    protected Float accuracy;
    protected Float period;
    protected Float smoothingFactor;
    @XmlSchemaType(name = "string")
    protected LaneEnum specificLane;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected MeasuredOrDerivedDataTypeEnum specificMeasurementValueType;
    protected VehicleCharacteristics specificVehicleCharacteristics;
    protected ExtensionType measurementSpecificCharacteristicsExtension;

    /**
     * Recupera il valore della proprietà accuracy.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAccuracy() {
        return accuracy;
    }

    /**
     * Imposta il valore della proprietà accuracy.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAccuracy(Float value) {
        this.accuracy = value;
    }

    /**
     * Recupera il valore della proprietà period.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPeriod() {
        return period;
    }

    /**
     * Imposta il valore della proprietà period.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPeriod(Float value) {
        this.period = value;
    }

    /**
     * Recupera il valore della proprietà smoothingFactor.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSmoothingFactor() {
        return smoothingFactor;
    }

    /**
     * Imposta il valore della proprietà smoothingFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSmoothingFactor(Float value) {
        this.smoothingFactor = value;
    }

    /**
     * Recupera il valore della proprietà specificLane.
     * 
     * @return
     *     possible object is
     *     {@link LaneEnum }
     *     
     */
    public LaneEnum getSpecificLane() {
        return specificLane;
    }

    /**
     * Imposta il valore della proprietà specificLane.
     * 
     * @param value
     *     allowed object is
     *     {@link LaneEnum }
     *     
     */
    public void setSpecificLane(LaneEnum value) {
        this.specificLane = value;
    }

    /**
     * Recupera il valore della proprietà specificMeasurementValueType.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredOrDerivedDataTypeEnum }
     *     
     */
    public MeasuredOrDerivedDataTypeEnum getSpecificMeasurementValueType() {
        return specificMeasurementValueType;
    }

    /**
     * Imposta il valore della proprietà specificMeasurementValueType.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredOrDerivedDataTypeEnum }
     *     
     */
    public void setSpecificMeasurementValueType(MeasuredOrDerivedDataTypeEnum value) {
        this.specificMeasurementValueType = value;
    }

    /**
     * Recupera il valore della proprietà specificVehicleCharacteristics.
     * 
     * @return
     *     possible object is
     *     {@link VehicleCharacteristics }
     *     
     */
    public VehicleCharacteristics getSpecificVehicleCharacteristics() {
        return specificVehicleCharacteristics;
    }

    /**
     * Imposta il valore della proprietà specificVehicleCharacteristics.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleCharacteristics }
     *     
     */
    public void setSpecificVehicleCharacteristics(VehicleCharacteristics value) {
        this.specificVehicleCharacteristics = value;
    }

    /**
     * Recupera il valore della proprietà measurementSpecificCharacteristicsExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getMeasurementSpecificCharacteristicsExtension() {
        return measurementSpecificCharacteristicsExtension;
    }

    /**
     * Imposta il valore della proprietà measurementSpecificCharacteristicsExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setMeasurementSpecificCharacteristicsExtension(ExtensionType value) {
        this.measurementSpecificCharacteristicsExtension = value;
    }

    public MeasurementSpecificCharacteristics withAccuracy(Float value) {
        setAccuracy(value);
        return this;
    }

    public MeasurementSpecificCharacteristics withPeriod(Float value) {
        setPeriod(value);
        return this;
    }

    public MeasurementSpecificCharacteristics withSmoothingFactor(Float value) {
        setSmoothingFactor(value);
        return this;
    }

    public MeasurementSpecificCharacteristics withSpecificLane(LaneEnum value) {
        setSpecificLane(value);
        return this;
    }

    public MeasurementSpecificCharacteristics withSpecificMeasurementValueType(MeasuredOrDerivedDataTypeEnum value) {
        setSpecificMeasurementValueType(value);
        return this;
    }

    public MeasurementSpecificCharacteristics withSpecificVehicleCharacteristics(VehicleCharacteristics value) {
        setSpecificVehicleCharacteristics(value);
        return this;
    }

    public MeasurementSpecificCharacteristics withMeasurementSpecificCharacteristicsExtension(ExtensionType value) {
        setMeasurementSpecificCharacteristicsExtension(value);
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

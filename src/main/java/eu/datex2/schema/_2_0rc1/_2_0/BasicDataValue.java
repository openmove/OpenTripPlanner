//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import java.math.BigInteger;
import java.time.LocalDateTime;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.LocalDateTimeISO8601XmlAdapter;


/**
 * <p>Classe Java per BasicDataValue complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BasicDataValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accuracy" type="{http://datex2.eu/schema/2_0RC1/2_0}Percentage" minOccurs="0"/&gt;
 *         &lt;element name="computationalMethod" type="{http://datex2.eu/schema/2_0RC1/2_0}ComputationMethodEnum" minOccurs="0"/&gt;
 *         &lt;element name="fault" type="{http://datex2.eu/schema/2_0RC1/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="faultReason" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="numberOfIncompleteInputs" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="numberOfInputValuesUsed" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="period" type="{http://datex2.eu/schema/2_0RC1/2_0}Seconds" minOccurs="0"/&gt;
 *         &lt;element name="smoothingFactor" type="{http://datex2.eu/schema/2_0RC1/2_0}Float" minOccurs="0"/&gt;
 *         &lt;element name="standardDeviation" type="{http://datex2.eu/schema/2_0RC1/2_0}Float" minOccurs="0"/&gt;
 *         &lt;element name="supplierCalculatedDataQuality" type="{http://datex2.eu/schema/2_0RC1/2_0}Percentage" minOccurs="0"/&gt;
 *         &lt;element name="time" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="pertinentLocation" type="{http://datex2.eu/schema/2_0RC1/2_0}GroupOfLocations" minOccurs="0"/&gt;
 *         &lt;element name="basicDataValueExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasicDataValue", propOrder = {
    "accuracy",
    "computationalMethod",
    "fault",
    "faultReason",
    "numberOfIncompleteInputs",
    "numberOfInputValuesUsed",
    "period",
    "smoothingFactor",
    "standardDeviation",
    "supplierCalculatedDataQuality",
    "time",
    "pertinentLocation",
    "basicDataValueExtension"
})
@XmlSeeAlso({
    TrafficStatusValue.class,
    TrafficValue.class,
    TravelTimeValue.class,
    WeatherValue.class
})
public abstract class BasicDataValue {

    protected Float accuracy;
    @XmlSchemaType(name = "string")
    protected ComputationMethodEnum computationalMethod;
    protected Boolean fault;
    protected MultilingualString faultReason;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfIncompleteInputs;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfInputValuesUsed;
    protected Float period;
    protected Float smoothingFactor;
    protected Float standardDeviation;
    protected Float supplierCalculatedDataQuality;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime time;
    protected GroupOfLocations pertinentLocation;
    protected ExtensionType basicDataValueExtension;

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
     * Recupera il valore della proprietà computationalMethod.
     * 
     * @return
     *     possible object is
     *     {@link ComputationMethodEnum }
     *     
     */
    public ComputationMethodEnum getComputationalMethod() {
        return computationalMethod;
    }

    /**
     * Imposta il valore della proprietà computationalMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link ComputationMethodEnum }
     *     
     */
    public void setComputationalMethod(ComputationMethodEnum value) {
        this.computationalMethod = value;
    }

    /**
     * Recupera il valore della proprietà fault.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFault() {
        return fault;
    }

    /**
     * Imposta il valore della proprietà fault.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFault(Boolean value) {
        this.fault = value;
    }

    /**
     * Recupera il valore della proprietà faultReason.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getFaultReason() {
        return faultReason;
    }

    /**
     * Imposta il valore della proprietà faultReason.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setFaultReason(MultilingualString value) {
        this.faultReason = value;
    }

    /**
     * Recupera il valore della proprietà numberOfIncompleteInputs.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfIncompleteInputs() {
        return numberOfIncompleteInputs;
    }

    /**
     * Imposta il valore della proprietà numberOfIncompleteInputs.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfIncompleteInputs(BigInteger value) {
        this.numberOfIncompleteInputs = value;
    }

    /**
     * Recupera il valore della proprietà numberOfInputValuesUsed.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfInputValuesUsed() {
        return numberOfInputValuesUsed;
    }

    /**
     * Imposta il valore della proprietà numberOfInputValuesUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfInputValuesUsed(BigInteger value) {
        this.numberOfInputValuesUsed = value;
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
     * Recupera il valore della proprietà standardDeviation.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getStandardDeviation() {
        return standardDeviation;
    }

    /**
     * Imposta il valore della proprietà standardDeviation.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setStandardDeviation(Float value) {
        this.standardDeviation = value;
    }

    /**
     * Recupera il valore della proprietà supplierCalculatedDataQuality.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSupplierCalculatedDataQuality() {
        return supplierCalculatedDataQuality;
    }

    /**
     * Imposta il valore della proprietà supplierCalculatedDataQuality.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSupplierCalculatedDataQuality(Float value) {
        this.supplierCalculatedDataQuality = value;
    }

    /**
     * Recupera il valore della proprietà time.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getTime() {
        return time;
    }

    /**
     * Imposta il valore della proprietà time.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTime(LocalDateTime value) {
        this.time = value;
    }

    /**
     * Recupera il valore della proprietà pertinentLocation.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfLocations }
     *     
     */
    public GroupOfLocations getPertinentLocation() {
        return pertinentLocation;
    }

    /**
     * Imposta il valore della proprietà pertinentLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfLocations }
     *     
     */
    public void setPertinentLocation(GroupOfLocations value) {
        this.pertinentLocation = value;
    }

    /**
     * Recupera il valore della proprietà basicDataValueExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getBasicDataValueExtension() {
        return basicDataValueExtension;
    }

    /**
     * Imposta il valore della proprietà basicDataValueExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setBasicDataValueExtension(ExtensionType value) {
        this.basicDataValueExtension = value;
    }

    public BasicDataValue withAccuracy(Float value) {
        setAccuracy(value);
        return this;
    }

    public BasicDataValue withComputationalMethod(ComputationMethodEnum value) {
        setComputationalMethod(value);
        return this;
    }

    public BasicDataValue withFault(Boolean value) {
        setFault(value);
        return this;
    }

    public BasicDataValue withFaultReason(MultilingualString value) {
        setFaultReason(value);
        return this;
    }

    public BasicDataValue withNumberOfIncompleteInputs(BigInteger value) {
        setNumberOfIncompleteInputs(value);
        return this;
    }

    public BasicDataValue withNumberOfInputValuesUsed(BigInteger value) {
        setNumberOfInputValuesUsed(value);
        return this;
    }

    public BasicDataValue withPeriod(Float value) {
        setPeriod(value);
        return this;
    }

    public BasicDataValue withSmoothingFactor(Float value) {
        setSmoothingFactor(value);
        return this;
    }

    public BasicDataValue withStandardDeviation(Float value) {
        setStandardDeviation(value);
        return this;
    }

    public BasicDataValue withSupplierCalculatedDataQuality(Float value) {
        setSupplierCalculatedDataQuality(value);
        return this;
    }

    public BasicDataValue withTime(LocalDateTime value) {
        setTime(value);
        return this;
    }

    public BasicDataValue withPertinentLocation(GroupOfLocations value) {
        setPertinentLocation(value);
        return this;
    }

    public BasicDataValue withBasicDataValueExtension(ExtensionType value) {
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

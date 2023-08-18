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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per TrafficFlow complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TrafficFlow"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}TrafficValue"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="axleFlow" type="{http://datex2.eu/schema/2_0RC1/2_0}AxlesPerHour" minOccurs="0"/&gt;
 *         &lt;element name="pcuFlow" type="{http://datex2.eu/schema/2_0RC1/2_0}PassengerCarUnitsPerHour" minOccurs="0"/&gt;
 *         &lt;element name="percentageLongVehicles" type="{http://datex2.eu/schema/2_0RC1/2_0}Percentage" minOccurs="0"/&gt;
 *         &lt;element name="vehicleFlow" type="{http://datex2.eu/schema/2_0RC1/2_0}VehiclesPerHour" minOccurs="0"/&gt;
 *         &lt;element name="trafficFlowExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficFlow", propOrder = {
    "axleFlow",
    "pcuFlow",
    "percentageLongVehicles",
    "vehicleFlow",
    "trafficFlowExtension"
})
public class TrafficFlow
    extends TrafficValue
{

    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger axleFlow;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger pcuFlow;
    protected Float percentageLongVehicles;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger vehicleFlow;
    protected ExtensionType trafficFlowExtension;

    /**
     * Recupera il valore della proprietà axleFlow.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAxleFlow() {
        return axleFlow;
    }

    /**
     * Imposta il valore della proprietà axleFlow.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAxleFlow(BigInteger value) {
        this.axleFlow = value;
    }

    /**
     * Recupera il valore della proprietà pcuFlow.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPcuFlow() {
        return pcuFlow;
    }

    /**
     * Imposta il valore della proprietà pcuFlow.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPcuFlow(BigInteger value) {
        this.pcuFlow = value;
    }

    /**
     * Recupera il valore della proprietà percentageLongVehicles.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPercentageLongVehicles() {
        return percentageLongVehicles;
    }

    /**
     * Imposta il valore della proprietà percentageLongVehicles.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPercentageLongVehicles(Float value) {
        this.percentageLongVehicles = value;
    }

    /**
     * Recupera il valore della proprietà vehicleFlow.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVehicleFlow() {
        return vehicleFlow;
    }

    /**
     * Imposta il valore della proprietà vehicleFlow.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVehicleFlow(BigInteger value) {
        this.vehicleFlow = value;
    }

    /**
     * Recupera il valore della proprietà trafficFlowExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTrafficFlowExtension() {
        return trafficFlowExtension;
    }

    /**
     * Imposta il valore della proprietà trafficFlowExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTrafficFlowExtension(ExtensionType value) {
        this.trafficFlowExtension = value;
    }

    public TrafficFlow withAxleFlow(BigInteger value) {
        setAxleFlow(value);
        return this;
    }

    public TrafficFlow withPcuFlow(BigInteger value) {
        setPcuFlow(value);
        return this;
    }

    public TrafficFlow withPercentageLongVehicles(Float value) {
        setPercentageLongVehicles(value);
        return this;
    }

    public TrafficFlow withVehicleFlow(BigInteger value) {
        setVehicleFlow(value);
        return this;
    }

    public TrafficFlow withTrafficFlowExtension(ExtensionType value) {
        setTrafficFlowExtension(value);
        return this;
    }

    @Override
    public TrafficFlow withForVehiclesWithCharacteristicsOf(VehicleCharacteristics value) {
        setForVehiclesWithCharacteristicsOf(value);
        return this;
    }

    @Override
    public TrafficFlow withTrafficValueExtension(ExtensionType value) {
        setTrafficValueExtension(value);
        return this;
    }

    @Override
    public TrafficFlow withAccuracy(Float value) {
        setAccuracy(value);
        return this;
    }

    @Override
    public TrafficFlow withComputationalMethod(ComputationMethodEnum value) {
        setComputationalMethod(value);
        return this;
    }

    @Override
    public TrafficFlow withFault(Boolean value) {
        setFault(value);
        return this;
    }

    @Override
    public TrafficFlow withFaultReason(MultilingualString value) {
        setFaultReason(value);
        return this;
    }

    @Override
    public TrafficFlow withNumberOfIncompleteInputs(BigInteger value) {
        setNumberOfIncompleteInputs(value);
        return this;
    }

    @Override
    public TrafficFlow withNumberOfInputValuesUsed(BigInteger value) {
        setNumberOfInputValuesUsed(value);
        return this;
    }

    @Override
    public TrafficFlow withPeriod(Float value) {
        setPeriod(value);
        return this;
    }

    @Override
    public TrafficFlow withSmoothingFactor(Float value) {
        setSmoothingFactor(value);
        return this;
    }

    @Override
    public TrafficFlow withStandardDeviation(Float value) {
        setStandardDeviation(value);
        return this;
    }

    @Override
    public TrafficFlow withSupplierCalculatedDataQuality(Float value) {
        setSupplierCalculatedDataQuality(value);
        return this;
    }

    @Override
    public TrafficFlow withTime(LocalDateTime value) {
        setTime(value);
        return this;
    }

    @Override
    public TrafficFlow withPertinentLocation(GroupOfLocations value) {
        setPertinentLocation(value);
        return this;
    }

    @Override
    public TrafficFlow withBasicDataValueExtension(ExtensionType value) {
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

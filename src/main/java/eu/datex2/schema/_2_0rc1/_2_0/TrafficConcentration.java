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
 * <p>Classe Java per TrafficConcentration complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TrafficConcentration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}TrafficValue"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="concentration" type="{http://datex2.eu/schema/2_0RC1/2_0}ConcentrationVehiclesPerKilometre" minOccurs="0"/&gt;
 *         &lt;element name="occupancy" type="{http://datex2.eu/schema/2_0RC1/2_0}Percentage" minOccurs="0"/&gt;
 *         &lt;element name="trafficConcentrationExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficConcentration", propOrder = {
    "concentration",
    "occupancy",
    "trafficConcentrationExtension"
})
public class TrafficConcentration
    extends TrafficValue
{

    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger concentration;
    protected Float occupancy;
    protected ExtensionType trafficConcentrationExtension;

    /**
     * Recupera il valore della proprietà concentration.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getConcentration() {
        return concentration;
    }

    /**
     * Imposta il valore della proprietà concentration.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setConcentration(BigInteger value) {
        this.concentration = value;
    }

    /**
     * Recupera il valore della proprietà occupancy.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getOccupancy() {
        return occupancy;
    }

    /**
     * Imposta il valore della proprietà occupancy.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setOccupancy(Float value) {
        this.occupancy = value;
    }

    /**
     * Recupera il valore della proprietà trafficConcentrationExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTrafficConcentrationExtension() {
        return trafficConcentrationExtension;
    }

    /**
     * Imposta il valore della proprietà trafficConcentrationExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTrafficConcentrationExtension(ExtensionType value) {
        this.trafficConcentrationExtension = value;
    }

    public TrafficConcentration withConcentration(BigInteger value) {
        setConcentration(value);
        return this;
    }

    public TrafficConcentration withOccupancy(Float value) {
        setOccupancy(value);
        return this;
    }

    public TrafficConcentration withTrafficConcentrationExtension(ExtensionType value) {
        setTrafficConcentrationExtension(value);
        return this;
    }

    @Override
    public TrafficConcentration withForVehiclesWithCharacteristicsOf(VehicleCharacteristics value) {
        setForVehiclesWithCharacteristicsOf(value);
        return this;
    }

    @Override
    public TrafficConcentration withTrafficValueExtension(ExtensionType value) {
        setTrafficValueExtension(value);
        return this;
    }

    @Override
    public TrafficConcentration withAccuracy(Float value) {
        setAccuracy(value);
        return this;
    }

    @Override
    public TrafficConcentration withComputationalMethod(ComputationMethodEnum value) {
        setComputationalMethod(value);
        return this;
    }

    @Override
    public TrafficConcentration withFault(Boolean value) {
        setFault(value);
        return this;
    }

    @Override
    public TrafficConcentration withFaultReason(MultilingualString value) {
        setFaultReason(value);
        return this;
    }

    @Override
    public TrafficConcentration withNumberOfIncompleteInputs(BigInteger value) {
        setNumberOfIncompleteInputs(value);
        return this;
    }

    @Override
    public TrafficConcentration withNumberOfInputValuesUsed(BigInteger value) {
        setNumberOfInputValuesUsed(value);
        return this;
    }

    @Override
    public TrafficConcentration withPeriod(Float value) {
        setPeriod(value);
        return this;
    }

    @Override
    public TrafficConcentration withSmoothingFactor(Float value) {
        setSmoothingFactor(value);
        return this;
    }

    @Override
    public TrafficConcentration withStandardDeviation(Float value) {
        setStandardDeviation(value);
        return this;
    }

    @Override
    public TrafficConcentration withSupplierCalculatedDataQuality(Float value) {
        setSupplierCalculatedDataQuality(value);
        return this;
    }

    @Override
    public TrafficConcentration withTime(LocalDateTime value) {
        setTime(value);
        return this;
    }

    @Override
    public TrafficConcentration withPertinentLocation(GroupOfLocations value) {
        setPertinentLocation(value);
        return this;
    }

    @Override
    public TrafficConcentration withBasicDataValueExtension(ExtensionType value) {
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

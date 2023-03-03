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
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per TrafficSpeed complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TrafficSpeed"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}TrafficValue"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="averageVehicleSpeed" type="{http://datex2.eu/schema/2_0RC1/2_0}KilometresPerHour" minOccurs="0"/&gt;
 *         &lt;element name="speedPercentile" type="{http://datex2.eu/schema/2_0RC1/2_0}SpeedPercentile" minOccurs="0"/&gt;
 *         &lt;element name="trafficSpeedExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficSpeed", propOrder = {
    "averageVehicleSpeed",
    "speedPercentile",
    "trafficSpeedExtension"
})
public class TrafficSpeed
    extends TrafficValue
{

    protected Float averageVehicleSpeed;
    protected SpeedPercentile speedPercentile;
    protected ExtensionType trafficSpeedExtension;

    /**
     * Recupera il valore della proprietà averageVehicleSpeed.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAverageVehicleSpeed() {
        return averageVehicleSpeed;
    }

    /**
     * Imposta il valore della proprietà averageVehicleSpeed.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAverageVehicleSpeed(Float value) {
        this.averageVehicleSpeed = value;
    }

    /**
     * Recupera il valore della proprietà speedPercentile.
     * 
     * @return
     *     possible object is
     *     {@link SpeedPercentile }
     *     
     */
    public SpeedPercentile getSpeedPercentile() {
        return speedPercentile;
    }

    /**
     * Imposta il valore della proprietà speedPercentile.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeedPercentile }
     *     
     */
    public void setSpeedPercentile(SpeedPercentile value) {
        this.speedPercentile = value;
    }

    /**
     * Recupera il valore della proprietà trafficSpeedExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTrafficSpeedExtension() {
        return trafficSpeedExtension;
    }

    /**
     * Imposta il valore della proprietà trafficSpeedExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTrafficSpeedExtension(ExtensionType value) {
        this.trafficSpeedExtension = value;
    }

    public TrafficSpeed withAverageVehicleSpeed(Float value) {
        setAverageVehicleSpeed(value);
        return this;
    }

    public TrafficSpeed withSpeedPercentile(SpeedPercentile value) {
        setSpeedPercentile(value);
        return this;
    }

    public TrafficSpeed withTrafficSpeedExtension(ExtensionType value) {
        setTrafficSpeedExtension(value);
        return this;
    }

    @Override
    public TrafficSpeed withForVehiclesWithCharacteristicsOf(VehicleCharacteristics value) {
        setForVehiclesWithCharacteristicsOf(value);
        return this;
    }

    @Override
    public TrafficSpeed withTrafficValueExtension(ExtensionType value) {
        setTrafficValueExtension(value);
        return this;
    }

    @Override
    public TrafficSpeed withAccuracy(Float value) {
        setAccuracy(value);
        return this;
    }

    @Override
    public TrafficSpeed withComputationalMethod(ComputationMethodEnum value) {
        setComputationalMethod(value);
        return this;
    }

    @Override
    public TrafficSpeed withFault(Boolean value) {
        setFault(value);
        return this;
    }

    @Override
    public TrafficSpeed withFaultReason(MultilingualString value) {
        setFaultReason(value);
        return this;
    }

    @Override
    public TrafficSpeed withNumberOfIncompleteInputs(BigInteger value) {
        setNumberOfIncompleteInputs(value);
        return this;
    }

    @Override
    public TrafficSpeed withNumberOfInputValuesUsed(BigInteger value) {
        setNumberOfInputValuesUsed(value);
        return this;
    }

    @Override
    public TrafficSpeed withPeriod(Float value) {
        setPeriod(value);
        return this;
    }

    @Override
    public TrafficSpeed withSmoothingFactor(Float value) {
        setSmoothingFactor(value);
        return this;
    }

    @Override
    public TrafficSpeed withStandardDeviation(Float value) {
        setStandardDeviation(value);
        return this;
    }

    @Override
    public TrafficSpeed withSupplierCalculatedDataQuality(Float value) {
        setSupplierCalculatedDataQuality(value);
        return this;
    }

    @Override
    public TrafficSpeed withTime(LocalDateTime value) {
        setTime(value);
        return this;
    }

    @Override
    public TrafficSpeed withPertinentLocation(GroupOfLocations value) {
        setPertinentLocation(value);
        return this;
    }

    @Override
    public TrafficSpeed withBasicDataValueExtension(ExtensionType value) {
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

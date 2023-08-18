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
 * <p>Classe Java per IndividualVehicleMeasurements complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="IndividualVehicleMeasurements"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}TrafficValue"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vehicleSpeed" type="{http://datex2.eu/schema/2_0RC1/2_0}VehicleSpeed" minOccurs="0"/&gt;
 *         &lt;element name="vehicleDetectionTime" type="{http://datex2.eu/schema/2_0RC1/2_0}VehicleDetectionTime" minOccurs="0"/&gt;
 *         &lt;element name="vehicleHeadway" type="{http://datex2.eu/schema/2_0RC1/2_0}VehicleHeadway" minOccurs="0"/&gt;
 *         &lt;element name="individualVehicleMeasurementsExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualVehicleMeasurements", propOrder = {
    "vehicleSpeed",
    "vehicleDetectionTime",
    "vehicleHeadway",
    "individualVehicleMeasurementsExtension"
})
public class IndividualVehicleMeasurements
    extends TrafficValue
{

    protected VehicleSpeed vehicleSpeed;
    protected VehicleDetectionTime vehicleDetectionTime;
    protected VehicleHeadway vehicleHeadway;
    protected ExtensionType individualVehicleMeasurementsExtension;

    /**
     * Recupera il valore della proprietà vehicleSpeed.
     * 
     * @return
     *     possible object is
     *     {@link VehicleSpeed }
     *     
     */
    public VehicleSpeed getVehicleSpeed() {
        return vehicleSpeed;
    }

    /**
     * Imposta il valore della proprietà vehicleSpeed.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleSpeed }
     *     
     */
    public void setVehicleSpeed(VehicleSpeed value) {
        this.vehicleSpeed = value;
    }

    /**
     * Recupera il valore della proprietà vehicleDetectionTime.
     * 
     * @return
     *     possible object is
     *     {@link VehicleDetectionTime }
     *     
     */
    public VehicleDetectionTime getVehicleDetectionTime() {
        return vehicleDetectionTime;
    }

    /**
     * Imposta il valore della proprietà vehicleDetectionTime.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleDetectionTime }
     *     
     */
    public void setVehicleDetectionTime(VehicleDetectionTime value) {
        this.vehicleDetectionTime = value;
    }

    /**
     * Recupera il valore della proprietà vehicleHeadway.
     * 
     * @return
     *     possible object is
     *     {@link VehicleHeadway }
     *     
     */
    public VehicleHeadway getVehicleHeadway() {
        return vehicleHeadway;
    }

    /**
     * Imposta il valore della proprietà vehicleHeadway.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleHeadway }
     *     
     */
    public void setVehicleHeadway(VehicleHeadway value) {
        this.vehicleHeadway = value;
    }

    /**
     * Recupera il valore della proprietà individualVehicleMeasurementsExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getIndividualVehicleMeasurementsExtension() {
        return individualVehicleMeasurementsExtension;
    }

    /**
     * Imposta il valore della proprietà individualVehicleMeasurementsExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setIndividualVehicleMeasurementsExtension(ExtensionType value) {
        this.individualVehicleMeasurementsExtension = value;
    }

    public IndividualVehicleMeasurements withVehicleSpeed(VehicleSpeed value) {
        setVehicleSpeed(value);
        return this;
    }

    public IndividualVehicleMeasurements withVehicleDetectionTime(VehicleDetectionTime value) {
        setVehicleDetectionTime(value);
        return this;
    }

    public IndividualVehicleMeasurements withVehicleHeadway(VehicleHeadway value) {
        setVehicleHeadway(value);
        return this;
    }

    public IndividualVehicleMeasurements withIndividualVehicleMeasurementsExtension(ExtensionType value) {
        setIndividualVehicleMeasurementsExtension(value);
        return this;
    }

    @Override
    public IndividualVehicleMeasurements withForVehiclesWithCharacteristicsOf(VehicleCharacteristics value) {
        setForVehiclesWithCharacteristicsOf(value);
        return this;
    }

    @Override
    public IndividualVehicleMeasurements withTrafficValueExtension(ExtensionType value) {
        setTrafficValueExtension(value);
        return this;
    }

    @Override
    public IndividualVehicleMeasurements withAccuracy(Float value) {
        setAccuracy(value);
        return this;
    }

    @Override
    public IndividualVehicleMeasurements withComputationalMethod(ComputationMethodEnum value) {
        setComputationalMethod(value);
        return this;
    }

    @Override
    public IndividualVehicleMeasurements withFault(Boolean value) {
        setFault(value);
        return this;
    }

    @Override
    public IndividualVehicleMeasurements withFaultReason(MultilingualString value) {
        setFaultReason(value);
        return this;
    }

    @Override
    public IndividualVehicleMeasurements withNumberOfIncompleteInputs(BigInteger value) {
        setNumberOfIncompleteInputs(value);
        return this;
    }

    @Override
    public IndividualVehicleMeasurements withNumberOfInputValuesUsed(BigInteger value) {
        setNumberOfInputValuesUsed(value);
        return this;
    }

    @Override
    public IndividualVehicleMeasurements withPeriod(Float value) {
        setPeriod(value);
        return this;
    }

    @Override
    public IndividualVehicleMeasurements withSmoothingFactor(Float value) {
        setSmoothingFactor(value);
        return this;
    }

    @Override
    public IndividualVehicleMeasurements withStandardDeviation(Float value) {
        setStandardDeviation(value);
        return this;
    }

    @Override
    public IndividualVehicleMeasurements withSupplierCalculatedDataQuality(Float value) {
        setSupplierCalculatedDataQuality(value);
        return this;
    }

    @Override
    public IndividualVehicleMeasurements withTime(LocalDateTime value) {
        setTime(value);
        return this;
    }

    @Override
    public IndividualVehicleMeasurements withPertinentLocation(GroupOfLocations value) {
        setPertinentLocation(value);
        return this;
    }

    @Override
    public IndividualVehicleMeasurements withBasicDataValueExtension(ExtensionType value) {
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

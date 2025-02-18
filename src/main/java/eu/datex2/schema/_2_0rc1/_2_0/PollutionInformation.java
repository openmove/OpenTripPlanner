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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per PollutionInformation complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PollutionInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}WeatherValue"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pollutionMeasurement" type="{http://datex2.eu/schema/2_0RC1/2_0}PollutionMeasurement" maxOccurs="unbounded"/&gt;
 *         &lt;element name="pollutionInformationExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PollutionInformation", propOrder = {
    "pollutionMeasurement",
    "pollutionInformationExtension"
})
public class PollutionInformation
    extends WeatherValue
{

    @XmlElement(required = true)
    protected List<PollutionMeasurement> pollutionMeasurement;
    protected ExtensionType pollutionInformationExtension;

    /**
     * Gets the value of the pollutionMeasurement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pollutionMeasurement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPollutionMeasurement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PollutionMeasurement }
     * 
     * 
     */
    public List<PollutionMeasurement> getPollutionMeasurement() {
        if (pollutionMeasurement == null) {
            pollutionMeasurement = new ArrayList<PollutionMeasurement>();
        }
        return this.pollutionMeasurement;
    }

    /**
     * Recupera il valore della proprietà pollutionInformationExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPollutionInformationExtension() {
        return pollutionInformationExtension;
    }

    /**
     * Imposta il valore della proprietà pollutionInformationExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPollutionInformationExtension(ExtensionType value) {
        this.pollutionInformationExtension = value;
    }

    public PollutionInformation withPollutionMeasurement(PollutionMeasurement... values) {
        if (values!= null) {
            for (PollutionMeasurement value: values) {
                getPollutionMeasurement().add(value);
            }
        }
        return this;
    }

    public PollutionInformation withPollutionMeasurement(Collection<PollutionMeasurement> values) {
        if (values!= null) {
            getPollutionMeasurement().addAll(values);
        }
        return this;
    }

    public PollutionInformation withPollutionInformationExtension(ExtensionType value) {
        setPollutionInformationExtension(value);
        return this;
    }

    @Override
    public PollutionInformation withWeatherValueExtension(ExtensionType value) {
        setWeatherValueExtension(value);
        return this;
    }

    @Override
    public PollutionInformation withAccuracy(Float value) {
        setAccuracy(value);
        return this;
    }

    @Override
    public PollutionInformation withComputationalMethod(ComputationMethodEnum value) {
        setComputationalMethod(value);
        return this;
    }

    @Override
    public PollutionInformation withFault(Boolean value) {
        setFault(value);
        return this;
    }

    @Override
    public PollutionInformation withFaultReason(MultilingualString value) {
        setFaultReason(value);
        return this;
    }

    @Override
    public PollutionInformation withNumberOfIncompleteInputs(BigInteger value) {
        setNumberOfIncompleteInputs(value);
        return this;
    }

    @Override
    public PollutionInformation withNumberOfInputValuesUsed(BigInteger value) {
        setNumberOfInputValuesUsed(value);
        return this;
    }

    @Override
    public PollutionInformation withPeriod(Float value) {
        setPeriod(value);
        return this;
    }

    @Override
    public PollutionInformation withSmoothingFactor(Float value) {
        setSmoothingFactor(value);
        return this;
    }

    @Override
    public PollutionInformation withStandardDeviation(Float value) {
        setStandardDeviation(value);
        return this;
    }

    @Override
    public PollutionInformation withSupplierCalculatedDataQuality(Float value) {
        setSupplierCalculatedDataQuality(value);
        return this;
    }

    @Override
    public PollutionInformation withTime(LocalDateTime value) {
        setTime(value);
        return this;
    }

    @Override
    public PollutionInformation withPertinentLocation(GroupOfLocations value) {
        setPertinentLocation(value);
        return this;
    }

    @Override
    public PollutionInformation withBasicDataValueExtension(ExtensionType value) {
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

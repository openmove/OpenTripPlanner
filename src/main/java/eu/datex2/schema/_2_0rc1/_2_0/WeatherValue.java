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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per WeatherValue complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="WeatherValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}BasicDataValue"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="weatherValueExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeatherValue", propOrder = {
    "weatherValueExtension"
})
@XmlSeeAlso({
    HumidityInformation.class,
    PollutionInformation.class,
    PrecipitationInformation.class,
    RoadSurfaceConditionInformation.class,
    TemperatureInformation.class,
    VisibilityInformation.class,
    WindInformation.class
})
public abstract class WeatherValue
    extends BasicDataValue
{

    protected ExtensionType weatherValueExtension;

    /**
     * Recupera il valore della proprietà weatherValueExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getWeatherValueExtension() {
        return weatherValueExtension;
    }

    /**
     * Imposta il valore della proprietà weatherValueExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setWeatherValueExtension(ExtensionType value) {
        this.weatherValueExtension = value;
    }

    public WeatherValue withWeatherValueExtension(ExtensionType value) {
        setWeatherValueExtension(value);
        return this;
    }

    @Override
    public WeatherValue withAccuracy(Float value) {
        setAccuracy(value);
        return this;
    }

    @Override
    public WeatherValue withComputationalMethod(ComputationMethodEnum value) {
        setComputationalMethod(value);
        return this;
    }

    @Override
    public WeatherValue withFault(Boolean value) {
        setFault(value);
        return this;
    }

    @Override
    public WeatherValue withFaultReason(MultilingualString value) {
        setFaultReason(value);
        return this;
    }

    @Override
    public WeatherValue withNumberOfIncompleteInputs(BigInteger value) {
        setNumberOfIncompleteInputs(value);
        return this;
    }

    @Override
    public WeatherValue withNumberOfInputValuesUsed(BigInteger value) {
        setNumberOfInputValuesUsed(value);
        return this;
    }

    @Override
    public WeatherValue withPeriod(Float value) {
        setPeriod(value);
        return this;
    }

    @Override
    public WeatherValue withSmoothingFactor(Float value) {
        setSmoothingFactor(value);
        return this;
    }

    @Override
    public WeatherValue withStandardDeviation(Float value) {
        setStandardDeviation(value);
        return this;
    }

    @Override
    public WeatherValue withSupplierCalculatedDataQuality(Float value) {
        setSupplierCalculatedDataQuality(value);
        return this;
    }

    @Override
    public WeatherValue withTime(LocalDateTime value) {
        setTime(value);
        return this;
    }

    @Override
    public WeatherValue withPertinentLocation(GroupOfLocations value) {
        setPertinentLocation(value);
        return this;
    }

    @Override
    public WeatherValue withBasicDataValueExtension(ExtensionType value) {
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

//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per Temperature complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Temperature"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="airTemperature" type="{http://datex2.eu/schema/2_0RC1/2_0}TemperatureCelsius" minOccurs="0"/&gt;
 *         &lt;element name="dewPointTemperature" type="{http://datex2.eu/schema/2_0RC1/2_0}TemperatureCelsius" minOccurs="0"/&gt;
 *         &lt;element name="maximumTemperature" type="{http://datex2.eu/schema/2_0RC1/2_0}TemperatureCelsius" minOccurs="0"/&gt;
 *         &lt;element name="minimumTemperature" type="{http://datex2.eu/schema/2_0RC1/2_0}TemperatureCelsius" minOccurs="0"/&gt;
 *         &lt;element name="temperatureExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Temperature", propOrder = {
    "airTemperature",
    "dewPointTemperature",
    "maximumTemperature",
    "minimumTemperature",
    "temperatureExtension"
})
public class Temperature {

    protected Float airTemperature;
    protected Float dewPointTemperature;
    protected Float maximumTemperature;
    protected Float minimumTemperature;
    protected ExtensionType temperatureExtension;

    /**
     * Recupera il valore della proprietà airTemperature.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAirTemperature() {
        return airTemperature;
    }

    /**
     * Imposta il valore della proprietà airTemperature.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAirTemperature(Float value) {
        this.airTemperature = value;
    }

    /**
     * Recupera il valore della proprietà dewPointTemperature.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDewPointTemperature() {
        return dewPointTemperature;
    }

    /**
     * Imposta il valore della proprietà dewPointTemperature.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDewPointTemperature(Float value) {
        this.dewPointTemperature = value;
    }

    /**
     * Recupera il valore della proprietà maximumTemperature.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaximumTemperature() {
        return maximumTemperature;
    }

    /**
     * Imposta il valore della proprietà maximumTemperature.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaximumTemperature(Float value) {
        this.maximumTemperature = value;
    }

    /**
     * Recupera il valore della proprietà minimumTemperature.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMinimumTemperature() {
        return minimumTemperature;
    }

    /**
     * Imposta il valore della proprietà minimumTemperature.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMinimumTemperature(Float value) {
        this.minimumTemperature = value;
    }

    /**
     * Recupera il valore della proprietà temperatureExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTemperatureExtension() {
        return temperatureExtension;
    }

    /**
     * Imposta il valore della proprietà temperatureExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTemperatureExtension(ExtensionType value) {
        this.temperatureExtension = value;
    }

    public Temperature withAirTemperature(Float value) {
        setAirTemperature(value);
        return this;
    }

    public Temperature withDewPointTemperature(Float value) {
        setDewPointTemperature(value);
        return this;
    }

    public Temperature withMaximumTemperature(Float value) {
        setMaximumTemperature(value);
        return this;
    }

    public Temperature withMinimumTemperature(Float value) {
        setMinimumTemperature(value);
        return this;
    }

    public Temperature withTemperatureExtension(ExtensionType value) {
        setTemperatureExtension(value);
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

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
 * <p>Classe Java per RoadSurfaceConditionMeasurements complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="RoadSurfaceConditionMeasurements"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deIcingApplicationRate" type="{http://datex2.eu/schema/2_0RC1/2_0}IntensityKilogrammesPerSquareMetre" minOccurs="0"/&gt;
 *         &lt;element name="deIcingConcentration" type="{http://datex2.eu/schema/2_0RC1/2_0}ConcentrationGramsPerCubicCentimetre" minOccurs="0"/&gt;
 *         &lt;element name="depthOfSnow" type="{http://datex2.eu/schema/2_0RC1/2_0}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="protectionTemperature" type="{http://datex2.eu/schema/2_0RC1/2_0}TemperatureCelsius" minOccurs="0"/&gt;
 *         &lt;element name="roadSurfaceTemperature" type="{http://datex2.eu/schema/2_0RC1/2_0}TemperatureCelsius" minOccurs="0"/&gt;
 *         &lt;element name="waterFilmThickness" type="{http://datex2.eu/schema/2_0RC1/2_0}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="roadSurfaceConditionMeasurementsExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoadSurfaceConditionMeasurements", propOrder = {
    "deIcingApplicationRate",
    "deIcingConcentration",
    "depthOfSnow",
    "protectionTemperature",
    "roadSurfaceTemperature",
    "waterFilmThickness",
    "roadSurfaceConditionMeasurementsExtension"
})
public class RoadSurfaceConditionMeasurements {

    protected Float deIcingApplicationRate;
    protected Float deIcingConcentration;
    protected Float depthOfSnow;
    protected Float protectionTemperature;
    protected Float roadSurfaceTemperature;
    protected Float waterFilmThickness;
    protected ExtensionType roadSurfaceConditionMeasurementsExtension;

    /**
     * Recupera il valore della proprietà deIcingApplicationRate.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDeIcingApplicationRate() {
        return deIcingApplicationRate;
    }

    /**
     * Imposta il valore della proprietà deIcingApplicationRate.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDeIcingApplicationRate(Float value) {
        this.deIcingApplicationRate = value;
    }

    /**
     * Recupera il valore della proprietà deIcingConcentration.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDeIcingConcentration() {
        return deIcingConcentration;
    }

    /**
     * Imposta il valore della proprietà deIcingConcentration.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDeIcingConcentration(Float value) {
        this.deIcingConcentration = value;
    }

    /**
     * Recupera il valore della proprietà depthOfSnow.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDepthOfSnow() {
        return depthOfSnow;
    }

    /**
     * Imposta il valore della proprietà depthOfSnow.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDepthOfSnow(Float value) {
        this.depthOfSnow = value;
    }

    /**
     * Recupera il valore della proprietà protectionTemperature.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getProtectionTemperature() {
        return protectionTemperature;
    }

    /**
     * Imposta il valore della proprietà protectionTemperature.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setProtectionTemperature(Float value) {
        this.protectionTemperature = value;
    }

    /**
     * Recupera il valore della proprietà roadSurfaceTemperature.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRoadSurfaceTemperature() {
        return roadSurfaceTemperature;
    }

    /**
     * Imposta il valore della proprietà roadSurfaceTemperature.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRoadSurfaceTemperature(Float value) {
        this.roadSurfaceTemperature = value;
    }

    /**
     * Recupera il valore della proprietà waterFilmThickness.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getWaterFilmThickness() {
        return waterFilmThickness;
    }

    /**
     * Imposta il valore della proprietà waterFilmThickness.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setWaterFilmThickness(Float value) {
        this.waterFilmThickness = value;
    }

    /**
     * Recupera il valore della proprietà roadSurfaceConditionMeasurementsExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getRoadSurfaceConditionMeasurementsExtension() {
        return roadSurfaceConditionMeasurementsExtension;
    }

    /**
     * Imposta il valore della proprietà roadSurfaceConditionMeasurementsExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setRoadSurfaceConditionMeasurementsExtension(ExtensionType value) {
        this.roadSurfaceConditionMeasurementsExtension = value;
    }

    public RoadSurfaceConditionMeasurements withDeIcingApplicationRate(Float value) {
        setDeIcingApplicationRate(value);
        return this;
    }

    public RoadSurfaceConditionMeasurements withDeIcingConcentration(Float value) {
        setDeIcingConcentration(value);
        return this;
    }

    public RoadSurfaceConditionMeasurements withDepthOfSnow(Float value) {
        setDepthOfSnow(value);
        return this;
    }

    public RoadSurfaceConditionMeasurements withProtectionTemperature(Float value) {
        setProtectionTemperature(value);
        return this;
    }

    public RoadSurfaceConditionMeasurements withRoadSurfaceTemperature(Float value) {
        setRoadSurfaceTemperature(value);
        return this;
    }

    public RoadSurfaceConditionMeasurements withWaterFilmThickness(Float value) {
        setWaterFilmThickness(value);
        return this;
    }

    public RoadSurfaceConditionMeasurements withRoadSurfaceConditionMeasurementsExtension(ExtensionType value) {
        setRoadSurfaceConditionMeasurementsExtension(value);
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

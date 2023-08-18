//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per Wind complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Wind"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="maximumWindSpeed" type="{http://datex2.eu/schema/2_0RC1/2_0}KilometresPerHour" minOccurs="0"/&gt;
 *         &lt;element name="windDirectionBearing" type="{http://datex2.eu/schema/2_0RC1/2_0}AngleInDegrees" minOccurs="0"/&gt;
 *         &lt;element name="windDirectionCompass" type="{http://datex2.eu/schema/2_0RC1/2_0}DirectionCompassEnum" minOccurs="0"/&gt;
 *         &lt;element name="windMeasurementHeight" type="{http://datex2.eu/schema/2_0RC1/2_0}MetresAsNonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="windSpeed" type="{http://datex2.eu/schema/2_0RC1/2_0}KilometresPerHour" minOccurs="0"/&gt;
 *         &lt;element name="windExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Wind", propOrder = {
    "maximumWindSpeed",
    "windDirectionBearing",
    "windDirectionCompass",
    "windMeasurementHeight",
    "windSpeed",
    "windExtension"
})
public class Wind {

    protected Float maximumWindSpeed;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger windDirectionBearing;
    @XmlSchemaType(name = "string")
    protected DirectionCompassEnum windDirectionCompass;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger windMeasurementHeight;
    protected Float windSpeed;
    protected ExtensionType windExtension;

    /**
     * Recupera il valore della proprietà maximumWindSpeed.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaximumWindSpeed() {
        return maximumWindSpeed;
    }

    /**
     * Imposta il valore della proprietà maximumWindSpeed.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaximumWindSpeed(Float value) {
        this.maximumWindSpeed = value;
    }

    /**
     * Recupera il valore della proprietà windDirectionBearing.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWindDirectionBearing() {
        return windDirectionBearing;
    }

    /**
     * Imposta il valore della proprietà windDirectionBearing.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWindDirectionBearing(BigInteger value) {
        this.windDirectionBearing = value;
    }

    /**
     * Recupera il valore della proprietà windDirectionCompass.
     * 
     * @return
     *     possible object is
     *     {@link DirectionCompassEnum }
     *     
     */
    public DirectionCompassEnum getWindDirectionCompass() {
        return windDirectionCompass;
    }

    /**
     * Imposta il valore della proprietà windDirectionCompass.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionCompassEnum }
     *     
     */
    public void setWindDirectionCompass(DirectionCompassEnum value) {
        this.windDirectionCompass = value;
    }

    /**
     * Recupera il valore della proprietà windMeasurementHeight.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWindMeasurementHeight() {
        return windMeasurementHeight;
    }

    /**
     * Imposta il valore della proprietà windMeasurementHeight.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWindMeasurementHeight(BigInteger value) {
        this.windMeasurementHeight = value;
    }

    /**
     * Recupera il valore della proprietà windSpeed.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getWindSpeed() {
        return windSpeed;
    }

    /**
     * Imposta il valore della proprietà windSpeed.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setWindSpeed(Float value) {
        this.windSpeed = value;
    }

    /**
     * Recupera il valore della proprietà windExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getWindExtension() {
        return windExtension;
    }

    /**
     * Imposta il valore della proprietà windExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setWindExtension(ExtensionType value) {
        this.windExtension = value;
    }

    public Wind withMaximumWindSpeed(Float value) {
        setMaximumWindSpeed(value);
        return this;
    }

    public Wind withWindDirectionBearing(BigInteger value) {
        setWindDirectionBearing(value);
        return this;
    }

    public Wind withWindDirectionCompass(DirectionCompassEnum value) {
        setWindDirectionCompass(value);
        return this;
    }

    public Wind withWindMeasurementHeight(BigInteger value) {
        setWindMeasurementHeight(value);
        return this;
    }

    public Wind withWindSpeed(Float value) {
        setWindSpeed(value);
        return this;
    }

    public Wind withWindExtension(ExtensionType value) {
        setWindExtension(value);
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

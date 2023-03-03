//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per PrecipitationDetail complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PrecipitationDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="depositionDepth" type="{http://datex2.eu/schema/2_0RC1/2_0}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="precipitationIntensity" type="{http://datex2.eu/schema/2_0RC1/2_0}IntensityMillimetresPerHour" minOccurs="0"/&gt;
 *         &lt;element name="precipitationType" type="{http://datex2.eu/schema/2_0RC1/2_0}PrecipitationTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="precipitationDetailExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrecipitationDetail", propOrder = {
    "depositionDepth",
    "precipitationIntensity",
    "precipitationType",
    "precipitationDetailExtension"
})
public class PrecipitationDetail {

    protected Float depositionDepth;
    protected Float precipitationIntensity;
    @XmlSchemaType(name = "string")
    protected PrecipitationTypeEnum precipitationType;
    protected ExtensionType precipitationDetailExtension;

    /**
     * Recupera il valore della proprietà depositionDepth.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDepositionDepth() {
        return depositionDepth;
    }

    /**
     * Imposta il valore della proprietà depositionDepth.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDepositionDepth(Float value) {
        this.depositionDepth = value;
    }

    /**
     * Recupera il valore della proprietà precipitationIntensity.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPrecipitationIntensity() {
        return precipitationIntensity;
    }

    /**
     * Imposta il valore della proprietà precipitationIntensity.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPrecipitationIntensity(Float value) {
        this.precipitationIntensity = value;
    }

    /**
     * Recupera il valore della proprietà precipitationType.
     * 
     * @return
     *     possible object is
     *     {@link PrecipitationTypeEnum }
     *     
     */
    public PrecipitationTypeEnum getPrecipitationType() {
        return precipitationType;
    }

    /**
     * Imposta il valore della proprietà precipitationType.
     * 
     * @param value
     *     allowed object is
     *     {@link PrecipitationTypeEnum }
     *     
     */
    public void setPrecipitationType(PrecipitationTypeEnum value) {
        this.precipitationType = value;
    }

    /**
     * Recupera il valore della proprietà precipitationDetailExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPrecipitationDetailExtension() {
        return precipitationDetailExtension;
    }

    /**
     * Imposta il valore della proprietà precipitationDetailExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPrecipitationDetailExtension(ExtensionType value) {
        this.precipitationDetailExtension = value;
    }

    public PrecipitationDetail withDepositionDepth(Float value) {
        setDepositionDepth(value);
        return this;
    }

    public PrecipitationDetail withPrecipitationIntensity(Float value) {
        setPrecipitationIntensity(value);
        return this;
    }

    public PrecipitationDetail withPrecipitationType(PrecipitationTypeEnum value) {
        setPrecipitationType(value);
        return this;
    }

    public PrecipitationDetail withPrecipitationDetailExtension(ExtensionType value) {
        setPrecipitationDetailExtension(value);
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

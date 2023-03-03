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
 * <p>Classe Java per Delays complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Delays"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="delayBand" type="{http://datex2.eu/schema/2_0RC1/2_0}DelayBandEnum" minOccurs="0"/&gt;
 *         &lt;element name="delaysType" type="{http://datex2.eu/schema/2_0RC1/2_0}DelaysTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="delayTimeValue" type="{http://datex2.eu/schema/2_0RC1/2_0}Seconds" minOccurs="0"/&gt;
 *         &lt;element name="delaysExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Delays", propOrder = {
    "delayBand",
    "delaysType",
    "delayTimeValue",
    "delaysExtension"
})
public class Delays {

    @XmlSchemaType(name = "string")
    protected DelayBandEnum delayBand;
    @XmlSchemaType(name = "string")
    protected DelaysTypeEnum delaysType;
    protected Float delayTimeValue;
    protected ExtensionType delaysExtension;

    /**
     * Recupera il valore della proprietà delayBand.
     * 
     * @return
     *     possible object is
     *     {@link DelayBandEnum }
     *     
     */
    public DelayBandEnum getDelayBand() {
        return delayBand;
    }

    /**
     * Imposta il valore della proprietà delayBand.
     * 
     * @param value
     *     allowed object is
     *     {@link DelayBandEnum }
     *     
     */
    public void setDelayBand(DelayBandEnum value) {
        this.delayBand = value;
    }

    /**
     * Recupera il valore della proprietà delaysType.
     * 
     * @return
     *     possible object is
     *     {@link DelaysTypeEnum }
     *     
     */
    public DelaysTypeEnum getDelaysType() {
        return delaysType;
    }

    /**
     * Imposta il valore della proprietà delaysType.
     * 
     * @param value
     *     allowed object is
     *     {@link DelaysTypeEnum }
     *     
     */
    public void setDelaysType(DelaysTypeEnum value) {
        this.delaysType = value;
    }

    /**
     * Recupera il valore della proprietà delayTimeValue.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDelayTimeValue() {
        return delayTimeValue;
    }

    /**
     * Imposta il valore della proprietà delayTimeValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDelayTimeValue(Float value) {
        this.delayTimeValue = value;
    }

    /**
     * Recupera il valore della proprietà delaysExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getDelaysExtension() {
        return delaysExtension;
    }

    /**
     * Imposta il valore della proprietà delaysExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setDelaysExtension(ExtensionType value) {
        this.delaysExtension = value;
    }

    public Delays withDelayBand(DelayBandEnum value) {
        setDelayBand(value);
        return this;
    }

    public Delays withDelaysType(DelaysTypeEnum value) {
        setDelaysType(value);
        return this;
    }

    public Delays withDelayTimeValue(Float value) {
        setDelayTimeValue(value);
        return this;
    }

    public Delays withDelaysExtension(ExtensionType value) {
        setDelaysExtension(value);
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

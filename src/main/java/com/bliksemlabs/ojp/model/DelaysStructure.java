//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package com.bliksemlabs.ojp.model;

import java.time.Duration;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.migesok.jaxb.adapter.javatime.DurationXmlAdapter;
import eu.datex2.schema._2_0rc1._2_0.DelaysTypeEnum;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per DelaysStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DelaysStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DelayBand" type="{http://www.siri.org.uk/siri}DelayBandEnumeration" minOccurs="0"/&gt;
 *         &lt;element name="DelayType" type="{http://datex2.eu/schema/2_0RC1/2_0}DelaysTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="Delay" type="{http://www.siri.org.uk/siri}PositiveDurationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DelaysStructure", propOrder = {
    "delayBand",
    "delayType",
    "delay"
})
public class DelaysStructure {

    @XmlElement(name = "DelayBand")
    @XmlSchemaType(name = "normalizedString")
    protected DelayBandEnumeration delayBand;
    @XmlElement(name = "DelayType")
    @XmlSchemaType(name = "string")
    protected DelaysTypeEnum delayType;
    @XmlElement(name = "Delay", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration delay;

    /**
     * Recupera il valore della proprietà delayBand.
     * 
     * @return
     *     possible object is
     *     {@link DelayBandEnumeration }
     *     
     */
    public DelayBandEnumeration getDelayBand() {
        return delayBand;
    }

    /**
     * Imposta il valore della proprietà delayBand.
     * 
     * @param value
     *     allowed object is
     *     {@link DelayBandEnumeration }
     *     
     */
    public void setDelayBand(DelayBandEnumeration value) {
        this.delayBand = value;
    }

    /**
     * Recupera il valore della proprietà delayType.
     * 
     * @return
     *     possible object is
     *     {@link DelaysTypeEnum }
     *     
     */
    public DelaysTypeEnum getDelayType() {
        return delayType;
    }

    /**
     * Imposta il valore della proprietà delayType.
     * 
     * @param value
     *     allowed object is
     *     {@link DelaysTypeEnum }
     *     
     */
    public void setDelayType(DelaysTypeEnum value) {
        this.delayType = value;
    }

    /**
     * Recupera il valore della proprietà delay.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getDelay() {
        return delay;
    }

    /**
     * Imposta il valore della proprietà delay.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelay(Duration value) {
        this.delay = value;
    }

    public DelaysStructure withDelayBand(DelayBandEnumeration value) {
        setDelayBand(value);
        return this;
    }

    public DelaysStructure withDelayType(DelaysTypeEnum value) {
        setDelayType(value);
        return this;
    }

    public DelaysStructure withDelay(Duration value) {
        setDelay(value);
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

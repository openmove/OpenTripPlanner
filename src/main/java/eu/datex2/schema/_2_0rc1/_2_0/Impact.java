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
 * <p>Classe Java per Impact complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Impact"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="capacityRemaining" type="{http://datex2.eu/schema/2_0RC1/2_0}Percentage" minOccurs="0"/&gt;
 *         &lt;element name="numberOfLanesRestricted" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="numberOfOperationalLanes" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="originalNumberOfLanes" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="residualRoadWidth" type="{http://datex2.eu/schema/2_0RC1/2_0}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="trafficConstrictionType" type="{http://datex2.eu/schema/2_0RC1/2_0}TrafficConstrictionTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="delays" type="{http://datex2.eu/schema/2_0RC1/2_0}Delays" minOccurs="0"/&gt;
 *         &lt;element name="impactExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Impact", propOrder = {
    "capacityRemaining",
    "numberOfLanesRestricted",
    "numberOfOperationalLanes",
    "originalNumberOfLanes",
    "residualRoadWidth",
    "trafficConstrictionType",
    "delays",
    "impactExtension"
})
public class Impact {

    protected Float capacityRemaining;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfLanesRestricted;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfOperationalLanes;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger originalNumberOfLanes;
    protected Float residualRoadWidth;
    @XmlSchemaType(name = "string")
    protected TrafficConstrictionTypeEnum trafficConstrictionType;
    protected Delays delays;
    protected ExtensionType impactExtension;

    /**
     * Recupera il valore della proprietà capacityRemaining.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCapacityRemaining() {
        return capacityRemaining;
    }

    /**
     * Imposta il valore della proprietà capacityRemaining.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCapacityRemaining(Float value) {
        this.capacityRemaining = value;
    }

    /**
     * Recupera il valore della proprietà numberOfLanesRestricted.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfLanesRestricted() {
        return numberOfLanesRestricted;
    }

    /**
     * Imposta il valore della proprietà numberOfLanesRestricted.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfLanesRestricted(BigInteger value) {
        this.numberOfLanesRestricted = value;
    }

    /**
     * Recupera il valore della proprietà numberOfOperationalLanes.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfOperationalLanes() {
        return numberOfOperationalLanes;
    }

    /**
     * Imposta il valore della proprietà numberOfOperationalLanes.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfOperationalLanes(BigInteger value) {
        this.numberOfOperationalLanes = value;
    }

    /**
     * Recupera il valore della proprietà originalNumberOfLanes.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOriginalNumberOfLanes() {
        return originalNumberOfLanes;
    }

    /**
     * Imposta il valore della proprietà originalNumberOfLanes.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOriginalNumberOfLanes(BigInteger value) {
        this.originalNumberOfLanes = value;
    }

    /**
     * Recupera il valore della proprietà residualRoadWidth.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getResidualRoadWidth() {
        return residualRoadWidth;
    }

    /**
     * Imposta il valore della proprietà residualRoadWidth.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setResidualRoadWidth(Float value) {
        this.residualRoadWidth = value;
    }

    /**
     * Recupera il valore della proprietà trafficConstrictionType.
     * 
     * @return
     *     possible object is
     *     {@link TrafficConstrictionTypeEnum }
     *     
     */
    public TrafficConstrictionTypeEnum getTrafficConstrictionType() {
        return trafficConstrictionType;
    }

    /**
     * Imposta il valore della proprietà trafficConstrictionType.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficConstrictionTypeEnum }
     *     
     */
    public void setTrafficConstrictionType(TrafficConstrictionTypeEnum value) {
        this.trafficConstrictionType = value;
    }

    /**
     * Recupera il valore della proprietà delays.
     * 
     * @return
     *     possible object is
     *     {@link Delays }
     *     
     */
    public Delays getDelays() {
        return delays;
    }

    /**
     * Imposta il valore della proprietà delays.
     * 
     * @param value
     *     allowed object is
     *     {@link Delays }
     *     
     */
    public void setDelays(Delays value) {
        this.delays = value;
    }

    /**
     * Recupera il valore della proprietà impactExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getImpactExtension() {
        return impactExtension;
    }

    /**
     * Imposta il valore della proprietà impactExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setImpactExtension(ExtensionType value) {
        this.impactExtension = value;
    }

    public Impact withCapacityRemaining(Float value) {
        setCapacityRemaining(value);
        return this;
    }

    public Impact withNumberOfLanesRestricted(BigInteger value) {
        setNumberOfLanesRestricted(value);
        return this;
    }

    public Impact withNumberOfOperationalLanes(BigInteger value) {
        setNumberOfOperationalLanes(value);
        return this;
    }

    public Impact withOriginalNumberOfLanes(BigInteger value) {
        setOriginalNumberOfLanes(value);
        return this;
    }

    public Impact withResidualRoadWidth(Float value) {
        setResidualRoadWidth(value);
        return this;
    }

    public Impact withTrafficConstrictionType(TrafficConstrictionTypeEnum value) {
        setTrafficConstrictionType(value);
        return this;
    }

    public Impact withDelays(Delays value) {
        setDelays(value);
        return this;
    }

    public Impact withImpactExtension(ExtensionType value) {
        setImpactExtension(value);
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

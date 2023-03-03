//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package uk.org.ifopt.acsb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import uk.org.ifopt.ifopt.Extensions;
import uk.org.ifopt.ifopt.ValidityConditionStructure;


/**
 * <p>Classe Java per AccessibilityLimitationStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AccessibilityLimitationStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LimitationId" type="{http://www.ifopt.org.uk/acsb}LimitationIdType" minOccurs="0"/&gt;
 *         &lt;element name="ValidityCondition" type="{http://www.ifopt.org.uk/ifopt}ValidityConditionStructure" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.ifopt.org.uk/acsb}MobilityLimitationGroup"/&gt;
 *         &lt;group ref="{http://www.ifopt.org.uk/acsb}SensoryLimitationGroup"/&gt;
 *         &lt;element ref="{http://www.ifopt.org.uk/ifopt}Extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccessibilityLimitationStructure", propOrder = {
    "limitationId",
    "validityCondition",
    "wheelchairAccess",
    "stepFreeAccess",
    "escalatorFreeAccess",
    "liftFreeAccess",
    "audibleSignalsAvailable",
    "visualSignsAvailable",
    "extensions"
})
public class AccessibilityLimitationStructure {

    @XmlElement(name = "LimitationId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String limitationId;
    @XmlElement(name = "ValidityCondition")
    protected ValidityConditionStructure validityCondition;
    @XmlElement(name = "WheelchairAccess", required = true, defaultValue = "false")
    protected AccessibilityStructure wheelchairAccess;
    @XmlElement(name = "StepFreeAccess", defaultValue = "unknown")
    protected AccessibilityStructure stepFreeAccess;
    @XmlElement(name = "EscalatorFreeAccess", defaultValue = "unknown")
    protected AccessibilityStructure escalatorFreeAccess;
    @XmlElement(name = "LiftFreeAccess", defaultValue = "unknown")
    protected AccessibilityStructure liftFreeAccess;
    @XmlElement(name = "AudibleSignalsAvailable", defaultValue = "false")
    protected AccessibilityStructure audibleSignalsAvailable;
    @XmlElement(name = "VisualSignsAvailable", defaultValue = "unknown")
    protected AccessibilityStructure visualSignsAvailable;
    @XmlElement(name = "Extensions", namespace = "http://www.ifopt.org.uk/ifopt")
    protected Extensions extensions;

    /**
     * Recupera il valore della proprietà limitationId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitationId() {
        return limitationId;
    }

    /**
     * Imposta il valore della proprietà limitationId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitationId(String value) {
        this.limitationId = value;
    }

    /**
     * Recupera il valore della proprietà validityCondition.
     * 
     * @return
     *     possible object is
     *     {@link ValidityConditionStructure }
     *     
     */
    public ValidityConditionStructure getValidityCondition() {
        return validityCondition;
    }

    /**
     * Imposta il valore della proprietà validityCondition.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidityConditionStructure }
     *     
     */
    public void setValidityCondition(ValidityConditionStructure value) {
        this.validityCondition = value;
    }

    /**
     * Recupera il valore della proprietà wheelchairAccess.
     * 
     * @return
     *     possible object is
     *     {@link AccessibilityStructure }
     *     
     */
    public AccessibilityStructure getWheelchairAccess() {
        return wheelchairAccess;
    }

    /**
     * Imposta il valore della proprietà wheelchairAccess.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessibilityStructure }
     *     
     */
    public void setWheelchairAccess(AccessibilityStructure value) {
        this.wheelchairAccess = value;
    }

    /**
     * Recupera il valore della proprietà stepFreeAccess.
     * 
     * @return
     *     possible object is
     *     {@link AccessibilityStructure }
     *     
     */
    public AccessibilityStructure getStepFreeAccess() {
        return stepFreeAccess;
    }

    /**
     * Imposta il valore della proprietà stepFreeAccess.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessibilityStructure }
     *     
     */
    public void setStepFreeAccess(AccessibilityStructure value) {
        this.stepFreeAccess = value;
    }

    /**
     * Recupera il valore della proprietà escalatorFreeAccess.
     * 
     * @return
     *     possible object is
     *     {@link AccessibilityStructure }
     *     
     */
    public AccessibilityStructure getEscalatorFreeAccess() {
        return escalatorFreeAccess;
    }

    /**
     * Imposta il valore della proprietà escalatorFreeAccess.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessibilityStructure }
     *     
     */
    public void setEscalatorFreeAccess(AccessibilityStructure value) {
        this.escalatorFreeAccess = value;
    }

    /**
     * Recupera il valore della proprietà liftFreeAccess.
     * 
     * @return
     *     possible object is
     *     {@link AccessibilityStructure }
     *     
     */
    public AccessibilityStructure getLiftFreeAccess() {
        return liftFreeAccess;
    }

    /**
     * Imposta il valore della proprietà liftFreeAccess.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessibilityStructure }
     *     
     */
    public void setLiftFreeAccess(AccessibilityStructure value) {
        this.liftFreeAccess = value;
    }

    /**
     * Recupera il valore della proprietà audibleSignalsAvailable.
     * 
     * @return
     *     possible object is
     *     {@link AccessibilityStructure }
     *     
     */
    public AccessibilityStructure getAudibleSignalsAvailable() {
        return audibleSignalsAvailable;
    }

    /**
     * Imposta il valore della proprietà audibleSignalsAvailable.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessibilityStructure }
     *     
     */
    public void setAudibleSignalsAvailable(AccessibilityStructure value) {
        this.audibleSignalsAvailable = value;
    }

    /**
     * Recupera il valore della proprietà visualSignsAvailable.
     * 
     * @return
     *     possible object is
     *     {@link AccessibilityStructure }
     *     
     */
    public AccessibilityStructure getVisualSignsAvailable() {
        return visualSignsAvailable;
    }

    /**
     * Imposta il valore della proprietà visualSignsAvailable.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessibilityStructure }
     *     
     */
    public void setVisualSignsAvailable(AccessibilityStructure value) {
        this.visualSignsAvailable = value;
    }

    /**
     * Recupera il valore della proprietà extensions.
     * 
     * @return
     *     possible object is
     *     {@link Extensions }
     *     
     */
    public Extensions getExtensions() {
        return extensions;
    }

    /**
     * Imposta il valore della proprietà extensions.
     * 
     * @param value
     *     allowed object is
     *     {@link Extensions }
     *     
     */
    public void setExtensions(Extensions value) {
        this.extensions = value;
    }

    public AccessibilityLimitationStructure withLimitationId(String value) {
        setLimitationId(value);
        return this;
    }

    public AccessibilityLimitationStructure withValidityCondition(ValidityConditionStructure value) {
        setValidityCondition(value);
        return this;
    }

    public AccessibilityLimitationStructure withWheelchairAccess(AccessibilityStructure value) {
        setWheelchairAccess(value);
        return this;
    }

    public AccessibilityLimitationStructure withStepFreeAccess(AccessibilityStructure value) {
        setStepFreeAccess(value);
        return this;
    }

    public AccessibilityLimitationStructure withEscalatorFreeAccess(AccessibilityStructure value) {
        setEscalatorFreeAccess(value);
        return this;
    }

    public AccessibilityLimitationStructure withLiftFreeAccess(AccessibilityStructure value) {
        setLiftFreeAccess(value);
        return this;
    }

    public AccessibilityLimitationStructure withAudibleSignalsAvailable(AccessibilityStructure value) {
        setAudibleSignalsAvailable(value);
        return this;
    }

    public AccessibilityLimitationStructure withVisualSignsAvailable(AccessibilityStructure value) {
        setVisualSignsAvailable(value);
        return this;
    }

    public AccessibilityLimitationStructure withExtensions(Extensions value) {
        setExtensions(value);
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

//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package com.bliksemlabs.ojp.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per ErrorConditionStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ErrorConditionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;group ref="{http://www.siri.org.uk/siri}ApplicationErrorGroup"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="Description" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorConditionStructure", propOrder = {
    "serviceNotAvailableError",
    "capabilityNotSupportedError",
    "accessNotAllowedError",
    "invalidDataReferencesError",
    "beyondDataHorizon",
    "noInfoForTopicError",
    "parametersIgnoredError",
    "unknownExtensionsError",
    "allowedResourceUsageExceededError",
    "otherError",
    "description"
})
public class ErrorConditionStructure {

    @XmlElement(name = "ServiceNotAvailableError")
    protected ServiceNotAvailableErrorStructure serviceNotAvailableError;
    @XmlElement(name = "CapabilityNotSupportedError")
    protected CapabilityNotSupportedErrorStructure capabilityNotSupportedError;
    @XmlElement(name = "AccessNotAllowedError")
    protected AccessNotAllowedErrorStructure accessNotAllowedError;
    @XmlElement(name = "InvalidDataReferencesError")
    protected InvalidDataReferencesErrorStructure invalidDataReferencesError;
    @XmlElement(name = "BeyondDataHorizon")
    protected BeyondDataHorizonErrorStructure beyondDataHorizon;
    @XmlElement(name = "NoInfoForTopicError")
    protected NoInfoForTopicErrorStructure noInfoForTopicError;
    @XmlElement(name = "ParametersIgnoredError")
    protected ParametersIgnoredErrorStructure parametersIgnoredError;
    @XmlElement(name = "UnknownExtensionsError")
    protected UnknownExtensionsErrorStructure unknownExtensionsError;
    @XmlElement(name = "AllowedResourceUsageExceededError")
    protected AllowedResourceUsageExceededErrorStructure allowedResourceUsageExceededError;
    @XmlElement(name = "OtherError")
    protected OtherErrorStructure otherError;
    @XmlElement(name = "Description")
    protected NaturalLanguageStringStructure description;

    /**
     * Recupera il valore della proprietà serviceNotAvailableError.
     * 
     * @return
     *     possible object is
     *     {@link ServiceNotAvailableErrorStructure }
     *     
     */
    public ServiceNotAvailableErrorStructure getServiceNotAvailableError() {
        return serviceNotAvailableError;
    }

    /**
     * Imposta il valore della proprietà serviceNotAvailableError.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceNotAvailableErrorStructure }
     *     
     */
    public void setServiceNotAvailableError(ServiceNotAvailableErrorStructure value) {
        this.serviceNotAvailableError = value;
    }

    /**
     * Recupera il valore della proprietà capabilityNotSupportedError.
     * 
     * @return
     *     possible object is
     *     {@link CapabilityNotSupportedErrorStructure }
     *     
     */
    public CapabilityNotSupportedErrorStructure getCapabilityNotSupportedError() {
        return capabilityNotSupportedError;
    }

    /**
     * Imposta il valore della proprietà capabilityNotSupportedError.
     * 
     * @param value
     *     allowed object is
     *     {@link CapabilityNotSupportedErrorStructure }
     *     
     */
    public void setCapabilityNotSupportedError(CapabilityNotSupportedErrorStructure value) {
        this.capabilityNotSupportedError = value;
    }

    /**
     * Recupera il valore della proprietà accessNotAllowedError.
     * 
     * @return
     *     possible object is
     *     {@link AccessNotAllowedErrorStructure }
     *     
     */
    public AccessNotAllowedErrorStructure getAccessNotAllowedError() {
        return accessNotAllowedError;
    }

    /**
     * Imposta il valore della proprietà accessNotAllowedError.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessNotAllowedErrorStructure }
     *     
     */
    public void setAccessNotAllowedError(AccessNotAllowedErrorStructure value) {
        this.accessNotAllowedError = value;
    }

    /**
     * Recupera il valore della proprietà invalidDataReferencesError.
     * 
     * @return
     *     possible object is
     *     {@link InvalidDataReferencesErrorStructure }
     *     
     */
    public InvalidDataReferencesErrorStructure getInvalidDataReferencesError() {
        return invalidDataReferencesError;
    }

    /**
     * Imposta il valore della proprietà invalidDataReferencesError.
     * 
     * @param value
     *     allowed object is
     *     {@link InvalidDataReferencesErrorStructure }
     *     
     */
    public void setInvalidDataReferencesError(InvalidDataReferencesErrorStructure value) {
        this.invalidDataReferencesError = value;
    }

    /**
     * Recupera il valore della proprietà beyondDataHorizon.
     * 
     * @return
     *     possible object is
     *     {@link BeyondDataHorizonErrorStructure }
     *     
     */
    public BeyondDataHorizonErrorStructure getBeyondDataHorizon() {
        return beyondDataHorizon;
    }

    /**
     * Imposta il valore della proprietà beyondDataHorizon.
     * 
     * @param value
     *     allowed object is
     *     {@link BeyondDataHorizonErrorStructure }
     *     
     */
    public void setBeyondDataHorizon(BeyondDataHorizonErrorStructure value) {
        this.beyondDataHorizon = value;
    }

    /**
     * Recupera il valore della proprietà noInfoForTopicError.
     * 
     * @return
     *     possible object is
     *     {@link NoInfoForTopicErrorStructure }
     *     
     */
    public NoInfoForTopicErrorStructure getNoInfoForTopicError() {
        return noInfoForTopicError;
    }

    /**
     * Imposta il valore della proprietà noInfoForTopicError.
     * 
     * @param value
     *     allowed object is
     *     {@link NoInfoForTopicErrorStructure }
     *     
     */
    public void setNoInfoForTopicError(NoInfoForTopicErrorStructure value) {
        this.noInfoForTopicError = value;
    }

    /**
     * Recupera il valore della proprietà parametersIgnoredError.
     * 
     * @return
     *     possible object is
     *     {@link ParametersIgnoredErrorStructure }
     *     
     */
    public ParametersIgnoredErrorStructure getParametersIgnoredError() {
        return parametersIgnoredError;
    }

    /**
     * Imposta il valore della proprietà parametersIgnoredError.
     * 
     * @param value
     *     allowed object is
     *     {@link ParametersIgnoredErrorStructure }
     *     
     */
    public void setParametersIgnoredError(ParametersIgnoredErrorStructure value) {
        this.parametersIgnoredError = value;
    }

    /**
     * Recupera il valore della proprietà unknownExtensionsError.
     * 
     * @return
     *     possible object is
     *     {@link UnknownExtensionsErrorStructure }
     *     
     */
    public UnknownExtensionsErrorStructure getUnknownExtensionsError() {
        return unknownExtensionsError;
    }

    /**
     * Imposta il valore della proprietà unknownExtensionsError.
     * 
     * @param value
     *     allowed object is
     *     {@link UnknownExtensionsErrorStructure }
     *     
     */
    public void setUnknownExtensionsError(UnknownExtensionsErrorStructure value) {
        this.unknownExtensionsError = value;
    }

    /**
     * Recupera il valore della proprietà allowedResourceUsageExceededError.
     * 
     * @return
     *     possible object is
     *     {@link AllowedResourceUsageExceededErrorStructure }
     *     
     */
    public AllowedResourceUsageExceededErrorStructure getAllowedResourceUsageExceededError() {
        return allowedResourceUsageExceededError;
    }

    /**
     * Imposta il valore della proprietà allowedResourceUsageExceededError.
     * 
     * @param value
     *     allowed object is
     *     {@link AllowedResourceUsageExceededErrorStructure }
     *     
     */
    public void setAllowedResourceUsageExceededError(AllowedResourceUsageExceededErrorStructure value) {
        this.allowedResourceUsageExceededError = value;
    }

    /**
     * Recupera il valore della proprietà otherError.
     * 
     * @return
     *     possible object is
     *     {@link OtherErrorStructure }
     *     
     */
    public OtherErrorStructure getOtherError() {
        return otherError;
    }

    /**
     * Imposta il valore della proprietà otherError.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherErrorStructure }
     *     
     */
    public void setOtherError(OtherErrorStructure value) {
        this.otherError = value;
    }

    /**
     * Recupera il valore della proprietà description.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getDescription() {
        return description;
    }

    /**
     * Imposta il valore della proprietà description.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setDescription(NaturalLanguageStringStructure value) {
        this.description = value;
    }

    public ErrorConditionStructure withServiceNotAvailableError(ServiceNotAvailableErrorStructure value) {
        setServiceNotAvailableError(value);
        return this;
    }

    public ErrorConditionStructure withCapabilityNotSupportedError(CapabilityNotSupportedErrorStructure value) {
        setCapabilityNotSupportedError(value);
        return this;
    }

    public ErrorConditionStructure withAccessNotAllowedError(AccessNotAllowedErrorStructure value) {
        setAccessNotAllowedError(value);
        return this;
    }

    public ErrorConditionStructure withInvalidDataReferencesError(InvalidDataReferencesErrorStructure value) {
        setInvalidDataReferencesError(value);
        return this;
    }

    public ErrorConditionStructure withBeyondDataHorizon(BeyondDataHorizonErrorStructure value) {
        setBeyondDataHorizon(value);
        return this;
    }

    public ErrorConditionStructure withNoInfoForTopicError(NoInfoForTopicErrorStructure value) {
        setNoInfoForTopicError(value);
        return this;
    }

    public ErrorConditionStructure withParametersIgnoredError(ParametersIgnoredErrorStructure value) {
        setParametersIgnoredError(value);
        return this;
    }

    public ErrorConditionStructure withUnknownExtensionsError(UnknownExtensionsErrorStructure value) {
        setUnknownExtensionsError(value);
        return this;
    }

    public ErrorConditionStructure withAllowedResourceUsageExceededError(AllowedResourceUsageExceededErrorStructure value) {
        setAllowedResourceUsageExceededError(value);
        return this;
    }

    public ErrorConditionStructure withOtherError(OtherErrorStructure value) {
        setOtherError(value);
        return this;
    }

    public ErrorConditionStructure withDescription(NaturalLanguageStringStructure value) {
        setDescription(value);
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

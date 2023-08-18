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
 * <p>Classe Java per ErrorConditionElementStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ErrorConditionElementStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;group ref="{http://www.siri.org.uk/siri}ServiceRequestErrorGroup"/&gt;
 *           &lt;element ref="{http://www.siri.org.uk/siri}UnknownSubscriptionError"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="Description" type="{http://www.siri.org.uk/siri}ErrorDescriptionStructure" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorConditionElementStructure", propOrder = {
    "unapprovedKeyAccessError",
    "unknownParticipantError",
    "unknownEndpointError",
    "endpointDeniedAccessError",
    "endpointNotAvailableAccessError",
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
    "unknownSubscriptionError",
    "description"
})
public class ErrorConditionElementStructure {

    @XmlElement(name = "UnapprovedKeyAccessError")
    protected UnapprovedKeyAccessStructure unapprovedKeyAccessError;
    @XmlElement(name = "UnknownParticipantError")
    protected UnknownParticipantErrorStructure unknownParticipantError;
    @XmlElement(name = "UnknownEndpointError")
    protected UnknownEndpointErrorStructure unknownEndpointError;
    @XmlElement(name = "EndpointDeniedAccessError")
    protected EndpointDeniedAccessStructure endpointDeniedAccessError;
    @XmlElement(name = "EndpointNotAvailableAccessError")
    protected EndpointNotAvailableAccessStructure endpointNotAvailableAccessError;
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
    @XmlElement(name = "UnknownSubscriptionError")
    protected UnknownSubscriptionErrorStructure unknownSubscriptionError;
    @XmlElement(name = "Description")
    protected ErrorDescriptionStructure description;

    /**
     * Recupera il valore della proprietà unapprovedKeyAccessError.
     * 
     * @return
     *     possible object is
     *     {@link UnapprovedKeyAccessStructure }
     *     
     */
    public UnapprovedKeyAccessStructure getUnapprovedKeyAccessError() {
        return unapprovedKeyAccessError;
    }

    /**
     * Imposta il valore della proprietà unapprovedKeyAccessError.
     * 
     * @param value
     *     allowed object is
     *     {@link UnapprovedKeyAccessStructure }
     *     
     */
    public void setUnapprovedKeyAccessError(UnapprovedKeyAccessStructure value) {
        this.unapprovedKeyAccessError = value;
    }

    /**
     * Recupera il valore della proprietà unknownParticipantError.
     * 
     * @return
     *     possible object is
     *     {@link UnknownParticipantErrorStructure }
     *     
     */
    public UnknownParticipantErrorStructure getUnknownParticipantError() {
        return unknownParticipantError;
    }

    /**
     * Imposta il valore della proprietà unknownParticipantError.
     * 
     * @param value
     *     allowed object is
     *     {@link UnknownParticipantErrorStructure }
     *     
     */
    public void setUnknownParticipantError(UnknownParticipantErrorStructure value) {
        this.unknownParticipantError = value;
    }

    /**
     * Recupera il valore della proprietà unknownEndpointError.
     * 
     * @return
     *     possible object is
     *     {@link UnknownEndpointErrorStructure }
     *     
     */
    public UnknownEndpointErrorStructure getUnknownEndpointError() {
        return unknownEndpointError;
    }

    /**
     * Imposta il valore della proprietà unknownEndpointError.
     * 
     * @param value
     *     allowed object is
     *     {@link UnknownEndpointErrorStructure }
     *     
     */
    public void setUnknownEndpointError(UnknownEndpointErrorStructure value) {
        this.unknownEndpointError = value;
    }

    /**
     * Recupera il valore della proprietà endpointDeniedAccessError.
     * 
     * @return
     *     possible object is
     *     {@link EndpointDeniedAccessStructure }
     *     
     */
    public EndpointDeniedAccessStructure getEndpointDeniedAccessError() {
        return endpointDeniedAccessError;
    }

    /**
     * Imposta il valore della proprietà endpointDeniedAccessError.
     * 
     * @param value
     *     allowed object is
     *     {@link EndpointDeniedAccessStructure }
     *     
     */
    public void setEndpointDeniedAccessError(EndpointDeniedAccessStructure value) {
        this.endpointDeniedAccessError = value;
    }

    /**
     * Recupera il valore della proprietà endpointNotAvailableAccessError.
     * 
     * @return
     *     possible object is
     *     {@link EndpointNotAvailableAccessStructure }
     *     
     */
    public EndpointNotAvailableAccessStructure getEndpointNotAvailableAccessError() {
        return endpointNotAvailableAccessError;
    }

    /**
     * Imposta il valore della proprietà endpointNotAvailableAccessError.
     * 
     * @param value
     *     allowed object is
     *     {@link EndpointNotAvailableAccessStructure }
     *     
     */
    public void setEndpointNotAvailableAccessError(EndpointNotAvailableAccessStructure value) {
        this.endpointNotAvailableAccessError = value;
    }

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
     * Recupera il valore della proprietà unknownSubscriptionError.
     * 
     * @return
     *     possible object is
     *     {@link UnknownSubscriptionErrorStructure }
     *     
     */
    public UnknownSubscriptionErrorStructure getUnknownSubscriptionError() {
        return unknownSubscriptionError;
    }

    /**
     * Imposta il valore della proprietà unknownSubscriptionError.
     * 
     * @param value
     *     allowed object is
     *     {@link UnknownSubscriptionErrorStructure }
     *     
     */
    public void setUnknownSubscriptionError(UnknownSubscriptionErrorStructure value) {
        this.unknownSubscriptionError = value;
    }

    /**
     * Recupera il valore della proprietà description.
     * 
     * @return
     *     possible object is
     *     {@link ErrorDescriptionStructure }
     *     
     */
    public ErrorDescriptionStructure getDescription() {
        return description;
    }

    /**
     * Imposta il valore della proprietà description.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorDescriptionStructure }
     *     
     */
    public void setDescription(ErrorDescriptionStructure value) {
        this.description = value;
    }

    public ErrorConditionElementStructure withUnapprovedKeyAccessError(UnapprovedKeyAccessStructure value) {
        setUnapprovedKeyAccessError(value);
        return this;
    }

    public ErrorConditionElementStructure withUnknownParticipantError(UnknownParticipantErrorStructure value) {
        setUnknownParticipantError(value);
        return this;
    }

    public ErrorConditionElementStructure withUnknownEndpointError(UnknownEndpointErrorStructure value) {
        setUnknownEndpointError(value);
        return this;
    }

    public ErrorConditionElementStructure withEndpointDeniedAccessError(EndpointDeniedAccessStructure value) {
        setEndpointDeniedAccessError(value);
        return this;
    }

    public ErrorConditionElementStructure withEndpointNotAvailableAccessError(EndpointNotAvailableAccessStructure value) {
        setEndpointNotAvailableAccessError(value);
        return this;
    }

    public ErrorConditionElementStructure withServiceNotAvailableError(ServiceNotAvailableErrorStructure value) {
        setServiceNotAvailableError(value);
        return this;
    }

    public ErrorConditionElementStructure withCapabilityNotSupportedError(CapabilityNotSupportedErrorStructure value) {
        setCapabilityNotSupportedError(value);
        return this;
    }

    public ErrorConditionElementStructure withAccessNotAllowedError(AccessNotAllowedErrorStructure value) {
        setAccessNotAllowedError(value);
        return this;
    }

    public ErrorConditionElementStructure withInvalidDataReferencesError(InvalidDataReferencesErrorStructure value) {
        setInvalidDataReferencesError(value);
        return this;
    }

    public ErrorConditionElementStructure withBeyondDataHorizon(BeyondDataHorizonErrorStructure value) {
        setBeyondDataHorizon(value);
        return this;
    }

    public ErrorConditionElementStructure withNoInfoForTopicError(NoInfoForTopicErrorStructure value) {
        setNoInfoForTopicError(value);
        return this;
    }

    public ErrorConditionElementStructure withParametersIgnoredError(ParametersIgnoredErrorStructure value) {
        setParametersIgnoredError(value);
        return this;
    }

    public ErrorConditionElementStructure withUnknownExtensionsError(UnknownExtensionsErrorStructure value) {
        setUnknownExtensionsError(value);
        return this;
    }

    public ErrorConditionElementStructure withAllowedResourceUsageExceededError(AllowedResourceUsageExceededErrorStructure value) {
        setAllowedResourceUsageExceededError(value);
        return this;
    }

    public ErrorConditionElementStructure withOtherError(OtherErrorStructure value) {
        setOtherError(value);
        return this;
    }

    public ErrorConditionElementStructure withUnknownSubscriptionError(UnknownSubscriptionErrorStructure value) {
        setUnknownSubscriptionError(value);
        return this;
    }

    public ErrorConditionElementStructure withDescription(ErrorDescriptionStructure value) {
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

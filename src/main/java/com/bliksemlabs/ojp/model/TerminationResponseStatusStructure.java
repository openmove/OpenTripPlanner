//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package com.bliksemlabs.ojp.model;

import java.time.LocalDateTime;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.LocalDateTimeISO8601XmlAdapter;


/**
 * <p>Classe Java per TerminationResponseStatusStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TerminationResponseStatusStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}ResponseTimestamp" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}ContextualisedResponseEndpointGroup"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}SubscriptionIdentifierResourcePropertyGroup" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}Status"/&gt;
 *         &lt;element name="ErrorCondition" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;choice&gt;
 *                     &lt;element ref="{http://www.siri.org.uk/siri}CapabilityNotSupportedError"/&gt;
 *                     &lt;element ref="{http://www.siri.org.uk/siri}UnknownSubscriberError"/&gt;
 *                     &lt;element ref="{http://www.siri.org.uk/siri}UnknownSubscriptionError"/&gt;
 *                     &lt;element ref="{http://www.siri.org.uk/siri}OtherError"/&gt;
 *                   &lt;/choice&gt;
 *                   &lt;element name="Description" type="{http://www.siri.org.uk/siri}ErrorDescriptionStructure" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminationResponseStatusStructure", propOrder = {
    "responseTimestamp",
    "requestMessageRef",
    "subscriberRef",
    "subscriptionFilterRef",
    "subscriptionRef",
    "status",
    "errorCondition"
})
public class TerminationResponseStatusStructure {

    @XmlElement(name = "ResponseTimestamp", type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime responseTimestamp;
    @XmlElement(name = "RequestMessageRef")
    protected MessageQualifierStructure requestMessageRef;
    @XmlElement(name = "SubscriberRef")
    protected ParticipantRefStructure subscriberRef;
    @XmlElement(name = "SubscriptionFilterRef")
    protected SubscriptionFilterRefStructure subscriptionFilterRef;
    @XmlElement(name = "SubscriptionRef")
    protected SubscriptionQualifierStructure subscriptionRef;
    @XmlElement(name = "Status", defaultValue = "true")
    protected boolean status;
    @XmlElement(name = "ErrorCondition")
    protected TerminationResponseStatusStructure.ErrorCondition errorCondition;

    /**
     * Recupera il valore della proprietà responseTimestamp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getResponseTimestamp() {
        return responseTimestamp;
    }

    /**
     * Imposta il valore della proprietà responseTimestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseTimestamp(LocalDateTime value) {
        this.responseTimestamp = value;
    }

    /**
     * Recupera il valore della proprietà requestMessageRef.
     * 
     * @return
     *     possible object is
     *     {@link MessageQualifierStructure }
     *     
     */
    public MessageQualifierStructure getRequestMessageRef() {
        return requestMessageRef;
    }

    /**
     * Imposta il valore della proprietà requestMessageRef.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageQualifierStructure }
     *     
     */
    public void setRequestMessageRef(MessageQualifierStructure value) {
        this.requestMessageRef = value;
    }

    /**
     * Recupera il valore della proprietà subscriberRef.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantRefStructure }
     *     
     */
    public ParticipantRefStructure getSubscriberRef() {
        return subscriberRef;
    }

    /**
     * Imposta il valore della proprietà subscriberRef.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantRefStructure }
     *     
     */
    public void setSubscriberRef(ParticipantRefStructure value) {
        this.subscriberRef = value;
    }

    /**
     * Recupera il valore della proprietà subscriptionFilterRef.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionFilterRefStructure }
     *     
     */
    public SubscriptionFilterRefStructure getSubscriptionFilterRef() {
        return subscriptionFilterRef;
    }

    /**
     * Imposta il valore della proprietà subscriptionFilterRef.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionFilterRefStructure }
     *     
     */
    public void setSubscriptionFilterRef(SubscriptionFilterRefStructure value) {
        this.subscriptionFilterRef = value;
    }

    /**
     * Recupera il valore della proprietà subscriptionRef.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionQualifierStructure }
     *     
     */
    public SubscriptionQualifierStructure getSubscriptionRef() {
        return subscriptionRef;
    }

    /**
     * Imposta il valore della proprietà subscriptionRef.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionQualifierStructure }
     *     
     */
    public void setSubscriptionRef(SubscriptionQualifierStructure value) {
        this.subscriptionRef = value;
    }

    /**
     * Recupera il valore della proprietà status.
     * 
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * Imposta il valore della proprietà status.
     * 
     */
    public void setStatus(boolean value) {
        this.status = value;
    }

    /**
     * Recupera il valore della proprietà errorCondition.
     * 
     * @return
     *     possible object is
     *     {@link TerminationResponseStatusStructure.ErrorCondition }
     *     
     */
    public TerminationResponseStatusStructure.ErrorCondition getErrorCondition() {
        return errorCondition;
    }

    /**
     * Imposta il valore della proprietà errorCondition.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminationResponseStatusStructure.ErrorCondition }
     *     
     */
    public void setErrorCondition(TerminationResponseStatusStructure.ErrorCondition value) {
        this.errorCondition = value;
    }

    public TerminationResponseStatusStructure withResponseTimestamp(LocalDateTime value) {
        setResponseTimestamp(value);
        return this;
    }

    public TerminationResponseStatusStructure withRequestMessageRef(MessageQualifierStructure value) {
        setRequestMessageRef(value);
        return this;
    }

    public TerminationResponseStatusStructure withSubscriberRef(ParticipantRefStructure value) {
        setSubscriberRef(value);
        return this;
    }

    public TerminationResponseStatusStructure withSubscriptionFilterRef(SubscriptionFilterRefStructure value) {
        setSubscriptionFilterRef(value);
        return this;
    }

    public TerminationResponseStatusStructure withSubscriptionRef(SubscriptionQualifierStructure value) {
        setSubscriptionRef(value);
        return this;
    }

    public TerminationResponseStatusStructure withStatus(boolean value) {
        setStatus(value);
        return this;
    }

    public TerminationResponseStatusStructure withErrorCondition(TerminationResponseStatusStructure.ErrorCondition value) {
        setErrorCondition(value);
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


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;choice&gt;
     *           &lt;element ref="{http://www.siri.org.uk/siri}CapabilityNotSupportedError"/&gt;
     *           &lt;element ref="{http://www.siri.org.uk/siri}UnknownSubscriberError"/&gt;
     *           &lt;element ref="{http://www.siri.org.uk/siri}UnknownSubscriptionError"/&gt;
     *           &lt;element ref="{http://www.siri.org.uk/siri}OtherError"/&gt;
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
    @XmlType(name = "", propOrder = {
        "capabilityNotSupportedError",
        "unknownSubscriberError",
        "unknownSubscriptionError",
        "otherError",
        "description"
    })
    public static class ErrorCondition {

        @XmlElement(name = "CapabilityNotSupportedError")
        protected CapabilityNotSupportedErrorStructure capabilityNotSupportedError;
        @XmlElement(name = "UnknownSubscriberError")
        protected UnknownSubscriberErrorStructure unknownSubscriberError;
        @XmlElement(name = "UnknownSubscriptionError")
        protected UnknownSubscriptionErrorStructure unknownSubscriptionError;
        @XmlElement(name = "OtherError")
        protected OtherErrorStructure otherError;
        @XmlElement(name = "Description")
        protected ErrorDescriptionStructure description;

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
         * Recupera il valore della proprietà unknownSubscriberError.
         * 
         * @return
         *     possible object is
         *     {@link UnknownSubscriberErrorStructure }
         *     
         */
        public UnknownSubscriberErrorStructure getUnknownSubscriberError() {
            return unknownSubscriberError;
        }

        /**
         * Imposta il valore della proprietà unknownSubscriberError.
         * 
         * @param value
         *     allowed object is
         *     {@link UnknownSubscriberErrorStructure }
         *     
         */
        public void setUnknownSubscriberError(UnknownSubscriberErrorStructure value) {
            this.unknownSubscriberError = value;
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

        public TerminationResponseStatusStructure.ErrorCondition withCapabilityNotSupportedError(CapabilityNotSupportedErrorStructure value) {
            setCapabilityNotSupportedError(value);
            return this;
        }

        public TerminationResponseStatusStructure.ErrorCondition withUnknownSubscriberError(UnknownSubscriberErrorStructure value) {
            setUnknownSubscriberError(value);
            return this;
        }

        public TerminationResponseStatusStructure.ErrorCondition withUnknownSubscriptionError(UnknownSubscriptionErrorStructure value) {
            setUnknownSubscriptionError(value);
            return this;
        }

        public TerminationResponseStatusStructure.ErrorCondition withOtherError(OtherErrorStructure value) {
            setOtherError(value);
            return this;
        }

        public TerminationResponseStatusStructure.ErrorCondition withDescription(ErrorDescriptionStructure value) {
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

}

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
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per DataReadyResponseStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DataReadyResponseStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}ConsumerResponseEndpointStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}Status" minOccurs="0"/&gt;
 *         &lt;element name="ErrorCondition" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;choice&gt;
 *                     &lt;element ref="{http://www.siri.org.uk/siri}UnknownSubscriptionError"/&gt;
 *                     &lt;element ref="{http://www.siri.org.uk/siri}OtherError"/&gt;
 *                   &lt;/choice&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="Description" type="{http://www.siri.org.uk/siri}ErrorDescriptionStructure" minOccurs="0"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataReadyResponseStructure", propOrder = {
    "status",
    "errorCondition"
})
public class DataReadyResponseStructure
    extends ConsumerResponseEndpointStructure
{

    @XmlElement(name = "Status", defaultValue = "true")
    protected Boolean status;
    @XmlElement(name = "ErrorCondition")
    protected DataReadyResponseStructure.ErrorCondition errorCondition;

    /**
     * Recupera il valore della proprietà status.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStatus() {
        return status;
    }

    /**
     * Imposta il valore della proprietà status.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStatus(Boolean value) {
        this.status = value;
    }

    /**
     * Recupera il valore della proprietà errorCondition.
     * 
     * @return
     *     possible object is
     *     {@link DataReadyResponseStructure.ErrorCondition }
     *     
     */
    public DataReadyResponseStructure.ErrorCondition getErrorCondition() {
        return errorCondition;
    }

    /**
     * Imposta il valore della proprietà errorCondition.
     * 
     * @param value
     *     allowed object is
     *     {@link DataReadyResponseStructure.ErrorCondition }
     *     
     */
    public void setErrorCondition(DataReadyResponseStructure.ErrorCondition value) {
        this.errorCondition = value;
    }

    public DataReadyResponseStructure withStatus(Boolean value) {
        setStatus(value);
        return this;
    }

    public DataReadyResponseStructure withErrorCondition(DataReadyResponseStructure.ErrorCondition value) {
        setErrorCondition(value);
        return this;
    }

    @Override
    public DataReadyResponseStructure withConsumerRef(ParticipantRefStructure value) {
        setConsumerRef(value);
        return this;
    }

    @Override
    public DataReadyResponseStructure withRequestMessageRef(MessageRefStructure value) {
        setRequestMessageRef(value);
        return this;
    }

    @Override
    public DataReadyResponseStructure withDelegatorAddress(String value) {
        setDelegatorAddress(value);
        return this;
    }

    @Override
    public DataReadyResponseStructure withDelegatorRef(ParticipantRefStructure value) {
        setDelegatorRef(value);
        return this;
    }

    @Override
    public DataReadyResponseStructure withResponseTimestamp(LocalDateTime value) {
        setResponseTimestamp(value);
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
     *           &lt;element ref="{http://www.siri.org.uk/siri}UnknownSubscriptionError"/&gt;
     *           &lt;element ref="{http://www.siri.org.uk/siri}OtherError"/&gt;
     *         &lt;/choice&gt;
     *         &lt;sequence&gt;
     *           &lt;element name="Description" type="{http://www.siri.org.uk/siri}ErrorDescriptionStructure" minOccurs="0"/&gt;
     *         &lt;/sequence&gt;
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
        "unknownSubscriptionError",
        "otherError",
        "description"
    })
    public static class ErrorCondition {

        @XmlElement(name = "UnknownSubscriptionError")
        protected UnknownSubscriptionErrorStructure unknownSubscriptionError;
        @XmlElement(name = "OtherError")
        protected OtherErrorStructure otherError;
        @XmlElement(name = "Description")
        protected ErrorDescriptionStructure description;

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

        public DataReadyResponseStructure.ErrorCondition withUnknownSubscriptionError(UnknownSubscriptionErrorStructure value) {
            setUnknownSubscriptionError(value);
            return this;
        }

        public DataReadyResponseStructure.ErrorCondition withOtherError(OtherErrorStructure value) {
            setOtherError(value);
            return this;
        }

        public DataReadyResponseStructure.ErrorCondition withDescription(ErrorDescriptionStructure value) {
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

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
 * <p>Classe Java per CapabilityGeneralInteractionStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CapabilityGeneralInteractionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Interaction"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="RequestResponse" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                   &lt;element name="PublishSubscribe" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Delivery"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DirectDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                   &lt;element name="FetchedDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MultipartDespatch" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="MultipleSubscriberFilter" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="HasConfirmDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="HasHeartbeat" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="VisitNumberisOrder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilityGeneralInteractionStructure", propOrder = {
    "interaction",
    "delivery",
    "multipartDespatch",
    "multipleSubscriberFilter",
    "hasConfirmDelivery",
    "hasHeartbeat",
    "visitNumberisOrder"
})
public class CapabilityGeneralInteractionStructure {

    @XmlElement(name = "Interaction", required = true)
    protected CapabilityGeneralInteractionStructure.Interaction interaction;
    @XmlElement(name = "Delivery", required = true)
    protected CapabilityGeneralInteractionStructure.Delivery delivery;
    @XmlElement(name = "MultipartDespatch", defaultValue = "true")
    protected boolean multipartDespatch;
    @XmlElement(name = "MultipleSubscriberFilter", defaultValue = "false")
    protected boolean multipleSubscriberFilter;
    @XmlElement(name = "HasConfirmDelivery", defaultValue = "false")
    protected boolean hasConfirmDelivery;
    @XmlElement(name = "HasHeartbeat", defaultValue = "false")
    protected boolean hasHeartbeat;
    @XmlElement(name = "VisitNumberisOrder", defaultValue = "false")
    protected Boolean visitNumberisOrder;

    /**
     * Recupera il valore della proprietà interaction.
     * 
     * @return
     *     possible object is
     *     {@link CapabilityGeneralInteractionStructure.Interaction }
     *     
     */
    public CapabilityGeneralInteractionStructure.Interaction getInteraction() {
        return interaction;
    }

    /**
     * Imposta il valore della proprietà interaction.
     * 
     * @param value
     *     allowed object is
     *     {@link CapabilityGeneralInteractionStructure.Interaction }
     *     
     */
    public void setInteraction(CapabilityGeneralInteractionStructure.Interaction value) {
        this.interaction = value;
    }

    /**
     * Recupera il valore della proprietà delivery.
     * 
     * @return
     *     possible object is
     *     {@link CapabilityGeneralInteractionStructure.Delivery }
     *     
     */
    public CapabilityGeneralInteractionStructure.Delivery getDelivery() {
        return delivery;
    }

    /**
     * Imposta il valore della proprietà delivery.
     * 
     * @param value
     *     allowed object is
     *     {@link CapabilityGeneralInteractionStructure.Delivery }
     *     
     */
    public void setDelivery(CapabilityGeneralInteractionStructure.Delivery value) {
        this.delivery = value;
    }

    /**
     * Recupera il valore della proprietà multipartDespatch.
     * 
     */
    public boolean isMultipartDespatch() {
        return multipartDespatch;
    }

    /**
     * Imposta il valore della proprietà multipartDespatch.
     * 
     */
    public void setMultipartDespatch(boolean value) {
        this.multipartDespatch = value;
    }

    /**
     * Recupera il valore della proprietà multipleSubscriberFilter.
     * 
     */
    public boolean isMultipleSubscriberFilter() {
        return multipleSubscriberFilter;
    }

    /**
     * Imposta il valore della proprietà multipleSubscriberFilter.
     * 
     */
    public void setMultipleSubscriberFilter(boolean value) {
        this.multipleSubscriberFilter = value;
    }

    /**
     * Recupera il valore della proprietà hasConfirmDelivery.
     * 
     */
    public boolean isHasConfirmDelivery() {
        return hasConfirmDelivery;
    }

    /**
     * Imposta il valore della proprietà hasConfirmDelivery.
     * 
     */
    public void setHasConfirmDelivery(boolean value) {
        this.hasConfirmDelivery = value;
    }

    /**
     * Recupera il valore della proprietà hasHeartbeat.
     * 
     */
    public boolean isHasHeartbeat() {
        return hasHeartbeat;
    }

    /**
     * Imposta il valore della proprietà hasHeartbeat.
     * 
     */
    public void setHasHeartbeat(boolean value) {
        this.hasHeartbeat = value;
    }

    /**
     * Recupera il valore della proprietà visitNumberisOrder.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVisitNumberisOrder() {
        return visitNumberisOrder;
    }

    /**
     * Imposta il valore della proprietà visitNumberisOrder.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVisitNumberisOrder(Boolean value) {
        this.visitNumberisOrder = value;
    }

    public CapabilityGeneralInteractionStructure withInteraction(CapabilityGeneralInteractionStructure.Interaction value) {
        setInteraction(value);
        return this;
    }

    public CapabilityGeneralInteractionStructure withDelivery(CapabilityGeneralInteractionStructure.Delivery value) {
        setDelivery(value);
        return this;
    }

    public CapabilityGeneralInteractionStructure withMultipartDespatch(boolean value) {
        setMultipartDespatch(value);
        return this;
    }

    public CapabilityGeneralInteractionStructure withMultipleSubscriberFilter(boolean value) {
        setMultipleSubscriberFilter(value);
        return this;
    }

    public CapabilityGeneralInteractionStructure withHasConfirmDelivery(boolean value) {
        setHasConfirmDelivery(value);
        return this;
    }

    public CapabilityGeneralInteractionStructure withHasHeartbeat(boolean value) {
        setHasHeartbeat(value);
        return this;
    }

    public CapabilityGeneralInteractionStructure withVisitNumberisOrder(Boolean value) {
        setVisitNumberisOrder(value);
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
     *         &lt;element name="DirectDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *         &lt;element name="FetchedDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
        "directDelivery",
        "fetchedDelivery"
    })
    public static class Delivery {

        @XmlElement(name = "DirectDelivery")
        protected boolean directDelivery;
        @XmlElement(name = "FetchedDelivery")
        protected boolean fetchedDelivery;

        /**
         * Recupera il valore della proprietà directDelivery.
         * 
         */
        public boolean isDirectDelivery() {
            return directDelivery;
        }

        /**
         * Imposta il valore della proprietà directDelivery.
         * 
         */
        public void setDirectDelivery(boolean value) {
            this.directDelivery = value;
        }

        /**
         * Recupera il valore della proprietà fetchedDelivery.
         * 
         */
        public boolean isFetchedDelivery() {
            return fetchedDelivery;
        }

        /**
         * Imposta il valore della proprietà fetchedDelivery.
         * 
         */
        public void setFetchedDelivery(boolean value) {
            this.fetchedDelivery = value;
        }

        public CapabilityGeneralInteractionStructure.Delivery withDirectDelivery(boolean value) {
            setDirectDelivery(value);
            return this;
        }

        public CapabilityGeneralInteractionStructure.Delivery withFetchedDelivery(boolean value) {
            setFetchedDelivery(value);
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
     *         &lt;element name="RequestResponse" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *         &lt;element name="PublishSubscribe" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
        "requestResponse",
        "publishSubscribe"
    })
    public static class Interaction {

        @XmlElement(name = "RequestResponse", defaultValue = "true")
        protected boolean requestResponse;
        @XmlElement(name = "PublishSubscribe", defaultValue = "true")
        protected boolean publishSubscribe;

        /**
         * Recupera il valore della proprietà requestResponse.
         * 
         */
        public boolean isRequestResponse() {
            return requestResponse;
        }

        /**
         * Imposta il valore della proprietà requestResponse.
         * 
         */
        public void setRequestResponse(boolean value) {
            this.requestResponse = value;
        }

        /**
         * Recupera il valore della proprietà publishSubscribe.
         * 
         */
        public boolean isPublishSubscribe() {
            return publishSubscribe;
        }

        /**
         * Imposta il valore della proprietà publishSubscribe.
         * 
         */
        public void setPublishSubscribe(boolean value) {
            this.publishSubscribe = value;
        }

        public CapabilityGeneralInteractionStructure.Interaction withRequestResponse(boolean value) {
            setRequestResponse(value);
            return this;
        }

        public CapabilityGeneralInteractionStructure.Interaction withPublishSubscribe(boolean value) {
            setPublishSubscribe(value);
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

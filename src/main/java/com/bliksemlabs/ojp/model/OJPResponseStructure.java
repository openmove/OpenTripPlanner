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
 * Type for OJP Response - Groups individual functional responses.
 * 
 * <p>Classe Java per OJPResponseStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="OJPResponseStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}ResponseGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OJPResponseStructure", propOrder = {
    "subscriptionResponse",
    "terminateSubscriptionResponse",
    "dataReadyAcknowledgement",
    "serviceDelivery",
    "dataReceivedAcknowledgement",
    "checkStatusResponse",
    "capabilitiesResponse",
    "abstractDiscoveryDelivery"
})
public class OJPResponseStructure {

    @XmlElement(name = "SubscriptionResponse")
    protected SubscriptionResponseStructure subscriptionResponse;
    @XmlElement(name = "TerminateSubscriptionResponse")
    protected TerminateSubscriptionResponseStructure terminateSubscriptionResponse;
    @XmlElement(name = "DataReadyAcknowledgement")
    protected DataReadyResponseStructure dataReadyAcknowledgement;
    @XmlElement(name = "ServiceDelivery")
    protected ServiceDelivery serviceDelivery;
    @XmlElement(name = "DataReceivedAcknowledgement")
    protected DataReceivedResponseStructure dataReceivedAcknowledgement;
    @XmlElement(name = "CheckStatusResponse")
    protected CheckStatusResponseStructure checkStatusResponse;
    @XmlElement(name = "CapabilitiesResponse")
    protected CapabilitiesResponseStructure capabilitiesResponse;
    @XmlElement(name = "AbstractDiscoveryDelivery")
    protected AbstractDiscoveryDeliveryStructure abstractDiscoveryDelivery;

    /**
     * Recupera il valore della proprietà subscriptionResponse.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionResponseStructure }
     *     
     */
    public SubscriptionResponseStructure getSubscriptionResponse() {
        return subscriptionResponse;
    }

    /**
     * Imposta il valore della proprietà subscriptionResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionResponseStructure }
     *     
     */
    public void setSubscriptionResponse(SubscriptionResponseStructure value) {
        this.subscriptionResponse = value;
    }

    /**
     * Recupera il valore della proprietà terminateSubscriptionResponse.
     * 
     * @return
     *     possible object is
     *     {@link TerminateSubscriptionResponseStructure }
     *     
     */
    public TerminateSubscriptionResponseStructure getTerminateSubscriptionResponse() {
        return terminateSubscriptionResponse;
    }

    /**
     * Imposta il valore della proprietà terminateSubscriptionResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminateSubscriptionResponseStructure }
     *     
     */
    public void setTerminateSubscriptionResponse(TerminateSubscriptionResponseStructure value) {
        this.terminateSubscriptionResponse = value;
    }

    /**
     * Recupera il valore della proprietà dataReadyAcknowledgement.
     * 
     * @return
     *     possible object is
     *     {@link DataReadyResponseStructure }
     *     
     */
    public DataReadyResponseStructure getDataReadyAcknowledgement() {
        return dataReadyAcknowledgement;
    }

    /**
     * Imposta il valore della proprietà dataReadyAcknowledgement.
     * 
     * @param value
     *     allowed object is
     *     {@link DataReadyResponseStructure }
     *     
     */
    public void setDataReadyAcknowledgement(DataReadyResponseStructure value) {
        this.dataReadyAcknowledgement = value;
    }

    /**
     * Recupera il valore della proprietà serviceDelivery.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDelivery }
     *     
     */
    public ServiceDelivery getServiceDelivery() {
        return serviceDelivery;
    }

    /**
     * Imposta il valore della proprietà serviceDelivery.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDelivery }
     *     
     */
    public void setServiceDelivery(ServiceDelivery value) {
        this.serviceDelivery = value;
    }

    /**
     * Recupera il valore della proprietà dataReceivedAcknowledgement.
     * 
     * @return
     *     possible object is
     *     {@link DataReceivedResponseStructure }
     *     
     */
    public DataReceivedResponseStructure getDataReceivedAcknowledgement() {
        return dataReceivedAcknowledgement;
    }

    /**
     * Imposta il valore della proprietà dataReceivedAcknowledgement.
     * 
     * @param value
     *     allowed object is
     *     {@link DataReceivedResponseStructure }
     *     
     */
    public void setDataReceivedAcknowledgement(DataReceivedResponseStructure value) {
        this.dataReceivedAcknowledgement = value;
    }

    /**
     * Recupera il valore della proprietà checkStatusResponse.
     * 
     * @return
     *     possible object is
     *     {@link CheckStatusResponseStructure }
     *     
     */
    public CheckStatusResponseStructure getCheckStatusResponse() {
        return checkStatusResponse;
    }

    /**
     * Imposta il valore della proprietà checkStatusResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckStatusResponseStructure }
     *     
     */
    public void setCheckStatusResponse(CheckStatusResponseStructure value) {
        this.checkStatusResponse = value;
    }

    /**
     * Recupera il valore della proprietà capabilitiesResponse.
     * 
     * @return
     *     possible object is
     *     {@link CapabilitiesResponseStructure }
     *     
     */
    public CapabilitiesResponseStructure getCapabilitiesResponse() {
        return capabilitiesResponse;
    }

    /**
     * Imposta il valore della proprietà capabilitiesResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link CapabilitiesResponseStructure }
     *     
     */
    public void setCapabilitiesResponse(CapabilitiesResponseStructure value) {
        this.capabilitiesResponse = value;
    }

    /**
     * Recupera il valore della proprietà abstractDiscoveryDelivery.
     * 
     * @return
     *     possible object is
     *     {@link AbstractDiscoveryDeliveryStructure }
     *     
     */
    public AbstractDiscoveryDeliveryStructure getAbstractDiscoveryDelivery() {
        return abstractDiscoveryDelivery;
    }

    /**
     * Imposta il valore della proprietà abstractDiscoveryDelivery.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractDiscoveryDeliveryStructure }
     *     
     */
    public void setAbstractDiscoveryDelivery(AbstractDiscoveryDeliveryStructure value) {
        this.abstractDiscoveryDelivery = value;
    }

    public OJPResponseStructure withSubscriptionResponse(SubscriptionResponseStructure value) {
        setSubscriptionResponse(value);
        return this;
    }

    public OJPResponseStructure withTerminateSubscriptionResponse(TerminateSubscriptionResponseStructure value) {
        setTerminateSubscriptionResponse(value);
        return this;
    }

    public OJPResponseStructure withDataReadyAcknowledgement(DataReadyResponseStructure value) {
        setDataReadyAcknowledgement(value);
        return this;
    }

    public OJPResponseStructure withServiceDelivery(ServiceDelivery value) {
        setServiceDelivery(value);
        return this;
    }

    public OJPResponseStructure withDataReceivedAcknowledgement(DataReceivedResponseStructure value) {
        setDataReceivedAcknowledgement(value);
        return this;
    }

    public OJPResponseStructure withCheckStatusResponse(CheckStatusResponseStructure value) {
        setCheckStatusResponse(value);
        return this;
    }

    public OJPResponseStructure withCapabilitiesResponse(CapabilitiesResponseStructure value) {
        setCapabilitiesResponse(value);
        return this;
    }

    public OJPResponseStructure withAbstractDiscoveryDelivery(AbstractDiscoveryDeliveryStructure value) {
        setAbstractDiscoveryDelivery(value);
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

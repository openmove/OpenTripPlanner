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
 * Type for OJP Request - Groups individual functional requests.
 * 
 * <p>Classe Java per OJPRequestStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="OJPRequestStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}RequestGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OJPRequestStructure", propOrder = {
    "serviceRequest",
    "subscriptionRequest",
    "terminateSubscriptionRequest",
    "dataReadyNotification",
    "dataSupplyRequest",
    "checkStatusRequest",
    "heartbeatNotification",
    "capabilitiesRequest",
    "abstractDiscoveryRequest"
})
public class OJPRequestStructure {

    @XmlElement(name = "ServiceRequest")
    protected ServiceRequest serviceRequest;
    @XmlElement(name = "SubscriptionRequest")
    protected SubscriptionRequest subscriptionRequest;
    @XmlElement(name = "TerminateSubscriptionRequest")
    protected TerminateSubscriptionRequestStructure terminateSubscriptionRequest;
    @XmlElement(name = "DataReadyNotification")
    protected DataReadyRequestStructure dataReadyNotification;
    @XmlElement(name = "DataSupplyRequest")
    protected DataSupplyRequestStructure dataSupplyRequest;
    @XmlElement(name = "CheckStatusRequest")
    protected CheckStatusRequestStructure checkStatusRequest;
    @XmlElement(name = "HeartbeatNotification")
    protected HeartbeatNotificationStructure heartbeatNotification;
    @XmlElement(name = "CapabilitiesRequest")
    protected CapabilitiesRequestStructure capabilitiesRequest;
    @XmlElement(name = "AbstractDiscoveryRequest")
    protected AbstractDiscoveryRequestStructure abstractDiscoveryRequest;

    /**
     * Recupera il valore della proprietà serviceRequest.
     * 
     * @return
     *     possible object is
     *     {@link ServiceRequest }
     *     
     */
    public ServiceRequest getServiceRequest() {
        return serviceRequest;
    }

    /**
     * Imposta il valore della proprietà serviceRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceRequest }
     *     
     */
    public void setServiceRequest(ServiceRequest value) {
        this.serviceRequest = value;
    }

    /**
     * Recupera il valore della proprietà subscriptionRequest.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionRequest }
     *     
     */
    public SubscriptionRequest getSubscriptionRequest() {
        return subscriptionRequest;
    }

    /**
     * Imposta il valore della proprietà subscriptionRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionRequest }
     *     
     */
    public void setSubscriptionRequest(SubscriptionRequest value) {
        this.subscriptionRequest = value;
    }

    /**
     * Recupera il valore della proprietà terminateSubscriptionRequest.
     * 
     * @return
     *     possible object is
     *     {@link TerminateSubscriptionRequestStructure }
     *     
     */
    public TerminateSubscriptionRequestStructure getTerminateSubscriptionRequest() {
        return terminateSubscriptionRequest;
    }

    /**
     * Imposta il valore della proprietà terminateSubscriptionRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminateSubscriptionRequestStructure }
     *     
     */
    public void setTerminateSubscriptionRequest(TerminateSubscriptionRequestStructure value) {
        this.terminateSubscriptionRequest = value;
    }

    /**
     * Recupera il valore della proprietà dataReadyNotification.
     * 
     * @return
     *     possible object is
     *     {@link DataReadyRequestStructure }
     *     
     */
    public DataReadyRequestStructure getDataReadyNotification() {
        return dataReadyNotification;
    }

    /**
     * Imposta il valore della proprietà dataReadyNotification.
     * 
     * @param value
     *     allowed object is
     *     {@link DataReadyRequestStructure }
     *     
     */
    public void setDataReadyNotification(DataReadyRequestStructure value) {
        this.dataReadyNotification = value;
    }

    /**
     * Recupera il valore della proprietà dataSupplyRequest.
     * 
     * @return
     *     possible object is
     *     {@link DataSupplyRequestStructure }
     *     
     */
    public DataSupplyRequestStructure getDataSupplyRequest() {
        return dataSupplyRequest;
    }

    /**
     * Imposta il valore della proprietà dataSupplyRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSupplyRequestStructure }
     *     
     */
    public void setDataSupplyRequest(DataSupplyRequestStructure value) {
        this.dataSupplyRequest = value;
    }

    /**
     * Recupera il valore della proprietà checkStatusRequest.
     * 
     * @return
     *     possible object is
     *     {@link CheckStatusRequestStructure }
     *     
     */
    public CheckStatusRequestStructure getCheckStatusRequest() {
        return checkStatusRequest;
    }

    /**
     * Imposta il valore della proprietà checkStatusRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckStatusRequestStructure }
     *     
     */
    public void setCheckStatusRequest(CheckStatusRequestStructure value) {
        this.checkStatusRequest = value;
    }

    /**
     * Recupera il valore della proprietà heartbeatNotification.
     * 
     * @return
     *     possible object is
     *     {@link HeartbeatNotificationStructure }
     *     
     */
    public HeartbeatNotificationStructure getHeartbeatNotification() {
        return heartbeatNotification;
    }

    /**
     * Imposta il valore della proprietà heartbeatNotification.
     * 
     * @param value
     *     allowed object is
     *     {@link HeartbeatNotificationStructure }
     *     
     */
    public void setHeartbeatNotification(HeartbeatNotificationStructure value) {
        this.heartbeatNotification = value;
    }

    /**
     * Recupera il valore della proprietà capabilitiesRequest.
     * 
     * @return
     *     possible object is
     *     {@link CapabilitiesRequestStructure }
     *     
     */
    public CapabilitiesRequestStructure getCapabilitiesRequest() {
        return capabilitiesRequest;
    }

    /**
     * Imposta il valore della proprietà capabilitiesRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link CapabilitiesRequestStructure }
     *     
     */
    public void setCapabilitiesRequest(CapabilitiesRequestStructure value) {
        this.capabilitiesRequest = value;
    }

    /**
     * Recupera il valore della proprietà abstractDiscoveryRequest.
     * 
     * @return
     *     possible object is
     *     {@link AbstractDiscoveryRequestStructure }
     *     
     */
    public AbstractDiscoveryRequestStructure getAbstractDiscoveryRequest() {
        return abstractDiscoveryRequest;
    }

    /**
     * Imposta il valore della proprietà abstractDiscoveryRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractDiscoveryRequestStructure }
     *     
     */
    public void setAbstractDiscoveryRequest(AbstractDiscoveryRequestStructure value) {
        this.abstractDiscoveryRequest = value;
    }

    public OJPRequestStructure withServiceRequest(ServiceRequest value) {
        setServiceRequest(value);
        return this;
    }

    public OJPRequestStructure withSubscriptionRequest(SubscriptionRequest value) {
        setSubscriptionRequest(value);
        return this;
    }

    public OJPRequestStructure withTerminateSubscriptionRequest(TerminateSubscriptionRequestStructure value) {
        setTerminateSubscriptionRequest(value);
        return this;
    }

    public OJPRequestStructure withDataReadyNotification(DataReadyRequestStructure value) {
        setDataReadyNotification(value);
        return this;
    }

    public OJPRequestStructure withDataSupplyRequest(DataSupplyRequestStructure value) {
        setDataSupplyRequest(value);
        return this;
    }

    public OJPRequestStructure withCheckStatusRequest(CheckStatusRequestStructure value) {
        setCheckStatusRequest(value);
        return this;
    }

    public OJPRequestStructure withHeartbeatNotification(HeartbeatNotificationStructure value) {
        setHeartbeatNotification(value);
        return this;
    }

    public OJPRequestStructure withCapabilitiesRequest(CapabilitiesRequestStructure value) {
        setCapabilitiesRequest(value);
        return this;
    }

    public OJPRequestStructure withAbstractDiscoveryRequest(AbstractDiscoveryRequestStructure value) {
        setAbstractDiscoveryRequest(value);
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

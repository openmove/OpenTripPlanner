//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package com.bliksemlabs.ojp.model;

import java.math.BigInteger;
import java.time.Duration;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.migesok.jaxb.adapter.javatime.DurationXmlAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per ServiceRequestContextStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ServiceRequestContextStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}ServiceEndpointAddressGroup"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}ClientEndpointAddressGroup"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}ReferenceContextGroup"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}TemporalContextGroup"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}DeliveryContextGroup"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}ResourceContextGroup"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}PredictionMethodGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceRequestContextStructure", propOrder = {
    "checkStatusAddress",
    "subscribeAddress",
    "manageSubscriptionAddress",
    "getDataAddress",
    "statusResponseAddress",
    "subscriberAddress",
    "notifyAddress",
    "consumerAddress",
    "dataNameSpaces",
    "language",
    "wgsDecimalDegrees",
    "gmlCoordinateFormat",
    "distanceUnits",
    "velocityUnits",
    "dataHorizon",
    "requestTimeout",
    "deliveryMethod",
    "multipartDespatch",
    "confirmDelivery",
    "maximimumNumberOfSubscriptions",
    "allowedPredictors",
    "predictionFunction"
})
public class ServiceRequestContextStructure {

    @XmlElement(name = "CheckStatusAddress")
    @XmlSchemaType(name = "anyURI")
    protected String checkStatusAddress;
    @XmlElement(name = "SubscribeAddress")
    @XmlSchemaType(name = "anyURI")
    protected String subscribeAddress;
    @XmlElement(name = "ManageSubscriptionAddress")
    @XmlSchemaType(name = "anyURI")
    protected String manageSubscriptionAddress;
    @XmlElement(name = "GetDataAddress")
    @XmlSchemaType(name = "anyURI")
    protected String getDataAddress;
    @XmlElement(name = "StatusResponseAddress")
    @XmlSchemaType(name = "anyURI")
    protected String statusResponseAddress;
    @XmlElement(name = "SubscriberAddress")
    @XmlSchemaType(name = "anyURI")
    protected String subscriberAddress;
    @XmlElement(name = "NotifyAddress")
    @XmlSchemaType(name = "anyURI")
    protected String notifyAddress;
    @XmlElement(name = "ConsumerAddress")
    @XmlSchemaType(name = "anyURI")
    protected String consumerAddress;
    @XmlElement(name = "DataNameSpaces")
    protected DataNameSpacesStructure dataNameSpaces;
    @XmlElement(name = "Language", defaultValue = "en")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String language;
    @XmlElement(name = "WgsDecimalDegrees")
    protected String wgsDecimalDegrees;
    @XmlElement(name = "GmlCoordinateFormat")
    protected String gmlCoordinateFormat;
    @XmlElement(name = "DistanceUnits")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String distanceUnits;
    @XmlElement(name = "VelocityUnits")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String velocityUnits;
    @XmlElement(name = "DataHorizon", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration dataHorizon;
    @XmlElement(name = "RequestTimeout", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration requestTimeout;
    @XmlElement(name = "DeliveryMethod", defaultValue = "direct")
    @XmlSchemaType(name = "NMTOKEN")
    protected DeliveryMethodEnumeration deliveryMethod;
    @XmlElement(name = "MultipartDespatch")
    protected Boolean multipartDespatch;
    @XmlElement(name = "ConfirmDelivery", defaultValue = "false")
    protected Boolean confirmDelivery;
    @XmlElement(name = "MaximimumNumberOfSubscriptions")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maximimumNumberOfSubscriptions;
    @XmlElement(name = "AllowedPredictors", defaultValue = "anyone")
    @XmlSchemaType(name = "NMTOKEN")
    protected PredictorsEnumeration allowedPredictors;
    @XmlElement(name = "PredictionFunction")
    protected String predictionFunction;

    /**
     * Recupera il valore della proprietà checkStatusAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckStatusAddress() {
        return checkStatusAddress;
    }

    /**
     * Imposta il valore della proprietà checkStatusAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckStatusAddress(String value) {
        this.checkStatusAddress = value;
    }

    /**
     * Recupera il valore della proprietà subscribeAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscribeAddress() {
        return subscribeAddress;
    }

    /**
     * Imposta il valore della proprietà subscribeAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscribeAddress(String value) {
        this.subscribeAddress = value;
    }

    /**
     * Recupera il valore della proprietà manageSubscriptionAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManageSubscriptionAddress() {
        return manageSubscriptionAddress;
    }

    /**
     * Imposta il valore della proprietà manageSubscriptionAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManageSubscriptionAddress(String value) {
        this.manageSubscriptionAddress = value;
    }

    /**
     * Recupera il valore della proprietà getDataAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetDataAddress() {
        return getDataAddress;
    }

    /**
     * Imposta il valore della proprietà getDataAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetDataAddress(String value) {
        this.getDataAddress = value;
    }

    /**
     * Recupera il valore della proprietà statusResponseAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusResponseAddress() {
        return statusResponseAddress;
    }

    /**
     * Imposta il valore della proprietà statusResponseAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusResponseAddress(String value) {
        this.statusResponseAddress = value;
    }

    /**
     * Recupera il valore della proprietà subscriberAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberAddress() {
        return subscriberAddress;
    }

    /**
     * Imposta il valore della proprietà subscriberAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberAddress(String value) {
        this.subscriberAddress = value;
    }

    /**
     * Recupera il valore della proprietà notifyAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotifyAddress() {
        return notifyAddress;
    }

    /**
     * Imposta il valore della proprietà notifyAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotifyAddress(String value) {
        this.notifyAddress = value;
    }

    /**
     * Recupera il valore della proprietà consumerAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerAddress() {
        return consumerAddress;
    }

    /**
     * Imposta il valore della proprietà consumerAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerAddress(String value) {
        this.consumerAddress = value;
    }

    /**
     * Recupera il valore della proprietà dataNameSpaces.
     * 
     * @return
     *     possible object is
     *     {@link DataNameSpacesStructure }
     *     
     */
    public DataNameSpacesStructure getDataNameSpaces() {
        return dataNameSpaces;
    }

    /**
     * Imposta il valore della proprietà dataNameSpaces.
     * 
     * @param value
     *     allowed object is
     *     {@link DataNameSpacesStructure }
     *     
     */
    public void setDataNameSpaces(DataNameSpacesStructure value) {
        this.dataNameSpaces = value;
    }

    /**
     * Recupera il valore della proprietà language.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Imposta il valore della proprietà language.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Recupera il valore della proprietà wgsDecimalDegrees.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWgsDecimalDegrees() {
        return wgsDecimalDegrees;
    }

    /**
     * Imposta il valore della proprietà wgsDecimalDegrees.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWgsDecimalDegrees(String value) {
        this.wgsDecimalDegrees = value;
    }

    /**
     * Recupera il valore della proprietà gmlCoordinateFormat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGmlCoordinateFormat() {
        return gmlCoordinateFormat;
    }

    /**
     * Imposta il valore della proprietà gmlCoordinateFormat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGmlCoordinateFormat(String value) {
        this.gmlCoordinateFormat = value;
    }

    /**
     * Recupera il valore della proprietà distanceUnits.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistanceUnits() {
        return distanceUnits;
    }

    /**
     * Imposta il valore della proprietà distanceUnits.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistanceUnits(String value) {
        this.distanceUnits = value;
    }

    /**
     * Recupera il valore della proprietà velocityUnits.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVelocityUnits() {
        return velocityUnits;
    }

    /**
     * Imposta il valore della proprietà velocityUnits.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVelocityUnits(String value) {
        this.velocityUnits = value;
    }

    /**
     * Recupera il valore della proprietà dataHorizon.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getDataHorizon() {
        return dataHorizon;
    }

    /**
     * Imposta il valore della proprietà dataHorizon.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataHorizon(Duration value) {
        this.dataHorizon = value;
    }

    /**
     * Recupera il valore della proprietà requestTimeout.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getRequestTimeout() {
        return requestTimeout;
    }

    /**
     * Imposta il valore della proprietà requestTimeout.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestTimeout(Duration value) {
        this.requestTimeout = value;
    }

    /**
     * Recupera il valore della proprietà deliveryMethod.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryMethodEnumeration }
     *     
     */
    public DeliveryMethodEnumeration getDeliveryMethod() {
        return deliveryMethod;
    }

    /**
     * Imposta il valore della proprietà deliveryMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryMethodEnumeration }
     *     
     */
    public void setDeliveryMethod(DeliveryMethodEnumeration value) {
        this.deliveryMethod = value;
    }

    /**
     * Recupera il valore della proprietà multipartDespatch.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMultipartDespatch() {
        return multipartDespatch;
    }

    /**
     * Imposta il valore della proprietà multipartDespatch.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMultipartDespatch(Boolean value) {
        this.multipartDespatch = value;
    }

    /**
     * Recupera il valore della proprietà confirmDelivery.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConfirmDelivery() {
        return confirmDelivery;
    }

    /**
     * Imposta il valore della proprietà confirmDelivery.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConfirmDelivery(Boolean value) {
        this.confirmDelivery = value;
    }

    /**
     * Recupera il valore della proprietà maximimumNumberOfSubscriptions.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximimumNumberOfSubscriptions() {
        return maximimumNumberOfSubscriptions;
    }

    /**
     * Imposta il valore della proprietà maximimumNumberOfSubscriptions.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximimumNumberOfSubscriptions(BigInteger value) {
        this.maximimumNumberOfSubscriptions = value;
    }

    /**
     * Recupera il valore della proprietà allowedPredictors.
     * 
     * @return
     *     possible object is
     *     {@link PredictorsEnumeration }
     *     
     */
    public PredictorsEnumeration getAllowedPredictors() {
        return allowedPredictors;
    }

    /**
     * Imposta il valore della proprietà allowedPredictors.
     * 
     * @param value
     *     allowed object is
     *     {@link PredictorsEnumeration }
     *     
     */
    public void setAllowedPredictors(PredictorsEnumeration value) {
        this.allowedPredictors = value;
    }

    /**
     * Recupera il valore della proprietà predictionFunction.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPredictionFunction() {
        return predictionFunction;
    }

    /**
     * Imposta il valore della proprietà predictionFunction.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPredictionFunction(String value) {
        this.predictionFunction = value;
    }

    public ServiceRequestContextStructure withCheckStatusAddress(String value) {
        setCheckStatusAddress(value);
        return this;
    }

    public ServiceRequestContextStructure withSubscribeAddress(String value) {
        setSubscribeAddress(value);
        return this;
    }

    public ServiceRequestContextStructure withManageSubscriptionAddress(String value) {
        setManageSubscriptionAddress(value);
        return this;
    }

    public ServiceRequestContextStructure withGetDataAddress(String value) {
        setGetDataAddress(value);
        return this;
    }

    public ServiceRequestContextStructure withStatusResponseAddress(String value) {
        setStatusResponseAddress(value);
        return this;
    }

    public ServiceRequestContextStructure withSubscriberAddress(String value) {
        setSubscriberAddress(value);
        return this;
    }

    public ServiceRequestContextStructure withNotifyAddress(String value) {
        setNotifyAddress(value);
        return this;
    }

    public ServiceRequestContextStructure withConsumerAddress(String value) {
        setConsumerAddress(value);
        return this;
    }

    public ServiceRequestContextStructure withDataNameSpaces(DataNameSpacesStructure value) {
        setDataNameSpaces(value);
        return this;
    }

    public ServiceRequestContextStructure withLanguage(String value) {
        setLanguage(value);
        return this;
    }

    public ServiceRequestContextStructure withWgsDecimalDegrees(String value) {
        setWgsDecimalDegrees(value);
        return this;
    }

    public ServiceRequestContextStructure withGmlCoordinateFormat(String value) {
        setGmlCoordinateFormat(value);
        return this;
    }

    public ServiceRequestContextStructure withDistanceUnits(String value) {
        setDistanceUnits(value);
        return this;
    }

    public ServiceRequestContextStructure withVelocityUnits(String value) {
        setVelocityUnits(value);
        return this;
    }

    public ServiceRequestContextStructure withDataHorizon(Duration value) {
        setDataHorizon(value);
        return this;
    }

    public ServiceRequestContextStructure withRequestTimeout(Duration value) {
        setRequestTimeout(value);
        return this;
    }

    public ServiceRequestContextStructure withDeliveryMethod(DeliveryMethodEnumeration value) {
        setDeliveryMethod(value);
        return this;
    }

    public ServiceRequestContextStructure withMultipartDespatch(Boolean value) {
        setMultipartDespatch(value);
        return this;
    }

    public ServiceRequestContextStructure withConfirmDelivery(Boolean value) {
        setConfirmDelivery(value);
        return this;
    }

    public ServiceRequestContextStructure withMaximimumNumberOfSubscriptions(BigInteger value) {
        setMaximimumNumberOfSubscriptions(value);
        return this;
    }

    public ServiceRequestContextStructure withAllowedPredictors(PredictorsEnumeration value) {
        setAllowedPredictors(value);
        return this;
    }

    public ServiceRequestContextStructure withPredictionFunction(String value) {
        setPredictionFunction(value);
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

//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package com.bliksemlabs.ojp.model;

import java.time.Duration;
import java.time.LocalDateTime;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.migesok.jaxb.adapter.javatime.DurationXmlAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.LocalDateTimeISO8601XmlAdapter;


/**
 * <p>Classe Java per HeartbeatNotificationStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="HeartbeatNotificationStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}ProducerRequestEndpointStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}CheckStatusPayloadGroup"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeartbeatNotificationStructure", propOrder = {
    "status",
    "dataReady",
    "errorCondition",
    "validUntil",
    "shortestPossibleCycle",
    "serviceStartedTime",
    "extensions"
})
public class HeartbeatNotificationStructure
    extends ProducerRequestEndpointStructure
{

    @XmlElement(name = "Status", defaultValue = "true")
    protected Boolean status;
    @XmlElement(name = "DataReady")
    protected Boolean dataReady;
    @XmlElement(name = "ErrorCondition")
    protected com.bliksemlabs.ojp.model.CheckStatusResponseBodyStructure.ErrorCondition errorCondition;
    @XmlElement(name = "ValidUntil", type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime validUntil;
    @XmlElement(name = "ShortestPossibleCycle", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration shortestPossibleCycle;
    @XmlElement(name = "ServiceStartedTime", type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime serviceStartedTime;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

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
     * Recupera il valore della proprietà dataReady.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDataReady() {
        return dataReady;
    }

    /**
     * Imposta il valore della proprietà dataReady.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDataReady(Boolean value) {
        this.dataReady = value;
    }

    /**
     * Recupera il valore della proprietà errorCondition.
     * 
     * @return
     *     possible object is
     *     {@link com.bliksemlabs.ojp.model.CheckStatusResponseBodyStructure.ErrorCondition }
     *     
     */
    public com.bliksemlabs.ojp.model.CheckStatusResponseBodyStructure.ErrorCondition getErrorCondition() {
        return errorCondition;
    }

    /**
     * Imposta il valore della proprietà errorCondition.
     * 
     * @param value
     *     allowed object is
     *     {@link com.bliksemlabs.ojp.model.CheckStatusResponseBodyStructure.ErrorCondition }
     *     
     */
    public void setErrorCondition(com.bliksemlabs.ojp.model.CheckStatusResponseBodyStructure.ErrorCondition value) {
        this.errorCondition = value;
    }

    /**
     * Recupera il valore della proprietà validUntil.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getValidUntil() {
        return validUntil;
    }

    /**
     * Imposta il valore della proprietà validUntil.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidUntil(LocalDateTime value) {
        this.validUntil = value;
    }

    /**
     * Recupera il valore della proprietà shortestPossibleCycle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getShortestPossibleCycle() {
        return shortestPossibleCycle;
    }

    /**
     * Imposta il valore della proprietà shortestPossibleCycle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortestPossibleCycle(Duration value) {
        this.shortestPossibleCycle = value;
    }

    /**
     * Recupera il valore della proprietà serviceStartedTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getServiceStartedTime() {
        return serviceStartedTime;
    }

    /**
     * Imposta il valore della proprietà serviceStartedTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceStartedTime(LocalDateTime value) {
        this.serviceStartedTime = value;
    }

    /**
     * Recupera il valore della proprietà extensions.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsStructure }
     *     
     */
    public ExtensionsStructure getExtensions() {
        return extensions;
    }

    /**
     * Imposta il valore della proprietà extensions.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsStructure }
     *     
     */
    public void setExtensions(ExtensionsStructure value) {
        this.extensions = value;
    }

    public HeartbeatNotificationStructure withStatus(Boolean value) {
        setStatus(value);
        return this;
    }

    public HeartbeatNotificationStructure withDataReady(Boolean value) {
        setDataReady(value);
        return this;
    }

    public HeartbeatNotificationStructure withErrorCondition(com.bliksemlabs.ojp.model.CheckStatusResponseBodyStructure.ErrorCondition value) {
        setErrorCondition(value);
        return this;
    }

    public HeartbeatNotificationStructure withValidUntil(LocalDateTime value) {
        setValidUntil(value);
        return this;
    }

    public HeartbeatNotificationStructure withShortestPossibleCycle(Duration value) {
        setShortestPossibleCycle(value);
        return this;
    }

    public HeartbeatNotificationStructure withServiceStartedTime(LocalDateTime value) {
        setServiceStartedTime(value);
        return this;
    }

    public HeartbeatNotificationStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public HeartbeatNotificationStructure withAddress(String value) {
        setAddress(value);
        return this;
    }

    @Override
    public HeartbeatNotificationStructure withProducerRef(ParticipantRefStructure value) {
        setProducerRef(value);
        return this;
    }

    @Override
    public HeartbeatNotificationStructure withMessageIdentifier(MessageQualifierStructure value) {
        setMessageIdentifier(value);
        return this;
    }

    @Override
    public HeartbeatNotificationStructure withDelegatorAddress(String value) {
        setDelegatorAddress(value);
        return this;
    }

    @Override
    public HeartbeatNotificationStructure withDelegatorRef(ParticipantRefStructure value) {
        setDelegatorRef(value);
        return this;
    }

    @Override
    public HeartbeatNotificationStructure withAccountId(String value) {
        setAccountId(value);
        return this;
    }

    @Override
    public HeartbeatNotificationStructure withAccountKey(String value) {
        setAccountKey(value);
        return this;
    }

    @Override
    public HeartbeatNotificationStructure withRequestTimestamp(LocalDateTime value) {
        setRequestTimestamp(value);
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

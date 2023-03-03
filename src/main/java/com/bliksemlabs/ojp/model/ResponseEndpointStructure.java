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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per ResponseEndpointStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ResponseEndpointStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}ResponseStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}ResponseEndpointGroup"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}DelegatorEndpointGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseEndpointStructure", propOrder = {
    "address",
    "responderRef",
    "requestMessageRef",
    "delegatorAddress",
    "delegatorRef"
})
@XmlSeeAlso({
    TerminateSubscriptionResponseStructure.class,
    SubscriptionResponseStructure.class
})
public class ResponseEndpointStructure
    extends ResponseStructure
{

    @XmlElement(name = "Address")
    @XmlSchemaType(name = "anyURI")
    protected String address;
    @XmlElement(name = "ResponderRef")
    protected ParticipantRefStructure responderRef;
    @XmlElement(name = "RequestMessageRef")
    protected MessageQualifierStructure requestMessageRef;
    @XmlElement(name = "DelegatorAddress")
    @XmlSchemaType(name = "anyURI")
    protected String delegatorAddress;
    @XmlElement(name = "DelegatorRef")
    protected ParticipantRefStructure delegatorRef;

    /**
     * Recupera il valore della proprietà address.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Imposta il valore della proprietà address.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Recupera il valore della proprietà responderRef.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantRefStructure }
     *     
     */
    public ParticipantRefStructure getResponderRef() {
        return responderRef;
    }

    /**
     * Imposta il valore della proprietà responderRef.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantRefStructure }
     *     
     */
    public void setResponderRef(ParticipantRefStructure value) {
        this.responderRef = value;
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
     * Recupera il valore della proprietà delegatorAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelegatorAddress() {
        return delegatorAddress;
    }

    /**
     * Imposta il valore della proprietà delegatorAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelegatorAddress(String value) {
        this.delegatorAddress = value;
    }

    /**
     * Recupera il valore della proprietà delegatorRef.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantRefStructure }
     *     
     */
    public ParticipantRefStructure getDelegatorRef() {
        return delegatorRef;
    }

    /**
     * Imposta il valore della proprietà delegatorRef.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantRefStructure }
     *     
     */
    public void setDelegatorRef(ParticipantRefStructure value) {
        this.delegatorRef = value;
    }

    public ResponseEndpointStructure withAddress(String value) {
        setAddress(value);
        return this;
    }

    public ResponseEndpointStructure withResponderRef(ParticipantRefStructure value) {
        setResponderRef(value);
        return this;
    }

    public ResponseEndpointStructure withRequestMessageRef(MessageQualifierStructure value) {
        setRequestMessageRef(value);
        return this;
    }

    public ResponseEndpointStructure withDelegatorAddress(String value) {
        setDelegatorAddress(value);
        return this;
    }

    public ResponseEndpointStructure withDelegatorRef(ParticipantRefStructure value) {
        setDelegatorRef(value);
        return this;
    }

    @Override
    public ResponseEndpointStructure withResponseTimestamp(LocalDateTime value) {
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

}

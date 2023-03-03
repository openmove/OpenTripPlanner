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
 * <p>Classe Java per ConsumerRequestEndpointStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ConsumerRequestEndpointStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}AuthenticatedRequestStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}ConsumerRequestEndpointGroup"/&gt;
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
@XmlType(name = "ConsumerRequestEndpointStructure", propOrder = {
    "address",
    "consumerRef",
    "messageIdentifier",
    "delegatorAddress",
    "delegatorRef"
})
@XmlSeeAlso({
    DataSupplyRequestStructure.class
})
public class ConsumerRequestEndpointStructure
    extends AuthenticatedRequestStructure
{

    @XmlElement(name = "Address")
    @XmlSchemaType(name = "anyURI")
    protected String address;
    @XmlElement(name = "ConsumerRef")
    protected ParticipantRefStructure consumerRef;
    @XmlElement(name = "MessageIdentifier")
    protected MessageQualifierStructure messageIdentifier;
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
     * Recupera il valore della proprietà consumerRef.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantRefStructure }
     *     
     */
    public ParticipantRefStructure getConsumerRef() {
        return consumerRef;
    }

    /**
     * Imposta il valore della proprietà consumerRef.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantRefStructure }
     *     
     */
    public void setConsumerRef(ParticipantRefStructure value) {
        this.consumerRef = value;
    }

    /**
     * Recupera il valore della proprietà messageIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link MessageQualifierStructure }
     *     
     */
    public MessageQualifierStructure getMessageIdentifier() {
        return messageIdentifier;
    }

    /**
     * Imposta il valore della proprietà messageIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageQualifierStructure }
     *     
     */
    public void setMessageIdentifier(MessageQualifierStructure value) {
        this.messageIdentifier = value;
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

    public ConsumerRequestEndpointStructure withAddress(String value) {
        setAddress(value);
        return this;
    }

    public ConsumerRequestEndpointStructure withConsumerRef(ParticipantRefStructure value) {
        setConsumerRef(value);
        return this;
    }

    public ConsumerRequestEndpointStructure withMessageIdentifier(MessageQualifierStructure value) {
        setMessageIdentifier(value);
        return this;
    }

    public ConsumerRequestEndpointStructure withDelegatorAddress(String value) {
        setDelegatorAddress(value);
        return this;
    }

    public ConsumerRequestEndpointStructure withDelegatorRef(ParticipantRefStructure value) {
        setDelegatorRef(value);
        return this;
    }

    @Override
    public ConsumerRequestEndpointStructure withAccountId(String value) {
        setAccountId(value);
        return this;
    }

    @Override
    public ConsumerRequestEndpointStructure withAccountKey(String value) {
        setAccountKey(value);
        return this;
    }

    @Override
    public ConsumerRequestEndpointStructure withRequestTimestamp(LocalDateTime value) {
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

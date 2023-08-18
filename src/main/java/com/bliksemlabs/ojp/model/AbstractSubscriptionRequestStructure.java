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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import de.vdv.ojp.AbstractOJPSubscriptionRequestStructure;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per AbstractSubscriptionRequestStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AbstractSubscriptionRequestStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}RequestStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}SubscriberEndpointGroup"/&gt;
 *         &lt;element name="SubscriptionContext" type="{http://www.siri.org.uk/siri}SubscriptionContextStructure" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractSubscriptionRequestStructure", propOrder = {
    "consumerAddress",
    "subscriptionFilterIdentifier",
    "subscriptionContext"
})
@XmlSeeAlso({
    AbstractOJPSubscriptionRequestStructure.class,
    SubscriptionRequestStructure.class
})
public abstract class AbstractSubscriptionRequestStructure
    extends RequestStructure
{

    @XmlElement(name = "ConsumerAddress")
    @XmlSchemaType(name = "anyURI")
    protected String consumerAddress;
    @XmlElement(name = "SubscriptionFilterIdentifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String subscriptionFilterIdentifier;
    @XmlElement(name = "SubscriptionContext")
    protected SubscriptionContextStructure subscriptionContext;

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
     * Recupera il valore della proprietà subscriptionFilterIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionFilterIdentifier() {
        return subscriptionFilterIdentifier;
    }

    /**
     * Imposta il valore della proprietà subscriptionFilterIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionFilterIdentifier(String value) {
        this.subscriptionFilterIdentifier = value;
    }

    /**
     * Recupera il valore della proprietà subscriptionContext.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionContextStructure }
     *     
     */
    public SubscriptionContextStructure getSubscriptionContext() {
        return subscriptionContext;
    }

    /**
     * Imposta il valore della proprietà subscriptionContext.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionContextStructure }
     *     
     */
    public void setSubscriptionContext(SubscriptionContextStructure value) {
        this.subscriptionContext = value;
    }

    public AbstractSubscriptionRequestStructure withConsumerAddress(String value) {
        setConsumerAddress(value);
        return this;
    }

    public AbstractSubscriptionRequestStructure withSubscriptionFilterIdentifier(String value) {
        setSubscriptionFilterIdentifier(value);
        return this;
    }

    public AbstractSubscriptionRequestStructure withSubscriptionContext(SubscriptionContextStructure value) {
        setSubscriptionContext(value);
        return this;
    }

    @Override
    public AbstractSubscriptionRequestStructure withAddress(String value) {
        setAddress(value);
        return this;
    }

    @Override
    public AbstractSubscriptionRequestStructure withRequestorRef(ParticipantRefStructure value) {
        setRequestorRef(value);
        return this;
    }

    @Override
    public AbstractSubscriptionRequestStructure withMessageIdentifier(MessageQualifierStructure value) {
        setMessageIdentifier(value);
        return this;
    }

    @Override
    public AbstractSubscriptionRequestStructure withDelegatorAddress(String value) {
        setDelegatorAddress(value);
        return this;
    }

    @Override
    public AbstractSubscriptionRequestStructure withDelegatorRef(ParticipantRefStructure value) {
        setDelegatorRef(value);
        return this;
    }

    @Override
    public AbstractSubscriptionRequestStructure withAccountId(String value) {
        setAccountId(value);
        return this;
    }

    @Override
    public AbstractSubscriptionRequestStructure withAccountKey(String value) {
        setAccountKey(value);
        return this;
    }

    @Override
    public AbstractSubscriptionRequestStructure withRequestTimestamp(LocalDateTime value) {
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

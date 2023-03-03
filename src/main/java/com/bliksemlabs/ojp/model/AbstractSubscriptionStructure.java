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
 * <p>Classe Java per AbstractSubscriptionStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AbstractSubscriptionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}SubscriptionIdentityGroup"/&gt;
 *         &lt;element name="InitialTerminationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractSubscriptionStructure", propOrder = {
    "subscriberRef",
    "subscriptionIdentifier",
    "initialTerminationTime"
})
public abstract class AbstractSubscriptionStructure {

    @XmlElement(name = "SubscriberRef")
    protected ParticipantRefStructure subscriberRef;
    @XmlElement(name = "SubscriptionIdentifier", required = true)
    protected SubscriptionQualifierStructure subscriptionIdentifier;
    @XmlElement(name = "InitialTerminationTime", required = true, type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime initialTerminationTime;

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
     * Recupera il valore della proprietà subscriptionIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionQualifierStructure }
     *     
     */
    public SubscriptionQualifierStructure getSubscriptionIdentifier() {
        return subscriptionIdentifier;
    }

    /**
     * Imposta il valore della proprietà subscriptionIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionQualifierStructure }
     *     
     */
    public void setSubscriptionIdentifier(SubscriptionQualifierStructure value) {
        this.subscriptionIdentifier = value;
    }

    /**
     * Recupera il valore della proprietà initialTerminationTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getInitialTerminationTime() {
        return initialTerminationTime;
    }

    /**
     * Imposta il valore della proprietà initialTerminationTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitialTerminationTime(LocalDateTime value) {
        this.initialTerminationTime = value;
    }

    public AbstractSubscriptionStructure withSubscriberRef(ParticipantRefStructure value) {
        setSubscriberRef(value);
        return this;
    }

    public AbstractSubscriptionStructure withSubscriptionIdentifier(SubscriptionQualifierStructure value) {
        setSubscriptionIdentifier(value);
        return this;
    }

    public AbstractSubscriptionStructure withInitialTerminationTime(LocalDateTime value) {
        setInitialTerminationTime(value);
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

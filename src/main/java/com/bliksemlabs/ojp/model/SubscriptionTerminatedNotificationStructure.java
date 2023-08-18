//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package com.bliksemlabs.ojp.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per SubscriptionTerminatedNotificationStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SubscriptionTerminatedNotificationStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}ProducerResponseStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}SubscriptionIdentifierResourcePropertyGroup" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Description" type="{http://www.siri.org.uk/siri}ErrorDescriptionStructure" minOccurs="0"/&gt;
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
@XmlType(name = "SubscriptionTerminatedNotificationStructure", propOrder = {
    "subscriptionIdentifierResourcePropertyGroup",
    "description",
    "extensions"
})
public class SubscriptionTerminatedNotificationStructure
    extends ProducerResponseStructure
{

    @XmlElements({
        @XmlElement(name = "SubscriberRef", required = true, type = ParticipantRefStructure.class),
        @XmlElement(name = "SubscriptionFilterRef", required = true, type = SubscriptionFilterRefStructure.class),
        @XmlElement(name = "SubscriptionRef", required = true, type = SubscriptionQualifierStructure.class)
    })
    protected List<Object> subscriptionIdentifierResourcePropertyGroup;
    @XmlElement(name = "Description")
    protected ErrorDescriptionStructure description;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Gets the value of the subscriptionIdentifierResourcePropertyGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscriptionIdentifierResourcePropertyGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscriptionIdentifierResourcePropertyGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParticipantRefStructure }
     * {@link SubscriptionFilterRefStructure }
     * {@link SubscriptionQualifierStructure }
     * 
     * 
     */
    public List<Object> getSubscriptionIdentifierResourcePropertyGroup() {
        if (subscriptionIdentifierResourcePropertyGroup == null) {
            subscriptionIdentifierResourcePropertyGroup = new ArrayList<Object>();
        }
        return this.subscriptionIdentifierResourcePropertyGroup;
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

    public SubscriptionTerminatedNotificationStructure withSubscriptionIdentifierResourcePropertyGroup(Object... values) {
        if (values!= null) {
            for (Object value: values) {
                getSubscriptionIdentifierResourcePropertyGroup().add(value);
            }
        }
        return this;
    }

    public SubscriptionTerminatedNotificationStructure withSubscriptionIdentifierResourcePropertyGroup(Collection<Object> values) {
        if (values!= null) {
            getSubscriptionIdentifierResourcePropertyGroup().addAll(values);
        }
        return this;
    }

    public SubscriptionTerminatedNotificationStructure withDescription(ErrorDescriptionStructure value) {
        setDescription(value);
        return this;
    }

    public SubscriptionTerminatedNotificationStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public SubscriptionTerminatedNotificationStructure withProducerRef(ParticipantRefStructure value) {
        setProducerRef(value);
        return this;
    }

    @Override
    public SubscriptionTerminatedNotificationStructure withAddress(String value) {
        setAddress(value);
        return this;
    }

    @Override
    public SubscriptionTerminatedNotificationStructure withResponseMessageIdentifier(MessageQualifierStructure value) {
        setResponseMessageIdentifier(value);
        return this;
    }

    @Override
    public SubscriptionTerminatedNotificationStructure withRequestMessageRef(MessageRefStructure value) {
        setRequestMessageRef(value);
        return this;
    }

    @Override
    public SubscriptionTerminatedNotificationStructure withDelegatorAddress(String value) {
        setDelegatorAddress(value);
        return this;
    }

    @Override
    public SubscriptionTerminatedNotificationStructure withDelegatorRef(ParticipantRefStructure value) {
        setDelegatorRef(value);
        return this;
    }

    @Override
    public SubscriptionTerminatedNotificationStructure withResponseTimestamp(LocalDateTime value) {
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

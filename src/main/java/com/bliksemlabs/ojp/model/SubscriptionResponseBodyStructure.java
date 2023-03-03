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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.LocalDateTimeISO8601XmlAdapter;


/**
 * <p>Classe Java per SubscriptionResponseBodyStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SubscriptionResponseBodyStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}ResponseStatus" maxOccurs="unbounded"/&gt;
 *         &lt;element name="SubscriptionManagerAddress" type="{http://www.siri.org.uk/siri}EndpointAddress" minOccurs="0"/&gt;
 *         &lt;element name="ServiceStartedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionResponseBodyStructure", propOrder = {
    "responseStatus",
    "subscriptionManagerAddress",
    "serviceStartedTime"
})
public class SubscriptionResponseBodyStructure {

    @XmlElement(name = "ResponseStatus", required = true)
    protected List<StatusResponseStructure> responseStatus;
    @XmlElement(name = "SubscriptionManagerAddress")
    @XmlSchemaType(name = "anyURI")
    protected String subscriptionManagerAddress;
    @XmlElement(name = "ServiceStartedTime", type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime serviceStartedTime;

    /**
     * Gets the value of the responseStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responseStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponseStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusResponseStructure }
     * 
     * 
     */
    public List<StatusResponseStructure> getResponseStatus() {
        if (responseStatus == null) {
            responseStatus = new ArrayList<StatusResponseStructure>();
        }
        return this.responseStatus;
    }

    /**
     * Recupera il valore della proprietà subscriptionManagerAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionManagerAddress() {
        return subscriptionManagerAddress;
    }

    /**
     * Imposta il valore della proprietà subscriptionManagerAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionManagerAddress(String value) {
        this.subscriptionManagerAddress = value;
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

    public SubscriptionResponseBodyStructure withResponseStatus(StatusResponseStructure... values) {
        if (values!= null) {
            for (StatusResponseStructure value: values) {
                getResponseStatus().add(value);
            }
        }
        return this;
    }

    public SubscriptionResponseBodyStructure withResponseStatus(Collection<StatusResponseStructure> values) {
        if (values!= null) {
            getResponseStatus().addAll(values);
        }
        return this;
    }

    public SubscriptionResponseBodyStructure withSubscriptionManagerAddress(String value) {
        setSubscriptionManagerAddress(value);
        return this;
    }

    public SubscriptionResponseBodyStructure withServiceStartedTime(LocalDateTime value) {
        setServiceStartedTime(value);
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

//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package com.bliksemlabs.ojp.model;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per UnknownSubscriptionErrorStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="UnknownSubscriptionErrorStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}ErrorCodeStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubscriptionCode" type="{http://www.siri.org.uk/siri}SubscriptionQualifierStructure" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnknownSubscriptionErrorStructure", propOrder = {
    "subscriptionCode"
})
public class UnknownSubscriptionErrorStructure
    extends ErrorCodeStructure
{

    @XmlElement(name = "SubscriptionCode")
    protected SubscriptionQualifierStructure subscriptionCode;

    /**
     * Recupera il valore della proprietà subscriptionCode.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionQualifierStructure }
     *     
     */
    public SubscriptionQualifierStructure getSubscriptionCode() {
        return subscriptionCode;
    }

    /**
     * Imposta il valore della proprietà subscriptionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionQualifierStructure }
     *     
     */
    public void setSubscriptionCode(SubscriptionQualifierStructure value) {
        this.subscriptionCode = value;
    }

    public UnknownSubscriptionErrorStructure withSubscriptionCode(SubscriptionQualifierStructure value) {
        setSubscriptionCode(value);
        return this;
    }

    @Override
    public UnknownSubscriptionErrorStructure withErrorText(String value) {
        setErrorText(value);
        return this;
    }

    @Override
    public UnknownSubscriptionErrorStructure withNumber(BigInteger value) {
        setNumber(value);
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

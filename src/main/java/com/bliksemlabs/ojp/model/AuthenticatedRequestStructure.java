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
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per AuthenticatedRequestStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AuthenticatedRequestStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractRequestStructure"&gt;
 *       &lt;group ref="{http://www.siri.org.uk/siri}AuthenticatedRequestGroup"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthenticatedRequestStructure", propOrder = {
    "accountId",
    "accountKey"
})
@XmlSeeAlso({
    TerminateSubscriptionRequestStructure.class,
    ProducerRequestEndpointStructure.class,
    ConsumerRequestEndpointStructure.class,
    RequestStructure.class
})
public abstract class AuthenticatedRequestStructure
    extends AbstractRequestStructure
{

    @XmlElement(name = "AccountId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String accountId;
    @XmlElement(name = "AccountKey")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String accountKey;

    /**
     * Recupera il valore della proprietà accountId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Imposta il valore della proprietà accountId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountId(String value) {
        this.accountId = value;
    }

    /**
     * Recupera il valore della proprietà accountKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountKey() {
        return accountKey;
    }

    /**
     * Imposta il valore della proprietà accountKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountKey(String value) {
        this.accountKey = value;
    }

    public AuthenticatedRequestStructure withAccountId(String value) {
        setAccountId(value);
        return this;
    }

    public AuthenticatedRequestStructure withAccountKey(String value) {
        setAccountKey(value);
        return this;
    }

    @Override
    public AuthenticatedRequestStructure withRequestTimestamp(LocalDateTime value) {
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

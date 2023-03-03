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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per ErrorCodeStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ErrorCodeStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ErrorText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="number" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorCodeStructure", propOrder = {
    "errorText"
})
@XmlSeeAlso({
    UnapprovedKeyAccessStructure.class,
    UnknownParticipantErrorStructure.class,
    UnknownEndpointErrorStructure.class,
    EndpointDeniedAccessStructure.class,
    EndpointNotAvailableAccessStructure.class,
    ServiceNotAvailableErrorStructure.class,
    CapabilityNotSupportedErrorStructure.class,
    BeyondDataHorizonErrorStructure.class,
    AccessNotAllowedErrorStructure.class,
    NoInfoForTopicErrorStructure.class,
    InvalidDataReferencesErrorStructure.class,
    ParametersIgnoredErrorStructure.class,
    UnknownExtensionsErrorStructure.class,
    AllowedResourceUsageExceededErrorStructure.class,
    UnknownSubscriberErrorStructure.class,
    UnknownSubscriptionErrorStructure.class,
    OtherErrorStructure.class
})
public class ErrorCodeStructure {

    @XmlElement(name = "ErrorText")
    protected String errorText;
    @XmlAttribute(name = "number")
    protected BigInteger number;

    /**
     * Recupera il valore della proprietà errorText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorText() {
        return errorText;
    }

    /**
     * Imposta il valore della proprietà errorText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorText(String value) {
        this.errorText = value;
    }

    /**
     * Recupera il valore della proprietà number.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumber() {
        return number;
    }

    /**
     * Imposta il valore della proprietà number.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumber(BigInteger value) {
        this.number = value;
    }

    public ErrorCodeStructure withErrorText(String value) {
        setErrorText(value);
        return this;
    }

    public ErrorCodeStructure withNumber(BigInteger value) {
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

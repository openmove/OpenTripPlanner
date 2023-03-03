//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package com.bliksemlabs.ojp.model;

import java.math.BigInteger;
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
 * <p>Classe Java per ServiceNotAvailableErrorStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ServiceNotAvailableErrorStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}ErrorCodeStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExpectedRestartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceNotAvailableErrorStructure", propOrder = {
    "expectedRestartTime"
})
public class ServiceNotAvailableErrorStructure
    extends ErrorCodeStructure
{

    @XmlElement(name = "ExpectedRestartTime", type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime expectedRestartTime;

    /**
     * Recupera il valore della proprietà expectedRestartTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getExpectedRestartTime() {
        return expectedRestartTime;
    }

    /**
     * Imposta il valore della proprietà expectedRestartTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpectedRestartTime(LocalDateTime value) {
        this.expectedRestartTime = value;
    }

    public ServiceNotAvailableErrorStructure withExpectedRestartTime(LocalDateTime value) {
        setExpectedRestartTime(value);
        return this;
    }

    @Override
    public ServiceNotAvailableErrorStructure withErrorText(String value) {
        setErrorText(value);
        return this;
    }

    @Override
    public ServiceNotAvailableErrorStructure withNumber(BigInteger value) {
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

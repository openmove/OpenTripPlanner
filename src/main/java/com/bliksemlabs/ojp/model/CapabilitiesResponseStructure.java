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
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per CapabilitiesResponseStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CapabilitiesResponseStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}ProducerResponseStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}AbstractFunctionalServiceCapabilitiesResponse"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilitiesResponseStructure", propOrder = {
    "abstractFunctionalServiceCapabilitiesResponse"
})
public class CapabilitiesResponseStructure
    extends ProducerResponseStructure
{

    @XmlElement(name = "AbstractFunctionalServiceCapabilitiesResponse", required = true)
    protected AbstractServiceCapabilitiesResponseStructure abstractFunctionalServiceCapabilitiesResponse;

    /**
     * Recupera il valore della proprietà abstractFunctionalServiceCapabilitiesResponse.
     * 
     * @return
     *     possible object is
     *     {@link AbstractServiceCapabilitiesResponseStructure }
     *     
     */
    public AbstractServiceCapabilitiesResponseStructure getAbstractFunctionalServiceCapabilitiesResponse() {
        return abstractFunctionalServiceCapabilitiesResponse;
    }

    /**
     * Imposta il valore della proprietà abstractFunctionalServiceCapabilitiesResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractServiceCapabilitiesResponseStructure }
     *     
     */
    public void setAbstractFunctionalServiceCapabilitiesResponse(AbstractServiceCapabilitiesResponseStructure value) {
        this.abstractFunctionalServiceCapabilitiesResponse = value;
    }

    public CapabilitiesResponseStructure withAbstractFunctionalServiceCapabilitiesResponse(AbstractServiceCapabilitiesResponseStructure value) {
        setAbstractFunctionalServiceCapabilitiesResponse(value);
        return this;
    }

    @Override
    public CapabilitiesResponseStructure withProducerRef(ParticipantRefStructure value) {
        setProducerRef(value);
        return this;
    }

    @Override
    public CapabilitiesResponseStructure withAddress(String value) {
        setAddress(value);
        return this;
    }

    @Override
    public CapabilitiesResponseStructure withResponseMessageIdentifier(MessageQualifierStructure value) {
        setResponseMessageIdentifier(value);
        return this;
    }

    @Override
    public CapabilitiesResponseStructure withRequestMessageRef(MessageRefStructure value) {
        setRequestMessageRef(value);
        return this;
    }

    @Override
    public CapabilitiesResponseStructure withDelegatorAddress(String value) {
        setDelegatorAddress(value);
        return this;
    }

    @Override
    public CapabilitiesResponseStructure withDelegatorRef(ParticipantRefStructure value) {
        setDelegatorRef(value);
        return this;
    }

    @Override
    public CapabilitiesResponseStructure withResponseTimestamp(LocalDateTime value) {
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

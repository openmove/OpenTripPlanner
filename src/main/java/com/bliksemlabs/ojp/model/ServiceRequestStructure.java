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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per ServiceRequestStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ServiceRequestStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}ContextualisedRequestStructure"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceRequestStructure")
@XmlSeeAlso({
    ServiceRequest.class
})
public class ServiceRequestStructure
    extends ContextualisedRequestStructure
{


    @Override
    public ServiceRequestStructure withServiceRequestContext(ServiceRequestContextStructure value) {
        setServiceRequestContext(value);
        return this;
    }

    @Override
    public ServiceRequestStructure withRequestTimestamp(LocalDateTime value) {
        setRequestTimestamp(value);
        return this;
    }

    @Override
    public ServiceRequestStructure withAccountId(String value) {
        setAccountId(value);
        return this;
    }

    @Override
    public ServiceRequestStructure withAccountKey(String value) {
        setAccountKey(value);
        return this;
    }

    @Override
    public ServiceRequestStructure withAddress(String value) {
        setAddress(value);
        return this;
    }

    @Override
    public ServiceRequestStructure withRequestorRef(ParticipantRefStructure value) {
        setRequestorRef(value);
        return this;
    }

    @Override
    public ServiceRequestStructure withMessageIdentifier(MessageQualifierStructure value) {
        setMessageIdentifier(value);
        return this;
    }

    @Override
    public ServiceRequestStructure withDelegatorAddress(String value) {
        setDelegatorAddress(value);
        return this;
    }

    @Override
    public ServiceRequestStructure withDelegatorRef(ParticipantRefStructure value) {
        setDelegatorRef(value);
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

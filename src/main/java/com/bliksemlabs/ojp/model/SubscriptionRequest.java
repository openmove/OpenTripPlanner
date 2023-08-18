//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package com.bliksemlabs.ojp.model;

import java.time.LocalDateTime;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}SubscriptionRequestStructure"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "SubscriptionRequest")
public class SubscriptionRequest
    extends SubscriptionRequestStructure
{


    @Override
    public SubscriptionRequest withAbstractFunctionalServiceSubscriptionRequest(AbstractSubscriptionStructure... values) {
        if (values!= null) {
            for (AbstractSubscriptionStructure value: values) {
                getAbstractFunctionalServiceSubscriptionRequest().add(value);
            }
        }
        return this;
    }

    @Override
    public SubscriptionRequest withAbstractFunctionalServiceSubscriptionRequest(Collection<AbstractSubscriptionStructure> values) {
        if (values!= null) {
            getAbstractFunctionalServiceSubscriptionRequest().addAll(values);
        }
        return this;
    }

    @Override
    public SubscriptionRequest withConsumerAddress(String value) {
        setConsumerAddress(value);
        return this;
    }

    @Override
    public SubscriptionRequest withSubscriptionFilterIdentifier(String value) {
        setSubscriptionFilterIdentifier(value);
        return this;
    }

    @Override
    public SubscriptionRequest withSubscriptionContext(SubscriptionContextStructure value) {
        setSubscriptionContext(value);
        return this;
    }

    @Override
    public SubscriptionRequest withAddress(String value) {
        setAddress(value);
        return this;
    }

    @Override
    public SubscriptionRequest withRequestorRef(ParticipantRefStructure value) {
        setRequestorRef(value);
        return this;
    }

    @Override
    public SubscriptionRequest withMessageIdentifier(MessageQualifierStructure value) {
        setMessageIdentifier(value);
        return this;
    }

    @Override
    public SubscriptionRequest withDelegatorAddress(String value) {
        setDelegatorAddress(value);
        return this;
    }

    @Override
    public SubscriptionRequest withDelegatorRef(ParticipantRefStructure value) {
        setDelegatorRef(value);
        return this;
    }

    @Override
    public SubscriptionRequest withAccountId(String value) {
        setAccountId(value);
        return this;
    }

    @Override
    public SubscriptionRequest withAccountKey(String value) {
        setAccountKey(value);
        return this;
    }

    @Override
    public SubscriptionRequest withRequestTimestamp(LocalDateTime value) {
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

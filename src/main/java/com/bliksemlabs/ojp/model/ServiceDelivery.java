//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package com.bliksemlabs.ojp.model;

import java.time.LocalDateTime;
import java.util.Collection;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *     &lt;extension base="{http://www.siri.org.uk/siri}ServiceDeliveryStructure"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class ServiceDelivery
    extends ServiceDeliveryStructure
{


    @Override
    public ServiceDelivery withStatus(Boolean value) {
        setStatus(value);
        return this;
    }

    @Override
    public ServiceDelivery withErrorCondition(com.bliksemlabs.ojp.model.ServiceDeliveryBodyStructure.ErrorCondition value) {
        setErrorCondition(value);
        return this;
    }

    @Override
    public ServiceDelivery withMoreData(Boolean value) {
        setMoreData(value);
        return this;
    }

    @Override
    public ServiceDelivery withAbstractFunctionalServiceDelivery(JAXBElement<? extends AbstractServiceDeliveryStructure> ... values) {
        if (values!= null) {
            for (JAXBElement<? extends AbstractServiceDeliveryStructure> value: values) {
                getAbstractFunctionalServiceDelivery().add(value);
            }
        }
        return this;
    }

    @Override
    public ServiceDelivery withAbstractFunctionalServiceDelivery(Collection<JAXBElement<? extends AbstractServiceDeliveryStructure>> values) {
        if (values!= null) {
            getAbstractFunctionalServiceDelivery().addAll(values);
        }
        return this;
    }

    @Override
    public ServiceDelivery withSrsName(String value) {
        setSrsName(value);
        return this;
    }

    @Override
    public ServiceDelivery withProducerRef(ParticipantRefStructure value) {
        setProducerRef(value);
        return this;
    }

    @Override
    public ServiceDelivery withAddress(String value) {
        setAddress(value);
        return this;
    }

    @Override
    public ServiceDelivery withResponseMessageIdentifier(MessageQualifierStructure value) {
        setResponseMessageIdentifier(value);
        return this;
    }

    @Override
    public ServiceDelivery withRequestMessageRef(MessageRefStructure value) {
        setRequestMessageRef(value);
        return this;
    }

    @Override
    public ServiceDelivery withDelegatorAddress(String value) {
        setDelegatorAddress(value);
        return this;
    }

    @Override
    public ServiceDelivery withDelegatorRef(ParticipantRefStructure value) {
        setDelegatorRef(value);
        return this;
    }

    @Override
    public ServiceDelivery withResponseTimestamp(LocalDateTime value) {
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

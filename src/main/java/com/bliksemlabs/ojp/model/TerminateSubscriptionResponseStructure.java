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
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per TerminateSubscriptionResponseStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TerminateSubscriptionResponseStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}ResponseEndpointStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}TerminationStatusGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminateSubscriptionResponseStructure", propOrder = {
    "terminationResponseStatus"
})
public class TerminateSubscriptionResponseStructure
    extends ResponseEndpointStructure
{

    @XmlElement(name = "TerminationResponseStatus")
    protected List<TerminationResponseStatusStructure> terminationResponseStatus;

    /**
     * Gets the value of the terminationResponseStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the terminationResponseStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTerminationResponseStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TerminationResponseStatusStructure }
     * 
     * 
     */
    public List<TerminationResponseStatusStructure> getTerminationResponseStatus() {
        if (terminationResponseStatus == null) {
            terminationResponseStatus = new ArrayList<TerminationResponseStatusStructure>();
        }
        return this.terminationResponseStatus;
    }

    public TerminateSubscriptionResponseStructure withTerminationResponseStatus(TerminationResponseStatusStructure... values) {
        if (values!= null) {
            for (TerminationResponseStatusStructure value: values) {
                getTerminationResponseStatus().add(value);
            }
        }
        return this;
    }

    public TerminateSubscriptionResponseStructure withTerminationResponseStatus(Collection<TerminationResponseStatusStructure> values) {
        if (values!= null) {
            getTerminationResponseStatus().addAll(values);
        }
        return this;
    }

    @Override
    public TerminateSubscriptionResponseStructure withAddress(String value) {
        setAddress(value);
        return this;
    }

    @Override
    public TerminateSubscriptionResponseStructure withResponderRef(ParticipantRefStructure value) {
        setResponderRef(value);
        return this;
    }

    @Override
    public TerminateSubscriptionResponseStructure withRequestMessageRef(MessageQualifierStructure value) {
        setRequestMessageRef(value);
        return this;
    }

    @Override
    public TerminateSubscriptionResponseStructure withDelegatorAddress(String value) {
        setDelegatorAddress(value);
        return this;
    }

    @Override
    public TerminateSubscriptionResponseStructure withDelegatorRef(ParticipantRefStructure value) {
        setDelegatorRef(value);
        return this;
    }

    @Override
    public TerminateSubscriptionResponseStructure withResponseTimestamp(LocalDateTime value) {
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

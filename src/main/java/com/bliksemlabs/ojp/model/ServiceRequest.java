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
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import de.vdv.ojp.OJPExchangePointsRequestStructure;
import de.vdv.ojp.OJPFareRequestStructure;
import de.vdv.ojp.OJPLocationInformationRequestStructure;
import de.vdv.ojp.OJPMultiPointTripRequestStructure;
import de.vdv.ojp.OJPStopEventRequestStructure;
import de.vdv.ojp.OJPTripInfoRequestStructure;
import de.vdv.ojp.OJPTripRequestStructure;
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
 *     &lt;extension base="{http://www.siri.org.uk/siri}ServiceRequestStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}AbstractFunctionalServiceRequest" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "abstractFunctionalServiceRequest"
})
@XmlRootElement(name = "ServiceRequest")
public class ServiceRequest
    extends ServiceRequestStructure
{

    @XmlElementRef(name = "AbstractFunctionalServiceRequest", namespace = "http://www.siri.org.uk/siri", type = JAXBElement.class)
    protected List<JAXBElement<? extends AbstractFunctionalServiceRequestStructure>> abstractFunctionalServiceRequest;

    /**
     * Gets the value of the abstractFunctionalServiceRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abstractFunctionalServiceRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbstractFunctionalServiceRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link OJPMultiPointTripRequestStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OJPTripRequestStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OJPFareRequestStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OJPLocationInformationRequestStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OJPTripInfoRequestStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OJPStopEventRequestStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractFunctionalServiceRequestStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OJPExchangePointsRequestStructure }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends AbstractFunctionalServiceRequestStructure>> getAbstractFunctionalServiceRequest() {
        if (abstractFunctionalServiceRequest == null) {
            abstractFunctionalServiceRequest = new ArrayList<JAXBElement<? extends AbstractFunctionalServiceRequestStructure>>();
        }
        return this.abstractFunctionalServiceRequest;
    }

    public ServiceRequest withAbstractFunctionalServiceRequest(JAXBElement<? extends AbstractFunctionalServiceRequestStructure> ... values) {
        if (values!= null) {
            for (JAXBElement<? extends AbstractFunctionalServiceRequestStructure> value: values) {
                getAbstractFunctionalServiceRequest().add(value);
            }
        }
        return this;
    }

    public ServiceRequest withAbstractFunctionalServiceRequest(Collection<JAXBElement<? extends AbstractFunctionalServiceRequestStructure>> values) {
        if (values!= null) {
            getAbstractFunctionalServiceRequest().addAll(values);
        }
        return this;
    }

    @Override
    public ServiceRequest withServiceRequestContext(ServiceRequestContextStructure value) {
        setServiceRequestContext(value);
        return this;
    }

    @Override
    public ServiceRequest withRequestTimestamp(LocalDateTime value) {
        setRequestTimestamp(value);
        return this;
    }

    @Override
    public ServiceRequest withAccountId(String value) {
        setAccountId(value);
        return this;
    }

    @Override
    public ServiceRequest withAccountKey(String value) {
        setAccountKey(value);
        return this;
    }

    @Override
    public ServiceRequest withAddress(String value) {
        setAddress(value);
        return this;
    }

    @Override
    public ServiceRequest withRequestorRef(ParticipantRefStructure value) {
        setRequestorRef(value);
        return this;
    }

    @Override
    public ServiceRequest withMessageIdentifier(MessageQualifierStructure value) {
        setMessageIdentifier(value);
        return this;
    }

    @Override
    public ServiceRequest withDelegatorAddress(String value) {
        setDelegatorAddress(value);
        return this;
    }

    @Override
    public ServiceRequest withDelegatorRef(ParticipantRefStructure value) {
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

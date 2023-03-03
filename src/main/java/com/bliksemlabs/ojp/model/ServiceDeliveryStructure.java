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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import de.vdv.ojp.OJPExchangePointsDeliveryStructure;
import de.vdv.ojp.OJPFareDeliveryStructure;
import de.vdv.ojp.OJPLocationInformationDeliveryStructure;
import de.vdv.ojp.OJPMultiPointTripDeliveryStructure;
import de.vdv.ojp.OJPStopEventDeliveryStructure;
import de.vdv.ojp.OJPTripDeliveryStructure;
import de.vdv.ojp.OJPTripInfoDeliveryStructure;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per ServiceDeliveryStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ServiceDeliveryStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}ProducerResponseStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}ServiceDeliveryBodyGroup"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="srsName" type="{http://www.siri.org.uk/siri}SrsNameType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceDeliveryStructure", propOrder = {
    "status",
    "errorCondition",
    "moreData",
    "abstractFunctionalServiceDelivery"
})
@XmlSeeAlso({
    ServiceDelivery.class
})
public class ServiceDeliveryStructure
    extends ProducerResponseStructure
{

    @XmlElement(name = "Status", defaultValue = "true")
    protected Boolean status;
    @XmlElement(name = "ErrorCondition")
    protected com.bliksemlabs.ojp.model.ServiceDeliveryBodyStructure.ErrorCondition errorCondition;
    @XmlElement(name = "MoreData", defaultValue = "false")
    protected Boolean moreData;
    @XmlElementRef(name = "AbstractFunctionalServiceDelivery", namespace = "http://www.siri.org.uk/siri", type = JAXBElement.class)
    protected List<JAXBElement<? extends AbstractServiceDeliveryStructure>> abstractFunctionalServiceDelivery;
    @XmlAttribute(name = "srsName")
    protected String srsName;

    /**
     * Recupera il valore della proprietà status.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStatus() {
        return status;
    }

    /**
     * Imposta il valore della proprietà status.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStatus(Boolean value) {
        this.status = value;
    }

    /**
     * Recupera il valore della proprietà errorCondition.
     * 
     * @return
     *     possible object is
     *     {@link com.bliksemlabs.ojp.model.ServiceDeliveryBodyStructure.ErrorCondition }
     *     
     */
    public com.bliksemlabs.ojp.model.ServiceDeliveryBodyStructure.ErrorCondition getErrorCondition() {
        return errorCondition;
    }

    /**
     * Imposta il valore della proprietà errorCondition.
     * 
     * @param value
     *     allowed object is
     *     {@link com.bliksemlabs.ojp.model.ServiceDeliveryBodyStructure.ErrorCondition }
     *     
     */
    public void setErrorCondition(com.bliksemlabs.ojp.model.ServiceDeliveryBodyStructure.ErrorCondition value) {
        this.errorCondition = value;
    }

    /**
     * Recupera il valore della proprietà moreData.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMoreData() {
        return moreData;
    }

    /**
     * Imposta il valore della proprietà moreData.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMoreData(Boolean value) {
        this.moreData = value;
    }

    /**
     * Gets the value of the abstractFunctionalServiceDelivery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abstractFunctionalServiceDelivery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbstractFunctionalServiceDelivery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link OJPLocationInformationDeliveryStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractServiceDeliveryStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OJPTripDeliveryStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OJPStopEventDeliveryStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OJPExchangePointsDeliveryStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OJPMultiPointTripDeliveryStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OJPFareDeliveryStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OJPTripInfoDeliveryStructure }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends AbstractServiceDeliveryStructure>> getAbstractFunctionalServiceDelivery() {
        if (abstractFunctionalServiceDelivery == null) {
            abstractFunctionalServiceDelivery = new ArrayList<JAXBElement<? extends AbstractServiceDeliveryStructure>>();
        }
        return this.abstractFunctionalServiceDelivery;
    }

    /**
     * Recupera il valore della proprietà srsName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrsName() {
        return srsName;
    }

    /**
     * Imposta il valore della proprietà srsName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrsName(String value) {
        this.srsName = value;
    }

    public ServiceDeliveryStructure withStatus(Boolean value) {
        setStatus(value);
        return this;
    }

    public ServiceDeliveryStructure withErrorCondition(com.bliksemlabs.ojp.model.ServiceDeliveryBodyStructure.ErrorCondition value) {
        setErrorCondition(value);
        return this;
    }

    public ServiceDeliveryStructure withMoreData(Boolean value) {
        setMoreData(value);
        return this;
    }

    public ServiceDeliveryStructure withAbstractFunctionalServiceDelivery(JAXBElement<? extends AbstractServiceDeliveryStructure> ... values) {
        if (values!= null) {
            for (JAXBElement<? extends AbstractServiceDeliveryStructure> value: values) {
                getAbstractFunctionalServiceDelivery().add(value);
            }
        }
        return this;
    }

    public ServiceDeliveryStructure withAbstractFunctionalServiceDelivery(Collection<JAXBElement<? extends AbstractServiceDeliveryStructure>> values) {
        if (values!= null) {
            getAbstractFunctionalServiceDelivery().addAll(values);
        }
        return this;
    }

    public ServiceDeliveryStructure withSrsName(String value) {
        setSrsName(value);
        return this;
    }

    @Override
    public ServiceDeliveryStructure withProducerRef(ParticipantRefStructure value) {
        setProducerRef(value);
        return this;
    }

    @Override
    public ServiceDeliveryStructure withAddress(String value) {
        setAddress(value);
        return this;
    }

    @Override
    public ServiceDeliveryStructure withResponseMessageIdentifier(MessageQualifierStructure value) {
        setResponseMessageIdentifier(value);
        return this;
    }

    @Override
    public ServiceDeliveryStructure withRequestMessageRef(MessageRefStructure value) {
        setRequestMessageRef(value);
        return this;
    }

    @Override
    public ServiceDeliveryStructure withDelegatorAddress(String value) {
        setDelegatorAddress(value);
        return this;
    }

    @Override
    public ServiceDeliveryStructure withDelegatorRef(ParticipantRefStructure value) {
        setDelegatorRef(value);
        return this;
    }

    @Override
    public ServiceDeliveryStructure withResponseTimestamp(LocalDateTime value) {
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

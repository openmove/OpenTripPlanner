//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package de.vdv.ojp;

import java.math.BigInteger;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.bliksemlabs.ojp.model.AbstractServiceDeliveryStructure;
import com.bliksemlabs.ojp.model.DataFrameRefStructure;
import com.bliksemlabs.ojp.model.ExtensionsStructure;
import com.bliksemlabs.ojp.model.MessageQualifierStructure;
import com.bliksemlabs.ojp.model.ParticipantRefStructure;
import com.bliksemlabs.ojp.model.ServiceDeliveryErrorConditionStructure;
import com.bliksemlabs.ojp.model.SubscriptionFilterRefStructure;
import com.bliksemlabs.ojp.model.SubscriptionQualifierStructure;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per OJPLocationInformationDeliveryStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="OJPLocationInformationDeliveryStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractServiceDeliveryStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.vdv.de/ojp}OJPLocationInformationRequest" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}ServiceResponseContextGroup"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}LocationInformationResponseGroup"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OJPLocationInformationDeliveryStructure", propOrder = {
    "ojpLocationInformationRequest",
    "dataFrameRef",
    "calcTime",
    "continueAt",
    "location",
    "extensions"
})
public class OJPLocationInformationDeliveryStructure
    extends AbstractServiceDeliveryStructure
{

    @XmlElement(name = "OJPLocationInformationRequest")
    protected OJPLocationInformationRequestStructure ojpLocationInformationRequest;
    @XmlElement(name = "DataFrameRef")
    protected DataFrameRefStructure dataFrameRef;
    @XmlElement(name = "CalcTime")
    protected BigInteger calcTime;
    @XmlElement(name = "ContinueAt")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger continueAt;
    @XmlElement(name = "Location")
    protected List<PlaceResultStructure> location;
    @XmlElement(name = "Extensions", namespace = "http://www.siri.org.uk/siri")
    protected ExtensionsStructure extensions;

    /**
     * Recupera il valore della proprietà ojpLocationInformationRequest.
     * 
     * @return
     *     possible object is
     *     {@link OJPLocationInformationRequestStructure }
     *     
     */
    public OJPLocationInformationRequestStructure getOJPLocationInformationRequest() {
        return ojpLocationInformationRequest;
    }

    /**
     * Imposta il valore della proprietà ojpLocationInformationRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link OJPLocationInformationRequestStructure }
     *     
     */
    public void setOJPLocationInformationRequest(OJPLocationInformationRequestStructure value) {
        this.ojpLocationInformationRequest = value;
    }

    /**
     * Recupera il valore della proprietà dataFrameRef.
     * 
     * @return
     *     possible object is
     *     {@link DataFrameRefStructure }
     *     
     */
    public DataFrameRefStructure getDataFrameRef() {
        return dataFrameRef;
    }

    /**
     * Imposta il valore della proprietà dataFrameRef.
     * 
     * @param value
     *     allowed object is
     *     {@link DataFrameRefStructure }
     *     
     */
    public void setDataFrameRef(DataFrameRefStructure value) {
        this.dataFrameRef = value;
    }

    /**
     * Recupera il valore della proprietà calcTime.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCalcTime() {
        return calcTime;
    }

    /**
     * Imposta il valore della proprietà calcTime.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCalcTime(BigInteger value) {
        this.calcTime = value;
    }

    /**
     * Recupera il valore della proprietà continueAt.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getContinueAt() {
        return continueAt;
    }

    /**
     * Imposta il valore della proprietà continueAt.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setContinueAt(BigInteger value) {
        this.continueAt = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the location property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlaceResultStructure }
     * 
     * 
     */
    public List<PlaceResultStructure> getLocation() {
        if (location == null) {
            location = new ArrayList<PlaceResultStructure>();
        }
        return this.location;
    }

    /**
     * Recupera il valore della proprietà extensions.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsStructure }
     *     
     */
    public ExtensionsStructure getExtensions() {
        return extensions;
    }

    /**
     * Imposta il valore della proprietà extensions.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsStructure }
     *     
     */
    public void setExtensions(ExtensionsStructure value) {
        this.extensions = value;
    }

    public OJPLocationInformationDeliveryStructure withOJPLocationInformationRequest(OJPLocationInformationRequestStructure value) {
        setOJPLocationInformationRequest(value);
        return this;
    }

    public OJPLocationInformationDeliveryStructure withDataFrameRef(DataFrameRefStructure value) {
        setDataFrameRef(value);
        return this;
    }

    public OJPLocationInformationDeliveryStructure withCalcTime(BigInteger value) {
        setCalcTime(value);
        return this;
    }

    public OJPLocationInformationDeliveryStructure withContinueAt(BigInteger value) {
        setContinueAt(value);
        return this;
    }

    public OJPLocationInformationDeliveryStructure withLocation(PlaceResultStructure... values) {
        if (values!= null) {
            for (PlaceResultStructure value: values) {
                getLocation().add(value);
            }
        }
        return this;
    }

    public OJPLocationInformationDeliveryStructure withLocation(Collection<PlaceResultStructure> values) {
        if (values!= null) {
            getLocation().addAll(values);
        }
        return this;
    }

    public OJPLocationInformationDeliveryStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public OJPLocationInformationDeliveryStructure withRequestMessageRef(MessageQualifierStructure value) {
        setRequestMessageRef(value);
        return this;
    }

    @Override
    public OJPLocationInformationDeliveryStructure withSubscriberRef(ParticipantRefStructure value) {
        setSubscriberRef(value);
        return this;
    }

    @Override
    public OJPLocationInformationDeliveryStructure withSubscriptionFilterRef(SubscriptionFilterRefStructure value) {
        setSubscriptionFilterRef(value);
        return this;
    }

    @Override
    public OJPLocationInformationDeliveryStructure withSubscriptionRef(SubscriptionQualifierStructure value) {
        setSubscriptionRef(value);
        return this;
    }

    @Override
    public OJPLocationInformationDeliveryStructure withDelegatorAddress(String value) {
        setDelegatorAddress(value);
        return this;
    }

    @Override
    public OJPLocationInformationDeliveryStructure withDelegatorRef(ParticipantRefStructure value) {
        setDelegatorRef(value);
        return this;
    }

    @Override
    public OJPLocationInformationDeliveryStructure withStatus(Boolean value) {
        setStatus(value);
        return this;
    }

    @Override
    public OJPLocationInformationDeliveryStructure withErrorCondition(ServiceDeliveryErrorConditionStructure value) {
        setErrorCondition(value);
        return this;
    }

    @Override
    public OJPLocationInformationDeliveryStructure withValidUntil(LocalDateTime value) {
        setValidUntil(value);
        return this;
    }

    @Override
    public OJPLocationInformationDeliveryStructure withShortestPossibleCycle(Duration value) {
        setShortestPossibleCycle(value);
        return this;
    }

    @Override
    public OJPLocationInformationDeliveryStructure withDefaultLanguage(String value) {
        setDefaultLanguage(value);
        return this;
    }

    @Override
    public OJPLocationInformationDeliveryStructure withResponseTimestamp(LocalDateTime value) {
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

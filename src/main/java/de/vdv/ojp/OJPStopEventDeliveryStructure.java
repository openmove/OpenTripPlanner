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
 * <p>Classe Java per OJPStopEventDeliveryStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="OJPStopEventDeliveryStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractServiceDeliveryStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.vdv.de/ojp}OJPStopEventRequest" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}ServiceResponseContextGroup"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}StopEventResponseGroup"/&gt;
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
@XmlType(name = "OJPStopEventDeliveryStructure", propOrder = {
    "ojpStopEventRequest",
    "dataFrameRef",
    "calcTime",
    "stopEventResponseContext",
    "stopEventResult",
    "extensions"
})
public class OJPStopEventDeliveryStructure
    extends AbstractServiceDeliveryStructure
{

    @XmlElement(name = "OJPStopEventRequest")
    protected OJPStopEventRequestStructure ojpStopEventRequest;
    @XmlElement(name = "DataFrameRef")
    protected DataFrameRefStructure dataFrameRef;
    @XmlElement(name = "CalcTime")
    protected BigInteger calcTime;
    @XmlElement(name = "StopEventResponseContext")
    protected StopEventResponseContextStructure stopEventResponseContext;
    @XmlElement(name = "StopEventResult")
    protected List<StopEventResultStructure> stopEventResult;
    @XmlElement(name = "Extensions", namespace = "http://www.siri.org.uk/siri")
    protected ExtensionsStructure extensions;

    /**
     * Recupera il valore della proprietà ojpStopEventRequest.
     * 
     * @return
     *     possible object is
     *     {@link OJPStopEventRequestStructure }
     *     
     */
    public OJPStopEventRequestStructure getOJPStopEventRequest() {
        return ojpStopEventRequest;
    }

    /**
     * Imposta il valore della proprietà ojpStopEventRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link OJPStopEventRequestStructure }
     *     
     */
    public void setOJPStopEventRequest(OJPStopEventRequestStructure value) {
        this.ojpStopEventRequest = value;
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
     * Recupera il valore della proprietà stopEventResponseContext.
     * 
     * @return
     *     possible object is
     *     {@link StopEventResponseContextStructure }
     *     
     */
    public StopEventResponseContextStructure getStopEventResponseContext() {
        return stopEventResponseContext;
    }

    /**
     * Imposta il valore della proprietà stopEventResponseContext.
     * 
     * @param value
     *     allowed object is
     *     {@link StopEventResponseContextStructure }
     *     
     */
    public void setStopEventResponseContext(StopEventResponseContextStructure value) {
        this.stopEventResponseContext = value;
    }

    /**
     * Gets the value of the stopEventResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stopEventResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStopEventResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StopEventResultStructure }
     * 
     * 
     */
    public List<StopEventResultStructure> getStopEventResult() {
        if (stopEventResult == null) {
            stopEventResult = new ArrayList<StopEventResultStructure>();
        }
        return this.stopEventResult;
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

    public OJPStopEventDeliveryStructure withOJPStopEventRequest(OJPStopEventRequestStructure value) {
        setOJPStopEventRequest(value);
        return this;
    }

    public OJPStopEventDeliveryStructure withDataFrameRef(DataFrameRefStructure value) {
        setDataFrameRef(value);
        return this;
    }

    public OJPStopEventDeliveryStructure withCalcTime(BigInteger value) {
        setCalcTime(value);
        return this;
    }

    public OJPStopEventDeliveryStructure withStopEventResponseContext(StopEventResponseContextStructure value) {
        setStopEventResponseContext(value);
        return this;
    }

    public OJPStopEventDeliveryStructure withStopEventResult(StopEventResultStructure... values) {
        if (values!= null) {
            for (StopEventResultStructure value: values) {
                getStopEventResult().add(value);
            }
        }
        return this;
    }

    public OJPStopEventDeliveryStructure withStopEventResult(Collection<StopEventResultStructure> values) {
        if (values!= null) {
            getStopEventResult().addAll(values);
        }
        return this;
    }

    public OJPStopEventDeliveryStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public OJPStopEventDeliveryStructure withRequestMessageRef(MessageQualifierStructure value) {
        setRequestMessageRef(value);
        return this;
    }

    @Override
    public OJPStopEventDeliveryStructure withSubscriberRef(ParticipantRefStructure value) {
        setSubscriberRef(value);
        return this;
    }

    @Override
    public OJPStopEventDeliveryStructure withSubscriptionFilterRef(SubscriptionFilterRefStructure value) {
        setSubscriptionFilterRef(value);
        return this;
    }

    @Override
    public OJPStopEventDeliveryStructure withSubscriptionRef(SubscriptionQualifierStructure value) {
        setSubscriptionRef(value);
        return this;
    }

    @Override
    public OJPStopEventDeliveryStructure withDelegatorAddress(String value) {
        setDelegatorAddress(value);
        return this;
    }

    @Override
    public OJPStopEventDeliveryStructure withDelegatorRef(ParticipantRefStructure value) {
        setDelegatorRef(value);
        return this;
    }

    @Override
    public OJPStopEventDeliveryStructure withStatus(Boolean value) {
        setStatus(value);
        return this;
    }

    @Override
    public OJPStopEventDeliveryStructure withErrorCondition(ServiceDeliveryErrorConditionStructure value) {
        setErrorCondition(value);
        return this;
    }

    @Override
    public OJPStopEventDeliveryStructure withValidUntil(LocalDateTime value) {
        setValidUntil(value);
        return this;
    }

    @Override
    public OJPStopEventDeliveryStructure withShortestPossibleCycle(Duration value) {
        setShortestPossibleCycle(value);
        return this;
    }

    @Override
    public OJPStopEventDeliveryStructure withDefaultLanguage(String value) {
        setDefaultLanguage(value);
        return this;
    }

    @Override
    public OJPStopEventDeliveryStructure withResponseTimestamp(LocalDateTime value) {
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

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
 * <p>Classe Java per OJPTripInfoDeliveryStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="OJPTripInfoDeliveryStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractServiceDeliveryStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.vdv.de/ojp}OJPTripInfoRequest" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}ServiceResponseContextGroup"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}TripInfoResponseGroup"/&gt;
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
@XmlType(name = "OJPTripInfoDeliveryStructure", propOrder = {
    "ojpTripInfoRequest",
    "dataFrameRef",
    "calcTime",
    "tripInfoResponseContext",
    "tripInfoResult",
    "extensions"
})
public class OJPTripInfoDeliveryStructure
    extends AbstractServiceDeliveryStructure
{

    @XmlElement(name = "OJPTripInfoRequest")
    protected OJPTripInfoRequestStructure ojpTripInfoRequest;
    @XmlElement(name = "DataFrameRef")
    protected DataFrameRefStructure dataFrameRef;
    @XmlElement(name = "CalcTime")
    protected BigInteger calcTime;
    @XmlElement(name = "TripInfoResponseContext")
    protected TripInfoResponseContextStructure tripInfoResponseContext;
    @XmlElement(name = "TripInfoResult")
    protected TripInfoResultStructure tripInfoResult;
    @XmlElement(name = "Extensions", namespace = "http://www.siri.org.uk/siri")
    protected ExtensionsStructure extensions;

    /**
     * Recupera il valore della proprietà ojpTripInfoRequest.
     * 
     * @return
     *     possible object is
     *     {@link OJPTripInfoRequestStructure }
     *     
     */
    public OJPTripInfoRequestStructure getOJPTripInfoRequest() {
        return ojpTripInfoRequest;
    }

    /**
     * Imposta il valore della proprietà ojpTripInfoRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link OJPTripInfoRequestStructure }
     *     
     */
    public void setOJPTripInfoRequest(OJPTripInfoRequestStructure value) {
        this.ojpTripInfoRequest = value;
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
     * Recupera il valore della proprietà tripInfoResponseContext.
     * 
     * @return
     *     possible object is
     *     {@link TripInfoResponseContextStructure }
     *     
     */
    public TripInfoResponseContextStructure getTripInfoResponseContext() {
        return tripInfoResponseContext;
    }

    /**
     * Imposta il valore della proprietà tripInfoResponseContext.
     * 
     * @param value
     *     allowed object is
     *     {@link TripInfoResponseContextStructure }
     *     
     */
    public void setTripInfoResponseContext(TripInfoResponseContextStructure value) {
        this.tripInfoResponseContext = value;
    }

    /**
     * Recupera il valore della proprietà tripInfoResult.
     * 
     * @return
     *     possible object is
     *     {@link TripInfoResultStructure }
     *     
     */
    public TripInfoResultStructure getTripInfoResult() {
        return tripInfoResult;
    }

    /**
     * Imposta il valore della proprietà tripInfoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link TripInfoResultStructure }
     *     
     */
    public void setTripInfoResult(TripInfoResultStructure value) {
        this.tripInfoResult = value;
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

    public OJPTripInfoDeliveryStructure withOJPTripInfoRequest(OJPTripInfoRequestStructure value) {
        setOJPTripInfoRequest(value);
        return this;
    }

    public OJPTripInfoDeliveryStructure withDataFrameRef(DataFrameRefStructure value) {
        setDataFrameRef(value);
        return this;
    }

    public OJPTripInfoDeliveryStructure withCalcTime(BigInteger value) {
        setCalcTime(value);
        return this;
    }

    public OJPTripInfoDeliveryStructure withTripInfoResponseContext(TripInfoResponseContextStructure value) {
        setTripInfoResponseContext(value);
        return this;
    }

    public OJPTripInfoDeliveryStructure withTripInfoResult(TripInfoResultStructure value) {
        setTripInfoResult(value);
        return this;
    }

    public OJPTripInfoDeliveryStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public OJPTripInfoDeliveryStructure withRequestMessageRef(MessageQualifierStructure value) {
        setRequestMessageRef(value);
        return this;
    }

    @Override
    public OJPTripInfoDeliveryStructure withSubscriberRef(ParticipantRefStructure value) {
        setSubscriberRef(value);
        return this;
    }

    @Override
    public OJPTripInfoDeliveryStructure withSubscriptionFilterRef(SubscriptionFilterRefStructure value) {
        setSubscriptionFilterRef(value);
        return this;
    }

    @Override
    public OJPTripInfoDeliveryStructure withSubscriptionRef(SubscriptionQualifierStructure value) {
        setSubscriptionRef(value);
        return this;
    }

    @Override
    public OJPTripInfoDeliveryStructure withDelegatorAddress(String value) {
        setDelegatorAddress(value);
        return this;
    }

    @Override
    public OJPTripInfoDeliveryStructure withDelegatorRef(ParticipantRefStructure value) {
        setDelegatorRef(value);
        return this;
    }

    @Override
    public OJPTripInfoDeliveryStructure withStatus(Boolean value) {
        setStatus(value);
        return this;
    }

    @Override
    public OJPTripInfoDeliveryStructure withErrorCondition(ServiceDeliveryErrorConditionStructure value) {
        setErrorCondition(value);
        return this;
    }

    @Override
    public OJPTripInfoDeliveryStructure withValidUntil(LocalDateTime value) {
        setValidUntil(value);
        return this;
    }

    @Override
    public OJPTripInfoDeliveryStructure withShortestPossibleCycle(Duration value) {
        setShortestPossibleCycle(value);
        return this;
    }

    @Override
    public OJPTripInfoDeliveryStructure withDefaultLanguage(String value) {
        setDefaultLanguage(value);
        return this;
    }

    @Override
    public OJPTripInfoDeliveryStructure withResponseTimestamp(LocalDateTime value) {
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

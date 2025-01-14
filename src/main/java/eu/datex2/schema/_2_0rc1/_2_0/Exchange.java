//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.LocalDateTimeISO8601XmlAdapter;


/**
 * <p>Classe Java per Exchange complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Exchange"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="changedFlag" type="{http://datex2.eu/schema/2_0RC1/2_0}ChangedFlagEnum" minOccurs="0"/&gt;
 *         &lt;element name="clientIdentification" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="deliveryBreak" type="{http://datex2.eu/schema/2_0RC1/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="denyReason" type="{http://datex2.eu/schema/2_0RC1/2_0}DenyReasonEnum" minOccurs="0"/&gt;
 *         &lt;element name="historicalStartDate" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="historicalStopDate" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="keepAlive" type="{http://datex2.eu/schema/2_0RC1/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="requestType" type="{http://datex2.eu/schema/2_0RC1/2_0}RequestTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="response" type="{http://datex2.eu/schema/2_0RC1/2_0}ResponseEnum" minOccurs="0"/&gt;
 *         &lt;element name="subscriptionReference" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="supplierIdentification" type="{http://datex2.eu/schema/2_0RC1/2_0}InternationalIdentifier"/&gt;
 *         &lt;element name="target" type="{http://datex2.eu/schema/2_0RC1/2_0}Target" minOccurs="0"/&gt;
 *         &lt;element name="subscription" type="{http://datex2.eu/schema/2_0RC1/2_0}Subscription" minOccurs="0"/&gt;
 *         &lt;element name="filterReference" type="{http://datex2.eu/schema/2_0RC1/2_0}FilterReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="catalogueReference" type="{http://datex2.eu/schema/2_0RC1/2_0}CatalogueReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="exchangeExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Exchange", propOrder = {
    "changedFlag",
    "clientIdentification",
    "deliveryBreak",
    "denyReason",
    "historicalStartDate",
    "historicalStopDate",
    "keepAlive",
    "requestType",
    "response",
    "subscriptionReference",
    "supplierIdentification",
    "target",
    "subscription",
    "filterReference",
    "catalogueReference",
    "exchangeExtension"
})
public class Exchange {

    @XmlSchemaType(name = "string")
    protected ChangedFlagEnum changedFlag;
    protected String clientIdentification;
    protected Boolean deliveryBreak;
    @XmlSchemaType(name = "string")
    protected DenyReasonEnum denyReason;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime historicalStartDate;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime historicalStopDate;
    protected Boolean keepAlive;
    @XmlSchemaType(name = "string")
    protected RequestTypeEnum requestType;
    @XmlSchemaType(name = "string")
    protected ResponseEnum response;
    protected String subscriptionReference;
    @XmlElement(required = true)
    protected InternationalIdentifier supplierIdentification;
    protected Target target;
    protected Subscription subscription;
    protected List<FilterReference> filterReference;
    protected List<CatalogueReference> catalogueReference;
    protected ExtensionType exchangeExtension;

    /**
     * Recupera il valore della proprietà changedFlag.
     * 
     * @return
     *     possible object is
     *     {@link ChangedFlagEnum }
     *     
     */
    public ChangedFlagEnum getChangedFlag() {
        return changedFlag;
    }

    /**
     * Imposta il valore della proprietà changedFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangedFlagEnum }
     *     
     */
    public void setChangedFlag(ChangedFlagEnum value) {
        this.changedFlag = value;
    }

    /**
     * Recupera il valore della proprietà clientIdentification.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientIdentification() {
        return clientIdentification;
    }

    /**
     * Imposta il valore della proprietà clientIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientIdentification(String value) {
        this.clientIdentification = value;
    }

    /**
     * Recupera il valore della proprietà deliveryBreak.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeliveryBreak() {
        return deliveryBreak;
    }

    /**
     * Imposta il valore della proprietà deliveryBreak.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeliveryBreak(Boolean value) {
        this.deliveryBreak = value;
    }

    /**
     * Recupera il valore della proprietà denyReason.
     * 
     * @return
     *     possible object is
     *     {@link DenyReasonEnum }
     *     
     */
    public DenyReasonEnum getDenyReason() {
        return denyReason;
    }

    /**
     * Imposta il valore della proprietà denyReason.
     * 
     * @param value
     *     allowed object is
     *     {@link DenyReasonEnum }
     *     
     */
    public void setDenyReason(DenyReasonEnum value) {
        this.denyReason = value;
    }

    /**
     * Recupera il valore della proprietà historicalStartDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getHistoricalStartDate() {
        return historicalStartDate;
    }

    /**
     * Imposta il valore della proprietà historicalStartDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHistoricalStartDate(LocalDateTime value) {
        this.historicalStartDate = value;
    }

    /**
     * Recupera il valore della proprietà historicalStopDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getHistoricalStopDate() {
        return historicalStopDate;
    }

    /**
     * Imposta il valore della proprietà historicalStopDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHistoricalStopDate(LocalDateTime value) {
        this.historicalStopDate = value;
    }

    /**
     * Recupera il valore della proprietà keepAlive.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKeepAlive() {
        return keepAlive;
    }

    /**
     * Imposta il valore della proprietà keepAlive.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKeepAlive(Boolean value) {
        this.keepAlive = value;
    }

    /**
     * Recupera il valore della proprietà requestType.
     * 
     * @return
     *     possible object is
     *     {@link RequestTypeEnum }
     *     
     */
    public RequestTypeEnum getRequestType() {
        return requestType;
    }

    /**
     * Imposta il valore della proprietà requestType.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestTypeEnum }
     *     
     */
    public void setRequestType(RequestTypeEnum value) {
        this.requestType = value;
    }

    /**
     * Recupera il valore della proprietà response.
     * 
     * @return
     *     possible object is
     *     {@link ResponseEnum }
     *     
     */
    public ResponseEnum getResponse() {
        return response;
    }

    /**
     * Imposta il valore della proprietà response.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseEnum }
     *     
     */
    public void setResponse(ResponseEnum value) {
        this.response = value;
    }

    /**
     * Recupera il valore della proprietà subscriptionReference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionReference() {
        return subscriptionReference;
    }

    /**
     * Imposta il valore della proprietà subscriptionReference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionReference(String value) {
        this.subscriptionReference = value;
    }

    /**
     * Recupera il valore della proprietà supplierIdentification.
     * 
     * @return
     *     possible object is
     *     {@link InternationalIdentifier }
     *     
     */
    public InternationalIdentifier getSupplierIdentification() {
        return supplierIdentification;
    }

    /**
     * Imposta il valore della proprietà supplierIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalIdentifier }
     *     
     */
    public void setSupplierIdentification(InternationalIdentifier value) {
        this.supplierIdentification = value;
    }

    /**
     * Recupera il valore della proprietà target.
     * 
     * @return
     *     possible object is
     *     {@link Target }
     *     
     */
    public Target getTarget() {
        return target;
    }

    /**
     * Imposta il valore della proprietà target.
     * 
     * @param value
     *     allowed object is
     *     {@link Target }
     *     
     */
    public void setTarget(Target value) {
        this.target = value;
    }

    /**
     * Recupera il valore della proprietà subscription.
     * 
     * @return
     *     possible object is
     *     {@link Subscription }
     *     
     */
    public Subscription getSubscription() {
        return subscription;
    }

    /**
     * Imposta il valore della proprietà subscription.
     * 
     * @param value
     *     allowed object is
     *     {@link Subscription }
     *     
     */
    public void setSubscription(Subscription value) {
        this.subscription = value;
    }

    /**
     * Gets the value of the filterReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filterReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilterReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FilterReference }
     * 
     * 
     */
    public List<FilterReference> getFilterReference() {
        if (filterReference == null) {
            filterReference = new ArrayList<FilterReference>();
        }
        return this.filterReference;
    }

    /**
     * Gets the value of the catalogueReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the catalogueReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCatalogueReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CatalogueReference }
     * 
     * 
     */
    public List<CatalogueReference> getCatalogueReference() {
        if (catalogueReference == null) {
            catalogueReference = new ArrayList<CatalogueReference>();
        }
        return this.catalogueReference;
    }

    /**
     * Recupera il valore della proprietà exchangeExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getExchangeExtension() {
        return exchangeExtension;
    }

    /**
     * Imposta il valore della proprietà exchangeExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setExchangeExtension(ExtensionType value) {
        this.exchangeExtension = value;
    }

    public Exchange withChangedFlag(ChangedFlagEnum value) {
        setChangedFlag(value);
        return this;
    }

    public Exchange withClientIdentification(String value) {
        setClientIdentification(value);
        return this;
    }

    public Exchange withDeliveryBreak(Boolean value) {
        setDeliveryBreak(value);
        return this;
    }

    public Exchange withDenyReason(DenyReasonEnum value) {
        setDenyReason(value);
        return this;
    }

    public Exchange withHistoricalStartDate(LocalDateTime value) {
        setHistoricalStartDate(value);
        return this;
    }

    public Exchange withHistoricalStopDate(LocalDateTime value) {
        setHistoricalStopDate(value);
        return this;
    }

    public Exchange withKeepAlive(Boolean value) {
        setKeepAlive(value);
        return this;
    }

    public Exchange withRequestType(RequestTypeEnum value) {
        setRequestType(value);
        return this;
    }

    public Exchange withResponse(ResponseEnum value) {
        setResponse(value);
        return this;
    }

    public Exchange withSubscriptionReference(String value) {
        setSubscriptionReference(value);
        return this;
    }

    public Exchange withSupplierIdentification(InternationalIdentifier value) {
        setSupplierIdentification(value);
        return this;
    }

    public Exchange withTarget(Target value) {
        setTarget(value);
        return this;
    }

    public Exchange withSubscription(Subscription value) {
        setSubscription(value);
        return this;
    }

    public Exchange withFilterReference(FilterReference... values) {
        if (values!= null) {
            for (FilterReference value: values) {
                getFilterReference().add(value);
            }
        }
        return this;
    }

    public Exchange withFilterReference(Collection<FilterReference> values) {
        if (values!= null) {
            getFilterReference().addAll(values);
        }
        return this;
    }

    public Exchange withCatalogueReference(CatalogueReference... values) {
        if (values!= null) {
            for (CatalogueReference value: values) {
                getCatalogueReference().add(value);
            }
        }
        return this;
    }

    public Exchange withCatalogueReference(Collection<CatalogueReference> values) {
        if (values!= null) {
            getCatalogueReference().addAll(values);
        }
        return this;
    }

    public Exchange withExchangeExtension(ExtensionType value) {
        setExchangeExtension(value);
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

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
 * <p>Classe Java per Subscription complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Subscription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deleteSubscription" type="{http://datex2.eu/schema/2_0RC1/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="deliveryInterval" type="{http://datex2.eu/schema/2_0RC1/2_0}Seconds" minOccurs="0"/&gt;
 *         &lt;element name="operatingMode" type="{http://datex2.eu/schema/2_0RC1/2_0}OperatingModeEnum"/&gt;
 *         &lt;element name="subscriptionStartTime" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime"/&gt;
 *         &lt;element name="subscriptionState" type="{http://datex2.eu/schema/2_0RC1/2_0}SubscriptionStateEnum"/&gt;
 *         &lt;element name="subscriptionStopTime" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="updateMethod" type="{http://datex2.eu/schema/2_0RC1/2_0}UpdateMethodEnum"/&gt;
 *         &lt;element name="target" type="{http://datex2.eu/schema/2_0RC1/2_0}Target" maxOccurs="unbounded"/&gt;
 *         &lt;element name="filterReference" type="{http://datex2.eu/schema/2_0RC1/2_0}FilterReference" minOccurs="0"/&gt;
 *         &lt;element name="catalogueReference" type="{http://datex2.eu/schema/2_0RC1/2_0}CatalogueReference" minOccurs="0"/&gt;
 *         &lt;element name="subscriptionExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Subscription", propOrder = {
    "deleteSubscription",
    "deliveryInterval",
    "operatingMode",
    "subscriptionStartTime",
    "subscriptionState",
    "subscriptionStopTime",
    "updateMethod",
    "target",
    "filterReference",
    "catalogueReference",
    "subscriptionExtension"
})
public class Subscription {

    protected Boolean deleteSubscription;
    protected Float deliveryInterval;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected OperatingModeEnum operatingMode;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime subscriptionStartTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected SubscriptionStateEnum subscriptionState;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime subscriptionStopTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected UpdateMethodEnum updateMethod;
    @XmlElement(required = true)
    protected List<Target> target;
    protected FilterReference filterReference;
    protected CatalogueReference catalogueReference;
    protected ExtensionType subscriptionExtension;

    /**
     * Recupera il valore della proprietà deleteSubscription.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeleteSubscription() {
        return deleteSubscription;
    }

    /**
     * Imposta il valore della proprietà deleteSubscription.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeleteSubscription(Boolean value) {
        this.deleteSubscription = value;
    }

    /**
     * Recupera il valore della proprietà deliveryInterval.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDeliveryInterval() {
        return deliveryInterval;
    }

    /**
     * Imposta il valore della proprietà deliveryInterval.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDeliveryInterval(Float value) {
        this.deliveryInterval = value;
    }

    /**
     * Recupera il valore della proprietà operatingMode.
     * 
     * @return
     *     possible object is
     *     {@link OperatingModeEnum }
     *     
     */
    public OperatingModeEnum getOperatingMode() {
        return operatingMode;
    }

    /**
     * Imposta il valore della proprietà operatingMode.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingModeEnum }
     *     
     */
    public void setOperatingMode(OperatingModeEnum value) {
        this.operatingMode = value;
    }

    /**
     * Recupera il valore della proprietà subscriptionStartTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getSubscriptionStartTime() {
        return subscriptionStartTime;
    }

    /**
     * Imposta il valore della proprietà subscriptionStartTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionStartTime(LocalDateTime value) {
        this.subscriptionStartTime = value;
    }

    /**
     * Recupera il valore della proprietà subscriptionState.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionStateEnum }
     *     
     */
    public SubscriptionStateEnum getSubscriptionState() {
        return subscriptionState;
    }

    /**
     * Imposta il valore della proprietà subscriptionState.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionStateEnum }
     *     
     */
    public void setSubscriptionState(SubscriptionStateEnum value) {
        this.subscriptionState = value;
    }

    /**
     * Recupera il valore della proprietà subscriptionStopTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getSubscriptionStopTime() {
        return subscriptionStopTime;
    }

    /**
     * Imposta il valore della proprietà subscriptionStopTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionStopTime(LocalDateTime value) {
        this.subscriptionStopTime = value;
    }

    /**
     * Recupera il valore della proprietà updateMethod.
     * 
     * @return
     *     possible object is
     *     {@link UpdateMethodEnum }
     *     
     */
    public UpdateMethodEnum getUpdateMethod() {
        return updateMethod;
    }

    /**
     * Imposta il valore della proprietà updateMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateMethodEnum }
     *     
     */
    public void setUpdateMethod(UpdateMethodEnum value) {
        this.updateMethod = value;
    }

    /**
     * Gets the value of the target property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the target property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTarget().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Target }
     * 
     * 
     */
    public List<Target> getTarget() {
        if (target == null) {
            target = new ArrayList<Target>();
        }
        return this.target;
    }

    /**
     * Recupera il valore della proprietà filterReference.
     * 
     * @return
     *     possible object is
     *     {@link FilterReference }
     *     
     */
    public FilterReference getFilterReference() {
        return filterReference;
    }

    /**
     * Imposta il valore della proprietà filterReference.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterReference }
     *     
     */
    public void setFilterReference(FilterReference value) {
        this.filterReference = value;
    }

    /**
     * Recupera il valore della proprietà catalogueReference.
     * 
     * @return
     *     possible object is
     *     {@link CatalogueReference }
     *     
     */
    public CatalogueReference getCatalogueReference() {
        return catalogueReference;
    }

    /**
     * Imposta il valore della proprietà catalogueReference.
     * 
     * @param value
     *     allowed object is
     *     {@link CatalogueReference }
     *     
     */
    public void setCatalogueReference(CatalogueReference value) {
        this.catalogueReference = value;
    }

    /**
     * Recupera il valore della proprietà subscriptionExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getSubscriptionExtension() {
        return subscriptionExtension;
    }

    /**
     * Imposta il valore della proprietà subscriptionExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setSubscriptionExtension(ExtensionType value) {
        this.subscriptionExtension = value;
    }

    public Subscription withDeleteSubscription(Boolean value) {
        setDeleteSubscription(value);
        return this;
    }

    public Subscription withDeliveryInterval(Float value) {
        setDeliveryInterval(value);
        return this;
    }

    public Subscription withOperatingMode(OperatingModeEnum value) {
        setOperatingMode(value);
        return this;
    }

    public Subscription withSubscriptionStartTime(LocalDateTime value) {
        setSubscriptionStartTime(value);
        return this;
    }

    public Subscription withSubscriptionState(SubscriptionStateEnum value) {
        setSubscriptionState(value);
        return this;
    }

    public Subscription withSubscriptionStopTime(LocalDateTime value) {
        setSubscriptionStopTime(value);
        return this;
    }

    public Subscription withUpdateMethod(UpdateMethodEnum value) {
        setUpdateMethod(value);
        return this;
    }

    public Subscription withTarget(Target... values) {
        if (values!= null) {
            for (Target value: values) {
                getTarget().add(value);
            }
        }
        return this;
    }

    public Subscription withTarget(Collection<Target> values) {
        if (values!= null) {
            getTarget().addAll(values);
        }
        return this;
    }

    public Subscription withFilterReference(FilterReference value) {
        setFilterReference(value);
        return this;
    }

    public Subscription withCatalogueReference(CatalogueReference value) {
        setCatalogueReference(value);
        return this;
    }

    public Subscription withSubscriptionExtension(ExtensionType value) {
        setSubscriptionExtension(value);
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

//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package de.vdv.ojp;

import java.math.BigDecimal;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.migesok.jaxb.adapter.javatime.DurationXmlAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * [related to FARE PRODUCT in TM and NeTEx] different FARE PRODUCTs that may be available with related information
 * 
 * <p>Classe Java per FareProductStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="FareProductStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FareProductId" type="{http://www.vdv.de/ojp}FareProductCodeType"/&gt;
 *         &lt;element name="FareProductName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}FareAuthorityGroup"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}FareProductPriceGroup"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}FareProductValidityGroup"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}FareProductBookingGroup"/&gt;
 *         &lt;element name="Extension" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareProductStructure", propOrder = {
    "fareProductId",
    "fareProductName",
    "fareAuthorityRef",
    "fareAuthorityText",
    "price",
    "netPrice",
    "currency",
    "vatRate",
    "travelClass",
    "requiredCard",
    "validFor",
    "validityDuration",
    "validityDurationText",
    "validityTariffZones",
    "validityAreaText",
    "infoUrl",
    "saleUrl",
    "bookingArrangements",
    "extension"
})
public class FareProductStructure {

    @XmlElement(name = "FareProductId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String fareProductId;
    @XmlElement(name = "FareProductName", required = true)
    protected String fareProductName;
    @XmlElement(name = "FareAuthorityRef", required = true)
    protected FareAuthorityRefStructure fareAuthorityRef;
    @XmlElement(name = "FareAuthorityText", required = true)
    protected String fareAuthorityText;
    @XmlElement(name = "Price")
    protected BigDecimal price;
    @XmlElement(name = "NetPrice")
    protected BigDecimal netPrice;
    @XmlElement(name = "Currency")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String currency;
    @XmlElement(name = "VatRate")
    @XmlSchemaType(name = "NMTOKEN")
    protected VatRateEnumeration vatRate;
    @XmlElement(name = "TravelClass")
    @XmlSchemaType(name = "NMTOKEN")
    protected TypeOfFareClassEnumeration travelClass;
    @XmlElement(name = "RequiredCard")
    protected List<EntitlementProductRefStructure> requiredCard;
    @XmlElement(name = "ValidFor")
    @XmlSchemaType(name = "string")
    protected List<PassengerCategoryEnumeration> validFor;
    @XmlElement(name = "ValidityDuration", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration validityDuration;
    @XmlElement(name = "ValidityDurationText")
    protected InternationalTextStructure validityDurationText;
    @XmlElement(name = "ValidityTariffZones")
    protected List<TariffZoneListInAreaStructure> validityTariffZones;
    @XmlElement(name = "ValidityAreaText")
    protected InternationalTextStructure validityAreaText;
    @XmlElement(name = "InfoUrl")
    protected List<WebLinkStructure> infoUrl;
    @XmlElement(name = "SaleUrl")
    protected List<WebLinkStructure> saleUrl;
    @XmlElement(name = "BookingArrangements")
    protected List<BookingArrangementsContainerStructure> bookingArrangements;
    @XmlElement(name = "Extension")
    protected Object extension;

    /**
     * Recupera il valore della proprietà fareProductId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareProductId() {
        return fareProductId;
    }

    /**
     * Imposta il valore della proprietà fareProductId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareProductId(String value) {
        this.fareProductId = value;
    }

    /**
     * Recupera il valore della proprietà fareProductName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareProductName() {
        return fareProductName;
    }

    /**
     * Imposta il valore della proprietà fareProductName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareProductName(String value) {
        this.fareProductName = value;
    }

    /**
     * Recupera il valore della proprietà fareAuthorityRef.
     * 
     * @return
     *     possible object is
     *     {@link FareAuthorityRefStructure }
     *     
     */
    public FareAuthorityRefStructure getFareAuthorityRef() {
        return fareAuthorityRef;
    }

    /**
     * Imposta il valore della proprietà fareAuthorityRef.
     * 
     * @param value
     *     allowed object is
     *     {@link FareAuthorityRefStructure }
     *     
     */
    public void setFareAuthorityRef(FareAuthorityRefStructure value) {
        this.fareAuthorityRef = value;
    }

    /**
     * Recupera il valore della proprietà fareAuthorityText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareAuthorityText() {
        return fareAuthorityText;
    }

    /**
     * Imposta il valore della proprietà fareAuthorityText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareAuthorityText(String value) {
        this.fareAuthorityText = value;
    }

    /**
     * Recupera il valore della proprietà price.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Imposta il valore della proprietà price.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrice(BigDecimal value) {
        this.price = value;
    }

    /**
     * Recupera il valore della proprietà netPrice.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetPrice() {
        return netPrice;
    }

    /**
     * Imposta il valore della proprietà netPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetPrice(BigDecimal value) {
        this.netPrice = value;
    }

    /**
     * Recupera il valore della proprietà currency.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Imposta il valore della proprietà currency.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Recupera il valore della proprietà vatRate.
     * 
     * @return
     *     possible object is
     *     {@link VatRateEnumeration }
     *     
     */
    public VatRateEnumeration getVatRate() {
        return vatRate;
    }

    /**
     * Imposta il valore della proprietà vatRate.
     * 
     * @param value
     *     allowed object is
     *     {@link VatRateEnumeration }
     *     
     */
    public void setVatRate(VatRateEnumeration value) {
        this.vatRate = value;
    }

    /**
     * Recupera il valore della proprietà travelClass.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfFareClassEnumeration }
     *     
     */
    public TypeOfFareClassEnumeration getTravelClass() {
        return travelClass;
    }

    /**
     * Imposta il valore della proprietà travelClass.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfFareClassEnumeration }
     *     
     */
    public void setTravelClass(TypeOfFareClassEnumeration value) {
        this.travelClass = value;
    }

    /**
     * Gets the value of the requiredCard property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requiredCard property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequiredCard().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntitlementProductRefStructure }
     * 
     * 
     */
    public List<EntitlementProductRefStructure> getRequiredCard() {
        if (requiredCard == null) {
            requiredCard = new ArrayList<EntitlementProductRefStructure>();
        }
        return this.requiredCard;
    }

    /**
     * Gets the value of the validFor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validFor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidFor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerCategoryEnumeration }
     * 
     * 
     */
    public List<PassengerCategoryEnumeration> getValidFor() {
        if (validFor == null) {
            validFor = new ArrayList<PassengerCategoryEnumeration>();
        }
        return this.validFor;
    }

    /**
     * Recupera il valore della proprietà validityDuration.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getValidityDuration() {
        return validityDuration;
    }

    /**
     * Imposta il valore della proprietà validityDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidityDuration(Duration value) {
        this.validityDuration = value;
    }

    /**
     * Recupera il valore della proprietà validityDurationText.
     * 
     * @return
     *     possible object is
     *     {@link InternationalTextStructure }
     *     
     */
    public InternationalTextStructure getValidityDurationText() {
        return validityDurationText;
    }

    /**
     * Imposta il valore della proprietà validityDurationText.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTextStructure }
     *     
     */
    public void setValidityDurationText(InternationalTextStructure value) {
        this.validityDurationText = value;
    }

    /**
     * Gets the value of the validityTariffZones property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validityTariffZones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidityTariffZones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TariffZoneListInAreaStructure }
     * 
     * 
     */
    public List<TariffZoneListInAreaStructure> getValidityTariffZones() {
        if (validityTariffZones == null) {
            validityTariffZones = new ArrayList<TariffZoneListInAreaStructure>();
        }
        return this.validityTariffZones;
    }

    /**
     * Recupera il valore della proprietà validityAreaText.
     * 
     * @return
     *     possible object is
     *     {@link InternationalTextStructure }
     *     
     */
    public InternationalTextStructure getValidityAreaText() {
        return validityAreaText;
    }

    /**
     * Imposta il valore della proprietà validityAreaText.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTextStructure }
     *     
     */
    public void setValidityAreaText(InternationalTextStructure value) {
        this.validityAreaText = value;
    }

    /**
     * Gets the value of the infoUrl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infoUrl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfoUrl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WebLinkStructure }
     * 
     * 
     */
    public List<WebLinkStructure> getInfoUrl() {
        if (infoUrl == null) {
            infoUrl = new ArrayList<WebLinkStructure>();
        }
        return this.infoUrl;
    }

    /**
     * Gets the value of the saleUrl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the saleUrl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSaleUrl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WebLinkStructure }
     * 
     * 
     */
    public List<WebLinkStructure> getSaleUrl() {
        if (saleUrl == null) {
            saleUrl = new ArrayList<WebLinkStructure>();
        }
        return this.saleUrl;
    }

    /**
     * Gets the value of the bookingArrangements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingArrangements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingArrangements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookingArrangementsContainerStructure }
     * 
     * 
     */
    public List<BookingArrangementsContainerStructure> getBookingArrangements() {
        if (bookingArrangements == null) {
            bookingArrangements = new ArrayList<BookingArrangementsContainerStructure>();
        }
        return this.bookingArrangements;
    }

    /**
     * Recupera il valore della proprietà extension.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExtension() {
        return extension;
    }

    /**
     * Imposta il valore della proprietà extension.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExtension(Object value) {
        this.extension = value;
    }

    public FareProductStructure withFareProductId(String value) {
        setFareProductId(value);
        return this;
    }

    public FareProductStructure withFareProductName(String value) {
        setFareProductName(value);
        return this;
    }

    public FareProductStructure withFareAuthorityRef(FareAuthorityRefStructure value) {
        setFareAuthorityRef(value);
        return this;
    }

    public FareProductStructure withFareAuthorityText(String value) {
        setFareAuthorityText(value);
        return this;
    }

    public FareProductStructure withPrice(BigDecimal value) {
        setPrice(value);
        return this;
    }

    public FareProductStructure withNetPrice(BigDecimal value) {
        setNetPrice(value);
        return this;
    }

    public FareProductStructure withCurrency(String value) {
        setCurrency(value);
        return this;
    }

    public FareProductStructure withVatRate(VatRateEnumeration value) {
        setVatRate(value);
        return this;
    }

    public FareProductStructure withTravelClass(TypeOfFareClassEnumeration value) {
        setTravelClass(value);
        return this;
    }

    public FareProductStructure withRequiredCard(EntitlementProductRefStructure... values) {
        if (values!= null) {
            for (EntitlementProductRefStructure value: values) {
                getRequiredCard().add(value);
            }
        }
        return this;
    }

    public FareProductStructure withRequiredCard(Collection<EntitlementProductRefStructure> values) {
        if (values!= null) {
            getRequiredCard().addAll(values);
        }
        return this;
    }

    public FareProductStructure withValidFor(PassengerCategoryEnumeration... values) {
        if (values!= null) {
            for (PassengerCategoryEnumeration value: values) {
                getValidFor().add(value);
            }
        }
        return this;
    }

    public FareProductStructure withValidFor(Collection<PassengerCategoryEnumeration> values) {
        if (values!= null) {
            getValidFor().addAll(values);
        }
        return this;
    }

    public FareProductStructure withValidityDuration(Duration value) {
        setValidityDuration(value);
        return this;
    }

    public FareProductStructure withValidityDurationText(InternationalTextStructure value) {
        setValidityDurationText(value);
        return this;
    }

    public FareProductStructure withValidityTariffZones(TariffZoneListInAreaStructure... values) {
        if (values!= null) {
            for (TariffZoneListInAreaStructure value: values) {
                getValidityTariffZones().add(value);
            }
        }
        return this;
    }

    public FareProductStructure withValidityTariffZones(Collection<TariffZoneListInAreaStructure> values) {
        if (values!= null) {
            getValidityTariffZones().addAll(values);
        }
        return this;
    }

    public FareProductStructure withValidityAreaText(InternationalTextStructure value) {
        setValidityAreaText(value);
        return this;
    }

    public FareProductStructure withInfoUrl(WebLinkStructure... values) {
        if (values!= null) {
            for (WebLinkStructure value: values) {
                getInfoUrl().add(value);
            }
        }
        return this;
    }

    public FareProductStructure withInfoUrl(Collection<WebLinkStructure> values) {
        if (values!= null) {
            getInfoUrl().addAll(values);
        }
        return this;
    }

    public FareProductStructure withSaleUrl(WebLinkStructure... values) {
        if (values!= null) {
            for (WebLinkStructure value: values) {
                getSaleUrl().add(value);
            }
        }
        return this;
    }

    public FareProductStructure withSaleUrl(Collection<WebLinkStructure> values) {
        if (values!= null) {
            getSaleUrl().addAll(values);
        }
        return this;
    }

    public FareProductStructure withBookingArrangements(BookingArrangementsContainerStructure... values) {
        if (values!= null) {
            for (BookingArrangementsContainerStructure value: values) {
                getBookingArrangements().add(value);
            }
        }
        return this;
    }

    public FareProductStructure withBookingArrangements(Collection<BookingArrangementsContainerStructure> values) {
        if (values!= null) {
            getBookingArrangements().addAll(values);
        }
        return this;
    }

    public FareProductStructure withExtension(Object value) {
        setExtension(value);
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

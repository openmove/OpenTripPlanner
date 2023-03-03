//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package de.vdv.ojp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.bliksemlabs.ojp.model.AccessFacilityEnumeration;
import com.bliksemlabs.ojp.model.AccommodationFacilityEnumeration;
import com.bliksemlabs.ojp.model.AssistanceFacilityEnumeration;
import com.bliksemlabs.ojp.model.FareClassFacilityEnumeration;
import com.bliksemlabs.ojp.model.HireFacilityEnumeration;
import com.bliksemlabs.ojp.model.LuggageFacilityEnumeration;
import com.bliksemlabs.ojp.model.MobilityFacilityEnumeration;
import com.bliksemlabs.ojp.model.NuisanceFacilityEnumeration;
import com.bliksemlabs.ojp.model.PassengerCommsFacilityEnumeration;
import com.bliksemlabs.ojp.model.PassengerInformationFacilityEnumeration;
import com.bliksemlabs.ojp.model.RefreshmentFacilityEnumeration;
import com.bliksemlabs.ojp.model.SanitaryFacilityEnumeration;
import com.bliksemlabs.ojp.model.TicketingFacilityEnumeration;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * Structured attribute classification with associated text.
 * 
 * <p>Classe Java per GeneralAttributeStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="GeneralAttributeStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Text" type="{http://www.vdv.de/ojp}InternationalTextStructure"/&gt;
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}AllFacilitiesGroup"/&gt;
 *         &lt;element name="Mandatory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Importance" type="{http://www.vdv.de/ojp}PercentType" minOccurs="0"/&gt;
 *         &lt;element name="InfoURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralAttributeStructure", propOrder = {
    "text",
    "code",
    "fareClassFacility",
    "ticketingFacility",
    "nuisanceFacility",
    "mobilityFacility",
    "passengerInformationFacility",
    "passengerCommsFacility",
    "refreshmentFacility",
    "accessFacility",
    "sanitaryFacility",
    "luggageFacility",
    "accommodationFacility",
    "assistanceFacility",
    "hireFacility",
    "mandatory",
    "importance",
    "infoURL"
})
@XmlSeeAlso({
    LegAttributeStructure.class
})
public class GeneralAttributeStructure {

    @XmlElement(name = "Text", required = true)
    protected InternationalTextStructure text;
    @XmlElement(name = "Code", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String code;
    @XmlElement(name = "FareClassFacility", namespace = "http://www.siri.org.uk/siri", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected List<FareClassFacilityEnumeration> fareClassFacility;
    @XmlElement(name = "TicketingFacility", namespace = "http://www.siri.org.uk/siri", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected List<TicketingFacilityEnumeration> ticketingFacility;
    @XmlElement(name = "NuisanceFacility", namespace = "http://www.siri.org.uk/siri", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected List<NuisanceFacilityEnumeration> nuisanceFacility;
    @XmlElement(name = "MobilityFacility", namespace = "http://www.siri.org.uk/siri", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected List<MobilityFacilityEnumeration> mobilityFacility;
    @XmlElement(name = "PassengerInformationFacility", namespace = "http://www.siri.org.uk/siri", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected List<PassengerInformationFacilityEnumeration> passengerInformationFacility;
    @XmlElement(name = "PassengerCommsFacility", namespace = "http://www.siri.org.uk/siri", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected List<PassengerCommsFacilityEnumeration> passengerCommsFacility;
    @XmlElement(name = "RefreshmentFacility", namespace = "http://www.siri.org.uk/siri", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected List<RefreshmentFacilityEnumeration> refreshmentFacility;
    @XmlElement(name = "AccessFacility", namespace = "http://www.siri.org.uk/siri", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected List<AccessFacilityEnumeration> accessFacility;
    @XmlElement(name = "SanitaryFacility", namespace = "http://www.siri.org.uk/siri", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected List<SanitaryFacilityEnumeration> sanitaryFacility;
    @XmlElement(name = "LuggageFacility", namespace = "http://www.siri.org.uk/siri", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected List<LuggageFacilityEnumeration> luggageFacility;
    @XmlElement(name = "AccommodationFacility", namespace = "http://www.siri.org.uk/siri", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected List<AccommodationFacilityEnumeration> accommodationFacility;
    @XmlElement(name = "AssistanceFacility", namespace = "http://www.siri.org.uk/siri", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected List<AssistanceFacilityEnumeration> assistanceFacility;
    @XmlElement(name = "HireFacility", namespace = "http://www.siri.org.uk/siri", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected List<HireFacilityEnumeration> hireFacility;
    @XmlElement(name = "Mandatory", defaultValue = "false")
    protected Boolean mandatory;
    @XmlElement(name = "Importance")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected Integer importance;
    @XmlElement(name = "InfoURL")
    @XmlSchemaType(name = "anyURI")
    protected String infoURL;

    /**
     * Recupera il valore della proprietà text.
     * 
     * @return
     *     possible object is
     *     {@link InternationalTextStructure }
     *     
     */
    public InternationalTextStructure getText() {
        return text;
    }

    /**
     * Imposta il valore della proprietà text.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTextStructure }
     *     
     */
    public void setText(InternationalTextStructure value) {
        this.text = value;
    }

    /**
     * Recupera il valore della proprietà code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Imposta il valore della proprietà code.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the fareClassFacility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareClassFacility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareClassFacility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareClassFacilityEnumeration }
     * 
     * 
     */
    public List<FareClassFacilityEnumeration> getFareClassFacility() {
        if (fareClassFacility == null) {
            fareClassFacility = new ArrayList<FareClassFacilityEnumeration>();
        }
        return this.fareClassFacility;
    }

    /**
     * Gets the value of the ticketingFacility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketingFacility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketingFacility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketingFacilityEnumeration }
     * 
     * 
     */
    public List<TicketingFacilityEnumeration> getTicketingFacility() {
        if (ticketingFacility == null) {
            ticketingFacility = new ArrayList<TicketingFacilityEnumeration>();
        }
        return this.ticketingFacility;
    }

    /**
     * Gets the value of the nuisanceFacility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nuisanceFacility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNuisanceFacility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NuisanceFacilityEnumeration }
     * 
     * 
     */
    public List<NuisanceFacilityEnumeration> getNuisanceFacility() {
        if (nuisanceFacility == null) {
            nuisanceFacility = new ArrayList<NuisanceFacilityEnumeration>();
        }
        return this.nuisanceFacility;
    }

    /**
     * Gets the value of the mobilityFacility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mobilityFacility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMobilityFacility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MobilityFacilityEnumeration }
     * 
     * 
     */
    public List<MobilityFacilityEnumeration> getMobilityFacility() {
        if (mobilityFacility == null) {
            mobilityFacility = new ArrayList<MobilityFacilityEnumeration>();
        }
        return this.mobilityFacility;
    }

    /**
     * Gets the value of the passengerInformationFacility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerInformationFacility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerInformationFacility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerInformationFacilityEnumeration }
     * 
     * 
     */
    public List<PassengerInformationFacilityEnumeration> getPassengerInformationFacility() {
        if (passengerInformationFacility == null) {
            passengerInformationFacility = new ArrayList<PassengerInformationFacilityEnumeration>();
        }
        return this.passengerInformationFacility;
    }

    /**
     * Gets the value of the passengerCommsFacility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerCommsFacility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerCommsFacility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerCommsFacilityEnumeration }
     * 
     * 
     */
    public List<PassengerCommsFacilityEnumeration> getPassengerCommsFacility() {
        if (passengerCommsFacility == null) {
            passengerCommsFacility = new ArrayList<PassengerCommsFacilityEnumeration>();
        }
        return this.passengerCommsFacility;
    }

    /**
     * Gets the value of the refreshmentFacility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refreshmentFacility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefreshmentFacility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RefreshmentFacilityEnumeration }
     * 
     * 
     */
    public List<RefreshmentFacilityEnumeration> getRefreshmentFacility() {
        if (refreshmentFacility == null) {
            refreshmentFacility = new ArrayList<RefreshmentFacilityEnumeration>();
        }
        return this.refreshmentFacility;
    }

    /**
     * Gets the value of the accessFacility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accessFacility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessFacility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccessFacilityEnumeration }
     * 
     * 
     */
    public List<AccessFacilityEnumeration> getAccessFacility() {
        if (accessFacility == null) {
            accessFacility = new ArrayList<AccessFacilityEnumeration>();
        }
        return this.accessFacility;
    }

    /**
     * Gets the value of the sanitaryFacility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sanitaryFacility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSanitaryFacility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SanitaryFacilityEnumeration }
     * 
     * 
     */
    public List<SanitaryFacilityEnumeration> getSanitaryFacility() {
        if (sanitaryFacility == null) {
            sanitaryFacility = new ArrayList<SanitaryFacilityEnumeration>();
        }
        return this.sanitaryFacility;
    }

    /**
     * Gets the value of the luggageFacility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the luggageFacility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLuggageFacility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LuggageFacilityEnumeration }
     * 
     * 
     */
    public List<LuggageFacilityEnumeration> getLuggageFacility() {
        if (luggageFacility == null) {
            luggageFacility = new ArrayList<LuggageFacilityEnumeration>();
        }
        return this.luggageFacility;
    }

    /**
     * Gets the value of the accommodationFacility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accommodationFacility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccommodationFacility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccommodationFacilityEnumeration }
     * 
     * 
     */
    public List<AccommodationFacilityEnumeration> getAccommodationFacility() {
        if (accommodationFacility == null) {
            accommodationFacility = new ArrayList<AccommodationFacilityEnumeration>();
        }
        return this.accommodationFacility;
    }

    /**
     * Gets the value of the assistanceFacility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assistanceFacility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssistanceFacility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssistanceFacilityEnumeration }
     * 
     * 
     */
    public List<AssistanceFacilityEnumeration> getAssistanceFacility() {
        if (assistanceFacility == null) {
            assistanceFacility = new ArrayList<AssistanceFacilityEnumeration>();
        }
        return this.assistanceFacility;
    }

    /**
     * Gets the value of the hireFacility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hireFacility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHireFacility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HireFacilityEnumeration }
     * 
     * 
     */
    public List<HireFacilityEnumeration> getHireFacility() {
        if (hireFacility == null) {
            hireFacility = new ArrayList<HireFacilityEnumeration>();
        }
        return this.hireFacility;
    }

    /**
     * Recupera il valore della proprietà mandatory.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMandatory() {
        return mandatory;
    }

    /**
     * Imposta il valore della proprietà mandatory.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMandatory(Boolean value) {
        this.mandatory = value;
    }

    /**
     * Recupera il valore della proprietà importance.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getImportance() {
        return importance;
    }

    /**
     * Imposta il valore della proprietà importance.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setImportance(Integer value) {
        this.importance = value;
    }

    /**
     * Recupera il valore della proprietà infoURL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoURL() {
        return infoURL;
    }

    /**
     * Imposta il valore della proprietà infoURL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoURL(String value) {
        this.infoURL = value;
    }

    public GeneralAttributeStructure withText(InternationalTextStructure value) {
        setText(value);
        return this;
    }

    public GeneralAttributeStructure withCode(String value) {
        setCode(value);
        return this;
    }

    public GeneralAttributeStructure withFareClassFacility(FareClassFacilityEnumeration... values) {
        if (values!= null) {
            for (FareClassFacilityEnumeration value: values) {
                getFareClassFacility().add(value);
            }
        }
        return this;
    }

    public GeneralAttributeStructure withFareClassFacility(Collection<FareClassFacilityEnumeration> values) {
        if (values!= null) {
            getFareClassFacility().addAll(values);
        }
        return this;
    }

    public GeneralAttributeStructure withTicketingFacility(TicketingFacilityEnumeration... values) {
        if (values!= null) {
            for (TicketingFacilityEnumeration value: values) {
                getTicketingFacility().add(value);
            }
        }
        return this;
    }

    public GeneralAttributeStructure withTicketingFacility(Collection<TicketingFacilityEnumeration> values) {
        if (values!= null) {
            getTicketingFacility().addAll(values);
        }
        return this;
    }

    public GeneralAttributeStructure withNuisanceFacility(NuisanceFacilityEnumeration... values) {
        if (values!= null) {
            for (NuisanceFacilityEnumeration value: values) {
                getNuisanceFacility().add(value);
            }
        }
        return this;
    }

    public GeneralAttributeStructure withNuisanceFacility(Collection<NuisanceFacilityEnumeration> values) {
        if (values!= null) {
            getNuisanceFacility().addAll(values);
        }
        return this;
    }

    public GeneralAttributeStructure withMobilityFacility(MobilityFacilityEnumeration... values) {
        if (values!= null) {
            for (MobilityFacilityEnumeration value: values) {
                getMobilityFacility().add(value);
            }
        }
        return this;
    }

    public GeneralAttributeStructure withMobilityFacility(Collection<MobilityFacilityEnumeration> values) {
        if (values!= null) {
            getMobilityFacility().addAll(values);
        }
        return this;
    }

    public GeneralAttributeStructure withPassengerInformationFacility(PassengerInformationFacilityEnumeration... values) {
        if (values!= null) {
            for (PassengerInformationFacilityEnumeration value: values) {
                getPassengerInformationFacility().add(value);
            }
        }
        return this;
    }

    public GeneralAttributeStructure withPassengerInformationFacility(Collection<PassengerInformationFacilityEnumeration> values) {
        if (values!= null) {
            getPassengerInformationFacility().addAll(values);
        }
        return this;
    }

    public GeneralAttributeStructure withPassengerCommsFacility(PassengerCommsFacilityEnumeration... values) {
        if (values!= null) {
            for (PassengerCommsFacilityEnumeration value: values) {
                getPassengerCommsFacility().add(value);
            }
        }
        return this;
    }

    public GeneralAttributeStructure withPassengerCommsFacility(Collection<PassengerCommsFacilityEnumeration> values) {
        if (values!= null) {
            getPassengerCommsFacility().addAll(values);
        }
        return this;
    }

    public GeneralAttributeStructure withRefreshmentFacility(RefreshmentFacilityEnumeration... values) {
        if (values!= null) {
            for (RefreshmentFacilityEnumeration value: values) {
                getRefreshmentFacility().add(value);
            }
        }
        return this;
    }

    public GeneralAttributeStructure withRefreshmentFacility(Collection<RefreshmentFacilityEnumeration> values) {
        if (values!= null) {
            getRefreshmentFacility().addAll(values);
        }
        return this;
    }

    public GeneralAttributeStructure withAccessFacility(AccessFacilityEnumeration... values) {
        if (values!= null) {
            for (AccessFacilityEnumeration value: values) {
                getAccessFacility().add(value);
            }
        }
        return this;
    }

    public GeneralAttributeStructure withAccessFacility(Collection<AccessFacilityEnumeration> values) {
        if (values!= null) {
            getAccessFacility().addAll(values);
        }
        return this;
    }

    public GeneralAttributeStructure withSanitaryFacility(SanitaryFacilityEnumeration... values) {
        if (values!= null) {
            for (SanitaryFacilityEnumeration value: values) {
                getSanitaryFacility().add(value);
            }
        }
        return this;
    }

    public GeneralAttributeStructure withSanitaryFacility(Collection<SanitaryFacilityEnumeration> values) {
        if (values!= null) {
            getSanitaryFacility().addAll(values);
        }
        return this;
    }

    public GeneralAttributeStructure withLuggageFacility(LuggageFacilityEnumeration... values) {
        if (values!= null) {
            for (LuggageFacilityEnumeration value: values) {
                getLuggageFacility().add(value);
            }
        }
        return this;
    }

    public GeneralAttributeStructure withLuggageFacility(Collection<LuggageFacilityEnumeration> values) {
        if (values!= null) {
            getLuggageFacility().addAll(values);
        }
        return this;
    }

    public GeneralAttributeStructure withAccommodationFacility(AccommodationFacilityEnumeration... values) {
        if (values!= null) {
            for (AccommodationFacilityEnumeration value: values) {
                getAccommodationFacility().add(value);
            }
        }
        return this;
    }

    public GeneralAttributeStructure withAccommodationFacility(Collection<AccommodationFacilityEnumeration> values) {
        if (values!= null) {
            getAccommodationFacility().addAll(values);
        }
        return this;
    }

    public GeneralAttributeStructure withAssistanceFacility(AssistanceFacilityEnumeration... values) {
        if (values!= null) {
            for (AssistanceFacilityEnumeration value: values) {
                getAssistanceFacility().add(value);
            }
        }
        return this;
    }

    public GeneralAttributeStructure withAssistanceFacility(Collection<AssistanceFacilityEnumeration> values) {
        if (values!= null) {
            getAssistanceFacility().addAll(values);
        }
        return this;
    }

    public GeneralAttributeStructure withHireFacility(HireFacilityEnumeration... values) {
        if (values!= null) {
            for (HireFacilityEnumeration value: values) {
                getHireFacility().add(value);
            }
        }
        return this;
    }

    public GeneralAttributeStructure withHireFacility(Collection<HireFacilityEnumeration> values) {
        if (values!= null) {
            getHireFacility().addAll(values);
        }
        return this;
    }

    public GeneralAttributeStructure withMandatory(Boolean value) {
        setMandatory(value);
        return this;
    }

    public GeneralAttributeStructure withImportance(Integer value) {
        setImportance(value);
        return this;
    }

    public GeneralAttributeStructure withInfoURL(String value) {
        setInfoURL(value);
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

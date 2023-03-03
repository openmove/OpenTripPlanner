//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package com.bliksemlabs.ojp.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per AllFacilitiesFeatureStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AllFacilitiesFeatureStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}AccessFacility"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}AccommodationFacility"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}AssistanceFacility"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}FareClassFacility"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}HireFacility"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}LuggageFacility"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}MobilityFacility"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}NuisanceFacility"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}ParkingFacility"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}PassengerCommsFacility"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}PassengerInformationFacility"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}RefreshmentFacility"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}ReservedSpaceFacility"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}RetailFacility"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}SanitaryFacility"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}TicketingFacility"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllFacilitiesFeatureStructure", propOrder = {
    "accessFacility",
    "accommodationFacility",
    "assistanceFacility",
    "fareClassFacility",
    "hireFacility",
    "luggageFacility",
    "mobilityFacility",
    "nuisanceFacility",
    "parkingFacility",
    "passengerCommsFacility",
    "passengerInformationFacility",
    "refreshmentFacility",
    "reservedSpaceFacility",
    "retailFacility",
    "sanitaryFacility",
    "ticketingFacility"
})
public class AllFacilitiesFeatureStructure {

    @XmlElement(name = "AccessFacility", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected AccessFacilityEnumeration accessFacility;
    @XmlElement(name = "AccommodationFacility", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected AccommodationFacilityEnumeration accommodationFacility;
    @XmlElement(name = "AssistanceFacility", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected AssistanceFacilityEnumeration assistanceFacility;
    @XmlElement(name = "FareClassFacility", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected FareClassFacilityEnumeration fareClassFacility;
    @XmlElement(name = "HireFacility", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected HireFacilityEnumeration hireFacility;
    @XmlElement(name = "LuggageFacility", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected LuggageFacilityEnumeration luggageFacility;
    @XmlElement(name = "MobilityFacility", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected MobilityFacilityEnumeration mobilityFacility;
    @XmlElement(name = "NuisanceFacility", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected NuisanceFacilityEnumeration nuisanceFacility;
    @XmlElement(name = "ParkingFacility")
    @XmlSchemaType(name = "NMTOKEN")
    protected ParkingFacilityEnumeration parkingFacility;
    @XmlElement(name = "PassengerCommsFacility", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected PassengerCommsFacilityEnumeration passengerCommsFacility;
    @XmlElement(name = "PassengerInformationFacility", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected PassengerInformationFacilityEnumeration passengerInformationFacility;
    @XmlElement(name = "RefreshmentFacility", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected RefreshmentFacilityEnumeration refreshmentFacility;
    @XmlElement(name = "ReservedSpaceFacility", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected ReservedSpaceFacilityEnumeration reservedSpaceFacility;
    @XmlElement(name = "RetailFacility", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected RetailFacilityEnumeration retailFacility;
    @XmlElement(name = "SanitaryFacility", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected SanitaryFacilityEnumeration sanitaryFacility;
    @XmlElement(name = "TicketingFacility", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected TicketingFacilityEnumeration ticketingFacility;

    /**
     * Recupera il valore della proprietà accessFacility.
     * 
     * @return
     *     possible object is
     *     {@link AccessFacilityEnumeration }
     *     
     */
    public AccessFacilityEnumeration getAccessFacility() {
        return accessFacility;
    }

    /**
     * Imposta il valore della proprietà accessFacility.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessFacilityEnumeration }
     *     
     */
    public void setAccessFacility(AccessFacilityEnumeration value) {
        this.accessFacility = value;
    }

    /**
     * Recupera il valore della proprietà accommodationFacility.
     * 
     * @return
     *     possible object is
     *     {@link AccommodationFacilityEnumeration }
     *     
     */
    public AccommodationFacilityEnumeration getAccommodationFacility() {
        return accommodationFacility;
    }

    /**
     * Imposta il valore della proprietà accommodationFacility.
     * 
     * @param value
     *     allowed object is
     *     {@link AccommodationFacilityEnumeration }
     *     
     */
    public void setAccommodationFacility(AccommodationFacilityEnumeration value) {
        this.accommodationFacility = value;
    }

    /**
     * Recupera il valore della proprietà assistanceFacility.
     * 
     * @return
     *     possible object is
     *     {@link AssistanceFacilityEnumeration }
     *     
     */
    public AssistanceFacilityEnumeration getAssistanceFacility() {
        return assistanceFacility;
    }

    /**
     * Imposta il valore della proprietà assistanceFacility.
     * 
     * @param value
     *     allowed object is
     *     {@link AssistanceFacilityEnumeration }
     *     
     */
    public void setAssistanceFacility(AssistanceFacilityEnumeration value) {
        this.assistanceFacility = value;
    }

    /**
     * Recupera il valore della proprietà fareClassFacility.
     * 
     * @return
     *     possible object is
     *     {@link FareClassFacilityEnumeration }
     *     
     */
    public FareClassFacilityEnumeration getFareClassFacility() {
        return fareClassFacility;
    }

    /**
     * Imposta il valore della proprietà fareClassFacility.
     * 
     * @param value
     *     allowed object is
     *     {@link FareClassFacilityEnumeration }
     *     
     */
    public void setFareClassFacility(FareClassFacilityEnumeration value) {
        this.fareClassFacility = value;
    }

    /**
     * Recupera il valore della proprietà hireFacility.
     * 
     * @return
     *     possible object is
     *     {@link HireFacilityEnumeration }
     *     
     */
    public HireFacilityEnumeration getHireFacility() {
        return hireFacility;
    }

    /**
     * Imposta il valore della proprietà hireFacility.
     * 
     * @param value
     *     allowed object is
     *     {@link HireFacilityEnumeration }
     *     
     */
    public void setHireFacility(HireFacilityEnumeration value) {
        this.hireFacility = value;
    }

    /**
     * Recupera il valore della proprietà luggageFacility.
     * 
     * @return
     *     possible object is
     *     {@link LuggageFacilityEnumeration }
     *     
     */
    public LuggageFacilityEnumeration getLuggageFacility() {
        return luggageFacility;
    }

    /**
     * Imposta il valore della proprietà luggageFacility.
     * 
     * @param value
     *     allowed object is
     *     {@link LuggageFacilityEnumeration }
     *     
     */
    public void setLuggageFacility(LuggageFacilityEnumeration value) {
        this.luggageFacility = value;
    }

    /**
     * Recupera il valore della proprietà mobilityFacility.
     * 
     * @return
     *     possible object is
     *     {@link MobilityFacilityEnumeration }
     *     
     */
    public MobilityFacilityEnumeration getMobilityFacility() {
        return mobilityFacility;
    }

    /**
     * Imposta il valore della proprietà mobilityFacility.
     * 
     * @param value
     *     allowed object is
     *     {@link MobilityFacilityEnumeration }
     *     
     */
    public void setMobilityFacility(MobilityFacilityEnumeration value) {
        this.mobilityFacility = value;
    }

    /**
     * Recupera il valore della proprietà nuisanceFacility.
     * 
     * @return
     *     possible object is
     *     {@link NuisanceFacilityEnumeration }
     *     
     */
    public NuisanceFacilityEnumeration getNuisanceFacility() {
        return nuisanceFacility;
    }

    /**
     * Imposta il valore della proprietà nuisanceFacility.
     * 
     * @param value
     *     allowed object is
     *     {@link NuisanceFacilityEnumeration }
     *     
     */
    public void setNuisanceFacility(NuisanceFacilityEnumeration value) {
        this.nuisanceFacility = value;
    }

    /**
     * Recupera il valore della proprietà parkingFacility.
     * 
     * @return
     *     possible object is
     *     {@link ParkingFacilityEnumeration }
     *     
     */
    public ParkingFacilityEnumeration getParkingFacility() {
        return parkingFacility;
    }

    /**
     * Imposta il valore della proprietà parkingFacility.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingFacilityEnumeration }
     *     
     */
    public void setParkingFacility(ParkingFacilityEnumeration value) {
        this.parkingFacility = value;
    }

    /**
     * Recupera il valore della proprietà passengerCommsFacility.
     * 
     * @return
     *     possible object is
     *     {@link PassengerCommsFacilityEnumeration }
     *     
     */
    public PassengerCommsFacilityEnumeration getPassengerCommsFacility() {
        return passengerCommsFacility;
    }

    /**
     * Imposta il valore della proprietà passengerCommsFacility.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerCommsFacilityEnumeration }
     *     
     */
    public void setPassengerCommsFacility(PassengerCommsFacilityEnumeration value) {
        this.passengerCommsFacility = value;
    }

    /**
     * Recupera il valore della proprietà passengerInformationFacility.
     * 
     * @return
     *     possible object is
     *     {@link PassengerInformationFacilityEnumeration }
     *     
     */
    public PassengerInformationFacilityEnumeration getPassengerInformationFacility() {
        return passengerInformationFacility;
    }

    /**
     * Imposta il valore della proprietà passengerInformationFacility.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerInformationFacilityEnumeration }
     *     
     */
    public void setPassengerInformationFacility(PassengerInformationFacilityEnumeration value) {
        this.passengerInformationFacility = value;
    }

    /**
     * Recupera il valore della proprietà refreshmentFacility.
     * 
     * @return
     *     possible object is
     *     {@link RefreshmentFacilityEnumeration }
     *     
     */
    public RefreshmentFacilityEnumeration getRefreshmentFacility() {
        return refreshmentFacility;
    }

    /**
     * Imposta il valore della proprietà refreshmentFacility.
     * 
     * @param value
     *     allowed object is
     *     {@link RefreshmentFacilityEnumeration }
     *     
     */
    public void setRefreshmentFacility(RefreshmentFacilityEnumeration value) {
        this.refreshmentFacility = value;
    }

    /**
     * Recupera il valore della proprietà reservedSpaceFacility.
     * 
     * @return
     *     possible object is
     *     {@link ReservedSpaceFacilityEnumeration }
     *     
     */
    public ReservedSpaceFacilityEnumeration getReservedSpaceFacility() {
        return reservedSpaceFacility;
    }

    /**
     * Imposta il valore della proprietà reservedSpaceFacility.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservedSpaceFacilityEnumeration }
     *     
     */
    public void setReservedSpaceFacility(ReservedSpaceFacilityEnumeration value) {
        this.reservedSpaceFacility = value;
    }

    /**
     * Recupera il valore della proprietà retailFacility.
     * 
     * @return
     *     possible object is
     *     {@link RetailFacilityEnumeration }
     *     
     */
    public RetailFacilityEnumeration getRetailFacility() {
        return retailFacility;
    }

    /**
     * Imposta il valore della proprietà retailFacility.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailFacilityEnumeration }
     *     
     */
    public void setRetailFacility(RetailFacilityEnumeration value) {
        this.retailFacility = value;
    }

    /**
     * Recupera il valore della proprietà sanitaryFacility.
     * 
     * @return
     *     possible object is
     *     {@link SanitaryFacilityEnumeration }
     *     
     */
    public SanitaryFacilityEnumeration getSanitaryFacility() {
        return sanitaryFacility;
    }

    /**
     * Imposta il valore della proprietà sanitaryFacility.
     * 
     * @param value
     *     allowed object is
     *     {@link SanitaryFacilityEnumeration }
     *     
     */
    public void setSanitaryFacility(SanitaryFacilityEnumeration value) {
        this.sanitaryFacility = value;
    }

    /**
     * Recupera il valore della proprietà ticketingFacility.
     * 
     * @return
     *     possible object is
     *     {@link TicketingFacilityEnumeration }
     *     
     */
    public TicketingFacilityEnumeration getTicketingFacility() {
        return ticketingFacility;
    }

    /**
     * Imposta il valore della proprietà ticketingFacility.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketingFacilityEnumeration }
     *     
     */
    public void setTicketingFacility(TicketingFacilityEnumeration value) {
        this.ticketingFacility = value;
    }

    public AllFacilitiesFeatureStructure withAccessFacility(AccessFacilityEnumeration value) {
        setAccessFacility(value);
        return this;
    }

    public AllFacilitiesFeatureStructure withAccommodationFacility(AccommodationFacilityEnumeration value) {
        setAccommodationFacility(value);
        return this;
    }

    public AllFacilitiesFeatureStructure withAssistanceFacility(AssistanceFacilityEnumeration value) {
        setAssistanceFacility(value);
        return this;
    }

    public AllFacilitiesFeatureStructure withFareClassFacility(FareClassFacilityEnumeration value) {
        setFareClassFacility(value);
        return this;
    }

    public AllFacilitiesFeatureStructure withHireFacility(HireFacilityEnumeration value) {
        setHireFacility(value);
        return this;
    }

    public AllFacilitiesFeatureStructure withLuggageFacility(LuggageFacilityEnumeration value) {
        setLuggageFacility(value);
        return this;
    }

    public AllFacilitiesFeatureStructure withMobilityFacility(MobilityFacilityEnumeration value) {
        setMobilityFacility(value);
        return this;
    }

    public AllFacilitiesFeatureStructure withNuisanceFacility(NuisanceFacilityEnumeration value) {
        setNuisanceFacility(value);
        return this;
    }

    public AllFacilitiesFeatureStructure withParkingFacility(ParkingFacilityEnumeration value) {
        setParkingFacility(value);
        return this;
    }

    public AllFacilitiesFeatureStructure withPassengerCommsFacility(PassengerCommsFacilityEnumeration value) {
        setPassengerCommsFacility(value);
        return this;
    }

    public AllFacilitiesFeatureStructure withPassengerInformationFacility(PassengerInformationFacilityEnumeration value) {
        setPassengerInformationFacility(value);
        return this;
    }

    public AllFacilitiesFeatureStructure withRefreshmentFacility(RefreshmentFacilityEnumeration value) {
        setRefreshmentFacility(value);
        return this;
    }

    public AllFacilitiesFeatureStructure withReservedSpaceFacility(ReservedSpaceFacilityEnumeration value) {
        setReservedSpaceFacility(value);
        return this;
    }

    public AllFacilitiesFeatureStructure withRetailFacility(RetailFacilityEnumeration value) {
        setRetailFacility(value);
        return this;
    }

    public AllFacilitiesFeatureStructure withSanitaryFacility(SanitaryFacilityEnumeration value) {
        setSanitaryFacility(value);
        return this;
    }

    public AllFacilitiesFeatureStructure withTicketingFacility(TicketingFacilityEnumeration value) {
        setTicketingFacility(value);
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

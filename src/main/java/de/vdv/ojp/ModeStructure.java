//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package de.vdv.ojp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.bliksemlabs.ojp.model.AirSubmodesOfTransportEnumeration;
import com.bliksemlabs.ojp.model.BusSubmodesOfTransportEnumeration;
import com.bliksemlabs.ojp.model.CoachSubmodesOfTransportEnumeration;
import com.bliksemlabs.ojp.model.FunicularSubmodesOfTransportEnumeration;
import com.bliksemlabs.ojp.model.MetroSubmodesOfTransportEnumeration;
import com.bliksemlabs.ojp.model.RailSubmodesOfTransportEnumeration;
import com.bliksemlabs.ojp.model.TaxiSubmodesOfTransportEnumeration;
import com.bliksemlabs.ojp.model.TelecabinSubmodesOfTransportEnumeration;
import com.bliksemlabs.ojp.model.TramSubmodesOfTransportEnumeration;
import com.bliksemlabs.ojp.model.VehicleModesOfTransportEnumeration;
import com.bliksemlabs.ojp.model.WaterSubmodesOfTransportEnumeration;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * [a specialisation of MODE in TMv6] an extended range of VEHICLE MODEs, aggregating them with some SUBMODEs
 * 
 * <p>Classe Java per ModeStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ModeStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}ModeGroup"/&gt;
 *         &lt;element name="Name" type="{http://www.vdv.de/ojp}InternationalTextStructure" minOccurs="0"/&gt;
 *         &lt;element name="ShortName" type="{http://www.vdv.de/ojp}InternationalTextStructure" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.vdv.de/ojp}InternationalTextStructure" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModeStructure", propOrder = {
    "ptMode",
    "airSubmode",
    "busSubmode",
    "coachSubmode",
    "funicularSubmode",
    "metroSubmode",
    "tramSubmode",
    "telecabinSubmode",
    "railSubmode",
    "waterSubmode",
    "taxiSubmode",
    "name",
    "shortName",
    "description"
})
public class ModeStructure {

    @XmlElement(name = "PtMode", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected VehicleModesOfTransportEnumeration ptMode;
    @XmlElement(name = "AirSubmode", namespace = "http://www.siri.org.uk/siri", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected AirSubmodesOfTransportEnumeration airSubmode;
    @XmlElement(name = "BusSubmode", namespace = "http://www.siri.org.uk/siri", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected BusSubmodesOfTransportEnumeration busSubmode;
    @XmlElement(name = "CoachSubmode", namespace = "http://www.siri.org.uk/siri", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected CoachSubmodesOfTransportEnumeration coachSubmode;
    @XmlElement(name = "FunicularSubmode", namespace = "http://www.siri.org.uk/siri", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected FunicularSubmodesOfTransportEnumeration funicularSubmode;
    @XmlElement(name = "MetroSubmode", namespace = "http://www.siri.org.uk/siri", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected MetroSubmodesOfTransportEnumeration metroSubmode;
    @XmlElement(name = "TramSubmode", namespace = "http://www.siri.org.uk/siri", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected TramSubmodesOfTransportEnumeration tramSubmode;
    @XmlElement(name = "TelecabinSubmode", namespace = "http://www.siri.org.uk/siri", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected TelecabinSubmodesOfTransportEnumeration telecabinSubmode;
    @XmlElement(name = "RailSubmode", namespace = "http://www.siri.org.uk/siri", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected RailSubmodesOfTransportEnumeration railSubmode;
    @XmlElement(name = "WaterSubmode", namespace = "http://www.siri.org.uk/siri", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected WaterSubmodesOfTransportEnumeration waterSubmode;
    @XmlElement(name = "TaxiSubmode", namespace = "http://www.siri.org.uk/siri", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected TaxiSubmodesOfTransportEnumeration taxiSubmode;
    @XmlElement(name = "Name")
    protected InternationalTextStructure name;
    @XmlElement(name = "ShortName")
    protected InternationalTextStructure shortName;
    @XmlElement(name = "Description")
    protected InternationalTextStructure description;

    /**
     * Recupera il valore della proprietà ptMode.
     * 
     * @return
     *     possible object is
     *     {@link VehicleModesOfTransportEnumeration }
     *     
     */
    public VehicleModesOfTransportEnumeration getPtMode() {
        return ptMode;
    }

    /**
     * Imposta il valore della proprietà ptMode.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleModesOfTransportEnumeration }
     *     
     */
    public void setPtMode(VehicleModesOfTransportEnumeration value) {
        this.ptMode = value;
    }

    /**
     * Recupera il valore della proprietà airSubmode.
     * 
     * @return
     *     possible object is
     *     {@link AirSubmodesOfTransportEnumeration }
     *     
     */
    public AirSubmodesOfTransportEnumeration getAirSubmode() {
        return airSubmode;
    }

    /**
     * Imposta il valore della proprietà airSubmode.
     * 
     * @param value
     *     allowed object is
     *     {@link AirSubmodesOfTransportEnumeration }
     *     
     */
    public void setAirSubmode(AirSubmodesOfTransportEnumeration value) {
        this.airSubmode = value;
    }

    /**
     * Recupera il valore della proprietà busSubmode.
     * 
     * @return
     *     possible object is
     *     {@link BusSubmodesOfTransportEnumeration }
     *     
     */
    public BusSubmodesOfTransportEnumeration getBusSubmode() {
        return busSubmode;
    }

    /**
     * Imposta il valore della proprietà busSubmode.
     * 
     * @param value
     *     allowed object is
     *     {@link BusSubmodesOfTransportEnumeration }
     *     
     */
    public void setBusSubmode(BusSubmodesOfTransportEnumeration value) {
        this.busSubmode = value;
    }

    /**
     * Recupera il valore della proprietà coachSubmode.
     * 
     * @return
     *     possible object is
     *     {@link CoachSubmodesOfTransportEnumeration }
     *     
     */
    public CoachSubmodesOfTransportEnumeration getCoachSubmode() {
        return coachSubmode;
    }

    /**
     * Imposta il valore della proprietà coachSubmode.
     * 
     * @param value
     *     allowed object is
     *     {@link CoachSubmodesOfTransportEnumeration }
     *     
     */
    public void setCoachSubmode(CoachSubmodesOfTransportEnumeration value) {
        this.coachSubmode = value;
    }

    /**
     * Recupera il valore della proprietà funicularSubmode.
     * 
     * @return
     *     possible object is
     *     {@link FunicularSubmodesOfTransportEnumeration }
     *     
     */
    public FunicularSubmodesOfTransportEnumeration getFunicularSubmode() {
        return funicularSubmode;
    }

    /**
     * Imposta il valore della proprietà funicularSubmode.
     * 
     * @param value
     *     allowed object is
     *     {@link FunicularSubmodesOfTransportEnumeration }
     *     
     */
    public void setFunicularSubmode(FunicularSubmodesOfTransportEnumeration value) {
        this.funicularSubmode = value;
    }

    /**
     * Recupera il valore della proprietà metroSubmode.
     * 
     * @return
     *     possible object is
     *     {@link MetroSubmodesOfTransportEnumeration }
     *     
     */
    public MetroSubmodesOfTransportEnumeration getMetroSubmode() {
        return metroSubmode;
    }

    /**
     * Imposta il valore della proprietà metroSubmode.
     * 
     * @param value
     *     allowed object is
     *     {@link MetroSubmodesOfTransportEnumeration }
     *     
     */
    public void setMetroSubmode(MetroSubmodesOfTransportEnumeration value) {
        this.metroSubmode = value;
    }

    /**
     * Recupera il valore della proprietà tramSubmode.
     * 
     * @return
     *     possible object is
     *     {@link TramSubmodesOfTransportEnumeration }
     *     
     */
    public TramSubmodesOfTransportEnumeration getTramSubmode() {
        return tramSubmode;
    }

    /**
     * Imposta il valore della proprietà tramSubmode.
     * 
     * @param value
     *     allowed object is
     *     {@link TramSubmodesOfTransportEnumeration }
     *     
     */
    public void setTramSubmode(TramSubmodesOfTransportEnumeration value) {
        this.tramSubmode = value;
    }

    /**
     * Recupera il valore della proprietà telecabinSubmode.
     * 
     * @return
     *     possible object is
     *     {@link TelecabinSubmodesOfTransportEnumeration }
     *     
     */
    public TelecabinSubmodesOfTransportEnumeration getTelecabinSubmode() {
        return telecabinSubmode;
    }

    /**
     * Imposta il valore della proprietà telecabinSubmode.
     * 
     * @param value
     *     allowed object is
     *     {@link TelecabinSubmodesOfTransportEnumeration }
     *     
     */
    public void setTelecabinSubmode(TelecabinSubmodesOfTransportEnumeration value) {
        this.telecabinSubmode = value;
    }

    /**
     * Recupera il valore della proprietà railSubmode.
     * 
     * @return
     *     possible object is
     *     {@link RailSubmodesOfTransportEnumeration }
     *     
     */
    public RailSubmodesOfTransportEnumeration getRailSubmode() {
        return railSubmode;
    }

    /**
     * Imposta il valore della proprietà railSubmode.
     * 
     * @param value
     *     allowed object is
     *     {@link RailSubmodesOfTransportEnumeration }
     *     
     */
    public void setRailSubmode(RailSubmodesOfTransportEnumeration value) {
        this.railSubmode = value;
    }

    /**
     * Recupera il valore della proprietà waterSubmode.
     * 
     * @return
     *     possible object is
     *     {@link WaterSubmodesOfTransportEnumeration }
     *     
     */
    public WaterSubmodesOfTransportEnumeration getWaterSubmode() {
        return waterSubmode;
    }

    /**
     * Imposta il valore della proprietà waterSubmode.
     * 
     * @param value
     *     allowed object is
     *     {@link WaterSubmodesOfTransportEnumeration }
     *     
     */
    public void setWaterSubmode(WaterSubmodesOfTransportEnumeration value) {
        this.waterSubmode = value;
    }

    /**
     * Recupera il valore della proprietà taxiSubmode.
     * 
     * @return
     *     possible object is
     *     {@link TaxiSubmodesOfTransportEnumeration }
     *     
     */
    public TaxiSubmodesOfTransportEnumeration getTaxiSubmode() {
        return taxiSubmode;
    }

    /**
     * Imposta il valore della proprietà taxiSubmode.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxiSubmodesOfTransportEnumeration }
     *     
     */
    public void setTaxiSubmode(TaxiSubmodesOfTransportEnumeration value) {
        this.taxiSubmode = value;
    }

    /**
     * Recupera il valore della proprietà name.
     * 
     * @return
     *     possible object is
     *     {@link InternationalTextStructure }
     *     
     */
    public InternationalTextStructure getName() {
        return name;
    }

    /**
     * Imposta il valore della proprietà name.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTextStructure }
     *     
     */
    public void setName(InternationalTextStructure value) {
        this.name = value;
    }

    /**
     * Recupera il valore della proprietà shortName.
     * 
     * @return
     *     possible object is
     *     {@link InternationalTextStructure }
     *     
     */
    public InternationalTextStructure getShortName() {
        return shortName;
    }

    /**
     * Imposta il valore della proprietà shortName.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTextStructure }
     *     
     */
    public void setShortName(InternationalTextStructure value) {
        this.shortName = value;
    }

    /**
     * Recupera il valore della proprietà description.
     * 
     * @return
     *     possible object is
     *     {@link InternationalTextStructure }
     *     
     */
    public InternationalTextStructure getDescription() {
        return description;
    }

    /**
     * Imposta il valore della proprietà description.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTextStructure }
     *     
     */
    public void setDescription(InternationalTextStructure value) {
        this.description = value;
    }

    public ModeStructure withPtMode(VehicleModesOfTransportEnumeration value) {
        setPtMode(value);
        return this;
    }

    public ModeStructure withAirSubmode(AirSubmodesOfTransportEnumeration value) {
        setAirSubmode(value);
        return this;
    }

    public ModeStructure withBusSubmode(BusSubmodesOfTransportEnumeration value) {
        setBusSubmode(value);
        return this;
    }

    public ModeStructure withCoachSubmode(CoachSubmodesOfTransportEnumeration value) {
        setCoachSubmode(value);
        return this;
    }

    public ModeStructure withFunicularSubmode(FunicularSubmodesOfTransportEnumeration value) {
        setFunicularSubmode(value);
        return this;
    }

    public ModeStructure withMetroSubmode(MetroSubmodesOfTransportEnumeration value) {
        setMetroSubmode(value);
        return this;
    }

    public ModeStructure withTramSubmode(TramSubmodesOfTransportEnumeration value) {
        setTramSubmode(value);
        return this;
    }

    public ModeStructure withTelecabinSubmode(TelecabinSubmodesOfTransportEnumeration value) {
        setTelecabinSubmode(value);
        return this;
    }

    public ModeStructure withRailSubmode(RailSubmodesOfTransportEnumeration value) {
        setRailSubmode(value);
        return this;
    }

    public ModeStructure withWaterSubmode(WaterSubmodesOfTransportEnumeration value) {
        setWaterSubmode(value);
        return this;
    }

    public ModeStructure withTaxiSubmode(TaxiSubmodesOfTransportEnumeration value) {
        setTaxiSubmode(value);
        return this;
    }

    public ModeStructure withName(InternationalTextStructure value) {
        setName(value);
        return this;
    }

    public ModeStructure withShortName(InternationalTextStructure value) {
        setShortName(value);
        return this;
    }

    public ModeStructure withDescription(InternationalTextStructure value) {
        setDescription(value);
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

//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package com.bliksemlabs.ojp.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import uk.org.ifopt.ifopt.AccessModesEnumeration;


/**
 * <p>Classe Java per AffectedModesStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AffectedModesStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="AllModes" type="{http://www.siri.org.uk/siri}EmptyType" minOccurs="0"/&gt;
 *         &lt;element name="Mode" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;group ref="{http://www.siri.org.uk/siri}AffectedModeGroup"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffectedModesStructure", propOrder = {
    "allModes",
    "mode"
})
public class AffectedModesStructure {

    @XmlElement(name = "AllModes")
    protected String allModes;
    @XmlElement(name = "Mode")
    protected List<AffectedModesStructure.Mode> mode;

    /**
     * Recupera il valore della proprietà allModes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllModes() {
        return allModes;
    }

    /**
     * Imposta il valore della proprietà allModes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllModes(String value) {
        this.allModes = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AffectedModesStructure.Mode }
     * 
     * 
     */
    public List<AffectedModesStructure.Mode> getMode() {
        if (mode == null) {
            mode = new ArrayList<AffectedModesStructure.Mode>();
        }
        return this.mode;
    }

    public AffectedModesStructure withAllModes(String value) {
        setAllModes(value);
        return this;
    }

    public AffectedModesStructure withMode(AffectedModesStructure.Mode... values) {
        if (values!= null) {
            for (AffectedModesStructure.Mode value: values) {
                getMode().add(value);
            }
        }
        return this;
    }

    public AffectedModesStructure withMode(Collection<AffectedModesStructure.Mode> values) {
        if (values!= null) {
            getMode().addAll(values);
        }
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


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;group ref="{http://www.siri.org.uk/siri}AffectedModeGroup"/&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "vehicleMode",
        "airSubmode",
        "busSubmode",
        "coachSubmode",
        "metroSubmode",
        "railSubmode",
        "tramSubmode",
        "waterSubmode",
        "taxiSubmode",
        "accessMode"
    })
    public static class Mode {

        @XmlElement(name = "VehicleMode", defaultValue = "unknown")
        @XmlSchemaType(name = "NMTOKEN")
        protected VehicleModesOfTransportEnumeration vehicleMode;
        @XmlElement(name = "AirSubmode", defaultValue = "unknown")
        @XmlSchemaType(name = "NMTOKEN")
        protected AirSubmodesOfTransportEnumeration airSubmode;
        @XmlElement(name = "BusSubmode", defaultValue = "unknown")
        @XmlSchemaType(name = "NMTOKEN")
        protected BusSubmodesOfTransportEnumeration busSubmode;
        @XmlElement(name = "CoachSubmode", defaultValue = "unknown")
        @XmlSchemaType(name = "NMTOKEN")
        protected CoachSubmodesOfTransportEnumeration coachSubmode;
        @XmlElement(name = "MetroSubmode", defaultValue = "unknown")
        @XmlSchemaType(name = "NMTOKEN")
        protected MetroSubmodesOfTransportEnumeration metroSubmode;
        @XmlElement(name = "RailSubmode", defaultValue = "unknown")
        @XmlSchemaType(name = "NMTOKEN")
        protected RailSubmodesOfTransportEnumeration railSubmode;
        @XmlElement(name = "TramSubmode", defaultValue = "unknown")
        @XmlSchemaType(name = "NMTOKEN")
        protected TramSubmodesOfTransportEnumeration tramSubmode;
        @XmlElement(name = "WaterSubmode", defaultValue = "unknown")
        @XmlSchemaType(name = "NMTOKEN")
        protected WaterSubmodesOfTransportEnumeration waterSubmode;
        @XmlElement(name = "TaxiSubmode", defaultValue = "unknown")
        @XmlSchemaType(name = "NMTOKEN")
        protected TaxiSubmodesOfTransportEnumeration taxiSubmode;
        @XmlElement(name = "AccessMode")
        @XmlSchemaType(name = "string")
        protected AccessModesEnumeration accessMode;

        /**
         * Recupera il valore della proprietà vehicleMode.
         * 
         * @return
         *     possible object is
         *     {@link VehicleModesOfTransportEnumeration }
         *     
         */
        public VehicleModesOfTransportEnumeration getVehicleMode() {
            return vehicleMode;
        }

        /**
         * Imposta il valore della proprietà vehicleMode.
         * 
         * @param value
         *     allowed object is
         *     {@link VehicleModesOfTransportEnumeration }
         *     
         */
        public void setVehicleMode(VehicleModesOfTransportEnumeration value) {
            this.vehicleMode = value;
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
         * Recupera il valore della proprietà accessMode.
         * 
         * @return
         *     possible object is
         *     {@link AccessModesEnumeration }
         *     
         */
        public AccessModesEnumeration getAccessMode() {
            return accessMode;
        }

        /**
         * Imposta il valore della proprietà accessMode.
         * 
         * @param value
         *     allowed object is
         *     {@link AccessModesEnumeration }
         *     
         */
        public void setAccessMode(AccessModesEnumeration value) {
            this.accessMode = value;
        }

        public AffectedModesStructure.Mode withVehicleMode(VehicleModesOfTransportEnumeration value) {
            setVehicleMode(value);
            return this;
        }

        public AffectedModesStructure.Mode withAirSubmode(AirSubmodesOfTransportEnumeration value) {
            setAirSubmode(value);
            return this;
        }

        public AffectedModesStructure.Mode withBusSubmode(BusSubmodesOfTransportEnumeration value) {
            setBusSubmode(value);
            return this;
        }

        public AffectedModesStructure.Mode withCoachSubmode(CoachSubmodesOfTransportEnumeration value) {
            setCoachSubmode(value);
            return this;
        }

        public AffectedModesStructure.Mode withMetroSubmode(MetroSubmodesOfTransportEnumeration value) {
            setMetroSubmode(value);
            return this;
        }

        public AffectedModesStructure.Mode withRailSubmode(RailSubmodesOfTransportEnumeration value) {
            setRailSubmode(value);
            return this;
        }

        public AffectedModesStructure.Mode withTramSubmode(TramSubmodesOfTransportEnumeration value) {
            setTramSubmode(value);
            return this;
        }

        public AffectedModesStructure.Mode withWaterSubmode(WaterSubmodesOfTransportEnumeration value) {
            setWaterSubmode(value);
            return this;
        }

        public AffectedModesStructure.Mode withTaxiSubmode(TaxiSubmodesOfTransportEnumeration value) {
            setTaxiSubmode(value);
            return this;
        }

        public AffectedModesStructure.Mode withAccessMode(AccessModesEnumeration value) {
            setAccessMode(value);
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

}

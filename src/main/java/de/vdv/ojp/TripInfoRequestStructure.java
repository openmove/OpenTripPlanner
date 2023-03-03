//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package de.vdv.ojp;

import java.time.LocalDateTime;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.bliksemlabs.ojp.model.VehicleRefStructure;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.LocalDateTimeISO8601XmlAdapter;


/**
 * <p>Classe Java per TripInfoRequestStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TripInfoRequestStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}TripInfoRequestGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TripInfoRequestStructure", propOrder = {
    "journeyRef",
    "operatingDayRef",
    "vehicleRef",
    "timeOfOperation",
    "params"
})
public class TripInfoRequestStructure {

    @XmlElement(name = "JourneyRef")
    protected JourneyRefStructure journeyRef;
    @XmlElement(name = "OperatingDayRef")
    protected OperatingDayRefStructure operatingDayRef;
    @XmlElement(name = "VehicleRef", namespace = "http://www.siri.org.uk/siri")
    protected VehicleRefStructure vehicleRef;
    @XmlElement(name = "TimeOfOperation", type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime timeOfOperation;
    @XmlElement(name = "Params")
    protected TripInfoParamStructure params;

    /**
     * Recupera il valore della proprietà journeyRef.
     * 
     * @return
     *     possible object is
     *     {@link JourneyRefStructure }
     *     
     */
    public JourneyRefStructure getJourneyRef() {
        return journeyRef;
    }

    /**
     * Imposta il valore della proprietà journeyRef.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyRefStructure }
     *     
     */
    public void setJourneyRef(JourneyRefStructure value) {
        this.journeyRef = value;
    }

    /**
     * Recupera il valore della proprietà operatingDayRef.
     * 
     * @return
     *     possible object is
     *     {@link OperatingDayRefStructure }
     *     
     */
    public OperatingDayRefStructure getOperatingDayRef() {
        return operatingDayRef;
    }

    /**
     * Imposta il valore della proprietà operatingDayRef.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingDayRefStructure }
     *     
     */
    public void setOperatingDayRef(OperatingDayRefStructure value) {
        this.operatingDayRef = value;
    }

    /**
     * Recupera il valore della proprietà vehicleRef.
     * 
     * @return
     *     possible object is
     *     {@link VehicleRefStructure }
     *     
     */
    public VehicleRefStructure getVehicleRef() {
        return vehicleRef;
    }

    /**
     * Imposta il valore della proprietà vehicleRef.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRefStructure }
     *     
     */
    public void setVehicleRef(VehicleRefStructure value) {
        this.vehicleRef = value;
    }

    /**
     * Recupera il valore della proprietà timeOfOperation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getTimeOfOperation() {
        return timeOfOperation;
    }

    /**
     * Imposta il valore della proprietà timeOfOperation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeOfOperation(LocalDateTime value) {
        this.timeOfOperation = value;
    }

    /**
     * Recupera il valore della proprietà params.
     * 
     * @return
     *     possible object is
     *     {@link TripInfoParamStructure }
     *     
     */
    public TripInfoParamStructure getParams() {
        return params;
    }

    /**
     * Imposta il valore della proprietà params.
     * 
     * @param value
     *     allowed object is
     *     {@link TripInfoParamStructure }
     *     
     */
    public void setParams(TripInfoParamStructure value) {
        this.params = value;
    }

    public TripInfoRequestStructure withJourneyRef(JourneyRefStructure value) {
        setJourneyRef(value);
        return this;
    }

    public TripInfoRequestStructure withOperatingDayRef(OperatingDayRefStructure value) {
        setOperatingDayRef(value);
        return this;
    }

    public TripInfoRequestStructure withVehicleRef(VehicleRefStructure value) {
        setVehicleRef(value);
        return this;
    }

    public TripInfoRequestStructure withTimeOfOperation(LocalDateTime value) {
        setTimeOfOperation(value);
        return this;
    }

    public TripInfoRequestStructure withParams(TripInfoParamStructure value) {
        setParams(value);
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

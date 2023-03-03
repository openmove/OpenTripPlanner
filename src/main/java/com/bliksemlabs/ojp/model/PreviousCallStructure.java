//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package com.bliksemlabs.ojp.model;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.Collection;
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
 * <p>Classe Java per PreviousCallStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PreviousCallStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractMonitoredCallStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}VehicleAtStop" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}VehicleArrivalTimesGroup"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}VehicleDepartureTimesGroup"/&gt;
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
@XmlType(name = "PreviousCallStructure", propOrder = {
    "vehicleAtStop",
    "aimedArrivalTime",
    "actualArrivalTime",
    "expectedArrivalTime",
    "aimedDepartureTime",
    "actualDepartureTime",
    "expectedDepartureTime",
    "extensions"
})
public class PreviousCallStructure
    extends AbstractMonitoredCallStructure
{

    @XmlElement(name = "VehicleAtStop", defaultValue = "false")
    protected Boolean vehicleAtStop;
    @XmlElement(name = "AimedArrivalTime", type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime aimedArrivalTime;
    @XmlElement(name = "ActualArrivalTime", type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime actualArrivalTime;
    @XmlElement(name = "ExpectedArrivalTime", type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime expectedArrivalTime;
    @XmlElement(name = "AimedDepartureTime", type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime aimedDepartureTime;
    @XmlElement(name = "ActualDepartureTime", type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime actualDepartureTime;
    @XmlElement(name = "ExpectedDepartureTime", type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime expectedDepartureTime;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Recupera il valore della proprietà vehicleAtStop.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVehicleAtStop() {
        return vehicleAtStop;
    }

    /**
     * Imposta il valore della proprietà vehicleAtStop.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVehicleAtStop(Boolean value) {
        this.vehicleAtStop = value;
    }

    /**
     * Recupera il valore della proprietà aimedArrivalTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getAimedArrivalTime() {
        return aimedArrivalTime;
    }

    /**
     * Imposta il valore della proprietà aimedArrivalTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAimedArrivalTime(LocalDateTime value) {
        this.aimedArrivalTime = value;
    }

    /**
     * Recupera il valore della proprietà actualArrivalTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getActualArrivalTime() {
        return actualArrivalTime;
    }

    /**
     * Imposta il valore della proprietà actualArrivalTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualArrivalTime(LocalDateTime value) {
        this.actualArrivalTime = value;
    }

    /**
     * Recupera il valore della proprietà expectedArrivalTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getExpectedArrivalTime() {
        return expectedArrivalTime;
    }

    /**
     * Imposta il valore della proprietà expectedArrivalTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpectedArrivalTime(LocalDateTime value) {
        this.expectedArrivalTime = value;
    }

    /**
     * Recupera il valore della proprietà aimedDepartureTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getAimedDepartureTime() {
        return aimedDepartureTime;
    }

    /**
     * Imposta il valore della proprietà aimedDepartureTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAimedDepartureTime(LocalDateTime value) {
        this.aimedDepartureTime = value;
    }

    /**
     * Recupera il valore della proprietà actualDepartureTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getActualDepartureTime() {
        return actualDepartureTime;
    }

    /**
     * Imposta il valore della proprietà actualDepartureTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualDepartureTime(LocalDateTime value) {
        this.actualDepartureTime = value;
    }

    /**
     * Recupera il valore della proprietà expectedDepartureTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getExpectedDepartureTime() {
        return expectedDepartureTime;
    }

    /**
     * Imposta il valore della proprietà expectedDepartureTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpectedDepartureTime(LocalDateTime value) {
        this.expectedDepartureTime = value;
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

    public PreviousCallStructure withVehicleAtStop(Boolean value) {
        setVehicleAtStop(value);
        return this;
    }

    public PreviousCallStructure withAimedArrivalTime(LocalDateTime value) {
        setAimedArrivalTime(value);
        return this;
    }

    public PreviousCallStructure withActualArrivalTime(LocalDateTime value) {
        setActualArrivalTime(value);
        return this;
    }

    public PreviousCallStructure withExpectedArrivalTime(LocalDateTime value) {
        setExpectedArrivalTime(value);
        return this;
    }

    public PreviousCallStructure withAimedDepartureTime(LocalDateTime value) {
        setAimedDepartureTime(value);
        return this;
    }

    public PreviousCallStructure withActualDepartureTime(LocalDateTime value) {
        setActualDepartureTime(value);
        return this;
    }

    public PreviousCallStructure withExpectedDepartureTime(LocalDateTime value) {
        setExpectedDepartureTime(value);
        return this;
    }

    public PreviousCallStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public PreviousCallStructure withStopPointRef(StopPointRefStructure value) {
        setStopPointRef(value);
        return this;
    }

    @Override
    public PreviousCallStructure withVisitNumber(BigInteger value) {
        setVisitNumber(value);
        return this;
    }

    @Override
    public PreviousCallStructure withOrder(BigInteger value) {
        setOrder(value);
        return this;
    }

    @Override
    public PreviousCallStructure withStopPointName(NaturalLanguageStringStructure... values) {
        if (values!= null) {
            for (NaturalLanguageStringStructure value: values) {
                getStopPointName().add(value);
            }
        }
        return this;
    }

    @Override
    public PreviousCallStructure withStopPointName(Collection<NaturalLanguageStringStructure> values) {
        if (values!= null) {
            getStopPointName().addAll(values);
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

}

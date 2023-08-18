//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package de.vdv.ojp;

import java.time.Duration;
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
import com.migesok.jaxb.adapter.javatime.DurationXmlAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.LocalDateTimeISO8601XmlAdapter;


/**
 * [a view of PLACE in TMv6] a PLACE and access to it by individual transport 
 * 
 * <p>Classe Java per PlaceContextStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PlaceContextStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="PlaceRef" type="{http://www.vdv.de/ojp}PlaceRefStructure"/&gt;
 *           &lt;element name="TripLocation" type="{http://www.vdv.de/ojp}TripLocationStructure"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="DepArrTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *           &lt;element name="TimeAllowance" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="IndividualTransportOptions" type="{http://www.vdv.de/ojp}IndividualTransportOptionsStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlaceContextStructure", propOrder = {
    "placeRef",
    "tripLocation",
    "depArrTime",
    "timeAllowance",
    "individualTransportOptions"
})
public class PlaceContextStructure {

    @XmlElement(name = "PlaceRef")
    protected PlaceRefStructure placeRef;
    @XmlElement(name = "TripLocation")
    protected TripLocationStructure tripLocation;
    @XmlElement(name = "DepArrTime", type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime depArrTime;
    @XmlElement(name = "TimeAllowance", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration timeAllowance;
    @XmlElement(name = "IndividualTransportOptions")
    protected List<IndividualTransportOptionsStructure> individualTransportOptions;

    /**
     * Recupera il valore della proprietà placeRef.
     * 
     * @return
     *     possible object is
     *     {@link PlaceRefStructure }
     *     
     */
    public PlaceRefStructure getPlaceRef() {
        return placeRef;
    }

    /**
     * Imposta il valore della proprietà placeRef.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceRefStructure }
     *     
     */
    public void setPlaceRef(PlaceRefStructure value) {
        this.placeRef = value;
    }

    /**
     * Recupera il valore della proprietà tripLocation.
     * 
     * @return
     *     possible object is
     *     {@link TripLocationStructure }
     *     
     */
    public TripLocationStructure getTripLocation() {
        return tripLocation;
    }

    /**
     * Imposta il valore della proprietà tripLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link TripLocationStructure }
     *     
     */
    public void setTripLocation(TripLocationStructure value) {
        this.tripLocation = value;
    }

    /**
     * Recupera il valore della proprietà depArrTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getDepArrTime() {
        return depArrTime;
    }

    /**
     * Imposta il valore della proprietà depArrTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepArrTime(LocalDateTime value) {
        this.depArrTime = value;
    }

    /**
     * Recupera il valore della proprietà timeAllowance.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getTimeAllowance() {
        return timeAllowance;
    }

    /**
     * Imposta il valore della proprietà timeAllowance.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeAllowance(Duration value) {
        this.timeAllowance = value;
    }

    /**
     * Gets the value of the individualTransportOptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the individualTransportOptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndividualTransportOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndividualTransportOptionsStructure }
     * 
     * 
     */
    public List<IndividualTransportOptionsStructure> getIndividualTransportOptions() {
        if (individualTransportOptions == null) {
            individualTransportOptions = new ArrayList<IndividualTransportOptionsStructure>();
        }
        return this.individualTransportOptions;
    }

    public PlaceContextStructure withPlaceRef(PlaceRefStructure value) {
        setPlaceRef(value);
        return this;
    }

    public PlaceContextStructure withTripLocation(TripLocationStructure value) {
        setTripLocation(value);
        return this;
    }

    public PlaceContextStructure withDepArrTime(LocalDateTime value) {
        setDepArrTime(value);
        return this;
    }

    public PlaceContextStructure withTimeAllowance(Duration value) {
        setTimeAllowance(value);
        return this;
    }

    public PlaceContextStructure withIndividualTransportOptions(IndividualTransportOptionsStructure... values) {
        if (values!= null) {
            for (IndividualTransportOptionsStructure value: values) {
                getIndividualTransportOptions().add(value);
            }
        }
        return this;
    }

    public PlaceContextStructure withIndividualTransportOptions(Collection<IndividualTransportOptionsStructure> values) {
        if (values!= null) {
            getIndividualTransportOptions().addAll(values);
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

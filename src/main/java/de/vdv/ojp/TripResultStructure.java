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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * Structure for a single trip result and its accompanying error messages.
 * 
 * <p>Classe Java per TripResultStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TripResultStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResultId" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN"/&gt;
 *         &lt;element name="ErrorMessage" type="{http://www.vdv.de/ojp}ErrorMessageStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="Trip" type="{http://www.vdv.de/ojp}TripStructure"/&gt;
 *           &lt;element name="TripSummary" type="{http://www.vdv.de/ojp}TripSummaryStructure"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="TripFare" type="{http://www.vdv.de/ojp}TripFareResultStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TripResultStructure", propOrder = {
    "resultId",
    "errorMessage",
    "trip",
    "tripSummary",
    "tripFare"
})
public class TripResultStructure {

    @XmlElement(name = "ResultId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String resultId;
    @XmlElement(name = "ErrorMessage")
    protected List<ErrorMessageStructure> errorMessage;
    @XmlElement(name = "Trip")
    protected TripStructure trip;
    @XmlElement(name = "TripSummary")
    protected TripSummaryStructure tripSummary;
    @XmlElement(name = "TripFare")
    protected List<TripFareResultStructure> tripFare;

    /**
     * Recupera il valore della proprietà resultId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultId() {
        return resultId;
    }

    /**
     * Imposta il valore della proprietà resultId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultId(String value) {
        this.resultId = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errorMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorMessageStructure }
     * 
     * 
     */
    public List<ErrorMessageStructure> getErrorMessage() {
        if (errorMessage == null) {
            errorMessage = new ArrayList<ErrorMessageStructure>();
        }
        return this.errorMessage;
    }

    /**
     * Recupera il valore della proprietà trip.
     * 
     * @return
     *     possible object is
     *     {@link TripStructure }
     *     
     */
    public TripStructure getTrip() {
        return trip;
    }

    /**
     * Imposta il valore della proprietà trip.
     * 
     * @param value
     *     allowed object is
     *     {@link TripStructure }
     *     
     */
    public void setTrip(TripStructure value) {
        this.trip = value;
    }

    /**
     * Recupera il valore della proprietà tripSummary.
     * 
     * @return
     *     possible object is
     *     {@link TripSummaryStructure }
     *     
     */
    public TripSummaryStructure getTripSummary() {
        return tripSummary;
    }

    /**
     * Imposta il valore della proprietà tripSummary.
     * 
     * @param value
     *     allowed object is
     *     {@link TripSummaryStructure }
     *     
     */
    public void setTripSummary(TripSummaryStructure value) {
        this.tripSummary = value;
    }

    /**
     * Gets the value of the tripFare property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tripFare property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTripFare().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TripFareResultStructure }
     * 
     * 
     */
    public List<TripFareResultStructure> getTripFare() {
        if (tripFare == null) {
            tripFare = new ArrayList<TripFareResultStructure>();
        }
        return this.tripFare;
    }

    public TripResultStructure withResultId(String value) {
        setResultId(value);
        return this;
    }

    public TripResultStructure withErrorMessage(ErrorMessageStructure... values) {
        if (values!= null) {
            for (ErrorMessageStructure value: values) {
                getErrorMessage().add(value);
            }
        }
        return this;
    }

    public TripResultStructure withErrorMessage(Collection<ErrorMessageStructure> values) {
        if (values!= null) {
            getErrorMessage().addAll(values);
        }
        return this;
    }

    public TripResultStructure withTrip(TripStructure value) {
        setTrip(value);
        return this;
    }

    public TripResultStructure withTripSummary(TripSummaryStructure value) {
        setTripSummary(value);
        return this;
    }

    public TripResultStructure withTripFare(TripFareResultStructure... values) {
        if (values!= null) {
            for (TripFareResultStructure value: values) {
                getTripFare().add(value);
            }
        }
        return this;
    }

    public TripResultStructure withTripFare(Collection<TripFareResultStructure> values) {
        if (values!= null) {
            getTripFare().addAll(values);
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

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
 * Wrapper element for Fare results.
 * 
 * <p>Classe Java per FareResultStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="FareResultStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResultId" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="StopFareResult" type="{http://www.vdv.de/ojp}StopFareResultStructure"/&gt;
 *           &lt;element name="StaticFareResult" type="{http://www.vdv.de/ojp}StaticFareResultStructure"/&gt;
 *           &lt;element name="TripFareResult" type="{http://www.vdv.de/ojp}TripFareResultStructure" maxOccurs="unbounded"/&gt;
 *           &lt;element name="MultiTripFareResult" type="{http://www.vdv.de/ojp}MultiTripFareResultStructure" maxOccurs="unbounded"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareResultStructure", propOrder = {
    "resultId",
    "stopFareResult",
    "staticFareResult",
    "tripFareResult",
    "multiTripFareResult"
})
public class FareResultStructure {

    @XmlElement(name = "ResultId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String resultId;
    @XmlElement(name = "StopFareResult")
    protected StopFareResultStructure stopFareResult;
    @XmlElement(name = "StaticFareResult")
    protected StaticFareResultStructure staticFareResult;
    @XmlElement(name = "TripFareResult")
    protected List<TripFareResultStructure> tripFareResult;
    @XmlElement(name = "MultiTripFareResult")
    protected List<MultiTripFareResultStructure> multiTripFareResult;

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
     * Recupera il valore della proprietà stopFareResult.
     * 
     * @return
     *     possible object is
     *     {@link StopFareResultStructure }
     *     
     */
    public StopFareResultStructure getStopFareResult() {
        return stopFareResult;
    }

    /**
     * Imposta il valore della proprietà stopFareResult.
     * 
     * @param value
     *     allowed object is
     *     {@link StopFareResultStructure }
     *     
     */
    public void setStopFareResult(StopFareResultStructure value) {
        this.stopFareResult = value;
    }

    /**
     * Recupera il valore della proprietà staticFareResult.
     * 
     * @return
     *     possible object is
     *     {@link StaticFareResultStructure }
     *     
     */
    public StaticFareResultStructure getStaticFareResult() {
        return staticFareResult;
    }

    /**
     * Imposta il valore della proprietà staticFareResult.
     * 
     * @param value
     *     allowed object is
     *     {@link StaticFareResultStructure }
     *     
     */
    public void setStaticFareResult(StaticFareResultStructure value) {
        this.staticFareResult = value;
    }

    /**
     * Gets the value of the tripFareResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tripFareResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTripFareResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TripFareResultStructure }
     * 
     * 
     */
    public List<TripFareResultStructure> getTripFareResult() {
        if (tripFareResult == null) {
            tripFareResult = new ArrayList<TripFareResultStructure>();
        }
        return this.tripFareResult;
    }

    /**
     * Gets the value of the multiTripFareResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the multiTripFareResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMultiTripFareResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MultiTripFareResultStructure }
     * 
     * 
     */
    public List<MultiTripFareResultStructure> getMultiTripFareResult() {
        if (multiTripFareResult == null) {
            multiTripFareResult = new ArrayList<MultiTripFareResultStructure>();
        }
        return this.multiTripFareResult;
    }

    public FareResultStructure withResultId(String value) {
        setResultId(value);
        return this;
    }

    public FareResultStructure withStopFareResult(StopFareResultStructure value) {
        setStopFareResult(value);
        return this;
    }

    public FareResultStructure withStaticFareResult(StaticFareResultStructure value) {
        setStaticFareResult(value);
        return this;
    }

    public FareResultStructure withTripFareResult(TripFareResultStructure... values) {
        if (values!= null) {
            for (TripFareResultStructure value: values) {
                getTripFareResult().add(value);
            }
        }
        return this;
    }

    public FareResultStructure withTripFareResult(Collection<TripFareResultStructure> values) {
        if (values!= null) {
            getTripFareResult().addAll(values);
        }
        return this;
    }

    public FareResultStructure withMultiTripFareResult(MultiTripFareResultStructure... values) {
        if (values!= null) {
            for (MultiTripFareResultStructure value: values) {
                getMultiTripFareResult().add(value);
            }
        }
        return this;
    }

    public FareResultStructure withMultiTripFareResult(Collection<MultiTripFareResultStructure> values) {
        if (values!= null) {
            getMultiTripFareResult().addAll(values);
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

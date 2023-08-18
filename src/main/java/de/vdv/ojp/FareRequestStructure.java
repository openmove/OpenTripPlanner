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
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * Fare request element.
 * 
 * <p>Classe Java per FareRequestStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="FareRequestStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}FareRequestGroup"/&gt;
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
@XmlType(name = "FareRequestStructure", propOrder = {
    "stopFareRequest",
    "staticFareRequest",
    "tripFareRequest",
    "multiTripFareRequest",
    "params",
    "extension"
})
public class FareRequestStructure {

    @XmlElement(name = "StopFareRequest")
    protected StopFareRequestStructure stopFareRequest;
    @XmlElement(name = "StaticFareRequest")
    protected StaticFareRequestStructure staticFareRequest;
    @XmlElement(name = "TripFareRequest")
    protected TripFareRequestStructure tripFareRequest;
    @XmlElement(name = "MultiTripFareRequest")
    protected MultiTripFareRequestStructure multiTripFareRequest;
    @XmlElement(name = "Params")
    protected FareParamStructure params;
    @XmlElement(name = "Extension")
    protected Object extension;

    /**
     * Recupera il valore della proprietà stopFareRequest.
     * 
     * @return
     *     possible object is
     *     {@link StopFareRequestStructure }
     *     
     */
    public StopFareRequestStructure getStopFareRequest() {
        return stopFareRequest;
    }

    /**
     * Imposta il valore della proprietà stopFareRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link StopFareRequestStructure }
     *     
     */
    public void setStopFareRequest(StopFareRequestStructure value) {
        this.stopFareRequest = value;
    }

    /**
     * Recupera il valore della proprietà staticFareRequest.
     * 
     * @return
     *     possible object is
     *     {@link StaticFareRequestStructure }
     *     
     */
    public StaticFareRequestStructure getStaticFareRequest() {
        return staticFareRequest;
    }

    /**
     * Imposta il valore della proprietà staticFareRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link StaticFareRequestStructure }
     *     
     */
    public void setStaticFareRequest(StaticFareRequestStructure value) {
        this.staticFareRequest = value;
    }

    /**
     * Recupera il valore della proprietà tripFareRequest.
     * 
     * @return
     *     possible object is
     *     {@link TripFareRequestStructure }
     *     
     */
    public TripFareRequestStructure getTripFareRequest() {
        return tripFareRequest;
    }

    /**
     * Imposta il valore della proprietà tripFareRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link TripFareRequestStructure }
     *     
     */
    public void setTripFareRequest(TripFareRequestStructure value) {
        this.tripFareRequest = value;
    }

    /**
     * Recupera il valore della proprietà multiTripFareRequest.
     * 
     * @return
     *     possible object is
     *     {@link MultiTripFareRequestStructure }
     *     
     */
    public MultiTripFareRequestStructure getMultiTripFareRequest() {
        return multiTripFareRequest;
    }

    /**
     * Imposta il valore della proprietà multiTripFareRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiTripFareRequestStructure }
     *     
     */
    public void setMultiTripFareRequest(MultiTripFareRequestStructure value) {
        this.multiTripFareRequest = value;
    }

    /**
     * Recupera il valore della proprietà params.
     * 
     * @return
     *     possible object is
     *     {@link FareParamStructure }
     *     
     */
    public FareParamStructure getParams() {
        return params;
    }

    /**
     * Imposta il valore della proprietà params.
     * 
     * @param value
     *     allowed object is
     *     {@link FareParamStructure }
     *     
     */
    public void setParams(FareParamStructure value) {
        this.params = value;
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

    public FareRequestStructure withStopFareRequest(StopFareRequestStructure value) {
        setStopFareRequest(value);
        return this;
    }

    public FareRequestStructure withStaticFareRequest(StaticFareRequestStructure value) {
        setStaticFareRequest(value);
        return this;
    }

    public FareRequestStructure withTripFareRequest(TripFareRequestStructure value) {
        setTripFareRequest(value);
        return this;
    }

    public FareRequestStructure withMultiTripFareRequest(MultiTripFareRequestStructure value) {
        setMultiTripFareRequest(value);
        return this;
    }

    public FareRequestStructure withParams(FareParamStructure value) {
        setParams(value);
        return this;
    }

    public FareRequestStructure withExtension(Object value) {
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

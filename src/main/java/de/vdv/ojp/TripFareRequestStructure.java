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
 * Structure of a Single Trip Fare Request.
 * 
 * <p>Classe Java per TripFareRequestStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TripFareRequestStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Trip" type="{http://www.vdv.de/ojp}TripStructure"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TripFareRequestStructure", propOrder = {
    "trip"
})
public class TripFareRequestStructure {

    @XmlElement(name = "Trip", required = true)
    protected TripStructure trip;

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

    public TripFareRequestStructure withTrip(TripStructure value) {
        setTrip(value);
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

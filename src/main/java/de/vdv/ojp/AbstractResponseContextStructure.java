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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * Abstract structure providing response contexts related to journeys.
 * 
 * <p>Classe Java per AbstractResponseContextStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AbstractResponseContextStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Places" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Location" type="{http://www.vdv.de/ojp}PlaceStructure" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Situations" type="{http://www.vdv.de/ojp}SituationsStructure" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractResponseContextStructure", propOrder = {
    "places",
    "situations"
})
@XmlSeeAlso({
    TripResponseContextStructure.class,
    StopEventResponseContextStructure.class,
    TripInfoResponseContextStructure.class
})
public class AbstractResponseContextStructure {

    @XmlElement(name = "Places")
    protected AbstractResponseContextStructure.Places places;
    @XmlElement(name = "Situations")
    protected SituationsStructure situations;

    /**
     * Recupera il valore della proprietà places.
     * 
     * @return
     *     possible object is
     *     {@link AbstractResponseContextStructure.Places }
     *     
     */
    public AbstractResponseContextStructure.Places getPlaces() {
        return places;
    }

    /**
     * Imposta il valore della proprietà places.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractResponseContextStructure.Places }
     *     
     */
    public void setPlaces(AbstractResponseContextStructure.Places value) {
        this.places = value;
    }

    /**
     * Recupera il valore della proprietà situations.
     * 
     * @return
     *     possible object is
     *     {@link SituationsStructure }
     *     
     */
    public SituationsStructure getSituations() {
        return situations;
    }

    /**
     * Imposta il valore della proprietà situations.
     * 
     * @param value
     *     allowed object is
     *     {@link SituationsStructure }
     *     
     */
    public void setSituations(SituationsStructure value) {
        this.situations = value;
    }

    public AbstractResponseContextStructure withPlaces(AbstractResponseContextStructure.Places value) {
        setPlaces(value);
        return this;
    }

    public AbstractResponseContextStructure withSituations(SituationsStructure value) {
        setSituations(value);
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
     *       &lt;sequence&gt;
     *         &lt;element name="Location" type="{http://www.vdv.de/ojp}PlaceStructure" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "location"
    })
    public static class Places {

        @XmlElement(name = "Location", required = true)
        protected List<PlaceStructure> location;

        /**
         * Gets the value of the location property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the location property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLocation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PlaceStructure }
         * 
         * 
         */
        public List<PlaceStructure> getLocation() {
            if (location == null) {
                location = new ArrayList<PlaceStructure>();
            }
            return this.location;
        }

        public AbstractResponseContextStructure.Places withLocation(PlaceStructure... values) {
            if (values!= null) {
                for (PlaceStructure value: values) {
                    getLocation().add(value);
                }
            }
            return this;
        }

        public AbstractResponseContextStructure.Places withLocation(Collection<PlaceStructure> values) {
            if (values!= null) {
                getLocation().addAll(values);
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

}

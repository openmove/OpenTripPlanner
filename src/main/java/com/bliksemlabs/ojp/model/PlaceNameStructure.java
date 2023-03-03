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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per PlaceNameStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PlaceNameStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PlaceRef" type="{http://www.siri.org.uk/siri}JourneyPlaceRefStructure" minOccurs="0"/&gt;
 *         &lt;element name="PlaceName" type="{http://www.siri.org.uk/siri}NaturalLanguagePlaceNameStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PlaceShortName" type="{http://www.siri.org.uk/siri}NaturalLanguagePlaceNameStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlaceNameStructure", propOrder = {
    "placeRef",
    "placeName",
    "placeShortName"
})
@XmlSeeAlso({
    ViaNameStructure.class
})
public class PlaceNameStructure {

    @XmlElement(name = "PlaceRef")
    protected JourneyPlaceRefStructure placeRef;
    @XmlElement(name = "PlaceName")
    protected List<NaturalLanguagePlaceNameStructure> placeName;
    @XmlElement(name = "PlaceShortName")
    protected List<NaturalLanguagePlaceNameStructure> placeShortName;

    /**
     * Recupera il valore della proprietà placeRef.
     * 
     * @return
     *     possible object is
     *     {@link JourneyPlaceRefStructure }
     *     
     */
    public JourneyPlaceRefStructure getPlaceRef() {
        return placeRef;
    }

    /**
     * Imposta il valore della proprietà placeRef.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyPlaceRefStructure }
     *     
     */
    public void setPlaceRef(JourneyPlaceRefStructure value) {
        this.placeRef = value;
    }

    /**
     * Gets the value of the placeName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the placeName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlaceName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguagePlaceNameStructure }
     * 
     * 
     */
    public List<NaturalLanguagePlaceNameStructure> getPlaceName() {
        if (placeName == null) {
            placeName = new ArrayList<NaturalLanguagePlaceNameStructure>();
        }
        return this.placeName;
    }

    /**
     * Gets the value of the placeShortName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the placeShortName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlaceShortName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguagePlaceNameStructure }
     * 
     * 
     */
    public List<NaturalLanguagePlaceNameStructure> getPlaceShortName() {
        if (placeShortName == null) {
            placeShortName = new ArrayList<NaturalLanguagePlaceNameStructure>();
        }
        return this.placeShortName;
    }

    public PlaceNameStructure withPlaceRef(JourneyPlaceRefStructure value) {
        setPlaceRef(value);
        return this;
    }

    public PlaceNameStructure withPlaceName(NaturalLanguagePlaceNameStructure... values) {
        if (values!= null) {
            for (NaturalLanguagePlaceNameStructure value: values) {
                getPlaceName().add(value);
            }
        }
        return this;
    }

    public PlaceNameStructure withPlaceName(Collection<NaturalLanguagePlaceNameStructure> values) {
        if (values!= null) {
            getPlaceName().addAll(values);
        }
        return this;
    }

    public PlaceNameStructure withPlaceShortName(NaturalLanguagePlaceNameStructure... values) {
        if (values!= null) {
            for (NaturalLanguagePlaceNameStructure value: values) {
                getPlaceShortName().add(value);
            }
        }
        return this;
    }

    public PlaceNameStructure withPlaceShortName(Collection<NaturalLanguagePlaceNameStructure> values) {
        if (values!= null) {
            getPlaceShortName().addAll(values);
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

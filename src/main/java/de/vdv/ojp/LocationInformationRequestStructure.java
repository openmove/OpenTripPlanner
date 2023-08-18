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
 * <p>Classe Java per LocationInformationRequestStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="LocationInformationRequestStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}LocationInformationRequestGroup"/&gt;
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
@XmlType(name = "LocationInformationRequestStructure", propOrder = {
    "initialInput",
    "placeRef",
    "restrictions",
    "extension"
})
public class LocationInformationRequestStructure {

    @XmlElement(name = "InitialInput")
    protected InitialLocationInputStructure initialInput;
    @XmlElement(name = "PlaceRef")
    protected PlaceRefStructure placeRef;
    @XmlElement(name = "Restrictions")
    protected PlaceParamStructure restrictions;
    @XmlElement(name = "Extension")
    protected Object extension;

    /**
     * Recupera il valore della proprietà initialInput.
     * 
     * @return
     *     possible object is
     *     {@link InitialLocationInputStructure }
     *     
     */
    public InitialLocationInputStructure getInitialInput() {
        return initialInput;
    }

    /**
     * Imposta il valore della proprietà initialInput.
     * 
     * @param value
     *     allowed object is
     *     {@link InitialLocationInputStructure }
     *     
     */
    public void setInitialInput(InitialLocationInputStructure value) {
        this.initialInput = value;
    }

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
     * Recupera il valore della proprietà restrictions.
     * 
     * @return
     *     possible object is
     *     {@link PlaceParamStructure }
     *     
     */
    public PlaceParamStructure getRestrictions() {
        return restrictions;
    }

    /**
     * Imposta il valore della proprietà restrictions.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceParamStructure }
     *     
     */
    public void setRestrictions(PlaceParamStructure value) {
        this.restrictions = value;
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

    public LocationInformationRequestStructure withInitialInput(InitialLocationInputStructure value) {
        setInitialInput(value);
        return this;
    }

    public LocationInformationRequestStructure withPlaceRef(PlaceRefStructure value) {
        setPlaceRef(value);
        return this;
    }

    public LocationInformationRequestStructure withRestrictions(PlaceParamStructure value) {
        setRestrictions(value);
        return this;
    }

    public LocationInformationRequestStructure withExtension(Object value) {
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

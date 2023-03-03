//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per Location complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Location"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="externalReferencing" type="{http://datex2.eu/schema/2_0RC1/2_0}ExternalReferencing" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="locationForDisplay" type="{http://datex2.eu/schema/2_0RC1/2_0}PointCoordinates" minOccurs="0"/&gt;
 *         &lt;element name="locationExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Location", propOrder = {
    "externalReferencing",
    "locationForDisplay",
    "locationExtension"
})
@XmlSeeAlso({
    Area.class,
    eu.datex2.schema._2_0rc1._2_0.Itinerary.LocationContainedInItinerary.class,
    LocationByReference.class,
    NetworkLocation.class
})
public abstract class Location {

    protected List<ExternalReferencing> externalReferencing;
    protected PointCoordinates locationForDisplay;
    protected ExtensionType locationExtension;

    /**
     * Gets the value of the externalReferencing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the externalReferencing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExternalReferencing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExternalReferencing }
     * 
     * 
     */
    public List<ExternalReferencing> getExternalReferencing() {
        if (externalReferencing == null) {
            externalReferencing = new ArrayList<ExternalReferencing>();
        }
        return this.externalReferencing;
    }

    /**
     * Recupera il valore della proprietà locationForDisplay.
     * 
     * @return
     *     possible object is
     *     {@link PointCoordinates }
     *     
     */
    public PointCoordinates getLocationForDisplay() {
        return locationForDisplay;
    }

    /**
     * Imposta il valore della proprietà locationForDisplay.
     * 
     * @param value
     *     allowed object is
     *     {@link PointCoordinates }
     *     
     */
    public void setLocationForDisplay(PointCoordinates value) {
        this.locationForDisplay = value;
    }

    /**
     * Recupera il valore della proprietà locationExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getLocationExtension() {
        return locationExtension;
    }

    /**
     * Imposta il valore della proprietà locationExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setLocationExtension(ExtensionType value) {
        this.locationExtension = value;
    }

    public Location withExternalReferencing(ExternalReferencing... values) {
        if (values!= null) {
            for (ExternalReferencing value: values) {
                getExternalReferencing().add(value);
            }
        }
        return this;
    }

    public Location withExternalReferencing(Collection<ExternalReferencing> values) {
        if (values!= null) {
            getExternalReferencing().addAll(values);
        }
        return this;
    }

    public Location withLocationForDisplay(PointCoordinates value) {
        setLocationForDisplay(value);
        return this;
    }

    public Location withLocationExtension(ExtensionType value) {
        setLocationExtension(value);
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

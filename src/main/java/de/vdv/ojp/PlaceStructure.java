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
import javax.xml.bind.annotation.XmlType;
import com.bliksemlabs.ojp.model.LocationStructure;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 *  geographic PLACE of any type which may be specified as the origin or destination of a trip
 * 
 * <p>Classe Java per PlaceStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PlaceStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="StopPoint" type="{http://www.vdv.de/ojp}StopPointStructure"/&gt;
 *           &lt;element name="StopPlace" type="{http://www.vdv.de/ojp}StopPlaceStructure"/&gt;
 *           &lt;element name="TopographicPlace" type="{http://www.vdv.de/ojp}TopographicPlaceStructure"/&gt;
 *           &lt;element name="PointOfInterest" type="{http://www.vdv.de/ojp}PointOfInterestStructure"/&gt;
 *           &lt;element name="Address" type="{http://www.vdv.de/ojp}AddressStructure"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="LocationName" type="{http://www.vdv.de/ojp}InternationalTextStructure"/&gt;
 *         &lt;element name="GeoPosition" type="{http://www.siri.org.uk/siri}LocationStructure"/&gt;
 *         &lt;element name="Attribute" type="{http://www.vdv.de/ojp}GeneralAttributeStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "PlaceStructure", propOrder = {
    "stopPoint",
    "stopPlace",
    "topographicPlace",
    "pointOfInterest",
    "address",
    "locationName",
    "geoPosition",
    "attribute",
    "extension"
})
public class PlaceStructure {

    @XmlElement(name = "StopPoint")
    protected StopPointStructure stopPoint;
    @XmlElement(name = "StopPlace")
    protected StopPlaceStructure stopPlace;
    @XmlElement(name = "TopographicPlace")
    protected TopographicPlaceStructure topographicPlace;
    @XmlElement(name = "PointOfInterest")
    protected PointOfInterestStructure pointOfInterest;
    @XmlElement(name = "Address")
    protected AddressStructure address;
    @XmlElement(name = "LocationName", required = true)
    protected InternationalTextStructure locationName;
    @XmlElement(name = "GeoPosition", required = true)
    protected LocationStructure geoPosition;
    @XmlElement(name = "Attribute")
    protected List<GeneralAttributeStructure> attribute;
    @XmlElement(name = "Extension")
    protected Object extension;

    /**
     * Recupera il valore della proprietà stopPoint.
     * 
     * @return
     *     possible object is
     *     {@link StopPointStructure }
     *     
     */
    public StopPointStructure getStopPoint() {
        return stopPoint;
    }

    /**
     * Imposta il valore della proprietà stopPoint.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointStructure }
     *     
     */
    public void setStopPoint(StopPointStructure value) {
        this.stopPoint = value;
    }

    /**
     * Recupera il valore della proprietà stopPlace.
     * 
     * @return
     *     possible object is
     *     {@link StopPlaceStructure }
     *     
     */
    public StopPlaceStructure getStopPlace() {
        return stopPlace;
    }

    /**
     * Imposta il valore della proprietà stopPlace.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPlaceStructure }
     *     
     */
    public void setStopPlace(StopPlaceStructure value) {
        this.stopPlace = value;
    }

    /**
     * Recupera il valore della proprietà topographicPlace.
     * 
     * @return
     *     possible object is
     *     {@link TopographicPlaceStructure }
     *     
     */
    public TopographicPlaceStructure getTopographicPlace() {
        return topographicPlace;
    }

    /**
     * Imposta il valore della proprietà topographicPlace.
     * 
     * @param value
     *     allowed object is
     *     {@link TopographicPlaceStructure }
     *     
     */
    public void setTopographicPlace(TopographicPlaceStructure value) {
        this.topographicPlace = value;
    }

    /**
     * Recupera il valore della proprietà pointOfInterest.
     * 
     * @return
     *     possible object is
     *     {@link PointOfInterestStructure }
     *     
     */
    public PointOfInterestStructure getPointOfInterest() {
        return pointOfInterest;
    }

    /**
     * Imposta il valore della proprietà pointOfInterest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInterestStructure }
     *     
     */
    public void setPointOfInterest(PointOfInterestStructure value) {
        this.pointOfInterest = value;
    }

    /**
     * Recupera il valore della proprietà address.
     * 
     * @return
     *     possible object is
     *     {@link AddressStructure }
     *     
     */
    public AddressStructure getAddress() {
        return address;
    }

    /**
     * Imposta il valore della proprietà address.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressStructure }
     *     
     */
    public void setAddress(AddressStructure value) {
        this.address = value;
    }

    /**
     * Recupera il valore della proprietà locationName.
     * 
     * @return
     *     possible object is
     *     {@link InternationalTextStructure }
     *     
     */
    public InternationalTextStructure getLocationName() {
        return locationName;
    }

    /**
     * Imposta il valore della proprietà locationName.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTextStructure }
     *     
     */
    public void setLocationName(InternationalTextStructure value) {
        this.locationName = value;
    }

    /**
     * Recupera il valore della proprietà geoPosition.
     * 
     * @return
     *     possible object is
     *     {@link LocationStructure }
     *     
     */
    public LocationStructure getGeoPosition() {
        return geoPosition;
    }

    /**
     * Imposta il valore della proprietà geoPosition.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationStructure }
     *     
     */
    public void setGeoPosition(LocationStructure value) {
        this.geoPosition = value;
    }

    /**
     * Gets the value of the attribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeneralAttributeStructure }
     * 
     * 
     */
    public List<GeneralAttributeStructure> getAttribute() {
        if (attribute == null) {
            attribute = new ArrayList<GeneralAttributeStructure>();
        }
        return this.attribute;
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

    public PlaceStructure withStopPoint(StopPointStructure value) {
        setStopPoint(value);
        return this;
    }

    public PlaceStructure withStopPlace(StopPlaceStructure value) {
        setStopPlace(value);
        return this;
    }

    public PlaceStructure withTopographicPlace(TopographicPlaceStructure value) {
        setTopographicPlace(value);
        return this;
    }

    public PlaceStructure withPointOfInterest(PointOfInterestStructure value) {
        setPointOfInterest(value);
        return this;
    }

    public PlaceStructure withAddress(AddressStructure value) {
        setAddress(value);
        return this;
    }

    public PlaceStructure withLocationName(InternationalTextStructure value) {
        setLocationName(value);
        return this;
    }

    public PlaceStructure withGeoPosition(LocationStructure value) {
        setGeoPosition(value);
        return this;
    }

    public PlaceStructure withAttribute(GeneralAttributeStructure... values) {
        if (values!= null) {
            for (GeneralAttributeStructure value: values) {
                getAttribute().add(value);
            }
        }
        return this;
    }

    public PlaceStructure withAttribute(Collection<GeneralAttributeStructure> values) {
        if (values!= null) {
            getAttribute().addAll(values);
        }
        return this;
    }

    public PlaceStructure withExtension(Object value) {
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

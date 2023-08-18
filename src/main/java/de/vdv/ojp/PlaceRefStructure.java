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
import com.bliksemlabs.ojp.model.LocationStructure;
import com.bliksemlabs.ojp.model.StopPointRefStructure;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * Reference to a geographic PLACE of any type which may be specified as the origin or destination of a trip
 * 
 * <p>Classe Java per PlaceRefStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PlaceRefStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.siri.org.uk/siri}StopPointRef"/&gt;
 *           &lt;element ref="{http://www.vdv.de/ojp}StopPlaceRef"/&gt;
 *           &lt;element name="GeoPosition" type="{http://www.siri.org.uk/siri}LocationStructure"/&gt;
 *           &lt;element ref="{http://www.vdv.de/ojp}TopographicPlaceRef"/&gt;
 *           &lt;element ref="{http://www.vdv.de/ojp}PointOfInterestRef"/&gt;
 *           &lt;element ref="{http://www.vdv.de/ojp}AddressRef"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="LocationName" type="{http://www.vdv.de/ojp}InternationalTextStructure"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlaceRefStructure", propOrder = {
    "stopPointRef",
    "stopPlaceRef",
    "geoPosition",
    "topographicPlaceRef",
    "pointOfInterestRef",
    "addressRef",
    "locationName"
})
public class PlaceRefStructure {

    @XmlElement(name = "StopPointRef", namespace = "http://www.siri.org.uk/siri")
    protected StopPointRefStructure stopPointRef;
    @XmlElement(name = "StopPlaceRef")
    protected StopPlaceRefStructure stopPlaceRef;
    @XmlElement(name = "GeoPosition")
    protected LocationStructure geoPosition;
    @XmlElement(name = "TopographicPlaceRef")
    protected TopographicPlaceRefStructure topographicPlaceRef;
    @XmlElement(name = "PointOfInterestRef")
    protected PointOfInterestRefStructure pointOfInterestRef;
    @XmlElement(name = "AddressRef")
    protected AddressRefStructure addressRef;
    @XmlElement(name = "LocationName", required = true)
    protected InternationalTextStructure locationName;

    /**
     * Recupera il valore della proprietà stopPointRef.
     * 
     * @return
     *     possible object is
     *     {@link StopPointRefStructure }
     *     
     */
    public StopPointRefStructure getStopPointRef() {
        return stopPointRef;
    }

    /**
     * Imposta il valore della proprietà stopPointRef.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointRefStructure }
     *     
     */
    public void setStopPointRef(StopPointRefStructure value) {
        this.stopPointRef = value;
    }

    /**
     * Recupera il valore della proprietà stopPlaceRef.
     * 
     * @return
     *     possible object is
     *     {@link StopPlaceRefStructure }
     *     
     */
    public StopPlaceRefStructure getStopPlaceRef() {
        return stopPlaceRef;
    }

    /**
     * Imposta il valore della proprietà stopPlaceRef.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPlaceRefStructure }
     *     
     */
    public void setStopPlaceRef(StopPlaceRefStructure value) {
        this.stopPlaceRef = value;
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
     * Recupera il valore della proprietà topographicPlaceRef.
     * 
     * @return
     *     possible object is
     *     {@link TopographicPlaceRefStructure }
     *     
     */
    public TopographicPlaceRefStructure getTopographicPlaceRef() {
        return topographicPlaceRef;
    }

    /**
     * Imposta il valore della proprietà topographicPlaceRef.
     * 
     * @param value
     *     allowed object is
     *     {@link TopographicPlaceRefStructure }
     *     
     */
    public void setTopographicPlaceRef(TopographicPlaceRefStructure value) {
        this.topographicPlaceRef = value;
    }

    /**
     * Recupera il valore della proprietà pointOfInterestRef.
     * 
     * @return
     *     possible object is
     *     {@link PointOfInterestRefStructure }
     *     
     */
    public PointOfInterestRefStructure getPointOfInterestRef() {
        return pointOfInterestRef;
    }

    /**
     * Imposta il valore della proprietà pointOfInterestRef.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInterestRefStructure }
     *     
     */
    public void setPointOfInterestRef(PointOfInterestRefStructure value) {
        this.pointOfInterestRef = value;
    }

    /**
     * Recupera il valore della proprietà addressRef.
     * 
     * @return
     *     possible object is
     *     {@link AddressRefStructure }
     *     
     */
    public AddressRefStructure getAddressRef() {
        return addressRef;
    }

    /**
     * Imposta il valore della proprietà addressRef.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressRefStructure }
     *     
     */
    public void setAddressRef(AddressRefStructure value) {
        this.addressRef = value;
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

    public PlaceRefStructure withStopPointRef(StopPointRefStructure value) {
        setStopPointRef(value);
        return this;
    }

    public PlaceRefStructure withStopPlaceRef(StopPlaceRefStructure value) {
        setStopPlaceRef(value);
        return this;
    }

    public PlaceRefStructure withGeoPosition(LocationStructure value) {
        setGeoPosition(value);
        return this;
    }

    public PlaceRefStructure withTopographicPlaceRef(TopographicPlaceRefStructure value) {
        setTopographicPlaceRef(value);
        return this;
    }

    public PlaceRefStructure withPointOfInterestRef(PointOfInterestRefStructure value) {
        setPointOfInterestRef(value);
        return this;
    }

    public PlaceRefStructure withAddressRef(AddressRefStructure value) {
        setAddressRef(value);
        return this;
    }

    public PlaceRefStructure withLocationName(InternationalTextStructure value) {
        setLocationName(value);
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

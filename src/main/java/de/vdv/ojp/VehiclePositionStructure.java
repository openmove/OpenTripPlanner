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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.bliksemlabs.ojp.model.LocationStructure;
import com.bliksemlabs.ojp.model.ProgressBetweenStopsStructure;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * Geographical and logical position of a vehicle.
 * 
 * <p>Classe Java per VehiclePositionStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="VehiclePositionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GeoPosition" type="{http://www.siri.org.uk/siri}LocationStructure" minOccurs="0"/&gt;
 *         &lt;element name="Progress" type="{http://www.vdv.de/ojp}VehicleProgressEnumeration" minOccurs="0"/&gt;
 *         &lt;element name="Bearing" type="{http://www.siri.org.uk/siri}AbsoluteBearingType" minOccurs="0"/&gt;
 *         &lt;element name="ProgressBetweenStops" type="{http://www.siri.org.uk/siri}ProgressBetweenStopsStructure" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehiclePositionStructure", propOrder = {
    "geoPosition",
    "progress",
    "bearing",
    "progressBetweenStops"
})
public class VehiclePositionStructure {

    @XmlElement(name = "GeoPosition")
    protected LocationStructure geoPosition;
    @XmlElement(name = "Progress")
    @XmlSchemaType(name = "string")
    protected VehicleProgressEnumeration progress;
    @XmlElement(name = "Bearing")
    protected Float bearing;
    @XmlElement(name = "ProgressBetweenStops")
    protected ProgressBetweenStopsStructure progressBetweenStops;

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
     * Recupera il valore della proprietà progress.
     * 
     * @return
     *     possible object is
     *     {@link VehicleProgressEnumeration }
     *     
     */
    public VehicleProgressEnumeration getProgress() {
        return progress;
    }

    /**
     * Imposta il valore della proprietà progress.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleProgressEnumeration }
     *     
     */
    public void setProgress(VehicleProgressEnumeration value) {
        this.progress = value;
    }

    /**
     * Recupera il valore della proprietà bearing.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getBearing() {
        return bearing;
    }

    /**
     * Imposta il valore della proprietà bearing.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setBearing(Float value) {
        this.bearing = value;
    }

    /**
     * Recupera il valore della proprietà progressBetweenStops.
     * 
     * @return
     *     possible object is
     *     {@link ProgressBetweenStopsStructure }
     *     
     */
    public ProgressBetweenStopsStructure getProgressBetweenStops() {
        return progressBetweenStops;
    }

    /**
     * Imposta il valore della proprietà progressBetweenStops.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgressBetweenStopsStructure }
     *     
     */
    public void setProgressBetweenStops(ProgressBetweenStopsStructure value) {
        this.progressBetweenStops = value;
    }

    public VehiclePositionStructure withGeoPosition(LocationStructure value) {
        setGeoPosition(value);
        return this;
    }

    public VehiclePositionStructure withProgress(VehicleProgressEnumeration value) {
        setProgress(value);
        return this;
    }

    public VehiclePositionStructure withBearing(Float value) {
        setBearing(value);
        return this;
    }

    public VehiclePositionStructure withProgressBetweenStops(ProgressBetweenStopsStructure value) {
        setProgressBetweenStops(value);
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

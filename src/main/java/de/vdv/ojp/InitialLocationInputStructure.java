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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per InitialLocationInputStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="InitialLocationInputStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LocationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GeoPosition" type="{http://www.siri.org.uk/siri}LocationStructure" minOccurs="0"/&gt;
 *         &lt;element name="GeoRestriction" type="{http://www.vdv.de/ojp}GeoRestrictionsStructure" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InitialLocationInputStructure", propOrder = {
    "locationName",
    "geoPosition",
    "geoRestriction"
})
public class InitialLocationInputStructure {

    @XmlElement(name = "LocationName")
    protected String locationName;
    @XmlElement(name = "GeoPosition")
    protected LocationStructure geoPosition;
    @XmlElement(name = "GeoRestriction")
    protected GeoRestrictionsStructure geoRestriction;

    /**
     * Recupera il valore della proprietà locationName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationName() {
        return locationName;
    }

    /**
     * Imposta il valore della proprietà locationName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationName(String value) {
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
     * Recupera il valore della proprietà geoRestriction.
     * 
     * @return
     *     possible object is
     *     {@link GeoRestrictionsStructure }
     *     
     */
    public GeoRestrictionsStructure getGeoRestriction() {
        return geoRestriction;
    }

    /**
     * Imposta il valore della proprietà geoRestriction.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoRestrictionsStructure }
     *     
     */
    public void setGeoRestriction(GeoRestrictionsStructure value) {
        this.geoRestriction = value;
    }

    public InitialLocationInputStructure withLocationName(String value) {
        setLocationName(value);
        return this;
    }

    public InitialLocationInputStructure withGeoPosition(LocationStructure value) {
        setGeoPosition(value);
        return this;
    }

    public InitialLocationInputStructure withGeoRestriction(GeoRestrictionsStructure value) {
        setGeoRestriction(value);
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

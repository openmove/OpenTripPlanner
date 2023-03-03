//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package de.vdv.ojp;

import java.math.BigInteger;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.bliksemlabs.ojp.model.LocationStructure;
import com.migesok.jaxb.adapter.javatime.DurationXmlAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * LINK PROJECTION on the infrastructure network of the TRIP LEG together with time information
 * 
 * <p>Classe Java per TrackSectionStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TrackSectionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TrackStart" type="{http://www.vdv.de/ojp}PlaceRefStructure" minOccurs="0"/&gt;
 *         &lt;element name="TrackEnd" type="{http://www.vdv.de/ojp}PlaceRefStructure" minOccurs="0"/&gt;
 *         &lt;element name="LinkProjection" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Position" type="{http://www.siri.org.uk/siri}LocationStructure" maxOccurs="unbounded" minOccurs="2"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RoadName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="Length" type="{http://www.siri.org.uk/siri}DistanceType" minOccurs="0"/&gt;
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
@XmlType(name = "TrackSectionStructure", propOrder = {
    "trackStart",
    "trackEnd",
    "linkProjection",
    "roadName",
    "duration",
    "length",
    "extension"
})
public class TrackSectionStructure {

    @XmlElement(name = "TrackStart")
    protected PlaceRefStructure trackStart;
    @XmlElement(name = "TrackEnd")
    protected PlaceRefStructure trackEnd;
    @XmlElement(name = "LinkProjection")
    protected TrackSectionStructure.LinkProjection linkProjection;
    @XmlElement(name = "RoadName")
    protected String roadName;
    @XmlElement(name = "Duration", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration duration;
    @XmlElement(name = "Length")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger length;
    @XmlElement(name = "Extension")
    protected Object extension;

    /**
     * Recupera il valore della proprietà trackStart.
     * 
     * @return
     *     possible object is
     *     {@link PlaceRefStructure }
     *     
     */
    public PlaceRefStructure getTrackStart() {
        return trackStart;
    }

    /**
     * Imposta il valore della proprietà trackStart.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceRefStructure }
     *     
     */
    public void setTrackStart(PlaceRefStructure value) {
        this.trackStart = value;
    }

    /**
     * Recupera il valore della proprietà trackEnd.
     * 
     * @return
     *     possible object is
     *     {@link PlaceRefStructure }
     *     
     */
    public PlaceRefStructure getTrackEnd() {
        return trackEnd;
    }

    /**
     * Imposta il valore della proprietà trackEnd.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceRefStructure }
     *     
     */
    public void setTrackEnd(PlaceRefStructure value) {
        this.trackEnd = value;
    }

    /**
     * Recupera il valore della proprietà linkProjection.
     * 
     * @return
     *     possible object is
     *     {@link TrackSectionStructure.LinkProjection }
     *     
     */
    public TrackSectionStructure.LinkProjection getLinkProjection() {
        return linkProjection;
    }

    /**
     * Imposta il valore della proprietà linkProjection.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackSectionStructure.LinkProjection }
     *     
     */
    public void setLinkProjection(TrackSectionStructure.LinkProjection value) {
        this.linkProjection = value;
    }

    /**
     * Recupera il valore della proprietà roadName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoadName() {
        return roadName;
    }

    /**
     * Imposta il valore della proprietà roadName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoadName(String value) {
        this.roadName = value;
    }

    /**
     * Recupera il valore della proprietà duration.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * Imposta il valore della proprietà duration.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuration(Duration value) {
        this.duration = value;
    }

    /**
     * Recupera il valore della proprietà length.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLength() {
        return length;
    }

    /**
     * Imposta il valore della proprietà length.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLength(BigInteger value) {
        this.length = value;
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

    public TrackSectionStructure withTrackStart(PlaceRefStructure value) {
        setTrackStart(value);
        return this;
    }

    public TrackSectionStructure withTrackEnd(PlaceRefStructure value) {
        setTrackEnd(value);
        return this;
    }

    public TrackSectionStructure withLinkProjection(TrackSectionStructure.LinkProjection value) {
        setLinkProjection(value);
        return this;
    }

    public TrackSectionStructure withRoadName(String value) {
        setRoadName(value);
        return this;
    }

    public TrackSectionStructure withDuration(Duration value) {
        setDuration(value);
        return this;
    }

    public TrackSectionStructure withLength(BigInteger value) {
        setLength(value);
        return this;
    }

    public TrackSectionStructure withExtension(Object value) {
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
     *         &lt;element name="Position" type="{http://www.siri.org.uk/siri}LocationStructure" maxOccurs="unbounded" minOccurs="2"/&gt;
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
        "position"
    })
    public static class LinkProjection {

        @XmlElement(name = "Position", required = true)
        protected List<LocationStructure> position;

        /**
         * Gets the value of the position property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the position property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPosition().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LocationStructure }
         * 
         * 
         */
        public List<LocationStructure> getPosition() {
            if (position == null) {
                position = new ArrayList<LocationStructure>();
            }
            return this.position;
        }

        public TrackSectionStructure.LinkProjection withPosition(LocationStructure... values) {
            if (values!= null) {
                for (LocationStructure value: values) {
                    getPosition().add(value);
                }
            }
            return this;
        }

        public TrackSectionStructure.LinkProjection withPosition(Collection<LocationStructure> values) {
            if (values!= null) {
                getPosition().addAll(values);
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

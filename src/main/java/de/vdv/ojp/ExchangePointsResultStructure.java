//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package de.vdv.ojp;

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
import com.migesok.jaxb.adapter.javatime.DurationXmlAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per ExchangePointsResultStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ExchangePointsResultStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Place" type="{http://www.vdv.de/ojp}PlaceStructure"/&gt;
 *         &lt;element name="TravelDurationEstimate" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="BorderPoint" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Mode" type="{http://www.vdv.de/ojp}ModeStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangePointsResultStructure", propOrder = {
    "place",
    "travelDurationEstimate",
    "borderPoint",
    "mode"
})
public class ExchangePointsResultStructure {

    @XmlElement(name = "Place", required = true)
    protected PlaceStructure place;
    @XmlElement(name = "TravelDurationEstimate", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration travelDurationEstimate;
    @XmlElement(name = "BorderPoint", defaultValue = "false")
    protected Boolean borderPoint;
    @XmlElement(name = "Mode")
    protected List<ModeStructure> mode;

    /**
     * Recupera il valore della proprietà place.
     * 
     * @return
     *     possible object is
     *     {@link PlaceStructure }
     *     
     */
    public PlaceStructure getPlace() {
        return place;
    }

    /**
     * Imposta il valore della proprietà place.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceStructure }
     *     
     */
    public void setPlace(PlaceStructure value) {
        this.place = value;
    }

    /**
     * Recupera il valore della proprietà travelDurationEstimate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getTravelDurationEstimate() {
        return travelDurationEstimate;
    }

    /**
     * Imposta il valore della proprietà travelDurationEstimate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelDurationEstimate(Duration value) {
        this.travelDurationEstimate = value;
    }

    /**
     * Recupera il valore della proprietà borderPoint.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBorderPoint() {
        return borderPoint;
    }

    /**
     * Imposta il valore della proprietà borderPoint.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBorderPoint(Boolean value) {
        this.borderPoint = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModeStructure }
     * 
     * 
     */
    public List<ModeStructure> getMode() {
        if (mode == null) {
            mode = new ArrayList<ModeStructure>();
        }
        return this.mode;
    }

    public ExchangePointsResultStructure withPlace(PlaceStructure value) {
        setPlace(value);
        return this;
    }

    public ExchangePointsResultStructure withTravelDurationEstimate(Duration value) {
        setTravelDurationEstimate(value);
        return this;
    }

    public ExchangePointsResultStructure withBorderPoint(Boolean value) {
        setBorderPoint(value);
        return this;
    }

    public ExchangePointsResultStructure withMode(ModeStructure... values) {
        if (values!= null) {
            for (ModeStructure value: values) {
                getMode().add(value);
            }
        }
        return this;
    }

    public ExchangePointsResultStructure withMode(Collection<ModeStructure> values) {
        if (values!= null) {
            getMode().addAll(values);
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

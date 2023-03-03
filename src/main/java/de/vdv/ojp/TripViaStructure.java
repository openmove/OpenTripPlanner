//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package de.vdv.ojp;

import java.time.Duration;
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
 * VIA restrictions for a TRIP.
 * 
 * <p>Classe Java per TripViaStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TripViaStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ViaPoint" type="{http://www.vdv.de/ojp}PlaceRefStructure"/&gt;
 *         &lt;element name="DwellTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TripViaStructure", propOrder = {
    "viaPoint",
    "dwellTime"
})
public class TripViaStructure {

    @XmlElement(name = "ViaPoint", required = true)
    protected PlaceRefStructure viaPoint;
    @XmlElement(name = "DwellTime", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration dwellTime;

    /**
     * Recupera il valore della proprietà viaPoint.
     * 
     * @return
     *     possible object is
     *     {@link PlaceRefStructure }
     *     
     */
    public PlaceRefStructure getViaPoint() {
        return viaPoint;
    }

    /**
     * Imposta il valore della proprietà viaPoint.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceRefStructure }
     *     
     */
    public void setViaPoint(PlaceRefStructure value) {
        this.viaPoint = value;
    }

    /**
     * Recupera il valore della proprietà dwellTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getDwellTime() {
        return dwellTime;
    }

    /**
     * Imposta il valore della proprietà dwellTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDwellTime(Duration value) {
        this.dwellTime = value;
    }

    public TripViaStructure withViaPoint(PlaceRefStructure value) {
        setViaPoint(value);
        return this;
    }

    public TripViaStructure withDwellTime(Duration value) {
        setDwellTime(value);
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

//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package de.vdv.ojp;

import java.math.BigInteger;
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
 * indication of the walk distance and time to a nearby stop where relevant.
 * 
 * <p>Classe Java per CallAtNearStopStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CallAtNearStopStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CallAtStop" type="{http://www.vdv.de/ojp}CallAtStopStructure"/&gt;
 *         &lt;element name="WalkDistance" type="{http://www.siri.org.uk/siri}DistanceType" minOccurs="0"/&gt;
 *         &lt;element name="WalkDuration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallAtNearStopStructure", propOrder = {
    "callAtStop",
    "walkDistance",
    "walkDuration"
})
public class CallAtNearStopStructure {

    @XmlElement(name = "CallAtStop", required = true)
    protected CallAtStopStructure callAtStop;
    @XmlElement(name = "WalkDistance")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger walkDistance;
    @XmlElement(name = "WalkDuration", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration walkDuration;

    /**
     * Recupera il valore della proprietà callAtStop.
     * 
     * @return
     *     possible object is
     *     {@link CallAtStopStructure }
     *     
     */
    public CallAtStopStructure getCallAtStop() {
        return callAtStop;
    }

    /**
     * Imposta il valore della proprietà callAtStop.
     * 
     * @param value
     *     allowed object is
     *     {@link CallAtStopStructure }
     *     
     */
    public void setCallAtStop(CallAtStopStructure value) {
        this.callAtStop = value;
    }

    /**
     * Recupera il valore della proprietà walkDistance.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWalkDistance() {
        return walkDistance;
    }

    /**
     * Imposta il valore della proprietà walkDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWalkDistance(BigInteger value) {
        this.walkDistance = value;
    }

    /**
     * Recupera il valore della proprietà walkDuration.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getWalkDuration() {
        return walkDuration;
    }

    /**
     * Imposta il valore della proprietà walkDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWalkDuration(Duration value) {
        this.walkDuration = value;
    }

    public CallAtNearStopStructure withCallAtStop(CallAtStopStructure value) {
        setCallAtStop(value);
        return this;
    }

    public CallAtNearStopStructure withWalkDistance(BigInteger value) {
        setWalkDistance(value);
        return this;
    }

    public CallAtNearStopStructure withWalkDuration(Duration value) {
        setWalkDuration(value);
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

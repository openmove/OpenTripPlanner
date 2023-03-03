//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package de.vdv.ojp;

import java.math.BigInteger;
import java.time.Duration;
import java.time.LocalDateTime;
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
import org.rutebanken.util.LocalDateTimeISO8601XmlAdapter;


/**
 * [a specialised type of NAVIGATION PATH in TMv6] description of a LEG which links other LEGs of a TRIP where a TRANSFER between different LOCATIONs is required
 * 
 * <p>Classe Java per TransferLegStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TransferLegStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="TransferMode" type="{http://www.vdv.de/ojp}TransferModesEnumeration"/&gt;
 *           &lt;element name="ContinuousMode" type="{http://www.vdv.de/ojp}ContinuousModesEnumeration"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="LegStart" type="{http://www.vdv.de/ojp}PlaceRefStructure"/&gt;
 *         &lt;element name="LegEnd" type="{http://www.vdv.de/ojp}PlaceRefStructure"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}TimeWindowGroup"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}TransferDurationGroup"/&gt;
 *         &lt;element name="LegDescription" type="{http://www.vdv.de/ojp}InternationalTextStructure" minOccurs="0"/&gt;
 *         &lt;element name="Length" type="{http://www.vdv.de/ojp}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="Attribute" type="{http://www.vdv.de/ojp}GeneralAttributeStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PathGuidance" type="{http://www.vdv.de/ojp}PathGuidanceStructure" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.vdv.de/ojp}SituationFullRef" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "TransferLegStructure", propOrder = {
    "transferMode",
    "continuousMode",
    "legStart",
    "legEnd",
    "timeWindowStart",
    "timeWindowEnd",
    "duration",
    "walkDuration",
    "bufferTime",
    "legDescription",
    "length",
    "attribute",
    "pathGuidance",
    "situationFullRef",
    "extension"
})
public class TransferLegStructure {

    @XmlElement(name = "TransferMode")
    @XmlSchemaType(name = "string")
    protected TransferModesEnumeration transferMode;
    @XmlElement(name = "ContinuousMode")
    @XmlSchemaType(name = "string")
    protected ContinuousModesEnumeration continuousMode;
    @XmlElement(name = "LegStart", required = true)
    protected PlaceRefStructure legStart;
    @XmlElement(name = "LegEnd", required = true)
    protected PlaceRefStructure legEnd;
    @XmlElement(name = "TimeWindowStart", type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime timeWindowStart;
    @XmlElement(name = "TimeWindowEnd", type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime timeWindowEnd;
    @XmlElement(name = "Duration", required = true, type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration duration;
    @XmlElement(name = "WalkDuration", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration walkDuration;
    @XmlElement(name = "BufferTime", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration bufferTime;
    @XmlElement(name = "LegDescription")
    protected InternationalTextStructure legDescription;
    @XmlElement(name = "Length")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger length;
    @XmlElement(name = "Attribute")
    protected List<GeneralAttributeStructure> attribute;
    @XmlElement(name = "PathGuidance")
    protected PathGuidanceStructure pathGuidance;
    @XmlElement(name = "SituationFullRef")
    protected List<SituationFullRefStructure> situationFullRef;
    @XmlElement(name = "Extension")
    protected Object extension;

    /**
     * Recupera il valore della proprietà transferMode.
     * 
     * @return
     *     possible object is
     *     {@link TransferModesEnumeration }
     *     
     */
    public TransferModesEnumeration getTransferMode() {
        return transferMode;
    }

    /**
     * Imposta il valore della proprietà transferMode.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferModesEnumeration }
     *     
     */
    public void setTransferMode(TransferModesEnumeration value) {
        this.transferMode = value;
    }

    /**
     * Recupera il valore della proprietà continuousMode.
     * 
     * @return
     *     possible object is
     *     {@link ContinuousModesEnumeration }
     *     
     */
    public ContinuousModesEnumeration getContinuousMode() {
        return continuousMode;
    }

    /**
     * Imposta il valore della proprietà continuousMode.
     * 
     * @param value
     *     allowed object is
     *     {@link ContinuousModesEnumeration }
     *     
     */
    public void setContinuousMode(ContinuousModesEnumeration value) {
        this.continuousMode = value;
    }

    /**
     * Recupera il valore della proprietà legStart.
     * 
     * @return
     *     possible object is
     *     {@link PlaceRefStructure }
     *     
     */
    public PlaceRefStructure getLegStart() {
        return legStart;
    }

    /**
     * Imposta il valore della proprietà legStart.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceRefStructure }
     *     
     */
    public void setLegStart(PlaceRefStructure value) {
        this.legStart = value;
    }

    /**
     * Recupera il valore della proprietà legEnd.
     * 
     * @return
     *     possible object is
     *     {@link PlaceRefStructure }
     *     
     */
    public PlaceRefStructure getLegEnd() {
        return legEnd;
    }

    /**
     * Imposta il valore della proprietà legEnd.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceRefStructure }
     *     
     */
    public void setLegEnd(PlaceRefStructure value) {
        this.legEnd = value;
    }

    /**
     * Recupera il valore della proprietà timeWindowStart.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getTimeWindowStart() {
        return timeWindowStart;
    }

    /**
     * Imposta il valore della proprietà timeWindowStart.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeWindowStart(LocalDateTime value) {
        this.timeWindowStart = value;
    }

    /**
     * Recupera il valore della proprietà timeWindowEnd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getTimeWindowEnd() {
        return timeWindowEnd;
    }

    /**
     * Imposta il valore della proprietà timeWindowEnd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeWindowEnd(LocalDateTime value) {
        this.timeWindowEnd = value;
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

    /**
     * Recupera il valore della proprietà bufferTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getBufferTime() {
        return bufferTime;
    }

    /**
     * Imposta il valore della proprietà bufferTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBufferTime(Duration value) {
        this.bufferTime = value;
    }

    /**
     * Recupera il valore della proprietà legDescription.
     * 
     * @return
     *     possible object is
     *     {@link InternationalTextStructure }
     *     
     */
    public InternationalTextStructure getLegDescription() {
        return legDescription;
    }

    /**
     * Imposta il valore della proprietà legDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTextStructure }
     *     
     */
    public void setLegDescription(InternationalTextStructure value) {
        this.legDescription = value;
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
     * Recupera il valore della proprietà pathGuidance.
     * 
     * @return
     *     possible object is
     *     {@link PathGuidanceStructure }
     *     
     */
    public PathGuidanceStructure getPathGuidance() {
        return pathGuidance;
    }

    /**
     * Imposta il valore della proprietà pathGuidance.
     * 
     * @param value
     *     allowed object is
     *     {@link PathGuidanceStructure }
     *     
     */
    public void setPathGuidance(PathGuidanceStructure value) {
        this.pathGuidance = value;
    }

    /**
     * Gets the value of the situationFullRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the situationFullRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSituationFullRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SituationFullRefStructure }
     * 
     * 
     */
    public List<SituationFullRefStructure> getSituationFullRef() {
        if (situationFullRef == null) {
            situationFullRef = new ArrayList<SituationFullRefStructure>();
        }
        return this.situationFullRef;
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

    public TransferLegStructure withTransferMode(TransferModesEnumeration value) {
        setTransferMode(value);
        return this;
    }

    public TransferLegStructure withContinuousMode(ContinuousModesEnumeration value) {
        setContinuousMode(value);
        return this;
    }

    public TransferLegStructure withLegStart(PlaceRefStructure value) {
        setLegStart(value);
        return this;
    }

    public TransferLegStructure withLegEnd(PlaceRefStructure value) {
        setLegEnd(value);
        return this;
    }

    public TransferLegStructure withTimeWindowStart(LocalDateTime value) {
        setTimeWindowStart(value);
        return this;
    }

    public TransferLegStructure withTimeWindowEnd(LocalDateTime value) {
        setTimeWindowEnd(value);
        return this;
    }

    public TransferLegStructure withDuration(Duration value) {
        setDuration(value);
        return this;
    }

    public TransferLegStructure withWalkDuration(Duration value) {
        setWalkDuration(value);
        return this;
    }

    public TransferLegStructure withBufferTime(Duration value) {
        setBufferTime(value);
        return this;
    }

    public TransferLegStructure withLegDescription(InternationalTextStructure value) {
        setLegDescription(value);
        return this;
    }

    public TransferLegStructure withLength(BigInteger value) {
        setLength(value);
        return this;
    }

    public TransferLegStructure withAttribute(GeneralAttributeStructure... values) {
        if (values!= null) {
            for (GeneralAttributeStructure value: values) {
                getAttribute().add(value);
            }
        }
        return this;
    }

    public TransferLegStructure withAttribute(Collection<GeneralAttributeStructure> values) {
        if (values!= null) {
            getAttribute().addAll(values);
        }
        return this;
    }

    public TransferLegStructure withPathGuidance(PathGuidanceStructure value) {
        setPathGuidance(value);
        return this;
    }

    public TransferLegStructure withSituationFullRef(SituationFullRefStructure... values) {
        if (values!= null) {
            for (SituationFullRefStructure value: values) {
                getSituationFullRef().add(value);
            }
        }
        return this;
    }

    public TransferLegStructure withSituationFullRef(Collection<SituationFullRefStructure> values) {
        if (values!= null) {
            getSituationFullRef().addAll(values);
        }
        return this;
    }

    public TransferLegStructure withExtension(Object value) {
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

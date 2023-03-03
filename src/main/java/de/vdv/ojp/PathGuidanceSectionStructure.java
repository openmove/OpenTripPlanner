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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * [an extended definition of a NAVIGATION PATH in TMv6 to include the textual navigation instructions] description of a piece of a TRIP. May include geographic information, turn instructions and accessibility information 
 * 
 * <p>Classe Java per PathGuidanceSectionStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PathGuidanceSectionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TrackSection" type="{http://www.vdv.de/ojp}TrackSectionStructure" minOccurs="0"/&gt;
 *         &lt;element name="TurnDescription" type="{http://www.vdv.de/ojp}InternationalTextStructure" minOccurs="0"/&gt;
 *         &lt;element name="GuidanceAdvice" type="{http://www.vdv.de/ojp}GuidanceAdviceEnumeration" minOccurs="0"/&gt;
 *         &lt;element name="TurnAction" type="{http://www.vdv.de/ojp}TurnActionEnumeration" minOccurs="0"/&gt;
 *         &lt;element name="DirectionHint" type="{http://www.vdv.de/ojp}InternationalTextStructure" minOccurs="0"/&gt;
 *         &lt;element name="Bearing" type="{http://www.siri.org.uk/siri}AbsoluteBearingType" minOccurs="0"/&gt;
 *         &lt;element name="PathLink" type="{http://www.vdv.de/ojp}PathLinkStructure" minOccurs="0"/&gt;
 *         &lt;element name="SituationFullRef" type="{http://www.vdv.de/ojp}SituationFullRefStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PathGuidanceSectionStructure", propOrder = {
    "trackSection",
    "turnDescription",
    "guidanceAdvice",
    "turnAction",
    "directionHint",
    "bearing",
    "pathLink",
    "situationFullRef"
})
public class PathGuidanceSectionStructure {

    @XmlElement(name = "TrackSection")
    protected TrackSectionStructure trackSection;
    @XmlElement(name = "TurnDescription")
    protected InternationalTextStructure turnDescription;
    @XmlElement(name = "GuidanceAdvice")
    @XmlSchemaType(name = "string")
    protected GuidanceAdviceEnumeration guidanceAdvice;
    @XmlElement(name = "TurnAction")
    @XmlSchemaType(name = "string")
    protected TurnActionEnumeration turnAction;
    @XmlElement(name = "DirectionHint")
    protected InternationalTextStructure directionHint;
    @XmlElement(name = "Bearing")
    protected Float bearing;
    @XmlElement(name = "PathLink")
    protected PathLinkStructure pathLink;
    @XmlElement(name = "SituationFullRef")
    protected List<SituationFullRefStructure> situationFullRef;

    /**
     * Recupera il valore della proprietà trackSection.
     * 
     * @return
     *     possible object is
     *     {@link TrackSectionStructure }
     *     
     */
    public TrackSectionStructure getTrackSection() {
        return trackSection;
    }

    /**
     * Imposta il valore della proprietà trackSection.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackSectionStructure }
     *     
     */
    public void setTrackSection(TrackSectionStructure value) {
        this.trackSection = value;
    }

    /**
     * Recupera il valore della proprietà turnDescription.
     * 
     * @return
     *     possible object is
     *     {@link InternationalTextStructure }
     *     
     */
    public InternationalTextStructure getTurnDescription() {
        return turnDescription;
    }

    /**
     * Imposta il valore della proprietà turnDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTextStructure }
     *     
     */
    public void setTurnDescription(InternationalTextStructure value) {
        this.turnDescription = value;
    }

    /**
     * Recupera il valore della proprietà guidanceAdvice.
     * 
     * @return
     *     possible object is
     *     {@link GuidanceAdviceEnumeration }
     *     
     */
    public GuidanceAdviceEnumeration getGuidanceAdvice() {
        return guidanceAdvice;
    }

    /**
     * Imposta il valore della proprietà guidanceAdvice.
     * 
     * @param value
     *     allowed object is
     *     {@link GuidanceAdviceEnumeration }
     *     
     */
    public void setGuidanceAdvice(GuidanceAdviceEnumeration value) {
        this.guidanceAdvice = value;
    }

    /**
     * Recupera il valore della proprietà turnAction.
     * 
     * @return
     *     possible object is
     *     {@link TurnActionEnumeration }
     *     
     */
    public TurnActionEnumeration getTurnAction() {
        return turnAction;
    }

    /**
     * Imposta il valore della proprietà turnAction.
     * 
     * @param value
     *     allowed object is
     *     {@link TurnActionEnumeration }
     *     
     */
    public void setTurnAction(TurnActionEnumeration value) {
        this.turnAction = value;
    }

    /**
     * Recupera il valore della proprietà directionHint.
     * 
     * @return
     *     possible object is
     *     {@link InternationalTextStructure }
     *     
     */
    public InternationalTextStructure getDirectionHint() {
        return directionHint;
    }

    /**
     * Imposta il valore della proprietà directionHint.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTextStructure }
     *     
     */
    public void setDirectionHint(InternationalTextStructure value) {
        this.directionHint = value;
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
     * Recupera il valore della proprietà pathLink.
     * 
     * @return
     *     possible object is
     *     {@link PathLinkStructure }
     *     
     */
    public PathLinkStructure getPathLink() {
        return pathLink;
    }

    /**
     * Imposta il valore della proprietà pathLink.
     * 
     * @param value
     *     allowed object is
     *     {@link PathLinkStructure }
     *     
     */
    public void setPathLink(PathLinkStructure value) {
        this.pathLink = value;
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

    public PathGuidanceSectionStructure withTrackSection(TrackSectionStructure value) {
        setTrackSection(value);
        return this;
    }

    public PathGuidanceSectionStructure withTurnDescription(InternationalTextStructure value) {
        setTurnDescription(value);
        return this;
    }

    public PathGuidanceSectionStructure withGuidanceAdvice(GuidanceAdviceEnumeration value) {
        setGuidanceAdvice(value);
        return this;
    }

    public PathGuidanceSectionStructure withTurnAction(TurnActionEnumeration value) {
        setTurnAction(value);
        return this;
    }

    public PathGuidanceSectionStructure withDirectionHint(InternationalTextStructure value) {
        setDirectionHint(value);
        return this;
    }

    public PathGuidanceSectionStructure withBearing(Float value) {
        setBearing(value);
        return this;
    }

    public PathGuidanceSectionStructure withPathLink(PathLinkStructure value) {
        setPathLink(value);
        return this;
    }

    public PathGuidanceSectionStructure withSituationFullRef(SituationFullRefStructure... values) {
        if (values!= null) {
            for (SituationFullRefStructure value: values) {
                getSituationFullRef().add(value);
            }
        }
        return this;
    }

    public PathGuidanceSectionStructure withSituationFullRef(Collection<SituationFullRefStructure> values) {
        if (values!= null) {
            getSituationFullRef().addAll(values);
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

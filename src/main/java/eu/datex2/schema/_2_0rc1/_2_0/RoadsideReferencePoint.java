//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per RoadsideReferencePoint complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="RoadsideReferencePoint"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="roadsideReferencePointIdentifier" type="{http://datex2.eu/schema/2_0RC1/2_0}String"/&gt;
 *         &lt;element name="administrativeArea" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="roadName" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="roadNumber" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="directionBound" type="{http://datex2.eu/schema/2_0RC1/2_0}DirectionEnum" minOccurs="0"/&gt;
 *         &lt;element name="directionRelative" type="{http://datex2.eu/schema/2_0RC1/2_0}ReferencePointDirectionEnum" minOccurs="0"/&gt;
 *         &lt;element name="distanceFromPrevious" type="{http://datex2.eu/schema/2_0RC1/2_0}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="distanceToNext" type="{http://datex2.eu/schema/2_0RC1/2_0}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="elevatedRoadSection" type="{http://datex2.eu/schema/2_0RC1/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="roadsideReferencePointDescription" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="roadsideReferencePointDistance" type="{http://datex2.eu/schema/2_0RC1/2_0}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="roadsideReferencePointExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoadsideReferencePoint", propOrder = {
    "roadsideReferencePointIdentifier",
    "administrativeArea",
    "roadName",
    "roadNumber",
    "directionBound",
    "directionRelative",
    "distanceFromPrevious",
    "distanceToNext",
    "elevatedRoadSection",
    "roadsideReferencePointDescription",
    "roadsideReferencePointDistance",
    "roadsideReferencePointExtension"
})
public class RoadsideReferencePoint {

    @XmlElement(required = true)
    protected String roadsideReferencePointIdentifier;
    protected MultilingualString administrativeArea;
    protected MultilingualString roadName;
    protected String roadNumber;
    @XmlSchemaType(name = "string")
    protected DirectionEnum directionBound;
    @XmlSchemaType(name = "string")
    protected ReferencePointDirectionEnum directionRelative;
    protected Float distanceFromPrevious;
    protected Float distanceToNext;
    protected Boolean elevatedRoadSection;
    protected MultilingualString roadsideReferencePointDescription;
    protected Float roadsideReferencePointDistance;
    protected ExtensionType roadsideReferencePointExtension;

    /**
     * Recupera il valore della proprietà roadsideReferencePointIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoadsideReferencePointIdentifier() {
        return roadsideReferencePointIdentifier;
    }

    /**
     * Imposta il valore della proprietà roadsideReferencePointIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoadsideReferencePointIdentifier(String value) {
        this.roadsideReferencePointIdentifier = value;
    }

    /**
     * Recupera il valore della proprietà administrativeArea.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getAdministrativeArea() {
        return administrativeArea;
    }

    /**
     * Imposta il valore della proprietà administrativeArea.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setAdministrativeArea(MultilingualString value) {
        this.administrativeArea = value;
    }

    /**
     * Recupera il valore della proprietà roadName.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getRoadName() {
        return roadName;
    }

    /**
     * Imposta il valore della proprietà roadName.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setRoadName(MultilingualString value) {
        this.roadName = value;
    }

    /**
     * Recupera il valore della proprietà roadNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoadNumber() {
        return roadNumber;
    }

    /**
     * Imposta il valore della proprietà roadNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoadNumber(String value) {
        this.roadNumber = value;
    }

    /**
     * Recupera il valore della proprietà directionBound.
     * 
     * @return
     *     possible object is
     *     {@link DirectionEnum }
     *     
     */
    public DirectionEnum getDirectionBound() {
        return directionBound;
    }

    /**
     * Imposta il valore della proprietà directionBound.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionEnum }
     *     
     */
    public void setDirectionBound(DirectionEnum value) {
        this.directionBound = value;
    }

    /**
     * Recupera il valore della proprietà directionRelative.
     * 
     * @return
     *     possible object is
     *     {@link ReferencePointDirectionEnum }
     *     
     */
    public ReferencePointDirectionEnum getDirectionRelative() {
        return directionRelative;
    }

    /**
     * Imposta il valore della proprietà directionRelative.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferencePointDirectionEnum }
     *     
     */
    public void setDirectionRelative(ReferencePointDirectionEnum value) {
        this.directionRelative = value;
    }

    /**
     * Recupera il valore della proprietà distanceFromPrevious.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDistanceFromPrevious() {
        return distanceFromPrevious;
    }

    /**
     * Imposta il valore della proprietà distanceFromPrevious.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDistanceFromPrevious(Float value) {
        this.distanceFromPrevious = value;
    }

    /**
     * Recupera il valore della proprietà distanceToNext.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDistanceToNext() {
        return distanceToNext;
    }

    /**
     * Imposta il valore della proprietà distanceToNext.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDistanceToNext(Float value) {
        this.distanceToNext = value;
    }

    /**
     * Recupera il valore della proprietà elevatedRoadSection.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isElevatedRoadSection() {
        return elevatedRoadSection;
    }

    /**
     * Imposta il valore della proprietà elevatedRoadSection.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setElevatedRoadSection(Boolean value) {
        this.elevatedRoadSection = value;
    }

    /**
     * Recupera il valore della proprietà roadsideReferencePointDescription.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getRoadsideReferencePointDescription() {
        return roadsideReferencePointDescription;
    }

    /**
     * Imposta il valore della proprietà roadsideReferencePointDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setRoadsideReferencePointDescription(MultilingualString value) {
        this.roadsideReferencePointDescription = value;
    }

    /**
     * Recupera il valore della proprietà roadsideReferencePointDistance.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRoadsideReferencePointDistance() {
        return roadsideReferencePointDistance;
    }

    /**
     * Imposta il valore della proprietà roadsideReferencePointDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRoadsideReferencePointDistance(Float value) {
        this.roadsideReferencePointDistance = value;
    }

    /**
     * Recupera il valore della proprietà roadsideReferencePointExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getRoadsideReferencePointExtension() {
        return roadsideReferencePointExtension;
    }

    /**
     * Imposta il valore della proprietà roadsideReferencePointExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setRoadsideReferencePointExtension(ExtensionType value) {
        this.roadsideReferencePointExtension = value;
    }

    public RoadsideReferencePoint withRoadsideReferencePointIdentifier(String value) {
        setRoadsideReferencePointIdentifier(value);
        return this;
    }

    public RoadsideReferencePoint withAdministrativeArea(MultilingualString value) {
        setAdministrativeArea(value);
        return this;
    }

    public RoadsideReferencePoint withRoadName(MultilingualString value) {
        setRoadName(value);
        return this;
    }

    public RoadsideReferencePoint withRoadNumber(String value) {
        setRoadNumber(value);
        return this;
    }

    public RoadsideReferencePoint withDirectionBound(DirectionEnum value) {
        setDirectionBound(value);
        return this;
    }

    public RoadsideReferencePoint withDirectionRelative(ReferencePointDirectionEnum value) {
        setDirectionRelative(value);
        return this;
    }

    public RoadsideReferencePoint withDistanceFromPrevious(Float value) {
        setDistanceFromPrevious(value);
        return this;
    }

    public RoadsideReferencePoint withDistanceToNext(Float value) {
        setDistanceToNext(value);
        return this;
    }

    public RoadsideReferencePoint withElevatedRoadSection(Boolean value) {
        setElevatedRoadSection(value);
        return this;
    }

    public RoadsideReferencePoint withRoadsideReferencePointDescription(MultilingualString value) {
        setRoadsideReferencePointDescription(value);
        return this;
    }

    public RoadsideReferencePoint withRoadsideReferencePointDistance(Float value) {
        setRoadsideReferencePointDistance(value);
        return this;
    }

    public RoadsideReferencePoint withRoadsideReferencePointExtension(ExtensionType value) {
        setRoadsideReferencePointExtension(value);
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

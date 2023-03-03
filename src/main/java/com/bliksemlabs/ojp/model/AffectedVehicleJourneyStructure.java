//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package com.bliksemlabs.ojp.model;

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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.LocalDateTimeISO8601XmlAdapter;
import uk.org.ifopt.acsb.AccessibilityAssessmentStructure;


/**
 * <p>Classe Java per AffectedVehicleJourneyStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AffectedVehicleJourneyStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="FramedVehicleJourneyRef" type="{http://www.siri.org.uk/siri}FramedVehicleJourneyRefStructure"/&gt;
 *           &lt;element name="VehicleJourneyRef" type="{http://www.siri.org.uk/siri}VehicleJourneyRefStructure" maxOccurs="unbounded"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="DatedVehicleJourneyRef" type="{http://www.siri.org.uk/siri}DatedVehicleJourneyRefStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="JourneyName" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Operator" type="{http://www.siri.org.uk/siri}AffectedOperatorStructure" minOccurs="0"/&gt;
 *         &lt;element name="LineRef" type="{http://www.siri.org.uk/siri}LineRefStructure" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}PublishedLineName" minOccurs="0"/&gt;
 *         &lt;element name="DirectionRef" type="{http://www.siri.org.uk/siri}DirectionRefStructure" minOccurs="0"/&gt;
 *         &lt;element name="BlockRef" type="{http://www.siri.org.uk/siri}BlockRefStructure" minOccurs="0"/&gt;
 *         &lt;element name="TrainNumbers" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TrainNumberRef" type="{http://www.siri.org.uk/siri}TrainNumberRefStructure" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="JourneyParts" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="JourneyPartInfo" type="{http://www.siri.org.uk/siri}JourneyPartInfoStructure" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Origins" type="{http://www.siri.org.uk/siri}AffectedStopPointStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Destinations" type="{http://www.siri.org.uk/siri}AffectedStopPointStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Route" type="{http://www.siri.org.uk/siri}AffectedRouteStructure" maxOccurs="unbounded"/&gt;
 *         &lt;element name="OriginAimedDepartureTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DestinationAimedArrivalTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="OriginDisplayAtDestination" type="{http://www.siri.org.uk/siri}NaturalLanguagePlaceNameStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DestinationDisplayAtOrigin" type="{http://www.siri.org.uk/siri}NaturalLanguagePlaceNameStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AccessibilityAssessment" type="{http://www.ifopt.org.uk/acsb}AccessibilityAssessmentStructure" minOccurs="0"/&gt;
 *         &lt;element name="JourneyCondition" type="{http://www.siri.org.uk/siri}ServiceConditionEnumeration" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Calls" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Call" type="{http://www.siri.org.uk/siri}AffectedCallStructure" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Facilities" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AffectedFacility" type="{http://www.siri.org.uk/siri}AffectedFacilityStructure" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffectedVehicleJourneyStructure", propOrder = {
    "framedVehicleJourneyRef",
    "vehicleJourneyRef",
    "datedVehicleJourneyRef",
    "journeyName",
    "operator",
    "lineRef",
    "publishedLineName",
    "directionRef",
    "blockRef",
    "trainNumbers",
    "journeyParts",
    "origins",
    "destinations",
    "route",
    "originAimedDepartureTime",
    "destinationAimedArrivalTime",
    "originDisplayAtDestination",
    "destinationDisplayAtOrigin",
    "accessibilityAssessment",
    "journeyCondition",
    "calls",
    "facilities",
    "extensions"
})
public class AffectedVehicleJourneyStructure {

    @XmlElement(name = "FramedVehicleJourneyRef")
    protected FramedVehicleJourneyRefStructure framedVehicleJourneyRef;
    @XmlElement(name = "VehicleJourneyRef")
    protected List<VehicleJourneyRefStructure> vehicleJourneyRef;
    @XmlElement(name = "DatedVehicleJourneyRef")
    protected List<DatedVehicleJourneyRefStructure> datedVehicleJourneyRef;
    @XmlElement(name = "JourneyName")
    protected List<NaturalLanguageStringStructure> journeyName;
    @XmlElement(name = "Operator")
    protected AffectedOperatorStructure operator;
    @XmlElement(name = "LineRef")
    protected LineRefStructure lineRef;
    @XmlElement(name = "PublishedLineName")
    protected NaturalLanguageStringStructure publishedLineName;
    @XmlElement(name = "DirectionRef")
    protected DirectionRefStructure directionRef;
    @XmlElement(name = "BlockRef")
    protected BlockRefStructure blockRef;
    @XmlElement(name = "TrainNumbers")
    protected AffectedVehicleJourneyStructure.TrainNumbers trainNumbers;
    @XmlElement(name = "JourneyParts")
    protected AffectedVehicleJourneyStructure.JourneyParts journeyParts;
    @XmlElement(name = "Origins")
    protected List<AffectedStopPointStructure> origins;
    @XmlElement(name = "Destinations")
    protected List<AffectedStopPointStructure> destinations;
    @XmlElement(name = "Route", required = true)
    protected List<AffectedRouteStructure> route;
    @XmlElement(name = "OriginAimedDepartureTime", type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime originAimedDepartureTime;
    @XmlElement(name = "DestinationAimedArrivalTime", type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime destinationAimedArrivalTime;
    @XmlElement(name = "OriginDisplayAtDestination")
    protected List<NaturalLanguagePlaceNameStructure> originDisplayAtDestination;
    @XmlElement(name = "DestinationDisplayAtOrigin")
    protected List<NaturalLanguagePlaceNameStructure> destinationDisplayAtOrigin;
    @XmlElement(name = "AccessibilityAssessment")
    protected AccessibilityAssessmentStructure accessibilityAssessment;
    @XmlElement(name = "JourneyCondition")
    @XmlSchemaType(name = "NMTOKEN")
    protected List<ServiceConditionEnumeration> journeyCondition;
    @XmlElement(name = "Calls")
    protected AffectedVehicleJourneyStructure.Calls calls;
    @XmlElement(name = "Facilities")
    protected AffectedVehicleJourneyStructure.Facilities facilities;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Recupera il valore della proprietà framedVehicleJourneyRef.
     * 
     * @return
     *     possible object is
     *     {@link FramedVehicleJourneyRefStructure }
     *     
     */
    public FramedVehicleJourneyRefStructure getFramedVehicleJourneyRef() {
        return framedVehicleJourneyRef;
    }

    /**
     * Imposta il valore della proprietà framedVehicleJourneyRef.
     * 
     * @param value
     *     allowed object is
     *     {@link FramedVehicleJourneyRefStructure }
     *     
     */
    public void setFramedVehicleJourneyRef(FramedVehicleJourneyRefStructure value) {
        this.framedVehicleJourneyRef = value;
    }

    /**
     * Gets the value of the vehicleJourneyRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleJourneyRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleJourneyRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleJourneyRefStructure }
     * 
     * 
     */
    public List<VehicleJourneyRefStructure> getVehicleJourneyRef() {
        if (vehicleJourneyRef == null) {
            vehicleJourneyRef = new ArrayList<VehicleJourneyRefStructure>();
        }
        return this.vehicleJourneyRef;
    }

    /**
     * Gets the value of the datedVehicleJourneyRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datedVehicleJourneyRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatedVehicleJourneyRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DatedVehicleJourneyRefStructure }
     * 
     * 
     */
    public List<DatedVehicleJourneyRefStructure> getDatedVehicleJourneyRef() {
        if (datedVehicleJourneyRef == null) {
            datedVehicleJourneyRef = new ArrayList<DatedVehicleJourneyRefStructure>();
        }
        return this.datedVehicleJourneyRef;
    }

    /**
     * Gets the value of the journeyName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the journeyName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJourneyName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getJourneyName() {
        if (journeyName == null) {
            journeyName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.journeyName;
    }

    /**
     * Recupera il valore della proprietà operator.
     * 
     * @return
     *     possible object is
     *     {@link AffectedOperatorStructure }
     *     
     */
    public AffectedOperatorStructure getOperator() {
        return operator;
    }

    /**
     * Imposta il valore della proprietà operator.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectedOperatorStructure }
     *     
     */
    public void setOperator(AffectedOperatorStructure value) {
        this.operator = value;
    }

    /**
     * Recupera il valore della proprietà lineRef.
     * 
     * @return
     *     possible object is
     *     {@link LineRefStructure }
     *     
     */
    public LineRefStructure getLineRef() {
        return lineRef;
    }

    /**
     * Imposta il valore della proprietà lineRef.
     * 
     * @param value
     *     allowed object is
     *     {@link LineRefStructure }
     *     
     */
    public void setLineRef(LineRefStructure value) {
        this.lineRef = value;
    }

    /**
     * Recupera il valore della proprietà publishedLineName.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getPublishedLineName() {
        return publishedLineName;
    }

    /**
     * Imposta il valore della proprietà publishedLineName.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setPublishedLineName(NaturalLanguageStringStructure value) {
        this.publishedLineName = value;
    }

    /**
     * Recupera il valore della proprietà directionRef.
     * 
     * @return
     *     possible object is
     *     {@link DirectionRefStructure }
     *     
     */
    public DirectionRefStructure getDirectionRef() {
        return directionRef;
    }

    /**
     * Imposta il valore della proprietà directionRef.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionRefStructure }
     *     
     */
    public void setDirectionRef(DirectionRefStructure value) {
        this.directionRef = value;
    }

    /**
     * Recupera il valore della proprietà blockRef.
     * 
     * @return
     *     possible object is
     *     {@link BlockRefStructure }
     *     
     */
    public BlockRefStructure getBlockRef() {
        return blockRef;
    }

    /**
     * Imposta il valore della proprietà blockRef.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockRefStructure }
     *     
     */
    public void setBlockRef(BlockRefStructure value) {
        this.blockRef = value;
    }

    /**
     * Recupera il valore della proprietà trainNumbers.
     * 
     * @return
     *     possible object is
     *     {@link AffectedVehicleJourneyStructure.TrainNumbers }
     *     
     */
    public AffectedVehicleJourneyStructure.TrainNumbers getTrainNumbers() {
        return trainNumbers;
    }

    /**
     * Imposta il valore della proprietà trainNumbers.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectedVehicleJourneyStructure.TrainNumbers }
     *     
     */
    public void setTrainNumbers(AffectedVehicleJourneyStructure.TrainNumbers value) {
        this.trainNumbers = value;
    }

    /**
     * Recupera il valore della proprietà journeyParts.
     * 
     * @return
     *     possible object is
     *     {@link AffectedVehicleJourneyStructure.JourneyParts }
     *     
     */
    public AffectedVehicleJourneyStructure.JourneyParts getJourneyParts() {
        return journeyParts;
    }

    /**
     * Imposta il valore della proprietà journeyParts.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectedVehicleJourneyStructure.JourneyParts }
     *     
     */
    public void setJourneyParts(AffectedVehicleJourneyStructure.JourneyParts value) {
        this.journeyParts = value;
    }

    /**
     * Gets the value of the origins property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the origins property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrigins().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AffectedStopPointStructure }
     * 
     * 
     */
    public List<AffectedStopPointStructure> getOrigins() {
        if (origins == null) {
            origins = new ArrayList<AffectedStopPointStructure>();
        }
        return this.origins;
    }

    /**
     * Gets the value of the destinations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the destinations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestinations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AffectedStopPointStructure }
     * 
     * 
     */
    public List<AffectedStopPointStructure> getDestinations() {
        if (destinations == null) {
            destinations = new ArrayList<AffectedStopPointStructure>();
        }
        return this.destinations;
    }

    /**
     * Gets the value of the route property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the route property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AffectedRouteStructure }
     * 
     * 
     */
    public List<AffectedRouteStructure> getRoute() {
        if (route == null) {
            route = new ArrayList<AffectedRouteStructure>();
        }
        return this.route;
    }

    /**
     * Recupera il valore della proprietà originAimedDepartureTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getOriginAimedDepartureTime() {
        return originAimedDepartureTime;
    }

    /**
     * Imposta il valore della proprietà originAimedDepartureTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginAimedDepartureTime(LocalDateTime value) {
        this.originAimedDepartureTime = value;
    }

    /**
     * Recupera il valore della proprietà destinationAimedArrivalTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getDestinationAimedArrivalTime() {
        return destinationAimedArrivalTime;
    }

    /**
     * Imposta il valore della proprietà destinationAimedArrivalTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationAimedArrivalTime(LocalDateTime value) {
        this.destinationAimedArrivalTime = value;
    }

    /**
     * Gets the value of the originDisplayAtDestination property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the originDisplayAtDestination property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginDisplayAtDestination().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguagePlaceNameStructure }
     * 
     * 
     */
    public List<NaturalLanguagePlaceNameStructure> getOriginDisplayAtDestination() {
        if (originDisplayAtDestination == null) {
            originDisplayAtDestination = new ArrayList<NaturalLanguagePlaceNameStructure>();
        }
        return this.originDisplayAtDestination;
    }

    /**
     * Gets the value of the destinationDisplayAtOrigin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the destinationDisplayAtOrigin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestinationDisplayAtOrigin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguagePlaceNameStructure }
     * 
     * 
     */
    public List<NaturalLanguagePlaceNameStructure> getDestinationDisplayAtOrigin() {
        if (destinationDisplayAtOrigin == null) {
            destinationDisplayAtOrigin = new ArrayList<NaturalLanguagePlaceNameStructure>();
        }
        return this.destinationDisplayAtOrigin;
    }

    /**
     * Recupera il valore della proprietà accessibilityAssessment.
     * 
     * @return
     *     possible object is
     *     {@link AccessibilityAssessmentStructure }
     *     
     */
    public AccessibilityAssessmentStructure getAccessibilityAssessment() {
        return accessibilityAssessment;
    }

    /**
     * Imposta il valore della proprietà accessibilityAssessment.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessibilityAssessmentStructure }
     *     
     */
    public void setAccessibilityAssessment(AccessibilityAssessmentStructure value) {
        this.accessibilityAssessment = value;
    }

    /**
     * Gets the value of the journeyCondition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the journeyCondition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJourneyCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceConditionEnumeration }
     * 
     * 
     */
    public List<ServiceConditionEnumeration> getJourneyCondition() {
        if (journeyCondition == null) {
            journeyCondition = new ArrayList<ServiceConditionEnumeration>();
        }
        return this.journeyCondition;
    }

    /**
     * Recupera il valore della proprietà calls.
     * 
     * @return
     *     possible object is
     *     {@link AffectedVehicleJourneyStructure.Calls }
     *     
     */
    public AffectedVehicleJourneyStructure.Calls getCalls() {
        return calls;
    }

    /**
     * Imposta il valore della proprietà calls.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectedVehicleJourneyStructure.Calls }
     *     
     */
    public void setCalls(AffectedVehicleJourneyStructure.Calls value) {
        this.calls = value;
    }

    /**
     * Recupera il valore della proprietà facilities.
     * 
     * @return
     *     possible object is
     *     {@link AffectedVehicleJourneyStructure.Facilities }
     *     
     */
    public AffectedVehicleJourneyStructure.Facilities getFacilities() {
        return facilities;
    }

    /**
     * Imposta il valore della proprietà facilities.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectedVehicleJourneyStructure.Facilities }
     *     
     */
    public void setFacilities(AffectedVehicleJourneyStructure.Facilities value) {
        this.facilities = value;
    }

    /**
     * Recupera il valore della proprietà extensions.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsStructure }
     *     
     */
    public ExtensionsStructure getExtensions() {
        return extensions;
    }

    /**
     * Imposta il valore della proprietà extensions.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsStructure }
     *     
     */
    public void setExtensions(ExtensionsStructure value) {
        this.extensions = value;
    }

    public AffectedVehicleJourneyStructure withFramedVehicleJourneyRef(FramedVehicleJourneyRefStructure value) {
        setFramedVehicleJourneyRef(value);
        return this;
    }

    public AffectedVehicleJourneyStructure withVehicleJourneyRef(VehicleJourneyRefStructure... values) {
        if (values!= null) {
            for (VehicleJourneyRefStructure value: values) {
                getVehicleJourneyRef().add(value);
            }
        }
        return this;
    }

    public AffectedVehicleJourneyStructure withVehicleJourneyRef(Collection<VehicleJourneyRefStructure> values) {
        if (values!= null) {
            getVehicleJourneyRef().addAll(values);
        }
        return this;
    }

    public AffectedVehicleJourneyStructure withDatedVehicleJourneyRef(DatedVehicleJourneyRefStructure... values) {
        if (values!= null) {
            for (DatedVehicleJourneyRefStructure value: values) {
                getDatedVehicleJourneyRef().add(value);
            }
        }
        return this;
    }

    public AffectedVehicleJourneyStructure withDatedVehicleJourneyRef(Collection<DatedVehicleJourneyRefStructure> values) {
        if (values!= null) {
            getDatedVehicleJourneyRef().addAll(values);
        }
        return this;
    }

    public AffectedVehicleJourneyStructure withJourneyName(NaturalLanguageStringStructure... values) {
        if (values!= null) {
            for (NaturalLanguageStringStructure value: values) {
                getJourneyName().add(value);
            }
        }
        return this;
    }

    public AffectedVehicleJourneyStructure withJourneyName(Collection<NaturalLanguageStringStructure> values) {
        if (values!= null) {
            getJourneyName().addAll(values);
        }
        return this;
    }

    public AffectedVehicleJourneyStructure withOperator(AffectedOperatorStructure value) {
        setOperator(value);
        return this;
    }

    public AffectedVehicleJourneyStructure withLineRef(LineRefStructure value) {
        setLineRef(value);
        return this;
    }

    public AffectedVehicleJourneyStructure withPublishedLineName(NaturalLanguageStringStructure value) {
        setPublishedLineName(value);
        return this;
    }

    public AffectedVehicleJourneyStructure withDirectionRef(DirectionRefStructure value) {
        setDirectionRef(value);
        return this;
    }

    public AffectedVehicleJourneyStructure withBlockRef(BlockRefStructure value) {
        setBlockRef(value);
        return this;
    }

    public AffectedVehicleJourneyStructure withTrainNumbers(AffectedVehicleJourneyStructure.TrainNumbers value) {
        setTrainNumbers(value);
        return this;
    }

    public AffectedVehicleJourneyStructure withJourneyParts(AffectedVehicleJourneyStructure.JourneyParts value) {
        setJourneyParts(value);
        return this;
    }

    public AffectedVehicleJourneyStructure withOrigins(AffectedStopPointStructure... values) {
        if (values!= null) {
            for (AffectedStopPointStructure value: values) {
                getOrigins().add(value);
            }
        }
        return this;
    }

    public AffectedVehicleJourneyStructure withOrigins(Collection<AffectedStopPointStructure> values) {
        if (values!= null) {
            getOrigins().addAll(values);
        }
        return this;
    }

    public AffectedVehicleJourneyStructure withDestinations(AffectedStopPointStructure... values) {
        if (values!= null) {
            for (AffectedStopPointStructure value: values) {
                getDestinations().add(value);
            }
        }
        return this;
    }

    public AffectedVehicleJourneyStructure withDestinations(Collection<AffectedStopPointStructure> values) {
        if (values!= null) {
            getDestinations().addAll(values);
        }
        return this;
    }

    public AffectedVehicleJourneyStructure withRoute(AffectedRouteStructure... values) {
        if (values!= null) {
            for (AffectedRouteStructure value: values) {
                getRoute().add(value);
            }
        }
        return this;
    }

    public AffectedVehicleJourneyStructure withRoute(Collection<AffectedRouteStructure> values) {
        if (values!= null) {
            getRoute().addAll(values);
        }
        return this;
    }

    public AffectedVehicleJourneyStructure withOriginAimedDepartureTime(LocalDateTime value) {
        setOriginAimedDepartureTime(value);
        return this;
    }

    public AffectedVehicleJourneyStructure withDestinationAimedArrivalTime(LocalDateTime value) {
        setDestinationAimedArrivalTime(value);
        return this;
    }

    public AffectedVehicleJourneyStructure withOriginDisplayAtDestination(NaturalLanguagePlaceNameStructure... values) {
        if (values!= null) {
            for (NaturalLanguagePlaceNameStructure value: values) {
                getOriginDisplayAtDestination().add(value);
            }
        }
        return this;
    }

    public AffectedVehicleJourneyStructure withOriginDisplayAtDestination(Collection<NaturalLanguagePlaceNameStructure> values) {
        if (values!= null) {
            getOriginDisplayAtDestination().addAll(values);
        }
        return this;
    }

    public AffectedVehicleJourneyStructure withDestinationDisplayAtOrigin(NaturalLanguagePlaceNameStructure... values) {
        if (values!= null) {
            for (NaturalLanguagePlaceNameStructure value: values) {
                getDestinationDisplayAtOrigin().add(value);
            }
        }
        return this;
    }

    public AffectedVehicleJourneyStructure withDestinationDisplayAtOrigin(Collection<NaturalLanguagePlaceNameStructure> values) {
        if (values!= null) {
            getDestinationDisplayAtOrigin().addAll(values);
        }
        return this;
    }

    public AffectedVehicleJourneyStructure withAccessibilityAssessment(AccessibilityAssessmentStructure value) {
        setAccessibilityAssessment(value);
        return this;
    }

    public AffectedVehicleJourneyStructure withJourneyCondition(ServiceConditionEnumeration... values) {
        if (values!= null) {
            for (ServiceConditionEnumeration value: values) {
                getJourneyCondition().add(value);
            }
        }
        return this;
    }

    public AffectedVehicleJourneyStructure withJourneyCondition(Collection<ServiceConditionEnumeration> values) {
        if (values!= null) {
            getJourneyCondition().addAll(values);
        }
        return this;
    }

    public AffectedVehicleJourneyStructure withCalls(AffectedVehicleJourneyStructure.Calls value) {
        setCalls(value);
        return this;
    }

    public AffectedVehicleJourneyStructure withFacilities(AffectedVehicleJourneyStructure.Facilities value) {
        setFacilities(value);
        return this;
    }

    public AffectedVehicleJourneyStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
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
     *         &lt;element name="Call" type="{http://www.siri.org.uk/siri}AffectedCallStructure" maxOccurs="unbounded"/&gt;
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
        "call"
    })
    public static class Calls {

        @XmlElement(name = "Call", required = true)
        protected List<AffectedCallStructure> call;

        /**
         * Gets the value of the call property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the call property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCall().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AffectedCallStructure }
         * 
         * 
         */
        public List<AffectedCallStructure> getCall() {
            if (call == null) {
                call = new ArrayList<AffectedCallStructure>();
            }
            return this.call;
        }

        public AffectedVehicleJourneyStructure.Calls withCall(AffectedCallStructure... values) {
            if (values!= null) {
                for (AffectedCallStructure value: values) {
                    getCall().add(value);
                }
            }
            return this;
        }

        public AffectedVehicleJourneyStructure.Calls withCall(Collection<AffectedCallStructure> values) {
            if (values!= null) {
                getCall().addAll(values);
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
     *         &lt;element name="AffectedFacility" type="{http://www.siri.org.uk/siri}AffectedFacilityStructure" maxOccurs="unbounded"/&gt;
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
        "affectedFacility"
    })
    public static class Facilities {

        @XmlElement(name = "AffectedFacility", required = true)
        protected List<AffectedFacilityStructure> affectedFacility;

        /**
         * Gets the value of the affectedFacility property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the affectedFacility property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAffectedFacility().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AffectedFacilityStructure }
         * 
         * 
         */
        public List<AffectedFacilityStructure> getAffectedFacility() {
            if (affectedFacility == null) {
                affectedFacility = new ArrayList<AffectedFacilityStructure>();
            }
            return this.affectedFacility;
        }

        public AffectedVehicleJourneyStructure.Facilities withAffectedFacility(AffectedFacilityStructure... values) {
            if (values!= null) {
                for (AffectedFacilityStructure value: values) {
                    getAffectedFacility().add(value);
                }
            }
            return this;
        }

        public AffectedVehicleJourneyStructure.Facilities withAffectedFacility(Collection<AffectedFacilityStructure> values) {
            if (values!= null) {
                getAffectedFacility().addAll(values);
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
     *         &lt;element name="JourneyPartInfo" type="{http://www.siri.org.uk/siri}JourneyPartInfoStructure" maxOccurs="unbounded"/&gt;
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
        "journeyPartInfo"
    })
    public static class JourneyParts {

        @XmlElement(name = "JourneyPartInfo", required = true)
        protected List<JourneyPartInfoStructure> journeyPartInfo;

        /**
         * Gets the value of the journeyPartInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the journeyPartInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getJourneyPartInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JourneyPartInfoStructure }
         * 
         * 
         */
        public List<JourneyPartInfoStructure> getJourneyPartInfo() {
            if (journeyPartInfo == null) {
                journeyPartInfo = new ArrayList<JourneyPartInfoStructure>();
            }
            return this.journeyPartInfo;
        }

        public AffectedVehicleJourneyStructure.JourneyParts withJourneyPartInfo(JourneyPartInfoStructure... values) {
            if (values!= null) {
                for (JourneyPartInfoStructure value: values) {
                    getJourneyPartInfo().add(value);
                }
            }
            return this;
        }

        public AffectedVehicleJourneyStructure.JourneyParts withJourneyPartInfo(Collection<JourneyPartInfoStructure> values) {
            if (values!= null) {
                getJourneyPartInfo().addAll(values);
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
     *         &lt;element name="TrainNumberRef" type="{http://www.siri.org.uk/siri}TrainNumberRefStructure" maxOccurs="unbounded"/&gt;
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
        "trainNumberRef"
    })
    public static class TrainNumbers {

        @XmlElement(name = "TrainNumberRef", required = true)
        protected List<TrainNumberRefStructure> trainNumberRef;

        /**
         * Gets the value of the trainNumberRef property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the trainNumberRef property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTrainNumberRef().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TrainNumberRefStructure }
         * 
         * 
         */
        public List<TrainNumberRefStructure> getTrainNumberRef() {
            if (trainNumberRef == null) {
                trainNumberRef = new ArrayList<TrainNumberRefStructure>();
            }
            return this.trainNumberRef;
        }

        public AffectedVehicleJourneyStructure.TrainNumbers withTrainNumberRef(TrainNumberRefStructure... values) {
            if (values!= null) {
                for (TrainNumberRefStructure value: values) {
                    getTrainNumberRef().add(value);
                }
            }
            return this;
        }

        public AffectedVehicleJourneyStructure.TrainNumbers withTrainNumberRef(Collection<TrainNumberRefStructure> values) {
            if (values!= null) {
                getTrainNumberRef().addAll(values);
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

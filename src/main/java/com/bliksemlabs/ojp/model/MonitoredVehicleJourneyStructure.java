//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package com.bliksemlabs.ojp.model;

import java.math.BigInteger;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.migesok.jaxb.adapter.javatime.DurationXmlAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.LocalDateTimeISO8601XmlAdapter;


/**
 * <p>Classe Java per MonitoredVehicleJourneyStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="MonitoredVehicleJourneyStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}MonitoredJourneyIdentityGroup"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}JourneyPatternInfoGroup"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}VehicleJourneyInfoGroup"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}DisruptionGroup"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}JourneyProgressGroup"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}TrainOperationalInfoGroup"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}MonitoredCallingPatternGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonitoredVehicleJourneyStructure", propOrder = {
    "lineRef",
    "directionRef",
    "framedVehicleJourneyRef",
    "journeyPatternRef",
    "journeyPatternName",
    "vehicleMode",
    "routeRef",
    "publishedLineName",
    "groupOfLinesRef",
    "directionName",
    "externalLineRef",
    "operatorRef",
    "productCategoryRef",
    "serviceFeatureRef",
    "vehicleFeatureRef",
    "originRef",
    "originName",
    "originShortName",
    "destinationDisplayAtOrigin",
    "via",
    "destinationRef",
    "destinationName",
    "destinationShortName",
    "originDisplayAtDestination",
    "vehicleJourneyName",
    "journeyNote",
    "publicContact",
    "operationsContact",
    "headwayService",
    "originAimedDepartureTime",
    "destinationAimedArrivalTime",
    "firstOrLastJourney",
    "facilityConditionElement",
    "facilityChangeElement",
    "situationRef",
    "monitored",
    "monitoringError",
    "inCongestion",
    "inPanic",
    "predictionInaccurate",
    "dataSource",
    "confidenceLevel",
    "vehicleLocation",
    "locationRecordedAtTime",
    "bearing",
    "progressRate",
    "velocity",
    "engineOn",
    "occupancy",
    "delay",
    "progressStatus",
    "vehicleStatus",
    "trainBlockPart",
    "blockRef",
    "courseOfJourneyRef",
    "vehicleJourneyRef",
    "vehicleRef",
    "additionalVehicleJourneyRef",
    "driverRef",
    "driverName",
    "trainNumbers",
    "journeyParts",
    "previousCalls",
    "monitoredCall",
    "onwardCalls",
    "isCompleteStopSequence"
})
public class MonitoredVehicleJourneyStructure {

    @XmlElement(name = "LineRef")
    protected LineRefStructure lineRef;
    @XmlElement(name = "DirectionRef")
    protected DirectionRefStructure directionRef;
    @XmlElement(name = "FramedVehicleJourneyRef")
    protected FramedVehicleJourneyRefStructure framedVehicleJourneyRef;
    @XmlElement(name = "JourneyPatternRef")
    protected JourneyPatternRefStructure journeyPatternRef;
    @XmlElement(name = "JourneyPatternName")
    protected NaturalLanguageStringStructure journeyPatternName;
    @XmlElement(name = "VehicleMode")
    @XmlSchemaType(name = "NMTOKEN")
    protected List<VehicleModesEnumeration> vehicleMode;
    @XmlElement(name = "RouteRef")
    protected RouteRefStructure routeRef;
    @XmlElement(name = "PublishedLineName")
    protected List<NaturalLanguageStringStructure> publishedLineName;
    @XmlElement(name = "GroupOfLinesRef")
    protected GroupOfLinesRefStructure groupOfLinesRef;
    @XmlElement(name = "DirectionName")
    protected List<NaturalLanguageStringStructure> directionName;
    @XmlElement(name = "ExternalLineRef")
    protected LineRefStructure externalLineRef;
    @XmlElement(name = "OperatorRef")
    protected OperatorRefStructure operatorRef;
    @XmlElement(name = "ProductCategoryRef")
    protected ProductCategoryRefStructure productCategoryRef;
    @XmlElement(name = "ServiceFeatureRef")
    protected List<ServiceFeatureRefStructure> serviceFeatureRef;
    @XmlElement(name = "VehicleFeatureRef")
    protected List<VehicleFeatureRefStructure> vehicleFeatureRef;
    @XmlElement(name = "OriginRef")
    protected JourneyPlaceRefStructure originRef;
    @XmlElement(name = "OriginName")
    protected List<NaturalLanguagePlaceNameStructure> originName;
    @XmlElement(name = "OriginShortName")
    protected List<NaturalLanguagePlaceNameStructure> originShortName;
    @XmlElement(name = "DestinationDisplayAtOrigin")
    protected List<NaturalLanguagePlaceNameStructure> destinationDisplayAtOrigin;
    @XmlElement(name = "Via")
    protected List<ViaNameStructure> via;
    @XmlElement(name = "DestinationRef")
    protected DestinationRefStructure destinationRef;
    @XmlElement(name = "DestinationName")
    protected List<NaturalLanguageStringStructure> destinationName;
    @XmlElement(name = "DestinationShortName")
    protected List<NaturalLanguagePlaceNameStructure> destinationShortName;
    @XmlElement(name = "OriginDisplayAtDestination")
    protected List<NaturalLanguagePlaceNameStructure> originDisplayAtDestination;
    @XmlElement(name = "VehicleJourneyName")
    protected List<NaturalLanguageStringStructure> vehicleJourneyName;
    @XmlElement(name = "JourneyNote")
    protected List<NaturalLanguageStringStructure> journeyNote;
    @XmlElement(name = "PublicContact")
    protected SimpleContactStructure publicContact;
    @XmlElement(name = "OperationsContact")
    protected SimpleContactStructure operationsContact;
    @XmlElement(name = "HeadwayService", defaultValue = "false")
    protected Boolean headwayService;
    @XmlElement(name = "OriginAimedDepartureTime", type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime originAimedDepartureTime;
    @XmlElement(name = "DestinationAimedArrivalTime", type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime destinationAimedArrivalTime;
    @XmlElement(name = "FirstOrLastJourney", defaultValue = "unspecified")
    @XmlSchemaType(name = "NMTOKEN")
    protected FirstOrLastJourneyEnumeration firstOrLastJourney;
    @XmlElement(name = "FacilityConditionElement")
    protected List<FacilityConditionStructure> facilityConditionElement;
    @XmlElement(name = "FacilityChangeElement")
    protected FacilityChangeStructure facilityChangeElement;
    @XmlElement(name = "SituationRef")
    protected List<SituationRefStructure> situationRef;
    @XmlElement(name = "Monitored")
    protected Boolean monitored;
    @XmlList
    @XmlElement(name = "MonitoringError")
    @XmlSchemaType(name = "NMTOKENS")
    protected List<String> monitoringError;
    @XmlElement(name = "InCongestion")
    protected Boolean inCongestion;
    @XmlElement(name = "InPanic", defaultValue = "false")
    protected Boolean inPanic;
    @XmlElement(name = "PredictionInaccurate")
    protected Boolean predictionInaccurate;
    @XmlElement(name = "DataSource")
    protected String dataSource;
    @XmlElement(name = "ConfidenceLevel", defaultValue = "reliable")
    @XmlSchemaType(name = "NMTOKEN")
    protected QualityIndexEnumeration confidenceLevel;
    @XmlElement(name = "VehicleLocation")
    protected LocationStructure vehicleLocation;
    @XmlElement(name = "LocationRecordedAtTime", type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime locationRecordedAtTime;
    @XmlElement(name = "Bearing")
    protected Float bearing;
    @XmlElement(name = "ProgressRate")
    @XmlSchemaType(name = "NMTOKEN")
    protected ProgressRateEnumeration progressRate;
    @XmlElement(name = "Velocity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger velocity;
    @XmlElement(name = "EngineOn", defaultValue = "true")
    protected Boolean engineOn;
    @XmlElement(name = "Occupancy")
    @XmlSchemaType(name = "NMTOKEN")
    protected OccupancyEnumeration occupancy;
    @XmlElement(name = "Delay", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration delay;
    @XmlElement(name = "ProgressStatus")
    protected List<NaturalLanguageStringStructure> progressStatus;
    @XmlElement(name = "VehicleStatus")
    @XmlSchemaType(name = "NMTOKEN")
    protected VehicleStatusEnumeration vehicleStatus;
    @XmlElement(name = "TrainBlockPart")
    protected List<TrainBlockPartStructure> trainBlockPart;
    @XmlElement(name = "BlockRef")
    protected BlockRefStructure blockRef;
    @XmlElement(name = "CourseOfJourneyRef")
    protected CourseOfJourneyRefStructure courseOfJourneyRef;
    @XmlElement(name = "VehicleJourneyRef")
    protected VehicleJourneyRefStructure vehicleJourneyRef;
    @XmlElement(name = "VehicleRef")
    protected VehicleRefStructure vehicleRef;
    @XmlElement(name = "AdditionalVehicleJourneyRef")
    protected List<FramedVehicleJourneyRefStructure> additionalVehicleJourneyRef;
    @XmlElement(name = "DriverRef")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String driverRef;
    @XmlElement(name = "DriverName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String driverName;
    @XmlElement(name = "TrainNumbers")
    protected MonitoredVehicleJourneyStructure.TrainNumbers trainNumbers;
    @XmlElement(name = "JourneyParts")
    protected MonitoredVehicleJourneyStructure.JourneyParts journeyParts;
    @XmlElement(name = "PreviousCalls")
    protected PreviousCallsStructure previousCalls;
    @XmlElement(name = "MonitoredCall")
    protected MonitoredCallStructure monitoredCall;
    @XmlElement(name = "OnwardCalls")
    protected OnwardCallsStructure onwardCalls;
    @XmlElement(name = "IsCompleteStopSequence", defaultValue = "false")
    protected Boolean isCompleteStopSequence;

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
     * Recupera il valore della proprietà journeyPatternRef.
     * 
     * @return
     *     possible object is
     *     {@link JourneyPatternRefStructure }
     *     
     */
    public JourneyPatternRefStructure getJourneyPatternRef() {
        return journeyPatternRef;
    }

    /**
     * Imposta il valore della proprietà journeyPatternRef.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyPatternRefStructure }
     *     
     */
    public void setJourneyPatternRef(JourneyPatternRefStructure value) {
        this.journeyPatternRef = value;
    }

    /**
     * Recupera il valore della proprietà journeyPatternName.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getJourneyPatternName() {
        return journeyPatternName;
    }

    /**
     * Imposta il valore della proprietà journeyPatternName.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setJourneyPatternName(NaturalLanguageStringStructure value) {
        this.journeyPatternName = value;
    }

    /**
     * Gets the value of the vehicleMode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleMode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleMode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleModesEnumeration }
     * 
     * 
     */
    public List<VehicleModesEnumeration> getVehicleMode() {
        if (vehicleMode == null) {
            vehicleMode = new ArrayList<VehicleModesEnumeration>();
        }
        return this.vehicleMode;
    }

    /**
     * Recupera il valore della proprietà routeRef.
     * 
     * @return
     *     possible object is
     *     {@link RouteRefStructure }
     *     
     */
    public RouteRefStructure getRouteRef() {
        return routeRef;
    }

    /**
     * Imposta il valore della proprietà routeRef.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteRefStructure }
     *     
     */
    public void setRouteRef(RouteRefStructure value) {
        this.routeRef = value;
    }

    /**
     * Gets the value of the publishedLineName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publishedLineName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublishedLineName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getPublishedLineName() {
        if (publishedLineName == null) {
            publishedLineName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.publishedLineName;
    }

    /**
     * Recupera il valore della proprietà groupOfLinesRef.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfLinesRefStructure }
     *     
     */
    public GroupOfLinesRefStructure getGroupOfLinesRef() {
        return groupOfLinesRef;
    }

    /**
     * Imposta il valore della proprietà groupOfLinesRef.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfLinesRefStructure }
     *     
     */
    public void setGroupOfLinesRef(GroupOfLinesRefStructure value) {
        this.groupOfLinesRef = value;
    }

    /**
     * Gets the value of the directionName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the directionName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDirectionName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getDirectionName() {
        if (directionName == null) {
            directionName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.directionName;
    }

    /**
     * Recupera il valore della proprietà externalLineRef.
     * 
     * @return
     *     possible object is
     *     {@link LineRefStructure }
     *     
     */
    public LineRefStructure getExternalLineRef() {
        return externalLineRef;
    }

    /**
     * Imposta il valore della proprietà externalLineRef.
     * 
     * @param value
     *     allowed object is
     *     {@link LineRefStructure }
     *     
     */
    public void setExternalLineRef(LineRefStructure value) {
        this.externalLineRef = value;
    }

    /**
     * Recupera il valore della proprietà operatorRef.
     * 
     * @return
     *     possible object is
     *     {@link OperatorRefStructure }
     *     
     */
    public OperatorRefStructure getOperatorRef() {
        return operatorRef;
    }

    /**
     * Imposta il valore della proprietà operatorRef.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorRefStructure }
     *     
     */
    public void setOperatorRef(OperatorRefStructure value) {
        this.operatorRef = value;
    }

    /**
     * Recupera il valore della proprietà productCategoryRef.
     * 
     * @return
     *     possible object is
     *     {@link ProductCategoryRefStructure }
     *     
     */
    public ProductCategoryRefStructure getProductCategoryRef() {
        return productCategoryRef;
    }

    /**
     * Imposta il valore della proprietà productCategoryRef.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductCategoryRefStructure }
     *     
     */
    public void setProductCategoryRef(ProductCategoryRefStructure value) {
        this.productCategoryRef = value;
    }

    /**
     * Gets the value of the serviceFeatureRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceFeatureRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceFeatureRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceFeatureRefStructure }
     * 
     * 
     */
    public List<ServiceFeatureRefStructure> getServiceFeatureRef() {
        if (serviceFeatureRef == null) {
            serviceFeatureRef = new ArrayList<ServiceFeatureRefStructure>();
        }
        return this.serviceFeatureRef;
    }

    /**
     * Gets the value of the vehicleFeatureRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleFeatureRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleFeatureRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleFeatureRefStructure }
     * 
     * 
     */
    public List<VehicleFeatureRefStructure> getVehicleFeatureRef() {
        if (vehicleFeatureRef == null) {
            vehicleFeatureRef = new ArrayList<VehicleFeatureRefStructure>();
        }
        return this.vehicleFeatureRef;
    }

    /**
     * Recupera il valore della proprietà originRef.
     * 
     * @return
     *     possible object is
     *     {@link JourneyPlaceRefStructure }
     *     
     */
    public JourneyPlaceRefStructure getOriginRef() {
        return originRef;
    }

    /**
     * Imposta il valore della proprietà originRef.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyPlaceRefStructure }
     *     
     */
    public void setOriginRef(JourneyPlaceRefStructure value) {
        this.originRef = value;
    }

    /**
     * Gets the value of the originName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the originName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguagePlaceNameStructure }
     * 
     * 
     */
    public List<NaturalLanguagePlaceNameStructure> getOriginName() {
        if (originName == null) {
            originName = new ArrayList<NaturalLanguagePlaceNameStructure>();
        }
        return this.originName;
    }

    /**
     * Gets the value of the originShortName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the originShortName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginShortName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguagePlaceNameStructure }
     * 
     * 
     */
    public List<NaturalLanguagePlaceNameStructure> getOriginShortName() {
        if (originShortName == null) {
            originShortName = new ArrayList<NaturalLanguagePlaceNameStructure>();
        }
        return this.originShortName;
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
     * Gets the value of the via property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the via property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ViaNameStructure }
     * 
     * 
     */
    public List<ViaNameStructure> getVia() {
        if (via == null) {
            via = new ArrayList<ViaNameStructure>();
        }
        return this.via;
    }

    /**
     * Recupera il valore della proprietà destinationRef.
     * 
     * @return
     *     possible object is
     *     {@link DestinationRefStructure }
     *     
     */
    public DestinationRefStructure getDestinationRef() {
        return destinationRef;
    }

    /**
     * Imposta il valore della proprietà destinationRef.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationRefStructure }
     *     
     */
    public void setDestinationRef(DestinationRefStructure value) {
        this.destinationRef = value;
    }

    /**
     * Gets the value of the destinationName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the destinationName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestinationName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getDestinationName() {
        if (destinationName == null) {
            destinationName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.destinationName;
    }

    /**
     * Gets the value of the destinationShortName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the destinationShortName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestinationShortName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguagePlaceNameStructure }
     * 
     * 
     */
    public List<NaturalLanguagePlaceNameStructure> getDestinationShortName() {
        if (destinationShortName == null) {
            destinationShortName = new ArrayList<NaturalLanguagePlaceNameStructure>();
        }
        return this.destinationShortName;
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
     * Gets the value of the vehicleJourneyName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleJourneyName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleJourneyName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getVehicleJourneyName() {
        if (vehicleJourneyName == null) {
            vehicleJourneyName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.vehicleJourneyName;
    }

    /**
     * Gets the value of the journeyNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the journeyNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJourneyNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getJourneyNote() {
        if (journeyNote == null) {
            journeyNote = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.journeyNote;
    }

    /**
     * Recupera il valore della proprietà publicContact.
     * 
     * @return
     *     possible object is
     *     {@link SimpleContactStructure }
     *     
     */
    public SimpleContactStructure getPublicContact() {
        return publicContact;
    }

    /**
     * Imposta il valore della proprietà publicContact.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleContactStructure }
     *     
     */
    public void setPublicContact(SimpleContactStructure value) {
        this.publicContact = value;
    }

    /**
     * Recupera il valore della proprietà operationsContact.
     * 
     * @return
     *     possible object is
     *     {@link SimpleContactStructure }
     *     
     */
    public SimpleContactStructure getOperationsContact() {
        return operationsContact;
    }

    /**
     * Imposta il valore della proprietà operationsContact.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleContactStructure }
     *     
     */
    public void setOperationsContact(SimpleContactStructure value) {
        this.operationsContact = value;
    }

    /**
     * Recupera il valore della proprietà headwayService.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHeadwayService() {
        return headwayService;
    }

    /**
     * Imposta il valore della proprietà headwayService.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHeadwayService(Boolean value) {
        this.headwayService = value;
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
     * Recupera il valore della proprietà firstOrLastJourney.
     * 
     * @return
     *     possible object is
     *     {@link FirstOrLastJourneyEnumeration }
     *     
     */
    public FirstOrLastJourneyEnumeration getFirstOrLastJourney() {
        return firstOrLastJourney;
    }

    /**
     * Imposta il valore della proprietà firstOrLastJourney.
     * 
     * @param value
     *     allowed object is
     *     {@link FirstOrLastJourneyEnumeration }
     *     
     */
    public void setFirstOrLastJourney(FirstOrLastJourneyEnumeration value) {
        this.firstOrLastJourney = value;
    }

    /**
     * Gets the value of the facilityConditionElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facilityConditionElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacilityConditionElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacilityConditionStructure }
     * 
     * 
     */
    public List<FacilityConditionStructure> getFacilityConditionElement() {
        if (facilityConditionElement == null) {
            facilityConditionElement = new ArrayList<FacilityConditionStructure>();
        }
        return this.facilityConditionElement;
    }

    /**
     * Recupera il valore della proprietà facilityChangeElement.
     * 
     * @return
     *     possible object is
     *     {@link FacilityChangeStructure }
     *     
     */
    public FacilityChangeStructure getFacilityChangeElement() {
        return facilityChangeElement;
    }

    /**
     * Imposta il valore della proprietà facilityChangeElement.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityChangeStructure }
     *     
     */
    public void setFacilityChangeElement(FacilityChangeStructure value) {
        this.facilityChangeElement = value;
    }

    /**
     * Gets the value of the situationRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the situationRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSituationRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SituationRefStructure }
     * 
     * 
     */
    public List<SituationRefStructure> getSituationRef() {
        if (situationRef == null) {
            situationRef = new ArrayList<SituationRefStructure>();
        }
        return this.situationRef;
    }

    /**
     * Recupera il valore della proprietà monitored.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMonitored() {
        return monitored;
    }

    /**
     * Imposta il valore della proprietà monitored.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMonitored(Boolean value) {
        this.monitored = value;
    }

    /**
     * Gets the value of the monitoringError property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the monitoringError property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonitoringError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMonitoringError() {
        if (monitoringError == null) {
            monitoringError = new ArrayList<String>();
        }
        return this.monitoringError;
    }

    /**
     * Recupera il valore della proprietà inCongestion.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInCongestion() {
        return inCongestion;
    }

    /**
     * Imposta il valore della proprietà inCongestion.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInCongestion(Boolean value) {
        this.inCongestion = value;
    }

    /**
     * Recupera il valore della proprietà inPanic.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInPanic() {
        return inPanic;
    }

    /**
     * Imposta il valore della proprietà inPanic.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInPanic(Boolean value) {
        this.inPanic = value;
    }

    /**
     * Recupera il valore della proprietà predictionInaccurate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPredictionInaccurate() {
        return predictionInaccurate;
    }

    /**
     * Imposta il valore della proprietà predictionInaccurate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPredictionInaccurate(Boolean value) {
        this.predictionInaccurate = value;
    }

    /**
     * Recupera il valore della proprietà dataSource.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSource() {
        return dataSource;
    }

    /**
     * Imposta il valore della proprietà dataSource.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSource(String value) {
        this.dataSource = value;
    }

    /**
     * Recupera il valore della proprietà confidenceLevel.
     * 
     * @return
     *     possible object is
     *     {@link QualityIndexEnumeration }
     *     
     */
    public QualityIndexEnumeration getConfidenceLevel() {
        return confidenceLevel;
    }

    /**
     * Imposta il valore della proprietà confidenceLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link QualityIndexEnumeration }
     *     
     */
    public void setConfidenceLevel(QualityIndexEnumeration value) {
        this.confidenceLevel = value;
    }

    /**
     * Recupera il valore della proprietà vehicleLocation.
     * 
     * @return
     *     possible object is
     *     {@link LocationStructure }
     *     
     */
    public LocationStructure getVehicleLocation() {
        return vehicleLocation;
    }

    /**
     * Imposta il valore della proprietà vehicleLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationStructure }
     *     
     */
    public void setVehicleLocation(LocationStructure value) {
        this.vehicleLocation = value;
    }

    /**
     * Recupera il valore della proprietà locationRecordedAtTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getLocationRecordedAtTime() {
        return locationRecordedAtTime;
    }

    /**
     * Imposta il valore della proprietà locationRecordedAtTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationRecordedAtTime(LocalDateTime value) {
        this.locationRecordedAtTime = value;
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
     * Recupera il valore della proprietà progressRate.
     * 
     * @return
     *     possible object is
     *     {@link ProgressRateEnumeration }
     *     
     */
    public ProgressRateEnumeration getProgressRate() {
        return progressRate;
    }

    /**
     * Imposta il valore della proprietà progressRate.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgressRateEnumeration }
     *     
     */
    public void setProgressRate(ProgressRateEnumeration value) {
        this.progressRate = value;
    }

    /**
     * Recupera il valore della proprietà velocity.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVelocity() {
        return velocity;
    }

    /**
     * Imposta il valore della proprietà velocity.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVelocity(BigInteger value) {
        this.velocity = value;
    }

    /**
     * Recupera il valore della proprietà engineOn.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEngineOn() {
        return engineOn;
    }

    /**
     * Imposta il valore della proprietà engineOn.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEngineOn(Boolean value) {
        this.engineOn = value;
    }

    /**
     * Recupera il valore della proprietà occupancy.
     * 
     * @return
     *     possible object is
     *     {@link OccupancyEnumeration }
     *     
     */
    public OccupancyEnumeration getOccupancy() {
        return occupancy;
    }

    /**
     * Imposta il valore della proprietà occupancy.
     * 
     * @param value
     *     allowed object is
     *     {@link OccupancyEnumeration }
     *     
     */
    public void setOccupancy(OccupancyEnumeration value) {
        this.occupancy = value;
    }

    /**
     * Recupera il valore della proprietà delay.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getDelay() {
        return delay;
    }

    /**
     * Imposta il valore della proprietà delay.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelay(Duration value) {
        this.delay = value;
    }

    /**
     * Gets the value of the progressStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the progressStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProgressStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getProgressStatus() {
        if (progressStatus == null) {
            progressStatus = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.progressStatus;
    }

    /**
     * Recupera il valore della proprietà vehicleStatus.
     * 
     * @return
     *     possible object is
     *     {@link VehicleStatusEnumeration }
     *     
     */
    public VehicleStatusEnumeration getVehicleStatus() {
        return vehicleStatus;
    }

    /**
     * Imposta il valore della proprietà vehicleStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleStatusEnumeration }
     *     
     */
    public void setVehicleStatus(VehicleStatusEnumeration value) {
        this.vehicleStatus = value;
    }

    /**
     * Gets the value of the trainBlockPart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trainBlockPart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrainBlockPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrainBlockPartStructure }
     * 
     * 
     */
    public List<TrainBlockPartStructure> getTrainBlockPart() {
        if (trainBlockPart == null) {
            trainBlockPart = new ArrayList<TrainBlockPartStructure>();
        }
        return this.trainBlockPart;
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
     * Recupera il valore della proprietà courseOfJourneyRef.
     * 
     * @return
     *     possible object is
     *     {@link CourseOfJourneyRefStructure }
     *     
     */
    public CourseOfJourneyRefStructure getCourseOfJourneyRef() {
        return courseOfJourneyRef;
    }

    /**
     * Imposta il valore della proprietà courseOfJourneyRef.
     * 
     * @param value
     *     allowed object is
     *     {@link CourseOfJourneyRefStructure }
     *     
     */
    public void setCourseOfJourneyRef(CourseOfJourneyRefStructure value) {
        this.courseOfJourneyRef = value;
    }

    /**
     * Recupera il valore della proprietà vehicleJourneyRef.
     * 
     * @return
     *     possible object is
     *     {@link VehicleJourneyRefStructure }
     *     
     */
    public VehicleJourneyRefStructure getVehicleJourneyRef() {
        return vehicleJourneyRef;
    }

    /**
     * Imposta il valore della proprietà vehicleJourneyRef.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleJourneyRefStructure }
     *     
     */
    public void setVehicleJourneyRef(VehicleJourneyRefStructure value) {
        this.vehicleJourneyRef = value;
    }

    /**
     * Recupera il valore della proprietà vehicleRef.
     * 
     * @return
     *     possible object is
     *     {@link VehicleRefStructure }
     *     
     */
    public VehicleRefStructure getVehicleRef() {
        return vehicleRef;
    }

    /**
     * Imposta il valore della proprietà vehicleRef.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRefStructure }
     *     
     */
    public void setVehicleRef(VehicleRefStructure value) {
        this.vehicleRef = value;
    }

    /**
     * Gets the value of the additionalVehicleJourneyRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalVehicleJourneyRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalVehicleJourneyRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FramedVehicleJourneyRefStructure }
     * 
     * 
     */
    public List<FramedVehicleJourneyRefStructure> getAdditionalVehicleJourneyRef() {
        if (additionalVehicleJourneyRef == null) {
            additionalVehicleJourneyRef = new ArrayList<FramedVehicleJourneyRefStructure>();
        }
        return this.additionalVehicleJourneyRef;
    }

    /**
     * Recupera il valore della proprietà driverRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriverRef() {
        return driverRef;
    }

    /**
     * Imposta il valore della proprietà driverRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriverRef(String value) {
        this.driverRef = value;
    }

    /**
     * Recupera il valore della proprietà driverName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriverName() {
        return driverName;
    }

    /**
     * Imposta il valore della proprietà driverName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriverName(String value) {
        this.driverName = value;
    }

    /**
     * Recupera il valore della proprietà trainNumbers.
     * 
     * @return
     *     possible object is
     *     {@link MonitoredVehicleJourneyStructure.TrainNumbers }
     *     
     */
    public MonitoredVehicleJourneyStructure.TrainNumbers getTrainNumbers() {
        return trainNumbers;
    }

    /**
     * Imposta il valore della proprietà trainNumbers.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitoredVehicleJourneyStructure.TrainNumbers }
     *     
     */
    public void setTrainNumbers(MonitoredVehicleJourneyStructure.TrainNumbers value) {
        this.trainNumbers = value;
    }

    /**
     * Recupera il valore della proprietà journeyParts.
     * 
     * @return
     *     possible object is
     *     {@link MonitoredVehicleJourneyStructure.JourneyParts }
     *     
     */
    public MonitoredVehicleJourneyStructure.JourneyParts getJourneyParts() {
        return journeyParts;
    }

    /**
     * Imposta il valore della proprietà journeyParts.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitoredVehicleJourneyStructure.JourneyParts }
     *     
     */
    public void setJourneyParts(MonitoredVehicleJourneyStructure.JourneyParts value) {
        this.journeyParts = value;
    }

    /**
     * Recupera il valore della proprietà previousCalls.
     * 
     * @return
     *     possible object is
     *     {@link PreviousCallsStructure }
     *     
     */
    public PreviousCallsStructure getPreviousCalls() {
        return previousCalls;
    }

    /**
     * Imposta il valore della proprietà previousCalls.
     * 
     * @param value
     *     allowed object is
     *     {@link PreviousCallsStructure }
     *     
     */
    public void setPreviousCalls(PreviousCallsStructure value) {
        this.previousCalls = value;
    }

    /**
     * Recupera il valore della proprietà monitoredCall.
     * 
     * @return
     *     possible object is
     *     {@link MonitoredCallStructure }
     *     
     */
    public MonitoredCallStructure getMonitoredCall() {
        return monitoredCall;
    }

    /**
     * Imposta il valore della proprietà monitoredCall.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitoredCallStructure }
     *     
     */
    public void setMonitoredCall(MonitoredCallStructure value) {
        this.monitoredCall = value;
    }

    /**
     * Recupera il valore della proprietà onwardCalls.
     * 
     * @return
     *     possible object is
     *     {@link OnwardCallsStructure }
     *     
     */
    public OnwardCallsStructure getOnwardCalls() {
        return onwardCalls;
    }

    /**
     * Imposta il valore della proprietà onwardCalls.
     * 
     * @param value
     *     allowed object is
     *     {@link OnwardCallsStructure }
     *     
     */
    public void setOnwardCalls(OnwardCallsStructure value) {
        this.onwardCalls = value;
    }

    /**
     * Recupera il valore della proprietà isCompleteStopSequence.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCompleteStopSequence() {
        return isCompleteStopSequence;
    }

    /**
     * Imposta il valore della proprietà isCompleteStopSequence.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCompleteStopSequence(Boolean value) {
        this.isCompleteStopSequence = value;
    }

    public MonitoredVehicleJourneyStructure withLineRef(LineRefStructure value) {
        setLineRef(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withDirectionRef(DirectionRefStructure value) {
        setDirectionRef(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withFramedVehicleJourneyRef(FramedVehicleJourneyRefStructure value) {
        setFramedVehicleJourneyRef(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withJourneyPatternRef(JourneyPatternRefStructure value) {
        setJourneyPatternRef(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withJourneyPatternName(NaturalLanguageStringStructure value) {
        setJourneyPatternName(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withVehicleMode(VehicleModesEnumeration... values) {
        if (values!= null) {
            for (VehicleModesEnumeration value: values) {
                getVehicleMode().add(value);
            }
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withVehicleMode(Collection<VehicleModesEnumeration> values) {
        if (values!= null) {
            getVehicleMode().addAll(values);
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withRouteRef(RouteRefStructure value) {
        setRouteRef(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withPublishedLineName(NaturalLanguageStringStructure... values) {
        if (values!= null) {
            for (NaturalLanguageStringStructure value: values) {
                getPublishedLineName().add(value);
            }
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withPublishedLineName(Collection<NaturalLanguageStringStructure> values) {
        if (values!= null) {
            getPublishedLineName().addAll(values);
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withGroupOfLinesRef(GroupOfLinesRefStructure value) {
        setGroupOfLinesRef(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withDirectionName(NaturalLanguageStringStructure... values) {
        if (values!= null) {
            for (NaturalLanguageStringStructure value: values) {
                getDirectionName().add(value);
            }
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withDirectionName(Collection<NaturalLanguageStringStructure> values) {
        if (values!= null) {
            getDirectionName().addAll(values);
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withExternalLineRef(LineRefStructure value) {
        setExternalLineRef(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withOperatorRef(OperatorRefStructure value) {
        setOperatorRef(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withProductCategoryRef(ProductCategoryRefStructure value) {
        setProductCategoryRef(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withServiceFeatureRef(ServiceFeatureRefStructure... values) {
        if (values!= null) {
            for (ServiceFeatureRefStructure value: values) {
                getServiceFeatureRef().add(value);
            }
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withServiceFeatureRef(Collection<ServiceFeatureRefStructure> values) {
        if (values!= null) {
            getServiceFeatureRef().addAll(values);
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withVehicleFeatureRef(VehicleFeatureRefStructure... values) {
        if (values!= null) {
            for (VehicleFeatureRefStructure value: values) {
                getVehicleFeatureRef().add(value);
            }
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withVehicleFeatureRef(Collection<VehicleFeatureRefStructure> values) {
        if (values!= null) {
            getVehicleFeatureRef().addAll(values);
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withOriginRef(JourneyPlaceRefStructure value) {
        setOriginRef(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withOriginName(NaturalLanguagePlaceNameStructure... values) {
        if (values!= null) {
            for (NaturalLanguagePlaceNameStructure value: values) {
                getOriginName().add(value);
            }
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withOriginName(Collection<NaturalLanguagePlaceNameStructure> values) {
        if (values!= null) {
            getOriginName().addAll(values);
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withOriginShortName(NaturalLanguagePlaceNameStructure... values) {
        if (values!= null) {
            for (NaturalLanguagePlaceNameStructure value: values) {
                getOriginShortName().add(value);
            }
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withOriginShortName(Collection<NaturalLanguagePlaceNameStructure> values) {
        if (values!= null) {
            getOriginShortName().addAll(values);
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withDestinationDisplayAtOrigin(NaturalLanguagePlaceNameStructure... values) {
        if (values!= null) {
            for (NaturalLanguagePlaceNameStructure value: values) {
                getDestinationDisplayAtOrigin().add(value);
            }
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withDestinationDisplayAtOrigin(Collection<NaturalLanguagePlaceNameStructure> values) {
        if (values!= null) {
            getDestinationDisplayAtOrigin().addAll(values);
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withVia(ViaNameStructure... values) {
        if (values!= null) {
            for (ViaNameStructure value: values) {
                getVia().add(value);
            }
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withVia(Collection<ViaNameStructure> values) {
        if (values!= null) {
            getVia().addAll(values);
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withDestinationRef(DestinationRefStructure value) {
        setDestinationRef(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withDestinationName(NaturalLanguageStringStructure... values) {
        if (values!= null) {
            for (NaturalLanguageStringStructure value: values) {
                getDestinationName().add(value);
            }
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withDestinationName(Collection<NaturalLanguageStringStructure> values) {
        if (values!= null) {
            getDestinationName().addAll(values);
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withDestinationShortName(NaturalLanguagePlaceNameStructure... values) {
        if (values!= null) {
            for (NaturalLanguagePlaceNameStructure value: values) {
                getDestinationShortName().add(value);
            }
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withDestinationShortName(Collection<NaturalLanguagePlaceNameStructure> values) {
        if (values!= null) {
            getDestinationShortName().addAll(values);
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withOriginDisplayAtDestination(NaturalLanguagePlaceNameStructure... values) {
        if (values!= null) {
            for (NaturalLanguagePlaceNameStructure value: values) {
                getOriginDisplayAtDestination().add(value);
            }
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withOriginDisplayAtDestination(Collection<NaturalLanguagePlaceNameStructure> values) {
        if (values!= null) {
            getOriginDisplayAtDestination().addAll(values);
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withVehicleJourneyName(NaturalLanguageStringStructure... values) {
        if (values!= null) {
            for (NaturalLanguageStringStructure value: values) {
                getVehicleJourneyName().add(value);
            }
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withVehicleJourneyName(Collection<NaturalLanguageStringStructure> values) {
        if (values!= null) {
            getVehicleJourneyName().addAll(values);
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withJourneyNote(NaturalLanguageStringStructure... values) {
        if (values!= null) {
            for (NaturalLanguageStringStructure value: values) {
                getJourneyNote().add(value);
            }
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withJourneyNote(Collection<NaturalLanguageStringStructure> values) {
        if (values!= null) {
            getJourneyNote().addAll(values);
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withPublicContact(SimpleContactStructure value) {
        setPublicContact(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withOperationsContact(SimpleContactStructure value) {
        setOperationsContact(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withHeadwayService(Boolean value) {
        setHeadwayService(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withOriginAimedDepartureTime(LocalDateTime value) {
        setOriginAimedDepartureTime(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withDestinationAimedArrivalTime(LocalDateTime value) {
        setDestinationAimedArrivalTime(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withFirstOrLastJourney(FirstOrLastJourneyEnumeration value) {
        setFirstOrLastJourney(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withFacilityConditionElement(FacilityConditionStructure... values) {
        if (values!= null) {
            for (FacilityConditionStructure value: values) {
                getFacilityConditionElement().add(value);
            }
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withFacilityConditionElement(Collection<FacilityConditionStructure> values) {
        if (values!= null) {
            getFacilityConditionElement().addAll(values);
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withFacilityChangeElement(FacilityChangeStructure value) {
        setFacilityChangeElement(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withSituationRef(SituationRefStructure... values) {
        if (values!= null) {
            for (SituationRefStructure value: values) {
                getSituationRef().add(value);
            }
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withSituationRef(Collection<SituationRefStructure> values) {
        if (values!= null) {
            getSituationRef().addAll(values);
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withMonitored(Boolean value) {
        setMonitored(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withMonitoringError(String... values) {
        if (values!= null) {
            for (String value: values) {
                getMonitoringError().add(value);
            }
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withMonitoringError(Collection<String> values) {
        if (values!= null) {
            getMonitoringError().addAll(values);
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withInCongestion(Boolean value) {
        setInCongestion(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withInPanic(Boolean value) {
        setInPanic(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withPredictionInaccurate(Boolean value) {
        setPredictionInaccurate(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withDataSource(String value) {
        setDataSource(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withConfidenceLevel(QualityIndexEnumeration value) {
        setConfidenceLevel(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withVehicleLocation(LocationStructure value) {
        setVehicleLocation(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withLocationRecordedAtTime(LocalDateTime value) {
        setLocationRecordedAtTime(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withBearing(Float value) {
        setBearing(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withProgressRate(ProgressRateEnumeration value) {
        setProgressRate(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withVelocity(BigInteger value) {
        setVelocity(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withEngineOn(Boolean value) {
        setEngineOn(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withOccupancy(OccupancyEnumeration value) {
        setOccupancy(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withDelay(Duration value) {
        setDelay(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withProgressStatus(NaturalLanguageStringStructure... values) {
        if (values!= null) {
            for (NaturalLanguageStringStructure value: values) {
                getProgressStatus().add(value);
            }
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withProgressStatus(Collection<NaturalLanguageStringStructure> values) {
        if (values!= null) {
            getProgressStatus().addAll(values);
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withVehicleStatus(VehicleStatusEnumeration value) {
        setVehicleStatus(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withTrainBlockPart(TrainBlockPartStructure... values) {
        if (values!= null) {
            for (TrainBlockPartStructure value: values) {
                getTrainBlockPart().add(value);
            }
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withTrainBlockPart(Collection<TrainBlockPartStructure> values) {
        if (values!= null) {
            getTrainBlockPart().addAll(values);
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withBlockRef(BlockRefStructure value) {
        setBlockRef(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withCourseOfJourneyRef(CourseOfJourneyRefStructure value) {
        setCourseOfJourneyRef(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withVehicleJourneyRef(VehicleJourneyRefStructure value) {
        setVehicleJourneyRef(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withVehicleRef(VehicleRefStructure value) {
        setVehicleRef(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withAdditionalVehicleJourneyRef(FramedVehicleJourneyRefStructure... values) {
        if (values!= null) {
            for (FramedVehicleJourneyRefStructure value: values) {
                getAdditionalVehicleJourneyRef().add(value);
            }
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withAdditionalVehicleJourneyRef(Collection<FramedVehicleJourneyRefStructure> values) {
        if (values!= null) {
            getAdditionalVehicleJourneyRef().addAll(values);
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withDriverRef(String value) {
        setDriverRef(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withDriverName(String value) {
        setDriverName(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withTrainNumbers(MonitoredVehicleJourneyStructure.TrainNumbers value) {
        setTrainNumbers(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withJourneyParts(MonitoredVehicleJourneyStructure.JourneyParts value) {
        setJourneyParts(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withPreviousCalls(PreviousCallsStructure value) {
        setPreviousCalls(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withMonitoredCall(MonitoredCallStructure value) {
        setMonitoredCall(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withOnwardCalls(OnwardCallsStructure value) {
        setOnwardCalls(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withIsCompleteStopSequence(Boolean value) {
        setIsCompleteStopSequence(value);
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

        public MonitoredVehicleJourneyStructure.JourneyParts withJourneyPartInfo(JourneyPartInfoStructure... values) {
            if (values!= null) {
                for (JourneyPartInfoStructure value: values) {
                    getJourneyPartInfo().add(value);
                }
            }
            return this;
        }

        public MonitoredVehicleJourneyStructure.JourneyParts withJourneyPartInfo(Collection<JourneyPartInfoStructure> values) {
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

        public MonitoredVehicleJourneyStructure.TrainNumbers withTrainNumberRef(TrainNumberRefStructure... values) {
            if (values!= null) {
                for (TrainNumberRefStructure value: values) {
                    getTrainNumberRef().add(value);
                }
            }
            return this;
        }

        public MonitoredVehicleJourneyStructure.TrainNumbers withTrainNumberRef(Collection<TrainNumberRefStructure> values) {
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

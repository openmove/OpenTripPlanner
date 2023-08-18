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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.migesok.jaxb.adapter.javatime.DurationXmlAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.LocalDateTimeISO8601XmlAdapter;


/**
 * <p>Classe Java per MonitoredCallStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="MonitoredCallStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractMonitoredCallStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}MonitoredCallGroup"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonitoredCallStructure", propOrder = {
    "vehicleAtStop",
    "vehicleLocationAtStop",
    "reversesAtStop",
    "platformTraversal",
    "signalStatus",
    "timingPoint",
    "boardingStretch",
    "requestStop",
    "originDisplay",
    "destinationDisplay",
    "callNote",
    "facilityConditionElement",
    "facilityChangeElement",
    "situationRef",
    "aimedArrivalTime",
    "actualArrivalTime",
    "expectedArrivalTime",
    "latestExpectedArrivalTime",
    "arrivalStatus",
    "arrivalProximityText",
    "arrivalPlatformName",
    "arrivalBoardingActivity",
    "arrivalStopAssignment",
    "arrivalOperatorRefs",
    "aimedDepartureTime",
    "actualDepartureTime",
    "expectedDepartureTime",
    "provisionalExpectedDepartureTime",
    "earliestExpectedDepartureTime",
    "expectedDeparturePredictionQuality",
    "aimedLatestPassengerAccessTime",
    "expectedLatestPassengerAccessTime",
    "departureStatus",
    "departureProximityText",
    "departurePlatformName",
    "departureBoardingActivity",
    "departureStopAssignment",
    "departureOperatorRefs",
    "aimedHeadwayInterval",
    "expectedHeadwayInterval",
    "distanceFromStop",
    "numberOfStopsAway",
    "extensions"
})
public class MonitoredCallStructure
    extends AbstractMonitoredCallStructure
{

    @XmlElement(name = "VehicleAtStop", defaultValue = "false")
    protected Boolean vehicleAtStop;
    @XmlElement(name = "VehicleLocationAtStop")
    protected LocationStructure vehicleLocationAtStop;
    @XmlElement(name = "ReversesAtStop", defaultValue = "false")
    protected Boolean reversesAtStop;
    @XmlElement(name = "PlatformTraversal", defaultValue = "false")
    protected Boolean platformTraversal;
    @XmlElement(name = "SignalStatus")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String signalStatus;
    @XmlElement(name = "TimingPoint", defaultValue = "true")
    protected Boolean timingPoint;
    @XmlElement(name = "BoardingStretch", defaultValue = "false")
    protected Boolean boardingStretch;
    @XmlElement(name = "RequestStop", defaultValue = "false")
    protected Boolean requestStop;
    @XmlElement(name = "OriginDisplay")
    protected List<NaturalLanguageStringStructure> originDisplay;
    @XmlElement(name = "DestinationDisplay")
    protected List<NaturalLanguageStringStructure> destinationDisplay;
    @XmlElement(name = "CallNote")
    protected List<NaturalLanguageStringStructure> callNote;
    @XmlElement(name = "FacilityConditionElement")
    protected List<FacilityConditionStructure> facilityConditionElement;
    @XmlElement(name = "FacilityChangeElement")
    protected FacilityChangeStructure facilityChangeElement;
    @XmlElement(name = "SituationRef")
    protected List<SituationRefStructure> situationRef;
    @XmlElement(name = "AimedArrivalTime", type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime aimedArrivalTime;
    @XmlElement(name = "ActualArrivalTime", type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime actualArrivalTime;
    @XmlElement(name = "ExpectedArrivalTime", type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime expectedArrivalTime;
    @XmlElement(name = "LatestExpectedArrivalTime", type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime latestExpectedArrivalTime;
    @XmlElement(name = "ArrivalStatus")
    @XmlSchemaType(name = "NMTOKEN")
    protected CallStatusEnumeration arrivalStatus;
    @XmlElement(name = "ArrivalProximityText")
    protected NaturalLanguageStringStructure arrivalProximityText;
    @XmlElement(name = "ArrivalPlatformName")
    protected NaturalLanguageStringStructure arrivalPlatformName;
    @XmlElement(name = "ArrivalBoardingActivity", defaultValue = "alighting")
    @XmlSchemaType(name = "NMTOKEN")
    protected ArrivalBoardingActivityEnumeration arrivalBoardingActivity;
    @XmlElement(name = "ArrivalStopAssignment")
    protected StopAssignmentStructure arrivalStopAssignment;
    @XmlElement(name = "ArrivalOperatorRefs")
    protected List<OperatorRefStructure> arrivalOperatorRefs;
    @XmlElement(name = "AimedDepartureTime", type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime aimedDepartureTime;
    @XmlElement(name = "ActualDepartureTime", type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime actualDepartureTime;
    @XmlElement(name = "ExpectedDepartureTime", type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime expectedDepartureTime;
    @XmlElement(name = "ProvisionalExpectedDepartureTime", type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime provisionalExpectedDepartureTime;
    @XmlElement(name = "EarliestExpectedDepartureTime", type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime earliestExpectedDepartureTime;
    @XmlElement(name = "ExpectedDeparturePredictionQuality")
    protected PredictionQualityStructure expectedDeparturePredictionQuality;
    @XmlElement(name = "AimedLatestPassengerAccessTime", type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime aimedLatestPassengerAccessTime;
    @XmlElement(name = "ExpectedLatestPassengerAccessTime", type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime expectedLatestPassengerAccessTime;
    @XmlElement(name = "DepartureStatus")
    @XmlSchemaType(name = "NMTOKEN")
    protected CallStatusEnumeration departureStatus;
    @XmlElement(name = "DepartureProximityText")
    protected NaturalLanguageStringStructure departureProximityText;
    @XmlElement(name = "DeparturePlatformName")
    protected NaturalLanguageStringStructure departurePlatformName;
    @XmlElement(name = "DepartureBoardingActivity", defaultValue = "boarding")
    @XmlSchemaType(name = "NMTOKEN")
    protected DepartureBoardingActivityEnumeration departureBoardingActivity;
    @XmlElement(name = "DepartureStopAssignment")
    protected StopAssignmentStructure departureStopAssignment;
    @XmlElement(name = "DepartureOperatorRefs")
    protected List<OperatorRefStructure> departureOperatorRefs;
    @XmlElement(name = "AimedHeadwayInterval", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration aimedHeadwayInterval;
    @XmlElement(name = "ExpectedHeadwayInterval", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration expectedHeadwayInterval;
    @XmlElement(name = "DistanceFromStop")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger distanceFromStop;
    @XmlElement(name = "NumberOfStopsAway")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfStopsAway;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Recupera il valore della proprietà vehicleAtStop.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVehicleAtStop() {
        return vehicleAtStop;
    }

    /**
     * Imposta il valore della proprietà vehicleAtStop.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVehicleAtStop(Boolean value) {
        this.vehicleAtStop = value;
    }

    /**
     * Recupera il valore della proprietà vehicleLocationAtStop.
     * 
     * @return
     *     possible object is
     *     {@link LocationStructure }
     *     
     */
    public LocationStructure getVehicleLocationAtStop() {
        return vehicleLocationAtStop;
    }

    /**
     * Imposta il valore della proprietà vehicleLocationAtStop.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationStructure }
     *     
     */
    public void setVehicleLocationAtStop(LocationStructure value) {
        this.vehicleLocationAtStop = value;
    }

    /**
     * Recupera il valore della proprietà reversesAtStop.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReversesAtStop() {
        return reversesAtStop;
    }

    /**
     * Imposta il valore della proprietà reversesAtStop.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReversesAtStop(Boolean value) {
        this.reversesAtStop = value;
    }

    /**
     * Recupera il valore della proprietà platformTraversal.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlatformTraversal() {
        return platformTraversal;
    }

    /**
     * Imposta il valore della proprietà platformTraversal.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlatformTraversal(Boolean value) {
        this.platformTraversal = value;
    }

    /**
     * Recupera il valore della proprietà signalStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignalStatus() {
        return signalStatus;
    }

    /**
     * Imposta il valore della proprietà signalStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignalStatus(String value) {
        this.signalStatus = value;
    }

    /**
     * Recupera il valore della proprietà timingPoint.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTimingPoint() {
        return timingPoint;
    }

    /**
     * Imposta il valore della proprietà timingPoint.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTimingPoint(Boolean value) {
        this.timingPoint = value;
    }

    /**
     * Recupera il valore della proprietà boardingStretch.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBoardingStretch() {
        return boardingStretch;
    }

    /**
     * Imposta il valore della proprietà boardingStretch.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBoardingStretch(Boolean value) {
        this.boardingStretch = value;
    }

    /**
     * Recupera il valore della proprietà requestStop.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequestStop() {
        return requestStop;
    }

    /**
     * Imposta il valore della proprietà requestStop.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequestStop(Boolean value) {
        this.requestStop = value;
    }

    /**
     * Gets the value of the originDisplay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the originDisplay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginDisplay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getOriginDisplay() {
        if (originDisplay == null) {
            originDisplay = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.originDisplay;
    }

    /**
     * Gets the value of the destinationDisplay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the destinationDisplay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestinationDisplay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getDestinationDisplay() {
        if (destinationDisplay == null) {
            destinationDisplay = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.destinationDisplay;
    }

    /**
     * Gets the value of the callNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the callNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getCallNote() {
        if (callNote == null) {
            callNote = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.callNote;
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
     * Recupera il valore della proprietà aimedArrivalTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getAimedArrivalTime() {
        return aimedArrivalTime;
    }

    /**
     * Imposta il valore della proprietà aimedArrivalTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAimedArrivalTime(LocalDateTime value) {
        this.aimedArrivalTime = value;
    }

    /**
     * Recupera il valore della proprietà actualArrivalTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getActualArrivalTime() {
        return actualArrivalTime;
    }

    /**
     * Imposta il valore della proprietà actualArrivalTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualArrivalTime(LocalDateTime value) {
        this.actualArrivalTime = value;
    }

    /**
     * Recupera il valore della proprietà expectedArrivalTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getExpectedArrivalTime() {
        return expectedArrivalTime;
    }

    /**
     * Imposta il valore della proprietà expectedArrivalTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpectedArrivalTime(LocalDateTime value) {
        this.expectedArrivalTime = value;
    }

    /**
     * Recupera il valore della proprietà latestExpectedArrivalTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getLatestExpectedArrivalTime() {
        return latestExpectedArrivalTime;
    }

    /**
     * Imposta il valore della proprietà latestExpectedArrivalTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatestExpectedArrivalTime(LocalDateTime value) {
        this.latestExpectedArrivalTime = value;
    }

    /**
     * Recupera il valore della proprietà arrivalStatus.
     * 
     * @return
     *     possible object is
     *     {@link CallStatusEnumeration }
     *     
     */
    public CallStatusEnumeration getArrivalStatus() {
        return arrivalStatus;
    }

    /**
     * Imposta il valore della proprietà arrivalStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link CallStatusEnumeration }
     *     
     */
    public void setArrivalStatus(CallStatusEnumeration value) {
        this.arrivalStatus = value;
    }

    /**
     * Recupera il valore della proprietà arrivalProximityText.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getArrivalProximityText() {
        return arrivalProximityText;
    }

    /**
     * Imposta il valore della proprietà arrivalProximityText.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setArrivalProximityText(NaturalLanguageStringStructure value) {
        this.arrivalProximityText = value;
    }

    /**
     * Recupera il valore della proprietà arrivalPlatformName.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getArrivalPlatformName() {
        return arrivalPlatformName;
    }

    /**
     * Imposta il valore della proprietà arrivalPlatformName.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setArrivalPlatformName(NaturalLanguageStringStructure value) {
        this.arrivalPlatformName = value;
    }

    /**
     * Recupera il valore della proprietà arrivalBoardingActivity.
     * 
     * @return
     *     possible object is
     *     {@link ArrivalBoardingActivityEnumeration }
     *     
     */
    public ArrivalBoardingActivityEnumeration getArrivalBoardingActivity() {
        return arrivalBoardingActivity;
    }

    /**
     * Imposta il valore della proprietà arrivalBoardingActivity.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrivalBoardingActivityEnumeration }
     *     
     */
    public void setArrivalBoardingActivity(ArrivalBoardingActivityEnumeration value) {
        this.arrivalBoardingActivity = value;
    }

    /**
     * Recupera il valore della proprietà arrivalStopAssignment.
     * 
     * @return
     *     possible object is
     *     {@link StopAssignmentStructure }
     *     
     */
    public StopAssignmentStructure getArrivalStopAssignment() {
        return arrivalStopAssignment;
    }

    /**
     * Imposta il valore della proprietà arrivalStopAssignment.
     * 
     * @param value
     *     allowed object is
     *     {@link StopAssignmentStructure }
     *     
     */
    public void setArrivalStopAssignment(StopAssignmentStructure value) {
        this.arrivalStopAssignment = value;
    }

    /**
     * Gets the value of the arrivalOperatorRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arrivalOperatorRefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrivalOperatorRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperatorRefStructure }
     * 
     * 
     */
    public List<OperatorRefStructure> getArrivalOperatorRefs() {
        if (arrivalOperatorRefs == null) {
            arrivalOperatorRefs = new ArrayList<OperatorRefStructure>();
        }
        return this.arrivalOperatorRefs;
    }

    /**
     * Recupera il valore della proprietà aimedDepartureTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getAimedDepartureTime() {
        return aimedDepartureTime;
    }

    /**
     * Imposta il valore della proprietà aimedDepartureTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAimedDepartureTime(LocalDateTime value) {
        this.aimedDepartureTime = value;
    }

    /**
     * Recupera il valore della proprietà actualDepartureTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getActualDepartureTime() {
        return actualDepartureTime;
    }

    /**
     * Imposta il valore della proprietà actualDepartureTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualDepartureTime(LocalDateTime value) {
        this.actualDepartureTime = value;
    }

    /**
     * Recupera il valore della proprietà expectedDepartureTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getExpectedDepartureTime() {
        return expectedDepartureTime;
    }

    /**
     * Imposta il valore della proprietà expectedDepartureTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpectedDepartureTime(LocalDateTime value) {
        this.expectedDepartureTime = value;
    }

    /**
     * Recupera il valore della proprietà provisionalExpectedDepartureTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getProvisionalExpectedDepartureTime() {
        return provisionalExpectedDepartureTime;
    }

    /**
     * Imposta il valore della proprietà provisionalExpectedDepartureTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvisionalExpectedDepartureTime(LocalDateTime value) {
        this.provisionalExpectedDepartureTime = value;
    }

    /**
     * Recupera il valore della proprietà earliestExpectedDepartureTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getEarliestExpectedDepartureTime() {
        return earliestExpectedDepartureTime;
    }

    /**
     * Imposta il valore della proprietà earliestExpectedDepartureTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarliestExpectedDepartureTime(LocalDateTime value) {
        this.earliestExpectedDepartureTime = value;
    }

    /**
     * Recupera il valore della proprietà expectedDeparturePredictionQuality.
     * 
     * @return
     *     possible object is
     *     {@link PredictionQualityStructure }
     *     
     */
    public PredictionQualityStructure getExpectedDeparturePredictionQuality() {
        return expectedDeparturePredictionQuality;
    }

    /**
     * Imposta il valore della proprietà expectedDeparturePredictionQuality.
     * 
     * @param value
     *     allowed object is
     *     {@link PredictionQualityStructure }
     *     
     */
    public void setExpectedDeparturePredictionQuality(PredictionQualityStructure value) {
        this.expectedDeparturePredictionQuality = value;
    }

    /**
     * Recupera il valore della proprietà aimedLatestPassengerAccessTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getAimedLatestPassengerAccessTime() {
        return aimedLatestPassengerAccessTime;
    }

    /**
     * Imposta il valore della proprietà aimedLatestPassengerAccessTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAimedLatestPassengerAccessTime(LocalDateTime value) {
        this.aimedLatestPassengerAccessTime = value;
    }

    /**
     * Recupera il valore della proprietà expectedLatestPassengerAccessTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getExpectedLatestPassengerAccessTime() {
        return expectedLatestPassengerAccessTime;
    }

    /**
     * Imposta il valore della proprietà expectedLatestPassengerAccessTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpectedLatestPassengerAccessTime(LocalDateTime value) {
        this.expectedLatestPassengerAccessTime = value;
    }

    /**
     * Recupera il valore della proprietà departureStatus.
     * 
     * @return
     *     possible object is
     *     {@link CallStatusEnumeration }
     *     
     */
    public CallStatusEnumeration getDepartureStatus() {
        return departureStatus;
    }

    /**
     * Imposta il valore della proprietà departureStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link CallStatusEnumeration }
     *     
     */
    public void setDepartureStatus(CallStatusEnumeration value) {
        this.departureStatus = value;
    }

    /**
     * Recupera il valore della proprietà departureProximityText.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getDepartureProximityText() {
        return departureProximityText;
    }

    /**
     * Imposta il valore della proprietà departureProximityText.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setDepartureProximityText(NaturalLanguageStringStructure value) {
        this.departureProximityText = value;
    }

    /**
     * Recupera il valore della proprietà departurePlatformName.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getDeparturePlatformName() {
        return departurePlatformName;
    }

    /**
     * Imposta il valore della proprietà departurePlatformName.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setDeparturePlatformName(NaturalLanguageStringStructure value) {
        this.departurePlatformName = value;
    }

    /**
     * Recupera il valore della proprietà departureBoardingActivity.
     * 
     * @return
     *     possible object is
     *     {@link DepartureBoardingActivityEnumeration }
     *     
     */
    public DepartureBoardingActivityEnumeration getDepartureBoardingActivity() {
        return departureBoardingActivity;
    }

    /**
     * Imposta il valore della proprietà departureBoardingActivity.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartureBoardingActivityEnumeration }
     *     
     */
    public void setDepartureBoardingActivity(DepartureBoardingActivityEnumeration value) {
        this.departureBoardingActivity = value;
    }

    /**
     * Recupera il valore della proprietà departureStopAssignment.
     * 
     * @return
     *     possible object is
     *     {@link StopAssignmentStructure }
     *     
     */
    public StopAssignmentStructure getDepartureStopAssignment() {
        return departureStopAssignment;
    }

    /**
     * Imposta il valore della proprietà departureStopAssignment.
     * 
     * @param value
     *     allowed object is
     *     {@link StopAssignmentStructure }
     *     
     */
    public void setDepartureStopAssignment(StopAssignmentStructure value) {
        this.departureStopAssignment = value;
    }

    /**
     * Gets the value of the departureOperatorRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the departureOperatorRefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDepartureOperatorRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperatorRefStructure }
     * 
     * 
     */
    public List<OperatorRefStructure> getDepartureOperatorRefs() {
        if (departureOperatorRefs == null) {
            departureOperatorRefs = new ArrayList<OperatorRefStructure>();
        }
        return this.departureOperatorRefs;
    }

    /**
     * Recupera il valore della proprietà aimedHeadwayInterval.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getAimedHeadwayInterval() {
        return aimedHeadwayInterval;
    }

    /**
     * Imposta il valore della proprietà aimedHeadwayInterval.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAimedHeadwayInterval(Duration value) {
        this.aimedHeadwayInterval = value;
    }

    /**
     * Recupera il valore della proprietà expectedHeadwayInterval.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getExpectedHeadwayInterval() {
        return expectedHeadwayInterval;
    }

    /**
     * Imposta il valore della proprietà expectedHeadwayInterval.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpectedHeadwayInterval(Duration value) {
        this.expectedHeadwayInterval = value;
    }

    /**
     * Recupera il valore della proprietà distanceFromStop.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDistanceFromStop() {
        return distanceFromStop;
    }

    /**
     * Imposta il valore della proprietà distanceFromStop.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDistanceFromStop(BigInteger value) {
        this.distanceFromStop = value;
    }

    /**
     * Recupera il valore della proprietà numberOfStopsAway.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfStopsAway() {
        return numberOfStopsAway;
    }

    /**
     * Imposta il valore della proprietà numberOfStopsAway.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfStopsAway(BigInteger value) {
        this.numberOfStopsAway = value;
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

    public MonitoredCallStructure withVehicleAtStop(Boolean value) {
        setVehicleAtStop(value);
        return this;
    }

    public MonitoredCallStructure withVehicleLocationAtStop(LocationStructure value) {
        setVehicleLocationAtStop(value);
        return this;
    }

    public MonitoredCallStructure withReversesAtStop(Boolean value) {
        setReversesAtStop(value);
        return this;
    }

    public MonitoredCallStructure withPlatformTraversal(Boolean value) {
        setPlatformTraversal(value);
        return this;
    }

    public MonitoredCallStructure withSignalStatus(String value) {
        setSignalStatus(value);
        return this;
    }

    public MonitoredCallStructure withTimingPoint(Boolean value) {
        setTimingPoint(value);
        return this;
    }

    public MonitoredCallStructure withBoardingStretch(Boolean value) {
        setBoardingStretch(value);
        return this;
    }

    public MonitoredCallStructure withRequestStop(Boolean value) {
        setRequestStop(value);
        return this;
    }

    public MonitoredCallStructure withOriginDisplay(NaturalLanguageStringStructure... values) {
        if (values!= null) {
            for (NaturalLanguageStringStructure value: values) {
                getOriginDisplay().add(value);
            }
        }
        return this;
    }

    public MonitoredCallStructure withOriginDisplay(Collection<NaturalLanguageStringStructure> values) {
        if (values!= null) {
            getOriginDisplay().addAll(values);
        }
        return this;
    }

    public MonitoredCallStructure withDestinationDisplay(NaturalLanguageStringStructure... values) {
        if (values!= null) {
            for (NaturalLanguageStringStructure value: values) {
                getDestinationDisplay().add(value);
            }
        }
        return this;
    }

    public MonitoredCallStructure withDestinationDisplay(Collection<NaturalLanguageStringStructure> values) {
        if (values!= null) {
            getDestinationDisplay().addAll(values);
        }
        return this;
    }

    public MonitoredCallStructure withCallNote(NaturalLanguageStringStructure... values) {
        if (values!= null) {
            for (NaturalLanguageStringStructure value: values) {
                getCallNote().add(value);
            }
        }
        return this;
    }

    public MonitoredCallStructure withCallNote(Collection<NaturalLanguageStringStructure> values) {
        if (values!= null) {
            getCallNote().addAll(values);
        }
        return this;
    }

    public MonitoredCallStructure withFacilityConditionElement(FacilityConditionStructure... values) {
        if (values!= null) {
            for (FacilityConditionStructure value: values) {
                getFacilityConditionElement().add(value);
            }
        }
        return this;
    }

    public MonitoredCallStructure withFacilityConditionElement(Collection<FacilityConditionStructure> values) {
        if (values!= null) {
            getFacilityConditionElement().addAll(values);
        }
        return this;
    }

    public MonitoredCallStructure withFacilityChangeElement(FacilityChangeStructure value) {
        setFacilityChangeElement(value);
        return this;
    }

    public MonitoredCallStructure withSituationRef(SituationRefStructure... values) {
        if (values!= null) {
            for (SituationRefStructure value: values) {
                getSituationRef().add(value);
            }
        }
        return this;
    }

    public MonitoredCallStructure withSituationRef(Collection<SituationRefStructure> values) {
        if (values!= null) {
            getSituationRef().addAll(values);
        }
        return this;
    }

    public MonitoredCallStructure withAimedArrivalTime(LocalDateTime value) {
        setAimedArrivalTime(value);
        return this;
    }

    public MonitoredCallStructure withActualArrivalTime(LocalDateTime value) {
        setActualArrivalTime(value);
        return this;
    }

    public MonitoredCallStructure withExpectedArrivalTime(LocalDateTime value) {
        setExpectedArrivalTime(value);
        return this;
    }

    public MonitoredCallStructure withLatestExpectedArrivalTime(LocalDateTime value) {
        setLatestExpectedArrivalTime(value);
        return this;
    }

    public MonitoredCallStructure withArrivalStatus(CallStatusEnumeration value) {
        setArrivalStatus(value);
        return this;
    }

    public MonitoredCallStructure withArrivalProximityText(NaturalLanguageStringStructure value) {
        setArrivalProximityText(value);
        return this;
    }

    public MonitoredCallStructure withArrivalPlatformName(NaturalLanguageStringStructure value) {
        setArrivalPlatformName(value);
        return this;
    }

    public MonitoredCallStructure withArrivalBoardingActivity(ArrivalBoardingActivityEnumeration value) {
        setArrivalBoardingActivity(value);
        return this;
    }

    public MonitoredCallStructure withArrivalStopAssignment(StopAssignmentStructure value) {
        setArrivalStopAssignment(value);
        return this;
    }

    public MonitoredCallStructure withArrivalOperatorRefs(OperatorRefStructure... values) {
        if (values!= null) {
            for (OperatorRefStructure value: values) {
                getArrivalOperatorRefs().add(value);
            }
        }
        return this;
    }

    public MonitoredCallStructure withArrivalOperatorRefs(Collection<OperatorRefStructure> values) {
        if (values!= null) {
            getArrivalOperatorRefs().addAll(values);
        }
        return this;
    }

    public MonitoredCallStructure withAimedDepartureTime(LocalDateTime value) {
        setAimedDepartureTime(value);
        return this;
    }

    public MonitoredCallStructure withActualDepartureTime(LocalDateTime value) {
        setActualDepartureTime(value);
        return this;
    }

    public MonitoredCallStructure withExpectedDepartureTime(LocalDateTime value) {
        setExpectedDepartureTime(value);
        return this;
    }

    public MonitoredCallStructure withProvisionalExpectedDepartureTime(LocalDateTime value) {
        setProvisionalExpectedDepartureTime(value);
        return this;
    }

    public MonitoredCallStructure withEarliestExpectedDepartureTime(LocalDateTime value) {
        setEarliestExpectedDepartureTime(value);
        return this;
    }

    public MonitoredCallStructure withExpectedDeparturePredictionQuality(PredictionQualityStructure value) {
        setExpectedDeparturePredictionQuality(value);
        return this;
    }

    public MonitoredCallStructure withAimedLatestPassengerAccessTime(LocalDateTime value) {
        setAimedLatestPassengerAccessTime(value);
        return this;
    }

    public MonitoredCallStructure withExpectedLatestPassengerAccessTime(LocalDateTime value) {
        setExpectedLatestPassengerAccessTime(value);
        return this;
    }

    public MonitoredCallStructure withDepartureStatus(CallStatusEnumeration value) {
        setDepartureStatus(value);
        return this;
    }

    public MonitoredCallStructure withDepartureProximityText(NaturalLanguageStringStructure value) {
        setDepartureProximityText(value);
        return this;
    }

    public MonitoredCallStructure withDeparturePlatformName(NaturalLanguageStringStructure value) {
        setDeparturePlatformName(value);
        return this;
    }

    public MonitoredCallStructure withDepartureBoardingActivity(DepartureBoardingActivityEnumeration value) {
        setDepartureBoardingActivity(value);
        return this;
    }

    public MonitoredCallStructure withDepartureStopAssignment(StopAssignmentStructure value) {
        setDepartureStopAssignment(value);
        return this;
    }

    public MonitoredCallStructure withDepartureOperatorRefs(OperatorRefStructure... values) {
        if (values!= null) {
            for (OperatorRefStructure value: values) {
                getDepartureOperatorRefs().add(value);
            }
        }
        return this;
    }

    public MonitoredCallStructure withDepartureOperatorRefs(Collection<OperatorRefStructure> values) {
        if (values!= null) {
            getDepartureOperatorRefs().addAll(values);
        }
        return this;
    }

    public MonitoredCallStructure withAimedHeadwayInterval(Duration value) {
        setAimedHeadwayInterval(value);
        return this;
    }

    public MonitoredCallStructure withExpectedHeadwayInterval(Duration value) {
        setExpectedHeadwayInterval(value);
        return this;
    }

    public MonitoredCallStructure withDistanceFromStop(BigInteger value) {
        setDistanceFromStop(value);
        return this;
    }

    public MonitoredCallStructure withNumberOfStopsAway(BigInteger value) {
        setNumberOfStopsAway(value);
        return this;
    }

    public MonitoredCallStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public MonitoredCallStructure withStopPointRef(StopPointRefStructure value) {
        setStopPointRef(value);
        return this;
    }

    @Override
    public MonitoredCallStructure withVisitNumber(BigInteger value) {
        setVisitNumber(value);
        return this;
    }

    @Override
    public MonitoredCallStructure withOrder(BigInteger value) {
        setOrder(value);
        return this;
    }

    @Override
    public MonitoredCallStructure withStopPointName(NaturalLanguageStringStructure... values) {
        if (values!= null) {
            for (NaturalLanguageStringStructure value: values) {
                getStopPointName().add(value);
            }
        }
        return this;
    }

    @Override
    public MonitoredCallStructure withStopPointName(Collection<NaturalLanguageStringStructure> values) {
        if (values!= null) {
            getStopPointName().addAll(values);
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

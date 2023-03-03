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
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.migesok.jaxb.adapter.javatime.DurationXmlAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.LocalDateTimeISO8601XmlAdapter;
import uk.org.ifopt.acsb.AccessibilityAssessmentStructure;


/**
 * <p>Classe Java per AffectedCallStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AffectedCallStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}AffectedStopPointStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Order" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="CallCondition" type="{http://www.siri.org.uk/siri}RoutePointTypeEnumeration" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}CallRealtimeGroup"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}CallPropertyGroup"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}AffectedStopArrivalGroup"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}AffectedStopDepartureGroup"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}HeadwayIntervalGroup"/&gt;
 *         &lt;element name="AffectedInterchange" type="{http://www.siri.org.uk/siri}AffectedInterchangeStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffectedCallStructure", propOrder = {
    "order",
    "callCondition",
    "vehicleAtStop",
    "vehicleLocationAtStop",
    "timingPoint",
    "boardingStretch",
    "requestStop",
    "originDisplay",
    "destinationDisplay",
    "aimedArrivalTime",
    "actualArrivalTime",
    "expectedArrivalTime",
    "arrivalStatus",
    "arrivalPlatformName",
    "arrivalBoardingActivity",
    "aimedDepartureTime",
    "actualDepartureTime",
    "expectedDepartureTime",
    "departureStatus",
    "departurePlatformName",
    "departureBoardingActivity",
    "aimedHeadwayInterval",
    "expectedHeadwayInterval",
    "affectedInterchange"
})
public class AffectedCallStructure
    extends AffectedStopPointStructure
{

    @XmlElement(name = "Order")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger order;
    @XmlElement(name = "CallCondition")
    @XmlSchemaType(name = "NMTOKEN")
    protected List<RoutePointTypeEnumeration> callCondition;
    @XmlElement(name = "VehicleAtStop", defaultValue = "false")
    protected Boolean vehicleAtStop;
    @XmlElement(name = "VehicleLocationAtStop")
    protected LocationStructure vehicleLocationAtStop;
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
    @XmlElement(name = "ArrivalStatus")
    @XmlSchemaType(name = "NMTOKEN")
    protected CallStatusEnumeration arrivalStatus;
    @XmlElement(name = "ArrivalPlatformName")
    protected NaturalLanguageStringStructure arrivalPlatformName;
    @XmlElement(name = "ArrivalBoardingActivity", defaultValue = "alighting")
    @XmlSchemaType(name = "NMTOKEN")
    protected ArrivalBoardingActivityEnumeration arrivalBoardingActivity;
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
    @XmlElement(name = "DepartureStatus")
    @XmlSchemaType(name = "NMTOKEN")
    protected CallStatusEnumeration departureStatus;
    @XmlElement(name = "DeparturePlatformName")
    protected NaturalLanguageStringStructure departurePlatformName;
    @XmlElement(name = "DepartureBoardingActivity", defaultValue = "boarding")
    @XmlSchemaType(name = "NMTOKEN")
    protected DepartureBoardingActivityEnumeration departureBoardingActivity;
    @XmlElement(name = "AimedHeadwayInterval", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration aimedHeadwayInterval;
    @XmlElement(name = "ExpectedHeadwayInterval", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration expectedHeadwayInterval;
    @XmlElement(name = "AffectedInterchange")
    protected List<AffectedInterchangeStructure> affectedInterchange;

    /**
     * Recupera il valore della proprietà order.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrder() {
        return order;
    }

    /**
     * Imposta il valore della proprietà order.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrder(BigInteger value) {
        this.order = value;
    }

    /**
     * Gets the value of the callCondition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the callCondition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoutePointTypeEnumeration }
     * 
     * 
     */
    public List<RoutePointTypeEnumeration> getCallCondition() {
        if (callCondition == null) {
            callCondition = new ArrayList<RoutePointTypeEnumeration>();
        }
        return this.callCondition;
    }

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
     * Gets the value of the affectedInterchange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the affectedInterchange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAffectedInterchange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AffectedInterchangeStructure }
     * 
     * 
     */
    public List<AffectedInterchangeStructure> getAffectedInterchange() {
        if (affectedInterchange == null) {
            affectedInterchange = new ArrayList<AffectedInterchangeStructure>();
        }
        return this.affectedInterchange;
    }

    public AffectedCallStructure withOrder(BigInteger value) {
        setOrder(value);
        return this;
    }

    public AffectedCallStructure withCallCondition(RoutePointTypeEnumeration... values) {
        if (values!= null) {
            for (RoutePointTypeEnumeration value: values) {
                getCallCondition().add(value);
            }
        }
        return this;
    }

    public AffectedCallStructure withCallCondition(Collection<RoutePointTypeEnumeration> values) {
        if (values!= null) {
            getCallCondition().addAll(values);
        }
        return this;
    }

    public AffectedCallStructure withVehicleAtStop(Boolean value) {
        setVehicleAtStop(value);
        return this;
    }

    public AffectedCallStructure withVehicleLocationAtStop(LocationStructure value) {
        setVehicleLocationAtStop(value);
        return this;
    }

    public AffectedCallStructure withTimingPoint(Boolean value) {
        setTimingPoint(value);
        return this;
    }

    public AffectedCallStructure withBoardingStretch(Boolean value) {
        setBoardingStretch(value);
        return this;
    }

    public AffectedCallStructure withRequestStop(Boolean value) {
        setRequestStop(value);
        return this;
    }

    public AffectedCallStructure withOriginDisplay(NaturalLanguageStringStructure... values) {
        if (values!= null) {
            for (NaturalLanguageStringStructure value: values) {
                getOriginDisplay().add(value);
            }
        }
        return this;
    }

    public AffectedCallStructure withOriginDisplay(Collection<NaturalLanguageStringStructure> values) {
        if (values!= null) {
            getOriginDisplay().addAll(values);
        }
        return this;
    }

    public AffectedCallStructure withDestinationDisplay(NaturalLanguageStringStructure... values) {
        if (values!= null) {
            for (NaturalLanguageStringStructure value: values) {
                getDestinationDisplay().add(value);
            }
        }
        return this;
    }

    public AffectedCallStructure withDestinationDisplay(Collection<NaturalLanguageStringStructure> values) {
        if (values!= null) {
            getDestinationDisplay().addAll(values);
        }
        return this;
    }

    public AffectedCallStructure withAimedArrivalTime(LocalDateTime value) {
        setAimedArrivalTime(value);
        return this;
    }

    public AffectedCallStructure withActualArrivalTime(LocalDateTime value) {
        setActualArrivalTime(value);
        return this;
    }

    public AffectedCallStructure withExpectedArrivalTime(LocalDateTime value) {
        setExpectedArrivalTime(value);
        return this;
    }

    public AffectedCallStructure withArrivalStatus(CallStatusEnumeration value) {
        setArrivalStatus(value);
        return this;
    }

    public AffectedCallStructure withArrivalPlatformName(NaturalLanguageStringStructure value) {
        setArrivalPlatformName(value);
        return this;
    }

    public AffectedCallStructure withArrivalBoardingActivity(ArrivalBoardingActivityEnumeration value) {
        setArrivalBoardingActivity(value);
        return this;
    }

    public AffectedCallStructure withAimedDepartureTime(LocalDateTime value) {
        setAimedDepartureTime(value);
        return this;
    }

    public AffectedCallStructure withActualDepartureTime(LocalDateTime value) {
        setActualDepartureTime(value);
        return this;
    }

    public AffectedCallStructure withExpectedDepartureTime(LocalDateTime value) {
        setExpectedDepartureTime(value);
        return this;
    }

    public AffectedCallStructure withDepartureStatus(CallStatusEnumeration value) {
        setDepartureStatus(value);
        return this;
    }

    public AffectedCallStructure withDeparturePlatformName(NaturalLanguageStringStructure value) {
        setDeparturePlatformName(value);
        return this;
    }

    public AffectedCallStructure withDepartureBoardingActivity(DepartureBoardingActivityEnumeration value) {
        setDepartureBoardingActivity(value);
        return this;
    }

    public AffectedCallStructure withAimedHeadwayInterval(Duration value) {
        setAimedHeadwayInterval(value);
        return this;
    }

    public AffectedCallStructure withExpectedHeadwayInterval(Duration value) {
        setExpectedHeadwayInterval(value);
        return this;
    }

    public AffectedCallStructure withAffectedInterchange(AffectedInterchangeStructure... values) {
        if (values!= null) {
            for (AffectedInterchangeStructure value: values) {
                getAffectedInterchange().add(value);
            }
        }
        return this;
    }

    public AffectedCallStructure withAffectedInterchange(Collection<AffectedInterchangeStructure> values) {
        if (values!= null) {
            getAffectedInterchange().addAll(values);
        }
        return this;
    }

    @Override
    public AffectedCallStructure withStopPointRef(StopPointRefStructure value) {
        setStopPointRef(value);
        return this;
    }

    @Override
    public AffectedCallStructure withPrivateRef(String value) {
        setPrivateRef(value);
        return this;
    }

    @Override
    public AffectedCallStructure withStopPointName(NaturalLanguageStringStructure... values) {
        if (values!= null) {
            for (NaturalLanguageStringStructure value: values) {
                getStopPointName().add(value);
            }
        }
        return this;
    }

    @Override
    public AffectedCallStructure withStopPointName(Collection<NaturalLanguageStringStructure> values) {
        if (values!= null) {
            getStopPointName().addAll(values);
        }
        return this;
    }

    @Override
    public AffectedCallStructure withStopPointType(StopPointTypeEnumeration value) {
        setStopPointType(value);
        return this;
    }

    @Override
    public AffectedCallStructure withLocation(LocationStructure value) {
        setLocation(value);
        return this;
    }

    @Override
    public AffectedCallStructure withAffectedModes(AffectedModesStructure value) {
        setAffectedModes(value);
        return this;
    }

    @Override
    public AffectedCallStructure withPlaceRef(ZoneRefStructure value) {
        setPlaceRef(value);
        return this;
    }

    @Override
    public AffectedCallStructure withPlaceName(NaturalLanguageStringStructure... values) {
        if (values!= null) {
            for (NaturalLanguageStringStructure value: values) {
                getPlaceName().add(value);
            }
        }
        return this;
    }

    @Override
    public AffectedCallStructure withPlaceName(Collection<NaturalLanguageStringStructure> values) {
        if (values!= null) {
            getPlaceName().addAll(values);
        }
        return this;
    }

    @Override
    public AffectedCallStructure withAccessibilityAssessment(AccessibilityAssessmentStructure value) {
        setAccessibilityAssessment(value);
        return this;
    }

    @Override
    public AffectedCallStructure withStopCondition(RoutePointTypeEnumeration... values) {
        if (values!= null) {
            for (RoutePointTypeEnumeration value: values) {
                getStopCondition().add(value);
            }
        }
        return this;
    }

    @Override
    public AffectedCallStructure withStopCondition(Collection<RoutePointTypeEnumeration> values) {
        if (values!= null) {
            getStopCondition().addAll(values);
        }
        return this;
    }

    @Override
    public AffectedCallStructure withConnectionLinks(AffectedStopPointStructure.ConnectionLinks value) {
        setConnectionLinks(value);
        return this;
    }

    @Override
    public AffectedCallStructure withExtensions(ExtensionsStructure value) {
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

}

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
import com.bliksemlabs.ojp.model.DirectionRefStructure;
import com.bliksemlabs.ojp.model.LineRefStructure;
import com.bliksemlabs.ojp.model.OperatorRefStructure;
import com.bliksemlabs.ojp.model.StopPointRefStructure;
import com.bliksemlabs.ojp.model.VehicleRefStructure;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * [a special form of SERVICE JOURNEY in TMv6] a vehicle movement on a continuous, non-timetabled service.
 * 
 * <p>Classe Java per ContinuousServiceStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ContinuousServiceStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="ContinuousMode" type="{http://www.vdv.de/ojp}ContinuousModesEnumeration"/&gt;
 *           &lt;element name="IndividualMode" type="{http://www.vdv.de/ojp}IndividualModesEnumeration"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice&gt;
 *           &lt;group ref="{http://www.vdv.de/ojp}DatedJourneyGroup" minOccurs="0"/&gt;
 *           &lt;element name="SharingService" type="{http://www.vdv.de/ojp}SharingServiceStructure" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}ServiceOriginGroup" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}ServiceDestinationGroup" minOccurs="0"/&gt;
 *         &lt;element name="BookingArrangements" type="{http://www.vdv.de/ojp}BookingArrangementsContainerStructure" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.vdv.de/ojp}SituationFullRef" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContinuousServiceStructure", propOrder = {
    "continuousMode",
    "individualMode",
    "operatingDayRef",
    "vehicleRef",
    "journeyRef",
    "lineRef",
    "directionRef",
    "mode",
    "publishedLineName",
    "operatorRef",
    "routeDescription",
    "via",
    "attribute",
    "sharingService",
    "originStopPointRef",
    "originText",
    "destinationStopPointRef",
    "destinationText",
    "bookingArrangements",
    "situationFullRef"
})
public class ContinuousServiceStructure {

    @XmlElement(name = "ContinuousMode")
    @XmlSchemaType(name = "string")
    protected ContinuousModesEnumeration continuousMode;
    @XmlElement(name = "IndividualMode")
    @XmlSchemaType(name = "string")
    protected IndividualModesEnumeration individualMode;
    @XmlElement(name = "OperatingDayRef")
    protected OperatingDayRefStructure operatingDayRef;
    @XmlElement(name = "VehicleRef", namespace = "http://www.siri.org.uk/siri")
    protected VehicleRefStructure vehicleRef;
    @XmlElement(name = "JourneyRef")
    protected JourneyRefStructure journeyRef;
    @XmlElement(name = "LineRef", namespace = "http://www.siri.org.uk/siri")
    protected LineRefStructure lineRef;
    @XmlElement(name = "DirectionRef", namespace = "http://www.siri.org.uk/siri")
    protected DirectionRefStructure directionRef;
    @XmlElement(name = "Mode")
    protected ModeStructure mode;
    @XmlElement(name = "PublishedLineName")
    protected InternationalTextStructure publishedLineName;
    @XmlElement(name = "OperatorRef")
    protected OperatorRefStructure operatorRef;
    @XmlElement(name = "RouteDescription")
    protected InternationalTextStructure routeDescription;
    @XmlElement(name = "Via")
    protected List<ServiceViaPointStructure> via;
    @XmlElement(name = "Attribute")
    protected List<GeneralAttributeStructure> attribute;
    @XmlElement(name = "SharingService")
    protected SharingServiceStructure sharingService;
    @XmlElement(name = "OriginStopPointRef")
    protected StopPointRefStructure originStopPointRef;
    @XmlElement(name = "OriginText")
    protected InternationalTextStructure originText;
    @XmlElement(name = "DestinationStopPointRef")
    protected StopPointRefStructure destinationStopPointRef;
    @XmlElement(name = "DestinationText")
    protected InternationalTextStructure destinationText;
    @XmlElement(name = "BookingArrangements")
    protected BookingArrangementsContainerStructure bookingArrangements;
    @XmlElement(name = "SituationFullRef")
    protected List<SituationFullRefStructure> situationFullRef;

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
     * Recupera il valore della proprietà individualMode.
     * 
     * @return
     *     possible object is
     *     {@link IndividualModesEnumeration }
     *     
     */
    public IndividualModesEnumeration getIndividualMode() {
        return individualMode;
    }

    /**
     * Imposta il valore della proprietà individualMode.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualModesEnumeration }
     *     
     */
    public void setIndividualMode(IndividualModesEnumeration value) {
        this.individualMode = value;
    }

    /**
     * Recupera il valore della proprietà operatingDayRef.
     * 
     * @return
     *     possible object is
     *     {@link OperatingDayRefStructure }
     *     
     */
    public OperatingDayRefStructure getOperatingDayRef() {
        return operatingDayRef;
    }

    /**
     * Imposta il valore della proprietà operatingDayRef.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingDayRefStructure }
     *     
     */
    public void setOperatingDayRef(OperatingDayRefStructure value) {
        this.operatingDayRef = value;
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
     * Recupera il valore della proprietà journeyRef.
     * 
     * @return
     *     possible object is
     *     {@link JourneyRefStructure }
     *     
     */
    public JourneyRefStructure getJourneyRef() {
        return journeyRef;
    }

    /**
     * Imposta il valore della proprietà journeyRef.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyRefStructure }
     *     
     */
    public void setJourneyRef(JourneyRefStructure value) {
        this.journeyRef = value;
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
     * Recupera il valore della proprietà mode.
     * 
     * @return
     *     possible object is
     *     {@link ModeStructure }
     *     
     */
    public ModeStructure getMode() {
        return mode;
    }

    /**
     * Imposta il valore della proprietà mode.
     * 
     * @param value
     *     allowed object is
     *     {@link ModeStructure }
     *     
     */
    public void setMode(ModeStructure value) {
        this.mode = value;
    }

    /**
     * Recupera il valore della proprietà publishedLineName.
     * 
     * @return
     *     possible object is
     *     {@link InternationalTextStructure }
     *     
     */
    public InternationalTextStructure getPublishedLineName() {
        return publishedLineName;
    }

    /**
     * Imposta il valore della proprietà publishedLineName.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTextStructure }
     *     
     */
    public void setPublishedLineName(InternationalTextStructure value) {
        this.publishedLineName = value;
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
     * Recupera il valore della proprietà routeDescription.
     * 
     * @return
     *     possible object is
     *     {@link InternationalTextStructure }
     *     
     */
    public InternationalTextStructure getRouteDescription() {
        return routeDescription;
    }

    /**
     * Imposta il valore della proprietà routeDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTextStructure }
     *     
     */
    public void setRouteDescription(InternationalTextStructure value) {
        this.routeDescription = value;
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
     * {@link ServiceViaPointStructure }
     * 
     * 
     */
    public List<ServiceViaPointStructure> getVia() {
        if (via == null) {
            via = new ArrayList<ServiceViaPointStructure>();
        }
        return this.via;
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
     * Recupera il valore della proprietà sharingService.
     * 
     * @return
     *     possible object is
     *     {@link SharingServiceStructure }
     *     
     */
    public SharingServiceStructure getSharingService() {
        return sharingService;
    }

    /**
     * Imposta il valore della proprietà sharingService.
     * 
     * @param value
     *     allowed object is
     *     {@link SharingServiceStructure }
     *     
     */
    public void setSharingService(SharingServiceStructure value) {
        this.sharingService = value;
    }

    /**
     * Recupera il valore della proprietà originStopPointRef.
     * 
     * @return
     *     possible object is
     *     {@link StopPointRefStructure }
     *     
     */
    public StopPointRefStructure getOriginStopPointRef() {
        return originStopPointRef;
    }

    /**
     * Imposta il valore della proprietà originStopPointRef.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointRefStructure }
     *     
     */
    public void setOriginStopPointRef(StopPointRefStructure value) {
        this.originStopPointRef = value;
    }

    /**
     * Recupera il valore della proprietà originText.
     * 
     * @return
     *     possible object is
     *     {@link InternationalTextStructure }
     *     
     */
    public InternationalTextStructure getOriginText() {
        return originText;
    }

    /**
     * Imposta il valore della proprietà originText.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTextStructure }
     *     
     */
    public void setOriginText(InternationalTextStructure value) {
        this.originText = value;
    }

    /**
     * Recupera il valore della proprietà destinationStopPointRef.
     * 
     * @return
     *     possible object is
     *     {@link StopPointRefStructure }
     *     
     */
    public StopPointRefStructure getDestinationStopPointRef() {
        return destinationStopPointRef;
    }

    /**
     * Imposta il valore della proprietà destinationStopPointRef.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointRefStructure }
     *     
     */
    public void setDestinationStopPointRef(StopPointRefStructure value) {
        this.destinationStopPointRef = value;
    }

    /**
     * Recupera il valore della proprietà destinationText.
     * 
     * @return
     *     possible object is
     *     {@link InternationalTextStructure }
     *     
     */
    public InternationalTextStructure getDestinationText() {
        return destinationText;
    }

    /**
     * Imposta il valore della proprietà destinationText.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTextStructure }
     *     
     */
    public void setDestinationText(InternationalTextStructure value) {
        this.destinationText = value;
    }

    /**
     * Recupera il valore della proprietà bookingArrangements.
     * 
     * @return
     *     possible object is
     *     {@link BookingArrangementsContainerStructure }
     *     
     */
    public BookingArrangementsContainerStructure getBookingArrangements() {
        return bookingArrangements;
    }

    /**
     * Imposta il valore della proprietà bookingArrangements.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingArrangementsContainerStructure }
     *     
     */
    public void setBookingArrangements(BookingArrangementsContainerStructure value) {
        this.bookingArrangements = value;
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

    public ContinuousServiceStructure withContinuousMode(ContinuousModesEnumeration value) {
        setContinuousMode(value);
        return this;
    }

    public ContinuousServiceStructure withIndividualMode(IndividualModesEnumeration value) {
        setIndividualMode(value);
        return this;
    }

    public ContinuousServiceStructure withOperatingDayRef(OperatingDayRefStructure value) {
        setOperatingDayRef(value);
        return this;
    }

    public ContinuousServiceStructure withVehicleRef(VehicleRefStructure value) {
        setVehicleRef(value);
        return this;
    }

    public ContinuousServiceStructure withJourneyRef(JourneyRefStructure value) {
        setJourneyRef(value);
        return this;
    }

    public ContinuousServiceStructure withLineRef(LineRefStructure value) {
        setLineRef(value);
        return this;
    }

    public ContinuousServiceStructure withDirectionRef(DirectionRefStructure value) {
        setDirectionRef(value);
        return this;
    }

    public ContinuousServiceStructure withMode(ModeStructure value) {
        setMode(value);
        return this;
    }

    public ContinuousServiceStructure withPublishedLineName(InternationalTextStructure value) {
        setPublishedLineName(value);
        return this;
    }

    public ContinuousServiceStructure withOperatorRef(OperatorRefStructure value) {
        setOperatorRef(value);
        return this;
    }

    public ContinuousServiceStructure withRouteDescription(InternationalTextStructure value) {
        setRouteDescription(value);
        return this;
    }

    public ContinuousServiceStructure withVia(ServiceViaPointStructure... values) {
        if (values!= null) {
            for (ServiceViaPointStructure value: values) {
                getVia().add(value);
            }
        }
        return this;
    }

    public ContinuousServiceStructure withVia(Collection<ServiceViaPointStructure> values) {
        if (values!= null) {
            getVia().addAll(values);
        }
        return this;
    }

    public ContinuousServiceStructure withAttribute(GeneralAttributeStructure... values) {
        if (values!= null) {
            for (GeneralAttributeStructure value: values) {
                getAttribute().add(value);
            }
        }
        return this;
    }

    public ContinuousServiceStructure withAttribute(Collection<GeneralAttributeStructure> values) {
        if (values!= null) {
            getAttribute().addAll(values);
        }
        return this;
    }

    public ContinuousServiceStructure withSharingService(SharingServiceStructure value) {
        setSharingService(value);
        return this;
    }

    public ContinuousServiceStructure withOriginStopPointRef(StopPointRefStructure value) {
        setOriginStopPointRef(value);
        return this;
    }

    public ContinuousServiceStructure withOriginText(InternationalTextStructure value) {
        setOriginText(value);
        return this;
    }

    public ContinuousServiceStructure withDestinationStopPointRef(StopPointRefStructure value) {
        setDestinationStopPointRef(value);
        return this;
    }

    public ContinuousServiceStructure withDestinationText(InternationalTextStructure value) {
        setDestinationText(value);
        return this;
    }

    public ContinuousServiceStructure withBookingArrangements(BookingArrangementsContainerStructure value) {
        setBookingArrangements(value);
        return this;
    }

    public ContinuousServiceStructure withSituationFullRef(SituationFullRefStructure... values) {
        if (values!= null) {
            for (SituationFullRefStructure value: values) {
                getSituationFullRef().add(value);
            }
        }
        return this;
    }

    public ContinuousServiceStructure withSituationFullRef(Collection<SituationFullRefStructure> values) {
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

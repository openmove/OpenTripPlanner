//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package de.vdv.ojp;

import java.math.BigInteger;
import java.time.Duration;
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


/**
 * Trip request parameter structure.
 * 
 * <p>Classe Java per TripParamStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TripParamStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}TripDataFilterGroup"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}TripMobilityFilterGroup"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}TripPolicyGroup"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}TripContentFilterGroup"/&gt;
 *         &lt;element name="FareParam" type="{http://www.vdv.de/ojp}FareParamStructure" minOccurs="0"/&gt;
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
@XmlType(name = "TripParamStructure", propOrder = {
    "ptModeFilter",
    "lineFilter",
    "operatorFilter",
    "privateModeFilter",
    "noSingleStep",
    "noStairs",
    "noEscalator",
    "noElevator",
    "noRamp",
    "noSight",
    "levelEntrance",
    "bikeTransport",
    "walkSpeed",
    "boardingTime",
    "alightingTime",
    "numberOfResults",
    "numberOfResultsBefore",
    "numberOfResultsAfter",
    "ignoreRealtimeData",
    "immediateTripStart",
    "transferLimit",
    "optimisationMethod",
    "itModesToCover",
    "acceptDeferredDelivery",
    "includeTrackSections",
    "includeLegProjection",
    "includeTurnDescription",
    "includeAccessibility",
    "includeTactilePaving",
    "includeIntermediateStops",
    "includeFare",
    "includeOperatingDays",
    "fareParam",
    "extension"
})
public class TripParamStructure {

    @XmlElement(name = "PtModeFilter")
    protected PtModeFilterStructure ptModeFilter;
    @XmlElement(name = "LineFilter")
    protected LineDirectionFilterStructure lineFilter;
    @XmlElement(name = "OperatorFilter")
    protected OperatorFilterStructure operatorFilter;
    @XmlElement(name = "PrivateModeFilter")
    protected PrivateModeFilterStructure privateModeFilter;
    @XmlElement(name = "NoSingleStep", defaultValue = "false")
    protected Boolean noSingleStep;
    @XmlElement(name = "NoStairs", defaultValue = "false")
    protected Boolean noStairs;
    @XmlElement(name = "NoEscalator", defaultValue = "false")
    protected Boolean noEscalator;
    @XmlElement(name = "NoElevator", defaultValue = "false")
    protected Boolean noElevator;
    @XmlElement(name = "NoRamp", defaultValue = "false")
    protected Boolean noRamp;
    @XmlElement(name = "NoSight", defaultValue = "false")
    protected Boolean noSight;
    @XmlElement(name = "LevelEntrance", defaultValue = "false")
    protected Boolean levelEntrance;
    @XmlElement(name = "BikeTransport", defaultValue = "false")
    protected Boolean bikeTransport;
    @XmlElement(name = "WalkSpeed")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger walkSpeed;
    @XmlElement(name = "BoardingTime", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration boardingTime;
    @XmlElement(name = "AlightingTime", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration alightingTime;
    @XmlElement(name = "NumberOfResults")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfResults;
    @XmlElement(name = "NumberOfResultsBefore")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfResultsBefore;
    @XmlElement(name = "NumberOfResultsAfter")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfResultsAfter;
    @XmlElement(name = "IgnoreRealtimeData", defaultValue = "false")
    protected Boolean ignoreRealtimeData;
    @XmlElement(name = "ImmediateTripStart", defaultValue = "false")
    protected Boolean immediateTripStart;
    @XmlElement(name = "TransferLimit")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger transferLimit;
    @XmlElement(name = "OptimisationMethod")
    @XmlSchemaType(name = "string")
    protected OptimisationMethodEnumeration optimisationMethod;
    @XmlElement(name = "ItModesToCover")
    @XmlSchemaType(name = "string")
    protected List<IndividualModesEnumeration> itModesToCover;
    @XmlElement(name = "AcceptDeferredDelivery", defaultValue = "false")
    protected Boolean acceptDeferredDelivery;
    @XmlElement(name = "IncludeTrackSections", defaultValue = "false")
    protected Boolean includeTrackSections;
    @XmlElement(name = "IncludeLegProjection", defaultValue = "false")
    protected Boolean includeLegProjection;
    @XmlElement(name = "IncludeTurnDescription", defaultValue = "false")
    protected Boolean includeTurnDescription;
    @XmlElement(name = "IncludeAccessibility", defaultValue = "false")
    protected Boolean includeAccessibility;
    @XmlElement(name = "IncludeTactilePaving", defaultValue = "false")
    protected Boolean includeTactilePaving;
    @XmlElement(name = "IncludeIntermediateStops", defaultValue = "false")
    protected Boolean includeIntermediateStops;
    @XmlElement(name = "IncludeFare", defaultValue = "false")
    protected Boolean includeFare;
    @XmlElement(name = "IncludeOperatingDays", defaultValue = "false")
    protected Boolean includeOperatingDays;
    @XmlElement(name = "FareParam")
    protected FareParamStructure fareParam;
    @XmlElement(name = "Extension")
    protected Object extension;

    /**
     * Recupera il valore della proprietà ptModeFilter.
     * 
     * @return
     *     possible object is
     *     {@link PtModeFilterStructure }
     *     
     */
    public PtModeFilterStructure getPtModeFilter() {
        return ptModeFilter;
    }

    /**
     * Imposta il valore della proprietà ptModeFilter.
     * 
     * @param value
     *     allowed object is
     *     {@link PtModeFilterStructure }
     *     
     */
    public void setPtModeFilter(PtModeFilterStructure value) {
        this.ptModeFilter = value;
    }

    /**
     * Recupera il valore della proprietà lineFilter.
     * 
     * @return
     *     possible object is
     *     {@link LineDirectionFilterStructure }
     *     
     */
    public LineDirectionFilterStructure getLineFilter() {
        return lineFilter;
    }

    /**
     * Imposta il valore della proprietà lineFilter.
     * 
     * @param value
     *     allowed object is
     *     {@link LineDirectionFilterStructure }
     *     
     */
    public void setLineFilter(LineDirectionFilterStructure value) {
        this.lineFilter = value;
    }

    /**
     * Recupera il valore della proprietà operatorFilter.
     * 
     * @return
     *     possible object is
     *     {@link OperatorFilterStructure }
     *     
     */
    public OperatorFilterStructure getOperatorFilter() {
        return operatorFilter;
    }

    /**
     * Imposta il valore della proprietà operatorFilter.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorFilterStructure }
     *     
     */
    public void setOperatorFilter(OperatorFilterStructure value) {
        this.operatorFilter = value;
    }

    /**
     * Recupera il valore della proprietà privateModeFilter.
     * 
     * @return
     *     possible object is
     *     {@link PrivateModeFilterStructure }
     *     
     */
    public PrivateModeFilterStructure getPrivateModeFilter() {
        return privateModeFilter;
    }

    /**
     * Imposta il valore della proprietà privateModeFilter.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivateModeFilterStructure }
     *     
     */
    public void setPrivateModeFilter(PrivateModeFilterStructure value) {
        this.privateModeFilter = value;
    }

    /**
     * Recupera il valore della proprietà noSingleStep.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoSingleStep() {
        return noSingleStep;
    }

    /**
     * Imposta il valore della proprietà noSingleStep.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoSingleStep(Boolean value) {
        this.noSingleStep = value;
    }

    /**
     * Recupera il valore della proprietà noStairs.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoStairs() {
        return noStairs;
    }

    /**
     * Imposta il valore della proprietà noStairs.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoStairs(Boolean value) {
        this.noStairs = value;
    }

    /**
     * Recupera il valore della proprietà noEscalator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoEscalator() {
        return noEscalator;
    }

    /**
     * Imposta il valore della proprietà noEscalator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoEscalator(Boolean value) {
        this.noEscalator = value;
    }

    /**
     * Recupera il valore della proprietà noElevator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoElevator() {
        return noElevator;
    }

    /**
     * Imposta il valore della proprietà noElevator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoElevator(Boolean value) {
        this.noElevator = value;
    }

    /**
     * Recupera il valore della proprietà noRamp.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoRamp() {
        return noRamp;
    }

    /**
     * Imposta il valore della proprietà noRamp.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoRamp(Boolean value) {
        this.noRamp = value;
    }

    /**
     * Recupera il valore della proprietà noSight.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoSight() {
        return noSight;
    }

    /**
     * Imposta il valore della proprietà noSight.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoSight(Boolean value) {
        this.noSight = value;
    }

    /**
     * Recupera il valore della proprietà levelEntrance.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLevelEntrance() {
        return levelEntrance;
    }

    /**
     * Imposta il valore della proprietà levelEntrance.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLevelEntrance(Boolean value) {
        this.levelEntrance = value;
    }

    /**
     * Recupera il valore della proprietà bikeTransport.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBikeTransport() {
        return bikeTransport;
    }

    /**
     * Imposta il valore della proprietà bikeTransport.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBikeTransport(Boolean value) {
        this.bikeTransport = value;
    }

    /**
     * Recupera il valore della proprietà walkSpeed.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWalkSpeed() {
        return walkSpeed;
    }

    /**
     * Imposta il valore della proprietà walkSpeed.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWalkSpeed(BigInteger value) {
        this.walkSpeed = value;
    }

    /**
     * Recupera il valore della proprietà boardingTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getBoardingTime() {
        return boardingTime;
    }

    /**
     * Imposta il valore della proprietà boardingTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoardingTime(Duration value) {
        this.boardingTime = value;
    }

    /**
     * Recupera il valore della proprietà alightingTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getAlightingTime() {
        return alightingTime;
    }

    /**
     * Imposta il valore della proprietà alightingTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlightingTime(Duration value) {
        this.alightingTime = value;
    }

    /**
     * Recupera il valore della proprietà numberOfResults.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfResults() {
        return numberOfResults;
    }

    /**
     * Imposta il valore della proprietà numberOfResults.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfResults(BigInteger value) {
        this.numberOfResults = value;
    }

    /**
     * Recupera il valore della proprietà numberOfResultsBefore.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfResultsBefore() {
        return numberOfResultsBefore;
    }

    /**
     * Imposta il valore della proprietà numberOfResultsBefore.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfResultsBefore(BigInteger value) {
        this.numberOfResultsBefore = value;
    }

    /**
     * Recupera il valore della proprietà numberOfResultsAfter.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfResultsAfter() {
        return numberOfResultsAfter;
    }

    /**
     * Imposta il valore della proprietà numberOfResultsAfter.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfResultsAfter(BigInteger value) {
        this.numberOfResultsAfter = value;
    }

    /**
     * Recupera il valore della proprietà ignoreRealtimeData.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreRealtimeData() {
        return ignoreRealtimeData;
    }

    /**
     * Imposta il valore della proprietà ignoreRealtimeData.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreRealtimeData(Boolean value) {
        this.ignoreRealtimeData = value;
    }

    /**
     * Recupera il valore della proprietà immediateTripStart.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isImmediateTripStart() {
        return immediateTripStart;
    }

    /**
     * Imposta il valore della proprietà immediateTripStart.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setImmediateTripStart(Boolean value) {
        this.immediateTripStart = value;
    }

    /**
     * Recupera il valore della proprietà transferLimit.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTransferLimit() {
        return transferLimit;
    }

    /**
     * Imposta il valore della proprietà transferLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTransferLimit(BigInteger value) {
        this.transferLimit = value;
    }

    /**
     * Recupera il valore della proprietà optimisationMethod.
     * 
     * @return
     *     possible object is
     *     {@link OptimisationMethodEnumeration }
     *     
     */
    public OptimisationMethodEnumeration getOptimisationMethod() {
        return optimisationMethod;
    }

    /**
     * Imposta il valore della proprietà optimisationMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link OptimisationMethodEnumeration }
     *     
     */
    public void setOptimisationMethod(OptimisationMethodEnumeration value) {
        this.optimisationMethod = value;
    }

    /**
     * Gets the value of the itModesToCover property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itModesToCover property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItModesToCover().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndividualModesEnumeration }
     * 
     * 
     */
    public List<IndividualModesEnumeration> getItModesToCover() {
        if (itModesToCover == null) {
            itModesToCover = new ArrayList<IndividualModesEnumeration>();
        }
        return this.itModesToCover;
    }

    /**
     * Recupera il valore della proprietà acceptDeferredDelivery.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcceptDeferredDelivery() {
        return acceptDeferredDelivery;
    }

    /**
     * Imposta il valore della proprietà acceptDeferredDelivery.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcceptDeferredDelivery(Boolean value) {
        this.acceptDeferredDelivery = value;
    }

    /**
     * Recupera il valore della proprietà includeTrackSections.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeTrackSections() {
        return includeTrackSections;
    }

    /**
     * Imposta il valore della proprietà includeTrackSections.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeTrackSections(Boolean value) {
        this.includeTrackSections = value;
    }

    /**
     * Recupera il valore della proprietà includeLegProjection.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeLegProjection() {
        return includeLegProjection;
    }

    /**
     * Imposta il valore della proprietà includeLegProjection.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeLegProjection(Boolean value) {
        this.includeLegProjection = value;
    }

    /**
     * Recupera il valore della proprietà includeTurnDescription.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeTurnDescription() {
        return includeTurnDescription;
    }

    /**
     * Imposta il valore della proprietà includeTurnDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeTurnDescription(Boolean value) {
        this.includeTurnDescription = value;
    }

    /**
     * Recupera il valore della proprietà includeAccessibility.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeAccessibility() {
        return includeAccessibility;
    }

    /**
     * Imposta il valore della proprietà includeAccessibility.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeAccessibility(Boolean value) {
        this.includeAccessibility = value;
    }

    /**
     * Recupera il valore della proprietà includeTactilePaving.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeTactilePaving() {
        return includeTactilePaving;
    }

    /**
     * Imposta il valore della proprietà includeTactilePaving.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeTactilePaving(Boolean value) {
        this.includeTactilePaving = value;
    }

    /**
     * Recupera il valore della proprietà includeIntermediateStops.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeIntermediateStops() {
        return includeIntermediateStops;
    }

    /**
     * Imposta il valore della proprietà includeIntermediateStops.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeIntermediateStops(Boolean value) {
        this.includeIntermediateStops = value;
    }

    /**
     * Recupera il valore della proprietà includeFare.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeFare() {
        return includeFare;
    }

    /**
     * Imposta il valore della proprietà includeFare.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeFare(Boolean value) {
        this.includeFare = value;
    }

    /**
     * Recupera il valore della proprietà includeOperatingDays.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeOperatingDays() {
        return includeOperatingDays;
    }

    /**
     * Imposta il valore della proprietà includeOperatingDays.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeOperatingDays(Boolean value) {
        this.includeOperatingDays = value;
    }

    /**
     * Recupera il valore della proprietà fareParam.
     * 
     * @return
     *     possible object is
     *     {@link FareParamStructure }
     *     
     */
    public FareParamStructure getFareParam() {
        return fareParam;
    }

    /**
     * Imposta il valore della proprietà fareParam.
     * 
     * @param value
     *     allowed object is
     *     {@link FareParamStructure }
     *     
     */
    public void setFareParam(FareParamStructure value) {
        this.fareParam = value;
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

    public TripParamStructure withPtModeFilter(PtModeFilterStructure value) {
        setPtModeFilter(value);
        return this;
    }

    public TripParamStructure withLineFilter(LineDirectionFilterStructure value) {
        setLineFilter(value);
        return this;
    }

    public TripParamStructure withOperatorFilter(OperatorFilterStructure value) {
        setOperatorFilter(value);
        return this;
    }

    public TripParamStructure withPrivateModeFilter(PrivateModeFilterStructure value) {
        setPrivateModeFilter(value);
        return this;
    }

    public TripParamStructure withNoSingleStep(Boolean value) {
        setNoSingleStep(value);
        return this;
    }

    public TripParamStructure withNoStairs(Boolean value) {
        setNoStairs(value);
        return this;
    }

    public TripParamStructure withNoEscalator(Boolean value) {
        setNoEscalator(value);
        return this;
    }

    public TripParamStructure withNoElevator(Boolean value) {
        setNoElevator(value);
        return this;
    }

    public TripParamStructure withNoRamp(Boolean value) {
        setNoRamp(value);
        return this;
    }

    public TripParamStructure withNoSight(Boolean value) {
        setNoSight(value);
        return this;
    }

    public TripParamStructure withLevelEntrance(Boolean value) {
        setLevelEntrance(value);
        return this;
    }

    public TripParamStructure withBikeTransport(Boolean value) {
        setBikeTransport(value);
        return this;
    }

    public TripParamStructure withWalkSpeed(BigInteger value) {
        setWalkSpeed(value);
        return this;
    }

    public TripParamStructure withBoardingTime(Duration value) {
        setBoardingTime(value);
        return this;
    }

    public TripParamStructure withAlightingTime(Duration value) {
        setAlightingTime(value);
        return this;
    }

    public TripParamStructure withNumberOfResults(BigInteger value) {
        setNumberOfResults(value);
        return this;
    }

    public TripParamStructure withNumberOfResultsBefore(BigInteger value) {
        setNumberOfResultsBefore(value);
        return this;
    }

    public TripParamStructure withNumberOfResultsAfter(BigInteger value) {
        setNumberOfResultsAfter(value);
        return this;
    }

    public TripParamStructure withIgnoreRealtimeData(Boolean value) {
        setIgnoreRealtimeData(value);
        return this;
    }

    public TripParamStructure withImmediateTripStart(Boolean value) {
        setImmediateTripStart(value);
        return this;
    }

    public TripParamStructure withTransferLimit(BigInteger value) {
        setTransferLimit(value);
        return this;
    }

    public TripParamStructure withOptimisationMethod(OptimisationMethodEnumeration value) {
        setOptimisationMethod(value);
        return this;
    }

    public TripParamStructure withItModesToCover(IndividualModesEnumeration... values) {
        if (values!= null) {
            for (IndividualModesEnumeration value: values) {
                getItModesToCover().add(value);
            }
        }
        return this;
    }

    public TripParamStructure withItModesToCover(Collection<IndividualModesEnumeration> values) {
        if (values!= null) {
            getItModesToCover().addAll(values);
        }
        return this;
    }

    public TripParamStructure withAcceptDeferredDelivery(Boolean value) {
        setAcceptDeferredDelivery(value);
        return this;
    }

    public TripParamStructure withIncludeTrackSections(Boolean value) {
        setIncludeTrackSections(value);
        return this;
    }

    public TripParamStructure withIncludeLegProjection(Boolean value) {
        setIncludeLegProjection(value);
        return this;
    }

    public TripParamStructure withIncludeTurnDescription(Boolean value) {
        setIncludeTurnDescription(value);
        return this;
    }

    public TripParamStructure withIncludeAccessibility(Boolean value) {
        setIncludeAccessibility(value);
        return this;
    }

    public TripParamStructure withIncludeTactilePaving(Boolean value) {
        setIncludeTactilePaving(value);
        return this;
    }

    public TripParamStructure withIncludeIntermediateStops(Boolean value) {
        setIncludeIntermediateStops(value);
        return this;
    }

    public TripParamStructure withIncludeFare(Boolean value) {
        setIncludeFare(value);
        return this;
    }

    public TripParamStructure withIncludeOperatingDays(Boolean value) {
        setIncludeOperatingDays(value);
        return this;
    }

    public TripParamStructure withFareParam(FareParamStructure value) {
        setFareParam(value);
        return this;
    }

    public TripParamStructure withExtension(Object value) {
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

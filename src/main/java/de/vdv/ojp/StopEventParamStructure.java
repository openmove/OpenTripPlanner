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
 * Request specific parameters (parameters which define what is to be included in a Stop  Event result)
 * 
 * <p>Classe Java per StopEventParamStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="StopEventParamStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}StopEventDataFilterGroup"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}StopEventPolicyGroup"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}StopEventContentFilterGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopEventParamStructure", propOrder = {
    "ptModeFilter",
    "lineFilter",
    "operatorFilter",
    "numberOfResults",
    "timeWindow",
    "stopEventType",
    "includePreviousCalls",
    "includeOnwardCalls",
    "includeOperatingDays",
    "includeRealtimeData"
})
public class StopEventParamStructure {

    @XmlElement(name = "PtModeFilter")
    protected PtModeFilterStructure ptModeFilter;
    @XmlElement(name = "LineFilter")
    protected LineDirectionFilterStructure lineFilter;
    @XmlElement(name = "OperatorFilter")
    protected OperatorFilterStructure operatorFilter;
    @XmlElement(name = "NumberOfResults")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfResults;
    @XmlElement(name = "TimeWindow", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration timeWindow;
    @XmlElement(name = "StopEventType")
    @XmlSchemaType(name = "string")
    protected StopEventTypeEnumeration stopEventType;
    @XmlElement(name = "IncludePreviousCalls", defaultValue = "false")
    protected Boolean includePreviousCalls;
    @XmlElement(name = "IncludeOnwardCalls", defaultValue = "false")
    protected Boolean includeOnwardCalls;
    @XmlElement(name = "IncludeOperatingDays", defaultValue = "false")
    protected Boolean includeOperatingDays;
    @XmlElement(name = "IncludeRealtimeData", defaultValue = "false")
    protected Boolean includeRealtimeData;

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
     * Recupera il valore della proprietà timeWindow.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getTimeWindow() {
        return timeWindow;
    }

    /**
     * Imposta il valore della proprietà timeWindow.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeWindow(Duration value) {
        this.timeWindow = value;
    }

    /**
     * Recupera il valore della proprietà stopEventType.
     * 
     * @return
     *     possible object is
     *     {@link StopEventTypeEnumeration }
     *     
     */
    public StopEventTypeEnumeration getStopEventType() {
        return stopEventType;
    }

    /**
     * Imposta il valore della proprietà stopEventType.
     * 
     * @param value
     *     allowed object is
     *     {@link StopEventTypeEnumeration }
     *     
     */
    public void setStopEventType(StopEventTypeEnumeration value) {
        this.stopEventType = value;
    }

    /**
     * Recupera il valore della proprietà includePreviousCalls.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludePreviousCalls() {
        return includePreviousCalls;
    }

    /**
     * Imposta il valore della proprietà includePreviousCalls.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludePreviousCalls(Boolean value) {
        this.includePreviousCalls = value;
    }

    /**
     * Recupera il valore della proprietà includeOnwardCalls.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeOnwardCalls() {
        return includeOnwardCalls;
    }

    /**
     * Imposta il valore della proprietà includeOnwardCalls.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeOnwardCalls(Boolean value) {
        this.includeOnwardCalls = value;
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
     * Recupera il valore della proprietà includeRealtimeData.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeRealtimeData() {
        return includeRealtimeData;
    }

    /**
     * Imposta il valore della proprietà includeRealtimeData.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeRealtimeData(Boolean value) {
        this.includeRealtimeData = value;
    }

    public StopEventParamStructure withPtModeFilter(PtModeFilterStructure value) {
        setPtModeFilter(value);
        return this;
    }

    public StopEventParamStructure withLineFilter(LineDirectionFilterStructure value) {
        setLineFilter(value);
        return this;
    }

    public StopEventParamStructure withOperatorFilter(OperatorFilterStructure value) {
        setOperatorFilter(value);
        return this;
    }

    public StopEventParamStructure withNumberOfResults(BigInteger value) {
        setNumberOfResults(value);
        return this;
    }

    public StopEventParamStructure withTimeWindow(Duration value) {
        setTimeWindow(value);
        return this;
    }

    public StopEventParamStructure withStopEventType(StopEventTypeEnumeration value) {
        setStopEventType(value);
        return this;
    }

    public StopEventParamStructure withIncludePreviousCalls(Boolean value) {
        setIncludePreviousCalls(value);
        return this;
    }

    public StopEventParamStructure withIncludeOnwardCalls(Boolean value) {
        setIncludeOnwardCalls(value);
        return this;
    }

    public StopEventParamStructure withIncludeOperatingDays(Boolean value) {
        setIncludeOperatingDays(value);
        return this;
    }

    public StopEventParamStructure withIncludeRealtimeData(Boolean value) {
        setIncludeRealtimeData(value);
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

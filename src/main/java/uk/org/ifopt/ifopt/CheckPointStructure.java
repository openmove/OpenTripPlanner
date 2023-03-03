//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package uk.org.ifopt.ifopt;

import java.time.Duration;
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


/**
 * <p>Classe Java per CheckPointStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CheckPointStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CheckPointId" type="{http://www.ifopt.org.uk/ifopt}CheckPointIdType" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.ifopt.org.uk/ifopt}CheckPointGroup"/&gt;
 *         &lt;group ref="{http://www.ifopt.org.uk/ifopt}DelayGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckPointStructure", propOrder = {
    "checkPointId",
    "validityCondition",
    "checkPointProcess",
    "checkPointService",
    "accessFeatureType",
    "congestion",
    "facilityRef",
    "minimumLikelyDelay",
    "averageDelay",
    "maximumLikelyDelay"
})
public class CheckPointStructure {

    @XmlElement(name = "CheckPointId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String checkPointId;
    @XmlElement(name = "ValidityCondition")
    protected ValidityConditionStructure validityCondition;
    @XmlElement(name = "CheckPointProcess")
    @XmlSchemaType(name = "string")
    protected CheckPointProcessEnumeration checkPointProcess;
    @XmlElement(name = "CheckPointService")
    @XmlSchemaType(name = "string")
    protected CheckPointServiceEnumeration checkPointService;
    @XmlElement(name = "AccessFeatureType")
    @XmlSchemaType(name = "string")
    protected AccessibilityFeatureEnumeration accessFeatureType;
    @XmlElement(name = "Congestion")
    @XmlSchemaType(name = "string")
    protected CongestionEnumeration congestion;
    @XmlElement(name = "FacilityRef")
    protected String facilityRef;
    @XmlElement(name = "MinimumLikelyDelay", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration minimumLikelyDelay;
    @XmlElement(name = "AverageDelay", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration averageDelay;
    @XmlElement(name = "MaximumLikelyDelay", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration maximumLikelyDelay;

    /**
     * Recupera il valore della proprietà checkPointId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckPointId() {
        return checkPointId;
    }

    /**
     * Imposta il valore della proprietà checkPointId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckPointId(String value) {
        this.checkPointId = value;
    }

    /**
     * Recupera il valore della proprietà validityCondition.
     * 
     * @return
     *     possible object is
     *     {@link ValidityConditionStructure }
     *     
     */
    public ValidityConditionStructure getValidityCondition() {
        return validityCondition;
    }

    /**
     * Imposta il valore della proprietà validityCondition.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidityConditionStructure }
     *     
     */
    public void setValidityCondition(ValidityConditionStructure value) {
        this.validityCondition = value;
    }

    /**
     * Recupera il valore della proprietà checkPointProcess.
     * 
     * @return
     *     possible object is
     *     {@link CheckPointProcessEnumeration }
     *     
     */
    public CheckPointProcessEnumeration getCheckPointProcess() {
        return checkPointProcess;
    }

    /**
     * Imposta il valore della proprietà checkPointProcess.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckPointProcessEnumeration }
     *     
     */
    public void setCheckPointProcess(CheckPointProcessEnumeration value) {
        this.checkPointProcess = value;
    }

    /**
     * Recupera il valore della proprietà checkPointService.
     * 
     * @return
     *     possible object is
     *     {@link CheckPointServiceEnumeration }
     *     
     */
    public CheckPointServiceEnumeration getCheckPointService() {
        return checkPointService;
    }

    /**
     * Imposta il valore della proprietà checkPointService.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckPointServiceEnumeration }
     *     
     */
    public void setCheckPointService(CheckPointServiceEnumeration value) {
        this.checkPointService = value;
    }

    /**
     * Recupera il valore della proprietà accessFeatureType.
     * 
     * @return
     *     possible object is
     *     {@link AccessibilityFeatureEnumeration }
     *     
     */
    public AccessibilityFeatureEnumeration getAccessFeatureType() {
        return accessFeatureType;
    }

    /**
     * Imposta il valore della proprietà accessFeatureType.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessibilityFeatureEnumeration }
     *     
     */
    public void setAccessFeatureType(AccessibilityFeatureEnumeration value) {
        this.accessFeatureType = value;
    }

    /**
     * Recupera il valore della proprietà congestion.
     * 
     * @return
     *     possible object is
     *     {@link CongestionEnumeration }
     *     
     */
    public CongestionEnumeration getCongestion() {
        return congestion;
    }

    /**
     * Imposta il valore della proprietà congestion.
     * 
     * @param value
     *     allowed object is
     *     {@link CongestionEnumeration }
     *     
     */
    public void setCongestion(CongestionEnumeration value) {
        this.congestion = value;
    }

    /**
     * Recupera il valore della proprietà facilityRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityRef() {
        return facilityRef;
    }

    /**
     * Imposta il valore della proprietà facilityRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityRef(String value) {
        this.facilityRef = value;
    }

    /**
     * Recupera il valore della proprietà minimumLikelyDelay.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getMinimumLikelyDelay() {
        return minimumLikelyDelay;
    }

    /**
     * Imposta il valore della proprietà minimumLikelyDelay.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinimumLikelyDelay(Duration value) {
        this.minimumLikelyDelay = value;
    }

    /**
     * Recupera il valore della proprietà averageDelay.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getAverageDelay() {
        return averageDelay;
    }

    /**
     * Imposta il valore della proprietà averageDelay.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAverageDelay(Duration value) {
        this.averageDelay = value;
    }

    /**
     * Recupera il valore della proprietà maximumLikelyDelay.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getMaximumLikelyDelay() {
        return maximumLikelyDelay;
    }

    /**
     * Imposta il valore della proprietà maximumLikelyDelay.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumLikelyDelay(Duration value) {
        this.maximumLikelyDelay = value;
    }

    public CheckPointStructure withCheckPointId(String value) {
        setCheckPointId(value);
        return this;
    }

    public CheckPointStructure withValidityCondition(ValidityConditionStructure value) {
        setValidityCondition(value);
        return this;
    }

    public CheckPointStructure withCheckPointProcess(CheckPointProcessEnumeration value) {
        setCheckPointProcess(value);
        return this;
    }

    public CheckPointStructure withCheckPointService(CheckPointServiceEnumeration value) {
        setCheckPointService(value);
        return this;
    }

    public CheckPointStructure withAccessFeatureType(AccessibilityFeatureEnumeration value) {
        setAccessFeatureType(value);
        return this;
    }

    public CheckPointStructure withCongestion(CongestionEnumeration value) {
        setCongestion(value);
        return this;
    }

    public CheckPointStructure withFacilityRef(String value) {
        setFacilityRef(value);
        return this;
    }

    public CheckPointStructure withMinimumLikelyDelay(Duration value) {
        setMinimumLikelyDelay(value);
        return this;
    }

    public CheckPointStructure withAverageDelay(Duration value) {
        setAverageDelay(value);
        return this;
    }

    public CheckPointStructure withMaximumLikelyDelay(Duration value) {
        setMaximumLikelyDelay(value);
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

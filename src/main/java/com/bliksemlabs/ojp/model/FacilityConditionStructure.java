//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package com.bliksemlabs.ojp.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per FacilityConditionStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="FacilityConditionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="Facility" type="{http://www.siri.org.uk/siri}FacilityStructure"/&gt;
 *           &lt;element ref="{http://www.siri.org.uk/siri}FacilityRef"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="FacilityStatus" type="{http://www.siri.org.uk/siri}FacilityStatusStructure"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}SituationRef" minOccurs="0"/&gt;
 *         &lt;element name="Remedy" type="{http://www.siri.org.uk/siri}RemedyStructure" minOccurs="0"/&gt;
 *         &lt;element name="MonitoringInfo" type="{http://www.siri.org.uk/siri}MonitoringInformationStructure" minOccurs="0"/&gt;
 *         &lt;element name="ValidityPeriod" type="{http://www.siri.org.uk/siri}HalfOpenTimestampOutputRangeStructure" minOccurs="0"/&gt;
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
@XmlType(name = "FacilityConditionStructure", propOrder = {
    "facility",
    "facilityRef",
    "facilityStatus",
    "situationRef",
    "remedy",
    "monitoringInfo",
    "validityPeriod",
    "extensions"
})
public class FacilityConditionStructure {

    @XmlElement(name = "Facility")
    protected FacilityStructure facility;
    @XmlElement(name = "FacilityRef")
    protected FacilityRefStructure facilityRef;
    @XmlElement(name = "FacilityStatus", required = true)
    protected FacilityStatusStructure facilityStatus;
    @XmlElement(name = "SituationRef")
    protected SituationRefStructure situationRef;
    @XmlElement(name = "Remedy")
    protected RemedyStructure remedy;
    @XmlElement(name = "MonitoringInfo")
    protected MonitoringInformationStructure monitoringInfo;
    @XmlElement(name = "ValidityPeriod")
    protected HalfOpenTimestampOutputRangeStructure validityPeriod;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Recupera il valore della proprietà facility.
     * 
     * @return
     *     possible object is
     *     {@link FacilityStructure }
     *     
     */
    public FacilityStructure getFacility() {
        return facility;
    }

    /**
     * Imposta il valore della proprietà facility.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityStructure }
     *     
     */
    public void setFacility(FacilityStructure value) {
        this.facility = value;
    }

    /**
     * Recupera il valore della proprietà facilityRef.
     * 
     * @return
     *     possible object is
     *     {@link FacilityRefStructure }
     *     
     */
    public FacilityRefStructure getFacilityRef() {
        return facilityRef;
    }

    /**
     * Imposta il valore della proprietà facilityRef.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityRefStructure }
     *     
     */
    public void setFacilityRef(FacilityRefStructure value) {
        this.facilityRef = value;
    }

    /**
     * Recupera il valore della proprietà facilityStatus.
     * 
     * @return
     *     possible object is
     *     {@link FacilityStatusStructure }
     *     
     */
    public FacilityStatusStructure getFacilityStatus() {
        return facilityStatus;
    }

    /**
     * Imposta il valore della proprietà facilityStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityStatusStructure }
     *     
     */
    public void setFacilityStatus(FacilityStatusStructure value) {
        this.facilityStatus = value;
    }

    /**
     * Recupera il valore della proprietà situationRef.
     * 
     * @return
     *     possible object is
     *     {@link SituationRefStructure }
     *     
     */
    public SituationRefStructure getSituationRef() {
        return situationRef;
    }

    /**
     * Imposta il valore della proprietà situationRef.
     * 
     * @param value
     *     allowed object is
     *     {@link SituationRefStructure }
     *     
     */
    public void setSituationRef(SituationRefStructure value) {
        this.situationRef = value;
    }

    /**
     * Recupera il valore della proprietà remedy.
     * 
     * @return
     *     possible object is
     *     {@link RemedyStructure }
     *     
     */
    public RemedyStructure getRemedy() {
        return remedy;
    }

    /**
     * Imposta il valore della proprietà remedy.
     * 
     * @param value
     *     allowed object is
     *     {@link RemedyStructure }
     *     
     */
    public void setRemedy(RemedyStructure value) {
        this.remedy = value;
    }

    /**
     * Recupera il valore della proprietà monitoringInfo.
     * 
     * @return
     *     possible object is
     *     {@link MonitoringInformationStructure }
     *     
     */
    public MonitoringInformationStructure getMonitoringInfo() {
        return monitoringInfo;
    }

    /**
     * Imposta il valore della proprietà monitoringInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitoringInformationStructure }
     *     
     */
    public void setMonitoringInfo(MonitoringInformationStructure value) {
        this.monitoringInfo = value;
    }

    /**
     * Recupera il valore della proprietà validityPeriod.
     * 
     * @return
     *     possible object is
     *     {@link HalfOpenTimestampOutputRangeStructure }
     *     
     */
    public HalfOpenTimestampOutputRangeStructure getValidityPeriod() {
        return validityPeriod;
    }

    /**
     * Imposta il valore della proprietà validityPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link HalfOpenTimestampOutputRangeStructure }
     *     
     */
    public void setValidityPeriod(HalfOpenTimestampOutputRangeStructure value) {
        this.validityPeriod = value;
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

    public FacilityConditionStructure withFacility(FacilityStructure value) {
        setFacility(value);
        return this;
    }

    public FacilityConditionStructure withFacilityRef(FacilityRefStructure value) {
        setFacilityRef(value);
        return this;
    }

    public FacilityConditionStructure withFacilityStatus(FacilityStatusStructure value) {
        setFacilityStatus(value);
        return this;
    }

    public FacilityConditionStructure withSituationRef(SituationRefStructure value) {
        setSituationRef(value);
        return this;
    }

    public FacilityConditionStructure withRemedy(RemedyStructure value) {
        setRemedy(value);
        return this;
    }

    public FacilityConditionStructure withMonitoringInfo(MonitoringInformationStructure value) {
        setMonitoringInfo(value);
        return this;
    }

    public FacilityConditionStructure withValidityPeriod(HalfOpenTimestampOutputRangeStructure value) {
        setValidityPeriod(value);
        return this;
    }

    public FacilityConditionStructure withExtensions(ExtensionsStructure value) {
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

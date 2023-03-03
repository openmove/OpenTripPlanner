//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package com.bliksemlabs.ojp.model;

import java.math.BigInteger;
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
import eu.datex2.schema._2_0rc1._2_0.Cause;
import eu.datex2.schema._2_0rc1._2_0.Comment;
import eu.datex2.schema._2_0rc1._2_0.ExtensionType;
import eu.datex2.schema._2_0rc1._2_0.GroupOfLocations;
import eu.datex2.schema._2_0rc1._2_0.Impact;
import eu.datex2.schema._2_0rc1._2_0.Management;
import eu.datex2.schema._2_0rc1._2_0.ProbabilityOfOccurrenceEnum;
import eu.datex2.schema._2_0rc1._2_0.Source;
import eu.datex2.schema._2_0rc1._2_0.Validity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.LocalDateTimeISO8601XmlAdapter;


/**
 * <p>Classe Java per OptionalTrafficElementStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="OptionalTrafficElementStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}Datex2ManagementGroup"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}Datex2SituationGroup"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}Datex2RoadGroup"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}Datex2OtherGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionalTrafficElementStructure", propOrder = {
    "situationRecordCreationReference",
    "situationRecordCreationTime",
    "situationRecordObservationTime",
    "situationRecordVersion",
    "situationRecordVersionTime",
    "situationRecordFirstSupplierVersionTime",
    "probabilityOfOccurrence",
    "source",
    "validity",
    "impact",
    "cause",
    "generalPublicComment",
    "nonGeneralPublicComment",
    "groupOfLocations",
    "management",
    "situationRecordExtension",
    "trafficElementExtension"
})
public abstract class OptionalTrafficElementStructure {

    @XmlElement(required = true)
    protected String situationRecordCreationReference;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime situationRecordCreationTime;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime situationRecordObservationTime;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger situationRecordVersion;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime situationRecordVersionTime;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime situationRecordFirstSupplierVersionTime;
    @XmlSchemaType(name = "string")
    protected ProbabilityOfOccurrenceEnum probabilityOfOccurrence;
    @XmlElement(name = "Source")
    protected Source source;
    protected Validity validity;
    protected Impact impact;
    protected Cause cause;
    protected List<Comment> generalPublicComment;
    protected List<Comment> nonGeneralPublicComment;
    protected GroupOfLocations groupOfLocations;
    protected Management management;
    protected ExtensionType situationRecordExtension;
    protected ExtensionType trafficElementExtension;

    /**
     * Recupera il valore della proprietà situationRecordCreationReference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSituationRecordCreationReference() {
        return situationRecordCreationReference;
    }

    /**
     * Imposta il valore della proprietà situationRecordCreationReference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSituationRecordCreationReference(String value) {
        this.situationRecordCreationReference = value;
    }

    /**
     * Recupera il valore della proprietà situationRecordCreationTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getSituationRecordCreationTime() {
        return situationRecordCreationTime;
    }

    /**
     * Imposta il valore della proprietà situationRecordCreationTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSituationRecordCreationTime(LocalDateTime value) {
        this.situationRecordCreationTime = value;
    }

    /**
     * Recupera il valore della proprietà situationRecordObservationTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getSituationRecordObservationTime() {
        return situationRecordObservationTime;
    }

    /**
     * Imposta il valore della proprietà situationRecordObservationTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSituationRecordObservationTime(LocalDateTime value) {
        this.situationRecordObservationTime = value;
    }

    /**
     * Recupera il valore della proprietà situationRecordVersion.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSituationRecordVersion() {
        return situationRecordVersion;
    }

    /**
     * Imposta il valore della proprietà situationRecordVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSituationRecordVersion(BigInteger value) {
        this.situationRecordVersion = value;
    }

    /**
     * Recupera il valore della proprietà situationRecordVersionTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getSituationRecordVersionTime() {
        return situationRecordVersionTime;
    }

    /**
     * Imposta il valore della proprietà situationRecordVersionTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSituationRecordVersionTime(LocalDateTime value) {
        this.situationRecordVersionTime = value;
    }

    /**
     * Recupera il valore della proprietà situationRecordFirstSupplierVersionTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getSituationRecordFirstSupplierVersionTime() {
        return situationRecordFirstSupplierVersionTime;
    }

    /**
     * Imposta il valore della proprietà situationRecordFirstSupplierVersionTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSituationRecordFirstSupplierVersionTime(LocalDateTime value) {
        this.situationRecordFirstSupplierVersionTime = value;
    }

    /**
     * Recupera il valore della proprietà probabilityOfOccurrence.
     * 
     * @return
     *     possible object is
     *     {@link ProbabilityOfOccurrenceEnum }
     *     
     */
    public ProbabilityOfOccurrenceEnum getProbabilityOfOccurrence() {
        return probabilityOfOccurrence;
    }

    /**
     * Imposta il valore della proprietà probabilityOfOccurrence.
     * 
     * @param value
     *     allowed object is
     *     {@link ProbabilityOfOccurrenceEnum }
     *     
     */
    public void setProbabilityOfOccurrence(ProbabilityOfOccurrenceEnum value) {
        this.probabilityOfOccurrence = value;
    }

    /**
     * Recupera il valore della proprietà source.
     * 
     * @return
     *     possible object is
     *     {@link Source }
     *     
     */
    public Source getSource() {
        return source;
    }

    /**
     * Imposta il valore della proprietà source.
     * 
     * @param value
     *     allowed object is
     *     {@link Source }
     *     
     */
    public void setSource(Source value) {
        this.source = value;
    }

    /**
     * Recupera il valore della proprietà validity.
     * 
     * @return
     *     possible object is
     *     {@link Validity }
     *     
     */
    public Validity getValidity() {
        return validity;
    }

    /**
     * Imposta il valore della proprietà validity.
     * 
     * @param value
     *     allowed object is
     *     {@link Validity }
     *     
     */
    public void setValidity(Validity value) {
        this.validity = value;
    }

    /**
     * Recupera il valore della proprietà impact.
     * 
     * @return
     *     possible object is
     *     {@link Impact }
     *     
     */
    public Impact getImpact() {
        return impact;
    }

    /**
     * Imposta il valore della proprietà impact.
     * 
     * @param value
     *     allowed object is
     *     {@link Impact }
     *     
     */
    public void setImpact(Impact value) {
        this.impact = value;
    }

    /**
     * Recupera il valore della proprietà cause.
     * 
     * @return
     *     possible object is
     *     {@link Cause }
     *     
     */
    public Cause getCause() {
        return cause;
    }

    /**
     * Imposta il valore della proprietà cause.
     * 
     * @param value
     *     allowed object is
     *     {@link Cause }
     *     
     */
    public void setCause(Cause value) {
        this.cause = value;
    }

    /**
     * Gets the value of the generalPublicComment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the generalPublicComment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeneralPublicComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Comment }
     * 
     * 
     */
    public List<Comment> getGeneralPublicComment() {
        if (generalPublicComment == null) {
            generalPublicComment = new ArrayList<Comment>();
        }
        return this.generalPublicComment;
    }

    /**
     * Gets the value of the nonGeneralPublicComment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nonGeneralPublicComment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonGeneralPublicComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Comment }
     * 
     * 
     */
    public List<Comment> getNonGeneralPublicComment() {
        if (nonGeneralPublicComment == null) {
            nonGeneralPublicComment = new ArrayList<Comment>();
        }
        return this.nonGeneralPublicComment;
    }

    /**
     * Recupera il valore della proprietà groupOfLocations.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfLocations }
     *     
     */
    public GroupOfLocations getGroupOfLocations() {
        return groupOfLocations;
    }

    /**
     * Imposta il valore della proprietà groupOfLocations.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfLocations }
     *     
     */
    public void setGroupOfLocations(GroupOfLocations value) {
        this.groupOfLocations = value;
    }

    /**
     * Recupera il valore della proprietà management.
     * 
     * @return
     *     possible object is
     *     {@link Management }
     *     
     */
    public Management getManagement() {
        return management;
    }

    /**
     * Imposta il valore della proprietà management.
     * 
     * @param value
     *     allowed object is
     *     {@link Management }
     *     
     */
    public void setManagement(Management value) {
        this.management = value;
    }

    /**
     * Recupera il valore della proprietà situationRecordExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getSituationRecordExtension() {
        return situationRecordExtension;
    }

    /**
     * Imposta il valore della proprietà situationRecordExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setSituationRecordExtension(ExtensionType value) {
        this.situationRecordExtension = value;
    }

    /**
     * Recupera il valore della proprietà trafficElementExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTrafficElementExtension() {
        return trafficElementExtension;
    }

    /**
     * Imposta il valore della proprietà trafficElementExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTrafficElementExtension(ExtensionType value) {
        this.trafficElementExtension = value;
    }

    public OptionalTrafficElementStructure withSituationRecordCreationReference(String value) {
        setSituationRecordCreationReference(value);
        return this;
    }

    public OptionalTrafficElementStructure withSituationRecordCreationTime(LocalDateTime value) {
        setSituationRecordCreationTime(value);
        return this;
    }

    public OptionalTrafficElementStructure withSituationRecordObservationTime(LocalDateTime value) {
        setSituationRecordObservationTime(value);
        return this;
    }

    public OptionalTrafficElementStructure withSituationRecordVersion(BigInteger value) {
        setSituationRecordVersion(value);
        return this;
    }

    public OptionalTrafficElementStructure withSituationRecordVersionTime(LocalDateTime value) {
        setSituationRecordVersionTime(value);
        return this;
    }

    public OptionalTrafficElementStructure withSituationRecordFirstSupplierVersionTime(LocalDateTime value) {
        setSituationRecordFirstSupplierVersionTime(value);
        return this;
    }

    public OptionalTrafficElementStructure withProbabilityOfOccurrence(ProbabilityOfOccurrenceEnum value) {
        setProbabilityOfOccurrence(value);
        return this;
    }

    public OptionalTrafficElementStructure withSource(Source value) {
        setSource(value);
        return this;
    }

    public OptionalTrafficElementStructure withValidity(Validity value) {
        setValidity(value);
        return this;
    }

    public OptionalTrafficElementStructure withImpact(Impact value) {
        setImpact(value);
        return this;
    }

    public OptionalTrafficElementStructure withCause(Cause value) {
        setCause(value);
        return this;
    }

    public OptionalTrafficElementStructure withGeneralPublicComment(Comment... values) {
        if (values!= null) {
            for (Comment value: values) {
                getGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    public OptionalTrafficElementStructure withGeneralPublicComment(Collection<Comment> values) {
        if (values!= null) {
            getGeneralPublicComment().addAll(values);
        }
        return this;
    }

    public OptionalTrafficElementStructure withNonGeneralPublicComment(Comment... values) {
        if (values!= null) {
            for (Comment value: values) {
                getNonGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    public OptionalTrafficElementStructure withNonGeneralPublicComment(Collection<Comment> values) {
        if (values!= null) {
            getNonGeneralPublicComment().addAll(values);
        }
        return this;
    }

    public OptionalTrafficElementStructure withGroupOfLocations(GroupOfLocations value) {
        setGroupOfLocations(value);
        return this;
    }

    public OptionalTrafficElementStructure withManagement(Management value) {
        setManagement(value);
        return this;
    }

    public OptionalTrafficElementStructure withSituationRecordExtension(ExtensionType value) {
        setSituationRecordExtension(value);
        return this;
    }

    public OptionalTrafficElementStructure withTrafficElementExtension(ExtensionType value) {
        setTrafficElementExtension(value);
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

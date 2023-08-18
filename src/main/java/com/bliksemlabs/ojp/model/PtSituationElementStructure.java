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
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import eu.datex2.schema._2_0rc1._2_0.InformationStatusEnum;
import eu.datex2.schema._2_0rc1._2_0.ProbabilityOfOccurrenceEnum;
import eu.datex2.schema._2_0rc1._2_0.PublicEventTypeEnum;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import uk.org.ifopt.ifopt.CountryRefStructure;


/**
 * <p>Classe Java per PtSituationElementStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PtSituationElementStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}SituationElementStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}PtSituationBodyGroup"/&gt;
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
@XmlType(name = "PtSituationElementStructure", propOrder = {
    "verification",
    "progress",
    "qualityIndex",
    "reality",
    "likelihood",
    "publication",
    "validityPeriod",
    "repetitions",
    "publicationWindow",
    "unknownReason",
    "miscellaneousReason",
    "personnelReason",
    "equipmentReason",
    "environmentReason",
    "undefinedReason",
    "miscellaneousSubReason",
    "personnelSubReason",
    "equipmentSubReason",
    "environmentSubReason",
    "publicEventReason",
    "reasonName",
    "severity",
    "priority",
    "sensitivity",
    "audience",
    "scopeType",
    "reportType",
    "planned",
    "keywords",
    "secondaryReasons",
    "language",
    "summary",
    "description",
    "detail",
    "advice",
    "internal",
    "images",
    "infoLinks",
    "affects",
    "consequences",
    "publishingActions",
    "extensions"
})
public class PtSituationElementStructure
    extends SituationElementStructure
{

    @XmlElement(name = "Verification")
    protected VerificationStatusEnumeration verification;
    @XmlElement(name = "Progress", defaultValue = "open")
    @XmlSchemaType(name = "NMTOKEN")
    protected WorkflowStatusEnumeration progress;
    @XmlElement(name = "QualityIndex")
    @XmlSchemaType(name = "string")
    protected QualityEnumeration qualityIndex;
    @XmlElement(name = "Reality")
    @XmlSchemaType(name = "string")
    protected InformationStatusEnum reality;
    @XmlElement(name = "Likelihood")
    @XmlSchemaType(name = "string")
    protected ProbabilityOfOccurrenceEnum likelihood;
    @XmlElement(name = "Publication")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected List<String> publication;
    @XmlElement(name = "ValidityPeriod", required = true)
    protected List<HalfOpenTimestampOutputRangeStructure> validityPeriod;
    @XmlElement(name = "Repetitions")
    protected com.bliksemlabs.ojp.model.RoadSituationElementStructure.Repetitions repetitions;
    @XmlElement(name = "PublicationWindow")
    protected HalfOpenTimestampOutputRangeStructure publicationWindow;
    @XmlElement(name = "UnknownReason")
    protected String unknownReason;
    @XmlElement(name = "MiscellaneousReason")
    @XmlSchemaType(name = "NMTOKEN")
    protected MiscellaneousReasonEnumeration miscellaneousReason;
    @XmlElement(name = "PersonnelReason")
    @XmlSchemaType(name = "NMTOKEN")
    protected PersonnelReasonEnumeration personnelReason;
    @XmlElement(name = "EquipmentReason")
    @XmlSchemaType(name = "NMTOKEN")
    protected EquipmentReasonEnumeration equipmentReason;
    @XmlElement(name = "EnvironmentReason")
    @XmlSchemaType(name = "NMTOKEN")
    protected EnvironmentReasonEnumeration environmentReason;
    @XmlElement(name = "UndefinedReason")
    protected String undefinedReason;
    @XmlElement(name = "MiscellaneousSubReason")
    @XmlSchemaType(name = "NMTOKEN")
    protected MiscellaneousSubReasonEnumeration miscellaneousSubReason;
    @XmlElement(name = "PersonnelSubReason")
    @XmlSchemaType(name = "NMTOKEN")
    protected PersonnelSubReasonEnumeration personnelSubReason;
    @XmlElement(name = "EquipmentSubReason")
    @XmlSchemaType(name = "NMTOKEN")
    protected EquipmentSubReasonEnumeration equipmentSubReason;
    @XmlElement(name = "EnvironmentSubReason")
    @XmlSchemaType(name = "NMTOKEN")
    protected EnvironmentSubReasonEnumeration environmentSubReason;
    @XmlElement(name = "PublicEventReason")
    @XmlSchemaType(name = "string")
    protected PublicEventTypeEnum publicEventReason;
    @XmlElement(name = "ReasonName")
    protected List<NaturalLanguageStringStructure> reasonName;
    @XmlElement(name = "Severity", defaultValue = "normal")
    @XmlSchemaType(name = "NMTOKEN")
    protected SeverityEnumeration severity;
    @XmlElement(name = "Priority")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger priority;
    @XmlElement(name = "Sensitivity")
    @XmlSchemaType(name = "NMTOKEN")
    protected SensitivityEnumeration sensitivity;
    @XmlElement(name = "Audience", defaultValue = "public")
    @XmlSchemaType(name = "NMTOKEN")
    protected AudienceEnumeration audience;
    @XmlElement(name = "ScopeType")
    protected ScopeTypeEnumeration scopeType;
    @XmlElement(name = "ReportType", defaultValue = "unknown")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String reportType;
    @XmlElement(name = "Planned", defaultValue = "false")
    protected Boolean planned;
    @XmlList
    @XmlElement(name = "Keywords")
    @XmlSchemaType(name = "NMTOKENS")
    protected List<String> keywords;
    @XmlElement(name = "SecondaryReasons")
    protected com.bliksemlabs.ojp.model.RoadSituationElementStructure.SecondaryReasons secondaryReasons;
    @XmlElement(name = "Language", defaultValue = "en")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String language;
    @XmlElement(name = "Summary")
    protected List<DefaultedTextStructure> summary;
    @XmlElement(name = "Description")
    protected List<DefaultedTextStructure> description;
    @XmlElement(name = "Detail")
    protected List<DefaultedTextStructure> detail;
    @XmlElement(name = "Advice")
    protected List<DefaultedTextStructure> advice;
    @XmlElement(name = "Internal")
    protected DefaultedTextStructure internal;
    @XmlElement(name = "Images")
    protected com.bliksemlabs.ojp.model.RoadSituationElementStructure.Images images;
    @XmlElement(name = "InfoLinks")
    protected com.bliksemlabs.ojp.model.RoadSituationElementStructure.InfoLinks infoLinks;
    @XmlElement(name = "Affects")
    protected AffectsScopeStructure affects;
    @XmlElement(name = "Consequences")
    protected PtConsequencesStructure consequences;
    @XmlElement(name = "PublishingActions")
    protected ActionsStructure publishingActions;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Recupera il valore della proprietà verification.
     * 
     * @return
     *     possible object is
     *     {@link VerificationStatusEnumeration }
     *     
     */
    public VerificationStatusEnumeration getVerification() {
        return verification;
    }

    /**
     * Imposta il valore della proprietà verification.
     * 
     * @param value
     *     allowed object is
     *     {@link VerificationStatusEnumeration }
     *     
     */
    public void setVerification(VerificationStatusEnumeration value) {
        this.verification = value;
    }

    /**
     * Recupera il valore della proprietà progress.
     * 
     * @return
     *     possible object is
     *     {@link WorkflowStatusEnumeration }
     *     
     */
    public WorkflowStatusEnumeration getProgress() {
        return progress;
    }

    /**
     * Imposta il valore della proprietà progress.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkflowStatusEnumeration }
     *     
     */
    public void setProgress(WorkflowStatusEnumeration value) {
        this.progress = value;
    }

    /**
     * Recupera il valore della proprietà qualityIndex.
     * 
     * @return
     *     possible object is
     *     {@link QualityEnumeration }
     *     
     */
    public QualityEnumeration getQualityIndex() {
        return qualityIndex;
    }

    /**
     * Imposta il valore della proprietà qualityIndex.
     * 
     * @param value
     *     allowed object is
     *     {@link QualityEnumeration }
     *     
     */
    public void setQualityIndex(QualityEnumeration value) {
        this.qualityIndex = value;
    }

    /**
     * Recupera il valore della proprietà reality.
     * 
     * @return
     *     possible object is
     *     {@link InformationStatusEnum }
     *     
     */
    public InformationStatusEnum getReality() {
        return reality;
    }

    /**
     * Imposta il valore della proprietà reality.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationStatusEnum }
     *     
     */
    public void setReality(InformationStatusEnum value) {
        this.reality = value;
    }

    /**
     * Recupera il valore della proprietà likelihood.
     * 
     * @return
     *     possible object is
     *     {@link ProbabilityOfOccurrenceEnum }
     *     
     */
    public ProbabilityOfOccurrenceEnum getLikelihood() {
        return likelihood;
    }

    /**
     * Imposta il valore della proprietà likelihood.
     * 
     * @param value
     *     allowed object is
     *     {@link ProbabilityOfOccurrenceEnum }
     *     
     */
    public void setLikelihood(ProbabilityOfOccurrenceEnum value) {
        this.likelihood = value;
    }

    /**
     * Gets the value of the publication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPublication() {
        if (publication == null) {
            publication = new ArrayList<String>();
        }
        return this.publication;
    }

    /**
     * Gets the value of the validityPeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validityPeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidityPeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HalfOpenTimestampOutputRangeStructure }
     * 
     * 
     */
    public List<HalfOpenTimestampOutputRangeStructure> getValidityPeriod() {
        if (validityPeriod == null) {
            validityPeriod = new ArrayList<HalfOpenTimestampOutputRangeStructure>();
        }
        return this.validityPeriod;
    }

    /**
     * Recupera il valore della proprietà repetitions.
     * 
     * @return
     *     possible object is
     *     {@link com.bliksemlabs.ojp.model.RoadSituationElementStructure.Repetitions }
     *     
     */
    public com.bliksemlabs.ojp.model.RoadSituationElementStructure.Repetitions getRepetitions() {
        return repetitions;
    }

    /**
     * Imposta il valore della proprietà repetitions.
     * 
     * @param value
     *     allowed object is
     *     {@link com.bliksemlabs.ojp.model.RoadSituationElementStructure.Repetitions }
     *     
     */
    public void setRepetitions(com.bliksemlabs.ojp.model.RoadSituationElementStructure.Repetitions value) {
        this.repetitions = value;
    }

    /**
     * Recupera il valore della proprietà publicationWindow.
     * 
     * @return
     *     possible object is
     *     {@link HalfOpenTimestampOutputRangeStructure }
     *     
     */
    public HalfOpenTimestampOutputRangeStructure getPublicationWindow() {
        return publicationWindow;
    }

    /**
     * Imposta il valore della proprietà publicationWindow.
     * 
     * @param value
     *     allowed object is
     *     {@link HalfOpenTimestampOutputRangeStructure }
     *     
     */
    public void setPublicationWindow(HalfOpenTimestampOutputRangeStructure value) {
        this.publicationWindow = value;
    }

    /**
     * Recupera il valore della proprietà unknownReason.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnknownReason() {
        return unknownReason;
    }

    /**
     * Imposta il valore della proprietà unknownReason.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnknownReason(String value) {
        this.unknownReason = value;
    }

    /**
     * Recupera il valore della proprietà miscellaneousReason.
     * 
     * @return
     *     possible object is
     *     {@link MiscellaneousReasonEnumeration }
     *     
     */
    public MiscellaneousReasonEnumeration getMiscellaneousReason() {
        return miscellaneousReason;
    }

    /**
     * Imposta il valore della proprietà miscellaneousReason.
     * 
     * @param value
     *     allowed object is
     *     {@link MiscellaneousReasonEnumeration }
     *     
     */
    public void setMiscellaneousReason(MiscellaneousReasonEnumeration value) {
        this.miscellaneousReason = value;
    }

    /**
     * Recupera il valore della proprietà personnelReason.
     * 
     * @return
     *     possible object is
     *     {@link PersonnelReasonEnumeration }
     *     
     */
    public PersonnelReasonEnumeration getPersonnelReason() {
        return personnelReason;
    }

    /**
     * Imposta il valore della proprietà personnelReason.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonnelReasonEnumeration }
     *     
     */
    public void setPersonnelReason(PersonnelReasonEnumeration value) {
        this.personnelReason = value;
    }

    /**
     * Recupera il valore della proprietà equipmentReason.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentReasonEnumeration }
     *     
     */
    public EquipmentReasonEnumeration getEquipmentReason() {
        return equipmentReason;
    }

    /**
     * Imposta il valore della proprietà equipmentReason.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentReasonEnumeration }
     *     
     */
    public void setEquipmentReason(EquipmentReasonEnumeration value) {
        this.equipmentReason = value;
    }

    /**
     * Recupera il valore della proprietà environmentReason.
     * 
     * @return
     *     possible object is
     *     {@link EnvironmentReasonEnumeration }
     *     
     */
    public EnvironmentReasonEnumeration getEnvironmentReason() {
        return environmentReason;
    }

    /**
     * Imposta il valore della proprietà environmentReason.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvironmentReasonEnumeration }
     *     
     */
    public void setEnvironmentReason(EnvironmentReasonEnumeration value) {
        this.environmentReason = value;
    }

    /**
     * Recupera il valore della proprietà undefinedReason.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUndefinedReason() {
        return undefinedReason;
    }

    /**
     * Imposta il valore della proprietà undefinedReason.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUndefinedReason(String value) {
        this.undefinedReason = value;
    }

    /**
     * Recupera il valore della proprietà miscellaneousSubReason.
     * 
     * @return
     *     possible object is
     *     {@link MiscellaneousSubReasonEnumeration }
     *     
     */
    public MiscellaneousSubReasonEnumeration getMiscellaneousSubReason() {
        return miscellaneousSubReason;
    }

    /**
     * Imposta il valore della proprietà miscellaneousSubReason.
     * 
     * @param value
     *     allowed object is
     *     {@link MiscellaneousSubReasonEnumeration }
     *     
     */
    public void setMiscellaneousSubReason(MiscellaneousSubReasonEnumeration value) {
        this.miscellaneousSubReason = value;
    }

    /**
     * Recupera il valore della proprietà personnelSubReason.
     * 
     * @return
     *     possible object is
     *     {@link PersonnelSubReasonEnumeration }
     *     
     */
    public PersonnelSubReasonEnumeration getPersonnelSubReason() {
        return personnelSubReason;
    }

    /**
     * Imposta il valore della proprietà personnelSubReason.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonnelSubReasonEnumeration }
     *     
     */
    public void setPersonnelSubReason(PersonnelSubReasonEnumeration value) {
        this.personnelSubReason = value;
    }

    /**
     * Recupera il valore della proprietà equipmentSubReason.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentSubReasonEnumeration }
     *     
     */
    public EquipmentSubReasonEnumeration getEquipmentSubReason() {
        return equipmentSubReason;
    }

    /**
     * Imposta il valore della proprietà equipmentSubReason.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentSubReasonEnumeration }
     *     
     */
    public void setEquipmentSubReason(EquipmentSubReasonEnumeration value) {
        this.equipmentSubReason = value;
    }

    /**
     * Recupera il valore della proprietà environmentSubReason.
     * 
     * @return
     *     possible object is
     *     {@link EnvironmentSubReasonEnumeration }
     *     
     */
    public EnvironmentSubReasonEnumeration getEnvironmentSubReason() {
        return environmentSubReason;
    }

    /**
     * Imposta il valore della proprietà environmentSubReason.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvironmentSubReasonEnumeration }
     *     
     */
    public void setEnvironmentSubReason(EnvironmentSubReasonEnumeration value) {
        this.environmentSubReason = value;
    }

    /**
     * Recupera il valore della proprietà publicEventReason.
     * 
     * @return
     *     possible object is
     *     {@link PublicEventTypeEnum }
     *     
     */
    public PublicEventTypeEnum getPublicEventReason() {
        return publicEventReason;
    }

    /**
     * Imposta il valore della proprietà publicEventReason.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicEventTypeEnum }
     *     
     */
    public void setPublicEventReason(PublicEventTypeEnum value) {
        this.publicEventReason = value;
    }

    /**
     * Gets the value of the reasonName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reasonName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReasonName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getReasonName() {
        if (reasonName == null) {
            reasonName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.reasonName;
    }

    /**
     * Recupera il valore della proprietà severity.
     * 
     * @return
     *     possible object is
     *     {@link SeverityEnumeration }
     *     
     */
    public SeverityEnumeration getSeverity() {
        return severity;
    }

    /**
     * Imposta il valore della proprietà severity.
     * 
     * @param value
     *     allowed object is
     *     {@link SeverityEnumeration }
     *     
     */
    public void setSeverity(SeverityEnumeration value) {
        this.severity = value;
    }

    /**
     * Recupera il valore della proprietà priority.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPriority() {
        return priority;
    }

    /**
     * Imposta il valore della proprietà priority.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPriority(BigInteger value) {
        this.priority = value;
    }

    /**
     * Recupera il valore della proprietà sensitivity.
     * 
     * @return
     *     possible object is
     *     {@link SensitivityEnumeration }
     *     
     */
    public SensitivityEnumeration getSensitivity() {
        return sensitivity;
    }

    /**
     * Imposta il valore della proprietà sensitivity.
     * 
     * @param value
     *     allowed object is
     *     {@link SensitivityEnumeration }
     *     
     */
    public void setSensitivity(SensitivityEnumeration value) {
        this.sensitivity = value;
    }

    /**
     * Recupera il valore della proprietà audience.
     * 
     * @return
     *     possible object is
     *     {@link AudienceEnumeration }
     *     
     */
    public AudienceEnumeration getAudience() {
        return audience;
    }

    /**
     * Imposta il valore della proprietà audience.
     * 
     * @param value
     *     allowed object is
     *     {@link AudienceEnumeration }
     *     
     */
    public void setAudience(AudienceEnumeration value) {
        this.audience = value;
    }

    /**
     * Recupera il valore della proprietà scopeType.
     * 
     * @return
     *     possible object is
     *     {@link ScopeTypeEnumeration }
     *     
     */
    public ScopeTypeEnumeration getScopeType() {
        return scopeType;
    }

    /**
     * Imposta il valore della proprietà scopeType.
     * 
     * @param value
     *     allowed object is
     *     {@link ScopeTypeEnumeration }
     *     
     */
    public void setScopeType(ScopeTypeEnumeration value) {
        this.scopeType = value;
    }

    /**
     * Recupera il valore della proprietà reportType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportType() {
        return reportType;
    }

    /**
     * Imposta il valore della proprietà reportType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportType(String value) {
        this.reportType = value;
    }

    /**
     * Recupera il valore della proprietà planned.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlanned() {
        return planned;
    }

    /**
     * Imposta il valore della proprietà planned.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlanned(Boolean value) {
        this.planned = value;
    }

    /**
     * Gets the value of the keywords property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keywords property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeywords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getKeywords() {
        if (keywords == null) {
            keywords = new ArrayList<String>();
        }
        return this.keywords;
    }

    /**
     * Recupera il valore della proprietà secondaryReasons.
     * 
     * @return
     *     possible object is
     *     {@link com.bliksemlabs.ojp.model.RoadSituationElementStructure.SecondaryReasons }
     *     
     */
    public com.bliksemlabs.ojp.model.RoadSituationElementStructure.SecondaryReasons getSecondaryReasons() {
        return secondaryReasons;
    }

    /**
     * Imposta il valore della proprietà secondaryReasons.
     * 
     * @param value
     *     allowed object is
     *     {@link com.bliksemlabs.ojp.model.RoadSituationElementStructure.SecondaryReasons }
     *     
     */
    public void setSecondaryReasons(com.bliksemlabs.ojp.model.RoadSituationElementStructure.SecondaryReasons value) {
        this.secondaryReasons = value;
    }

    /**
     * Recupera il valore della proprietà language.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Imposta il valore della proprietà language.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the summary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the summary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DefaultedTextStructure }
     * 
     * 
     */
    public List<DefaultedTextStructure> getSummary() {
        if (summary == null) {
            summary = new ArrayList<DefaultedTextStructure>();
        }
        return this.summary;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DefaultedTextStructure }
     * 
     * 
     */
    public List<DefaultedTextStructure> getDescription() {
        if (description == null) {
            description = new ArrayList<DefaultedTextStructure>();
        }
        return this.description;
    }

    /**
     * Gets the value of the detail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DefaultedTextStructure }
     * 
     * 
     */
    public List<DefaultedTextStructure> getDetail() {
        if (detail == null) {
            detail = new ArrayList<DefaultedTextStructure>();
        }
        return this.detail;
    }

    /**
     * Gets the value of the advice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the advice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdvice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DefaultedTextStructure }
     * 
     * 
     */
    public List<DefaultedTextStructure> getAdvice() {
        if (advice == null) {
            advice = new ArrayList<DefaultedTextStructure>();
        }
        return this.advice;
    }

    /**
     * Recupera il valore della proprietà internal.
     * 
     * @return
     *     possible object is
     *     {@link DefaultedTextStructure }
     *     
     */
    public DefaultedTextStructure getInternal() {
        return internal;
    }

    /**
     * Imposta il valore della proprietà internal.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultedTextStructure }
     *     
     */
    public void setInternal(DefaultedTextStructure value) {
        this.internal = value;
    }

    /**
     * Recupera il valore della proprietà images.
     * 
     * @return
     *     possible object is
     *     {@link com.bliksemlabs.ojp.model.RoadSituationElementStructure.Images }
     *     
     */
    public com.bliksemlabs.ojp.model.RoadSituationElementStructure.Images getImages() {
        return images;
    }

    /**
     * Imposta il valore della proprietà images.
     * 
     * @param value
     *     allowed object is
     *     {@link com.bliksemlabs.ojp.model.RoadSituationElementStructure.Images }
     *     
     */
    public void setImages(com.bliksemlabs.ojp.model.RoadSituationElementStructure.Images value) {
        this.images = value;
    }

    /**
     * Recupera il valore della proprietà infoLinks.
     * 
     * @return
     *     possible object is
     *     {@link com.bliksemlabs.ojp.model.RoadSituationElementStructure.InfoLinks }
     *     
     */
    public com.bliksemlabs.ojp.model.RoadSituationElementStructure.InfoLinks getInfoLinks() {
        return infoLinks;
    }

    /**
     * Imposta il valore della proprietà infoLinks.
     * 
     * @param value
     *     allowed object is
     *     {@link com.bliksemlabs.ojp.model.RoadSituationElementStructure.InfoLinks }
     *     
     */
    public void setInfoLinks(com.bliksemlabs.ojp.model.RoadSituationElementStructure.InfoLinks value) {
        this.infoLinks = value;
    }

    /**
     * Recupera il valore della proprietà affects.
     * 
     * @return
     *     possible object is
     *     {@link AffectsScopeStructure }
     *     
     */
    public AffectsScopeStructure getAffects() {
        return affects;
    }

    /**
     * Imposta il valore della proprietà affects.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectsScopeStructure }
     *     
     */
    public void setAffects(AffectsScopeStructure value) {
        this.affects = value;
    }

    /**
     * Recupera il valore della proprietà consequences.
     * 
     * @return
     *     possible object is
     *     {@link PtConsequencesStructure }
     *     
     */
    public PtConsequencesStructure getConsequences() {
        return consequences;
    }

    /**
     * Imposta il valore della proprietà consequences.
     * 
     * @param value
     *     allowed object is
     *     {@link PtConsequencesStructure }
     *     
     */
    public void setConsequences(PtConsequencesStructure value) {
        this.consequences = value;
    }

    /**
     * Recupera il valore della proprietà publishingActions.
     * 
     * @return
     *     possible object is
     *     {@link ActionsStructure }
     *     
     */
    public ActionsStructure getPublishingActions() {
        return publishingActions;
    }

    /**
     * Imposta il valore della proprietà publishingActions.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionsStructure }
     *     
     */
    public void setPublishingActions(ActionsStructure value) {
        this.publishingActions = value;
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

    public PtSituationElementStructure withVerification(VerificationStatusEnumeration value) {
        setVerification(value);
        return this;
    }

    public PtSituationElementStructure withProgress(WorkflowStatusEnumeration value) {
        setProgress(value);
        return this;
    }

    public PtSituationElementStructure withQualityIndex(QualityEnumeration value) {
        setQualityIndex(value);
        return this;
    }

    public PtSituationElementStructure withReality(InformationStatusEnum value) {
        setReality(value);
        return this;
    }

    public PtSituationElementStructure withLikelihood(ProbabilityOfOccurrenceEnum value) {
        setLikelihood(value);
        return this;
    }

    public PtSituationElementStructure withPublication(String... values) {
        if (values!= null) {
            for (String value: values) {
                getPublication().add(value);
            }
        }
        return this;
    }

    public PtSituationElementStructure withPublication(Collection<String> values) {
        if (values!= null) {
            getPublication().addAll(values);
        }
        return this;
    }

    public PtSituationElementStructure withValidityPeriod(HalfOpenTimestampOutputRangeStructure... values) {
        if (values!= null) {
            for (HalfOpenTimestampOutputRangeStructure value: values) {
                getValidityPeriod().add(value);
            }
        }
        return this;
    }

    public PtSituationElementStructure withValidityPeriod(Collection<HalfOpenTimestampOutputRangeStructure> values) {
        if (values!= null) {
            getValidityPeriod().addAll(values);
        }
        return this;
    }

    public PtSituationElementStructure withRepetitions(com.bliksemlabs.ojp.model.RoadSituationElementStructure.Repetitions value) {
        setRepetitions(value);
        return this;
    }

    public PtSituationElementStructure withPublicationWindow(HalfOpenTimestampOutputRangeStructure value) {
        setPublicationWindow(value);
        return this;
    }

    public PtSituationElementStructure withUnknownReason(String value) {
        setUnknownReason(value);
        return this;
    }

    public PtSituationElementStructure withMiscellaneousReason(MiscellaneousReasonEnumeration value) {
        setMiscellaneousReason(value);
        return this;
    }

    public PtSituationElementStructure withPersonnelReason(PersonnelReasonEnumeration value) {
        setPersonnelReason(value);
        return this;
    }

    public PtSituationElementStructure withEquipmentReason(EquipmentReasonEnumeration value) {
        setEquipmentReason(value);
        return this;
    }

    public PtSituationElementStructure withEnvironmentReason(EnvironmentReasonEnumeration value) {
        setEnvironmentReason(value);
        return this;
    }

    public PtSituationElementStructure withUndefinedReason(String value) {
        setUndefinedReason(value);
        return this;
    }

    public PtSituationElementStructure withMiscellaneousSubReason(MiscellaneousSubReasonEnumeration value) {
        setMiscellaneousSubReason(value);
        return this;
    }

    public PtSituationElementStructure withPersonnelSubReason(PersonnelSubReasonEnumeration value) {
        setPersonnelSubReason(value);
        return this;
    }

    public PtSituationElementStructure withEquipmentSubReason(EquipmentSubReasonEnumeration value) {
        setEquipmentSubReason(value);
        return this;
    }

    public PtSituationElementStructure withEnvironmentSubReason(EnvironmentSubReasonEnumeration value) {
        setEnvironmentSubReason(value);
        return this;
    }

    public PtSituationElementStructure withPublicEventReason(PublicEventTypeEnum value) {
        setPublicEventReason(value);
        return this;
    }

    public PtSituationElementStructure withReasonName(NaturalLanguageStringStructure... values) {
        if (values!= null) {
            for (NaturalLanguageStringStructure value: values) {
                getReasonName().add(value);
            }
        }
        return this;
    }

    public PtSituationElementStructure withReasonName(Collection<NaturalLanguageStringStructure> values) {
        if (values!= null) {
            getReasonName().addAll(values);
        }
        return this;
    }

    public PtSituationElementStructure withSeverity(SeverityEnumeration value) {
        setSeverity(value);
        return this;
    }

    public PtSituationElementStructure withPriority(BigInteger value) {
        setPriority(value);
        return this;
    }

    public PtSituationElementStructure withSensitivity(SensitivityEnumeration value) {
        setSensitivity(value);
        return this;
    }

    public PtSituationElementStructure withAudience(AudienceEnumeration value) {
        setAudience(value);
        return this;
    }

    public PtSituationElementStructure withScopeType(ScopeTypeEnumeration value) {
        setScopeType(value);
        return this;
    }

    public PtSituationElementStructure withReportType(String value) {
        setReportType(value);
        return this;
    }

    public PtSituationElementStructure withPlanned(Boolean value) {
        setPlanned(value);
        return this;
    }

    public PtSituationElementStructure withKeywords(String... values) {
        if (values!= null) {
            for (String value: values) {
                getKeywords().add(value);
            }
        }
        return this;
    }

    public PtSituationElementStructure withKeywords(Collection<String> values) {
        if (values!= null) {
            getKeywords().addAll(values);
        }
        return this;
    }

    public PtSituationElementStructure withSecondaryReasons(com.bliksemlabs.ojp.model.RoadSituationElementStructure.SecondaryReasons value) {
        setSecondaryReasons(value);
        return this;
    }

    public PtSituationElementStructure withLanguage(String value) {
        setLanguage(value);
        return this;
    }

    public PtSituationElementStructure withSummary(DefaultedTextStructure... values) {
        if (values!= null) {
            for (DefaultedTextStructure value: values) {
                getSummary().add(value);
            }
        }
        return this;
    }

    public PtSituationElementStructure withSummary(Collection<DefaultedTextStructure> values) {
        if (values!= null) {
            getSummary().addAll(values);
        }
        return this;
    }

    public PtSituationElementStructure withDescription(DefaultedTextStructure... values) {
        if (values!= null) {
            for (DefaultedTextStructure value: values) {
                getDescription().add(value);
            }
        }
        return this;
    }

    public PtSituationElementStructure withDescription(Collection<DefaultedTextStructure> values) {
        if (values!= null) {
            getDescription().addAll(values);
        }
        return this;
    }

    public PtSituationElementStructure withDetail(DefaultedTextStructure... values) {
        if (values!= null) {
            for (DefaultedTextStructure value: values) {
                getDetail().add(value);
            }
        }
        return this;
    }

    public PtSituationElementStructure withDetail(Collection<DefaultedTextStructure> values) {
        if (values!= null) {
            getDetail().addAll(values);
        }
        return this;
    }

    public PtSituationElementStructure withAdvice(DefaultedTextStructure... values) {
        if (values!= null) {
            for (DefaultedTextStructure value: values) {
                getAdvice().add(value);
            }
        }
        return this;
    }

    public PtSituationElementStructure withAdvice(Collection<DefaultedTextStructure> values) {
        if (values!= null) {
            getAdvice().addAll(values);
        }
        return this;
    }

    public PtSituationElementStructure withInternal(DefaultedTextStructure value) {
        setInternal(value);
        return this;
    }

    public PtSituationElementStructure withImages(com.bliksemlabs.ojp.model.RoadSituationElementStructure.Images value) {
        setImages(value);
        return this;
    }

    public PtSituationElementStructure withInfoLinks(com.bliksemlabs.ojp.model.RoadSituationElementStructure.InfoLinks value) {
        setInfoLinks(value);
        return this;
    }

    public PtSituationElementStructure withAffects(AffectsScopeStructure value) {
        setAffects(value);
        return this;
    }

    public PtSituationElementStructure withConsequences(PtConsequencesStructure value) {
        setConsequences(value);
        return this;
    }

    public PtSituationElementStructure withPublishingActions(ActionsStructure value) {
        setPublishingActions(value);
        return this;
    }

    public PtSituationElementStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public PtSituationElementStructure withReferences(ReferencesStructure value) {
        setReferences(value);
        return this;
    }

    @Override
    public PtSituationElementStructure withSource(SituationSourceStructure value) {
        setSource(value);
        return this;
    }

    @Override
    public PtSituationElementStructure withVersionedAtTime(LocalDateTime value) {
        setVersionedAtTime(value);
        return this;
    }

    @Override
    public PtSituationElementStructure withCreationTime(LocalDateTime value) {
        setCreationTime(value);
        return this;
    }

    @Override
    public PtSituationElementStructure withCountryRef(CountryRefStructure value) {
        setCountryRef(value);
        return this;
    }

    @Override
    public PtSituationElementStructure withParticipantRef(ParticipantRefStructure value) {
        setParticipantRef(value);
        return this;
    }

    @Override
    public PtSituationElementStructure withSituationNumber(EntryQualifierStructure value) {
        setSituationNumber(value);
        return this;
    }

    @Override
    public PtSituationElementStructure withUpdateCountryRef(CountryRefStructure value) {
        setUpdateCountryRef(value);
        return this;
    }

    @Override
    public PtSituationElementStructure withUpdateParticipantRef(ParticipantRefStructure value) {
        setUpdateParticipantRef(value);
        return this;
    }

    @Override
    public PtSituationElementStructure withVersion(SituationVersion value) {
        setVersion(value);
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

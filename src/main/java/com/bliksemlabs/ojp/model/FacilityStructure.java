//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package com.bliksemlabs.ojp.model;

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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import uk.org.ifopt.acsb.AccessibilityAssessmentStructure;
import uk.org.ifopt.acsb.AccessibilityStructure;
import uk.org.ifopt.acsb.SuitabilityStructure;


/**
 * <p>Classe Java per FacilityStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="FacilityStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FacilityCode" type="{http://www.siri.org.uk/siri}FacilityCodeType" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FacilityClass" type="{http://www.siri.org.uk/siri}FacilityCategoryEnumeration" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Features" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Feature" type="{http://www.siri.org.uk/siri}AllFacilitiesFeatureStructure" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OwnerRef" type="{http://www.siri.org.uk/siri}OrganisationRefStructure" minOccurs="0"/&gt;
 *         &lt;element name="OwnerName" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" minOccurs="0"/&gt;
 *         &lt;element name="ValidityCondition" type="{http://www.siri.org.uk/siri}MonitoringValidityConditionStructure" minOccurs="0"/&gt;
 *         &lt;element name="FacilityLocation" type="{http://www.siri.org.uk/siri}FacilityLocationStructure" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}FacilityAccessibilityGroup"/&gt;
 *         &lt;element name="AccessibilityAssessment" type="{http://www.ifopt.org.uk/acsb}AccessibilityAssessmentStructure" minOccurs="0"/&gt;
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
@XmlType(name = "FacilityStructure", propOrder = {
    "facilityCode",
    "description",
    "facilityClass",
    "features",
    "ownerRef",
    "ownerName",
    "validityCondition",
    "facilityLocation",
    "limitations",
    "suitabilities",
    "accessibilityAssessment",
    "extensions"
})
public class FacilityStructure {

    @XmlElement(name = "FacilityCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String facilityCode;
    @XmlElement(name = "Description")
    protected List<NaturalLanguageStringStructure> description;
    @XmlElement(name = "FacilityClass")
    @XmlSchemaType(name = "NMTOKEN")
    protected List<FacilityCategoryEnumeration> facilityClass;
    @XmlElement(name = "Features")
    protected FacilityStructure.Features features;
    @XmlElement(name = "OwnerRef")
    protected OrganisationRefStructure ownerRef;
    @XmlElement(name = "OwnerName")
    protected NaturalLanguageStringStructure ownerName;
    @XmlElement(name = "ValidityCondition")
    protected MonitoringValidityConditionStructure validityCondition;
    @XmlElement(name = "FacilityLocation")
    protected FacilityLocationStructure facilityLocation;
    @XmlElement(name = "Limitations")
    protected FacilityStructure.Limitations limitations;
    @XmlElement(name = "Suitabilities")
    protected FacilityStructure.Suitabilities suitabilities;
    @XmlElement(name = "AccessibilityAssessment")
    protected AccessibilityAssessmentStructure accessibilityAssessment;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Recupera il valore della proprietà facilityCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityCode() {
        return facilityCode;
    }

    /**
     * Imposta il valore della proprietà facilityCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityCode(String value) {
        this.facilityCode = value;
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
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getDescription() {
        if (description == null) {
            description = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.description;
    }

    /**
     * Gets the value of the facilityClass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facilityClass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacilityClass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacilityCategoryEnumeration }
     * 
     * 
     */
    public List<FacilityCategoryEnumeration> getFacilityClass() {
        if (facilityClass == null) {
            facilityClass = new ArrayList<FacilityCategoryEnumeration>();
        }
        return this.facilityClass;
    }

    /**
     * Recupera il valore della proprietà features.
     * 
     * @return
     *     possible object is
     *     {@link FacilityStructure.Features }
     *     
     */
    public FacilityStructure.Features getFeatures() {
        return features;
    }

    /**
     * Imposta il valore della proprietà features.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityStructure.Features }
     *     
     */
    public void setFeatures(FacilityStructure.Features value) {
        this.features = value;
    }

    /**
     * Recupera il valore della proprietà ownerRef.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationRefStructure }
     *     
     */
    public OrganisationRefStructure getOwnerRef() {
        return ownerRef;
    }

    /**
     * Imposta il valore della proprietà ownerRef.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationRefStructure }
     *     
     */
    public void setOwnerRef(OrganisationRefStructure value) {
        this.ownerRef = value;
    }

    /**
     * Recupera il valore della proprietà ownerName.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getOwnerName() {
        return ownerName;
    }

    /**
     * Imposta il valore della proprietà ownerName.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setOwnerName(NaturalLanguageStringStructure value) {
        this.ownerName = value;
    }

    /**
     * Recupera il valore della proprietà validityCondition.
     * 
     * @return
     *     possible object is
     *     {@link MonitoringValidityConditionStructure }
     *     
     */
    public MonitoringValidityConditionStructure getValidityCondition() {
        return validityCondition;
    }

    /**
     * Imposta il valore della proprietà validityCondition.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitoringValidityConditionStructure }
     *     
     */
    public void setValidityCondition(MonitoringValidityConditionStructure value) {
        this.validityCondition = value;
    }

    /**
     * Recupera il valore della proprietà facilityLocation.
     * 
     * @return
     *     possible object is
     *     {@link FacilityLocationStructure }
     *     
     */
    public FacilityLocationStructure getFacilityLocation() {
        return facilityLocation;
    }

    /**
     * Imposta il valore della proprietà facilityLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityLocationStructure }
     *     
     */
    public void setFacilityLocation(FacilityLocationStructure value) {
        this.facilityLocation = value;
    }

    /**
     * Recupera il valore della proprietà limitations.
     * 
     * @return
     *     possible object is
     *     {@link FacilityStructure.Limitations }
     *     
     */
    public FacilityStructure.Limitations getLimitations() {
        return limitations;
    }

    /**
     * Imposta il valore della proprietà limitations.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityStructure.Limitations }
     *     
     */
    public void setLimitations(FacilityStructure.Limitations value) {
        this.limitations = value;
    }

    /**
     * Recupera il valore della proprietà suitabilities.
     * 
     * @return
     *     possible object is
     *     {@link FacilityStructure.Suitabilities }
     *     
     */
    public FacilityStructure.Suitabilities getSuitabilities() {
        return suitabilities;
    }

    /**
     * Imposta il valore della proprietà suitabilities.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityStructure.Suitabilities }
     *     
     */
    public void setSuitabilities(FacilityStructure.Suitabilities value) {
        this.suitabilities = value;
    }

    /**
     * Recupera il valore della proprietà accessibilityAssessment.
     * 
     * @return
     *     possible object is
     *     {@link AccessibilityAssessmentStructure }
     *     
     */
    public AccessibilityAssessmentStructure getAccessibilityAssessment() {
        return accessibilityAssessment;
    }

    /**
     * Imposta il valore della proprietà accessibilityAssessment.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessibilityAssessmentStructure }
     *     
     */
    public void setAccessibilityAssessment(AccessibilityAssessmentStructure value) {
        this.accessibilityAssessment = value;
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

    public FacilityStructure withFacilityCode(String value) {
        setFacilityCode(value);
        return this;
    }

    public FacilityStructure withDescription(NaturalLanguageStringStructure... values) {
        if (values!= null) {
            for (NaturalLanguageStringStructure value: values) {
                getDescription().add(value);
            }
        }
        return this;
    }

    public FacilityStructure withDescription(Collection<NaturalLanguageStringStructure> values) {
        if (values!= null) {
            getDescription().addAll(values);
        }
        return this;
    }

    public FacilityStructure withFacilityClass(FacilityCategoryEnumeration... values) {
        if (values!= null) {
            for (FacilityCategoryEnumeration value: values) {
                getFacilityClass().add(value);
            }
        }
        return this;
    }

    public FacilityStructure withFacilityClass(Collection<FacilityCategoryEnumeration> values) {
        if (values!= null) {
            getFacilityClass().addAll(values);
        }
        return this;
    }

    public FacilityStructure withFeatures(FacilityStructure.Features value) {
        setFeatures(value);
        return this;
    }

    public FacilityStructure withOwnerRef(OrganisationRefStructure value) {
        setOwnerRef(value);
        return this;
    }

    public FacilityStructure withOwnerName(NaturalLanguageStringStructure value) {
        setOwnerName(value);
        return this;
    }

    public FacilityStructure withValidityCondition(MonitoringValidityConditionStructure value) {
        setValidityCondition(value);
        return this;
    }

    public FacilityStructure withFacilityLocation(FacilityLocationStructure value) {
        setFacilityLocation(value);
        return this;
    }

    public FacilityStructure withLimitations(FacilityStructure.Limitations value) {
        setLimitations(value);
        return this;
    }

    public FacilityStructure withSuitabilities(FacilityStructure.Suitabilities value) {
        setSuitabilities(value);
        return this;
    }

    public FacilityStructure withAccessibilityAssessment(AccessibilityAssessmentStructure value) {
        setAccessibilityAssessment(value);
        return this;
    }

    public FacilityStructure withExtensions(ExtensionsStructure value) {
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
     *         &lt;element name="Feature" type="{http://www.siri.org.uk/siri}AllFacilitiesFeatureStructure" maxOccurs="unbounded"/&gt;
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
        "feature"
    })
    public static class Features {

        @XmlElement(name = "Feature", required = true)
        protected List<AllFacilitiesFeatureStructure> feature;

        /**
         * Gets the value of the feature property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the feature property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFeature().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AllFacilitiesFeatureStructure }
         * 
         * 
         */
        public List<AllFacilitiesFeatureStructure> getFeature() {
            if (feature == null) {
                feature = new ArrayList<AllFacilitiesFeatureStructure>();
            }
            return this.feature;
        }

        public FacilityStructure.Features withFeature(AllFacilitiesFeatureStructure... values) {
            if (values!= null) {
                for (AllFacilitiesFeatureStructure value: values) {
                    getFeature().add(value);
                }
            }
            return this;
        }

        public FacilityStructure.Features withFeature(Collection<AllFacilitiesFeatureStructure> values) {
            if (values!= null) {
                getFeature().addAll(values);
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
     *         &lt;group ref="{http://www.ifopt.org.uk/acsb}MobilityLimitationGroup"/&gt;
     *         &lt;group ref="{http://www.ifopt.org.uk/acsb}SensoryLimitationGroup"/&gt;
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
        "wheelchairAccess",
        "stepFreeAccess",
        "escalatorFreeAccess",
        "liftFreeAccess",
        "audibleSignalsAvailable",
        "visualSignsAvailable"
    })
    public static class Limitations {

        @XmlElement(name = "WheelchairAccess", namespace = "http://www.ifopt.org.uk/acsb", required = true, defaultValue = "false")
        protected AccessibilityStructure wheelchairAccess;
        @XmlElement(name = "StepFreeAccess", namespace = "http://www.ifopt.org.uk/acsb", defaultValue = "unknown")
        protected AccessibilityStructure stepFreeAccess;
        @XmlElement(name = "EscalatorFreeAccess", namespace = "http://www.ifopt.org.uk/acsb", defaultValue = "unknown")
        protected AccessibilityStructure escalatorFreeAccess;
        @XmlElement(name = "LiftFreeAccess", namespace = "http://www.ifopt.org.uk/acsb", defaultValue = "unknown")
        protected AccessibilityStructure liftFreeAccess;
        @XmlElement(name = "AudibleSignalsAvailable", namespace = "http://www.ifopt.org.uk/acsb", defaultValue = "false")
        protected AccessibilityStructure audibleSignalsAvailable;
        @XmlElement(name = "VisualSignsAvailable", namespace = "http://www.ifopt.org.uk/acsb", defaultValue = "unknown")
        protected AccessibilityStructure visualSignsAvailable;

        /**
         * Recupera il valore della proprietà wheelchairAccess.
         * 
         * @return
         *     possible object is
         *     {@link AccessibilityStructure }
         *     
         */
        public AccessibilityStructure getWheelchairAccess() {
            return wheelchairAccess;
        }

        /**
         * Imposta il valore della proprietà wheelchairAccess.
         * 
         * @param value
         *     allowed object is
         *     {@link AccessibilityStructure }
         *     
         */
        public void setWheelchairAccess(AccessibilityStructure value) {
            this.wheelchairAccess = value;
        }

        /**
         * Recupera il valore della proprietà stepFreeAccess.
         * 
         * @return
         *     possible object is
         *     {@link AccessibilityStructure }
         *     
         */
        public AccessibilityStructure getStepFreeAccess() {
            return stepFreeAccess;
        }

        /**
         * Imposta il valore della proprietà stepFreeAccess.
         * 
         * @param value
         *     allowed object is
         *     {@link AccessibilityStructure }
         *     
         */
        public void setStepFreeAccess(AccessibilityStructure value) {
            this.stepFreeAccess = value;
        }

        /**
         * Recupera il valore della proprietà escalatorFreeAccess.
         * 
         * @return
         *     possible object is
         *     {@link AccessibilityStructure }
         *     
         */
        public AccessibilityStructure getEscalatorFreeAccess() {
            return escalatorFreeAccess;
        }

        /**
         * Imposta il valore della proprietà escalatorFreeAccess.
         * 
         * @param value
         *     allowed object is
         *     {@link AccessibilityStructure }
         *     
         */
        public void setEscalatorFreeAccess(AccessibilityStructure value) {
            this.escalatorFreeAccess = value;
        }

        /**
         * Recupera il valore della proprietà liftFreeAccess.
         * 
         * @return
         *     possible object is
         *     {@link AccessibilityStructure }
         *     
         */
        public AccessibilityStructure getLiftFreeAccess() {
            return liftFreeAccess;
        }

        /**
         * Imposta il valore della proprietà liftFreeAccess.
         * 
         * @param value
         *     allowed object is
         *     {@link AccessibilityStructure }
         *     
         */
        public void setLiftFreeAccess(AccessibilityStructure value) {
            this.liftFreeAccess = value;
        }

        /**
         * Recupera il valore della proprietà audibleSignalsAvailable.
         * 
         * @return
         *     possible object is
         *     {@link AccessibilityStructure }
         *     
         */
        public AccessibilityStructure getAudibleSignalsAvailable() {
            return audibleSignalsAvailable;
        }

        /**
         * Imposta il valore della proprietà audibleSignalsAvailable.
         * 
         * @param value
         *     allowed object is
         *     {@link AccessibilityStructure }
         *     
         */
        public void setAudibleSignalsAvailable(AccessibilityStructure value) {
            this.audibleSignalsAvailable = value;
        }

        /**
         * Recupera il valore della proprietà visualSignsAvailable.
         * 
         * @return
         *     possible object is
         *     {@link AccessibilityStructure }
         *     
         */
        public AccessibilityStructure getVisualSignsAvailable() {
            return visualSignsAvailable;
        }

        /**
         * Imposta il valore della proprietà visualSignsAvailable.
         * 
         * @param value
         *     allowed object is
         *     {@link AccessibilityStructure }
         *     
         */
        public void setVisualSignsAvailable(AccessibilityStructure value) {
            this.visualSignsAvailable = value;
        }

        public FacilityStructure.Limitations withWheelchairAccess(AccessibilityStructure value) {
            setWheelchairAccess(value);
            return this;
        }

        public FacilityStructure.Limitations withStepFreeAccess(AccessibilityStructure value) {
            setStepFreeAccess(value);
            return this;
        }

        public FacilityStructure.Limitations withEscalatorFreeAccess(AccessibilityStructure value) {
            setEscalatorFreeAccess(value);
            return this;
        }

        public FacilityStructure.Limitations withLiftFreeAccess(AccessibilityStructure value) {
            setLiftFreeAccess(value);
            return this;
        }

        public FacilityStructure.Limitations withAudibleSignalsAvailable(AccessibilityStructure value) {
            setAudibleSignalsAvailable(value);
            return this;
        }

        public FacilityStructure.Limitations withVisualSignsAvailable(AccessibilityStructure value) {
            setVisualSignsAvailable(value);
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
     *         &lt;element name="Suitability" type="{http://www.ifopt.org.uk/acsb}SuitabilityStructure" maxOccurs="unbounded"/&gt;
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
        "suitability"
    })
    public static class Suitabilities {

        @XmlElement(name = "Suitability", required = true)
        protected List<SuitabilityStructure> suitability;

        /**
         * Gets the value of the suitability property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the suitability property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSuitability().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SuitabilityStructure }
         * 
         * 
         */
        public List<SuitabilityStructure> getSuitability() {
            if (suitability == null) {
                suitability = new ArrayList<SuitabilityStructure>();
            }
            return this.suitability;
        }

        public FacilityStructure.Suitabilities withSuitability(SuitabilityStructure... values) {
            if (values!= null) {
                for (SuitabilityStructure value: values) {
                    getSuitability().add(value);
                }
            }
            return this;
        }

        public FacilityStructure.Suitabilities withSuitability(Collection<SuitabilityStructure> values) {
            if (values!= null) {
                getSuitability().addAll(values);
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

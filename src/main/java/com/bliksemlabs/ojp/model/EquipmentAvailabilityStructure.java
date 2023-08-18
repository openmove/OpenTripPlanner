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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import uk.org.ifopt.ifopt.EquipmentRefStructure;
import uk.org.ifopt.ifopt.EquipmentStatusEnumeration;
import uk.org.ifopt.ifopt.EquipmentTypeRefStructure;


/**
 * <p>Classe Java per EquipmentAvailabilityStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="EquipmentAvailabilityStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EquipmentRef" type="{http://www.ifopt.org.uk/ifopt}EquipmentRefStructure" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentTypeRef" type="{http://www.ifopt.org.uk/ifopt}EquipmentTypeRefStructure" minOccurs="0"/&gt;
 *         &lt;element name="ValidityPeriod" type="{http://www.siri.org.uk/siri}HalfOpenTimestampOutputRangeStructure" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentStatus" type="{http://www.ifopt.org.uk/ifopt}EquipmentStatusEnumeration"/&gt;
 *         &lt;element name="EquipmentFeatures" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="FeatureRef" type="{http://www.siri.org.uk/siri}FeatureRefStructure" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
@XmlType(name = "EquipmentAvailabilityStructure", propOrder = {
    "equipmentRef",
    "description",
    "equipmentTypeRef",
    "validityPeriod",
    "equipmentStatus",
    "equipmentFeatures",
    "extensions"
})
public class EquipmentAvailabilityStructure {

    @XmlElement(name = "EquipmentRef")
    protected EquipmentRefStructure equipmentRef;
    @XmlElement(name = "Description")
    protected List<NaturalLanguageStringStructure> description;
    @XmlElement(name = "EquipmentTypeRef")
    protected EquipmentTypeRefStructure equipmentTypeRef;
    @XmlElement(name = "ValidityPeriod")
    protected HalfOpenTimestampOutputRangeStructure validityPeriod;
    @XmlElement(name = "EquipmentStatus", required = true, defaultValue = "notAvailable")
    @XmlSchemaType(name = "NMTOKEN")
    protected EquipmentStatusEnumeration equipmentStatus;
    @XmlElement(name = "EquipmentFeatures")
    protected EquipmentAvailabilityStructure.EquipmentFeatures equipmentFeatures;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Recupera il valore della proprietà equipmentRef.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentRefStructure }
     *     
     */
    public EquipmentRefStructure getEquipmentRef() {
        return equipmentRef;
    }

    /**
     * Imposta il valore della proprietà equipmentRef.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentRefStructure }
     *     
     */
    public void setEquipmentRef(EquipmentRefStructure value) {
        this.equipmentRef = value;
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
     * Recupera il valore della proprietà equipmentTypeRef.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentTypeRefStructure }
     *     
     */
    public EquipmentTypeRefStructure getEquipmentTypeRef() {
        return equipmentTypeRef;
    }

    /**
     * Imposta il valore della proprietà equipmentTypeRef.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentTypeRefStructure }
     *     
     */
    public void setEquipmentTypeRef(EquipmentTypeRefStructure value) {
        this.equipmentTypeRef = value;
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
     * Recupera il valore della proprietà equipmentStatus.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentStatusEnumeration }
     *     
     */
    public EquipmentStatusEnumeration getEquipmentStatus() {
        return equipmentStatus;
    }

    /**
     * Imposta il valore della proprietà equipmentStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentStatusEnumeration }
     *     
     */
    public void setEquipmentStatus(EquipmentStatusEnumeration value) {
        this.equipmentStatus = value;
    }

    /**
     * Recupera il valore della proprietà equipmentFeatures.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentAvailabilityStructure.EquipmentFeatures }
     *     
     */
    public EquipmentAvailabilityStructure.EquipmentFeatures getEquipmentFeatures() {
        return equipmentFeatures;
    }

    /**
     * Imposta il valore della proprietà equipmentFeatures.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentAvailabilityStructure.EquipmentFeatures }
     *     
     */
    public void setEquipmentFeatures(EquipmentAvailabilityStructure.EquipmentFeatures value) {
        this.equipmentFeatures = value;
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

    public EquipmentAvailabilityStructure withEquipmentRef(EquipmentRefStructure value) {
        setEquipmentRef(value);
        return this;
    }

    public EquipmentAvailabilityStructure withDescription(NaturalLanguageStringStructure... values) {
        if (values!= null) {
            for (NaturalLanguageStringStructure value: values) {
                getDescription().add(value);
            }
        }
        return this;
    }

    public EquipmentAvailabilityStructure withDescription(Collection<NaturalLanguageStringStructure> values) {
        if (values!= null) {
            getDescription().addAll(values);
        }
        return this;
    }

    public EquipmentAvailabilityStructure withEquipmentTypeRef(EquipmentTypeRefStructure value) {
        setEquipmentTypeRef(value);
        return this;
    }

    public EquipmentAvailabilityStructure withValidityPeriod(HalfOpenTimestampOutputRangeStructure value) {
        setValidityPeriod(value);
        return this;
    }

    public EquipmentAvailabilityStructure withEquipmentStatus(EquipmentStatusEnumeration value) {
        setEquipmentStatus(value);
        return this;
    }

    public EquipmentAvailabilityStructure withEquipmentFeatures(EquipmentAvailabilityStructure.EquipmentFeatures value) {
        setEquipmentFeatures(value);
        return this;
    }

    public EquipmentAvailabilityStructure withExtensions(ExtensionsStructure value) {
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
     *         &lt;element name="FeatureRef" type="{http://www.siri.org.uk/siri}FeatureRefStructure" maxOccurs="unbounded"/&gt;
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
        "featureRef"
    })
    public static class EquipmentFeatures {

        @XmlElement(name = "FeatureRef", required = true)
        protected List<FeatureRefStructure> featureRef;

        /**
         * Gets the value of the featureRef property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the featureRef property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFeatureRef().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FeatureRefStructure }
         * 
         * 
         */
        public List<FeatureRefStructure> getFeatureRef() {
            if (featureRef == null) {
                featureRef = new ArrayList<FeatureRefStructure>();
            }
            return this.featureRef;
        }

        public EquipmentAvailabilityStructure.EquipmentFeatures withFeatureRef(FeatureRefStructure... values) {
            if (values!= null) {
                for (FeatureRefStructure value: values) {
                    getFeatureRef().add(value);
                }
            }
            return this;
        }

        public EquipmentAvailabilityStructure.EquipmentFeatures withFeatureRef(Collection<FeatureRefStructure> values) {
            if (values!= null) {
                getFeatureRef().addAll(values);
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

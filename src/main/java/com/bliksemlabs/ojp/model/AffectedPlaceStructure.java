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


/**
 * <p>Classe Java per AffectedPlaceStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AffectedPlaceStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PlaceRef" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" minOccurs="0"/&gt;
 *         &lt;element name="PrivateCode" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" minOccurs="0"/&gt;
 *         &lt;element name="PlaceName" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Location" type="{http://www.siri.org.uk/siri}LocationStructure" minOccurs="0"/&gt;
 *         &lt;element name="PlaceCategory" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentRef" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "AffectedPlaceStructure", propOrder = {
    "placeRef",
    "privateCode",
    "placeName",
    "location",
    "placeCategory",
    "equipmentRef",
    "accessibilityAssessment",
    "extensions"
})
public class AffectedPlaceStructure {

    @XmlElement(name = "PlaceRef")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String placeRef;
    @XmlElement(name = "PrivateCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String privateCode;
    @XmlElement(name = "PlaceName")
    protected List<NaturalLanguageStringStructure> placeName;
    @XmlElement(name = "Location")
    protected LocationStructure location;
    @XmlElement(name = "PlaceCategory")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String placeCategory;
    @XmlElement(name = "EquipmentRef")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected List<String> equipmentRef;
    @XmlElement(name = "AccessibilityAssessment")
    protected AccessibilityAssessmentStructure accessibilityAssessment;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Recupera il valore della proprietà placeRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceRef() {
        return placeRef;
    }

    /**
     * Imposta il valore della proprietà placeRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceRef(String value) {
        this.placeRef = value;
    }

    /**
     * Recupera il valore della proprietà privateCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivateCode() {
        return privateCode;
    }

    /**
     * Imposta il valore della proprietà privateCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivateCode(String value) {
        this.privateCode = value;
    }

    /**
     * Gets the value of the placeName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the placeName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlaceName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getPlaceName() {
        if (placeName == null) {
            placeName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.placeName;
    }

    /**
     * Recupera il valore della proprietà location.
     * 
     * @return
     *     possible object is
     *     {@link LocationStructure }
     *     
     */
    public LocationStructure getLocation() {
        return location;
    }

    /**
     * Imposta il valore della proprietà location.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationStructure }
     *     
     */
    public void setLocation(LocationStructure value) {
        this.location = value;
    }

    /**
     * Recupera il valore della proprietà placeCategory.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceCategory() {
        return placeCategory;
    }

    /**
     * Imposta il valore della proprietà placeCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceCategory(String value) {
        this.placeCategory = value;
    }

    /**
     * Gets the value of the equipmentRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipmentRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipmentRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEquipmentRef() {
        if (equipmentRef == null) {
            equipmentRef = new ArrayList<String>();
        }
        return this.equipmentRef;
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

    public AffectedPlaceStructure withPlaceRef(String value) {
        setPlaceRef(value);
        return this;
    }

    public AffectedPlaceStructure withPrivateCode(String value) {
        setPrivateCode(value);
        return this;
    }

    public AffectedPlaceStructure withPlaceName(NaturalLanguageStringStructure... values) {
        if (values!= null) {
            for (NaturalLanguageStringStructure value: values) {
                getPlaceName().add(value);
            }
        }
        return this;
    }

    public AffectedPlaceStructure withPlaceName(Collection<NaturalLanguageStringStructure> values) {
        if (values!= null) {
            getPlaceName().addAll(values);
        }
        return this;
    }

    public AffectedPlaceStructure withLocation(LocationStructure value) {
        setLocation(value);
        return this;
    }

    public AffectedPlaceStructure withPlaceCategory(String value) {
        setPlaceCategory(value);
        return this;
    }

    public AffectedPlaceStructure withEquipmentRef(String... values) {
        if (values!= null) {
            for (String value: values) {
                getEquipmentRef().add(value);
            }
        }
        return this;
    }

    public AffectedPlaceStructure withEquipmentRef(Collection<String> values) {
        if (values!= null) {
            getEquipmentRef().addAll(values);
        }
        return this;
    }

    public AffectedPlaceStructure withAccessibilityAssessment(AccessibilityAssessmentStructure value) {
        setAccessibilityAssessment(value);
        return this;
    }

    public AffectedPlaceStructure withExtensions(ExtensionsStructure value) {
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

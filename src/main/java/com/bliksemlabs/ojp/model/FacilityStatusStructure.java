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
import uk.org.ifopt.acsb.AccessibilityAssessmentStructure;


/**
 * <p>Classe Java per FacilityStatusStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="FacilityStatusStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" type="{http://www.siri.org.uk/siri}FacilityStatusEnumeration"/&gt;
 *         &lt;element name="Description" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "FacilityStatusStructure", propOrder = {
    "status",
    "description",
    "accessibilityAssessment",
    "extensions"
})
public class FacilityStatusStructure {

    @XmlElement(name = "Status", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected FacilityStatusEnumeration status;
    @XmlElement(name = "Description")
    protected List<NaturalLanguageStringStructure> description;
    @XmlElement(name = "AccessibilityAssessment")
    protected AccessibilityAssessmentStructure accessibilityAssessment;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Recupera il valore della proprietà status.
     * 
     * @return
     *     possible object is
     *     {@link FacilityStatusEnumeration }
     *     
     */
    public FacilityStatusEnumeration getStatus() {
        return status;
    }

    /**
     * Imposta il valore della proprietà status.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityStatusEnumeration }
     *     
     */
    public void setStatus(FacilityStatusEnumeration value) {
        this.status = value;
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

    public FacilityStatusStructure withStatus(FacilityStatusEnumeration value) {
        setStatus(value);
        return this;
    }

    public FacilityStatusStructure withDescription(NaturalLanguageStringStructure... values) {
        if (values!= null) {
            for (NaturalLanguageStringStructure value: values) {
                getDescription().add(value);
            }
        }
        return this;
    }

    public FacilityStatusStructure withDescription(Collection<NaturalLanguageStringStructure> values) {
        if (values!= null) {
            getDescription().addAll(values);
        }
        return this;
    }

    public FacilityStatusStructure withAccessibilityAssessment(AccessibilityAssessmentStructure value) {
        setAccessibilityAssessment(value);
        return this;
    }

    public FacilityStatusStructure withExtensions(ExtensionsStructure value) {
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

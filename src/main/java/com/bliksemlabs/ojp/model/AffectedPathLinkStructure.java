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
import uk.org.ifopt.ifopt.AccessibilityFeatureEnumeration;
import uk.org.ifopt.ifopt.LinkProjectionStructure;


/**
 * <p>Classe Java per AffectedPathLinkStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AffectedPathLinkStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LinkRef" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LinkName" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AccessibilityFeature" type="{http://www.ifopt.org.uk/ifopt}AccessibilityFeatureEnumeration" minOccurs="0"/&gt;
 *         &lt;element name="LinkDirection" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}ProjectionGroup"/&gt;
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
@XmlType(name = "AffectedPathLinkStructure", propOrder = {
    "linkRef",
    "linkName",
    "accessibilityFeature",
    "linkDirection",
    "linkProjection",
    "offset",
    "extensions"
})
public class AffectedPathLinkStructure {

    @XmlElement(name = "LinkRef")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected List<String> linkRef;
    @XmlElement(name = "LinkName")
    protected List<NaturalLanguageStringStructure> linkName;
    @XmlElement(name = "AccessibilityFeature")
    @XmlSchemaType(name = "string")
    protected AccessibilityFeatureEnumeration accessibilityFeature;
    @XmlElement(name = "LinkDirection")
    protected List<String> linkDirection;
    @XmlElement(name = "LinkProjection")
    protected LinkProjectionStructure linkProjection;
    @XmlElement(name = "Offset")
    protected OffsetStructure offset;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Gets the value of the linkRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinkRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLinkRef() {
        if (linkRef == null) {
            linkRef = new ArrayList<String>();
        }
        return this.linkRef;
    }

    /**
     * Gets the value of the linkName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinkName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getLinkName() {
        if (linkName == null) {
            linkName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.linkName;
    }

    /**
     * Recupera il valore della proprietà accessibilityFeature.
     * 
     * @return
     *     possible object is
     *     {@link AccessibilityFeatureEnumeration }
     *     
     */
    public AccessibilityFeatureEnumeration getAccessibilityFeature() {
        return accessibilityFeature;
    }

    /**
     * Imposta il valore della proprietà accessibilityFeature.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessibilityFeatureEnumeration }
     *     
     */
    public void setAccessibilityFeature(AccessibilityFeatureEnumeration value) {
        this.accessibilityFeature = value;
    }

    /**
     * Gets the value of the linkDirection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkDirection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinkDirection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLinkDirection() {
        if (linkDirection == null) {
            linkDirection = new ArrayList<String>();
        }
        return this.linkDirection;
    }

    /**
     * Recupera il valore della proprietà linkProjection.
     * 
     * @return
     *     possible object is
     *     {@link LinkProjectionStructure }
     *     
     */
    public LinkProjectionStructure getLinkProjection() {
        return linkProjection;
    }

    /**
     * Imposta il valore della proprietà linkProjection.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkProjectionStructure }
     *     
     */
    public void setLinkProjection(LinkProjectionStructure value) {
        this.linkProjection = value;
    }

    /**
     * Recupera il valore della proprietà offset.
     * 
     * @return
     *     possible object is
     *     {@link OffsetStructure }
     *     
     */
    public OffsetStructure getOffset() {
        return offset;
    }

    /**
     * Imposta il valore della proprietà offset.
     * 
     * @param value
     *     allowed object is
     *     {@link OffsetStructure }
     *     
     */
    public void setOffset(OffsetStructure value) {
        this.offset = value;
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

    public AffectedPathLinkStructure withLinkRef(String... values) {
        if (values!= null) {
            for (String value: values) {
                getLinkRef().add(value);
            }
        }
        return this;
    }

    public AffectedPathLinkStructure withLinkRef(Collection<String> values) {
        if (values!= null) {
            getLinkRef().addAll(values);
        }
        return this;
    }

    public AffectedPathLinkStructure withLinkName(NaturalLanguageStringStructure... values) {
        if (values!= null) {
            for (NaturalLanguageStringStructure value: values) {
                getLinkName().add(value);
            }
        }
        return this;
    }

    public AffectedPathLinkStructure withLinkName(Collection<NaturalLanguageStringStructure> values) {
        if (values!= null) {
            getLinkName().addAll(values);
        }
        return this;
    }

    public AffectedPathLinkStructure withAccessibilityFeature(AccessibilityFeatureEnumeration value) {
        setAccessibilityFeature(value);
        return this;
    }

    public AffectedPathLinkStructure withLinkDirection(String... values) {
        if (values!= null) {
            for (String value: values) {
                getLinkDirection().add(value);
            }
        }
        return this;
    }

    public AffectedPathLinkStructure withLinkDirection(Collection<String> values) {
        if (values!= null) {
            getLinkDirection().addAll(values);
        }
        return this;
    }

    public AffectedPathLinkStructure withLinkProjection(LinkProjectionStructure value) {
        setLinkProjection(value);
        return this;
    }

    public AffectedPathLinkStructure withOffset(OffsetStructure value) {
        setOffset(value);
        return this;
    }

    public AffectedPathLinkStructure withExtensions(ExtensionsStructure value) {
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

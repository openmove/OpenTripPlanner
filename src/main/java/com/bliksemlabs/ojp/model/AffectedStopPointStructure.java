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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import uk.org.ifopt.acsb.AccessibilityAssessmentStructure;


/**
 * <p>Classe Java per AffectedStopPointStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AffectedStopPointStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}StopPointRef" minOccurs="0"/&gt;
 *         &lt;element name="PrivateRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StopPointName" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="StopPointType" type="{http://www.siri.org.uk/siri}StopPointTypeEnumeration" minOccurs="0"/&gt;
 *         &lt;element name="Location" type="{http://www.siri.org.uk/siri}LocationStructure" minOccurs="0"/&gt;
 *         &lt;element name="AffectedModes" type="{http://www.siri.org.uk/siri}AffectedModesStructure" minOccurs="0"/&gt;
 *         &lt;element name="PlaceRef" type="{http://www.siri.org.uk/siri}ZoneRefStructure" minOccurs="0"/&gt;
 *         &lt;element name="PlaceName" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AccessibilityAssessment" type="{http://www.ifopt.org.uk/acsb}AccessibilityAssessmentStructure" minOccurs="0"/&gt;
 *         &lt;element name="StopCondition" type="{http://www.siri.org.uk/siri}RoutePointTypeEnumeration" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ConnectionLinks" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AffectedConnectionLink" type="{http://www.siri.org.uk/siri}AffectedConnectionLinkStructure" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "AffectedStopPointStructure", propOrder = {
    "stopPointRef",
    "privateRef",
    "stopPointName",
    "stopPointType",
    "location",
    "affectedModes",
    "placeRef",
    "placeName",
    "accessibilityAssessment",
    "stopCondition",
    "connectionLinks",
    "extensions"
})
@XmlSeeAlso({
    AffectedCallStructure.class
})
public class AffectedStopPointStructure {

    @XmlElement(name = "StopPointRef")
    protected StopPointRefStructure stopPointRef;
    @XmlElement(name = "PrivateRef")
    protected String privateRef;
    @XmlElement(name = "StopPointName")
    protected List<NaturalLanguageStringStructure> stopPointName;
    @XmlElement(name = "StopPointType")
    @XmlSchemaType(name = "NMTOKEN")
    protected StopPointTypeEnumeration stopPointType;
    @XmlElement(name = "Location")
    protected LocationStructure location;
    @XmlElement(name = "AffectedModes")
    protected AffectedModesStructure affectedModes;
    @XmlElement(name = "PlaceRef")
    protected ZoneRefStructure placeRef;
    @XmlElement(name = "PlaceName")
    protected List<NaturalLanguageStringStructure> placeName;
    @XmlElement(name = "AccessibilityAssessment")
    protected AccessibilityAssessmentStructure accessibilityAssessment;
    @XmlElement(name = "StopCondition")
    @XmlSchemaType(name = "NMTOKEN")
    protected List<RoutePointTypeEnumeration> stopCondition;
    @XmlElement(name = "ConnectionLinks")
    protected AffectedStopPointStructure.ConnectionLinks connectionLinks;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Recupera il valore della proprietà stopPointRef.
     * 
     * @return
     *     possible object is
     *     {@link StopPointRefStructure }
     *     
     */
    public StopPointRefStructure getStopPointRef() {
        return stopPointRef;
    }

    /**
     * Imposta il valore della proprietà stopPointRef.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointRefStructure }
     *     
     */
    public void setStopPointRef(StopPointRefStructure value) {
        this.stopPointRef = value;
    }

    /**
     * Recupera il valore della proprietà privateRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivateRef() {
        return privateRef;
    }

    /**
     * Imposta il valore della proprietà privateRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivateRef(String value) {
        this.privateRef = value;
    }

    /**
     * Gets the value of the stopPointName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stopPointName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStopPointName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getStopPointName() {
        if (stopPointName == null) {
            stopPointName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.stopPointName;
    }

    /**
     * Recupera il valore della proprietà stopPointType.
     * 
     * @return
     *     possible object is
     *     {@link StopPointTypeEnumeration }
     *     
     */
    public StopPointTypeEnumeration getStopPointType() {
        return stopPointType;
    }

    /**
     * Imposta il valore della proprietà stopPointType.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointTypeEnumeration }
     *     
     */
    public void setStopPointType(StopPointTypeEnumeration value) {
        this.stopPointType = value;
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
     * Recupera il valore della proprietà affectedModes.
     * 
     * @return
     *     possible object is
     *     {@link AffectedModesStructure }
     *     
     */
    public AffectedModesStructure getAffectedModes() {
        return affectedModes;
    }

    /**
     * Imposta il valore della proprietà affectedModes.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectedModesStructure }
     *     
     */
    public void setAffectedModes(AffectedModesStructure value) {
        this.affectedModes = value;
    }

    /**
     * Recupera il valore della proprietà placeRef.
     * 
     * @return
     *     possible object is
     *     {@link ZoneRefStructure }
     *     
     */
    public ZoneRefStructure getPlaceRef() {
        return placeRef;
    }

    /**
     * Imposta il valore della proprietà placeRef.
     * 
     * @param value
     *     allowed object is
     *     {@link ZoneRefStructure }
     *     
     */
    public void setPlaceRef(ZoneRefStructure value) {
        this.placeRef = value;
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
     * Gets the value of the stopCondition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stopCondition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStopCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoutePointTypeEnumeration }
     * 
     * 
     */
    public List<RoutePointTypeEnumeration> getStopCondition() {
        if (stopCondition == null) {
            stopCondition = new ArrayList<RoutePointTypeEnumeration>();
        }
        return this.stopCondition;
    }

    /**
     * Recupera il valore della proprietà connectionLinks.
     * 
     * @return
     *     possible object is
     *     {@link AffectedStopPointStructure.ConnectionLinks }
     *     
     */
    public AffectedStopPointStructure.ConnectionLinks getConnectionLinks() {
        return connectionLinks;
    }

    /**
     * Imposta il valore della proprietà connectionLinks.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectedStopPointStructure.ConnectionLinks }
     *     
     */
    public void setConnectionLinks(AffectedStopPointStructure.ConnectionLinks value) {
        this.connectionLinks = value;
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

    public AffectedStopPointStructure withStopPointRef(StopPointRefStructure value) {
        setStopPointRef(value);
        return this;
    }

    public AffectedStopPointStructure withPrivateRef(String value) {
        setPrivateRef(value);
        return this;
    }

    public AffectedStopPointStructure withStopPointName(NaturalLanguageStringStructure... values) {
        if (values!= null) {
            for (NaturalLanguageStringStructure value: values) {
                getStopPointName().add(value);
            }
        }
        return this;
    }

    public AffectedStopPointStructure withStopPointName(Collection<NaturalLanguageStringStructure> values) {
        if (values!= null) {
            getStopPointName().addAll(values);
        }
        return this;
    }

    public AffectedStopPointStructure withStopPointType(StopPointTypeEnumeration value) {
        setStopPointType(value);
        return this;
    }

    public AffectedStopPointStructure withLocation(LocationStructure value) {
        setLocation(value);
        return this;
    }

    public AffectedStopPointStructure withAffectedModes(AffectedModesStructure value) {
        setAffectedModes(value);
        return this;
    }

    public AffectedStopPointStructure withPlaceRef(ZoneRefStructure value) {
        setPlaceRef(value);
        return this;
    }

    public AffectedStopPointStructure withPlaceName(NaturalLanguageStringStructure... values) {
        if (values!= null) {
            for (NaturalLanguageStringStructure value: values) {
                getPlaceName().add(value);
            }
        }
        return this;
    }

    public AffectedStopPointStructure withPlaceName(Collection<NaturalLanguageStringStructure> values) {
        if (values!= null) {
            getPlaceName().addAll(values);
        }
        return this;
    }

    public AffectedStopPointStructure withAccessibilityAssessment(AccessibilityAssessmentStructure value) {
        setAccessibilityAssessment(value);
        return this;
    }

    public AffectedStopPointStructure withStopCondition(RoutePointTypeEnumeration... values) {
        if (values!= null) {
            for (RoutePointTypeEnumeration value: values) {
                getStopCondition().add(value);
            }
        }
        return this;
    }

    public AffectedStopPointStructure withStopCondition(Collection<RoutePointTypeEnumeration> values) {
        if (values!= null) {
            getStopCondition().addAll(values);
        }
        return this;
    }

    public AffectedStopPointStructure withConnectionLinks(AffectedStopPointStructure.ConnectionLinks value) {
        setConnectionLinks(value);
        return this;
    }

    public AffectedStopPointStructure withExtensions(ExtensionsStructure value) {
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
     *         &lt;element name="AffectedConnectionLink" type="{http://www.siri.org.uk/siri}AffectedConnectionLinkStructure" maxOccurs="unbounded"/&gt;
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
        "affectedConnectionLink"
    })
    public static class ConnectionLinks {

        @XmlElement(name = "AffectedConnectionLink", required = true)
        protected List<AffectedConnectionLinkStructure> affectedConnectionLink;

        /**
         * Gets the value of the affectedConnectionLink property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the affectedConnectionLink property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAffectedConnectionLink().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AffectedConnectionLinkStructure }
         * 
         * 
         */
        public List<AffectedConnectionLinkStructure> getAffectedConnectionLink() {
            if (affectedConnectionLink == null) {
                affectedConnectionLink = new ArrayList<AffectedConnectionLinkStructure>();
            }
            return this.affectedConnectionLink;
        }

        public AffectedStopPointStructure.ConnectionLinks withAffectedConnectionLink(AffectedConnectionLinkStructure... values) {
            if (values!= null) {
                for (AffectedConnectionLinkStructure value: values) {
                    getAffectedConnectionLink().add(value);
                }
            }
            return this;
        }

        public AffectedStopPointStructure.ConnectionLinks withAffectedConnectionLink(Collection<AffectedConnectionLinkStructure> values) {
            if (values!= null) {
                getAffectedConnectionLink().addAll(values);
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

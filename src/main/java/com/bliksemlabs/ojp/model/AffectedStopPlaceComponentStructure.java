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
import uk.org.ifopt.ifopt.AccessibilityFeatureEnumeration;
import uk.org.ifopt.ifopt.LinkProjectionStructure;
import uk.org.ifopt.ifopt.PointProjectionStructure;
import uk.org.ifopt.ifopt.StopPlaceComponentRefStructure;
import uk.org.ifopt.ifopt.StopPlaceComponentTypeEnumeration;
import uk.org.ifopt.ifopt.ZoneProjectionStructure;


/**
 * <p>Classe Java per AffectedStopPlaceComponentStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AffectedStopPlaceComponentStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}AffectedStopPlaceElementStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ComponentRef" type="{http://www.ifopt.org.uk/ifopt}StopPlaceComponentRefStructure"/&gt;
 *         &lt;element name="ComponentName" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ComponentType" type="{http://www.ifopt.org.uk/ifopt}StopPlaceComponentTypeEnumeration" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.ifopt.org.uk/ifopt}PlaceProjectionGroup" minOccurs="0"/&gt;
 *         &lt;element name="Offset" type="{http://www.siri.org.uk/siri}OffsetStructure" minOccurs="0"/&gt;
 *         &lt;element name="AccessFeatureType" type="{http://www.ifopt.org.uk/ifopt}AccessibilityFeatureEnumeration" minOccurs="0"/&gt;
 *         &lt;element name="AffectedFacilities" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AffectedFacility" type="{http://www.siri.org.uk/siri}AffectedFacilityStructure" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
@XmlType(name = "AffectedStopPlaceComponentStructure", propOrder = {
    "componentRef",
    "componentName",
    "componentType",
    "pointProjection",
    "linkProjection",
    "zoneProjection",
    "offset",
    "accessFeatureType",
    "affectedFacilities",
    "extensions"
})
public class AffectedStopPlaceComponentStructure
    extends AffectedStopPlaceElementStructure
{

    @XmlElement(name = "ComponentRef", required = true)
    protected StopPlaceComponentRefStructure componentRef;
    @XmlElement(name = "ComponentName")
    protected List<NaturalLanguageStringStructure> componentName;
    @XmlElement(name = "ComponentType")
    @XmlSchemaType(name = "string")
    protected StopPlaceComponentTypeEnumeration componentType;
    @XmlElement(name = "PointProjection", namespace = "http://www.ifopt.org.uk/ifopt")
    protected PointProjectionStructure pointProjection;
    @XmlElement(name = "LinkProjection", namespace = "http://www.ifopt.org.uk/ifopt")
    protected LinkProjectionStructure linkProjection;
    @XmlElement(name = "ZoneProjection", namespace = "http://www.ifopt.org.uk/ifopt")
    protected ZoneProjectionStructure zoneProjection;
    @XmlElement(name = "Offset")
    protected OffsetStructure offset;
    @XmlElement(name = "AccessFeatureType")
    @XmlSchemaType(name = "string")
    protected AccessibilityFeatureEnumeration accessFeatureType;
    @XmlElement(name = "AffectedFacilities")
    protected AffectedStopPlaceComponentStructure.AffectedFacilities affectedFacilities;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Recupera il valore della proprietà componentRef.
     * 
     * @return
     *     possible object is
     *     {@link StopPlaceComponentRefStructure }
     *     
     */
    public StopPlaceComponentRefStructure getComponentRef() {
        return componentRef;
    }

    /**
     * Imposta il valore della proprietà componentRef.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPlaceComponentRefStructure }
     *     
     */
    public void setComponentRef(StopPlaceComponentRefStructure value) {
        this.componentRef = value;
    }

    /**
     * Gets the value of the componentName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the componentName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponentName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getComponentName() {
        if (componentName == null) {
            componentName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.componentName;
    }

    /**
     * Recupera il valore della proprietà componentType.
     * 
     * @return
     *     possible object is
     *     {@link StopPlaceComponentTypeEnumeration }
     *     
     */
    public StopPlaceComponentTypeEnumeration getComponentType() {
        return componentType;
    }

    /**
     * Imposta il valore della proprietà componentType.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPlaceComponentTypeEnumeration }
     *     
     */
    public void setComponentType(StopPlaceComponentTypeEnumeration value) {
        this.componentType = value;
    }

    /**
     * Recupera il valore della proprietà pointProjection.
     * 
     * @return
     *     possible object is
     *     {@link PointProjectionStructure }
     *     
     */
    public PointProjectionStructure getPointProjection() {
        return pointProjection;
    }

    /**
     * Imposta il valore della proprietà pointProjection.
     * 
     * @param value
     *     allowed object is
     *     {@link PointProjectionStructure }
     *     
     */
    public void setPointProjection(PointProjectionStructure value) {
        this.pointProjection = value;
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
     * Recupera il valore della proprietà zoneProjection.
     * 
     * @return
     *     possible object is
     *     {@link ZoneProjectionStructure }
     *     
     */
    public ZoneProjectionStructure getZoneProjection() {
        return zoneProjection;
    }

    /**
     * Imposta il valore della proprietà zoneProjection.
     * 
     * @param value
     *     allowed object is
     *     {@link ZoneProjectionStructure }
     *     
     */
    public void setZoneProjection(ZoneProjectionStructure value) {
        this.zoneProjection = value;
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
     * Recupera il valore della proprietà affectedFacilities.
     * 
     * @return
     *     possible object is
     *     {@link AffectedStopPlaceComponentStructure.AffectedFacilities }
     *     
     */
    public AffectedStopPlaceComponentStructure.AffectedFacilities getAffectedFacilities() {
        return affectedFacilities;
    }

    /**
     * Imposta il valore della proprietà affectedFacilities.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectedStopPlaceComponentStructure.AffectedFacilities }
     *     
     */
    public void setAffectedFacilities(AffectedStopPlaceComponentStructure.AffectedFacilities value) {
        this.affectedFacilities = value;
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

    public AffectedStopPlaceComponentStructure withComponentRef(StopPlaceComponentRefStructure value) {
        setComponentRef(value);
        return this;
    }

    public AffectedStopPlaceComponentStructure withComponentName(NaturalLanguageStringStructure... values) {
        if (values!= null) {
            for (NaturalLanguageStringStructure value: values) {
                getComponentName().add(value);
            }
        }
        return this;
    }

    public AffectedStopPlaceComponentStructure withComponentName(Collection<NaturalLanguageStringStructure> values) {
        if (values!= null) {
            getComponentName().addAll(values);
        }
        return this;
    }

    public AffectedStopPlaceComponentStructure withComponentType(StopPlaceComponentTypeEnumeration value) {
        setComponentType(value);
        return this;
    }

    public AffectedStopPlaceComponentStructure withPointProjection(PointProjectionStructure value) {
        setPointProjection(value);
        return this;
    }

    public AffectedStopPlaceComponentStructure withLinkProjection(LinkProjectionStructure value) {
        setLinkProjection(value);
        return this;
    }

    public AffectedStopPlaceComponentStructure withZoneProjection(ZoneProjectionStructure value) {
        setZoneProjection(value);
        return this;
    }

    public AffectedStopPlaceComponentStructure withOffset(OffsetStructure value) {
        setOffset(value);
        return this;
    }

    public AffectedStopPlaceComponentStructure withAccessFeatureType(AccessibilityFeatureEnumeration value) {
        setAccessFeatureType(value);
        return this;
    }

    public AffectedStopPlaceComponentStructure withAffectedFacilities(AffectedStopPlaceComponentStructure.AffectedFacilities value) {
        setAffectedFacilities(value);
        return this;
    }

    public AffectedStopPlaceComponentStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public AffectedStopPlaceComponentStructure withAccessibilityAssessment(AccessibilityAssessmentStructure value) {
        setAccessibilityAssessment(value);
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
     *         &lt;element name="AffectedFacility" type="{http://www.siri.org.uk/siri}AffectedFacilityStructure" maxOccurs="unbounded"/&gt;
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
        "affectedFacility"
    })
    public static class AffectedFacilities {

        @XmlElement(name = "AffectedFacility", required = true)
        protected List<AffectedFacilityStructure> affectedFacility;

        /**
         * Gets the value of the affectedFacility property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the affectedFacility property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAffectedFacility().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AffectedFacilityStructure }
         * 
         * 
         */
        public List<AffectedFacilityStructure> getAffectedFacility() {
            if (affectedFacility == null) {
                affectedFacility = new ArrayList<AffectedFacilityStructure>();
            }
            return this.affectedFacility;
        }

        public AffectedStopPlaceComponentStructure.AffectedFacilities withAffectedFacility(AffectedFacilityStructure... values) {
            if (values!= null) {
                for (AffectedFacilityStructure value: values) {
                    getAffectedFacility().add(value);
                }
            }
            return this;
        }

        public AffectedStopPlaceComponentStructure.AffectedFacilities withAffectedFacility(Collection<AffectedFacilityStructure> values) {
            if (values!= null) {
                getAffectedFacility().addAll(values);
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

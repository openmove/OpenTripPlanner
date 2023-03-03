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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import uk.org.ifopt.ifopt.LinkProjectionStructure;


/**
 * <p>Classe Java per AffectedRouteStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AffectedRouteStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RouteRef" type="{http://www.siri.org.uk/siri}RouteRefStructure" minOccurs="0"/&gt;
 *         &lt;element name="Direction" type="{http://www.siri.org.uk/siri}DirectionStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Sections" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AffectedSection" type="{http://www.siri.org.uk/siri}AffectedSectionStructure" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="StopPoints" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AffectedOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;sequence maxOccurs="unbounded"&gt;
 *                     &lt;element name="AffectedStopPoint" type="{http://www.siri.org.uk/siri}AffectedStopPointStructure"/&gt;
 *                     &lt;element name="LinkProjectionToNextStopPoint" type="{http://www.ifopt.org.uk/ifopt}LinkProjectionStructure" minOccurs="0"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RouteLinks" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="RouteLinkRef" type="{http://www.siri.org.uk/siri}RouteLinkRefStructure" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "AffectedRouteStructure", propOrder = {
    "routeRef",
    "direction",
    "sections",
    "stopPoints",
    "routeLinks",
    "extensions"
})
public class AffectedRouteStructure {

    @XmlElement(name = "RouteRef")
    protected RouteRefStructure routeRef;
    @XmlElement(name = "Direction")
    protected List<DirectionStructure> direction;
    @XmlElement(name = "Sections")
    protected AffectedRouteStructure.Sections sections;
    @XmlElement(name = "StopPoints")
    protected AffectedRouteStructure.StopPoints stopPoints;
    @XmlElement(name = "RouteLinks")
    protected AffectedRouteStructure.RouteLinks routeLinks;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Recupera il valore della proprietà routeRef.
     * 
     * @return
     *     possible object is
     *     {@link RouteRefStructure }
     *     
     */
    public RouteRefStructure getRouteRef() {
        return routeRef;
    }

    /**
     * Imposta il valore della proprietà routeRef.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteRefStructure }
     *     
     */
    public void setRouteRef(RouteRefStructure value) {
        this.routeRef = value;
    }

    /**
     * Gets the value of the direction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the direction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDirection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DirectionStructure }
     * 
     * 
     */
    public List<DirectionStructure> getDirection() {
        if (direction == null) {
            direction = new ArrayList<DirectionStructure>();
        }
        return this.direction;
    }

    /**
     * Recupera il valore della proprietà sections.
     * 
     * @return
     *     possible object is
     *     {@link AffectedRouteStructure.Sections }
     *     
     */
    public AffectedRouteStructure.Sections getSections() {
        return sections;
    }

    /**
     * Imposta il valore della proprietà sections.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectedRouteStructure.Sections }
     *     
     */
    public void setSections(AffectedRouteStructure.Sections value) {
        this.sections = value;
    }

    /**
     * Recupera il valore della proprietà stopPoints.
     * 
     * @return
     *     possible object is
     *     {@link AffectedRouteStructure.StopPoints }
     *     
     */
    public AffectedRouteStructure.StopPoints getStopPoints() {
        return stopPoints;
    }

    /**
     * Imposta il valore della proprietà stopPoints.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectedRouteStructure.StopPoints }
     *     
     */
    public void setStopPoints(AffectedRouteStructure.StopPoints value) {
        this.stopPoints = value;
    }

    /**
     * Recupera il valore della proprietà routeLinks.
     * 
     * @return
     *     possible object is
     *     {@link AffectedRouteStructure.RouteLinks }
     *     
     */
    public AffectedRouteStructure.RouteLinks getRouteLinks() {
        return routeLinks;
    }

    /**
     * Imposta il valore della proprietà routeLinks.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectedRouteStructure.RouteLinks }
     *     
     */
    public void setRouteLinks(AffectedRouteStructure.RouteLinks value) {
        this.routeLinks = value;
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

    public AffectedRouteStructure withRouteRef(RouteRefStructure value) {
        setRouteRef(value);
        return this;
    }

    public AffectedRouteStructure withDirection(DirectionStructure... values) {
        if (values!= null) {
            for (DirectionStructure value: values) {
                getDirection().add(value);
            }
        }
        return this;
    }

    public AffectedRouteStructure withDirection(Collection<DirectionStructure> values) {
        if (values!= null) {
            getDirection().addAll(values);
        }
        return this;
    }

    public AffectedRouteStructure withSections(AffectedRouteStructure.Sections value) {
        setSections(value);
        return this;
    }

    public AffectedRouteStructure withStopPoints(AffectedRouteStructure.StopPoints value) {
        setStopPoints(value);
        return this;
    }

    public AffectedRouteStructure withRouteLinks(AffectedRouteStructure.RouteLinks value) {
        setRouteLinks(value);
        return this;
    }

    public AffectedRouteStructure withExtensions(ExtensionsStructure value) {
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
     *         &lt;element name="RouteLinkRef" type="{http://www.siri.org.uk/siri}RouteLinkRefStructure" maxOccurs="unbounded"/&gt;
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
        "routeLinkRef"
    })
    public static class RouteLinks {

        @XmlElement(name = "RouteLinkRef", required = true)
        protected List<RouteLinkRefStructure> routeLinkRef;

        /**
         * Gets the value of the routeLinkRef property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the routeLinkRef property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRouteLinkRef().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RouteLinkRefStructure }
         * 
         * 
         */
        public List<RouteLinkRefStructure> getRouteLinkRef() {
            if (routeLinkRef == null) {
                routeLinkRef = new ArrayList<RouteLinkRefStructure>();
            }
            return this.routeLinkRef;
        }

        public AffectedRouteStructure.RouteLinks withRouteLinkRef(RouteLinkRefStructure... values) {
            if (values!= null) {
                for (RouteLinkRefStructure value: values) {
                    getRouteLinkRef().add(value);
                }
            }
            return this;
        }

        public AffectedRouteStructure.RouteLinks withRouteLinkRef(Collection<RouteLinkRefStructure> values) {
            if (values!= null) {
                getRouteLinkRef().addAll(values);
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
     *         &lt;element name="AffectedSection" type="{http://www.siri.org.uk/siri}AffectedSectionStructure" maxOccurs="unbounded"/&gt;
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
        "affectedSection"
    })
    public static class Sections {

        @XmlElement(name = "AffectedSection", required = true)
        protected List<AffectedSectionStructure> affectedSection;

        /**
         * Gets the value of the affectedSection property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the affectedSection property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAffectedSection().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AffectedSectionStructure }
         * 
         * 
         */
        public List<AffectedSectionStructure> getAffectedSection() {
            if (affectedSection == null) {
                affectedSection = new ArrayList<AffectedSectionStructure>();
            }
            return this.affectedSection;
        }

        public AffectedRouteStructure.Sections withAffectedSection(AffectedSectionStructure... values) {
            if (values!= null) {
                for (AffectedSectionStructure value: values) {
                    getAffectedSection().add(value);
                }
            }
            return this;
        }

        public AffectedRouteStructure.Sections withAffectedSection(Collection<AffectedSectionStructure> values) {
            if (values!= null) {
                getAffectedSection().addAll(values);
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
     *         &lt;element name="AffectedOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;sequence maxOccurs="unbounded"&gt;
     *           &lt;element name="AffectedStopPoint" type="{http://www.siri.org.uk/siri}AffectedStopPointStructure"/&gt;
     *           &lt;element name="LinkProjectionToNextStopPoint" type="{http://www.ifopt.org.uk/ifopt}LinkProjectionStructure" minOccurs="0"/&gt;
     *         &lt;/sequence&gt;
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
        "affectedOnly",
        "affectedStopPointAndLinkProjectionToNextStopPoint"
    })
    public static class StopPoints {

        @XmlElement(name = "AffectedOnly", defaultValue = "false")
        protected Boolean affectedOnly;
        @XmlElements({
            @XmlElement(name = "AffectedStopPoint", required = true, type = AffectedStopPointStructure.class),
            @XmlElement(name = "LinkProjectionToNextStopPoint", required = true, type = LinkProjectionStructure.class)
        })
        protected List<Object> affectedStopPointAndLinkProjectionToNextStopPoint;

        /**
         * Recupera il valore della proprietà affectedOnly.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAffectedOnly() {
            return affectedOnly;
        }

        /**
         * Imposta il valore della proprietà affectedOnly.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAffectedOnly(Boolean value) {
            this.affectedOnly = value;
        }

        /**
         * Gets the value of the affectedStopPointAndLinkProjectionToNextStopPoint property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the affectedStopPointAndLinkProjectionToNextStopPoint property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAffectedStopPointAndLinkProjectionToNextStopPoint().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AffectedStopPointStructure }
         * {@link LinkProjectionStructure }
         * 
         * 
         */
        public List<Object> getAffectedStopPointAndLinkProjectionToNextStopPoint() {
            if (affectedStopPointAndLinkProjectionToNextStopPoint == null) {
                affectedStopPointAndLinkProjectionToNextStopPoint = new ArrayList<Object>();
            }
            return this.affectedStopPointAndLinkProjectionToNextStopPoint;
        }

        public AffectedRouteStructure.StopPoints withAffectedOnly(Boolean value) {
            setAffectedOnly(value);
            return this;
        }

        public AffectedRouteStructure.StopPoints withAffectedStopPointAndLinkProjectionToNextStopPoint(Object... values) {
            if (values!= null) {
                for (Object value: values) {
                    getAffectedStopPointAndLinkProjectionToNextStopPoint().add(value);
                }
            }
            return this;
        }

        public AffectedRouteStructure.StopPoints withAffectedStopPointAndLinkProjectionToNextStopPoint(Collection<Object> values) {
            if (values!= null) {
                getAffectedStopPointAndLinkProjectionToNextStopPoint().addAll(values);
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

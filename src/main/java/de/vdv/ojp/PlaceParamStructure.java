//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package de.vdv.ojp;

import java.math.BigInteger;
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


/**
 * <p>Classe Java per PlaceParamStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PlaceParamStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}PlaceDataFilterGroup"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}PlacePolicyGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlaceParamStructure", propOrder = {
    "type",
    "usage",
    "ptModes",
    "operatorFilter",
    "topographicPlaceRef",
    "pointOfInterestFilter",
    "language",
    "numberOfResults",
    "continueAt",
    "includePtModes"
})
public class PlaceParamStructure {

    @XmlElement(name = "Type")
    @XmlSchemaType(name = "string")
    protected List<PlaceTypeEnumeration> type;
    @XmlElement(name = "Usage")
    @XmlSchemaType(name = "string")
    protected PlaceUsageEnumeration usage;
    @XmlElement(name = "PtModes")
    protected PtModeFilterStructure ptModes;
    @XmlElement(name = "OperatorFilter")
    protected OperatorFilterStructure operatorFilter;
    @XmlElement(name = "TopographicPlaceRef")
    protected List<TopographicPlaceRefStructure> topographicPlaceRef;
    @XmlElement(name = "PointOfInterestFilter")
    protected PointOfInterestFilterStructure pointOfInterestFilter;
    @XmlElement(name = "Language")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String language;
    @XmlElement(name = "NumberOfResults")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfResults;
    @XmlElement(name = "ContinueAt")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger continueAt;
    @XmlElement(name = "IncludePtModes", defaultValue = "false")
    protected Boolean includePtModes;

    /**
     * Gets the value of the type property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the type property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlaceTypeEnumeration }
     * 
     * 
     */
    public List<PlaceTypeEnumeration> getType() {
        if (type == null) {
            type = new ArrayList<PlaceTypeEnumeration>();
        }
        return this.type;
    }

    /**
     * Recupera il valore della proprietà usage.
     * 
     * @return
     *     possible object is
     *     {@link PlaceUsageEnumeration }
     *     
     */
    public PlaceUsageEnumeration getUsage() {
        return usage;
    }

    /**
     * Imposta il valore della proprietà usage.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceUsageEnumeration }
     *     
     */
    public void setUsage(PlaceUsageEnumeration value) {
        this.usage = value;
    }

    /**
     * Recupera il valore della proprietà ptModes.
     * 
     * @return
     *     possible object is
     *     {@link PtModeFilterStructure }
     *     
     */
    public PtModeFilterStructure getPtModes() {
        return ptModes;
    }

    /**
     * Imposta il valore della proprietà ptModes.
     * 
     * @param value
     *     allowed object is
     *     {@link PtModeFilterStructure }
     *     
     */
    public void setPtModes(PtModeFilterStructure value) {
        this.ptModes = value;
    }

    /**
     * Recupera il valore della proprietà operatorFilter.
     * 
     * @return
     *     possible object is
     *     {@link OperatorFilterStructure }
     *     
     */
    public OperatorFilterStructure getOperatorFilter() {
        return operatorFilter;
    }

    /**
     * Imposta il valore della proprietà operatorFilter.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorFilterStructure }
     *     
     */
    public void setOperatorFilter(OperatorFilterStructure value) {
        this.operatorFilter = value;
    }

    /**
     * Gets the value of the topographicPlaceRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the topographicPlaceRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTopographicPlaceRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TopographicPlaceRefStructure }
     * 
     * 
     */
    public List<TopographicPlaceRefStructure> getTopographicPlaceRef() {
        if (topographicPlaceRef == null) {
            topographicPlaceRef = new ArrayList<TopographicPlaceRefStructure>();
        }
        return this.topographicPlaceRef;
    }

    /**
     * Recupera il valore della proprietà pointOfInterestFilter.
     * 
     * @return
     *     possible object is
     *     {@link PointOfInterestFilterStructure }
     *     
     */
    public PointOfInterestFilterStructure getPointOfInterestFilter() {
        return pointOfInterestFilter;
    }

    /**
     * Imposta il valore della proprietà pointOfInterestFilter.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInterestFilterStructure }
     *     
     */
    public void setPointOfInterestFilter(PointOfInterestFilterStructure value) {
        this.pointOfInterestFilter = value;
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
     * Recupera il valore della proprietà numberOfResults.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfResults() {
        return numberOfResults;
    }

    /**
     * Imposta il valore della proprietà numberOfResults.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfResults(BigInteger value) {
        this.numberOfResults = value;
    }

    /**
     * Recupera il valore della proprietà continueAt.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getContinueAt() {
        return continueAt;
    }

    /**
     * Imposta il valore della proprietà continueAt.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setContinueAt(BigInteger value) {
        this.continueAt = value;
    }

    /**
     * Recupera il valore della proprietà includePtModes.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludePtModes() {
        return includePtModes;
    }

    /**
     * Imposta il valore della proprietà includePtModes.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludePtModes(Boolean value) {
        this.includePtModes = value;
    }

    public PlaceParamStructure withType(PlaceTypeEnumeration... values) {
        if (values!= null) {
            for (PlaceTypeEnumeration value: values) {
                getType().add(value);
            }
        }
        return this;
    }

    public PlaceParamStructure withType(Collection<PlaceTypeEnumeration> values) {
        if (values!= null) {
            getType().addAll(values);
        }
        return this;
    }

    public PlaceParamStructure withUsage(PlaceUsageEnumeration value) {
        setUsage(value);
        return this;
    }

    public PlaceParamStructure withPtModes(PtModeFilterStructure value) {
        setPtModes(value);
        return this;
    }

    public PlaceParamStructure withOperatorFilter(OperatorFilterStructure value) {
        setOperatorFilter(value);
        return this;
    }

    public PlaceParamStructure withTopographicPlaceRef(TopographicPlaceRefStructure... values) {
        if (values!= null) {
            for (TopographicPlaceRefStructure value: values) {
                getTopographicPlaceRef().add(value);
            }
        }
        return this;
    }

    public PlaceParamStructure withTopographicPlaceRef(Collection<TopographicPlaceRefStructure> values) {
        if (values!= null) {
            getTopographicPlaceRef().addAll(values);
        }
        return this;
    }

    public PlaceParamStructure withPointOfInterestFilter(PointOfInterestFilterStructure value) {
        setPointOfInterestFilter(value);
        return this;
    }

    public PlaceParamStructure withLanguage(String value) {
        setLanguage(value);
        return this;
    }

    public PlaceParamStructure withNumberOfResults(BigInteger value) {
        setNumberOfResults(value);
        return this;
    }

    public PlaceParamStructure withContinueAt(BigInteger value) {
        setContinueAt(value);
        return this;
    }

    public PlaceParamStructure withIncludePtModes(Boolean value) {
        setIncludePtModes(value);
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

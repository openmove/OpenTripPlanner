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


/**
 * <p>Classe Java per AffectedFacilityStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AffectedFacilityStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}FacilityRef" minOccurs="0"/&gt;
 *         &lt;element name="StartStopPointRef" type="{http://www.siri.org.uk/siri}StopPointRefStructure" minOccurs="0"/&gt;
 *         &lt;element name="EndStopPointRef" type="{http://www.siri.org.uk/siri}StopPointRefStructure" minOccurs="0"/&gt;
 *         &lt;element name="FacilityName" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FacilityStatus" type="{http://www.siri.org.uk/siri}FacilityStatusEnumeration" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffectedFacilityStructure", propOrder = {
    "facilityRef",
    "startStopPointRef",
    "endStopPointRef",
    "facilityName",
    "facilityStatus",
    "extensions"
})
public class AffectedFacilityStructure {

    @XmlElement(name = "FacilityRef")
    protected FacilityRefStructure facilityRef;
    @XmlElement(name = "StartStopPointRef")
    protected StopPointRefStructure startStopPointRef;
    @XmlElement(name = "EndStopPointRef")
    protected StopPointRefStructure endStopPointRef;
    @XmlElement(name = "FacilityName")
    protected List<NaturalLanguageStringStructure> facilityName;
    @XmlElement(name = "FacilityStatus")
    @XmlSchemaType(name = "NMTOKEN")
    protected List<FacilityStatusEnumeration> facilityStatus;
    @XmlElement(name = "Extensions")
    protected List<ExtensionsStructure> extensions;

    /**
     * Recupera il valore della proprietà facilityRef.
     * 
     * @return
     *     possible object is
     *     {@link FacilityRefStructure }
     *     
     */
    public FacilityRefStructure getFacilityRef() {
        return facilityRef;
    }

    /**
     * Imposta il valore della proprietà facilityRef.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityRefStructure }
     *     
     */
    public void setFacilityRef(FacilityRefStructure value) {
        this.facilityRef = value;
    }

    /**
     * Recupera il valore della proprietà startStopPointRef.
     * 
     * @return
     *     possible object is
     *     {@link StopPointRefStructure }
     *     
     */
    public StopPointRefStructure getStartStopPointRef() {
        return startStopPointRef;
    }

    /**
     * Imposta il valore della proprietà startStopPointRef.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointRefStructure }
     *     
     */
    public void setStartStopPointRef(StopPointRefStructure value) {
        this.startStopPointRef = value;
    }

    /**
     * Recupera il valore della proprietà endStopPointRef.
     * 
     * @return
     *     possible object is
     *     {@link StopPointRefStructure }
     *     
     */
    public StopPointRefStructure getEndStopPointRef() {
        return endStopPointRef;
    }

    /**
     * Imposta il valore della proprietà endStopPointRef.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointRefStructure }
     *     
     */
    public void setEndStopPointRef(StopPointRefStructure value) {
        this.endStopPointRef = value;
    }

    /**
     * Gets the value of the facilityName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facilityName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacilityName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getFacilityName() {
        if (facilityName == null) {
            facilityName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.facilityName;
    }

    /**
     * Gets the value of the facilityStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facilityStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacilityStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacilityStatusEnumeration }
     * 
     * 
     */
    public List<FacilityStatusEnumeration> getFacilityStatus() {
        if (facilityStatus == null) {
            facilityStatus = new ArrayList<FacilityStatusEnumeration>();
        }
        return this.facilityStatus;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extensions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtensions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtensionsStructure }
     * 
     * 
     */
    public List<ExtensionsStructure> getExtensions() {
        if (extensions == null) {
            extensions = new ArrayList<ExtensionsStructure>();
        }
        return this.extensions;
    }

    public AffectedFacilityStructure withFacilityRef(FacilityRefStructure value) {
        setFacilityRef(value);
        return this;
    }

    public AffectedFacilityStructure withStartStopPointRef(StopPointRefStructure value) {
        setStartStopPointRef(value);
        return this;
    }

    public AffectedFacilityStructure withEndStopPointRef(StopPointRefStructure value) {
        setEndStopPointRef(value);
        return this;
    }

    public AffectedFacilityStructure withFacilityName(NaturalLanguageStringStructure... values) {
        if (values!= null) {
            for (NaturalLanguageStringStructure value: values) {
                getFacilityName().add(value);
            }
        }
        return this;
    }

    public AffectedFacilityStructure withFacilityName(Collection<NaturalLanguageStringStructure> values) {
        if (values!= null) {
            getFacilityName().addAll(values);
        }
        return this;
    }

    public AffectedFacilityStructure withFacilityStatus(FacilityStatusEnumeration... values) {
        if (values!= null) {
            for (FacilityStatusEnumeration value: values) {
                getFacilityStatus().add(value);
            }
        }
        return this;
    }

    public AffectedFacilityStructure withFacilityStatus(Collection<FacilityStatusEnumeration> values) {
        if (values!= null) {
            getFacilityStatus().addAll(values);
        }
        return this;
    }

    public AffectedFacilityStructure withExtensions(ExtensionsStructure... values) {
        if (values!= null) {
            for (ExtensionsStructure value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    public AffectedFacilityStructure withExtensions(Collection<ExtensionsStructure> values) {
        if (values!= null) {
            getExtensions().addAll(values);
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

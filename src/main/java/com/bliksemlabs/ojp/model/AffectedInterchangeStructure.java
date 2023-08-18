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
 * <p>Classe Java per AffectedInterchangeStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AffectedInterchangeStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InterchangeRef" type="{http://www.siri.org.uk/siri}InterchangeRefStructure" minOccurs="0"/&gt;
 *         &lt;element name="InterchangeStopPointRef" type="{http://www.siri.org.uk/siri}StopPointRefStructure" minOccurs="0"/&gt;
 *         &lt;element name="InterchangeStopPointName" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ConnectingVehicleJourneyRef" type="{http://www.siri.org.uk/siri}DatedVehicleJourneyRefStructure" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}InterchangeStatusType" minOccurs="0"/&gt;
 *         &lt;element name="ConnectionLink" type="{http://www.siri.org.uk/siri}AffectedConnectionLinkStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "AffectedInterchangeStructure", propOrder = {
    "interchangeRef",
    "interchangeStopPointRef",
    "interchangeStopPointName",
    "connectingVehicleJourneyRef",
    "interchangeStatusType",
    "connectionLink",
    "extensions"
})
public class AffectedInterchangeStructure {

    @XmlElement(name = "InterchangeRef")
    protected InterchangeRefStructure interchangeRef;
    @XmlElement(name = "InterchangeStopPointRef")
    protected StopPointRefStructure interchangeStopPointRef;
    @XmlElement(name = "InterchangeStopPointName")
    protected List<NaturalLanguageStringStructure> interchangeStopPointName;
    @XmlElement(name = "ConnectingVehicleJourneyRef")
    protected DatedVehicleJourneyRefStructure connectingVehicleJourneyRef;
    @XmlElement(name = "InterchangeStatusType", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected InterchangeStatusEnumeration interchangeStatusType;
    @XmlElement(name = "ConnectionLink")
    protected List<AffectedConnectionLinkStructure> connectionLink;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Recupera il valore della proprietà interchangeRef.
     * 
     * @return
     *     possible object is
     *     {@link InterchangeRefStructure }
     *     
     */
    public InterchangeRefStructure getInterchangeRef() {
        return interchangeRef;
    }

    /**
     * Imposta il valore della proprietà interchangeRef.
     * 
     * @param value
     *     allowed object is
     *     {@link InterchangeRefStructure }
     *     
     */
    public void setInterchangeRef(InterchangeRefStructure value) {
        this.interchangeRef = value;
    }

    /**
     * Recupera il valore della proprietà interchangeStopPointRef.
     * 
     * @return
     *     possible object is
     *     {@link StopPointRefStructure }
     *     
     */
    public StopPointRefStructure getInterchangeStopPointRef() {
        return interchangeStopPointRef;
    }

    /**
     * Imposta il valore della proprietà interchangeStopPointRef.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointRefStructure }
     *     
     */
    public void setInterchangeStopPointRef(StopPointRefStructure value) {
        this.interchangeStopPointRef = value;
    }

    /**
     * Gets the value of the interchangeStopPointName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interchangeStopPointName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterchangeStopPointName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getInterchangeStopPointName() {
        if (interchangeStopPointName == null) {
            interchangeStopPointName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.interchangeStopPointName;
    }

    /**
     * Recupera il valore della proprietà connectingVehicleJourneyRef.
     * 
     * @return
     *     possible object is
     *     {@link DatedVehicleJourneyRefStructure }
     *     
     */
    public DatedVehicleJourneyRefStructure getConnectingVehicleJourneyRef() {
        return connectingVehicleJourneyRef;
    }

    /**
     * Imposta il valore della proprietà connectingVehicleJourneyRef.
     * 
     * @param value
     *     allowed object is
     *     {@link DatedVehicleJourneyRefStructure }
     *     
     */
    public void setConnectingVehicleJourneyRef(DatedVehicleJourneyRefStructure value) {
        this.connectingVehicleJourneyRef = value;
    }

    /**
     * Recupera il valore della proprietà interchangeStatusType.
     * 
     * @return
     *     possible object is
     *     {@link InterchangeStatusEnumeration }
     *     
     */
    public InterchangeStatusEnumeration getInterchangeStatusType() {
        return interchangeStatusType;
    }

    /**
     * Imposta il valore della proprietà interchangeStatusType.
     * 
     * @param value
     *     allowed object is
     *     {@link InterchangeStatusEnumeration }
     *     
     */
    public void setInterchangeStatusType(InterchangeStatusEnumeration value) {
        this.interchangeStatusType = value;
    }

    /**
     * Gets the value of the connectionLink property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectionLink property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectionLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AffectedConnectionLinkStructure }
     * 
     * 
     */
    public List<AffectedConnectionLinkStructure> getConnectionLink() {
        if (connectionLink == null) {
            connectionLink = new ArrayList<AffectedConnectionLinkStructure>();
        }
        return this.connectionLink;
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

    public AffectedInterchangeStructure withInterchangeRef(InterchangeRefStructure value) {
        setInterchangeRef(value);
        return this;
    }

    public AffectedInterchangeStructure withInterchangeStopPointRef(StopPointRefStructure value) {
        setInterchangeStopPointRef(value);
        return this;
    }

    public AffectedInterchangeStructure withInterchangeStopPointName(NaturalLanguageStringStructure... values) {
        if (values!= null) {
            for (NaturalLanguageStringStructure value: values) {
                getInterchangeStopPointName().add(value);
            }
        }
        return this;
    }

    public AffectedInterchangeStructure withInterchangeStopPointName(Collection<NaturalLanguageStringStructure> values) {
        if (values!= null) {
            getInterchangeStopPointName().addAll(values);
        }
        return this;
    }

    public AffectedInterchangeStructure withConnectingVehicleJourneyRef(DatedVehicleJourneyRefStructure value) {
        setConnectingVehicleJourneyRef(value);
        return this;
    }

    public AffectedInterchangeStructure withInterchangeStatusType(InterchangeStatusEnumeration value) {
        setInterchangeStatusType(value);
        return this;
    }

    public AffectedInterchangeStructure withConnectionLink(AffectedConnectionLinkStructure... values) {
        if (values!= null) {
            for (AffectedConnectionLinkStructure value: values) {
                getConnectionLink().add(value);
            }
        }
        return this;
    }

    public AffectedInterchangeStructure withConnectionLink(Collection<AffectedConnectionLinkStructure> values) {
        if (values!= null) {
            getConnectionLink().addAll(values);
        }
        return this;
    }

    public AffectedInterchangeStructure withExtensions(ExtensionsStructure value) {
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

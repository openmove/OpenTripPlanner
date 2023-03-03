//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package de.vdv.ojp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * Stop event structure.
 * 
 * <p>Classe Java per StopEventStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="StopEventStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PreviousCall" type="{http://www.vdv.de/ojp}CallAtNearStopStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ThisCall" type="{http://www.vdv.de/ojp}CallAtNearStopStructure"/&gt;
 *         &lt;element name="OnwardCall" type="{http://www.vdv.de/ojp}CallAtNearStopStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Service" type="{http://www.vdv.de/ojp}DatedJourneyStructure"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}OperatingDaysGroup" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopEventStructure", propOrder = {
    "previousCall",
    "thisCall",
    "onwardCall",
    "service",
    "operatingDays",
    "operatingDaysDescription",
    "extension"
})
public class StopEventStructure {

    @XmlElement(name = "PreviousCall")
    protected List<CallAtNearStopStructure> previousCall;
    @XmlElement(name = "ThisCall", required = true)
    protected CallAtNearStopStructure thisCall;
    @XmlElement(name = "OnwardCall")
    protected List<CallAtNearStopStructure> onwardCall;
    @XmlElement(name = "Service", required = true)
    protected DatedJourneyStructure service;
    @XmlElement(name = "OperatingDays")
    protected OperatingDaysStructure operatingDays;
    @XmlElement(name = "OperatingDaysDescription")
    protected InternationalTextStructure operatingDaysDescription;
    @XmlElement(name = "Extension")
    protected Object extension;

    /**
     * Gets the value of the previousCall property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the previousCall property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreviousCall().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CallAtNearStopStructure }
     * 
     * 
     */
    public List<CallAtNearStopStructure> getPreviousCall() {
        if (previousCall == null) {
            previousCall = new ArrayList<CallAtNearStopStructure>();
        }
        return this.previousCall;
    }

    /**
     * Recupera il valore della proprietà thisCall.
     * 
     * @return
     *     possible object is
     *     {@link CallAtNearStopStructure }
     *     
     */
    public CallAtNearStopStructure getThisCall() {
        return thisCall;
    }

    /**
     * Imposta il valore della proprietà thisCall.
     * 
     * @param value
     *     allowed object is
     *     {@link CallAtNearStopStructure }
     *     
     */
    public void setThisCall(CallAtNearStopStructure value) {
        this.thisCall = value;
    }

    /**
     * Gets the value of the onwardCall property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the onwardCall property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOnwardCall().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CallAtNearStopStructure }
     * 
     * 
     */
    public List<CallAtNearStopStructure> getOnwardCall() {
        if (onwardCall == null) {
            onwardCall = new ArrayList<CallAtNearStopStructure>();
        }
        return this.onwardCall;
    }

    /**
     * Recupera il valore della proprietà service.
     * 
     * @return
     *     possible object is
     *     {@link DatedJourneyStructure }
     *     
     */
    public DatedJourneyStructure getService() {
        return service;
    }

    /**
     * Imposta il valore della proprietà service.
     * 
     * @param value
     *     allowed object is
     *     {@link DatedJourneyStructure }
     *     
     */
    public void setService(DatedJourneyStructure value) {
        this.service = value;
    }

    /**
     * Recupera il valore della proprietà operatingDays.
     * 
     * @return
     *     possible object is
     *     {@link OperatingDaysStructure }
     *     
     */
    public OperatingDaysStructure getOperatingDays() {
        return operatingDays;
    }

    /**
     * Imposta il valore della proprietà operatingDays.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingDaysStructure }
     *     
     */
    public void setOperatingDays(OperatingDaysStructure value) {
        this.operatingDays = value;
    }

    /**
     * Recupera il valore della proprietà operatingDaysDescription.
     * 
     * @return
     *     possible object is
     *     {@link InternationalTextStructure }
     *     
     */
    public InternationalTextStructure getOperatingDaysDescription() {
        return operatingDaysDescription;
    }

    /**
     * Imposta il valore della proprietà operatingDaysDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTextStructure }
     *     
     */
    public void setOperatingDaysDescription(InternationalTextStructure value) {
        this.operatingDaysDescription = value;
    }

    /**
     * Recupera il valore della proprietà extension.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExtension() {
        return extension;
    }

    /**
     * Imposta il valore della proprietà extension.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExtension(Object value) {
        this.extension = value;
    }

    public StopEventStructure withPreviousCall(CallAtNearStopStructure... values) {
        if (values!= null) {
            for (CallAtNearStopStructure value: values) {
                getPreviousCall().add(value);
            }
        }
        return this;
    }

    public StopEventStructure withPreviousCall(Collection<CallAtNearStopStructure> values) {
        if (values!= null) {
            getPreviousCall().addAll(values);
        }
        return this;
    }

    public StopEventStructure withThisCall(CallAtNearStopStructure value) {
        setThisCall(value);
        return this;
    }

    public StopEventStructure withOnwardCall(CallAtNearStopStructure... values) {
        if (values!= null) {
            for (CallAtNearStopStructure value: values) {
                getOnwardCall().add(value);
            }
        }
        return this;
    }

    public StopEventStructure withOnwardCall(Collection<CallAtNearStopStructure> values) {
        if (values!= null) {
            getOnwardCall().addAll(values);
        }
        return this;
    }

    public StopEventStructure withService(DatedJourneyStructure value) {
        setService(value);
        return this;
    }

    public StopEventStructure withOperatingDays(OperatingDaysStructure value) {
        setOperatingDays(value);
        return this;
    }

    public StopEventStructure withOperatingDaysDescription(InternationalTextStructure value) {
        setOperatingDaysDescription(value);
        return this;
    }

    public StopEventStructure withExtension(Object value) {
        setExtension(value);
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

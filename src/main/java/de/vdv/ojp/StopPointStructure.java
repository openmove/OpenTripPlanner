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
import com.bliksemlabs.ojp.model.StopPointRefStructure;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * [an extended view of SCHEDULED STOP POINT in TMv6] a SCHEDULED STOP POINT extended by ACCESSIBILITY LIMITATION attributes and with identifier and name where passengers can board or alight from vehicles 
 * 
 * <p>Classe Java per StopPointStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="StopPointStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}StopPointGroup"/&gt;
 *         &lt;element name="PrivateCode" type="{http://www.vdv.de/ojp}PrivateCodeStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ParentRef" type="{http://www.vdv.de/ojp}StopPlaceRefStructure" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.vdv.de/ojp}TopographicPlaceRef" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}StopAttributesGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopPointStructure", propOrder = {
    "stopPointRef",
    "stopPointName",
    "nameSuffix",
    "plannedQuay",
    "estimatedQuay",
    "privateCode",
    "parentRef",
    "topographicPlaceRef",
    "wheelchairAccessible",
    "lighting",
    "covered"
})
public class StopPointStructure {

    @XmlElement(name = "StopPointRef", namespace = "http://www.siri.org.uk/siri", required = true)
    protected StopPointRefStructure stopPointRef;
    @XmlElement(name = "StopPointName", required = true)
    protected InternationalTextStructure stopPointName;
    @XmlElement(name = "NameSuffix")
    protected InternationalTextStructure nameSuffix;
    @XmlElement(name = "PlannedQuay")
    protected InternationalTextStructure plannedQuay;
    @XmlElement(name = "EstimatedQuay")
    protected InternationalTextStructure estimatedQuay;
    @XmlElement(name = "PrivateCode")
    protected List<PrivateCodeStructure> privateCode;
    @XmlElement(name = "ParentRef")
    protected StopPlaceRefStructure parentRef;
    @XmlElement(name = "TopographicPlaceRef")
    protected TopographicPlaceRefStructure topographicPlaceRef;
    @XmlElement(name = "WheelchairAccessible", defaultValue = "false")
    protected Boolean wheelchairAccessible;
    @XmlElement(name = "Lighting", defaultValue = "false")
    protected Boolean lighting;
    @XmlElement(name = "Covered", defaultValue = "false")
    protected Boolean covered;

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
     * Recupera il valore della proprietà stopPointName.
     * 
     * @return
     *     possible object is
     *     {@link InternationalTextStructure }
     *     
     */
    public InternationalTextStructure getStopPointName() {
        return stopPointName;
    }

    /**
     * Imposta il valore della proprietà stopPointName.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTextStructure }
     *     
     */
    public void setStopPointName(InternationalTextStructure value) {
        this.stopPointName = value;
    }

    /**
     * Recupera il valore della proprietà nameSuffix.
     * 
     * @return
     *     possible object is
     *     {@link InternationalTextStructure }
     *     
     */
    public InternationalTextStructure getNameSuffix() {
        return nameSuffix;
    }

    /**
     * Imposta il valore della proprietà nameSuffix.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTextStructure }
     *     
     */
    public void setNameSuffix(InternationalTextStructure value) {
        this.nameSuffix = value;
    }

    /**
     * Recupera il valore della proprietà plannedQuay.
     * 
     * @return
     *     possible object is
     *     {@link InternationalTextStructure }
     *     
     */
    public InternationalTextStructure getPlannedQuay() {
        return plannedQuay;
    }

    /**
     * Imposta il valore della proprietà plannedQuay.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTextStructure }
     *     
     */
    public void setPlannedQuay(InternationalTextStructure value) {
        this.plannedQuay = value;
    }

    /**
     * Recupera il valore della proprietà estimatedQuay.
     * 
     * @return
     *     possible object is
     *     {@link InternationalTextStructure }
     *     
     */
    public InternationalTextStructure getEstimatedQuay() {
        return estimatedQuay;
    }

    /**
     * Imposta il valore della proprietà estimatedQuay.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTextStructure }
     *     
     */
    public void setEstimatedQuay(InternationalTextStructure value) {
        this.estimatedQuay = value;
    }

    /**
     * Gets the value of the privateCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the privateCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrivateCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrivateCodeStructure }
     * 
     * 
     */
    public List<PrivateCodeStructure> getPrivateCode() {
        if (privateCode == null) {
            privateCode = new ArrayList<PrivateCodeStructure>();
        }
        return this.privateCode;
    }

    /**
     * Recupera il valore della proprietà parentRef.
     * 
     * @return
     *     possible object is
     *     {@link StopPlaceRefStructure }
     *     
     */
    public StopPlaceRefStructure getParentRef() {
        return parentRef;
    }

    /**
     * Imposta il valore della proprietà parentRef.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPlaceRefStructure }
     *     
     */
    public void setParentRef(StopPlaceRefStructure value) {
        this.parentRef = value;
    }

    /**
     * Recupera il valore della proprietà topographicPlaceRef.
     * 
     * @return
     *     possible object is
     *     {@link TopographicPlaceRefStructure }
     *     
     */
    public TopographicPlaceRefStructure getTopographicPlaceRef() {
        return topographicPlaceRef;
    }

    /**
     * Imposta il valore della proprietà topographicPlaceRef.
     * 
     * @param value
     *     allowed object is
     *     {@link TopographicPlaceRefStructure }
     *     
     */
    public void setTopographicPlaceRef(TopographicPlaceRefStructure value) {
        this.topographicPlaceRef = value;
    }

    /**
     * Recupera il valore della proprietà wheelchairAccessible.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWheelchairAccessible() {
        return wheelchairAccessible;
    }

    /**
     * Imposta il valore della proprietà wheelchairAccessible.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWheelchairAccessible(Boolean value) {
        this.wheelchairAccessible = value;
    }

    /**
     * Recupera il valore della proprietà lighting.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLighting() {
        return lighting;
    }

    /**
     * Imposta il valore della proprietà lighting.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLighting(Boolean value) {
        this.lighting = value;
    }

    /**
     * Recupera il valore della proprietà covered.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCovered() {
        return covered;
    }

    /**
     * Imposta il valore della proprietà covered.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCovered(Boolean value) {
        this.covered = value;
    }

    public StopPointStructure withStopPointRef(StopPointRefStructure value) {
        setStopPointRef(value);
        return this;
    }

    public StopPointStructure withStopPointName(InternationalTextStructure value) {
        setStopPointName(value);
        return this;
    }

    public StopPointStructure withNameSuffix(InternationalTextStructure value) {
        setNameSuffix(value);
        return this;
    }

    public StopPointStructure withPlannedQuay(InternationalTextStructure value) {
        setPlannedQuay(value);
        return this;
    }

    public StopPointStructure withEstimatedQuay(InternationalTextStructure value) {
        setEstimatedQuay(value);
        return this;
    }

    public StopPointStructure withPrivateCode(PrivateCodeStructure... values) {
        if (values!= null) {
            for (PrivateCodeStructure value: values) {
                getPrivateCode().add(value);
            }
        }
        return this;
    }

    public StopPointStructure withPrivateCode(Collection<PrivateCodeStructure> values) {
        if (values!= null) {
            getPrivateCode().addAll(values);
        }
        return this;
    }

    public StopPointStructure withParentRef(StopPlaceRefStructure value) {
        setParentRef(value);
        return this;
    }

    public StopPointStructure withTopographicPlaceRef(TopographicPlaceRefStructure value) {
        setTopographicPlaceRef(value);
        return this;
    }

    public StopPointStructure withWheelchairAccessible(Boolean value) {
        setWheelchairAccessible(value);
        return this;
    }

    public StopPointStructure withLighting(Boolean value) {
        setLighting(value);
        return this;
    }

    public StopPointStructure withCovered(Boolean value) {
        setCovered(value);
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

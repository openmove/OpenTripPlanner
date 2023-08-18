//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package com.bliksemlabs.ojp.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per FacilityChangeStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="FacilityChangeStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EquipmentAvailability" type="{http://www.siri.org.uk/siri}EquipmentAvailabilityStructure" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}SituationRef" minOccurs="0"/&gt;
 *         &lt;element name="MobilityDisruption" type="{http://www.siri.org.uk/siri}MobilityDisruptionStructure" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacilityChangeStructure", propOrder = {
    "equipmentAvailability",
    "situationRef",
    "mobilityDisruption"
})
public class FacilityChangeStructure {

    @XmlElement(name = "EquipmentAvailability")
    protected EquipmentAvailabilityStructure equipmentAvailability;
    @XmlElement(name = "SituationRef")
    protected SituationRefStructure situationRef;
    @XmlElement(name = "MobilityDisruption")
    protected MobilityDisruptionStructure mobilityDisruption;

    /**
     * Recupera il valore della proprietà equipmentAvailability.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentAvailabilityStructure }
     *     
     */
    public EquipmentAvailabilityStructure getEquipmentAvailability() {
        return equipmentAvailability;
    }

    /**
     * Imposta il valore della proprietà equipmentAvailability.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentAvailabilityStructure }
     *     
     */
    public void setEquipmentAvailability(EquipmentAvailabilityStructure value) {
        this.equipmentAvailability = value;
    }

    /**
     * Recupera il valore della proprietà situationRef.
     * 
     * @return
     *     possible object is
     *     {@link SituationRefStructure }
     *     
     */
    public SituationRefStructure getSituationRef() {
        return situationRef;
    }

    /**
     * Imposta il valore della proprietà situationRef.
     * 
     * @param value
     *     allowed object is
     *     {@link SituationRefStructure }
     *     
     */
    public void setSituationRef(SituationRefStructure value) {
        this.situationRef = value;
    }

    /**
     * Recupera il valore della proprietà mobilityDisruption.
     * 
     * @return
     *     possible object is
     *     {@link MobilityDisruptionStructure }
     *     
     */
    public MobilityDisruptionStructure getMobilityDisruption() {
        return mobilityDisruption;
    }

    /**
     * Imposta il valore della proprietà mobilityDisruption.
     * 
     * @param value
     *     allowed object is
     *     {@link MobilityDisruptionStructure }
     *     
     */
    public void setMobilityDisruption(MobilityDisruptionStructure value) {
        this.mobilityDisruption = value;
    }

    public FacilityChangeStructure withEquipmentAvailability(EquipmentAvailabilityStructure value) {
        setEquipmentAvailability(value);
        return this;
    }

    public FacilityChangeStructure withSituationRef(SituationRefStructure value) {
        setSituationRef(value);
        return this;
    }

    public FacilityChangeStructure withMobilityDisruption(MobilityDisruptionStructure value) {
        setMobilityDisruption(value);
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

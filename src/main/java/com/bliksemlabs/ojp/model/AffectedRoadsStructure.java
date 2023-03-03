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
import javax.xml.bind.annotation.XmlType;
import eu.datex2.schema._2_0rc1._2_0.GroupOfLocations;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per AffectedRoadsStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AffectedRoadsStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Datex2Locations" type="{http://datex2.eu/schema/2_0RC1/2_0}GroupOfLocations" minOccurs="0"/&gt;
 *         &lt;element name="AffectedRoad" type="{http://www.siri.org.uk/siri}AffectedRoadStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffectedRoadsStructure", propOrder = {
    "datex2Locations",
    "affectedRoad"
})
public class AffectedRoadsStructure {

    @XmlElement(name = "Datex2Locations")
    protected GroupOfLocations datex2Locations;
    @XmlElement(name = "AffectedRoad")
    protected List<AffectedRoadStructure> affectedRoad;

    /**
     * Recupera il valore della proprietà datex2Locations.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfLocations }
     *     
     */
    public GroupOfLocations getDatex2Locations() {
        return datex2Locations;
    }

    /**
     * Imposta il valore della proprietà datex2Locations.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfLocations }
     *     
     */
    public void setDatex2Locations(GroupOfLocations value) {
        this.datex2Locations = value;
    }

    /**
     * Gets the value of the affectedRoad property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the affectedRoad property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAffectedRoad().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AffectedRoadStructure }
     * 
     * 
     */
    public List<AffectedRoadStructure> getAffectedRoad() {
        if (affectedRoad == null) {
            affectedRoad = new ArrayList<AffectedRoadStructure>();
        }
        return this.affectedRoad;
    }

    public AffectedRoadsStructure withDatex2Locations(GroupOfLocations value) {
        setDatex2Locations(value);
        return this;
    }

    public AffectedRoadsStructure withAffectedRoad(AffectedRoadStructure... values) {
        if (values!= null) {
            for (AffectedRoadStructure value: values) {
                getAffectedRoad().add(value);
            }
        }
        return this;
    }

    public AffectedRoadsStructure withAffectedRoad(Collection<AffectedRoadStructure> values) {
        if (values!= null) {
            getAffectedRoad().addAll(values);
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

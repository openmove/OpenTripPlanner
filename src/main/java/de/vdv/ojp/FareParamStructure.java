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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * [related to the FARE parameter model in TM and NeTEx] parameters which are used to determine the price to be paid for a FARE PRODUCT by a specific passenger.
 * 
 * <p>Classe Java per FareParamStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="FareParamStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}FareDataFilterGroup"/&gt;
 *         &lt;element name="Traveller" type="{http://www.vdv.de/ojp}FarePassengerStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareParamStructure", propOrder = {
    "fareAuthorityFilter",
    "passengerCategory",
    "travelClass",
    "traveller"
})
public class FareParamStructure {

    @XmlElement(name = "FareAuthorityFilter")
    protected List<FareAuthorityRefStructure> fareAuthorityFilter;
    @XmlElement(name = "PassengerCategory")
    @XmlSchemaType(name = "string")
    protected List<PassengerCategoryEnumeration> passengerCategory;
    @XmlElement(name = "TravelClass")
    @XmlSchemaType(name = "NMTOKEN")
    protected TypeOfFareClassEnumeration travelClass;
    @XmlElement(name = "Traveller")
    protected List<FarePassengerStructure> traveller;

    /**
     * Gets the value of the fareAuthorityFilter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareAuthorityFilter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareAuthorityFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareAuthorityRefStructure }
     * 
     * 
     */
    public List<FareAuthorityRefStructure> getFareAuthorityFilter() {
        if (fareAuthorityFilter == null) {
            fareAuthorityFilter = new ArrayList<FareAuthorityRefStructure>();
        }
        return this.fareAuthorityFilter;
    }

    /**
     * Gets the value of the passengerCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerCategoryEnumeration }
     * 
     * 
     */
    public List<PassengerCategoryEnumeration> getPassengerCategory() {
        if (passengerCategory == null) {
            passengerCategory = new ArrayList<PassengerCategoryEnumeration>();
        }
        return this.passengerCategory;
    }

    /**
     * Recupera il valore della proprietà travelClass.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfFareClassEnumeration }
     *     
     */
    public TypeOfFareClassEnumeration getTravelClass() {
        return travelClass;
    }

    /**
     * Imposta il valore della proprietà travelClass.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfFareClassEnumeration }
     *     
     */
    public void setTravelClass(TypeOfFareClassEnumeration value) {
        this.travelClass = value;
    }

    /**
     * Gets the value of the traveller property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the traveller property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTraveller().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FarePassengerStructure }
     * 
     * 
     */
    public List<FarePassengerStructure> getTraveller() {
        if (traveller == null) {
            traveller = new ArrayList<FarePassengerStructure>();
        }
        return this.traveller;
    }

    public FareParamStructure withFareAuthorityFilter(FareAuthorityRefStructure... values) {
        if (values!= null) {
            for (FareAuthorityRefStructure value: values) {
                getFareAuthorityFilter().add(value);
            }
        }
        return this;
    }

    public FareParamStructure withFareAuthorityFilter(Collection<FareAuthorityRefStructure> values) {
        if (values!= null) {
            getFareAuthorityFilter().addAll(values);
        }
        return this;
    }

    public FareParamStructure withPassengerCategory(PassengerCategoryEnumeration... values) {
        if (values!= null) {
            for (PassengerCategoryEnumeration value: values) {
                getPassengerCategory().add(value);
            }
        }
        return this;
    }

    public FareParamStructure withPassengerCategory(Collection<PassengerCategoryEnumeration> values) {
        if (values!= null) {
            getPassengerCategory().addAll(values);
        }
        return this;
    }

    public FareParamStructure withTravelClass(TypeOfFareClassEnumeration value) {
        setTravelClass(value);
        return this;
    }

    public FareParamStructure withTraveller(FarePassengerStructure... values) {
        if (values!= null) {
            for (FarePassengerStructure value: values) {
                getTraveller().add(value);
            }
        }
        return this;
    }

    public FareParamStructure withTraveller(Collection<FarePassengerStructure> values) {
        if (values!= null) {
            getTraveller().addAll(values);
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

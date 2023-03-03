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
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per EasementsStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="EasementsStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TicketRestrictions" type="{http://www.siri.org.uk/siri}TicketRestrictionEnumeration" minOccurs="0"/&gt;
 *         &lt;element name="Easement" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EasementRef" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EasementsStructure", propOrder = {
    "ticketRestrictions",
    "easement",
    "easementRef"
})
public class EasementsStructure {

    @XmlElement(name = "TicketRestrictions")
    @XmlSchemaType(name = "NMTOKEN")
    protected TicketRestrictionEnumeration ticketRestrictions;
    @XmlElement(name = "Easement")
    protected List<NaturalLanguageStringStructure> easement;
    @XmlElement(name = "EasementRef")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String easementRef;

    /**
     * Recupera il valore della proprietà ticketRestrictions.
     * 
     * @return
     *     possible object is
     *     {@link TicketRestrictionEnumeration }
     *     
     */
    public TicketRestrictionEnumeration getTicketRestrictions() {
        return ticketRestrictions;
    }

    /**
     * Imposta il valore della proprietà ticketRestrictions.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketRestrictionEnumeration }
     *     
     */
    public void setTicketRestrictions(TicketRestrictionEnumeration value) {
        this.ticketRestrictions = value;
    }

    /**
     * Gets the value of the easement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the easement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEasement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getEasement() {
        if (easement == null) {
            easement = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.easement;
    }

    /**
     * Recupera il valore della proprietà easementRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEasementRef() {
        return easementRef;
    }

    /**
     * Imposta il valore della proprietà easementRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEasementRef(String value) {
        this.easementRef = value;
    }

    public EasementsStructure withTicketRestrictions(TicketRestrictionEnumeration value) {
        setTicketRestrictions(value);
        return this;
    }

    public EasementsStructure withEasement(NaturalLanguageStringStructure... values) {
        if (values!= null) {
            for (NaturalLanguageStringStructure value: values) {
                getEasement().add(value);
            }
        }
        return this;
    }

    public EasementsStructure withEasement(Collection<NaturalLanguageStringStructure> values) {
        if (values!= null) {
            getEasement().addAll(values);
        }
        return this;
    }

    public EasementsStructure withEasementRef(String value) {
        setEasementRef(value);
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

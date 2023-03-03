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
 * <p>Classe Java per NoteStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="NoteStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}SituationRef" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}SituationSimpleRef" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}SituationFullRef" minOccurs="0"/&gt;
 *         &lt;element name="Note" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NoteStructure", propOrder = {
    "situationRef",
    "situationSimpleRef",
    "situationFullRef",
    "note"
})
public class NoteStructure {

    @XmlElement(name = "SituationRef")
    protected SituationRefStructure situationRef;
    @XmlElement(name = "SituationSimpleRef")
    protected SituationSimpleRefStructure situationSimpleRef;
    @XmlElement(name = "SituationFullRef")
    protected SituationFullRefStructure situationFullRef;
    @XmlElement(name = "Note")
    protected NaturalLanguageStringStructure note;

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
     * Recupera il valore della proprietà situationSimpleRef.
     * 
     * @return
     *     possible object is
     *     {@link SituationSimpleRefStructure }
     *     
     */
    public SituationSimpleRefStructure getSituationSimpleRef() {
        return situationSimpleRef;
    }

    /**
     * Imposta il valore della proprietà situationSimpleRef.
     * 
     * @param value
     *     allowed object is
     *     {@link SituationSimpleRefStructure }
     *     
     */
    public void setSituationSimpleRef(SituationSimpleRefStructure value) {
        this.situationSimpleRef = value;
    }

    /**
     * Recupera il valore della proprietà situationFullRef.
     * 
     * @return
     *     possible object is
     *     {@link SituationFullRefStructure }
     *     
     */
    public SituationFullRefStructure getSituationFullRef() {
        return situationFullRef;
    }

    /**
     * Imposta il valore della proprietà situationFullRef.
     * 
     * @param value
     *     allowed object is
     *     {@link SituationFullRefStructure }
     *     
     */
    public void setSituationFullRef(SituationFullRefStructure value) {
        this.situationFullRef = value;
    }

    /**
     * Recupera il valore della proprietà note.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getNote() {
        return note;
    }

    /**
     * Imposta il valore della proprietà note.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setNote(NaturalLanguageStringStructure value) {
        this.note = value;
    }

    public NoteStructure withSituationRef(SituationRefStructure value) {
        setSituationRef(value);
        return this;
    }

    public NoteStructure withSituationSimpleRef(SituationSimpleRefStructure value) {
        setSituationSimpleRef(value);
        return this;
    }

    public NoteStructure withSituationFullRef(SituationFullRefStructure value) {
        setSituationFullRef(value);
        return this;
    }

    public NoteStructure withNote(NaturalLanguageStringStructure value) {
        setNote(value);
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

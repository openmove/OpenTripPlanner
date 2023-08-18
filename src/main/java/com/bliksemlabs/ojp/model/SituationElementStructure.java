//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package com.bliksemlabs.ojp.model;

import java.time.LocalDateTime;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.LocalDateTimeISO8601XmlAdapter;
import uk.org.ifopt.ifopt.CountryRefStructure;


/**
 * <p>Classe Java per SituationElementStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SituationElementStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractSituationElementStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}SituationInfoGroup"/&gt;
 *         &lt;element name="VersionedAtTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SituationElementStructure", propOrder = {
    "references",
    "source",
    "versionedAtTime"
})
@XmlSeeAlso({
    PtSituationElementStructure.class,
    RoadSituationElementStructure.class
})
public class SituationElementStructure
    extends AbstractSituationElementStructure
{

    @XmlElement(name = "References")
    protected ReferencesStructure references;
    @XmlElement(name = "Source", required = true)
    protected SituationSourceStructure source;
    @XmlElement(name = "VersionedAtTime", type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime versionedAtTime;

    /**
     * Recupera il valore della proprietà references.
     * 
     * @return
     *     possible object is
     *     {@link ReferencesStructure }
     *     
     */
    public ReferencesStructure getReferences() {
        return references;
    }

    /**
     * Imposta il valore della proprietà references.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferencesStructure }
     *     
     */
    public void setReferences(ReferencesStructure value) {
        this.references = value;
    }

    /**
     * Recupera il valore della proprietà source.
     * 
     * @return
     *     possible object is
     *     {@link SituationSourceStructure }
     *     
     */
    public SituationSourceStructure getSource() {
        return source;
    }

    /**
     * Imposta il valore della proprietà source.
     * 
     * @param value
     *     allowed object is
     *     {@link SituationSourceStructure }
     *     
     */
    public void setSource(SituationSourceStructure value) {
        this.source = value;
    }

    /**
     * Recupera il valore della proprietà versionedAtTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getVersionedAtTime() {
        return versionedAtTime;
    }

    /**
     * Imposta il valore della proprietà versionedAtTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionedAtTime(LocalDateTime value) {
        this.versionedAtTime = value;
    }

    public SituationElementStructure withReferences(ReferencesStructure value) {
        setReferences(value);
        return this;
    }

    public SituationElementStructure withSource(SituationSourceStructure value) {
        setSource(value);
        return this;
    }

    public SituationElementStructure withVersionedAtTime(LocalDateTime value) {
        setVersionedAtTime(value);
        return this;
    }

    @Override
    public SituationElementStructure withCreationTime(LocalDateTime value) {
        setCreationTime(value);
        return this;
    }

    @Override
    public SituationElementStructure withCountryRef(CountryRefStructure value) {
        setCountryRef(value);
        return this;
    }

    @Override
    public SituationElementStructure withParticipantRef(ParticipantRefStructure value) {
        setParticipantRef(value);
        return this;
    }

    @Override
    public SituationElementStructure withSituationNumber(EntryQualifierStructure value) {
        setSituationNumber(value);
        return this;
    }

    @Override
    public SituationElementStructure withUpdateCountryRef(CountryRefStructure value) {
        setUpdateCountryRef(value);
        return this;
    }

    @Override
    public SituationElementStructure withUpdateParticipantRef(ParticipantRefStructure value) {
        setUpdateParticipantRef(value);
        return this;
    }

    @Override
    public SituationElementStructure withVersion(SituationVersion value) {
        setVersion(value);
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

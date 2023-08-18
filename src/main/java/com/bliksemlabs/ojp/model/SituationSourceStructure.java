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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import eu.datex2.schema._2_0rc1._2_0.SourceTypeEnum;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.LocalDateTimeISO8601XmlAdapter;


/**
 * <p>Classe Java per SituationSourceStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SituationSourceStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" minOccurs="0"/&gt;
 *         &lt;element name="SourceType" type="{http://www.siri.org.uk/siri}SituationSourceTypeEnumeration"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}SituationSourceDetailsGroup"/&gt;
 *         &lt;element name="SourceMethod" type="{http://datex2.eu/schema/2_0RC1/2_0}SourceTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="AgentReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" minOccurs="0"/&gt;
 *         &lt;element name="SourceRole" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TimeOfCommunication" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ExternalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SourceFile" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
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
@XmlType(name = "SituationSourceStructure", propOrder = {
    "country",
    "sourceType",
    "email",
    "phone",
    "fax",
    "web",
    "other",
    "sourceMethod",
    "agentReference",
    "name",
    "sourceRole",
    "timeOfCommunication",
    "externalCode",
    "sourceFile",
    "extensions"
})
public class SituationSourceStructure {

    @XmlElement(name = "Country")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String country;
    @XmlElement(name = "SourceType", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected SituationSourceTypeEnumeration sourceType;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "Phone")
    protected String phone;
    @XmlElement(name = "Fax")
    protected String fax;
    @XmlElement(name = "Web")
    @XmlSchemaType(name = "anyURI")
    protected String web;
    @XmlElement(name = "Other")
    protected String other;
    @XmlElement(name = "SourceMethod")
    @XmlSchemaType(name = "string")
    protected SourceTypeEnum sourceMethod;
    @XmlElement(name = "AgentReference")
    protected String agentReference;
    @XmlElement(name = "Name")
    protected NaturalLanguageStringStructure name;
    @XmlElement(name = "SourceRole")
    protected String sourceRole;
    @XmlElement(name = "TimeOfCommunication", type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime timeOfCommunication;
    @XmlElement(name = "ExternalCode")
    protected String externalCode;
    @XmlElement(name = "SourceFile")
    @XmlSchemaType(name = "anyURI")
    protected String sourceFile;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Recupera il valore della proprietà country.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Imposta il valore della proprietà country.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Recupera il valore della proprietà sourceType.
     * 
     * @return
     *     possible object is
     *     {@link SituationSourceTypeEnumeration }
     *     
     */
    public SituationSourceTypeEnumeration getSourceType() {
        return sourceType;
    }

    /**
     * Imposta il valore della proprietà sourceType.
     * 
     * @param value
     *     allowed object is
     *     {@link SituationSourceTypeEnumeration }
     *     
     */
    public void setSourceType(SituationSourceTypeEnumeration value) {
        this.sourceType = value;
    }

    /**
     * Recupera il valore della proprietà email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Imposta il valore della proprietà email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Recupera il valore della proprietà phone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Imposta il valore della proprietà phone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Recupera il valore della proprietà fax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Imposta il valore della proprietà fax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Recupera il valore della proprietà web.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeb() {
        return web;
    }

    /**
     * Imposta il valore della proprietà web.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeb(String value) {
        this.web = value;
    }

    /**
     * Recupera il valore della proprietà other.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOther() {
        return other;
    }

    /**
     * Imposta il valore della proprietà other.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOther(String value) {
        this.other = value;
    }

    /**
     * Recupera il valore della proprietà sourceMethod.
     * 
     * @return
     *     possible object is
     *     {@link SourceTypeEnum }
     *     
     */
    public SourceTypeEnum getSourceMethod() {
        return sourceMethod;
    }

    /**
     * Imposta il valore della proprietà sourceMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceTypeEnum }
     *     
     */
    public void setSourceMethod(SourceTypeEnum value) {
        this.sourceMethod = value;
    }

    /**
     * Recupera il valore della proprietà agentReference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentReference() {
        return agentReference;
    }

    /**
     * Imposta il valore della proprietà agentReference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentReference(String value) {
        this.agentReference = value;
    }

    /**
     * Recupera il valore della proprietà name.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getName() {
        return name;
    }

    /**
     * Imposta il valore della proprietà name.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setName(NaturalLanguageStringStructure value) {
        this.name = value;
    }

    /**
     * Recupera il valore della proprietà sourceRole.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceRole() {
        return sourceRole;
    }

    /**
     * Imposta il valore della proprietà sourceRole.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceRole(String value) {
        this.sourceRole = value;
    }

    /**
     * Recupera il valore della proprietà timeOfCommunication.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getTimeOfCommunication() {
        return timeOfCommunication;
    }

    /**
     * Imposta il valore della proprietà timeOfCommunication.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeOfCommunication(LocalDateTime value) {
        this.timeOfCommunication = value;
    }

    /**
     * Recupera il valore della proprietà externalCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalCode() {
        return externalCode;
    }

    /**
     * Imposta il valore della proprietà externalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalCode(String value) {
        this.externalCode = value;
    }

    /**
     * Recupera il valore della proprietà sourceFile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceFile() {
        return sourceFile;
    }

    /**
     * Imposta il valore della proprietà sourceFile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceFile(String value) {
        this.sourceFile = value;
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

    public SituationSourceStructure withCountry(String value) {
        setCountry(value);
        return this;
    }

    public SituationSourceStructure withSourceType(SituationSourceTypeEnumeration value) {
        setSourceType(value);
        return this;
    }

    public SituationSourceStructure withEmail(String value) {
        setEmail(value);
        return this;
    }

    public SituationSourceStructure withPhone(String value) {
        setPhone(value);
        return this;
    }

    public SituationSourceStructure withFax(String value) {
        setFax(value);
        return this;
    }

    public SituationSourceStructure withWeb(String value) {
        setWeb(value);
        return this;
    }

    public SituationSourceStructure withOther(String value) {
        setOther(value);
        return this;
    }

    public SituationSourceStructure withSourceMethod(SourceTypeEnum value) {
        setSourceMethod(value);
        return this;
    }

    public SituationSourceStructure withAgentReference(String value) {
        setAgentReference(value);
        return this;
    }

    public SituationSourceStructure withName(NaturalLanguageStringStructure value) {
        setName(value);
        return this;
    }

    public SituationSourceStructure withSourceRole(String value) {
        setSourceRole(value);
        return this;
    }

    public SituationSourceStructure withTimeOfCommunication(LocalDateTime value) {
        setTimeOfCommunication(value);
        return this;
    }

    public SituationSourceStructure withExternalCode(String value) {
        setExternalCode(value);
        return this;
    }

    public SituationSourceStructure withSourceFile(String value) {
        setSourceFile(value);
        return this;
    }

    public SituationSourceStructure withExtensions(ExtensionsStructure value) {
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

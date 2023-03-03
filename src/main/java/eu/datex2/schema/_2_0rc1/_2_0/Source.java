//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per Source complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Source"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sourceCountry" type="{http://datex2.eu/schema/2_0RC1/2_0}CountryEnum" minOccurs="0"/&gt;
 *         &lt;element name="sourceIdentification" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="sourceName" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="sourceType" type="{http://datex2.eu/schema/2_0RC1/2_0}SourceTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="reliable" type="{http://datex2.eu/schema/2_0RC1/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="sourceExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Source", propOrder = {
    "sourceCountry",
    "sourceIdentification",
    "sourceName",
    "sourceType",
    "reliable",
    "sourceExtension"
})
public class Source {

    @XmlSchemaType(name = "string")
    protected CountryEnum sourceCountry;
    protected String sourceIdentification;
    protected MultilingualString sourceName;
    @XmlSchemaType(name = "string")
    protected SourceTypeEnum sourceType;
    protected Boolean reliable;
    protected ExtensionType sourceExtension;

    /**
     * Recupera il valore della proprietà sourceCountry.
     * 
     * @return
     *     possible object is
     *     {@link CountryEnum }
     *     
     */
    public CountryEnum getSourceCountry() {
        return sourceCountry;
    }

    /**
     * Imposta il valore della proprietà sourceCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryEnum }
     *     
     */
    public void setSourceCountry(CountryEnum value) {
        this.sourceCountry = value;
    }

    /**
     * Recupera il valore della proprietà sourceIdentification.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceIdentification() {
        return sourceIdentification;
    }

    /**
     * Imposta il valore della proprietà sourceIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceIdentification(String value) {
        this.sourceIdentification = value;
    }

    /**
     * Recupera il valore della proprietà sourceName.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getSourceName() {
        return sourceName;
    }

    /**
     * Imposta il valore della proprietà sourceName.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setSourceName(MultilingualString value) {
        this.sourceName = value;
    }

    /**
     * Recupera il valore della proprietà sourceType.
     * 
     * @return
     *     possible object is
     *     {@link SourceTypeEnum }
     *     
     */
    public SourceTypeEnum getSourceType() {
        return sourceType;
    }

    /**
     * Imposta il valore della proprietà sourceType.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceTypeEnum }
     *     
     */
    public void setSourceType(SourceTypeEnum value) {
        this.sourceType = value;
    }

    /**
     * Recupera il valore della proprietà reliable.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReliable() {
        return reliable;
    }

    /**
     * Imposta il valore della proprietà reliable.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReliable(Boolean value) {
        this.reliable = value;
    }

    /**
     * Recupera il valore della proprietà sourceExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getSourceExtension() {
        return sourceExtension;
    }

    /**
     * Imposta il valore della proprietà sourceExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setSourceExtension(ExtensionType value) {
        this.sourceExtension = value;
    }

    public Source withSourceCountry(CountryEnum value) {
        setSourceCountry(value);
        return this;
    }

    public Source withSourceIdentification(String value) {
        setSourceIdentification(value);
        return this;
    }

    public Source withSourceName(MultilingualString value) {
        setSourceName(value);
        return this;
    }

    public Source withSourceType(SourceTypeEnum value) {
        setSourceType(value);
        return this;
    }

    public Source withReliable(Boolean value) {
        setReliable(value);
        return this;
    }

    public Source withSourceExtension(ExtensionType value) {
        setSourceExtension(value);
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

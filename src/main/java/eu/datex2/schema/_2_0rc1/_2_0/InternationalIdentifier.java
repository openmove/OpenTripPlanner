//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per InternationalIdentifier complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="InternationalIdentifier"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="country" type="{http://datex2.eu/schema/2_0RC1/2_0}CountryEnum"/&gt;
 *         &lt;element name="nationalIdentifier" type="{http://datex2.eu/schema/2_0RC1/2_0}String"/&gt;
 *         &lt;element name="internationalIdentifierExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InternationalIdentifier", propOrder = {
    "country",
    "nationalIdentifier",
    "internationalIdentifierExtension"
})
public class InternationalIdentifier {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected CountryEnum country;
    @XmlElement(required = true)
    protected String nationalIdentifier;
    protected ExtensionType internationalIdentifierExtension;

    /**
     * Recupera il valore della proprietà country.
     * 
     * @return
     *     possible object is
     *     {@link CountryEnum }
     *     
     */
    public CountryEnum getCountry() {
        return country;
    }

    /**
     * Imposta il valore della proprietà country.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryEnum }
     *     
     */
    public void setCountry(CountryEnum value) {
        this.country = value;
    }

    /**
     * Recupera il valore della proprietà nationalIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalIdentifier() {
        return nationalIdentifier;
    }

    /**
     * Imposta il valore della proprietà nationalIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalIdentifier(String value) {
        this.nationalIdentifier = value;
    }

    /**
     * Recupera il valore della proprietà internationalIdentifierExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getInternationalIdentifierExtension() {
        return internationalIdentifierExtension;
    }

    /**
     * Imposta il valore della proprietà internationalIdentifierExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setInternationalIdentifierExtension(ExtensionType value) {
        this.internationalIdentifierExtension = value;
    }

    public InternationalIdentifier withCountry(CountryEnum value) {
        setCountry(value);
        return this;
    }

    public InternationalIdentifier withNationalIdentifier(String value) {
        setNationalIdentifier(value);
        return this;
    }

    public InternationalIdentifier withInternationalIdentifierExtension(ExtensionType value) {
        setInternationalIdentifierExtension(value);
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

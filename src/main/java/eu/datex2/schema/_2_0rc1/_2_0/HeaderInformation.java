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
 * <p>Classe Java per HeaderInformation complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="HeaderInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="areaOfInterest" type="{http://datex2.eu/schema/2_0RC1/2_0}AreaOfInterestEnum" minOccurs="0"/&gt;
 *         &lt;element name="confidentiality" type="{http://datex2.eu/schema/2_0RC1/2_0}ConfidentialityValueEnum"/&gt;
 *         &lt;element name="informationStatus" type="{http://datex2.eu/schema/2_0RC1/2_0}InformationStatusEnum"/&gt;
 *         &lt;element name="urgency" type="{http://datex2.eu/schema/2_0RC1/2_0}UrgencyEnum" minOccurs="0"/&gt;
 *         &lt;element name="headerInformationExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeaderInformation", propOrder = {
    "areaOfInterest",
    "confidentiality",
    "informationStatus",
    "urgency",
    "headerInformationExtension"
})
public class HeaderInformation {

    @XmlSchemaType(name = "string")
    protected AreaOfInterestEnum areaOfInterest;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ConfidentialityValueEnum confidentiality;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected InformationStatusEnum informationStatus;
    @XmlSchemaType(name = "string")
    protected UrgencyEnum urgency;
    protected ExtensionType headerInformationExtension;

    /**
     * Recupera il valore della proprietà areaOfInterest.
     * 
     * @return
     *     possible object is
     *     {@link AreaOfInterestEnum }
     *     
     */
    public AreaOfInterestEnum getAreaOfInterest() {
        return areaOfInterest;
    }

    /**
     * Imposta il valore della proprietà areaOfInterest.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaOfInterestEnum }
     *     
     */
    public void setAreaOfInterest(AreaOfInterestEnum value) {
        this.areaOfInterest = value;
    }

    /**
     * Recupera il valore della proprietà confidentiality.
     * 
     * @return
     *     possible object is
     *     {@link ConfidentialityValueEnum }
     *     
     */
    public ConfidentialityValueEnum getConfidentiality() {
        return confidentiality;
    }

    /**
     * Imposta il valore della proprietà confidentiality.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfidentialityValueEnum }
     *     
     */
    public void setConfidentiality(ConfidentialityValueEnum value) {
        this.confidentiality = value;
    }

    /**
     * Recupera il valore della proprietà informationStatus.
     * 
     * @return
     *     possible object is
     *     {@link InformationStatusEnum }
     *     
     */
    public InformationStatusEnum getInformationStatus() {
        return informationStatus;
    }

    /**
     * Imposta il valore della proprietà informationStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationStatusEnum }
     *     
     */
    public void setInformationStatus(InformationStatusEnum value) {
        this.informationStatus = value;
    }

    /**
     * Recupera il valore della proprietà urgency.
     * 
     * @return
     *     possible object is
     *     {@link UrgencyEnum }
     *     
     */
    public UrgencyEnum getUrgency() {
        return urgency;
    }

    /**
     * Imposta il valore della proprietà urgency.
     * 
     * @param value
     *     allowed object is
     *     {@link UrgencyEnum }
     *     
     */
    public void setUrgency(UrgencyEnum value) {
        this.urgency = value;
    }

    /**
     * Recupera il valore della proprietà headerInformationExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getHeaderInformationExtension() {
        return headerInformationExtension;
    }

    /**
     * Imposta il valore della proprietà headerInformationExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setHeaderInformationExtension(ExtensionType value) {
        this.headerInformationExtension = value;
    }

    public HeaderInformation withAreaOfInterest(AreaOfInterestEnum value) {
        setAreaOfInterest(value);
        return this;
    }

    public HeaderInformation withConfidentiality(ConfidentialityValueEnum value) {
        setConfidentiality(value);
        return this;
    }

    public HeaderInformation withInformationStatus(InformationStatusEnum value) {
        setInformationStatus(value);
        return this;
    }

    public HeaderInformation withUrgency(UrgencyEnum value) {
        setUrgency(value);
        return this;
    }

    public HeaderInformation withHeaderInformationExtension(ExtensionType value) {
        setHeaderInformationExtension(value);
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

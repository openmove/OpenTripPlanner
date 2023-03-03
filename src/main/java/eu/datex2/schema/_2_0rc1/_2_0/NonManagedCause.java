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
 * <p>Classe Java per NonManagedCause complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="NonManagedCause"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}Cause"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="causeDescription" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="causeType" type="{http://datex2.eu/schema/2_0RC1/2_0}CauseTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="nonManagedCauseExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonManagedCause", propOrder = {
    "causeDescription",
    "causeType",
    "nonManagedCauseExtension"
})
public class NonManagedCause
    extends Cause
{

    protected MultilingualString causeDescription;
    @XmlSchemaType(name = "string")
    protected CauseTypeEnum causeType;
    protected ExtensionType nonManagedCauseExtension;

    /**
     * Recupera il valore della proprietà causeDescription.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getCauseDescription() {
        return causeDescription;
    }

    /**
     * Imposta il valore della proprietà causeDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setCauseDescription(MultilingualString value) {
        this.causeDescription = value;
    }

    /**
     * Recupera il valore della proprietà causeType.
     * 
     * @return
     *     possible object is
     *     {@link CauseTypeEnum }
     *     
     */
    public CauseTypeEnum getCauseType() {
        return causeType;
    }

    /**
     * Imposta il valore della proprietà causeType.
     * 
     * @param value
     *     allowed object is
     *     {@link CauseTypeEnum }
     *     
     */
    public void setCauseType(CauseTypeEnum value) {
        this.causeType = value;
    }

    /**
     * Recupera il valore della proprietà nonManagedCauseExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getNonManagedCauseExtension() {
        return nonManagedCauseExtension;
    }

    /**
     * Imposta il valore della proprietà nonManagedCauseExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setNonManagedCauseExtension(ExtensionType value) {
        this.nonManagedCauseExtension = value;
    }

    public NonManagedCause withCauseDescription(MultilingualString value) {
        setCauseDescription(value);
        return this;
    }

    public NonManagedCause withCauseType(CauseTypeEnum value) {
        setCauseType(value);
        return this;
    }

    public NonManagedCause withNonManagedCauseExtension(ExtensionType value) {
        setNonManagedCauseExtension(value);
        return this;
    }

    @Override
    public NonManagedCause withCauseExtension(ExtensionType value) {
        setCauseExtension(value);
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

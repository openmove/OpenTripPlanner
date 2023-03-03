//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per AxleSpacing complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AxleSpacing"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="axleSpacing" type="{http://datex2.eu/schema/2_0RC1/2_0}MetresAsFloat"/&gt;
 *         &lt;element name="axleSpacingSequenceIdentifier" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger"/&gt;
 *         &lt;element name="axleSpacingExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AxleSpacing", propOrder = {
    "axleSpacing",
    "axleSpacingSequenceIdentifier",
    "axleSpacingExtension"
})
public class AxleSpacing {

    protected float axleSpacing;
    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger axleSpacingSequenceIdentifier;
    protected ExtensionType axleSpacingExtension;

    /**
     * Recupera il valore della proprietà axleSpacing.
     * 
     */
    public float getAxleSpacing() {
        return axleSpacing;
    }

    /**
     * Imposta il valore della proprietà axleSpacing.
     * 
     */
    public void setAxleSpacing(float value) {
        this.axleSpacing = value;
    }

    /**
     * Recupera il valore della proprietà axleSpacingSequenceIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAxleSpacingSequenceIdentifier() {
        return axleSpacingSequenceIdentifier;
    }

    /**
     * Imposta il valore della proprietà axleSpacingSequenceIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAxleSpacingSequenceIdentifier(BigInteger value) {
        this.axleSpacingSequenceIdentifier = value;
    }

    /**
     * Recupera il valore della proprietà axleSpacingExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getAxleSpacingExtension() {
        return axleSpacingExtension;
    }

    /**
     * Imposta il valore della proprietà axleSpacingExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setAxleSpacingExtension(ExtensionType value) {
        this.axleSpacingExtension = value;
    }

    public AxleSpacing withAxleSpacing(float value) {
        setAxleSpacing(value);
        return this;
    }

    public AxleSpacing withAxleSpacingSequenceIdentifier(BigInteger value) {
        setAxleSpacingSequenceIdentifier(value);
        return this;
    }

    public AxleSpacing withAxleSpacingExtension(ExtensionType value) {
        setAxleSpacingExtension(value);
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

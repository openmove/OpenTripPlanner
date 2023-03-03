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
 * <p>Classe Java per HeaviestAxleWeightCharacteristic complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="HeaviestAxleWeightCharacteristic"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="comparisonOperator" type="{http://datex2.eu/schema/2_0RC1/2_0}ComparisonOperatorEnum"/&gt;
 *         &lt;element name="heaviestAxleWeight" type="{http://datex2.eu/schema/2_0RC1/2_0}Tonnes"/&gt;
 *         &lt;element name="heaviestAxleWeightCharacteristicExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeaviestAxleWeightCharacteristic", propOrder = {
    "comparisonOperator",
    "heaviestAxleWeight",
    "heaviestAxleWeightCharacteristicExtension"
})
public class HeaviestAxleWeightCharacteristic {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ComparisonOperatorEnum comparisonOperator;
    protected float heaviestAxleWeight;
    protected ExtensionType heaviestAxleWeightCharacteristicExtension;

    /**
     * Recupera il valore della proprietà comparisonOperator.
     * 
     * @return
     *     possible object is
     *     {@link ComparisonOperatorEnum }
     *     
     */
    public ComparisonOperatorEnum getComparisonOperator() {
        return comparisonOperator;
    }

    /**
     * Imposta il valore della proprietà comparisonOperator.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparisonOperatorEnum }
     *     
     */
    public void setComparisonOperator(ComparisonOperatorEnum value) {
        this.comparisonOperator = value;
    }

    /**
     * Recupera il valore della proprietà heaviestAxleWeight.
     * 
     */
    public float getHeaviestAxleWeight() {
        return heaviestAxleWeight;
    }

    /**
     * Imposta il valore della proprietà heaviestAxleWeight.
     * 
     */
    public void setHeaviestAxleWeight(float value) {
        this.heaviestAxleWeight = value;
    }

    /**
     * Recupera il valore della proprietà heaviestAxleWeightCharacteristicExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getHeaviestAxleWeightCharacteristicExtension() {
        return heaviestAxleWeightCharacteristicExtension;
    }

    /**
     * Imposta il valore della proprietà heaviestAxleWeightCharacteristicExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setHeaviestAxleWeightCharacteristicExtension(ExtensionType value) {
        this.heaviestAxleWeightCharacteristicExtension = value;
    }

    public HeaviestAxleWeightCharacteristic withComparisonOperator(ComparisonOperatorEnum value) {
        setComparisonOperator(value);
        return this;
    }

    public HeaviestAxleWeightCharacteristic withHeaviestAxleWeight(float value) {
        setHeaviestAxleWeight(value);
        return this;
    }

    public HeaviestAxleWeightCharacteristic withHeaviestAxleWeightCharacteristicExtension(ExtensionType value) {
        setHeaviestAxleWeightCharacteristicExtension(value);
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

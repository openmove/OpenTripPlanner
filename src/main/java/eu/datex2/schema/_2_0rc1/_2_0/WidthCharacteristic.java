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
 * <p>Classe Java per WidthCharacteristic complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="WidthCharacteristic"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="comparisonOperator" type="{http://datex2.eu/schema/2_0RC1/2_0}ComparisonOperatorEnum"/&gt;
 *         &lt;element name="vehicleWidth" type="{http://datex2.eu/schema/2_0RC1/2_0}MetresAsFloat"/&gt;
 *         &lt;element name="widthCharacteristicExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WidthCharacteristic", propOrder = {
    "comparisonOperator",
    "vehicleWidth",
    "widthCharacteristicExtension"
})
public class WidthCharacteristic {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ComparisonOperatorEnum comparisonOperator;
    protected float vehicleWidth;
    protected ExtensionType widthCharacteristicExtension;

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
     * Recupera il valore della proprietà vehicleWidth.
     * 
     */
    public float getVehicleWidth() {
        return vehicleWidth;
    }

    /**
     * Imposta il valore della proprietà vehicleWidth.
     * 
     */
    public void setVehicleWidth(float value) {
        this.vehicleWidth = value;
    }

    /**
     * Recupera il valore della proprietà widthCharacteristicExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getWidthCharacteristicExtension() {
        return widthCharacteristicExtension;
    }

    /**
     * Imposta il valore della proprietà widthCharacteristicExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setWidthCharacteristicExtension(ExtensionType value) {
        this.widthCharacteristicExtension = value;
    }

    public WidthCharacteristic withComparisonOperator(ComparisonOperatorEnum value) {
        setComparisonOperator(value);
        return this;
    }

    public WidthCharacteristic withVehicleWidth(float value) {
        setVehicleWidth(value);
        return this;
    }

    public WidthCharacteristic withWidthCharacteristicExtension(ExtensionType value) {
        setWidthCharacteristicExtension(value);
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

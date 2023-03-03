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
 * <p>Classe Java per PollutionMeasurement complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PollutionMeasurement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pollutantConcentration" type="{http://datex2.eu/schema/2_0RC1/2_0}ConcentrationMicrogramsPerCubicMetre"/&gt;
 *         &lt;element name="pollutantType" type="{http://datex2.eu/schema/2_0RC1/2_0}PollutantTypeEnum"/&gt;
 *         &lt;element name="pollutionMeasurementExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PollutionMeasurement", propOrder = {
    "pollutantConcentration",
    "pollutantType",
    "pollutionMeasurementExtension"
})
public class PollutionMeasurement {

    protected float pollutantConcentration;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected PollutantTypeEnum pollutantType;
    protected ExtensionType pollutionMeasurementExtension;

    /**
     * Recupera il valore della proprietà pollutantConcentration.
     * 
     */
    public float getPollutantConcentration() {
        return pollutantConcentration;
    }

    /**
     * Imposta il valore della proprietà pollutantConcentration.
     * 
     */
    public void setPollutantConcentration(float value) {
        this.pollutantConcentration = value;
    }

    /**
     * Recupera il valore della proprietà pollutantType.
     * 
     * @return
     *     possible object is
     *     {@link PollutantTypeEnum }
     *     
     */
    public PollutantTypeEnum getPollutantType() {
        return pollutantType;
    }

    /**
     * Imposta il valore della proprietà pollutantType.
     * 
     * @param value
     *     allowed object is
     *     {@link PollutantTypeEnum }
     *     
     */
    public void setPollutantType(PollutantTypeEnum value) {
        this.pollutantType = value;
    }

    /**
     * Recupera il valore della proprietà pollutionMeasurementExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPollutionMeasurementExtension() {
        return pollutionMeasurementExtension;
    }

    /**
     * Imposta il valore della proprietà pollutionMeasurementExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPollutionMeasurementExtension(ExtensionType value) {
        this.pollutionMeasurementExtension = value;
    }

    public PollutionMeasurement withPollutantConcentration(float value) {
        setPollutantConcentration(value);
        return this;
    }

    public PollutionMeasurement withPollutantType(PollutantTypeEnum value) {
        setPollutantType(value);
        return this;
    }

    public PollutionMeasurement withPollutionMeasurementExtension(ExtensionType value) {
        setPollutionMeasurementExtension(value);
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

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
 * <p>Classe Java per LocationCharacteristicsOverride complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="LocationCharacteristicsOverride"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="measurementLanesOverride" type="{http://datex2.eu/schema/2_0RC1/2_0}LaneEnum" minOccurs="0"/&gt;
 *         &lt;element name="reversedFlow" type="{http://datex2.eu/schema/2_0RC1/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="locationCharacteristicsOverrideExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationCharacteristicsOverride", propOrder = {
    "measurementLanesOverride",
    "reversedFlow",
    "locationCharacteristicsOverrideExtension"
})
public class LocationCharacteristicsOverride {

    @XmlSchemaType(name = "string")
    protected LaneEnum measurementLanesOverride;
    protected Boolean reversedFlow;
    protected ExtensionType locationCharacteristicsOverrideExtension;

    /**
     * Recupera il valore della proprietà measurementLanesOverride.
     * 
     * @return
     *     possible object is
     *     {@link LaneEnum }
     *     
     */
    public LaneEnum getMeasurementLanesOverride() {
        return measurementLanesOverride;
    }

    /**
     * Imposta il valore della proprietà measurementLanesOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link LaneEnum }
     *     
     */
    public void setMeasurementLanesOverride(LaneEnum value) {
        this.measurementLanesOverride = value;
    }

    /**
     * Recupera il valore della proprietà reversedFlow.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReversedFlow() {
        return reversedFlow;
    }

    /**
     * Imposta il valore della proprietà reversedFlow.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReversedFlow(Boolean value) {
        this.reversedFlow = value;
    }

    /**
     * Recupera il valore della proprietà locationCharacteristicsOverrideExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getLocationCharacteristicsOverrideExtension() {
        return locationCharacteristicsOverrideExtension;
    }

    /**
     * Imposta il valore della proprietà locationCharacteristicsOverrideExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setLocationCharacteristicsOverrideExtension(ExtensionType value) {
        this.locationCharacteristicsOverrideExtension = value;
    }

    public LocationCharacteristicsOverride withMeasurementLanesOverride(LaneEnum value) {
        setMeasurementLanesOverride(value);
        return this;
    }

    public LocationCharacteristicsOverride withReversedFlow(Boolean value) {
        setReversedFlow(value);
        return this;
    }

    public LocationCharacteristicsOverride withLocationCharacteristicsOverrideExtension(ExtensionType value) {
        setLocationCharacteristicsOverrideExtension(value);
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

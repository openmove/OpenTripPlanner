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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per MeasuredValue complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="MeasuredValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="measurementEquipmentTypeUsed" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="locationCharacteristicsOverride" type="{http://datex2.eu/schema/2_0RC1/2_0}LocationCharacteristicsOverride" minOccurs="0"/&gt;
 *         &lt;element name="basicDataValue" type="{http://datex2.eu/schema/2_0RC1/2_0}BasicDataValue"/&gt;
 *         &lt;element name="measuredValueExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasuredValue", propOrder = {
    "measurementEquipmentTypeUsed",
    "locationCharacteristicsOverride",
    "basicDataValue",
    "measuredValueExtension"
})
@XmlSeeAlso({
    eu.datex2.schema._2_0rc1._2_0.SiteMeasurements.MeasuredValue.class
})
public class MeasuredValue {

    protected MultilingualString measurementEquipmentTypeUsed;
    protected LocationCharacteristicsOverride locationCharacteristicsOverride;
    @XmlElement(required = true)
    protected BasicDataValue basicDataValue;
    protected ExtensionType measuredValueExtension;

    /**
     * Recupera il valore della proprietà measurementEquipmentTypeUsed.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getMeasurementEquipmentTypeUsed() {
        return measurementEquipmentTypeUsed;
    }

    /**
     * Imposta il valore della proprietà measurementEquipmentTypeUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setMeasurementEquipmentTypeUsed(MultilingualString value) {
        this.measurementEquipmentTypeUsed = value;
    }

    /**
     * Recupera il valore della proprietà locationCharacteristicsOverride.
     * 
     * @return
     *     possible object is
     *     {@link LocationCharacteristicsOverride }
     *     
     */
    public LocationCharacteristicsOverride getLocationCharacteristicsOverride() {
        return locationCharacteristicsOverride;
    }

    /**
     * Imposta il valore della proprietà locationCharacteristicsOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationCharacteristicsOverride }
     *     
     */
    public void setLocationCharacteristicsOverride(LocationCharacteristicsOverride value) {
        this.locationCharacteristicsOverride = value;
    }

    /**
     * Recupera il valore della proprietà basicDataValue.
     * 
     * @return
     *     possible object is
     *     {@link BasicDataValue }
     *     
     */
    public BasicDataValue getBasicDataValue() {
        return basicDataValue;
    }

    /**
     * Imposta il valore della proprietà basicDataValue.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicDataValue }
     *     
     */
    public void setBasicDataValue(BasicDataValue value) {
        this.basicDataValue = value;
    }

    /**
     * Recupera il valore della proprietà measuredValueExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getMeasuredValueExtension() {
        return measuredValueExtension;
    }

    /**
     * Imposta il valore della proprietà measuredValueExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setMeasuredValueExtension(ExtensionType value) {
        this.measuredValueExtension = value;
    }

    public MeasuredValue withMeasurementEquipmentTypeUsed(MultilingualString value) {
        setMeasurementEquipmentTypeUsed(value);
        return this;
    }

    public MeasuredValue withLocationCharacteristicsOverride(LocationCharacteristicsOverride value) {
        setLocationCharacteristicsOverride(value);
        return this;
    }

    public MeasuredValue withBasicDataValue(BasicDataValue value) {
        setBasicDataValue(value);
        return this;
    }

    public MeasuredValue withMeasuredValueExtension(ExtensionType value) {
        setMeasuredValueExtension(value);
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

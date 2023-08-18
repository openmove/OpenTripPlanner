//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.LocalDateTimeISO8601XmlAdapter;


/**
 * <p>Classe Java per SiteMeasurements complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SiteMeasurements"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="measurementSiteReference" type="{http://datex2.eu/schema/2_0RC1/2_0}Reference"/&gt;
 *         &lt;element name="measurementTimeDefault" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime"/&gt;
 *         &lt;element name="measuredValue" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}MeasuredValue"&gt;
 *                 &lt;attribute name="index" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="siteMeasurementsExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiteMeasurements", propOrder = {
    "measurementSiteReference",
    "measurementTimeDefault",
    "measuredValue",
    "siteMeasurementsExtension"
})
public class SiteMeasurements {

    @XmlElement(required = true)
    protected String measurementSiteReference;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime measurementTimeDefault;
    @XmlElement(required = true)
    protected List<SiteMeasurements.MeasuredValue> measuredValue;
    protected ExtensionType siteMeasurementsExtension;

    /**
     * Recupera il valore della proprietà measurementSiteReference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasurementSiteReference() {
        return measurementSiteReference;
    }

    /**
     * Imposta il valore della proprietà measurementSiteReference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasurementSiteReference(String value) {
        this.measurementSiteReference = value;
    }

    /**
     * Recupera il valore della proprietà measurementTimeDefault.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getMeasurementTimeDefault() {
        return measurementTimeDefault;
    }

    /**
     * Imposta il valore della proprietà measurementTimeDefault.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasurementTimeDefault(LocalDateTime value) {
        this.measurementTimeDefault = value;
    }

    /**
     * Gets the value of the measuredValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the measuredValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasuredValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SiteMeasurements.MeasuredValue }
     * 
     * 
     */
    public List<SiteMeasurements.MeasuredValue> getMeasuredValue() {
        if (measuredValue == null) {
            measuredValue = new ArrayList<SiteMeasurements.MeasuredValue>();
        }
        return this.measuredValue;
    }

    /**
     * Recupera il valore della proprietà siteMeasurementsExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getSiteMeasurementsExtension() {
        return siteMeasurementsExtension;
    }

    /**
     * Imposta il valore della proprietà siteMeasurementsExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setSiteMeasurementsExtension(ExtensionType value) {
        this.siteMeasurementsExtension = value;
    }

    public SiteMeasurements withMeasurementSiteReference(String value) {
        setMeasurementSiteReference(value);
        return this;
    }

    public SiteMeasurements withMeasurementTimeDefault(LocalDateTime value) {
        setMeasurementTimeDefault(value);
        return this;
    }

    public SiteMeasurements withMeasuredValue(SiteMeasurements.MeasuredValue... values) {
        if (values!= null) {
            for (SiteMeasurements.MeasuredValue value: values) {
                getMeasuredValue().add(value);
            }
        }
        return this;
    }

    public SiteMeasurements withMeasuredValue(Collection<SiteMeasurements.MeasuredValue> values) {
        if (values!= null) {
            getMeasuredValue().addAll(values);
        }
        return this;
    }

    public SiteMeasurements withSiteMeasurementsExtension(ExtensionType value) {
        setSiteMeasurementsExtension(value);
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


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}MeasuredValue"&gt;
     *       &lt;attribute name="index" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MeasuredValue
        extends eu.datex2.schema._2_0rc1._2_0.MeasuredValue
    {

        @XmlAttribute(name = "index", required = true)
        protected int index;

        /**
         * Recupera il valore della proprietà index.
         * 
         */
        public int getIndex() {
            return index;
        }

        /**
         * Imposta il valore della proprietà index.
         * 
         */
        public void setIndex(int value) {
            this.index = value;
        }

        public SiteMeasurements.MeasuredValue withIndex(int value) {
            setIndex(value);
            return this;
        }

        @Override
        public SiteMeasurements.MeasuredValue withMeasurementEquipmentTypeUsed(MultilingualString value) {
            setMeasurementEquipmentTypeUsed(value);
            return this;
        }

        @Override
        public SiteMeasurements.MeasuredValue withLocationCharacteristicsOverride(LocationCharacteristicsOverride value) {
            setLocationCharacteristicsOverride(value);
            return this;
        }

        @Override
        public SiteMeasurements.MeasuredValue withBasicDataValue(BasicDataValue value) {
            setBasicDataValue(value);
            return this;
        }

        @Override
        public SiteMeasurements.MeasuredValue withMeasuredValueExtension(ExtensionType value) {
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

}

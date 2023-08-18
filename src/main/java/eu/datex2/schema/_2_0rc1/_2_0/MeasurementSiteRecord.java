//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.LocalDateTimeISO8601XmlAdapter;


/**
 * <p>Classe Java per MeasurementSiteRecord complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="MeasurementSiteRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="measurementSiteRecordVersion" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="measurementSiteRecordVersionTime" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="computationMethod" type="{http://datex2.eu/schema/2_0RC1/2_0}ComputationMethodEnum" minOccurs="0"/&gt;
 *         &lt;element name="measurementEquipmentReference" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="measurementEquipmentTypeUsed" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="measurementSiteName" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="measurementSiteNumberOfLanes" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="measurementSiteIdentification" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="measurementSide" type="{http://datex2.eu/schema/2_0RC1/2_0}DirectionEnum" minOccurs="0"/&gt;
 *         &lt;element name="measurementSpecificCharacteristics" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}MeasurementSpecificCharacteristics"&gt;
 *                 &lt;attribute name="index" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="measurementSiteLocation" type="{http://datex2.eu/schema/2_0RC1/2_0}Location"/&gt;
 *         &lt;element name="measurementSiteRecordExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasurementSiteRecord", propOrder = {
    "measurementSiteRecordVersion",
    "measurementSiteRecordVersionTime",
    "computationMethod",
    "measurementEquipmentReference",
    "measurementEquipmentTypeUsed",
    "measurementSiteName",
    "measurementSiteNumberOfLanes",
    "measurementSiteIdentification",
    "measurementSide",
    "measurementSpecificCharacteristics",
    "measurementSiteLocation",
    "measurementSiteRecordExtension"
})
public class MeasurementSiteRecord {

    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger measurementSiteRecordVersion;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime measurementSiteRecordVersionTime;
    @XmlSchemaType(name = "string")
    protected ComputationMethodEnum computationMethod;
    protected String measurementEquipmentReference;
    protected MultilingualString measurementEquipmentTypeUsed;
    protected MultilingualString measurementSiteName;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger measurementSiteNumberOfLanes;
    protected String measurementSiteIdentification;
    @XmlSchemaType(name = "string")
    protected DirectionEnum measurementSide;
    @XmlElement(required = true)
    protected List<MeasurementSiteRecord.MeasurementSpecificCharacteristics> measurementSpecificCharacteristics;
    @XmlElement(required = true)
    protected Location measurementSiteLocation;
    protected ExtensionType measurementSiteRecordExtension;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Recupera il valore della proprietà measurementSiteRecordVersion.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMeasurementSiteRecordVersion() {
        return measurementSiteRecordVersion;
    }

    /**
     * Imposta il valore della proprietà measurementSiteRecordVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMeasurementSiteRecordVersion(BigInteger value) {
        this.measurementSiteRecordVersion = value;
    }

    /**
     * Recupera il valore della proprietà measurementSiteRecordVersionTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getMeasurementSiteRecordVersionTime() {
        return measurementSiteRecordVersionTime;
    }

    /**
     * Imposta il valore della proprietà measurementSiteRecordVersionTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasurementSiteRecordVersionTime(LocalDateTime value) {
        this.measurementSiteRecordVersionTime = value;
    }

    /**
     * Recupera il valore della proprietà computationMethod.
     * 
     * @return
     *     possible object is
     *     {@link ComputationMethodEnum }
     *     
     */
    public ComputationMethodEnum getComputationMethod() {
        return computationMethod;
    }

    /**
     * Imposta il valore della proprietà computationMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link ComputationMethodEnum }
     *     
     */
    public void setComputationMethod(ComputationMethodEnum value) {
        this.computationMethod = value;
    }

    /**
     * Recupera il valore della proprietà measurementEquipmentReference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasurementEquipmentReference() {
        return measurementEquipmentReference;
    }

    /**
     * Imposta il valore della proprietà measurementEquipmentReference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasurementEquipmentReference(String value) {
        this.measurementEquipmentReference = value;
    }

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
     * Recupera il valore della proprietà measurementSiteName.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getMeasurementSiteName() {
        return measurementSiteName;
    }

    /**
     * Imposta il valore della proprietà measurementSiteName.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setMeasurementSiteName(MultilingualString value) {
        this.measurementSiteName = value;
    }

    /**
     * Recupera il valore della proprietà measurementSiteNumberOfLanes.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMeasurementSiteNumberOfLanes() {
        return measurementSiteNumberOfLanes;
    }

    /**
     * Imposta il valore della proprietà measurementSiteNumberOfLanes.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMeasurementSiteNumberOfLanes(BigInteger value) {
        this.measurementSiteNumberOfLanes = value;
    }

    /**
     * Recupera il valore della proprietà measurementSiteIdentification.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasurementSiteIdentification() {
        return measurementSiteIdentification;
    }

    /**
     * Imposta il valore della proprietà measurementSiteIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasurementSiteIdentification(String value) {
        this.measurementSiteIdentification = value;
    }

    /**
     * Recupera il valore della proprietà measurementSide.
     * 
     * @return
     *     possible object is
     *     {@link DirectionEnum }
     *     
     */
    public DirectionEnum getMeasurementSide() {
        return measurementSide;
    }

    /**
     * Imposta il valore della proprietà measurementSide.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionEnum }
     *     
     */
    public void setMeasurementSide(DirectionEnum value) {
        this.measurementSide = value;
    }

    /**
     * Gets the value of the measurementSpecificCharacteristics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the measurementSpecificCharacteristics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasurementSpecificCharacteristics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementSiteRecord.MeasurementSpecificCharacteristics }
     * 
     * 
     */
    public List<MeasurementSiteRecord.MeasurementSpecificCharacteristics> getMeasurementSpecificCharacteristics() {
        if (measurementSpecificCharacteristics == null) {
            measurementSpecificCharacteristics = new ArrayList<MeasurementSiteRecord.MeasurementSpecificCharacteristics>();
        }
        return this.measurementSpecificCharacteristics;
    }

    /**
     * Recupera il valore della proprietà measurementSiteLocation.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getMeasurementSiteLocation() {
        return measurementSiteLocation;
    }

    /**
     * Imposta il valore della proprietà measurementSiteLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setMeasurementSiteLocation(Location value) {
        this.measurementSiteLocation = value;
    }

    /**
     * Recupera il valore della proprietà measurementSiteRecordExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getMeasurementSiteRecordExtension() {
        return measurementSiteRecordExtension;
    }

    /**
     * Imposta il valore della proprietà measurementSiteRecordExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setMeasurementSiteRecordExtension(ExtensionType value) {
        this.measurementSiteRecordExtension = value;
    }

    /**
     * Recupera il valore della proprietà id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Imposta il valore della proprietà id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    public MeasurementSiteRecord withMeasurementSiteRecordVersion(BigInteger value) {
        setMeasurementSiteRecordVersion(value);
        return this;
    }

    public MeasurementSiteRecord withMeasurementSiteRecordVersionTime(LocalDateTime value) {
        setMeasurementSiteRecordVersionTime(value);
        return this;
    }

    public MeasurementSiteRecord withComputationMethod(ComputationMethodEnum value) {
        setComputationMethod(value);
        return this;
    }

    public MeasurementSiteRecord withMeasurementEquipmentReference(String value) {
        setMeasurementEquipmentReference(value);
        return this;
    }

    public MeasurementSiteRecord withMeasurementEquipmentTypeUsed(MultilingualString value) {
        setMeasurementEquipmentTypeUsed(value);
        return this;
    }

    public MeasurementSiteRecord withMeasurementSiteName(MultilingualString value) {
        setMeasurementSiteName(value);
        return this;
    }

    public MeasurementSiteRecord withMeasurementSiteNumberOfLanes(BigInteger value) {
        setMeasurementSiteNumberOfLanes(value);
        return this;
    }

    public MeasurementSiteRecord withMeasurementSiteIdentification(String value) {
        setMeasurementSiteIdentification(value);
        return this;
    }

    public MeasurementSiteRecord withMeasurementSide(DirectionEnum value) {
        setMeasurementSide(value);
        return this;
    }

    public MeasurementSiteRecord withMeasurementSpecificCharacteristics(MeasurementSiteRecord.MeasurementSpecificCharacteristics... values) {
        if (values!= null) {
            for (MeasurementSiteRecord.MeasurementSpecificCharacteristics value: values) {
                getMeasurementSpecificCharacteristics().add(value);
            }
        }
        return this;
    }

    public MeasurementSiteRecord withMeasurementSpecificCharacteristics(Collection<MeasurementSiteRecord.MeasurementSpecificCharacteristics> values) {
        if (values!= null) {
            getMeasurementSpecificCharacteristics().addAll(values);
        }
        return this;
    }

    public MeasurementSiteRecord withMeasurementSiteLocation(Location value) {
        setMeasurementSiteLocation(value);
        return this;
    }

    public MeasurementSiteRecord withMeasurementSiteRecordExtension(ExtensionType value) {
        setMeasurementSiteRecordExtension(value);
        return this;
    }

    public MeasurementSiteRecord withId(String value) {
        setId(value);
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
     *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}MeasurementSpecificCharacteristics"&gt;
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
    public static class MeasurementSpecificCharacteristics
        extends eu.datex2.schema._2_0rc1._2_0.MeasurementSpecificCharacteristics
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

        public MeasurementSiteRecord.MeasurementSpecificCharacteristics withIndex(int value) {
            setIndex(value);
            return this;
        }

        @Override
        public MeasurementSiteRecord.MeasurementSpecificCharacteristics withAccuracy(Float value) {
            setAccuracy(value);
            return this;
        }

        @Override
        public MeasurementSiteRecord.MeasurementSpecificCharacteristics withPeriod(Float value) {
            setPeriod(value);
            return this;
        }

        @Override
        public MeasurementSiteRecord.MeasurementSpecificCharacteristics withSmoothingFactor(Float value) {
            setSmoothingFactor(value);
            return this;
        }

        @Override
        public MeasurementSiteRecord.MeasurementSpecificCharacteristics withSpecificLane(LaneEnum value) {
            setSpecificLane(value);
            return this;
        }

        @Override
        public MeasurementSiteRecord.MeasurementSpecificCharacteristics withSpecificMeasurementValueType(MeasuredOrDerivedDataTypeEnum value) {
            setSpecificMeasurementValueType(value);
            return this;
        }

        @Override
        public MeasurementSiteRecord.MeasurementSpecificCharacteristics withSpecificVehicleCharacteristics(VehicleCharacteristics value) {
            setSpecificVehicleCharacteristics(value);
            return this;
        }

        @Override
        public MeasurementSiteRecord.MeasurementSpecificCharacteristics withMeasurementSpecificCharacteristicsExtension(ExtensionType value) {
            setMeasurementSpecificCharacteristicsExtension(value);
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

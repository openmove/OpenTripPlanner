//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import java.math.BigInteger;
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


/**
 * <p>Classe Java per MeasurementSiteTable complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="MeasurementSiteTable"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="measurementSiteTableIdentification" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="measurementSiteTableVersion" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="measurementSiteRecord" type="{http://datex2.eu/schema/2_0RC1/2_0}MeasurementSiteRecord" maxOccurs="unbounded"/&gt;
 *         &lt;element name="measurementSiteTableExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
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
@XmlType(name = "MeasurementSiteTable", propOrder = {
    "measurementSiteTableIdentification",
    "measurementSiteTableVersion",
    "measurementSiteRecord",
    "measurementSiteTableExtension"
})
public class MeasurementSiteTable {

    protected String measurementSiteTableIdentification;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger measurementSiteTableVersion;
    @XmlElement(required = true)
    protected List<MeasurementSiteRecord> measurementSiteRecord;
    protected ExtensionType measurementSiteTableExtension;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Recupera il valore della proprietà measurementSiteTableIdentification.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasurementSiteTableIdentification() {
        return measurementSiteTableIdentification;
    }

    /**
     * Imposta il valore della proprietà measurementSiteTableIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasurementSiteTableIdentification(String value) {
        this.measurementSiteTableIdentification = value;
    }

    /**
     * Recupera il valore della proprietà measurementSiteTableVersion.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMeasurementSiteTableVersion() {
        return measurementSiteTableVersion;
    }

    /**
     * Imposta il valore della proprietà measurementSiteTableVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMeasurementSiteTableVersion(BigInteger value) {
        this.measurementSiteTableVersion = value;
    }

    /**
     * Gets the value of the measurementSiteRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the measurementSiteRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasurementSiteRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementSiteRecord }
     * 
     * 
     */
    public List<MeasurementSiteRecord> getMeasurementSiteRecord() {
        if (measurementSiteRecord == null) {
            measurementSiteRecord = new ArrayList<MeasurementSiteRecord>();
        }
        return this.measurementSiteRecord;
    }

    /**
     * Recupera il valore della proprietà measurementSiteTableExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getMeasurementSiteTableExtension() {
        return measurementSiteTableExtension;
    }

    /**
     * Imposta il valore della proprietà measurementSiteTableExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setMeasurementSiteTableExtension(ExtensionType value) {
        this.measurementSiteTableExtension = value;
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

    public MeasurementSiteTable withMeasurementSiteTableIdentification(String value) {
        setMeasurementSiteTableIdentification(value);
        return this;
    }

    public MeasurementSiteTable withMeasurementSiteTableVersion(BigInteger value) {
        setMeasurementSiteTableVersion(value);
        return this;
    }

    public MeasurementSiteTable withMeasurementSiteRecord(MeasurementSiteRecord... values) {
        if (values!= null) {
            for (MeasurementSiteRecord value: values) {
                getMeasurementSiteRecord().add(value);
            }
        }
        return this;
    }

    public MeasurementSiteTable withMeasurementSiteRecord(Collection<MeasurementSiteRecord> values) {
        if (values!= null) {
            getMeasurementSiteRecord().addAll(values);
        }
        return this;
    }

    public MeasurementSiteTable withMeasurementSiteTableExtension(ExtensionType value) {
        setMeasurementSiteTableExtension(value);
        return this;
    }

    public MeasurementSiteTable withId(String value) {
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

}

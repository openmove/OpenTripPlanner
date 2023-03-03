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
 * <p>Classe Java per Situation complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Situation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="overallSeverity" type="{http://datex2.eu/schema/2_0RC1/2_0}OverallSeverityEnum" minOccurs="0"/&gt;
 *         &lt;element name="relatedSituation" type="{http://datex2.eu/schema/2_0RC1/2_0}Reference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="situationVersion" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="situationVersionTime" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="headerInformation" type="{http://datex2.eu/schema/2_0RC1/2_0}HeaderInformation"/&gt;
 *         &lt;element name="situationRecord" type="{http://datex2.eu/schema/2_0RC1/2_0}SituationRecord" maxOccurs="unbounded"/&gt;
 *         &lt;element name="situationExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
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
@XmlType(name = "Situation", propOrder = {
    "overallSeverity",
    "relatedSituation",
    "situationVersion",
    "situationVersionTime",
    "headerInformation",
    "situationRecord",
    "situationExtension"
})
public class Situation {

    @XmlSchemaType(name = "string")
    protected OverallSeverityEnum overallSeverity;
    protected List<String> relatedSituation;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger situationVersion;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime situationVersionTime;
    @XmlElement(required = true)
    protected HeaderInformation headerInformation;
    @XmlElement(required = true)
    protected List<SituationRecord> situationRecord;
    protected ExtensionType situationExtension;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Recupera il valore della proprietà overallSeverity.
     * 
     * @return
     *     possible object is
     *     {@link OverallSeverityEnum }
     *     
     */
    public OverallSeverityEnum getOverallSeverity() {
        return overallSeverity;
    }

    /**
     * Imposta il valore della proprietà overallSeverity.
     * 
     * @param value
     *     allowed object is
     *     {@link OverallSeverityEnum }
     *     
     */
    public void setOverallSeverity(OverallSeverityEnum value) {
        this.overallSeverity = value;
    }

    /**
     * Gets the value of the relatedSituation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedSituation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedSituation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRelatedSituation() {
        if (relatedSituation == null) {
            relatedSituation = new ArrayList<String>();
        }
        return this.relatedSituation;
    }

    /**
     * Recupera il valore della proprietà situationVersion.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSituationVersion() {
        return situationVersion;
    }

    /**
     * Imposta il valore della proprietà situationVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSituationVersion(BigInteger value) {
        this.situationVersion = value;
    }

    /**
     * Recupera il valore della proprietà situationVersionTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getSituationVersionTime() {
        return situationVersionTime;
    }

    /**
     * Imposta il valore della proprietà situationVersionTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSituationVersionTime(LocalDateTime value) {
        this.situationVersionTime = value;
    }

    /**
     * Recupera il valore della proprietà headerInformation.
     * 
     * @return
     *     possible object is
     *     {@link HeaderInformation }
     *     
     */
    public HeaderInformation getHeaderInformation() {
        return headerInformation;
    }

    /**
     * Imposta il valore della proprietà headerInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderInformation }
     *     
     */
    public void setHeaderInformation(HeaderInformation value) {
        this.headerInformation = value;
    }

    /**
     * Gets the value of the situationRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the situationRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSituationRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SituationRecord }
     * 
     * 
     */
    public List<SituationRecord> getSituationRecord() {
        if (situationRecord == null) {
            situationRecord = new ArrayList<SituationRecord>();
        }
        return this.situationRecord;
    }

    /**
     * Recupera il valore della proprietà situationExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getSituationExtension() {
        return situationExtension;
    }

    /**
     * Imposta il valore della proprietà situationExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setSituationExtension(ExtensionType value) {
        this.situationExtension = value;
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

    public Situation withOverallSeverity(OverallSeverityEnum value) {
        setOverallSeverity(value);
        return this;
    }

    public Situation withRelatedSituation(String... values) {
        if (values!= null) {
            for (String value: values) {
                getRelatedSituation().add(value);
            }
        }
        return this;
    }

    public Situation withRelatedSituation(Collection<String> values) {
        if (values!= null) {
            getRelatedSituation().addAll(values);
        }
        return this;
    }

    public Situation withSituationVersion(BigInteger value) {
        setSituationVersion(value);
        return this;
    }

    public Situation withSituationVersionTime(LocalDateTime value) {
        setSituationVersionTime(value);
        return this;
    }

    public Situation withHeaderInformation(HeaderInformation value) {
        setHeaderInformation(value);
        return this;
    }

    public Situation withSituationRecord(SituationRecord... values) {
        if (values!= null) {
            for (SituationRecord value: values) {
                getSituationRecord().add(value);
            }
        }
        return this;
    }

    public Situation withSituationRecord(Collection<SituationRecord> values) {
        if (values!= null) {
            getSituationRecord().addAll(values);
        }
        return this;
    }

    public Situation withSituationExtension(ExtensionType value) {
        setSituationExtension(value);
        return this;
    }

    public Situation withId(String value) {
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

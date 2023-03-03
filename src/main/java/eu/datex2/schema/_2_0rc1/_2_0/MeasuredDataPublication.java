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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per MeasuredDataPublication complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="MeasuredDataPublication"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}PayloadPublication"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="measurementSiteTableReference" type="{http://datex2.eu/schema/2_0RC1/2_0}Reference"/&gt;
 *         &lt;element name="headerInformation" type="{http://datex2.eu/schema/2_0RC1/2_0}HeaderInformation"/&gt;
 *         &lt;element name="siteMeasurements" type="{http://datex2.eu/schema/2_0RC1/2_0}SiteMeasurements" maxOccurs="unbounded"/&gt;
 *         &lt;element name="measuredDataPublicationExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasuredDataPublication", propOrder = {
    "measurementSiteTableReference",
    "headerInformation",
    "siteMeasurements",
    "measuredDataPublicationExtension"
})
public class MeasuredDataPublication
    extends PayloadPublication
{

    @XmlElement(required = true)
    protected String measurementSiteTableReference;
    @XmlElement(required = true)
    protected HeaderInformation headerInformation;
    @XmlElement(required = true)
    protected List<SiteMeasurements> siteMeasurements;
    protected ExtensionType measuredDataPublicationExtension;

    /**
     * Recupera il valore della proprietà measurementSiteTableReference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasurementSiteTableReference() {
        return measurementSiteTableReference;
    }

    /**
     * Imposta il valore della proprietà measurementSiteTableReference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasurementSiteTableReference(String value) {
        this.measurementSiteTableReference = value;
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
     * Gets the value of the siteMeasurements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the siteMeasurements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSiteMeasurements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SiteMeasurements }
     * 
     * 
     */
    public List<SiteMeasurements> getSiteMeasurements() {
        if (siteMeasurements == null) {
            siteMeasurements = new ArrayList<SiteMeasurements>();
        }
        return this.siteMeasurements;
    }

    /**
     * Recupera il valore della proprietà measuredDataPublicationExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getMeasuredDataPublicationExtension() {
        return measuredDataPublicationExtension;
    }

    /**
     * Imposta il valore della proprietà measuredDataPublicationExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setMeasuredDataPublicationExtension(ExtensionType value) {
        this.measuredDataPublicationExtension = value;
    }

    public MeasuredDataPublication withMeasurementSiteTableReference(String value) {
        setMeasurementSiteTableReference(value);
        return this;
    }

    public MeasuredDataPublication withHeaderInformation(HeaderInformation value) {
        setHeaderInformation(value);
        return this;
    }

    public MeasuredDataPublication withSiteMeasurements(SiteMeasurements... values) {
        if (values!= null) {
            for (SiteMeasurements value: values) {
                getSiteMeasurements().add(value);
            }
        }
        return this;
    }

    public MeasuredDataPublication withSiteMeasurements(Collection<SiteMeasurements> values) {
        if (values!= null) {
            getSiteMeasurements().addAll(values);
        }
        return this;
    }

    public MeasuredDataPublication withMeasuredDataPublicationExtension(ExtensionType value) {
        setMeasuredDataPublicationExtension(value);
        return this;
    }

    @Override
    public MeasuredDataPublication withFeedDescription(MultilingualString value) {
        setFeedDescription(value);
        return this;
    }

    @Override
    public MeasuredDataPublication withFeedType(String value) {
        setFeedType(value);
        return this;
    }

    @Override
    public MeasuredDataPublication withPublicationTime(LocalDateTime value) {
        setPublicationTime(value);
        return this;
    }

    @Override
    public MeasuredDataPublication withPublicationCreator(InternationalIdentifier value) {
        setPublicationCreator(value);
        return this;
    }

    @Override
    public MeasuredDataPublication withPayloadPublicationExtension(ExtensionType value) {
        setPayloadPublicationExtension(value);
        return this;
    }

    @Override
    public MeasuredDataPublication withLang(String value) {
        setLang(value);
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

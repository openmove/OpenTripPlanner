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
 * <p>Classe Java per PredefinedLocationsPublication complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PredefinedLocationsPublication"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}PayloadPublication"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="headerInformation" type="{http://datex2.eu/schema/2_0RC1/2_0}HeaderInformation"/&gt;
 *         &lt;element name="predefinedLocationSet" type="{http://datex2.eu/schema/2_0RC1/2_0}PredefinedLocationSet" maxOccurs="unbounded"/&gt;
 *         &lt;element name="predefinedLocationsPublicationExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PredefinedLocationsPublication", propOrder = {
    "headerInformation",
    "predefinedLocationSet",
    "predefinedLocationsPublicationExtension"
})
public class PredefinedLocationsPublication
    extends PayloadPublication
{

    @XmlElement(required = true)
    protected HeaderInformation headerInformation;
    @XmlElement(required = true)
    protected List<PredefinedLocationSet> predefinedLocationSet;
    protected ExtensionType predefinedLocationsPublicationExtension;

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
     * Gets the value of the predefinedLocationSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the predefinedLocationSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPredefinedLocationSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PredefinedLocationSet }
     * 
     * 
     */
    public List<PredefinedLocationSet> getPredefinedLocationSet() {
        if (predefinedLocationSet == null) {
            predefinedLocationSet = new ArrayList<PredefinedLocationSet>();
        }
        return this.predefinedLocationSet;
    }

    /**
     * Recupera il valore della proprietà predefinedLocationsPublicationExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPredefinedLocationsPublicationExtension() {
        return predefinedLocationsPublicationExtension;
    }

    /**
     * Imposta il valore della proprietà predefinedLocationsPublicationExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPredefinedLocationsPublicationExtension(ExtensionType value) {
        this.predefinedLocationsPublicationExtension = value;
    }

    public PredefinedLocationsPublication withHeaderInformation(HeaderInformation value) {
        setHeaderInformation(value);
        return this;
    }

    public PredefinedLocationsPublication withPredefinedLocationSet(PredefinedLocationSet... values) {
        if (values!= null) {
            for (PredefinedLocationSet value: values) {
                getPredefinedLocationSet().add(value);
            }
        }
        return this;
    }

    public PredefinedLocationsPublication withPredefinedLocationSet(Collection<PredefinedLocationSet> values) {
        if (values!= null) {
            getPredefinedLocationSet().addAll(values);
        }
        return this;
    }

    public PredefinedLocationsPublication withPredefinedLocationsPublicationExtension(ExtensionType value) {
        setPredefinedLocationsPublicationExtension(value);
        return this;
    }

    @Override
    public PredefinedLocationsPublication withFeedDescription(MultilingualString value) {
        setFeedDescription(value);
        return this;
    }

    @Override
    public PredefinedLocationsPublication withFeedType(String value) {
        setFeedType(value);
        return this;
    }

    @Override
    public PredefinedLocationsPublication withPublicationTime(LocalDateTime value) {
        setPublicationTime(value);
        return this;
    }

    @Override
    public PredefinedLocationsPublication withPublicationCreator(InternationalIdentifier value) {
        setPublicationCreator(value);
        return this;
    }

    @Override
    public PredefinedLocationsPublication withPayloadPublicationExtension(ExtensionType value) {
        setPayloadPublicationExtension(value);
        return this;
    }

    @Override
    public PredefinedLocationsPublication withLang(String value) {
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

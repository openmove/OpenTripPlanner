//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import java.time.LocalDateTime;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per GenericPublication complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="GenericPublication"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}PayloadPublication"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="genericPublicationName" type="{http://datex2.eu/schema/2_0RC1/2_0}String"/&gt;
 *         &lt;element name="genericPublicationExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericPublication", propOrder = {
    "genericPublicationName",
    "genericPublicationExtension"
})
public class GenericPublication
    extends PayloadPublication
{

    @XmlElement(required = true)
    protected String genericPublicationName;
    protected ExtensionType genericPublicationExtension;

    /**
     * Recupera il valore della proprietà genericPublicationName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenericPublicationName() {
        return genericPublicationName;
    }

    /**
     * Imposta il valore della proprietà genericPublicationName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenericPublicationName(String value) {
        this.genericPublicationName = value;
    }

    /**
     * Recupera il valore della proprietà genericPublicationExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getGenericPublicationExtension() {
        return genericPublicationExtension;
    }

    /**
     * Imposta il valore della proprietà genericPublicationExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setGenericPublicationExtension(ExtensionType value) {
        this.genericPublicationExtension = value;
    }

    public GenericPublication withGenericPublicationName(String value) {
        setGenericPublicationName(value);
        return this;
    }

    public GenericPublication withGenericPublicationExtension(ExtensionType value) {
        setGenericPublicationExtension(value);
        return this;
    }

    @Override
    public GenericPublication withFeedDescription(MultilingualString value) {
        setFeedDescription(value);
        return this;
    }

    @Override
    public GenericPublication withFeedType(String value) {
        setFeedType(value);
        return this;
    }

    @Override
    public GenericPublication withPublicationTime(LocalDateTime value) {
        setPublicationTime(value);
        return this;
    }

    @Override
    public GenericPublication withPublicationCreator(InternationalIdentifier value) {
        setPublicationCreator(value);
        return this;
    }

    @Override
    public GenericPublication withPayloadPublicationExtension(ExtensionType value) {
        setPayloadPublicationExtension(value);
        return this;
    }

    @Override
    public GenericPublication withLang(String value) {
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

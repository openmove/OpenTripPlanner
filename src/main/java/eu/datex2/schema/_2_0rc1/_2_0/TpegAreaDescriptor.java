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
 * <p>Classe Java per TpegAreaDescriptor complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TpegAreaDescriptor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}TpegDescriptor"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tpegAreaDescriptorType" type="{http://datex2.eu/schema/2_0RC1/2_0}TpegLoc03AreaDescriptorSubtypeEnum"/&gt;
 *         &lt;element name="tpegAreaDescriptorExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegAreaDescriptor", propOrder = {
    "tpegAreaDescriptorType",
    "tpegAreaDescriptorExtension"
})
public class TpegAreaDescriptor
    extends TpegDescriptor
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TpegLoc03AreaDescriptorSubtypeEnum tpegAreaDescriptorType;
    protected ExtensionType tpegAreaDescriptorExtension;

    /**
     * Recupera il valore della proprietà tpegAreaDescriptorType.
     * 
     * @return
     *     possible object is
     *     {@link TpegLoc03AreaDescriptorSubtypeEnum }
     *     
     */
    public TpegLoc03AreaDescriptorSubtypeEnum getTpegAreaDescriptorType() {
        return tpegAreaDescriptorType;
    }

    /**
     * Imposta il valore della proprietà tpegAreaDescriptorType.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegLoc03AreaDescriptorSubtypeEnum }
     *     
     */
    public void setTpegAreaDescriptorType(TpegLoc03AreaDescriptorSubtypeEnum value) {
        this.tpegAreaDescriptorType = value;
    }

    /**
     * Recupera il valore della proprietà tpegAreaDescriptorExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTpegAreaDescriptorExtension() {
        return tpegAreaDescriptorExtension;
    }

    /**
     * Imposta il valore della proprietà tpegAreaDescriptorExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTpegAreaDescriptorExtension(ExtensionType value) {
        this.tpegAreaDescriptorExtension = value;
    }

    public TpegAreaDescriptor withTpegAreaDescriptorType(TpegLoc03AreaDescriptorSubtypeEnum value) {
        setTpegAreaDescriptorType(value);
        return this;
    }

    public TpegAreaDescriptor withTpegAreaDescriptorExtension(ExtensionType value) {
        setTpegAreaDescriptorExtension(value);
        return this;
    }

    @Override
    public TpegAreaDescriptor withDescriptor(MultilingualString value) {
        setDescriptor(value);
        return this;
    }

    @Override
    public TpegAreaDescriptor withTpegDescriptorExtension(ExtensionType value) {
        setTpegDescriptorExtension(value);
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

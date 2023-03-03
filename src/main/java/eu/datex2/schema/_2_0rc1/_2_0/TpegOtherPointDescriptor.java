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
 * <p>Classe Java per TpegOtherPointDescriptor complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TpegOtherPointDescriptor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}TpegPointDescriptor"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tpegOtherPointDescriptorType" type="{http://datex2.eu/schema/2_0RC1/2_0}TpegLoc03OtherPointDescriptorSubtypeEnum"/&gt;
 *         &lt;element name="tpegOtherPointDescriptorExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegOtherPointDescriptor", propOrder = {
    "tpegOtherPointDescriptorType",
    "tpegOtherPointDescriptorExtension"
})
public class TpegOtherPointDescriptor
    extends TpegPointDescriptor
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TpegLoc03OtherPointDescriptorSubtypeEnum tpegOtherPointDescriptorType;
    protected ExtensionType tpegOtherPointDescriptorExtension;

    /**
     * Recupera il valore della proprietà tpegOtherPointDescriptorType.
     * 
     * @return
     *     possible object is
     *     {@link TpegLoc03OtherPointDescriptorSubtypeEnum }
     *     
     */
    public TpegLoc03OtherPointDescriptorSubtypeEnum getTpegOtherPointDescriptorType() {
        return tpegOtherPointDescriptorType;
    }

    /**
     * Imposta il valore della proprietà tpegOtherPointDescriptorType.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegLoc03OtherPointDescriptorSubtypeEnum }
     *     
     */
    public void setTpegOtherPointDescriptorType(TpegLoc03OtherPointDescriptorSubtypeEnum value) {
        this.tpegOtherPointDescriptorType = value;
    }

    /**
     * Recupera il valore della proprietà tpegOtherPointDescriptorExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTpegOtherPointDescriptorExtension() {
        return tpegOtherPointDescriptorExtension;
    }

    /**
     * Imposta il valore della proprietà tpegOtherPointDescriptorExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTpegOtherPointDescriptorExtension(ExtensionType value) {
        this.tpegOtherPointDescriptorExtension = value;
    }

    public TpegOtherPointDescriptor withTpegOtherPointDescriptorType(TpegLoc03OtherPointDescriptorSubtypeEnum value) {
        setTpegOtherPointDescriptorType(value);
        return this;
    }

    public TpegOtherPointDescriptor withTpegOtherPointDescriptorExtension(ExtensionType value) {
        setTpegOtherPointDescriptorExtension(value);
        return this;
    }

    @Override
    public TpegOtherPointDescriptor withTpegPointDescriptorExtension(ExtensionType value) {
        setTpegPointDescriptorExtension(value);
        return this;
    }

    @Override
    public TpegOtherPointDescriptor withDescriptor(MultilingualString value) {
        setDescriptor(value);
        return this;
    }

    @Override
    public TpegOtherPointDescriptor withTpegDescriptorExtension(ExtensionType value) {
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

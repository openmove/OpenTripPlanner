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
 * <p>Classe Java per TpegJunctionPointDescriptor complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TpegJunctionPointDescriptor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}TpegPointDescriptor"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tpegJunctionPointDescriptorType" type="{http://datex2.eu/schema/2_0RC1/2_0}TpegLoc03JunctionPointDescriptorSubtypeEnum"/&gt;
 *         &lt;element name="tpegJunctionPointDescriptorExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegJunctionPointDescriptor", propOrder = {
    "tpegJunctionPointDescriptorType",
    "tpegJunctionPointDescriptorExtension"
})
public class TpegJunctionPointDescriptor
    extends TpegPointDescriptor
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TpegLoc03JunctionPointDescriptorSubtypeEnum tpegJunctionPointDescriptorType;
    protected ExtensionType tpegJunctionPointDescriptorExtension;

    /**
     * Recupera il valore della proprietà tpegJunctionPointDescriptorType.
     * 
     * @return
     *     possible object is
     *     {@link TpegLoc03JunctionPointDescriptorSubtypeEnum }
     *     
     */
    public TpegLoc03JunctionPointDescriptorSubtypeEnum getTpegJunctionPointDescriptorType() {
        return tpegJunctionPointDescriptorType;
    }

    /**
     * Imposta il valore della proprietà tpegJunctionPointDescriptorType.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegLoc03JunctionPointDescriptorSubtypeEnum }
     *     
     */
    public void setTpegJunctionPointDescriptorType(TpegLoc03JunctionPointDescriptorSubtypeEnum value) {
        this.tpegJunctionPointDescriptorType = value;
    }

    /**
     * Recupera il valore della proprietà tpegJunctionPointDescriptorExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTpegJunctionPointDescriptorExtension() {
        return tpegJunctionPointDescriptorExtension;
    }

    /**
     * Imposta il valore della proprietà tpegJunctionPointDescriptorExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTpegJunctionPointDescriptorExtension(ExtensionType value) {
        this.tpegJunctionPointDescriptorExtension = value;
    }

    public TpegJunctionPointDescriptor withTpegJunctionPointDescriptorType(TpegLoc03JunctionPointDescriptorSubtypeEnum value) {
        setTpegJunctionPointDescriptorType(value);
        return this;
    }

    public TpegJunctionPointDescriptor withTpegJunctionPointDescriptorExtension(ExtensionType value) {
        setTpegJunctionPointDescriptorExtension(value);
        return this;
    }

    @Override
    public TpegJunctionPointDescriptor withTpegPointDescriptorExtension(ExtensionType value) {
        setTpegPointDescriptorExtension(value);
        return this;
    }

    @Override
    public TpegJunctionPointDescriptor withDescriptor(MultilingualString value) {
        setDescriptor(value);
        return this;
    }

    @Override
    public TpegJunctionPointDescriptor withTpegDescriptorExtension(ExtensionType value) {
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

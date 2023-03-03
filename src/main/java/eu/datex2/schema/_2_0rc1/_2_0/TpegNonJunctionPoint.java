//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

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
 * <p>Classe Java per TpegNonJunctionPoint complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TpegNonJunctionPoint"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}TpegPoint"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pointCoordinates" type="{http://datex2.eu/schema/2_0RC1/2_0}PointCoordinates"/&gt;
 *         &lt;element name="name" type="{http://datex2.eu/schema/2_0RC1/2_0}TpegOtherPointDescriptor" maxOccurs="unbounded"/&gt;
 *         &lt;element name="tpegNonJunctionPointExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegNonJunctionPoint", propOrder = {
    "pointCoordinates",
    "name",
    "tpegNonJunctionPointExtension"
})
public class TpegNonJunctionPoint
    extends TpegPoint
{

    @XmlElement(required = true)
    protected PointCoordinates pointCoordinates;
    @XmlElement(required = true)
    protected List<TpegOtherPointDescriptor> name;
    protected ExtensionType tpegNonJunctionPointExtension;

    /**
     * Recupera il valore della proprietà pointCoordinates.
     * 
     * @return
     *     possible object is
     *     {@link PointCoordinates }
     *     
     */
    public PointCoordinates getPointCoordinates() {
        return pointCoordinates;
    }

    /**
     * Imposta il valore della proprietà pointCoordinates.
     * 
     * @param value
     *     allowed object is
     *     {@link PointCoordinates }
     *     
     */
    public void setPointCoordinates(PointCoordinates value) {
        this.pointCoordinates = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TpegOtherPointDescriptor }
     * 
     * 
     */
    public List<TpegOtherPointDescriptor> getName() {
        if (name == null) {
            name = new ArrayList<TpegOtherPointDescriptor>();
        }
        return this.name;
    }

    /**
     * Recupera il valore della proprietà tpegNonJunctionPointExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTpegNonJunctionPointExtension() {
        return tpegNonJunctionPointExtension;
    }

    /**
     * Imposta il valore della proprietà tpegNonJunctionPointExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTpegNonJunctionPointExtension(ExtensionType value) {
        this.tpegNonJunctionPointExtension = value;
    }

    public TpegNonJunctionPoint withPointCoordinates(PointCoordinates value) {
        setPointCoordinates(value);
        return this;
    }

    public TpegNonJunctionPoint withName(TpegOtherPointDescriptor... values) {
        if (values!= null) {
            for (TpegOtherPointDescriptor value: values) {
                getName().add(value);
            }
        }
        return this;
    }

    public TpegNonJunctionPoint withName(Collection<TpegOtherPointDescriptor> values) {
        if (values!= null) {
            getName().addAll(values);
        }
        return this;
    }

    public TpegNonJunctionPoint withTpegNonJunctionPointExtension(ExtensionType value) {
        setTpegNonJunctionPointExtension(value);
        return this;
    }

    @Override
    public TpegNonJunctionPoint withTpegPointExtension(ExtensionType value) {
        setTpegPointExtension(value);
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

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
 * <p>Classe Java per TpegJunction complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TpegJunction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}TpegPoint"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pointCoordinates" type="{http://datex2.eu/schema/2_0RC1/2_0}PointCoordinates"/&gt;
 *         &lt;element name="name" type="{http://datex2.eu/schema/2_0RC1/2_0}TpegJunctionPointDescriptor" minOccurs="0"/&gt;
 *         &lt;element name="ilc" type="{http://datex2.eu/schema/2_0RC1/2_0}TpegIlcPointDescriptor" maxOccurs="3"/&gt;
 *         &lt;element name="otherName" type="{http://datex2.eu/schema/2_0RC1/2_0}TpegOtherPointDescriptor" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tpegJunctionExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegJunction", propOrder = {
    "pointCoordinates",
    "name",
    "ilc",
    "otherName",
    "tpegJunctionExtension"
})
public class TpegJunction
    extends TpegPoint
{

    @XmlElement(required = true)
    protected PointCoordinates pointCoordinates;
    protected TpegJunctionPointDescriptor name;
    @XmlElement(required = true)
    protected List<TpegIlcPointDescriptor> ilc;
    protected List<TpegOtherPointDescriptor> otherName;
    protected ExtensionType tpegJunctionExtension;

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
     * Recupera il valore della proprietà name.
     * 
     * @return
     *     possible object is
     *     {@link TpegJunctionPointDescriptor }
     *     
     */
    public TpegJunctionPointDescriptor getName() {
        return name;
    }

    /**
     * Imposta il valore della proprietà name.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegJunctionPointDescriptor }
     *     
     */
    public void setName(TpegJunctionPointDescriptor value) {
        this.name = value;
    }

    /**
     * Gets the value of the ilc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ilc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIlc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TpegIlcPointDescriptor }
     * 
     * 
     */
    public List<TpegIlcPointDescriptor> getIlc() {
        if (ilc == null) {
            ilc = new ArrayList<TpegIlcPointDescriptor>();
        }
        return this.ilc;
    }

    /**
     * Gets the value of the otherName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TpegOtherPointDescriptor }
     * 
     * 
     */
    public List<TpegOtherPointDescriptor> getOtherName() {
        if (otherName == null) {
            otherName = new ArrayList<TpegOtherPointDescriptor>();
        }
        return this.otherName;
    }

    /**
     * Recupera il valore della proprietà tpegJunctionExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTpegJunctionExtension() {
        return tpegJunctionExtension;
    }

    /**
     * Imposta il valore della proprietà tpegJunctionExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTpegJunctionExtension(ExtensionType value) {
        this.tpegJunctionExtension = value;
    }

    public TpegJunction withPointCoordinates(PointCoordinates value) {
        setPointCoordinates(value);
        return this;
    }

    public TpegJunction withName(TpegJunctionPointDescriptor value) {
        setName(value);
        return this;
    }

    public TpegJunction withIlc(TpegIlcPointDescriptor... values) {
        if (values!= null) {
            for (TpegIlcPointDescriptor value: values) {
                getIlc().add(value);
            }
        }
        return this;
    }

    public TpegJunction withIlc(Collection<TpegIlcPointDescriptor> values) {
        if (values!= null) {
            getIlc().addAll(values);
        }
        return this;
    }

    public TpegJunction withOtherName(TpegOtherPointDescriptor... values) {
        if (values!= null) {
            for (TpegOtherPointDescriptor value: values) {
                getOtherName().add(value);
            }
        }
        return this;
    }

    public TpegJunction withOtherName(Collection<TpegOtherPointDescriptor> values) {
        if (values!= null) {
            getOtherName().addAll(values);
        }
        return this;
    }

    public TpegJunction withTpegJunctionExtension(ExtensionType value) {
        setTpegJunctionExtension(value);
        return this;
    }

    @Override
    public TpegJunction withTpegPointExtension(ExtensionType value) {
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

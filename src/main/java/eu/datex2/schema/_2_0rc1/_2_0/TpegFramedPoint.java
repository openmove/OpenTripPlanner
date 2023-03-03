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
 * <p>Classe Java per TpegFramedPoint complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TpegFramedPoint"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}TpegPointLocation"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tpegFramedPointLocationType" type="{http://datex2.eu/schema/2_0RC1/2_0}TpegLoc01FramedPointLocationSubtypeEnum"/&gt;
 *         &lt;element name="framedPoint" type="{http://datex2.eu/schema/2_0RC1/2_0}TpegNonJunctionPoint"/&gt;
 *         &lt;element name="to" type="{http://datex2.eu/schema/2_0RC1/2_0}TpegPoint"/&gt;
 *         &lt;element name="from" type="{http://datex2.eu/schema/2_0RC1/2_0}TpegPoint"/&gt;
 *         &lt;element name="tpegFramedPointExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegFramedPoint", propOrder = {
    "tpegFramedPointLocationType",
    "framedPoint",
    "to",
    "from",
    "tpegFramedPointExtension"
})
public class TpegFramedPoint
    extends TpegPointLocation
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TpegLoc01FramedPointLocationSubtypeEnum tpegFramedPointLocationType;
    @XmlElement(required = true)
    protected TpegNonJunctionPoint framedPoint;
    @XmlElement(required = true)
    protected TpegPoint to;
    @XmlElement(required = true)
    protected TpegPoint from;
    protected ExtensionType tpegFramedPointExtension;

    /**
     * Recupera il valore della proprietà tpegFramedPointLocationType.
     * 
     * @return
     *     possible object is
     *     {@link TpegLoc01FramedPointLocationSubtypeEnum }
     *     
     */
    public TpegLoc01FramedPointLocationSubtypeEnum getTpegFramedPointLocationType() {
        return tpegFramedPointLocationType;
    }

    /**
     * Imposta il valore della proprietà tpegFramedPointLocationType.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegLoc01FramedPointLocationSubtypeEnum }
     *     
     */
    public void setTpegFramedPointLocationType(TpegLoc01FramedPointLocationSubtypeEnum value) {
        this.tpegFramedPointLocationType = value;
    }

    /**
     * Recupera il valore della proprietà framedPoint.
     * 
     * @return
     *     possible object is
     *     {@link TpegNonJunctionPoint }
     *     
     */
    public TpegNonJunctionPoint getFramedPoint() {
        return framedPoint;
    }

    /**
     * Imposta il valore della proprietà framedPoint.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegNonJunctionPoint }
     *     
     */
    public void setFramedPoint(TpegNonJunctionPoint value) {
        this.framedPoint = value;
    }

    /**
     * Recupera il valore della proprietà to.
     * 
     * @return
     *     possible object is
     *     {@link TpegPoint }
     *     
     */
    public TpegPoint getTo() {
        return to;
    }

    /**
     * Imposta il valore della proprietà to.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegPoint }
     *     
     */
    public void setTo(TpegPoint value) {
        this.to = value;
    }

    /**
     * Recupera il valore della proprietà from.
     * 
     * @return
     *     possible object is
     *     {@link TpegPoint }
     *     
     */
    public TpegPoint getFrom() {
        return from;
    }

    /**
     * Imposta il valore della proprietà from.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegPoint }
     *     
     */
    public void setFrom(TpegPoint value) {
        this.from = value;
    }

    /**
     * Recupera il valore della proprietà tpegFramedPointExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTpegFramedPointExtension() {
        return tpegFramedPointExtension;
    }

    /**
     * Imposta il valore della proprietà tpegFramedPointExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTpegFramedPointExtension(ExtensionType value) {
        this.tpegFramedPointExtension = value;
    }

    public TpegFramedPoint withTpegFramedPointLocationType(TpegLoc01FramedPointLocationSubtypeEnum value) {
        setTpegFramedPointLocationType(value);
        return this;
    }

    public TpegFramedPoint withFramedPoint(TpegNonJunctionPoint value) {
        setFramedPoint(value);
        return this;
    }

    public TpegFramedPoint withTo(TpegPoint value) {
        setTo(value);
        return this;
    }

    public TpegFramedPoint withFrom(TpegPoint value) {
        setFrom(value);
        return this;
    }

    public TpegFramedPoint withTpegFramedPointExtension(ExtensionType value) {
        setTpegFramedPointExtension(value);
        return this;
    }

    @Override
    public TpegFramedPoint withTpegDirection(TpegLoc02DirectionTypeEnum value) {
        setTpegDirection(value);
        return this;
    }

    @Override
    public TpegFramedPoint withTpegPointLocationExtension(ExtensionType value) {
        setTpegPointLocationExtension(value);
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

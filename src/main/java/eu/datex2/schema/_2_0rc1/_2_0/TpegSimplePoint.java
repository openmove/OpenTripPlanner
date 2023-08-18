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
 * <p>Classe Java per TpegSimplePoint complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TpegSimplePoint"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}TpegPointLocation"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tpegSimplePointLocationType" type="{http://datex2.eu/schema/2_0RC1/2_0}TpegLoc01SimplePointLocationSubtypeEnum"/&gt;
 *         &lt;element name="point" type="{http://datex2.eu/schema/2_0RC1/2_0}TpegPoint"/&gt;
 *         &lt;element name="tpegSimplePointExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegSimplePoint", propOrder = {
    "tpegSimplePointLocationType",
    "point",
    "tpegSimplePointExtension"
})
public class TpegSimplePoint
    extends TpegPointLocation
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TpegLoc01SimplePointLocationSubtypeEnum tpegSimplePointLocationType;
    @XmlElement(required = true)
    protected TpegPoint point;
    protected ExtensionType tpegSimplePointExtension;

    /**
     * Recupera il valore della proprietà tpegSimplePointLocationType.
     * 
     * @return
     *     possible object is
     *     {@link TpegLoc01SimplePointLocationSubtypeEnum }
     *     
     */
    public TpegLoc01SimplePointLocationSubtypeEnum getTpegSimplePointLocationType() {
        return tpegSimplePointLocationType;
    }

    /**
     * Imposta il valore della proprietà tpegSimplePointLocationType.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegLoc01SimplePointLocationSubtypeEnum }
     *     
     */
    public void setTpegSimplePointLocationType(TpegLoc01SimplePointLocationSubtypeEnum value) {
        this.tpegSimplePointLocationType = value;
    }

    /**
     * Recupera il valore della proprietà point.
     * 
     * @return
     *     possible object is
     *     {@link TpegPoint }
     *     
     */
    public TpegPoint getPoint() {
        return point;
    }

    /**
     * Imposta il valore della proprietà point.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegPoint }
     *     
     */
    public void setPoint(TpegPoint value) {
        this.point = value;
    }

    /**
     * Recupera il valore della proprietà tpegSimplePointExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTpegSimplePointExtension() {
        return tpegSimplePointExtension;
    }

    /**
     * Imposta il valore della proprietà tpegSimplePointExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTpegSimplePointExtension(ExtensionType value) {
        this.tpegSimplePointExtension = value;
    }

    public TpegSimplePoint withTpegSimplePointLocationType(TpegLoc01SimplePointLocationSubtypeEnum value) {
        setTpegSimplePointLocationType(value);
        return this;
    }

    public TpegSimplePoint withPoint(TpegPoint value) {
        setPoint(value);
        return this;
    }

    public TpegSimplePoint withTpegSimplePointExtension(ExtensionType value) {
        setTpegSimplePointExtension(value);
        return this;
    }

    @Override
    public TpegSimplePoint withTpegDirection(TpegLoc02DirectionTypeEnum value) {
        setTpegDirection(value);
        return this;
    }

    @Override
    public TpegSimplePoint withTpegPointLocationExtension(ExtensionType value) {
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

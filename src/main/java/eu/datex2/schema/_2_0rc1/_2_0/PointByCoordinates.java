//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per PointByCoordinates complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PointByCoordinates"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bearing" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="pointCoordinates" type="{http://datex2.eu/schema/2_0RC1/2_0}PointCoordinates"/&gt;
 *         &lt;element name="pointByCoordinatesExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointByCoordinates", propOrder = {
    "bearing",
    "pointCoordinates",
    "pointByCoordinatesExtension"
})
public class PointByCoordinates {

    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger bearing;
    @XmlElement(required = true)
    protected PointCoordinates pointCoordinates;
    protected ExtensionType pointByCoordinatesExtension;

    /**
     * Recupera il valore della proprietà bearing.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBearing() {
        return bearing;
    }

    /**
     * Imposta il valore della proprietà bearing.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBearing(BigInteger value) {
        this.bearing = value;
    }

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
     * Recupera il valore della proprietà pointByCoordinatesExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPointByCoordinatesExtension() {
        return pointByCoordinatesExtension;
    }

    /**
     * Imposta il valore della proprietà pointByCoordinatesExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPointByCoordinatesExtension(ExtensionType value) {
        this.pointByCoordinatesExtension = value;
    }

    public PointByCoordinates withBearing(BigInteger value) {
        setBearing(value);
        return this;
    }

    public PointByCoordinates withPointCoordinates(PointCoordinates value) {
        setPointCoordinates(value);
        return this;
    }

    public PointByCoordinates withPointByCoordinatesExtension(ExtensionType value) {
        setPointByCoordinatesExtension(value);
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

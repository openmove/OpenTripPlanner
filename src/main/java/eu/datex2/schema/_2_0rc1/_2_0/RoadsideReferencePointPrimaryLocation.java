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
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per RoadsideReferencePointPrimaryLocation complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="RoadsideReferencePointPrimaryLocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="roadsideReferencePoint" type="{http://datex2.eu/schema/2_0RC1/2_0}RoadsideReferencePoint"/&gt;
 *         &lt;element name="roadsideReferencePointPrimaryLocationExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoadsideReferencePointPrimaryLocation", propOrder = {
    "roadsideReferencePoint",
    "roadsideReferencePointPrimaryLocationExtension"
})
public class RoadsideReferencePointPrimaryLocation {

    @XmlElement(required = true)
    protected RoadsideReferencePoint roadsideReferencePoint;
    protected ExtensionType roadsideReferencePointPrimaryLocationExtension;

    /**
     * Recupera il valore della proprietà roadsideReferencePoint.
     * 
     * @return
     *     possible object is
     *     {@link RoadsideReferencePoint }
     *     
     */
    public RoadsideReferencePoint getRoadsideReferencePoint() {
        return roadsideReferencePoint;
    }

    /**
     * Imposta il valore della proprietà roadsideReferencePoint.
     * 
     * @param value
     *     allowed object is
     *     {@link RoadsideReferencePoint }
     *     
     */
    public void setRoadsideReferencePoint(RoadsideReferencePoint value) {
        this.roadsideReferencePoint = value;
    }

    /**
     * Recupera il valore della proprietà roadsideReferencePointPrimaryLocationExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getRoadsideReferencePointPrimaryLocationExtension() {
        return roadsideReferencePointPrimaryLocationExtension;
    }

    /**
     * Imposta il valore della proprietà roadsideReferencePointPrimaryLocationExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setRoadsideReferencePointPrimaryLocationExtension(ExtensionType value) {
        this.roadsideReferencePointPrimaryLocationExtension = value;
    }

    public RoadsideReferencePointPrimaryLocation withRoadsideReferencePoint(RoadsideReferencePoint value) {
        setRoadsideReferencePoint(value);
        return this;
    }

    public RoadsideReferencePointPrimaryLocation withRoadsideReferencePointPrimaryLocationExtension(ExtensionType value) {
        setRoadsideReferencePointPrimaryLocationExtension(value);
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
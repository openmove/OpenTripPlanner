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
 * <p>Classe Java per RoadsideReferencePointLinear complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="RoadsideReferencePointLinear"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="roadsideReferencePointPrimaryLocation" type="{http://datex2.eu/schema/2_0RC1/2_0}RoadsideReferencePointPrimaryLocation"/&gt;
 *         &lt;element name="roadsideReferencePointSecondaryLocation" type="{http://datex2.eu/schema/2_0RC1/2_0}RoadsideReferencePointSecondaryLocation"/&gt;
 *         &lt;element name="roadsideReferencePointLinearExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoadsideReferencePointLinear", propOrder = {
    "roadsideReferencePointPrimaryLocation",
    "roadsideReferencePointSecondaryLocation",
    "roadsideReferencePointLinearExtension"
})
public class RoadsideReferencePointLinear {

    @XmlElement(required = true)
    protected RoadsideReferencePointPrimaryLocation roadsideReferencePointPrimaryLocation;
    @XmlElement(required = true)
    protected RoadsideReferencePointSecondaryLocation roadsideReferencePointSecondaryLocation;
    protected ExtensionType roadsideReferencePointLinearExtension;

    /**
     * Recupera il valore della proprietà roadsideReferencePointPrimaryLocation.
     * 
     * @return
     *     possible object is
     *     {@link RoadsideReferencePointPrimaryLocation }
     *     
     */
    public RoadsideReferencePointPrimaryLocation getRoadsideReferencePointPrimaryLocation() {
        return roadsideReferencePointPrimaryLocation;
    }

    /**
     * Imposta il valore della proprietà roadsideReferencePointPrimaryLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link RoadsideReferencePointPrimaryLocation }
     *     
     */
    public void setRoadsideReferencePointPrimaryLocation(RoadsideReferencePointPrimaryLocation value) {
        this.roadsideReferencePointPrimaryLocation = value;
    }

    /**
     * Recupera il valore della proprietà roadsideReferencePointSecondaryLocation.
     * 
     * @return
     *     possible object is
     *     {@link RoadsideReferencePointSecondaryLocation }
     *     
     */
    public RoadsideReferencePointSecondaryLocation getRoadsideReferencePointSecondaryLocation() {
        return roadsideReferencePointSecondaryLocation;
    }

    /**
     * Imposta il valore della proprietà roadsideReferencePointSecondaryLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link RoadsideReferencePointSecondaryLocation }
     *     
     */
    public void setRoadsideReferencePointSecondaryLocation(RoadsideReferencePointSecondaryLocation value) {
        this.roadsideReferencePointSecondaryLocation = value;
    }

    /**
     * Recupera il valore della proprietà roadsideReferencePointLinearExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getRoadsideReferencePointLinearExtension() {
        return roadsideReferencePointLinearExtension;
    }

    /**
     * Imposta il valore della proprietà roadsideReferencePointLinearExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setRoadsideReferencePointLinearExtension(ExtensionType value) {
        this.roadsideReferencePointLinearExtension = value;
    }

    public RoadsideReferencePointLinear withRoadsideReferencePointPrimaryLocation(RoadsideReferencePointPrimaryLocation value) {
        setRoadsideReferencePointPrimaryLocation(value);
        return this;
    }

    public RoadsideReferencePointLinear withRoadsideReferencePointSecondaryLocation(RoadsideReferencePointSecondaryLocation value) {
        setRoadsideReferencePointSecondaryLocation(value);
        return this;
    }

    public RoadsideReferencePointLinear withRoadsideReferencePointLinearExtension(ExtensionType value) {
        setRoadsideReferencePointLinearExtension(value);
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

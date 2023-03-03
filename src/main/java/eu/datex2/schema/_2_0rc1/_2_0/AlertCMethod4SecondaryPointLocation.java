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
 * <p>Classe Java per AlertCMethod4SecondaryPointLocation complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AlertCMethod4SecondaryPointLocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alertCLocation" type="{http://datex2.eu/schema/2_0RC1/2_0}AlertCLocation"/&gt;
 *         &lt;element name="offsetDistance" type="{http://datex2.eu/schema/2_0RC1/2_0}OffsetDistance"/&gt;
 *         &lt;element name="alertCMethod4SecondaryPointLocationExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertCMethod4SecondaryPointLocation", propOrder = {
    "alertCLocation",
    "offsetDistance",
    "alertCMethod4SecondaryPointLocationExtension"
})
public class AlertCMethod4SecondaryPointLocation {

    @XmlElement(required = true)
    protected AlertCLocation alertCLocation;
    @XmlElement(required = true)
    protected OffsetDistance offsetDistance;
    protected ExtensionType alertCMethod4SecondaryPointLocationExtension;

    /**
     * Recupera il valore della proprietà alertCLocation.
     * 
     * @return
     *     possible object is
     *     {@link AlertCLocation }
     *     
     */
    public AlertCLocation getAlertCLocation() {
        return alertCLocation;
    }

    /**
     * Imposta il valore della proprietà alertCLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertCLocation }
     *     
     */
    public void setAlertCLocation(AlertCLocation value) {
        this.alertCLocation = value;
    }

    /**
     * Recupera il valore della proprietà offsetDistance.
     * 
     * @return
     *     possible object is
     *     {@link OffsetDistance }
     *     
     */
    public OffsetDistance getOffsetDistance() {
        return offsetDistance;
    }

    /**
     * Imposta il valore della proprietà offsetDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link OffsetDistance }
     *     
     */
    public void setOffsetDistance(OffsetDistance value) {
        this.offsetDistance = value;
    }

    /**
     * Recupera il valore della proprietà alertCMethod4SecondaryPointLocationExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getAlertCMethod4SecondaryPointLocationExtension() {
        return alertCMethod4SecondaryPointLocationExtension;
    }

    /**
     * Imposta il valore della proprietà alertCMethod4SecondaryPointLocationExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setAlertCMethod4SecondaryPointLocationExtension(ExtensionType value) {
        this.alertCMethod4SecondaryPointLocationExtension = value;
    }

    public AlertCMethod4SecondaryPointLocation withAlertCLocation(AlertCLocation value) {
        setAlertCLocation(value);
        return this;
    }

    public AlertCMethod4SecondaryPointLocation withOffsetDistance(OffsetDistance value) {
        setOffsetDistance(value);
        return this;
    }

    public AlertCMethod4SecondaryPointLocation withAlertCMethod4SecondaryPointLocationExtension(ExtensionType value) {
        setAlertCMethod4SecondaryPointLocationExtension(value);
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

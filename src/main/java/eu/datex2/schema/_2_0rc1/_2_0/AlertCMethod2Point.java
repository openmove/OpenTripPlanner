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
 * <p>Classe Java per AlertCMethod2Point complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AlertCMethod2Point"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}AlertCPoint"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alertCDirection" type="{http://datex2.eu/schema/2_0RC1/2_0}AlertCDirection"/&gt;
 *         &lt;element name="alertCMethod2PrimaryPointLocation" type="{http://datex2.eu/schema/2_0RC1/2_0}AlertCMethod2PrimaryPointLocation"/&gt;
 *         &lt;element name="alertCMethod2PointExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertCMethod2Point", propOrder = {
    "alertCDirection",
    "alertCMethod2PrimaryPointLocation",
    "alertCMethod2PointExtension"
})
public class AlertCMethod2Point
    extends AlertCPoint
{

    @XmlElement(required = true)
    protected AlertCDirection alertCDirection;
    @XmlElement(required = true)
    protected AlertCMethod2PrimaryPointLocation alertCMethod2PrimaryPointLocation;
    protected ExtensionType alertCMethod2PointExtension;

    /**
     * Recupera il valore della proprietà alertCDirection.
     * 
     * @return
     *     possible object is
     *     {@link AlertCDirection }
     *     
     */
    public AlertCDirection getAlertCDirection() {
        return alertCDirection;
    }

    /**
     * Imposta il valore della proprietà alertCDirection.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertCDirection }
     *     
     */
    public void setAlertCDirection(AlertCDirection value) {
        this.alertCDirection = value;
    }

    /**
     * Recupera il valore della proprietà alertCMethod2PrimaryPointLocation.
     * 
     * @return
     *     possible object is
     *     {@link AlertCMethod2PrimaryPointLocation }
     *     
     */
    public AlertCMethod2PrimaryPointLocation getAlertCMethod2PrimaryPointLocation() {
        return alertCMethod2PrimaryPointLocation;
    }

    /**
     * Imposta il valore della proprietà alertCMethod2PrimaryPointLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertCMethod2PrimaryPointLocation }
     *     
     */
    public void setAlertCMethod2PrimaryPointLocation(AlertCMethod2PrimaryPointLocation value) {
        this.alertCMethod2PrimaryPointLocation = value;
    }

    /**
     * Recupera il valore della proprietà alertCMethod2PointExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getAlertCMethod2PointExtension() {
        return alertCMethod2PointExtension;
    }

    /**
     * Imposta il valore della proprietà alertCMethod2PointExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setAlertCMethod2PointExtension(ExtensionType value) {
        this.alertCMethod2PointExtension = value;
    }

    public AlertCMethod2Point withAlertCDirection(AlertCDirection value) {
        setAlertCDirection(value);
        return this;
    }

    public AlertCMethod2Point withAlertCMethod2PrimaryPointLocation(AlertCMethod2PrimaryPointLocation value) {
        setAlertCMethod2PrimaryPointLocation(value);
        return this;
    }

    public AlertCMethod2Point withAlertCMethod2PointExtension(ExtensionType value) {
        setAlertCMethod2PointExtension(value);
        return this;
    }

    @Override
    public AlertCMethod2Point withAlertCLocationCountryCode(String value) {
        setAlertCLocationCountryCode(value);
        return this;
    }

    @Override
    public AlertCMethod2Point withAlertCLocationTableNumber(String value) {
        setAlertCLocationTableNumber(value);
        return this;
    }

    @Override
    public AlertCMethod2Point withAlertCLocationTableVersion(String value) {
        setAlertCLocationTableVersion(value);
        return this;
    }

    @Override
    public AlertCMethod2Point withAlertCPointExtension(ExtensionType value) {
        setAlertCPointExtension(value);
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

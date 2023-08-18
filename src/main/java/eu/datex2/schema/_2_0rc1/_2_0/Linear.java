//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per Linear complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Linear"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}NetworkLocation"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tpegLinearLocation" type="{http://datex2.eu/schema/2_0RC1/2_0}TpegLinearLocation" minOccurs="0"/&gt;
 *         &lt;element name="alertCLinear" type="{http://datex2.eu/schema/2_0RC1/2_0}AlertCLinear" minOccurs="0"/&gt;
 *         &lt;element name="roadsideReferencePointLinear" type="{http://datex2.eu/schema/2_0RC1/2_0}RoadsideReferencePointLinear" minOccurs="0"/&gt;
 *         &lt;element name="linearExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Linear", propOrder = {
    "tpegLinearLocation",
    "alertCLinear",
    "roadsideReferencePointLinear",
    "linearExtension"
})
public class Linear
    extends NetworkLocation
{

    protected TpegLinearLocation tpegLinearLocation;
    protected AlertCLinear alertCLinear;
    protected RoadsideReferencePointLinear roadsideReferencePointLinear;
    protected ExtensionType linearExtension;

    /**
     * Recupera il valore della proprietà tpegLinearLocation.
     * 
     * @return
     *     possible object is
     *     {@link TpegLinearLocation }
     *     
     */
    public TpegLinearLocation getTpegLinearLocation() {
        return tpegLinearLocation;
    }

    /**
     * Imposta il valore della proprietà tpegLinearLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegLinearLocation }
     *     
     */
    public void setTpegLinearLocation(TpegLinearLocation value) {
        this.tpegLinearLocation = value;
    }

    /**
     * Recupera il valore della proprietà alertCLinear.
     * 
     * @return
     *     possible object is
     *     {@link AlertCLinear }
     *     
     */
    public AlertCLinear getAlertCLinear() {
        return alertCLinear;
    }

    /**
     * Imposta il valore della proprietà alertCLinear.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertCLinear }
     *     
     */
    public void setAlertCLinear(AlertCLinear value) {
        this.alertCLinear = value;
    }

    /**
     * Recupera il valore della proprietà roadsideReferencePointLinear.
     * 
     * @return
     *     possible object is
     *     {@link RoadsideReferencePointLinear }
     *     
     */
    public RoadsideReferencePointLinear getRoadsideReferencePointLinear() {
        return roadsideReferencePointLinear;
    }

    /**
     * Imposta il valore della proprietà roadsideReferencePointLinear.
     * 
     * @param value
     *     allowed object is
     *     {@link RoadsideReferencePointLinear }
     *     
     */
    public void setRoadsideReferencePointLinear(RoadsideReferencePointLinear value) {
        this.roadsideReferencePointLinear = value;
    }

    /**
     * Recupera il valore della proprietà linearExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getLinearExtension() {
        return linearExtension;
    }

    /**
     * Imposta il valore della proprietà linearExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setLinearExtension(ExtensionType value) {
        this.linearExtension = value;
    }

    public Linear withTpegLinearLocation(TpegLinearLocation value) {
        setTpegLinearLocation(value);
        return this;
    }

    public Linear withAlertCLinear(AlertCLinear value) {
        setAlertCLinear(value);
        return this;
    }

    public Linear withRoadsideReferencePointLinear(RoadsideReferencePointLinear value) {
        setRoadsideReferencePointLinear(value);
        return this;
    }

    public Linear withLinearExtension(ExtensionType value) {
        setLinearExtension(value);
        return this;
    }

    @Override
    public Linear withSupplementaryPositionalDescription(SupplementaryPositionalDescription value) {
        setSupplementaryPositionalDescription(value);
        return this;
    }

    @Override
    public Linear withDestination(Destination value) {
        setDestination(value);
        return this;
    }

    @Override
    public Linear withNetworkLocationExtension(ExtensionType value) {
        setNetworkLocationExtension(value);
        return this;
    }

    @Override
    public Linear withExternalReferencing(ExternalReferencing... values) {
        if (values!= null) {
            for (ExternalReferencing value: values) {
                getExternalReferencing().add(value);
            }
        }
        return this;
    }

    @Override
    public Linear withExternalReferencing(Collection<ExternalReferencing> values) {
        if (values!= null) {
            getExternalReferencing().addAll(values);
        }
        return this;
    }

    @Override
    public Linear withLocationForDisplay(PointCoordinates value) {
        setLocationForDisplay(value);
        return this;
    }

    @Override
    public Linear withLocationExtension(ExtensionType value) {
        setLocationExtension(value);
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

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
 * <p>Classe Java per Area complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Area"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}Location"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alertCArea" type="{http://datex2.eu/schema/2_0RC1/2_0}AlertCArea" minOccurs="0"/&gt;
 *         &lt;element name="tpegAreaLocation" type="{http://datex2.eu/schema/2_0RC1/2_0}TpegAreaLocation" minOccurs="0"/&gt;
 *         &lt;element name="areaExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Area", propOrder = {
    "alertCArea",
    "tpegAreaLocation",
    "areaExtension"
})
public class Area
    extends Location
{

    protected AlertCArea alertCArea;
    protected TpegAreaLocation tpegAreaLocation;
    protected ExtensionType areaExtension;

    /**
     * Recupera il valore della proprietà alertCArea.
     * 
     * @return
     *     possible object is
     *     {@link AlertCArea }
     *     
     */
    public AlertCArea getAlertCArea() {
        return alertCArea;
    }

    /**
     * Imposta il valore della proprietà alertCArea.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertCArea }
     *     
     */
    public void setAlertCArea(AlertCArea value) {
        this.alertCArea = value;
    }

    /**
     * Recupera il valore della proprietà tpegAreaLocation.
     * 
     * @return
     *     possible object is
     *     {@link TpegAreaLocation }
     *     
     */
    public TpegAreaLocation getTpegAreaLocation() {
        return tpegAreaLocation;
    }

    /**
     * Imposta il valore della proprietà tpegAreaLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegAreaLocation }
     *     
     */
    public void setTpegAreaLocation(TpegAreaLocation value) {
        this.tpegAreaLocation = value;
    }

    /**
     * Recupera il valore della proprietà areaExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getAreaExtension() {
        return areaExtension;
    }

    /**
     * Imposta il valore della proprietà areaExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setAreaExtension(ExtensionType value) {
        this.areaExtension = value;
    }

    public Area withAlertCArea(AlertCArea value) {
        setAlertCArea(value);
        return this;
    }

    public Area withTpegAreaLocation(TpegAreaLocation value) {
        setTpegAreaLocation(value);
        return this;
    }

    public Area withAreaExtension(ExtensionType value) {
        setAreaExtension(value);
        return this;
    }

    @Override
    public Area withExternalReferencing(ExternalReferencing... values) {
        if (values!= null) {
            for (ExternalReferencing value: values) {
                getExternalReferencing().add(value);
            }
        }
        return this;
    }

    @Override
    public Area withExternalReferencing(Collection<ExternalReferencing> values) {
        if (values!= null) {
            getExternalReferencing().addAll(values);
        }
        return this;
    }

    @Override
    public Area withLocationForDisplay(PointCoordinates value) {
        setLocationForDisplay(value);
        return this;
    }

    @Override
    public Area withLocationExtension(ExtensionType value) {
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

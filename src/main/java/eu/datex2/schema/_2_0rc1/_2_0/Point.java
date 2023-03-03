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
 * <p>Classe Java per Point complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Point"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}NetworkLocation"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tpegPointLocation" type="{http://datex2.eu/schema/2_0RC1/2_0}TpegPointLocation" minOccurs="0"/&gt;
 *         &lt;element name="alertCPoint" type="{http://datex2.eu/schema/2_0RC1/2_0}AlertCPoint" minOccurs="0"/&gt;
 *         &lt;element name="roadsideReferencePoint" type="{http://datex2.eu/schema/2_0RC1/2_0}RoadsideReferencePoint" minOccurs="0"/&gt;
 *         &lt;element name="pointByCoordinates" type="{http://datex2.eu/schema/2_0RC1/2_0}PointByCoordinates" minOccurs="0"/&gt;
 *         &lt;element name="pointExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Point", propOrder = {
    "tpegPointLocation",
    "alertCPoint",
    "roadsideReferencePoint",
    "pointByCoordinates",
    "pointExtension"
})
public class Point
    extends NetworkLocation
{

    protected TpegPointLocation tpegPointLocation;
    protected AlertCPoint alertCPoint;
    protected RoadsideReferencePoint roadsideReferencePoint;
    protected PointByCoordinates pointByCoordinates;
    protected ExtensionType pointExtension;

    /**
     * Recupera il valore della proprietà tpegPointLocation.
     * 
     * @return
     *     possible object is
     *     {@link TpegPointLocation }
     *     
     */
    public TpegPointLocation getTpegPointLocation() {
        return tpegPointLocation;
    }

    /**
     * Imposta il valore della proprietà tpegPointLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegPointLocation }
     *     
     */
    public void setTpegPointLocation(TpegPointLocation value) {
        this.tpegPointLocation = value;
    }

    /**
     * Recupera il valore della proprietà alertCPoint.
     * 
     * @return
     *     possible object is
     *     {@link AlertCPoint }
     *     
     */
    public AlertCPoint getAlertCPoint() {
        return alertCPoint;
    }

    /**
     * Imposta il valore della proprietà alertCPoint.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertCPoint }
     *     
     */
    public void setAlertCPoint(AlertCPoint value) {
        this.alertCPoint = value;
    }

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
     * Recupera il valore della proprietà pointByCoordinates.
     * 
     * @return
     *     possible object is
     *     {@link PointByCoordinates }
     *     
     */
    public PointByCoordinates getPointByCoordinates() {
        return pointByCoordinates;
    }

    /**
     * Imposta il valore della proprietà pointByCoordinates.
     * 
     * @param value
     *     allowed object is
     *     {@link PointByCoordinates }
     *     
     */
    public void setPointByCoordinates(PointByCoordinates value) {
        this.pointByCoordinates = value;
    }

    /**
     * Recupera il valore della proprietà pointExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPointExtension() {
        return pointExtension;
    }

    /**
     * Imposta il valore della proprietà pointExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPointExtension(ExtensionType value) {
        this.pointExtension = value;
    }

    public Point withTpegPointLocation(TpegPointLocation value) {
        setTpegPointLocation(value);
        return this;
    }

    public Point withAlertCPoint(AlertCPoint value) {
        setAlertCPoint(value);
        return this;
    }

    public Point withRoadsideReferencePoint(RoadsideReferencePoint value) {
        setRoadsideReferencePoint(value);
        return this;
    }

    public Point withPointByCoordinates(PointByCoordinates value) {
        setPointByCoordinates(value);
        return this;
    }

    public Point withPointExtension(ExtensionType value) {
        setPointExtension(value);
        return this;
    }

    @Override
    public Point withSupplementaryPositionalDescription(SupplementaryPositionalDescription value) {
        setSupplementaryPositionalDescription(value);
        return this;
    }

    @Override
    public Point withDestination(Destination value) {
        setDestination(value);
        return this;
    }

    @Override
    public Point withNetworkLocationExtension(ExtensionType value) {
        setNetworkLocationExtension(value);
        return this;
    }

    @Override
    public Point withExternalReferencing(ExternalReferencing... values) {
        if (values!= null) {
            for (ExternalReferencing value: values) {
                getExternalReferencing().add(value);
            }
        }
        return this;
    }

    @Override
    public Point withExternalReferencing(Collection<ExternalReferencing> values) {
        if (values!= null) {
            getExternalReferencing().addAll(values);
        }
        return this;
    }

    @Override
    public Point withLocationForDisplay(PointCoordinates value) {
        setLocationForDisplay(value);
        return this;
    }

    @Override
    public Point withLocationExtension(ExtensionType value) {
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

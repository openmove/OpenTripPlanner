//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package de.vdv.ojp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per GeoRestrictionsStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="GeoRestrictionsStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Circle" type="{http://www.vdv.de/ojp}GeoCircleStructure"/&gt;
 *         &lt;element name="Rectangle" type="{http://www.vdv.de/ojp}GeoRectangleStructure"/&gt;
 *         &lt;element name="Area" type="{http://www.vdv.de/ojp}GeoAreaStructure"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeoRestrictionsStructure", propOrder = {
    "circle",
    "rectangle",
    "area"
})
public class GeoRestrictionsStructure {

    @XmlElement(name = "Circle")
    protected GeoCircleStructure circle;
    @XmlElement(name = "Rectangle")
    protected GeoRectangleStructure rectangle;
    @XmlElement(name = "Area")
    protected GeoAreaStructure area;

    /**
     * Recupera il valore della proprietà circle.
     * 
     * @return
     *     possible object is
     *     {@link GeoCircleStructure }
     *     
     */
    public GeoCircleStructure getCircle() {
        return circle;
    }

    /**
     * Imposta il valore della proprietà circle.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoCircleStructure }
     *     
     */
    public void setCircle(GeoCircleStructure value) {
        this.circle = value;
    }

    /**
     * Recupera il valore della proprietà rectangle.
     * 
     * @return
     *     possible object is
     *     {@link GeoRectangleStructure }
     *     
     */
    public GeoRectangleStructure getRectangle() {
        return rectangle;
    }

    /**
     * Imposta il valore della proprietà rectangle.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoRectangleStructure }
     *     
     */
    public void setRectangle(GeoRectangleStructure value) {
        this.rectangle = value;
    }

    /**
     * Recupera il valore della proprietà area.
     * 
     * @return
     *     possible object is
     *     {@link GeoAreaStructure }
     *     
     */
    public GeoAreaStructure getArea() {
        return area;
    }

    /**
     * Imposta il valore della proprietà area.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoAreaStructure }
     *     
     */
    public void setArea(GeoAreaStructure value) {
        this.area = value;
    }

    public GeoRestrictionsStructure withCircle(GeoCircleStructure value) {
        setCircle(value);
        return this;
    }

    public GeoRestrictionsStructure withRectangle(GeoRectangleStructure value) {
        setRectangle(value);
        return this;
    }

    public GeoRestrictionsStructure withArea(GeoAreaStructure value) {
        setArea(value);
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

//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package de.vdv.ojp;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.bliksemlabs.ojp.model.LocationStructure;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per GeoCircleStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="GeoCircleStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Center" type="{http://www.siri.org.uk/siri}LocationStructure"/&gt;
 *         &lt;element name="Radius" type="{http://www.siri.org.uk/siri}DistanceType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeoCircleStructure", propOrder = {
    "center",
    "radius"
})
public class GeoCircleStructure {

    @XmlElement(name = "Center", required = true)
    protected LocationStructure center;
    @XmlElement(name = "Radius", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger radius;

    /**
     * Recupera il valore della proprietà center.
     * 
     * @return
     *     possible object is
     *     {@link LocationStructure }
     *     
     */
    public LocationStructure getCenter() {
        return center;
    }

    /**
     * Imposta il valore della proprietà center.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationStructure }
     *     
     */
    public void setCenter(LocationStructure value) {
        this.center = value;
    }

    /**
     * Recupera il valore della proprietà radius.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRadius() {
        return radius;
    }

    /**
     * Imposta il valore della proprietà radius.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRadius(BigInteger value) {
        this.radius = value;
    }

    public GeoCircleStructure withCenter(LocationStructure value) {
        setCenter(value);
        return this;
    }

    public GeoCircleStructure withRadius(BigInteger value) {
        setRadius(value);
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

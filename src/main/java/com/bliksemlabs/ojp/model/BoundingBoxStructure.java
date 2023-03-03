//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package com.bliksemlabs.ojp.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per BoundingBoxStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BoundingBoxStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UpperLeft" type="{http://www.siri.org.uk/siri}LocationStructure"/&gt;
 *         &lt;element name="LowerRight" type="{http://www.siri.org.uk/siri}LocationStructure"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BoundingBoxStructure", propOrder = {
    "upperLeft",
    "lowerRight"
})
public class BoundingBoxStructure {

    @XmlElement(name = "UpperLeft", required = true)
    protected LocationStructure upperLeft;
    @XmlElement(name = "LowerRight", required = true)
    protected LocationStructure lowerRight;

    /**
     * Recupera il valore della proprietà upperLeft.
     * 
     * @return
     *     possible object is
     *     {@link LocationStructure }
     *     
     */
    public LocationStructure getUpperLeft() {
        return upperLeft;
    }

    /**
     * Imposta il valore della proprietà upperLeft.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationStructure }
     *     
     */
    public void setUpperLeft(LocationStructure value) {
        this.upperLeft = value;
    }

    /**
     * Recupera il valore della proprietà lowerRight.
     * 
     * @return
     *     possible object is
     *     {@link LocationStructure }
     *     
     */
    public LocationStructure getLowerRight() {
        return lowerRight;
    }

    /**
     * Imposta il valore della proprietà lowerRight.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationStructure }
     *     
     */
    public void setLowerRight(LocationStructure value) {
        this.lowerRight = value;
    }

    public BoundingBoxStructure withUpperLeft(LocationStructure value) {
        setUpperLeft(value);
        return this;
    }

    public BoundingBoxStructure withLowerRight(LocationStructure value) {
        setLowerRight(value);
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

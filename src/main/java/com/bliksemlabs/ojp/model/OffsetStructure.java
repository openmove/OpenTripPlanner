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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per OffsetStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="OffsetStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DistanceFromStart" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="DistanceFromEnd" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OffsetStructure", propOrder = {
    "distanceFromStart",
    "distanceFromEnd"
})
public class OffsetStructure {

    @XmlElement(name = "DistanceFromStart")
    @XmlSchemaType(name = "unsignedInt")
    protected Long distanceFromStart;
    @XmlElement(name = "DistanceFromEnd")
    @XmlSchemaType(name = "unsignedInt")
    protected Long distanceFromEnd;

    /**
     * Recupera il valore della proprietà distanceFromStart.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDistanceFromStart() {
        return distanceFromStart;
    }

    /**
     * Imposta il valore della proprietà distanceFromStart.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDistanceFromStart(Long value) {
        this.distanceFromStart = value;
    }

    /**
     * Recupera il valore della proprietà distanceFromEnd.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDistanceFromEnd() {
        return distanceFromEnd;
    }

    /**
     * Imposta il valore della proprietà distanceFromEnd.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDistanceFromEnd(Long value) {
        this.distanceFromEnd = value;
    }

    public OffsetStructure withDistanceFromStart(Long value) {
        setDistanceFromStart(value);
        return this;
    }

    public OffsetStructure withDistanceFromEnd(Long value) {
        setDistanceFromEnd(value);
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

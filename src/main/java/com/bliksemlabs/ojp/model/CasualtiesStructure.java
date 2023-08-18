//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package com.bliksemlabs.ojp.model;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per CasualtiesStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CasualtiesStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NumberOfDeaths" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfInjured" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CasualtiesStructure", propOrder = {
    "numberOfDeaths",
    "numberOfInjured"
})
public class CasualtiesStructure {

    @XmlElement(name = "NumberOfDeaths")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfDeaths;
    @XmlElement(name = "NumberOfInjured")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfInjured;

    /**
     * Recupera il valore della proprietà numberOfDeaths.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfDeaths() {
        return numberOfDeaths;
    }

    /**
     * Imposta il valore della proprietà numberOfDeaths.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfDeaths(BigInteger value) {
        this.numberOfDeaths = value;
    }

    /**
     * Recupera il valore della proprietà numberOfInjured.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfInjured() {
        return numberOfInjured;
    }

    /**
     * Imposta il valore della proprietà numberOfInjured.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfInjured(BigInteger value) {
        this.numberOfInjured = value;
    }

    public CasualtiesStructure withNumberOfDeaths(BigInteger value) {
        setNumberOfDeaths(value);
        return this;
    }

    public CasualtiesStructure withNumberOfInjured(BigInteger value) {
        setNumberOfInjured(value);
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

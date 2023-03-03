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
 * <p>Classe Java per BlockingStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BlockingStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="JourneyPlanner" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RealTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BlockingStructure", propOrder = {
    "journeyPlanner",
    "realTime"
})
public class BlockingStructure {

    @XmlElement(name = "JourneyPlanner", defaultValue = "false")
    protected Boolean journeyPlanner;
    @XmlElement(name = "RealTime", defaultValue = "false")
    protected Boolean realTime;

    /**
     * Recupera il valore della proprietà journeyPlanner.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isJourneyPlanner() {
        return journeyPlanner;
    }

    /**
     * Imposta il valore della proprietà journeyPlanner.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setJourneyPlanner(Boolean value) {
        this.journeyPlanner = value;
    }

    /**
     * Recupera il valore della proprietà realTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRealTime() {
        return realTime;
    }

    /**
     * Imposta il valore della proprietà realTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRealTime(Boolean value) {
        this.realTime = value;
    }

    public BlockingStructure withJourneyPlanner(Boolean value) {
        setJourneyPlanner(value);
        return this;
    }

    public BlockingStructure withRealTime(Boolean value) {
        setRealTime(value);
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

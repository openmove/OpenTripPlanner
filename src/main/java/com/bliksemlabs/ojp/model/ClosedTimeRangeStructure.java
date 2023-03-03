//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package com.bliksemlabs.ojp.model;

import java.time.LocalTime;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.LocalTimeISO8601XmlAdapter;


/**
 * <p>Classe Java per ClosedTimeRangeStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ClosedTimeRangeStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}time"/&gt;
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}time"/&gt;
 *         &lt;element name="EndTimePrecision" type="{http://www.siri.org.uk/siri}EndTimePrecisionEnumeration" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClosedTimeRangeStructure", propOrder = {
    "startTime",
    "endTime",
    "endTimePrecision"
})
public class ClosedTimeRangeStructure {

    @XmlElement(name = "StartTime", required = true, type = String.class)
    @XmlJavaTypeAdapter(LocalTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "time")
    protected LocalTime startTime;
    @XmlElement(name = "EndTime", required = true, type = String.class)
    @XmlJavaTypeAdapter(LocalTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "time")
    protected LocalTime endTime;
    @XmlElement(name = "EndTimePrecision", defaultValue = "second")
    @XmlSchemaType(name = "string")
    protected EndTimePrecisionEnumeration endTimePrecision;

    /**
     * Recupera il valore della proprietà startTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalTime getStartTime() {
        return startTime;
    }

    /**
     * Imposta il valore della proprietà startTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTime(LocalTime value) {
        this.startTime = value;
    }

    /**
     * Recupera il valore della proprietà endTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalTime getEndTime() {
        return endTime;
    }

    /**
     * Imposta il valore della proprietà endTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTime(LocalTime value) {
        this.endTime = value;
    }

    /**
     * Recupera il valore della proprietà endTimePrecision.
     * 
     * @return
     *     possible object is
     *     {@link EndTimePrecisionEnumeration }
     *     
     */
    public EndTimePrecisionEnumeration getEndTimePrecision() {
        return endTimePrecision;
    }

    /**
     * Imposta il valore della proprietà endTimePrecision.
     * 
     * @param value
     *     allowed object is
     *     {@link EndTimePrecisionEnumeration }
     *     
     */
    public void setEndTimePrecision(EndTimePrecisionEnumeration value) {
        this.endTimePrecision = value;
    }

    public ClosedTimeRangeStructure withStartTime(LocalTime value) {
        setStartTime(value);
        return this;
    }

    public ClosedTimeRangeStructure withEndTime(LocalTime value) {
        setEndTime(value);
        return this;
    }

    public ClosedTimeRangeStructure withEndTimePrecision(EndTimePrecisionEnumeration value) {
        setEndTimePrecision(value);
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

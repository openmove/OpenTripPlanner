//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package com.bliksemlabs.ojp.model;

import java.time.Duration;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.migesok.jaxb.adapter.javatime.DurationXmlAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per MonitoringInformationStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="MonitoringInformationStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MonitoringInterval" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="MonitoringType" type="{http://www.siri.org.uk/siri}MonitoringTypeEnumeration" minOccurs="0"/&gt;
 *         &lt;element name="MonitoringPeriod" type="{http://www.siri.org.uk/siri}MonitoringValidityConditionStructure" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonitoringInformationStructure", propOrder = {
    "monitoringInterval",
    "monitoringType",
    "monitoringPeriod",
    "extensions"
})
public class MonitoringInformationStructure {

    @XmlElement(name = "MonitoringInterval", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration monitoringInterval;
    @XmlElement(name = "MonitoringType")
    @XmlSchemaType(name = "NMTOKEN")
    protected MonitoringTypeEnumeration monitoringType;
    @XmlElement(name = "MonitoringPeriod")
    protected MonitoringValidityConditionStructure monitoringPeriod;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Recupera il valore della proprietà monitoringInterval.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getMonitoringInterval() {
        return monitoringInterval;
    }

    /**
     * Imposta il valore della proprietà monitoringInterval.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonitoringInterval(Duration value) {
        this.monitoringInterval = value;
    }

    /**
     * Recupera il valore della proprietà monitoringType.
     * 
     * @return
     *     possible object is
     *     {@link MonitoringTypeEnumeration }
     *     
     */
    public MonitoringTypeEnumeration getMonitoringType() {
        return monitoringType;
    }

    /**
     * Imposta il valore della proprietà monitoringType.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitoringTypeEnumeration }
     *     
     */
    public void setMonitoringType(MonitoringTypeEnumeration value) {
        this.monitoringType = value;
    }

    /**
     * Recupera il valore della proprietà monitoringPeriod.
     * 
     * @return
     *     possible object is
     *     {@link MonitoringValidityConditionStructure }
     *     
     */
    public MonitoringValidityConditionStructure getMonitoringPeriod() {
        return monitoringPeriod;
    }

    /**
     * Imposta il valore della proprietà monitoringPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitoringValidityConditionStructure }
     *     
     */
    public void setMonitoringPeriod(MonitoringValidityConditionStructure value) {
        this.monitoringPeriod = value;
    }

    /**
     * Recupera il valore della proprietà extensions.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsStructure }
     *     
     */
    public ExtensionsStructure getExtensions() {
        return extensions;
    }

    /**
     * Imposta il valore della proprietà extensions.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsStructure }
     *     
     */
    public void setExtensions(ExtensionsStructure value) {
        this.extensions = value;
    }

    public MonitoringInformationStructure withMonitoringInterval(Duration value) {
        setMonitoringInterval(value);
        return this;
    }

    public MonitoringInformationStructure withMonitoringType(MonitoringTypeEnumeration value) {
        setMonitoringType(value);
        return this;
    }

    public MonitoringInformationStructure withMonitoringPeriod(MonitoringValidityConditionStructure value) {
        setMonitoringPeriod(value);
        return this;
    }

    public MonitoringInformationStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
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

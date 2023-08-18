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
 * <p>Classe Java per DataSupplyRequestBodyStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DataSupplyRequestBodyStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}DataSupplyTopicGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataSupplyRequestBodyStructure", propOrder = {
    "notificationRef",
    "allData"
})
public class DataSupplyRequestBodyStructure {

    @XmlElement(name = "NotificationRef")
    protected MessageRefStructure notificationRef;
    @XmlElement(name = "AllData", defaultValue = "false")
    protected Boolean allData;

    /**
     * Recupera il valore della proprietà notificationRef.
     * 
     * @return
     *     possible object is
     *     {@link MessageRefStructure }
     *     
     */
    public MessageRefStructure getNotificationRef() {
        return notificationRef;
    }

    /**
     * Imposta il valore della proprietà notificationRef.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageRefStructure }
     *     
     */
    public void setNotificationRef(MessageRefStructure value) {
        this.notificationRef = value;
    }

    /**
     * Recupera il valore della proprietà allData.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllData() {
        return allData;
    }

    /**
     * Imposta il valore della proprietà allData.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllData(Boolean value) {
        this.allData = value;
    }

    public DataSupplyRequestBodyStructure withNotificationRef(MessageRefStructure value) {
        setNotificationRef(value);
        return this;
    }

    public DataSupplyRequestBodyStructure withAllData(Boolean value) {
        setAllData(value);
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

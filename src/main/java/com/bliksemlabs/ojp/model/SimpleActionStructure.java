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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per SimpleActionStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SimpleActionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActionStatus" type="{http://www.siri.org.uk/siri}ActionStatusEnumeration" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleActionStructure", propOrder = {
    "actionStatus"
})
@XmlSeeAlso({
    ParameterisedActionStructure.class
})
public class SimpleActionStructure {

    @XmlElement(name = "ActionStatus", defaultValue = "open")
    @XmlSchemaType(name = "NMTOKEN")
    protected ActionStatusEnumeration actionStatus;

    /**
     * Recupera il valore della proprietà actionStatus.
     * 
     * @return
     *     possible object is
     *     {@link ActionStatusEnumeration }
     *     
     */
    public ActionStatusEnumeration getActionStatus() {
        return actionStatus;
    }

    /**
     * Imposta il valore della proprietà actionStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionStatusEnumeration }
     *     
     */
    public void setActionStatus(ActionStatusEnumeration value) {
        this.actionStatus = value;
    }

    public SimpleActionStructure withActionStatus(ActionStatusEnumeration value) {
        setActionStatus(value);
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

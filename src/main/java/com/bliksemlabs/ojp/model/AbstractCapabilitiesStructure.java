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
 * <p>Classe Java per AbstractCapabilitiesStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AbstractCapabilitiesStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GeneralInteraction" type="{http://www.siri.org.uk/siri}CapabilityGeneralInteractionStructure" minOccurs="0"/&gt;
 *         &lt;element name="TransportDescription" type="{http://www.siri.org.uk/siri}TransportDescriptionStructure" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractCapabilitiesStructure", propOrder = {
    "generalInteraction",
    "transportDescription"
})
public class AbstractCapabilitiesStructure {

    @XmlElement(name = "GeneralInteraction")
    protected CapabilityGeneralInteractionStructure generalInteraction;
    @XmlElement(name = "TransportDescription")
    protected TransportDescriptionStructure transportDescription;

    /**
     * Recupera il valore della proprietà generalInteraction.
     * 
     * @return
     *     possible object is
     *     {@link CapabilityGeneralInteractionStructure }
     *     
     */
    public CapabilityGeneralInteractionStructure getGeneralInteraction() {
        return generalInteraction;
    }

    /**
     * Imposta il valore della proprietà generalInteraction.
     * 
     * @param value
     *     allowed object is
     *     {@link CapabilityGeneralInteractionStructure }
     *     
     */
    public void setGeneralInteraction(CapabilityGeneralInteractionStructure value) {
        this.generalInteraction = value;
    }

    /**
     * Recupera il valore della proprietà transportDescription.
     * 
     * @return
     *     possible object is
     *     {@link TransportDescriptionStructure }
     *     
     */
    public TransportDescriptionStructure getTransportDescription() {
        return transportDescription;
    }

    /**
     * Imposta il valore della proprietà transportDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportDescriptionStructure }
     *     
     */
    public void setTransportDescription(TransportDescriptionStructure value) {
        this.transportDescription = value;
    }

    public AbstractCapabilitiesStructure withGeneralInteraction(CapabilityGeneralInteractionStructure value) {
        setGeneralInteraction(value);
        return this;
    }

    public AbstractCapabilitiesStructure withTransportDescription(TransportDescriptionStructure value) {
        setTransportDescription(value);
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

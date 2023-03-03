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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per CapabilityNotSupportedErrorStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CapabilityNotSupportedErrorStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}ErrorCodeStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CapabilityRef" type="{http://www.siri.org.uk/siri}CapabilityCodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilityNotSupportedErrorStructure", propOrder = {
    "capabilityRef"
})
public class CapabilityNotSupportedErrorStructure
    extends ErrorCodeStructure
{

    @XmlElement(name = "CapabilityRef")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String capabilityRef;

    /**
     * Recupera il valore della proprietà capabilityRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapabilityRef() {
        return capabilityRef;
    }

    /**
     * Imposta il valore della proprietà capabilityRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapabilityRef(String value) {
        this.capabilityRef = value;
    }

    public CapabilityNotSupportedErrorStructure withCapabilityRef(String value) {
        setCapabilityRef(value);
        return this;
    }

    @Override
    public CapabilityNotSupportedErrorStructure withErrorText(String value) {
        setErrorText(value);
        return this;
    }

    @Override
    public CapabilityNotSupportedErrorStructure withNumber(BigInteger value) {
        setNumber(value);
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

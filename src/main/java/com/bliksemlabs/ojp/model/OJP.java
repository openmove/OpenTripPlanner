//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package com.bliksemlabs.ojp.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.siri.org.uk/siri}OJPRequest"/&gt;
 *           &lt;element ref="{http://www.siri.org.uk/siri}OJPResponse"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" fixed="1.0" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ojpRequest",
    "ojpResponse",
    "extensions"
})
@XmlRootElement(name = "OJP")
public class OJP {

    @XmlElement(name = "OJPRequest")
    protected OJPRequestStructure ojpRequest;
    @XmlElement(name = "OJPResponse")
    protected OJPResponseStructure ojpResponse;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;
    @XmlAttribute(name = "version", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String version;

    /**
     * Recupera il valore della proprietà ojpRequest.
     * 
     * @return
     *     possible object is
     *     {@link OJPRequestStructure }
     *     
     */
    public OJPRequestStructure getOJPRequest() {
        return ojpRequest;
    }

    /**
     * Imposta il valore della proprietà ojpRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link OJPRequestStructure }
     *     
     */
    public void setOJPRequest(OJPRequestStructure value) {
        this.ojpRequest = value;
    }

    /**
     * Recupera il valore della proprietà ojpResponse.
     * 
     * @return
     *     possible object is
     *     {@link OJPResponseStructure }
     *     
     */
    public OJPResponseStructure getOJPResponse() {
        return ojpResponse;
    }

    /**
     * Imposta il valore della proprietà ojpResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link OJPResponseStructure }
     *     
     */
    public void setOJPResponse(OJPResponseStructure value) {
        this.ojpResponse = value;
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

    /**
     * Recupera il valore della proprietà version.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "1.0";
        } else {
            return version;
        }
    }

    /**
     * Imposta il valore della proprietà version.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    public OJP withOJPRequest(OJPRequestStructure value) {
        setOJPRequest(value);
        return this;
    }

    public OJP withOJPResponse(OJPResponseStructure value) {
        setOJPResponse(value);
        return this;
    }

    public OJP withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    public OJP withVersion(String value) {
        setVersion(value);
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

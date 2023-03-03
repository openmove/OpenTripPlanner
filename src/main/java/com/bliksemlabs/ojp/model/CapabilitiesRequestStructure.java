//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package com.bliksemlabs.ojp.model;

import java.time.LocalDateTime;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per CapabilitiesRequestStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CapabilitiesRequestStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}RequestStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}AbstractFunctionalServiceCapabilitiesRequest"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="version" type="{http://www.siri.org.uk/siri}VersionString" default="2.0" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilitiesRequestStructure", propOrder = {
    "abstractFunctionalServiceCapabilitiesRequest"
})
public class CapabilitiesRequestStructure
    extends RequestStructure
{

    @XmlElement(name = "AbstractFunctionalServiceCapabilitiesRequest", required = true)
    protected AbstractServiceRequestStructure abstractFunctionalServiceCapabilitiesRequest;
    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String version;

    /**
     * Recupera il valore della proprietà abstractFunctionalServiceCapabilitiesRequest.
     * 
     * @return
     *     possible object is
     *     {@link AbstractServiceRequestStructure }
     *     
     */
    public AbstractServiceRequestStructure getAbstractFunctionalServiceCapabilitiesRequest() {
        return abstractFunctionalServiceCapabilitiesRequest;
    }

    /**
     * Imposta il valore della proprietà abstractFunctionalServiceCapabilitiesRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractServiceRequestStructure }
     *     
     */
    public void setAbstractFunctionalServiceCapabilitiesRequest(AbstractServiceRequestStructure value) {
        this.abstractFunctionalServiceCapabilitiesRequest = value;
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
            return "2.0";
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

    public CapabilitiesRequestStructure withAbstractFunctionalServiceCapabilitiesRequest(AbstractServiceRequestStructure value) {
        setAbstractFunctionalServiceCapabilitiesRequest(value);
        return this;
    }

    public CapabilitiesRequestStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public CapabilitiesRequestStructure withAddress(String value) {
        setAddress(value);
        return this;
    }

    @Override
    public CapabilitiesRequestStructure withRequestorRef(ParticipantRefStructure value) {
        setRequestorRef(value);
        return this;
    }

    @Override
    public CapabilitiesRequestStructure withMessageIdentifier(MessageQualifierStructure value) {
        setMessageIdentifier(value);
        return this;
    }

    @Override
    public CapabilitiesRequestStructure withDelegatorAddress(String value) {
        setDelegatorAddress(value);
        return this;
    }

    @Override
    public CapabilitiesRequestStructure withDelegatorRef(ParticipantRefStructure value) {
        setDelegatorRef(value);
        return this;
    }

    @Override
    public CapabilitiesRequestStructure withAccountId(String value) {
        setAccountId(value);
        return this;
    }

    @Override
    public CapabilitiesRequestStructure withAccountKey(String value) {
        setAccountKey(value);
        return this;
    }

    @Override
    public CapabilitiesRequestStructure withRequestTimestamp(LocalDateTime value) {
        setRequestTimestamp(value);
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

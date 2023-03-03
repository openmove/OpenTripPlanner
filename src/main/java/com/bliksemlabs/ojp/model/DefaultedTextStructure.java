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
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per DefaultedTextStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DefaultedTextStructure"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.siri.org.uk/siri&gt;NaturalLanguageStringStructure"&gt;
 *       &lt;attribute name="overridden" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DefaultedTextStructure")
public class DefaultedTextStructure
    extends NaturalLanguageStringStructure
{

    @XmlAttribute(name = "overridden")
    protected Boolean overridden;

    /**
     * Recupera il valore della proprietà overridden.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOverridden() {
        if (overridden == null) {
            return true;
        } else {
            return overridden;
        }
    }

    /**
     * Imposta il valore della proprietà overridden.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverridden(Boolean value) {
        this.overridden = value;
    }

    public DefaultedTextStructure withOverridden(Boolean value) {
        setOverridden(value);
        return this;
    }

    @Override
    public DefaultedTextStructure withValue(String value) {
        setValue(value);
        return this;
    }

    @Override
    public DefaultedTextStructure withLang(String value) {
        setLang(value);
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

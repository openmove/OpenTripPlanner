//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package com.bliksemlabs.ojp.model;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per UnknownExtensionsErrorStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="UnknownExtensionsErrorStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}ErrorCodeStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExtensionName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnknownExtensionsErrorStructure", propOrder = {
    "extensionName"
})
public class UnknownExtensionsErrorStructure
    extends ErrorCodeStructure
{

    @XmlElement(name = "ExtensionName")
    protected List<String> extensionName;

    /**
     * Gets the value of the extensionName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extensionName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtensionName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getExtensionName() {
        if (extensionName == null) {
            extensionName = new ArrayList<String>();
        }
        return this.extensionName;
    }

    public UnknownExtensionsErrorStructure withExtensionName(String... values) {
        if (values!= null) {
            for (String value: values) {
                getExtensionName().add(value);
            }
        }
        return this;
    }

    public UnknownExtensionsErrorStructure withExtensionName(Collection<String> values) {
        if (values!= null) {
            getExtensionName().addAll(values);
        }
        return this;
    }

    @Override
    public UnknownExtensionsErrorStructure withErrorText(String value) {
        setErrorText(value);
        return this;
    }

    @Override
    public UnknownExtensionsErrorStructure withNumber(BigInteger value) {
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

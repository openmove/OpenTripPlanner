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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per AbstractRequiredReferencingItemStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AbstractRequiredReferencingItemStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractItemStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ItemRef" type="{http://www.siri.org.uk/siri}ItemRefStructure"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractRequiredReferencingItemStructure", propOrder = {
    "itemRef"
})
public abstract class AbstractRequiredReferencingItemStructure
    extends AbstractItemStructure
{

    @XmlElement(name = "ItemRef", required = true)
    protected ItemRefStructure itemRef;

    /**
     * Recupera il valore della proprietà itemRef.
     * 
     * @return
     *     possible object is
     *     {@link ItemRefStructure }
     *     
     */
    public ItemRefStructure getItemRef() {
        return itemRef;
    }

    /**
     * Imposta il valore della proprietà itemRef.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemRefStructure }
     *     
     */
    public void setItemRef(ItemRefStructure value) {
        this.itemRef = value;
    }

    public AbstractRequiredReferencingItemStructure withItemRef(ItemRefStructure value) {
        setItemRef(value);
        return this;
    }

    @Override
    public AbstractRequiredReferencingItemStructure withRecordedAtTime(LocalDateTime value) {
        setRecordedAtTime(value);
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

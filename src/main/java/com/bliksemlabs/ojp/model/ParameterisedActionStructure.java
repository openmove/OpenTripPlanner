//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package com.bliksemlabs.ojp.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per ParameterisedActionStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ParameterisedActionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}SimpleActionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Description" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" minOccurs="0"/&gt;
 *         &lt;element name="ActionData" type="{http://www.siri.org.uk/siri}ActionDataStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParameterisedActionStructure", propOrder = {
    "description",
    "actionData"
})
@XmlSeeAlso({
    PublishToWebActionStructure.class,
    PublishToMobileActionStructure.class,
    PublishToDisplayActionStructure.class,
    PublishToTvActionStructure.class,
    PushedActionStructure.class,
    ManualActionStructure.class
})
public class ParameterisedActionStructure
    extends SimpleActionStructure
{

    @XmlElement(name = "Description")
    protected NaturalLanguageStringStructure description;
    @XmlElement(name = "ActionData")
    protected List<ActionDataStructure> actionData;

    /**
     * Recupera il valore della proprietà description.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getDescription() {
        return description;
    }

    /**
     * Imposta il valore della proprietà description.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setDescription(NaturalLanguageStringStructure value) {
        this.description = value;
    }

    /**
     * Gets the value of the actionData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actionData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActionData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActionDataStructure }
     * 
     * 
     */
    public List<ActionDataStructure> getActionData() {
        if (actionData == null) {
            actionData = new ArrayList<ActionDataStructure>();
        }
        return this.actionData;
    }

    public ParameterisedActionStructure withDescription(NaturalLanguageStringStructure value) {
        setDescription(value);
        return this;
    }

    public ParameterisedActionStructure withActionData(ActionDataStructure... values) {
        if (values!= null) {
            for (ActionDataStructure value: values) {
                getActionData().add(value);
            }
        }
        return this;
    }

    public ParameterisedActionStructure withActionData(Collection<ActionDataStructure> values) {
        if (values!= null) {
            getActionData().addAll(values);
        }
        return this;
    }

    @Override
    public ParameterisedActionStructure withActionStatus(ActionStatusEnumeration value) {
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

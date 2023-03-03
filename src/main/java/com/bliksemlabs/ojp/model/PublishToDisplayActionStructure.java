//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package com.bliksemlabs.ojp.model;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per PublishToDisplayActionStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PublishToDisplayActionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}ParameterisedActionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OnPlace" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OnBoard" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublishToDisplayActionStructure", propOrder = {
    "onPlace",
    "onBoard"
})
public class PublishToDisplayActionStructure
    extends ParameterisedActionStructure
{

    @XmlElement(name = "OnPlace", defaultValue = "true")
    protected Boolean onPlace;
    @XmlElement(name = "OnBoard", defaultValue = "false")
    protected Boolean onBoard;

    /**
     * Recupera il valore della proprietà onPlace.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnPlace() {
        return onPlace;
    }

    /**
     * Imposta il valore della proprietà onPlace.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnPlace(Boolean value) {
        this.onPlace = value;
    }

    /**
     * Recupera il valore della proprietà onBoard.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnBoard() {
        return onBoard;
    }

    /**
     * Imposta il valore della proprietà onBoard.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnBoard(Boolean value) {
        this.onBoard = value;
    }

    public PublishToDisplayActionStructure withOnPlace(Boolean value) {
        setOnPlace(value);
        return this;
    }

    public PublishToDisplayActionStructure withOnBoard(Boolean value) {
        setOnBoard(value);
        return this;
    }

    @Override
    public PublishToDisplayActionStructure withDescription(NaturalLanguageStringStructure value) {
        setDescription(value);
        return this;
    }

    @Override
    public PublishToDisplayActionStructure withActionData(ActionDataStructure... values) {
        if (values!= null) {
            for (ActionDataStructure value: values) {
                getActionData().add(value);
            }
        }
        return this;
    }

    @Override
    public PublishToDisplayActionStructure withActionData(Collection<ActionDataStructure> values) {
        if (values!= null) {
            getActionData().addAll(values);
        }
        return this;
    }

    @Override
    public PublishToDisplayActionStructure withActionStatus(ActionStatusEnumeration value) {
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

//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package de.vdv.ojp;

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
 * <p>Classe Java per StopEventResponseStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="StopEventResponseStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ErrorMessage" type="{http://www.vdv.de/ojp}ErrorMessageStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}StopEventResponseGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopEventResponseStructure", propOrder = {
    "errorMessage",
    "stopEventResponseContext",
    "stopEventResult"
})
public class StopEventResponseStructure {

    @XmlElement(name = "ErrorMessage")
    protected List<ErrorMessageStructure> errorMessage;
    @XmlElement(name = "StopEventResponseContext")
    protected StopEventResponseContextStructure stopEventResponseContext;
    @XmlElement(name = "StopEventResult")
    protected List<StopEventResultStructure> stopEventResult;

    /**
     * Gets the value of the errorMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errorMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorMessageStructure }
     * 
     * 
     */
    public List<ErrorMessageStructure> getErrorMessage() {
        if (errorMessage == null) {
            errorMessage = new ArrayList<ErrorMessageStructure>();
        }
        return this.errorMessage;
    }

    /**
     * Recupera il valore della proprietà stopEventResponseContext.
     * 
     * @return
     *     possible object is
     *     {@link StopEventResponseContextStructure }
     *     
     */
    public StopEventResponseContextStructure getStopEventResponseContext() {
        return stopEventResponseContext;
    }

    /**
     * Imposta il valore della proprietà stopEventResponseContext.
     * 
     * @param value
     *     allowed object is
     *     {@link StopEventResponseContextStructure }
     *     
     */
    public void setStopEventResponseContext(StopEventResponseContextStructure value) {
        this.stopEventResponseContext = value;
    }

    /**
     * Gets the value of the stopEventResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stopEventResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStopEventResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StopEventResultStructure }
     * 
     * 
     */
    public List<StopEventResultStructure> getStopEventResult() {
        if (stopEventResult == null) {
            stopEventResult = new ArrayList<StopEventResultStructure>();
        }
        return this.stopEventResult;
    }

    public StopEventResponseStructure withErrorMessage(ErrorMessageStructure... values) {
        if (values!= null) {
            for (ErrorMessageStructure value: values) {
                getErrorMessage().add(value);
            }
        }
        return this;
    }

    public StopEventResponseStructure withErrorMessage(Collection<ErrorMessageStructure> values) {
        if (values!= null) {
            getErrorMessage().addAll(values);
        }
        return this;
    }

    public StopEventResponseStructure withStopEventResponseContext(StopEventResponseContextStructure value) {
        setStopEventResponseContext(value);
        return this;
    }

    public StopEventResponseStructure withStopEventResult(StopEventResultStructure... values) {
        if (values!= null) {
            for (StopEventResultStructure value: values) {
                getStopEventResult().add(value);
            }
        }
        return this;
    }

    public StopEventResponseStructure withStopEventResult(Collection<StopEventResultStructure> values) {
        if (values!= null) {
            getStopEventResult().addAll(values);
        }
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

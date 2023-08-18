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
 * Multi-point trip response structure.
 * 
 * <p>Classe Java per MultiPointTripResponseStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="MultiPointTripResponseStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ErrorMessage" type="{http://www.vdv.de/ojp}ErrorMessageStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}MultiPointTripResponseGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiPointTripResponseStructure", propOrder = {
    "errorMessage",
    "tripResponseContext",
    "multiPointTripResult"
})
public class MultiPointTripResponseStructure {

    @XmlElement(name = "ErrorMessage")
    protected List<ErrorMessageStructure> errorMessage;
    @XmlElement(name = "TripResponseContext")
    protected TripResponseContextStructure tripResponseContext;
    @XmlElement(name = "MultiPointTripResult")
    protected List<MultiPointTripResultStructure> multiPointTripResult;

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
     * Recupera il valore della proprietà tripResponseContext.
     * 
     * @return
     *     possible object is
     *     {@link TripResponseContextStructure }
     *     
     */
    public TripResponseContextStructure getTripResponseContext() {
        return tripResponseContext;
    }

    /**
     * Imposta il valore della proprietà tripResponseContext.
     * 
     * @param value
     *     allowed object is
     *     {@link TripResponseContextStructure }
     *     
     */
    public void setTripResponseContext(TripResponseContextStructure value) {
        this.tripResponseContext = value;
    }

    /**
     * Gets the value of the multiPointTripResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the multiPointTripResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMultiPointTripResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MultiPointTripResultStructure }
     * 
     * 
     */
    public List<MultiPointTripResultStructure> getMultiPointTripResult() {
        if (multiPointTripResult == null) {
            multiPointTripResult = new ArrayList<MultiPointTripResultStructure>();
        }
        return this.multiPointTripResult;
    }

    public MultiPointTripResponseStructure withErrorMessage(ErrorMessageStructure... values) {
        if (values!= null) {
            for (ErrorMessageStructure value: values) {
                getErrorMessage().add(value);
            }
        }
        return this;
    }

    public MultiPointTripResponseStructure withErrorMessage(Collection<ErrorMessageStructure> values) {
        if (values!= null) {
            getErrorMessage().addAll(values);
        }
        return this;
    }

    public MultiPointTripResponseStructure withTripResponseContext(TripResponseContextStructure value) {
        setTripResponseContext(value);
        return this;
    }

    public MultiPointTripResponseStructure withMultiPointTripResult(MultiPointTripResultStructure... values) {
        if (values!= null) {
            for (MultiPointTripResultStructure value: values) {
                getMultiPointTripResult().add(value);
            }
        }
        return this;
    }

    public MultiPointTripResponseStructure withMultiPointTripResult(Collection<MultiPointTripResultStructure> values) {
        if (values!= null) {
            getMultiPointTripResult().addAll(values);
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

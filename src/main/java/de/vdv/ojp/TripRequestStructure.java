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
 * <p>Classe Java per TripRequestStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TripRequestStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}TripRequestGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TripRequestStructure", propOrder = {
    "origin",
    "destination",
    "via",
    "notVia",
    "noChangeAt",
    "params"
})
public class TripRequestStructure {

    @XmlElement(name = "Origin", required = true)
    protected List<PlaceContextStructure> origin;
    @XmlElement(name = "Destination", required = true)
    protected List<PlaceContextStructure> destination;
    @XmlElement(name = "Via")
    protected List<TripViaStructure> via;
    @XmlElement(name = "NotVia")
    protected List<NotViaStructure> notVia;
    @XmlElement(name = "NoChangeAt")
    protected List<NoChangeAtStructure> noChangeAt;
    @XmlElement(name = "Params")
    protected TripParamStructure params;

    /**
     * Gets the value of the origin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the origin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrigin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlaceContextStructure }
     * 
     * 
     */
    public List<PlaceContextStructure> getOrigin() {
        if (origin == null) {
            origin = new ArrayList<PlaceContextStructure>();
        }
        return this.origin;
    }

    /**
     * Gets the value of the destination property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the destination property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestination().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlaceContextStructure }
     * 
     * 
     */
    public List<PlaceContextStructure> getDestination() {
        if (destination == null) {
            destination = new ArrayList<PlaceContextStructure>();
        }
        return this.destination;
    }

    /**
     * Gets the value of the via property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the via property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TripViaStructure }
     * 
     * 
     */
    public List<TripViaStructure> getVia() {
        if (via == null) {
            via = new ArrayList<TripViaStructure>();
        }
        return this.via;
    }

    /**
     * Gets the value of the notVia property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notVia property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotVia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotViaStructure }
     * 
     * 
     */
    public List<NotViaStructure> getNotVia() {
        if (notVia == null) {
            notVia = new ArrayList<NotViaStructure>();
        }
        return this.notVia;
    }

    /**
     * Gets the value of the noChangeAt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the noChangeAt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNoChangeAt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NoChangeAtStructure }
     * 
     * 
     */
    public List<NoChangeAtStructure> getNoChangeAt() {
        if (noChangeAt == null) {
            noChangeAt = new ArrayList<NoChangeAtStructure>();
        }
        return this.noChangeAt;
    }

    /**
     * Recupera il valore della proprietà params.
     * 
     * @return
     *     possible object is
     *     {@link TripParamStructure }
     *     
     */
    public TripParamStructure getParams() {
        return params;
    }

    /**
     * Imposta il valore della proprietà params.
     * 
     * @param value
     *     allowed object is
     *     {@link TripParamStructure }
     *     
     */
    public void setParams(TripParamStructure value) {
        this.params = value;
    }

    public TripRequestStructure withOrigin(PlaceContextStructure... values) {
        if (values!= null) {
            for (PlaceContextStructure value: values) {
                getOrigin().add(value);
            }
        }
        return this;
    }

    public TripRequestStructure withOrigin(Collection<PlaceContextStructure> values) {
        if (values!= null) {
            getOrigin().addAll(values);
        }
        return this;
    }

    public TripRequestStructure withDestination(PlaceContextStructure... values) {
        if (values!= null) {
            for (PlaceContextStructure value: values) {
                getDestination().add(value);
            }
        }
        return this;
    }

    public TripRequestStructure withDestination(Collection<PlaceContextStructure> values) {
        if (values!= null) {
            getDestination().addAll(values);
        }
        return this;
    }

    public TripRequestStructure withVia(TripViaStructure... values) {
        if (values!= null) {
            for (TripViaStructure value: values) {
                getVia().add(value);
            }
        }
        return this;
    }

    public TripRequestStructure withVia(Collection<TripViaStructure> values) {
        if (values!= null) {
            getVia().addAll(values);
        }
        return this;
    }

    public TripRequestStructure withNotVia(NotViaStructure... values) {
        if (values!= null) {
            for (NotViaStructure value: values) {
                getNotVia().add(value);
            }
        }
        return this;
    }

    public TripRequestStructure withNotVia(Collection<NotViaStructure> values) {
        if (values!= null) {
            getNotVia().addAll(values);
        }
        return this;
    }

    public TripRequestStructure withNoChangeAt(NoChangeAtStructure... values) {
        if (values!= null) {
            for (NoChangeAtStructure value: values) {
                getNoChangeAt().add(value);
            }
        }
        return this;
    }

    public TripRequestStructure withNoChangeAt(Collection<NoChangeAtStructure> values) {
        if (values!= null) {
            getNoChangeAt().addAll(values);
        }
        return this;
    }

    public TripRequestStructure withParams(TripParamStructure value) {
        setParams(value);
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

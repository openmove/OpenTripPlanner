//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package de.vdv.ojp;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bliksemlabs.ojp.model.DataFrameRefStructure;
import com.bliksemlabs.ojp.model.ExtensionsStructure;
import com.bliksemlabs.ojp.model.MessageQualifierStructure;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per OJPTripRequestStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="OJPTripRequestStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.vdv.de/ojp}AbstractOJPServiceRequestStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}TripRequestGroup"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OJPTripRequestStructure", propOrder = {
    "origin",
    "destination",
    "via",
    "notVia",
    "noChangeAt",
    "params",
    "extensions"
})
public class OJPTripRequestStructure
    extends AbstractOJPServiceRequestStructure
{

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
    @XmlElement(name = "Extensions", namespace = "http://www.siri.org.uk/siri")
    protected ExtensionsStructure extensions;

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

    public OJPTripRequestStructure withOrigin(PlaceContextStructure... values) {
        if (values!= null) {
            for (PlaceContextStructure value: values) {
                getOrigin().add(value);
            }
        }
        return this;
    }

    public OJPTripRequestStructure withOrigin(Collection<PlaceContextStructure> values) {
        if (values!= null) {
            getOrigin().addAll(values);
        }
        return this;
    }

    public OJPTripRequestStructure withDestination(PlaceContextStructure... values) {
        if (values!= null) {
            for (PlaceContextStructure value: values) {
                getDestination().add(value);
            }
        }
        return this;
    }

    public OJPTripRequestStructure withDestination(Collection<PlaceContextStructure> values) {
        if (values!= null) {
            getDestination().addAll(values);
        }
        return this;
    }

    public OJPTripRequestStructure withVia(TripViaStructure... values) {
        if (values!= null) {
            for (TripViaStructure value: values) {
                getVia().add(value);
            }
        }
        return this;
    }

    public OJPTripRequestStructure withVia(Collection<TripViaStructure> values) {
        if (values!= null) {
            getVia().addAll(values);
        }
        return this;
    }

    public OJPTripRequestStructure withNotVia(NotViaStructure... values) {
        if (values!= null) {
            for (NotViaStructure value: values) {
                getNotVia().add(value);
            }
        }
        return this;
    }

    public OJPTripRequestStructure withNotVia(Collection<NotViaStructure> values) {
        if (values!= null) {
            getNotVia().addAll(values);
        }
        return this;
    }

    public OJPTripRequestStructure withNoChangeAt(NoChangeAtStructure... values) {
        if (values!= null) {
            for (NoChangeAtStructure value: values) {
                getNoChangeAt().add(value);
            }
        }
        return this;
    }

    public OJPTripRequestStructure withNoChangeAt(Collection<NoChangeAtStructure> values) {
        if (values!= null) {
            getNoChangeAt().addAll(values);
        }
        return this;
    }

    public OJPTripRequestStructure withParams(TripParamStructure value) {
        setParams(value);
        return this;
    }

    public OJPTripRequestStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public OJPTripRequestStructure withDataFrameRef(DataFrameRefStructure value) {
        setDataFrameRef(value);
        return this;
    }

    @Override
    public OJPTripRequestStructure withExtension(Object value) {
        setExtension(value);
        return this;
    }

    @Override
    public OJPTripRequestStructure withMessageIdentifier(MessageQualifierStructure value) {
        setMessageIdentifier(value);
        return this;
    }

    @Override
    public OJPTripRequestStructure withRequestTimestamp(LocalDateTime value) {
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

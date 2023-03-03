//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per LinearTrafficView complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="LinearTrafficView"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="linearPredefinedLocationReference" type="{http://datex2.eu/schema/2_0RC1/2_0}Reference"/&gt;
 *         &lt;element name="trafficViewRecord" type="{http://datex2.eu/schema/2_0RC1/2_0}TrafficViewRecord" maxOccurs="unbounded"/&gt;
 *         &lt;element name="linearTrafficViewExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinearTrafficView", propOrder = {
    "linearPredefinedLocationReference",
    "trafficViewRecord",
    "linearTrafficViewExtension"
})
public class LinearTrafficView {

    @XmlElement(required = true)
    protected String linearPredefinedLocationReference;
    @XmlElement(required = true)
    protected List<TrafficViewRecord> trafficViewRecord;
    protected ExtensionType linearTrafficViewExtension;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Recupera il valore della proprietà linearPredefinedLocationReference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinearPredefinedLocationReference() {
        return linearPredefinedLocationReference;
    }

    /**
     * Imposta il valore della proprietà linearPredefinedLocationReference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinearPredefinedLocationReference(String value) {
        this.linearPredefinedLocationReference = value;
    }

    /**
     * Gets the value of the trafficViewRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trafficViewRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrafficViewRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrafficViewRecord }
     * 
     * 
     */
    public List<TrafficViewRecord> getTrafficViewRecord() {
        if (trafficViewRecord == null) {
            trafficViewRecord = new ArrayList<TrafficViewRecord>();
        }
        return this.trafficViewRecord;
    }

    /**
     * Recupera il valore della proprietà linearTrafficViewExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getLinearTrafficViewExtension() {
        return linearTrafficViewExtension;
    }

    /**
     * Imposta il valore della proprietà linearTrafficViewExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setLinearTrafficViewExtension(ExtensionType value) {
        this.linearTrafficViewExtension = value;
    }

    /**
     * Recupera il valore della proprietà id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Imposta il valore della proprietà id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    public LinearTrafficView withLinearPredefinedLocationReference(String value) {
        setLinearPredefinedLocationReference(value);
        return this;
    }

    public LinearTrafficView withTrafficViewRecord(TrafficViewRecord... values) {
        if (values!= null) {
            for (TrafficViewRecord value: values) {
                getTrafficViewRecord().add(value);
            }
        }
        return this;
    }

    public LinearTrafficView withTrafficViewRecord(Collection<TrafficViewRecord> values) {
        if (values!= null) {
            getTrafficViewRecord().addAll(values);
        }
        return this;
    }

    public LinearTrafficView withLinearTrafficViewExtension(ExtensionType value) {
        setLinearTrafficViewExtension(value);
        return this;
    }

    public LinearTrafficView withId(String value) {
        setId(value);
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

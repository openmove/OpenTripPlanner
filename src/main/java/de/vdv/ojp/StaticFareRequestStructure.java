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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.LocalDateXmlAdapter;


/**
 * General Fare information. May depend on date.
 * 
 * <p>Classe Java per StaticFareRequestStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="StaticFareRequestStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.vdv.de/ojp}FareProductRef" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StaticFareRequestStructure", propOrder = {
    "date",
    "fareProductRef"
})
public class StaticFareRequestStructure {

    @XmlElement(name = "Date", type = String.class)
    @XmlJavaTypeAdapter(LocalDateXmlAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDateTime date;
    @XmlElement(name = "FareProductRef")
    protected List<FareProductRefStructure> fareProductRef;

    /**
     * Recupera il valore della proprietà date.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getDate() {
        return date;
    }

    /**
     * Imposta il valore della proprietà date.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(LocalDateTime value) {
        this.date = value;
    }

    /**
     * Gets the value of the fareProductRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareProductRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareProductRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareProductRefStructure }
     * 
     * 
     */
    public List<FareProductRefStructure> getFareProductRef() {
        if (fareProductRef == null) {
            fareProductRef = new ArrayList<FareProductRefStructure>();
        }
        return this.fareProductRef;
    }

    public StaticFareRequestStructure withDate(LocalDateTime value) {
        setDate(value);
        return this;
    }

    public StaticFareRequestStructure withFareProductRef(FareProductRefStructure... values) {
        if (values!= null) {
            for (FareProductRefStructure value: values) {
                getFareProductRef().add(value);
            }
        }
        return this;
    }

    public StaticFareRequestStructure withFareProductRef(Collection<FareProductRefStructure> values) {
        if (values!= null) {
            getFareProductRef().addAll(values);
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

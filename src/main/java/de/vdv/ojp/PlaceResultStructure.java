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
 * <p>Classe Java per PlaceResultStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PlaceResultStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Location" type="{http://www.vdv.de/ojp}PlaceStructure"/&gt;
 *         &lt;element name="Complete" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Probability" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float"&gt;
 *               &lt;minInclusive value="0"/&gt;
 *               &lt;maxInclusive value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Mode" type="{http://www.vdv.de/ojp}ModeStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlaceResultStructure", propOrder = {
    "location",
    "complete",
    "probability",
    "mode"
})
public class PlaceResultStructure {

    @XmlElement(name = "Location", required = true)
    protected PlaceStructure location;
    @XmlElement(name = "Complete")
    protected boolean complete;
    @XmlElement(name = "Probability")
    protected Float probability;
    @XmlElement(name = "Mode")
    protected List<ModeStructure> mode;

    /**
     * Recupera il valore della proprietà location.
     * 
     * @return
     *     possible object is
     *     {@link PlaceStructure }
     *     
     */
    public PlaceStructure getLocation() {
        return location;
    }

    /**
     * Imposta il valore della proprietà location.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceStructure }
     *     
     */
    public void setLocation(PlaceStructure value) {
        this.location = value;
    }

    /**
     * Recupera il valore della proprietà complete.
     * 
     */
    public boolean isComplete() {
        return complete;
    }

    /**
     * Imposta il valore della proprietà complete.
     * 
     */
    public void setComplete(boolean value) {
        this.complete = value;
    }

    /**
     * Recupera il valore della proprietà probability.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getProbability() {
        return probability;
    }

    /**
     * Imposta il valore della proprietà probability.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setProbability(Float value) {
        this.probability = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModeStructure }
     * 
     * 
     */
    public List<ModeStructure> getMode() {
        if (mode == null) {
            mode = new ArrayList<ModeStructure>();
        }
        return this.mode;
    }

    public PlaceResultStructure withLocation(PlaceStructure value) {
        setLocation(value);
        return this;
    }

    public PlaceResultStructure withComplete(boolean value) {
        setComplete(value);
        return this;
    }

    public PlaceResultStructure withProbability(Float value) {
        setProbability(value);
        return this;
    }

    public PlaceResultStructure withMode(ModeStructure... values) {
        if (values!= null) {
            for (ModeStructure value: values) {
                getMode().add(value);
            }
        }
        return this;
    }

    public PlaceResultStructure withMode(Collection<ModeStructure> values) {
        if (values!= null) {
            getMode().addAll(values);
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

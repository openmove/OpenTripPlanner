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
import com.bliksemlabs.ojp.model.OperatorRefStructure;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * Filter for in/exclusion of transport operators.
 * 
 * <p>Classe Java per OperatorFilterStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="OperatorFilterStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Exclude" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OperatorRef" type="{http://www.siri.org.uk/siri}OperatorRefStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperatorFilterStructure", propOrder = {
    "exclude",
    "operatorRef"
})
public class OperatorFilterStructure {

    @XmlElement(name = "Exclude", defaultValue = "true")
    protected Boolean exclude;
    @XmlElement(name = "OperatorRef")
    protected List<OperatorRefStructure> operatorRef;

    /**
     * Recupera il valore della proprietà exclude.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExclude() {
        return exclude;
    }

    /**
     * Imposta il valore della proprietà exclude.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExclude(Boolean value) {
        this.exclude = value;
    }

    /**
     * Gets the value of the operatorRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operatorRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperatorRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperatorRefStructure }
     * 
     * 
     */
    public List<OperatorRefStructure> getOperatorRef() {
        if (operatorRef == null) {
            operatorRef = new ArrayList<OperatorRefStructure>();
        }
        return this.operatorRef;
    }

    public OperatorFilterStructure withExclude(Boolean value) {
        setExclude(value);
        return this;
    }

    public OperatorFilterStructure withOperatorRef(OperatorRefStructure... values) {
        if (values!= null) {
            for (OperatorRefStructure value: values) {
                getOperatorRef().add(value);
            }
        }
        return this;
    }

    public OperatorFilterStructure withOperatorRef(Collection<OperatorRefStructure> values) {
        if (values!= null) {
            getOperatorRef().addAll(values);
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

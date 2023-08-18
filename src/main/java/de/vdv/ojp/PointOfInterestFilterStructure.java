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
 * <p>Classe Java per PointOfInterestFilterStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PointOfInterestFilterStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Exclude" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PointOfInterestCategory" type="{http://www.vdv.de/ojp}PointOfInterestCategoryStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointOfInterestFilterStructure", propOrder = {
    "exclude",
    "pointOfInterestCategory"
})
public class PointOfInterestFilterStructure {

    @XmlElement(name = "Exclude", defaultValue = "false")
    protected Boolean exclude;
    @XmlElement(name = "PointOfInterestCategory")
    protected List<PointOfInterestCategoryStructure> pointOfInterestCategory;

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
     * Gets the value of the pointOfInterestCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pointOfInterestCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPointOfInterestCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PointOfInterestCategoryStructure }
     * 
     * 
     */
    public List<PointOfInterestCategoryStructure> getPointOfInterestCategory() {
        if (pointOfInterestCategory == null) {
            pointOfInterestCategory = new ArrayList<PointOfInterestCategoryStructure>();
        }
        return this.pointOfInterestCategory;
    }

    public PointOfInterestFilterStructure withExclude(Boolean value) {
        setExclude(value);
        return this;
    }

    public PointOfInterestFilterStructure withPointOfInterestCategory(PointOfInterestCategoryStructure... values) {
        if (values!= null) {
            for (PointOfInterestCategoryStructure value: values) {
                getPointOfInterestCategory().add(value);
            }
        }
        return this;
    }

    public PointOfInterestFilterStructure withPointOfInterestCategory(Collection<PointOfInterestCategoryStructure> values) {
        if (values!= null) {
            getPointOfInterestCategory().addAll(values);
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

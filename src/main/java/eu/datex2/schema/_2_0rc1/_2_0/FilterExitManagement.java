//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per FilterExitManagement complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="FilterExitManagement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="filterEnd" type="{http://datex2.eu/schema/2_0RC1/2_0}Boolean"/&gt;
 *         &lt;element name="filterOutOfRange" type="{http://datex2.eu/schema/2_0RC1/2_0}Boolean"/&gt;
 *         &lt;element name="filterExitManagementExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilterExitManagement", propOrder = {
    "filterEnd",
    "filterOutOfRange",
    "filterExitManagementExtension"
})
public class FilterExitManagement {

    protected boolean filterEnd;
    protected boolean filterOutOfRange;
    protected ExtensionType filterExitManagementExtension;

    /**
     * Recupera il valore della proprietà filterEnd.
     * 
     */
    public boolean isFilterEnd() {
        return filterEnd;
    }

    /**
     * Imposta il valore della proprietà filterEnd.
     * 
     */
    public void setFilterEnd(boolean value) {
        this.filterEnd = value;
    }

    /**
     * Recupera il valore della proprietà filterOutOfRange.
     * 
     */
    public boolean isFilterOutOfRange() {
        return filterOutOfRange;
    }

    /**
     * Imposta il valore della proprietà filterOutOfRange.
     * 
     */
    public void setFilterOutOfRange(boolean value) {
        this.filterOutOfRange = value;
    }

    /**
     * Recupera il valore della proprietà filterExitManagementExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getFilterExitManagementExtension() {
        return filterExitManagementExtension;
    }

    /**
     * Imposta il valore della proprietà filterExitManagementExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setFilterExitManagementExtension(ExtensionType value) {
        this.filterExitManagementExtension = value;
    }

    public FilterExitManagement withFilterEnd(boolean value) {
        setFilterEnd(value);
        return this;
    }

    public FilterExitManagement withFilterOutOfRange(boolean value) {
        setFilterOutOfRange(value);
        return this;
    }

    public FilterExitManagement withFilterExitManagementExtension(ExtensionType value) {
        setFilterExitManagementExtension(value);
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

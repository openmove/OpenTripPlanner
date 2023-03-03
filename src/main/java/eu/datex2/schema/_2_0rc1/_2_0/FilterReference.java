//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per FilterReference complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="FilterReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deleteFilter" type="{http://datex2.eu/schema/2_0RC1/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="filterOperationApproved" type="{http://datex2.eu/schema/2_0RC1/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="keyFilterReference" type="{http://datex2.eu/schema/2_0RC1/2_0}Reference"/&gt;
 *         &lt;element name="filterReferenceExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilterReference", propOrder = {
    "deleteFilter",
    "filterOperationApproved",
    "keyFilterReference",
    "filterReferenceExtension"
})
public class FilterReference {

    protected Boolean deleteFilter;
    protected Boolean filterOperationApproved;
    @XmlElement(required = true)
    protected String keyFilterReference;
    protected ExtensionType filterReferenceExtension;

    /**
     * Recupera il valore della proprietà deleteFilter.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeleteFilter() {
        return deleteFilter;
    }

    /**
     * Imposta il valore della proprietà deleteFilter.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeleteFilter(Boolean value) {
        this.deleteFilter = value;
    }

    /**
     * Recupera il valore della proprietà filterOperationApproved.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFilterOperationApproved() {
        return filterOperationApproved;
    }

    /**
     * Imposta il valore della proprietà filterOperationApproved.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFilterOperationApproved(Boolean value) {
        this.filterOperationApproved = value;
    }

    /**
     * Recupera il valore della proprietà keyFilterReference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyFilterReference() {
        return keyFilterReference;
    }

    /**
     * Imposta il valore della proprietà keyFilterReference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyFilterReference(String value) {
        this.keyFilterReference = value;
    }

    /**
     * Recupera il valore della proprietà filterReferenceExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getFilterReferenceExtension() {
        return filterReferenceExtension;
    }

    /**
     * Imposta il valore della proprietà filterReferenceExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setFilterReferenceExtension(ExtensionType value) {
        this.filterReferenceExtension = value;
    }

    public FilterReference withDeleteFilter(Boolean value) {
        setDeleteFilter(value);
        return this;
    }

    public FilterReference withFilterOperationApproved(Boolean value) {
        setFilterOperationApproved(value);
        return this;
    }

    public FilterReference withKeyFilterReference(String value) {
        setKeyFilterReference(value);
        return this;
    }

    public FilterReference withFilterReferenceExtension(ExtensionType value) {
        setFilterReferenceExtension(value);
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

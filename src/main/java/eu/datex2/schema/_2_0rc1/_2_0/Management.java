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
 * <p>Classe Java per Management complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Management"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lifeCycleManagement" type="{http://datex2.eu/schema/2_0RC1/2_0}LifeCycleManagement" minOccurs="0"/&gt;
 *         &lt;element name="filterExitManagement" type="{http://datex2.eu/schema/2_0RC1/2_0}FilterExitManagement" minOccurs="0"/&gt;
 *         &lt;element name="managementExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Management", propOrder = {
    "lifeCycleManagement",
    "filterExitManagement",
    "managementExtension"
})
public class Management {

    protected LifeCycleManagement lifeCycleManagement;
    protected FilterExitManagement filterExitManagement;
    protected ExtensionType managementExtension;

    /**
     * Recupera il valore della proprietà lifeCycleManagement.
     * 
     * @return
     *     possible object is
     *     {@link LifeCycleManagement }
     *     
     */
    public LifeCycleManagement getLifeCycleManagement() {
        return lifeCycleManagement;
    }

    /**
     * Imposta il valore della proprietà lifeCycleManagement.
     * 
     * @param value
     *     allowed object is
     *     {@link LifeCycleManagement }
     *     
     */
    public void setLifeCycleManagement(LifeCycleManagement value) {
        this.lifeCycleManagement = value;
    }

    /**
     * Recupera il valore della proprietà filterExitManagement.
     * 
     * @return
     *     possible object is
     *     {@link FilterExitManagement }
     *     
     */
    public FilterExitManagement getFilterExitManagement() {
        return filterExitManagement;
    }

    /**
     * Imposta il valore della proprietà filterExitManagement.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterExitManagement }
     *     
     */
    public void setFilterExitManagement(FilterExitManagement value) {
        this.filterExitManagement = value;
    }

    /**
     * Recupera il valore della proprietà managementExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getManagementExtension() {
        return managementExtension;
    }

    /**
     * Imposta il valore della proprietà managementExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setManagementExtension(ExtensionType value) {
        this.managementExtension = value;
    }

    public Management withLifeCycleManagement(LifeCycleManagement value) {
        setLifeCycleManagement(value);
        return this;
    }

    public Management withFilterExitManagement(FilterExitManagement value) {
        setFilterExitManagement(value);
        return this;
    }

    public Management withManagementExtension(ExtensionType value) {
        setManagementExtension(value);
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

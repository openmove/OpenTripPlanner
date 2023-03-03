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
 * <p>Classe Java per LifeCycleManagement complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="LifeCycleManagement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cancel" type="{http://datex2.eu/schema/2_0RC1/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="end" type="{http://datex2.eu/schema/2_0RC1/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="lifeCycleManagementExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LifeCycleManagement", propOrder = {
    "cancel",
    "end",
    "lifeCycleManagementExtension"
})
public class LifeCycleManagement {

    protected Boolean cancel;
    protected Boolean end;
    protected ExtensionType lifeCycleManagementExtension;

    /**
     * Recupera il valore della proprietà cancel.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCancel() {
        return cancel;
    }

    /**
     * Imposta il valore della proprietà cancel.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCancel(Boolean value) {
        this.cancel = value;
    }

    /**
     * Recupera il valore della proprietà end.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnd() {
        return end;
    }

    /**
     * Imposta il valore della proprietà end.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnd(Boolean value) {
        this.end = value;
    }

    /**
     * Recupera il valore della proprietà lifeCycleManagementExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getLifeCycleManagementExtension() {
        return lifeCycleManagementExtension;
    }

    /**
     * Imposta il valore della proprietà lifeCycleManagementExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setLifeCycleManagementExtension(ExtensionType value) {
        this.lifeCycleManagementExtension = value;
    }

    public LifeCycleManagement withCancel(Boolean value) {
        setCancel(value);
        return this;
    }

    public LifeCycleManagement withEnd(Boolean value) {
        setEnd(value);
        return this;
    }

    public LifeCycleManagement withLifeCycleManagementExtension(ExtensionType value) {
        setLifeCycleManagementExtension(value);
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

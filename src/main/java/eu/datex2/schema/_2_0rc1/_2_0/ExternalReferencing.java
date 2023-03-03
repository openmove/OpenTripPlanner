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
 * <p>Classe Java per ExternalReferencing complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ExternalReferencing"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="externalLocationCode" type="{http://datex2.eu/schema/2_0RC1/2_0}String"/&gt;
 *         &lt;element name="externalReferencingSystem" type="{http://datex2.eu/schema/2_0RC1/2_0}String"/&gt;
 *         &lt;element name="externalReferencingExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalReferencing", propOrder = {
    "externalLocationCode",
    "externalReferencingSystem",
    "externalReferencingExtension"
})
public class ExternalReferencing {

    @XmlElement(required = true)
    protected String externalLocationCode;
    @XmlElement(required = true)
    protected String externalReferencingSystem;
    protected ExtensionType externalReferencingExtension;

    /**
     * Recupera il valore della proprietà externalLocationCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalLocationCode() {
        return externalLocationCode;
    }

    /**
     * Imposta il valore della proprietà externalLocationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalLocationCode(String value) {
        this.externalLocationCode = value;
    }

    /**
     * Recupera il valore della proprietà externalReferencingSystem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalReferencingSystem() {
        return externalReferencingSystem;
    }

    /**
     * Imposta il valore della proprietà externalReferencingSystem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalReferencingSystem(String value) {
        this.externalReferencingSystem = value;
    }

    /**
     * Recupera il valore della proprietà externalReferencingExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getExternalReferencingExtension() {
        return externalReferencingExtension;
    }

    /**
     * Imposta il valore della proprietà externalReferencingExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setExternalReferencingExtension(ExtensionType value) {
        this.externalReferencingExtension = value;
    }

    public ExternalReferencing withExternalLocationCode(String value) {
        setExternalLocationCode(value);
        return this;
    }

    public ExternalReferencing withExternalReferencingSystem(String value) {
        setExternalReferencingSystem(value);
        return this;
    }

    public ExternalReferencing withExternalReferencingExtension(ExtensionType value) {
        setExternalReferencingExtension(value);
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

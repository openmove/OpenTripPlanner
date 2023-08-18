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
 * <p>Classe Java per ManagedCause complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ManagedCause"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}Cause"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="managedCause" type="{http://datex2.eu/schema/2_0RC1/2_0}Reference" minOccurs="0"/&gt;
 *         &lt;element name="managedCauseExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManagedCause", propOrder = {
    "managedCause",
    "managedCauseExtension"
})
public class ManagedCause
    extends Cause
{

    protected String managedCause;
    protected ExtensionType managedCauseExtension;

    /**
     * Recupera il valore della proprietà managedCause.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagedCause() {
        return managedCause;
    }

    /**
     * Imposta il valore della proprietà managedCause.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagedCause(String value) {
        this.managedCause = value;
    }

    /**
     * Recupera il valore della proprietà managedCauseExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getManagedCauseExtension() {
        return managedCauseExtension;
    }

    /**
     * Imposta il valore della proprietà managedCauseExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setManagedCauseExtension(ExtensionType value) {
        this.managedCauseExtension = value;
    }

    public ManagedCause withManagedCause(String value) {
        setManagedCause(value);
        return this;
    }

    public ManagedCause withManagedCauseExtension(ExtensionType value) {
        setManagedCauseExtension(value);
        return this;
    }

    @Override
    public ManagedCause withCauseExtension(ExtensionType value) {
        setCauseExtension(value);
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

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
 * <p>Classe Java per GroupOfLocationsByReference complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="GroupOfLocationsByReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}GroupOfLocations"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="predefinedLocationSetReference" type="{http://datex2.eu/schema/2_0RC1/2_0}Reference"/&gt;
 *         &lt;element name="groupOfLocationsByReferenceExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupOfLocationsByReference", propOrder = {
    "predefinedLocationSetReference",
    "groupOfLocationsByReferenceExtension"
})
public class GroupOfLocationsByReference
    extends GroupOfLocations
{

    @XmlElement(required = true)
    protected String predefinedLocationSetReference;
    protected ExtensionType groupOfLocationsByReferenceExtension;

    /**
     * Recupera il valore della proprietà predefinedLocationSetReference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPredefinedLocationSetReference() {
        return predefinedLocationSetReference;
    }

    /**
     * Imposta il valore della proprietà predefinedLocationSetReference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPredefinedLocationSetReference(String value) {
        this.predefinedLocationSetReference = value;
    }

    /**
     * Recupera il valore della proprietà groupOfLocationsByReferenceExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getGroupOfLocationsByReferenceExtension() {
        return groupOfLocationsByReferenceExtension;
    }

    /**
     * Imposta il valore della proprietà groupOfLocationsByReferenceExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setGroupOfLocationsByReferenceExtension(ExtensionType value) {
        this.groupOfLocationsByReferenceExtension = value;
    }

    public GroupOfLocationsByReference withPredefinedLocationSetReference(String value) {
        setPredefinedLocationSetReference(value);
        return this;
    }

    public GroupOfLocationsByReference withGroupOfLocationsByReferenceExtension(ExtensionType value) {
        setGroupOfLocationsByReferenceExtension(value);
        return this;
    }

    @Override
    public GroupOfLocationsByReference withGroupOfLocationsExtension(ExtensionType value) {
        setGroupOfLocationsExtension(value);
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

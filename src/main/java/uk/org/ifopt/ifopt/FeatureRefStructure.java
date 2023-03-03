//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package uk.org.ifopt.ifopt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per FeatureRefStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="FeatureRefStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FeatureIdRef" type="{http://www.ifopt.org.uk/ifopt}FeatureIdRefStructure"/&gt;
 *         &lt;element name="FeatureType" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeatureRefStructure", propOrder = {
    "featureIdRef",
    "featureType"
})
public class FeatureRefStructure {

    @XmlElement(name = "FeatureIdRef", required = true)
    protected FeatureIdRefStructure featureIdRef;
    @XmlElement(name = "FeatureType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String featureType;

    /**
     * Recupera il valore della proprietà featureIdRef.
     * 
     * @return
     *     possible object is
     *     {@link FeatureIdRefStructure }
     *     
     */
    public FeatureIdRefStructure getFeatureIdRef() {
        return featureIdRef;
    }

    /**
     * Imposta il valore della proprietà featureIdRef.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureIdRefStructure }
     *     
     */
    public void setFeatureIdRef(FeatureIdRefStructure value) {
        this.featureIdRef = value;
    }

    /**
     * Recupera il valore della proprietà featureType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeatureType() {
        return featureType;
    }

    /**
     * Imposta il valore della proprietà featureType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeatureType(String value) {
        this.featureType = value;
    }

    public FeatureRefStructure withFeatureIdRef(FeatureIdRefStructure value) {
        setFeatureIdRef(value);
        return this;
    }

    public FeatureRefStructure withFeatureType(String value) {
        setFeatureType(value);
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

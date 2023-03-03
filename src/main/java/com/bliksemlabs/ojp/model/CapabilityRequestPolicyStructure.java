//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package com.bliksemlabs.ojp.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
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
 * <p>Classe Java per CapabilityRequestPolicyStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CapabilityRequestPolicyStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NationalLanguage" type="{http://www.w3.org/2001/XMLSchema}language" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Translations" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="GmlCoordinateFormat" type="{http://www.siri.org.uk/siri}SrsNameType"/&gt;
 *           &lt;element name="WgsDecimalDegrees" type="{http://www.siri.org.uk/siri}EmptyType"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilityRequestPolicyStructure", propOrder = {
    "nationalLanguage",
    "translations",
    "gmlCoordinateFormat",
    "wgsDecimalDegrees"
})
public class CapabilityRequestPolicyStructure {

    @XmlElement(name = "NationalLanguage", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected List<String> nationalLanguage;
    @XmlElement(name = "Translations")
    protected Boolean translations;
    @XmlElement(name = "GmlCoordinateFormat")
    protected String gmlCoordinateFormat;
    @XmlElement(name = "WgsDecimalDegrees")
    protected String wgsDecimalDegrees;

    /**
     * Gets the value of the nationalLanguage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nationalLanguage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNationalLanguage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNationalLanguage() {
        if (nationalLanguage == null) {
            nationalLanguage = new ArrayList<String>();
        }
        return this.nationalLanguage;
    }

    /**
     * Recupera il valore della proprietà translations.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTranslations() {
        return translations;
    }

    /**
     * Imposta il valore della proprietà translations.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTranslations(Boolean value) {
        this.translations = value;
    }

    /**
     * Recupera il valore della proprietà gmlCoordinateFormat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGmlCoordinateFormat() {
        return gmlCoordinateFormat;
    }

    /**
     * Imposta il valore della proprietà gmlCoordinateFormat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGmlCoordinateFormat(String value) {
        this.gmlCoordinateFormat = value;
    }

    /**
     * Recupera il valore della proprietà wgsDecimalDegrees.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWgsDecimalDegrees() {
        return wgsDecimalDegrees;
    }

    /**
     * Imposta il valore della proprietà wgsDecimalDegrees.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWgsDecimalDegrees(String value) {
        this.wgsDecimalDegrees = value;
    }

    public CapabilityRequestPolicyStructure withNationalLanguage(String... values) {
        if (values!= null) {
            for (String value: values) {
                getNationalLanguage().add(value);
            }
        }
        return this;
    }

    public CapabilityRequestPolicyStructure withNationalLanguage(Collection<String> values) {
        if (values!= null) {
            getNationalLanguage().addAll(values);
        }
        return this;
    }

    public CapabilityRequestPolicyStructure withTranslations(Boolean value) {
        setTranslations(value);
        return this;
    }

    public CapabilityRequestPolicyStructure withGmlCoordinateFormat(String value) {
        setGmlCoordinateFormat(value);
        return this;
    }

    public CapabilityRequestPolicyStructure withWgsDecimalDegrees(String value) {
        setWgsDecimalDegrees(value);
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

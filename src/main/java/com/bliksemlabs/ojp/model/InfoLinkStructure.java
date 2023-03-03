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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per InfoLinkStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="InfoLinkStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Uri" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *         &lt;element name="Label" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Image" type="{http://www.siri.org.uk/siri}ImageStructure" minOccurs="0"/&gt;
 *         &lt;element name="LinkContent" type="{http://www.siri.org.uk/siri}LinkContentEnumeration" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfoLinkStructure", propOrder = {
    "uri",
    "label",
    "image",
    "linkContent"
})
public class InfoLinkStructure {

    @XmlElement(name = "Uri", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String uri;
    @XmlElement(name = "Label")
    protected List<NaturalLanguageStringStructure> label;
    @XmlElement(name = "Image")
    protected ImageStructure image;
    @XmlElement(name = "LinkContent")
    @XmlSchemaType(name = "NMTOKEN")
    protected LinkContentEnumeration linkContent;

    /**
     * Recupera il valore della proprietà uri.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUri() {
        return uri;
    }

    /**
     * Imposta il valore della proprietà uri.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUri(String value) {
        this.uri = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the label property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLabel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getLabel() {
        if (label == null) {
            label = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.label;
    }

    /**
     * Recupera il valore della proprietà image.
     * 
     * @return
     *     possible object is
     *     {@link ImageStructure }
     *     
     */
    public ImageStructure getImage() {
        return image;
    }

    /**
     * Imposta il valore della proprietà image.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageStructure }
     *     
     */
    public void setImage(ImageStructure value) {
        this.image = value;
    }

    /**
     * Recupera il valore della proprietà linkContent.
     * 
     * @return
     *     possible object is
     *     {@link LinkContentEnumeration }
     *     
     */
    public LinkContentEnumeration getLinkContent() {
        return linkContent;
    }

    /**
     * Imposta il valore della proprietà linkContent.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkContentEnumeration }
     *     
     */
    public void setLinkContent(LinkContentEnumeration value) {
        this.linkContent = value;
    }

    public InfoLinkStructure withUri(String value) {
        setUri(value);
        return this;
    }

    public InfoLinkStructure withLabel(NaturalLanguageStringStructure... values) {
        if (values!= null) {
            for (NaturalLanguageStringStructure value: values) {
                getLabel().add(value);
            }
        }
        return this;
    }

    public InfoLinkStructure withLabel(Collection<NaturalLanguageStringStructure> values) {
        if (values!= null) {
            getLabel().addAll(values);
        }
        return this;
    }

    public InfoLinkStructure withImage(ImageStructure value) {
        setImage(value);
        return this;
    }

    public InfoLinkStructure withLinkContent(LinkContentEnumeration value) {
        setLinkContent(value);
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

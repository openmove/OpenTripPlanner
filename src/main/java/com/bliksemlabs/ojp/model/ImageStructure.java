//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package com.bliksemlabs.ojp.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per ImageStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ImageStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="ImageRef" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *           &lt;element name="ImageBinary" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="ImageContent" type="{http://www.siri.org.uk/siri}ImageContentEnumeration" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageStructure", propOrder = {
    "imageRef",
    "imageBinary",
    "imageContent"
})
@XmlSeeAlso({
    com.bliksemlabs.ojp.model.RoadSituationElementStructure.Images.Image.class
})
public class ImageStructure {

    @XmlElement(name = "ImageRef")
    @XmlSchemaType(name = "anyURI")
    protected String imageRef;
    @XmlElement(name = "ImageBinary")
    protected byte[] imageBinary;
    @XmlElement(name = "ImageContent")
    @XmlSchemaType(name = "NMTOKEN")
    protected ImageContentEnumeration imageContent;

    /**
     * Recupera il valore della proprietà imageRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageRef() {
        return imageRef;
    }

    /**
     * Imposta il valore della proprietà imageRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageRef(String value) {
        this.imageRef = value;
    }

    /**
     * Recupera il valore della proprietà imageBinary.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getImageBinary() {
        return imageBinary;
    }

    /**
     * Imposta il valore della proprietà imageBinary.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setImageBinary(byte[] value) {
        this.imageBinary = value;
    }

    /**
     * Recupera il valore della proprietà imageContent.
     * 
     * @return
     *     possible object is
     *     {@link ImageContentEnumeration }
     *     
     */
    public ImageContentEnumeration getImageContent() {
        return imageContent;
    }

    /**
     * Imposta il valore della proprietà imageContent.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageContentEnumeration }
     *     
     */
    public void setImageContent(ImageContentEnumeration value) {
        this.imageContent = value;
    }

    public ImageStructure withImageRef(String value) {
        setImageRef(value);
        return this;
    }

    public ImageStructure withImageBinary(byte[] value) {
        setImageBinary(value);
        return this;
    }

    public ImageStructure withImageContent(ImageContentEnumeration value) {
        setImageContent(value);
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

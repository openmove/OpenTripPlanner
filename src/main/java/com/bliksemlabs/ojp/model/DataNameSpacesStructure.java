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
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per DataNameSpacesStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DataNameSpacesStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StopPointNameSpace" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="LineNameSpace" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="ProductCategoryNameSpace" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="ServiceFeatureNameSpace" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="VehicleFeatureNameSpace" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataNameSpacesStructure", propOrder = {
    "stopPointNameSpace",
    "lineNameSpace",
    "productCategoryNameSpace",
    "serviceFeatureNameSpace",
    "vehicleFeatureNameSpace"
})
public class DataNameSpacesStructure {

    @XmlElement(name = "StopPointNameSpace")
    @XmlSchemaType(name = "anyURI")
    protected String stopPointNameSpace;
    @XmlElement(name = "LineNameSpace")
    @XmlSchemaType(name = "anyURI")
    protected String lineNameSpace;
    @XmlElement(name = "ProductCategoryNameSpace")
    @XmlSchemaType(name = "anyURI")
    protected String productCategoryNameSpace;
    @XmlElement(name = "ServiceFeatureNameSpace")
    @XmlSchemaType(name = "anyURI")
    protected String serviceFeatureNameSpace;
    @XmlElement(name = "VehicleFeatureNameSpace")
    @XmlSchemaType(name = "anyURI")
    protected String vehicleFeatureNameSpace;

    /**
     * Recupera il valore della proprietà stopPointNameSpace.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopPointNameSpace() {
        return stopPointNameSpace;
    }

    /**
     * Imposta il valore della proprietà stopPointNameSpace.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopPointNameSpace(String value) {
        this.stopPointNameSpace = value;
    }

    /**
     * Recupera il valore della proprietà lineNameSpace.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineNameSpace() {
        return lineNameSpace;
    }

    /**
     * Imposta il valore della proprietà lineNameSpace.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineNameSpace(String value) {
        this.lineNameSpace = value;
    }

    /**
     * Recupera il valore della proprietà productCategoryNameSpace.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCategoryNameSpace() {
        return productCategoryNameSpace;
    }

    /**
     * Imposta il valore della proprietà productCategoryNameSpace.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCategoryNameSpace(String value) {
        this.productCategoryNameSpace = value;
    }

    /**
     * Recupera il valore della proprietà serviceFeatureNameSpace.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceFeatureNameSpace() {
        return serviceFeatureNameSpace;
    }

    /**
     * Imposta il valore della proprietà serviceFeatureNameSpace.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceFeatureNameSpace(String value) {
        this.serviceFeatureNameSpace = value;
    }

    /**
     * Recupera il valore della proprietà vehicleFeatureNameSpace.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleFeatureNameSpace() {
        return vehicleFeatureNameSpace;
    }

    /**
     * Imposta il valore della proprietà vehicleFeatureNameSpace.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleFeatureNameSpace(String value) {
        this.vehicleFeatureNameSpace = value;
    }

    public DataNameSpacesStructure withStopPointNameSpace(String value) {
        setStopPointNameSpace(value);
        return this;
    }

    public DataNameSpacesStructure withLineNameSpace(String value) {
        setLineNameSpace(value);
        return this;
    }

    public DataNameSpacesStructure withProductCategoryNameSpace(String value) {
        setProductCategoryNameSpace(value);
        return this;
    }

    public DataNameSpacesStructure withServiceFeatureNameSpace(String value) {
        setServiceFeatureNameSpace(value);
        return this;
    }

    public DataNameSpacesStructure withVehicleFeatureNameSpace(String value) {
        setVehicleFeatureNameSpace(value);
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

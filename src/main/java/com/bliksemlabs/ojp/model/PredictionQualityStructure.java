//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package com.bliksemlabs.ojp.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.LocalDateTimeISO8601XmlAdapter;


/**
 * <p>Classe Java per PredictionQualityStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PredictionQualityStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PredictionLevel" type="{http://www.siri.org.uk/siri}QualityIndexEnumeration"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Percentile" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *           &lt;element name="LowerTimeLimit" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *           &lt;element name="HigherTimeLimit" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PredictionQualityStructure", propOrder = {
    "predictionLevel",
    "percentile",
    "lowerTimeLimit",
    "higherTimeLimit"
})
public class PredictionQualityStructure {

    @XmlElement(name = "PredictionLevel", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected QualityIndexEnumeration predictionLevel;
    @XmlElement(name = "Percentile", defaultValue = "0.9")
    protected BigDecimal percentile;
    @XmlElement(name = "LowerTimeLimit", type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime lowerTimeLimit;
    @XmlElement(name = "HigherTimeLimit", type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime higherTimeLimit;

    /**
     * Recupera il valore della proprietà predictionLevel.
     * 
     * @return
     *     possible object is
     *     {@link QualityIndexEnumeration }
     *     
     */
    public QualityIndexEnumeration getPredictionLevel() {
        return predictionLevel;
    }

    /**
     * Imposta il valore della proprietà predictionLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link QualityIndexEnumeration }
     *     
     */
    public void setPredictionLevel(QualityIndexEnumeration value) {
        this.predictionLevel = value;
    }

    /**
     * Recupera il valore della proprietà percentile.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentile() {
        return percentile;
    }

    /**
     * Imposta il valore della proprietà percentile.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentile(BigDecimal value) {
        this.percentile = value;
    }

    /**
     * Recupera il valore della proprietà lowerTimeLimit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getLowerTimeLimit() {
        return lowerTimeLimit;
    }

    /**
     * Imposta il valore della proprietà lowerTimeLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLowerTimeLimit(LocalDateTime value) {
        this.lowerTimeLimit = value;
    }

    /**
     * Recupera il valore della proprietà higherTimeLimit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getHigherTimeLimit() {
        return higherTimeLimit;
    }

    /**
     * Imposta il valore della proprietà higherTimeLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHigherTimeLimit(LocalDateTime value) {
        this.higherTimeLimit = value;
    }

    public PredictionQualityStructure withPredictionLevel(QualityIndexEnumeration value) {
        setPredictionLevel(value);
        return this;
    }

    public PredictionQualityStructure withPercentile(BigDecimal value) {
        setPercentile(value);
        return this;
    }

    public PredictionQualityStructure withLowerTimeLimit(LocalDateTime value) {
        setLowerTimeLimit(value);
        return this;
    }

    public PredictionQualityStructure withHigherTimeLimit(LocalDateTime value) {
        setHigherTimeLimit(value);
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

//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
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
 * <p>Classe Java per OverallPeriod complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="OverallPeriod"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="overallStartTime" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime"/&gt;
 *         &lt;element name="overallEndTime" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="validPeriod" type="{http://datex2.eu/schema/2_0RC1/2_0}Period" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="exceptionPeriod" type="{http://datex2.eu/schema/2_0RC1/2_0}Period" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="overallPeriodExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OverallPeriod", propOrder = {
    "overallStartTime",
    "overallEndTime",
    "validPeriod",
    "exceptionPeriod",
    "overallPeriodExtension"
})
public class OverallPeriod {

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime overallStartTime;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime overallEndTime;
    protected List<Period> validPeriod;
    protected List<Period> exceptionPeriod;
    protected ExtensionType overallPeriodExtension;

    /**
     * Recupera il valore della proprietà overallStartTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getOverallStartTime() {
        return overallStartTime;
    }

    /**
     * Imposta il valore della proprietà overallStartTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverallStartTime(LocalDateTime value) {
        this.overallStartTime = value;
    }

    /**
     * Recupera il valore della proprietà overallEndTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getOverallEndTime() {
        return overallEndTime;
    }

    /**
     * Imposta il valore della proprietà overallEndTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverallEndTime(LocalDateTime value) {
        this.overallEndTime = value;
    }

    /**
     * Gets the value of the validPeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validPeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidPeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Period }
     * 
     * 
     */
    public List<Period> getValidPeriod() {
        if (validPeriod == null) {
            validPeriod = new ArrayList<Period>();
        }
        return this.validPeriod;
    }

    /**
     * Gets the value of the exceptionPeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exceptionPeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExceptionPeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Period }
     * 
     * 
     */
    public List<Period> getExceptionPeriod() {
        if (exceptionPeriod == null) {
            exceptionPeriod = new ArrayList<Period>();
        }
        return this.exceptionPeriod;
    }

    /**
     * Recupera il valore della proprietà overallPeriodExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getOverallPeriodExtension() {
        return overallPeriodExtension;
    }

    /**
     * Imposta il valore della proprietà overallPeriodExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setOverallPeriodExtension(ExtensionType value) {
        this.overallPeriodExtension = value;
    }

    public OverallPeriod withOverallStartTime(LocalDateTime value) {
        setOverallStartTime(value);
        return this;
    }

    public OverallPeriod withOverallEndTime(LocalDateTime value) {
        setOverallEndTime(value);
        return this;
    }

    public OverallPeriod withValidPeriod(Period... values) {
        if (values!= null) {
            for (Period value: values) {
                getValidPeriod().add(value);
            }
        }
        return this;
    }

    public OverallPeriod withValidPeriod(Collection<Period> values) {
        if (values!= null) {
            getValidPeriod().addAll(values);
        }
        return this;
    }

    public OverallPeriod withExceptionPeriod(Period... values) {
        if (values!= null) {
            for (Period value: values) {
                getExceptionPeriod().add(value);
            }
        }
        return this;
    }

    public OverallPeriod withExceptionPeriod(Collection<Period> values) {
        if (values!= null) {
            getExceptionPeriod().addAll(values);
        }
        return this;
    }

    public OverallPeriod withOverallPeriodExtension(ExtensionType value) {
        setOverallPeriodExtension(value);
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

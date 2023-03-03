//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package uk.org.ifopt.ifopt;

import java.time.LocalDateTime;
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
import org.rutebanken.util.LocalDateTimeISO8601XmlAdapter;


/**
 * <p>Classe Java per ValidityConditionStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ValidityConditionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FromDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ToDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DayType" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" minOccurs="0"/&gt;
 *         &lt;element name="Timebands" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Timeband" type="{http://www.ifopt.org.uk/ifopt}TimebandStructure"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidityConditionStructure", propOrder = {
    "fromDateTime",
    "toDateTime",
    "dayType",
    "timebands"
})
public class ValidityConditionStructure {

    @XmlElement(name = "FromDateTime", type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime fromDateTime;
    @XmlElement(name = "ToDateTime", type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime toDateTime;
    @XmlElement(name = "DayType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String dayType;
    @XmlElement(name = "Timebands")
    protected List<ValidityConditionStructure.Timebands> timebands;

    /**
     * Recupera il valore della proprietà fromDateTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getFromDateTime() {
        return fromDateTime;
    }

    /**
     * Imposta il valore della proprietà fromDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromDateTime(LocalDateTime value) {
        this.fromDateTime = value;
    }

    /**
     * Recupera il valore della proprietà toDateTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getToDateTime() {
        return toDateTime;
    }

    /**
     * Imposta il valore della proprietà toDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToDateTime(LocalDateTime value) {
        this.toDateTime = value;
    }

    /**
     * Recupera il valore della proprietà dayType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDayType() {
        return dayType;
    }

    /**
     * Imposta il valore della proprietà dayType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDayType(String value) {
        this.dayType = value;
    }

    /**
     * Gets the value of the timebands property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timebands property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimebands().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValidityConditionStructure.Timebands }
     * 
     * 
     */
    public List<ValidityConditionStructure.Timebands> getTimebands() {
        if (timebands == null) {
            timebands = new ArrayList<ValidityConditionStructure.Timebands>();
        }
        return this.timebands;
    }

    public ValidityConditionStructure withFromDateTime(LocalDateTime value) {
        setFromDateTime(value);
        return this;
    }

    public ValidityConditionStructure withToDateTime(LocalDateTime value) {
        setToDateTime(value);
        return this;
    }

    public ValidityConditionStructure withDayType(String value) {
        setDayType(value);
        return this;
    }

    public ValidityConditionStructure withTimebands(ValidityConditionStructure.Timebands... values) {
        if (values!= null) {
            for (ValidityConditionStructure.Timebands value: values) {
                getTimebands().add(value);
            }
        }
        return this;
    }

    public ValidityConditionStructure withTimebands(Collection<ValidityConditionStructure.Timebands> values) {
        if (values!= null) {
            getTimebands().addAll(values);
        }
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


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Timeband" type="{http://www.ifopt.org.uk/ifopt}TimebandStructure"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "timeband"
    })
    public static class Timebands {

        @XmlElement(name = "Timeband", required = true)
        protected TimebandStructure timeband;

        /**
         * Recupera il valore della proprietà timeband.
         * 
         * @return
         *     possible object is
         *     {@link TimebandStructure }
         *     
         */
        public TimebandStructure getTimeband() {
            return timeband;
        }

        /**
         * Imposta il valore della proprietà timeband.
         * 
         * @param value
         *     allowed object is
         *     {@link TimebandStructure }
         *     
         */
        public void setTimeband(TimebandStructure value) {
            this.timeband = value;
        }

        public ValidityConditionStructure.Timebands withTimeband(TimebandStructure value) {
            setTimeband(value);
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

}

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
 * <p>Classe Java per Period complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Period"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="startOfPeriod" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="endOfPeriod" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="periodName" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="recurringTimePeriodOfDay" type="{http://datex2.eu/schema/2_0RC1/2_0}TimePeriodOfDay" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="recurringDayWeekMonthPeriod" type="{http://datex2.eu/schema/2_0RC1/2_0}DayWeekMonth" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="periodExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Period", propOrder = {
    "startOfPeriod",
    "endOfPeriod",
    "periodName",
    "recurringTimePeriodOfDay",
    "recurringDayWeekMonthPeriod",
    "periodExtension"
})
public class Period {

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime startOfPeriod;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime endOfPeriod;
    protected MultilingualString periodName;
    protected List<TimePeriodOfDay> recurringTimePeriodOfDay;
    protected List<DayWeekMonth> recurringDayWeekMonthPeriod;
    protected ExtensionType periodExtension;

    /**
     * Recupera il valore della proprietà startOfPeriod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getStartOfPeriod() {
        return startOfPeriod;
    }

    /**
     * Imposta il valore della proprietà startOfPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartOfPeriod(LocalDateTime value) {
        this.startOfPeriod = value;
    }

    /**
     * Recupera il valore della proprietà endOfPeriod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getEndOfPeriod() {
        return endOfPeriod;
    }

    /**
     * Imposta il valore della proprietà endOfPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndOfPeriod(LocalDateTime value) {
        this.endOfPeriod = value;
    }

    /**
     * Recupera il valore della proprietà periodName.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getPeriodName() {
        return periodName;
    }

    /**
     * Imposta il valore della proprietà periodName.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setPeriodName(MultilingualString value) {
        this.periodName = value;
    }

    /**
     * Gets the value of the recurringTimePeriodOfDay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recurringTimePeriodOfDay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecurringTimePeriodOfDay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimePeriodOfDay }
     * 
     * 
     */
    public List<TimePeriodOfDay> getRecurringTimePeriodOfDay() {
        if (recurringTimePeriodOfDay == null) {
            recurringTimePeriodOfDay = new ArrayList<TimePeriodOfDay>();
        }
        return this.recurringTimePeriodOfDay;
    }

    /**
     * Gets the value of the recurringDayWeekMonthPeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recurringDayWeekMonthPeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecurringDayWeekMonthPeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DayWeekMonth }
     * 
     * 
     */
    public List<DayWeekMonth> getRecurringDayWeekMonthPeriod() {
        if (recurringDayWeekMonthPeriod == null) {
            recurringDayWeekMonthPeriod = new ArrayList<DayWeekMonth>();
        }
        return this.recurringDayWeekMonthPeriod;
    }

    /**
     * Recupera il valore della proprietà periodExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPeriodExtension() {
        return periodExtension;
    }

    /**
     * Imposta il valore della proprietà periodExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPeriodExtension(ExtensionType value) {
        this.periodExtension = value;
    }

    public Period withStartOfPeriod(LocalDateTime value) {
        setStartOfPeriod(value);
        return this;
    }

    public Period withEndOfPeriod(LocalDateTime value) {
        setEndOfPeriod(value);
        return this;
    }

    public Period withPeriodName(MultilingualString value) {
        setPeriodName(value);
        return this;
    }

    public Period withRecurringTimePeriodOfDay(TimePeriodOfDay... values) {
        if (values!= null) {
            for (TimePeriodOfDay value: values) {
                getRecurringTimePeriodOfDay().add(value);
            }
        }
        return this;
    }

    public Period withRecurringTimePeriodOfDay(Collection<TimePeriodOfDay> values) {
        if (values!= null) {
            getRecurringTimePeriodOfDay().addAll(values);
        }
        return this;
    }

    public Period withRecurringDayWeekMonthPeriod(DayWeekMonth... values) {
        if (values!= null) {
            for (DayWeekMonth value: values) {
                getRecurringDayWeekMonthPeriod().add(value);
            }
        }
        return this;
    }

    public Period withRecurringDayWeekMonthPeriod(Collection<DayWeekMonth> values) {
        if (values!= null) {
            getRecurringDayWeekMonthPeriod().addAll(values);
        }
        return this;
    }

    public Period withPeriodExtension(ExtensionType value) {
        setPeriodExtension(value);
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

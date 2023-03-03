//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package de.vdv.ojp;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.migesok.jaxb.adapter.javatime.DurationXmlAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.LocalTimeISO8601XmlAdapter;


/**
 * [a specialisation of TIME BAND in TMv6] aggregation of TIME BAND and DAY OF WEEK (Time period on a weekday).
 * 
 * <p>Classe Java per WeekdayTimePeriodStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="WeekdayTimePeriodStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Weekday" type="{http://www.vdv.de/ojp}WeekdayTypeEnumeration" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}time"/&gt;
 *         &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}duration"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeekdayTimePeriodStructure", propOrder = {
    "weekday",
    "startTime",
    "duration"
})
public class WeekdayTimePeriodStructure {

    @XmlElement(name = "Weekday")
    @XmlSchemaType(name = "string")
    protected List<WeekdayTypeEnumeration> weekday;
    @XmlElement(name = "StartTime", required = true, type = String.class)
    @XmlJavaTypeAdapter(LocalTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "time")
    protected LocalTime startTime;
    @XmlElement(name = "Duration", required = true, type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration duration;

    /**
     * Gets the value of the weekday property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the weekday property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWeekday().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WeekdayTypeEnumeration }
     * 
     * 
     */
    public List<WeekdayTypeEnumeration> getWeekday() {
        if (weekday == null) {
            weekday = new ArrayList<WeekdayTypeEnumeration>();
        }
        return this.weekday;
    }

    /**
     * Recupera il valore della proprietà startTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalTime getStartTime() {
        return startTime;
    }

    /**
     * Imposta il valore della proprietà startTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTime(LocalTime value) {
        this.startTime = value;
    }

    /**
     * Recupera il valore della proprietà duration.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * Imposta il valore della proprietà duration.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuration(Duration value) {
        this.duration = value;
    }

    public WeekdayTimePeriodStructure withWeekday(WeekdayTypeEnumeration... values) {
        if (values!= null) {
            for (WeekdayTypeEnumeration value: values) {
                getWeekday().add(value);
            }
        }
        return this;
    }

    public WeekdayTimePeriodStructure withWeekday(Collection<WeekdayTypeEnumeration> values) {
        if (values!= null) {
            getWeekday().addAll(values);
        }
        return this;
    }

    public WeekdayTimePeriodStructure withStartTime(LocalTime value) {
        setStartTime(value);
        return this;
    }

    public WeekdayTimePeriodStructure withDuration(Duration value) {
        setDuration(value);
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

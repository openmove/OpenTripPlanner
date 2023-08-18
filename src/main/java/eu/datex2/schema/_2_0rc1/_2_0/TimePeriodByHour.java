//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import java.time.LocalTime;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.LocalTimeISO8601XmlAdapter;


/**
 * <p>Classe Java per TimePeriodByHour complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TimePeriodByHour"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}TimePeriodOfDay"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="startTimeOfPeriod" type="{http://datex2.eu/schema/2_0RC1/2_0}Time"/&gt;
 *         &lt;element name="endTimeOfPeriod" type="{http://datex2.eu/schema/2_0RC1/2_0}Time"/&gt;
 *         &lt;element name="timePeriodByHourExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimePeriodByHour", propOrder = {
    "startTimeOfPeriod",
    "endTimeOfPeriod",
    "timePeriodByHourExtension"
})
public class TimePeriodByHour
    extends TimePeriodOfDay
{

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(LocalTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "time")
    protected LocalTime startTimeOfPeriod;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(LocalTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "time")
    protected LocalTime endTimeOfPeriod;
    protected ExtensionType timePeriodByHourExtension;

    /**
     * Recupera il valore della proprietà startTimeOfPeriod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalTime getStartTimeOfPeriod() {
        return startTimeOfPeriod;
    }

    /**
     * Imposta il valore della proprietà startTimeOfPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTimeOfPeriod(LocalTime value) {
        this.startTimeOfPeriod = value;
    }

    /**
     * Recupera il valore della proprietà endTimeOfPeriod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalTime getEndTimeOfPeriod() {
        return endTimeOfPeriod;
    }

    /**
     * Imposta il valore della proprietà endTimeOfPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTimeOfPeriod(LocalTime value) {
        this.endTimeOfPeriod = value;
    }

    /**
     * Recupera il valore della proprietà timePeriodByHourExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTimePeriodByHourExtension() {
        return timePeriodByHourExtension;
    }

    /**
     * Imposta il valore della proprietà timePeriodByHourExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTimePeriodByHourExtension(ExtensionType value) {
        this.timePeriodByHourExtension = value;
    }

    public TimePeriodByHour withStartTimeOfPeriod(LocalTime value) {
        setStartTimeOfPeriod(value);
        return this;
    }

    public TimePeriodByHour withEndTimeOfPeriod(LocalTime value) {
        setEndTimeOfPeriod(value);
        return this;
    }

    public TimePeriodByHour withTimePeriodByHourExtension(ExtensionType value) {
        setTimePeriodByHourExtension(value);
        return this;
    }

    @Override
    public TimePeriodByHour withTimePeriodOfDayExtension(ExtensionType value) {
        setTimePeriodOfDayExtension(value);
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

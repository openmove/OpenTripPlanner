//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package de.vdv.ojp;

import java.time.Duration;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.migesok.jaxb.adapter.javatime.DurationXmlAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * [a more generalised form of BOOKING ARRANGEMENTS in TMv6] arrangement for booking any leg or legs of a journey 
 * 
 * <p>Classe Java per BookingArrangementStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BookingArrangementStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BookingAgencyName" type="{http://www.vdv.de/ojp}InternationalTextStructure" minOccurs="0"/&gt;
 *         &lt;element name="BookingUrl" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="InfoUrl" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="PhoneNumber" type="{http://www.vdv.de/ojp}PhoneNumberType" minOccurs="0"/&gt;
 *         &lt;element name="MinimumBookingPeriod." type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookingArrangementStructure", propOrder = {
    "bookingAgencyName",
    "bookingUrl",
    "infoUrl",
    "phoneNumber",
    "minimumBookingPeriod",
    "extension"
})
public class BookingArrangementStructure {

    @XmlElement(name = "BookingAgencyName")
    protected InternationalTextStructure bookingAgencyName;
    @XmlElement(name = "BookingUrl")
    @XmlSchemaType(name = "anyURI")
    protected String bookingUrl;
    @XmlElement(name = "InfoUrl")
    @XmlSchemaType(name = "anyURI")
    protected String infoUrl;
    @XmlElement(name = "PhoneNumber")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String phoneNumber;
    @XmlElement(name = "MinimumBookingPeriod.", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration minimumBookingPeriod;
    @XmlElement(name = "Extension")
    protected Object extension;

    /**
     * Recupera il valore della proprietà bookingAgencyName.
     * 
     * @return
     *     possible object is
     *     {@link InternationalTextStructure }
     *     
     */
    public InternationalTextStructure getBookingAgencyName() {
        return bookingAgencyName;
    }

    /**
     * Imposta il valore della proprietà bookingAgencyName.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTextStructure }
     *     
     */
    public void setBookingAgencyName(InternationalTextStructure value) {
        this.bookingAgencyName = value;
    }

    /**
     * Recupera il valore della proprietà bookingUrl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingUrl() {
        return bookingUrl;
    }

    /**
     * Imposta il valore della proprietà bookingUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingUrl(String value) {
        this.bookingUrl = value;
    }

    /**
     * Recupera il valore della proprietà infoUrl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoUrl() {
        return infoUrl;
    }

    /**
     * Imposta il valore della proprietà infoUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoUrl(String value) {
        this.infoUrl = value;
    }

    /**
     * Recupera il valore della proprietà phoneNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Imposta il valore della proprietà phoneNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Recupera il valore della proprietà minimumBookingPeriod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getMinimumBookingPeriod() {
        return minimumBookingPeriod;
    }

    /**
     * Imposta il valore della proprietà minimumBookingPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinimumBookingPeriod(Duration value) {
        this.minimumBookingPeriod = value;
    }

    /**
     * Recupera il valore della proprietà extension.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExtension() {
        return extension;
    }

    /**
     * Imposta il valore della proprietà extension.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExtension(Object value) {
        this.extension = value;
    }

    public BookingArrangementStructure withBookingAgencyName(InternationalTextStructure value) {
        setBookingAgencyName(value);
        return this;
    }

    public BookingArrangementStructure withBookingUrl(String value) {
        setBookingUrl(value);
        return this;
    }

    public BookingArrangementStructure withInfoUrl(String value) {
        setInfoUrl(value);
        return this;
    }

    public BookingArrangementStructure withPhoneNumber(String value) {
        setPhoneNumber(value);
        return this;
    }

    public BookingArrangementStructure withMinimumBookingPeriod(Duration value) {
        setMinimumBookingPeriod(value);
        return this;
    }

    public BookingArrangementStructure withExtension(Object value) {
        setExtension(value);
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

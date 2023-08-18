//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package de.vdv.ojp;

import java.math.BigInteger;
import java.time.LocalDateTime;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.bliksemlabs.ojp.model.StopPointRefStructure;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.LocalDateTimeISO8601XmlAdapter;


/**
 * Describes the the situation at a stop or station at which the passenger boards a Leg of a trip including time-related information.
 * 
 * <p>Classe Java per LegBoardStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="LegBoardStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}StopPointGroup"/&gt;
 *         &lt;element name="ServiceArrival" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;group ref="{http://www.vdv.de/ojp}ServiceTimeGroup"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ServiceDeparture"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;group ref="{http://www.vdv.de/ojp}ServiceTimeGroup"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MeetsViaRequest" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}StopCallStatusGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegBoardStructure", propOrder = {
    "stopPointRef",
    "stopPointName",
    "nameSuffix",
    "plannedQuay",
    "estimatedQuay",
    "serviceArrival",
    "serviceDeparture",
    "meetsViaRequest",
    "order",
    "requestStop",
    "unplannedStop",
    "notServicedStop"
})
public class LegBoardStructure {

    @XmlElement(name = "StopPointRef", namespace = "http://www.siri.org.uk/siri", required = true)
    protected StopPointRefStructure stopPointRef;
    @XmlElement(name = "StopPointName", required = true)
    protected InternationalTextStructure stopPointName;
    @XmlElement(name = "NameSuffix")
    protected InternationalTextStructure nameSuffix;
    @XmlElement(name = "PlannedQuay")
    protected InternationalTextStructure plannedQuay;
    @XmlElement(name = "EstimatedQuay")
    protected InternationalTextStructure estimatedQuay;
    @XmlElement(name = "ServiceArrival")
    protected LegBoardStructure.ServiceArrival serviceArrival;
    @XmlElement(name = "ServiceDeparture", required = true)
    protected LegBoardStructure.ServiceDeparture serviceDeparture;
    @XmlElement(name = "MeetsViaRequest", defaultValue = "false")
    protected Boolean meetsViaRequest;
    @XmlElement(name = "Order")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger order;
    @XmlElement(name = "RequestStop", defaultValue = "false")
    protected Boolean requestStop;
    @XmlElement(name = "UnplannedStop", defaultValue = "false")
    protected Boolean unplannedStop;
    @XmlElement(name = "NotServicedStop", defaultValue = "false")
    protected Boolean notServicedStop;

    /**
     * Recupera il valore della proprietà stopPointRef.
     * 
     * @return
     *     possible object is
     *     {@link StopPointRefStructure }
     *     
     */
    public StopPointRefStructure getStopPointRef() {
        return stopPointRef;
    }

    /**
     * Imposta il valore della proprietà stopPointRef.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointRefStructure }
     *     
     */
    public void setStopPointRef(StopPointRefStructure value) {
        this.stopPointRef = value;
    }

    /**
     * Recupera il valore della proprietà stopPointName.
     * 
     * @return
     *     possible object is
     *     {@link InternationalTextStructure }
     *     
     */
    public InternationalTextStructure getStopPointName() {
        return stopPointName;
    }

    /**
     * Imposta il valore della proprietà stopPointName.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTextStructure }
     *     
     */
    public void setStopPointName(InternationalTextStructure value) {
        this.stopPointName = value;
    }

    /**
     * Recupera il valore della proprietà nameSuffix.
     * 
     * @return
     *     possible object is
     *     {@link InternationalTextStructure }
     *     
     */
    public InternationalTextStructure getNameSuffix() {
        return nameSuffix;
    }

    /**
     * Imposta il valore della proprietà nameSuffix.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTextStructure }
     *     
     */
    public void setNameSuffix(InternationalTextStructure value) {
        this.nameSuffix = value;
    }

    /**
     * Recupera il valore della proprietà plannedQuay.
     * 
     * @return
     *     possible object is
     *     {@link InternationalTextStructure }
     *     
     */
    public InternationalTextStructure getPlannedQuay() {
        return plannedQuay;
    }

    /**
     * Imposta il valore della proprietà plannedQuay.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTextStructure }
     *     
     */
    public void setPlannedQuay(InternationalTextStructure value) {
        this.plannedQuay = value;
    }

    /**
     * Recupera il valore della proprietà estimatedQuay.
     * 
     * @return
     *     possible object is
     *     {@link InternationalTextStructure }
     *     
     */
    public InternationalTextStructure getEstimatedQuay() {
        return estimatedQuay;
    }

    /**
     * Imposta il valore della proprietà estimatedQuay.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTextStructure }
     *     
     */
    public void setEstimatedQuay(InternationalTextStructure value) {
        this.estimatedQuay = value;
    }

    /**
     * Recupera il valore della proprietà serviceArrival.
     * 
     * @return
     *     possible object is
     *     {@link LegBoardStructure.ServiceArrival }
     *     
     */
    public LegBoardStructure.ServiceArrival getServiceArrival() {
        return serviceArrival;
    }

    /**
     * Imposta il valore della proprietà serviceArrival.
     * 
     * @param value
     *     allowed object is
     *     {@link LegBoardStructure.ServiceArrival }
     *     
     */
    public void setServiceArrival(LegBoardStructure.ServiceArrival value) {
        this.serviceArrival = value;
    }

    /**
     * Recupera il valore della proprietà serviceDeparture.
     * 
     * @return
     *     possible object is
     *     {@link LegBoardStructure.ServiceDeparture }
     *     
     */
    public LegBoardStructure.ServiceDeparture getServiceDeparture() {
        return serviceDeparture;
    }

    /**
     * Imposta il valore della proprietà serviceDeparture.
     * 
     * @param value
     *     allowed object is
     *     {@link LegBoardStructure.ServiceDeparture }
     *     
     */
    public void setServiceDeparture(LegBoardStructure.ServiceDeparture value) {
        this.serviceDeparture = value;
    }

    /**
     * Recupera il valore della proprietà meetsViaRequest.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMeetsViaRequest() {
        return meetsViaRequest;
    }

    /**
     * Imposta il valore della proprietà meetsViaRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMeetsViaRequest(Boolean value) {
        this.meetsViaRequest = value;
    }

    /**
     * Recupera il valore della proprietà order.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrder() {
        return order;
    }

    /**
     * Imposta il valore della proprietà order.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrder(BigInteger value) {
        this.order = value;
    }

    /**
     * Recupera il valore della proprietà requestStop.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequestStop() {
        return requestStop;
    }

    /**
     * Imposta il valore della proprietà requestStop.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequestStop(Boolean value) {
        this.requestStop = value;
    }

    /**
     * Recupera il valore della proprietà unplannedStop.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnplannedStop() {
        return unplannedStop;
    }

    /**
     * Imposta il valore della proprietà unplannedStop.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnplannedStop(Boolean value) {
        this.unplannedStop = value;
    }

    /**
     * Recupera il valore della proprietà notServicedStop.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotServicedStop() {
        return notServicedStop;
    }

    /**
     * Imposta il valore della proprietà notServicedStop.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotServicedStop(Boolean value) {
        this.notServicedStop = value;
    }

    public LegBoardStructure withStopPointRef(StopPointRefStructure value) {
        setStopPointRef(value);
        return this;
    }

    public LegBoardStructure withStopPointName(InternationalTextStructure value) {
        setStopPointName(value);
        return this;
    }

    public LegBoardStructure withNameSuffix(InternationalTextStructure value) {
        setNameSuffix(value);
        return this;
    }

    public LegBoardStructure withPlannedQuay(InternationalTextStructure value) {
        setPlannedQuay(value);
        return this;
    }

    public LegBoardStructure withEstimatedQuay(InternationalTextStructure value) {
        setEstimatedQuay(value);
        return this;
    }

    public LegBoardStructure withServiceArrival(LegBoardStructure.ServiceArrival value) {
        setServiceArrival(value);
        return this;
    }

    public LegBoardStructure withServiceDeparture(LegBoardStructure.ServiceDeparture value) {
        setServiceDeparture(value);
        return this;
    }

    public LegBoardStructure withMeetsViaRequest(Boolean value) {
        setMeetsViaRequest(value);
        return this;
    }

    public LegBoardStructure withOrder(BigInteger value) {
        setOrder(value);
        return this;
    }

    public LegBoardStructure withRequestStop(Boolean value) {
        setRequestStop(value);
        return this;
    }

    public LegBoardStructure withUnplannedStop(Boolean value) {
        setUnplannedStop(value);
        return this;
    }

    public LegBoardStructure withNotServicedStop(Boolean value) {
        setNotServicedStop(value);
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
     *         &lt;group ref="{http://www.vdv.de/ojp}ServiceTimeGroup"/&gt;
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
        "timetabledTime",
        "recordedAtTime",
        "estimatedTime",
        "estimatedTimeLow",
        "estimatedTimeHigh"
    })
    public static class ServiceArrival {

        @XmlElement(name = "TimetabledTime", required = true, type = String.class)
        @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
        @XmlSchemaType(name = "dateTime")
        protected LocalDateTime timetabledTime;
        @XmlElement(name = "RecordedAtTime", type = String.class)
        @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
        @XmlSchemaType(name = "dateTime")
        protected LocalDateTime recordedAtTime;
        @XmlElement(name = "EstimatedTime", type = String.class)
        @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
        @XmlSchemaType(name = "dateTime")
        protected LocalDateTime estimatedTime;
        @XmlElement(name = "EstimatedTimeLow", type = String.class)
        @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
        @XmlSchemaType(name = "dateTime")
        protected LocalDateTime estimatedTimeLow;
        @XmlElement(name = "EstimatedTimeHigh", type = String.class)
        @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
        @XmlSchemaType(name = "dateTime")
        protected LocalDateTime estimatedTimeHigh;

        /**
         * Recupera il valore della proprietà timetabledTime.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public LocalDateTime getTimetabledTime() {
            return timetabledTime;
        }

        /**
         * Imposta il valore della proprietà timetabledTime.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTimetabledTime(LocalDateTime value) {
            this.timetabledTime = value;
        }

        /**
         * Recupera il valore della proprietà recordedAtTime.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public LocalDateTime getRecordedAtTime() {
            return recordedAtTime;
        }

        /**
         * Imposta il valore della proprietà recordedAtTime.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRecordedAtTime(LocalDateTime value) {
            this.recordedAtTime = value;
        }

        /**
         * Recupera il valore della proprietà estimatedTime.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public LocalDateTime getEstimatedTime() {
            return estimatedTime;
        }

        /**
         * Imposta il valore della proprietà estimatedTime.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEstimatedTime(LocalDateTime value) {
            this.estimatedTime = value;
        }

        /**
         * Recupera il valore della proprietà estimatedTimeLow.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public LocalDateTime getEstimatedTimeLow() {
            return estimatedTimeLow;
        }

        /**
         * Imposta il valore della proprietà estimatedTimeLow.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEstimatedTimeLow(LocalDateTime value) {
            this.estimatedTimeLow = value;
        }

        /**
         * Recupera il valore della proprietà estimatedTimeHigh.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public LocalDateTime getEstimatedTimeHigh() {
            return estimatedTimeHigh;
        }

        /**
         * Imposta il valore della proprietà estimatedTimeHigh.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEstimatedTimeHigh(LocalDateTime value) {
            this.estimatedTimeHigh = value;
        }

        public LegBoardStructure.ServiceArrival withTimetabledTime(LocalDateTime value) {
            setTimetabledTime(value);
            return this;
        }

        public LegBoardStructure.ServiceArrival withRecordedAtTime(LocalDateTime value) {
            setRecordedAtTime(value);
            return this;
        }

        public LegBoardStructure.ServiceArrival withEstimatedTime(LocalDateTime value) {
            setEstimatedTime(value);
            return this;
        }

        public LegBoardStructure.ServiceArrival withEstimatedTimeLow(LocalDateTime value) {
            setEstimatedTimeLow(value);
            return this;
        }

        public LegBoardStructure.ServiceArrival withEstimatedTimeHigh(LocalDateTime value) {
            setEstimatedTimeHigh(value);
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
     *         &lt;group ref="{http://www.vdv.de/ojp}ServiceTimeGroup"/&gt;
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
        "timetabledTime",
        "recordedAtTime",
        "estimatedTime",
        "estimatedTimeLow",
        "estimatedTimeHigh"
    })
    public static class ServiceDeparture {

        @XmlElement(name = "TimetabledTime", required = true, type = String.class)
        @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
        @XmlSchemaType(name = "dateTime")
        protected LocalDateTime timetabledTime;
        @XmlElement(name = "RecordedAtTime", type = String.class)
        @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
        @XmlSchemaType(name = "dateTime")
        protected LocalDateTime recordedAtTime;
        @XmlElement(name = "EstimatedTime", type = String.class)
        @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
        @XmlSchemaType(name = "dateTime")
        protected LocalDateTime estimatedTime;
        @XmlElement(name = "EstimatedTimeLow", type = String.class)
        @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
        @XmlSchemaType(name = "dateTime")
        protected LocalDateTime estimatedTimeLow;
        @XmlElement(name = "EstimatedTimeHigh", type = String.class)
        @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
        @XmlSchemaType(name = "dateTime")
        protected LocalDateTime estimatedTimeHigh;

        /**
         * Recupera il valore della proprietà timetabledTime.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public LocalDateTime getTimetabledTime() {
            return timetabledTime;
        }

        /**
         * Imposta il valore della proprietà timetabledTime.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTimetabledTime(LocalDateTime value) {
            this.timetabledTime = value;
        }

        /**
         * Recupera il valore della proprietà recordedAtTime.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public LocalDateTime getRecordedAtTime() {
            return recordedAtTime;
        }

        /**
         * Imposta il valore della proprietà recordedAtTime.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRecordedAtTime(LocalDateTime value) {
            this.recordedAtTime = value;
        }

        /**
         * Recupera il valore della proprietà estimatedTime.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public LocalDateTime getEstimatedTime() {
            return estimatedTime;
        }

        /**
         * Imposta il valore della proprietà estimatedTime.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEstimatedTime(LocalDateTime value) {
            this.estimatedTime = value;
        }

        /**
         * Recupera il valore della proprietà estimatedTimeLow.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public LocalDateTime getEstimatedTimeLow() {
            return estimatedTimeLow;
        }

        /**
         * Imposta il valore della proprietà estimatedTimeLow.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEstimatedTimeLow(LocalDateTime value) {
            this.estimatedTimeLow = value;
        }

        /**
         * Recupera il valore della proprietà estimatedTimeHigh.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public LocalDateTime getEstimatedTimeHigh() {
            return estimatedTimeHigh;
        }

        /**
         * Imposta il valore della proprietà estimatedTimeHigh.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEstimatedTimeHigh(LocalDateTime value) {
            this.estimatedTimeHigh = value;
        }

        public LegBoardStructure.ServiceDeparture withTimetabledTime(LocalDateTime value) {
            setTimetabledTime(value);
            return this;
        }

        public LegBoardStructure.ServiceDeparture withRecordedAtTime(LocalDateTime value) {
            setRecordedAtTime(value);
            return this;
        }

        public LegBoardStructure.ServiceDeparture withEstimatedTime(LocalDateTime value) {
            setEstimatedTime(value);
            return this;
        }

        public LegBoardStructure.ServiceDeparture withEstimatedTimeLow(LocalDateTime value) {
            setEstimatedTimeLow(value);
            return this;
        }

        public LegBoardStructure.ServiceDeparture withEstimatedTimeHigh(LocalDateTime value) {
            setEstimatedTimeHigh(value);
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

//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package com.bliksemlabs.ojp.model;

import java.time.Duration;
import java.time.LocalDateTime;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.migesok.jaxb.adapter.javatime.DurationXmlAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.LocalDateTimeISO8601XmlAdapter;


/**
 * <p>Classe Java per CheckStatusResponseBodyStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CheckStatusResponseBodyStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}CheckStatusPayloadGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckStatusResponseBodyStructure", propOrder = {
    "status",
    "dataReady",
    "errorCondition",
    "validUntil",
    "shortestPossibleCycle",
    "serviceStartedTime"
})
public class CheckStatusResponseBodyStructure {

    @XmlElement(name = "Status", defaultValue = "true")
    protected Boolean status;
    @XmlElement(name = "DataReady")
    protected Boolean dataReady;
    @XmlElement(name = "ErrorCondition")
    protected CheckStatusResponseBodyStructure.ErrorCondition errorCondition;
    @XmlElement(name = "ValidUntil", type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime validUntil;
    @XmlElement(name = "ShortestPossibleCycle", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration shortestPossibleCycle;
    @XmlElement(name = "ServiceStartedTime", type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime serviceStartedTime;

    /**
     * Recupera il valore della proprietà status.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStatus() {
        return status;
    }

    /**
     * Imposta il valore della proprietà status.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStatus(Boolean value) {
        this.status = value;
    }

    /**
     * Recupera il valore della proprietà dataReady.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDataReady() {
        return dataReady;
    }

    /**
     * Imposta il valore della proprietà dataReady.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDataReady(Boolean value) {
        this.dataReady = value;
    }

    /**
     * Recupera il valore della proprietà errorCondition.
     * 
     * @return
     *     possible object is
     *     {@link CheckStatusResponseBodyStructure.ErrorCondition }
     *     
     */
    public CheckStatusResponseBodyStructure.ErrorCondition getErrorCondition() {
        return errorCondition;
    }

    /**
     * Imposta il valore della proprietà errorCondition.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckStatusResponseBodyStructure.ErrorCondition }
     *     
     */
    public void setErrorCondition(CheckStatusResponseBodyStructure.ErrorCondition value) {
        this.errorCondition = value;
    }

    /**
     * Recupera il valore della proprietà validUntil.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getValidUntil() {
        return validUntil;
    }

    /**
     * Imposta il valore della proprietà validUntil.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidUntil(LocalDateTime value) {
        this.validUntil = value;
    }

    /**
     * Recupera il valore della proprietà shortestPossibleCycle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getShortestPossibleCycle() {
        return shortestPossibleCycle;
    }

    /**
     * Imposta il valore della proprietà shortestPossibleCycle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortestPossibleCycle(Duration value) {
        this.shortestPossibleCycle = value;
    }

    /**
     * Recupera il valore della proprietà serviceStartedTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getServiceStartedTime() {
        return serviceStartedTime;
    }

    /**
     * Imposta il valore della proprietà serviceStartedTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceStartedTime(LocalDateTime value) {
        this.serviceStartedTime = value;
    }

    public CheckStatusResponseBodyStructure withStatus(Boolean value) {
        setStatus(value);
        return this;
    }

    public CheckStatusResponseBodyStructure withDataReady(Boolean value) {
        setDataReady(value);
        return this;
    }

    public CheckStatusResponseBodyStructure withErrorCondition(CheckStatusResponseBodyStructure.ErrorCondition value) {
        setErrorCondition(value);
        return this;
    }

    public CheckStatusResponseBodyStructure withValidUntil(LocalDateTime value) {
        setValidUntil(value);
        return this;
    }

    public CheckStatusResponseBodyStructure withShortestPossibleCycle(Duration value) {
        setShortestPossibleCycle(value);
        return this;
    }

    public CheckStatusResponseBodyStructure withServiceStartedTime(LocalDateTime value) {
        setServiceStartedTime(value);
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
     *         &lt;choice&gt;
     *           &lt;element ref="{http://www.siri.org.uk/siri}ServiceNotAvailableError"/&gt;
     *           &lt;element ref="{http://www.siri.org.uk/siri}OtherError"/&gt;
     *         &lt;/choice&gt;
     *         &lt;element name="Description" type="{http://www.siri.org.uk/siri}ErrorDescriptionStructure" minOccurs="0"/&gt;
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
        "serviceNotAvailableError",
        "otherError",
        "description"
    })
    public static class ErrorCondition {

        @XmlElement(name = "ServiceNotAvailableError")
        protected ServiceNotAvailableErrorStructure serviceNotAvailableError;
        @XmlElement(name = "OtherError")
        protected OtherErrorStructure otherError;
        @XmlElement(name = "Description")
        protected ErrorDescriptionStructure description;

        /**
         * Recupera il valore della proprietà serviceNotAvailableError.
         * 
         * @return
         *     possible object is
         *     {@link ServiceNotAvailableErrorStructure }
         *     
         */
        public ServiceNotAvailableErrorStructure getServiceNotAvailableError() {
            return serviceNotAvailableError;
        }

        /**
         * Imposta il valore della proprietà serviceNotAvailableError.
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceNotAvailableErrorStructure }
         *     
         */
        public void setServiceNotAvailableError(ServiceNotAvailableErrorStructure value) {
            this.serviceNotAvailableError = value;
        }

        /**
         * Recupera il valore della proprietà otherError.
         * 
         * @return
         *     possible object is
         *     {@link OtherErrorStructure }
         *     
         */
        public OtherErrorStructure getOtherError() {
            return otherError;
        }

        /**
         * Imposta il valore della proprietà otherError.
         * 
         * @param value
         *     allowed object is
         *     {@link OtherErrorStructure }
         *     
         */
        public void setOtherError(OtherErrorStructure value) {
            this.otherError = value;
        }

        /**
         * Recupera il valore della proprietà description.
         * 
         * @return
         *     possible object is
         *     {@link ErrorDescriptionStructure }
         *     
         */
        public ErrorDescriptionStructure getDescription() {
            return description;
        }

        /**
         * Imposta il valore della proprietà description.
         * 
         * @param value
         *     allowed object is
         *     {@link ErrorDescriptionStructure }
         *     
         */
        public void setDescription(ErrorDescriptionStructure value) {
            this.description = value;
        }

        public CheckStatusResponseBodyStructure.ErrorCondition withServiceNotAvailableError(ServiceNotAvailableErrorStructure value) {
            setServiceNotAvailableError(value);
            return this;
        }

        public CheckStatusResponseBodyStructure.ErrorCondition withOtherError(OtherErrorStructure value) {
            setOtherError(value);
            return this;
        }

        public CheckStatusResponseBodyStructure.ErrorCondition withDescription(ErrorDescriptionStructure value) {
            setDescription(value);
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

//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package com.bliksemlabs.ojp.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import de.vdv.ojp.OJPExchangePointsDeliveryStructure;
import de.vdv.ojp.OJPFareDeliveryStructure;
import de.vdv.ojp.OJPLocationInformationDeliveryStructure;
import de.vdv.ojp.OJPMultiPointTripDeliveryStructure;
import de.vdv.ojp.OJPStopEventDeliveryStructure;
import de.vdv.ojp.OJPTripDeliveryStructure;
import de.vdv.ojp.OJPTripInfoDeliveryStructure;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per ServiceDeliveryBodyStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ServiceDeliveryBodyStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}ServiceDeliveryBodyGroup"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="srsName" type="{http://www.siri.org.uk/siri}SrsNameType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceDeliveryBodyStructure", propOrder = {
    "status",
    "errorCondition",
    "moreData",
    "abstractFunctionalServiceDelivery"
})
public class ServiceDeliveryBodyStructure {

    @XmlElement(name = "Status", defaultValue = "true")
    protected Boolean status;
    @XmlElement(name = "ErrorCondition")
    protected ServiceDeliveryBodyStructure.ErrorCondition errorCondition;
    @XmlElement(name = "MoreData", defaultValue = "false")
    protected Boolean moreData;
    @XmlElementRef(name = "AbstractFunctionalServiceDelivery", namespace = "http://www.siri.org.uk/siri", type = JAXBElement.class)
    protected List<JAXBElement<? extends AbstractServiceDeliveryStructure>> abstractFunctionalServiceDelivery;
    @XmlAttribute(name = "srsName")
    protected String srsName;

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
     * Recupera il valore della proprietà errorCondition.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDeliveryBodyStructure.ErrorCondition }
     *     
     */
    public ServiceDeliveryBodyStructure.ErrorCondition getErrorCondition() {
        return errorCondition;
    }

    /**
     * Imposta il valore della proprietà errorCondition.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDeliveryBodyStructure.ErrorCondition }
     *     
     */
    public void setErrorCondition(ServiceDeliveryBodyStructure.ErrorCondition value) {
        this.errorCondition = value;
    }

    /**
     * Recupera il valore della proprietà moreData.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMoreData() {
        return moreData;
    }

    /**
     * Imposta il valore della proprietà moreData.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMoreData(Boolean value) {
        this.moreData = value;
    }

    /**
     * Gets the value of the abstractFunctionalServiceDelivery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abstractFunctionalServiceDelivery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbstractFunctionalServiceDelivery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link OJPLocationInformationDeliveryStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractServiceDeliveryStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OJPTripDeliveryStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OJPStopEventDeliveryStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OJPExchangePointsDeliveryStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OJPMultiPointTripDeliveryStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OJPFareDeliveryStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OJPTripInfoDeliveryStructure }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends AbstractServiceDeliveryStructure>> getAbstractFunctionalServiceDelivery() {
        if (abstractFunctionalServiceDelivery == null) {
            abstractFunctionalServiceDelivery = new ArrayList<JAXBElement<? extends AbstractServiceDeliveryStructure>>();
        }
        return this.abstractFunctionalServiceDelivery;
    }

    /**
     * Recupera il valore della proprietà srsName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrsName() {
        return srsName;
    }

    /**
     * Imposta il valore della proprietà srsName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrsName(String value) {
        this.srsName = value;
    }

    public ServiceDeliveryBodyStructure withStatus(Boolean value) {
        setStatus(value);
        return this;
    }

    public ServiceDeliveryBodyStructure withErrorCondition(ServiceDeliveryBodyStructure.ErrorCondition value) {
        setErrorCondition(value);
        return this;
    }

    public ServiceDeliveryBodyStructure withMoreData(Boolean value) {
        setMoreData(value);
        return this;
    }

    public ServiceDeliveryBodyStructure withAbstractFunctionalServiceDelivery(JAXBElement<? extends AbstractServiceDeliveryStructure> ... values) {
        if (values!= null) {
            for (JAXBElement<? extends AbstractServiceDeliveryStructure> value: values) {
                getAbstractFunctionalServiceDelivery().add(value);
            }
        }
        return this;
    }

    public ServiceDeliveryBodyStructure withAbstractFunctionalServiceDelivery(Collection<JAXBElement<? extends AbstractServiceDeliveryStructure>> values) {
        if (values!= null) {
            getAbstractFunctionalServiceDelivery().addAll(values);
        }
        return this;
    }

    public ServiceDeliveryBodyStructure withSrsName(String value) {
        setSrsName(value);
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
     *           &lt;element ref="{http://www.siri.org.uk/siri}CapabilityNotSupportedError"/&gt;
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
        "capabilityNotSupportedError",
        "otherError",
        "description"
    })
    public static class ErrorCondition {

        @XmlElement(name = "CapabilityNotSupportedError")
        protected CapabilityNotSupportedErrorStructure capabilityNotSupportedError;
        @XmlElement(name = "OtherError")
        protected OtherErrorStructure otherError;
        @XmlElement(name = "Description")
        protected ErrorDescriptionStructure description;

        /**
         * Recupera il valore della proprietà capabilityNotSupportedError.
         * 
         * @return
         *     possible object is
         *     {@link CapabilityNotSupportedErrorStructure }
         *     
         */
        public CapabilityNotSupportedErrorStructure getCapabilityNotSupportedError() {
            return capabilityNotSupportedError;
        }

        /**
         * Imposta il valore della proprietà capabilityNotSupportedError.
         * 
         * @param value
         *     allowed object is
         *     {@link CapabilityNotSupportedErrorStructure }
         *     
         */
        public void setCapabilityNotSupportedError(CapabilityNotSupportedErrorStructure value) {
            this.capabilityNotSupportedError = value;
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

        public ServiceDeliveryBodyStructure.ErrorCondition withCapabilityNotSupportedError(CapabilityNotSupportedErrorStructure value) {
            setCapabilityNotSupportedError(value);
            return this;
        }

        public ServiceDeliveryBodyStructure.ErrorCondition withOtherError(OtherErrorStructure value) {
            setOtherError(value);
            return this;
        }

        public ServiceDeliveryBodyStructure.ErrorCondition withDescription(ErrorDescriptionStructure value) {
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

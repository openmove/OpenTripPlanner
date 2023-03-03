//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package de.vdv.ojp;

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


/**
 * Structure of a Single Trip Fare Request result
 * 
 * <p>Classe Java per TripFareResultStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TripFareResultStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ErrorMessage" type="{http://www.vdv.de/ojp}ErrorMessageStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}TripLegRangeGroup" minOccurs="0"/&gt;
 *         &lt;element name="PassedZones" type="{http://www.vdv.de/ojp}TariffZoneListInAreaStructure" minOccurs="0"/&gt;
 *         &lt;element name="FareProduct" type="{http://www.vdv.de/ojp}FareProductStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="StaticInfoUrl" type="{http://www.vdv.de/ojp}WebLinkStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TripFareResultStructure", propOrder = {
    "errorMessage",
    "fromTripLegIdRef",
    "toTripLegIdRef",
    "passedZones",
    "fareProduct",
    "staticInfoUrl"
})
public class TripFareResultStructure {

    @XmlElement(name = "ErrorMessage")
    protected List<ErrorMessageStructure> errorMessage;
    @XmlElement(name = "FromTripLegIdRef")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String fromTripLegIdRef;
    @XmlElement(name = "ToTripLegIdRef")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String toTripLegIdRef;
    @XmlElement(name = "PassedZones")
    protected TariffZoneListInAreaStructure passedZones;
    @XmlElement(name = "FareProduct")
    protected List<FareProductStructure> fareProduct;
    @XmlElement(name = "StaticInfoUrl")
    protected List<WebLinkStructure> staticInfoUrl;

    /**
     * Gets the value of the errorMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errorMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorMessageStructure }
     * 
     * 
     */
    public List<ErrorMessageStructure> getErrorMessage() {
        if (errorMessage == null) {
            errorMessage = new ArrayList<ErrorMessageStructure>();
        }
        return this.errorMessage;
    }

    /**
     * Recupera il valore della proprietà fromTripLegIdRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromTripLegIdRef() {
        return fromTripLegIdRef;
    }

    /**
     * Imposta il valore della proprietà fromTripLegIdRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromTripLegIdRef(String value) {
        this.fromTripLegIdRef = value;
    }

    /**
     * Recupera il valore della proprietà toTripLegIdRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToTripLegIdRef() {
        return toTripLegIdRef;
    }

    /**
     * Imposta il valore della proprietà toTripLegIdRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToTripLegIdRef(String value) {
        this.toTripLegIdRef = value;
    }

    /**
     * Recupera il valore della proprietà passedZones.
     * 
     * @return
     *     possible object is
     *     {@link TariffZoneListInAreaStructure }
     *     
     */
    public TariffZoneListInAreaStructure getPassedZones() {
        return passedZones;
    }

    /**
     * Imposta il valore della proprietà passedZones.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffZoneListInAreaStructure }
     *     
     */
    public void setPassedZones(TariffZoneListInAreaStructure value) {
        this.passedZones = value;
    }

    /**
     * Gets the value of the fareProduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareProduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareProductStructure }
     * 
     * 
     */
    public List<FareProductStructure> getFareProduct() {
        if (fareProduct == null) {
            fareProduct = new ArrayList<FareProductStructure>();
        }
        return this.fareProduct;
    }

    /**
     * Gets the value of the staticInfoUrl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the staticInfoUrl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStaticInfoUrl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WebLinkStructure }
     * 
     * 
     */
    public List<WebLinkStructure> getStaticInfoUrl() {
        if (staticInfoUrl == null) {
            staticInfoUrl = new ArrayList<WebLinkStructure>();
        }
        return this.staticInfoUrl;
    }

    public TripFareResultStructure withErrorMessage(ErrorMessageStructure... values) {
        if (values!= null) {
            for (ErrorMessageStructure value: values) {
                getErrorMessage().add(value);
            }
        }
        return this;
    }

    public TripFareResultStructure withErrorMessage(Collection<ErrorMessageStructure> values) {
        if (values!= null) {
            getErrorMessage().addAll(values);
        }
        return this;
    }

    public TripFareResultStructure withFromTripLegIdRef(String value) {
        setFromTripLegIdRef(value);
        return this;
    }

    public TripFareResultStructure withToTripLegIdRef(String value) {
        setToTripLegIdRef(value);
        return this;
    }

    public TripFareResultStructure withPassedZones(TariffZoneListInAreaStructure value) {
        setPassedZones(value);
        return this;
    }

    public TripFareResultStructure withFareProduct(FareProductStructure... values) {
        if (values!= null) {
            for (FareProductStructure value: values) {
                getFareProduct().add(value);
            }
        }
        return this;
    }

    public TripFareResultStructure withFareProduct(Collection<FareProductStructure> values) {
        if (values!= null) {
            getFareProduct().addAll(values);
        }
        return this;
    }

    public TripFareResultStructure withStaticInfoUrl(WebLinkStructure... values) {
        if (values!= null) {
            for (WebLinkStructure value: values) {
                getStaticInfoUrl().add(value);
            }
        }
        return this;
    }

    public TripFareResultStructure withStaticInfoUrl(Collection<WebLinkStructure> values) {
        if (values!= null) {
            getStaticInfoUrl().addAll(values);
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

}

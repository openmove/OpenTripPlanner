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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * Structure of a Multi Trip Fare Request result
 * 
 * <p>Classe Java per MultiTripFareResultStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="MultiTripFareResultStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ErrorMessage" type="{http://www.vdv.de/ojp}ErrorMessageStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TripFareProductReference" type="{http://www.vdv.de/ojp}TripFareProductReferenceStructure" maxOccurs="unbounded"/&gt;
 *         &lt;element name="FareProduct" type="{http://www.vdv.de/ojp}FareProductStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PassedZones" type="{http://www.vdv.de/ojp}TariffZoneListInAreaStructure" minOccurs="0"/&gt;
 *         &lt;element name="StaticInfoUrl" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiTripFareResultStructure", propOrder = {
    "errorMessage",
    "tripFareProductReference",
    "fareProduct",
    "passedZones",
    "staticInfoUrl"
})
public class MultiTripFareResultStructure {

    @XmlElement(name = "ErrorMessage")
    protected List<ErrorMessageStructure> errorMessage;
    @XmlElement(name = "TripFareProductReference", required = true)
    protected List<TripFareProductReferenceStructure> tripFareProductReference;
    @XmlElement(name = "FareProduct")
    protected List<FareProductStructure> fareProduct;
    @XmlElement(name = "PassedZones")
    protected TariffZoneListInAreaStructure passedZones;
    @XmlElement(name = "StaticInfoUrl")
    @XmlSchemaType(name = "anyURI")
    protected List<String> staticInfoUrl;

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
     * Gets the value of the tripFareProductReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tripFareProductReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTripFareProductReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TripFareProductReferenceStructure }
     * 
     * 
     */
    public List<TripFareProductReferenceStructure> getTripFareProductReference() {
        if (tripFareProductReference == null) {
            tripFareProductReference = new ArrayList<TripFareProductReferenceStructure>();
        }
        return this.tripFareProductReference;
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
     * {@link String }
     * 
     * 
     */
    public List<String> getStaticInfoUrl() {
        if (staticInfoUrl == null) {
            staticInfoUrl = new ArrayList<String>();
        }
        return this.staticInfoUrl;
    }

    public MultiTripFareResultStructure withErrorMessage(ErrorMessageStructure... values) {
        if (values!= null) {
            for (ErrorMessageStructure value: values) {
                getErrorMessage().add(value);
            }
        }
        return this;
    }

    public MultiTripFareResultStructure withErrorMessage(Collection<ErrorMessageStructure> values) {
        if (values!= null) {
            getErrorMessage().addAll(values);
        }
        return this;
    }

    public MultiTripFareResultStructure withTripFareProductReference(TripFareProductReferenceStructure... values) {
        if (values!= null) {
            for (TripFareProductReferenceStructure value: values) {
                getTripFareProductReference().add(value);
            }
        }
        return this;
    }

    public MultiTripFareResultStructure withTripFareProductReference(Collection<TripFareProductReferenceStructure> values) {
        if (values!= null) {
            getTripFareProductReference().addAll(values);
        }
        return this;
    }

    public MultiTripFareResultStructure withFareProduct(FareProductStructure... values) {
        if (values!= null) {
            for (FareProductStructure value: values) {
                getFareProduct().add(value);
            }
        }
        return this;
    }

    public MultiTripFareResultStructure withFareProduct(Collection<FareProductStructure> values) {
        if (values!= null) {
            getFareProduct().addAll(values);
        }
        return this;
    }

    public MultiTripFareResultStructure withPassedZones(TariffZoneListInAreaStructure value) {
        setPassedZones(value);
        return this;
    }

    public MultiTripFareResultStructure withStaticInfoUrl(String... values) {
        if (values!= null) {
            for (String value: values) {
                getStaticInfoUrl().add(value);
            }
        }
        return this;
    }

    public MultiTripFareResultStructure withStaticInfoUrl(Collection<String> values) {
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

//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package de.vdv.ojp;

import java.math.BigInteger;
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
 * [a specialised form of USER PROFILE in TM and NeTEx] attributes of a passenger that influence the price to be paid by that passenger for a FARE PRODUCT.
 * 
 * <p>Classe Java per FarePassengerStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="FarePassengerStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="Age" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *           &lt;element name="PassengerCategory" type="{http://www.vdv.de/ojp}PassengerCategoryEnumeration"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="EntitlementProduct" type="{http://www.vdv.de/ojp}EntitlementProductRefStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="ZonesAlreadyPaid" type="{http://www.vdv.de/ojp}TariffZoneRefListStructure"/&gt;
 *           &lt;element name="SalesPackageElementRef" type="{http://www.vdv.de/ojp}FareProductRefStructure" maxOccurs="unbounded"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FarePassengerStructure", propOrder = {
    "age",
    "passengerCategory",
    "entitlementProduct",
    "zonesAlreadyPaid",
    "salesPackageElementRef"
})
public class FarePassengerStructure {

    @XmlElement(name = "Age")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger age;
    @XmlElement(name = "PassengerCategory")
    @XmlSchemaType(name = "string")
    protected PassengerCategoryEnumeration passengerCategory;
    @XmlElement(name = "EntitlementProduct")
    protected List<EntitlementProductRefStructure> entitlementProduct;
    @XmlElement(name = "ZonesAlreadyPaid")
    protected TariffZoneRefListStructure zonesAlreadyPaid;
    @XmlElement(name = "SalesPackageElementRef")
    protected List<FareProductRefStructure> salesPackageElementRef;

    /**
     * Recupera il valore della proprietà age.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAge() {
        return age;
    }

    /**
     * Imposta il valore della proprietà age.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAge(BigInteger value) {
        this.age = value;
    }

    /**
     * Recupera il valore della proprietà passengerCategory.
     * 
     * @return
     *     possible object is
     *     {@link PassengerCategoryEnumeration }
     *     
     */
    public PassengerCategoryEnumeration getPassengerCategory() {
        return passengerCategory;
    }

    /**
     * Imposta il valore della proprietà passengerCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerCategoryEnumeration }
     *     
     */
    public void setPassengerCategory(PassengerCategoryEnumeration value) {
        this.passengerCategory = value;
    }

    /**
     * Gets the value of the entitlementProduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entitlementProduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntitlementProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntitlementProductRefStructure }
     * 
     * 
     */
    public List<EntitlementProductRefStructure> getEntitlementProduct() {
        if (entitlementProduct == null) {
            entitlementProduct = new ArrayList<EntitlementProductRefStructure>();
        }
        return this.entitlementProduct;
    }

    /**
     * Recupera il valore della proprietà zonesAlreadyPaid.
     * 
     * @return
     *     possible object is
     *     {@link TariffZoneRefListStructure }
     *     
     */
    public TariffZoneRefListStructure getZonesAlreadyPaid() {
        return zonesAlreadyPaid;
    }

    /**
     * Imposta il valore della proprietà zonesAlreadyPaid.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffZoneRefListStructure }
     *     
     */
    public void setZonesAlreadyPaid(TariffZoneRefListStructure value) {
        this.zonesAlreadyPaid = value;
    }

    /**
     * Gets the value of the salesPackageElementRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesPackageElementRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesPackageElementRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareProductRefStructure }
     * 
     * 
     */
    public List<FareProductRefStructure> getSalesPackageElementRef() {
        if (salesPackageElementRef == null) {
            salesPackageElementRef = new ArrayList<FareProductRefStructure>();
        }
        return this.salesPackageElementRef;
    }

    public FarePassengerStructure withAge(BigInteger value) {
        setAge(value);
        return this;
    }

    public FarePassengerStructure withPassengerCategory(PassengerCategoryEnumeration value) {
        setPassengerCategory(value);
        return this;
    }

    public FarePassengerStructure withEntitlementProduct(EntitlementProductRefStructure... values) {
        if (values!= null) {
            for (EntitlementProductRefStructure value: values) {
                getEntitlementProduct().add(value);
            }
        }
        return this;
    }

    public FarePassengerStructure withEntitlementProduct(Collection<EntitlementProductRefStructure> values) {
        if (values!= null) {
            getEntitlementProduct().addAll(values);
        }
        return this;
    }

    public FarePassengerStructure withZonesAlreadyPaid(TariffZoneRefListStructure value) {
        setZonesAlreadyPaid(value);
        return this;
    }

    public FarePassengerStructure withSalesPackageElementRef(FareProductRefStructure... values) {
        if (values!= null) {
            for (FareProductRefStructure value: values) {
                getSalesPackageElementRef().add(value);
            }
        }
        return this;
    }

    public FarePassengerStructure withSalesPackageElementRef(Collection<FareProductRefStructure> values) {
        if (values!= null) {
            getSalesPackageElementRef().addAll(values);
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

//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per SupplementaryPositionalDescription complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SupplementaryPositionalDescription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="carriageway" type="{http://datex2.eu/schema/2_0RC1/2_0}CarriagewayEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="footpath" type="{http://datex2.eu/schema/2_0RC1/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="lane" type="{http://datex2.eu/schema/2_0RC1/2_0}LaneEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="lengthAffected" type="{http://datex2.eu/schema/2_0RC1/2_0}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="locationDescriptor" type="{http://datex2.eu/schema/2_0RC1/2_0}LocationDescriptorEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="locationPrecision" type="{http://datex2.eu/schema/2_0RC1/2_0}MetresAsNonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="sequentialRampNumber" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="supplementaryPositionalDescriptionExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplementaryPositionalDescription", propOrder = {
    "carriageway",
    "footpath",
    "lane",
    "lengthAffected",
    "locationDescriptor",
    "locationPrecision",
    "sequentialRampNumber",
    "supplementaryPositionalDescriptionExtension"
})
public class SupplementaryPositionalDescription {

    @XmlSchemaType(name = "string")
    protected List<CarriagewayEnum> carriageway;
    protected Boolean footpath;
    @XmlSchemaType(name = "string")
    protected List<LaneEnum> lane;
    protected Float lengthAffected;
    @XmlSchemaType(name = "string")
    protected List<LocationDescriptorEnum> locationDescriptor;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger locationPrecision;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger sequentialRampNumber;
    protected ExtensionType supplementaryPositionalDescriptionExtension;

    /**
     * Gets the value of the carriageway property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carriageway property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarriageway().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CarriagewayEnum }
     * 
     * 
     */
    public List<CarriagewayEnum> getCarriageway() {
        if (carriageway == null) {
            carriageway = new ArrayList<CarriagewayEnum>();
        }
        return this.carriageway;
    }

    /**
     * Recupera il valore della proprietà footpath.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFootpath() {
        return footpath;
    }

    /**
     * Imposta il valore della proprietà footpath.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFootpath(Boolean value) {
        this.footpath = value;
    }

    /**
     * Gets the value of the lane property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lane property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLane().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LaneEnum }
     * 
     * 
     */
    public List<LaneEnum> getLane() {
        if (lane == null) {
            lane = new ArrayList<LaneEnum>();
        }
        return this.lane;
    }

    /**
     * Recupera il valore della proprietà lengthAffected.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLengthAffected() {
        return lengthAffected;
    }

    /**
     * Imposta il valore della proprietà lengthAffected.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLengthAffected(Float value) {
        this.lengthAffected = value;
    }

    /**
     * Gets the value of the locationDescriptor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationDescriptor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationDescriptor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationDescriptorEnum }
     * 
     * 
     */
    public List<LocationDescriptorEnum> getLocationDescriptor() {
        if (locationDescriptor == null) {
            locationDescriptor = new ArrayList<LocationDescriptorEnum>();
        }
        return this.locationDescriptor;
    }

    /**
     * Recupera il valore della proprietà locationPrecision.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLocationPrecision() {
        return locationPrecision;
    }

    /**
     * Imposta il valore della proprietà locationPrecision.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLocationPrecision(BigInteger value) {
        this.locationPrecision = value;
    }

    /**
     * Recupera il valore della proprietà sequentialRampNumber.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequentialRampNumber() {
        return sequentialRampNumber;
    }

    /**
     * Imposta il valore della proprietà sequentialRampNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequentialRampNumber(BigInteger value) {
        this.sequentialRampNumber = value;
    }

    /**
     * Recupera il valore della proprietà supplementaryPositionalDescriptionExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getSupplementaryPositionalDescriptionExtension() {
        return supplementaryPositionalDescriptionExtension;
    }

    /**
     * Imposta il valore della proprietà supplementaryPositionalDescriptionExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setSupplementaryPositionalDescriptionExtension(ExtensionType value) {
        this.supplementaryPositionalDescriptionExtension = value;
    }

    public SupplementaryPositionalDescription withCarriageway(CarriagewayEnum... values) {
        if (values!= null) {
            for (CarriagewayEnum value: values) {
                getCarriageway().add(value);
            }
        }
        return this;
    }

    public SupplementaryPositionalDescription withCarriageway(Collection<CarriagewayEnum> values) {
        if (values!= null) {
            getCarriageway().addAll(values);
        }
        return this;
    }

    public SupplementaryPositionalDescription withFootpath(Boolean value) {
        setFootpath(value);
        return this;
    }

    public SupplementaryPositionalDescription withLane(LaneEnum... values) {
        if (values!= null) {
            for (LaneEnum value: values) {
                getLane().add(value);
            }
        }
        return this;
    }

    public SupplementaryPositionalDescription withLane(Collection<LaneEnum> values) {
        if (values!= null) {
            getLane().addAll(values);
        }
        return this;
    }

    public SupplementaryPositionalDescription withLengthAffected(Float value) {
        setLengthAffected(value);
        return this;
    }

    public SupplementaryPositionalDescription withLocationDescriptor(LocationDescriptorEnum... values) {
        if (values!= null) {
            for (LocationDescriptorEnum value: values) {
                getLocationDescriptor().add(value);
            }
        }
        return this;
    }

    public SupplementaryPositionalDescription withLocationDescriptor(Collection<LocationDescriptorEnum> values) {
        if (values!= null) {
            getLocationDescriptor().addAll(values);
        }
        return this;
    }

    public SupplementaryPositionalDescription withLocationPrecision(BigInteger value) {
        setLocationPrecision(value);
        return this;
    }

    public SupplementaryPositionalDescription withSequentialRampNumber(BigInteger value) {
        setSequentialRampNumber(value);
        return this;
    }

    public SupplementaryPositionalDescription withSupplementaryPositionalDescriptionExtension(ExtensionType value) {
        setSupplementaryPositionalDescriptionExtension(value);
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

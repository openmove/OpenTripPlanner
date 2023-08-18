//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per CarParks complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CarParks"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}NonRoadEventInformation"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="carParkConfiguration" type="{http://datex2.eu/schema/2_0RC1/2_0}CarParkConfigurationEnum" minOccurs="0"/&gt;
 *         &lt;element name="carParkIdentity" type="{http://datex2.eu/schema/2_0RC1/2_0}String"/&gt;
 *         &lt;element name="carParkOccupancy" type="{http://datex2.eu/schema/2_0RC1/2_0}Percentage" minOccurs="0"/&gt;
 *         &lt;element name="carParkStatus" type="{http://datex2.eu/schema/2_0RC1/2_0}CarParkStatusEnum" minOccurs="0"/&gt;
 *         &lt;element name="exitRate" type="{http://datex2.eu/schema/2_0RC1/2_0}VehiclesPerHour" minOccurs="0"/&gt;
 *         &lt;element name="fillRate" type="{http://datex2.eu/schema/2_0RC1/2_0}VehiclesPerHour" minOccurs="0"/&gt;
 *         &lt;element name="numberOfVacantParkingSpaces" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="occupiedSpaces" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="queuingTime" type="{http://datex2.eu/schema/2_0RC1/2_0}Seconds" minOccurs="0"/&gt;
 *         &lt;element name="totalCapacity" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="carParksExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarParks", propOrder = {
    "carParkConfiguration",
    "carParkIdentity",
    "carParkOccupancy",
    "carParkStatus",
    "exitRate",
    "fillRate",
    "numberOfVacantParkingSpaces",
    "occupiedSpaces",
    "queuingTime",
    "totalCapacity",
    "carParksExtension"
})
public class CarParks
    extends NonRoadEventInformation
{

    @XmlSchemaType(name = "string")
    protected CarParkConfigurationEnum carParkConfiguration;
    @XmlElement(required = true)
    protected String carParkIdentity;
    protected Float carParkOccupancy;
    @XmlSchemaType(name = "string")
    protected CarParkStatusEnum carParkStatus;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger exitRate;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger fillRate;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfVacantParkingSpaces;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger occupiedSpaces;
    protected Float queuingTime;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger totalCapacity;
    protected ExtensionType carParksExtension;

    /**
     * Recupera il valore della proprietà carParkConfiguration.
     * 
     * @return
     *     possible object is
     *     {@link CarParkConfigurationEnum }
     *     
     */
    public CarParkConfigurationEnum getCarParkConfiguration() {
        return carParkConfiguration;
    }

    /**
     * Imposta il valore della proprietà carParkConfiguration.
     * 
     * @param value
     *     allowed object is
     *     {@link CarParkConfigurationEnum }
     *     
     */
    public void setCarParkConfiguration(CarParkConfigurationEnum value) {
        this.carParkConfiguration = value;
    }

    /**
     * Recupera il valore della proprietà carParkIdentity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarParkIdentity() {
        return carParkIdentity;
    }

    /**
     * Imposta il valore della proprietà carParkIdentity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarParkIdentity(String value) {
        this.carParkIdentity = value;
    }

    /**
     * Recupera il valore della proprietà carParkOccupancy.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCarParkOccupancy() {
        return carParkOccupancy;
    }

    /**
     * Imposta il valore della proprietà carParkOccupancy.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCarParkOccupancy(Float value) {
        this.carParkOccupancy = value;
    }

    /**
     * Recupera il valore della proprietà carParkStatus.
     * 
     * @return
     *     possible object is
     *     {@link CarParkStatusEnum }
     *     
     */
    public CarParkStatusEnum getCarParkStatus() {
        return carParkStatus;
    }

    /**
     * Imposta il valore della proprietà carParkStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link CarParkStatusEnum }
     *     
     */
    public void setCarParkStatus(CarParkStatusEnum value) {
        this.carParkStatus = value;
    }

    /**
     * Recupera il valore della proprietà exitRate.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExitRate() {
        return exitRate;
    }

    /**
     * Imposta il valore della proprietà exitRate.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExitRate(BigInteger value) {
        this.exitRate = value;
    }

    /**
     * Recupera il valore della proprietà fillRate.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFillRate() {
        return fillRate;
    }

    /**
     * Imposta il valore della proprietà fillRate.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFillRate(BigInteger value) {
        this.fillRate = value;
    }

    /**
     * Recupera il valore della proprietà numberOfVacantParkingSpaces.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfVacantParkingSpaces() {
        return numberOfVacantParkingSpaces;
    }

    /**
     * Imposta il valore della proprietà numberOfVacantParkingSpaces.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfVacantParkingSpaces(BigInteger value) {
        this.numberOfVacantParkingSpaces = value;
    }

    /**
     * Recupera il valore della proprietà occupiedSpaces.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOccupiedSpaces() {
        return occupiedSpaces;
    }

    /**
     * Imposta il valore della proprietà occupiedSpaces.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOccupiedSpaces(BigInteger value) {
        this.occupiedSpaces = value;
    }

    /**
     * Recupera il valore della proprietà queuingTime.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getQueuingTime() {
        return queuingTime;
    }

    /**
     * Imposta il valore della proprietà queuingTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setQueuingTime(Float value) {
        this.queuingTime = value;
    }

    /**
     * Recupera il valore della proprietà totalCapacity.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalCapacity() {
        return totalCapacity;
    }

    /**
     * Imposta il valore della proprietà totalCapacity.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalCapacity(BigInteger value) {
        this.totalCapacity = value;
    }

    /**
     * Recupera il valore della proprietà carParksExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getCarParksExtension() {
        return carParksExtension;
    }

    /**
     * Imposta il valore della proprietà carParksExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setCarParksExtension(ExtensionType value) {
        this.carParksExtension = value;
    }

    public CarParks withCarParkConfiguration(CarParkConfigurationEnum value) {
        setCarParkConfiguration(value);
        return this;
    }

    public CarParks withCarParkIdentity(String value) {
        setCarParkIdentity(value);
        return this;
    }

    public CarParks withCarParkOccupancy(Float value) {
        setCarParkOccupancy(value);
        return this;
    }

    public CarParks withCarParkStatus(CarParkStatusEnum value) {
        setCarParkStatus(value);
        return this;
    }

    public CarParks withExitRate(BigInteger value) {
        setExitRate(value);
        return this;
    }

    public CarParks withFillRate(BigInteger value) {
        setFillRate(value);
        return this;
    }

    public CarParks withNumberOfVacantParkingSpaces(BigInteger value) {
        setNumberOfVacantParkingSpaces(value);
        return this;
    }

    public CarParks withOccupiedSpaces(BigInteger value) {
        setOccupiedSpaces(value);
        return this;
    }

    public CarParks withQueuingTime(Float value) {
        setQueuingTime(value);
        return this;
    }

    public CarParks withTotalCapacity(BigInteger value) {
        setTotalCapacity(value);
        return this;
    }

    public CarParks withCarParksExtension(ExtensionType value) {
        setCarParksExtension(value);
        return this;
    }

    @Override
    public CarParks withNonRoadEventInformationExtension(ExtensionType value) {
        setNonRoadEventInformationExtension(value);
        return this;
    }

    @Override
    public CarParks withSituationRecordCreationReference(String value) {
        setSituationRecordCreationReference(value);
        return this;
    }

    @Override
    public CarParks withSituationRecordCreationTime(LocalDateTime value) {
        setSituationRecordCreationTime(value);
        return this;
    }

    @Override
    public CarParks withSituationRecordObservationTime(LocalDateTime value) {
        setSituationRecordObservationTime(value);
        return this;
    }

    @Override
    public CarParks withSituationRecordVersion(BigInteger value) {
        setSituationRecordVersion(value);
        return this;
    }

    @Override
    public CarParks withSituationRecordVersionTime(LocalDateTime value) {
        setSituationRecordVersionTime(value);
        return this;
    }

    @Override
    public CarParks withSituationRecordFirstSupplierVersionTime(LocalDateTime value) {
        setSituationRecordFirstSupplierVersionTime(value);
        return this;
    }

    @Override
    public CarParks withConfidentialityOverride(ConfidentialityValueEnum value) {
        setConfidentialityOverride(value);
        return this;
    }

    @Override
    public CarParks withProbabilityOfOccurrence(ProbabilityOfOccurrenceEnum value) {
        setProbabilityOfOccurrence(value);
        return this;
    }

    @Override
    public CarParks withSource(Source value) {
        setSource(value);
        return this;
    }

    @Override
    public CarParks withValidity(Validity value) {
        setValidity(value);
        return this;
    }

    @Override
    public CarParks withImpact(Impact value) {
        setImpact(value);
        return this;
    }

    @Override
    public CarParks withCause(Cause value) {
        setCause(value);
        return this;
    }

    @Override
    public CarParks withGeneralPublicComment(Comment... values) {
        if (values!= null) {
            for (Comment value: values) {
                getGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public CarParks withGeneralPublicComment(Collection<Comment> values) {
        if (values!= null) {
            getGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public CarParks withNonGeneralPublicComment(Comment... values) {
        if (values!= null) {
            for (Comment value: values) {
                getNonGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public CarParks withNonGeneralPublicComment(Collection<Comment> values) {
        if (values!= null) {
            getNonGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public CarParks withUrlLink(UrlLink... values) {
        if (values!= null) {
            for (UrlLink value: values) {
                getUrlLink().add(value);
            }
        }
        return this;
    }

    @Override
    public CarParks withUrlLink(Collection<UrlLink> values) {
        if (values!= null) {
            getUrlLink().addAll(values);
        }
        return this;
    }

    @Override
    public CarParks withGroupOfLocations(GroupOfLocations value) {
        setGroupOfLocations(value);
        return this;
    }

    @Override
    public CarParks withManagement(Management value) {
        setManagement(value);
        return this;
    }

    @Override
    public CarParks withSituationRecordExtension(ExtensionType value) {
        setSituationRecordExtension(value);
        return this;
    }

    @Override
    public CarParks withId(String value) {
        setId(value);
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

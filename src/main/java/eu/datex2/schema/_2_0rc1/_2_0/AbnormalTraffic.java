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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per AbnormalTraffic complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AbnormalTraffic"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}TrafficElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="abnormalTrafficType" type="{http://datex2.eu/schema/2_0RC1/2_0}AbnormalTrafficTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="numberOfVehiclesWaiting" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="queueLength" type="{http://datex2.eu/schema/2_0RC1/2_0}MetresAsNonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="relativeTrafficFlow" type="{http://datex2.eu/schema/2_0RC1/2_0}RelativeTrafficFlowEnum" minOccurs="0"/&gt;
 *         &lt;element name="trafficFlowCharacteristics" type="{http://datex2.eu/schema/2_0RC1/2_0}TrafficFlowCharacteristicsEnum" minOccurs="0"/&gt;
 *         &lt;element name="trafficTrendType" type="{http://datex2.eu/schema/2_0RC1/2_0}TrafficTrendTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="abnormalTrafficExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbnormalTraffic", propOrder = {
    "abnormalTrafficType",
    "numberOfVehiclesWaiting",
    "queueLength",
    "relativeTrafficFlow",
    "trafficFlowCharacteristics",
    "trafficTrendType",
    "abnormalTrafficExtension"
})
public class AbnormalTraffic
    extends TrafficElement
{

    @XmlSchemaType(name = "string")
    protected AbnormalTrafficTypeEnum abnormalTrafficType;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfVehiclesWaiting;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger queueLength;
    @XmlSchemaType(name = "string")
    protected RelativeTrafficFlowEnum relativeTrafficFlow;
    @XmlSchemaType(name = "string")
    protected TrafficFlowCharacteristicsEnum trafficFlowCharacteristics;
    @XmlSchemaType(name = "string")
    protected TrafficTrendTypeEnum trafficTrendType;
    protected ExtensionType abnormalTrafficExtension;

    /**
     * Recupera il valore della proprietà abnormalTrafficType.
     * 
     * @return
     *     possible object is
     *     {@link AbnormalTrafficTypeEnum }
     *     
     */
    public AbnormalTrafficTypeEnum getAbnormalTrafficType() {
        return abnormalTrafficType;
    }

    /**
     * Imposta il valore della proprietà abnormalTrafficType.
     * 
     * @param value
     *     allowed object is
     *     {@link AbnormalTrafficTypeEnum }
     *     
     */
    public void setAbnormalTrafficType(AbnormalTrafficTypeEnum value) {
        this.abnormalTrafficType = value;
    }

    /**
     * Recupera il valore della proprietà numberOfVehiclesWaiting.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfVehiclesWaiting() {
        return numberOfVehiclesWaiting;
    }

    /**
     * Imposta il valore della proprietà numberOfVehiclesWaiting.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfVehiclesWaiting(BigInteger value) {
        this.numberOfVehiclesWaiting = value;
    }

    /**
     * Recupera il valore della proprietà queueLength.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQueueLength() {
        return queueLength;
    }

    /**
     * Imposta il valore della proprietà queueLength.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQueueLength(BigInteger value) {
        this.queueLength = value;
    }

    /**
     * Recupera il valore della proprietà relativeTrafficFlow.
     * 
     * @return
     *     possible object is
     *     {@link RelativeTrafficFlowEnum }
     *     
     */
    public RelativeTrafficFlowEnum getRelativeTrafficFlow() {
        return relativeTrafficFlow;
    }

    /**
     * Imposta il valore della proprietà relativeTrafficFlow.
     * 
     * @param value
     *     allowed object is
     *     {@link RelativeTrafficFlowEnum }
     *     
     */
    public void setRelativeTrafficFlow(RelativeTrafficFlowEnum value) {
        this.relativeTrafficFlow = value;
    }

    /**
     * Recupera il valore della proprietà trafficFlowCharacteristics.
     * 
     * @return
     *     possible object is
     *     {@link TrafficFlowCharacteristicsEnum }
     *     
     */
    public TrafficFlowCharacteristicsEnum getTrafficFlowCharacteristics() {
        return trafficFlowCharacteristics;
    }

    /**
     * Imposta il valore della proprietà trafficFlowCharacteristics.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficFlowCharacteristicsEnum }
     *     
     */
    public void setTrafficFlowCharacteristics(TrafficFlowCharacteristicsEnum value) {
        this.trafficFlowCharacteristics = value;
    }

    /**
     * Recupera il valore della proprietà trafficTrendType.
     * 
     * @return
     *     possible object is
     *     {@link TrafficTrendTypeEnum }
     *     
     */
    public TrafficTrendTypeEnum getTrafficTrendType() {
        return trafficTrendType;
    }

    /**
     * Imposta il valore della proprietà trafficTrendType.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficTrendTypeEnum }
     *     
     */
    public void setTrafficTrendType(TrafficTrendTypeEnum value) {
        this.trafficTrendType = value;
    }

    /**
     * Recupera il valore della proprietà abnormalTrafficExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getAbnormalTrafficExtension() {
        return abnormalTrafficExtension;
    }

    /**
     * Imposta il valore della proprietà abnormalTrafficExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setAbnormalTrafficExtension(ExtensionType value) {
        this.abnormalTrafficExtension = value;
    }

    public AbnormalTraffic withAbnormalTrafficType(AbnormalTrafficTypeEnum value) {
        setAbnormalTrafficType(value);
        return this;
    }

    public AbnormalTraffic withNumberOfVehiclesWaiting(BigInteger value) {
        setNumberOfVehiclesWaiting(value);
        return this;
    }

    public AbnormalTraffic withQueueLength(BigInteger value) {
        setQueueLength(value);
        return this;
    }

    public AbnormalTraffic withRelativeTrafficFlow(RelativeTrafficFlowEnum value) {
        setRelativeTrafficFlow(value);
        return this;
    }

    public AbnormalTraffic withTrafficFlowCharacteristics(TrafficFlowCharacteristicsEnum value) {
        setTrafficFlowCharacteristics(value);
        return this;
    }

    public AbnormalTraffic withTrafficTrendType(TrafficTrendTypeEnum value) {
        setTrafficTrendType(value);
        return this;
    }

    public AbnormalTraffic withAbnormalTrafficExtension(ExtensionType value) {
        setAbnormalTrafficExtension(value);
        return this;
    }

    @Override
    public AbnormalTraffic withTrafficElementExtension(ExtensionType value) {
        setTrafficElementExtension(value);
        return this;
    }

    @Override
    public AbnormalTraffic withSituationRecordCreationReference(String value) {
        setSituationRecordCreationReference(value);
        return this;
    }

    @Override
    public AbnormalTraffic withSituationRecordCreationTime(LocalDateTime value) {
        setSituationRecordCreationTime(value);
        return this;
    }

    @Override
    public AbnormalTraffic withSituationRecordObservationTime(LocalDateTime value) {
        setSituationRecordObservationTime(value);
        return this;
    }

    @Override
    public AbnormalTraffic withSituationRecordVersion(BigInteger value) {
        setSituationRecordVersion(value);
        return this;
    }

    @Override
    public AbnormalTraffic withSituationRecordVersionTime(LocalDateTime value) {
        setSituationRecordVersionTime(value);
        return this;
    }

    @Override
    public AbnormalTraffic withSituationRecordFirstSupplierVersionTime(LocalDateTime value) {
        setSituationRecordFirstSupplierVersionTime(value);
        return this;
    }

    @Override
    public AbnormalTraffic withConfidentialityOverride(ConfidentialityValueEnum value) {
        setConfidentialityOverride(value);
        return this;
    }

    @Override
    public AbnormalTraffic withProbabilityOfOccurrence(ProbabilityOfOccurrenceEnum value) {
        setProbabilityOfOccurrence(value);
        return this;
    }

    @Override
    public AbnormalTraffic withSource(Source value) {
        setSource(value);
        return this;
    }

    @Override
    public AbnormalTraffic withValidity(Validity value) {
        setValidity(value);
        return this;
    }

    @Override
    public AbnormalTraffic withImpact(Impact value) {
        setImpact(value);
        return this;
    }

    @Override
    public AbnormalTraffic withCause(Cause value) {
        setCause(value);
        return this;
    }

    @Override
    public AbnormalTraffic withGeneralPublicComment(Comment... values) {
        if (values!= null) {
            for (Comment value: values) {
                getGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public AbnormalTraffic withGeneralPublicComment(Collection<Comment> values) {
        if (values!= null) {
            getGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public AbnormalTraffic withNonGeneralPublicComment(Comment... values) {
        if (values!= null) {
            for (Comment value: values) {
                getNonGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public AbnormalTraffic withNonGeneralPublicComment(Collection<Comment> values) {
        if (values!= null) {
            getNonGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public AbnormalTraffic withUrlLink(UrlLink... values) {
        if (values!= null) {
            for (UrlLink value: values) {
                getUrlLink().add(value);
            }
        }
        return this;
    }

    @Override
    public AbnormalTraffic withUrlLink(Collection<UrlLink> values) {
        if (values!= null) {
            getUrlLink().addAll(values);
        }
        return this;
    }

    @Override
    public AbnormalTraffic withGroupOfLocations(GroupOfLocations value) {
        setGroupOfLocations(value);
        return this;
    }

    @Override
    public AbnormalTraffic withManagement(Management value) {
        setManagement(value);
        return this;
    }

    @Override
    public AbnormalTraffic withSituationRecordExtension(ExtensionType value) {
        setSituationRecordExtension(value);
        return this;
    }

    @Override
    public AbnormalTraffic withId(String value) {
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

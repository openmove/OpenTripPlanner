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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per Conditions complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Conditions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}TrafficElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="drivingConditionType" type="{http://datex2.eu/schema/2_0RC1/2_0}DrivingConditionTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="conditionsExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Conditions", propOrder = {
    "drivingConditionType",
    "conditionsExtension"
})
@XmlSeeAlso({
    PoorEnvironmentConditions.class,
    RoadConditions.class
})
public class Conditions
    extends TrafficElement
{

    @XmlSchemaType(name = "string")
    protected DrivingConditionTypeEnum drivingConditionType;
    protected ExtensionType conditionsExtension;

    /**
     * Recupera il valore della proprietà drivingConditionType.
     * 
     * @return
     *     possible object is
     *     {@link DrivingConditionTypeEnum }
     *     
     */
    public DrivingConditionTypeEnum getDrivingConditionType() {
        return drivingConditionType;
    }

    /**
     * Imposta il valore della proprietà drivingConditionType.
     * 
     * @param value
     *     allowed object is
     *     {@link DrivingConditionTypeEnum }
     *     
     */
    public void setDrivingConditionType(DrivingConditionTypeEnum value) {
        this.drivingConditionType = value;
    }

    /**
     * Recupera il valore della proprietà conditionsExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getConditionsExtension() {
        return conditionsExtension;
    }

    /**
     * Imposta il valore della proprietà conditionsExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setConditionsExtension(ExtensionType value) {
        this.conditionsExtension = value;
    }

    public Conditions withDrivingConditionType(DrivingConditionTypeEnum value) {
        setDrivingConditionType(value);
        return this;
    }

    public Conditions withConditionsExtension(ExtensionType value) {
        setConditionsExtension(value);
        return this;
    }

    @Override
    public Conditions withTrafficElementExtension(ExtensionType value) {
        setTrafficElementExtension(value);
        return this;
    }

    @Override
    public Conditions withSituationRecordCreationReference(String value) {
        setSituationRecordCreationReference(value);
        return this;
    }

    @Override
    public Conditions withSituationRecordCreationTime(LocalDateTime value) {
        setSituationRecordCreationTime(value);
        return this;
    }

    @Override
    public Conditions withSituationRecordObservationTime(LocalDateTime value) {
        setSituationRecordObservationTime(value);
        return this;
    }

    @Override
    public Conditions withSituationRecordVersion(BigInteger value) {
        setSituationRecordVersion(value);
        return this;
    }

    @Override
    public Conditions withSituationRecordVersionTime(LocalDateTime value) {
        setSituationRecordVersionTime(value);
        return this;
    }

    @Override
    public Conditions withSituationRecordFirstSupplierVersionTime(LocalDateTime value) {
        setSituationRecordFirstSupplierVersionTime(value);
        return this;
    }

    @Override
    public Conditions withConfidentialityOverride(ConfidentialityValueEnum value) {
        setConfidentialityOverride(value);
        return this;
    }

    @Override
    public Conditions withProbabilityOfOccurrence(ProbabilityOfOccurrenceEnum value) {
        setProbabilityOfOccurrence(value);
        return this;
    }

    @Override
    public Conditions withSource(Source value) {
        setSource(value);
        return this;
    }

    @Override
    public Conditions withValidity(Validity value) {
        setValidity(value);
        return this;
    }

    @Override
    public Conditions withImpact(Impact value) {
        setImpact(value);
        return this;
    }

    @Override
    public Conditions withCause(Cause value) {
        setCause(value);
        return this;
    }

    @Override
    public Conditions withGeneralPublicComment(Comment... values) {
        if (values!= null) {
            for (Comment value: values) {
                getGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public Conditions withGeneralPublicComment(Collection<Comment> values) {
        if (values!= null) {
            getGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public Conditions withNonGeneralPublicComment(Comment... values) {
        if (values!= null) {
            for (Comment value: values) {
                getNonGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public Conditions withNonGeneralPublicComment(Collection<Comment> values) {
        if (values!= null) {
            getNonGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public Conditions withUrlLink(UrlLink... values) {
        if (values!= null) {
            for (UrlLink value: values) {
                getUrlLink().add(value);
            }
        }
        return this;
    }

    @Override
    public Conditions withUrlLink(Collection<UrlLink> values) {
        if (values!= null) {
            getUrlLink().addAll(values);
        }
        return this;
    }

    @Override
    public Conditions withGroupOfLocations(GroupOfLocations value) {
        setGroupOfLocations(value);
        return this;
    }

    @Override
    public Conditions withManagement(Management value) {
        setManagement(value);
        return this;
    }

    @Override
    public Conditions withSituationRecordExtension(ExtensionType value) {
        setSituationRecordExtension(value);
        return this;
    }

    @Override
    public Conditions withId(String value) {
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

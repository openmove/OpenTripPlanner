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
 * <p>Classe Java per OperatorAction complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="OperatorAction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}SituationRecord"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="actionOrigin" type="{http://datex2.eu/schema/2_0RC1/2_0}OperatorActionOriginEnum" minOccurs="0"/&gt;
 *         &lt;element name="operatorActionStatus" type="{http://datex2.eu/schema/2_0RC1/2_0}OperatorActionStatusEnum" minOccurs="0"/&gt;
 *         &lt;element name="operatorActionExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperatorAction", propOrder = {
    "actionOrigin",
    "operatorActionStatus",
    "operatorActionExtension"
})
@XmlSeeAlso({
    RoadsideAssistance.class,
    Roadworks.class,
    SignSetting.class,
    NetworkManagement.class
})
public abstract class OperatorAction
    extends SituationRecord
{

    @XmlSchemaType(name = "string")
    protected OperatorActionOriginEnum actionOrigin;
    @XmlSchemaType(name = "string")
    protected OperatorActionStatusEnum operatorActionStatus;
    protected ExtensionType operatorActionExtension;

    /**
     * Recupera il valore della proprietà actionOrigin.
     * 
     * @return
     *     possible object is
     *     {@link OperatorActionOriginEnum }
     *     
     */
    public OperatorActionOriginEnum getActionOrigin() {
        return actionOrigin;
    }

    /**
     * Imposta il valore della proprietà actionOrigin.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorActionOriginEnum }
     *     
     */
    public void setActionOrigin(OperatorActionOriginEnum value) {
        this.actionOrigin = value;
    }

    /**
     * Recupera il valore della proprietà operatorActionStatus.
     * 
     * @return
     *     possible object is
     *     {@link OperatorActionStatusEnum }
     *     
     */
    public OperatorActionStatusEnum getOperatorActionStatus() {
        return operatorActionStatus;
    }

    /**
     * Imposta il valore della proprietà operatorActionStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorActionStatusEnum }
     *     
     */
    public void setOperatorActionStatus(OperatorActionStatusEnum value) {
        this.operatorActionStatus = value;
    }

    /**
     * Recupera il valore della proprietà operatorActionExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getOperatorActionExtension() {
        return operatorActionExtension;
    }

    /**
     * Imposta il valore della proprietà operatorActionExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setOperatorActionExtension(ExtensionType value) {
        this.operatorActionExtension = value;
    }

    public OperatorAction withActionOrigin(OperatorActionOriginEnum value) {
        setActionOrigin(value);
        return this;
    }

    public OperatorAction withOperatorActionStatus(OperatorActionStatusEnum value) {
        setOperatorActionStatus(value);
        return this;
    }

    public OperatorAction withOperatorActionExtension(ExtensionType value) {
        setOperatorActionExtension(value);
        return this;
    }

    @Override
    public OperatorAction withSituationRecordCreationReference(String value) {
        setSituationRecordCreationReference(value);
        return this;
    }

    @Override
    public OperatorAction withSituationRecordCreationTime(LocalDateTime value) {
        setSituationRecordCreationTime(value);
        return this;
    }

    @Override
    public OperatorAction withSituationRecordObservationTime(LocalDateTime value) {
        setSituationRecordObservationTime(value);
        return this;
    }

    @Override
    public OperatorAction withSituationRecordVersion(BigInteger value) {
        setSituationRecordVersion(value);
        return this;
    }

    @Override
    public OperatorAction withSituationRecordVersionTime(LocalDateTime value) {
        setSituationRecordVersionTime(value);
        return this;
    }

    @Override
    public OperatorAction withSituationRecordFirstSupplierVersionTime(LocalDateTime value) {
        setSituationRecordFirstSupplierVersionTime(value);
        return this;
    }

    @Override
    public OperatorAction withConfidentialityOverride(ConfidentialityValueEnum value) {
        setConfidentialityOverride(value);
        return this;
    }

    @Override
    public OperatorAction withProbabilityOfOccurrence(ProbabilityOfOccurrenceEnum value) {
        setProbabilityOfOccurrence(value);
        return this;
    }

    @Override
    public OperatorAction withSource(Source value) {
        setSource(value);
        return this;
    }

    @Override
    public OperatorAction withValidity(Validity value) {
        setValidity(value);
        return this;
    }

    @Override
    public OperatorAction withImpact(Impact value) {
        setImpact(value);
        return this;
    }

    @Override
    public OperatorAction withCause(Cause value) {
        setCause(value);
        return this;
    }

    @Override
    public OperatorAction withGeneralPublicComment(Comment... values) {
        if (values!= null) {
            for (Comment value: values) {
                getGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public OperatorAction withGeneralPublicComment(Collection<Comment> values) {
        if (values!= null) {
            getGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public OperatorAction withNonGeneralPublicComment(Comment... values) {
        if (values!= null) {
            for (Comment value: values) {
                getNonGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public OperatorAction withNonGeneralPublicComment(Collection<Comment> values) {
        if (values!= null) {
            getNonGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public OperatorAction withUrlLink(UrlLink... values) {
        if (values!= null) {
            for (UrlLink value: values) {
                getUrlLink().add(value);
            }
        }
        return this;
    }

    @Override
    public OperatorAction withUrlLink(Collection<UrlLink> values) {
        if (values!= null) {
            getUrlLink().addAll(values);
        }
        return this;
    }

    @Override
    public OperatorAction withGroupOfLocations(GroupOfLocations value) {
        setGroupOfLocations(value);
        return this;
    }

    @Override
    public OperatorAction withManagement(Management value) {
        setManagement(value);
        return this;
    }

    @Override
    public OperatorAction withSituationRecordExtension(ExtensionType value) {
        setSituationRecordExtension(value);
        return this;
    }

    @Override
    public OperatorAction withId(String value) {
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

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
 * <p>Classe Java per InfrastructureDamageObstruction complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="InfrastructureDamageObstruction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}Obstruction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="infrastructureDamageType" type="{http://datex2.eu/schema/2_0RC1/2_0}InfrastructureDamageTypeEnum"/&gt;
 *         &lt;element name="infrastructureDamageObstructionExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfrastructureDamageObstruction", propOrder = {
    "infrastructureDamageType",
    "infrastructureDamageObstructionExtension"
})
public class InfrastructureDamageObstruction
    extends Obstruction
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected InfrastructureDamageTypeEnum infrastructureDamageType;
    protected ExtensionType infrastructureDamageObstructionExtension;

    /**
     * Recupera il valore della proprietà infrastructureDamageType.
     * 
     * @return
     *     possible object is
     *     {@link InfrastructureDamageTypeEnum }
     *     
     */
    public InfrastructureDamageTypeEnum getInfrastructureDamageType() {
        return infrastructureDamageType;
    }

    /**
     * Imposta il valore della proprietà infrastructureDamageType.
     * 
     * @param value
     *     allowed object is
     *     {@link InfrastructureDamageTypeEnum }
     *     
     */
    public void setInfrastructureDamageType(InfrastructureDamageTypeEnum value) {
        this.infrastructureDamageType = value;
    }

    /**
     * Recupera il valore della proprietà infrastructureDamageObstructionExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getInfrastructureDamageObstructionExtension() {
        return infrastructureDamageObstructionExtension;
    }

    /**
     * Imposta il valore della proprietà infrastructureDamageObstructionExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setInfrastructureDamageObstructionExtension(ExtensionType value) {
        this.infrastructureDamageObstructionExtension = value;
    }

    public InfrastructureDamageObstruction withInfrastructureDamageType(InfrastructureDamageTypeEnum value) {
        setInfrastructureDamageType(value);
        return this;
    }

    public InfrastructureDamageObstruction withInfrastructureDamageObstructionExtension(ExtensionType value) {
        setInfrastructureDamageObstructionExtension(value);
        return this;
    }

    @Override
    public InfrastructureDamageObstruction withNumberOfObstructions(BigInteger value) {
        setNumberOfObstructions(value);
        return this;
    }

    @Override
    public InfrastructureDamageObstruction withMobilityOfObstruction(Mobility value) {
        setMobilityOfObstruction(value);
        return this;
    }

    @Override
    public InfrastructureDamageObstruction withObstructionExtension(ExtensionType value) {
        setObstructionExtension(value);
        return this;
    }

    @Override
    public InfrastructureDamageObstruction withTrafficElementExtension(ExtensionType value) {
        setTrafficElementExtension(value);
        return this;
    }

    @Override
    public InfrastructureDamageObstruction withSituationRecordCreationReference(String value) {
        setSituationRecordCreationReference(value);
        return this;
    }

    @Override
    public InfrastructureDamageObstruction withSituationRecordCreationTime(LocalDateTime value) {
        setSituationRecordCreationTime(value);
        return this;
    }

    @Override
    public InfrastructureDamageObstruction withSituationRecordObservationTime(LocalDateTime value) {
        setSituationRecordObservationTime(value);
        return this;
    }

    @Override
    public InfrastructureDamageObstruction withSituationRecordVersion(BigInteger value) {
        setSituationRecordVersion(value);
        return this;
    }

    @Override
    public InfrastructureDamageObstruction withSituationRecordVersionTime(LocalDateTime value) {
        setSituationRecordVersionTime(value);
        return this;
    }

    @Override
    public InfrastructureDamageObstruction withSituationRecordFirstSupplierVersionTime(LocalDateTime value) {
        setSituationRecordFirstSupplierVersionTime(value);
        return this;
    }

    @Override
    public InfrastructureDamageObstruction withConfidentialityOverride(ConfidentialityValueEnum value) {
        setConfidentialityOverride(value);
        return this;
    }

    @Override
    public InfrastructureDamageObstruction withProbabilityOfOccurrence(ProbabilityOfOccurrenceEnum value) {
        setProbabilityOfOccurrence(value);
        return this;
    }

    @Override
    public InfrastructureDamageObstruction withSource(Source value) {
        setSource(value);
        return this;
    }

    @Override
    public InfrastructureDamageObstruction withValidity(Validity value) {
        setValidity(value);
        return this;
    }

    @Override
    public InfrastructureDamageObstruction withImpact(Impact value) {
        setImpact(value);
        return this;
    }

    @Override
    public InfrastructureDamageObstruction withCause(Cause value) {
        setCause(value);
        return this;
    }

    @Override
    public InfrastructureDamageObstruction withGeneralPublicComment(Comment... values) {
        if (values!= null) {
            for (Comment value: values) {
                getGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public InfrastructureDamageObstruction withGeneralPublicComment(Collection<Comment> values) {
        if (values!= null) {
            getGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public InfrastructureDamageObstruction withNonGeneralPublicComment(Comment... values) {
        if (values!= null) {
            for (Comment value: values) {
                getNonGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public InfrastructureDamageObstruction withNonGeneralPublicComment(Collection<Comment> values) {
        if (values!= null) {
            getNonGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public InfrastructureDamageObstruction withUrlLink(UrlLink... values) {
        if (values!= null) {
            for (UrlLink value: values) {
                getUrlLink().add(value);
            }
        }
        return this;
    }

    @Override
    public InfrastructureDamageObstruction withUrlLink(Collection<UrlLink> values) {
        if (values!= null) {
            getUrlLink().addAll(values);
        }
        return this;
    }

    @Override
    public InfrastructureDamageObstruction withGroupOfLocations(GroupOfLocations value) {
        setGroupOfLocations(value);
        return this;
    }

    @Override
    public InfrastructureDamageObstruction withManagement(Management value) {
        setManagement(value);
        return this;
    }

    @Override
    public InfrastructureDamageObstruction withSituationRecordExtension(ExtensionType value) {
        setSituationRecordExtension(value);
        return this;
    }

    @Override
    public InfrastructureDamageObstruction withId(String value) {
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

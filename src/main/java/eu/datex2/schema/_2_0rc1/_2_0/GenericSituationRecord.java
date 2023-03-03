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
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per GenericSituationRecord complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="GenericSituationRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}SituationRecord"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="genericSituationRecordName" type="{http://datex2.eu/schema/2_0RC1/2_0}String"/&gt;
 *         &lt;element name="genericSituationRecordExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericSituationRecord", propOrder = {
    "genericSituationRecordName",
    "genericSituationRecordExtension"
})
public abstract class GenericSituationRecord
    extends SituationRecord
{

    @XmlElement(required = true)
    protected String genericSituationRecordName;
    protected ExtensionType genericSituationRecordExtension;

    /**
     * Recupera il valore della proprietà genericSituationRecordName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenericSituationRecordName() {
        return genericSituationRecordName;
    }

    /**
     * Imposta il valore della proprietà genericSituationRecordName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenericSituationRecordName(String value) {
        this.genericSituationRecordName = value;
    }

    /**
     * Recupera il valore della proprietà genericSituationRecordExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getGenericSituationRecordExtension() {
        return genericSituationRecordExtension;
    }

    /**
     * Imposta il valore della proprietà genericSituationRecordExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setGenericSituationRecordExtension(ExtensionType value) {
        this.genericSituationRecordExtension = value;
    }

    public GenericSituationRecord withGenericSituationRecordName(String value) {
        setGenericSituationRecordName(value);
        return this;
    }

    public GenericSituationRecord withGenericSituationRecordExtension(ExtensionType value) {
        setGenericSituationRecordExtension(value);
        return this;
    }

    @Override
    public GenericSituationRecord withSituationRecordCreationReference(String value) {
        setSituationRecordCreationReference(value);
        return this;
    }

    @Override
    public GenericSituationRecord withSituationRecordCreationTime(LocalDateTime value) {
        setSituationRecordCreationTime(value);
        return this;
    }

    @Override
    public GenericSituationRecord withSituationRecordObservationTime(LocalDateTime value) {
        setSituationRecordObservationTime(value);
        return this;
    }

    @Override
    public GenericSituationRecord withSituationRecordVersion(BigInteger value) {
        setSituationRecordVersion(value);
        return this;
    }

    @Override
    public GenericSituationRecord withSituationRecordVersionTime(LocalDateTime value) {
        setSituationRecordVersionTime(value);
        return this;
    }

    @Override
    public GenericSituationRecord withSituationRecordFirstSupplierVersionTime(LocalDateTime value) {
        setSituationRecordFirstSupplierVersionTime(value);
        return this;
    }

    @Override
    public GenericSituationRecord withConfidentialityOverride(ConfidentialityValueEnum value) {
        setConfidentialityOverride(value);
        return this;
    }

    @Override
    public GenericSituationRecord withProbabilityOfOccurrence(ProbabilityOfOccurrenceEnum value) {
        setProbabilityOfOccurrence(value);
        return this;
    }

    @Override
    public GenericSituationRecord withSource(Source value) {
        setSource(value);
        return this;
    }

    @Override
    public GenericSituationRecord withValidity(Validity value) {
        setValidity(value);
        return this;
    }

    @Override
    public GenericSituationRecord withImpact(Impact value) {
        setImpact(value);
        return this;
    }

    @Override
    public GenericSituationRecord withCause(Cause value) {
        setCause(value);
        return this;
    }

    @Override
    public GenericSituationRecord withGeneralPublicComment(Comment... values) {
        if (values!= null) {
            for (Comment value: values) {
                getGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public GenericSituationRecord withGeneralPublicComment(Collection<Comment> values) {
        if (values!= null) {
            getGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public GenericSituationRecord withNonGeneralPublicComment(Comment... values) {
        if (values!= null) {
            for (Comment value: values) {
                getNonGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public GenericSituationRecord withNonGeneralPublicComment(Collection<Comment> values) {
        if (values!= null) {
            getNonGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public GenericSituationRecord withUrlLink(UrlLink... values) {
        if (values!= null) {
            for (UrlLink value: values) {
                getUrlLink().add(value);
            }
        }
        return this;
    }

    @Override
    public GenericSituationRecord withUrlLink(Collection<UrlLink> values) {
        if (values!= null) {
            getUrlLink().addAll(values);
        }
        return this;
    }

    @Override
    public GenericSituationRecord withGroupOfLocations(GroupOfLocations value) {
        setGroupOfLocations(value);
        return this;
    }

    @Override
    public GenericSituationRecord withManagement(Management value) {
        setManagement(value);
        return this;
    }

    @Override
    public GenericSituationRecord withSituationRecordExtension(ExtensionType value) {
        setSituationRecordExtension(value);
        return this;
    }

    @Override
    public GenericSituationRecord withId(String value) {
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

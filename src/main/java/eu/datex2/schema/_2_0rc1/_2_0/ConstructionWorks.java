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
 * <p>Classe Java per ConstructionWorks complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ConstructionWorks"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}Roadworks"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="constructionWorkType" type="{http://datex2.eu/schema/2_0RC1/2_0}ConstructionWorkTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="constructionWorksExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConstructionWorks", propOrder = {
    "constructionWorkType",
    "constructionWorksExtension"
})
public class ConstructionWorks
    extends Roadworks
{

    @XmlSchemaType(name = "string")
    protected ConstructionWorkTypeEnum constructionWorkType;
    protected ExtensionType constructionWorksExtension;

    /**
     * Recupera il valore della proprietà constructionWorkType.
     * 
     * @return
     *     possible object is
     *     {@link ConstructionWorkTypeEnum }
     *     
     */
    public ConstructionWorkTypeEnum getConstructionWorkType() {
        return constructionWorkType;
    }

    /**
     * Imposta il valore della proprietà constructionWorkType.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstructionWorkTypeEnum }
     *     
     */
    public void setConstructionWorkType(ConstructionWorkTypeEnum value) {
        this.constructionWorkType = value;
    }

    /**
     * Recupera il valore della proprietà constructionWorksExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getConstructionWorksExtension() {
        return constructionWorksExtension;
    }

    /**
     * Imposta il valore della proprietà constructionWorksExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setConstructionWorksExtension(ExtensionType value) {
        this.constructionWorksExtension = value;
    }

    public ConstructionWorks withConstructionWorkType(ConstructionWorkTypeEnum value) {
        setConstructionWorkType(value);
        return this;
    }

    public ConstructionWorks withConstructionWorksExtension(ExtensionType value) {
        setConstructionWorksExtension(value);
        return this;
    }

    @Override
    public ConstructionWorks withRoadworksDuration(RoadworksDurationEnum value) {
        setRoadworksDuration(value);
        return this;
    }

    @Override
    public ConstructionWorks withRoadworksScale(RoadworksScaleEnum value) {
        setRoadworksScale(value);
        return this;
    }

    @Override
    public ConstructionWorks withUnderTraffic(Boolean value) {
        setUnderTraffic(value);
        return this;
    }

    @Override
    public ConstructionWorks withUrgentRoadworks(Boolean value) {
        setUrgentRoadworks(value);
        return this;
    }

    @Override
    public ConstructionWorks withMobility(Mobility value) {
        setMobility(value);
        return this;
    }

    @Override
    public ConstructionWorks withSubjects(Subjects value) {
        setSubjects(value);
        return this;
    }

    @Override
    public ConstructionWorks withMaintenanceVehicles(MaintenanceVehicles value) {
        setMaintenanceVehicles(value);
        return this;
    }

    @Override
    public ConstructionWorks withRoadworksExtension(ExtensionType value) {
        setRoadworksExtension(value);
        return this;
    }

    @Override
    public ConstructionWorks withActionOrigin(OperatorActionOriginEnum value) {
        setActionOrigin(value);
        return this;
    }

    @Override
    public ConstructionWorks withOperatorActionStatus(OperatorActionStatusEnum value) {
        setOperatorActionStatus(value);
        return this;
    }

    @Override
    public ConstructionWorks withOperatorActionExtension(ExtensionType value) {
        setOperatorActionExtension(value);
        return this;
    }

    @Override
    public ConstructionWorks withSituationRecordCreationReference(String value) {
        setSituationRecordCreationReference(value);
        return this;
    }

    @Override
    public ConstructionWorks withSituationRecordCreationTime(LocalDateTime value) {
        setSituationRecordCreationTime(value);
        return this;
    }

    @Override
    public ConstructionWorks withSituationRecordObservationTime(LocalDateTime value) {
        setSituationRecordObservationTime(value);
        return this;
    }

    @Override
    public ConstructionWorks withSituationRecordVersion(BigInteger value) {
        setSituationRecordVersion(value);
        return this;
    }

    @Override
    public ConstructionWorks withSituationRecordVersionTime(LocalDateTime value) {
        setSituationRecordVersionTime(value);
        return this;
    }

    @Override
    public ConstructionWorks withSituationRecordFirstSupplierVersionTime(LocalDateTime value) {
        setSituationRecordFirstSupplierVersionTime(value);
        return this;
    }

    @Override
    public ConstructionWorks withConfidentialityOverride(ConfidentialityValueEnum value) {
        setConfidentialityOverride(value);
        return this;
    }

    @Override
    public ConstructionWorks withProbabilityOfOccurrence(ProbabilityOfOccurrenceEnum value) {
        setProbabilityOfOccurrence(value);
        return this;
    }

    @Override
    public ConstructionWorks withSource(Source value) {
        setSource(value);
        return this;
    }

    @Override
    public ConstructionWorks withValidity(Validity value) {
        setValidity(value);
        return this;
    }

    @Override
    public ConstructionWorks withImpact(Impact value) {
        setImpact(value);
        return this;
    }

    @Override
    public ConstructionWorks withCause(Cause value) {
        setCause(value);
        return this;
    }

    @Override
    public ConstructionWorks withGeneralPublicComment(Comment... values) {
        if (values!= null) {
            for (Comment value: values) {
                getGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public ConstructionWorks withGeneralPublicComment(Collection<Comment> values) {
        if (values!= null) {
            getGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public ConstructionWorks withNonGeneralPublicComment(Comment... values) {
        if (values!= null) {
            for (Comment value: values) {
                getNonGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public ConstructionWorks withNonGeneralPublicComment(Collection<Comment> values) {
        if (values!= null) {
            getNonGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public ConstructionWorks withUrlLink(UrlLink... values) {
        if (values!= null) {
            for (UrlLink value: values) {
                getUrlLink().add(value);
            }
        }
        return this;
    }

    @Override
    public ConstructionWorks withUrlLink(Collection<UrlLink> values) {
        if (values!= null) {
            getUrlLink().addAll(values);
        }
        return this;
    }

    @Override
    public ConstructionWorks withGroupOfLocations(GroupOfLocations value) {
        setGroupOfLocations(value);
        return this;
    }

    @Override
    public ConstructionWorks withManagement(Management value) {
        setManagement(value);
        return this;
    }

    @Override
    public ConstructionWorks withSituationRecordExtension(ExtensionType value) {
        setSituationRecordExtension(value);
        return this;
    }

    @Override
    public ConstructionWorks withId(String value) {
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

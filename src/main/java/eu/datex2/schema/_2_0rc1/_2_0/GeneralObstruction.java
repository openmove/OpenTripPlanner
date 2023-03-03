//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import java.math.BigInteger;
import java.time.LocalDateTime;
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
 * <p>Classe Java per GeneralObstruction complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="GeneralObstruction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}Obstruction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="obstructionType" type="{http://datex2.eu/schema/2_0RC1/2_0}ObstructionTypeEnum" maxOccurs="unbounded"/&gt;
 *         &lt;element name="groupOfPeopleInvolved" type="{http://datex2.eu/schema/2_0RC1/2_0}GroupOfPeopleInvolved" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="generalObstructionExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralObstruction", propOrder = {
    "obstructionType",
    "groupOfPeopleInvolved",
    "generalObstructionExtension"
})
public class GeneralObstruction
    extends Obstruction
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected List<ObstructionTypeEnum> obstructionType;
    protected List<GroupOfPeopleInvolved> groupOfPeopleInvolved;
    protected ExtensionType generalObstructionExtension;

    /**
     * Gets the value of the obstructionType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the obstructionType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObstructionType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObstructionTypeEnum }
     * 
     * 
     */
    public List<ObstructionTypeEnum> getObstructionType() {
        if (obstructionType == null) {
            obstructionType = new ArrayList<ObstructionTypeEnum>();
        }
        return this.obstructionType;
    }

    /**
     * Gets the value of the groupOfPeopleInvolved property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupOfPeopleInvolved property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupOfPeopleInvolved().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroupOfPeopleInvolved }
     * 
     * 
     */
    public List<GroupOfPeopleInvolved> getGroupOfPeopleInvolved() {
        if (groupOfPeopleInvolved == null) {
            groupOfPeopleInvolved = new ArrayList<GroupOfPeopleInvolved>();
        }
        return this.groupOfPeopleInvolved;
    }

    /**
     * Recupera il valore della proprietà generalObstructionExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getGeneralObstructionExtension() {
        return generalObstructionExtension;
    }

    /**
     * Imposta il valore della proprietà generalObstructionExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setGeneralObstructionExtension(ExtensionType value) {
        this.generalObstructionExtension = value;
    }

    public GeneralObstruction withObstructionType(ObstructionTypeEnum... values) {
        if (values!= null) {
            for (ObstructionTypeEnum value: values) {
                getObstructionType().add(value);
            }
        }
        return this;
    }

    public GeneralObstruction withObstructionType(Collection<ObstructionTypeEnum> values) {
        if (values!= null) {
            getObstructionType().addAll(values);
        }
        return this;
    }

    public GeneralObstruction withGroupOfPeopleInvolved(GroupOfPeopleInvolved... values) {
        if (values!= null) {
            for (GroupOfPeopleInvolved value: values) {
                getGroupOfPeopleInvolved().add(value);
            }
        }
        return this;
    }

    public GeneralObstruction withGroupOfPeopleInvolved(Collection<GroupOfPeopleInvolved> values) {
        if (values!= null) {
            getGroupOfPeopleInvolved().addAll(values);
        }
        return this;
    }

    public GeneralObstruction withGeneralObstructionExtension(ExtensionType value) {
        setGeneralObstructionExtension(value);
        return this;
    }

    @Override
    public GeneralObstruction withNumberOfObstructions(BigInteger value) {
        setNumberOfObstructions(value);
        return this;
    }

    @Override
    public GeneralObstruction withMobilityOfObstruction(Mobility value) {
        setMobilityOfObstruction(value);
        return this;
    }

    @Override
    public GeneralObstruction withObstructionExtension(ExtensionType value) {
        setObstructionExtension(value);
        return this;
    }

    @Override
    public GeneralObstruction withTrafficElementExtension(ExtensionType value) {
        setTrafficElementExtension(value);
        return this;
    }

    @Override
    public GeneralObstruction withSituationRecordCreationReference(String value) {
        setSituationRecordCreationReference(value);
        return this;
    }

    @Override
    public GeneralObstruction withSituationRecordCreationTime(LocalDateTime value) {
        setSituationRecordCreationTime(value);
        return this;
    }

    @Override
    public GeneralObstruction withSituationRecordObservationTime(LocalDateTime value) {
        setSituationRecordObservationTime(value);
        return this;
    }

    @Override
    public GeneralObstruction withSituationRecordVersion(BigInteger value) {
        setSituationRecordVersion(value);
        return this;
    }

    @Override
    public GeneralObstruction withSituationRecordVersionTime(LocalDateTime value) {
        setSituationRecordVersionTime(value);
        return this;
    }

    @Override
    public GeneralObstruction withSituationRecordFirstSupplierVersionTime(LocalDateTime value) {
        setSituationRecordFirstSupplierVersionTime(value);
        return this;
    }

    @Override
    public GeneralObstruction withConfidentialityOverride(ConfidentialityValueEnum value) {
        setConfidentialityOverride(value);
        return this;
    }

    @Override
    public GeneralObstruction withProbabilityOfOccurrence(ProbabilityOfOccurrenceEnum value) {
        setProbabilityOfOccurrence(value);
        return this;
    }

    @Override
    public GeneralObstruction withSource(Source value) {
        setSource(value);
        return this;
    }

    @Override
    public GeneralObstruction withValidity(Validity value) {
        setValidity(value);
        return this;
    }

    @Override
    public GeneralObstruction withImpact(Impact value) {
        setImpact(value);
        return this;
    }

    @Override
    public GeneralObstruction withCause(Cause value) {
        setCause(value);
        return this;
    }

    @Override
    public GeneralObstruction withGeneralPublicComment(Comment... values) {
        if (values!= null) {
            for (Comment value: values) {
                getGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public GeneralObstruction withGeneralPublicComment(Collection<Comment> values) {
        if (values!= null) {
            getGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public GeneralObstruction withNonGeneralPublicComment(Comment... values) {
        if (values!= null) {
            for (Comment value: values) {
                getNonGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public GeneralObstruction withNonGeneralPublicComment(Collection<Comment> values) {
        if (values!= null) {
            getNonGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public GeneralObstruction withUrlLink(UrlLink... values) {
        if (values!= null) {
            for (UrlLink value: values) {
                getUrlLink().add(value);
            }
        }
        return this;
    }

    @Override
    public GeneralObstruction withUrlLink(Collection<UrlLink> values) {
        if (values!= null) {
            getUrlLink().addAll(values);
        }
        return this;
    }

    @Override
    public GeneralObstruction withGroupOfLocations(GroupOfLocations value) {
        setGroupOfLocations(value);
        return this;
    }

    @Override
    public GeneralObstruction withManagement(Management value) {
        setManagement(value);
        return this;
    }

    @Override
    public GeneralObstruction withSituationRecordExtension(ExtensionType value) {
        setSituationRecordExtension(value);
        return this;
    }

    @Override
    public GeneralObstruction withId(String value) {
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

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
 * <p>Classe Java per MatrixSignSetting complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="MatrixSignSetting"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}SignSetting"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aspectDisplayed" type="{http://datex2.eu/schema/2_0RC1/2_0}String"/&gt;
 *         &lt;element name="matrixFault" type="{http://datex2.eu/schema/2_0RC1/2_0}MatrixFaultEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="matrixIdentifier" type="{http://datex2.eu/schema/2_0RC1/2_0}String"/&gt;
 *         &lt;element name="matrixSignSettingExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatrixSignSetting", propOrder = {
    "aspectDisplayed",
    "matrixFault",
    "matrixIdentifier",
    "matrixSignSettingExtension"
})
public class MatrixSignSetting
    extends SignSetting
{

    @XmlElement(required = true)
    protected String aspectDisplayed;
    @XmlSchemaType(name = "string")
    protected List<MatrixFaultEnum> matrixFault;
    @XmlElement(required = true)
    protected String matrixIdentifier;
    protected ExtensionType matrixSignSettingExtension;

    /**
     * Recupera il valore della proprietà aspectDisplayed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAspectDisplayed() {
        return aspectDisplayed;
    }

    /**
     * Imposta il valore della proprietà aspectDisplayed.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAspectDisplayed(String value) {
        this.aspectDisplayed = value;
    }

    /**
     * Gets the value of the matrixFault property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the matrixFault property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMatrixFault().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MatrixFaultEnum }
     * 
     * 
     */
    public List<MatrixFaultEnum> getMatrixFault() {
        if (matrixFault == null) {
            matrixFault = new ArrayList<MatrixFaultEnum>();
        }
        return this.matrixFault;
    }

    /**
     * Recupera il valore della proprietà matrixIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatrixIdentifier() {
        return matrixIdentifier;
    }

    /**
     * Imposta il valore della proprietà matrixIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatrixIdentifier(String value) {
        this.matrixIdentifier = value;
    }

    /**
     * Recupera il valore della proprietà matrixSignSettingExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getMatrixSignSettingExtension() {
        return matrixSignSettingExtension;
    }

    /**
     * Imposta il valore della proprietà matrixSignSettingExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setMatrixSignSettingExtension(ExtensionType value) {
        this.matrixSignSettingExtension = value;
    }

    public MatrixSignSetting withAspectDisplayed(String value) {
        setAspectDisplayed(value);
        return this;
    }

    public MatrixSignSetting withMatrixFault(MatrixFaultEnum... values) {
        if (values!= null) {
            for (MatrixFaultEnum value: values) {
                getMatrixFault().add(value);
            }
        }
        return this;
    }

    public MatrixSignSetting withMatrixFault(Collection<MatrixFaultEnum> values) {
        if (values!= null) {
            getMatrixFault().addAll(values);
        }
        return this;
    }

    public MatrixSignSetting withMatrixIdentifier(String value) {
        setMatrixIdentifier(value);
        return this;
    }

    public MatrixSignSetting withMatrixSignSettingExtension(ExtensionType value) {
        setMatrixSignSettingExtension(value);
        return this;
    }

    @Override
    public MatrixSignSetting withDatexPictogram(DatexPictogramEnum... values) {
        if (values!= null) {
            for (DatexPictogramEnum value: values) {
                getDatexPictogram().add(value);
            }
        }
        return this;
    }

    @Override
    public MatrixSignSetting withDatexPictogram(Collection<DatexPictogramEnum> values) {
        if (values!= null) {
            getDatexPictogram().addAll(values);
        }
        return this;
    }

    @Override
    public MatrixSignSetting withPictogramList(String value) {
        setPictogramList(value);
        return this;
    }

    @Override
    public MatrixSignSetting withPictogramListEntry(String... values) {
        if (values!= null) {
            for (String value: values) {
                getPictogramListEntry().add(value);
            }
        }
        return this;
    }

    @Override
    public MatrixSignSetting withPictogramListEntry(Collection<String> values) {
        if (values!= null) {
            getPictogramListEntry().addAll(values);
        }
        return this;
    }

    @Override
    public MatrixSignSetting withReasonForSetting(MultilingualString value) {
        setReasonForSetting(value);
        return this;
    }

    @Override
    public MatrixSignSetting withSetBy(MultilingualString value) {
        setSetBy(value);
        return this;
    }

    @Override
    public MatrixSignSetting withSignAddress(String value) {
        setSignAddress(value);
        return this;
    }

    @Override
    public MatrixSignSetting withTimeLastSet(LocalDateTime value) {
        setTimeLastSet(value);
        return this;
    }

    @Override
    public MatrixSignSetting withSignSettingExtension(ExtensionType value) {
        setSignSettingExtension(value);
        return this;
    }

    @Override
    public MatrixSignSetting withActionOrigin(OperatorActionOriginEnum value) {
        setActionOrigin(value);
        return this;
    }

    @Override
    public MatrixSignSetting withOperatorActionStatus(OperatorActionStatusEnum value) {
        setOperatorActionStatus(value);
        return this;
    }

    @Override
    public MatrixSignSetting withOperatorActionExtension(ExtensionType value) {
        setOperatorActionExtension(value);
        return this;
    }

    @Override
    public MatrixSignSetting withSituationRecordCreationReference(String value) {
        setSituationRecordCreationReference(value);
        return this;
    }

    @Override
    public MatrixSignSetting withSituationRecordCreationTime(LocalDateTime value) {
        setSituationRecordCreationTime(value);
        return this;
    }

    @Override
    public MatrixSignSetting withSituationRecordObservationTime(LocalDateTime value) {
        setSituationRecordObservationTime(value);
        return this;
    }

    @Override
    public MatrixSignSetting withSituationRecordVersion(BigInteger value) {
        setSituationRecordVersion(value);
        return this;
    }

    @Override
    public MatrixSignSetting withSituationRecordVersionTime(LocalDateTime value) {
        setSituationRecordVersionTime(value);
        return this;
    }

    @Override
    public MatrixSignSetting withSituationRecordFirstSupplierVersionTime(LocalDateTime value) {
        setSituationRecordFirstSupplierVersionTime(value);
        return this;
    }

    @Override
    public MatrixSignSetting withConfidentialityOverride(ConfidentialityValueEnum value) {
        setConfidentialityOverride(value);
        return this;
    }

    @Override
    public MatrixSignSetting withProbabilityOfOccurrence(ProbabilityOfOccurrenceEnum value) {
        setProbabilityOfOccurrence(value);
        return this;
    }

    @Override
    public MatrixSignSetting withSource(Source value) {
        setSource(value);
        return this;
    }

    @Override
    public MatrixSignSetting withValidity(Validity value) {
        setValidity(value);
        return this;
    }

    @Override
    public MatrixSignSetting withImpact(Impact value) {
        setImpact(value);
        return this;
    }

    @Override
    public MatrixSignSetting withCause(Cause value) {
        setCause(value);
        return this;
    }

    @Override
    public MatrixSignSetting withGeneralPublicComment(Comment... values) {
        if (values!= null) {
            for (Comment value: values) {
                getGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public MatrixSignSetting withGeneralPublicComment(Collection<Comment> values) {
        if (values!= null) {
            getGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public MatrixSignSetting withNonGeneralPublicComment(Comment... values) {
        if (values!= null) {
            for (Comment value: values) {
                getNonGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public MatrixSignSetting withNonGeneralPublicComment(Collection<Comment> values) {
        if (values!= null) {
            getNonGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public MatrixSignSetting withUrlLink(UrlLink... values) {
        if (values!= null) {
            for (UrlLink value: values) {
                getUrlLink().add(value);
            }
        }
        return this;
    }

    @Override
    public MatrixSignSetting withUrlLink(Collection<UrlLink> values) {
        if (values!= null) {
            getUrlLink().addAll(values);
        }
        return this;
    }

    @Override
    public MatrixSignSetting withGroupOfLocations(GroupOfLocations value) {
        setGroupOfLocations(value);
        return this;
    }

    @Override
    public MatrixSignSetting withManagement(Management value) {
        setManagement(value);
        return this;
    }

    @Override
    public MatrixSignSetting withSituationRecordExtension(ExtensionType value) {
        setSituationRecordExtension(value);
        return this;
    }

    @Override
    public MatrixSignSetting withId(String value) {
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

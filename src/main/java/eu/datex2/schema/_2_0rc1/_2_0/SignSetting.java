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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.LocalDateTimeISO8601XmlAdapter;


/**
 * <p>Classe Java per SignSetting complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SignSetting"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}OperatorAction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="datexPictogram" type="{http://datex2.eu/schema/2_0RC1/2_0}DatexPictogramEnum" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="pictogramList" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="pictogramListEntry" type="{http://datex2.eu/schema/2_0RC1/2_0}String" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="reasonForSetting" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="setBy" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="signAddress" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="timeLastSet" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="signSettingExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignSetting", propOrder = {
    "datexPictogram",
    "pictogramList",
    "pictogramListEntry",
    "reasonForSetting",
    "setBy",
    "signAddress",
    "timeLastSet",
    "signSettingExtension"
})
@XmlSeeAlso({
    MatrixSignSetting.class,
    VariableMessageSignSetting.class
})
public abstract class SignSetting
    extends OperatorAction
{

    @XmlSchemaType(name = "string")
    protected List<DatexPictogramEnum> datexPictogram;
    protected String pictogramList;
    protected List<String> pictogramListEntry;
    protected MultilingualString reasonForSetting;
    protected MultilingualString setBy;
    protected String signAddress;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime timeLastSet;
    protected ExtensionType signSettingExtension;

    /**
     * Gets the value of the datexPictogram property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datexPictogram property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatexPictogram().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DatexPictogramEnum }
     * 
     * 
     */
    public List<DatexPictogramEnum> getDatexPictogram() {
        if (datexPictogram == null) {
            datexPictogram = new ArrayList<DatexPictogramEnum>();
        }
        return this.datexPictogram;
    }

    /**
     * Recupera il valore della proprietà pictogramList.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPictogramList() {
        return pictogramList;
    }

    /**
     * Imposta il valore della proprietà pictogramList.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPictogramList(String value) {
        this.pictogramList = value;
    }

    /**
     * Gets the value of the pictogramListEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pictogramListEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPictogramListEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPictogramListEntry() {
        if (pictogramListEntry == null) {
            pictogramListEntry = new ArrayList<String>();
        }
        return this.pictogramListEntry;
    }

    /**
     * Recupera il valore della proprietà reasonForSetting.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getReasonForSetting() {
        return reasonForSetting;
    }

    /**
     * Imposta il valore della proprietà reasonForSetting.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setReasonForSetting(MultilingualString value) {
        this.reasonForSetting = value;
    }

    /**
     * Recupera il valore della proprietà setBy.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getSetBy() {
        return setBy;
    }

    /**
     * Imposta il valore della proprietà setBy.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setSetBy(MultilingualString value) {
        this.setBy = value;
    }

    /**
     * Recupera il valore della proprietà signAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignAddress() {
        return signAddress;
    }

    /**
     * Imposta il valore della proprietà signAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignAddress(String value) {
        this.signAddress = value;
    }

    /**
     * Recupera il valore della proprietà timeLastSet.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getTimeLastSet() {
        return timeLastSet;
    }

    /**
     * Imposta il valore della proprietà timeLastSet.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeLastSet(LocalDateTime value) {
        this.timeLastSet = value;
    }

    /**
     * Recupera il valore della proprietà signSettingExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getSignSettingExtension() {
        return signSettingExtension;
    }

    /**
     * Imposta il valore della proprietà signSettingExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setSignSettingExtension(ExtensionType value) {
        this.signSettingExtension = value;
    }

    public SignSetting withDatexPictogram(DatexPictogramEnum... values) {
        if (values!= null) {
            for (DatexPictogramEnum value: values) {
                getDatexPictogram().add(value);
            }
        }
        return this;
    }

    public SignSetting withDatexPictogram(Collection<DatexPictogramEnum> values) {
        if (values!= null) {
            getDatexPictogram().addAll(values);
        }
        return this;
    }

    public SignSetting withPictogramList(String value) {
        setPictogramList(value);
        return this;
    }

    public SignSetting withPictogramListEntry(String... values) {
        if (values!= null) {
            for (String value: values) {
                getPictogramListEntry().add(value);
            }
        }
        return this;
    }

    public SignSetting withPictogramListEntry(Collection<String> values) {
        if (values!= null) {
            getPictogramListEntry().addAll(values);
        }
        return this;
    }

    public SignSetting withReasonForSetting(MultilingualString value) {
        setReasonForSetting(value);
        return this;
    }

    public SignSetting withSetBy(MultilingualString value) {
        setSetBy(value);
        return this;
    }

    public SignSetting withSignAddress(String value) {
        setSignAddress(value);
        return this;
    }

    public SignSetting withTimeLastSet(LocalDateTime value) {
        setTimeLastSet(value);
        return this;
    }

    public SignSetting withSignSettingExtension(ExtensionType value) {
        setSignSettingExtension(value);
        return this;
    }

    @Override
    public SignSetting withActionOrigin(OperatorActionOriginEnum value) {
        setActionOrigin(value);
        return this;
    }

    @Override
    public SignSetting withOperatorActionStatus(OperatorActionStatusEnum value) {
        setOperatorActionStatus(value);
        return this;
    }

    @Override
    public SignSetting withOperatorActionExtension(ExtensionType value) {
        setOperatorActionExtension(value);
        return this;
    }

    @Override
    public SignSetting withSituationRecordCreationReference(String value) {
        setSituationRecordCreationReference(value);
        return this;
    }

    @Override
    public SignSetting withSituationRecordCreationTime(LocalDateTime value) {
        setSituationRecordCreationTime(value);
        return this;
    }

    @Override
    public SignSetting withSituationRecordObservationTime(LocalDateTime value) {
        setSituationRecordObservationTime(value);
        return this;
    }

    @Override
    public SignSetting withSituationRecordVersion(BigInteger value) {
        setSituationRecordVersion(value);
        return this;
    }

    @Override
    public SignSetting withSituationRecordVersionTime(LocalDateTime value) {
        setSituationRecordVersionTime(value);
        return this;
    }

    @Override
    public SignSetting withSituationRecordFirstSupplierVersionTime(LocalDateTime value) {
        setSituationRecordFirstSupplierVersionTime(value);
        return this;
    }

    @Override
    public SignSetting withConfidentialityOverride(ConfidentialityValueEnum value) {
        setConfidentialityOverride(value);
        return this;
    }

    @Override
    public SignSetting withProbabilityOfOccurrence(ProbabilityOfOccurrenceEnum value) {
        setProbabilityOfOccurrence(value);
        return this;
    }

    @Override
    public SignSetting withSource(Source value) {
        setSource(value);
        return this;
    }

    @Override
    public SignSetting withValidity(Validity value) {
        setValidity(value);
        return this;
    }

    @Override
    public SignSetting withImpact(Impact value) {
        setImpact(value);
        return this;
    }

    @Override
    public SignSetting withCause(Cause value) {
        setCause(value);
        return this;
    }

    @Override
    public SignSetting withGeneralPublicComment(Comment... values) {
        if (values!= null) {
            for (Comment value: values) {
                getGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public SignSetting withGeneralPublicComment(Collection<Comment> values) {
        if (values!= null) {
            getGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public SignSetting withNonGeneralPublicComment(Comment... values) {
        if (values!= null) {
            for (Comment value: values) {
                getNonGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public SignSetting withNonGeneralPublicComment(Collection<Comment> values) {
        if (values!= null) {
            getNonGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public SignSetting withUrlLink(UrlLink... values) {
        if (values!= null) {
            for (UrlLink value: values) {
                getUrlLink().add(value);
            }
        }
        return this;
    }

    @Override
    public SignSetting withUrlLink(Collection<UrlLink> values) {
        if (values!= null) {
            getUrlLink().addAll(values);
        }
        return this;
    }

    @Override
    public SignSetting withGroupOfLocations(GroupOfLocations value) {
        setGroupOfLocations(value);
        return this;
    }

    @Override
    public SignSetting withManagement(Management value) {
        setManagement(value);
        return this;
    }

    @Override
    public SignSetting withSituationRecordExtension(ExtensionType value) {
        setSituationRecordExtension(value);
        return this;
    }

    @Override
    public SignSetting withId(String value) {
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

//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package uk.org.ifopt.acsb;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per UserNeedStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="UserNeedStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.ifopt.org.uk/acsb}UserNeedGroup"/&gt;
 *         &lt;element name="Excluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NeedRanking" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="Extensions" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserNeedStructure", propOrder = {
    "mobilityNeed",
    "psychosensoryNeed",
    "medicalNeed",
    "encumbranceNeed",
    "excluded",
    "needRanking",
    "extensions"
})
public class UserNeedStructure {

    @XmlElement(name = "MobilityNeed")
    @XmlSchemaType(name = "NMTOKEN")
    protected MobilityEnumeration mobilityNeed;
    @XmlElement(name = "PsychosensoryNeed")
    @XmlSchemaType(name = "NMTOKEN")
    protected PyschosensoryNeedEnumeration psychosensoryNeed;
    @XmlElement(name = "MedicalNeed")
    protected MedicalNeedEnumeration medicalNeed;
    @XmlElement(name = "EncumbranceNeed")
    @XmlSchemaType(name = "NMTOKEN")
    protected EncumbranceEnumeration encumbranceNeed;
    @XmlElement(name = "Excluded")
    protected Boolean excluded;
    @XmlElement(name = "NeedRanking")
    protected BigInteger needRanking;
    @XmlElement(name = "Extensions")
    protected Object extensions;

    /**
     * Recupera il valore della proprietà mobilityNeed.
     * 
     * @return
     *     possible object is
     *     {@link MobilityEnumeration }
     *     
     */
    public MobilityEnumeration getMobilityNeed() {
        return mobilityNeed;
    }

    /**
     * Imposta il valore della proprietà mobilityNeed.
     * 
     * @param value
     *     allowed object is
     *     {@link MobilityEnumeration }
     *     
     */
    public void setMobilityNeed(MobilityEnumeration value) {
        this.mobilityNeed = value;
    }

    /**
     * Recupera il valore della proprietà psychosensoryNeed.
     * 
     * @return
     *     possible object is
     *     {@link PyschosensoryNeedEnumeration }
     *     
     */
    public PyschosensoryNeedEnumeration getPsychosensoryNeed() {
        return psychosensoryNeed;
    }

    /**
     * Imposta il valore della proprietà psychosensoryNeed.
     * 
     * @param value
     *     allowed object is
     *     {@link PyschosensoryNeedEnumeration }
     *     
     */
    public void setPsychosensoryNeed(PyschosensoryNeedEnumeration value) {
        this.psychosensoryNeed = value;
    }

    /**
     * Recupera il valore della proprietà medicalNeed.
     * 
     * @return
     *     possible object is
     *     {@link MedicalNeedEnumeration }
     *     
     */
    public MedicalNeedEnumeration getMedicalNeed() {
        return medicalNeed;
    }

    /**
     * Imposta il valore della proprietà medicalNeed.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicalNeedEnumeration }
     *     
     */
    public void setMedicalNeed(MedicalNeedEnumeration value) {
        this.medicalNeed = value;
    }

    /**
     * Recupera il valore della proprietà encumbranceNeed.
     * 
     * @return
     *     possible object is
     *     {@link EncumbranceEnumeration }
     *     
     */
    public EncumbranceEnumeration getEncumbranceNeed() {
        return encumbranceNeed;
    }

    /**
     * Imposta il valore della proprietà encumbranceNeed.
     * 
     * @param value
     *     allowed object is
     *     {@link EncumbranceEnumeration }
     *     
     */
    public void setEncumbranceNeed(EncumbranceEnumeration value) {
        this.encumbranceNeed = value;
    }

    /**
     * Recupera il valore della proprietà excluded.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcluded() {
        return excluded;
    }

    /**
     * Imposta il valore della proprietà excluded.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcluded(Boolean value) {
        this.excluded = value;
    }

    /**
     * Recupera il valore della proprietà needRanking.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNeedRanking() {
        return needRanking;
    }

    /**
     * Imposta il valore della proprietà needRanking.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNeedRanking(BigInteger value) {
        this.needRanking = value;
    }

    /**
     * Recupera il valore della proprietà extensions.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExtensions() {
        return extensions;
    }

    /**
     * Imposta il valore della proprietà extensions.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExtensions(Object value) {
        this.extensions = value;
    }

    public UserNeedStructure withMobilityNeed(MobilityEnumeration value) {
        setMobilityNeed(value);
        return this;
    }

    public UserNeedStructure withPsychosensoryNeed(PyschosensoryNeedEnumeration value) {
        setPsychosensoryNeed(value);
        return this;
    }

    public UserNeedStructure withMedicalNeed(MedicalNeedEnumeration value) {
        setMedicalNeed(value);
        return this;
    }

    public UserNeedStructure withEncumbranceNeed(EncumbranceEnumeration value) {
        setEncumbranceNeed(value);
        return this;
    }

    public UserNeedStructure withExcluded(Boolean value) {
        setExcluded(value);
        return this;
    }

    public UserNeedStructure withNeedRanking(BigInteger value) {
        setNeedRanking(value);
        return this;
    }

    public UserNeedStructure withExtensions(Object value) {
        setExtensions(value);
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

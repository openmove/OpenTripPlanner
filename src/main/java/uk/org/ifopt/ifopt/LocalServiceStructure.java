//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package uk.org.ifopt.ifopt;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bliksemlabs.ojp.model.NaturalLanguageStringStructure;
import com.bliksemlabs.ojp.model.ServiceFeatureRefStructure;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per LocalServiceStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="LocalServiceStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.ifopt.org.uk/ifopt}InstalledEquipmentStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.ifopt.org.uk/ifopt}LocalServiceGroup"/&gt;
 *         &lt;element ref="{http://www.ifopt.org.uk/ifopt}Extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocalServiceStructure", propOrder = {
    "validityConditions",
    "featureRefs",
    "extensions"
})
public class LocalServiceStructure
    extends InstalledEquipmentStructure
{

    @XmlElement(name = "ValidityConditions")
    protected ValidityConditionsStructure validityConditions;
    @XmlElement(name = "FeatureRefs")
    protected LocalServiceStructure.FeatureRefs featureRefs;
    @XmlElement(name = "Extensions")
    protected Extensions extensions;

    /**
     * Recupera il valore della proprietà validityConditions.
     * 
     * @return
     *     possible object is
     *     {@link ValidityConditionsStructure }
     *     
     */
    public ValidityConditionsStructure getValidityConditions() {
        return validityConditions;
    }

    /**
     * Imposta il valore della proprietà validityConditions.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidityConditionsStructure }
     *     
     */
    public void setValidityConditions(ValidityConditionsStructure value) {
        this.validityConditions = value;
    }

    /**
     * Recupera il valore della proprietà featureRefs.
     * 
     * @return
     *     possible object is
     *     {@link LocalServiceStructure.FeatureRefs }
     *     
     */
    public LocalServiceStructure.FeatureRefs getFeatureRefs() {
        return featureRefs;
    }

    /**
     * Imposta il valore della proprietà featureRefs.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalServiceStructure.FeatureRefs }
     *     
     */
    public void setFeatureRefs(LocalServiceStructure.FeatureRefs value) {
        this.featureRefs = value;
    }

    /**
     * Recupera il valore della proprietà extensions.
     * 
     * @return
     *     possible object is
     *     {@link Extensions }
     *     
     */
    public Extensions getExtensions() {
        return extensions;
    }

    /**
     * Imposta il valore della proprietà extensions.
     * 
     * @param value
     *     allowed object is
     *     {@link Extensions }
     *     
     */
    public void setExtensions(Extensions value) {
        this.extensions = value;
    }

    public LocalServiceStructure withValidityConditions(ValidityConditionsStructure value) {
        setValidityConditions(value);
        return this;
    }

    public LocalServiceStructure withFeatureRefs(LocalServiceStructure.FeatureRefs value) {
        setFeatureRefs(value);
        return this;
    }

    public LocalServiceStructure withExtensions(Extensions value) {
        setExtensions(value);
        return this;
    }

    @Override
    public LocalServiceStructure withEquipmentId(String value) {
        setEquipmentId(value);
        return this;
    }

    @Override
    public LocalServiceStructure withEquipmentName(NaturalLanguageStringStructure value) {
        setEquipmentName(value);
        return this;
    }

    @Override
    public LocalServiceStructure withTypeOfEquipment(EquipmentTypeRefStructure value) {
        setTypeOfEquipment(value);
        return this;
    }

    @Override
    public LocalServiceStructure withManagedByAreaRef(AdministrativeAreaRefStructure value) {
        setManagedByAreaRef(value);
        return this;
    }

    @Override
    public LocalServiceStructure withInfoLinks(InfoLinksStructure value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public LocalServiceStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public LocalServiceStructure withLastUpdated(LocalDateTime value) {
        setLastUpdated(value);
        return this;
    }

    @Override
    public LocalServiceStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public LocalServiceStructure withVersion(BigInteger value) {
        setVersion(value);
        return this;
    }

    @Override
    public LocalServiceStructure withStatus(StatusEnumeration value) {
        setStatus(value);
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


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="FeatureRef" type="{http://www.siri.org.uk/siri}ServiceFeatureRefStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "featureRef"
    })
    public static class FeatureRefs {

        @XmlElement(name = "FeatureRef")
        protected List<ServiceFeatureRefStructure> featureRef;

        /**
         * Gets the value of the featureRef property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the featureRef property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFeatureRef().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ServiceFeatureRefStructure }
         * 
         * 
         */
        public List<ServiceFeatureRefStructure> getFeatureRef() {
            if (featureRef == null) {
                featureRef = new ArrayList<ServiceFeatureRefStructure>();
            }
            return this.featureRef;
        }

        public LocalServiceStructure.FeatureRefs withFeatureRef(ServiceFeatureRefStructure... values) {
            if (values!= null) {
                for (ServiceFeatureRefStructure value: values) {
                    getFeatureRef().add(value);
                }
            }
            return this;
        }

        public LocalServiceStructure.FeatureRefs withFeatureRef(Collection<ServiceFeatureRefStructure> values) {
            if (values!= null) {
                getFeatureRef().addAll(values);
            }
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

}

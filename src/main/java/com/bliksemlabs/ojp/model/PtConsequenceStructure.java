//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package com.bliksemlabs.ojp.model;

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
import uk.org.ifopt.acsb.SuitabilityStructure;


/**
 * <p>Classe Java per PtConsequenceStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PtConsequenceStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Period" type="{http://www.siri.org.uk/siri}HalfOpenTimestampOutputRangeStructure" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}Condition" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Severity" type="{http://www.siri.org.uk/siri}SeverityEnumeration"/&gt;
 *         &lt;element name="Affects" type="{http://www.siri.org.uk/siri}AffectsScopeStructure" minOccurs="0"/&gt;
 *         &lt;element name="Suitabilities" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Suitability" type="{http://www.ifopt.org.uk/acsb}SuitabilityStructure" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Advice" type="{http://www.siri.org.uk/siri}PtAdviceStructure" minOccurs="0"/&gt;
 *         &lt;element name="Blocking" type="{http://www.siri.org.uk/siri}BlockingStructure" minOccurs="0"/&gt;
 *         &lt;element name="Boarding" type="{http://www.siri.org.uk/siri}BoardingStructure" minOccurs="0"/&gt;
 *         &lt;element name="Delays" type="{http://www.siri.org.uk/siri}DelaysStructure" minOccurs="0"/&gt;
 *         &lt;element name="Casualties" type="{http://www.siri.org.uk/siri}CasualtiesStructure" minOccurs="0"/&gt;
 *         &lt;element name="Easements" type="{http://www.siri.org.uk/siri}EasementsStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PtConsequenceStructure", propOrder = {
    "period",
    "condition",
    "severity",
    "affects",
    "suitabilities",
    "advice",
    "blocking",
    "boarding",
    "delays",
    "casualties",
    "easements",
    "extensions"
})
public class PtConsequenceStructure {

    @XmlElement(name = "Period")
    protected HalfOpenTimestampOutputRangeStructure period;
    @XmlElement(name = "Condition")
    @XmlSchemaType(name = "NMTOKEN")
    protected List<ServiceConditionEnumeration> condition;
    @XmlElement(name = "Severity", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected SeverityEnumeration severity;
    @XmlElement(name = "Affects")
    protected AffectsScopeStructure affects;
    @XmlElement(name = "Suitabilities")
    protected PtConsequenceStructure.Suitabilities suitabilities;
    @XmlElement(name = "Advice")
    protected PtAdviceStructure advice;
    @XmlElement(name = "Blocking")
    protected BlockingStructure blocking;
    @XmlElement(name = "Boarding")
    protected BoardingStructure boarding;
    @XmlElement(name = "Delays")
    protected DelaysStructure delays;
    @XmlElement(name = "Casualties")
    protected CasualtiesStructure casualties;
    @XmlElement(name = "Easements")
    protected List<EasementsStructure> easements;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Recupera il valore della proprietà period.
     * 
     * @return
     *     possible object is
     *     {@link HalfOpenTimestampOutputRangeStructure }
     *     
     */
    public HalfOpenTimestampOutputRangeStructure getPeriod() {
        return period;
    }

    /**
     * Imposta il valore della proprietà period.
     * 
     * @param value
     *     allowed object is
     *     {@link HalfOpenTimestampOutputRangeStructure }
     *     
     */
    public void setPeriod(HalfOpenTimestampOutputRangeStructure value) {
        this.period = value;
    }

    /**
     * Gets the value of the condition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the condition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceConditionEnumeration }
     * 
     * 
     */
    public List<ServiceConditionEnumeration> getCondition() {
        if (condition == null) {
            condition = new ArrayList<ServiceConditionEnumeration>();
        }
        return this.condition;
    }

    /**
     * Recupera il valore della proprietà severity.
     * 
     * @return
     *     possible object is
     *     {@link SeverityEnumeration }
     *     
     */
    public SeverityEnumeration getSeverity() {
        return severity;
    }

    /**
     * Imposta il valore della proprietà severity.
     * 
     * @param value
     *     allowed object is
     *     {@link SeverityEnumeration }
     *     
     */
    public void setSeverity(SeverityEnumeration value) {
        this.severity = value;
    }

    /**
     * Recupera il valore della proprietà affects.
     * 
     * @return
     *     possible object is
     *     {@link AffectsScopeStructure }
     *     
     */
    public AffectsScopeStructure getAffects() {
        return affects;
    }

    /**
     * Imposta il valore della proprietà affects.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectsScopeStructure }
     *     
     */
    public void setAffects(AffectsScopeStructure value) {
        this.affects = value;
    }

    /**
     * Recupera il valore della proprietà suitabilities.
     * 
     * @return
     *     possible object is
     *     {@link PtConsequenceStructure.Suitabilities }
     *     
     */
    public PtConsequenceStructure.Suitabilities getSuitabilities() {
        return suitabilities;
    }

    /**
     * Imposta il valore della proprietà suitabilities.
     * 
     * @param value
     *     allowed object is
     *     {@link PtConsequenceStructure.Suitabilities }
     *     
     */
    public void setSuitabilities(PtConsequenceStructure.Suitabilities value) {
        this.suitabilities = value;
    }

    /**
     * Recupera il valore della proprietà advice.
     * 
     * @return
     *     possible object is
     *     {@link PtAdviceStructure }
     *     
     */
    public PtAdviceStructure getAdvice() {
        return advice;
    }

    /**
     * Imposta il valore della proprietà advice.
     * 
     * @param value
     *     allowed object is
     *     {@link PtAdviceStructure }
     *     
     */
    public void setAdvice(PtAdviceStructure value) {
        this.advice = value;
    }

    /**
     * Recupera il valore della proprietà blocking.
     * 
     * @return
     *     possible object is
     *     {@link BlockingStructure }
     *     
     */
    public BlockingStructure getBlocking() {
        return blocking;
    }

    /**
     * Imposta il valore della proprietà blocking.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockingStructure }
     *     
     */
    public void setBlocking(BlockingStructure value) {
        this.blocking = value;
    }

    /**
     * Recupera il valore della proprietà boarding.
     * 
     * @return
     *     possible object is
     *     {@link BoardingStructure }
     *     
     */
    public BoardingStructure getBoarding() {
        return boarding;
    }

    /**
     * Imposta il valore della proprietà boarding.
     * 
     * @param value
     *     allowed object is
     *     {@link BoardingStructure }
     *     
     */
    public void setBoarding(BoardingStructure value) {
        this.boarding = value;
    }

    /**
     * Recupera il valore della proprietà delays.
     * 
     * @return
     *     possible object is
     *     {@link DelaysStructure }
     *     
     */
    public DelaysStructure getDelays() {
        return delays;
    }

    /**
     * Imposta il valore della proprietà delays.
     * 
     * @param value
     *     allowed object is
     *     {@link DelaysStructure }
     *     
     */
    public void setDelays(DelaysStructure value) {
        this.delays = value;
    }

    /**
     * Recupera il valore della proprietà casualties.
     * 
     * @return
     *     possible object is
     *     {@link CasualtiesStructure }
     *     
     */
    public CasualtiesStructure getCasualties() {
        return casualties;
    }

    /**
     * Imposta il valore della proprietà casualties.
     * 
     * @param value
     *     allowed object is
     *     {@link CasualtiesStructure }
     *     
     */
    public void setCasualties(CasualtiesStructure value) {
        this.casualties = value;
    }

    /**
     * Gets the value of the easements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the easements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEasements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EasementsStructure }
     * 
     * 
     */
    public List<EasementsStructure> getEasements() {
        if (easements == null) {
            easements = new ArrayList<EasementsStructure>();
        }
        return this.easements;
    }

    /**
     * Recupera il valore della proprietà extensions.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsStructure }
     *     
     */
    public ExtensionsStructure getExtensions() {
        return extensions;
    }

    /**
     * Imposta il valore della proprietà extensions.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsStructure }
     *     
     */
    public void setExtensions(ExtensionsStructure value) {
        this.extensions = value;
    }

    public PtConsequenceStructure withPeriod(HalfOpenTimestampOutputRangeStructure value) {
        setPeriod(value);
        return this;
    }

    public PtConsequenceStructure withCondition(ServiceConditionEnumeration... values) {
        if (values!= null) {
            for (ServiceConditionEnumeration value: values) {
                getCondition().add(value);
            }
        }
        return this;
    }

    public PtConsequenceStructure withCondition(Collection<ServiceConditionEnumeration> values) {
        if (values!= null) {
            getCondition().addAll(values);
        }
        return this;
    }

    public PtConsequenceStructure withSeverity(SeverityEnumeration value) {
        setSeverity(value);
        return this;
    }

    public PtConsequenceStructure withAffects(AffectsScopeStructure value) {
        setAffects(value);
        return this;
    }

    public PtConsequenceStructure withSuitabilities(PtConsequenceStructure.Suitabilities value) {
        setSuitabilities(value);
        return this;
    }

    public PtConsequenceStructure withAdvice(PtAdviceStructure value) {
        setAdvice(value);
        return this;
    }

    public PtConsequenceStructure withBlocking(BlockingStructure value) {
        setBlocking(value);
        return this;
    }

    public PtConsequenceStructure withBoarding(BoardingStructure value) {
        setBoarding(value);
        return this;
    }

    public PtConsequenceStructure withDelays(DelaysStructure value) {
        setDelays(value);
        return this;
    }

    public PtConsequenceStructure withCasualties(CasualtiesStructure value) {
        setCasualties(value);
        return this;
    }

    public PtConsequenceStructure withEasements(EasementsStructure... values) {
        if (values!= null) {
            for (EasementsStructure value: values) {
                getEasements().add(value);
            }
        }
        return this;
    }

    public PtConsequenceStructure withEasements(Collection<EasementsStructure> values) {
        if (values!= null) {
            getEasements().addAll(values);
        }
        return this;
    }

    public PtConsequenceStructure withExtensions(ExtensionsStructure value) {
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
     *         &lt;element name="Suitability" type="{http://www.ifopt.org.uk/acsb}SuitabilityStructure" maxOccurs="unbounded"/&gt;
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
        "suitability"
    })
    public static class Suitabilities {

        @XmlElement(name = "Suitability", required = true)
        protected List<SuitabilityStructure> suitability;

        /**
         * Gets the value of the suitability property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the suitability property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSuitability().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SuitabilityStructure }
         * 
         * 
         */
        public List<SuitabilityStructure> getSuitability() {
            if (suitability == null) {
                suitability = new ArrayList<SuitabilityStructure>();
            }
            return this.suitability;
        }

        public PtConsequenceStructure.Suitabilities withSuitability(SuitabilityStructure... values) {
            if (values!= null) {
                for (SuitabilityStructure value: values) {
                    getSuitability().add(value);
                }
            }
            return this;
        }

        public PtConsequenceStructure.Suitabilities withSuitability(Collection<SuitabilityStructure> values) {
            if (values!= null) {
                getSuitability().addAll(values);
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

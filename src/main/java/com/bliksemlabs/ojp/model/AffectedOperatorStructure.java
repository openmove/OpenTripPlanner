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
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per AffectedOperatorStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AffectedOperatorStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OperatorRef" type="{http://www.siri.org.uk/siri}OperatorRefStructure" minOccurs="0"/&gt;
 *         &lt;element name="OperatorName" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OperatorShortName" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OperationalUnitRef" type="{http://www.siri.org.uk/siri}OperationalUnitRefStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "AffectedOperatorStructure", propOrder = {
    "operatorRef",
    "operatorName",
    "operatorShortName",
    "operationalUnitRef",
    "extensions"
})
public class AffectedOperatorStructure {

    @XmlElement(name = "OperatorRef")
    protected OperatorRefStructure operatorRef;
    @XmlElement(name = "OperatorName")
    protected List<NaturalLanguageStringStructure> operatorName;
    @XmlElement(name = "OperatorShortName")
    protected List<NaturalLanguageStringStructure> operatorShortName;
    @XmlElement(name = "OperationalUnitRef")
    protected List<OperationalUnitRefStructure> operationalUnitRef;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Recupera il valore della proprietà operatorRef.
     * 
     * @return
     *     possible object is
     *     {@link OperatorRefStructure }
     *     
     */
    public OperatorRefStructure getOperatorRef() {
        return operatorRef;
    }

    /**
     * Imposta il valore della proprietà operatorRef.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorRefStructure }
     *     
     */
    public void setOperatorRef(OperatorRefStructure value) {
        this.operatorRef = value;
    }

    /**
     * Gets the value of the operatorName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operatorName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperatorName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getOperatorName() {
        if (operatorName == null) {
            operatorName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.operatorName;
    }

    /**
     * Gets the value of the operatorShortName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operatorShortName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperatorShortName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getOperatorShortName() {
        if (operatorShortName == null) {
            operatorShortName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.operatorShortName;
    }

    /**
     * Gets the value of the operationalUnitRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationalUnitRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationalUnitRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperationalUnitRefStructure }
     * 
     * 
     */
    public List<OperationalUnitRefStructure> getOperationalUnitRef() {
        if (operationalUnitRef == null) {
            operationalUnitRef = new ArrayList<OperationalUnitRefStructure>();
        }
        return this.operationalUnitRef;
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

    public AffectedOperatorStructure withOperatorRef(OperatorRefStructure value) {
        setOperatorRef(value);
        return this;
    }

    public AffectedOperatorStructure withOperatorName(NaturalLanguageStringStructure... values) {
        if (values!= null) {
            for (NaturalLanguageStringStructure value: values) {
                getOperatorName().add(value);
            }
        }
        return this;
    }

    public AffectedOperatorStructure withOperatorName(Collection<NaturalLanguageStringStructure> values) {
        if (values!= null) {
            getOperatorName().addAll(values);
        }
        return this;
    }

    public AffectedOperatorStructure withOperatorShortName(NaturalLanguageStringStructure... values) {
        if (values!= null) {
            for (NaturalLanguageStringStructure value: values) {
                getOperatorShortName().add(value);
            }
        }
        return this;
    }

    public AffectedOperatorStructure withOperatorShortName(Collection<NaturalLanguageStringStructure> values) {
        if (values!= null) {
            getOperatorShortName().addAll(values);
        }
        return this;
    }

    public AffectedOperatorStructure withOperationalUnitRef(OperationalUnitRefStructure... values) {
        if (values!= null) {
            for (OperationalUnitRefStructure value: values) {
                getOperationalUnitRef().add(value);
            }
        }
        return this;
    }

    public AffectedOperatorStructure withOperationalUnitRef(Collection<OperationalUnitRefStructure> values) {
        if (values!= null) {
            getOperationalUnitRef().addAll(values);
        }
        return this;
    }

    public AffectedOperatorStructure withExtensions(ExtensionsStructure value) {
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

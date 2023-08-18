//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package de.vdv.ojp;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * [TMv6] a link within a PLACE of or between two PLACEs (that is STOP PLACEs, ACCESS SPACEs or QUAYs,BOARDING POSITIONs,, POINTs OF INTEREST etc or PATH JUNCTIONs) that represents a step in a possible route for pedestrians, cyclists or other out-of-vehicle passengers within or between a PLACE.
 * 
 * <p>Classe Java per PathLinkStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PathLinkStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Transition" type="{http://www.vdv.de/ojp}TransitionEnumeration" minOccurs="0"/&gt;
 *         &lt;element name="AccessFeatureType" type="{http://www.vdv.de/ojp}AccessFeatureTypeEnumeration" minOccurs="0"/&gt;
 *         &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PathLinkStructure", propOrder = {
    "transition",
    "accessFeatureType",
    "count"
})
public class PathLinkStructure {

    @XmlElement(name = "Transition")
    @XmlSchemaType(name = "string")
    protected TransitionEnumeration transition;
    @XmlElement(name = "AccessFeatureType")
    @XmlSchemaType(name = "string")
    protected AccessFeatureTypeEnumeration accessFeatureType;
    @XmlElement(name = "Count")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger count;

    /**
     * Recupera il valore della proprietà transition.
     * 
     * @return
     *     possible object is
     *     {@link TransitionEnumeration }
     *     
     */
    public TransitionEnumeration getTransition() {
        return transition;
    }

    /**
     * Imposta il valore della proprietà transition.
     * 
     * @param value
     *     allowed object is
     *     {@link TransitionEnumeration }
     *     
     */
    public void setTransition(TransitionEnumeration value) {
        this.transition = value;
    }

    /**
     * Recupera il valore della proprietà accessFeatureType.
     * 
     * @return
     *     possible object is
     *     {@link AccessFeatureTypeEnumeration }
     *     
     */
    public AccessFeatureTypeEnumeration getAccessFeatureType() {
        return accessFeatureType;
    }

    /**
     * Imposta il valore della proprietà accessFeatureType.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessFeatureTypeEnumeration }
     *     
     */
    public void setAccessFeatureType(AccessFeatureTypeEnumeration value) {
        this.accessFeatureType = value;
    }

    /**
     * Recupera il valore della proprietà count.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCount() {
        return count;
    }

    /**
     * Imposta il valore della proprietà count.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCount(BigInteger value) {
        this.count = value;
    }

    public PathLinkStructure withTransition(TransitionEnumeration value) {
        setTransition(value);
        return this;
    }

    public PathLinkStructure withAccessFeatureType(AccessFeatureTypeEnumeration value) {
        setAccessFeatureType(value);
        return this;
    }

    public PathLinkStructure withCount(BigInteger value) {
        setCount(value);
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

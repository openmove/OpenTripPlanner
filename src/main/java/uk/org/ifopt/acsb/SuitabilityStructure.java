//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package uk.org.ifopt.acsb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per SuitabilityStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SuitabilityStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Suitable" type="{http://www.ifopt.org.uk/acsb}SuitabilityEnumeration"/&gt;
 *         &lt;element name="UserNeed" type="{http://www.ifopt.org.uk/acsb}UserNeedStructure"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SuitabilityStructure", propOrder = {
    "suitable",
    "userNeed"
})
public class SuitabilityStructure {

    @XmlElement(name = "Suitable", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected SuitabilityEnumeration suitable;
    @XmlElement(name = "UserNeed", required = true)
    protected UserNeedStructure userNeed;

    /**
     * Recupera il valore della proprietà suitable.
     * 
     * @return
     *     possible object is
     *     {@link SuitabilityEnumeration }
     *     
     */
    public SuitabilityEnumeration getSuitable() {
        return suitable;
    }

    /**
     * Imposta il valore della proprietà suitable.
     * 
     * @param value
     *     allowed object is
     *     {@link SuitabilityEnumeration }
     *     
     */
    public void setSuitable(SuitabilityEnumeration value) {
        this.suitable = value;
    }

    /**
     * Recupera il valore della proprietà userNeed.
     * 
     * @return
     *     possible object is
     *     {@link UserNeedStructure }
     *     
     */
    public UserNeedStructure getUserNeed() {
        return userNeed;
    }

    /**
     * Imposta il valore della proprietà userNeed.
     * 
     * @param value
     *     allowed object is
     *     {@link UserNeedStructure }
     *     
     */
    public void setUserNeed(UserNeedStructure value) {
        this.userNeed = value;
    }

    public SuitabilityStructure withSuitable(SuitabilityEnumeration value) {
        setSuitable(value);
        return this;
    }

    public SuitabilityStructure withUserNeed(UserNeedStructure value) {
        setUserNeed(value);
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

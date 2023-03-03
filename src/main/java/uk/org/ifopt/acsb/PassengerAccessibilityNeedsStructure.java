//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package uk.org.ifopt.acsb;

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
 * <p>Classe Java per PassengerAccessibilityNeedsStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PassengerAccessibilityNeedsStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UserNeed" type="{http://www.ifopt.org.uk/acsb}UserNeedStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AccompaniedByCarer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerAccessibilityNeedsStructure", propOrder = {
    "userNeed",
    "accompaniedByCarer"
})
public class PassengerAccessibilityNeedsStructure {

    @XmlElement(name = "UserNeed")
    protected List<UserNeedStructure> userNeed;
    @XmlElement(name = "AccompaniedByCarer")
    protected Boolean accompaniedByCarer;

    /**
     * Gets the value of the userNeed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userNeed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserNeed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserNeedStructure }
     * 
     * 
     */
    public List<UserNeedStructure> getUserNeed() {
        if (userNeed == null) {
            userNeed = new ArrayList<UserNeedStructure>();
        }
        return this.userNeed;
    }

    /**
     * Recupera il valore della proprietà accompaniedByCarer.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccompaniedByCarer() {
        return accompaniedByCarer;
    }

    /**
     * Imposta il valore della proprietà accompaniedByCarer.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccompaniedByCarer(Boolean value) {
        this.accompaniedByCarer = value;
    }

    public PassengerAccessibilityNeedsStructure withUserNeed(UserNeedStructure... values) {
        if (values!= null) {
            for (UserNeedStructure value: values) {
                getUserNeed().add(value);
            }
        }
        return this;
    }

    public PassengerAccessibilityNeedsStructure withUserNeed(Collection<UserNeedStructure> values) {
        if (values!= null) {
            getUserNeed().addAll(values);
        }
        return this;
    }

    public PassengerAccessibilityNeedsStructure withAccompaniedByCarer(Boolean value) {
        setAccompaniedByCarer(value);
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

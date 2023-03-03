//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package com.bliksemlabs.ojp.model;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per NotifyBySmsActionStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="NotifyBySmsActionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}PushedActionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Phone" type="{http://www.siri.org.uk/siri}PhoneType" minOccurs="0"/&gt;
 *         &lt;element name="Premium" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotifyBySmsActionStructure", propOrder = {
    "phone",
    "premium"
})
public class NotifyBySmsActionStructure
    extends PushedActionStructure
{

    @XmlElement(name = "Phone", defaultValue = "true")
    protected String phone;
    @XmlElement(name = "Premium", defaultValue = "false")
    protected Boolean premium;

    /**
     * Recupera il valore della proprietà phone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Imposta il valore della proprietà phone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Recupera il valore della proprietà premium.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPremium() {
        return premium;
    }

    /**
     * Imposta il valore della proprietà premium.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPremium(Boolean value) {
        this.premium = value;
    }

    public NotifyBySmsActionStructure withPhone(String value) {
        setPhone(value);
        return this;
    }

    public NotifyBySmsActionStructure withPremium(Boolean value) {
        setPremium(value);
        return this;
    }

    @Override
    public NotifyBySmsActionStructure withBeforeNotices(PushedActionStructure.BeforeNotices value) {
        setBeforeNotices(value);
        return this;
    }

    @Override
    public NotifyBySmsActionStructure withClearNotice(Boolean value) {
        setClearNotice(value);
        return this;
    }

    @Override
    public NotifyBySmsActionStructure withDescription(NaturalLanguageStringStructure value) {
        setDescription(value);
        return this;
    }

    @Override
    public NotifyBySmsActionStructure withActionData(ActionDataStructure... values) {
        if (values!= null) {
            for (ActionDataStructure value: values) {
                getActionData().add(value);
            }
        }
        return this;
    }

    @Override
    public NotifyBySmsActionStructure withActionData(Collection<ActionDataStructure> values) {
        if (values!= null) {
            getActionData().addAll(values);
        }
        return this;
    }

    @Override
    public NotifyBySmsActionStructure withActionStatus(ActionStatusEnumeration value) {
        setActionStatus(value);
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

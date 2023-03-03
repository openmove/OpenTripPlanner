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
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per PublishToWebActionStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PublishToWebActionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}ParameterisedActionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Incidents" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HomePage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Ticker" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SocialNetwork" type="{http://www.w3.org/2001/XMLSchema}normalizedString" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublishToWebActionStructure", propOrder = {
    "incidents",
    "homePage",
    "ticker",
    "socialNetwork"
})
public class PublishToWebActionStructure
    extends ParameterisedActionStructure
{

    @XmlElement(name = "Incidents", defaultValue = "true")
    protected Boolean incidents;
    @XmlElement(name = "HomePage", defaultValue = "false")
    protected Boolean homePage;
    @XmlElement(name = "Ticker", defaultValue = "false")
    protected Boolean ticker;
    @XmlElement(name = "SocialNetwork", defaultValue = "false")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> socialNetwork;

    /**
     * Recupera il valore della proprietà incidents.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncidents() {
        return incidents;
    }

    /**
     * Imposta il valore della proprietà incidents.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncidents(Boolean value) {
        this.incidents = value;
    }

    /**
     * Recupera il valore della proprietà homePage.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHomePage() {
        return homePage;
    }

    /**
     * Imposta il valore della proprietà homePage.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHomePage(Boolean value) {
        this.homePage = value;
    }

    /**
     * Recupera il valore della proprietà ticker.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTicker() {
        return ticker;
    }

    /**
     * Imposta il valore della proprietà ticker.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTicker(Boolean value) {
        this.ticker = value;
    }

    /**
     * Gets the value of the socialNetwork property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the socialNetwork property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSocialNetwork().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSocialNetwork() {
        if (socialNetwork == null) {
            socialNetwork = new ArrayList<String>();
        }
        return this.socialNetwork;
    }

    public PublishToWebActionStructure withIncidents(Boolean value) {
        setIncidents(value);
        return this;
    }

    public PublishToWebActionStructure withHomePage(Boolean value) {
        setHomePage(value);
        return this;
    }

    public PublishToWebActionStructure withTicker(Boolean value) {
        setTicker(value);
        return this;
    }

    public PublishToWebActionStructure withSocialNetwork(String... values) {
        if (values!= null) {
            for (String value: values) {
                getSocialNetwork().add(value);
            }
        }
        return this;
    }

    public PublishToWebActionStructure withSocialNetwork(Collection<String> values) {
        if (values!= null) {
            getSocialNetwork().addAll(values);
        }
        return this;
    }

    @Override
    public PublishToWebActionStructure withDescription(NaturalLanguageStringStructure value) {
        setDescription(value);
        return this;
    }

    @Override
    public PublishToWebActionStructure withActionData(ActionDataStructure... values) {
        if (values!= null) {
            for (ActionDataStructure value: values) {
                getActionData().add(value);
            }
        }
        return this;
    }

    @Override
    public PublishToWebActionStructure withActionData(Collection<ActionDataStructure> values) {
        if (values!= null) {
            getActionData().addAll(values);
        }
        return this;
    }

    @Override
    public PublishToWebActionStructure withActionStatus(ActionStatusEnumeration value) {
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

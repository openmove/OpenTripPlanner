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
 * <p>Classe Java per ActionsStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ActionsStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}ActionsGroup"/&gt;
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
@XmlType(name = "ActionsStructure", propOrder = {
    "publishToWebAction",
    "publishToMobileAction",
    "publishToTvAction",
    "publishToAlertsAction",
    "manualAction",
    "notifyByEmailAction",
    "notifyBySmsAction",
    "notifyByPagerAction",
    "notifyUserAction",
    "extensions"
})
public class ActionsStructure {

    @XmlElement(name = "PublishToWebAction")
    protected List<PublishToWebActionStructure> publishToWebAction;
    @XmlElement(name = "PublishToMobileAction")
    protected List<PublishToMobileActionStructure> publishToMobileAction;
    @XmlElement(name = "PublishToTvAction")
    protected PublishToTvActionStructure publishToTvAction;
    @XmlElement(name = "PublishToAlertsAction")
    protected List<PublishToAlertsActionStructure> publishToAlertsAction;
    @XmlElement(name = "ManualAction")
    protected List<ManualAction> manualAction;
    @XmlElement(name = "NotifyByEmailAction")
    protected List<NotifyByEmailActionStructure> notifyByEmailAction;
    @XmlElement(name = "NotifyBySmsAction")
    protected NotifyBySmsActionStructure notifyBySmsAction;
    @XmlElement(name = "NotifyByPagerAction")
    protected List<NotifyByPagerActionStructure> notifyByPagerAction;
    @XmlElement(name = "NotifyUserAction")
    protected List<NotifyUserActionStructure> notifyUserAction;
    @XmlElement(name = "Extensions")
    protected Object extensions;

    /**
     * Gets the value of the publishToWebAction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publishToWebAction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublishToWebAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PublishToWebActionStructure }
     * 
     * 
     */
    public List<PublishToWebActionStructure> getPublishToWebAction() {
        if (publishToWebAction == null) {
            publishToWebAction = new ArrayList<PublishToWebActionStructure>();
        }
        return this.publishToWebAction;
    }

    /**
     * Gets the value of the publishToMobileAction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publishToMobileAction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublishToMobileAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PublishToMobileActionStructure }
     * 
     * 
     */
    public List<PublishToMobileActionStructure> getPublishToMobileAction() {
        if (publishToMobileAction == null) {
            publishToMobileAction = new ArrayList<PublishToMobileActionStructure>();
        }
        return this.publishToMobileAction;
    }

    /**
     * Recupera il valore della proprietà publishToTvAction.
     * 
     * @return
     *     possible object is
     *     {@link PublishToTvActionStructure }
     *     
     */
    public PublishToTvActionStructure getPublishToTvAction() {
        return publishToTvAction;
    }

    /**
     * Imposta il valore della proprietà publishToTvAction.
     * 
     * @param value
     *     allowed object is
     *     {@link PublishToTvActionStructure }
     *     
     */
    public void setPublishToTvAction(PublishToTvActionStructure value) {
        this.publishToTvAction = value;
    }

    /**
     * Gets the value of the publishToAlertsAction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publishToAlertsAction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublishToAlertsAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PublishToAlertsActionStructure }
     * 
     * 
     */
    public List<PublishToAlertsActionStructure> getPublishToAlertsAction() {
        if (publishToAlertsAction == null) {
            publishToAlertsAction = new ArrayList<PublishToAlertsActionStructure>();
        }
        return this.publishToAlertsAction;
    }

    /**
     * Gets the value of the manualAction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manualAction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManualAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManualAction }
     * 
     * 
     */
    public List<ManualAction> getManualAction() {
        if (manualAction == null) {
            manualAction = new ArrayList<ManualAction>();
        }
        return this.manualAction;
    }

    /**
     * Gets the value of the notifyByEmailAction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notifyByEmailAction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotifyByEmailAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotifyByEmailActionStructure }
     * 
     * 
     */
    public List<NotifyByEmailActionStructure> getNotifyByEmailAction() {
        if (notifyByEmailAction == null) {
            notifyByEmailAction = new ArrayList<NotifyByEmailActionStructure>();
        }
        return this.notifyByEmailAction;
    }

    /**
     * Recupera il valore della proprietà notifyBySmsAction.
     * 
     * @return
     *     possible object is
     *     {@link NotifyBySmsActionStructure }
     *     
     */
    public NotifyBySmsActionStructure getNotifyBySmsAction() {
        return notifyBySmsAction;
    }

    /**
     * Imposta il valore della proprietà notifyBySmsAction.
     * 
     * @param value
     *     allowed object is
     *     {@link NotifyBySmsActionStructure }
     *     
     */
    public void setNotifyBySmsAction(NotifyBySmsActionStructure value) {
        this.notifyBySmsAction = value;
    }

    /**
     * Gets the value of the notifyByPagerAction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notifyByPagerAction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotifyByPagerAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotifyByPagerActionStructure }
     * 
     * 
     */
    public List<NotifyByPagerActionStructure> getNotifyByPagerAction() {
        if (notifyByPagerAction == null) {
            notifyByPagerAction = new ArrayList<NotifyByPagerActionStructure>();
        }
        return this.notifyByPagerAction;
    }

    /**
     * Gets the value of the notifyUserAction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notifyUserAction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotifyUserAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotifyUserActionStructure }
     * 
     * 
     */
    public List<NotifyUserActionStructure> getNotifyUserAction() {
        if (notifyUserAction == null) {
            notifyUserAction = new ArrayList<NotifyUserActionStructure>();
        }
        return this.notifyUserAction;
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

    public ActionsStructure withPublishToWebAction(PublishToWebActionStructure... values) {
        if (values!= null) {
            for (PublishToWebActionStructure value: values) {
                getPublishToWebAction().add(value);
            }
        }
        return this;
    }

    public ActionsStructure withPublishToWebAction(Collection<PublishToWebActionStructure> values) {
        if (values!= null) {
            getPublishToWebAction().addAll(values);
        }
        return this;
    }

    public ActionsStructure withPublishToMobileAction(PublishToMobileActionStructure... values) {
        if (values!= null) {
            for (PublishToMobileActionStructure value: values) {
                getPublishToMobileAction().add(value);
            }
        }
        return this;
    }

    public ActionsStructure withPublishToMobileAction(Collection<PublishToMobileActionStructure> values) {
        if (values!= null) {
            getPublishToMobileAction().addAll(values);
        }
        return this;
    }

    public ActionsStructure withPublishToTvAction(PublishToTvActionStructure value) {
        setPublishToTvAction(value);
        return this;
    }

    public ActionsStructure withPublishToAlertsAction(PublishToAlertsActionStructure... values) {
        if (values!= null) {
            for (PublishToAlertsActionStructure value: values) {
                getPublishToAlertsAction().add(value);
            }
        }
        return this;
    }

    public ActionsStructure withPublishToAlertsAction(Collection<PublishToAlertsActionStructure> values) {
        if (values!= null) {
            getPublishToAlertsAction().addAll(values);
        }
        return this;
    }

    public ActionsStructure withManualAction(ManualAction... values) {
        if (values!= null) {
            for (ManualAction value: values) {
                getManualAction().add(value);
            }
        }
        return this;
    }

    public ActionsStructure withManualAction(Collection<ManualAction> values) {
        if (values!= null) {
            getManualAction().addAll(values);
        }
        return this;
    }

    public ActionsStructure withNotifyByEmailAction(NotifyByEmailActionStructure... values) {
        if (values!= null) {
            for (NotifyByEmailActionStructure value: values) {
                getNotifyByEmailAction().add(value);
            }
        }
        return this;
    }

    public ActionsStructure withNotifyByEmailAction(Collection<NotifyByEmailActionStructure> values) {
        if (values!= null) {
            getNotifyByEmailAction().addAll(values);
        }
        return this;
    }

    public ActionsStructure withNotifyBySmsAction(NotifyBySmsActionStructure value) {
        setNotifyBySmsAction(value);
        return this;
    }

    public ActionsStructure withNotifyByPagerAction(NotifyByPagerActionStructure... values) {
        if (values!= null) {
            for (NotifyByPagerActionStructure value: values) {
                getNotifyByPagerAction().add(value);
            }
        }
        return this;
    }

    public ActionsStructure withNotifyByPagerAction(Collection<NotifyByPagerActionStructure> values) {
        if (values!= null) {
            getNotifyByPagerAction().addAll(values);
        }
        return this;
    }

    public ActionsStructure withNotifyUserAction(NotifyUserActionStructure... values) {
        if (values!= null) {
            for (NotifyUserActionStructure value: values) {
                getNotifyUserAction().add(value);
            }
        }
        return this;
    }

    public ActionsStructure withNotifyUserAction(Collection<NotifyUserActionStructure> values) {
        if (values!= null) {
            getNotifyUserAction().addAll(values);
        }
        return this;
    }

    public ActionsStructure withExtensions(Object value) {
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

//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package de.vdv.ojp;

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
 * List of fare zones references within the area of a Fare Authority.
 * 
 * <p>Classe Java per TariffZoneRefListStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TariffZoneRefListStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.vdv.de/ojp}FareAuthorityRef"/&gt;
 *         &lt;element ref="{http://www.vdv.de/ojp}TariffZoneRef" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TariffZoneRefListStructure", propOrder = {
    "fareAuthorityRef",
    "tariffZoneRef"
})
public class TariffZoneRefListStructure {

    @XmlElement(name = "FareAuthorityRef", required = true)
    protected FareAuthorityRefStructure fareAuthorityRef;
    @XmlElement(name = "TariffZoneRef", required = true)
    protected List<TariffZoneRefStructure> tariffZoneRef;

    /**
     * Recupera il valore della proprietà fareAuthorityRef.
     * 
     * @return
     *     possible object is
     *     {@link FareAuthorityRefStructure }
     *     
     */
    public FareAuthorityRefStructure getFareAuthorityRef() {
        return fareAuthorityRef;
    }

    /**
     * Imposta il valore della proprietà fareAuthorityRef.
     * 
     * @param value
     *     allowed object is
     *     {@link FareAuthorityRefStructure }
     *     
     */
    public void setFareAuthorityRef(FareAuthorityRefStructure value) {
        this.fareAuthorityRef = value;
    }

    /**
     * Gets the value of the tariffZoneRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tariffZoneRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTariffZoneRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TariffZoneRefStructure }
     * 
     * 
     */
    public List<TariffZoneRefStructure> getTariffZoneRef() {
        if (tariffZoneRef == null) {
            tariffZoneRef = new ArrayList<TariffZoneRefStructure>();
        }
        return this.tariffZoneRef;
    }

    public TariffZoneRefListStructure withFareAuthorityRef(FareAuthorityRefStructure value) {
        setFareAuthorityRef(value);
        return this;
    }

    public TariffZoneRefListStructure withTariffZoneRef(TariffZoneRefStructure... values) {
        if (values!= null) {
            for (TariffZoneRefStructure value: values) {
                getTariffZoneRef().add(value);
            }
        }
        return this;
    }

    public TariffZoneRefListStructure withTariffZoneRef(Collection<TariffZoneRefStructure> values) {
        if (values!= null) {
            getTariffZoneRef().addAll(values);
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

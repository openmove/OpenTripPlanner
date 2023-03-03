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
 * List of fare zones within the area of a Fare Authority.
 * 
 * <p>Classe Java per TariffZoneListInAreaStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TariffZoneListInAreaStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}FareAuthorityGroup"/&gt;
 *         &lt;element name="TariffZone" type="{http://www.vdv.de/ojp}TariffZoneStructure" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TariffZoneListInAreaStructure", propOrder = {
    "fareAuthorityRef",
    "fareAuthorityText",
    "tariffZone"
})
public class TariffZoneListInAreaStructure {

    @XmlElement(name = "FareAuthorityRef", required = true)
    protected FareAuthorityRefStructure fareAuthorityRef;
    @XmlElement(name = "FareAuthorityText", required = true)
    protected String fareAuthorityText;
    @XmlElement(name = "TariffZone", required = true)
    protected List<TariffZoneStructure> tariffZone;

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
     * Recupera il valore della proprietà fareAuthorityText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareAuthorityText() {
        return fareAuthorityText;
    }

    /**
     * Imposta il valore della proprietà fareAuthorityText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareAuthorityText(String value) {
        this.fareAuthorityText = value;
    }

    /**
     * Gets the value of the tariffZone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tariffZone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTariffZone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TariffZoneStructure }
     * 
     * 
     */
    public List<TariffZoneStructure> getTariffZone() {
        if (tariffZone == null) {
            tariffZone = new ArrayList<TariffZoneStructure>();
        }
        return this.tariffZone;
    }

    public TariffZoneListInAreaStructure withFareAuthorityRef(FareAuthorityRefStructure value) {
        setFareAuthorityRef(value);
        return this;
    }

    public TariffZoneListInAreaStructure withFareAuthorityText(String value) {
        setFareAuthorityText(value);
        return this;
    }

    public TariffZoneListInAreaStructure withTariffZone(TariffZoneStructure... values) {
        if (values!= null) {
            for (TariffZoneStructure value: values) {
                getTariffZone().add(value);
            }
        }
        return this;
    }

    public TariffZoneListInAreaStructure withTariffZone(Collection<TariffZoneStructure> values) {
        if (values!= null) {
            getTariffZone().addAll(values);
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

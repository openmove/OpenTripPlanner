//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package de.vdv.ojp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * [a more clearly defined equivalent of TARIFF ZONE in TM and NeTEx] A ZONE used to define a zonal fare structure in a zone-counting or zone-matrix system.
 * 
 * <p>Classe Java per TariffZoneStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TariffZoneStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.vdv.de/ojp}TariffZoneRef"/&gt;
 *         &lt;element name="TariffZoneText" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TariffZoneStructure", propOrder = {
    "tariffZoneRef",
    "tariffZoneText"
})
public class TariffZoneStructure {

    @XmlElement(name = "TariffZoneRef", required = true)
    protected TariffZoneRefStructure tariffZoneRef;
    @XmlElement(name = "TariffZoneText", required = true)
    protected String tariffZoneText;

    /**
     * Recupera il valore della proprietà tariffZoneRef.
     * 
     * @return
     *     possible object is
     *     {@link TariffZoneRefStructure }
     *     
     */
    public TariffZoneRefStructure getTariffZoneRef() {
        return tariffZoneRef;
    }

    /**
     * Imposta il valore della proprietà tariffZoneRef.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffZoneRefStructure }
     *     
     */
    public void setTariffZoneRef(TariffZoneRefStructure value) {
        this.tariffZoneRef = value;
    }

    /**
     * Recupera il valore della proprietà tariffZoneText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariffZoneText() {
        return tariffZoneText;
    }

    /**
     * Imposta il valore della proprietà tariffZoneText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariffZoneText(String value) {
        this.tariffZoneText = value;
    }

    public TariffZoneStructure withTariffZoneRef(TariffZoneRefStructure value) {
        setTariffZoneRef(value);
        return this;
    }

    public TariffZoneStructure withTariffZoneText(String value) {
        setTariffZoneText(value);
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

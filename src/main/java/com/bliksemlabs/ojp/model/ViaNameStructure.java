//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package com.bliksemlabs.ojp.model;

import java.math.BigInteger;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per ViaNameStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ViaNameStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}PlaceNameStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ViaPriority" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViaNameStructure", propOrder = {
    "viaPriority"
})
public class ViaNameStructure
    extends PlaceNameStructure
{

    @XmlElement(name = "ViaPriority", defaultValue = "2")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger viaPriority;

    /**
     * Recupera il valore della proprietà viaPriority.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getViaPriority() {
        return viaPriority;
    }

    /**
     * Imposta il valore della proprietà viaPriority.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setViaPriority(BigInteger value) {
        this.viaPriority = value;
    }

    public ViaNameStructure withViaPriority(BigInteger value) {
        setViaPriority(value);
        return this;
    }

    @Override
    public ViaNameStructure withPlaceRef(JourneyPlaceRefStructure value) {
        setPlaceRef(value);
        return this;
    }

    @Override
    public ViaNameStructure withPlaceName(NaturalLanguagePlaceNameStructure... values) {
        if (values!= null) {
            for (NaturalLanguagePlaceNameStructure value: values) {
                getPlaceName().add(value);
            }
        }
        return this;
    }

    @Override
    public ViaNameStructure withPlaceName(Collection<NaturalLanguagePlaceNameStructure> values) {
        if (values!= null) {
            getPlaceName().addAll(values);
        }
        return this;
    }

    @Override
    public ViaNameStructure withPlaceShortName(NaturalLanguagePlaceNameStructure... values) {
        if (values!= null) {
            for (NaturalLanguagePlaceNameStructure value: values) {
                getPlaceShortName().add(value);
            }
        }
        return this;
    }

    @Override
    public ViaNameStructure withPlaceShortName(Collection<NaturalLanguagePlaceNameStructure> values) {
        if (values!= null) {
            getPlaceShortName().addAll(values);
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

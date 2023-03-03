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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per MobilityDisruptionStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="MobilityDisruptionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MobilityImpairedAccess" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}AccessFacility" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobilityDisruptionStructure", propOrder = {
    "mobilityImpairedAccess",
    "accessFacility"
})
public class MobilityDisruptionStructure {

    @XmlElement(name = "MobilityImpairedAccess")
    protected boolean mobilityImpairedAccess;
    @XmlElement(name = "AccessFacility", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected List<AccessFacilityEnumeration> accessFacility;

    /**
     * Recupera il valore della proprietà mobilityImpairedAccess.
     * 
     */
    public boolean isMobilityImpairedAccess() {
        return mobilityImpairedAccess;
    }

    /**
     * Imposta il valore della proprietà mobilityImpairedAccess.
     * 
     */
    public void setMobilityImpairedAccess(boolean value) {
        this.mobilityImpairedAccess = value;
    }

    /**
     * Gets the value of the accessFacility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accessFacility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessFacility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccessFacilityEnumeration }
     * 
     * 
     */
    public List<AccessFacilityEnumeration> getAccessFacility() {
        if (accessFacility == null) {
            accessFacility = new ArrayList<AccessFacilityEnumeration>();
        }
        return this.accessFacility;
    }

    public MobilityDisruptionStructure withMobilityImpairedAccess(boolean value) {
        setMobilityImpairedAccess(value);
        return this;
    }

    public MobilityDisruptionStructure withAccessFacility(AccessFacilityEnumeration... values) {
        if (values!= null) {
            for (AccessFacilityEnumeration value: values) {
                getAccessFacility().add(value);
            }
        }
        return this;
    }

    public MobilityDisruptionStructure withAccessFacility(Collection<AccessFacilityEnumeration> values) {
        if (values!= null) {
            getAccessFacility().addAll(values);
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

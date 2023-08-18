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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.bliksemlabs.ojp.model.AirSubmodesOfTransportEnumeration;
import com.bliksemlabs.ojp.model.BusSubmodesOfTransportEnumeration;
import com.bliksemlabs.ojp.model.CoachSubmodesOfTransportEnumeration;
import com.bliksemlabs.ojp.model.FunicularSubmodesOfTransportEnumeration;
import com.bliksemlabs.ojp.model.MetroSubmodesOfTransportEnumeration;
import com.bliksemlabs.ojp.model.RailSubmodesOfTransportEnumeration;
import com.bliksemlabs.ojp.model.TaxiSubmodesOfTransportEnumeration;
import com.bliksemlabs.ojp.model.TelecabinSubmodesOfTransportEnumeration;
import com.bliksemlabs.ojp.model.TramSubmodesOfTransportEnumeration;
import com.bliksemlabs.ojp.model.VehicleModesOfTransportEnumeration;
import com.bliksemlabs.ojp.model.WaterSubmodesOfTransportEnumeration;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * List of public transport modes ([from SIRI] mode of public transport service, corresponds to VEHICLE MODE) to include or exclude.
 * 
 * <p>Classe Java per PtModeFilterStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PtModeFilterStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Exclude" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PtMode" type="{http://www.siri.org.uk/siri}VehicleModesOfTransportEnumeration" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}PtModeChoiceGroup" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PtModeFilterStructure", propOrder = {
    "exclude",
    "ptMode",
    "ptModeChoiceGroup"
})
public class PtModeFilterStructure {

    @XmlElement(name = "Exclude", defaultValue = "true")
    protected Boolean exclude;
    @XmlElement(name = "PtMode")
    @XmlSchemaType(name = "NMTOKEN")
    protected List<VehicleModesOfTransportEnumeration> ptMode;
    @XmlElements({
        @XmlElement(name = "AirSubmode", namespace = "http://www.siri.org.uk/siri", type = AirSubmodesOfTransportEnumeration.class, defaultValue = "unknown"),
        @XmlElement(name = "BusSubmode", namespace = "http://www.siri.org.uk/siri", type = BusSubmodesOfTransportEnumeration.class, defaultValue = "unknown"),
        @XmlElement(name = "CoachSubmode", namespace = "http://www.siri.org.uk/siri", type = CoachSubmodesOfTransportEnumeration.class, defaultValue = "unknown"),
        @XmlElement(name = "FunicularSubmode", namespace = "http://www.siri.org.uk/siri", type = FunicularSubmodesOfTransportEnumeration.class, defaultValue = "unknown"),
        @XmlElement(name = "MetroSubmode", namespace = "http://www.siri.org.uk/siri", type = MetroSubmodesOfTransportEnumeration.class, defaultValue = "unknown"),
        @XmlElement(name = "TramSubmode", namespace = "http://www.siri.org.uk/siri", type = TramSubmodesOfTransportEnumeration.class, defaultValue = "unknown"),
        @XmlElement(name = "TelecabinSubmode", namespace = "http://www.siri.org.uk/siri", type = TelecabinSubmodesOfTransportEnumeration.class, defaultValue = "unknown"),
        @XmlElement(name = "RailSubmode", namespace = "http://www.siri.org.uk/siri", type = RailSubmodesOfTransportEnumeration.class, defaultValue = "unknown"),
        @XmlElement(name = "WaterSubmode", namespace = "http://www.siri.org.uk/siri", type = WaterSubmodesOfTransportEnumeration.class, defaultValue = "unknown"),
        @XmlElement(name = "TaxiSubmode", namespace = "http://www.siri.org.uk/siri", type = TaxiSubmodesOfTransportEnumeration.class, defaultValue = "unknown")
    })
    protected List<Object> ptModeChoiceGroup;

    /**
     * Recupera il valore della proprietà exclude.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExclude() {
        return exclude;
    }

    /**
     * Imposta il valore della proprietà exclude.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExclude(Boolean value) {
        this.exclude = value;
    }

    /**
     * Gets the value of the ptMode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ptMode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPtMode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleModesOfTransportEnumeration }
     * 
     * 
     */
    public List<VehicleModesOfTransportEnumeration> getPtMode() {
        if (ptMode == null) {
            ptMode = new ArrayList<VehicleModesOfTransportEnumeration>();
        }
        return this.ptMode;
    }

    /**
     * Gets the value of the ptModeChoiceGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ptModeChoiceGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPtModeChoiceGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirSubmodesOfTransportEnumeration }
     * {@link BusSubmodesOfTransportEnumeration }
     * {@link CoachSubmodesOfTransportEnumeration }
     * {@link FunicularSubmodesOfTransportEnumeration }
     * {@link MetroSubmodesOfTransportEnumeration }
     * {@link TramSubmodesOfTransportEnumeration }
     * {@link TelecabinSubmodesOfTransportEnumeration }
     * {@link RailSubmodesOfTransportEnumeration }
     * {@link WaterSubmodesOfTransportEnumeration }
     * {@link TaxiSubmodesOfTransportEnumeration }
     * 
     * 
     */
    public List<Object> getPtModeChoiceGroup() {
        if (ptModeChoiceGroup == null) {
            ptModeChoiceGroup = new ArrayList<Object>();
        }
        return this.ptModeChoiceGroup;
    }

    public PtModeFilterStructure withExclude(Boolean value) {
        setExclude(value);
        return this;
    }

    public PtModeFilterStructure withPtMode(VehicleModesOfTransportEnumeration... values) {
        if (values!= null) {
            for (VehicleModesOfTransportEnumeration value: values) {
                getPtMode().add(value);
            }
        }
        return this;
    }

    public PtModeFilterStructure withPtMode(Collection<VehicleModesOfTransportEnumeration> values) {
        if (values!= null) {
            getPtMode().addAll(values);
        }
        return this;
    }

    public PtModeFilterStructure withPtModeChoiceGroup(Object... values) {
        if (values!= null) {
            for (Object value: values) {
                getPtModeChoiceGroup().add(value);
            }
        }
        return this;
    }

    public PtModeFilterStructure withPtModeChoiceGroup(Collection<Object> values) {
        if (values!= null) {
            getPtModeChoiceGroup().addAll(values);
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

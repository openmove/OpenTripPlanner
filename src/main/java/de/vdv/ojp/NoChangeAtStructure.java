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
import com.bliksemlabs.ojp.model.StopPointRefStructure;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * no-change-at restrictions for a TRIP, i.e. SCHEDULED STOP POINTs or STOP PLACEs at which no TRANSFER is allowed within a TRIP.
 * 
 * <p>Classe Java per NoChangeAtStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="NoChangeAtStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.siri.org.uk/siri}StopPointRef"/&gt;
 *           &lt;element ref="{http://www.vdv.de/ojp}StopPlaceRef"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NoChangeAtStructure", propOrder = {
    "stopPointRef",
    "stopPlaceRef"
})
public class NoChangeAtStructure {

    @XmlElement(name = "StopPointRef", namespace = "http://www.siri.org.uk/siri")
    protected StopPointRefStructure stopPointRef;
    @XmlElement(name = "StopPlaceRef")
    protected StopPlaceRefStructure stopPlaceRef;

    /**
     * Recupera il valore della proprietà stopPointRef.
     * 
     * @return
     *     possible object is
     *     {@link StopPointRefStructure }
     *     
     */
    public StopPointRefStructure getStopPointRef() {
        return stopPointRef;
    }

    /**
     * Imposta il valore della proprietà stopPointRef.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointRefStructure }
     *     
     */
    public void setStopPointRef(StopPointRefStructure value) {
        this.stopPointRef = value;
    }

    /**
     * Recupera il valore della proprietà stopPlaceRef.
     * 
     * @return
     *     possible object is
     *     {@link StopPlaceRefStructure }
     *     
     */
    public StopPlaceRefStructure getStopPlaceRef() {
        return stopPlaceRef;
    }

    /**
     * Imposta il valore della proprietà stopPlaceRef.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPlaceRefStructure }
     *     
     */
    public void setStopPlaceRef(StopPlaceRefStructure value) {
        this.stopPlaceRef = value;
    }

    public NoChangeAtStructure withStopPointRef(StopPointRefStructure value) {
        setStopPointRef(value);
        return this;
    }

    public NoChangeAtStructure withStopPlaceRef(StopPlaceRefStructure value) {
        setStopPlaceRef(value);
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

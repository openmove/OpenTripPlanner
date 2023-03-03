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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.bliksemlabs.ojp.model.ParticipantRefStructure;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * a single stage of a TRIP that is made without change of MODE or service (ie: between each interchange)
 * 
 * <p>Classe Java per TripLegStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TripLegStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LegId" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN"/&gt;
 *         &lt;element name="ParticipantRef" type="{http://www.siri.org.uk/siri}ParticipantRefStructure" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="TimedLeg" type="{http://www.vdv.de/ojp}TimedLegStructure"/&gt;
 *           &lt;element name="TransferLeg" type="{http://www.vdv.de/ojp}TransferLegStructure"/&gt;
 *           &lt;element name="ContinuousLeg" type="{http://www.vdv.de/ojp}ContinuousLegStructure"/&gt;
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
@XmlType(name = "TripLegStructure", propOrder = {
    "legId",
    "participantRef",
    "timedLeg",
    "transferLeg",
    "continuousLeg"
})
public class TripLegStructure {

    @XmlElement(name = "LegId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String legId;
    @XmlElement(name = "ParticipantRef")
    protected ParticipantRefStructure participantRef;
    @XmlElement(name = "TimedLeg")
    protected TimedLegStructure timedLeg;
    @XmlElement(name = "TransferLeg")
    protected TransferLegStructure transferLeg;
    @XmlElement(name = "ContinuousLeg")
    protected ContinuousLegStructure continuousLeg;

    /**
     * Recupera il valore della proprietà legId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegId() {
        return legId;
    }

    /**
     * Imposta il valore della proprietà legId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegId(String value) {
        this.legId = value;
    }

    /**
     * Recupera il valore della proprietà participantRef.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantRefStructure }
     *     
     */
    public ParticipantRefStructure getParticipantRef() {
        return participantRef;
    }

    /**
     * Imposta il valore della proprietà participantRef.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantRefStructure }
     *     
     */
    public void setParticipantRef(ParticipantRefStructure value) {
        this.participantRef = value;
    }

    /**
     * Recupera il valore della proprietà timedLeg.
     * 
     * @return
     *     possible object is
     *     {@link TimedLegStructure }
     *     
     */
    public TimedLegStructure getTimedLeg() {
        return timedLeg;
    }

    /**
     * Imposta il valore della proprietà timedLeg.
     * 
     * @param value
     *     allowed object is
     *     {@link TimedLegStructure }
     *     
     */
    public void setTimedLeg(TimedLegStructure value) {
        this.timedLeg = value;
    }

    /**
     * Recupera il valore della proprietà transferLeg.
     * 
     * @return
     *     possible object is
     *     {@link TransferLegStructure }
     *     
     */
    public TransferLegStructure getTransferLeg() {
        return transferLeg;
    }

    /**
     * Imposta il valore della proprietà transferLeg.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferLegStructure }
     *     
     */
    public void setTransferLeg(TransferLegStructure value) {
        this.transferLeg = value;
    }

    /**
     * Recupera il valore della proprietà continuousLeg.
     * 
     * @return
     *     possible object is
     *     {@link ContinuousLegStructure }
     *     
     */
    public ContinuousLegStructure getContinuousLeg() {
        return continuousLeg;
    }

    /**
     * Imposta il valore della proprietà continuousLeg.
     * 
     * @param value
     *     allowed object is
     *     {@link ContinuousLegStructure }
     *     
     */
    public void setContinuousLeg(ContinuousLegStructure value) {
        this.continuousLeg = value;
    }

    public TripLegStructure withLegId(String value) {
        setLegId(value);
        return this;
    }

    public TripLegStructure withParticipantRef(ParticipantRefStructure value) {
        setParticipantRef(value);
        return this;
    }

    public TripLegStructure withTimedLeg(TimedLegStructure value) {
        setTimedLeg(value);
        return this;
    }

    public TripLegStructure withTransferLeg(TransferLegStructure value) {
        setTransferLeg(value);
        return this;
    }

    public TripLegStructure withContinuousLeg(ContinuousLegStructure value) {
        setContinuousLeg(value);
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

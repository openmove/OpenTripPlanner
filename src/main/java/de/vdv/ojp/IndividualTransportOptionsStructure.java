//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package de.vdv.ojp;

import java.math.BigInteger;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.bliksemlabs.ojp.model.SelfDriveSubmodesOfTransportEnumeration;
import com.bliksemlabs.ojp.model.TaxiSubmodesOfTransportEnumeration;
import com.migesok.jaxb.adapter.javatime.DurationXmlAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * Individual modes and their usage limits as stated by the passenger
 * 
 * <p>Classe Java per IndividualTransportOptionsStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="IndividualTransportOptionsStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Mode" type="{http://www.vdv.de/ojp}IndividualModesEnumeration"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}PrivateModeChoiceGroup" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MaxDistance" type="{http://www.siri.org.uk/siri}DistanceType" minOccurs="0"/&gt;
 *         &lt;element name="MaxDuration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="MinDistance" type="{http://www.siri.org.uk/siri}DistanceType" minOccurs="0"/&gt;
 *         &lt;element name="MinDuration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="Speed" type="{http://www.vdv.de/ojp}OpenPercentType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualTransportOptionsStructure", propOrder = {
    "mode",
    "privateModeChoiceGroup",
    "maxDistance",
    "maxDuration",
    "minDistance",
    "minDuration",
    "speed"
})
public class IndividualTransportOptionsStructure {

    @XmlElement(name = "Mode", required = true)
    @XmlSchemaType(name = "string")
    protected IndividualModesEnumeration mode;
    @XmlElements({
        @XmlElement(name = "TaxiSubmode", namespace = "http://www.siri.org.uk/siri", type = TaxiSubmodesOfTransportEnumeration.class, defaultValue = "unknown"),
        @XmlElement(name = "SelfDriveSubmode", namespace = "http://www.siri.org.uk/siri", type = SelfDriveSubmodesOfTransportEnumeration.class, defaultValue = "unknown")
    })
    protected List<Object> privateModeChoiceGroup;
    @XmlElement(name = "MaxDistance")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maxDistance;
    @XmlElement(name = "MaxDuration", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration maxDuration;
    @XmlElement(name = "MinDistance")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger minDistance;
    @XmlElement(name = "MinDuration", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration minDuration;
    @XmlElement(name = "Speed")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger speed;

    /**
     * Recupera il valore della proprietà mode.
     * 
     * @return
     *     possible object is
     *     {@link IndividualModesEnumeration }
     *     
     */
    public IndividualModesEnumeration getMode() {
        return mode;
    }

    /**
     * Imposta il valore della proprietà mode.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualModesEnumeration }
     *     
     */
    public void setMode(IndividualModesEnumeration value) {
        this.mode = value;
    }

    /**
     * Gets the value of the privateModeChoiceGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the privateModeChoiceGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrivateModeChoiceGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxiSubmodesOfTransportEnumeration }
     * {@link SelfDriveSubmodesOfTransportEnumeration }
     * 
     * 
     */
    public List<Object> getPrivateModeChoiceGroup() {
        if (privateModeChoiceGroup == null) {
            privateModeChoiceGroup = new ArrayList<Object>();
        }
        return this.privateModeChoiceGroup;
    }

    /**
     * Recupera il valore della proprietà maxDistance.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxDistance() {
        return maxDistance;
    }

    /**
     * Imposta il valore della proprietà maxDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxDistance(BigInteger value) {
        this.maxDistance = value;
    }

    /**
     * Recupera il valore della proprietà maxDuration.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getMaxDuration() {
        return maxDuration;
    }

    /**
     * Imposta il valore della proprietà maxDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxDuration(Duration value) {
        this.maxDuration = value;
    }

    /**
     * Recupera il valore della proprietà minDistance.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinDistance() {
        return minDistance;
    }

    /**
     * Imposta il valore della proprietà minDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinDistance(BigInteger value) {
        this.minDistance = value;
    }

    /**
     * Recupera il valore della proprietà minDuration.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getMinDuration() {
        return minDuration;
    }

    /**
     * Imposta il valore della proprietà minDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinDuration(Duration value) {
        this.minDuration = value;
    }

    /**
     * Recupera il valore della proprietà speed.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSpeed() {
        return speed;
    }

    /**
     * Imposta il valore della proprietà speed.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSpeed(BigInteger value) {
        this.speed = value;
    }

    public IndividualTransportOptionsStructure withMode(IndividualModesEnumeration value) {
        setMode(value);
        return this;
    }

    public IndividualTransportOptionsStructure withPrivateModeChoiceGroup(Object... values) {
        if (values!= null) {
            for (Object value: values) {
                getPrivateModeChoiceGroup().add(value);
            }
        }
        return this;
    }

    public IndividualTransportOptionsStructure withPrivateModeChoiceGroup(Collection<Object> values) {
        if (values!= null) {
            getPrivateModeChoiceGroup().addAll(values);
        }
        return this;
    }

    public IndividualTransportOptionsStructure withMaxDistance(BigInteger value) {
        setMaxDistance(value);
        return this;
    }

    public IndividualTransportOptionsStructure withMaxDuration(Duration value) {
        setMaxDuration(value);
        return this;
    }

    public IndividualTransportOptionsStructure withMinDistance(BigInteger value) {
        setMinDistance(value);
        return this;
    }

    public IndividualTransportOptionsStructure withMinDuration(Duration value) {
        setMinDuration(value);
        return this;
    }

    public IndividualTransportOptionsStructure withSpeed(BigInteger value) {
        setSpeed(value);
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

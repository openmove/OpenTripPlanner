//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package de.vdv.ojp;

import java.time.Duration;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.bliksemlabs.ojp.model.OperatorRefStructure;
import com.migesok.jaxb.adapter.javatime.DurationXmlAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * Service that provides shared vehicles.
 * 
 * <p>Classe Java per SharingServiceStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SharingServiceStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OperatorRef" type="{http://www.siri.org.uk/siri}OperatorRefStructure"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SharingModel" type="{http://www.vdv.de/ojp}SharingModelEnumeration" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}SharingServiceUsageGroup" minOccurs="0"/&gt;
 *         &lt;element name="InfoURL" type="{http://www.vdv.de/ojp}WebLinkStructure" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SharingServiceStructure", propOrder = {
    "operatorRef",
    "name",
    "sharingModel",
    "timeBufferBefore",
    "timeBufferAfter",
    "infoURL"
})
public class SharingServiceStructure {

    @XmlElement(name = "OperatorRef", required = true)
    protected OperatorRefStructure operatorRef;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "SharingModel")
    @XmlSchemaType(name = "NMTOKEN")
    protected SharingModelEnumeration sharingModel;
    @XmlElement(name = "TimeBufferBefore", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration timeBufferBefore;
    @XmlElement(name = "TimeBufferAfter", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration timeBufferAfter;
    @XmlElement(name = "InfoURL")
    protected WebLinkStructure infoURL;

    /**
     * Recupera il valore della proprietà operatorRef.
     * 
     * @return
     *     possible object is
     *     {@link OperatorRefStructure }
     *     
     */
    public OperatorRefStructure getOperatorRef() {
        return operatorRef;
    }

    /**
     * Imposta il valore della proprietà operatorRef.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorRefStructure }
     *     
     */
    public void setOperatorRef(OperatorRefStructure value) {
        this.operatorRef = value;
    }

    /**
     * Recupera il valore della proprietà name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Imposta il valore della proprietà name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Recupera il valore della proprietà sharingModel.
     * 
     * @return
     *     possible object is
     *     {@link SharingModelEnumeration }
     *     
     */
    public SharingModelEnumeration getSharingModel() {
        return sharingModel;
    }

    /**
     * Imposta il valore della proprietà sharingModel.
     * 
     * @param value
     *     allowed object is
     *     {@link SharingModelEnumeration }
     *     
     */
    public void setSharingModel(SharingModelEnumeration value) {
        this.sharingModel = value;
    }

    /**
     * Recupera il valore della proprietà timeBufferBefore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getTimeBufferBefore() {
        return timeBufferBefore;
    }

    /**
     * Imposta il valore della proprietà timeBufferBefore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeBufferBefore(Duration value) {
        this.timeBufferBefore = value;
    }

    /**
     * Recupera il valore della proprietà timeBufferAfter.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getTimeBufferAfter() {
        return timeBufferAfter;
    }

    /**
     * Imposta il valore della proprietà timeBufferAfter.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeBufferAfter(Duration value) {
        this.timeBufferAfter = value;
    }

    /**
     * Recupera il valore della proprietà infoURL.
     * 
     * @return
     *     possible object is
     *     {@link WebLinkStructure }
     *     
     */
    public WebLinkStructure getInfoURL() {
        return infoURL;
    }

    /**
     * Imposta il valore della proprietà infoURL.
     * 
     * @param value
     *     allowed object is
     *     {@link WebLinkStructure }
     *     
     */
    public void setInfoURL(WebLinkStructure value) {
        this.infoURL = value;
    }

    public SharingServiceStructure withOperatorRef(OperatorRefStructure value) {
        setOperatorRef(value);
        return this;
    }

    public SharingServiceStructure withName(String value) {
        setName(value);
        return this;
    }

    public SharingServiceStructure withSharingModel(SharingModelEnumeration value) {
        setSharingModel(value);
        return this;
    }

    public SharingServiceStructure withTimeBufferBefore(Duration value) {
        setTimeBufferBefore(value);
        return this;
    }

    public SharingServiceStructure withTimeBufferAfter(Duration value) {
        setTimeBufferAfter(value);
        return this;
    }

    public SharingServiceStructure withInfoURL(WebLinkStructure value) {
        setInfoURL(value);
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

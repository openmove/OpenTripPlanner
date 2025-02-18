//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per TrafficViewRecord complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TrafficViewRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="recordSequenceNumber" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger"/&gt;
 *         &lt;element name="trafficElement" type="{http://datex2.eu/schema/2_0RC1/2_0}TrafficElement" minOccurs="0"/&gt;
 *         &lt;element name="operatorAction" type="{http://datex2.eu/schema/2_0RC1/2_0}OperatorAction" minOccurs="0"/&gt;
 *         &lt;element name="elaboratedData" type="{http://datex2.eu/schema/2_0RC1/2_0}ElaboratedData" minOccurs="0"/&gt;
 *         &lt;element name="urlLink" type="{http://datex2.eu/schema/2_0RC1/2_0}UrlLink" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="trafficViewRecordExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficViewRecord", propOrder = {
    "recordSequenceNumber",
    "trafficElement",
    "operatorAction",
    "elaboratedData",
    "urlLink",
    "trafficViewRecordExtension"
})
public class TrafficViewRecord {

    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger recordSequenceNumber;
    protected TrafficElement trafficElement;
    protected OperatorAction operatorAction;
    protected ElaboratedData elaboratedData;
    protected List<UrlLink> urlLink;
    protected ExtensionType trafficViewRecordExtension;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Recupera il valore della proprietà recordSequenceNumber.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRecordSequenceNumber() {
        return recordSequenceNumber;
    }

    /**
     * Imposta il valore della proprietà recordSequenceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRecordSequenceNumber(BigInteger value) {
        this.recordSequenceNumber = value;
    }

    /**
     * Recupera il valore della proprietà trafficElement.
     * 
     * @return
     *     possible object is
     *     {@link TrafficElement }
     *     
     */
    public TrafficElement getTrafficElement() {
        return trafficElement;
    }

    /**
     * Imposta il valore della proprietà trafficElement.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficElement }
     *     
     */
    public void setTrafficElement(TrafficElement value) {
        this.trafficElement = value;
    }

    /**
     * Recupera il valore della proprietà operatorAction.
     * 
     * @return
     *     possible object is
     *     {@link OperatorAction }
     *     
     */
    public OperatorAction getOperatorAction() {
        return operatorAction;
    }

    /**
     * Imposta il valore della proprietà operatorAction.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorAction }
     *     
     */
    public void setOperatorAction(OperatorAction value) {
        this.operatorAction = value;
    }

    /**
     * Recupera il valore della proprietà elaboratedData.
     * 
     * @return
     *     possible object is
     *     {@link ElaboratedData }
     *     
     */
    public ElaboratedData getElaboratedData() {
        return elaboratedData;
    }

    /**
     * Imposta il valore della proprietà elaboratedData.
     * 
     * @param value
     *     allowed object is
     *     {@link ElaboratedData }
     *     
     */
    public void setElaboratedData(ElaboratedData value) {
        this.elaboratedData = value;
    }

    /**
     * Gets the value of the urlLink property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the urlLink property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUrlLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UrlLink }
     * 
     * 
     */
    public List<UrlLink> getUrlLink() {
        if (urlLink == null) {
            urlLink = new ArrayList<UrlLink>();
        }
        return this.urlLink;
    }

    /**
     * Recupera il valore della proprietà trafficViewRecordExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTrafficViewRecordExtension() {
        return trafficViewRecordExtension;
    }

    /**
     * Imposta il valore della proprietà trafficViewRecordExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTrafficViewRecordExtension(ExtensionType value) {
        this.trafficViewRecordExtension = value;
    }

    /**
     * Recupera il valore della proprietà id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Imposta il valore della proprietà id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    public TrafficViewRecord withRecordSequenceNumber(BigInteger value) {
        setRecordSequenceNumber(value);
        return this;
    }

    public TrafficViewRecord withTrafficElement(TrafficElement value) {
        setTrafficElement(value);
        return this;
    }

    public TrafficViewRecord withOperatorAction(OperatorAction value) {
        setOperatorAction(value);
        return this;
    }

    public TrafficViewRecord withElaboratedData(ElaboratedData value) {
        setElaboratedData(value);
        return this;
    }

    public TrafficViewRecord withUrlLink(UrlLink... values) {
        if (values!= null) {
            for (UrlLink value: values) {
                getUrlLink().add(value);
            }
        }
        return this;
    }

    public TrafficViewRecord withUrlLink(Collection<UrlLink> values) {
        if (values!= null) {
            getUrlLink().addAll(values);
        }
        return this;
    }

    public TrafficViewRecord withTrafficViewRecordExtension(ExtensionType value) {
        setTrafficViewRecordExtension(value);
        return this;
    }

    public TrafficViewRecord withId(String value) {
        setId(value);
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

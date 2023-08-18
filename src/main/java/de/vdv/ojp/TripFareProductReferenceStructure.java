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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * Element that connects FareProducts to trips. A TripFareProduct is a FAREPRODUCT covering a part or the whole of a TRIP from boarding the first public transport vehicle to alighting from the last public transport vehicle (corresponds to a package of PREASSIGNED FARE PRODUCTs)
 * 
 * <p>Classe Java per TripFareProductReferenceStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TripFareProductReferenceStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.vdv.de/ojp}FareProductRef"/&gt;
 *         &lt;element name="FromTripIdRef" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN"/&gt;
 *         &lt;element name="FromTripLegIdRef" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" minOccurs="0"/&gt;
 *         &lt;element name="ToTripIdRef" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN"/&gt;
 *         &lt;element name="ToTripLegIdRef" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TripFareProductReferenceStructure", propOrder = {
    "fareProductRef",
    "fromTripIdRef",
    "fromTripLegIdRef",
    "toTripIdRef",
    "toTripLegIdRef"
})
public class TripFareProductReferenceStructure {

    @XmlElement(name = "FareProductRef", required = true)
    protected FareProductRefStructure fareProductRef;
    @XmlElement(name = "FromTripIdRef", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String fromTripIdRef;
    @XmlElement(name = "FromTripLegIdRef")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String fromTripLegIdRef;
    @XmlElement(name = "ToTripIdRef", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String toTripIdRef;
    @XmlElement(name = "ToTripLegIdRef")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String toTripLegIdRef;

    /**
     * Recupera il valore della proprietà fareProductRef.
     * 
     * @return
     *     possible object is
     *     {@link FareProductRefStructure }
     *     
     */
    public FareProductRefStructure getFareProductRef() {
        return fareProductRef;
    }

    /**
     * Imposta il valore della proprietà fareProductRef.
     * 
     * @param value
     *     allowed object is
     *     {@link FareProductRefStructure }
     *     
     */
    public void setFareProductRef(FareProductRefStructure value) {
        this.fareProductRef = value;
    }

    /**
     * Recupera il valore della proprietà fromTripIdRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromTripIdRef() {
        return fromTripIdRef;
    }

    /**
     * Imposta il valore della proprietà fromTripIdRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromTripIdRef(String value) {
        this.fromTripIdRef = value;
    }

    /**
     * Recupera il valore della proprietà fromTripLegIdRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromTripLegIdRef() {
        return fromTripLegIdRef;
    }

    /**
     * Imposta il valore della proprietà fromTripLegIdRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromTripLegIdRef(String value) {
        this.fromTripLegIdRef = value;
    }

    /**
     * Recupera il valore della proprietà toTripIdRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToTripIdRef() {
        return toTripIdRef;
    }

    /**
     * Imposta il valore della proprietà toTripIdRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToTripIdRef(String value) {
        this.toTripIdRef = value;
    }

    /**
     * Recupera il valore della proprietà toTripLegIdRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToTripLegIdRef() {
        return toTripLegIdRef;
    }

    /**
     * Imposta il valore della proprietà toTripLegIdRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToTripLegIdRef(String value) {
        this.toTripLegIdRef = value;
    }

    public TripFareProductReferenceStructure withFareProductRef(FareProductRefStructure value) {
        setFareProductRef(value);
        return this;
    }

    public TripFareProductReferenceStructure withFromTripIdRef(String value) {
        setFromTripIdRef(value);
        return this;
    }

    public TripFareProductReferenceStructure withFromTripLegIdRef(String value) {
        setFromTripLegIdRef(value);
        return this;
    }

    public TripFareProductReferenceStructure withToTripIdRef(String value) {
        setToTripIdRef(value);
        return this;
    }

    public TripFareProductReferenceStructure withToTripLegIdRef(String value) {
        setToTripLegIdRef(value);
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

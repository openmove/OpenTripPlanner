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
 * TripInfo request parameter structure.
 * 
 * <p>Classe Java per TripInfoParamStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TripInfoParamStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}TripInfoPolicyGroup"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}TripInfoContentFilterGroup"/&gt;
 *         &lt;element name="Extension" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TripInfoParamStructure", propOrder = {
    "useTimetabledDataOnly",
    "includeCalls",
    "includePosition",
    "includeService",
    "includeTrackSections",
    "includeTrackProjection",
    "extension"
})
public class TripInfoParamStructure {

    @XmlElement(name = "UseTimetabledDataOnly", defaultValue = "false")
    protected Boolean useTimetabledDataOnly;
    @XmlElement(name = "IncludeCalls", defaultValue = "true")
    protected Boolean includeCalls;
    @XmlElement(name = "IncludePosition", defaultValue = "true")
    protected Boolean includePosition;
    @XmlElement(name = "IncludeService", defaultValue = "true")
    protected Boolean includeService;
    @XmlElement(name = "IncludeTrackSections", defaultValue = "false")
    protected Boolean includeTrackSections;
    @XmlElement(name = "IncludeTrackProjection", defaultValue = "false")
    protected Boolean includeTrackProjection;
    @XmlElement(name = "Extension")
    protected Object extension;

    /**
     * Recupera il valore della proprietà useTimetabledDataOnly.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseTimetabledDataOnly() {
        return useTimetabledDataOnly;
    }

    /**
     * Imposta il valore della proprietà useTimetabledDataOnly.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseTimetabledDataOnly(Boolean value) {
        this.useTimetabledDataOnly = value;
    }

    /**
     * Recupera il valore della proprietà includeCalls.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeCalls() {
        return includeCalls;
    }

    /**
     * Imposta il valore della proprietà includeCalls.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeCalls(Boolean value) {
        this.includeCalls = value;
    }

    /**
     * Recupera il valore della proprietà includePosition.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludePosition() {
        return includePosition;
    }

    /**
     * Imposta il valore della proprietà includePosition.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludePosition(Boolean value) {
        this.includePosition = value;
    }

    /**
     * Recupera il valore della proprietà includeService.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeService() {
        return includeService;
    }

    /**
     * Imposta il valore della proprietà includeService.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeService(Boolean value) {
        this.includeService = value;
    }

    /**
     * Recupera il valore della proprietà includeTrackSections.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeTrackSections() {
        return includeTrackSections;
    }

    /**
     * Imposta il valore della proprietà includeTrackSections.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeTrackSections(Boolean value) {
        this.includeTrackSections = value;
    }

    /**
     * Recupera il valore della proprietà includeTrackProjection.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeTrackProjection() {
        return includeTrackProjection;
    }

    /**
     * Imposta il valore della proprietà includeTrackProjection.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeTrackProjection(Boolean value) {
        this.includeTrackProjection = value;
    }

    /**
     * Recupera il valore della proprietà extension.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExtension() {
        return extension;
    }

    /**
     * Imposta il valore della proprietà extension.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExtension(Object value) {
        this.extension = value;
    }

    public TripInfoParamStructure withUseTimetabledDataOnly(Boolean value) {
        setUseTimetabledDataOnly(value);
        return this;
    }

    public TripInfoParamStructure withIncludeCalls(Boolean value) {
        setIncludeCalls(value);
        return this;
    }

    public TripInfoParamStructure withIncludePosition(Boolean value) {
        setIncludePosition(value);
        return this;
    }

    public TripInfoParamStructure withIncludeService(Boolean value) {
        setIncludeService(value);
        return this;
    }

    public TripInfoParamStructure withIncludeTrackSections(Boolean value) {
        setIncludeTrackSections(value);
        return this;
    }

    public TripInfoParamStructure withIncludeTrackProjection(Boolean value) {
        setIncludeTrackProjection(value);
        return this;
    }

    public TripInfoParamStructure withExtension(Object value) {
        setExtension(value);
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

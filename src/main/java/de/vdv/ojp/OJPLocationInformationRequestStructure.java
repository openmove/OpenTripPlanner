//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package de.vdv.ojp;

import java.time.LocalDateTime;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bliksemlabs.ojp.model.DataFrameRefStructure;
import com.bliksemlabs.ojp.model.ExtensionsStructure;
import com.bliksemlabs.ojp.model.MessageQualifierStructure;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per OJPLocationInformationRequestStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="OJPLocationInformationRequestStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.vdv.de/ojp}AbstractOJPServiceRequestStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}LocationInformationRequestGroup"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OJPLocationInformationRequestStructure", propOrder = {
    "initialInput",
    "placeRef",
    "restrictions",
    "extensions"
})
public class OJPLocationInformationRequestStructure
    extends AbstractOJPServiceRequestStructure
{

    @XmlElement(name = "InitialInput")
    protected InitialLocationInputStructure initialInput;
    @XmlElement(name = "PlaceRef")
    protected PlaceRefStructure placeRef;
    @XmlElement(name = "Restrictions")
    protected PlaceParamStructure restrictions;
    @XmlElement(name = "Extensions", namespace = "http://www.siri.org.uk/siri")
    protected ExtensionsStructure extensions;

    /**
     * Recupera il valore della proprietà initialInput.
     * 
     * @return
     *     possible object is
     *     {@link InitialLocationInputStructure }
     *     
     */
    public InitialLocationInputStructure getInitialInput() {
        return initialInput;
    }

    /**
     * Imposta il valore della proprietà initialInput.
     * 
     * @param value
     *     allowed object is
     *     {@link InitialLocationInputStructure }
     *     
     */
    public void setInitialInput(InitialLocationInputStructure value) {
        this.initialInput = value;
    }

    /**
     * Recupera il valore della proprietà placeRef.
     * 
     * @return
     *     possible object is
     *     {@link PlaceRefStructure }
     *     
     */
    public PlaceRefStructure getPlaceRef() {
        return placeRef;
    }

    /**
     * Imposta il valore della proprietà placeRef.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceRefStructure }
     *     
     */
    public void setPlaceRef(PlaceRefStructure value) {
        this.placeRef = value;
    }

    /**
     * Recupera il valore della proprietà restrictions.
     * 
     * @return
     *     possible object is
     *     {@link PlaceParamStructure }
     *     
     */
    public PlaceParamStructure getRestrictions() {
        return restrictions;
    }

    /**
     * Imposta il valore della proprietà restrictions.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceParamStructure }
     *     
     */
    public void setRestrictions(PlaceParamStructure value) {
        this.restrictions = value;
    }

    /**
     * Recupera il valore della proprietà extensions.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsStructure }
     *     
     */
    public ExtensionsStructure getExtensions() {
        return extensions;
    }

    /**
     * Imposta il valore della proprietà extensions.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsStructure }
     *     
     */
    public void setExtensions(ExtensionsStructure value) {
        this.extensions = value;
    }

    public OJPLocationInformationRequestStructure withInitialInput(InitialLocationInputStructure value) {
        setInitialInput(value);
        return this;
    }

    public OJPLocationInformationRequestStructure withPlaceRef(PlaceRefStructure value) {
        setPlaceRef(value);
        return this;
    }

    public OJPLocationInformationRequestStructure withRestrictions(PlaceParamStructure value) {
        setRestrictions(value);
        return this;
    }

    public OJPLocationInformationRequestStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public OJPLocationInformationRequestStructure withDataFrameRef(DataFrameRefStructure value) {
        setDataFrameRef(value);
        return this;
    }

    @Override
    public OJPLocationInformationRequestStructure withExtension(Object value) {
        setExtension(value);
        return this;
    }

    @Override
    public OJPLocationInformationRequestStructure withMessageIdentifier(MessageQualifierStructure value) {
        setMessageIdentifier(value);
        return this;
    }

    @Override
    public OJPLocationInformationRequestStructure withRequestTimestamp(LocalDateTime value) {
        setRequestTimestamp(value);
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

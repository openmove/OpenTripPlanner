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
 * <p>Classe Java per OJPExchangePointsRequestStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="OJPExchangePointsRequestStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.vdv.de/ojp}AbstractOJPServiceRequestStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}ExchangePointsRequestGroup"/&gt;
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
@XmlType(name = "OJPExchangePointsRequestStructure", propOrder = {
    "placeRef",
    "params",
    "extensions"
})
public class OJPExchangePointsRequestStructure
    extends AbstractOJPServiceRequestStructure
{

    @XmlElement(name = "PlaceRef")
    protected PlaceRefStructure placeRef;
    @XmlElement(name = "Params")
    protected ExchangePointsParamStructure params;
    @XmlElement(name = "Extensions", namespace = "http://www.siri.org.uk/siri")
    protected ExtensionsStructure extensions;

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
     * Recupera il valore della proprietà params.
     * 
     * @return
     *     possible object is
     *     {@link ExchangePointsParamStructure }
     *     
     */
    public ExchangePointsParamStructure getParams() {
        return params;
    }

    /**
     * Imposta il valore della proprietà params.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangePointsParamStructure }
     *     
     */
    public void setParams(ExchangePointsParamStructure value) {
        this.params = value;
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

    public OJPExchangePointsRequestStructure withPlaceRef(PlaceRefStructure value) {
        setPlaceRef(value);
        return this;
    }

    public OJPExchangePointsRequestStructure withParams(ExchangePointsParamStructure value) {
        setParams(value);
        return this;
    }

    public OJPExchangePointsRequestStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public OJPExchangePointsRequestStructure withDataFrameRef(DataFrameRefStructure value) {
        setDataFrameRef(value);
        return this;
    }

    @Override
    public OJPExchangePointsRequestStructure withExtension(Object value) {
        setExtension(value);
        return this;
    }

    @Override
    public OJPExchangePointsRequestStructure withMessageIdentifier(MessageQualifierStructure value) {
        setMessageIdentifier(value);
        return this;
    }

    @Override
    public OJPExchangePointsRequestStructure withRequestTimestamp(LocalDateTime value) {
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

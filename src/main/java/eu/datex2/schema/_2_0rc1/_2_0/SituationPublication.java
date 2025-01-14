//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per SituationPublication complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SituationPublication"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}PayloadPublication"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="situation" type="{http://datex2.eu/schema/2_0RC1/2_0}Situation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="situationPublicationExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SituationPublication", propOrder = {
    "situation",
    "situationPublicationExtension"
})
public class SituationPublication
    extends PayloadPublication
{

    protected List<Situation> situation;
    protected ExtensionType situationPublicationExtension;

    /**
     * Gets the value of the situation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the situation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSituation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Situation }
     * 
     * 
     */
    public List<Situation> getSituation() {
        if (situation == null) {
            situation = new ArrayList<Situation>();
        }
        return this.situation;
    }

    /**
     * Recupera il valore della proprietà situationPublicationExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getSituationPublicationExtension() {
        return situationPublicationExtension;
    }

    /**
     * Imposta il valore della proprietà situationPublicationExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setSituationPublicationExtension(ExtensionType value) {
        this.situationPublicationExtension = value;
    }

    public SituationPublication withSituation(Situation... values) {
        if (values!= null) {
            for (Situation value: values) {
                getSituation().add(value);
            }
        }
        return this;
    }

    public SituationPublication withSituation(Collection<Situation> values) {
        if (values!= null) {
            getSituation().addAll(values);
        }
        return this;
    }

    public SituationPublication withSituationPublicationExtension(ExtensionType value) {
        setSituationPublicationExtension(value);
        return this;
    }

    @Override
    public SituationPublication withFeedDescription(MultilingualString value) {
        setFeedDescription(value);
        return this;
    }

    @Override
    public SituationPublication withFeedType(String value) {
        setFeedType(value);
        return this;
    }

    @Override
    public SituationPublication withPublicationTime(LocalDateTime value) {
        setPublicationTime(value);
        return this;
    }

    @Override
    public SituationPublication withPublicationCreator(InternationalIdentifier value) {
        setPublicationCreator(value);
        return this;
    }

    @Override
    public SituationPublication withPayloadPublicationExtension(ExtensionType value) {
        setPayloadPublicationExtension(value);
        return this;
    }

    @Override
    public SituationPublication withLang(String value) {
        setLang(value);
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

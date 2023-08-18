//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package uk.org.ifopt.ifopt;

import java.math.BigInteger;
import java.time.LocalDateTime;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per DataManagedObjectStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DataManagedObjectStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.ifopt.org.uk/ifopt}VersionedObjectStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.ifopt.org.uk/ifopt}DataManagedObjectGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataManagedObjectStructure", propOrder = {
    "managedByAreaRef",
    "infoLinks"
})
@XmlSeeAlso({
    AbstractEquipmentStructure.class
})
public abstract class DataManagedObjectStructure
    extends VersionedObjectStructure
{

    @XmlElement(name = "ManagedByAreaRef")
    protected AdministrativeAreaRefStructure managedByAreaRef;
    @XmlElement(name = "InfoLinks")
    protected InfoLinksStructure infoLinks;

    /**
     * Recupera il valore della proprietà managedByAreaRef.
     * 
     * @return
     *     possible object is
     *     {@link AdministrativeAreaRefStructure }
     *     
     */
    public AdministrativeAreaRefStructure getManagedByAreaRef() {
        return managedByAreaRef;
    }

    /**
     * Imposta il valore della proprietà managedByAreaRef.
     * 
     * @param value
     *     allowed object is
     *     {@link AdministrativeAreaRefStructure }
     *     
     */
    public void setManagedByAreaRef(AdministrativeAreaRefStructure value) {
        this.managedByAreaRef = value;
    }

    /**
     * Recupera il valore della proprietà infoLinks.
     * 
     * @return
     *     possible object is
     *     {@link InfoLinksStructure }
     *     
     */
    public InfoLinksStructure getInfoLinks() {
        return infoLinks;
    }

    /**
     * Imposta il valore della proprietà infoLinks.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoLinksStructure }
     *     
     */
    public void setInfoLinks(InfoLinksStructure value) {
        this.infoLinks = value;
    }

    public DataManagedObjectStructure withManagedByAreaRef(AdministrativeAreaRefStructure value) {
        setManagedByAreaRef(value);
        return this;
    }

    public DataManagedObjectStructure withInfoLinks(InfoLinksStructure value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public DataManagedObjectStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public DataManagedObjectStructure withLastUpdated(LocalDateTime value) {
        setLastUpdated(value);
        return this;
    }

    @Override
    public DataManagedObjectStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public DataManagedObjectStructure withVersion(BigInteger value) {
        setVersion(value);
        return this;
    }

    @Override
    public DataManagedObjectStructure withStatus(StatusEnumeration value) {
        setStatus(value);
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

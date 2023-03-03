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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.bliksemlabs.ojp.model.NaturalLanguageStringStructure;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per AbstractEquipmentStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AbstractEquipmentStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.ifopt.org.uk/ifopt}DataManagedObjectStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.ifopt.org.uk/ifopt}AbstractEquipmentGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractEquipmentStructure", propOrder = {
    "equipmentId",
    "equipmentName",
    "typeOfEquipment"
})
@XmlSeeAlso({
    InstalledEquipmentStructure.class
})
public abstract class AbstractEquipmentStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "EquipmentId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String equipmentId;
    @XmlElement(name = "EquipmentName")
    protected NaturalLanguageStringStructure equipmentName;
    @XmlElement(name = "TypeOfEquipment")
    protected EquipmentTypeRefStructure typeOfEquipment;

    /**
     * Recupera il valore della proprietà equipmentId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipmentId() {
        return equipmentId;
    }

    /**
     * Imposta il valore della proprietà equipmentId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipmentId(String value) {
        this.equipmentId = value;
    }

    /**
     * Recupera il valore della proprietà equipmentName.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getEquipmentName() {
        return equipmentName;
    }

    /**
     * Imposta il valore della proprietà equipmentName.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setEquipmentName(NaturalLanguageStringStructure value) {
        this.equipmentName = value;
    }

    /**
     * Recupera il valore della proprietà typeOfEquipment.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentTypeRefStructure }
     *     
     */
    public EquipmentTypeRefStructure getTypeOfEquipment() {
        return typeOfEquipment;
    }

    /**
     * Imposta il valore della proprietà typeOfEquipment.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentTypeRefStructure }
     *     
     */
    public void setTypeOfEquipment(EquipmentTypeRefStructure value) {
        this.typeOfEquipment = value;
    }

    public AbstractEquipmentStructure withEquipmentId(String value) {
        setEquipmentId(value);
        return this;
    }

    public AbstractEquipmentStructure withEquipmentName(NaturalLanguageStringStructure value) {
        setEquipmentName(value);
        return this;
    }

    public AbstractEquipmentStructure withTypeOfEquipment(EquipmentTypeRefStructure value) {
        setTypeOfEquipment(value);
        return this;
    }

    @Override
    public AbstractEquipmentStructure withManagedByAreaRef(AdministrativeAreaRefStructure value) {
        setManagedByAreaRef(value);
        return this;
    }

    @Override
    public AbstractEquipmentStructure withInfoLinks(InfoLinksStructure value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public AbstractEquipmentStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public AbstractEquipmentStructure withLastUpdated(LocalDateTime value) {
        setLastUpdated(value);
        return this;
    }

    @Override
    public AbstractEquipmentStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public AbstractEquipmentStructure withVersion(BigInteger value) {
        setVersion(value);
        return this;
    }

    @Override
    public AbstractEquipmentStructure withStatus(StatusEnumeration value) {
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

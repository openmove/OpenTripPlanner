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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.bliksemlabs.ojp.model.NaturalLanguageStringStructure;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per InstalledEquipmentStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="InstalledEquipmentStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.ifopt.org.uk/ifopt}AbstractEquipmentStructure"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstalledEquipmentStructure")
@XmlSeeAlso({
    PlaceEquipmentStructure.class,
    LocalServiceStructure.class
})
public abstract class InstalledEquipmentStructure
    extends AbstractEquipmentStructure
{


    @Override
    public InstalledEquipmentStructure withEquipmentId(String value) {
        setEquipmentId(value);
        return this;
    }

    @Override
    public InstalledEquipmentStructure withEquipmentName(NaturalLanguageStringStructure value) {
        setEquipmentName(value);
        return this;
    }

    @Override
    public InstalledEquipmentStructure withTypeOfEquipment(EquipmentTypeRefStructure value) {
        setTypeOfEquipment(value);
        return this;
    }

    @Override
    public InstalledEquipmentStructure withManagedByAreaRef(AdministrativeAreaRefStructure value) {
        setManagedByAreaRef(value);
        return this;
    }

    @Override
    public InstalledEquipmentStructure withInfoLinks(InfoLinksStructure value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public InstalledEquipmentStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public InstalledEquipmentStructure withLastUpdated(LocalDateTime value) {
        setLastUpdated(value);
        return this;
    }

    @Override
    public InstalledEquipmentStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public InstalledEquipmentStructure withVersion(BigInteger value) {
        setVersion(value);
        return this;
    }

    @Override
    public InstalledEquipmentStructure withStatus(StatusEnumeration value) {
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
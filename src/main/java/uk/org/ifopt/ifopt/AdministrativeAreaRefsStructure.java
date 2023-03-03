//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package uk.org.ifopt.ifopt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per AdministrativeAreaRefsStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AdministrativeAreaRefsStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdministrativeAreaRef" type="{http://www.ifopt.org.uk/ifopt}AdministrativeAreaVersionedRefStructure" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdministrativeAreaRefsStructure", propOrder = {
    "administrativeAreaRef"
})
public class AdministrativeAreaRefsStructure {

    @XmlElement(name = "AdministrativeAreaRef", required = true)
    protected List<AdministrativeAreaVersionedRefStructure> administrativeAreaRef;

    /**
     * Gets the value of the administrativeAreaRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the administrativeAreaRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdministrativeAreaRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdministrativeAreaVersionedRefStructure }
     * 
     * 
     */
    public List<AdministrativeAreaVersionedRefStructure> getAdministrativeAreaRef() {
        if (administrativeAreaRef == null) {
            administrativeAreaRef = new ArrayList<AdministrativeAreaVersionedRefStructure>();
        }
        return this.administrativeAreaRef;
    }

    public AdministrativeAreaRefsStructure withAdministrativeAreaRef(AdministrativeAreaVersionedRefStructure... values) {
        if (values!= null) {
            for (AdministrativeAreaVersionedRefStructure value: values) {
                getAdministrativeAreaRef().add(value);
            }
        }
        return this;
    }

    public AdministrativeAreaRefsStructure withAdministrativeAreaRef(Collection<AdministrativeAreaVersionedRefStructure> values) {
        if (values!= null) {
            getAdministrativeAreaRef().addAll(values);
        }
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

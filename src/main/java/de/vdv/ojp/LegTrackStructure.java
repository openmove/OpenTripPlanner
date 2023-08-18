//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package de.vdv.ojp;

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
 * The LINK PROJECTION of a Leg onto the topography of the route being followed.
 * 
 * <p>Classe Java per LegTrackStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="LegTrackStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TrackSection" type="{http://www.vdv.de/ojp}TrackSectionStructure" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegTrackStructure", propOrder = {
    "trackSection"
})
public class LegTrackStructure {

    @XmlElement(name = "TrackSection", required = true)
    protected List<TrackSectionStructure> trackSection;

    /**
     * Gets the value of the trackSection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trackSection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrackSection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrackSectionStructure }
     * 
     * 
     */
    public List<TrackSectionStructure> getTrackSection() {
        if (trackSection == null) {
            trackSection = new ArrayList<TrackSectionStructure>();
        }
        return this.trackSection;
    }

    public LegTrackStructure withTrackSection(TrackSectionStructure... values) {
        if (values!= null) {
            for (TrackSectionStructure value: values) {
                getTrackSection().add(value);
            }
        }
        return this;
    }

    public LegTrackStructure withTrackSection(Collection<TrackSectionStructure> values) {
        if (values!= null) {
            getTrackSection().addAll(values);
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

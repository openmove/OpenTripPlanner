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
import com.bliksemlabs.ojp.model.LocationStructure;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 *  [specialisation of ZONE in TMv6] a LINK SEQUENCE (one-dimensional) forming the boundary of a ZONE
 * 	
 * 
 * <p>Classe Java per GeoAreaStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="GeoAreaStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PolylinePoint" type="{http://www.siri.org.uk/siri}LocationStructure" maxOccurs="unbounded" minOccurs="3"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeoAreaStructure", propOrder = {
    "polylinePoint"
})
public class GeoAreaStructure {

    @XmlElement(name = "PolylinePoint", required = true)
    protected List<LocationStructure> polylinePoint;

    /**
     * Gets the value of the polylinePoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the polylinePoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolylinePoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationStructure }
     * 
     * 
     */
    public List<LocationStructure> getPolylinePoint() {
        if (polylinePoint == null) {
            polylinePoint = new ArrayList<LocationStructure>();
        }
        return this.polylinePoint;
    }

    public GeoAreaStructure withPolylinePoint(LocationStructure... values) {
        if (values!= null) {
            for (LocationStructure value: values) {
                getPolylinePoint().add(value);
            }
        }
        return this;
    }

    public GeoAreaStructure withPolylinePoint(Collection<LocationStructure> values) {
        if (values!= null) {
            getPolylinePoint().addAll(values);
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

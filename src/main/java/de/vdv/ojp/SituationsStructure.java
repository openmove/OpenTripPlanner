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
import com.bliksemlabs.ojp.model.PtSituationElementStructure;
import com.bliksemlabs.ojp.model.RoadSituationElementStructure;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * Wrapper type for SIRI PtSituationsElementStructure
 * 
 * <p>Classe Java per SituationsStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SituationsStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PtSituation" type="{http://www.siri.org.uk/siri}PtSituationElementStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RoadSituation" type="{http://www.siri.org.uk/siri}RoadSituationElementStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SituationsStructure", propOrder = {
    "ptSituation",
    "roadSituation"
})
public class SituationsStructure {

    @XmlElement(name = "PtSituation")
    protected List<PtSituationElementStructure> ptSituation;
    @XmlElement(name = "RoadSituation")
    protected List<RoadSituationElementStructure> roadSituation;

    /**
     * Gets the value of the ptSituation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ptSituation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPtSituation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PtSituationElementStructure }
     * 
     * 
     */
    public List<PtSituationElementStructure> getPtSituation() {
        if (ptSituation == null) {
            ptSituation = new ArrayList<PtSituationElementStructure>();
        }
        return this.ptSituation;
    }

    /**
     * Gets the value of the roadSituation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roadSituation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoadSituation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoadSituationElementStructure }
     * 
     * 
     */
    public List<RoadSituationElementStructure> getRoadSituation() {
        if (roadSituation == null) {
            roadSituation = new ArrayList<RoadSituationElementStructure>();
        }
        return this.roadSituation;
    }

    public SituationsStructure withPtSituation(PtSituationElementStructure... values) {
        if (values!= null) {
            for (PtSituationElementStructure value: values) {
                getPtSituation().add(value);
            }
        }
        return this;
    }

    public SituationsStructure withPtSituation(Collection<PtSituationElementStructure> values) {
        if (values!= null) {
            getPtSituation().addAll(values);
        }
        return this;
    }

    public SituationsStructure withRoadSituation(RoadSituationElementStructure... values) {
        if (values!= null) {
            for (RoadSituationElementStructure value: values) {
                getRoadSituation().add(value);
            }
        }
        return this;
    }

    public SituationsStructure withRoadSituation(Collection<RoadSituationElementStructure> values) {
        if (values!= null) {
            getRoadSituation().addAll(values);
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

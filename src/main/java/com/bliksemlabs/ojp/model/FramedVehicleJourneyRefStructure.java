//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package com.bliksemlabs.ojp.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per FramedVehicleJourneyRefStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="FramedVehicleJourneyRefStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataFrameRef" type="{http://www.siri.org.uk/siri}DataFrameRefStructure"/&gt;
 *         &lt;element name="DatedVehicleJourneyRef" type="{http://www.siri.org.uk/siri}DatedVehicleJourneyCodeType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FramedVehicleJourneyRefStructure", propOrder = {
    "dataFrameRef",
    "datedVehicleJourneyRef"
})
public class FramedVehicleJourneyRefStructure {

    @XmlElement(name = "DataFrameRef", required = true)
    protected DataFrameRefStructure dataFrameRef;
    @XmlElement(name = "DatedVehicleJourneyRef", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String datedVehicleJourneyRef;

    /**
     * Recupera il valore della proprietà dataFrameRef.
     * 
     * @return
     *     possible object is
     *     {@link DataFrameRefStructure }
     *     
     */
    public DataFrameRefStructure getDataFrameRef() {
        return dataFrameRef;
    }

    /**
     * Imposta il valore della proprietà dataFrameRef.
     * 
     * @param value
     *     allowed object is
     *     {@link DataFrameRefStructure }
     *     
     */
    public void setDataFrameRef(DataFrameRefStructure value) {
        this.dataFrameRef = value;
    }

    /**
     * Recupera il valore della proprietà datedVehicleJourneyRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatedVehicleJourneyRef() {
        return datedVehicleJourneyRef;
    }

    /**
     * Imposta il valore della proprietà datedVehicleJourneyRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatedVehicleJourneyRef(String value) {
        this.datedVehicleJourneyRef = value;
    }

    public FramedVehicleJourneyRefStructure withDataFrameRef(DataFrameRefStructure value) {
        setDataFrameRef(value);
        return this;
    }

    public FramedVehicleJourneyRefStructure withDatedVehicleJourneyRef(String value) {
        setDatedVehicleJourneyRef(value);
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

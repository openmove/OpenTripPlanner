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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * [corresponds to POINT OF INTEREST in TMv6 with related information] type of PLACE to or through which passengers may wish to navigate as part of their journey and which is modelled in detail by journey planners. 
 * 
 * <p>Classe Java per PointOfInterestStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PointOfInterestStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PointOfInterestCode" type="{http://www.vdv.de/ojp}PointOfInterestCodeType"/&gt;
 *         &lt;element name="PointOfInterestName" type="{http://www.vdv.de/ojp}InternationalTextStructure"/&gt;
 *         &lt;element name="NameSuffix" type="{http://www.vdv.de/ojp}InternationalTextStructure" minOccurs="0"/&gt;
 *         &lt;element name="PointOfInterestCategory" type="{http://www.vdv.de/ojp}PointOfInterestCategoryStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PrivateCode" type="{http://www.vdv.de/ojp}PrivateCodeStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.vdv.de/ojp}TopographicPlaceRef" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointOfInterestStructure", propOrder = {
    "pointOfInterestCode",
    "pointOfInterestName",
    "nameSuffix",
    "pointOfInterestCategory",
    "privateCode",
    "topographicPlaceRef"
})
public class PointOfInterestStructure {

    @XmlElement(name = "PointOfInterestCode", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String pointOfInterestCode;
    @XmlElement(name = "PointOfInterestName", required = true)
    protected InternationalTextStructure pointOfInterestName;
    @XmlElement(name = "NameSuffix")
    protected InternationalTextStructure nameSuffix;
    @XmlElement(name = "PointOfInterestCategory")
    protected List<PointOfInterestCategoryStructure> pointOfInterestCategory;
    @XmlElement(name = "PrivateCode")
    protected List<PrivateCodeStructure> privateCode;
    @XmlElement(name = "TopographicPlaceRef")
    protected TopographicPlaceRefStructure topographicPlaceRef;

    /**
     * Recupera il valore della proprietà pointOfInterestCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointOfInterestCode() {
        return pointOfInterestCode;
    }

    /**
     * Imposta il valore della proprietà pointOfInterestCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointOfInterestCode(String value) {
        this.pointOfInterestCode = value;
    }

    /**
     * Recupera il valore della proprietà pointOfInterestName.
     * 
     * @return
     *     possible object is
     *     {@link InternationalTextStructure }
     *     
     */
    public InternationalTextStructure getPointOfInterestName() {
        return pointOfInterestName;
    }

    /**
     * Imposta il valore della proprietà pointOfInterestName.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTextStructure }
     *     
     */
    public void setPointOfInterestName(InternationalTextStructure value) {
        this.pointOfInterestName = value;
    }

    /**
     * Recupera il valore della proprietà nameSuffix.
     * 
     * @return
     *     possible object is
     *     {@link InternationalTextStructure }
     *     
     */
    public InternationalTextStructure getNameSuffix() {
        return nameSuffix;
    }

    /**
     * Imposta il valore della proprietà nameSuffix.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTextStructure }
     *     
     */
    public void setNameSuffix(InternationalTextStructure value) {
        this.nameSuffix = value;
    }

    /**
     * Gets the value of the pointOfInterestCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pointOfInterestCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPointOfInterestCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PointOfInterestCategoryStructure }
     * 
     * 
     */
    public List<PointOfInterestCategoryStructure> getPointOfInterestCategory() {
        if (pointOfInterestCategory == null) {
            pointOfInterestCategory = new ArrayList<PointOfInterestCategoryStructure>();
        }
        return this.pointOfInterestCategory;
    }

    /**
     * Gets the value of the privateCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the privateCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrivateCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrivateCodeStructure }
     * 
     * 
     */
    public List<PrivateCodeStructure> getPrivateCode() {
        if (privateCode == null) {
            privateCode = new ArrayList<PrivateCodeStructure>();
        }
        return this.privateCode;
    }

    /**
     * Recupera il valore della proprietà topographicPlaceRef.
     * 
     * @return
     *     possible object is
     *     {@link TopographicPlaceRefStructure }
     *     
     */
    public TopographicPlaceRefStructure getTopographicPlaceRef() {
        return topographicPlaceRef;
    }

    /**
     * Imposta il valore della proprietà topographicPlaceRef.
     * 
     * @param value
     *     allowed object is
     *     {@link TopographicPlaceRefStructure }
     *     
     */
    public void setTopographicPlaceRef(TopographicPlaceRefStructure value) {
        this.topographicPlaceRef = value;
    }

    public PointOfInterestStructure withPointOfInterestCode(String value) {
        setPointOfInterestCode(value);
        return this;
    }

    public PointOfInterestStructure withPointOfInterestName(InternationalTextStructure value) {
        setPointOfInterestName(value);
        return this;
    }

    public PointOfInterestStructure withNameSuffix(InternationalTextStructure value) {
        setNameSuffix(value);
        return this;
    }

    public PointOfInterestStructure withPointOfInterestCategory(PointOfInterestCategoryStructure... values) {
        if (values!= null) {
            for (PointOfInterestCategoryStructure value: values) {
                getPointOfInterestCategory().add(value);
            }
        }
        return this;
    }

    public PointOfInterestStructure withPointOfInterestCategory(Collection<PointOfInterestCategoryStructure> values) {
        if (values!= null) {
            getPointOfInterestCategory().addAll(values);
        }
        return this;
    }

    public PointOfInterestStructure withPrivateCode(PrivateCodeStructure... values) {
        if (values!= null) {
            for (PrivateCodeStructure value: values) {
                getPrivateCode().add(value);
            }
        }
        return this;
    }

    public PointOfInterestStructure withPrivateCode(Collection<PrivateCodeStructure> values) {
        if (values!= null) {
            getPrivateCode().addAll(values);
        }
        return this;
    }

    public PointOfInterestStructure withTopographicPlaceRef(TopographicPlaceRefStructure value) {
        setTopographicPlaceRef(value);
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

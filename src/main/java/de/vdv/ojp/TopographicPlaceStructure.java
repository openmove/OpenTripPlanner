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
import com.bliksemlabs.ojp.model.LocationStructure;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * [TMv6] A type of PLACE providing the topographical context when searching for or presenting travel information, for example as the origin or destination of a trip. It may be of any size (e.g. County,City, Town, Village) and of different specificity (e.g. Greater London, London, West End, Westminster, St James's).
 * 
 * <p>Classe Java per TopographicPlaceStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TopographicPlaceStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TopographicPlaceCode" type="{http://www.vdv.de/ojp}TopographicPlaceCodeType"/&gt;
 *         &lt;element name="TopographicPlaceName" type="{http://www.vdv.de/ojp}InternationalTextStructure"/&gt;
 *         &lt;element name="PrivateCode" type="{http://www.vdv.de/ojp}PrivateCodeStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ParentRef" type="{http://www.vdv.de/ojp}TopographicPlaceRefStructure" minOccurs="0"/&gt;
 *         &lt;element name="Area" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Points" type="{http://www.siri.org.uk/siri}LocationStructure" maxOccurs="unbounded" minOccurs="3"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopographicPlaceStructure", propOrder = {
    "topographicPlaceCode",
    "topographicPlaceName",
    "privateCode",
    "parentRef",
    "area"
})
public class TopographicPlaceStructure {

    @XmlElement(name = "TopographicPlaceCode", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String topographicPlaceCode;
    @XmlElement(name = "TopographicPlaceName", required = true)
    protected InternationalTextStructure topographicPlaceName;
    @XmlElement(name = "PrivateCode")
    protected List<PrivateCodeStructure> privateCode;
    @XmlElement(name = "ParentRef")
    protected TopographicPlaceRefStructure parentRef;
    @XmlElement(name = "Area")
    protected TopographicPlaceStructure.Area area;

    /**
     * Recupera il valore della proprietà topographicPlaceCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTopographicPlaceCode() {
        return topographicPlaceCode;
    }

    /**
     * Imposta il valore della proprietà topographicPlaceCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTopographicPlaceCode(String value) {
        this.topographicPlaceCode = value;
    }

    /**
     * Recupera il valore della proprietà topographicPlaceName.
     * 
     * @return
     *     possible object is
     *     {@link InternationalTextStructure }
     *     
     */
    public InternationalTextStructure getTopographicPlaceName() {
        return topographicPlaceName;
    }

    /**
     * Imposta il valore della proprietà topographicPlaceName.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTextStructure }
     *     
     */
    public void setTopographicPlaceName(InternationalTextStructure value) {
        this.topographicPlaceName = value;
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
     * Recupera il valore della proprietà parentRef.
     * 
     * @return
     *     possible object is
     *     {@link TopographicPlaceRefStructure }
     *     
     */
    public TopographicPlaceRefStructure getParentRef() {
        return parentRef;
    }

    /**
     * Imposta il valore della proprietà parentRef.
     * 
     * @param value
     *     allowed object is
     *     {@link TopographicPlaceRefStructure }
     *     
     */
    public void setParentRef(TopographicPlaceRefStructure value) {
        this.parentRef = value;
    }

    /**
     * Recupera il valore della proprietà area.
     * 
     * @return
     *     possible object is
     *     {@link TopographicPlaceStructure.Area }
     *     
     */
    public TopographicPlaceStructure.Area getArea() {
        return area;
    }

    /**
     * Imposta il valore della proprietà area.
     * 
     * @param value
     *     allowed object is
     *     {@link TopographicPlaceStructure.Area }
     *     
     */
    public void setArea(TopographicPlaceStructure.Area value) {
        this.area = value;
    }

    public TopographicPlaceStructure withTopographicPlaceCode(String value) {
        setTopographicPlaceCode(value);
        return this;
    }

    public TopographicPlaceStructure withTopographicPlaceName(InternationalTextStructure value) {
        setTopographicPlaceName(value);
        return this;
    }

    public TopographicPlaceStructure withPrivateCode(PrivateCodeStructure... values) {
        if (values!= null) {
            for (PrivateCodeStructure value: values) {
                getPrivateCode().add(value);
            }
        }
        return this;
    }

    public TopographicPlaceStructure withPrivateCode(Collection<PrivateCodeStructure> values) {
        if (values!= null) {
            getPrivateCode().addAll(values);
        }
        return this;
    }

    public TopographicPlaceStructure withParentRef(TopographicPlaceRefStructure value) {
        setParentRef(value);
        return this;
    }

    public TopographicPlaceStructure withArea(TopographicPlaceStructure.Area value) {
        setArea(value);
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


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Points" type="{http://www.siri.org.uk/siri}LocationStructure" maxOccurs="unbounded" minOccurs="3"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "points"
    })
    public static class Area {

        @XmlElement(name = "Points", required = true)
        protected List<LocationStructure> points;

        /**
         * Gets the value of the points property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the points property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPoints().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LocationStructure }
         * 
         * 
         */
        public List<LocationStructure> getPoints() {
            if (points == null) {
                points = new ArrayList<LocationStructure>();
            }
            return this.points;
        }

        public TopographicPlaceStructure.Area withPoints(LocationStructure... values) {
            if (values!= null) {
                for (LocationStructure value: values) {
                    getPoints().add(value);
                }
            }
            return this;
        }

        public TopographicPlaceStructure.Area withPoints(Collection<LocationStructure> values) {
            if (values!= null) {
                getPoints().addAll(values);
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

}

//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per HazardousMaterials complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="HazardousMaterials"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="chemicalName" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString"/&gt;
 *         &lt;element name="dangerousGoodsFlashPoint" type="{http://datex2.eu/schema/2_0RC1/2_0}TemperatureCelsius" minOccurs="0"/&gt;
 *         &lt;element name="dangerousGoodsRegulations" type="{http://datex2.eu/schema/2_0RC1/2_0}DangerousGoodsRegulationsEnum" minOccurs="0"/&gt;
 *         &lt;element name="hazardCodeIdentification" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="hazardCodeVersionNumber" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="hazardSubstanceItemPageNumber" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="tremCardNumber" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="undgNumber" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="volumeOfDangerousGoods" type="{http://datex2.eu/schema/2_0RC1/2_0}CubicMetres" minOccurs="0"/&gt;
 *         &lt;element name="weightOfDangerousGoods" type="{http://datex2.eu/schema/2_0RC1/2_0}Tonnes" minOccurs="0"/&gt;
 *         &lt;element name="hazardousMaterialsExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HazardousMaterials", propOrder = {
    "chemicalName",
    "dangerousGoodsFlashPoint",
    "dangerousGoodsRegulations",
    "hazardCodeIdentification",
    "hazardCodeVersionNumber",
    "hazardSubstanceItemPageNumber",
    "tremCardNumber",
    "undgNumber",
    "volumeOfDangerousGoods",
    "weightOfDangerousGoods",
    "hazardousMaterialsExtension"
})
public class HazardousMaterials {

    @XmlElement(required = true)
    protected MultilingualString chemicalName;
    protected Float dangerousGoodsFlashPoint;
    @XmlSchemaType(name = "string")
    protected DangerousGoodsRegulationsEnum dangerousGoodsRegulations;
    protected String hazardCodeIdentification;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger hazardCodeVersionNumber;
    protected String hazardSubstanceItemPageNumber;
    protected String tremCardNumber;
    protected String undgNumber;
    protected Float volumeOfDangerousGoods;
    protected Float weightOfDangerousGoods;
    protected ExtensionType hazardousMaterialsExtension;

    /**
     * Recupera il valore della proprietà chemicalName.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getChemicalName() {
        return chemicalName;
    }

    /**
     * Imposta il valore della proprietà chemicalName.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setChemicalName(MultilingualString value) {
        this.chemicalName = value;
    }

    /**
     * Recupera il valore della proprietà dangerousGoodsFlashPoint.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDangerousGoodsFlashPoint() {
        return dangerousGoodsFlashPoint;
    }

    /**
     * Imposta il valore della proprietà dangerousGoodsFlashPoint.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDangerousGoodsFlashPoint(Float value) {
        this.dangerousGoodsFlashPoint = value;
    }

    /**
     * Recupera il valore della proprietà dangerousGoodsRegulations.
     * 
     * @return
     *     possible object is
     *     {@link DangerousGoodsRegulationsEnum }
     *     
     */
    public DangerousGoodsRegulationsEnum getDangerousGoodsRegulations() {
        return dangerousGoodsRegulations;
    }

    /**
     * Imposta il valore della proprietà dangerousGoodsRegulations.
     * 
     * @param value
     *     allowed object is
     *     {@link DangerousGoodsRegulationsEnum }
     *     
     */
    public void setDangerousGoodsRegulations(DangerousGoodsRegulationsEnum value) {
        this.dangerousGoodsRegulations = value;
    }

    /**
     * Recupera il valore della proprietà hazardCodeIdentification.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHazardCodeIdentification() {
        return hazardCodeIdentification;
    }

    /**
     * Imposta il valore della proprietà hazardCodeIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHazardCodeIdentification(String value) {
        this.hazardCodeIdentification = value;
    }

    /**
     * Recupera il valore della proprietà hazardCodeVersionNumber.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHazardCodeVersionNumber() {
        return hazardCodeVersionNumber;
    }

    /**
     * Imposta il valore della proprietà hazardCodeVersionNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHazardCodeVersionNumber(BigInteger value) {
        this.hazardCodeVersionNumber = value;
    }

    /**
     * Recupera il valore della proprietà hazardSubstanceItemPageNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHazardSubstanceItemPageNumber() {
        return hazardSubstanceItemPageNumber;
    }

    /**
     * Imposta il valore della proprietà hazardSubstanceItemPageNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHazardSubstanceItemPageNumber(String value) {
        this.hazardSubstanceItemPageNumber = value;
    }

    /**
     * Recupera il valore della proprietà tremCardNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTremCardNumber() {
        return tremCardNumber;
    }

    /**
     * Imposta il valore della proprietà tremCardNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTremCardNumber(String value) {
        this.tremCardNumber = value;
    }

    /**
     * Recupera il valore della proprietà undgNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUndgNumber() {
        return undgNumber;
    }

    /**
     * Imposta il valore della proprietà undgNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUndgNumber(String value) {
        this.undgNumber = value;
    }

    /**
     * Recupera il valore della proprietà volumeOfDangerousGoods.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getVolumeOfDangerousGoods() {
        return volumeOfDangerousGoods;
    }

    /**
     * Imposta il valore della proprietà volumeOfDangerousGoods.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setVolumeOfDangerousGoods(Float value) {
        this.volumeOfDangerousGoods = value;
    }

    /**
     * Recupera il valore della proprietà weightOfDangerousGoods.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getWeightOfDangerousGoods() {
        return weightOfDangerousGoods;
    }

    /**
     * Imposta il valore della proprietà weightOfDangerousGoods.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setWeightOfDangerousGoods(Float value) {
        this.weightOfDangerousGoods = value;
    }

    /**
     * Recupera il valore della proprietà hazardousMaterialsExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getHazardousMaterialsExtension() {
        return hazardousMaterialsExtension;
    }

    /**
     * Imposta il valore della proprietà hazardousMaterialsExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setHazardousMaterialsExtension(ExtensionType value) {
        this.hazardousMaterialsExtension = value;
    }

    public HazardousMaterials withChemicalName(MultilingualString value) {
        setChemicalName(value);
        return this;
    }

    public HazardousMaterials withDangerousGoodsFlashPoint(Float value) {
        setDangerousGoodsFlashPoint(value);
        return this;
    }

    public HazardousMaterials withDangerousGoodsRegulations(DangerousGoodsRegulationsEnum value) {
        setDangerousGoodsRegulations(value);
        return this;
    }

    public HazardousMaterials withHazardCodeIdentification(String value) {
        setHazardCodeIdentification(value);
        return this;
    }

    public HazardousMaterials withHazardCodeVersionNumber(BigInteger value) {
        setHazardCodeVersionNumber(value);
        return this;
    }

    public HazardousMaterials withHazardSubstanceItemPageNumber(String value) {
        setHazardSubstanceItemPageNumber(value);
        return this;
    }

    public HazardousMaterials withTremCardNumber(String value) {
        setTremCardNumber(value);
        return this;
    }

    public HazardousMaterials withUndgNumber(String value) {
        setUndgNumber(value);
        return this;
    }

    public HazardousMaterials withVolumeOfDangerousGoods(Float value) {
        setVolumeOfDangerousGoods(value);
        return this;
    }

    public HazardousMaterials withWeightOfDangerousGoods(Float value) {
        setWeightOfDangerousGoods(value);
        return this;
    }

    public HazardousMaterials withHazardousMaterialsExtension(ExtensionType value) {
        setHazardousMaterialsExtension(value);
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

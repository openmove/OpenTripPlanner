//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per SpeedPercentile complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SpeedPercentile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vehiclePercentage" type="{http://datex2.eu/schema/2_0RC1/2_0}Percentage"/&gt;
 *         &lt;element name="speedPercentile" type="{http://datex2.eu/schema/2_0RC1/2_0}KilometresPerHour"/&gt;
 *         &lt;element name="speedPercentileExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpeedPercentile", propOrder = {
    "vehiclePercentage",
    "speedPercentile",
    "speedPercentileExtension"
})
public class SpeedPercentile {

    protected float vehiclePercentage;
    protected float speedPercentile;
    protected ExtensionType speedPercentileExtension;

    /**
     * Recupera il valore della proprietà vehiclePercentage.
     * 
     */
    public float getVehiclePercentage() {
        return vehiclePercentage;
    }

    /**
     * Imposta il valore della proprietà vehiclePercentage.
     * 
     */
    public void setVehiclePercentage(float value) {
        this.vehiclePercentage = value;
    }

    /**
     * Recupera il valore della proprietà speedPercentile.
     * 
     */
    public float getSpeedPercentile() {
        return speedPercentile;
    }

    /**
     * Imposta il valore della proprietà speedPercentile.
     * 
     */
    public void setSpeedPercentile(float value) {
        this.speedPercentile = value;
    }

    /**
     * Recupera il valore della proprietà speedPercentileExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getSpeedPercentileExtension() {
        return speedPercentileExtension;
    }

    /**
     * Imposta il valore della proprietà speedPercentileExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setSpeedPercentileExtension(ExtensionType value) {
        this.speedPercentileExtension = value;
    }

    public SpeedPercentile withVehiclePercentage(float value) {
        setVehiclePercentage(value);
        return this;
    }

    public SpeedPercentile withSpeedPercentile(float value) {
        setSpeedPercentile(value);
        return this;
    }

    public SpeedPercentile withSpeedPercentileExtension(ExtensionType value) {
        setSpeedPercentileExtension(value);
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

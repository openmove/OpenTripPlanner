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
 * <p>Classe Java per VehicleSpeed complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="VehicleSpeed"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="individualVehicleSpeed" type="{http://datex2.eu/schema/2_0RC1/2_0}KilometresPerHour"/&gt;
 *         &lt;element name="vehicleSpeedExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleSpeed", propOrder = {
    "individualVehicleSpeed",
    "vehicleSpeedExtension"
})
public class VehicleSpeed {

    protected float individualVehicleSpeed;
    protected ExtensionType vehicleSpeedExtension;

    /**
     * Recupera il valore della proprietà individualVehicleSpeed.
     * 
     */
    public float getIndividualVehicleSpeed() {
        return individualVehicleSpeed;
    }

    /**
     * Imposta il valore della proprietà individualVehicleSpeed.
     * 
     */
    public void setIndividualVehicleSpeed(float value) {
        this.individualVehicleSpeed = value;
    }

    /**
     * Recupera il valore della proprietà vehicleSpeedExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getVehicleSpeedExtension() {
        return vehicleSpeedExtension;
    }

    /**
     * Imposta il valore della proprietà vehicleSpeedExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setVehicleSpeedExtension(ExtensionType value) {
        this.vehicleSpeedExtension = value;
    }

    public VehicleSpeed withIndividualVehicleSpeed(float value) {
        setIndividualVehicleSpeed(value);
        return this;
    }

    public VehicleSpeed withVehicleSpeedExtension(ExtensionType value) {
        setVehicleSpeedExtension(value);
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

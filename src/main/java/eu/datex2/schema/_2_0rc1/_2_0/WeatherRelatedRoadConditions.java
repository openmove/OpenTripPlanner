//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per WeatherRelatedRoadConditions complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="WeatherRelatedRoadConditions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}RoadConditions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="weatherRelatedRoadConditionType" type="{http://datex2.eu/schema/2_0RC1/2_0}WeatherRelatedRoadConditionTypeEnum" maxOccurs="unbounded"/&gt;
 *         &lt;element name="roadSurfaceConditionMeasurements" type="{http://datex2.eu/schema/2_0RC1/2_0}RoadSurfaceConditionMeasurements" minOccurs="0"/&gt;
 *         &lt;element name="weatherRelatedRoadConditionsExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeatherRelatedRoadConditions", propOrder = {
    "weatherRelatedRoadConditionType",
    "roadSurfaceConditionMeasurements",
    "weatherRelatedRoadConditionsExtension"
})
public class WeatherRelatedRoadConditions
    extends RoadConditions
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected List<WeatherRelatedRoadConditionTypeEnum> weatherRelatedRoadConditionType;
    protected RoadSurfaceConditionMeasurements roadSurfaceConditionMeasurements;
    protected ExtensionType weatherRelatedRoadConditionsExtension;

    /**
     * Gets the value of the weatherRelatedRoadConditionType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the weatherRelatedRoadConditionType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWeatherRelatedRoadConditionType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WeatherRelatedRoadConditionTypeEnum }
     * 
     * 
     */
    public List<WeatherRelatedRoadConditionTypeEnum> getWeatherRelatedRoadConditionType() {
        if (weatherRelatedRoadConditionType == null) {
            weatherRelatedRoadConditionType = new ArrayList<WeatherRelatedRoadConditionTypeEnum>();
        }
        return this.weatherRelatedRoadConditionType;
    }

    /**
     * Recupera il valore della proprietà roadSurfaceConditionMeasurements.
     * 
     * @return
     *     possible object is
     *     {@link RoadSurfaceConditionMeasurements }
     *     
     */
    public RoadSurfaceConditionMeasurements getRoadSurfaceConditionMeasurements() {
        return roadSurfaceConditionMeasurements;
    }

    /**
     * Imposta il valore della proprietà roadSurfaceConditionMeasurements.
     * 
     * @param value
     *     allowed object is
     *     {@link RoadSurfaceConditionMeasurements }
     *     
     */
    public void setRoadSurfaceConditionMeasurements(RoadSurfaceConditionMeasurements value) {
        this.roadSurfaceConditionMeasurements = value;
    }

    /**
     * Recupera il valore della proprietà weatherRelatedRoadConditionsExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getWeatherRelatedRoadConditionsExtension() {
        return weatherRelatedRoadConditionsExtension;
    }

    /**
     * Imposta il valore della proprietà weatherRelatedRoadConditionsExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setWeatherRelatedRoadConditionsExtension(ExtensionType value) {
        this.weatherRelatedRoadConditionsExtension = value;
    }

    public WeatherRelatedRoadConditions withWeatherRelatedRoadConditionType(WeatherRelatedRoadConditionTypeEnum... values) {
        if (values!= null) {
            for (WeatherRelatedRoadConditionTypeEnum value: values) {
                getWeatherRelatedRoadConditionType().add(value);
            }
        }
        return this;
    }

    public WeatherRelatedRoadConditions withWeatherRelatedRoadConditionType(Collection<WeatherRelatedRoadConditionTypeEnum> values) {
        if (values!= null) {
            getWeatherRelatedRoadConditionType().addAll(values);
        }
        return this;
    }

    public WeatherRelatedRoadConditions withRoadSurfaceConditionMeasurements(RoadSurfaceConditionMeasurements value) {
        setRoadSurfaceConditionMeasurements(value);
        return this;
    }

    public WeatherRelatedRoadConditions withWeatherRelatedRoadConditionsExtension(ExtensionType value) {
        setWeatherRelatedRoadConditionsExtension(value);
        return this;
    }

    @Override
    public WeatherRelatedRoadConditions withRoadConditionsExtension(ExtensionType value) {
        setRoadConditionsExtension(value);
        return this;
    }

    @Override
    public WeatherRelatedRoadConditions withDrivingConditionType(DrivingConditionTypeEnum value) {
        setDrivingConditionType(value);
        return this;
    }

    @Override
    public WeatherRelatedRoadConditions withConditionsExtension(ExtensionType value) {
        setConditionsExtension(value);
        return this;
    }

    @Override
    public WeatherRelatedRoadConditions withTrafficElementExtension(ExtensionType value) {
        setTrafficElementExtension(value);
        return this;
    }

    @Override
    public WeatherRelatedRoadConditions withSituationRecordCreationReference(String value) {
        setSituationRecordCreationReference(value);
        return this;
    }

    @Override
    public WeatherRelatedRoadConditions withSituationRecordCreationTime(LocalDateTime value) {
        setSituationRecordCreationTime(value);
        return this;
    }

    @Override
    public WeatherRelatedRoadConditions withSituationRecordObservationTime(LocalDateTime value) {
        setSituationRecordObservationTime(value);
        return this;
    }

    @Override
    public WeatherRelatedRoadConditions withSituationRecordVersion(BigInteger value) {
        setSituationRecordVersion(value);
        return this;
    }

    @Override
    public WeatherRelatedRoadConditions withSituationRecordVersionTime(LocalDateTime value) {
        setSituationRecordVersionTime(value);
        return this;
    }

    @Override
    public WeatherRelatedRoadConditions withSituationRecordFirstSupplierVersionTime(LocalDateTime value) {
        setSituationRecordFirstSupplierVersionTime(value);
        return this;
    }

    @Override
    public WeatherRelatedRoadConditions withConfidentialityOverride(ConfidentialityValueEnum value) {
        setConfidentialityOverride(value);
        return this;
    }

    @Override
    public WeatherRelatedRoadConditions withProbabilityOfOccurrence(ProbabilityOfOccurrenceEnum value) {
        setProbabilityOfOccurrence(value);
        return this;
    }

    @Override
    public WeatherRelatedRoadConditions withSource(Source value) {
        setSource(value);
        return this;
    }

    @Override
    public WeatherRelatedRoadConditions withValidity(Validity value) {
        setValidity(value);
        return this;
    }

    @Override
    public WeatherRelatedRoadConditions withImpact(Impact value) {
        setImpact(value);
        return this;
    }

    @Override
    public WeatherRelatedRoadConditions withCause(Cause value) {
        setCause(value);
        return this;
    }

    @Override
    public WeatherRelatedRoadConditions withGeneralPublicComment(Comment... values) {
        if (values!= null) {
            for (Comment value: values) {
                getGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public WeatherRelatedRoadConditions withGeneralPublicComment(Collection<Comment> values) {
        if (values!= null) {
            getGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public WeatherRelatedRoadConditions withNonGeneralPublicComment(Comment... values) {
        if (values!= null) {
            for (Comment value: values) {
                getNonGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public WeatherRelatedRoadConditions withNonGeneralPublicComment(Collection<Comment> values) {
        if (values!= null) {
            getNonGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public WeatherRelatedRoadConditions withUrlLink(UrlLink... values) {
        if (values!= null) {
            for (UrlLink value: values) {
                getUrlLink().add(value);
            }
        }
        return this;
    }

    @Override
    public WeatherRelatedRoadConditions withUrlLink(Collection<UrlLink> values) {
        if (values!= null) {
            getUrlLink().addAll(values);
        }
        return this;
    }

    @Override
    public WeatherRelatedRoadConditions withGroupOfLocations(GroupOfLocations value) {
        setGroupOfLocations(value);
        return this;
    }

    @Override
    public WeatherRelatedRoadConditions withManagement(Management value) {
        setManagement(value);
        return this;
    }

    @Override
    public WeatherRelatedRoadConditions withSituationRecordExtension(ExtensionType value) {
        setSituationRecordExtension(value);
        return this;
    }

    @Override
    public WeatherRelatedRoadConditions withId(String value) {
        setId(value);
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

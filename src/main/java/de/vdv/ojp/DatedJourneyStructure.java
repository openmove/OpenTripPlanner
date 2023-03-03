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
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import com.bliksemlabs.ojp.model.DirectionRefStructure;
import com.bliksemlabs.ojp.model.LineRefStructure;
import com.bliksemlabs.ojp.model.OccupancyEnumeration;
import com.bliksemlabs.ojp.model.OperatorRefStructure;
import com.bliksemlabs.ojp.model.StopPointRefStructure;
import com.bliksemlabs.ojp.model.VehicleRefStructure;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * [equivalent to  DATED VEHICLE JOURNEY in TMv6]  passenger carrying VEHICLE JOURNEY for one specified DAY TYPE for which the pattern of working is in principle defined by a SERVICE JOURNEY PATTERN. DatedJourney details of a service include its operating days. 
 * 
 * <p>Classe Java per DatedJourneyStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DatedJourneyStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;group ref="{http://www.vdv.de/ojp}DatedJourneyGroup"/&gt;
 *           &lt;group ref="{http://www.vdv.de/ojp}PrivateServiceGroup"/&gt;
 *         &lt;/choice&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}ServiceOriginGroup" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}ServiceDestinationGroup"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}ServiceStatusGroup"/&gt;
 *         &lt;element name="BookingArrangements" type="{http://www.vdv.de/ojp}BookingArrangementsContainerStructure" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.vdv.de/ojp}SituationFullRef" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatedJourneyStructure", propOrder = {
    "content"
})
public class DatedJourneyStructure {

    @XmlElementRefs({
        @XmlElementRef(name = "SituationFullRef", namespace = "http://www.vdv.de/ojp", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "LineRef", namespace = "http://www.siri.org.uk/siri", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DirectionRef", namespace = "http://www.siri.org.uk/siri", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "InfoURL", namespace = "http://www.vdv.de/ojp", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "OriginStopPointRef", namespace = "http://www.vdv.de/ojp", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "OriginText", namespace = "http://www.vdv.de/ojp", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "RouteDescription", namespace = "http://www.vdv.de/ojp", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "JourneyRef", namespace = "http://www.vdv.de/ojp", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "OperatorRef", namespace = "http://www.vdv.de/ojp", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DestinationStopPointRef", namespace = "http://www.vdv.de/ojp", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "VehicleRef", namespace = "http://www.siri.org.uk/siri", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DestinationText", namespace = "http://www.vdv.de/ojp", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Deviation", namespace = "http://www.vdv.de/ojp", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Unplanned", namespace = "http://www.vdv.de/ojp", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Via", namespace = "http://www.vdv.de/ojp", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Attribute", namespace = "http://www.vdv.de/ojp", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Mode", namespace = "http://www.vdv.de/ojp", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PrivateMode", namespace = "http://www.vdv.de/ojp", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "BookingArrangements", namespace = "http://www.vdv.de/ojp", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PublishedLineName", namespace = "http://www.vdv.de/ojp", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Cancelled", namespace = "http://www.vdv.de/ojp", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "OrganisationRef", namespace = "http://www.vdv.de/ojp", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "OperatingDayRef", namespace = "http://www.vdv.de/ojp", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Occupancy", namespace = "http://www.vdv.de/ojp", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> content;

    /**
     * Recupera il resto del modello di contenuto. 
     * 
     * <p>
     * Questa proprietà "catch-all" viene recuperata per il seguente motivo: 
     * Il nome di campo "JourneyRef" è usato da due diverse parti di uno schema. Vedere: 
     * riga 142 di file:/home/fede/Progetti/openmove/ojp-java-model/src/main/resources/xsd/2016/OJP_JourneySupport.xsd
     * riga 47 di file:/home/fede/Progetti/openmove/ojp-java-model/src/main/resources/xsd/2016/OJP_JourneySupport.xsd
     * <p>
     * Per eliminare questa proprietà, applicare una personalizzazione della proprietà a una 
     * delle seguenti due dichiarazioni per modificarne il nome: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link SituationFullRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link LineRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link DirectionRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link WebLinkStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link StopPointRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link InternationalTextStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link InternationalTextStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link JourneyRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OperatorRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link StopPointRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link InternationalTextStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link ServiceViaPointStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link GeneralAttributeStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ModeStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link PrivateModesEnumeration }{@code >}
     * {@link JAXBElement }{@code <}{@link BookingArrangementsContainerStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link InternationalTextStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link OperatorRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OperatingDayRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OccupancyEnumeration }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<?>>();
        }
        return this.content;
    }

    public DatedJourneyStructure withContent(JAXBElement<?> ... values) {
        if (values!= null) {
            for (JAXBElement<?> value: values) {
                getContent().add(value);
            }
        }
        return this;
    }

    public DatedJourneyStructure withContent(Collection<JAXBElement<?>> values) {
        if (values!= null) {
            getContent().addAll(values);
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

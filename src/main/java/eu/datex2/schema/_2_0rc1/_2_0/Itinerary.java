//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Classe Java per Itinerary complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Itinerary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}GroupOfLocations"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="locationContainedInItinerary" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}Location"&gt;
 *                 &lt;attribute name="index" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="routeDestination" type="{http://datex2.eu/schema/2_0RC1/2_0}Destination" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="itineraryExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Itinerary", propOrder = {
    "locationContainedInItinerary",
    "routeDestination",
    "itineraryExtension"
})
public class Itinerary
    extends GroupOfLocations
{

    @XmlElement(required = true)
    protected List<Itinerary.LocationContainedInItinerary> locationContainedInItinerary;
    protected List<Destination> routeDestination;
    protected ExtensionType itineraryExtension;

    /**
     * Gets the value of the locationContainedInItinerary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationContainedInItinerary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationContainedInItinerary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Itinerary.LocationContainedInItinerary }
     * 
     * 
     */
    public List<Itinerary.LocationContainedInItinerary> getLocationContainedInItinerary() {
        if (locationContainedInItinerary == null) {
            locationContainedInItinerary = new ArrayList<Itinerary.LocationContainedInItinerary>();
        }
        return this.locationContainedInItinerary;
    }

    /**
     * Gets the value of the routeDestination property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routeDestination property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRouteDestination().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Destination }
     * 
     * 
     */
    public List<Destination> getRouteDestination() {
        if (routeDestination == null) {
            routeDestination = new ArrayList<Destination>();
        }
        return this.routeDestination;
    }

    /**
     * Recupera il valore della proprietà itineraryExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getItineraryExtension() {
        return itineraryExtension;
    }

    /**
     * Imposta il valore della proprietà itineraryExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setItineraryExtension(ExtensionType value) {
        this.itineraryExtension = value;
    }

    public Itinerary withLocationContainedInItinerary(Itinerary.LocationContainedInItinerary... values) {
        if (values!= null) {
            for (Itinerary.LocationContainedInItinerary value: values) {
                getLocationContainedInItinerary().add(value);
            }
        }
        return this;
    }

    public Itinerary withLocationContainedInItinerary(Collection<Itinerary.LocationContainedInItinerary> values) {
        if (values!= null) {
            getLocationContainedInItinerary().addAll(values);
        }
        return this;
    }

    public Itinerary withRouteDestination(Destination... values) {
        if (values!= null) {
            for (Destination value: values) {
                getRouteDestination().add(value);
            }
        }
        return this;
    }

    public Itinerary withRouteDestination(Collection<Destination> values) {
        if (values!= null) {
            getRouteDestination().addAll(values);
        }
        return this;
    }

    public Itinerary withItineraryExtension(ExtensionType value) {
        setItineraryExtension(value);
        return this;
    }

    @Override
    public Itinerary withGroupOfLocationsExtension(ExtensionType value) {
        setGroupOfLocationsExtension(value);
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
     *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}Location"&gt;
     *       &lt;attribute name="index" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class LocationContainedInItinerary
        extends Location
    {

        @XmlAttribute(name = "index", required = true)
        protected int index;

        /**
         * Recupera il valore della proprietà index.
         * 
         */
        public int getIndex() {
            return index;
        }

        /**
         * Imposta il valore della proprietà index.
         * 
         */
        public void setIndex(int value) {
            this.index = value;
        }

        public Itinerary.LocationContainedInItinerary withIndex(int value) {
            setIndex(value);
            return this;
        }

        @Override
        public Itinerary.LocationContainedInItinerary withExternalReferencing(ExternalReferencing... values) {
            if (values!= null) {
                for (ExternalReferencing value: values) {
                    getExternalReferencing().add(value);
                }
            }
            return this;
        }

        @Override
        public Itinerary.LocationContainedInItinerary withExternalReferencing(Collection<ExternalReferencing> values) {
            if (values!= null) {
                getExternalReferencing().addAll(values);
            }
            return this;
        }

        @Override
        public Itinerary.LocationContainedInItinerary withLocationForDisplay(PointCoordinates value) {
            setLocationForDisplay(value);
            return this;
        }

        @Override
        public Itinerary.LocationContainedInItinerary withLocationExtension(ExtensionType value) {
            setLocationExtension(value);
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

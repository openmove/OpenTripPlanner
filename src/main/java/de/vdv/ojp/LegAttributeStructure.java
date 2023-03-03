//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package de.vdv.ojp;

import java.math.BigInteger;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.bliksemlabs.ojp.model.AccessFacilityEnumeration;
import com.bliksemlabs.ojp.model.AccommodationFacilityEnumeration;
import com.bliksemlabs.ojp.model.AssistanceFacilityEnumeration;
import com.bliksemlabs.ojp.model.FareClassFacilityEnumeration;
import com.bliksemlabs.ojp.model.HireFacilityEnumeration;
import com.bliksemlabs.ojp.model.LuggageFacilityEnumeration;
import com.bliksemlabs.ojp.model.MobilityFacilityEnumeration;
import com.bliksemlabs.ojp.model.NuisanceFacilityEnumeration;
import com.bliksemlabs.ojp.model.PassengerCommsFacilityEnumeration;
import com.bliksemlabs.ojp.model.PassengerInformationFacilityEnumeration;
import com.bliksemlabs.ojp.model.RefreshmentFacilityEnumeration;
import com.bliksemlabs.ojp.model.SanitaryFacilityEnumeration;
import com.bliksemlabs.ojp.model.TicketingFacilityEnumeration;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * Attributes that are not valid on the whole service, but only on section of a TRIP made on a single MODE without interchange between boarding and alighting (facilities available on a specified (part of a) Leg of a VEHICLE JOURNEY)
 * 
 * <p>Classe Java per LegAttributeStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="LegAttributeStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.vdv.de/ojp}GeneralAttributeStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FromStopSeqNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="ToStopSeqNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegAttributeStructure", propOrder = {
    "fromStopSeqNumber",
    "toStopSeqNumber"
})
public class LegAttributeStructure
    extends GeneralAttributeStructure
{

    @XmlElement(name = "FromStopSeqNumber")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger fromStopSeqNumber;
    @XmlElement(name = "ToStopSeqNumber")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger toStopSeqNumber;

    /**
     * Recupera il valore della proprietà fromStopSeqNumber.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFromStopSeqNumber() {
        return fromStopSeqNumber;
    }

    /**
     * Imposta il valore della proprietà fromStopSeqNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFromStopSeqNumber(BigInteger value) {
        this.fromStopSeqNumber = value;
    }

    /**
     * Recupera il valore della proprietà toStopSeqNumber.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getToStopSeqNumber() {
        return toStopSeqNumber;
    }

    /**
     * Imposta il valore della proprietà toStopSeqNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setToStopSeqNumber(BigInteger value) {
        this.toStopSeqNumber = value;
    }

    public LegAttributeStructure withFromStopSeqNumber(BigInteger value) {
        setFromStopSeqNumber(value);
        return this;
    }

    public LegAttributeStructure withToStopSeqNumber(BigInteger value) {
        setToStopSeqNumber(value);
        return this;
    }

    @Override
    public LegAttributeStructure withText(InternationalTextStructure value) {
        setText(value);
        return this;
    }

    @Override
    public LegAttributeStructure withCode(String value) {
        setCode(value);
        return this;
    }

    @Override
    public LegAttributeStructure withFareClassFacility(FareClassFacilityEnumeration... values) {
        if (values!= null) {
            for (FareClassFacilityEnumeration value: values) {
                getFareClassFacility().add(value);
            }
        }
        return this;
    }

    @Override
    public LegAttributeStructure withFareClassFacility(Collection<FareClassFacilityEnumeration> values) {
        if (values!= null) {
            getFareClassFacility().addAll(values);
        }
        return this;
    }

    @Override
    public LegAttributeStructure withTicketingFacility(TicketingFacilityEnumeration... values) {
        if (values!= null) {
            for (TicketingFacilityEnumeration value: values) {
                getTicketingFacility().add(value);
            }
        }
        return this;
    }

    @Override
    public LegAttributeStructure withTicketingFacility(Collection<TicketingFacilityEnumeration> values) {
        if (values!= null) {
            getTicketingFacility().addAll(values);
        }
        return this;
    }

    @Override
    public LegAttributeStructure withNuisanceFacility(NuisanceFacilityEnumeration... values) {
        if (values!= null) {
            for (NuisanceFacilityEnumeration value: values) {
                getNuisanceFacility().add(value);
            }
        }
        return this;
    }

    @Override
    public LegAttributeStructure withNuisanceFacility(Collection<NuisanceFacilityEnumeration> values) {
        if (values!= null) {
            getNuisanceFacility().addAll(values);
        }
        return this;
    }

    @Override
    public LegAttributeStructure withMobilityFacility(MobilityFacilityEnumeration... values) {
        if (values!= null) {
            for (MobilityFacilityEnumeration value: values) {
                getMobilityFacility().add(value);
            }
        }
        return this;
    }

    @Override
    public LegAttributeStructure withMobilityFacility(Collection<MobilityFacilityEnumeration> values) {
        if (values!= null) {
            getMobilityFacility().addAll(values);
        }
        return this;
    }

    @Override
    public LegAttributeStructure withPassengerInformationFacility(PassengerInformationFacilityEnumeration... values) {
        if (values!= null) {
            for (PassengerInformationFacilityEnumeration value: values) {
                getPassengerInformationFacility().add(value);
            }
        }
        return this;
    }

    @Override
    public LegAttributeStructure withPassengerInformationFacility(Collection<PassengerInformationFacilityEnumeration> values) {
        if (values!= null) {
            getPassengerInformationFacility().addAll(values);
        }
        return this;
    }

    @Override
    public LegAttributeStructure withPassengerCommsFacility(PassengerCommsFacilityEnumeration... values) {
        if (values!= null) {
            for (PassengerCommsFacilityEnumeration value: values) {
                getPassengerCommsFacility().add(value);
            }
        }
        return this;
    }

    @Override
    public LegAttributeStructure withPassengerCommsFacility(Collection<PassengerCommsFacilityEnumeration> values) {
        if (values!= null) {
            getPassengerCommsFacility().addAll(values);
        }
        return this;
    }

    @Override
    public LegAttributeStructure withRefreshmentFacility(RefreshmentFacilityEnumeration... values) {
        if (values!= null) {
            for (RefreshmentFacilityEnumeration value: values) {
                getRefreshmentFacility().add(value);
            }
        }
        return this;
    }

    @Override
    public LegAttributeStructure withRefreshmentFacility(Collection<RefreshmentFacilityEnumeration> values) {
        if (values!= null) {
            getRefreshmentFacility().addAll(values);
        }
        return this;
    }

    @Override
    public LegAttributeStructure withAccessFacility(AccessFacilityEnumeration... values) {
        if (values!= null) {
            for (AccessFacilityEnumeration value: values) {
                getAccessFacility().add(value);
            }
        }
        return this;
    }

    @Override
    public LegAttributeStructure withAccessFacility(Collection<AccessFacilityEnumeration> values) {
        if (values!= null) {
            getAccessFacility().addAll(values);
        }
        return this;
    }

    @Override
    public LegAttributeStructure withSanitaryFacility(SanitaryFacilityEnumeration... values) {
        if (values!= null) {
            for (SanitaryFacilityEnumeration value: values) {
                getSanitaryFacility().add(value);
            }
        }
        return this;
    }

    @Override
    public LegAttributeStructure withSanitaryFacility(Collection<SanitaryFacilityEnumeration> values) {
        if (values!= null) {
            getSanitaryFacility().addAll(values);
        }
        return this;
    }

    @Override
    public LegAttributeStructure withLuggageFacility(LuggageFacilityEnumeration... values) {
        if (values!= null) {
            for (LuggageFacilityEnumeration value: values) {
                getLuggageFacility().add(value);
            }
        }
        return this;
    }

    @Override
    public LegAttributeStructure withLuggageFacility(Collection<LuggageFacilityEnumeration> values) {
        if (values!= null) {
            getLuggageFacility().addAll(values);
        }
        return this;
    }

    @Override
    public LegAttributeStructure withAccommodationFacility(AccommodationFacilityEnumeration... values) {
        if (values!= null) {
            for (AccommodationFacilityEnumeration value: values) {
                getAccommodationFacility().add(value);
            }
        }
        return this;
    }

    @Override
    public LegAttributeStructure withAccommodationFacility(Collection<AccommodationFacilityEnumeration> values) {
        if (values!= null) {
            getAccommodationFacility().addAll(values);
        }
        return this;
    }

    @Override
    public LegAttributeStructure withAssistanceFacility(AssistanceFacilityEnumeration... values) {
        if (values!= null) {
            for (AssistanceFacilityEnumeration value: values) {
                getAssistanceFacility().add(value);
            }
        }
        return this;
    }

    @Override
    public LegAttributeStructure withAssistanceFacility(Collection<AssistanceFacilityEnumeration> values) {
        if (values!= null) {
            getAssistanceFacility().addAll(values);
        }
        return this;
    }

    @Override
    public LegAttributeStructure withHireFacility(HireFacilityEnumeration... values) {
        if (values!= null) {
            for (HireFacilityEnumeration value: values) {
                getHireFacility().add(value);
            }
        }
        return this;
    }

    @Override
    public LegAttributeStructure withHireFacility(Collection<HireFacilityEnumeration> values) {
        if (values!= null) {
            getHireFacility().addAll(values);
        }
        return this;
    }

    @Override
    public LegAttributeStructure withMandatory(Boolean value) {
        setMandatory(value);
        return this;
    }

    @Override
    public LegAttributeStructure withImportance(Integer value) {
        setImportance(value);
        return this;
    }

    @Override
    public LegAttributeStructure withInfoURL(String value) {
        setInfoURL(value);
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

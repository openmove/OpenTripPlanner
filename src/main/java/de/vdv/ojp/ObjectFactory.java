//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package de.vdv.ojp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.bliksemlabs.ojp.model.DirectionRefStructure;
import com.bliksemlabs.ojp.model.LineRefStructure;
import com.bliksemlabs.ojp.model.OccupancyEnumeration;
import com.bliksemlabs.ojp.model.OperatorRefStructure;
import com.bliksemlabs.ojp.model.ParticipantRefStructure;
import com.bliksemlabs.ojp.model.StopPointRefStructure;
import com.bliksemlabs.ojp.model.TerminateSubscriptionRequestStructure;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.vdv.ojp package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ParticipantRef_QNAME = new QName("http://www.vdv.de/ojp", "ParticipantRef");
    private final static QName _OperatorRef_QNAME = new QName("http://www.vdv.de/ojp", "OperatorRef");
    private final static QName _JourneyRef_QNAME = new QName("http://www.vdv.de/ojp", "JourneyRef");
    private final static QName _OwnerRef_QNAME = new QName("http://www.vdv.de/ojp", "OwnerRef");
    private final static QName _OperatingDayRef_QNAME = new QName("http://www.vdv.de/ojp", "OperatingDayRef");
    private final static QName _FareAuthorityRef_QNAME = new QName("http://www.vdv.de/ojp", "FareAuthorityRef");
    private final static QName _TariffZoneRef_QNAME = new QName("http://www.vdv.de/ojp", "TariffZoneRef");
    private final static QName _FareProductRef_QNAME = new QName("http://www.vdv.de/ojp", "FareProductRef");
    private final static QName _EntitlementProductRef_QNAME = new QName("http://www.vdv.de/ojp", "EntitlementProductRef");
    private final static QName _StopPlaceRef_QNAME = new QName("http://www.vdv.de/ojp", "StopPlaceRef");
    private final static QName _TopographicPlaceRef_QNAME = new QName("http://www.vdv.de/ojp", "TopographicPlaceRef");
    private final static QName _PointOfInterestRef_QNAME = new QName("http://www.vdv.de/ojp", "PointOfInterestRef");
    private final static QName _AddressRef_QNAME = new QName("http://www.vdv.de/ojp", "AddressRef");
    private final static QName _SituationFullRef_QNAME = new QName("http://www.vdv.de/ojp", "SituationFullRef");
    private final static QName _TripRequest_QNAME = new QName("http://www.vdv.de/ojp", "TripRequest");
    private final static QName _TripResponse_QNAME = new QName("http://www.vdv.de/ojp", "TripResponse");
    private final static QName _MultiPointTripRequest_QNAME = new QName("http://www.vdv.de/ojp", "MultiPointTripRequest");
    private final static QName _MultiPointTripResponse_QNAME = new QName("http://www.vdv.de/ojp", "MultiPointTripResponse");
    private final static QName _FareRequest_QNAME = new QName("http://www.vdv.de/ojp", "FareRequest");
    private final static QName _LocationInformationRequest_QNAME = new QName("http://www.vdv.de/ojp", "LocationInformationRequest");
    private final static QName _LocationInformationResponse_QNAME = new QName("http://www.vdv.de/ojp", "LocationInformationResponse");
    private final static QName _ExchangePointsRequest_QNAME = new QName("http://www.vdv.de/ojp", "ExchangePointsRequest");
    private final static QName _ExchangePointsResponse_QNAME = new QName("http://www.vdv.de/ojp", "ExchangePointsResponse");
    private final static QName _TerminateSubscriptionRequest_QNAME = new QName("http://www.vdv.de/ojp", "TerminateSubscriptionRequest");
    private final static QName _StopEventRequest_QNAME = new QName("http://www.vdv.de/ojp", "StopEventRequest");
    private final static QName _StopEventResponse_QNAME = new QName("http://www.vdv.de/ojp", "StopEventResponse");
    private final static QName _TripInfoRequest_QNAME = new QName("http://www.vdv.de/ojp", "TripInfoRequest");
    private final static QName _TripInfoResponse_QNAME = new QName("http://www.vdv.de/ojp", "TripInfoResponse");
    private final static QName _OJPFareRequest_QNAME = new QName("http://www.vdv.de/ojp", "OJPFareRequest");
    private final static QName _OJPFareDelivery_QNAME = new QName("http://www.vdv.de/ojp", "OJPFareDelivery");
    private final static QName _OJPLocationInformationRequest_QNAME = new QName("http://www.vdv.de/ojp", "OJPLocationInformationRequest");
    private final static QName _OJPLocationInformationDelivery_QNAME = new QName("http://www.vdv.de/ojp", "OJPLocationInformationDelivery");
    private final static QName _OJPExchangePointsRequest_QNAME = new QName("http://www.vdv.de/ojp", "OJPExchangePointsRequest");
    private final static QName _OJPExchangePointsDelivery_QNAME = new QName("http://www.vdv.de/ojp", "OJPExchangePointsDelivery");
    private final static QName _OJPStopEventRequest_QNAME = new QName("http://www.vdv.de/ojp", "OJPStopEventRequest");
    private final static QName _OJPStopEventDelivery_QNAME = new QName("http://www.vdv.de/ojp", "OJPStopEventDelivery");
    private final static QName _OJPTripInfoRequest_QNAME = new QName("http://www.vdv.de/ojp", "OJPTripInfoRequest");
    private final static QName _OJPTripInfoDelivery_QNAME = new QName("http://www.vdv.de/ojp", "OJPTripInfoDelivery");
    private final static QName _OJPTripRequest_QNAME = new QName("http://www.vdv.de/ojp", "OJPTripRequest");
    private final static QName _OJPTripDelivery_QNAME = new QName("http://www.vdv.de/ojp", "OJPTripDelivery");
    private final static QName _OJPMultiPointTripRequest_QNAME = new QName("http://www.vdv.de/ojp", "OJPMultiPointTripRequest");
    private final static QName _OJPMultiPointTripDelivery_QNAME = new QName("http://www.vdv.de/ojp", "OJPMultiPointTripDelivery");
    private final static QName _DatedJourneyStructureLineRef_QNAME = new QName("http://www.siri.org.uk/siri", "LineRef");
    private final static QName _DatedJourneyStructureDirectionRef_QNAME = new QName("http://www.siri.org.uk/siri", "DirectionRef");
    private final static QName _DatedJourneyStructureMode_QNAME = new QName("http://www.vdv.de/ojp", "Mode");
    private final static QName _DatedJourneyStructurePublishedLineName_QNAME = new QName("http://www.vdv.de/ojp", "PublishedLineName");
    private final static QName _DatedJourneyStructureRouteDescription_QNAME = new QName("http://www.vdv.de/ojp", "RouteDescription");
    private final static QName _DatedJourneyStructureVia_QNAME = new QName("http://www.vdv.de/ojp", "Via");
    private final static QName _DatedJourneyStructureAttribute_QNAME = new QName("http://www.vdv.de/ojp", "Attribute");
    private final static QName _DatedJourneyStructurePrivateMode_QNAME = new QName("http://www.vdv.de/ojp", "PrivateMode");
    private final static QName _DatedJourneyStructureOrganisationRef_QNAME = new QName("http://www.vdv.de/ojp", "OrganisationRef");
    private final static QName _DatedJourneyStructureInfoURL_QNAME = new QName("http://www.vdv.de/ojp", "InfoURL");
    private final static QName _DatedJourneyStructureOriginStopPointRef_QNAME = new QName("http://www.vdv.de/ojp", "OriginStopPointRef");
    private final static QName _DatedJourneyStructureOriginText_QNAME = new QName("http://www.vdv.de/ojp", "OriginText");
    private final static QName _DatedJourneyStructureDestinationStopPointRef_QNAME = new QName("http://www.vdv.de/ojp", "DestinationStopPointRef");
    private final static QName _DatedJourneyStructureDestinationText_QNAME = new QName("http://www.vdv.de/ojp", "DestinationText");
    private final static QName _DatedJourneyStructureUnplanned_QNAME = new QName("http://www.vdv.de/ojp", "Unplanned");
    private final static QName _DatedJourneyStructureCancelled_QNAME = new QName("http://www.vdv.de/ojp", "Cancelled");
    private final static QName _DatedJourneyStructureDeviation_QNAME = new QName("http://www.vdv.de/ojp", "Deviation");
    private final static QName _DatedJourneyStructureOccupancy_QNAME = new QName("http://www.vdv.de/ojp", "Occupancy");
    private final static QName _DatedJourneyStructureBookingArrangements_QNAME = new QName("http://www.vdv.de/ojp", "BookingArrangements");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.vdv.ojp
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AbstractResponseContextStructure }
     * 
     */
    public AbstractResponseContextStructure createAbstractResponseContextStructure() {
        return new AbstractResponseContextStructure();
    }

    /**
     * Create an instance of {@link LegIntermediateStructure }
     * 
     */
    public LegIntermediateStructure createLegIntermediateStructure() {
        return new LegIntermediateStructure();
    }

    /**
     * Create an instance of {@link LegAlightStructure }
     * 
     */
    public LegAlightStructure createLegAlightStructure() {
        return new LegAlightStructure();
    }

    /**
     * Create an instance of {@link LegBoardStructure }
     * 
     */
    public LegBoardStructure createLegBoardStructure() {
        return new LegBoardStructure();
    }

    /**
     * Create an instance of {@link TrackSectionStructure }
     * 
     */
    public TrackSectionStructure createTrackSectionStructure() {
        return new TrackSectionStructure();
    }

    /**
     * Create an instance of {@link CallAtStopStructure }
     * 
     */
    public CallAtStopStructure createCallAtStopStructure() {
        return new CallAtStopStructure();
    }

    /**
     * Create an instance of {@link TopographicPlaceStructure }
     * 
     */
    public TopographicPlaceStructure createTopographicPlaceStructure() {
        return new TopographicPlaceStructure();
    }

    /**
     * Create an instance of {@link JourneyRefStructure }
     * 
     */
    public JourneyRefStructure createJourneyRefStructure() {
        return new JourneyRefStructure();
    }

    /**
     * Create an instance of {@link OwnerRefStructure }
     * 
     */
    public OwnerRefStructure createOwnerRefStructure() {
        return new OwnerRefStructure();
    }

    /**
     * Create an instance of {@link OperatingDayRefStructure }
     * 
     */
    public OperatingDayRefStructure createOperatingDayRefStructure() {
        return new OperatingDayRefStructure();
    }

    /**
     * Create an instance of {@link FareAuthorityRefStructure }
     * 
     */
    public FareAuthorityRefStructure createFareAuthorityRefStructure() {
        return new FareAuthorityRefStructure();
    }

    /**
     * Create an instance of {@link TariffZoneRefStructure }
     * 
     */
    public TariffZoneRefStructure createTariffZoneRefStructure() {
        return new TariffZoneRefStructure();
    }

    /**
     * Create an instance of {@link FareProductRefStructure }
     * 
     */
    public FareProductRefStructure createFareProductRefStructure() {
        return new FareProductRefStructure();
    }

    /**
     * Create an instance of {@link EntitlementProductRefStructure }
     * 
     */
    public EntitlementProductRefStructure createEntitlementProductRefStructure() {
        return new EntitlementProductRefStructure();
    }

    /**
     * Create an instance of {@link StopPlaceRefStructure }
     * 
     */
    public StopPlaceRefStructure createStopPlaceRefStructure() {
        return new StopPlaceRefStructure();
    }

    /**
     * Create an instance of {@link TopographicPlaceRefStructure }
     * 
     */
    public TopographicPlaceRefStructure createTopographicPlaceRefStructure() {
        return new TopographicPlaceRefStructure();
    }

    /**
     * Create an instance of {@link PointOfInterestRefStructure }
     * 
     */
    public PointOfInterestRefStructure createPointOfInterestRefStructure() {
        return new PointOfInterestRefStructure();
    }

    /**
     * Create an instance of {@link AddressRefStructure }
     * 
     */
    public AddressRefStructure createAddressRefStructure() {
        return new AddressRefStructure();
    }

    /**
     * Create an instance of {@link SituationFullRefStructure }
     * 
     */
    public SituationFullRefStructure createSituationFullRefStructure() {
        return new SituationFullRefStructure();
    }

    /**
     * Create an instance of {@link TripRequestStructure }
     * 
     */
    public TripRequestStructure createTripRequestStructure() {
        return new TripRequestStructure();
    }

    /**
     * Create an instance of {@link TripResponseStructure }
     * 
     */
    public TripResponseStructure createTripResponseStructure() {
        return new TripResponseStructure();
    }

    /**
     * Create an instance of {@link MultiPointTripRequestStructure }
     * 
     */
    public MultiPointTripRequestStructure createMultiPointTripRequestStructure() {
        return new MultiPointTripRequestStructure();
    }

    /**
     * Create an instance of {@link MultiPointTripResponseStructure }
     * 
     */
    public MultiPointTripResponseStructure createMultiPointTripResponseStructure() {
        return new MultiPointTripResponseStructure();
    }

    /**
     * Create an instance of {@link FareRequestStructure }
     * 
     */
    public FareRequestStructure createFareRequestStructure() {
        return new FareRequestStructure();
    }

    /**
     * Create an instance of {@link FareResponse }
     * 
     */
    public FareResponse createFareResponse() {
        return new FareResponse();
    }

    /**
     * Create an instance of {@link FareResponseStructure }
     * 
     */
    public FareResponseStructure createFareResponseStructure() {
        return new FareResponseStructure();
    }

    /**
     * Create an instance of {@link ErrorMessageStructure }
     * 
     */
    public ErrorMessageStructure createErrorMessageStructure() {
        return new ErrorMessageStructure();
    }

    /**
     * Create an instance of {@link FareResultStructure }
     * 
     */
    public FareResultStructure createFareResultStructure() {
        return new FareResultStructure();
    }

    /**
     * Create an instance of {@link LocationInformationRequestStructure }
     * 
     */
    public LocationInformationRequestStructure createLocationInformationRequestStructure() {
        return new LocationInformationRequestStructure();
    }

    /**
     * Create an instance of {@link LocationInformationResponseStructure }
     * 
     */
    public LocationInformationResponseStructure createLocationInformationResponseStructure() {
        return new LocationInformationResponseStructure();
    }

    /**
     * Create an instance of {@link ExchangePointsRequestStructure }
     * 
     */
    public ExchangePointsRequestStructure createExchangePointsRequestStructure() {
        return new ExchangePointsRequestStructure();
    }

    /**
     * Create an instance of {@link ExchangePointsResponseStructure }
     * 
     */
    public ExchangePointsResponseStructure createExchangePointsResponseStructure() {
        return new ExchangePointsResponseStructure();
    }

    /**
     * Create an instance of {@link StopEventRequestStructure }
     * 
     */
    public StopEventRequestStructure createStopEventRequestStructure() {
        return new StopEventRequestStructure();
    }

    /**
     * Create an instance of {@link StopEventResponseStructure }
     * 
     */
    public StopEventResponseStructure createStopEventResponseStructure() {
        return new StopEventResponseStructure();
    }

    /**
     * Create an instance of {@link TripInfoRequestStructure }
     * 
     */
    public TripInfoRequestStructure createTripInfoRequestStructure() {
        return new TripInfoRequestStructure();
    }

    /**
     * Create an instance of {@link TripInfoResponseStructure }
     * 
     */
    public TripInfoResponseStructure createTripInfoResponseStructure() {
        return new TripInfoResponseStructure();
    }

    /**
     * Create an instance of {@link OJPFareRequestStructure }
     * 
     */
    public OJPFareRequestStructure createOJPFareRequestStructure() {
        return new OJPFareRequestStructure();
    }

    /**
     * Create an instance of {@link OJPFareDeliveryStructure }
     * 
     */
    public OJPFareDeliveryStructure createOJPFareDeliveryStructure() {
        return new OJPFareDeliveryStructure();
    }

    /**
     * Create an instance of {@link OJPLocationInformationRequestStructure }
     * 
     */
    public OJPLocationInformationRequestStructure createOJPLocationInformationRequestStructure() {
        return new OJPLocationInformationRequestStructure();
    }

    /**
     * Create an instance of {@link OJPLocationInformationDeliveryStructure }
     * 
     */
    public OJPLocationInformationDeliveryStructure createOJPLocationInformationDeliveryStructure() {
        return new OJPLocationInformationDeliveryStructure();
    }

    /**
     * Create an instance of {@link OJPExchangePointsRequestStructure }
     * 
     */
    public OJPExchangePointsRequestStructure createOJPExchangePointsRequestStructure() {
        return new OJPExchangePointsRequestStructure();
    }

    /**
     * Create an instance of {@link OJPExchangePointsDeliveryStructure }
     * 
     */
    public OJPExchangePointsDeliveryStructure createOJPExchangePointsDeliveryStructure() {
        return new OJPExchangePointsDeliveryStructure();
    }

    /**
     * Create an instance of {@link OJPStopEventRequestStructure }
     * 
     */
    public OJPStopEventRequestStructure createOJPStopEventRequestStructure() {
        return new OJPStopEventRequestStructure();
    }

    /**
     * Create an instance of {@link OJPStopEventDeliveryStructure }
     * 
     */
    public OJPStopEventDeliveryStructure createOJPStopEventDeliveryStructure() {
        return new OJPStopEventDeliveryStructure();
    }

    /**
     * Create an instance of {@link OJPTripInfoRequestStructure }
     * 
     */
    public OJPTripInfoRequestStructure createOJPTripInfoRequestStructure() {
        return new OJPTripInfoRequestStructure();
    }

    /**
     * Create an instance of {@link OJPTripInfoDeliveryStructure }
     * 
     */
    public OJPTripInfoDeliveryStructure createOJPTripInfoDeliveryStructure() {
        return new OJPTripInfoDeliveryStructure();
    }

    /**
     * Create an instance of {@link OJPTripRequestStructure }
     * 
     */
    public OJPTripRequestStructure createOJPTripRequestStructure() {
        return new OJPTripRequestStructure();
    }

    /**
     * Create an instance of {@link OJPTripDeliveryStructure }
     * 
     */
    public OJPTripDeliveryStructure createOJPTripDeliveryStructure() {
        return new OJPTripDeliveryStructure();
    }

    /**
     * Create an instance of {@link OJPMultiPointTripRequestStructure }
     * 
     */
    public OJPMultiPointTripRequestStructure createOJPMultiPointTripRequestStructure() {
        return new OJPMultiPointTripRequestStructure();
    }

    /**
     * Create an instance of {@link OJPMultiPointTripDeliveryStructure }
     * 
     */
    public OJPMultiPointTripDeliveryStructure createOJPMultiPointTripDeliveryStructure() {
        return new OJPMultiPointTripDeliveryStructure();
    }

    /**
     * Create an instance of {@link InternationalTextStructure }
     * 
     */
    public InternationalTextStructure createInternationalTextStructure() {
        return new InternationalTextStructure();
    }

    /**
     * Create an instance of {@link WebLinkStructure }
     * 
     */
    public WebLinkStructure createWebLinkStructure() {
        return new WebLinkStructure();
    }

    /**
     * Create an instance of {@link IndividualTransportOptionsStructure }
     * 
     */
    public IndividualTransportOptionsStructure createIndividualTransportOptionsStructure() {
        return new IndividualTransportOptionsStructure();
    }

    /**
     * Create an instance of {@link ModeStructure }
     * 
     */
    public ModeStructure createModeStructure() {
        return new ModeStructure();
    }

    /**
     * Create an instance of {@link PtModeFilterStructure }
     * 
     */
    public PtModeFilterStructure createPtModeFilterStructure() {
        return new PtModeFilterStructure();
    }

    /**
     * Create an instance of {@link PrivateModeFilterStructure }
     * 
     */
    public PrivateModeFilterStructure createPrivateModeFilterStructure() {
        return new PrivateModeFilterStructure();
    }

    /**
     * Create an instance of {@link PrivateCodeStructure }
     * 
     */
    public PrivateCodeStructure createPrivateCodeStructure() {
        return new PrivateCodeStructure();
    }

    /**
     * Create an instance of {@link OperatorFilterStructure }
     * 
     */
    public OperatorFilterStructure createOperatorFilterStructure() {
        return new OperatorFilterStructure();
    }

    /**
     * Create an instance of {@link LineDirectionFilterStructure }
     * 
     */
    public LineDirectionFilterStructure createLineDirectionFilterStructure() {
        return new LineDirectionFilterStructure();
    }

    /**
     * Create an instance of {@link SharingServiceStructure }
     * 
     */
    public SharingServiceStructure createSharingServiceStructure() {
        return new SharingServiceStructure();
    }

    /**
     * Create an instance of {@link OperatingDaysStructure }
     * 
     */
    public OperatingDaysStructure createOperatingDaysStructure() {
        return new OperatingDaysStructure();
    }

    /**
     * Create an instance of {@link WeekdayTimePeriodStructure }
     * 
     */
    public WeekdayTimePeriodStructure createWeekdayTimePeriodStructure() {
        return new WeekdayTimePeriodStructure();
    }

    /**
     * Create an instance of {@link GeneralAttributeStructure }
     * 
     */
    public GeneralAttributeStructure createGeneralAttributeStructure() {
        return new GeneralAttributeStructure();
    }

    /**
     * Create an instance of {@link TariffZoneStructure }
     * 
     */
    public TariffZoneStructure createTariffZoneStructure() {
        return new TariffZoneStructure();
    }

    /**
     * Create an instance of {@link TariffZoneListInAreaStructure }
     * 
     */
    public TariffZoneListInAreaStructure createTariffZoneListInAreaStructure() {
        return new TariffZoneListInAreaStructure();
    }

    /**
     * Create an instance of {@link TariffZoneRefListStructure }
     * 
     */
    public TariffZoneRefListStructure createTariffZoneRefListStructure() {
        return new TariffZoneRefListStructure();
    }

    /**
     * Create an instance of {@link BookingArrangementStructure }
     * 
     */
    public BookingArrangementStructure createBookingArrangementStructure() {
        return new BookingArrangementStructure();
    }

    /**
     * Create an instance of {@link BookingArrangementsContainerStructure }
     * 
     */
    public BookingArrangementsContainerStructure createBookingArrangementsContainerStructure() {
        return new BookingArrangementsContainerStructure();
    }

    /**
     * Create an instance of {@link FareProductStructure }
     * 
     */
    public FareProductStructure createFareProductStructure() {
        return new FareProductStructure();
    }

    /**
     * Create an instance of {@link TripFareResultStructure }
     * 
     */
    public TripFareResultStructure createTripFareResultStructure() {
        return new TripFareResultStructure();
    }

    /**
     * Create an instance of {@link FarePassengerStructure }
     * 
     */
    public FarePassengerStructure createFarePassengerStructure() {
        return new FarePassengerStructure();
    }

    /**
     * Create an instance of {@link FareParamStructure }
     * 
     */
    public FareParamStructure createFareParamStructure() {
        return new FareParamStructure();
    }

    /**
     * Create an instance of {@link StopPointStructure }
     * 
     */
    public StopPointStructure createStopPointStructure() {
        return new StopPointStructure();
    }

    /**
     * Create an instance of {@link StopPlaceStructure }
     * 
     */
    public StopPlaceStructure createStopPlaceStructure() {
        return new StopPlaceStructure();
    }

    /**
     * Create an instance of {@link PointOfInterestStructure }
     * 
     */
    public PointOfInterestStructure createPointOfInterestStructure() {
        return new PointOfInterestStructure();
    }

    /**
     * Create an instance of {@link PointOfInterestCategoryStructure }
     * 
     */
    public PointOfInterestCategoryStructure createPointOfInterestCategoryStructure() {
        return new PointOfInterestCategoryStructure();
    }

    /**
     * Create an instance of {@link OsmTagStructure }
     * 
     */
    public OsmTagStructure createOsmTagStructure() {
        return new OsmTagStructure();
    }

    /**
     * Create an instance of {@link PointOfInterestFilterStructure }
     * 
     */
    public PointOfInterestFilterStructure createPointOfInterestFilterStructure() {
        return new PointOfInterestFilterStructure();
    }

    /**
     * Create an instance of {@link AddressStructure }
     * 
     */
    public AddressStructure createAddressStructure() {
        return new AddressStructure();
    }

    /**
     * Create an instance of {@link PlaceStructure }
     * 
     */
    public PlaceStructure createPlaceStructure() {
        return new PlaceStructure();
    }

    /**
     * Create an instance of {@link PlaceRefStructure }
     * 
     */
    public PlaceRefStructure createPlaceRefStructure() {
        return new PlaceRefStructure();
    }

    /**
     * Create an instance of {@link SituationsStructure }
     * 
     */
    public SituationsStructure createSituationsStructure() {
        return new SituationsStructure();
    }

    /**
     * Create an instance of {@link ServiceViaPointStructure }
     * 
     */
    public ServiceViaPointStructure createServiceViaPointStructure() {
        return new ServiceViaPointStructure();
    }

    /**
     * Create an instance of {@link TripViaStructure }
     * 
     */
    public TripViaStructure createTripViaStructure() {
        return new TripViaStructure();
    }

    /**
     * Create an instance of {@link DatedJourneyStructure }
     * 
     */
    public DatedJourneyStructure createDatedJourneyStructure() {
        return new DatedJourneyStructure();
    }

    /**
     * Create an instance of {@link TripLocationStructure }
     * 
     */
    public TripLocationStructure createTripLocationStructure() {
        return new TripLocationStructure();
    }

    /**
     * Create an instance of {@link ContinuousServiceStructure }
     * 
     */
    public ContinuousServiceStructure createContinuousServiceStructure() {
        return new ContinuousServiceStructure();
    }

    /**
     * Create an instance of {@link VehiclePositionStructure }
     * 
     */
    public VehiclePositionStructure createVehiclePositionStructure() {
        return new VehiclePositionStructure();
    }

    /**
     * Create an instance of {@link PlaceContextStructure }
     * 
     */
    public PlaceContextStructure createPlaceContextStructure() {
        return new PlaceContextStructure();
    }

    /**
     * Create an instance of {@link LegAttributeStructure }
     * 
     */
    public LegAttributeStructure createLegAttributeStructure() {
        return new LegAttributeStructure();
    }

    /**
     * Create an instance of {@link LegTrackStructure }
     * 
     */
    public LegTrackStructure createLegTrackStructure() {
        return new LegTrackStructure();
    }

    /**
     * Create an instance of {@link TripParamStructure }
     * 
     */
    public TripParamStructure createTripParamStructure() {
        return new TripParamStructure();
    }

    /**
     * Create an instance of {@link NotViaStructure }
     * 
     */
    public NotViaStructure createNotViaStructure() {
        return new NotViaStructure();
    }

    /**
     * Create an instance of {@link NoChangeAtStructure }
     * 
     */
    public NoChangeAtStructure createNoChangeAtStructure() {
        return new NoChangeAtStructure();
    }

    /**
     * Create an instance of {@link TripResponseContextStructure }
     * 
     */
    public TripResponseContextStructure createTripResponseContextStructure() {
        return new TripResponseContextStructure();
    }

    /**
     * Create an instance of {@link TripResultStructure }
     * 
     */
    public TripResultStructure createTripResultStructure() {
        return new TripResultStructure();
    }

    /**
     * Create an instance of {@link TripSummaryStructure }
     * 
     */
    public TripSummaryStructure createTripSummaryStructure() {
        return new TripSummaryStructure();
    }

    /**
     * Create an instance of {@link TripStructure }
     * 
     */
    public TripStructure createTripStructure() {
        return new TripStructure();
    }

    /**
     * Create an instance of {@link TripLegStructure }
     * 
     */
    public TripLegStructure createTripLegStructure() {
        return new TripLegStructure();
    }

    /**
     * Create an instance of {@link TimedLegStructure }
     * 
     */
    public TimedLegStructure createTimedLegStructure() {
        return new TimedLegStructure();
    }

    /**
     * Create an instance of {@link TransferLegStructure }
     * 
     */
    public TransferLegStructure createTransferLegStructure() {
        return new TransferLegStructure();
    }

    /**
     * Create an instance of {@link ContinuousLegStructure }
     * 
     */
    public ContinuousLegStructure createContinuousLegStructure() {
        return new ContinuousLegStructure();
    }

    /**
     * Create an instance of {@link PathGuidanceStructure }
     * 
     */
    public PathGuidanceStructure createPathGuidanceStructure() {
        return new PathGuidanceStructure();
    }

    /**
     * Create an instance of {@link PathGuidanceSectionStructure }
     * 
     */
    public PathGuidanceSectionStructure createPathGuidanceSectionStructure() {
        return new PathGuidanceSectionStructure();
    }

    /**
     * Create an instance of {@link PathLinkStructure }
     * 
     */
    public PathLinkStructure createPathLinkStructure() {
        return new PathLinkStructure();
    }

    /**
     * Create an instance of {@link MultiPointTripParamStructure }
     * 
     */
    public MultiPointTripParamStructure createMultiPointTripParamStructure() {
        return new MultiPointTripParamStructure();
    }

    /**
     * Create an instance of {@link MultiPointTripResultStructure }
     * 
     */
    public MultiPointTripResultStructure createMultiPointTripResultStructure() {
        return new MultiPointTripResultStructure();
    }

    /**
     * Create an instance of {@link StopFareRequestStructure }
     * 
     */
    public StopFareRequestStructure createStopFareRequestStructure() {
        return new StopFareRequestStructure();
    }

    /**
     * Create an instance of {@link StaticFareRequestStructure }
     * 
     */
    public StaticFareRequestStructure createStaticFareRequestStructure() {
        return new StaticFareRequestStructure();
    }

    /**
     * Create an instance of {@link TripFareRequestStructure }
     * 
     */
    public TripFareRequestStructure createTripFareRequestStructure() {
        return new TripFareRequestStructure();
    }

    /**
     * Create an instance of {@link MultiTripFareRequestStructure }
     * 
     */
    public MultiTripFareRequestStructure createMultiTripFareRequestStructure() {
        return new MultiTripFareRequestStructure();
    }

    /**
     * Create an instance of {@link StopFareResultStructure }
     * 
     */
    public StopFareResultStructure createStopFareResultStructure() {
        return new StopFareResultStructure();
    }

    /**
     * Create an instance of {@link StaticFareResultStructure }
     * 
     */
    public StaticFareResultStructure createStaticFareResultStructure() {
        return new StaticFareResultStructure();
    }

    /**
     * Create an instance of {@link TripFareProductReferenceStructure }
     * 
     */
    public TripFareProductReferenceStructure createTripFareProductReferenceStructure() {
        return new TripFareProductReferenceStructure();
    }

    /**
     * Create an instance of {@link MultiTripFareResultStructure }
     * 
     */
    public MultiTripFareResultStructure createMultiTripFareResultStructure() {
        return new MultiTripFareResultStructure();
    }

    /**
     * Create an instance of {@link InitialLocationInputStructure }
     * 
     */
    public InitialLocationInputStructure createInitialLocationInputStructure() {
        return new InitialLocationInputStructure();
    }

    /**
     * Create an instance of {@link PlaceParamStructure }
     * 
     */
    public PlaceParamStructure createPlaceParamStructure() {
        return new PlaceParamStructure();
    }

    /**
     * Create an instance of {@link GeoRestrictionsStructure }
     * 
     */
    public GeoRestrictionsStructure createGeoRestrictionsStructure() {
        return new GeoRestrictionsStructure();
    }

    /**
     * Create an instance of {@link GeoCircleStructure }
     * 
     */
    public GeoCircleStructure createGeoCircleStructure() {
        return new GeoCircleStructure();
    }

    /**
     * Create an instance of {@link GeoRectangleStructure }
     * 
     */
    public GeoRectangleStructure createGeoRectangleStructure() {
        return new GeoRectangleStructure();
    }

    /**
     * Create an instance of {@link GeoAreaStructure }
     * 
     */
    public GeoAreaStructure createGeoAreaStructure() {
        return new GeoAreaStructure();
    }

    /**
     * Create an instance of {@link PlaceResultStructure }
     * 
     */
    public PlaceResultStructure createPlaceResultStructure() {
        return new PlaceResultStructure();
    }

    /**
     * Create an instance of {@link ExchangePointsParamStructure }
     * 
     */
    public ExchangePointsParamStructure createExchangePointsParamStructure() {
        return new ExchangePointsParamStructure();
    }

    /**
     * Create an instance of {@link ExchangePointsResultStructure }
     * 
     */
    public ExchangePointsResultStructure createExchangePointsResultStructure() {
        return new ExchangePointsResultStructure();
    }

    /**
     * Create an instance of {@link AbstractOJPServiceRequestStructure }
     * 
     */
    public AbstractOJPServiceRequestStructure createAbstractOJPServiceRequestStructure() {
        return new AbstractOJPServiceRequestStructure();
    }

    /**
     * Create an instance of {@link AbstractOJPSubscriptionRequestStructure }
     * 
     */
    public AbstractOJPSubscriptionRequestStructure createAbstractOJPSubscriptionRequestStructure() {
        return new AbstractOJPSubscriptionRequestStructure();
    }

    /**
     * Create an instance of {@link StopEventParamStructure }
     * 
     */
    public StopEventParamStructure createStopEventParamStructure() {
        return new StopEventParamStructure();
    }

    /**
     * Create an instance of {@link StopEventResultStructure }
     * 
     */
    public StopEventResultStructure createStopEventResultStructure() {
        return new StopEventResultStructure();
    }

    /**
     * Create an instance of {@link StopEventStructure }
     * 
     */
    public StopEventStructure createStopEventStructure() {
        return new StopEventStructure();
    }

    /**
     * Create an instance of {@link StopEventResponseContextStructure }
     * 
     */
    public StopEventResponseContextStructure createStopEventResponseContextStructure() {
        return new StopEventResponseContextStructure();
    }

    /**
     * Create an instance of {@link CallAtNearStopStructure }
     * 
     */
    public CallAtNearStopStructure createCallAtNearStopStructure() {
        return new CallAtNearStopStructure();
    }

    /**
     * Create an instance of {@link TripInfoParamStructure }
     * 
     */
    public TripInfoParamStructure createTripInfoParamStructure() {
        return new TripInfoParamStructure();
    }

    /**
     * Create an instance of {@link TripInfoResponseContextStructure }
     * 
     */
    public TripInfoResponseContextStructure createTripInfoResponseContextStructure() {
        return new TripInfoResponseContextStructure();
    }

    /**
     * Create an instance of {@link TripInfoResultStructure }
     * 
     */
    public TripInfoResultStructure createTripInfoResultStructure() {
        return new TripInfoResultStructure();
    }

    /**
     * Create an instance of {@link AbstractResponseContextStructure.Places }
     * 
     */
    public AbstractResponseContextStructure.Places createAbstractResponseContextStructurePlaces() {
        return new AbstractResponseContextStructure.Places();
    }

    /**
     * Create an instance of {@link LegIntermediateStructure.ServiceArrival }
     * 
     */
    public LegIntermediateStructure.ServiceArrival createLegIntermediateStructureServiceArrival() {
        return new LegIntermediateStructure.ServiceArrival();
    }

    /**
     * Create an instance of {@link LegIntermediateStructure.ServiceDeparture }
     * 
     */
    public LegIntermediateStructure.ServiceDeparture createLegIntermediateStructureServiceDeparture() {
        return new LegIntermediateStructure.ServiceDeparture();
    }

    /**
     * Create an instance of {@link LegAlightStructure.ServiceArrival }
     * 
     */
    public LegAlightStructure.ServiceArrival createLegAlightStructureServiceArrival() {
        return new LegAlightStructure.ServiceArrival();
    }

    /**
     * Create an instance of {@link LegAlightStructure.ServiceDeparture }
     * 
     */
    public LegAlightStructure.ServiceDeparture createLegAlightStructureServiceDeparture() {
        return new LegAlightStructure.ServiceDeparture();
    }

    /**
     * Create an instance of {@link LegBoardStructure.ServiceArrival }
     * 
     */
    public LegBoardStructure.ServiceArrival createLegBoardStructureServiceArrival() {
        return new LegBoardStructure.ServiceArrival();
    }

    /**
     * Create an instance of {@link LegBoardStructure.ServiceDeparture }
     * 
     */
    public LegBoardStructure.ServiceDeparture createLegBoardStructureServiceDeparture() {
        return new LegBoardStructure.ServiceDeparture();
    }

    /**
     * Create an instance of {@link TrackSectionStructure.LinkProjection }
     * 
     */
    public TrackSectionStructure.LinkProjection createTrackSectionStructureLinkProjection() {
        return new TrackSectionStructure.LinkProjection();
    }

    /**
     * Create an instance of {@link CallAtStopStructure.ServiceArrival }
     * 
     */
    public CallAtStopStructure.ServiceArrival createCallAtStopStructureServiceArrival() {
        return new CallAtStopStructure.ServiceArrival();
    }

    /**
     * Create an instance of {@link CallAtStopStructure.ServiceDeparture }
     * 
     */
    public CallAtStopStructure.ServiceDeparture createCallAtStopStructureServiceDeparture() {
        return new CallAtStopStructure.ServiceDeparture();
    }

    /**
     * Create an instance of {@link TopographicPlaceStructure.Area }
     * 
     */
    public TopographicPlaceStructure.Area createTopographicPlaceStructureArea() {
        return new TopographicPlaceStructure.Area();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParticipantRefStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "ParticipantRef")
    public JAXBElement<ParticipantRefStructure> createParticipantRef(ParticipantRefStructure value) {
        return new JAXBElement<ParticipantRefStructure>(_ParticipantRef_QNAME, ParticipantRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperatorRefStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "OperatorRef")
    public JAXBElement<OperatorRefStructure> createOperatorRef(OperatorRefStructure value) {
        return new JAXBElement<OperatorRefStructure>(_OperatorRef_QNAME, OperatorRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JourneyRefStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "JourneyRef")
    public JAXBElement<JourneyRefStructure> createJourneyRef(JourneyRefStructure value) {
        return new JAXBElement<JourneyRefStructure>(_JourneyRef_QNAME, JourneyRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OwnerRefStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "OwnerRef")
    public JAXBElement<OwnerRefStructure> createOwnerRef(OwnerRefStructure value) {
        return new JAXBElement<OwnerRefStructure>(_OwnerRef_QNAME, OwnerRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperatingDayRefStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "OperatingDayRef")
    public JAXBElement<OperatingDayRefStructure> createOperatingDayRef(OperatingDayRefStructure value) {
        return new JAXBElement<OperatingDayRefStructure>(_OperatingDayRef_QNAME, OperatingDayRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FareAuthorityRefStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "FareAuthorityRef")
    public JAXBElement<FareAuthorityRefStructure> createFareAuthorityRef(FareAuthorityRefStructure value) {
        return new JAXBElement<FareAuthorityRefStructure>(_FareAuthorityRef_QNAME, FareAuthorityRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TariffZoneRefStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "TariffZoneRef")
    public JAXBElement<TariffZoneRefStructure> createTariffZoneRef(TariffZoneRefStructure value) {
        return new JAXBElement<TariffZoneRefStructure>(_TariffZoneRef_QNAME, TariffZoneRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FareProductRefStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "FareProductRef")
    public JAXBElement<FareProductRefStructure> createFareProductRef(FareProductRefStructure value) {
        return new JAXBElement<FareProductRefStructure>(_FareProductRef_QNAME, FareProductRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntitlementProductRefStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "EntitlementProductRef")
    public JAXBElement<EntitlementProductRefStructure> createEntitlementProductRef(EntitlementProductRefStructure value) {
        return new JAXBElement<EntitlementProductRefStructure>(_EntitlementProductRef_QNAME, EntitlementProductRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopPlaceRefStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "StopPlaceRef")
    public JAXBElement<StopPlaceRefStructure> createStopPlaceRef(StopPlaceRefStructure value) {
        return new JAXBElement<StopPlaceRefStructure>(_StopPlaceRef_QNAME, StopPlaceRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopographicPlaceRefStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "TopographicPlaceRef")
    public JAXBElement<TopographicPlaceRefStructure> createTopographicPlaceRef(TopographicPlaceRefStructure value) {
        return new JAXBElement<TopographicPlaceRefStructure>(_TopographicPlaceRef_QNAME, TopographicPlaceRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PointOfInterestRefStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "PointOfInterestRef")
    public JAXBElement<PointOfInterestRefStructure> createPointOfInterestRef(PointOfInterestRefStructure value) {
        return new JAXBElement<PointOfInterestRefStructure>(_PointOfInterestRef_QNAME, PointOfInterestRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressRefStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "AddressRef")
    public JAXBElement<AddressRefStructure> createAddressRef(AddressRefStructure value) {
        return new JAXBElement<AddressRefStructure>(_AddressRef_QNAME, AddressRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SituationFullRefStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "SituationFullRef")
    public JAXBElement<SituationFullRefStructure> createSituationFullRef(SituationFullRefStructure value) {
        return new JAXBElement<SituationFullRefStructure>(_SituationFullRef_QNAME, SituationFullRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TripRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "TripRequest")
    public JAXBElement<TripRequestStructure> createTripRequest(TripRequestStructure value) {
        return new JAXBElement<TripRequestStructure>(_TripRequest_QNAME, TripRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TripResponseStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "TripResponse")
    public JAXBElement<TripResponseStructure> createTripResponse(TripResponseStructure value) {
        return new JAXBElement<TripResponseStructure>(_TripResponse_QNAME, TripResponseStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiPointTripRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "MultiPointTripRequest")
    public JAXBElement<MultiPointTripRequestStructure> createMultiPointTripRequest(MultiPointTripRequestStructure value) {
        return new JAXBElement<MultiPointTripRequestStructure>(_MultiPointTripRequest_QNAME, MultiPointTripRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiPointTripResponseStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "MultiPointTripResponse")
    public JAXBElement<MultiPointTripResponseStructure> createMultiPointTripResponse(MultiPointTripResponseStructure value) {
        return new JAXBElement<MultiPointTripResponseStructure>(_MultiPointTripResponse_QNAME, MultiPointTripResponseStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FareRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "FareRequest")
    public JAXBElement<FareRequestStructure> createFareRequest(FareRequestStructure value) {
        return new JAXBElement<FareRequestStructure>(_FareRequest_QNAME, FareRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationInformationRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "LocationInformationRequest")
    public JAXBElement<LocationInformationRequestStructure> createLocationInformationRequest(LocationInformationRequestStructure value) {
        return new JAXBElement<LocationInformationRequestStructure>(_LocationInformationRequest_QNAME, LocationInformationRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationInformationResponseStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "LocationInformationResponse")
    public JAXBElement<LocationInformationResponseStructure> createLocationInformationResponse(LocationInformationResponseStructure value) {
        return new JAXBElement<LocationInformationResponseStructure>(_LocationInformationResponse_QNAME, LocationInformationResponseStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExchangePointsRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "ExchangePointsRequest")
    public JAXBElement<ExchangePointsRequestStructure> createExchangePointsRequest(ExchangePointsRequestStructure value) {
        return new JAXBElement<ExchangePointsRequestStructure>(_ExchangePointsRequest_QNAME, ExchangePointsRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExchangePointsResponseStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "ExchangePointsResponse")
    public JAXBElement<ExchangePointsResponseStructure> createExchangePointsResponse(ExchangePointsResponseStructure value) {
        return new JAXBElement<ExchangePointsResponseStructure>(_ExchangePointsResponse_QNAME, ExchangePointsResponseStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminateSubscriptionRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "TerminateSubscriptionRequest")
    public JAXBElement<TerminateSubscriptionRequestStructure> createTerminateSubscriptionRequest(TerminateSubscriptionRequestStructure value) {
        return new JAXBElement<TerminateSubscriptionRequestStructure>(_TerminateSubscriptionRequest_QNAME, TerminateSubscriptionRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopEventRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "StopEventRequest")
    public JAXBElement<StopEventRequestStructure> createStopEventRequest(StopEventRequestStructure value) {
        return new JAXBElement<StopEventRequestStructure>(_StopEventRequest_QNAME, StopEventRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopEventResponseStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "StopEventResponse")
    public JAXBElement<StopEventResponseStructure> createStopEventResponse(StopEventResponseStructure value) {
        return new JAXBElement<StopEventResponseStructure>(_StopEventResponse_QNAME, StopEventResponseStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TripInfoRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "TripInfoRequest")
    public JAXBElement<TripInfoRequestStructure> createTripInfoRequest(TripInfoRequestStructure value) {
        return new JAXBElement<TripInfoRequestStructure>(_TripInfoRequest_QNAME, TripInfoRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TripInfoResponseStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "TripInfoResponse")
    public JAXBElement<TripInfoResponseStructure> createTripInfoResponse(TripInfoResponseStructure value) {
        return new JAXBElement<TripInfoResponseStructure>(_TripInfoResponse_QNAME, TripInfoResponseStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OJPFareRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "OJPFareRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceRequest")
    public JAXBElement<OJPFareRequestStructure> createOJPFareRequest(OJPFareRequestStructure value) {
        return new JAXBElement<OJPFareRequestStructure>(_OJPFareRequest_QNAME, OJPFareRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OJPFareDeliveryStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "OJPFareDelivery", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceDelivery")
    public JAXBElement<OJPFareDeliveryStructure> createOJPFareDelivery(OJPFareDeliveryStructure value) {
        return new JAXBElement<OJPFareDeliveryStructure>(_OJPFareDelivery_QNAME, OJPFareDeliveryStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OJPLocationInformationRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "OJPLocationInformationRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceRequest")
    public JAXBElement<OJPLocationInformationRequestStructure> createOJPLocationInformationRequest(OJPLocationInformationRequestStructure value) {
        return new JAXBElement<OJPLocationInformationRequestStructure>(_OJPLocationInformationRequest_QNAME, OJPLocationInformationRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OJPLocationInformationDeliveryStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "OJPLocationInformationDelivery", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceDelivery")
    public JAXBElement<OJPLocationInformationDeliveryStructure> createOJPLocationInformationDelivery(OJPLocationInformationDeliveryStructure value) {
        return new JAXBElement<OJPLocationInformationDeliveryStructure>(_OJPLocationInformationDelivery_QNAME, OJPLocationInformationDeliveryStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OJPExchangePointsRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "OJPExchangePointsRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceRequest")
    public JAXBElement<OJPExchangePointsRequestStructure> createOJPExchangePointsRequest(OJPExchangePointsRequestStructure value) {
        return new JAXBElement<OJPExchangePointsRequestStructure>(_OJPExchangePointsRequest_QNAME, OJPExchangePointsRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OJPExchangePointsDeliveryStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "OJPExchangePointsDelivery", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceDelivery")
    public JAXBElement<OJPExchangePointsDeliveryStructure> createOJPExchangePointsDelivery(OJPExchangePointsDeliveryStructure value) {
        return new JAXBElement<OJPExchangePointsDeliveryStructure>(_OJPExchangePointsDelivery_QNAME, OJPExchangePointsDeliveryStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OJPStopEventRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "OJPStopEventRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceRequest")
    public JAXBElement<OJPStopEventRequestStructure> createOJPStopEventRequest(OJPStopEventRequestStructure value) {
        return new JAXBElement<OJPStopEventRequestStructure>(_OJPStopEventRequest_QNAME, OJPStopEventRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OJPStopEventDeliveryStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "OJPStopEventDelivery", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceDelivery")
    public JAXBElement<OJPStopEventDeliveryStructure> createOJPStopEventDelivery(OJPStopEventDeliveryStructure value) {
        return new JAXBElement<OJPStopEventDeliveryStructure>(_OJPStopEventDelivery_QNAME, OJPStopEventDeliveryStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OJPTripInfoRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "OJPTripInfoRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceRequest")
    public JAXBElement<OJPTripInfoRequestStructure> createOJPTripInfoRequest(OJPTripInfoRequestStructure value) {
        return new JAXBElement<OJPTripInfoRequestStructure>(_OJPTripInfoRequest_QNAME, OJPTripInfoRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OJPTripInfoDeliveryStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "OJPTripInfoDelivery", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceDelivery")
    public JAXBElement<OJPTripInfoDeliveryStructure> createOJPTripInfoDelivery(OJPTripInfoDeliveryStructure value) {
        return new JAXBElement<OJPTripInfoDeliveryStructure>(_OJPTripInfoDelivery_QNAME, OJPTripInfoDeliveryStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OJPTripRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "OJPTripRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceRequest")
    public JAXBElement<OJPTripRequestStructure> createOJPTripRequest(OJPTripRequestStructure value) {
        return new JAXBElement<OJPTripRequestStructure>(_OJPTripRequest_QNAME, OJPTripRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OJPTripDeliveryStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "OJPTripDelivery", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceDelivery")
    public JAXBElement<OJPTripDeliveryStructure> createOJPTripDelivery(OJPTripDeliveryStructure value) {
        return new JAXBElement<OJPTripDeliveryStructure>(_OJPTripDelivery_QNAME, OJPTripDeliveryStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OJPMultiPointTripRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "OJPMultiPointTripRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceRequest")
    public JAXBElement<OJPMultiPointTripRequestStructure> createOJPMultiPointTripRequest(OJPMultiPointTripRequestStructure value) {
        return new JAXBElement<OJPMultiPointTripRequestStructure>(_OJPMultiPointTripRequest_QNAME, OJPMultiPointTripRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OJPMultiPointTripDeliveryStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "OJPMultiPointTripDelivery", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceDelivery")
    public JAXBElement<OJPMultiPointTripDeliveryStructure> createOJPMultiPointTripDelivery(OJPMultiPointTripDeliveryStructure value) {
        return new JAXBElement<OJPMultiPointTripDeliveryStructure>(_OJPMultiPointTripDelivery_QNAME, OJPMultiPointTripDeliveryStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineRefStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "LineRef", scope = DatedJourneyStructure.class)
    public JAXBElement<LineRefStructure> createDatedJourneyStructureLineRef(LineRefStructure value) {
        return new JAXBElement<LineRefStructure>(_DatedJourneyStructureLineRef_QNAME, LineRefStructure.class, DatedJourneyStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DirectionRefStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "DirectionRef", scope = DatedJourneyStructure.class)
    public JAXBElement<DirectionRefStructure> createDatedJourneyStructureDirectionRef(DirectionRefStructure value) {
        return new JAXBElement<DirectionRefStructure>(_DatedJourneyStructureDirectionRef_QNAME, DirectionRefStructure.class, DatedJourneyStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModeStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "Mode", scope = DatedJourneyStructure.class)
    public JAXBElement<ModeStructure> createDatedJourneyStructureMode(ModeStructure value) {
        return new JAXBElement<ModeStructure>(_DatedJourneyStructureMode_QNAME, ModeStructure.class, DatedJourneyStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InternationalTextStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "PublishedLineName", scope = DatedJourneyStructure.class)
    public JAXBElement<InternationalTextStructure> createDatedJourneyStructurePublishedLineName(InternationalTextStructure value) {
        return new JAXBElement<InternationalTextStructure>(_DatedJourneyStructurePublishedLineName_QNAME, InternationalTextStructure.class, DatedJourneyStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InternationalTextStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "RouteDescription", scope = DatedJourneyStructure.class)
    public JAXBElement<InternationalTextStructure> createDatedJourneyStructureRouteDescription(InternationalTextStructure value) {
        return new JAXBElement<InternationalTextStructure>(_DatedJourneyStructureRouteDescription_QNAME, InternationalTextStructure.class, DatedJourneyStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceViaPointStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "Via", scope = DatedJourneyStructure.class)
    public JAXBElement<ServiceViaPointStructure> createDatedJourneyStructureVia(ServiceViaPointStructure value) {
        return new JAXBElement<ServiceViaPointStructure>(_DatedJourneyStructureVia_QNAME, ServiceViaPointStructure.class, DatedJourneyStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeneralAttributeStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "Attribute", scope = DatedJourneyStructure.class)
    public JAXBElement<GeneralAttributeStructure> createDatedJourneyStructureAttribute(GeneralAttributeStructure value) {
        return new JAXBElement<GeneralAttributeStructure>(_DatedJourneyStructureAttribute_QNAME, GeneralAttributeStructure.class, DatedJourneyStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrivateModesEnumeration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "PrivateMode", scope = DatedJourneyStructure.class)
    public JAXBElement<PrivateModesEnumeration> createDatedJourneyStructurePrivateMode(PrivateModesEnumeration value) {
        return new JAXBElement<PrivateModesEnumeration>(_DatedJourneyStructurePrivateMode_QNAME, PrivateModesEnumeration.class, DatedJourneyStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperatorRefStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "OrganisationRef", scope = DatedJourneyStructure.class)
    public JAXBElement<OperatorRefStructure> createDatedJourneyStructureOrganisationRef(OperatorRefStructure value) {
        return new JAXBElement<OperatorRefStructure>(_DatedJourneyStructureOrganisationRef_QNAME, OperatorRefStructure.class, DatedJourneyStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebLinkStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "InfoURL", scope = DatedJourneyStructure.class)
    public JAXBElement<WebLinkStructure> createDatedJourneyStructureInfoURL(WebLinkStructure value) {
        return new JAXBElement<WebLinkStructure>(_DatedJourneyStructureInfoURL_QNAME, WebLinkStructure.class, DatedJourneyStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopPointRefStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "OriginStopPointRef", scope = DatedJourneyStructure.class)
    public JAXBElement<StopPointRefStructure> createDatedJourneyStructureOriginStopPointRef(StopPointRefStructure value) {
        return new JAXBElement<StopPointRefStructure>(_DatedJourneyStructureOriginStopPointRef_QNAME, StopPointRefStructure.class, DatedJourneyStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InternationalTextStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "OriginText", scope = DatedJourneyStructure.class)
    public JAXBElement<InternationalTextStructure> createDatedJourneyStructureOriginText(InternationalTextStructure value) {
        return new JAXBElement<InternationalTextStructure>(_DatedJourneyStructureOriginText_QNAME, InternationalTextStructure.class, DatedJourneyStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopPointRefStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "DestinationStopPointRef", scope = DatedJourneyStructure.class)
    public JAXBElement<StopPointRefStructure> createDatedJourneyStructureDestinationStopPointRef(StopPointRefStructure value) {
        return new JAXBElement<StopPointRefStructure>(_DatedJourneyStructureDestinationStopPointRef_QNAME, StopPointRefStructure.class, DatedJourneyStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InternationalTextStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "DestinationText", scope = DatedJourneyStructure.class)
    public JAXBElement<InternationalTextStructure> createDatedJourneyStructureDestinationText(InternationalTextStructure value) {
        return new JAXBElement<InternationalTextStructure>(_DatedJourneyStructureDestinationText_QNAME, InternationalTextStructure.class, DatedJourneyStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "Unplanned", scope = DatedJourneyStructure.class, defaultValue = "false")
    public JAXBElement<Boolean> createDatedJourneyStructureUnplanned(Boolean value) {
        return new JAXBElement<Boolean>(_DatedJourneyStructureUnplanned_QNAME, Boolean.class, DatedJourneyStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "Cancelled", scope = DatedJourneyStructure.class, defaultValue = "false")
    public JAXBElement<Boolean> createDatedJourneyStructureCancelled(Boolean value) {
        return new JAXBElement<Boolean>(_DatedJourneyStructureCancelled_QNAME, Boolean.class, DatedJourneyStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "Deviation", scope = DatedJourneyStructure.class, defaultValue = "false")
    public JAXBElement<Boolean> createDatedJourneyStructureDeviation(Boolean value) {
        return new JAXBElement<Boolean>(_DatedJourneyStructureDeviation_QNAME, Boolean.class, DatedJourneyStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OccupancyEnumeration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "Occupancy", scope = DatedJourneyStructure.class)
    public JAXBElement<OccupancyEnumeration> createDatedJourneyStructureOccupancy(OccupancyEnumeration value) {
        return new JAXBElement<OccupancyEnumeration>(_DatedJourneyStructureOccupancy_QNAME, OccupancyEnumeration.class, DatedJourneyStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookingArrangementsContainerStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "BookingArrangements", scope = DatedJourneyStructure.class)
    public JAXBElement<BookingArrangementsContainerStructure> createDatedJourneyStructureBookingArrangements(BookingArrangementsContainerStructure value) {
        return new JAXBElement<BookingArrangementsContainerStructure>(_DatedJourneyStructureBookingArrangements_QNAME, BookingArrangementsContainerStructure.class, DatedJourneyStructure.class, value);
    }

}

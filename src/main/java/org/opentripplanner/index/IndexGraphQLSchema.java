package org.opentripplanner.index;

import com.google.common.collect.ImmutableMap;
import com.google.transit.realtime.GtfsRealtime;
import graphql.language.StringValue;
import graphql.schema.*;
import org.geotools.geojson.geom.GeometryJSON;
import org.locationtech.jts.geom.*;
import graphql.Scalars;
import graphql.relay.Relay;
import graphql.relay.SimpleListConnection;
import org.opentripplanner.api.common.Message;
import org.opentripplanner.api.model.*;
import org.opentripplanner.api.parameter.QualifiedMode;
import org.opentripplanner.common.model.P2;
import org.opentripplanner.index.model.RealtimeVehiclePosition;
import org.opentripplanner.model.*;
import org.opentripplanner.model.calendar.ServiceDate;
import org.opentripplanner.gtfs.GtfsLibrary;
import org.opentripplanner.index.model.StopTimesInPattern;
import org.opentripplanner.index.model.TripTimeShort;
import org.opentripplanner.profile.StopCluster;
import org.opentripplanner.routing.alertpatch.AlertPatch;
import org.opentripplanner.routing.bike_park.BikePark;
import org.opentripplanner.routing.bike_rental.BikeRentalStation;
import org.opentripplanner.routing.bike_rental.BikeRentalStationService;
import org.opentripplanner.routing.car_park.CarPark;
import org.opentripplanner.routing.car_park.CarParkService;
import org.opentripplanner.routing.core.*;
import org.opentripplanner.routing.edgetype.SimpleTransfer;
import org.opentripplanner.routing.edgetype.Timetable;
import org.opentripplanner.routing.edgetype.TimetableSnapshot;
import org.opentripplanner.routing.edgetype.TripPattern;
import org.opentripplanner.routing.graph.GraphIndex;
import org.opentripplanner.routing.trippattern.RealTimeState;
import org.opentripplanner.routing.trippattern.TripTimes;
import org.opentripplanner.routing.vertextype.TransitVertex;
import org.opentripplanner.updater.GtfsRealtimeFuzzyTripMatcher;
import org.opentripplanner.util.PolylineEncoder;
import org.opentripplanner.util.ResourceBundleSingleton;
import org.opentripplanner.util.model.EncodedPolylineBean;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.*;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class IndexGraphQLSchema {


    public static GraphQLScalarType polylineScalar = new GraphQLScalarType("Polyline", "List of coordinates in an encoded polyline format (see https://developers.google.com/maps/documentation/utilities/polylinealgorithm). The value appears in JSON as a string.", new Coercing() {
        @Override
        public String serialize(Object input) {
            return input == null ? null : input.toString();
        }

        @Override
        public String parseValue(Object input) {
            return serialize(input);
        }

        @Override
        public String parseLiteral(Object input) {
            if (!(input instanceof StringValue)) return null;
            return ((StringValue) input).getValue();
        }
    });

    public GraphQLOutputType planType = new GraphQLTypeReference("Plan");

    public static GraphQLEnumType vertexTypeEnum = GraphQLEnumType.newEnum()
            .name("VertexType")
            .value("NORMAL", VertexType.NORMAL, "NORMAL")
            .value("TRANSIT", VertexType.TRANSIT, "TRANSIT")
            .value("BIKEPARK", VertexType.BIKEPARK, "BIKEPARK")
            .value("BIKESHARE", VertexType.BIKESHARE, "BIKESHARE")
            .build();


    public static GraphQLEnumType locationTypeEnum = GraphQLEnumType.newEnum()
        .name("LocationType")
        .description("Identifies whether this stop represents a stop or station.")
        .value("STOP", 0, "A location where passengers board or disembark from a transit vehicle.")
        .value("STATION", 1, "A physical structure or area that contains one or more stop.")
        .value("ENTRANCE", 2)
        .build();

    public static GraphQLEnumType wheelchairBoardingEnum = GraphQLEnumType.newEnum()
        .name("WheelchairBoarding")
        .value("NO_INFORMATION", 0, "There is no accessibility information for the stop.")
        .value("POSSIBLE", 1, "At least some vehicles at this stop can be boarded by a rider in a wheelchair.")
        .value("NOT_POSSIBLE", 2, "Wheelchair boarding is not possible at this stop.")
        .build();

    public static GraphQLEnumType bikesAllowedEnum = GraphQLEnumType.newEnum()
        .name("BikesAllowed")
        .value("NO_INFORMATION", 0, "There is no bike information for the trip.")
        .value("ALLOWED", 1, "The vehicle being used on this particular trip can accommodate at least one bicycle.")
        .value("NOT_ALLOWED", 2, "No bicycles are allowed on this trip.")
        .build();

    public static GraphQLEnumType realtimeStateEnum = GraphQLEnumType.newEnum()
        .name("RealtimeState")
        .value("SCHEDULED", RealTimeState.SCHEDULED, "The trip information comes from the GTFS feed, i.e. no real-time update has been applied.")

        .value("UPDATED", RealTimeState.UPDATED, "The trip information has been updated, but the trip pattern stayed the same as the trip pattern of the scheduled trip.")

        .value("CANCELED", RealTimeState.CANCELED, "The trip has been canceled by a real-time update.")

        .value("ADDED", RealTimeState.ADDED, "The trip has been added using a real-time update, i.e. the trip was not present in the GTFS feed.")

        .value("MODIFIED", RealTimeState.MODIFIED, "The trip information has been updated and resulted in a different trip pattern compared to the trip pattern of the scheduled trip.")
        .build();

    public static GraphQLEnumType modeEnum = GraphQLEnumType.newEnum()
            .name("Mode")
            .value("AIRPLANE", TraverseMode.AIRPLANE, "AIRPLANE")
            .value("BICYCLE", TraverseMode.BICYCLE, "BICYCLE")
            .value("BUS", TraverseMode.BUS, "BUS")
            .value("CABLECAR", TraverseMode.CABLECAR, "CABLECAR")
            .value("CAR", TraverseMode.CAR, "CAR")
            .value("FERRY", TraverseMode.FERRY, "FERRY")
            .value("FUNICULAR", TraverseMode.FUNICULAR, "FUNICULAR")
            .value("GONDOLA", TraverseMode.GONDOLA, "GONDOLA")
            .value("LEG_SWITCH", TraverseMode.LEG_SWITCH, "Only used internally. No use for API users.")
            .value("RAIL", TraverseMode.RAIL, "RAIL")
            .value("SUBWAY", TraverseMode.SUBWAY, "SUBWAY")
            .value("TRAM", TraverseMode.TRAM, "TRAM")
            .value("TRANSIT", TraverseMode.TRANSIT, "A special transport mode, which includes all public transport.")
            .value("WALK", TraverseMode.WALK, "WALK")
            .build();

    public static GraphQLEnumType optimizeTypeEnum = GraphQLEnumType.newEnum()
            .name("OptimizeType")
            .description("Optimization type for bicycling legs")
            .value("QUICK", OptimizeType.QUICK, "Prefer faster routes")
            .value("SAFE", OptimizeType.SAFE, "Prefer safer routes, i.e. avoid crossing streets and use bike paths when possible")
            .value("FLAT", OptimizeType.FLAT, "Prefer flat terrain")
            .value("GREENWAYS", OptimizeType.GREENWAYS, "GREENWAYS")
            .value("TRIANGLE", OptimizeType.TRIANGLE, "**TRIANGLE** optimization type can be used to set relative preferences of optimization factors. See argument `triangle`.")
            .value("TRANSFERS", OptimizeType.TRANSFERS, "Deprecated, use argument `transferPenalty` to optimize for less transfers.")
            .build();

    public static GraphQLEnumType alertCauseEnum = GraphQLEnumType.newEnum()
            .name("AlertCauseType")
            .description("Cause of a alert")
            .value("UNKNOWN_CAUSE", GtfsRealtime.Alert.Cause.UNKNOWN_CAUSE, "UNKNOWN_CAUSE")
            .value("OTHER_CAUSE", GtfsRealtime.Alert.Cause.OTHER_CAUSE, "OTHER_CAUSE")
            .value("TECHNICAL_PROBLEM", GtfsRealtime.Alert.Cause.TECHNICAL_PROBLEM, "TECHNICAL_PROBLEM")
            .value("STRIKE", GtfsRealtime.Alert.Cause.STRIKE, "STRIKE")
            .value("DEMONSTRATION", GtfsRealtime.Alert.Cause.DEMONSTRATION, "DEMONSTRATION")
            .value("ACCIDENT", GtfsRealtime.Alert.Cause.ACCIDENT, "ACCIDENT")
            .value("HOLIDAY", GtfsRealtime.Alert.Cause.HOLIDAY, "HOLIDAY")
            .value("WEATHER", GtfsRealtime.Alert.Cause.WEATHER, "WEATHER")
            .value("MAINTENANCE", GtfsRealtime.Alert.Cause.MAINTENANCE, "MAINTENANCE")
            .value("CONSTRUCTION", GtfsRealtime.Alert.Cause.CONSTRUCTION, "CONSTRUCTION")
            .value("POLICE_ACTIVITY", GtfsRealtime.Alert.Cause.POLICE_ACTIVITY, "POLICE_ACTIVITY")
            .value("MEDICAL_EMERGENCY", GtfsRealtime.Alert.Cause.MEDICAL_EMERGENCY, "MEDICAL_EMERGENCY")
            .build();

    public static GraphQLEnumType alertEffectEnum = GraphQLEnumType.newEnum()
            .name("AlertEffectType")
            .description("Effect of a alert")
            .value("NO_SERVICE", GtfsRealtime.Alert.Effect.NO_SERVICE, "NO_SERVICE")
            .value("REDUCED_SERVICE", GtfsRealtime.Alert.Effect.REDUCED_SERVICE, "REDUCED_SERVICE")
            .value("SIGNIFICANT_DELAYS", GtfsRealtime.Alert.Effect.SIGNIFICANT_DELAYS, "SIGNIFICANT_DELAYS")
            .value("DETOUR", GtfsRealtime.Alert.Effect.DETOUR, "DETOUR")
            .value("ADDITIONAL_SERVICE", GtfsRealtime.Alert.Effect.ADDITIONAL_SERVICE, "ADDITIONAL_SERVICE")
            .value("MODIFIED_SERVICE", GtfsRealtime.Alert.Effect.MODIFIED_SERVICE, "MODIFIED_SERVICE")
            .value("OTHER_EFFECT", GtfsRealtime.Alert.Effect.OTHER_EFFECT, "OTHER_EFFECT")
            .value("UNKNOWN_EFFECT", GtfsRealtime.Alert.Effect.UNKNOWN_EFFECT, "UNKNOWN_EFFECT")
            .value("STOP_MOVED", GtfsRealtime.Alert.Effect.STOP_MOVED, "STOP_MOVED")
            .value("NO_EFFECT", GtfsRealtime.Alert.Effect.NO_EFFECT, "NO_EFFECT")
            .build();

    public static GraphQLEnumType alertSeverityLevelEnum = GraphQLEnumType.newEnum()
            .name("AlertSeverityLevelType")
            .description("Severity level of a alert")
            .value("UNKNOWN_SEVERITY", GtfsRealtime.Alert.SeverityLevel.UNKNOWN_SEVERITY, "Severity of alert is unknown")
            .value("INFO", GtfsRealtime.Alert.SeverityLevel.INFO, "Info alerts are used for informational messages that should not have a significant effect on user's journey, for example: A single entrance to a metro station is temporarily closed.")
            .value("WARNING", GtfsRealtime.Alert.SeverityLevel.WARNING, "Warning alerts are used when a single stop or route has a disruption that can affect user's journey, for example: All trams on a specific route are running with irregular schedules.")
            .value("SEVERE", GtfsRealtime.Alert.SeverityLevel.SEVERE, "Severe alerts are used when a significant part of public transport services is affected, for example: All train services are cancelled due to technical problems.")
            .build();

    private final GtfsRealtimeFuzzyTripMatcher fuzzyTripMatcher;

    public GraphQLOutputType agencyType = new GraphQLTypeReference("Agency");

    public GraphQLOutputType bikeRentalStationType = new GraphQLTypeReference("BikeRentalStation");

    public GraphQLOutputType bikeParkType = new GraphQLTypeReference("BikePark");

    public GraphQLOutputType carParkType = new GraphQLTypeReference("CarPark");

    public GraphQLOutputType coordinateType = new GraphQLTypeReference("Coordinates");

    public GraphQLOutputType clusterType = new GraphQLTypeReference("Cluster");

    public GraphQLOutputType patternType = new GraphQLTypeReference("Pattern");

    public GraphQLOutputType routeType = new GraphQLTypeReference("Route");

    public GraphQLOutputType stoptimeType = new GraphQLTypeReference("Stoptime");

    public GraphQLOutputType stopType = new GraphQLTypeReference("Stop");

    public GraphQLOutputType tripType = new GraphQLTypeReference("Trip");

    public GraphQLOutputType stopAtDistanceType = new GraphQLTypeReference("StopAtDistance");

    public GraphQLOutputType stoptimesInPatternType = new GraphQLTypeReference("StoptimesInPattern");

    public GraphQLObjectType queryType;

    public GraphQLSchema indexSchema;

    private Relay relay = new Relay();

    private GraphQLInterfaceType nodeInterface = relay.nodeInterface(new TypeResolver() {
        @Override public GraphQLObjectType getType(Object o) {
            if (o instanceof StopCluster){
                return (GraphQLObjectType) clusterType;
            }
            if (o instanceof Stop){
                return (GraphQLObjectType) stopType;
            }
            if (o instanceof Trip){
                return (GraphQLObjectType) tripType;
            }
            if (o instanceof Route){
                return (GraphQLObjectType) routeType;
            }
            if (o instanceof TripPattern){
                return (GraphQLObjectType) patternType;
            }
            if (o instanceof Agency){
                return (GraphQLObjectType) agencyType;
            }
            if (o instanceof BikeRentalStation) {
                return (GraphQLObjectType) bikeRentalStationType;
            }
            if (o instanceof BikePark) {
                return (GraphQLObjectType) bikeParkType;
            }
            if (o instanceof CarPark) {
                return (GraphQLObjectType) carParkType;
            }
            return null;
        }
    });

    private GraphQLInterfaceType placeInterface = GraphQLInterfaceType.newInterface()
            .name("PlaceInterface")
            .description("Interface for places, e.g. stops, stations, parking areas..")
            .field(GraphQLFieldDefinition.newFieldDefinition()
                    .name("id")
                    .type(new GraphQLNonNull(Scalars.GraphQLID))
                    .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                    .name("lat")
                    .description("Latitude of the place (WGS 84)")
                    .type(Scalars.GraphQLFloat)
                    .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                    .name("lon")
                    .description("Longitude of the place (WGS 84)")
                    .type(Scalars.GraphQLFloat)
                    .build())
            .typeResolver(new TypeResolver() {
                @Override
                public GraphQLObjectType getType(Object o) {
                    if (o instanceof Stop) {
                        return (GraphQLObjectType) stopType;
                    }
                    if (o instanceof BikeRentalStation) {
                        return (GraphQLObjectType) bikeRentalStationType;
                    }
                    if (o instanceof BikePark) {
                        return (GraphQLObjectType) bikeParkType;
                    }
                    if (o instanceof CarPark) {
                        return (GraphQLObjectType) carParkType;
                    }
                    return null;
                }
            }).build();


    private final GraphQLObjectType geometryType = GraphQLObjectType.newObject()
            .name("Geometry")
            .field(GraphQLFieldDefinition.newFieldDefinition()
                    .name("length")
                    .description("The number of points in the string")
                    .type(Scalars.GraphQLInt)
                    .dataFetcher(environment -> ((EncodedPolylineBean) environment.getSource()).getLength())
                    .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                    .name("points")
                    .description("List of coordinates of in a Google encoded polyline format (see https://developers.google.com/maps/documentation/utilities/polylinealgorithm)")
                    .type(polylineScalar)
                    .dataFetcher(environment -> ((EncodedPolylineBean) environment.getSource()).getPoints())
                    .build())
            .build();


    public IndexGraphQLSchema(GraphIndex index) {

        createPlanType(index);

        GraphQLInputObjectType coordinateInputType = GraphQLInputObjectType.newInputObject()
                .name("InputCoordinates")
                .field(GraphQLInputObjectField.newInputObjectField()
                        .name("lat")
                        .description("Latitude of the place (WGS 84)")
                        .type(new GraphQLNonNull(Scalars.GraphQLFloat))
                        .build())
                .field(GraphQLInputObjectField.newInputObjectField()
                        .name("lon")
                        .description("Longitude of the place (WGS 84)")
                        .type(new GraphQLNonNull(Scalars.GraphQLFloat))
                        .build())
                .field(GraphQLInputObjectField.newInputObjectField()
                        .name("address")
                        .description("The name of the place. If specified, the place name in results uses this value instead of `\"Origin\"` or `\"Destination\"`")
                        .type(Scalars.GraphQLString)
                        .build())
                .field(GraphQLInputObjectField.newInputObjectField()
                        .name("locationSlack")
                        .description("The amount of time, in seconds, to spend at this location before venturing forth.")
                        .type(Scalars.GraphQLInt)
                        .build())
                .build();

        GraphQLInputObjectType preferredInputType = GraphQLInputObjectType.newInputObject()
                .name("InputPreferred")
                .field(GraphQLInputObjectField.newInputObjectField()
                        .name("routes")
                        .description("A comma-separated list of ids of the routes preferred by the user.")
                        .type(Scalars.GraphQLString)
                        .build())
                .field(GraphQLInputObjectField.newInputObjectField()
                        .name("agencies")
                        .description("A comma-separated list of ids of the agencies preferred by the user.")
                        .type(Scalars.GraphQLString)
                        .build())
                .field(GraphQLInputObjectField.newInputObjectField()
                        .name("otherThanPreferredRoutesPenalty")
                        .description("Penalty added for using every route that is not preferred if user set any route as preferred. We return number of seconds that we are willing to wait for preferred route.")
                        .type(Scalars.GraphQLInt)
                        .build())
                .build();

        GraphQLInputObjectType unpreferredInputType = GraphQLInputObjectType.newInputObject()
                .name("InputUnpreferred")
                .field(GraphQLInputObjectField.newInputObjectField()
                        .name("routes")
                        .description("A comma-separated list of ids of the routes unpreferred by the user.")
                        .type(Scalars.GraphQLString)
                        .build())
                .field(GraphQLInputObjectField.newInputObjectField()
                        .name("agencies")
                        .description("A comma-separated list of ids of the agencies unpreferred by the user.")
                        .type(Scalars.GraphQLString)
                        .build())
                .field(GraphQLInputObjectField.newInputObjectField()
                        .name("useUnpreferredRoutesPenalty")
                        .description("Penalty added for using route that is unpreferred, i.e. number of seconds that we are willing to wait for route that is unpreferred.")
                        .type(Scalars.GraphQLInt)
                        .build())
                .build();

        GraphQLInputObjectType bannedInputType = GraphQLInputObjectType.newInputObject()
                .name("InputBanned")
                .field(GraphQLInputObjectField.newInputObjectField()
                        .name("routes")
                        .description("A comma-separated list of banned route ids")
                        .type(Scalars.GraphQLString)
                        .build())
                .field(GraphQLInputObjectField.newInputObjectField()
                        .name("agencies")
                        .description("A comma-separated list of banned agency ids")
                        .type(Scalars.GraphQLString)
                        .build())
                .field(GraphQLInputObjectField.newInputObjectField()
                        .name("trips")
                        .description("A comma-separated list of banned trip ids")
                        .type(Scalars.GraphQLString)
                        .build())
                .field(GraphQLInputObjectField.newInputObjectField()
                        .name("stops")
                        .description("A comma-separated list of banned stop ids. Note that these stops are only banned for boarding and disembarking vehicles — it is possible to get an itinerary where a vehicle stops at one of these stops")
                        .type(Scalars.GraphQLString)
                        .build())
                .field(GraphQLInputObjectField.newInputObjectField()
                        .name("stopsHard")
                        .description("A comma-separated list of banned stop ids. Only itineraries where these stops are not travelled through are returned, e.g. if a bus route stops at one of these stops, that route will not be used in the itinerary, even if the stop is not used for boarding or disembarking the vehicle. ")
                        .type(Scalars.GraphQLString)
                        .build())
                .build();

        GraphQLInputObjectType triangleInputType = GraphQLInputObjectType.newInputObject()
                .name("InputTriangle")
                .description("Relative importances of optimization factors. Only effective for bicycling legs.  \n Invariant: `timeFactor + slopeFactor + safetyFactor == 1`")
                .field(GraphQLInputObjectField.newInputObjectField()
                        .name("safetyFactor")
                        .description("Relative importance of safety")
                        .type(Scalars.GraphQLFloat)
                        .build())
                .field(GraphQLInputObjectField.newInputObjectField()
                        .name("slopeFactor")
                        .description("Relative importance of flat terrain")
                        .type(Scalars.GraphQLFloat)
                        .build())
                .field(GraphQLInputObjectField.newInputObjectField()
                        .name("timeFactor")
                        .description("Relative importance of duration")
                        .type(Scalars.GraphQLFloat)
                        .build())
                .build();

        GraphQLInputObjectType modeWeightInputType = GraphQLInputObjectType.newInputObject()
                .name("InputModeWeight")
                .field(GraphQLInputObjectField.newInputObjectField()
                        .name("TRAM")
                        .description("The weight of TRAM traverse mode. Values over 1 add cost to tram travel and values under 1 decrease cost")
                        .type(Scalars.GraphQLFloat)
                        .build())
                .field(GraphQLInputObjectField.newInputObjectField()
                        .name("SUBWAY")
                        .description("The weight of SUBWAY traverse mode. Values over 1 add cost to subway travel and values under 1 decrease cost")
                        .type(Scalars.GraphQLFloat)
                        .build())
                .field(GraphQLInputObjectField.newInputObjectField()
                        .name("RAIL")
                        .description("The weight of RAIL traverse mode. Values over 1 add cost to rail travel and values under 1 decrease cost")
                        .type(Scalars.GraphQLFloat)
                        .build())
                .field(GraphQLInputObjectField.newInputObjectField()
                        .name("BUS")
                        .description("The weight of BUS traverse mode. Values over 1 add cost to bus travel and values under 1 decrease cost")
                        .type(Scalars.GraphQLFloat)
                        .build())
                .field(GraphQLInputObjectField.newInputObjectField()
                        .name("FERRY")
                        .description("The weight of FERRY traverse mode. Values over 1 add cost to ferry travel and values under 1 decrease cost")
                        .type(Scalars.GraphQLFloat)
                        .build())
                .field(GraphQLInputObjectField.newInputObjectField()
                        .name("CABLE_CAR")
                        .description("The weight of CABLE_CAR traverse mode. Values over 1 add cost to cable car travel and values under 1 decrease cost")
                        .type(Scalars.GraphQLFloat)
                        .build())
                .field(GraphQLInputObjectField.newInputObjectField()
                        .name("GONDOLA")
                        .description("The weight of GONDOLA traverse mode. Values over 1 add cost to gondola travel and values under 1 decrease cost")
                        .type(Scalars.GraphQLFloat)
                        .build())
                .field(GraphQLInputObjectField.newInputObjectField()
                        .name("FUNICULAR")
                        .description("The weight of FUNICULAR traverse mode. Values over 1 add cost to funicular travel and values under 1 decrease cost")
                        .type(Scalars.GraphQLFloat)
                        .build())
                .field(GraphQLInputObjectField.newInputObjectField()
                        .name("AIRPLANE")
                        .description("The weight of AIRPLANE traverse mode. Values over 1 add cost to airplane travel and values under 1 decrease cost")
                        .type(Scalars.GraphQLFloat)
                        .build())
                .build();

        GraphQLInputObjectType transportModeInputType = GraphQLInputObjectType.newInputObject()
                .name("TransportMode")
                .description("Transportation mode which can be used in the itinerary")
                .field(GraphQLInputObjectField.newInputObjectField()
                        .name("mode")
                        .type(new GraphQLNonNull(modeEnum))
                        .build())
                .build();

        GraphQLFieldDefinition planFieldType = GraphQLFieldDefinition.newFieldDefinition()
                .name("plan")
                .description("Plans an itinerary from point A to point B based on the given arguments")
                .type(planType)
                .argument(GraphQLArgument.newArgument()
                        .name("date")
                        .description("Date of departure or arrival in format YYYY-MM-DD. Default value: current date")
                        .type(Scalars.GraphQLString)
                        .build())
                .argument(GraphQLArgument.newArgument()
                        .name("time")
                        .description("Time of departure or arrival in format hh:mm:ss. Default value: current time")
                        .type(Scalars.GraphQLString)
                        .build())
                .argument(GraphQLArgument.newArgument()
                        .name("from")
                        .description("The geographical location where the itinerary begins.  \n Use either this argument or `fromPlace`, but not both.")
                        .type(coordinateInputType)
                        .build())
                .argument(GraphQLArgument.newArgument()
                        .name("to")
                        .description("The geographical location where the itinerary ends.  \n Use either this argument or `toPlace`, but not both.")
                        .type(coordinateInputType)
                        .build())
                .argument(GraphQLArgument.newArgument()
                        .name("fromPlace")
                        .description("The place where the itinerary begins in format `name::place`, where `place` is either a lat,lng pair (e.g. `Pasila::60.199041,24.932928`) or a stop id (e.g. `Pasila::HSL:1000202`).  \n Use either this argument or `from`, but not both.")
                        .type(Scalars.GraphQLString)
                        .build())
                .argument(GraphQLArgument.newArgument()
                        .name("toPlace")
                        .description("The place where the itinerary ends in format `name::place`, where `place` is either a lat,lng pair (e.g. `Pasila::60.199041,24.932928`) or a stop id (e.g. `Pasila::HSL:1000202`).  \n Use either this argument or `to`, but not both.")
                        .type(Scalars.GraphQLString)
                        .build())
                .argument(GraphQLArgument.newArgument()
                        .name("wheelchair")
                        .description("Whether the itinerary must be wheelchair accessible. Default value: false")
                        .type(Scalars.GraphQLBoolean)
                        .build())
                .argument(GraphQLArgument.newArgument()
                        .name("numItineraries")
                        .description("The maximum number of itineraries to return. Default value: 3.")
                        .defaultValue(3)
                        .type(Scalars.GraphQLInt)
                        .build())
                .argument(GraphQLArgument.newArgument()
                        .name("maxWalkDistance")
                        .description("The maximum distance (in meters) the user is willing to walk per walking section. If the only transport mode allowed is `WALK`, then the value of this argument is ignored.  \n Default: 2000m  \n Maximum value: 15000m  \n **Note:** If this argument has a relatively small value and only some transport modes are allowed (e.g. `WALK` and `RAIL`), it is possible to get an itinerary which has (useless) back and forth public transport legs to avoid walking too long distances.")
                        .type(Scalars.GraphQLFloat)
                        .build())
                .argument(GraphQLArgument.newArgument()
                        .name("maxPreTransitTime")
                        .description("The maximum time (in seconds) of pre-transit travel when using drive-to-transit (park and ride or kiss and ride). Default value: 1800.")
                        .type(Scalars.GraphQLInt)
                        .build())
                .argument(GraphQLArgument.newArgument()
                        .name("maxSlope")
                        .description("The maximum slope, up or downhill, that can be used in wheelchair accessible routing. Value is between 0 and 1, and calculated by dividing change of elevation by change of distance. Default value: 0.0833333333333")
                        .type(Scalars.GraphQLFloat)
                        .build())
                .argument(GraphQLArgument.newArgument()
                        .name("carParkCarLegWeight")
                        .description("How expensive it is to drive a car when car&parking, increase this value to make car driving legs shorter. Default value: 1.")
                        .type(Scalars.GraphQLFloat)
                        .build())
                .argument(GraphQLArgument.newArgument()
                        .name("itineraryFiltering")
                        .description("How easily bad itineraries are filtered from results. Value 0 (default) disables filtering. Itineraries are filtered if they are worse than another one in some respect (e.g. more walking) by more than the percentage of filtering level, which is calculated by dividing 100% by the value of this argument (e.g. `itineraryFiltering = 0.5` → 200% worse itineraries are filtered).")
                        .type(Scalars.GraphQLFloat)
                        .build())
                .argument(GraphQLArgument.newArgument()
                        .name("walkReluctance")
                        .description("A multiplier for how bad walking is, compared to being in transit for equal lengths of time.Empirically, values between 10 and 20 seem to correspond well to the concept of not wanting to walk too much without asking for totally ridiculous itineraries, but this observation should in no way be taken as scientific or definitive. Your mileage may vary. Default value: 2.0 ")
                        .type(Scalars.GraphQLFloat)
                        .build())
                .argument(GraphQLArgument.newArgument()
                        .name("walkOnStreetReluctance")
                        .description("How much more reluctant is the user to walk on streets with car traffic allowed. Default value: 1.0")
                        .type(Scalars.GraphQLFloat)
                        .build())
                .argument(GraphQLArgument.newArgument()
                        .name("waitReluctance")
                        .description("How much worse is waiting for a transit vehicle than being on a transit vehicle, as a multiplier. The default value treats wait and on-vehicle time as the same. It may be tempting to set this higher than walkReluctance (as studies often find this kind of preferences among riders) but the planner will take this literally and walk down a transit line to avoid waiting at a stop. This used to be set less than 1 (0.95) which would make waiting offboard preferable to waiting onboard in an interlined trip. That is also undesirable. If we only tried the shortest possible transfer at each stop to neighboring stop patterns, this problem could disappear. Default value: 1.0.")
                        .type(Scalars.GraphQLFloat)
                        .build())
                .argument(GraphQLArgument.newArgument()
                        .name("waitAtBeginningFactor")
                        .description("How much less bad is waiting at the beginning of the trip (replaces `waitReluctance` on the first boarding). Default value: 0.4")
                        .type(Scalars.GraphQLFloat)
                        .build())
                .argument(GraphQLArgument.newArgument()
                        .name("walkSpeed")
                        .description("Max walk speed along streets, in meters per second. Default value: 1.33")
                        .type(Scalars.GraphQLFloat)
                        .build())
                .argument(GraphQLArgument.newArgument()
                        .name("bikeSpeed")
                        .description("Max bike speed along streets, in meters per second. Default value: 5.0")
                        .type(Scalars.GraphQLFloat)
                        .build())
                .argument(GraphQLArgument.newArgument()
                        .name("bikeSwitchTime")
                        .description("Time to get on and off your own bike, in seconds. Default value: 0")
                        .type(Scalars.GraphQLInt)
                        .build())
                .argument(GraphQLArgument.newArgument()
                        .name("bikeSwitchCost")
                        .description("Cost of getting on and off your own bike. Unit: seconds. Default value: 0")
                        .type(Scalars.GraphQLInt)
                        .build())
                .argument(GraphQLArgument.newArgument()
                        .name("optimize")
                        .description("Optimization type for bicycling legs, e.g. prefer flat terrain. Default value: `QUICK`")
                        .type(optimizeTypeEnum)
                        .build())
                .argument(GraphQLArgument.newArgument()
                        .name("triangle")
                        .description("Triangle optimization parameters for bicycling legs. Only effective when `optimize` is set to **TRIANGLE**.")
                        .type(triangleInputType)
                        .build())
                .argument(GraphQLArgument.newArgument()
                        .name("arriveBy")
                        .description("Whether the itinerary should depart at the specified time (false), or arrive to the destination at the specified time (true). Default value: false.")
                        .type(Scalars.GraphQLBoolean)
                        .build())
                .argument(GraphQLArgument.newArgument()
                        .name("intermediatePlaces")
                        .description("An ordered list of intermediate locations to be visited.")
                        .type(new GraphQLList(coordinateInputType))
                        .build())
                .argument(GraphQLArgument.newArgument()
                        .name("preferred")
                        .description("List of routes and agencies which are given higher preference when planning the itinerary")
                        .type(preferredInputType)
                        .build())
                .argument(GraphQLArgument.newArgument()
                        .name("unpreferred")
                        .description("List of routes and agencies which are given lower preference when planning the itinerary")
                        .type(unpreferredInputType)
                        .build())
                .argument(GraphQLArgument.newArgument()
                        .name("walkBoardCost")
                        .description("This prevents unnecessary transfers by adding a cost for boarding a vehicle. Unit: seconds. Default value: 600")
                        .type(Scalars.GraphQLInt)
                        .build())
                .argument(GraphQLArgument.newArgument()
                        .name("bikeBoardCost")
                        .description("Separate cost for boarding a vehicle with a bicycle, which is more difficult than on foot. Unit: seconds. Default value: 600")
                        .type(Scalars.GraphQLInt)
                        .build())
                .argument(GraphQLArgument.newArgument()
                        .name("banned")
                        .description("List of routes, trips, agencies and stops which are not used in the itinerary")
                        .type(bannedInputType)
                        .build())
                .argument(GraphQLArgument.newArgument()
                        .name("transferPenalty")
                        .description("An extra penalty added on transfers (i.e. all boardings except the first one). Not to be confused with bikeBoardCost and walkBoardCost, which are the cost of boarding a vehicle with and without a bicycle. The boardCosts are used to model the 'usual' perceived cost of using a transit vehicle, and the transferPenalty is used when a user requests even less transfers. In the latter case, we don't actually optimize for fewest transfers, as this can lead to absurd results. Consider a trip in New York from Grand Army Plaza (the one in Brooklyn) to Kalustyan's at noon. The true lowest transfers route is to wait until midnight, when the 4 train runs local the whole way. The actual fastest route is the 2/3 to the 4/5 at Nevins to the 6 at Union Square, which takes half an hour. Even someone optimizing for fewest transfers doesn't want to wait until midnight. Maybe they would be willing to walk to 7th Ave and take the Q to Union Square, then transfer to the 6. If this takes less than optimize_transfer_penalty seconds, then that's what we'll return. Default value: 0.")
                        .type(Scalars.GraphQLInt)
                        .build())
                .argument(GraphQLArgument.newArgument()
                        .name("batch")
                        .description("This argument has no use for itinerary planning and will be removed later.  \n ~~When true, do not use goal direction or stop at the target, build a full SPT. Default value: false.~~")
                        .type(Scalars.GraphQLBoolean)
                        .build())
                .argument(GraphQLArgument.newArgument()
                        .name("modes")
                        .description("Deprecated, use `transportModes` instead.  \n ~~The set of TraverseModes that a user is willing to use. Default value: WALK | TRANSIT.~~")
                        .type(Scalars.GraphQLString)
                        .build())
                .argument(GraphQLArgument.newArgument()
                        .name("transportModes")
                        .description("List of transportation modes that the user is willing to use. Default: `[\"WALK\",\"TRANSIT\"]`")
                        .type(new GraphQLList(transportModeInputType))
                        .build())
                .argument(GraphQLArgument.newArgument()
                        .name("modeWeight")
                        .description("The weight multipliers for transit modes. WALK, BICYCLE, CAR, TRANSIT and LEG_SWITCH are not included.")
                        .type(modeWeightInputType)
                        .build())
                .argument(GraphQLArgument.newArgument()
                        .name("allowBikeRental")
                        .description("Is bike rental allowed? Default value: false")
                        .type(Scalars.GraphQLBoolean)
                        .build())
                .argument(GraphQLArgument.newArgument()
                        .name("boardSlack")
                        .description("Invariant: `boardSlack + alightSlack <= transferSlack`. Default value: 0")
                        .type(Scalars.GraphQLInt)
                        .build())
                .argument(GraphQLArgument.newArgument()
                        .name("alightSlack")
                        .description("Invariant: `boardSlack + alightSlack <= transferSlack`. Default value: 0")
                        .type(Scalars.GraphQLInt)
                        .build())
                .argument(GraphQLArgument.newArgument()
                        .name("minTransferTime")
                        .description("A global minimum transfer time (in seconds) that specifies the minimum amount of time that must pass between exiting one transit vehicle and boarding another. This time is in addition to time it might take to walk between transit stops. Default value: 0")
                        .type(Scalars.GraphQLInt)
                        .build())
                .argument(GraphQLArgument.newArgument()
                        .name("nonpreferredTransferPenalty")
                        .description("Penalty (in seconds) for using a non-preferred transfer. Default value: 180")
                        .type(Scalars.GraphQLInt)
                        .build())
                .argument(GraphQLArgument.newArgument()
                        .name("maxTransfers")
                        .description("Maximum number of transfers. Default value: 2")
                        .type(Scalars.GraphQLInt)
                        .build())
                .argument(GraphQLArgument.newArgument()
                        .name("startTransitStopId")
                        .description("This argument has currently no effect on which itineraries are returned. Use argument `fromPlace` to start the itinerary from a specific stop.  \n ~~A transit stop that this trip must start from~~")
                        .type(Scalars.GraphQLString)
                        .build())
                .argument(GraphQLArgument.newArgument()
                        .name("startTransitTripId")
                        .description("ID of the trip on which the itinerary starts. This argument can be used to plan itineraries when the user is already onboard a vehicle. When using this argument, arguments `time` and `from` should be set based on a vehicle position message received from the vehicle running the specified trip.  \n **Note:** this argument only takes into account the route and estimated travel time of the trip (and therefore arguments `time` and `from` must be used correctly to get meaningful itineraries).")
                        .type(Scalars.GraphQLString)
                        .build())
                .argument(GraphQLArgument.newArgument()
                        .name("claimInitialWait")
                        .description("No effect on itinerary planning, adjust argument `time` instead to get later departures.  \n ~~The maximum wait time in seconds the user is willing to delay trip start. Only effective in Analyst.~~")
                        .type(Scalars.GraphQLLong)
                        .build())
                .argument(GraphQLArgument.newArgument()
                        .name("reverseOptimizeOnTheFly")
                        .description("**Consider this argument experimental** – setting this argument to true causes timeouts and unoptimal routes in many cases.  \n When true, reverse optimize (find alternative transportation mode, which still arrives to the destination in time) this search on the fly after processing each transit leg, rather than reverse-optimizing the entire path when it's done. Default value: false.")
                        .type(Scalars.GraphQLBoolean)
                        .build())
                .argument(GraphQLArgument.newArgument()
                        .name("omitCanceled")
                        .description("When false, return itineraries using canceled trips. Default value: true.")
                        .defaultValue(true)
                        .type(Scalars.GraphQLBoolean)
                        .build())
                .argument(GraphQLArgument.newArgument()
                        .name("ignoreRealtimeUpdates")
                        .description("When true, realtime updates are ignored during this search. Default value: false")
                        .type(Scalars.GraphQLBoolean)
                        .build())
                .argument(GraphQLArgument.newArgument()
                        .name("disableRemainingWeightHeuristic")
                        .description("Only useful for testing and troubleshooting.  \n ~~If true, the remaining weight heuristic is disabled. Currently only implemented for the long distance path service. Default value: false.~~")
                        .type(Scalars.GraphQLBoolean)
                        .build())
                .argument(GraphQLArgument.newArgument()
                        .name("locale")
                        .description("Two-letter language code (ISO 639-1) used for returned text.  \n **Note:** only part of the data has translations available and names of stops and POIs are returned in their default language. Due to missing translations, it is sometimes possible that returned text uses a mixture of two languages.")
                        .type(Scalars.GraphQLString)
                        .build())
                .dataFetcher(environment -> new GraphQlPlanner(index).plan(environment))
                .build();

        fuzzyTripMatcher = new GtfsRealtimeFuzzyTripMatcher(index);
        index.clusterStopsAsNeeded();

        stopAtDistanceType = GraphQLObjectType.newObject()
            .name("stopAtDistance")
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("stop")
                .type(stopType)
                .dataFetcher(environment -> ((GraphIndex.StopAndDistance) environment.getSource()).stop)
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("distance")
                .type(Scalars.GraphQLInt)
                .dataFetcher(environment -> ((GraphIndex.StopAndDistance) environment.getSource()).distance)
                .build())
            .build();

        stoptimesInPatternType = GraphQLObjectType.newObject()
            .name("StoptimesInPattern")
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("pattern")
                .type(patternType)
                .dataFetcher(environment -> index.patternForId
                    .get(((StopTimesInPattern) environment.getSource()).pattern.id))
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("stoptimes")
                .type(new GraphQLList(stoptimeType))
                .dataFetcher(environment -> ((StopTimesInPattern) environment.getSource()).times)
                .build())
            .build();

        clusterType = GraphQLObjectType.newObject()
            .name("Cluster")
            .withInterface(nodeInterface)
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("id")
                .type(new GraphQLNonNull(Scalars.GraphQLID))
                .dataFetcher(environment -> relay
                    .toGlobalId(clusterType.getName(), ((StopCluster) environment.getSource()).id))
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("gtfsId")
                .type(new GraphQLNonNull(Scalars.GraphQLString))
                .dataFetcher(environment -> ((StopCluster) environment.getSource()).id)
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("name")
                .type(new GraphQLNonNull(Scalars.GraphQLString))
                .dataFetcher(environment -> ((StopCluster) environment.getSource()).name)
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("lat")
                .type(new GraphQLNonNull(Scalars.GraphQLFloat))
                .dataFetcher(environment -> (float) (((StopCluster) environment.getSource()).lat))
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("lon")
                .type(new GraphQLNonNull(Scalars.GraphQLFloat))
                .dataFetcher(environment -> (float) (((StopCluster) environment.getSource()).lon))
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("stops")
                .type(new GraphQLList(new GraphQLNonNull(stopType)))
                .dataFetcher(environment -> ((StopCluster) environment.getSource()).children)
                .build())
            .build();

        stopType = GraphQLObjectType.newObject()
            .name("Stop")
            .withInterface(nodeInterface)
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("id")
                .type(new GraphQLNonNull(Scalars.GraphQLID))
                .dataFetcher(environment -> relay.toGlobalId(
                    stopType.getName(),
                    GtfsLibrary.convertIdToString(((Stop) environment.getSource()).getId())))
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("gtfsId")
                .type(new GraphQLNonNull(Scalars.GraphQLString))
                .dataFetcher(environment ->
                    GtfsLibrary.convertIdToString(((Stop) environment.getSource()).getId()))
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("name")
                .type(new GraphQLNonNull(Scalars.GraphQLString))
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("lat")
                .type(new GraphQLNonNull(Scalars.GraphQLFloat))
                .dataFetcher(environment -> (float) (((Stop) environment.getSource()).getLat()))
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("lon")
                .type(new GraphQLNonNull(Scalars.GraphQLFloat))
                .dataFetcher(environment -> (float) (((Stop) environment.getSource()).getLon()))
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("code")
                .type(Scalars.GraphQLString)
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("desc")
                .type(Scalars.GraphQLString)
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("zoneId")
                .type(Scalars.GraphQLString)
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("url")
                .type(Scalars.GraphQLString)
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("locationType")
                .type(locationTypeEnum)
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("parentStation")
                .type(stopType)
                .dataFetcher(environment -> index.stopForId.get(new FeedScopedId(
                    ((Stop) environment.getSource()).getId().getAgencyId(),
                    ((Stop) environment.getSource()).getParentStation())))
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("wheelchairBoarding")
                .type(wheelchairBoardingEnum)
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("direction")
                .type(Scalars.GraphQLString)
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("timezone")
                .type(Scalars.GraphQLString)
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("vehicleType")
                .type(Scalars.GraphQLInt)
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                    .name("vehicleMode")
                    .description("Transport mode (e.g. `BUS`) used by routes which pass through this stop or `null` if mode cannot be determined, e.g. in case no routes pass through the stop.  \n Note that also other types of vehicles may use the stop, e.g. tram replacement buses might use stops which have `TRAM` as their mode.")
                    .type(modeEnum)
                    .dataFetcher(environment -> {
                        return index.patternsForStop.get((Stop)environment.getSource())
                                .stream()
                                .map(pattern -> pattern.mode)
                                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                                .entrySet()
                                .stream()
                                .max(Comparator.comparing(Map.Entry::getValue))
                                .map(e -> e.getKey())
                                .orElse(null);
                    })
                    .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("platformCode")
                .type(Scalars.GraphQLString)
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("cluster")
                .type(clusterType)
                .dataFetcher(environment -> index.stopClusterForStop
                    .get((Stop) environment.getSource()))
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("routes")
                .type(new GraphQLList(new GraphQLNonNull(routeType)))
                .dataFetcher(environment -> index.patternsForStop
                    .get((Stop) environment.getSource())
                    .stream()
                    .map(pattern -> pattern.route)
                    .distinct()
                    .collect(Collectors.toList()))
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("patterns")
                .type(new GraphQLList(patternType))
                .dataFetcher(environment -> index.patternsForStop
                    .get((Stop) environment.getSource()))
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("transfers")               //TODO: add max distance as parameter?
                .type(new GraphQLList(stopAtDistanceType))
                .dataFetcher(environment -> index.stopVertexForStop
                    .get(environment.getSource())
                    .getOutgoing()
                    .stream()
                    .filter(edge -> edge instanceof SimpleTransfer)
                    .map(edge -> new ImmutableMap.Builder<String, Object>()
                        .put("stop", ((TransitVertex) edge.getToVertex()).getStop())
                        .put("distance", edge.getDistance())
                        .build())
                    .collect(Collectors.toList()))
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("stoptimesForServiceDate")
                .type(new GraphQLList(stoptimesInPatternType))
                .argument(GraphQLArgument.newArgument()
                    .name("date")
                    .type(Scalars.GraphQLString)
                    .build())
                .argument(GraphQLArgument.newArgument()
            		.name("omitNonPickups")
            		.type(Scalars.GraphQLBoolean)
            		.defaultValue(false)
            		.build())
                .dataFetcher(environment -> {
                    try {  // TODO: Add our own scalar types for at least serviceDate and FeedId
                        return index.getStopTimesForStop(
                            (Stop) environment.getSource(),
                            ServiceDate.parseString(environment.getArgument("date")),
                            environment.getArgument("omitNonPickups"));
                    } catch (ParseException e) {
                        return null;
                    }
                })
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("stoptimesForPatterns")
                .type(new GraphQLList(stoptimesInPatternType))
                .argument(GraphQLArgument.newArgument()
                    .name("startTime")
                    .type(Scalars.GraphQLString) // No long exists in GraphQL
                    .defaultValue("0") // Default value is current time
                    .build())
                .argument(GraphQLArgument.newArgument()
                    .name("timeRange")
                    .type(Scalars.GraphQLInt)
                    .defaultValue(24 * 60 * 60)
                    .build())
                .argument(GraphQLArgument.newArgument()
                    .name("numberOfDepartures")
                    .type(Scalars.GraphQLInt)
                    .defaultValue(5)
                    .build())
                .argument(GraphQLArgument.newArgument()
            		.name("omitNonPickups")
            		.type(Scalars.GraphQLBoolean)
            		.defaultValue(false)
            		.build())
                .dataFetcher(environment ->
                    index.stopTimesForStop((Stop) environment.getSource(),
                        Long.parseLong(environment.getArgument("startTime")),
                        (int) environment.getArgument("timeRange"),
                        (int) environment.getArgument("numberOfDepartures"),
                        (boolean) environment.getArgument("omitNonPickups")))
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("stoptimesWithoutPatterns")
                .type(new GraphQLList(stoptimeType))
                .argument(GraphQLArgument.newArgument()
                    .name("startTime")
                    .type(Scalars.GraphQLString) // No long type exists in GraphQL specification
                    .defaultValue("0") // Default value is current time
                    .build())
                .argument(GraphQLArgument.newArgument()
                    .name("timeRange")
                    .type(Scalars.GraphQLInt)
                    .defaultValue(24 * 60 * 60)
                    .build())
                .argument(GraphQLArgument.newArgument()
                    .name("numberOfDepartures")
                    .type(Scalars.GraphQLInt)
                    .defaultValue(5)
                    .build())
                .argument(GraphQLArgument.newArgument()
            		.name("omitNonPickups")
            		.type(Scalars.GraphQLBoolean)
            		.defaultValue(false)
            		.build())
                .dataFetcher(environment ->
                    index.stopTimesForStop(
                        (Stop) environment.getSource(),
                        Long.parseLong(environment.getArgument("startTime")),
                        (int) environment.getArgument("timeRange"),
                        (int) environment.getArgument("numberOfDepartures"),
                        (boolean) environment.getArgument("omitNonPickups"))
                    .stream()
                    .flatMap(stoptimesWithPattern -> stoptimesWithPattern.times.stream())
                    .sorted(Comparator.comparing(t -> t.serviceDay + t.realtimeDeparture))
                    .limit((long) (int) environment.getArgument("numberOfDepartures"))
                    .collect(Collectors.toList()))
                .build())
            .build();

        stoptimeType = GraphQLObjectType.newObject()
            .name("Stoptime")
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("stop")
                .type(stopType)
                .dataFetcher(environment -> index.stopForId
                    .get(((TripTimeShort) environment.getSource()).stopId))
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("scheduledArrival")
                .type(Scalars.GraphQLInt)
                .dataFetcher(
                    environment -> ((TripTimeShort) environment.getSource()).scheduledArrival)
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("realtimeArrival")
                .type(Scalars.GraphQLInt)
                .dataFetcher(
                    environment -> ((TripTimeShort) environment.getSource()).realtimeArrival)
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("arrivalDelay")
                .type(Scalars.GraphQLInt)
                .dataFetcher(environment -> ((TripTimeShort) environment.getSource()).arrivalDelay)
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("scheduledDeparture")
                .type(Scalars.GraphQLInt)
                .dataFetcher(
                    environment -> ((TripTimeShort) environment.getSource()).scheduledDeparture)
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("realtimeDeparture")
                .type(Scalars.GraphQLInt)
                .dataFetcher(
                    environment -> ((TripTimeShort) environment.getSource()).realtimeArrival)
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("departureDelay")
                .type(Scalars.GraphQLInt)
                .dataFetcher(
                    environment -> ((TripTimeShort) environment.getSource()).departureDelay)
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("timepoint")
                .type(Scalars.GraphQLBoolean)
                .dataFetcher(environment -> ((TripTimeShort) environment.getSource()).timepoint)
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("realtime")
                .type(Scalars.GraphQLBoolean)
                .dataFetcher(environment -> ((TripTimeShort) environment.getSource()).realtime)
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("realtimeState")
                .type(realtimeStateEnum)
                .dataFetcher(environment -> ((TripTimeShort) environment.getSource()).realtimeState)
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("serviceDay")
                .type(Scalars.GraphQLLong)
                .dataFetcher(environment -> ((TripTimeShort) environment.getSource()).serviceDay)
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("trip")
                .type(tripType)
                .dataFetcher(environment -> index.tripForId
                    .get(((TripTimeShort) environment.getSource()).tripId))
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
               	.name("headsign")
              	.type(Scalars.GraphQLString)
              	.dataFetcher(environment -> ((TripTimeShort) environment.getSource()).headsign)
              	.build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("stopSequence")
                .type(Scalars.GraphQLInt)
                .dataFetcher(environment -> ((TripTimeShort) environment.getSource()).stopSequence)
                .build())
            .build();

        tripType = GraphQLObjectType.newObject()
            .name("Trip")
            .withInterface(nodeInterface)
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("id")
                .type(new GraphQLNonNull(Scalars.GraphQLID))
                .dataFetcher(environment -> relay.toGlobalId(
                    tripType.getName(),
                    GtfsLibrary.convertIdToString(((Trip) environment.getSource()).getId())))
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("gtfsId")
                .type(new GraphQLNonNull(Scalars.GraphQLString))
                .dataFetcher(environment -> GtfsLibrary
                    .convertIdToString(((Trip) environment.getSource()).getId()))
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("route")
                .type(new GraphQLNonNull(routeType))
                .dataFetcher(environment -> ((Trip) environment.getSource()).getRoute())
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("serviceId")
                .type(Scalars.GraphQLString) //TODO:Should be serviceType
                .dataFetcher(environment -> GtfsLibrary
                    .convertIdToString(((Trip) environment.getSource()).getServiceId()))
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("tripShortName")
                .type(Scalars.GraphQLString)
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("tripHeadsign")
                .type(Scalars.GraphQLString)
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("routeShortName")
                .type(Scalars.GraphQLString)
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("directionId")
                .type(Scalars.GraphQLString)
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("blockId")
                .type(Scalars.GraphQLString)
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("shapeId")
                .type(Scalars.GraphQLString)
                .dataFetcher(environment -> GtfsLibrary
                    .convertIdToString(((Trip) environment.getSource()).getShapeId()))
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("wheelchairAccessible")
                .type(wheelchairBoardingEnum)
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("bikesAllowed")
                .type(bikesAllowedEnum)
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("pattern")
                .type(patternType)
                .dataFetcher(
                    environment -> index.patternForTrip.get((Trip) environment.getSource()))
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("stops")
                .type(new GraphQLNonNull(new GraphQLList(new GraphQLNonNull(stopType))))
                .dataFetcher(environment -> index.patternForTrip
                    .get((Trip) environment.getSource()).getStops())
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                    .name("departureStoptime")
                    .type(stoptimeType)
                    .argument(GraphQLArgument.newArgument()
                            .name("serviceDay")
                            .type(Scalars.GraphQLString)
                            .build())
                    .dataFetcher(environment -> {
                        try {
                            if(environment.getArgument("serviceDay") != null){
                                Trip trip = (Trip) environment.getSource();

                                ServiceDate serviceDate = ServiceDate.parseString(environment.getArgument("serviceDay"));
                                List<TripTimeShort> res = index.getStopTimesForTrip(trip,serviceDate);
                                res.sort(new Comparator<TripTimeShort>() {
                                    @Override
                                    public int compare(TripTimeShort tripTimeShort, TripTimeShort t1) {
                                        return Integer.compare(tripTimeShort.stopIndex, t1.stopIndex);
                                    }
                                });
                                return res.get(0);
                            }else{
                                List<TripTimeShort> res = TripTimeShort.fromTripTimes(
                                        index.patternForTrip.get((Trip) environment.getSource()).scheduledTimetable,
                                        (Trip) environment.getSource());
                                res.sort(new Comparator<TripTimeShort>() {
                                    @Override
                                    public int compare(TripTimeShort tripTimeShort, TripTimeShort t1) {
                                        return Integer.compare(tripTimeShort.stopIndex, t1.stopIndex);
                                    }
                                });
                                return res.get(0);
                            }
                        } catch (ParseException e) {
                            return null; // Invalid date format
                        }
                    })
                    .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("arrivalStoptime")
                .type(stoptimeType)
                .argument(GraphQLArgument.newArgument()
                        .name("serviceDay")
                        .type(Scalars.GraphQLString)
                        .build())
                .dataFetcher(environment -> {
                    try {
                        if(environment.getArgument("serviceDay") != null){
                            Trip trip = (Trip) environment.getSource();

                            ServiceDate serviceDate = ServiceDate.parseString(environment.getArgument("serviceDay"));
                            List<TripTimeShort> res = index.getStopTimesForTrip(trip,serviceDate);
                            res.sort(new Comparator<TripTimeShort>() {
                                @Override
                                public int compare(TripTimeShort tripTimeShort, TripTimeShort t1) {
                                    return Integer.compare(tripTimeShort.stopIndex, t1.stopIndex);
                                }
                            });
                            return res.get(res.size()-1);
                        }else{
                            List<TripTimeShort> res = TripTimeShort.fromTripTimes(
                                    index.patternForTrip.get((Trip) environment.getSource()).scheduledTimetable,
                                    (Trip) environment.getSource());
                            res.sort(new Comparator<TripTimeShort>() {
                                @Override
                                public int compare(TripTimeShort tripTimeShort, TripTimeShort t1) {
                                    return Integer.compare(tripTimeShort.stopIndex, t1.stopIndex);
                                }
                            });
                            return res.get(res.size()-1);
                        }
                    } catch (ParseException e) {
                        return null; // Invalid date format
                    }
                })
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("semanticHash")
                .type(new GraphQLNonNull(new GraphQLList(new GraphQLNonNull(stopType))))
                .dataFetcher(environment -> index.patternForTrip.get((Trip) environment.getSource())
                    .semanticHashString((Trip) environment.getSource()))
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("stoptimes")
                .type(new GraphQLList(stoptimeType))
                .dataFetcher(environment -> TripTimeShort.fromTripTimes(
                    index.patternForTrip.get((Trip) environment.getSource()).scheduledTimetable,
                    (Trip) environment.getSource()))
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("stoptimesForDate")
                .type(new GraphQLList(stoptimeType))
                .argument(GraphQLArgument.newArgument()
                    .name("serviceDay")
                    .type(Scalars.GraphQLString)
                    .build())
                .dataFetcher(environment -> {
                    try {
                        Trip trip = (Trip) environment.getSource();

                        ServiceDate serviceDate = ServiceDate.parseString(environment.getArgument("serviceDay"));
                        return index.getStopTimesForTrip(trip,serviceDate);
                    } catch (ParseException e) {
                         return null; // Invalid date format
                    }
                })
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("geometry")
                .type(Scalars.GraphQLString) //TODO: Should be geometry
                .dataFetcher(environment -> {
                    try {
                        Trip trip = (Trip) environment.getSource();
                        LineString geometry = index.patternForTrip
                                .get(trip).geometry;

                        Geometry geometry2D;
                        if(geometry == null){
                            GeometryFactory geometryFactory = new GeometryFactory();
                            List<Stop> stops = index.patternForTrip.get(trip).getStops();
                            Coordinate[] coordinates = new Coordinate[stops.size()];
                            for(int i = 0; i < stops.size(); i++){
                                Stop stop = stops.get(i);
                                coordinates[i] = new Coordinate(stop.getLon(),stop.getLat());
                            }
                            geometry2D = geometryFactory.createLineString(coordinates);
                        }else{
                            geometry2D = (Geometry) geometry.clone();
                            for(Coordinate c : geometry2D.getCoordinates()){
                                c.setCoordinate(new Coordinate(c.x, c.y));
                            }
                        }

                        PolylineEncoder polylineEncoder = new PolylineEncoder();
                        return polylineEncoder.createEncodings(geometry2D).getPoints();
                    } catch (Exception e) {

                        return null;
                    }
                })
                .build())
            .build();

        coordinateType = GraphQLObjectType.newObject()
            .name("Coordinates")
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("lat")
                .type(Scalars.GraphQLFloat)
                .dataFetcher(
                    environment -> (float) ((Coordinate) environment.getSource()).y)
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("lon")
                .type(Scalars.GraphQLFloat)
                .dataFetcher(
                    environment -> (float) ((Coordinate) environment.getSource()).x)
                .build())
            .build();

        patternType = GraphQLObjectType.newObject()
            .name("Pattern")
            .withInterface(nodeInterface)
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("id")
                .type(new GraphQLNonNull(Scalars.GraphQLID))
                .dataFetcher(environment -> relay.toGlobalId(
                    patternType.getName(), ((TripPattern) environment.getSource()).code))
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("route")
                .type(new GraphQLNonNull(routeType))
                .dataFetcher(environment -> ((TripPattern) environment.getSource()).route)
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("directionId")
                .type(Scalars.GraphQLInt)
                .dataFetcher(environment -> ((TripPattern) environment.getSource()).directionId)
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("name")
                .type(Scalars.GraphQLString)
                .dataFetcher(environment -> ((TripPattern) environment.getSource()).name)
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("code")
                .type(new GraphQLNonNull(Scalars.GraphQLString))
                .dataFetcher(environment -> ((TripPattern) environment.getSource()).code)
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("headsign")
                .type(Scalars.GraphQLString)
                .dataFetcher(environment -> ((TripPattern) environment.getSource()).getDirection())
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("trips")
                .type(new GraphQLList(new GraphQLNonNull(tripType)))
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("stops")
                .type(new GraphQLList(new GraphQLNonNull(stopType)))
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("geometry")
                .type(Scalars.GraphQLString)
                .dataFetcher(environment -> {
                    try{
                        TripPattern tripPattern = (TripPattern) environment.getSource();
                        LineString geometry = index.patternForTrip
                                .get(tripPattern).geometry;

                        Geometry geometry2D;
                        if(geometry == null){
                            GeometryFactory geometryFactory = new GeometryFactory();
                            List<Stop> stops = tripPattern.getStops();
                            Coordinate[] coordinates = new Coordinate[stops.size()];
                            for(int i = 0; i < stops.size(); i++){
                                Stop stop = stops.get(i);
                                coordinates[i] = new Coordinate(stop.getLon(),stop.getLat());
                            }
                            geometry2D = geometryFactory.createLineString(coordinates);
                        }else{
                            geometry2D = (Geometry) geometry.clone();
                            for(Coordinate c : geometry2D.getCoordinates()){
                                c.setCoordinate(new Coordinate(c.x, c.y));
                            }
                        }

                        PolylineEncoder polylineEncoder = new PolylineEncoder();
                        return polylineEncoder.createEncodings(geometry2D).getPoints();
                    } catch (Exception e) {

                        return null;
                    }
                })
                .build())
                // TODO: add stoptimes
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("semanticHash")
                .type(Scalars.GraphQLString)
                .dataFetcher(environment ->
                    ((TripPattern) environment.getSource()).semanticHashString(null))
                .build())
            .build();


        routeType = GraphQLObjectType.newObject()
            .name("Route")
            .withInterface(nodeInterface)
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("id")
                .type(new GraphQLNonNull(Scalars.GraphQLID))
                .dataFetcher(environment -> relay.toGlobalId(
                    routeType.getName(),
                    GtfsLibrary.convertIdToString(((Route) environment.getSource()).getId())))
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("gtfsId")
                .type(new GraphQLNonNull(Scalars.GraphQLString))
                .dataFetcher(environment ->
                    GtfsLibrary.convertIdToString(((Route) environment.getSource()).getId()))
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("agency")
                .type(agencyType)
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("shortName")
                .type(Scalars.GraphQLString)
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("sortOrder")
                .type(Scalars.GraphQLInt)
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("longName")
                .type(Scalars.GraphQLString)
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("mode")
                .type(Scalars.GraphQLString)
                .dataFetcher(environment -> GtfsLibrary.getTraverseMode(
                    (Route) environment.getSource()))
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("type")
                .type(Scalars.GraphQLString)
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("desc")
                .type(Scalars.GraphQLString)
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("url")
                .type(Scalars.GraphQLString)
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("color")
                .type(Scalars.GraphQLString)
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("textColor")
                .type(Scalars.GraphQLString)
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("bikesAllowed")
                .type(bikesAllowedEnum)
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("patterns")
                .type(new GraphQLList(patternType))
                .dataFetcher(environment -> index.patternsForRoute
                    .get((Route) environment.getSource()))
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("stops")
                .type(new GraphQLList(stopType))
                .dataFetcher(environment -> index.patternsForRoute
                    .get((Route) environment.getSource())
                    .stream()
                    .map(TripPattern::getStops)
                    .flatMap(Collection::stream)
                    .distinct()
                    .collect(Collectors.toList()))
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("trips")
                .type(new GraphQLList(tripType))
                .dataFetcher(environment -> index.patternsForRoute
                    .get((Route) environment.getSource())
                    .stream()
                    .map(TripPattern::getTrips)
                    .flatMap(Collection::stream)
                    .distinct()
                    .collect(Collectors.toList()))
                .build())
            .build();

        agencyType = GraphQLObjectType.newObject()
            .name("Agency")
            .description("Agency in the graph")
            .withInterface(nodeInterface)
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("id")
                .type(new GraphQLNonNull(Scalars.GraphQLID))
                .dataFetcher(environment -> relay
                    .toGlobalId(agencyType.getName(), ((Agency) environment.getSource()).getId()))
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("gtfsId")
                .description("Agency id")
                .type(new GraphQLNonNull(Scalars.GraphQLString))
                .dataFetcher(environment -> ((Agency) environment.getSource()).getId())
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("name")
                .type(new GraphQLNonNull(Scalars.GraphQLString))
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("url")
                .type(new GraphQLNonNull(Scalars.GraphQLString))
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("timezone")
                .type(new GraphQLNonNull(Scalars.GraphQLString))
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("lang")
                .type(Scalars.GraphQLString)
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("phone")
                .type(Scalars.GraphQLString)
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("fareUrl")
                .type(Scalars.GraphQLString)
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("brandingUrl")
                .type(Scalars.GraphQLString)
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("feedIds")
                .type(new GraphQLList(Scalars.GraphQLString))
                .dataFetcher(environment -> {
                    List<String> feeds = new ArrayList<>();
                    for(String feedId : index.agenciesForFeedId.keySet()){
                        if(index.agenciesForFeedId.get(feedId).get(((Agency) environment.getSource()).getId()) != null){
                            feeds.add(feedId);
                        }
                    }
                    return feeds;
                })
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("routes")
                .type(new GraphQLList(routeType))
                .dataFetcher(environment -> index.routeForId.values()
                    .stream()
                    .filter(route -> route.getAgency().equals((Agency)environment.getSource()))
                    .collect(Collectors.toList()))
                .build())
            .build();

        bikeRentalStationType = GraphQLObjectType.newObject()
                .name("BikeRentalStation")
                .description("Bike rental station represents a location where users can rent bicycles for a fee.")
                .withInterface(nodeInterface)
                .withInterface(placeInterface)
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("id")
                        .description("Global object ID provided by Relay. This value can be used to refetch this object using **node** query.")
                        .type(new GraphQLNonNull(Scalars.GraphQLID))
                        .dataFetcher(environment -> relay
                                .toGlobalId(bikeRentalStationType.getName(), ((BikeRentalStation) environment.getSource()).id))
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("stationId")
                        .description("ID of the bike rental station")
                        .type(Scalars.GraphQLString)
                        .dataFetcher(environment -> ((BikeRentalStation) environment.getSource()).id)
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("name")
                        .description("Name of the bike rental station")
                        .type(new GraphQLNonNull(Scalars.GraphQLString))
                        .dataFetcher(environment -> ((BikeRentalStation) environment.getSource()).getName())
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("bikesAvailable")
                        .description("Number of bikes currently available on the rental station.")
                        .type(Scalars.GraphQLInt)
                        .dataFetcher(environment -> ((BikeRentalStation) environment.getSource()).bikesAvailable)
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("spacesAvailable")
                        .description("Number of free spaces currently available on the rental station.  \n Note that this value being 0 does not necessarily indicate that bikes cannot be returned to this station, as it might be possible to leave the bike in the vicinity of the rental station, even if the bike racks don't have any spaces available (see field `allowDropoff`).")
                        .type(Scalars.GraphQLInt)
                        .dataFetcher(environment -> ((BikeRentalStation) environment.getSource()).spacesAvailable)
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("capacity")
                        .description("Nominal capacity (number of racks) of the rental station.")
                        .type(Scalars.GraphQLInt)
                        .dataFetcher(environment -> ((BikeRentalStation) environment.getSource()).spacesAvailable + ((BikeRentalStation) environment.getSource()).bikesAvailable)
                        .build())
               // .field(GraphQLFieldDefinition.newFieldDefinition()
               //         .name("state")
               //         .description("A description of the current state of this bike rental station, e.g. \"Station on\"")
               //         .type(Scalars.GraphQLString)
               //         .dataFetcher(environment -> ((BikeRentalStation) environment.getSource()).status)
               //         .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("realtime")
                        .description("If true, values of `bikesAvailable` and `spacesAvailable` are updated from a real-time source. If false, values of `bikesAvailable` and `spacesAvailable` are always the total capacity divided by two.")
                        .type(Scalars.GraphQLBoolean)
                        .dataFetcher(environment -> ((BikeRentalStation) environment.getSource()).realTimeData)
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("allowDropoff")
                        .description("If true, bikes can be returned to this station.")
                        .type(Scalars.GraphQLBoolean)
                        .dataFetcher(environment -> ((BikeRentalStation) environment.getSource()).allowDropoff)
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("allowOverloading")
                        .description("If true, bikes can be returned even if spacesAvailable is zero or bikes > capacity.")
                        .type(Scalars.GraphQLBoolean)
                        .dataFetcher(environment -> ((BikeRentalStation) environment.getSource()).allowOverloading)
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("isFloatingBike")
                        .description("If true, this is a free floating bike.")
                        .type(Scalars.GraphQLBoolean)
                        .dataFetcher(environment -> ((BikeRentalStation) environment.getSource()).isFloatingBike)
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("isCarStation")
                        .description("If true, this is a car rental system station.")
                        .type(Scalars.GraphQLBoolean)
                        .dataFetcher(environment -> ((BikeRentalStation) environment.getSource()).isCarStation)
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("networks")
                        .type(new GraphQLList(Scalars.GraphQLString))
                        .dataFetcher(environment -> new ArrayList<>(((BikeRentalStation) environment.getSource()).networks))
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("lon")
                        .description("Longitude of the bike rental station (WGS 84)")
                        .type(Scalars.GraphQLFloat)
                        .dataFetcher(environment -> ((BikeRentalStation) environment.getSource()).x)
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("lat")
                        .description("Latitude of the bike rental station (WGS 84)")
                        .type(Scalars.GraphQLFloat)
                        .dataFetcher(environment -> ((BikeRentalStation) environment.getSource()).y)
                        .build())
                .build();

        bikeParkType = GraphQLObjectType.newObject()
                .name("BikePark")
                .description("Bike park represents a location where bicycles can be parked.")
                .withInterface(nodeInterface)
                .withInterface(placeInterface)
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("id")
                        .description("Global object ID provided by Relay. This value can be used to refetch this object using **node** query.")
                        .type(new GraphQLNonNull(Scalars.GraphQLID))
                        .dataFetcher(environment -> relay
                                .toGlobalId(bikeParkType.getName(), ((BikePark) environment.getSource()).id))
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("bikeParkId")
                        .description("ID of the bike park")
                        .type(Scalars.GraphQLString)
                        .dataFetcher(environment -> ((BikePark) environment.getSource()).id)
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("name")
                        .description("Name of the bike park")
                        .type(new GraphQLNonNull(Scalars.GraphQLString))
                        .dataFetcher(environment -> ((BikePark) environment.getSource()).name)
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("spacesAvailable")
                        .description("Number of spaces available for bikes")
                        .type(Scalars.GraphQLInt)
                        .dataFetcher(environment -> ((BikePark) environment.getSource()).spacesAvailable)
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("realtime")
                        .description("If true, value of `spacesAvailable` is updated from a real-time source.")
                        .type(Scalars.GraphQLBoolean)
                        .dataFetcher(environment -> ((BikePark) environment.getSource()).realTimeData)
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("lon")
                        .description("Longitude of the bike park (WGS 84)")
                        .type(Scalars.GraphQLFloat)
                        .dataFetcher(environment -> ((BikePark) environment.getSource()).x)
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("lat")
                        .description("Latitude of the bike park (WGS 84)")
                        .type(Scalars.GraphQLFloat)
                        .dataFetcher(environment -> ((BikePark) environment.getSource()).y)
                        .build())
                .build();

        carParkType = GraphQLObjectType.newObject()
                .name("CarPark")
                .description("Car park represents a location where cars can be parked.")
                .withInterface(nodeInterface)
                .withInterface(placeInterface)
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("id")
                        .description("Global object ID provided by Relay. This value can be used to refetch this object using **node** query.")
                        .type(new GraphQLNonNull(Scalars.GraphQLID))
                        .dataFetcher(environment -> relay
                                .toGlobalId(carParkType.getName(), ((CarPark) environment.getSource()).id))
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("carParkId")
                        .description("ID of the car park")
                        .type(Scalars.GraphQLString)
                        .dataFetcher(environment -> ((CarPark) environment.getSource()).id)
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("name")
                        .description("Name of the car park")
                        .type(new GraphQLNonNull(Scalars.GraphQLString))
                        .dataFetcher(environment -> ((CarPark) environment.getSource()).name)
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("maxCapacity")
                        .description("Number of parking spaces at the car park")
                        .type(Scalars.GraphQLInt)
                        .dataFetcher(environment -> ((CarPark) environment.getSource()).maxCapacity)
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("spacesAvailable")
                        .description("Number of currently available parking spaces at the car park")
                        .type(Scalars.GraphQLInt)
                        .dataFetcher(environment -> ((CarPark) environment.getSource()).spacesAvailable)
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("realtime")
                        .description("If true, value of `spacesAvailable` is updated from a real-time source.")
                        .type(Scalars.GraphQLBoolean)
                        .dataFetcher(environment -> ((CarPark) environment.getSource()).realTimeData)
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("lon")
                        .description("Longitude of the car park (WGS 84)")
                        .type(Scalars.GraphQLFloat)
                        .dataFetcher(environment -> ((CarPark) environment.getSource()).x)
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("lat")
                        .description("Latitude of the car park (WGS 84)")
                        .type(Scalars.GraphQLFloat)
                        .dataFetcher(environment -> ((CarPark) environment.getSource()).y)
                        .build())
                .build();

        GraphQLObjectType fareAttributeType = GraphQLObjectType.newObject()
                .name("fareAttributes")
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("name")
                        .type(Scalars.GraphQLString)
                        .dataFetcher(environment -> ((FareAttribute)environment.getSource()).getId().getId())
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("cents")
                        .type(Scalars.GraphQLInt)
                        .dataFetcher(environment -> {
                            float price = ((FareAttribute)environment.getSource()).getPrice();
                            WrappedCurrency currency = new WrappedCurrency(((FareAttribute)environment.getSource()).getCurrencyType());
                            int fractionDigits = 2;
                            if (currency != null)
                                fractionDigits = currency.getDefaultFractionDigits();
                            int cents = (int) Math.round(price * Math.pow(10, fractionDigits));
                            return cents;
                        })
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("currency")
                        .type(Scalars.GraphQLString)
                        .dataFetcher(new PropertyDataFetcher("currencyType"))
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("paymentMethod")
                        .type(Scalars.GraphQLInt)
                        .dataFetcher(new PropertyDataFetcher("paymentMethod"))
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("transfers")
                        .type(Scalars.GraphQLInt)
                        .dataFetcher(new PropertyDataFetcher("transfers"))
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("transferDuration")
                        .type(Scalars.GraphQLInt)
                        .dataFetcher(new PropertyDataFetcher("transferDuration"))
                        .build())
                .build();
        GraphQLObjectType fareRuleType = GraphQLObjectType.newObject()
                .name("fareRule")
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("originId")
                        .type(Scalars.GraphQLString)
                        .dataFetcher(new PropertyDataFetcher("originId"))
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("destinationId")
                        .type(Scalars.GraphQLString)
                        .dataFetcher(new PropertyDataFetcher("destinationId"))
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("containsId")
                        .type(Scalars.GraphQLString)
                        .dataFetcher(new PropertyDataFetcher("containsId"))
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("instrId")
                        .type(Scalars.GraphQLString)
                        .dataFetcher(new PropertyDataFetcher("routingId"))
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("modes")
                        .type(new GraphQLList(modeEnum))
                        .dataFetcher(environment -> {
                            String originId = ((FareRule)environment.getSource()).getOriginId();
                            String destinationId = ((FareRule)environment.getSource()).getDestinationId();
                            String containsId = ((FareRule)environment.getSource()).getContainsId();
                            List<TraverseMode> modes = new ArrayList<>();
                            for(Stop stop : index.stopForId.values()){
                                if(stop.getZoneId() != null){
                                    if((originId != null && stop.getZoneId().equals(originId))
                                            || (destinationId != null && stop.getZoneId().equals(destinationId))
                                            || (containsId != null && stop.getZoneId().equals(containsId))){
                                        TraverseMode traverseMode = index.patternsForStop.get(stop)
                                                .stream()
                                                .map(pattern -> pattern.mode)
                                                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                                                .entrySet()
                                                .stream()
                                                .max(Comparator.comparing(Map.Entry::getValue))
                                                .map(e -> e.getKey())
                                                .orElse(null);
                                        if(traverseMode != null){
                                            if(!modes.contains(traverseMode)){
                                                modes.add(traverseMode);
                                            }
                                        }
                                    }
                                }

                            }

                            return modes;
                        })
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("route")
                        .type(routeType)
                        .dataFetcher(new PropertyDataFetcher("route"))
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("attributes")
                        .type(fareAttributeType)
                        .dataFetcher(new PropertyDataFetcher("fare"))
                        .build())
                .build();
        GraphQLObjectType simpleZoneType = GraphQLObjectType.newObject()
                .name("Zone")
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("gtfsId")
                        .type(new GraphQLNonNull(Scalars.GraphQLString))
                        .dataFetcher(environment ->
                                GtfsLibrary.convertIdToString(((Zone) environment.getSource()).getId()))
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("name")
                        .type(Scalars.GraphQLString)
                        .dataFetcher(new PropertyDataFetcher("name"))
                        .build())
                .build();

        GraphQLObjectType zoneType = GraphQLObjectType.newObject()
                .name("Zone")
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("gtfsId")
                        .type(new GraphQLNonNull(Scalars.GraphQLString))
                        .dataFetcher(environment ->
                                GtfsLibrary.convertIdToString(((Zone) environment.getSource()).getId()))
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("name")
                        .type(Scalars.GraphQLString)
                        .dataFetcher(new PropertyDataFetcher("name"))
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("lat")
                        .type(Scalars.GraphQLFloat)
                        .dataFetcher(new PropertyDataFetcher("lat"))
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("lon")
                        .type(Scalars.GraphQLFloat)
                        .dataFetcher(new PropertyDataFetcher("lon"))
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("stops")
                        .type(new GraphQLList(stopType))
                        .dataFetcher(new PropertyDataFetcher("stops"))
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("destinations")
                        .type(new GraphQLList(simpleZoneType))
                        .argument(GraphQLArgument.newArgument()
                                .name("mode")
                                .type(Scalars.GraphQLString)
                                .build())
                        .argument(GraphQLArgument.newArgument()
                                .name("limit")
                                .type(Scalars.GraphQLLong)
                                .defaultValue(Long.MAX_VALUE)
                                .build())
                        .dataFetcher(environment -> {
                            FeedScopedId originId = ((Zone) environment.getSource()).getId();
                            List<Zone> destinationZones = new ArrayList<>();
                            List<FeedScopedId> rulesContains = new ArrayList<>();
                            for (FeedScopedId key : index.fareRulesById.keySet()) {
                                Collection<FareRule> rules = index.fareRulesById.get(key);
                                for (FareRule rule : rules) {
                                    if(rule.getContainsId() != null && rule.getContainsId().equals(originId.getId())){
                                        rulesContains.add(key);
                                    }

                                    if(rule.getOriginId() != null
                                            && rule.getOriginId().equals(originId.getId())
                                            && rule.getFare().getId().getAgencyId().equals(originId.getAgencyId())){
                                        FeedScopedId destinationId = new FeedScopedId(rule.getFare().getId().getAgencyId(),rule.getDestinationId());
                                        Zone destinationZone = index.zonesById.get(destinationId);
                                        if(destinationZone != null){
                                            List<TraverseMode> modes = new ArrayList<>();

                                            for(Stop stop : destinationZone.getStops()){
                                                TraverseMode traverseMode = index.patternsForStop.get(stop)
                                                        .stream()
                                                        .map(pattern -> pattern.mode)
                                                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                                                        .entrySet()
                                                        .stream()
                                                        .max(Comparator.comparing(Map.Entry::getValue))
                                                        .map(e -> e.getKey())
                                                        .orElse(null);
                                                if(traverseMode != null){
                                                    if(!modes.contains(traverseMode)){
                                                        modes.add(traverseMode);
                                                    }
                                                }
                                            }
                                            for(TraverseMode mode : modes){
                                                if(environment.getArgument("mode") == null){
                                                    //no filter
                                                    if(!destinationZones.contains(destinationZone)){
                                                        destinationZones.add(destinationZone);
                                                    }
                                                    break;
                                                } else if(mode.equals(Enum.valueOf(TraverseMode.class, environment.getArgument("mode")))){
                                                    if(!destinationZones.contains(destinationZone)){
                                                        destinationZones.add(destinationZone);
                                                    }
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }

                            for(FeedScopedId key : rulesContains){
                                Collection<FareRule> rules = index.fareRulesById.get(key);
                                for (FareRule rule : rules) {
                                    if(rule.getContainsId() != null){
                                        FeedScopedId zoneId = new FeedScopedId(rule.getFare().getId().getAgencyId(),rule.getContainsId());
                                        Zone zone = index.zonesById.get(zoneId);
                                        if(zone != null){
                                            List<TraverseMode> modes = new ArrayList<>();

                                            for(Stop stop : zone.getStops()){
                                                TraverseMode traverseMode = index.patternsForStop.get(stop)
                                                        .stream()
                                                        .map(pattern -> pattern.mode)
                                                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                                                        .entrySet()
                                                        .stream()
                                                        .max(Comparator.comparing(Map.Entry::getValue))
                                                        .map(e -> e.getKey())
                                                        .orElse(null);
                                                if(traverseMode != null){
                                                    if(!modes.contains(traverseMode)){
                                                        modes.add(traverseMode);
                                                    }
                                                }
                                            }
                                            for(TraverseMode mode : modes){
                                                if(environment.getArgument("mode") == null){
                                                    //no filter
                                                    if(!destinationZones.contains(zone)){
                                                        destinationZones.add(zone);
                                                    }
                                                    break;
                                                } else if(mode.equals(Enum.valueOf(TraverseMode.class, environment.getArgument("mode")))){
                                                    if(!destinationZones.contains(zone)){
                                                        destinationZones.add(zone);
                                                    }
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return destinationZones
                                    .stream()
                                    .limit(environment.getArgument("limit"))
                                    .collect(Collectors.toList());
                        })
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("modes")
                        .type(new GraphQLList(modeEnum))
                        .dataFetcher(environment -> {
                            List<TraverseMode> modes = new ArrayList<>();
                            for(Stop stop : ((Zone)environment.getSource()).getStops()){
                                TraverseMode traverseMode = index.patternsForStop.get(stop)
                                        .stream()
                                        .map(pattern -> pattern.mode)
                                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                                        .entrySet()
                                        .stream()
                                        .max(Comparator.comparing(Map.Entry::getValue))
                                        .map(e -> e.getKey())
                                        .orElse(null);
                                if(traverseMode != null){
                                    if(!modes.contains(traverseMode)){
                                        modes.add(traverseMode);
                                    }
                                }
                            }

                            return modes;
                        })
                        .build())
                .build();

        queryType = GraphQLObjectType.newObject()
            .name("QueryType")
            .field(relay.nodeField(nodeInterface, environment -> {
                Relay.ResolvedGlobalId id = relay.fromGlobalId(environment.getArgument("id"));
                if (id.type.equals(clusterType.getName())) {
                    return index.stopClusterForId.get(id.id);
                }
                if (id.type.equals(stopType.getName())) {
                    return index.stopForId.get(GtfsLibrary.convertIdFromString(id.id));
                }
                if (id.type.equals(tripType.getName())) {
                    return index.tripForId.get(GtfsLibrary.convertIdFromString(id.id));
                }
                if (id.type.equals(routeType.getName())) {
                    return index.routeForId.get(GtfsLibrary.convertIdFromString(id.id));
                }
                if (id.type.equals(patternType.getName())) {
                    return index.patternForId.get(id.id);
                }
                if (id.type.equals(agencyType.getName())) {
                    return index.getAgencyWithoutFeedId(id.id);
                }
                return null;
            }))
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("agencies")
                .description("Get all agencies for the specified graph")
                .type(new GraphQLList(agencyType))
                .dataFetcher(environment -> index.getAllAgencies())
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("agency")
                .description("Get a single agency based on agency ID")
                .type(agencyType)
                .argument(GraphQLArgument.newArgument()
                    .name("id")
                    .type(new GraphQLNonNull(Scalars.GraphQLString))
                    .build())
                .dataFetcher(environment ->
                    index.getAgencyWithoutFeedId(environment.getArgument("id")))
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("stops")
                .description("Get all stops for the specified graph")
                .type(new GraphQLList(stopType))
                .argument(GraphQLArgument.newArgument()
                    .name("ids")
                    .type(new GraphQLList(Scalars.GraphQLString))
                    .build())
                .argument(GraphQLArgument.newArgument()
                    .name("skip")
                    .type(Scalars.GraphQLLong)
                    .defaultValue((long) 0)
                    .build())
                .argument(GraphQLArgument.newArgument()
                    .name("limit")
                    .type(Scalars.GraphQLLong)
                    .defaultValue(Long.MAX_VALUE)
                    .build())
                .dataFetcher(environment -> {
                    if (!(environment.getArgument("ids") instanceof List)) {
                        return new ArrayList<>(
                                index.stopForId
                                        .values()
                                        .stream()
                                        .skip(environment.getArgument("skip"))
                                        .limit(environment.getArgument("limit"))
                                        .collect(Collectors.toList())
                        );
                    } else {
                        return ((List<String>) environment.getArgument("ids"))
                            .stream()
                            .map(id -> index.stopForId.get(GtfsLibrary.convertIdFromString(id)))
                            .collect(Collectors.toList());
                    }
                })
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("stopsByBbox")
                .description("Get all stops within the specified bounding box")
                .type(new GraphQLList(stopType))
                .argument(GraphQLArgument.newArgument()
                    .name("minLat")
                    .type(Scalars.GraphQLFloat)
                    .build())
                .argument(GraphQLArgument.newArgument()
                    .name("minLon")
                    .type(Scalars.GraphQLFloat)
                    .build())
                .argument(GraphQLArgument.newArgument()
                    .name("maxLat")
                    .type(Scalars.GraphQLFloat)
                    .build())
                .argument(GraphQLArgument.newArgument()
                    .name("maxLon")
                    .type(Scalars.GraphQLFloat)
                    .build())
                .argument(GraphQLArgument.newArgument()
                    .name("agency")
                    .type(Scalars.GraphQLString)
                    .build())
                .dataFetcher(environment -> index.graph.streetIndex
                    .getTransitStopForEnvelope(new Envelope(
                        new Coordinate(environment.getArgument("minLon"), environment.getArgument("minLat")),
                        new Coordinate(environment.getArgument("maxLon"), environment.getArgument("maxLat"))))
                    .stream()
                    .map(TransitVertex::getStop)
                    .filter(stop -> environment.getArgument("agency") == null || stop.getId()
                        .getAgencyId().equalsIgnoreCase(environment.getArgument("agency")))
                    .collect(Collectors.toList()))
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("stopsByRadius")
                .description(
                    "Get all stops within the specified radius from a location. The returned type has two fields stop and distance")
                .type(relay.connectionType("stopAtDistance",
                    relay.edgeType("stopAtDistance", stopAtDistanceType, null, new ArrayList<>()),
                    new ArrayList<>()))
                .argument(GraphQLArgument.newArgument()
                    .name("lat")
                    .description("Latitude of the location")
                    .type(Scalars.GraphQLFloat)
                    .build())
                .argument(GraphQLArgument.newArgument()
                    .name("lon")
                    .description("Longitude of the location")
                    .type(Scalars.GraphQLFloat)
                    .build())
                .argument(GraphQLArgument.newArgument()
                    .name("radius")
                    .description("Radius (in meters) to search for from the specidied location")
                    .type(Scalars.GraphQLInt)
                    .build())
                .argument(GraphQLArgument.newArgument()
                    .name("agency")
                    .type(Scalars.GraphQLString)
                    .build())
                .argument(relay.getConnectionFieldArguments())
                .dataFetcher(environment ->
                    new SimpleListConnection(index.findClosestStopsByWalking(
                        environment.getArgument("lat"), environment.getArgument("lon"),
                        environment.getArgument("radius")
                    )
                        .stream()
                        .filter(stopAndDistance -> environment.getArgument("agency") == null ||
                            stopAndDistance.stop.getId().getAgencyId()
                                .equalsIgnoreCase(environment.getArgument("agency")))
                        .sorted(Comparator.comparing(s -> (float) s.distance))
                        .collect(Collectors.toList()))
                        .get(environment))
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                    .name("stopsByName")
                    .description("Get all stops with given name")
                    .type(new GraphQLList(stopType))
                    .argument(GraphQLArgument.newArgument()
                            .name("name")
                            .type(new GraphQLNonNull(Scalars.GraphQLString))
                            .build())
                    .argument(GraphQLArgument.newArgument()
                            .name("skip")
                            .type(Scalars.GraphQLLong)
                            .defaultValue((long) 0)
                            .build())
                    .argument(GraphQLArgument.newArgument()
                            .name("limit")
                            .type(Scalars.GraphQLLong)
                            .defaultValue(Long.MAX_VALUE)
                            .build())
                    .dataFetcher(environment -> {
                        String name = environment.getArgument("name");
                        Pattern p = Pattern.compile(name);
                        return new ArrayList<>(index.stopForId.values())
                                .stream()
                                .filter(stop -> p.matcher(stop.getName()).matches())
                                .sorted(Comparator.comparing(s -> s.getName()))
                                .skip(environment.getArgument("skip"))
                                .limit(environment.getArgument("limit"))
                                .collect(Collectors.toList());
                    })
                    .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("stop")
                .description("Get a single stop based on its id (format is Agency:StopId)")
                .type(stopType)
                .argument(GraphQLArgument.newArgument()
                    .name("id")
                    .type(new GraphQLNonNull(Scalars.GraphQLString))
                    .build())
                .dataFetcher(environment -> index.stopForId
                    .get(GtfsLibrary.convertIdFromString(environment.getArgument("id"))))
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("routes")
                .description("Get all routes for the specified graph")
                .type(new GraphQLList(routeType))
                .argument(GraphQLArgument.newArgument()
                    .name("ids")
                    .type(new GraphQLList(Scalars.GraphQLString))
                    .build())
                .argument(GraphQLArgument.newArgument()
                        .name("skip")
                        .type(Scalars.GraphQLLong)
                        .defaultValue((long) 0)
                        .build())
                .argument(GraphQLArgument.newArgument()
                        .name("limit")
                        .type(Scalars.GraphQLLong)
                        .defaultValue(Long.MAX_VALUE)
                        .build())
                .argument(GraphQLArgument.newArgument()
                        .name("feedId")
                        .type(Scalars.GraphQLString)
                        .build())
                .dataFetcher(environment -> {
                    if (!(environment.getArgument("ids") instanceof List)) {
                        return new ArrayList<>(
                                index.routeForId
                                    .values()
                                    .stream()
                                    .filter(route -> {
                                        if(environment.getArgument("feedId") != null ){
                                            if(route.getId().getAgencyId().equals((String)environment.getArgument("feedId"))){
                                                return true;
                                            }
                                            return false;
                                        }
                                        return true;
                                    })
                                    .skip(environment.getArgument("skip"))
                                    .limit(environment.getArgument("limit"))
                                    .collect(Collectors.toList())
                        );
                    } else {
                        return ((List<String>) environment.getArgument("ids"))
                            .stream()
                            .map(id -> index.routeForId.get(GtfsLibrary.convertIdFromString(id)))
                            .collect(Collectors.toList());
                    }
                })
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                    .name("faresByName")
                    .description("Get fares filtered by fare_id")
                    .type(new GraphQLList(fareRuleType))
                    .argument(GraphQLArgument.newArgument()
                            .name("name")
                            .type(Scalars.GraphQLString)
                            .build())
                    .dataFetcher(environment -> {
                        String name = environment.getArgument("name");
                        Pattern p = Pattern.compile(name);
                        List<FareRule> fareRules = new ArrayList<>();
                        for (FeedScopedId id : index.fareRulesById.keySet()) {
                            if(p.matcher(id.getId()).matches()){
                                fareRules.addAll(index.fareRulesById.get(id));
                            }
                        }
                        return fareRules;
                    })
                    .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                    .name("zones")
                    .description("Get all zones")
                    .type(new GraphQLList(zoneType))
                    .argument(GraphQLArgument.newArgument()
                            .name("skip")
                            .type(Scalars.GraphQLLong)
                            .defaultValue((long) 0)
                            .build())
                    .argument(GraphQLArgument.newArgument()
                            .name("limit")
                            .type(Scalars.GraphQLLong)
                            .defaultValue(Long.MAX_VALUE)
                            .build())
                    .dataFetcher(environment -> new ArrayList<>(
                            index.zonesById.values()
                                    .stream()
                                    .skip(environment.getArgument("skip"))
                                    .limit(environment.getArgument("limit"))
                                    .collect(Collectors.toList())
                    ))
                    .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                    .name("zone")
                    .description("Get a zone by gtfs id")
                    .type(zoneType)
                    .argument(GraphQLArgument.newArgument()
                            .name("id")
                            .type(new GraphQLNonNull(Scalars.GraphQLString))
                            .build())
                    .dataFetcher(environment -> index.zonesById
                            .get(GtfsLibrary.convertIdFromString(environment.getArgument("id"))))
                    .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                    .name("zonesByName")
                    .description("Get zones filtered by zone name")
                    .type(new GraphQLList(zoneType))
                    .argument(GraphQLArgument.newArgument()
                            .name("name")
                            .type(Scalars.GraphQLString)
                            .build())
                    .argument(GraphQLArgument.newArgument()
                            .name("skip")
                            .type(Scalars.GraphQLLong)
                            .defaultValue((long) 0)
                            .build())
                    .argument(GraphQLArgument.newArgument()
                            .name("limit")
                            .type(Scalars.GraphQLLong)
                            .defaultValue(Long.MAX_VALUE)
                            .build())
                    .dataFetcher(environment -> {
                        String name = environment.getArgument("name");
                        Pattern p = Pattern.compile(name);
                        return index.zonesById.values().stream()
                                .filter(zone -> p.matcher(zone.getName()).matches())
                                .skip(environment.getArgument("skip"))
                                .limit(environment.getArgument("limit"))
                                .collect(Collectors.toList());
                    })
                    .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                    .name("nearestZones")
                    .description("Get zones order by distance from a point")
                    .type(new GraphQLList(zoneType))
                    .argument(GraphQLArgument.newArgument()
                            .name("lat")
                            .type(Scalars.GraphQLFloat)
                            .build())
                    .argument(GraphQLArgument.newArgument()
                            .name("lon")
                            .type(Scalars.GraphQLFloat)
                            .build())
                    .argument(GraphQLArgument.newArgument()
                            .name("limit")
                            .type(Scalars.GraphQLLong)
                            .defaultValue(Long.MAX_VALUE)
                            .build())
                    .argument(GraphQLArgument.newArgument()
                            .name("mode")
                            .type(Scalars.GraphQLString)
                            .build())
                    .dataFetcher(environment -> {
                        double lon = environment.getArgument("lon");
                        double lat = environment.getArgument("lat");
                        Coordinate pointCoordinate = new Coordinate(lon, lat);
                        return index.zonesById.values().stream()
                                .filter(zone -> {
                                            if (environment.getArgument("mode") == null) {
                                                return true;
                                            } else {
                                                for(Stop stop : zone.getStops()){
                                                    TraverseMode traverseMode = index.patternsForStop.get(stop)
                                                            .stream()
                                                            .map(pattern -> pattern.mode)
                                                            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                                                            .entrySet()
                                                            .stream()
                                                            .max(Comparator.comparing(Map.Entry::getValue))
                                                            .map(e -> e.getKey())
                                                            .orElse(null);
                                                    if(traverseMode != null){
                                                        if(traverseMode.equals(Enum.valueOf(TraverseMode.class, environment.getArgument("mode")))){
                                                            return true;
                                                        }
                                                    }
                                                }
                                            }
                                            return false;
                                        }
                                )
                                .sorted(Comparator.comparing(z -> {
                                    Coordinate zoneCoordinate = new Coordinate(z.getLon(), z.getLat());
                                    return zoneCoordinate.distance(pointCoordinate);
                                }))
                                .limit(environment.getArgument("limit"))
                                .collect(Collectors.toList());
                    })
                    .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("route")
                .description("Get a single route based on its id (format is Agency:RouteId)")
                .type(routeType)
                .argument(GraphQLArgument.newArgument()
                    .name("id")
                    .type(new GraphQLNonNull(Scalars.GraphQLString))
                    .build())
                .dataFetcher(environment -> index.routeForId
                    .get(GtfsLibrary.convertIdFromString(environment.getArgument("id"))))
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("trips")
                .description("Get all trips for the specified graph")
                .type(new GraphQLList(tripType))
                .argument(GraphQLArgument.newArgument()
                        .name("skip")
                        .type(Scalars.GraphQLLong)
                        .defaultValue((long) 0)
                        .build())
                .argument(GraphQLArgument.newArgument()
                        .name("limit")
                        .type(Scalars.GraphQLLong)
                        .defaultValue(Long.MAX_VALUE)
                        .build())
                .argument(GraphQLArgument.newArgument()
                        .name("blockId")
                        .type(Scalars.GraphQLString)
                        .build())
                .dataFetcher(environment -> new ArrayList<>(
                        index.tripForId.values()
                                .stream()
                                .filter(trip -> environment.getArgument("blockId") == null ||
                                        (trip.getBlockId()!= null && trip.getBlockId().equals(environment.getArgument("blockId"))))
                                .skip(environment.getArgument("skip"))
                                .limit(environment.getArgument("limit"))
                                .collect(Collectors.toList())
                ))
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("trip")
                .description("Get a single trip based on its id (format is Agency:TripId)")
                .type(tripType)
                .argument(GraphQLArgument.newArgument()
                    .name("id")
                    .type(new GraphQLNonNull(Scalars.GraphQLString))
                    .build())
                .dataFetcher(environment -> index.tripForId
                    .get(GtfsLibrary.convertIdFromString(environment.getArgument("id"))))
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("fuzzyTrip")
                .type(tripType)
                .argument(GraphQLArgument.newArgument()
                    .name("route")
                    .type(Scalars.GraphQLString)
                    .build())
                .argument(GraphQLArgument.newArgument()
                    .name("direction")
                    .type(Scalars.GraphQLInt)
                    .build())
                .argument(GraphQLArgument.newArgument()
                    .name("date")
                    .type(Scalars.GraphQLString)
                    .build())
                .argument(GraphQLArgument.newArgument()
                    .name("time")
                    .type(Scalars.GraphQLInt)
                    .build())
                .dataFetcher(environment -> {
                    try {
                        return fuzzyTripMatcher.getTrip(
                            index.routeForId.get(
                                GtfsLibrary.convertIdFromString(environment.getArgument("route"))),
                            environment.getArgument("direction"),
                            environment.getArgument("time"),
                            ServiceDate.parseString(environment.getArgument("date"))
                        );
                    } catch (ParseException e) {
                        return null; // Invalid date format
                    }
                })
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("patterns")
                .description("Get all patterns for the specified graph")
                .type(new GraphQLList(patternType))
                .dataFetcher(environment -> new ArrayList<>(index.patternForId.values()))
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("pattern")
                .description("Get a single pattern based on its id")
                .type(patternType)
                .argument(GraphQLArgument.newArgument()
                    .name("id")
                    .type(new GraphQLNonNull(Scalars.GraphQLString))
                    .build())
                .dataFetcher(environment -> index.patternForId.get(environment.getArgument("id")))
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("clusters")
                .description("Get all clusters for the specified graph")
                .type(new GraphQLList(clusterType))
                .argument(GraphQLArgument.newArgument()
                        .name("skip")
                        .type(Scalars.GraphQLLong)
                        .defaultValue((long) 0)
                        .build())
                .argument(GraphQLArgument.newArgument()
                        .name("limit")
                        .type(Scalars.GraphQLLong)
                        .defaultValue(Long.MAX_VALUE)
                        .build())
                .dataFetcher(environment -> new ArrayList<>(
                        index.stopClusterForId.values()
                                .stream()
                                .skip(environment.getArgument("skip"))
                                .limit(environment.getArgument("limit"))
                                .collect(Collectors.toList())
                        )
                )
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("cluster")
                .description("Get a single cluster based on its id")
                .type(clusterType)
                .argument(GraphQLArgument.newArgument()
                    .name("id")
                    .type(new GraphQLNonNull(Scalars.GraphQLString))
                    .build())
                .dataFetcher(
                    environment -> index.stopClusterForId.get(environment.getArgument("id")))
                .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                    .name("bikeRentalStations")
                    .description("Get all bike rental stations")
                    .type(new GraphQLList(bikeRentalStationType))
                    .argument(GraphQLArgument.newArgument()
                            .name("ids")
                            .description("Return bike rental stations with these ids.  \n **Note:** if an id is invalid (or the bike rental station service is unavailable) the returned list will contain `null` values.")
                            .type(new GraphQLList(Scalars.GraphQLString))
                            .build())
                    .dataFetcher(environment -> {
                        if ((environment.getArgument("ids") instanceof List)) {
                            Map<String, BikeRentalStation> rentalStations =
                                    index.graph.getService(BikeRentalStationService.class) != null
                                            ? index.graph.getService(BikeRentalStationService.class).getBikeRentalStations()
                                            .stream()
                                            .collect(Collectors.toMap(station -> station.id, station ->  station))
                                            : Collections.EMPTY_MAP;
                            return ((List<String>) environment.getArgument("ids"))
                                    .stream()
                                    .map(rentalStations::get)
                                    .collect(Collectors.toList());
                        }
                        return new ArrayList<>(index.graph.getService(BikeRentalStationService.class) != null
                                ? index.graph.getService(BikeRentalStationService.class).getBikeRentalStations()
                                : Collections.EMPTY_LIST);
                    })
                    .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                    .name("bikeRentalStation")
                    .description("Get a single bike rental station based on its ID, i.e. value of field `stationId`")
                    .type(bikeRentalStationType)
                    .argument(GraphQLArgument.newArgument()
                            .name("id")
                            .type(new GraphQLNonNull(Scalars.GraphQLString))
                            .build())
                    .dataFetcher(environment -> new ArrayList<BikeRentalStation>(
                            index.graph.getService(BikeRentalStationService.class) != null
                                    ? index.graph.getService(BikeRentalStationService.class).getBikeRentalStations()
                                    : Collections.EMPTY_LIST)
                            .stream()
                            .filter(bikeRentalStation -> bikeRentalStation.id.equals(environment.getArgument("id")))
                            .findFirst()
                            .orElse(null))
                    .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                    .name("bikeParks")
                    .description("Get all bike parks")
                    .type(new GraphQLList(bikeParkType))
                    .dataFetcher(dataFetchingEnvironment -> new ArrayList<>(
                            index.graph.getService(BikeRentalStationService.class) != null
                                    ? index.graph.getService(BikeRentalStationService.class).getBikeParks()
                                    : Collections.EMPTY_LIST))
                    .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                    .name("bikePark")
                    .description("Get a single bike park based on its ID, i.e. value of field `bikeParkId`")
                    .type(bikeParkType)
                    .argument(GraphQLArgument.newArgument()
                            .name("id")
                            .type(new GraphQLNonNull(Scalars.GraphQLString))
                            .build())
                    .dataFetcher(environment -> new ArrayList<BikePark>(
                            index.graph.getService(BikeRentalStationService.class) != null
                                    ? index.graph.getService(BikeRentalStationService.class).getBikeParks()
                                    : Collections.EMPTY_LIST)
                            .stream()
                            .filter(bikePark -> bikePark.id.equals(environment.getArgument("id")))
                            .findFirst()
                            .orElse(null))
                    .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                    .name("carParks")
                    .description("Get all car parks")
                    .type(new GraphQLList(carParkType))
                    .argument(GraphQLArgument.newArgument()
                            .name("ids")
                            .description("Return car parks with these ids.  \n **Note:** if an id is invalid (or the car park service is unavailable) the returned list will contain `null` values.")
                            .type(new GraphQLList(Scalars.GraphQLString))
                            .build())
                    .dataFetcher(environment -> {
                        if ((environment.getArgument("ids") instanceof List)) {
                            Map<String, CarPark> carParks = index.graph.getService(CarParkService.class) != null
                                    ? index.graph.getService(CarParkService.class).getCarParkById()
                                    : Collections.EMPTY_MAP;
                            return ((List<String>) environment.getArgument("ids"))
                                    .stream()
                                    .map(carParks::get)
                                    .collect(Collectors.toList());
                        }
                        return new ArrayList<>(index.graph.getService(CarParkService.class) != null
                                ? index.graph.getService(CarParkService.class).getCarParks()
                                : Collections.EMPTY_LIST);
                    })
                    .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                    .name("carPark")
                    .description("Get a single car park based on its ID, i.e. value of field `carParkId`")
                    .type(carParkType)
                    .argument(GraphQLArgument.newArgument()
                            .name("id")
                            .type(new GraphQLNonNull(Scalars.GraphQLString))
                            .build())
                    .dataFetcher(environment -> new ArrayList<CarPark>(
                            index.graph.getService(CarParkService.class) != null
                                    ? index.graph.getService(CarParkService.class).getCarParks()
                                    : Collections.EMPTY_LIST)
                            .stream()
                            .filter(carPark -> carPark.id.equals(environment.getArgument("id")))
                            .findFirst()
                            .orElse(null))
                    .build())
            .field(GraphQLFieldDefinition.newFieldDefinition()
                .name("viewer")
                .description(
                    "Needed until https://github.com/facebook/relay/issues/112 is resolved")
                .type(new GraphQLTypeReference("QueryType"))
                .dataFetcher(DataFetchingEnvironment::getParentType)
                .build())
            .field(planFieldType)
            .build();

        indexSchema = GraphQLSchema.newSchema()
            .query(queryType)
            .build();
    }

    private void createPlanType(GraphIndex index) {
        final GraphQLObjectType placeType = GraphQLObjectType.newObject()
                .name("Place")
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("name")
                        .description("For transit stops, the name of the stop. For points of interest, the name of the POI.")
                        .type(Scalars.GraphQLString)
                        .dataFetcher(environment -> ((Place) environment.getSource()).name)
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("vertexType")
                        .description("Type of vertex. (Normal, Bike sharing station, Bike P+R, Transit stop) Mostly used for better localization of bike sharing and P+R station names")
                        .type(vertexTypeEnum)
                        .dataFetcher(environment -> ((Place) environment.getSource()).vertexType)
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("lat")
                        .description("Latitude of the place (WGS 84)")
                        .type(new GraphQLNonNull(Scalars.GraphQLFloat))
                        .dataFetcher(environment -> ((Place) environment.getSource()).lat)
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("lon")
                        .description("Longitude of the place (WGS 84)")
                        .type(new GraphQLNonNull(Scalars.GraphQLFloat))
                        .dataFetcher(environment -> ((Place) environment.getSource()).lon)
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("arrivalTime")
                        .description("The time the rider will arrive at the place. Format: Unix timestamp in milliseconds.")
                        .type(new GraphQLNonNull(Scalars.GraphQLLong))
                        .dataFetcher(environment -> ((Place) environment.getSource()).arrival.getTime().getTime())
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("departureTime")
                        .description("The time the rider will depart the place. Format: Unix timestamp in milliseconds.")
                        .type(new GraphQLNonNull(Scalars.GraphQLLong))
                        .dataFetcher(environment -> ((Place) environment.getSource()).departure.getTime().getTime())
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("stop")
                        .description("The stop related to the place.")
                        .type(stopType)
                        .dataFetcher(environment -> ((Place) environment.getSource()).vertexType.equals(VertexType.TRANSIT) ? index.stopForId.get(((Place) environment.getSource()).stopId) : null)
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("stopSequence")
                        .description("For transit stops, the sequence number of the stop.")
                        .type(Scalars.GraphQLInt)
                        .dataFetcher(environment -> ((Place) environment.getSource()).vertexType.equals(VertexType.TRANSIT) ? ((Place) environment.getSource()).stopSequence : null)
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("bikeRentalStation")
                        .type(bikeRentalStationType)
                        .description("The bike rental station related to the place")
                        .dataFetcher(environment -> ((Place) environment.getSource()).vertexType.equals(VertexType.BIKESHARE) ?
                                new ArrayList<>(
                                        index.graph.getService(BikeRentalStationService.class) != null
                                                ? index.graph.getService(BikeRentalStationService.class).getBikeRentalStations()
                                                : Collections.emptyList())
                                        .stream()
                                        .filter(bikeRentalStation -> bikeRentalStation.id.equals(((Place) environment.getSource()).bikeShareId))
                                        .findFirst()
                                        .orElse(null)
                                : null)
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("bikePark")
                        .type(bikeParkType)
                        .description("The bike parking related to the place")
                        .dataFetcher(environment -> ((Place) environment.getSource()).vertexType.equals(VertexType.BIKEPARK) ?
                                new ArrayList<>(
                                        index.graph.getService(BikeRentalStationService.class) != null
                                                ? index.graph.getService(BikeRentalStationService.class).getBikeParks()
                                                : Collections.emptyList())
                                        .stream()
                                        .filter(bikePark -> bikePark.id.equals(((Place) environment.getSource()).bikeParkId))
                                        .findFirst()
                                        .orElse(null)
                                : null)
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("carPark")
                        .type(carParkType)
                        .description("The car parking related to the place")
                        .dataFetcher(environment -> ((Place) environment.getSource()).vertexType.equals(VertexType.CARPARK) ?
                                new ArrayList<>(
                                        index.graph.getService(CarParkService.class) != null
                                                ? index.graph.getService(CarParkService.class).getCarParks()
                                                : Collections.emptyList())
                                        .stream()
                                        .filter(carPark -> carPark.id.equals(((Place) environment.getSource()).carParkId))
                                        .findFirst()
                                        .orElse(null)
                                : null)
                        .build())
                .build();

        final GraphQLObjectType legType = GraphQLObjectType.newObject()
                .name("Leg")
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("startTime")
                        .description("The date and time when this leg begins. Format: Unix timestamp in milliseconds.")
                        .type(Scalars.GraphQLLong)
                        .dataFetcher(environment -> ((Leg) environment.getSource()).startTime.getTime().getTime())
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("endTime")
                        .description("The date and time when this leg ends. Format: Unix timestamp in milliseconds.")
                        .type(Scalars.GraphQLLong)
                        .dataFetcher(environment -> ((Leg) environment.getSource()).endTime.getTime().getTime())
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("departureDelay")
                        .description("For transit leg, the offset from the scheduled departure time of the boarding stop in this leg, i.e. scheduled time of departure at boarding stop = `startTime - departureDelay`")
                        .type(Scalars.GraphQLInt)
                        .dataFetcher(environment -> ((Leg) environment.getSource()).departureDelay)
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("arrivalDelay")
                        .description("For transit leg, the offset from the scheduled arrival time of the alighting stop in this leg, i.e. scheduled time of arrival at alighting stop = `endTime - arrivalDelay`")
                        .type(Scalars.GraphQLInt)
                        .dataFetcher(environment -> ((Leg) environment.getSource()).arrivalDelay)
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("mode")
                        .description("The mode (e.g. `WALK`) used when traversing this leg.")
                        .type(modeEnum)
                        .dataFetcher(environment -> Enum.valueOf(TraverseMode.class, ((Leg) environment.getSource()).mode))
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("duration")
                        .description("The leg's duration in seconds")
                        .type(Scalars.GraphQLFloat)
                        .dataFetcher(environment -> ((Leg) environment.getSource()).getDuration())
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("legGeometry")
                        .description("The leg's geometry.")
                        .type(geometryType)
                        .dataFetcher(environment -> ((Leg) environment.getSource()).legGeometry)
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("agency")
                        .description("For transit legs, the transit agency that operates the service used for this leg. For non-transit legs, `null`.")
                        .type(agencyType)
                        .dataFetcher(environment -> {
                            Leg leg = (Leg) environment.getSource();
                            if(leg.routeId != null) {
                                return index.getAgencyWithoutFeedId(leg.routeId.getAgencyId());
                            } else return null;
                        })
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("realTime")
                        .description("Whether there is real-time data about this Leg")
                        .type(Scalars.GraphQLBoolean)
                        .dataFetcher(environment -> ((Leg) environment.getSource()).realTime)
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("realtimeState")
                        .type(realtimeStateEnum)
                        .dataFetcher(environment -> ((Leg) environment.getSource()).realtimeState)
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("distance")
                        .description("The distance traveled while traversing the leg in meters.")
                        .type(Scalars.GraphQLFloat)
                        .dataFetcher(environment -> ((Leg) environment.getSource()).distance)
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("transitLeg")
                        .description("Whether this leg is a transit leg or not.")
                        .type(Scalars.GraphQLBoolean)
                        .dataFetcher(environment -> ((Leg) environment.getSource()).isTransitLeg())
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("rentedBike")
                        .description("Whether this leg is traversed with a rented bike.")
                        .type(Scalars.GraphQLBoolean)
                        .dataFetcher(environment -> ((Leg) environment.getSource()).rentedBike)
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("from")
                        .description("The Place where the leg originates.")
                        .type(new GraphQLNonNull(placeType))
                        .dataFetcher(environment -> ((Leg) environment.getSource()).from)
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("to")
                        .description("The Place where the leg ends.")
                        .type(new GraphQLNonNull(placeType))
                        .dataFetcher(environment -> ((Leg) environment.getSource()).to)
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("route")
                        .description("For transit legs, the route that is used for traversing the leg. For non-transit legs, `null`.")
                        .type(routeType)
                        .dataFetcher(environment -> index.routeForId.get(((Leg) environment.getSource()).routeId))
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("trip")
                        .description("For transit legs, the trip that is used for traversing the leg. For non-transit legs, `null`.")
                        .type(tripType)
                        .dataFetcher(environment -> index.tripForId.get(((Leg) environment.getSource()).tripId))
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("serviceDate")
                        .description("For transit legs, the service date of the trip. Format: YYYYMMDD. For non-transit legs, null.")
                        .type(Scalars.GraphQLString)
                        .dataFetcher(environment -> ((Leg) environment.getSource()).serviceDate)
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("interlineWithPreviousLeg")
                        .description("Interlines with previous leg. This is true when the same vehicle is used for the previous leg as for this leg and passenger can stay inside the vehicle.")
                        .type(Scalars.GraphQLBoolean)
                        .dataFetcher(environment -> ((Leg) environment.getSource()).interlineWithPreviousLeg)
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("intermediateStops")
                        .description("For transit legs, intermediate stops between the Place where the leg originates and the Place where the leg ends. For non-transit legs, null.")
                        .type(new GraphQLList(stopType))
                        .dataFetcher(environment -> ((Leg) environment.getSource()).stop.stream()
                                .filter(place -> place.stopId != null)
                                .map(placeWithStop -> index.stopForId.get(placeWithStop.stopId))
                                .filter(Objects::nonNull)
                                .collect(Collectors.toList()))
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("intermediatePlaces")
                        .description("For transit legs, intermediate stops between the Place where the leg originates and the Place where the leg ends. For non-transit legs, null. Returns Place type, which has fields for e.g. departure and arrival times")
                        .type(new GraphQLList(placeType))
                        .dataFetcher(environment -> ((Leg) environment.getSource()).stop)
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("steps")
                        .type(new GraphQLList(GraphQLObjectType.newObject()
                                .name("step")
                                .field(GraphQLFieldDefinition.newFieldDefinition()
                                        .name("distance")
                                        .description("The distance in meters that this step takes.")
                                        .type(Scalars.GraphQLFloat)
                                        .dataFetcher(env -> ((WalkStep) env.getSource()).distance)
                                        .build())
                                .field(GraphQLFieldDefinition.newFieldDefinition()
                                        .name("lon")
                                        .description("The longitude of the start of the step.")
                                        .type(Scalars.GraphQLFloat)
                                        .dataFetcher(env -> ((WalkStep) env.getSource()).lon)
                                        .build())
                                .field(GraphQLFieldDefinition.newFieldDefinition()
                                        .name("lat")
                                        .description("The latitude of the start of the step.")
                                        .type(Scalars.GraphQLFloat)
                                        .dataFetcher(env -> ((WalkStep) env.getSource()).lat)
                                        .build())
                                .field(GraphQLFieldDefinition.newFieldDefinition()
                                        .name("elevationProfile")
                                        .description("The elevation profile as a list of { distance, elevation } values.")
                                        .type(new GraphQLList(GraphQLObjectType.newObject()
                                                .name("elevationProfileComponent")
                                                .field(GraphQLFieldDefinition.newFieldDefinition()
                                                        .name("distance")
                                                        .description("The distance from the start of the step, in meters.")
                                                        .type(Scalars.GraphQLFloat)
                                                        .dataFetcher(env -> ((P2<Double>) env.getSource()).first)
                                                        .build())
                                                .field(GraphQLFieldDefinition.newFieldDefinition()
                                                        .name("elevation")
                                                        .description("The elevation at this distance, in meters.")
                                                        .type(Scalars.GraphQLFloat)
                                                        .dataFetcher(env -> ((P2<Double>) env.getSource()).second)
                                                        .build())
                                                .build()))
                                        .dataFetcher(env -> ((WalkStep) env.getSource()).elevation)
                                        .build())
                                .build()))
                        .dataFetcher(new PropertyDataFetcher("walkSteps"))
                        .build())
                .build();
        GraphQLObjectType fareAttributeType = GraphQLObjectType.newObject()
                .name("fareAttributes")
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("cents")
                        .type(Scalars.GraphQLInt)
                        .dataFetcher(environment -> {
                            float price = ((FareAttribute)environment.getSource()).getPrice();
                            WrappedCurrency currency = new WrappedCurrency(((FareAttribute)environment.getSource()).getCurrencyType());
                            int fractionDigits = 2;
                            if (currency != null)
                                fractionDigits = currency.getDefaultFractionDigits();
                            int cents = (int) Math.round(price * Math.pow(10, fractionDigits));
                            return cents;
                        })
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("currency")
                        .type(Scalars.GraphQLString)
                        .dataFetcher(new PropertyDataFetcher("currencyType"))
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("paymentMethod")
                        .type(Scalars.GraphQLInt)
                        .dataFetcher(new PropertyDataFetcher("paymentMethod"))
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("transfers")
                        .type(Scalars.GraphQLInt)
                        .dataFetcher(new PropertyDataFetcher("transfers"))
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("transferDuration")
                        .type(Scalars.GraphQLInt)
                        .dataFetcher(new PropertyDataFetcher("transferDuration"))
                        .build())
                .build();
        GraphQLObjectType fareRuleType = GraphQLObjectType.newObject()
                .name("fareRule")
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("originId")
                        .type(Scalars.GraphQLString)
                        .dataFetcher(new PropertyDataFetcher("originId"))
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                    .name("destinationId")
                    .type(Scalars.GraphQLString)
                    .dataFetcher(new PropertyDataFetcher("destinationId"))
                    .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("containsId")
                        .type(Scalars.GraphQLString)
                        .dataFetcher(new PropertyDataFetcher("containsId"))
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("route")
                        .type(routeType)
                        .dataFetcher(new PropertyDataFetcher("route"))
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("instrId")
                        .type(Scalars.GraphQLString)
                        .dataFetcher(new PropertyDataFetcher("routingId"))
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("attributes")
                        .type(fareAttributeType)
                        .dataFetcher(new PropertyDataFetcher("fare"))
                        .build())
                .build();

        GraphQLObjectType fareType = GraphQLObjectType.newObject()
                .name("fare")
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("type")
                        .type(Scalars.GraphQLString)
                        .dataFetcher(new PropertyDataFetcher("name"))
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("currency")
                        .description("ISO 4217 currency code")
                        .type(Scalars.GraphQLString)
                        .dataFetcher(environment -> ((Money) ((Map<String, Object>) environment.getSource()).get("fare")).getCurrency().getCurrencyCode())
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("cents")
                        .description("Fare price in cents. **Note:** this value is dependent on the currency used, as one cent is not necessarily ¹/₁₀₀ of the basic monerary unit.")
                        .type(Scalars.GraphQLInt)
                        .dataFetcher(environment -> ((Money) ((Map<String, Object>) environment.getSource()).get("fare")).getCents())
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("components")
                        .description("Components which this fare is composed of")
                        .type(new GraphQLList(GraphQLObjectType.newObject()
                                .name("fareComponent")
                                .description("Component of the fare (i.e. ticket) for a part of the itinerary")
                                .field(GraphQLFieldDefinition.newFieldDefinition()
                                        .name("fareId")
                                        .description("ID of the ticket type. Corresponds to `fareId` in **TicketType**.")
                                        .type(Scalars.GraphQLString)
                                        .dataFetcher(environment -> GtfsLibrary
                                                .convertIdToString(((FareComponent) environment.getSource()).fareId))
                                        .build())
                                .field(GraphQLFieldDefinition.newFieldDefinition()
                                        .name("currency")
                                        .description("ISO 4217 currency code")
                                        .type(Scalars.GraphQLString)
                                        .dataFetcher(environment -> ((FareComponent) environment.getSource()).price.getCurrency().getCurrencyCode())
                                        .build())
                                .field(GraphQLFieldDefinition.newFieldDefinition()
                                        .name("cents")
                                        .description("Fare price in cents. **Note:** this value is dependent on the currency used, as one cent is not necessarily ¹/₁₀₀ of the basic monerary unit.")
                                        .type(Scalars.GraphQLInt)
                                        .dataFetcher(environment -> ((FareComponent) environment.getSource()).price.getCents())
                                        .build())
                                .field(GraphQLFieldDefinition.newFieldDefinition()
                                        .name("fareRule")
                                        .description("Rule applied by this fare component")
                                        .type(fareRuleType)
                                        .dataFetcher(environment -> ((FareComponent) environment.getSource())
                                                .fareRule)
                                        .build())
                                .field(GraphQLFieldDefinition.newFieldDefinition()
                                        .name("routes")
                                        .description("List of routes which use this fare component")
                                        .type(new GraphQLList(routeType))
                                        .dataFetcher(environment -> ((FareComponent) environment.getSource())
                                                .routes
                                                .stream()
                                                .map(index.routeForId::get)
                                                .collect(Collectors.toList()))
                                        .build())
                                .build()))
                        .dataFetcher(new PropertyDataFetcher("details"))
                        .build())
                .build();

        final GraphQLObjectType itineraryType = GraphQLObjectType.newObject()
                .name("Itinerary")
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("startTime")
                        .description("Time when the user leaves from the origin. Format: Unix timestamp in milliseconds.")
                        .type(Scalars.GraphQLLong)
                        .dataFetcher(environment -> ((Itinerary) environment.getSource()).startTime.getTime().getTime())
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("endTime")
                        .description("Time when the user arrives to the destination.. Format: Unix timestamp in milliseconds.")
                        .type(Scalars.GraphQLLong)
                        .dataFetcher(environment -> ((Itinerary) environment.getSource()).endTime.getTime().getTime())
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("duration")
                        .description("Duration of the trip on this itinerary, in seconds.")
                        .type(Scalars.GraphQLLong)
                        .dataFetcher(environment -> ((Itinerary) environment.getSource()).duration)
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("waitingTime")
                        .description("How much time is spent waiting for transit to arrive, in seconds.")
                        .type(Scalars.GraphQLLong)
                        .dataFetcher(environment -> ((Itinerary) environment.getSource()).waitingTime)
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("walkTime")
                        .description("How much time is spent walking, in seconds.")
                        .type(Scalars.GraphQLLong)
                        .dataFetcher(environment -> ((Itinerary) environment.getSource()).walkTime)
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("walkDistance")
                        .description("How far the user has to walk, in meters.")
                        .type(Scalars.GraphQLFloat)
                        .dataFetcher(environment -> ((Itinerary) environment.getSource()).walkDistance)
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("legs")
                        .description("A list of Legs. Each Leg is either a walking (cycling, car) portion of the itinerary, or a transit leg on a particular vehicle. So a itinerary where the user walks to the Q train, transfers to the 6, then walks to their destination, has four legs.")
                        .type(new GraphQLNonNull(new GraphQLList(legType)))
                        .dataFetcher(environment -> ((Itinerary) environment.getSource()).legs)
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("fares")
                        .description("Information about the fares for this itinerary")
                        .type(new GraphQLList(fareType))
                        .dataFetcher(environment -> {
                            Fare fare = ((Itinerary) environment.getSource()).fare;
                            if (fare == null) {
                                return null;
                            }
                            List<Map<String, Object>> results = fare.fare.keySet().stream().map(fareKey -> {
                                Map<String, Object> result = new HashMap<>();
                                result.put("name", fareKey);
                                result.put("fare", fare.getFare(fareKey));
                                result.put("details", fare.getDetails(fareKey));
                                return result;
                            }).collect(Collectors.toList());
                            return results;
                        })
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("elevationGained")
                        .description("How much elevation is gained, in total, over the course of the itinerary, in meters.")
                        .type(Scalars.GraphQLFloat)
                        .dataFetcher(env -> ((Itinerary) env.getSource()).elevationGained)
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("elevationLost")
                        .description("How much elevation is lost, in total, over the course of the itinerary, in meters.")
                        .type(Scalars.GraphQLFloat)
                        .dataFetcher(env -> ((Itinerary) env.getSource()).elevationLost)
                        .build())
                .build();

        planType = GraphQLObjectType.newObject()
                .name("Plan")
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("date")
                        .description("The time and date of travel. Format: Unix timestamp in milliseconds.")
                        .type(Scalars.GraphQLLong)
                        .dataFetcher(environment -> ((TripPlan) ((Map) environment.getSource()).get("plan")).date.getTime())
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("from")
                        .description("The origin")
                        .type(new GraphQLNonNull(placeType))
                        .dataFetcher(environment -> ((TripPlan) ((Map) environment.getSource()).get("plan")).from)
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("to")
                        .description("The destination")
                        .type(new GraphQLNonNull(placeType))
                        .dataFetcher(environment -> ((TripPlan) ((Map) environment.getSource()).get("plan")).to)
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("itineraries")
                        .description("A list of possible itineraries")
                        .type(new GraphQLNonNull(new GraphQLList(itineraryType)))
                        .dataFetcher(environment -> ((TripPlan) ((Map) environment.getSource()).get("plan")).itinerary)
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("messageEnums")
                        .description("A list of possible error messages as enum")
                        .type(new GraphQLNonNull(new GraphQLList(Scalars.GraphQLString)))
                        .dataFetcher(environment -> ((List<Message>) ((Map) environment.getSource()).get("messages"))
                                .stream().map(Enum::name).collect(Collectors.toList()))
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("messageStrings")
                        .description("A list of possible error messages in cleartext")
                        .type(new GraphQLNonNull(new GraphQLList(Scalars.GraphQLString)))
                        .dataFetcher(environment -> ((List<Message>) ((Map) environment.getSource()).get("messages"))
                                .stream()
                                .map(message -> message.get(ResourceBundleSingleton.INSTANCE.getLocale(
                                        environment.getArgument("locale"))))
                                .collect(Collectors.toList())
                        )
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("debugOutput")
                        .description("Information about the timings for the plan generation")
                        .type(new GraphQLNonNull(GraphQLObjectType.newObject()
                                .name("debugOutput")
                                .field(GraphQLFieldDefinition.newFieldDefinition()
                                        .name("totalTime")
                                        .type(Scalars.GraphQLLong)
                                        .build())
                                .field(GraphQLFieldDefinition.newFieldDefinition()
                                        .name("pathCalculationTime")
                                        .type(Scalars.GraphQLLong)
                                        .build())
                                .field(GraphQLFieldDefinition.newFieldDefinition()
                                        .name("precalculationTime")
                                        .type(Scalars.GraphQLLong)
                                        .build())
                                .field(GraphQLFieldDefinition.newFieldDefinition()
                                        .name("renderingTime")
                                        .type(Scalars.GraphQLLong)
                                        .build())
                                .field(GraphQLFieldDefinition.newFieldDefinition()
                                        .name("timedOut")
                                        .type(Scalars.GraphQLBoolean)
                                        .build())
                                .build()))
                        .dataFetcher(environment -> (((Map) environment.getSource()).get("debugOutput")))
                        .build())
                .build();
    }
}

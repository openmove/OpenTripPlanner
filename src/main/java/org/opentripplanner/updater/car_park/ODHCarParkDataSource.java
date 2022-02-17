package org.opentripplanner.updater.car_park;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.Geometry;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.LineString;
import org.locationtech.jts.geom.LinearRing;
import org.locationtech.jts.geom.Polygon;
import org.opentripplanner.routing.car_park.CarPark;
import org.opentripplanner.routing.graph.Graph;
import org.opentripplanner.util.HttpUtils;
import org.opentripplanner.util.NonLocalizedString;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Load car parks from the ODH Park API.
 *
 * @author fede
 */
public class ODHCarParkDataSource extends GenericJsonCarParkDataSource{

    private static final Logger log = LoggerFactory.getLogger(ODHCarParkDataSource.class);

    private GeometryFactory gf = new GeometryFactory();

    public ODHCarParkDataSource() {
        super("results");
    }

    public CarPark makeCarPark(JsonNode node) {
        if (node.path("id").isMissingNode()) return null;

        CarPark station = new CarPark();
        station.id = node.path("id").asText();
        station.name = new NonLocalizedString(node.path("name").asText());
        try {
            station.geometry = parseGeometry(node.path("geometry"));
            station.y = station.geometry.getCentroid().getY();
            station.x = station.geometry.getCentroid().getX();
            station.realTimeData = node.path("realtime").asBoolean();
            station.maxCapacity = node.path("capacity").asInt();
            String stationStatus = node.path("status").asText();
            if (stationStatus.equals("INACTIVE") || stationStatus.equals("TEMPORARILY_CLOSED")) {
                return null;
            } else if (station.realTimeData) {
                station.spacesAvailable = node.path("free").asInt();
                station.spacesForecast.put(0, station.spacesAvailable);
            } else {
                station.spacesAvailable = station.maxCapacity;
                station.spacesForecast.put(0, station.spacesAvailable);
            }

            if(node.has("forecasts") && node.path("forecasts").isArray()){
                int number = 15;
                int counter = 1;
                for(JsonNode forecast : node.path("forecasts")){
                    int forecastInt = forecast.asInt();
                    station.spacesForecast.put((counter * number), forecastInt);
                }
            }

            return station;
        } catch (Exception e) {
            log.warn("Error parsing car park " + station.id, e);
            return null;
        }
    }

    public boolean update() {
        return super.update();
    }


    /**
     * Note that the JSON being passed in here is for configuration of the OTP component, it's completely separate
     * from the JSON coming in from the update source.
     */
    @Override
    public void configure (Graph graph, JsonNode jsonNode) {
        super.configure(graph, jsonNode);
    }

    // TODO: These are inlined from GeometryDeserializer
    private Geometry parseGeometry(JsonNode root) {
        String typeName = root.get("type").asText();
        if(typeName.equals("Point")) {
            return this.gf.createPoint(this.parseCoordinate(root.get("coordinates")));
        } else if(typeName.equals("MultiPoint")) {
            return this.gf.createMultiPoint(this.parseLineString(root.get("coordinates")));
        } else if(typeName.equals("LineString")) {
            return this.gf.createLineString(this.parseLineString(root.get("coordinates")));
        } else if(typeName.equals("MultiLineString")) {
            return this.gf.createMultiLineString(this.parseLineStrings(root.get("coordinates")));
        } else {
            JsonNode arrayOfPolygons;
            if(typeName.equals("Polygon")) {
                arrayOfPolygons = root.get("coordinates");
                return this.parsePolygonCoordinates(arrayOfPolygons);
            } else if(typeName.equals("MultiPolygon")) {
                arrayOfPolygons = root.get("coordinates");
                return this.gf.createMultiPolygon(this.parsePolygons(arrayOfPolygons));
            } else if(typeName.equals("GeometryCollection")) {
                return this.gf.createGeometryCollection(this.parseGeometries(root.get("geometries")));
            } else {
                throw new UnsupportedOperationException();
            }
        }
    }

    private Geometry[] parseGeometries(JsonNode arrayOfGeoms) {
        Geometry[] items = new Geometry[arrayOfGeoms.size()];

        for(int i = 0; i != arrayOfGeoms.size(); ++i) {
            items[i] = this.parseGeometry(arrayOfGeoms.get(i));
        }

        return items;
    }

    private Polygon parsePolygonCoordinates(JsonNode arrayOfRings) {
        return this.gf.createPolygon(this.parseExteriorRing(arrayOfRings), this.parseInteriorRings(arrayOfRings));
    }

    private Polygon[] parsePolygons(JsonNode arrayOfPolygons) {
        Polygon[] polygons = new Polygon[arrayOfPolygons.size()];

        for(int i = 0; i != arrayOfPolygons.size(); ++i) {
            polygons[i] = this.parsePolygonCoordinates(arrayOfPolygons.get(i));
        }

        return polygons;
    }

    private LinearRing parseExteriorRing(JsonNode arrayOfRings) {
        return this.gf.createLinearRing(this.parseLineString(arrayOfRings.get(0)));
    }

    private LinearRing[] parseInteriorRings(JsonNode arrayOfRings) {
        LinearRing[] rings = new LinearRing[arrayOfRings.size() - 1];

        for(int i = 1; i < arrayOfRings.size(); ++i) {
            rings[i - 1] = this.gf.createLinearRing(this.parseLineString(arrayOfRings.get(i)));
        }

        return rings;
    }

    private Coordinate parseCoordinate(JsonNode array) {
        return new Coordinate(array.get(0).asDouble(), array.get(1).asDouble());
    }

    private Coordinate[] parseLineString(JsonNode array) {
        Coordinate[] points = new Coordinate[array.size()];

        for(int i = 0; i != array.size(); ++i) {
            points[i] = this.parseCoordinate(array.get(i));
        }

        return points;
    }

    private LineString[] parseLineStrings(JsonNode array) {
        LineString[] strings = new LineString[array.size()];

        for(int i = 0; i != array.size(); ++i) {
            strings[i] = this.gf.createLineString(this.parseLineString(array.get(i)));
        }

        return strings;
    }
}


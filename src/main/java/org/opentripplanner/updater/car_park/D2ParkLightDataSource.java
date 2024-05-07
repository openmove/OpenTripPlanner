package org.opentripplanner.updater.car_park;

import com.fasterxml.jackson.databind.JsonNode;
import org.geotools.geometry.jts.JTS;
import org.geotools.referencing.CRS;
import org.locationtech.jts.geom.*;
import org.opengis.referencing.crs.CoordinateReferenceSystem;
import org.opengis.referencing.operation.MathTransform;
import org.opentripplanner.routing.car_park.CarPark;
import org.opentripplanner.routing.graph.Graph;
import org.opentripplanner.util.NonLocalizedString;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Load car parks from the ODH Park API.
 *
 * @author fede
 */
public class D2ParkLightDataSource extends GenericJsonCarParkDataSource{

    private static final Logger log = LoggerFactory.getLogger(ODHCarParkDataSource.class);

    private GeometryFactory gf = new GeometryFactory();

    public D2ParkLightDataSource() {
        super("parkingPublicationLight/parkingSite");
    }

    public CarPark makeCarPark(JsonNode node) {
        if (node.path("_id").isMissingNode()) return null;

        CarPark station = new CarPark();
        station.id = node.path("_id").asText();
        station.name = new NonLocalizedString(node.path("name").asText());
        try {
            JsonNode location = node.path("locationAndDimension");



            String posList = location.path("gmlLinearRing").path("posList").asText();

            String[] parts = posList.split(" ");
            Coordinate[] coordinates = new Coordinate[parts.length / 2];
            for (int i = 0, j = 0; i < parts.length; i += 2) {
                double lat = Double.parseDouble(parts[i]);
                double lon = Double.parseDouble(parts[i + 1]);
                coordinates[j++] = new Coordinate(lon, lat);
            }
            GeometryFactory factory = new GeometryFactory();
            LinearRing ring = factory.createLinearRing(coordinates);

            station.geometry = factory.createPolygon(ring, null);
            station.y = location.path("coordinatesForDisplay").path("latitude").asDouble();
            station.x = location.path("coordinatesForDisplay").path("longitude").asDouble();
            //station.realTimeData = node.path("realtime").asBoolean();
            station.maxCapacity = node.path("numberOfSpaces").asInt();
            boolean isOpenNow = node.path("isOpenNow").asBoolean();
            if (!isOpenNow) {
                return null;
            }
            else {
                station.spacesAvailable = station.maxCapacity;
                station.spacesForecast.put(0, station.spacesAvailable);
            }
            if(node.path("availableSpaces").isNull()) {
            	 station.spacesAvailable = station.maxCapacity;
            	 station.spacesForecast.put(0, station.spacesAvailable);
            }else {
            	 station.spacesAvailable = node.path("availableSpaces").asInt();
            	 station.spacesForecast.put(0, station.spacesAvailable);
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
            Geometry sourceGeometry = this.gf.createPoint(this.parseCoordinate(root.get("coordinates")));
        	
            try {
            	CoordinateReferenceSystem sourceCRS = CRS.decode("EPSG:4326");
            	CoordinateReferenceSystem targetCRS = CRS.decode("EPSG:3857");
            	MathTransform transform = CRS.findMathTransform(sourceCRS, targetCRS);
            	MathTransform transform2 = CRS.findMathTransform(targetCRS, sourceCRS);
            	Geometry targetGeometry = JTS.transform( sourceGeometry, transform);
            	Geometry bufferedTargetGeometry = targetGeometry.buffer(200);
				return JTS.transform( bufferedTargetGeometry, transform2);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            return sourceGeometry;
        } else if(typeName.equals("MultiPoint")) {
            return this.gf.createMultiPointFromCoords(this.parseLineString(root.get("coordinates")));
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


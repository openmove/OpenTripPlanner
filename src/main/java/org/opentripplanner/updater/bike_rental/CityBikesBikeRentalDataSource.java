package org.opentripplanner.updater.bike_rental;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.opentripplanner.updater.JsonConfigurable;
import org.opentripplanner.routing.bike_rental.BikeRentalStation;
import org.opentripplanner.routing.graph.Graph;
import org.opentripplanner.updater.RentalUpdaterError;
import org.opentripplanner.util.HttpUtils;
import org.opentripplanner.util.NonLocalizedString;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;

// TODO This class could probably inherit from GenericJSONBikeRentalDataSource
public class CityBikesBikeRentalDataSource implements BikeRentalDataSource, JsonConfigurable {
    private static final Logger log = LoggerFactory.getLogger(CityBikesBikeRentalDataSource.class);

    private String url;

    // any errors that occurred in the last update
    private List<RentalUpdaterError> errors;

    ArrayList<BikeRentalStation> stations = new ArrayList<BikeRentalStation>();

    public CityBikesBikeRentalDataSource() {

    }

    /**
     * Adds an error message to the list of errors and also logs the error message.
     */
    private void addError(String message) {
        errors.add(new RentalUpdaterError(RentalUpdaterError.Severity.ALL_STATIONS, message));
        log.error(message);
    }

    @Override
    public boolean update() {
        errors = new LinkedList<>();
        InputStream stream = null;
        try {
            stream = HttpUtils.getData(url);
            if (stream == null) {
                addError("Failed to get data from url " + url);
                return false;
            }

            Reader reader = new BufferedReader(new InputStreamReader(stream,
                    Charset.forName("UTF-8")));
            StringBuilder builder = new StringBuilder();
            char[] buffer = new char[4096];
            int charactersRead;
            while ((charactersRead = reader.read(buffer, 0, buffer.length)) > 0) {
                builder.append(buffer, 0, charactersRead);
            }
            String data = builder.toString();

            parseJson(data);
        } catch (IOException e) {
            addError("Error reading bike rental feed from " + url);
            return false;
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (SAXException e) {
            addError("Error parsing bike rental feed from " + url + "(bad XML of some sort)");
            return false;
        } finally {
            if (stream != null) {
                try {
                    stream.close();
                } catch (IOException e) {
                    log.warn("Error encountered while trying to close input stream", e);
                    e.printStackTrace();
                }
            }
        }
        return true;
    }

    private void parseJson(String data) throws ParserConfigurationException, SAXException,
            IOException {
        ArrayList<BikeRentalStation> out = new ArrayList<BikeRentalStation>();

        // Jackson ObjectMapper to read in JSON
        // TODO: test against real data
        ObjectMapper mapper = new ObjectMapper();
        for (JsonNode stationNode : mapper.readTree(data)) {
            BikeRentalStation brStation = new BikeRentalStation();
            // We need string IDs but they are in JSON as numbers. Avoid null from textValue(). See pull req #1450.
            brStation.id = String.valueOf(stationNode.get("id").intValue());
            brStation.x = stationNode.get("lng").doubleValue() / 1000000.0;
            brStation.y = stationNode.get("lat").doubleValue() / 1000000.0;
            brStation.name = new NonLocalizedString(stationNode.get("name").textValue());
            brStation.bikesAvailable = stationNode.get("bikes").intValue();
            brStation.spacesAvailable = stationNode.get("free").intValue();
            if (brStation != null && brStation.id != null) {
                out.add(brStation);
            }
        }
        synchronized (this) {
            stations = out;
        }
    }

    @Override
    public List<RentalUpdaterError> getErrors() {
        return errors;
    }

    @Override
    public synchronized List<BikeRentalStation> getStations() {
        return stations;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return getClass().getName() + "(" + url + ")";
    }
    
    @Override
    public void configure(Graph graph, JsonNode config) {
        String url = config.path("url").asText();
        if (url == null) {
            throw new IllegalArgumentException("Missing mandatory 'url' configuration.");
        }
        setUrl(url);
    }

}

package org.opentripplanner.updater.bike_rental;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.opentripplanner.updater.JsonConfigurable;
import org.opentripplanner.routing.bike_rental.BikeRentalStation;
import org.opentripplanner.routing.graph.Graph;
import org.opentripplanner.updater.RentalUpdaterError;
import org.opentripplanner.util.HttpUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;


/**
 * Fetch Bike Rental JSON feeds and pass each record on to the specific rental subclass
 *
 * @see BikeRentalDataSource
 */
public abstract class GenericJsonBikeRentalDataSource implements BikeRentalDataSource, JsonConfigurable {

    private static final Logger log = LoggerFactory.getLogger(GenericJsonBikeRentalDataSource.class);

    private String url;
    private String headerName;
    private String headerValue;

    private String jsonParsePath;

    /**
     * The severity level to assign to any error that occurs when fetching from this particular data source.
     */
    private final RentalUpdaterError.Severity severityFailureType;

    // any errors that occured in the last update
    protected List<RentalUpdaterError> errors;

    List<BikeRentalStation> stations = new ArrayList<BikeRentalStation>();

    /**
     * Construct superclass
     *
     * @param severityFailureType The severity level given to an error with when fetching from this particular data
     *                            source. This can be used to define different error types when fetching from
     *                            stations of floating vehicles for example.
     * @param jsonPath JSON path to get from enclosing elements to nested rental list.
     *        Separate path levels with '/' For example "d/list"
     *
     */
    public GenericJsonBikeRentalDataSource(RentalUpdaterError.Severity severityFailureType, String jsonPath) {
        this(severityFailureType, jsonPath, "Default", null);
    }

    /**
     *
     * @param severityFailureType The severity level given to an error with when fetching from this particular data
     *                            source. This can be used to define different error types when fetching from
     *                            stations of floating vehicles for example.
     * @param jsonPath path to get from enclosing elements to nested rental list.
     *        Separate path levels with '/' For example "d/list"
     * @param headerName header name
     * @param headerValue header value
     */
    public GenericJsonBikeRentalDataSource(
        RentalUpdaterError.Severity severityFailureType,
        String jsonPath,
        String headerName,
        String headerValue
    ) {
        this.severityFailureType = severityFailureType;
        jsonParsePath = jsonPath;
        this.headerName = headerName;
        this.headerValue = headerValue;
    }

    /**
     * Adds an error message to the list of errors and also logs the error message.
     */
    private void addError(String message) {
        addError(message, null);
    }

    /**
     * Adds an error message to the list of errors and also logs the error message (plus Exception if provided).
     */
    private void addError(String message, Exception e) {
        message = String.format("%s (url: %s)", message, url);
        errors.add(new RentalUpdaterError(severityFailureType, message));
        log.error(String.format("[severity: %s] %s", severityFailureType, message), e);
    }

    @Override
    public boolean update() {
        errors = new LinkedList<>();

        InputStream data = null;
        try {
            if (url == null) {
                // If the file is not expected to exist, return false without an error.
                return false;
            }
            URL url2 = new URL(url);
        	
            String proto = url2.getProtocol();
            if (proto.equals("http") || proto.equals("https")) {
            	data = HttpUtils.getData(url, headerName, headerValue);
            } else {
                // Local file probably, try standard java
                data = url2.openStream();
            }
            // TODO handle optional GBFS files, where it's not warning-worthy that they don't exist.
            if (data == null) {
                addError("Failed to get data from url " + url);
                return false;
            }
            parseJSON(data);
        } catch (IllegalArgumentException e) {
            addError("Error parsing bike rental feed from " + url, e);
            return false;
        } catch (JsonProcessingException e) {
            addError("Error parsing bike rental feed from " + url + "(bad JSON of some sort)", e);
            return false;
        } catch (IOException e) {
            addError("Error reading bike rental feed from " + url, e);
            return false;
        } finally {
            try {
                if (data != null) {
                    data.close();
                }
            } catch (IOException e) {
                log.warn("An error occurred while closing data stream!", e);
            }
        }
        return true;
    }

    private void parseJSON(InputStream dataStream) throws IllegalArgumentException, IOException {

        ArrayList<BikeRentalStation> out = new ArrayList<>();

        String rentalString = convertStreamToString(dataStream);

        ObjectMapper mapper = new ObjectMapper();
        JsonNode rootNode = mapper.readTree(rentalString);

        Integer feedUpdateEpochSeconds = rootNode.path("last_updated").asInt();

        if (!jsonParsePath.equals("")) {
            String delimiter = "/";
            String[] parseElement = jsonParsePath.split(delimiter);
            for(int i =0; i < parseElement.length ; i++) {
                rootNode = rootNode.path(parseElement[i]);
            }

            if (rootNode.isMissingNode()) {
                throw new IllegalArgumentException("Could not find jSON elements " + jsonParsePath);
            }
        }

        for (int i = 0; i < rootNode.size(); i++) {
            // TODO can we use foreach? for (JsonNode node : rootNode) ...
            JsonNode node = rootNode.get(i);
            if (node == null) {
                continue;
            }
            BikeRentalStation brstation = makeStation(node, feedUpdateEpochSeconds);
            if (brstation != null)
                out.add(brstation);
        }
        synchronized(this) {
            stations = out;
        }
    }

    private String convertStreamToString(java.io.InputStream is) {
        java.util.Scanner scanner = null;
        String result="";
        try {
           
            scanner = new java.util.Scanner(is).useDelimiter("\\A");
            result = scanner.hasNext() ? scanner.next() : "";
            scanner.close();
        } finally {
           if(scanner!=null)
               scanner.close();
        }
        return result;
        
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

    public abstract BikeRentalStation makeStation(JsonNode rentalStationNode, Integer feedUpdateEpochSeconds);

    @Override
    public String toString() {
        return getClass().getName() + "(" + url + ")";
    }

    /**
     * Note that the JSON being passed in here is for configuration of the OTP component, it's completely separate
     * from the JSON coming in from the update source.
     */
    @Override
    public void configure (Graph graph, JsonNode jsonNode) {
        String url = jsonNode.path("url").asText(); // path() returns MissingNode not null.
        if (url == null) {
            throw new IllegalArgumentException("Missing mandatory 'url' configuration.");
        }
        this.url = url;
    }
}

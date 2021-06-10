package org.opentripplanner.updater.bike_rental;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import org.opentripplanner.routing.bike_rental.BikeRentalStation;
import org.opentripplanner.routing.graph.Graph;
import org.opentripplanner.updater.JsonConfigurable;
import org.opentripplanner.updater.RentalUpdaterError;
import org.opentripplanner.util.xml.XmlDataListDownloader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class GenericXmlBikeRentalDataSource implements BikeRentalDataSource, JsonConfigurable {

    private static final Logger LOG = LoggerFactory.getLogger(GenericXmlBikeRentalDataSource.class);

    private String url;

    // any errors that occured in the last update
    private List<RentalUpdaterError> errors;

    List<BikeRentalStation> stations = new ArrayList<BikeRentalStation>();

    private XmlDataListDownloader<BikeRentalStation> xmlDownloader;


    public GenericXmlBikeRentalDataSource(String path) {
        xmlDownloader = new XmlDataListDownloader<BikeRentalStation>();
        xmlDownloader.setPath(path);
        xmlDownloader.setDataFactory(new XmlDataListDownloader.XmlDataFactory<BikeRentalStation>() {
            @Override
            public BikeRentalStation build(Map<String, String> attributes) {
                /* TODO Do not make this class abstract, but instead make the client
                 * provide itself the factory?
                 */
                return makeStation(attributes);
            }
        });
    }

    /**
     * Adds an error message to the list of errors and also logs the error message.
     */
    private void addError(String message) {
        errors.add(new RentalUpdaterError(RentalUpdaterError.Severity.ALL_STATIONS, message));
        LOG.error(message);
    }

    @Override
    public boolean update() {
        errors = new LinkedList<>();
        List<BikeRentalStation> newStations = xmlDownloader.download(url, false);
        if (newStations != null) {
            synchronized(this) {
                stations = newStations;
            }
            return true;
        }
        addError("Can't update bike rental station list from: " + url + ", keeping current list.");
        return false;
    }

    @Override
    public List<RentalUpdaterError> getErrors() {
        return errors;
    }

    @Override
    public synchronized List<BikeRentalStation> getStations() {
        return stations;
    }

    public void setReadAttributes(boolean readAttributes) {
        // if readAttributes is true, read XML attributes of selected elements, instead of children
        xmlDownloader.setReadAttributes(readAttributes);
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public abstract BikeRentalStation makeStation(Map<String, String> attributes);

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

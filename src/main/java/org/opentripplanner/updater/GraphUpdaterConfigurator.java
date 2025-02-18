package org.opentripplanner.updater;

import com.fasterxml.jackson.databind.JsonNode;
import org.opentripplanner.routing.graph.Graph;
import org.opentripplanner.standalone.ErrorUtils;
import org.opentripplanner.updater.alerts.GtfsRealtimeAlertsUpdater;
import org.opentripplanner.updater.bike_park.BikeParkUpdater;
import org.opentripplanner.updater.bike_rental.BikeRentalUpdater;
import org.opentripplanner.updater.car_park.CarParkUpdater;
import org.opentripplanner.updater.car_rental.CarRentalUpdater;
import org.opentripplanner.updater.example.ExampleGraphUpdater;
import org.opentripplanner.updater.example.ExamplePollingGraphUpdater;
import org.opentripplanner.updater.vehicle_positions.PollingVehiclePositionUpdater;
import org.opentripplanner.updater.vehicle_rental.VehicleRentalUpdater;
import org.opentripplanner.updater.stoptime.PollingStoptimeUpdater;
import org.opentripplanner.updater.stoptime.WebsocketGtfsRealtimeUpdater;
import org.opentripplanner.updater.street_notes.WinkkiPollingGraphUpdater;
import org.opentripplanner.updater.transportation_network_company.TransportationNetworkCompanyUpdater;
import org.opentripplanner.updater.trip_capacity.PollingTripCapacityUpdater;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Upon loading a Graph, configure/decorate it using a JSON tree from Jackson. This mainly involves starting
 * graph updater processes (GTFS-RT, bike rental, etc.), hence the class name.
 * 
 * When a Graph is loaded, one should call setupGraph() with the JSON tree containing configuration for the Graph.
 * That method creates "graph updaters" according to the given JSON, which should contain an array or object field
 * called "updaters". Each child element represents one updater.
 *
 * When a graph is unloaded, one must ensure the shutdownGraph() method is called to clean up all resources that may
 * have been used.
 *
 * If an embedded configuration is present in the graph, we also try to use it. In case of conflicts
 * between two child nodes in both configs (two childs node with the same name) the dynamic (ie
 * provided) configuration takes complete precedence over the embedded one: childrens properties are
 * *not* merged.
 */
public abstract class GraphUpdaterConfigurator {

    private static Logger LOG = LoggerFactory.getLogger(GraphUpdaterConfigurator.class);

    public static void setupGraph(Graph graph, JsonNode mainConfig) {

        // Look for embedded config if it exists
        // TODO figure out how & when we will use embedded config in absence of main config.
        JsonNode embeddedConfig = null; // graph.routerConfig;
        LOG.info("Using configurations: " + (mainConfig == null ? "" : "[main]") + " "
                + (embeddedConfig == null ? "" : "[embedded]"));

        // Create a updater manager for this graph, and create updaters according to the JSON configuration.
        GraphUpdaterManager updaterManager = createManagerFromConfig(graph, mainConfig);

        // Stop the updater manager if it contains nothing
        if (updaterManager.size() == 0) {
            updaterManager.stop();
        }
        // Otherwise add it to the graph
        else {
            graph.updaterManager = updaterManager;
        }
    }

    /**
     * @param graph the graph that will be modified by these updaters
     * @return a GraphUpdaterManager containing all the created updaters
     */
    private static GraphUpdaterManager createManagerFromConfig(Graph graph, JsonNode config) {

        GraphUpdaterManager updaterManager = new GraphUpdaterManager(graph);
        for (JsonNode configItem : config.path("updaters")) {

            // For each sub-node, determine which kind of updater is being created.
            String type = configItem.path("type").asText();
            GraphUpdater updater = null;
            if (type != null) {
                if (type.equals("bike-rental")) {
                    updater = new BikeRentalUpdater();
                }
                else if (type.equals("bike-park")) {
                    updater = new BikeParkUpdater();
                }
                else if (type.equals("stop-time-updater")) {
                    updater = new PollingStoptimeUpdater();
                }
                else if (type.equals("websocket-gtfs-rt-updater")) {
                    updater = new WebsocketGtfsRealtimeUpdater();
                }
                else if (type.equals("real-time-alerts")) {
                    updater = new GtfsRealtimeAlertsUpdater();
                }
                else if (type.equals("example-updater")) {
                    updater = new ExampleGraphUpdater();
                }
                else if (type.equals("example-polling-updater")) {
                    updater = new ExamplePollingGraphUpdater();
                }
                else if (type.equals("winkki-polling-updater")) {
                    updater = new WinkkiPollingGraphUpdater();
                }
                else if (type.equals("transportation-network-company-updater")) {
                    updater = new TransportationNetworkCompanyUpdater();
                }
                else if (type.equals("car-rental-updater")) {
                    updater = new CarRentalUpdater();
                }
                else if (type.equals("vehicle-rental-updater")) {
                    updater = new VehicleRentalUpdater();
                }
                else if (type.equals("car-park")) {
                    updater = new CarParkUpdater();
                }
                else if (type.equals("vehicle-position-updater")) {
                    updater = new PollingVehiclePositionUpdater();
                }
                else if (type.equals("trip-capacity-updater")) {
                    updater = new PollingTripCapacityUpdater();
                }
            }

            if (updater == null) {
                LOG.error("Unknown updater type: " + type);
            } else {
                try {
                    // Inform the GraphUpdater of its parent Manager so the updater can enqueue write operations.
                    // Perhaps this should be done in "addUpdater" below, to ensure the link is reciprocal.
                    updater.setGraphUpdaterManager(updaterManager);
                    // All GraphUpdaters are JsonConfigurable - send them their config information.
                    updater.configure(graph, configItem);
                    // Perform any initial setup in a single-threaded manner to avoid concurrent reads/writes.
                    updater.setup(graph);
                    // Add graph updater to manager.
                    updaterManager.addUpdater(updater);
                    LOG.info("Configured GraphUpdater: {}", updater);
                } catch (Exception e) {
                    ErrorUtils.reportErrorToBugsnag(
                        "Failed to configure graph updater:" + configItem.asText(),
                        e
                    );
                }
            }
        }
        // Now that all the updaters are configured, kick them all off in their own threads.
        updaterManager.startUpdaters();
        return updaterManager;
    }

    public static void shutdownGraph(Graph graph) {
        GraphUpdaterManager updaterManager = graph.updaterManager;
        if (updaterManager != null) {
            LOG.info("Stopping updater manager with " + updaterManager.size() + " updaters.");
            updaterManager.stop();
        }
    }
}

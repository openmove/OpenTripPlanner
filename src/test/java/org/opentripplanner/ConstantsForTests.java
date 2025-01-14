package org.opentripplanner;

import java.io.File;
import java.io.IOException;
import java.net.URLDecoder;

import org.opentripplanner.graph_builder.module.GraphBuilderModuleSummary;
import org.opentripplanner.graph_builder.services.DefaultStreetEdgeFactory;
import org.opentripplanner.model.calendar.CalendarServiceData;
import org.opentripplanner.graph_builder.module.DirectTransferGenerator;
import org.opentripplanner.graph_builder.module.StreetLinkerModule;
import org.opentripplanner.graph_builder.module.osm.DefaultWayPropertySetSource;
import org.opentripplanner.graph_builder.module.osm.OpenStreetMapModule;
import org.opentripplanner.gtfs.GtfsContext;
import org.opentripplanner.gtfs.GtfsLibrary;
import org.opentripplanner.openstreetmap.impl.AnyFileBasedOpenStreetMapProviderImpl;
import org.opentripplanner.routing.edgetype.factory.PatternHopFactory;
import org.opentripplanner.routing.edgetype.factory.TransferGraphLinker;
import org.opentripplanner.routing.graph.Graph;

import static org.opentripplanner.calendar.impl.CalendarServiceDataFactoryImpl.createCalendarServiceData;

public class ConstantsForTests {

    public static final String CALTRAIN_GTFS = "src/test/resources/caltrain_gtfs.zip";

    public static final String PORTLAND_GTFS = "src/test/resources/google_transit.zip";

    public static final String KCM_GTFS = "src/test/resources/kcm_gtfs.zip";

    public static final String FAKE_GTFS = "src/test/resources/testagency.zip";

    public static final String FARE_COMPONENT_GTFS = "src/test/resources/farecomponent_gtfs.zip";

    public static final String VERMONT_GTFS = "/vermont/ruralcommunity-flex-vt-us.zip";

    public static final String VERMONT_OSM = "/vermont/vermont-rct.osm.pbf";

    // contains central Atlanta with two streets being patched to fake them to be wheelchair-inaccessible
    // - https://www.openstreetmap.org/way/9254841
    // - https://www.openstreetmap.org/way/849819590
    public static final String CENTRAL_ATLANTA_OSM = "/atlanta/central-atlanta-filtered.osm.pbf";
    // contains the MARTA Blue and Green lines and a single trip of bus 21
    // the Green line and the bus are set to be wheelchair accessible but the Blue line is not
    // only Georgia State and Ashby Station are wheelchair accessible
    public static final String ATLANTA_BLUE_GREEN_LINE = "/atlanta/atlanta-blue-green-line.gtfs.zip";

    private static ConstantsForTests instance = null;

    private Graph portlandGraph = null;

    private GtfsContext portlandContext = null;

    private Graph vermontGraph = null;

    private ConstantsForTests() {

    }

    public static ConstantsForTests getInstance() {
        if (instance == null) {
            instance = new ConstantsForTests();
        }
        return instance;
    }

    public GtfsContext getPortlandContext() {
        if (portlandGraph == null) {
            setupPortland();
        }
        return portlandContext;
    }

    public Graph getPortlandGraph() {
        if (portlandGraph == null) {
            setupPortland();
        }
        return portlandGraph;
    }

    private void setupPortland() {
        try {
            portlandContext = GtfsLibrary.readGtfs(new File(ConstantsForTests.PORTLAND_GTFS));
            portlandGraph = new Graph();
            PatternHopFactory factory = new PatternHopFactory(portlandContext);
            factory.run(portlandGraph);
            TransferGraphLinker linker = new TransferGraphLinker(portlandGraph);
            linker.run();
            // TODO: eliminate GTFSContext
            // this is now making a duplicate calendarservicedata but it's oh so practical
            portlandGraph.putService(
                    CalendarServiceData.class,
                    createCalendarServiceData(portlandContext.getOtpTransitService())
            );
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

        StreetLinkerModule ttsnm = new StreetLinkerModule();
        ttsnm.buildGraph(portlandGraph, new GraphBuilderModuleSummary(ttsnm));
    }

    public Graph getVermontGraph() {
        if (vermontGraph == null) {
            vermontGraph = getGraph(VERMONT_OSM, VERMONT_GTFS);
            vermontGraph.setUseFlexService(true);
        }
        return vermontGraph;
    }

    public static Graph getGraph(String osmFile, String gtfsFile) {
        try {
            Graph g = new Graph();
            OpenStreetMapModule loader = new OpenStreetMapModule();
            loader.setDefaultWayPropertySetSource(new DefaultWayPropertySetSource());
            DefaultStreetEdgeFactory streetEdgeFactory = new DefaultStreetEdgeFactory();
            streetEdgeFactory.useElevationData = true;
            loader.edgeFactory = streetEdgeFactory;
            AnyFileBasedOpenStreetMapProviderImpl provider = new AnyFileBasedOpenStreetMapProviderImpl();

            File file = new File(
                    URLDecoder.decode(ConstantsForTests.class.getResource(osmFile).getFile(),
                            "UTF-8"));

            provider.setPath(file);
            loader.setProvider(provider);

            loader.buildGraph(g, new GraphBuilderModuleSummary(loader));

            GtfsContext ctx = GtfsLibrary.readGtfs(new File(
                    URLDecoder.decode(ConstantsForTests.class.getResource(gtfsFile).getFile(),
                            "UTF-8")));
            PatternHopFactory factory = new PatternHopFactory(ctx);
            factory.run(g);

            CalendarServiceData csd =  createCalendarServiceData(ctx.getOtpTransitService());
            g.putService(CalendarServiceData.class, csd);
            g.updateTransitFeedValidity(csd);
            g.hasTransit = true;

            StreetLinkerModule slm = new StreetLinkerModule();
            slm.buildGraph(g, new GraphBuilderModuleSummary(slm));

            DirectTransferGenerator dtg = new DirectTransferGenerator(2000, true);
            dtg.buildGraph(g, new GraphBuilderModuleSummary(dtg));

            g.index(true);

            return g;
        } catch(Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public static Graph buildGraph(String path) {
        GtfsContext context;
        try {
            context = GtfsLibrary.readGtfs(new File(path));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        Graph graph = new Graph();
        PatternHopFactory factory = new PatternHopFactory(context);
        factory.run(graph);
        graph.putService(
                CalendarServiceData.class,
                createCalendarServiceData(context.getOtpTransitService())
        );
        return graph;
    }

}

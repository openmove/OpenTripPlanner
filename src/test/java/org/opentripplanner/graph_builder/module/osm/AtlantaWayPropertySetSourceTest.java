package org.opentripplanner.graph_builder.module.osm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.opentripplanner.openstreetmap.model.OSMWithTags;
import org.opentripplanner.routing.edgetype.StreetTraversalPermission;

import java.util.stream.Stream;

class AtlantaWayPropertySetSourceTest {

    static WayPropertySet wps = new WayPropertySet();

    static {
        AtlantaWayPropertySetSource source = new AtlantaWayPropertySetSource();
        wps.index();
        source.populateProperties(wps);
    }

    @ParameterizedTest
    @MethodSource("createTrunkRoadPermissionsTestCases")
    void testTrunkRoadPermissions(OSMWithTags way, String description) {
        assertEquals(StreetTraversalPermission.ALL, wps.getDataForWay(way).getPermission(), description);
    }

    private static Stream<Arguments> createTrunkRoadPermissionsTestCases() {
        // Most OSM trunk roads in Atlanta are (large) city roads that are permitted for all modes.
        // (The default WayPropertySetSource implementation is car-only.)
        // TODO: Handle exceptions such as:
        //  - Northside Drive between Marietta Street and Tech Parkway (northbound)
        //    (https://www.openstreetmap.org/way/96395009, no sidewalk, but possible to bike)
        //  - Portions of Freedom Parkway that are freeway/motorway-like (https://www.openstreetmap.org/way/88171817)

        // Peachtree Rd in Atlanta has sidewalks, and bikes are allowed.
        // https://www.openstreetmap.org/way/144429544
        OSMWithTags peachtreeRd = new OSMWithTags();
        peachtreeRd.addTag("highway", "trunk");
        peachtreeRd.addTag("lanes", "6");
        peachtreeRd.addTag("name", "Peachtree Road");
        peachtreeRd.addTag("ref", "US 19;GA 9");
        peachtreeRd.addTag("surface", "asphalt");
        peachtreeRd.addTag("tiger:county", "Fulton, GA");

        // "Outer" ramps from DeKalb Ave onto Moreland Ave in Atlanta have sidewalks, and bikes are allowed.
        // https://www.openstreetmap.org/way/9164434
        OSMWithTags morelandRamp = new OSMWithTags();
        morelandRamp.addTag("highway", "trunk_link");
        morelandRamp.addTag("lanes", "1");
        morelandRamp.addTag("oneway", "yes");
        morelandRamp.addTag("tiger:cfcc", "A63");
        morelandRamp.addTag("tiger:county", "DeKalb, GA");
        morelandRamp.addTag("tiger:reviewed", "no");

        // For sanity check, secondary roads (e.g. 10th Street) should remain allowed for all modes.
        // https://www.openstreetmap.org/way/505912700
        OSMWithTags tenthSt = new OSMWithTags();
        tenthSt.addTag("highway", "secondary");
        tenthSt.addTag("lanes", "4");
        tenthSt.addTag("maxspeed", "30 mph");
        tenthSt.addTag("name", "10th Street Northeast");
        tenthSt.addTag("oneway", "no");
        tenthSt.addTag("source:maxspeed", "sign");
        tenthSt.addTag("surface", "asphalt");
        tenthSt.addTag("tiger:cfcc", "A41");
        tenthSt.addTag("tiger:county", "Fulton, GA");
        tenthSt.addTag("tiger:reviewed", "no");
        // Some other params omitted.


        return Stream.of(
            Arguments.of(peachtreeRd, "Peachtree Road (trunk)"),
            Arguments.of(morelandRamp, "Moreland Avenue Ramp (trunk_link)"),
            Arguments.of(tenthSt, "10th Street NE (secondary)")
        );
    }
}

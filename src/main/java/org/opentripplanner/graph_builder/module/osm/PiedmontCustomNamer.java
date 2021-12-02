package org.opentripplanner.graph_builder.module.osm;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.collect.Iterables;
import org.opentripplanner.graph_builder.services.osm.CustomNamer;
import org.opentripplanner.openstreetmap.model.OSMWithTags;
import org.opentripplanner.routing.edgetype.StreetEdge;
import org.opentripplanner.routing.graph.Graph;
import org.opentripplanner.routing.graph.Vertex;
import org.opentripplanner.util.NonLocalizedString;

import java.util.HashSet;

/**
 * These rules were developed in consultation with Grant Humphries, PJ Houser, and Mele Sax-Barnett.
 * They describe which sidewalks and paths in the Portland area should be specially designated in
 * the narrative.
 * 
 * @author novalis
 * 
 */
public class PiedmontCustomNamer implements CustomNamer {

    @Override
    public String name(OSMWithTags way, String defaultName) {
        if (!way.hasTag("name")) {
            return defaultName;
        }
        if (way.hasTag("ref") && way.isTag("highway", "motorway")) {
            if(way.hasTag("name")){
                return way.getTag("ref") + " (" + (way.getTag("name")) + ")";
            }
            return way.getTag("ref");
        }

        return defaultName;
    }

    @Override
    public void nameWithEdge(OSMWithTags way, StreetEdge edge) {

    }

    @Override
    public void postprocess(Graph graph) {

    }

    @Override
    public void configure(JsonNode config) {
        // No configuration needed.
    }



}

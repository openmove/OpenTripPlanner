package org.opentripplanner.graph_builder.module.osm;

import org.opentripplanner.routing.edgetype.StreetTraversalPermission;

/**
 * OSM way properties for the Campiglio, Trentino, ITALY area.
 * The differences compared to the default property set are:
 * 1. track paths are not allowed to CAR if not explicitly.
 *
 * @author zabuTNT
 * @see WayPropertySetSource
 * @see DefaultWayPropertySetSource
 */

public class CampiglioWayPropertySetSource implements WayPropertySetSource {
    @Override
    public void populateProperties(WayPropertySet props) {
        // Replace existing matching properties as the logic is that the first statement registered takes precedence over later statements
        props.setProperties("highway=track", StreetTraversalPermission.PEDESTRIAN_AND_BICYCLE_AND_MICROMOBILITY, 1.3, 1.3);

        // Read the rest from the default set
        new DefaultWayPropertySetSource().populateProperties(props);
    }
}


package org.opentripplanner.graph_builder.module.osm;

import org.opentripplanner.routing.edgetype.StreetTraversalPermission;

public class VeneziaWayPropertySetSource implements WayPropertySetSource {
    @Override
    public void populateProperties(WayPropertySet props) {
        // Replace existing matching properties as the logic is that the first statement registered takes precedence over later statements
        props.setProperties("highway=corridor", StreetTraversalPermission.PEDESTRIAN_AND_BICYCLE_AND_MICROMOBILITY);
        props.setProperties("highway=steps", StreetTraversalPermission.PEDESTRIAN_AND_BICYCLE_AND_MICROMOBILITY);
        props.setProperties("highway=crossing", StreetTraversalPermission.PEDESTRIAN_AND_BICYCLE_AND_MICROMOBILITY);
        props.setProperties("highway=platform", StreetTraversalPermission.PEDESTRIAN_AND_BICYCLE_AND_MICROMOBILITY);
        props.setProperties("public_transport=platform", StreetTraversalPermission.PEDESTRIAN_AND_BICYCLE_AND_MICROMOBILITY);
        props.setProperties("railway=platform", StreetTraversalPermission.PEDESTRIAN_AND_BICYCLE_AND_MICROMOBILITY);
        props.setProperties("footway=sidewalk;highway=footway",
                StreetTraversalPermission.PEDESTRIAN_AND_BICYCLE_AND_MICROMOBILITY);

        // Read the rest from the default set
        new DefaultWayPropertySetSource().populateProperties(props);
    }
}

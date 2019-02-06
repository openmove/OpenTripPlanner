package org.opentripplanner.plugin;

import com.fasterxml.jackson.databind.JsonNode;

import java.util.List;

public interface Pluggable {
    void init(JsonNode config);

    void receive(Object message);

    List<Class<?>> getSubscriptions();
}

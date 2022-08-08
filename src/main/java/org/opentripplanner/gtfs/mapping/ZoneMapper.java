package org.opentripplanner.gtfs.mapping;

import org.onebusaway.gtfs.model.FareRule;
import org.opentripplanner.model.Stop;
import org.opentripplanner.model.Zone;
import org.opentripplanner.util.MapUtils;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import static org.opentripplanner.gtfs.mapping.AgencyAndIdMapper.mapAgencyAndId;

class ZoneMapper {

    private final Map<org.onebusaway.gtfs.model.Zone, Zone> mappedZones = new HashMap<>();

    Collection<Stop> mappedStops;
    Collection<FareRule> mappedRules;

    Collection<Zone> map(Collection<org.onebusaway.gtfs.model.Zone> zones, Collection<Stop> mappedStops, Collection<FareRule> mappedRules) {
        this.mappedStops = mappedStops;
        this.mappedRules = mappedRules;
        return MapUtils.mapToList(zones, this::map);
    }

    Zone map(org.onebusaway.gtfs.model.Zone orginal) {
        return orginal == null ? null : mappedZones.computeIfAbsent(orginal, this::doMap);
    }

    private Zone doMap(org.onebusaway.gtfs.model.Zone rhs) {

        Zone lhs = new Zone();

        lhs.setId(mapAgencyAndId(rhs.getId()));
        lhs.setLat(rhs.getLat());
        lhs.setLon(rhs.getLon());
        lhs.setName(rhs.getName());
        lhs.setZoneId(rhs.getId().getId());
        for(Stop s : mappedStops){
            if(s.getZoneId() != null && s.getZoneId().equals(rhs.getId().getId())){
                lhs.getStops().add(s);
            }
        }
        for(FareRule r : mappedRules){
            if(rhs.getId().getId().equals(r.getContainsId())){
            	lhs.setIsContainsZone(0);
            	if(r.getIdentifier() != null) {
            		lhs.getFareIdentifiers().add(r.getIdentifier());
            	}
                
            }
            
            if(rhs.getId().getId().equals(r.getDestinationId()) || rhs.getId().getId().equals(r.getOriginId())){
            	if(r.getIdentifier() != null) {
            		lhs.getFareIdentifiers().add(r.getIdentifier());
            	}
                
            }
        }
        return lhs;
    }
}

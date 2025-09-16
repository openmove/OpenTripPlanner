package org.opentripplanner.routing.core;

import java.io.Serializable;
import java.util.*;

import org.opentripplanner.model.FeedScopedId;
import org.opentripplanner.model.FareAttribute;
import org.opentripplanner.common.model.P2;

public class FareRuleSet implements Serializable {

    private static final long serialVersionUID = 7218355718876553028L;

    private String agency = null;
    private Set<FeedScopedId> routes;
    private Set<P2<String>> originDestinations;
    private Set<String> contains;
    private FareAttribute fareAttribute;
    private Set<FeedScopedId> trips;
    private HashMap<P2<String>, Set<String>> routingIds;
    private HashMap<String, Set<String>> traversedNodes;
    private HashMap<String, String> identifiers;
    
    public FareRuleSet(FareAttribute fareAttribute) {
        this.fareAttribute = fareAttribute;
        routes = new HashSet<FeedScopedId>();
        originDestinations= new HashSet<P2<String>>();
        contains = new HashSet<String>();
        trips = new HashSet<FeedScopedId>();
        traversedNodes = new HashMap<String, Set<String>>();
        routingIds = new HashMap<P2<String>, Set<String>>();
        identifiers = new HashMap<String,String>();
    }

    public void setAgency(String agency) {
        // TODO With new GTFS lib, read value from fareAttribute directly?
        this.agency = agency;
    }
    
    public String getAgency() {
    	return agency;
    }

    public void addOriginDestination(String origin, String destination) {
        originDestinations.add(new P2<String>(origin, destination));
    }

    public Set<P2<String>> getOriginDestinations() {
        return originDestinations;
    }

    public void addContains(String containsId) {
        contains.add(containsId);
    }
    
    public void addIdentifier(String origin, String destination, String contains, String route, String routingId, String identifier) {
    	String key = origin+"$"+destination+"$"+routingId+"$"+contains+"$"+route;
    	this.identifiers.put(key, identifier);
    }
    
    public void addRoute(FeedScopedId route) {
        routes.add(route);
    }
    
    public Set<FeedScopedId> getRoutes() {
    	return routes;
    }

    public FareAttribute getFareAttribute() {
        return fareAttribute;
    }

    public boolean hasAgencyDefined() {
        return agency != null;
    }

    public void addTrip(FeedScopedId trip) {
    	trips.add(trip);
    }
    
    public Set<FeedScopedId> getTrips() {
    	return trips;
    }

    public void addRoutingId(String origin, String destination, String routingId) {
        P2<String> key = new P2<String>(origin, destination);
        if(this.routingIds.containsKey(key)){
            this.routingIds.get(key).add(routingId);
        }else{
            Set<String> list = new HashSet<>();
            list.add(routingId);
            this.routingIds.put(key, list);
        }
    }

    public void addTraversedNodes(String origin, String destination, String routingId, Set<String> traversed) {
        String key = origin+"$"+destination+"$"+routingId;
        if(this.traversedNodes.containsKey(key)){
            this.traversedNodes.get(key).addAll(traversed);
        }else{
            this.traversedNodes.put(key, traversed);
        }
    }
    
    public boolean matches(Set<String> agencies, String startZone, String endZone, Set<String> zonesVisited,
                           Set<FeedScopedId> routesVisited, Set<FeedScopedId> tripsVisited) {
        //check for matching agency
        if (agency != null) {
            if (agencies.size() != 1 || !agencies.contains(agency))
                return false;
        }

        //check for matching origin/destination, if this ruleset has any origin/destination restrictions
        if (originDestinations.size() > 0) {
            P2<String> od = new P2<String>(startZone, endZone);
            if (!originDestinations.contains(od)) {
                P2<String> od2 = new P2<String>(od.first, null);
                if (!originDestinations.contains(od2)) {
                    od2 = new P2<String>(null, od.first);
                    if (!originDestinations.contains(od2)) {
                        return false;
                    }
                }
            }
        }

        //check for matching contains, if this ruleset has any containment restrictions
        if (contains.size() > 0) {
            if (!contains.equals(zonesVisited)) {
                return false;
            }
        }

        //check for matching routes
        if (routes.size() != 0) {
            if (!routes.containsAll(routesVisited)) {
                return false;
            }
        }
        
        //check for matching trips
        if (trips.size() != 0) {
        	if (!trips.containsAll(tripsVisited)) {
        		return false;
        	}
        }

        return true;
    }

    //customization for Trentino Trasporti rules
    public boolean matchesTT(Set<String> agencies, String startZone, String endZone, Set<String> zonesVisited,
                           Set<FeedScopedId> routesVisited, Set<FeedScopedId> tripsVisited) {
        //check for matching agency
        if (agency != null) {
            if (agencies.size() != 1 || !agencies.contains(agency))
                return false;
        }

        //check for matching origin/destination, if this ruleset has any origin/destination restrictions
        if (originDestinations.size() > 0) {
            P2<String> od = new P2<String>(startZone, endZone);
            if (!originDestinations.contains(od)) {
                P2<String> od2 = new P2<String>(od.first, null);
                if (!originDestinations.contains(od2)) {
                    od2 = new P2<String>(null, od.first);
                    if (!originDestinations.contains(od2)) {
                        return false;
                    }
                }
            }
        }

        //check for matching contains, if this ruleset has any containment restrictions
        if (contains.size() > 0) {
            if (!contains.containsAll(zonesVisited)) {
                return false;
            }
        }

        //check for matching routes
        if (routes.size() != 0) {
            if (!routes.containsAll(routesVisited)) {
                return false;
            }
        }

        //check for matching trips
        if (trips.size() != 0) {
            if (!trips.containsAll(tripsVisited)) {
                return false;
            }
        }

        return true;
    }

    public Set<String> getRoutingIds(P2<String> key) {
        if(this.routingIds.containsKey(key)){
            return this.routingIds.get(key);
        }else{
            return null;
        }
    }

    public Set<String> getTraversedNodes(String origin, String destination, String routingId) {
        String key = origin+"$"+destination+"$"+routingId;
        if(this.traversedNodes.containsKey(key)){
            return this.traversedNodes.get(key);
        }else{
            return null;
        }
    }

	public String getIdentifier(String startZone, String endZone, Set<String> zonesVisited, Set<FeedScopedId> routesVisited,
			String routingId) {
		
		
		
		if(contains.isEmpty()) {
			if(routes.isEmpty()) {
				String key = startZone+"$"+endZone+"$"+routingId+"$null$null";
				if(this.identifiers.containsKey(key)) {
					return this.identifiers.get(key);
				}
			}else {
				for(FeedScopedId r: routesVisited) {
					String key = startZone+"$"+endZone+"$"+routingId+"$null$"+r.getId();
                    String key2 = "null$null$null$null$" + r.getId();
					if (this.identifiers.containsKey(key)) {
						return this.identifiers.get(key);
					} else if (this.identifiers.containsKey(key2)) {
                        return this.identifiers.get(key2);
                    }
				}
			}
		} else {
			for(String z: zonesVisited) {
				if(routes.isEmpty()) {
					String key = "null$null$null$"+z+"$null";
					if(this.identifiers.containsKey(key)) {
						return this.identifiers.get(key);
					}
				}else {
					for(FeedScopedId r: routesVisited) {
						String key = "null$null$null$"+z+"$"+r.getId();
						if(this.identifiers.containsKey(key)) {
							return this.identifiers.get(key);
						}
					}
				}
			}
		}
		String key = startZone+"$"+endZone+"$"+routingId+"$null$null";
		if(this.identifiers.containsKey(key)) {
			return this.identifiers.get(key);
		}
		return null;
	}
}


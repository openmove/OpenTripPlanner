package org.opentripplanner.gtfs.mapping;

import org.opentripplanner.model.BookingRule;
import org.opentripplanner.util.MapUtils;

import static org.opentripplanner.gtfs.mapping.AgencyAndIdMapper.mapAgencyAndId;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


class BookingRuleMapper {

    private final Map<org.onebusaway.gtfs.model.BookingRule, BookingRule> mappedBookings = new HashMap<>();

    Collection<BookingRule> map(Collection<org.onebusaway.gtfs.model.BookingRule> allBookingRules) {
        return MapUtils.mapToList(allBookingRules, this::map);
    }
    BookingRule map(org.onebusaway.gtfs.model.BookingRule orginal) {
        return orginal == null ? null : mappedBookings.computeIfAbsent(orginal, this::doMap);
    }

    private BookingRule doMap(org.onebusaway.gtfs.model.BookingRule rhs) {

        BookingRule lhs = new BookingRule();
        lhs.setId(mapAgencyAndId(rhs.getId()));
        lhs.setType(rhs.getType());
        lhs.setPhoneNumber(rhs.getPhoneNumber());
        lhs.setMessage(rhs.getMessage());
        lhs.setInfoUrl(rhs.getInfoUrl());
        lhs.setUrl(rhs.getUrl());
        return lhs;
    }
}

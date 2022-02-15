package org.opentripplanner.routing.impl;

import com.google.common.collect.ImmutableMap;
import org.opentripplanner.routing.core.Fare;

import java.util.Map;

/**
 * Class used to store all the fares for Link light rail.
 * Data comes from a Python script that parses SoundTransit's website.
 * A matrix or CSV parser would be a better approach to storing this data,
 * but a refactor is unneeded given the proximity of GTFS Fares V2 which will render this redundant.
 */
public class SoundTransitLinkFares {
    public static void populateLinkFares(Map<String, Map<Fare.FareType, Float>> linkLightRailFares) {

        linkLightRailFares.put(
            "northgate-roosevelt",
            ImmutableMap.of(Fare.FareType.regular, 2.25f, Fare.FareType.electronicRegular, 2.25f)
        );


        linkLightRailFares.put(
            "northgate-udistrict",
            ImmutableMap.of(Fare.FareType.regular, 2.5f, Fare.FareType.electronicRegular, 2.5f)
        );


        linkLightRailFares.put(
            "northgate-univofwashington",
            ImmutableMap.of(Fare.FareType.regular, 2.5f, Fare.FareType.electronicRegular, 2.5f)
        );


        linkLightRailFares.put(
            "northgate-capitolhill",
            ImmutableMap.of(Fare.FareType.regular, 2.5f, Fare.FareType.electronicRegular, 2.5f)
        );


        linkLightRailFares.put(
            "northgate-stadium",
            ImmutableMap.of(Fare.FareType.regular, 2.75f, Fare.FareType.electronicRegular, 2.75f)
        );


        linkLightRailFares.put(
            "northgate-sodo",
            ImmutableMap.of(Fare.FareType.regular, 2.75f, Fare.FareType.electronicRegular, 2.75f)
        );


        linkLightRailFares.put(
            "northgate-beaconhill",
            ImmutableMap.of(Fare.FareType.regular, 2.75f, Fare.FareType.electronicRegular, 2.75f)
        );


        linkLightRailFares.put(
            "northgate-mountbaker",
            ImmutableMap.of(Fare.FareType.regular, 2.75f, Fare.FareType.electronicRegular, 2.75f)
        );


        linkLightRailFares.put(
            "northgate-columbiacity",
            ImmutableMap.of(Fare.FareType.regular, 3.0f, Fare.FareType.electronicRegular, 3.0f)
        );


        linkLightRailFares.put(
            "northgate-othello",
            ImmutableMap.of(Fare.FareType.regular, 3.0f, Fare.FareType.electronicRegular, 3.0f)
        );


        linkLightRailFares.put(
            "northgate-rainierbeach",
            ImmutableMap.of(Fare.FareType.regular, 3.0f, Fare.FareType.electronicRegular, 3.0f)
        );


        linkLightRailFares.put(
            "northgate-tukwilaint'lblvd",
            ImmutableMap.of(Fare.FareType.regular, 3.25f, Fare.FareType.electronicRegular, 3.25f)
        );


        linkLightRailFares.put(
            "northgate-seatac/airport",
            ImmutableMap.of(Fare.FareType.regular, 3.5f, Fare.FareType.electronicRegular, 3.5f)
        );


        linkLightRailFares.put(
            "northgate-anglelake",
            ImmutableMap.of(Fare.FareType.regular, 3.5f, Fare.FareType.electronicRegular, 3.5f)
        );


        linkLightRailFares.put(
            "roosevelt-udistrict",
            ImmutableMap.of(Fare.FareType.regular, 2.25f, Fare.FareType.electronicRegular, 2.25f)
        );


        linkLightRailFares.put(
            "roosevelt-univofwashington",
            ImmutableMap.of(Fare.FareType.regular, 2.25f, Fare.FareType.electronicRegular, 2.25f)
        );


        linkLightRailFares.put(
            "roosevelt-capitolhill",
            ImmutableMap.of(Fare.FareType.regular, 2.5f, Fare.FareType.electronicRegular, 2.5f)
        );


        linkLightRailFares.put(
            "roosevelt-stadium",
            ImmutableMap.of(Fare.FareType.regular, 2.5f, Fare.FareType.electronicRegular, 2.5f)
        );


        linkLightRailFares.put(
            "roosevelt-sodo",
            ImmutableMap.of(Fare.FareType.regular, 2.5f, Fare.FareType.electronicRegular, 2.5f)
        );


        linkLightRailFares.put(
            "roosevelt-beaconhill",
            ImmutableMap.of(Fare.FareType.regular, 2.75f, Fare.FareType.electronicRegular, 2.75f)
        );


        linkLightRailFares.put(
            "roosevelt-mountbaker",
            ImmutableMap.of(Fare.FareType.regular, 2.75f, Fare.FareType.electronicRegular, 2.75f)
        );


        linkLightRailFares.put(
            "roosevelt-columbiacity",
            ImmutableMap.of(Fare.FareType.regular, 2.75f, Fare.FareType.electronicRegular, 2.75f)
        );


        linkLightRailFares.put(
            "roosevelt-othello",
            ImmutableMap.of(Fare.FareType.regular, 2.75f, Fare.FareType.electronicRegular, 2.75f)
        );


        linkLightRailFares.put(
            "roosevelt-rainierbeach",
            ImmutableMap.of(Fare.FareType.regular, 3.0f, Fare.FareType.electronicRegular, 3.0f)
        );


        linkLightRailFares.put(
            "roosevelt-tukwilaint'lblvd",
            ImmutableMap.of(Fare.FareType.regular, 3.25f, Fare.FareType.electronicRegular, 3.25f)
        );


        linkLightRailFares.put(
            "roosevelt-seatac/airport",
            ImmutableMap.of(Fare.FareType.regular, 3.25f, Fare.FareType.electronicRegular, 3.25f)
        );


        linkLightRailFares.put(
            "roosevelt-anglelake",
            ImmutableMap.of(Fare.FareType.regular, 3.25f, Fare.FareType.electronicRegular, 3.25f)
        );


        linkLightRailFares.put(
            "udistrict-univofwashington",
            ImmutableMap.of(Fare.FareType.regular, 2.25f, Fare.FareType.electronicRegular, 2.25f)
        );


        linkLightRailFares.put(
            "udistrict-capitolhill",
            ImmutableMap.of(Fare.FareType.regular, 2.5f, Fare.FareType.electronicRegular, 2.5f)
        );


        linkLightRailFares.put(
            "udistrict-stadium",
            ImmutableMap.of(Fare.FareType.regular, 2.5f, Fare.FareType.electronicRegular, 2.5f)
        );


        linkLightRailFares.put(
            "udistrict-sodo",
            ImmutableMap.of(Fare.FareType.regular, 2.5f, Fare.FareType.electronicRegular, 2.5f)
        );


        linkLightRailFares.put(
            "udistrict-beaconhill",
            ImmutableMap.of(Fare.FareType.regular, 2.75f, Fare.FareType.electronicRegular, 2.75f)
        );


        linkLightRailFares.put(
            "udistrict-mountbaker",
            ImmutableMap.of(Fare.FareType.regular, 2.75f, Fare.FareType.electronicRegular, 2.75f)
        );


        linkLightRailFares.put(
            "udistrict-columbiacity",
            ImmutableMap.of(Fare.FareType.regular, 2.75f, Fare.FareType.electronicRegular, 2.75f)
        );


        linkLightRailFares.put(
            "udistrict-othello",
            ImmutableMap.of(Fare.FareType.regular, 2.75f, Fare.FareType.electronicRegular, 2.75f)
        );


        linkLightRailFares.put(
            "udistrict-rainierbeach",
            ImmutableMap.of(Fare.FareType.regular, 2.75f, Fare.FareType.electronicRegular, 2.75f)
        );


        linkLightRailFares.put(
            "udistrict-tukwilaint'lblvd",
            ImmutableMap.of(Fare.FareType.regular, 3.25f, Fare.FareType.electronicRegular, 3.25f)
        );


        linkLightRailFares.put(
            "udistrict-seatac/airport",
            ImmutableMap.of(Fare.FareType.regular, 3.25f, Fare.FareType.electronicRegular, 3.25f)
        );


        linkLightRailFares.put(
            "udistrict-anglelake",
            ImmutableMap.of(Fare.FareType.regular, 3.25f, Fare.FareType.electronicRegular, 3.25f)
        );


        linkLightRailFares.put(
            "univofwashington-capitolhill",
            ImmutableMap.of(Fare.FareType.regular, 2.25f, Fare.FareType.electronicRegular, 2.25f)
        );


        linkLightRailFares.put(
            "univofwashington-stadium",
            ImmutableMap.of(Fare.FareType.regular, 2.5f, Fare.FareType.electronicRegular, 2.5f)
        );


        linkLightRailFares.put(
            "univofwashington-sodo",
            ImmutableMap.of(Fare.FareType.regular, 2.5f, Fare.FareType.electronicRegular, 2.5f)
        );


        linkLightRailFares.put(
            "univofwashington-beaconhill",
            ImmutableMap.of(Fare.FareType.regular, 2.5f, Fare.FareType.electronicRegular, 2.5f)
        );


        linkLightRailFares.put(
            "univofwashington-mountbaker",
            ImmutableMap.of(Fare.FareType.regular, 2.5f, Fare.FareType.electronicRegular, 2.5f)
        );


        linkLightRailFares.put(
            "univofwashington-columbiacity",
            ImmutableMap.of(Fare.FareType.regular, 2.75f, Fare.FareType.electronicRegular, 2.75f)
        );


        linkLightRailFares.put(
            "univofwashington-othello",
            ImmutableMap.of(Fare.FareType.regular, 2.75f, Fare.FareType.electronicRegular, 2.75f)
        );


        linkLightRailFares.put(
            "univofwashington-rainierbeach",
            ImmutableMap.of(Fare.FareType.regular, 2.75f, Fare.FareType.electronicRegular, 2.75f)
        );


        linkLightRailFares.put(
            "univofwashington-tukwilaint'lblvd",
            ImmutableMap.of(Fare.FareType.regular, 3.0f, Fare.FareType.electronicRegular, 3.0f)
        );


        linkLightRailFares.put(
            "univofwashington-seatac/airport",
            ImmutableMap.of(Fare.FareType.regular, 3.25f, Fare.FareType.electronicRegular, 3.25f)
        );


        linkLightRailFares.put(
            "univofwashington-anglelake",
            ImmutableMap.of(Fare.FareType.regular, 3.25f, Fare.FareType.electronicRegular, 3.25f)
        );


        linkLightRailFares.put(
            "capitolhill-stadium",
            ImmutableMap.of(Fare.FareType.regular, 2.25f, Fare.FareType.electronicRegular, 2.25f)
        );


        linkLightRailFares.put(
            "capitolhill-sodo",
            ImmutableMap.of(Fare.FareType.regular, 2.25f, Fare.FareType.electronicRegular, 2.25f)
        );


        linkLightRailFares.put(
            "capitolhill-beaconhill",
            ImmutableMap.of(Fare.FareType.regular, 2.5f, Fare.FareType.electronicRegular, 2.5f)
        );


        linkLightRailFares.put(
            "capitolhill-mountbaker",
            ImmutableMap.of(Fare.FareType.regular, 2.5f, Fare.FareType.electronicRegular, 2.5f)
        );


        linkLightRailFares.put(
            "capitolhill-columbiacity",
            ImmutableMap.of(Fare.FareType.regular, 2.5f, Fare.FareType.electronicRegular, 2.5f)
        );


        linkLightRailFares.put(
            "capitolhill-othello",
            ImmutableMap.of(Fare.FareType.regular, 2.5f, Fare.FareType.electronicRegular, 2.5f)
        );


        linkLightRailFares.put(
            "capitolhill-rainierbeach",
            ImmutableMap.of(Fare.FareType.regular, 2.75f, Fare.FareType.electronicRegular, 2.75f)
        );


        linkLightRailFares.put(
            "capitolhill-tukwilaint'lblvd",
            ImmutableMap.of(Fare.FareType.regular, 3.0f, Fare.FareType.electronicRegular, 3.0f)
        );


        linkLightRailFares.put(
            "capitolhill-seatac/airport",
            ImmutableMap.of(Fare.FareType.regular, 3.0f, Fare.FareType.electronicRegular, 3.0f)
        );


        linkLightRailFares.put(
            "capitolhill-anglelake",
            ImmutableMap.of(Fare.FareType.regular, 3.0f, Fare.FareType.electronicRegular, 3.0f)
        );


        linkLightRailFares.put(
            "stadium-beaconhill",
            ImmutableMap.of(Fare.FareType.regular, 2.25f, Fare.FareType.electronicRegular, 2.25f)
        );


        linkLightRailFares.put(
            "stadium-mountbaker",
            ImmutableMap.of(Fare.FareType.regular, 2.25f, Fare.FareType.electronicRegular, 2.25f)
        );


        linkLightRailFares.put(
            "stadium-columbiacity",
            ImmutableMap.of(Fare.FareType.regular, 2.25f, Fare.FareType.electronicRegular, 2.25f)
        );


        linkLightRailFares.put(
            "stadium-othello",
            ImmutableMap.of(Fare.FareType.regular, 2.5f, Fare.FareType.electronicRegular, 2.5f)
        );


        linkLightRailFares.put(
            "stadium-rainierbeach",
            ImmutableMap.of(Fare.FareType.regular, 2.5f, Fare.FareType.electronicRegular, 2.5f)
        );


        linkLightRailFares.put(
            "stadium-tukwilaint'lblvd",
            ImmutableMap.of(Fare.FareType.regular, 2.75f, Fare.FareType.electronicRegular, 2.75f)
        );


        linkLightRailFares.put(
            "stadium-seatac/airport",
            ImmutableMap.of(Fare.FareType.regular, 3.0f, Fare.FareType.electronicRegular, 3.0f)
        );


        linkLightRailFares.put(
            "stadium-anglelake",
            ImmutableMap.of(Fare.FareType.regular, 3.0f, Fare.FareType.electronicRegular, 3.0f)
        );


        linkLightRailFares.put(
            "sodo-roosevelt",
            ImmutableMap.of(Fare.FareType.regular, 2.75f, Fare.FareType.electronicRegular, 2.75f)
        );


        linkLightRailFares.put(
            "sodo-stadium",
            ImmutableMap.of(Fare.FareType.regular, 2.25f, Fare.FareType.electronicRegular, 2.25f)
        );


        linkLightRailFares.put(
            "sodo-mountbaker",
            ImmutableMap.of(Fare.FareType.regular, 2.25f, Fare.FareType.electronicRegular, 2.25f)
        );


        linkLightRailFares.put(
            "sodo-columbiacity",
            ImmutableMap.of(Fare.FareType.regular, 2.25f, Fare.FareType.electronicRegular, 2.25f)
        );


        linkLightRailFares.put(
            "sodo-othello",
            ImmutableMap.of(Fare.FareType.regular, 2.5f, Fare.FareType.electronicRegular, 2.5f)
        );


        linkLightRailFares.put(
            "sodo-rainierbeach",
            ImmutableMap.of(Fare.FareType.regular, 2.5f, Fare.FareType.electronicRegular, 2.5f)
        );


        linkLightRailFares.put(
            "sodo-tukwilaint'lblvd",
            ImmutableMap.of(Fare.FareType.regular, 2.75f, Fare.FareType.electronicRegular, 2.75f)
        );


        linkLightRailFares.put(
            "sodo-seatac/airport",
            ImmutableMap.of(Fare.FareType.regular, 2.75f, Fare.FareType.electronicRegular, 2.75f)
        );


        linkLightRailFares.put(
            "sodo-anglelake",
            ImmutableMap.of(Fare.FareType.regular, 3.0f, Fare.FareType.electronicRegular, 3.0f)
        );


        linkLightRailFares.put(
            "beaconhill-sodo",
            ImmutableMap.of(Fare.FareType.regular, 2.25f, Fare.FareType.electronicRegular, 2.25f)
        );


        linkLightRailFares.put(
            "beaconhill-columbiacity",
            ImmutableMap.of(Fare.FareType.regular, 2.25f, Fare.FareType.electronicRegular, 2.25f)
        );


        linkLightRailFares.put(
            "beaconhill-othello",
            ImmutableMap.of(Fare.FareType.regular, 2.5f, Fare.FareType.electronicRegular, 2.5f)
        );


        linkLightRailFares.put(
            "beaconhill-rainierbeach",
            ImmutableMap.of(Fare.FareType.regular, 2.5f, Fare.FareType.electronicRegular, 2.5f)
        );


        linkLightRailFares.put(
            "beaconhill-tukwilaint'lblvd",
            ImmutableMap.of(Fare.FareType.regular, 2.75f, Fare.FareType.electronicRegular, 2.75f)
        );


        linkLightRailFares.put(
            "beaconhill-seatac/airport",
            ImmutableMap.of(Fare.FareType.regular, 2.75f, Fare.FareType.electronicRegular, 2.75f)
        );


        linkLightRailFares.put(
            "beaconhill-anglelake",
            ImmutableMap.of(Fare.FareType.regular, 3.0f, Fare.FareType.electronicRegular, 3.0f)
        );


        linkLightRailFares.put(
            "mountbaker-beaconhill",
            ImmutableMap.of(Fare.FareType.regular, 2.25f, Fare.FareType.electronicRegular, 2.25f)
        );


        linkLightRailFares.put(
            "mountbaker-othello",
            ImmutableMap.of(Fare.FareType.regular, 2.25f, Fare.FareType.electronicRegular, 2.25f)
        );


        linkLightRailFares.put(
            "mountbaker-rainierbeach",
            ImmutableMap.of(Fare.FareType.regular, 2.5f, Fare.FareType.electronicRegular, 2.5f)
        );


        linkLightRailFares.put(
            "mountbaker-tukwilaint'lblvd",
            ImmutableMap.of(Fare.FareType.regular, 2.75f, Fare.FareType.electronicRegular, 2.75f)
        );


        linkLightRailFares.put(
            "mountbaker-seatac/airport",
            ImmutableMap.of(Fare.FareType.regular, 2.75f, Fare.FareType.electronicRegular, 2.75f)
        );


        linkLightRailFares.put(
            "mountbaker-anglelake",
            ImmutableMap.of(Fare.FareType.regular, 3.0f, Fare.FareType.electronicRegular, 3.0f)
        );


        linkLightRailFares.put(
            "columbiacity-mountbaker",
            ImmutableMap.of(Fare.FareType.regular, 2.25f, Fare.FareType.electronicRegular, 2.25f)
        );


        linkLightRailFares.put(
            "columbiacity-rainierbeach",
            ImmutableMap.of(Fare.FareType.regular, 2.25f, Fare.FareType.electronicRegular, 2.25f)
        );


        linkLightRailFares.put(
            "columbiacity-tukwilaint'lblvd",
            ImmutableMap.of(Fare.FareType.regular, 2.5f, Fare.FareType.electronicRegular, 2.5f)
        );


        linkLightRailFares.put(
            "columbiacity-seatac/airport",
            ImmutableMap.of(Fare.FareType.regular, 2.75f, Fare.FareType.electronicRegular, 2.75f)
        );


        linkLightRailFares.put(
            "columbiacity-anglelake",
            ImmutableMap.of(Fare.FareType.regular, 2.75f, Fare.FareType.electronicRegular, 2.75f)
        );


        linkLightRailFares.put(
            "othello-columbiacity",
            ImmutableMap.of(Fare.FareType.regular, 2.25f, Fare.FareType.electronicRegular, 2.25f)
        );


        linkLightRailFares.put(
            "othello-tukwilaint'lblvd",
            ImmutableMap.of(Fare.FareType.regular, 2.5f, Fare.FareType.electronicRegular, 2.5f)
        );


        linkLightRailFares.put(
            "othello-seatac/airport",
            ImmutableMap.of(Fare.FareType.regular, 2.75f, Fare.FareType.electronicRegular, 2.75f)
        );


        linkLightRailFares.put(
            "othello-anglelake",
            ImmutableMap.of(Fare.FareType.regular, 2.75f, Fare.FareType.electronicRegular, 2.75f)
        );


        linkLightRailFares.put(
            "rainierbeach-othello",
            ImmutableMap.of(Fare.FareType.regular, 2.25f, Fare.FareType.electronicRegular, 2.25f)
        );


        linkLightRailFares.put(
            "rainierbeach-seatac/airport",
            ImmutableMap.of(Fare.FareType.regular, 2.5f, Fare.FareType.electronicRegular, 2.5f)
        );


        linkLightRailFares.put(
            "rainierbeach-anglelake",
            ImmutableMap.of(Fare.FareType.regular, 2.75f, Fare.FareType.electronicRegular, 2.75f)
        );


        linkLightRailFares.put(
            "tukwilaint'lblvd-rainierbeach",
            ImmutableMap.of(Fare.FareType.regular, 2.5f, Fare.FareType.electronicRegular, 2.5f)
        );


        linkLightRailFares.put(
            "tukwilaint'lblvd-anglelake",
            ImmutableMap.of(Fare.FareType.regular, 2.5f, Fare.FareType.electronicRegular, 2.5f)
        );


        linkLightRailFares.put(
            "seatac/airport-tukwilaint'lblvd",
            ImmutableMap.of(Fare.FareType.regular, 2.25f, Fare.FareType.electronicRegular, 2.25f)
        );


        linkLightRailFares.put(
            "anglelake-seatac/airport",
            ImmutableMap.of(Fare.FareType.regular, 2.25f, Fare.FareType.electronicRegular, 2.25f)
        );


        linkLightRailFares.put(
            "northgate-universityst",
            ImmutableMap.of(Fare.FareType.regular, 2.75f, Fare.FareType.electronicRegular, 2.75f)
        );


        linkLightRailFares.put(
            "northgate-pioneersquare",
            ImmutableMap.of(Fare.FareType.regular, 2.75f, Fare.FareType.electronicRegular, 2.75f)
        );


        linkLightRailFares.put(
            "northgate-int'ldist/chinatown",
            ImmutableMap.of(Fare.FareType.regular, 2.75f, Fare.FareType.electronicRegular, 2.75f)
        );


        linkLightRailFares.put(
            "roosevelt-westlake",
            ImmutableMap.of(Fare.FareType.regular, 2.5f, Fare.FareType.electronicRegular, 2.5f)
        );


        linkLightRailFares.put(
            "roosevelt-universityst",
            ImmutableMap.of(Fare.FareType.regular, 2.5f, Fare.FareType.electronicRegular, 2.5f)
        );


        linkLightRailFares.put(
            "roosevelt-pioneersquare",
            ImmutableMap.of(Fare.FareType.regular, 2.5f, Fare.FareType.electronicRegular, 2.5f)
        );


        linkLightRailFares.put(
            "roosevelt-int'ldist/chinatown",
            ImmutableMap.of(Fare.FareType.regular, 2.5f, Fare.FareType.electronicRegular, 2.5f)
        );


        linkLightRailFares.put(
            "udistrict-westlake",
            ImmutableMap.of(Fare.FareType.regular, 2.5f, Fare.FareType.electronicRegular, 2.5f)
        );


        linkLightRailFares.put(
            "udistrict-universityst",
            ImmutableMap.of(Fare.FareType.regular, 2.5f, Fare.FareType.electronicRegular, 2.5f)
        );


        linkLightRailFares.put(
            "udistrict-pioneersquare",
            ImmutableMap.of(Fare.FareType.regular, 2.5f, Fare.FareType.electronicRegular, 2.5f)
        );


        linkLightRailFares.put(
            "udistrict-int'ldist/chinatown",
            ImmutableMap.of(Fare.FareType.regular, 2.5f, Fare.FareType.electronicRegular, 2.5f)
        );


        linkLightRailFares.put(
            "univofwashington-westlake",
            ImmutableMap.of(Fare.FareType.regular, 2.5f, Fare.FareType.electronicRegular, 2.5f)
        );


        linkLightRailFares.put(
            "univofwashington-universityst",
            ImmutableMap.of(Fare.FareType.regular, 2.5f, Fare.FareType.electronicRegular, 2.5f)
        );


        linkLightRailFares.put(
            "univofwashington-pioneersquare",
            ImmutableMap.of(Fare.FareType.regular, 2.5f, Fare.FareType.electronicRegular, 2.5f)
        );


        linkLightRailFares.put(
            "univofwashington-int'ldist/chinatown",
            ImmutableMap.of(Fare.FareType.regular, 2.5f, Fare.FareType.electronicRegular, 2.5f)
        );


        linkLightRailFares.put(
            "capitolhill-westlake",
            ImmutableMap.of(Fare.FareType.regular, 2.25f, Fare.FareType.electronicRegular, 2.25f)
        );


        linkLightRailFares.put(
            "capitolhill-universityst",
            ImmutableMap.of(Fare.FareType.regular, 2.25f, Fare.FareType.electronicRegular, 2.25f)
        );


        linkLightRailFares.put(
            "capitolhill-pioneersquare",
            ImmutableMap.of(Fare.FareType.regular, 2.25f, Fare.FareType.electronicRegular, 2.25f)
        );


        linkLightRailFares.put(
            "capitolhill-int'ldist/chinatown",
            ImmutableMap.of(Fare.FareType.regular, 2.25f, Fare.FareType.electronicRegular, 2.25f)
        );


        linkLightRailFares.put(
            "westlake-northgate",
            ImmutableMap.of(Fare.FareType.regular, 2.75f, Fare.FareType.electronicRegular, 2.75f)
        );


        linkLightRailFares.put(
            "westlake-westlake",
            ImmutableMap.of(Fare.FareType.regular, 2.25f, Fare.FareType.electronicRegular, 2.25f)
        );


        linkLightRailFares.put(
            "westlake-universityst",
            ImmutableMap.of(Fare.FareType.regular, 2.25f, Fare.FareType.electronicRegular, 2.25f)
        );


        linkLightRailFares.put(
            "westlake-pioneersquare",
            ImmutableMap.of(Fare.FareType.regular, 2.25f, Fare.FareType.electronicRegular, 2.25f)
        );


        linkLightRailFares.put(
            "westlake-int'ldist/chinatown",
            ImmutableMap.of(Fare.FareType.regular, 2.25f, Fare.FareType.electronicRegular, 2.25f)
        );


        linkLightRailFares.put(
            "universityst-pioneersquare",
            ImmutableMap.of(Fare.FareType.regular, 2.25f, Fare.FareType.electronicRegular, 2.25f)
        );


        linkLightRailFares.put(
            "universityst-int'ldist/chinatown",
            ImmutableMap.of(Fare.FareType.regular, 2.25f, Fare.FareType.electronicRegular, 2.25f)
        );


        linkLightRailFares.put(
            "pioneersquare-int'ldist/chinatown",
            ImmutableMap.of(Fare.FareType.regular, 2.25f, Fare.FareType.electronicRegular, 2.25f)
        );


        linkLightRailFares.put(
            "universityst-stadium",
            ImmutableMap.of(Fare.FareType.regular, 2.25f, Fare.FareType.electronicRegular, 2.25f)
        );


        linkLightRailFares.put(
            "pioneersquare-stadium",
            ImmutableMap.of(Fare.FareType.regular, 2.25f, Fare.FareType.electronicRegular, 2.25f)
        );


        linkLightRailFares.put(
            "int'ldist/chinatown-stadium",
            ImmutableMap.of(Fare.FareType.regular, 2.25f, Fare.FareType.electronicRegular, 2.25f)
        );


        linkLightRailFares.put(
            "westlake-sodo",
            ImmutableMap.of(Fare.FareType.regular, 2.25f, Fare.FareType.electronicRegular, 2.25f)
        );


        linkLightRailFares.put(
            "universityst-sodo",
            ImmutableMap.of(Fare.FareType.regular, 2.25f, Fare.FareType.electronicRegular, 2.25f)
        );


        linkLightRailFares.put(
            "pioneersquare-sodo",
            ImmutableMap.of(Fare.FareType.regular, 2.25f, Fare.FareType.electronicRegular, 2.25f)
        );


        linkLightRailFares.put(
            "int'ldist/chinatown-sodo",
            ImmutableMap.of(Fare.FareType.regular, 2.25f, Fare.FareType.electronicRegular, 2.25f)
        );


        linkLightRailFares.put(
            "westlake-beaconhill",
            ImmutableMap.of(Fare.FareType.regular, 2.25f, Fare.FareType.electronicRegular, 2.25f)
        );


        linkLightRailFares.put(
            "universityst-beaconhill",
            ImmutableMap.of(Fare.FareType.regular, 2.25f, Fare.FareType.electronicRegular, 2.25f)
        );


        linkLightRailFares.put(
            "pioneersquare-beaconhill",
            ImmutableMap.of(Fare.FareType.regular, 2.25f, Fare.FareType.electronicRegular, 2.25f)
        );


        linkLightRailFares.put(
            "int'ldist/chinatown-beaconhill",
            ImmutableMap.of(Fare.FareType.regular, 2.25f, Fare.FareType.electronicRegular, 2.25f)
        );


        linkLightRailFares.put(
            "westlake-mountbaker",
            ImmutableMap.of(Fare.FareType.regular, 2.5f, Fare.FareType.electronicRegular, 2.5f)
        );


        linkLightRailFares.put(
            "universityst-mountbaker",
            ImmutableMap.of(Fare.FareType.regular, 2.5f, Fare.FareType.electronicRegular, 2.5f)
        );


        linkLightRailFares.put(
            "pioneersquare-mountbaker",
            ImmutableMap.of(Fare.FareType.regular, 2.5f, Fare.FareType.electronicRegular, 2.5f)
        );


        linkLightRailFares.put(
            "int'ldist/chinatown-mountbaker",
            ImmutableMap.of(Fare.FareType.regular, 2.5f, Fare.FareType.electronicRegular, 2.5f)
        );


        linkLightRailFares.put(
            "westlake-columbiacity",
            ImmutableMap.of(Fare.FareType.regular, 2.5f, Fare.FareType.electronicRegular, 2.5f)
        );


        linkLightRailFares.put(
            "universityst-columbiacity",
            ImmutableMap.of(Fare.FareType.regular, 2.5f, Fare.FareType.electronicRegular, 2.5f)
        );


        linkLightRailFares.put(
            "pioneersquare-columbiacity",
            ImmutableMap.of(Fare.FareType.regular, 2.5f, Fare.FareType.electronicRegular, 2.5f)
        );


        linkLightRailFares.put(
            "int'ldist/chinatown-columbiacity",
            ImmutableMap.of(Fare.FareType.regular, 2.5f, Fare.FareType.electronicRegular, 2.5f)
        );


        linkLightRailFares.put(
            "westlake-othello",
            ImmutableMap.of(Fare.FareType.regular, 2.5f, Fare.FareType.electronicRegular, 2.5f)
        );


        linkLightRailFares.put(
            "universityst-othello",
            ImmutableMap.of(Fare.FareType.regular, 2.5f, Fare.FareType.electronicRegular, 2.5f)
        );


        linkLightRailFares.put(
            "pioneersquare-othello",
            ImmutableMap.of(Fare.FareType.regular, 2.5f, Fare.FareType.electronicRegular, 2.5f)
        );


        linkLightRailFares.put(
            "int'ldist/chinatown-othello",
            ImmutableMap.of(Fare.FareType.regular, 2.5f, Fare.FareType.electronicRegular, 2.5f)
        );


        linkLightRailFares.put(
            "westlake-rainierbeach",
            ImmutableMap.of(Fare.FareType.regular, 2.5f, Fare.FareType.electronicRegular, 2.5f)
        );


        linkLightRailFares.put(
            "universityst-rainierbeach",
            ImmutableMap.of(Fare.FareType.regular, 2.5f, Fare.FareType.electronicRegular, 2.5f)
        );


        linkLightRailFares.put(
            "pioneersquare-rainierbeach",
            ImmutableMap.of(Fare.FareType.regular, 2.5f, Fare.FareType.electronicRegular, 2.5f)
        );


        linkLightRailFares.put(
            "int'ldist/chinatown-rainierbeach",
            ImmutableMap.of(Fare.FareType.regular, 2.5f, Fare.FareType.electronicRegular, 2.5f)
        );


        linkLightRailFares.put(
            "westlake-tukwilaint'lblvd",
            ImmutableMap.of(Fare.FareType.regular, 3.0f, Fare.FareType.electronicRegular, 3.0f)
        );


        linkLightRailFares.put(
            "universityst-tukwilaint'lblvd",
            ImmutableMap.of(Fare.FareType.regular, 3.0f, Fare.FareType.electronicRegular, 3.0f)
        );


        linkLightRailFares.put(
            "pioneersquare-tukwilaint'lblvd",
            ImmutableMap.of(Fare.FareType.regular, 3.0f, Fare.FareType.electronicRegular, 3.0f)
        );


        linkLightRailFares.put(
            "int'ldist/chinatown-tukwilaint'lblvd",
            ImmutableMap.of(Fare.FareType.regular, 3.0f, Fare.FareType.electronicRegular, 3.0f)
        );


        linkLightRailFares.put(
            "westlake-seatac/airport",
            ImmutableMap.of(Fare.FareType.regular, 3.0f, Fare.FareType.electronicRegular, 3.0f)
        );


        linkLightRailFares.put(
            "universityst-seatac/airport",
            ImmutableMap.of(Fare.FareType.regular, 3.0f, Fare.FareType.electronicRegular, 3.0f)
        );


        linkLightRailFares.put(
            "pioneersquare-seatac/airport",
            ImmutableMap.of(Fare.FareType.regular, 3.0f, Fare.FareType.electronicRegular, 3.0f)
        );


        linkLightRailFares.put(
            "int'ldist/chinatown-seatac/airport",
            ImmutableMap.of(Fare.FareType.regular, 3.0f, Fare.FareType.electronicRegular, 3.0f)
        );


        linkLightRailFares.put(
            "westlake-anglelake",
            ImmutableMap.of(Fare.FareType.regular, 3.0f, Fare.FareType.electronicRegular, 3.0f)
        );


        linkLightRailFares.put(
            "universityst-anglelake",
            ImmutableMap.of(Fare.FareType.regular, 3.0f, Fare.FareType.electronicRegular, 3.0f)
        );


        linkLightRailFares.put(
            "pioneersquare-anglelake",
            ImmutableMap.of(Fare.FareType.regular, 3.0f, Fare.FareType.electronicRegular, 3.0f)
        );


        linkLightRailFares.put(
            "int'ldist/chinatown-anglelake",
            ImmutableMap.of(Fare.FareType.regular, 3.0f, Fare.FareType.electronicRegular, 3.0f)
        );


        linkLightRailFares.put(
            "stadium-westlake",
            ImmutableMap.of(Fare.FareType.regular, 2.25f, Fare.FareType.electronicRegular, 2.25f)
        );

    }
}

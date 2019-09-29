package com.kodilla.exception.test;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public void findFlight(Flight flight) throws RouteNotFoundException {

        HashMap<String, Boolean> flights = new HashMap<String, Boolean>();

        flights.put("Warsaw", true);
        flights.put("Dublin", true);
        flights.put("Amsterdam", true);

        for (String key: flights.keySet()) {
            if(key.equals(flight.getArrivalAirport())) {
               System.out.println("Connection between: " + flight.getDepartureAirport() + " and " + flight.getArrivalAirport() + " is possible");
            } else {
               throw new RouteNotFoundException("Sorry, there is no such connection");
            }
        }
    }
}

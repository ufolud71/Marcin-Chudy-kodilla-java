package com.kodilla.exception.test;

public class RouteNotFoundExceptionRunner {
    public static void main(String[] args) {

        Flight flight = new Flight("Katowice", "Wrocław");
        FlightFinder flightFinder = new FlightFinder();

        try {
            flightFinder.findFlight(flight);

        } catch (RouteNotFoundException e) {

            System.out.println("Sorry, there is no such route!");
        } finally {

            System.out.println("Find another route if you want to.");
        }
    }
}
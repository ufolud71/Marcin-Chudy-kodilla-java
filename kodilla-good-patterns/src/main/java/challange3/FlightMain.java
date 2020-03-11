package challange3;

import java.util.Set;

public class FlightMain {

    public static void main(String[] args) {
        ListOfFlights listOfFlights = new ListOfFlights();
        Set<Flight> list = listOfFlights.getTheList();

        FlightSearch search1 = new FlightSearch();
        search1.searchFrom(list, "Poznan");
        System.out.println();
        FlightSearch search2 = new FlightSearch();
        search2.searchTo(list, "Gdańsk");
        System.out.println();
        FlightSearch search3 = new FlightSearch();
        search3.searchThrough(list, "Wroclaw", "Katowice");
        System.out.println();
    }
}

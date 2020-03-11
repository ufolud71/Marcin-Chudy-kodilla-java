package challange3;

import java.util.HashSet;
import java.util.Set;

public class ListOfFlights {
    private Set<Flight> theList = new HashSet<>();

    public ListOfFlights() {
        theList.add(new Flight("Katowice", "Toruń"));
        theList.add(new Flight("Krakow", "Gdańsk"));
        theList.add(new Flight("Katowice", "Wroclaw"));
        theList.add(new Flight("Poznan", "Toruń"));
        theList.add(new Flight("Wroclaw", "Gdańsk"));
        theList.add(new Flight("Katowice", "Toruń"));
        theList.add(new Flight("Wroclaw", "Katowice"));
    }

    public Set<Flight> getTheList() {
        return new HashSet<> (theList);
    }
}

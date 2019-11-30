package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;

public final class Continent {
    private final String continentName;
    private final List<Country> countries = new ArrayList<>();


    public Continent(String continentName) {
        this.continentName = continentName;
    }

    public void addCountry(Country country) {
        countries.add(country);
    }

    public ArrayList<Country> getCountries() {
        return (ArrayList<Country>) countries;
    }
}

package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;

public final class Continent {
    private final String cName;
    private final Country country;
    private final List<Country> countries = new ArrayList<>();


    public Continent(final Country country, final String cName) {
        this.cName = cName;
        this.country = country;
    }

    public Country getCountry() {
        return country;
    }

    public ArrayList<Country> getCountries() {
        return (ArrayList<Country>) countries;
    }
}

package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;

public final class World {
    private final List<Continent> continents = new ArrayList<Continent>();

    public void addContinent(Continent continent) {
        continents.add(continent);
    }


     public BigDecimal getPeopleQuantity(List<Continent> continents) {
         return continents.stream()
                 .flatMap(country -> country.getCountries().stream())
                 .map(Country::getPeopleQuantity)
                 .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}

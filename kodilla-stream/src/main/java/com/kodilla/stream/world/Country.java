package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {

    private final BigDecimal peopleQuantity;
    private final String name;

    public Country(final String name, final BigDecimal peopleQuantity) {
        this.peopleQuantity = peopleQuantity;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Country)) return false;

        Country country = (Country) o;

        return getName().equals(country.getName());
    }

}

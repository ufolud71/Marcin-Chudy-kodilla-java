package com.kodilla.stream.world;

import com.kodilla.stream.world.Continent;
import com.kodilla.stream.world.Country;
import com.kodilla.stream.world.World;
import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given
        World world = new World();
        List<Continent> continents = new ArrayList<Continent>();
        List<Country> countries = new ArrayList<>();

        Continent continent1 = new Continent("Europe");
        Continent continent2 = new Continent("Asia");
        Continent continent3 = new Continent("North America");

        Country c1 = new Country("Poland", new BigDecimal("38000000"));
        Country c2 = new Country("Germany", new BigDecimal("83000000"));
        Country c3 = new Country("Thailand", new BigDecimal("69000000"));
        Country c4 = new Country("Taiwan", new BigDecimal("23780000"));
        Country c5 = new Country("Canada", new BigDecimal("37600000"));
        Country c6 = new Country("Greenland", new BigDecimal("56171"));

        continents.add(continent1);
        continents.add(continent2);
        continents.add(continent3);
        world.addContinent(continent1);
        world.addContinent(continent2);
        world.addContinent(continent3);
        continent1.addCountry(c1);
        continent1.addCountry(c2);
        continent3.addCountry(c3);
        continent3.addCountry(c4);
        continent2.addCountry(c5);
        continent2.addCountry(c6);
        //When
        BigDecimal total = world.getPeopleQuantity(continents);
        //Then
        BigDecimal expected = new BigDecimal("251436171");

        Assert.assertEquals(expected, total);

    }
}

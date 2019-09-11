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
        world.addContinent(new Continent(new Country("Poland", new BigDecimal("38000000")), "Europe" ));
        world.addContinent(new Continent(new Country("Germany", new BigDecimal("83000000")), "Europe" ));
        world.addContinent(new Continent(new Country("Thailand", new BigDecimal("69000000")), "Asia" ));
        world.addContinent(new Continent(new Country("Taiwan", new BigDecimal("23780000")), "Asia" ));
        world.addContinent(new Continent(new Country("Canada", new BigDecimal("37600000")), "North America" ));
        world.addContinent(new Continent(new Country("Greenland", new BigDecimal("56171")), "North America" ));
        //When
        BigDecimal total = world.getPeopleQuantity(continents);
        //Then
        BigDecimal expected = new BigDecimal("251436171");
        Assert.assertEquals(expected, total);

    }
}

package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaMakerTestSuite {

    @Test
    public void testBasicPizzaGetCost() {
        //Given
        PizzaMaker maker = new BasicPizza();
        //When
        BigDecimal cost = maker.getCost();
        //Then
        assertEquals(new BigDecimal(15), cost);
    }

    @Test
    public void testBasicPizzaGetDescription() {
        //Given
        PizzaMaker maker = new BasicPizza();
        //When
        String description = maker.getDescription();
        //Then
        assertEquals("Basic pizza with tomato sauce and cheese", description);
    }

    @Test
    public void testBasicPizzaWithGarlicAndExtraCheeseAndCheeseInPizzaCrustGetCost() {
        //Given
        PizzaMaker maker = new BasicPizza();
        maker = new GarlicDecorator(maker);
        maker = new ExtraCheeseDecorator(maker);
        maker = new CheeseInPizzaCrustDecorator(maker);
        System.out.println(maker.getCost());
        //When
        BigDecimal cost = maker.getCost();
        //Then
        assertEquals(new BigDecimal(25), cost);
    }

    @Test
    public void testBasicPizzaWithGarlicAndExtraCheeseAndCheeseInPizzaCrustGetDescription() {
        //Given
        PizzaMaker maker = new BasicPizza();
        maker = new GarlicDecorator(maker);
        maker = new ExtraCheeseDecorator(maker);
        maker = new CheeseInPizzaCrustDecorator(maker);
        System.out.println(maker.getDescription());
        //When
        String description = maker.getDescription();
        //Then
        assertEquals("Basic pizza with tomato sauce and cheese + garlic + extra cheese + cheese in pizza crust", description);
    }
}

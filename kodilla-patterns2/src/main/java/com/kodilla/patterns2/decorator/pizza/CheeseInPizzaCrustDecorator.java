package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class CheeseInPizzaCrustDecorator extends AbstractPizzaMakerDecorator {

    public CheeseInPizzaCrustDecorator(PizzaMaker pizzaMaker) {
        super(pizzaMaker);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + cheese in pizza crust";
    }
}

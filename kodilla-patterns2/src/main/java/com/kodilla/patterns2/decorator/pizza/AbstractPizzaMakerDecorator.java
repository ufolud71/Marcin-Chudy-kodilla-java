package com.kodilla.patterns2.decorator.pizza;

import com.kodilla.patterns2.decorator.taxiportal.AbstractTaxiOrderDecorator;

import java.math.BigDecimal;

public abstract class AbstractPizzaMakerDecorator implements PizzaMaker {
    private final PizzaMaker pizzaMaker;

    protected AbstractPizzaMakerDecorator(PizzaMaker pizzaMaker) {
        this.pizzaMaker = pizzaMaker;
    }

    @Override
    public BigDecimal getCost() {
        return pizzaMaker.getCost();
    }

    @Override
    public String getDescription() {
        return pizzaMaker.getDescription();
    }
}

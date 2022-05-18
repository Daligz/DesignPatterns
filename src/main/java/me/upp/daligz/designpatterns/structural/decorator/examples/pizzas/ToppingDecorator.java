package me.upp.daligz.designpatterns.structural.decorator.examples.pizzas;

public abstract class ToppingDecorator implements Pizza {

    protected Pizza temporalPizza;

    public ToppingDecorator(Pizza temporalPizza) {
        this.temporalPizza = temporalPizza;
    }

    @Override
    public String getDescription() {
        return temporalPizza.getDescription();
    }

    @Override
    public double getPrice() {
        return temporalPizza.getPrice();
    }
}

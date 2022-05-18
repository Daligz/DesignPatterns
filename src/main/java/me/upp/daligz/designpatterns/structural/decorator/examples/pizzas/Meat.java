package me.upp.daligz.designpatterns.structural.decorator.examples.pizzas;

public class Meat extends ToppingDecorator {

    public Meat(Pizza temporalPizza) {
        super(temporalPizza);
        System.out.println("Adding meat");
    }

    @Override
    public String getDescription() {
        return temporalPizza.getDescription() + ", meat";
    }

    @Override
    public double getPrice() {
        System.out.println("Price of meat: " + 8.25);
        return temporalPizza.getPrice() + 8.25;
    }

}


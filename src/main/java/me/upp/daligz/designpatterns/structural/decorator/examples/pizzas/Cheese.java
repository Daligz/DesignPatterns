package me.upp.daligz.designpatterns.structural.decorator.examples.pizzas;

public class Cheese extends ToppingDecorator {

    public Cheese(Pizza temporalPizza) {
        super(temporalPizza);
        System.out.println("Adding Cheese");
    }

    @Override
    public String getDescription() {
        return temporalPizza.getDescription() + ", cheese";
    }

    @Override
    public double getPrice() {
        System.out.println("Price of cheese: " + 1.25);
        return temporalPizza.getPrice() + 1.25;
    }

}


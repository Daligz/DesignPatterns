package me.upp.daligz.designpatterns.structural.decorator.examples.pizzas;

public class Pepperoni extends ToppingDecorator {

    public Pepperoni(Pizza temporalPizza) {
        super(temporalPizza);
        System.out.println("Adding pepperoni");
    }

    @Override
    public String getDescription() {
        return temporalPizza.getDescription() + ", pepperoni";
    }

    @Override
    public double getPrice() {
        System.out.println("Price of pepperoni: " + 2.99);
        return temporalPizza.getPrice() + 2.99;
    }

}


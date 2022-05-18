package me.upp.daligz.designpatterns.structural.decorator.examples.pizzas;

public class Tomato extends ToppingDecorator {

    public Tomato(Pizza temporalPizza) {
        super(temporalPizza);
        System.out.println("Adding tomato");
    }

    @Override
    public String getDescription() {
        return temporalPizza.getDescription() + ", tomato";
    }

    @Override
    public double getPrice() {
        System.out.println("Price of tomato: " + 1.25);
        return temporalPizza.getPrice() + 1.25;
    }

}


package me.upp.daligz.designpatterns.structural.decorator.examples.pizzas;

public class Pineapple extends ToppingDecorator {

    public Pineapple(Pizza temporalPizza) {
        super(temporalPizza);
        System.out.println("Adding pineapple");
    }

    @Override
    public String getDescription() {
        return temporalPizza.getDescription() + ", pineapple";
    }

    @Override
    public double getPrice() {
        System.out.println("Price of pineapple: " + 0.99);
        return temporalPizza.getPrice() + 0.99;
    }

}


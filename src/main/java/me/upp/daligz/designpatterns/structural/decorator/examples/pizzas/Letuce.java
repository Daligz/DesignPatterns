package me.upp.daligz.designpatterns.structural.decorator.examples.pizzas;

public class Letuce extends ToppingDecorator {

    public Letuce(Pizza temporalPizza) {
        super(temporalPizza);
        System.out.println("Adding letuce");
    }

    @Override
    public String getDescription() {
        return temporalPizza.getDescription() + ", letuce";
    }

    @Override
    public double getPrice() {
        System.out.println("Price of letuce: " + 0.25);
        return temporalPizza.getPrice() + 0.25;
    }

}


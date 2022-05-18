package me.upp.daligz.designpatterns.structural.decorator.examples.pizzas;

public class PizzaMaker {

    public static void main(String[] args) {
        Pizza pizza = new Mozzarella(
                new Cheese(new Letuce(new Meat(new Pepperoni(new Pineapple(new Tomato(new TomatoSauce(new PlainPizza())))))))
        );
        System.out.println("Ingredients: " + pizza.getDescription());
        System.out.println("Total Price: " + pizza.getPrice());
    }
}

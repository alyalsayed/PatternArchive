package org.example.decorator;

public class Main {
    public static void main(String[] args) {
        // Create a basic pizza.
        Pizza basicPizza = new BasicPizza();
        System.out.println(basicPizza.getDescription() + " costs $" + basicPizza.getCost());

        // Decorate the basic pizza with cheese.
        Pizza cheesePizza = new CheeseDecorator(basicPizza);
        System.out.println(cheesePizza.getDescription() + " costs $" + cheesePizza.getCost());

        // Decorate further by adding pepperoni on top of the cheese pizza.
        Pizza fullyLoadedPizza = new PepperoniDecorator(cheesePizza);
        System.out.println(fullyLoadedPizza.getDescription() + " costs $" + fullyLoadedPizza.getCost());
    }
}

package org.example.decorator;

// The abstract decorator class that implements Pizza and holds a reference to a Pizza object.
public abstract class PizzaDecorator implements Pizza {
    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    public abstract String getDescription();
}